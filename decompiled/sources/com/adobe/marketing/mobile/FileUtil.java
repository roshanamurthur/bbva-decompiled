package com.adobe.marketing.mobile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
final class FileUtil {
    private static final String LOG_TAG = "FileUtil";
    private static final int STREAM_WRITE_BUFFER_SIZE = 4096;

    private FileUtil() {
    }

    public static boolean isValidDirectory(File file) {
        return file != null && file.isDirectory() && file.canWrite();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static boolean readInputStreamIntoFile(File file, InputStream inputStream, boolean z10) throws Throwable {
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        if (file == null || inputStream == null) {
            return false;
        }
        ?? r4 = 0;
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file, z10);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStream.read(bArr);
                        r4 = -1;
                        if (i10 != -1) {
                            fileOutputStream3.write(bArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (Exception e5) {
                                Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", e5);
                            }
                        }
                    }
                    fileOutputStream3.close();
                    r3 = 1;
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream3;
                    Log.error(LOG_TAG, "IOException while attempting to write to file (%s)", e);
                    r4 = fileOutputStream;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            r4 = fileOutputStream;
                        } catch (Exception e10) {
                            Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", e10);
                            r4 = fileOutputStream;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream2 = fileOutputStream3;
                    Log.error(LOG_TAG, "Unexpected exception while attempting to write to file (%s)", e);
                    r4 = fileOutputStream2;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            r4 = fileOutputStream2;
                        } catch (Exception e12) {
                            Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", e12);
                            r4 = fileOutputStream2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r4 = fileOutputStream3;
                    if (r4 != 0) {
                        try {
                            r4.close();
                        } catch (Exception e13) {
                            Object[] objArr = new Object[1];
                            objArr[r3] = e13;
                            Log.error(LOG_TAG, "Unable to close the OutputStream (%s) ", objArr);
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
        return r3;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[Catch: IOException -> 0x0073, TRY_LEAVE, TryCatch #3 {IOException -> 0x0073, blocks: (B:36:0x006f, B:40:0x0077), top: B:62:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[Catch: IOException -> 0x0089, TRY_LEAVE, TryCatch #0 {IOException -> 0x0089, blocks: (B:45:0x0085, B:49:0x008d), top: B:59:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static String readStringFromFile(File file) throws Throwable {
        ?? r10;
        BufferedReader bufferedReader;
        ?? r1 = 0;
        boolean z10 = false;
        if (file != null) {
            try {
                if (file.exists() && file.canRead()) {
                    ?? IsFile = file.isFile();
                    try {
                        if (IsFile != 0) {
                            try {
                                IsFile = new FileInputStream(file);
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader((InputStream) IsFile, "UTF-8"));
                                    try {
                                        StringBuilder sb2 = new StringBuilder();
                                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                                            sb2.append(line);
                                        }
                                        String string = sb2.toString();
                                        try {
                                            IsFile.close();
                                            bufferedReader.close();
                                        } catch (IOException e5) {
                                            Log.debug("File Reader", "Failed to close file (%s)", e5);
                                        }
                                        return string;
                                    } catch (IOException e7) {
                                        e = e7;
                                        r10 = IsFile;
                                        Log.debug("File Reader", "Failed to close file (%s)", e);
                                        if (r10 != 0) {
                                            try {
                                                r10.close();
                                                if (bufferedReader != null) {
                                                    bufferedReader.close();
                                                }
                                            } catch (IOException e10) {
                                                Log.debug("File Reader", "Failed to close file (%s)", e10);
                                                return null;
                                            }
                                        } else if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        return null;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    bufferedReader = null;
                                    r10 = IsFile;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r1 = IsFile;
                                    if (r1 != 0) {
                                        try {
                                            r1.close();
                                            if (r1 != 0) {
                                                (z10 ? 1 : 0).close();
                                            }
                                        } catch (IOException e12) {
                                            Log.debug("File Reader", "Failed to close file (%s)", e12);
                                            throw th;
                                        }
                                    } else if (r1 != 0) {
                                        (z10 ? 1 : 0).close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e13) {
                                e = e13;
                                r10 = 0;
                                bufferedReader = null;
                            } catch (Throwable th3) {
                                th = th3;
                                if (r1 != 0) {
                                    r1.close();
                                    if (r1 != 0) {
                                        (z10 ? 1 : 0).close();
                                    }
                                } else if (r1 != 0) {
                                    (z10 ? 1 : 0).close();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
            } catch (SecurityException e14) {
                Log.debug("File Reader", "Failed to read file (%s)", e14);
                return null;
            }
        }
        Log.warning("File Reader", "Write to file - File does not exist or don't have read permission (%s)", file);
        return null;
    }
}
