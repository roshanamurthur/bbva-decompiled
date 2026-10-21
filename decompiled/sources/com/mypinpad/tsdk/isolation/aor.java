package com.mypinpad.tsdk.isolation;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes10.dex */
public final class aor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53432a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53433b = 1;

    public static class a implements PrivilegedAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ String f53434a;

        @Override // java.security.PrivilegedAction
        public final Object run() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            try {
                return Class.forName(((a) objArr[0]).f53434a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Class setDividerPadding(Class cls, String str) {
        return (Class) setOnFocusChangeListener(new Object[]{cls, str}, 1745662709, -1745662709, (int) System.currentTimeMillis());
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Class<?> clsLoadClass;
        Class cls = (Class) objArr[0];
        String str = (String) objArr[1];
        int i13 = f53432a;
        int i14 = (i13 ^ 66) + ((i13 & 66) << 1);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f53433b = i15 % 128;
        try {
            if (i15 % 2 == 0) {
                cls.getClassLoader();
                throw null;
            }
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                int i16 = f53433b;
                int i17 = i16 & 95;
                int i18 = i17 + ((i16 ^ 95) | i17);
                f53432a = i18 % 128;
                if (i18 % 2 != 0) {
                    classLoader.loadClass(str);
                    throw null;
                }
                clsLoadClass = classLoader.loadClass(str);
                int i19 = f53432a;
                int i20 = (i19 ^ 113) + ((i19 & 113) << 1);
                f53433b = i20 % 128;
                if (i20 % 2 == 0) {
                    throw null;
                }
            } else {
                a aVar = new a();
                aVar.f53434a = str;
                clsLoadClass = (Class) AccessController.doPrivileged(aVar);
                int i21 = f53432a;
                int i22 = (((i21 ^ 81) | (i21 & 81)) << 1) - (((~i21) & 81) | (i21 & (-82)));
                f53433b = i22 % 128;
                int i23 = i22 % 2;
            }
            return clsLoadClass;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
