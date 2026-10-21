package com.huawei.hms.feature.dynamicinstall.installer;

import com.huawei.hms.feature.utils.Logger;
import com.huawei.hms.feature.utils.g;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class a implements IFeatureEmulatedInstall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50257a = "a";

    public static boolean a(ClassLoader classLoader, File file, File file2, boolean z10, String str, boolean z11) {
        try {
            Logger.i(f50257a, "begin to install dex: " + file2.getName());
            Object objA = g.a(classLoader);
            List listAsList = Arrays.asList((Object[]) g.a(objA, "dexElements").get(objA));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAsList) {
                arrayList.add((File) g.a(obj, "zip").get(obj));
            }
            if (arrayList.contains(file2)) {
                Logger.i(f50257a, "apkPath(dex) have contained  ");
                return true;
            }
            if (!z10 && !a(file2.getCanonicalPath(), file.getCanonicalPath())) {
                Logger.i(f50257a, "SplitCompat should be optimized: " + file2.getPath());
                return false;
            }
            g.a(objA, "dexElements", (Object[]) (z11 ? g.a(objA, str, (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}) : g.a(objA, str, (Class<?>[]) new Class[]{List.class, File.class, List.class})).invoke(objA, new ArrayList(Collections.singleton(file2)), file, new ArrayList()));
            Logger.i(f50257a, file2.getName() + " have installed");
            return true;
        } catch (Exception e5) {
            Logger.w(f50257a, "dex install failed", e5);
            return false;
        }
    }

    @Override // com.huawei.hms.feature.dynamicinstall.installer.IFeatureEmulatedInstall
    public boolean dexInstall(ClassLoader classLoader, File file, File file2, boolean z10) {
        return a(classLoader, file, file2, z10, "makeDexElements", true);
    }

    @Override // com.huawei.hms.feature.dynamicinstall.installer.IFeatureEmulatedInstall
    public void nativeInstall(ClassLoader classLoader, Set<File> set) {
        if (set.isEmpty()) {
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (File file : set) {
                if (!hashSet.contains(file.getParentFile().getCanonicalPath())) {
                    hashSet.add(file.getParentFile().getCanonicalPath());
                    hashSet2.add(file.getParentFile());
                }
            }
            Object objA = g.a(classLoader);
            Field fieldA = g.a(objA, "nativeLibraryDirectories");
            File[] fileArr = (File[]) fieldA.get(objA);
            hashSet2.removeAll(Arrays.asList(fileArr));
            Logger.d(f50257a, "Adding dirs " + hashSet2.size());
            File[] fileArr2 = new File[fileArr.length + hashSet2.size()];
            int i10 = 0;
            System.arraycopy(fileArr, 0, fileArr2, 0, fileArr.length);
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                fileArr2[fileArr.length + i10] = (File) it.next();
                i10++;
            }
            fieldA.set(objA, fileArr2);
        } catch (Exception e5) {
            Logger.w(f50257a, "native install failed", e5);
        }
    }

    public static boolean a(String str, String str2) {
        String str3;
        String str4;
        Method declaredMethod;
        String str5;
        String str6;
        String str7 = null;
        try {
            declaredMethod = Class.forName("dalvik.system.DexPathList").getDeclaredMethod("optimizedPathFor", File.class, File.class);
        } catch (ClassNotFoundException e5) {
            e = e5;
            str3 = f50257a;
            str4 = "get class failed, class not found";
            Logger.e(str3, str4, e);
            declaredMethod = null;
        } catch (NoSuchMethodException e7) {
            e = e7;
            str3 = f50257a;
            str4 = "get class failed, no such method";
            Logger.e(str3, str4, e);
            declaredMethod = null;
        }
        if (declaredMethod == null) {
            return false;
        }
        declaredMethod.setAccessible(true);
        try {
            str7 = (String) String.class.cast(declaredMethod.invoke(null, new File(str), new File(str2)));
        } catch (IllegalAccessException e10) {
            e = e10;
            str5 = f50257a;
            str6 = "get file path failed, illegal access";
            Logger.e(str5, str6, e);
        } catch (InvocationTargetException e11) {
            e = e11;
            str5 = f50257a;
            str6 = "get file path failed, invocation target";
            Logger.e(str5, str6, e);
        }
        if (str7 == null) {
            return false;
        }
        return new File(str7).exists();
    }
}
