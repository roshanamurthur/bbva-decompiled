package com.noknok.android.client.utils;

import android.util.Log;
import com.google.android.gms.wearable.WearableStatusCodes;

/* JADX INFO: loaded from: classes11.dex */
public final class Logger {
    public static final String TAG_CONFIG_REPORTER = "ConfigReporter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ILogger f63456a = new SystemLogger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f63457b = true;

    public interface ILogger {
        void println(int i10, String str, String str2);

        void println(int i10, String str, String str2, Throwable th2);
    }

    private static void a(int i10, String str, String str2) {
        ILogger iLogger;
        if (!f63457b || (iLogger = f63456a) == null) {
            return;
        }
        iLogger.println(i10, str, str2);
    }

    public static void d(String str, String str2) {
        a(3, str, str2);
    }

    public static void e(String str, String str2) {
        a(6, str, str2);
    }

    public static void i(String str, String str2) {
        a(4, str, str2);
    }

    public static boolean setLogEnabled(boolean z10) {
        boolean z11 = f63457b;
        f63457b = z10;
        return z11;
    }

    public static ILogger setLogger(ILogger iLogger) {
        ILogger iLogger2 = f63456a;
        f63456a = iLogger;
        return iLogger2;
    }

    public static void v(String str, String str2) {
        a(2, str, str2);
    }

    public static void w(String str, String str2) {
        a(5, str, str2);
    }

    public static void d(String str, String str2, Throwable th2) {
        a(3, str, str2, th2);
    }

    public static void e(String str, String str2, Throwable th2) {
        a(6, str, str2, th2);
    }

    public static void i(String str, String str2, Throwable th2) {
        a(4, str, str2, th2);
    }

    public static void v(String str, String str2, Throwable th2) {
        a(2, str, str2, th2);
    }

    public static void w(String str, String str2, Throwable th2) {
        a(5, str, str2, th2);
    }

    private static void a(int i10, String str, String str2, Throwable th2) {
        ILogger iLogger;
        if (!f63457b || (iLogger = f63456a) == null) {
            return;
        }
        iLogger.println(i10, str, str2, th2);
    }

    public static class SystemLogger implements ILogger {
        private SystemLogger() {
        }

        public /* synthetic */ SystemLogger(int i10) {
            this();
        }

        @Override // com.noknok.android.client.utils.Logger.ILogger
        public void println(int i10, String str, String str2) {
            int length = str2.length();
            if (length <= 4000) {
                Log.println(i10, str, str2);
                return;
            }
            int i11 = 0;
            while (true) {
                int iMin = Math.min(length, WearableStatusCodes.TARGET_NODE_NOT_CONNECTED);
                length -= iMin;
                int i12 = iMin + i11;
                Log.println(i10, str, str2.substring(i11, i12));
                if (length <= 0) {
                    return;
                } else {
                    i11 = i12;
                }
            }
        }

        @Override // com.noknok.android.client.utils.Logger.ILogger
        public void println(int i10, String str, String str2, Throwable th2) {
            if (i10 == 6) {
                return;
            }
            println(i10, str, str2 + ": " + th2);
        }
    }
}
