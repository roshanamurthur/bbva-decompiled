package com.huawei.hms.feature.remote;

import com.huawei.hms.feature.utils.Logger;
import dalvik.system.PathClassLoader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a extends PathClassLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50551a = "a";

    public a(String str, String str2, ClassLoader classLoader) {
        super(str, str2, classLoader);
    }

    private static void a(List list, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            list.add(enumeration.nextElement());
        }
    }

    @Override // java.lang.ClassLoader
    public final URL getResource(String str) {
        URL resource;
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader == null) {
            Logger.w(f50551a, "Failed to get SystemClassLoader");
            resource = null;
        } else {
            resource = systemClassLoader.getResource(str);
        }
        return resource == null ? findResource(str) : resource;
    }

    @Override // java.lang.ClassLoader
    public final Enumeration getResources(String str) {
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        if (systemClassLoader != null) {
            try {
                a(arrayList, systemClassLoader.getResources(str));
            } catch (IOException unused) {
                str2 = f50551a;
                str3 = "Add Enumeration failed.";
                Logger.w(str2, str3);
            }
            a(arrayList, findResources(str));
            return Collections.enumeration(arrayList);
        }
        str2 = f50551a;
        str3 = "Failed to get SystemClassLoader";
        Logger.w(str2, str3);
        a(arrayList, findResources(str));
        return Collections.enumeration(arrayList);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (str.startsWith("java.")) {
            try {
                return super.loadClass(str, z10);
            } catch (ClassNotFoundException unused) {
                Logger.w(f50551a, "Load class failed.");
            }
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused2) {
            return super.loadClass(str, z10);
        }
    }
}
