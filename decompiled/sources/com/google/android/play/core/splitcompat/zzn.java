package com.google.android.play.core.splitcompat;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import we.e;
import we.g;
import we.h;
import we.l;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f46253b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zze f46254a;

    public zzn(zze zzeVar) throws IOException {
        this.f46254a = zzeVar;
    }

    @RequiresApi(21)
    public static void b(l lVar, g gVar) throws IllegalAccessException, IOException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(lVar.a());
            try {
                String strB = lVar.b();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = f46253b.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        String.format("NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'", strB, strGroup2, strGroup);
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new zzm(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        String.format("NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI", str);
                        for (zzm zzmVar : (Set) map.get(str)) {
                            if (map2.containsKey(zzmVar.zza)) {
                                String.format("NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI", zzmVar.zza, str);
                            } else {
                                map2.put(zzmVar.zza, zzmVar);
                                String.format("NativeLibraryExtractor: using library %s for ABI %s", zzmVar.zza, str);
                            }
                        }
                    } else {
                        String.format("NativeLibraryExtractor: there are no native libraries for supported ABI %s", str);
                    }
                }
                gVar.a(zipFile, new HashSet(map2.values()));
                zipFile.close();
            } catch (IOException e5) {
                e = e5;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e7) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e7);
                    }
                }
                throw e;
            }
        } catch (IOException e10) {
            e = e10;
            zipFile = null;
        }
    }

    @RequiresApi(21)
    public final HashSet a() throws IllegalAccessException, IOException, InvocationTargetException {
        zze zzeVar = this.f46254a;
        HashSet<l> hashSetA = zzeVar.a();
        ArrayList<String> arrayList = new ArrayList();
        File file = new File(zzeVar.e(), "native-libraries");
        zze.c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        for (String str : arrayList) {
            Iterator it = hashSetA.iterator();
            do {
                if (!it.hasNext()) {
                    String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", str);
                    File file3 = new File(zzeVar.e(), "native-libraries");
                    zze.c(file3);
                    File fileB = zze.b(file3, str);
                    zze.c(fileB);
                    zze.zzl(fileB);
                    break;
                }
            } while (!((l) it.next()).b().equals(str));
        }
        HashSet hashSet = new HashSet();
        for (l lVar : hashSetA) {
            HashSet hashSet2 = new HashSet();
            b(lVar, new e(this, hashSet2, lVar));
            String strB = lVar.b();
            HashSet<File> hashSet3 = new HashSet();
            File file4 = new File(zzeVar.e(), "native-libraries");
            zze.c(file4);
            File fileB2 = zze.b(file4, strB);
            zze.c(fileB2);
            File[] fileArrListFiles2 = fileB2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file5 : fileArrListFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            for (File file6 : hashSet3) {
                if (!hashSet2.contains(file6)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", file6.getAbsolutePath(), lVar.b(), lVar.a().getAbsolutePath());
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(zzeVar.e(), "native-libraries");
                    zze.c(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    zze.zzl(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(l lVar, HashSet hashSet, h hVar) throws IOException {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            zzm zzmVar = (zzm) it.next();
            File fileZzc = this.f46254a.zzc(lVar.b(), zzmVar.zza);
            boolean z10 = false;
            if (fileZzc.exists() && fileZzc.length() == zzmVar.zzb.getSize() && zze.zzp(fileZzc)) {
                z10 = true;
            }
            hVar.a(zzmVar, fileZzc, z10);
        }
    }
}
