package com.huawei.hms.feature.utils;

import android.util.Log;
import java.util.IllegalFormatException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f50573a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50574b = "DF_Logger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f50575c = "DF_";

    public static class b extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final long f50576a = 7129050843360571879L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Throwable f50578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Throwable f50579d;

        private b(Throwable th2) {
            this.f50579d = th2;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable getCause() {
            Throwable th2;
            th2 = this.f50578c;
            if (th2 == this) {
                th2 = null;
            }
            return th2;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f50577b;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th2 = this.f50579d;
            if (th2 == null) {
                return "";
            }
            String name = th2.getClass().getName();
            if (this.f50577b == null) {
                return name;
            }
            String strConcat = name.concat(": ");
            if (this.f50577b.startsWith(strConcat)) {
                return this.f50577b;
            }
            StringBuilder sbD = androidx.camera.core.impl.utils.c.d(strConcat);
            sbD.append(this.f50577b);
            return sbD.toString();
        }

        public void a(String str) {
            this.f50577b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(Throwable th2) {
            this.f50578c = th2;
        }
    }

    private static String a(String str) {
        return androidx.camera.core.processing.f.d(f50575c, str);
    }

    public static void d(String str, Object obj) {
    }

    public static void e(String str, Object obj) {
        a(str);
        if (obj == null) {
            return;
        }
        obj.toString();
    }

    public static void i(String str, Object obj) {
        a(str);
        if (obj == null) {
            return;
        }
        obj.toString();
    }

    public static void v(String str, Object obj) {
    }

    public static void w(String str, Object obj) {
        Log.w(a(str), obj == null ? AbstractJsonLexerKt.NULL : obj.toString());
    }

    public static void d(String str, String str2, Object... objArr) {
    }

    public static void e(String str, String str2, Throwable th2) {
        a(str);
        a(th2);
    }

    public static void i(String str, String str2, Object... objArr) {
        if (str2 == null) {
            Log.w(f50574b, "format is null, not log");
            return;
        }
        try {
            i.a(str2, objArr);
            a(str);
        } catch (IllegalFormatException e5) {
            w(f50574b, "log format error".concat(str2), e5);
        }
    }

    public static void v(String str, String str2, Object... objArr) {
    }

    public static void w(String str, String str2, Throwable th2) {
        Log.w(a(str), str2, a(th2));
    }

    public static void e(String str, String str2, Object... objArr) {
        if (str2 == null) {
            Log.w(f50574b, "format is null, not log");
            return;
        }
        try {
            i.a(str2, objArr);
            a(str);
        } catch (IllegalFormatException e5) {
            w(f50574b, "log format error".concat(str2), e5);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (str2 == null) {
            Log.w(f50574b, "format is null, not log");
            return;
        }
        try {
            Log.w(a(str), i.a(str2, objArr));
        } catch (IllegalFormatException e5) {
            w(f50574b, "log format error".concat(str2), e5);
        }
    }

    private static Throwable a(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        b bVar = new b(th2);
        bVar.setStackTrace(th2.getStackTrace());
        bVar.a(i.a(th2.getMessage()));
        Throwable cause = th2.getCause();
        b bVar2 = bVar;
        while (cause != null) {
            b bVar3 = new b(cause);
            bVar3.setStackTrace(cause.getStackTrace());
            bVar3.a(i.a(cause.getMessage()));
            bVar2.a(bVar3);
            cause = cause.getCause();
            bVar2 = bVar3;
        }
        return bVar;
    }
}
