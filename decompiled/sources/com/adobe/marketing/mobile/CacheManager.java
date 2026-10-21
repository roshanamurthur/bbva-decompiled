package com.adobe.marketing.mobile;

import androidx.camera.core.processing.f;
import com.bbva.notifications.constants.PushConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
class CacheManager {
    private static final String DEFAULT_CACHE_DIR = "adbdownloadcache";
    private static final String LOG_TAG = "CacheManager";
    private static final int LSB_8_MASK = 255;
    private static final String PARTIAL_FILE_SUFFIX = "_partial";
    private SystemInfoService systemInfoService;

    public CacheManager(SystemInfoService systemInfoService) throws MissingPlatformServicesException {
        if (systemInfoService == null) {
            throw new MissingPlatformServicesException("SystemInfoService implementation missing");
        }
        this.systemInfoService = systemInfoService;
    }

    private boolean deleteDirectory(File file, boolean z10) {
        if (file == null) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        if (fileArrListFiles.length == 0) {
            return file.delete();
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                String[] list = file2.list();
                if (list == null || list.length == 0) {
                    if (!file2.delete()) {
                        Log.warning(LOG_TAG, "Could not delete file: %s", file2.getName());
                    }
                } else if (z10) {
                    deleteDirectory(file2, true);
                    if (!file2.delete()) {
                        Log.warning(LOG_TAG, "Could not delete file: %s", file2.getName());
                    }
                }
            } else if (!file2.delete()) {
                Log.warning(LOG_TAG, "Could not delete %s - this was not needed anymore", file2.getName());
            }
        }
        return file.delete();
    }

    public File createNewCacheFile(String str, String str2, String str3, Date date) {
        String strSha2hash = sha2hash(str);
        if (strSha2hash == null || strSha2hash.isEmpty()) {
            Log.debug(LOG_TAG, "Invalid url parameter while attempting to create cache file. Could not save data.", new Object[0]);
            return null;
        }
        if (date == null) {
            Log.debug(LOG_TAG, "Invalid lastModified parameter while attempting to create cache file. Could not save data.", new Object[0]);
            return null;
        }
        if (getDownloadCacheDirectory(str3) == null) {
            Log.debug(LOG_TAG, "Unable to create cache directory.", new Object[0]);
            return null;
        }
        String baseFilePath = getBaseFilePath(str, str3);
        if (baseFilePath == null) {
            Log.debug(LOG_TAG, "Could not create a new cache file object!", new Object[0]);
            return null;
        }
        if (str2 == null) {
            Log.debug(LOG_TAG, "Server did not return ETag for %s.", str);
            StringBuilder sbE = f.e(baseFilePath, Constant.DOT_STRING);
            sbE.append(date.getTime());
            sbE.append(PARTIAL_FILE_SUFFIX);
            return new File(sbE.toString());
        }
        StringBuilder sbE2 = f.e(baseFilePath, Constant.DOT_STRING);
        sbE2.append(HexStringUtil.getHexString(str2));
        sbE2.append(Constant.DOT_STRING);
        sbE2.append(date.getTime());
        sbE2.append(PARTIAL_FILE_SUFFIX);
        return new File(sbE2.toString());
    }

    public boolean deleteCachedDataForURL(String str, String str2) {
        if (str == null || str.isEmpty()) {
            Log.debug(LOG_TAG, "Cached File - Failed to delete cached file (file path was empty)", new Object[0]);
            return false;
        }
        File fileForCachedURL = getFileForCachedURL(str, str2, false);
        if (fileForCachedURL != null) {
            return fileForCachedURL.isDirectory() ? deleteDirectory(fileForCachedURL, true) : fileForCachedURL.delete();
        }
        return false;
    }

    public void deleteFilesNotInList(List<String> list) {
        deleteFilesNotInList(list, null, false);
    }

    public String getBaseFilePath(String str, String str2) {
        File downloadCacheDirectory = getDownloadCacheDirectory(str2);
        if (downloadCacheDirectory == null) {
            Log.debug(LOG_TAG, "Unable to create cache directory.", new Object[0]);
            return null;
        }
        return downloadCacheDirectory.getPath() + File.separator + sha2hash(str);
    }

    public File getDownloadCacheDirectory(String str) {
        if (StringUtils.isNullOrEmpty(str)) {
            str = DEFAULT_CACHE_DIR;
        }
        File applicationCacheDir = this.systemInfoService.getApplicationCacheDir();
        if (!FileUtil.isValidDirectory(applicationCacheDir)) {
            return null;
        }
        File file = new File(applicationCacheDir, str);
        if (file.exists() || file.mkdir()) {
            return file;
        }
        Log.warning(LOG_TAG, "Cached File - Failed to open/make download cache directory (%s)", file.toString());
        return null;
    }

    public File getFileForCachedURL(String str, String str2, boolean z10) {
        File downloadCacheDirectory = getDownloadCacheDirectory(str2);
        if (downloadCacheDirectory == null) {
            return null;
        }
        File[] fileArrListFiles = downloadCacheDirectory.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            Log.debug(LOG_TAG, "Cached Files - Directory is empty (%s).", downloadCacheDirectory.getAbsolutePath());
            return null;
        }
        String strSha2hash = sha2hash(str);
        for (File file : fileArrListFiles) {
            String pathWithoutExtension = getPathWithoutExtension(file.getName());
            if (pathWithoutExtension != null && pathWithoutExtension.equals(strSha2hash)) {
                String pathExtension = getPathExtension(file.getName());
                if (!z10 || pathExtension == null || !pathExtension.contains(PARTIAL_FILE_SUFFIX)) {
                    return file;
                }
                Log.debug(LOG_TAG, "Cached Files - File is incomplete (%s).", str);
                return null;
            }
        }
        Log.debug(LOG_TAG, "Cached Files - File has not previously been cached (%s).", str);
        return null;
    }

    public long getLastModifiedOfFile(String str) {
        if (str == null || str.isEmpty()) {
            Log.debug(LOG_TAG, "Cached File - Path was null or empty for Cache File. Could not get Last Modified Date.", new Object[0]);
            return 0L;
        }
        String[] strArrSplitPathExtension = splitPathExtension(getPathExtension(str));
        if (strArrSplitPathExtension == null || strArrSplitPathExtension.length == 0) {
            Log.debug(LOG_TAG, "Cached File - No last modified date for file. Extension had no values after split.", new Object[0]);
            return 0L;
        }
        try {
            return Long.parseLong(strArrSplitPathExtension[0]);
        } catch (NumberFormatException unused) {
            Log.debug(LOG_TAG, "Could not get the last modified date for cache file (%s)", str);
            return 0L;
        }
    }

    public String getPathExtension(String str) {
        if (str != null && !str.isEmpty()) {
            return str.substring(str.lastIndexOf(46) + 1);
        }
        Log.debug(LOG_TAG, "Cached File - Path was null or empty for Cache File", new Object[0]);
        return null;
    }

    public String getPathWithoutExtension(String str) {
        int iIndexOf;
        return (str == null || str.isEmpty() || (iIndexOf = str.indexOf(46)) == -1) ? str : str.substring(0, iIndexOf);
    }

    public File markFileAsCompleted(File file) {
        if (file == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        if (!absolutePath.contains(PARTIAL_FILE_SUFFIX)) {
            return file;
        }
        File file2 = new File(absolutePath.replace(PARTIAL_FILE_SUFFIX, ""));
        if (file2.exists() && !file2.delete()) {
            Log.warning(LOG_TAG, "Cached Files - Failed to delete partial file %s", absolutePath);
        }
        if (file.renameTo(file2)) {
            return file2;
        }
        return null;
    }

    public String sha2hash(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(str.getBytes("UTF-8"));
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    StringBuilder sb3 = new StringBuilder(Integer.toHexString(b10 & 255));
                    while (sb3.length() < 2) {
                        sb3.insert(0, "0");
                    }
                    sb2.append((CharSequence) sb3);
                }
                return sb2.toString();
            } catch (UnsupportedEncodingException e5) {
                Log.warning(LOG_TAG, "Cached Files - Unsupported Encoding: UTF-8 (%s)", e5);
            } catch (NoSuchAlgorithmException e7) {
                Log.warning(LOG_TAG, "Cached Files - Failed to get sha2 hash (%s)", e7);
            }
        }
        return null;
    }

    public String[] splitPathExtension(String str) {
        if (str != null && str.length() != 0) {
            return str.split(PushConstants.GE_PARAMS_SEPARATOR);
        }
        Log.trace(LOG_TAG, "Extension was null or empty on Cache File.", new Object[0]);
        return new String[0];
    }

    public void deleteFilesNotInList(List<String> list, String str) {
        deleteFilesNotInList(list, str, false);
    }

    public void deleteFilesNotInList(List<String> list, String str, boolean z10) {
        File downloadCacheDirectory = getDownloadCacheDirectory(str);
        if (downloadCacheDirectory == null) {
            return;
        }
        File[] fileArrListFiles = downloadCacheDirectory.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (String str2 : list) {
                    if (StringUtils.stringIsUrl(str2)) {
                        arrayList.add(sha2hash(str2));
                    } else {
                        arrayList.add(str2);
                    }
                }
            }
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    if (!arrayList.contains(file.getName())) {
                        deleteDirectory(file, z10);
                    }
                } else if (!arrayList.contains(getPathWithoutExtension(file.getName())) && !file.delete()) {
                    Log.debug(LOG_TAG, "Unable to delete cached file that is no longer needed: %s", file.getName());
                }
            }
            return;
        }
        Log.debug(LOG_TAG, "Cached Files - Directory is empty (%s).", downloadCacheDirectory.getAbsolutePath());
    }

    public boolean deleteCachedDataForURL(String str) {
        return deleteCachedDataForURL(str, null);
    }

    public File getDownloadCacheDirectory() {
        return getDownloadCacheDirectory(null);
    }

    public File createNewCacheFile(String str, String str2, Date date) {
        return createNewCacheFile(str, null, str2, date);
    }

    public File createNewCacheFile(String str, Date date) {
        return createNewCacheFile(str, null, date);
    }
}
