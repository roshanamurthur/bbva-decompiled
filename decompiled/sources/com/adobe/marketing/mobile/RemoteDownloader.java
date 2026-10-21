package com.adobe.marketing.mobile;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
class RemoteDownloader {
    private static final int DEFAULT_CONNECTION_TIMEOUT = 10000;
    private static final int DEFAULT_READ_TIMEOUT = 10000;
    private static final String ETAG = "ETag";
    protected static final String HTTP_HEADER_IF_MODIFIED_SINCE = "If-Modified-Since";
    protected static final String HTTP_HEADER_IF_RANGE = "If-Range";
    protected static final String HTTP_HEADER_RANGE = "Range";
    private static final int HTTP_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    private static final String LOG_TAG = "RemoteDownloader";
    private static final int STREAM_WRITE_BUFFER_SIZE = 4096;
    final CacheManager cacheManager;
    protected final String directory;
    private final NetworkService networkService;
    private final Map<String, String> requestProperties;
    protected final String url;

    public RemoteDownloader(NetworkService networkService, SystemInfoService systemInfoService, String str, String str2) throws MissingPlatformServicesException {
        if (networkService == null) {
            throw new MissingPlatformServicesException("Remote Downloader - NetworkService not found!");
        }
        if (systemInfoService == null) {
            throw new MissingPlatformServicesException("Remote Downloader - SystemInfoService not found!");
        }
        this.networkService = networkService;
        this.cacheManager = new CacheManager(systemInfoService);
        this.url = str;
        this.directory = str2;
        this.requestProperties = null;
    }

    private Date getResponseLastModifiedDate(NetworkService.HttpConnection httpConnection) {
        try {
            return createRFC2822Formatter().parse(httpConnection.getResponsePropertyValue("Last-Modified"));
        } catch (Exception e5) {
            Log.debug(LOG_TAG, "Unable to parse the last modified date returned from the request (%s)", e5);
            return null;
        }
    }

    private File handleNewContent(NetworkService.HttpConnection httpConnection) {
        this.cacheManager.deleteCachedDataForURL(this.url, this.directory);
        File fileCreateNewCacheFile = this.cacheManager.createNewCacheFile(this.url, httpConnection.getResponsePropertyValue(ETAG), this.directory, getResponseLastModifiedDate(httpConnection));
        if (fileCreateNewCacheFile == null) {
            Log.debug(LOG_TAG, "Could not create cache file on disk. Will not download from url (%s)", this.url);
            return null;
        }
        if (!readInputStreamIntoFile(fileCreateNewCacheFile, httpConnection.getInputStream(), false)) {
            return null;
        }
        File fileMarkFileAsCompleted = this.cacheManager.markFileAsCompleted(fileCreateNewCacheFile);
        if (fileMarkFileAsCompleted == null) {
            Log.debug(LOG_TAG, "Cached Files - Could not save cached file (%s)", this.url);
        } else {
            Log.debug(LOG_TAG, "Cached Files - Successfully downloaded content (%s) into (%s)", this.url, fileMarkFileAsCompleted.getAbsolutePath());
        }
        return fileMarkFileAsCompleted;
    }

    private File handlePartialContent(NetworkService.HttpConnection httpConnection, File file) throws Throwable {
        File fileMarkFileAsCompleted = null;
        if (file != null) {
            String str = LOG_TAG;
            Log.debug(str, "Cached Files - Found partial cached file. Downloading remaining content (%s)", this.url);
            readInputStreamIntoFile(file, httpConnection.getInputStream(), true);
            CacheManager cacheManager = this.cacheManager;
            fileMarkFileAsCompleted = cacheManager != null ? cacheManager.markFileAsCompleted(file) : null;
            if (fileMarkFileAsCompleted == null) {
                Log.debug(str, "Cached Files - Could not save cached file (%s)", this.url);
            } else {
                Log.debug(str, "Cached Files - Successfully downloaded remaining content (%s)", this.url);
            }
        } else {
            Log.debug(LOG_TAG, "Cached Files - partial cached file not found. Will be discarding the remaining content (%s)", this.url);
        }
        return fileMarkFileAsCompleted;
    }

    private File processConnection(NetworkService.HttpConnection httpConnection, File file) {
        if (httpConnection.getResponseCode() == 404) {
            Log.debug(LOG_TAG, "File not found. (%s)", this.url);
            return null;
        }
        if (httpConnection.getResponseCode() == 206) {
            return handlePartialContent(httpConnection, file);
        }
        if (httpConnection.getResponseCode() == 200 || httpConnection.getResponseCode() == 416) {
            return httpConnection.getResponseCode() == 200 ? handleNewContent(httpConnection) : file;
        }
        Log.warning(LOG_TAG, "File could not be downloaded from URL (%s) Response: (%d) Message: (%s)", this.url, Integer.valueOf(httpConnection.getResponseCode()), httpConnection.getResponseMessage());
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File processNetworkConnectionObject(NetworkService.HttpConnection httpConnection, File file) {
        if (httpConnection != null) {
            try {
                try {
                    file = processConnection(httpConnection, file);
                } catch (Exception e5) {
                    Log.warning(LOG_TAG, "Cached Files - Unexpected exception while attempting to get remote file (%s)", e5);
                }
            } finally {
                httpConnection.close();
            }
        }
        return file;
    }

    private boolean readInputStreamIntoFile(File file, InputStream inputStream, boolean z10) throws Throwable {
        if (file == null || inputStream == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z10);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        if (i10 != -1) {
                            fileOutputStream2.write(bArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (Exception e5) {
                                Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", e5);
                            }
                        }
                    }
                    fileOutputStream2.close();
                    return true;
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    Log.error(LOG_TAG, "IOException while attempting to write remote file (%s)", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e10) {
                            Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", e10);
                        }
                    }
                    return false;
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    Log.error(LOG_TAG, "Unexpected exception while attempting to write remote file (%s)", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e12) {
                            Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", e12);
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e13) {
                            Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", e13);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        }
    }

    public SimpleDateFormat createRFC2822Formatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Time.GMT));
        return simpleDateFormat;
    }

    public HashMap<String, String> getRequestParameters(File file) {
        HashMap<String, String> map = new HashMap<>();
        if (file != null) {
            CacheManager cacheManager = this.cacheManager;
            Long lValueOf = Long.valueOf(cacheManager != null ? cacheManager.getLastModifiedOfFile(file.getPath()) : 0L);
            if (lValueOf.longValue() != 0) {
                String str = createRFC2822Formatter().format(lValueOf);
                map.put(HTTP_HEADER_IF_RANGE, str);
                map.put(HTTP_HEADER_IF_MODIFIED_SINCE, str);
            }
            map.put(HTTP_HEADER_RANGE, String.format(Locale.US, "bytes=%d-", Long.valueOf(file.length())));
        }
        return map;
    }

    public boolean startDownload() {
        if (!StringUtils.stringIsUrl(this.url)) {
            Log.warning(LOG_TAG, "Given url is not valid and contents cannot be cached : (%s)", this.url);
            return false;
        }
        CacheManager cacheManager = this.cacheManager;
        final File fileForCachedURL = cacheManager != null ? cacheManager.getFileForCachedURL(this.url, this.directory, false) : null;
        HashMap<String, String> requestParameters = fileForCachedURL != null ? getRequestParameters(fileForCachedURL) : null;
        Map<String, String> map = this.requestProperties;
        if (map != null) {
            if (requestParameters == null) {
                requestParameters = new HashMap<>(this.requestProperties);
            } else {
                requestParameters.putAll(map);
            }
        }
        this.networkService.connectUrlAsync(this.url, NetworkService.HttpCommand.GET, null, requestParameters, 10000, 10000, new NetworkService.Callback() { // from class: com.adobe.marketing.mobile.RemoteDownloader.1
            @Override // com.adobe.marketing.mobile.NetworkService.Callback
            public void call(NetworkService.HttpConnection httpConnection) {
                RemoteDownloader.this.onDownloadComplete(RemoteDownloader.this.processNetworkConnectionObject(httpConnection, fileForCachedURL));
            }
        });
        return true;
    }

    public File startDownloadSync() {
        if (!StringUtils.stringIsUrl(this.url)) {
            Log.warning(LOG_TAG, "Given url is not valid and contents cannot be cached : (%s)", this.url);
            return null;
        }
        CacheManager cacheManager = this.cacheManager;
        File fileForCachedURL = cacheManager != null ? cacheManager.getFileForCachedURL(this.url, this.directory, false) : null;
        HashMap<String, String> requestParameters = fileForCachedURL != null ? getRequestParameters(fileForCachedURL) : null;
        Map<String, String> map = this.requestProperties;
        if (map != null) {
            if (requestParameters == null) {
                requestParameters = new HashMap<>(this.requestProperties);
            } else {
                requestParameters.putAll(map);
            }
        }
        return processNetworkConnectionObject(this.networkService.connectUrl(this.url, NetworkService.HttpCommand.GET, null, requestParameters, 10000, 10000), fileForCachedURL);
    }

    public RemoteDownloader(NetworkService networkService, SystemInfoService systemInfoService, String str, String str2, Map<String, String> map) throws MissingPlatformServicesException {
        if (networkService == null) {
            throw new MissingPlatformServicesException("Remote Downloader - NetworkService not found!");
        }
        if (systemInfoService != null) {
            this.networkService = networkService;
            this.cacheManager = new CacheManager(systemInfoService);
            this.url = str;
            this.directory = str2;
            this.requestProperties = new HashMap(map);
            return;
        }
        throw new MissingPlatformServicesException("Remote Downloader - SystemInfoService not found!");
    }

    public RemoteDownloader(NetworkService networkService, SystemInfoService systemInfoService, String str, CacheManager cacheManager) throws MissingPlatformServicesException {
        this(networkService, systemInfoService, str, (String) null, cacheManager);
    }

    public RemoteDownloader(NetworkService networkService, SystemInfoService systemInfoService, String str, String str2, CacheManager cacheManager) throws MissingPlatformServicesException {
        if (networkService == null) {
            throw new MissingPlatformServicesException("Remote Downloader - NetworkService not found!");
        }
        if (systemInfoService != null) {
            this.networkService = networkService;
            this.cacheManager = cacheManager;
            this.url = str;
            this.directory = str2;
            this.requestProperties = null;
            return;
        }
        throw new MissingPlatformServicesException("Remote Downloader - SystemInfoService not found!");
    }

    public RemoteDownloader(NetworkService networkService, SystemInfoService systemInfoService, String str, CacheManager cacheManager, Map<String, String> map) throws MissingPlatformServicesException {
        if (networkService == null) {
            throw new MissingPlatformServicesException("Remote Downloader - NetworkService not found!");
        }
        if (systemInfoService != null) {
            this.networkService = networkService;
            this.cacheManager = cacheManager;
            this.url = str;
            this.directory = null;
            this.requestProperties = new HashMap(map);
            return;
        }
        throw new MissingPlatformServicesException("Remote Downloader - SystemInfoService not found!");
    }

    public void onDownloadComplete(File file) {
    }
}
