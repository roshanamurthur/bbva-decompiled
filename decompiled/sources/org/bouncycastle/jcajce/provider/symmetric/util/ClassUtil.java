package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes8.dex */
public class ClassUtil {

    public static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f90233a;

        public a(String str) {
            this.f90233a = str;
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            try {
                return Class.forName(this.f90233a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class loadClass(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new a(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
