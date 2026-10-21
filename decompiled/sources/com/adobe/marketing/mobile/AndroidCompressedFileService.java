package com.adobe.marketing.mobile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
class AndroidCompressedFileService implements CompressedFileService {
    private static final String LOG_TAG = "AndroidCompressedFileService";
    private static final int MAX_BUFFER_SIZE = 4096;

    private boolean handleDirectory(File file) {
        if (file.exists()) {
            return true;
        }
        boolean zMkdirs = file.mkdirs();
        if (!zMkdirs) {
            Log.debug(LOG_TAG, "Extraction failed - Could not create the folder structure during extraction!", new Object[0]);
        }
        return zMkdirs;
    }

    private boolean handleFile(File file, ZipInputStream zipInputStream) throws Throwable {
        FileOutputStream fileOutputStream = null;
        boolean z10 = false;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = zipInputStream.read(bArr);
                        if (i10 > 0) {
                            fileOutputStream2.write(bArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (IOException e5) {
                                Log.trace(LOG_TAG, "Error closing file output stream - %s", e5);
                            }
                        }
                    }
                    fileOutputStream2.close();
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    Log.error(LOG_TAG, "Extraction failed - Could not write to file - %s", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            Log.trace(LOG_TAG, "Error closing file output stream - %s", e10);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            Log.trace(LOG_TAG, "Error closing file output stream - %s", e11);
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
            }
            return !z10;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.adobe.marketing.mobile.CompressedFileService
    public boolean extract(File file, CompressedFileService.FileType fileType, String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z10;
        boolean zHandleFile;
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        r10 = 0;
        if (!CompressedFileService.FileType.ZIP.equals(fileType)) {
            Log.warning(LOG_TAG, "%s file type is not supported!", fileType);
            return false;
        }
        if (file == null || str == null) {
            Log.warning(LOG_TAG, "Extraction failed - Invalid source or destination specified", new Object[0]);
            return false;
        }
        File file2 = new File(str);
        if (!file2.exists() && !file2.mkdir()) {
            Log.warning(LOG_TAG, "Could not create the output directory %s", str);
            return false;
        }
        ?? nextEntry = 0;
        nextEntry = 0;
        nextEntry = 0;
        nextEntry = 0;
        nextEntry = 0;
        nextEntry = 0;
        nextEntry = 0;
        nextEntry = 0;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                    try {
                        nextEntry = zipInputStream.getNextEntry();
                        String canonicalPath = file2.getCanonicalPath();
                        if (nextEntry == 0) {
                            Log.warning(LOG_TAG, "Zip file was invalid", new Object[0]);
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        while (nextEntry != 0 && z10) {
                            File file3 = new File(str + File.separator + nextEntry.getName());
                            if (!file3.getCanonicalPath().startsWith(canonicalPath)) {
                                Log.error(LOG_TAG, "The zip file contained an invalid path. Verify that your zip file is formatted correctly and has not been tampered with.", new Object[0]);
                                try {
                                    zipInputStream.close();
                                } catch (Exception e5) {
                                    Log.trace(LOG_TAG, "Error closing the zip inputstream - %s", e5);
                                }
                                try {
                                    fileInputStream.close();
                                } catch (Exception e7) {
                                    Log.trace(LOG_TAG, "Error closing the inputstream - %s", e7);
                                }
                                return false;
                            }
                            if (nextEntry.isDirectory()) {
                                zHandleFile = handleDirectory(file3);
                            } else {
                                File parentFile = file3.getParentFile();
                                if (parentFile.exists() || parentFile.mkdirs()) {
                                    zHandleFile = handleFile(file3, zipInputStream);
                                } else {
                                    Log.warning(LOG_TAG, "Could not extract the file %s", file3.getAbsolutePath());
                                    z10 = false;
                                }
                                nextEntry = zipInputStream.getNextEntry();
                            }
                            z10 = zHandleFile;
                            nextEntry = zipInputStream.getNextEntry();
                        }
                        zipInputStream.closeEntry();
                        try {
                            zipInputStream.close();
                        } catch (Exception e10) {
                            Log.trace(LOG_TAG, "Error closing the zip inputstream - %s", e10);
                        }
                        try {
                            fileInputStream.close();
                        } catch (Exception e11) {
                            Log.trace(LOG_TAG, "Error closing the inputstream - %s", e11);
                        }
                        r10 = z10;
                    } catch (IOException e12) {
                        e = e12;
                        nextEntry = zipInputStream;
                        Log.error(LOG_TAG, "Extraction failed - %s", e);
                        if (nextEntry != 0) {
                            try {
                                nextEntry.close();
                            } catch (Exception e13) {
                                Log.trace(LOG_TAG, "Error closing the zip inputstream - %s", e13);
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e14) {
                                Log.trace(LOG_TAG, "Error closing the inputstream - %s", e14);
                            }
                        }
                    } catch (IllegalArgumentException e15) {
                        e = e15;
                        nextEntry = zipInputStream;
                        Log.error(LOG_TAG, "Extraction failed - %s", e);
                        if (nextEntry != 0) {
                            try {
                                nextEntry.close();
                            } catch (Exception e16) {
                                Log.trace(LOG_TAG, "Error closing the zip inputstream - %s", e16);
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e17) {
                                Log.trace(LOG_TAG, "Error closing the inputstream - %s", e17);
                            }
                        }
                    } catch (Exception e18) {
                        e = e18;
                        nextEntry = zipInputStream;
                        Log.error(LOG_TAG, "Extraction failed - %s", e);
                        if (nextEntry != 0) {
                            try {
                                nextEntry.close();
                            } catch (Exception e19) {
                                Log.trace(LOG_TAG, "Error closing the zip inputstream - %s", e19);
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e20) {
                                Log.trace(LOG_TAG, "Error closing the inputstream - %s", e20);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        nextEntry = zipInputStream;
                        if (nextEntry != 0) {
                            try {
                                nextEntry.close();
                            } catch (Exception e21) {
                                String str2 = LOG_TAG;
                                Object[] objArr = new Object[1];
                                objArr[r10] = e21;
                                Log.trace(str2, "Error closing the zip inputstream - %s", objArr);
                            }
                        }
                        if (fileInputStream == null) {
                            throw th;
                        }
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Exception e22) {
                            String str3 = LOG_TAG;
                            Object[] objArr2 = new Object[1];
                            objArr2[r10] = e22;
                            Log.trace(str3, "Error closing the inputstream - %s", objArr2);
                            throw th;
                        }
                    }
                } catch (IOException e23) {
                    e = e23;
                } catch (IllegalArgumentException e24) {
                    e = e24;
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e26) {
            e = e26;
            fileInputStream = null;
        } catch (IllegalArgumentException e27) {
            e = e27;
            fileInputStream = null;
        } catch (Exception e28) {
            e = e28;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        return r10;
    }
}
