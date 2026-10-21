package com.huawei.hms.feature.dynamicinstall;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.feature.utils.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes10.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50242a = "g";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f50243b = Pattern.compile("lib/([^/]+)/([^/\\r\\n]*\\.so)$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50244c = "../";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f50245d;

    public g(h hVar) {
        this.f50245d = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e0 -> B:43:0x00e5). Please report as a decompilation issue!!! */
    @TargetApi(21)
    private HashSet<File> a(a aVar) throws Throwable {
        ?? absoluteFile;
        HashSet<File> hashSet = new HashSet<>();
        ?? r10 = 0;
        ZipFile zipFile = null;
        r10 = 0;
        try {
            try {
                try {
                    ZipFile zipFile2 = new ZipFile(aVar.a());
                    try {
                        Map<String, Set<f>> mapA = a(zipFile2, aVar);
                        String str = f50242a;
                        Logger.i(str, "native codes size: " + mapA.size());
                        Logger.d(str, "mNatvieCodes " + mapA.toString());
                        Map<String, f> mapA2 = a(mapA);
                        Logger.i(str, "install codes value size: " + mapA2.values().size());
                        ?? r11 = mapA;
                        for (f fVar : mapA2.values()) {
                            File fileA = this.f50245d.a(aVar.b(), fVar.f50240a);
                            if (!fileA.exists() || fileA.length() != fVar.f50241b.getSize()) {
                                String str2 = f50242a;
                                Logger.i(str2, "Split '%s' native library does not exist", aVar.b());
                                Logger.d(str2, "native library '%s' does not exist, extracting to '%s'", fVar.f50240a, fileA.getAbsoluteFile());
                                ZipEntry zipEntry = fVar.f50241b;
                                absoluteFile = fileA.getAbsoluteFile();
                                a(zipFile2, zipEntry, absoluteFile);
                            }
                            hashSet.add(fileA);
                            r11 = absoluteFile;
                        }
                        zipFile2.close();
                        r10 = r11;
                    } catch (IOException e5) {
                        e = e5;
                        zipFile = zipFile2;
                        Logger.w(f50242a, "extract failed", e);
                        r10 = zipFile;
                        if (zipFile != null) {
                            zipFile.close();
                            r10 = zipFile;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = zipFile2;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e7) {
                                Logger.w(f50242a, "extract failed，close file failed", e7);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (IOException e11) {
            Logger.w(f50242a, "extract failed，close file failed", e11);
            r10 = r10;
        }
        return hashSet;
    }

    public final Set<File> b(a aVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet<File> hashSetA = a(aVar, atomicBoolean);
        if (atomicBoolean.get()) {
            return hashSetA;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[SYNTHETIC] */
    @TargetApi(21)
    private HashSet<File> a(a aVar, AtomicBoolean atomicBoolean) throws Throwable {
        Throwable th2;
        HashSet<File> hashSet = new HashSet<>();
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(aVar.a());
                try {
                    Map<String, Set<f>> mapA = a(zipFile2, aVar);
                    String str = f50242a;
                    Logger.i(str, "native codes size: " + mapA.size());
                    Logger.d(str, "mNatvieCodes " + mapA.toString());
                    Map<String, f> mapA2 = a(mapA);
                    Logger.i(str, "install codes value size: " + mapA2.values().size());
                    for (f fVar : mapA2.values()) {
                        try {
                            File fileA = this.f50245d.a(aVar.b(), fVar.f50240a);
                            if (!fileA.exists() || fileA.length() != fVar.f50241b.getSize()) {
                                String strA = com.huawei.hms.feature.utils.i.a(fileA.getCanonicalPath(), File.separator, 2);
                                String str2 = f50242a;
                                Logger.i(str2, "Split '%s' native library does not exist", aVar.b());
                                Logger.d(str2, "native library '%s' does not exist, extracting to '%s'", fVar.f50240a, strA);
                                atomicBoolean.set(false);
                            }
                            hashSet.add(fileA);
                        } catch (IOException e5) {
                            e = e5;
                            zipFile = zipFile2;
                            try {
                                Logger.w(f50242a, "extract failed", e);
                                if (zipFile != null) {
                                    zipFile.close();
                                }
                                return hashSet;
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                if (zipFile != null) {
                                    throw th2;
                                }
                                try {
                                    zipFile.close();
                                    throw th2;
                                } catch (IOException e7) {
                                    Logger.w(f50242a, "extract failed，close file failed", e7);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zipFile = zipFile2;
                            th2 = th;
                            if (zipFile != null) {
                                throw th2;
                            }
                            zipFile.close();
                            throw th2;
                        }
                    }
                    zipFile2.close();
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e11) {
                Logger.w(f50242a, "extract failed，close file failed", e11);
            }
        } catch (IOException e12) {
            e = e12;
        } catch (Throwable th6) {
            th = th6;
        }
        return hashSet;
    }

    @TargetApi(21)
    private static Map<String, f> a(Map<String, Set<f>> map) {
        HashMap map2 = new HashMap();
        for (String str : Build.SUPPORTED_ABIS) {
            if (map.containsKey(str)) {
                Logger.d(f50242a, "Use this ABI: there are native libraries for supported ABI %s; " + str);
                for (f fVar : map.get(str)) {
                    if (map2.containsKey(fVar.f50240a)) {
                        Logger.d(f50242a, "Already present for a better ABI: skipping library %s for ABI %s.", fVar.f50240a, str);
                    } else {
                        map2.put(fVar.f50240a, fVar);
                        Logger.d(f50242a, "using library %s for ABI %s", fVar.f50240a, str);
                    }
                }
            } else {
                Logger.d(f50242a, " there are no native libraries for supported ABI %s", str);
            }
        }
        return map2;
    }

    private static Map<String, Set<f>> a(ZipFile zipFile, a aVar) {
        HashMap map = new HashMap();
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (zipEntryNextElement.getName().contains(f50244c)) {
                Logger.w(f50242a, "Insecure zip path.");
                return map;
            }
            Matcher matcher = f50243b.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                Logger.d(f50242a, " Split '%s' has native library '%s' for ABI '%s'", aVar.b(), strGroup2, strGroup);
                Set hashSet = (Set) map.get(strGroup);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(strGroup, hashSet);
                }
                hashSet.add(new f(zipEntryNextElement, strGroup2));
            }
        }
        return map;
    }

    public Set<File> a() throws Throwable {
        Logger.i(f50242a, "begin extract native libraries");
        Set<a> setB = this.f50245d.b();
        for (String str : this.f50245d.f()) {
            Iterator<a> it = setB.iterator();
            do {
                if (!it.hasNext()) {
                    Logger.d(f50242a, "FeatureNativeLibraryExtractor: extracted split" + str + "is rootless; deleting");
                    this.f50245d.a(str);
                    break;
                }
            } while (!TextUtils.equals(it.next().b(), str));
        }
        HashSet hashSet = new HashSet();
        for (a aVar : setB) {
            HashSet<File> hashSetA = a(aVar);
            for (File file : this.f50245d.f(aVar.b())) {
                if (!hashSetA.contains(file)) {
                    Logger.i(f50242a, "file '%s' found in split '%s' that is not in the split  apk file '%s'.removing: ", file.getName(), aVar.b(), aVar.a().getName());
                    this.f50245d.a(file);
                }
            }
            hashSet.addAll(hashSetA);
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file) throws Throwable {
        InputStream inputStream;
        IOException e5;
        Throwable th2;
        byte[] bArr = new byte[4096];
        FileOutputStream fileOutputStream = null;
        try {
            try {
                inputStream = zipFile.getInputStream(zipEntry);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i10 = inputStream.read(bArr);
                            if (i10 > 0) {
                                fileOutputStream2.write(bArr, 0, i10);
                            } else {
                                try {
                                    break;
                                } catch (IOException e7) {
                                    Logger.w(f50242a, "write entry failed, close input stream failed", e7);
                                }
                            }
                        } catch (IOException e10) {
                            e5 = e10;
                            fileOutputStream = fileOutputStream2;
                            try {
                                Logger.w(f50242a, "write entry failed", e5);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e11) {
                                        Logger.w(f50242a, "write entry failed, close input stream failed", e11);
                                    }
                                }
                                if (fileOutputStream == null) {
                                    return;
                                } else {
                                    fileOutputStream.close();
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                th = th2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e12) {
                                        Logger.w(f50242a, "write entry failed, close input stream failed", e12);
                                    }
                                }
                                if (fileOutputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (IOException e13) {
                                    Logger.w(f50242a, "write entry failed, close output stream failed", e13);
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            fileOutputStream = fileOutputStream2;
                            th = th2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (fileOutputStream == null) {
                                throw th;
                            }
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    inputStream.close();
                    fileOutputStream2.close();
                } catch (IOException e14) {
                    e5 = e14;
                } catch (Throwable th5) {
                    th = th5;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (IOException e15) {
                Logger.w(f50242a, "write entry failed, close output stream failed", e15);
            }
        } catch (IOException e16) {
            e5 = e16;
            inputStream = null;
        } catch (Throwable th6) {
            th = th6;
            inputStream = null;
        }
    }
}
