package hn;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.internal.Classes;
import org.junit.internal.management.ThreadMXBean;

/* JADX INFO: compiled from: ReflectiveThreadMXBean.java */
/* JADX INFO: loaded from: classes13.dex */
public final class c implements ThreadMXBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f69473a;

    /* JADX INFO: compiled from: ReflectiveThreadMXBean.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f69474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f69475b;

        static {
            Method method;
            Method method2 = null;
            try {
                Class<?> cls = Classes.getClass("java.lang.management.ThreadMXBean");
                method = cls.getMethod("getThreadCpuTime", Long.TYPE);
                try {
                    method2 = cls.getMethod("isThreadCpuTimeSupported", new Class[0]);
                } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                }
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused2) {
                method = null;
            }
            f69474a = method;
            f69475b = method2;
        }
    }

    public c(Object obj) {
        this.f69473a = obj;
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public final long getThreadCpuTime(long j10) {
        Method method = a.f69474a;
        if (method == null) {
            throw new UnsupportedOperationException("Unable to access ThreadMXBean");
        }
        try {
            return ((Long) method.invoke(this.f69473a, Long.valueOf(j10))).longValue();
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            throw new UnsupportedOperationException("Unable to access ThreadMXBean", e5);
        }
    }

    @Override // org.junit.internal.management.ThreadMXBean
    public final boolean isThreadCpuTimeSupported() {
        Method method = a.f69475b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(this.f69473a, new Object[0])).booleanValue();
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return false;
    }
}
