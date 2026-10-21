package androidx.tracing;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import g3.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class Trace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f23530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f23531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f23532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f23533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f23534e;

    public static void a(@NonNull Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    @SuppressLint({"NewApi"})
    public static void beginAsyncSection(@NonNull String str, int i10) {
        try {
            if (f23532c == null) {
                a.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f23532c == null) {
                f23532c = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f23532c.invoke(null, Long.valueOf(f23530a), str, Integer.valueOf(i10));
        } catch (Exception e5) {
            a(e5);
        }
    }

    public static void beginSection(@NonNull String str) {
        android.os.Trace.beginSection(str);
    }

    @SuppressLint({"NewApi"})
    public static void endAsyncSection(@NonNull String str, int i10) {
        try {
            if (f23533d == null) {
                a.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f23533d == null) {
                f23533d = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f23533d.invoke(null, Long.valueOf(f23530a), str, Integer.valueOf(i10));
        } catch (Exception e5) {
            a(e5);
        }
    }

    public static void endSection() {
        android.os.Trace.endSection();
    }

    @SuppressLint({"NewApi"})
    public static boolean isEnabled() {
        try {
            if (f23531b == null) {
                return android.os.Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f23531b == null) {
                f23530a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f23531b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f23531b.invoke(null, Long.valueOf(f23530a))).booleanValue();
        } catch (Exception e5) {
            a(e5);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void setCounter(@NonNull String str, int i10) {
        try {
            if (f23534e == null) {
                a.c(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f23534e == null) {
                f23534e = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f23534e.invoke(null, Long.valueOf(f23530a), str, Integer.valueOf(i10));
        } catch (Exception e5) {
            a(e5);
        }
    }
}
