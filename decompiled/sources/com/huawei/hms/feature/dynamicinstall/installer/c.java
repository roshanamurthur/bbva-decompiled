package com.huawei.hms.feature.dynamicinstall.installer;

import com.huawei.hms.feature.utils.Logger;
import com.huawei.hms.feature.utils.g;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class c implements IFeatureEmulatedInstall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f50258a = "c";

    private static Object a(Object obj, List<File> list, int i10) throws Exception {
        return i10 != 1 ? g.a(obj, "makePathElements", (Class<?>[]) new Class[]{List.class}).invoke(obj, list) : g.a(obj, "makePathElements", (Class<?>[]) new Class[]{List.class, File.class, List.class}).invoke(obj, list, null, new ArrayList());
    }

    @Override // com.huawei.hms.feature.dynamicinstall.installer.IFeatureEmulatedInstall
    public boolean dexInstall(ClassLoader classLoader, File file, File file2, boolean z10) {
        Logger.i(f50258a, "begin install dex: " + file2.getName());
        try {
            Object objA = g.a(classLoader);
            List listAsList = Arrays.asList((Object[]) g.a(objA, "dexElements").get(objA));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listAsList) {
                arrayList.add((File) g.a(obj, "path").get(obj));
            }
            if (arrayList.contains(file2)) {
                Logger.i(f50258a, "apkPath(dex) have contained  ");
                return true;
            }
            if (!z10 && !a(file2.getCanonicalPath())) {
                Logger.w(f50258a, "SplitCompat should be optimized:" + file2.getPath());
                return false;
            }
            g.a(objA, "dexElements", (Object[]) g.a(objA, "makePathElements", (Class<?>[]) new Class[]{List.class, File.class, List.class}).invoke(objA, new ArrayList(Collections.singleton(file2)), file, new ArrayList()));
            Logger.i(f50258a, file2.getName() + "have installed");
            return true;
        } catch (Exception e5) {
            Logger.w(f50258a, "dex install failed", e5);
            return false;
        }
    }

    @Override // com.huawei.hms.feature.dynamicinstall.installer.IFeatureEmulatedInstall
    public void nativeInstall(ClassLoader classLoader, Set<File> set) {
        a(classLoader, set, 2);
    }

    public static void a(ClassLoader classLoader, Set<File> set, int i10) {
        if (set.isEmpty()) {
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (File file : set) {
                if (!hashSet.contains(file.getParentFile().getCanonicalPath())) {
                    hashSet.add(file.getParentFile().getCanonicalPath());
                    arrayList.add(file.getParentFile());
                }
            }
            Object objA = g.a(classLoader);
            List list = (List) g.a(objA, "nativeLibraryDirectories").get(objA);
            arrayList.removeAll(list);
            list.addAll(arrayList);
            Object objA2 = a(objA, arrayList, i10);
            int length = Array.getLength(objA2);
            String str = f50258a;
            Logger.i(str, "versionType:" + i10 + ", addedElements length: " + length);
            Field fieldA = g.a(objA, "nativeLibraryPathElements");
            Object obj = fieldA.get(objA);
            int length2 = Array.getLength(obj);
            Logger.i(str, "origin nativeLibraryPathElements length: " + length2);
            Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length2 + length);
            System.arraycopy(obj, 0, objNewInstance, 0, length2);
            System.arraycopy(objA2, 0, objNewInstance, length2, length);
            fieldA.set(objA, objNewInstance);
            Logger.i(str, "after set: nativeLibraryPathElements final length:" + Array.getLength(g.a(objA, "nativeLibraryPathElements").get(objA)));
        } catch (Exception e5) {
            Logger.w(f50258a, "native install failed", e5);
        }
    }

    public static boolean a(String str) {
        Class<?> cls;
        Method method;
        String str2;
        String str3;
        try {
            cls = Class.forName("dalvik.system.DexFile");
        } catch (ClassNotFoundException e5) {
            Logger.e(f50258a, "get class failed", e5);
            cls = null;
        }
        if (cls == null) {
            return false;
        }
        try {
            method = cls.getMethod("isDexOptNeeded", String.class);
        } catch (NoSuchMethodException e7) {
            Logger.e(f50258a, "get method failed", e7);
            method = null;
        }
        if (method == null) {
            return false;
        }
        try {
            return !((Boolean) Boolean.class.cast(method.invoke(null, str))).booleanValue();
        } catch (IllegalAccessException e10) {
            e = e10;
            str2 = f50258a;
            str3 = "get class failed, illegal access";
            Logger.e(str2, str3, e);
            return false;
        } catch (InvocationTargetException e11) {
            e = e11;
            str2 = f50258a;
            str3 = "get class failed, invocation target";
            Logger.e(str2, str3, e);
            return false;
        }
    }
}
