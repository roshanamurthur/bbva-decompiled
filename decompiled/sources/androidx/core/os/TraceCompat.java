package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class TraceCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f20007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f20008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f20009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f20010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f20011e;

    @RequiresApi(18)
    public static class a {
        @DoNotInline
        public static void a(String str) {
            Trace.beginSection(str);
        }

        @DoNotInline
        public static void b() {
            Trace.endSection();
        }
    }

    @RequiresApi(29)
    public static class b {
        @DoNotInline
        public static void a(String str, int i10) {
            Trace.beginAsyncSection(str, i10);
        }

        @DoNotInline
        public static void b(String str, int i10) {
            Trace.endAsyncSection(str, i10);
        }

        @DoNotInline
        public static boolean c() {
            return Trace.isEnabled();
        }

        @DoNotInline
        public static void d(String str, long j10) {
            Trace.setCounter(str, j10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f20007a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f20008b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f20009c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f20010d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f20011e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static void beginAsyncSection(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(str, i10);
        } else {
            try {
                f20009c.invoke(null, Long.valueOf(f20007a), str, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        }
    }

    public static void beginSection(@NonNull String str) {
        a.a(str);
    }

    public static void endAsyncSection(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(str, i10);
        } else {
            try {
                f20010d.invoke(null, Long.valueOf(f20007a), str, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        }
    }

    public static void endSection() {
        a.b();
    }

    public static boolean isEnabled() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            return ((Boolean) f20008b.invoke(null, Long.valueOf(f20007a))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setCounter(@NonNull String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.d(str, i10);
        } else {
            try {
                f20011e.invoke(null, Long.valueOf(f20007a), str, Integer.valueOf(i10));
            } catch (Exception unused) {
            }
        }
    }
}
