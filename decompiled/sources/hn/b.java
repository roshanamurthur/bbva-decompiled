package hn;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import org.junit.internal.Classes;
import org.junit.internal.management.RuntimeMXBean;

/* JADX INFO: compiled from: ReflectiveRuntimeMXBean.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements RuntimeMXBean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f69471a;

    /* JADX INFO: compiled from: ReflectiveRuntimeMXBean.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f69472a;

        static {
            Method method;
            try {
                method = Classes.getClass("java.lang.management.RuntimeMXBean").getMethod("getInputArguments", new Class[0]);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
                method = null;
            }
            f69472a = method;
        }
    }

    public b(Object obj) {
        this.f69471a = obj;
    }

    @Override // org.junit.internal.management.RuntimeMXBean
    public final List<String> getInputArguments() {
        Method method = a.f69472a;
        if (method != null) {
            try {
                return (List) method.invoke(this.f69471a, new Object[0]);
            } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        return Collections.emptyList();
    }
}
