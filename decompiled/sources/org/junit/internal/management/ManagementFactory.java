package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;
import org.junit.internal.Classes;
import te.d;

/* JADX INFO: loaded from: classes13.dex */
public class ManagementFactory {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Class<?> f91855a;

        static {
            Class<?> cls;
            try {
                cls = Classes.getClass("java.lang.management.ManagementFactory");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            f91855a = cls;
        }

        public static Object a(String str) {
            Class<?> cls = f91855a;
            if (cls != null) {
                try {
                    return cls.getMethod(str, new Class[0]).invoke(null, new Object[0]);
                } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RuntimeMXBean f91856a;

        static {
            Object objA = a.a("getRuntimeMXBean");
            f91856a = objA != null ? new hn.b(objA) : new d();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThreadMXBean f91857a;

        static {
            Object objA = a.a("getThreadMXBean");
            f91857a = objA != null ? new hn.c(objA) : new hn.a();
        }
    }

    public static RuntimeMXBean getRuntimeMXBean() {
        return b.f91856a;
    }

    public static ThreadMXBean getThreadMXBean() {
        return c.f91857a;
    }
}
