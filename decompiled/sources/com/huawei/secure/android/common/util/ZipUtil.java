package com.huawei.secure.android.common.util;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes10.dex */
public class ZipUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50677a = "ZipUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50678b = 104857600;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f50679c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f50680d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f50681e = "../";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f50682f = "..\\";

    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    @SuppressLint({"NewApi"})
    private static List<File> a(File file, File file2, long j10, boolean z10) throws Throwable {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        ZipFile zipFile = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream = null;
        zipFile = null;
        if (file == null || file2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = true;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                int i10 = 0;
                while (true) {
                    if (!enumerationEntries.hasMoreElements()) {
                        z11 = z12;
                        break;
                    }
                    try {
                        ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                        String name = zipEntryNextElement.getName();
                        if (!TextUtils.isEmpty(name)) {
                            String strNormalize = Normalizer.normalize(name, Normalizer.Form.NFKC);
                            if (e(strNormalize)) {
                                d(strNormalize);
                                break;
                            }
                            File file3 = new File(file2, strNormalize.replaceAll("\\\\", "/"));
                            if (z10 && file3.exists() && file3.isFile()) {
                                e(file3);
                            }
                            arrayList.add(file3);
                            if (zipEntryNextElement.isDirectory()) {
                                if (!a(file3)) {
                                    IOUtil.closeSecure(zipFile2);
                                    a(arrayList);
                                    return null;
                                }
                            } else {
                                if (!b(file3)) {
                                    IOUtil.closeSecure(zipFile2);
                                    a(arrayList);
                                    return null;
                                }
                                try {
                                    bufferedInputStream = new BufferedInputStream(zipFile2.getInputStream(zipEntryNextElement));
                                    try {
                                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                                        try {
                                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i11 = bufferedInputStream.read(bArr);
                                                    if (i11 == -1) {
                                                        break;
                                                    }
                                                    i10 += i11;
                                                    if (i10 > j10) {
                                                        z12 = false;
                                                        break;
                                                    }
                                                    bufferedOutputStream.write(bArr, 0, i11);
                                                }
                                                IOUtil.closeSecure((InputStream) bufferedInputStream);
                                                IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                                IOUtil.closeSecure((OutputStream) fileOutputStream2);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                fileOutputStream = fileOutputStream2;
                                                IOUtil.closeSecure((InputStream) bufferedInputStream);
                                                IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                                IOUtil.closeSecure((OutputStream) fileOutputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bufferedOutputStream = null;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bufferedOutputStream = null;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bufferedInputStream = null;
                                    bufferedOutputStream = null;
                                }
                            }
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                IOUtil.closeSecure(zipFile2);
                if (!z11) {
                    a(arrayList);
                }
            } catch (IOException e5) {
                e = e5;
                zipFile = zipFile2;
                try {
                    e.getMessage();
                    IOUtil.closeSecure(zipFile);
                    a(arrayList);
                } catch (Throwable th6) {
                    th = th6;
                    z12 = z11;
                    IOUtil.closeSecure(zipFile);
                    if (!z12) {
                        a(arrayList);
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                z11 = true;
                zipFile = zipFile2;
                z12 = z11;
                IOUtil.closeSecure(zipFile);
                if (!z12) {
                    a(arrayList);
                }
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (Throwable th8) {
            th = th8;
            IOUtil.closeSecure(zipFile);
            if (!z12) {
                a(arrayList);
            }
            throw th;
        }
        return arrayList;
    }

    private static boolean b(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!a(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    private static File c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return b(str);
    }

    private static String d(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(File.separator)) == -1) ? str : str.substring(iLastIndexOf + 1);
    }

    private static void e(File file) {
        if (file == null) {
            return;
        }
        if (file.isFile()) {
            c(file);
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                c(file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                e(file2);
            }
            c(file);
        }
    }

    @Deprecated
    public static boolean unZip(String str, String str2, boolean z10) throws SecurityCommonException {
        return unZip(str, str2, 104857600L, 100, z10);
    }

    public static List<File> unZipNew(String str, String str2, boolean z10) throws SecurityCommonException {
        return unZipNew(str, str2, 104857600L, 100, z10);
    }

    private static void c(File file) {
        if (file == null || file.delete()) {
            return;
        }
        LogsUtil.e(f50677a, "delete file error");
    }

    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    @Deprecated
    public static boolean unZip(String str, String str2, long j10, int i10, boolean z10) throws Throwable {
        ZipInputStream zipInputStream;
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream3;
        String strSubstring = str2;
        boolean z11 = false;
        if (!a(str, str2, j10, i10)) {
            return false;
        }
        String str3 = File.separator;
        if (strSubstring.endsWith(str3) && str2.length() > str3.length()) {
            strSubstring = strSubstring.substring(0, str2.length() - str3.length());
        }
        byte[] bArr = new byte[4096];
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));
                int i11 = 0;
                boolean z12 = true;
                fileOutputStream2 = null;
                while (true) {
                    try {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry == null) {
                                break;
                            }
                            String strReplaceAll = nextEntry.getName().replaceAll("\\\\", "/");
                            File file = new File(strSubstring, strReplaceAll);
                            String strNormalize = Normalizer.normalize(strReplaceAll, Normalizer.Form.NFKC);
                            if (e(strNormalize)) {
                                d(strNormalize);
                                z12 = false;
                                break;
                            }
                            if (z10 && file.exists() && file.isFile()) {
                                e(file);
                            }
                            if (nextEntry.isDirectory()) {
                                d(file);
                                arrayList.add(file);
                            } else {
                                File parentFile = file.getParentFile();
                                if (parentFile != null && !parentFile.exists()) {
                                    d(parentFile);
                                }
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                    while (true) {
                                        try {
                                            int i12 = zipInputStream.read(bArr, 0, 4096);
                                            if (i12 == -1) {
                                                break;
                                            }
                                            i11 += i12;
                                            if (i11 > j10) {
                                                z12 = false;
                                                break;
                                            }
                                            bufferedOutputStream.write(bArr, 0, i12);
                                        } catch (IOException e5) {
                                            e = e5;
                                            fileOutputStream3 = fileOutputStream;
                                            fileOutputStream = fileOutputStream3;
                                            fileInputStream2 = fileInputStream;
                                            try {
                                                LogsUtil.e(f50677a, "Unzip IOException : " + e.getMessage());
                                                fileInputStream = fileInputStream2;
                                                bufferedOutputStream2 = bufferedOutputStream;
                                                fileOutputStream2 = fileOutputStream;
                                                a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
                                                if (!z11) {
                                                    a(arrayList);
                                                }
                                                return z11;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            fileInputStream2 = fileInputStream;
                                            a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                            throw th;
                                        }
                                    }
                                    arrayList.add(file);
                                    bufferedOutputStream.flush();
                                    IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                    IOUtil.closeSecure((OutputStream) fileOutputStream);
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    fileOutputStream2 = fileOutputStream;
                                } catch (IOException e7) {
                                    e = e7;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    LogsUtil.e(f50677a, "Unzip IOException : " + e.getMessage());
                                    fileInputStream = fileInputStream2;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    fileOutputStream2 = fileOutputStream;
                                    a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
                                    if (!z11) {
                                        a(arrayList);
                                    }
                                    return z11;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    a(fileInputStream2, bufferedOutputStream, zipInputStream, fileOutputStream);
                                    throw th;
                                }
                            }
                            try {
                                zipInputStream.closeEntry();
                            } catch (IOException e10) {
                                e = e10;
                                FileOutputStream fileOutputStream4 = fileOutputStream2;
                                bufferedOutputStream = bufferedOutputStream2;
                                fileOutputStream3 = fileOutputStream4;
                                fileOutputStream = fileOutputStream3;
                                fileInputStream2 = fileInputStream;
                                LogsUtil.e(f50677a, "Unzip IOException : " + e.getMessage());
                                fileInputStream = fileInputStream2;
                                bufferedOutputStream2 = bufferedOutputStream;
                                fileOutputStream2 = fileOutputStream;
                                a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
                                if (!z11) {
                                    a(arrayList);
                                }
                                return z11;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileOutputStream = fileOutputStream2;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                    }
                }
                IOUtil.closeSecure((InputStream) zipInputStream);
                IOUtil.closeSecure((InputStream) fileInputStream);
                z11 = z12;
            } catch (IOException e12) {
                e = e12;
                zipInputStream = null;
                bufferedOutputStream = null;
                fileOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                zipInputStream = null;
                bufferedOutputStream = null;
                fileOutputStream = null;
            }
        } catch (IOException e13) {
            e = e13;
            zipInputStream = null;
            bufferedOutputStream = null;
            fileOutputStream = null;
        } catch (Throwable th7) {
            th = th7;
            zipInputStream = null;
            bufferedOutputStream = null;
            fileOutputStream = null;
        }
        a(fileInputStream, bufferedOutputStream2, zipInputStream, fileOutputStream2);
        if (!z11) {
            a(arrayList);
        }
        return z11;
    }

    public static List<File> unZipNew(String str, String str2, long j10, int i10, boolean z10) throws SecurityCommonException {
        if (!a(str, str2, j10, i10)) {
            return null;
        }
        String str3 = File.separator;
        if (str2.endsWith(str3) && str2.length() > str3.length()) {
            str2 = str2.substring(0, str2.length() - str3.length());
        }
        return a(c(str), c(str2), j10, z10);
    }

    private static void d(File file) {
        if (file == null || file.exists() || file.mkdirs()) {
            return;
        }
        LogsUtil.e(f50677a, "mkdirs error , files exists or IOException.");
    }

    private static File b(String str) {
        a(str);
        return new File(str);
    }

    private static boolean e(String str) {
        return TextUtils.isEmpty(str) || str.contains(f50681e) || str.contains(f50682f) || str.contains("..") || str.contains("./") || str.contains(".\\.\\") || str.contains("%00");
    }

    private static void a(String str) {
        if (!TextUtils.isEmpty(str) && e(str)) {
            throw new IllegalArgumentException("path is not a standard path");
        }
    }

    private static boolean a(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:32:0x0073
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    private static boolean a(java.lang.String r11, long r12, int r14) {
        /*
            java.lang.String r0 = "close zipFile IOException "
            java.lang.String r1 = "ZipUtil"
            r2 = 0
            r3 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            java.util.Enumeration r11 = r4.entries()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            r5 = 0
            r2 = r3
        L12:
            boolean r7 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            r8 = 1
            if (r7 == 0) goto L4b
            java.lang.Object r7 = r11.nextElement()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            java.util.zip.ZipEntry r7 = (java.util.zip.ZipEntry) r7     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            long r9 = r7.getSize()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            long r5 = r5 + r9
            int r2 = r2 + r8
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            boolean r8 = e(r8)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            if (r8 != 0) goto L45
            if (r2 >= r14) goto L45
            int r8 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r8 > 0) goto L45
            long r7 = r7.getSize()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            r9 = -1
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L12
            goto L45
        L40:
            r11 = move-exception
            r2 = r4
            goto L77
        L43:
            r11 = move-exception
            goto L50
        L45:
            java.lang.String r11 = "File name is invalid or too many files or too big"
            com.huawei.secure.android.common.util.LogsUtil.e(r1, r11)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L43
            goto L4c
        L4b:
            r3 = r8
        L4c:
            r4.close()     // Catch: java.io.IOException -> L73
            goto L76
        L50:
            r2 = r4
            goto L55
        L52:
            r11 = move-exception
            goto L77
        L54:
            r11 = move-exception
        L55:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r12.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r13 = "not a valid zip file, IOException : "
            r12.append(r13)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L52
            r12.append(r11)     // Catch: java.lang.Throwable -> L52
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> L52
            com.huawei.secure.android.common.util.LogsUtil.e(r1, r11)     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L73
            goto L76
        L73:
            com.huawei.secure.android.common.util.LogsUtil.e(r1, r0)
        L76:
            return r3
        L77:
            if (r2 == 0) goto L80
            r2.close()     // Catch: java.io.IOException -> L7d
            goto L80
        L7d:
            com.huawei.secure.android.common.util.LogsUtil.e(r1, r0)
        L80:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.util.ZipUtil.a(java.lang.String, long, int):boolean");
    }

    private static boolean a(String str, String str2, long j10, int i10) throws SecurityCommonException {
        if (!TextUtils.isEmpty(str) && !e(str)) {
            if (!TextUtils.isEmpty(str2) && !e(str2)) {
                if (a(str, j10, i10)) {
                    return true;
                }
                LogsUtil.e(f50677a, "zip file contains valid chars or too many files");
                throw new SecurityCommonException("unsecure zipfile!");
            }
            LogsUtil.e(f50677a, "target directory is not valid");
            return false;
        }
        LogsUtil.e(f50677a, "zip file is not valid");
        return false;
    }

    private static boolean a(List<File> list) {
        try {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
            return true;
        } catch (Exception e5) {
            LogsUtil.e(f50677a, "unzip fail delete file failed" + e5.getMessage());
            return false;
        }
    }

    private static void a(FileInputStream fileInputStream, BufferedOutputStream bufferedOutputStream, ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        IOUtil.closeSecure((InputStream) fileInputStream);
        IOUtil.closeSecure((OutputStream) bufferedOutputStream);
        IOUtil.closeSecure((InputStream) zipInputStream);
        IOUtil.closeSecure((OutputStream) fileOutputStream);
    }
}
