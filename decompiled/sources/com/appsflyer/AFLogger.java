package com.appsflyer;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.internal.AFa1dSDK;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class AFLogger {
    private static final long AFInAppEventParameterName = System.currentTimeMillis();

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int values;

        LogLevel(int i10) {
            this.values = i10;
        }

        public final int getLevel() {
            return this.values;
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (!valueOf()) {
            AFKeystoreWrapper(str, false);
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("F", str);
    }

    public static void AFInAppEventType(String str) {
        if (AFKeystoreWrapper(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.12.1", AFKeystoreWrapper(str, false));
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(ExifInterface.LONGITUDE_WEST, AFKeystoreWrapper(str, true));
    }

    @NonNull
    private static String AFKeystoreWrapper(String str, boolean z10) {
        if (str == null) {
            str = AbstractJsonLexerKt.NULL;
        }
        if (!z10 && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(System.currentTimeMillis() - AFInAppEventParameterName);
        sb2.append(") [");
        sb2.append(Thread.currentThread().getName());
        sb2.append("] ");
        sb2.append(str);
        return sb2.toString();
    }

    public static void afDebugLog(String str) {
        if (AFKeystoreWrapper(LogLevel.DEBUG)) {
            AFKeystoreWrapper(str, false);
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType("D", AFKeystoreWrapper(str, true));
    }

    public static void afErrorLog(String str, Throwable th2, boolean z10, boolean z11, boolean z12) {
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th2.getClass().getSimpleName());
            sb2.append(" at ");
            sb2.append(th2.getStackTrace()[0].toString());
            str = sb2.toString();
        }
        if (AFKeystoreWrapper(LogLevel.ERROR)) {
            AFKeystoreWrapper(str, false);
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventParameterName(th2);
        if (z12) {
            AFa1dSDK.valueOf().AFInAppEventParameterName().onResponseErrorNative().values(th2, str);
        }
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th2) {
        afErrorLogForExcManagerOnly(str, th2, false);
    }

    public static void afInfoLog(String str, boolean z10) {
        if (AFKeystoreWrapper(LogLevel.INFO)) {
            AFKeystoreWrapper(str, false);
        }
        if (z10) {
            AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(TransactionType.TRANSACTION_TYPE_DRSP_CODE, AFKeystoreWrapper(str, true));
        }
    }

    public static void afRDLog(String str) {
        if (AFKeystoreWrapper(LogLevel.VERBOSE)) {
            AFKeystoreWrapper(str, false);
        }
        AFa1dSDK.valueOf().AFInAppEventParameterName().afErrorLogForExcManagerOnly().AFInAppEventType(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, AFKeystoreWrapper(str, true));
    }

    public static void afWarnLog(String str) {
        AFInAppEventType(str);
    }

    private static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afErrorLogForExcManagerOnly(String str, Throwable th2, boolean z10) {
        afErrorLog(str, th2, false, false, !z10);
    }

    private static boolean AFKeystoreWrapper(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void afErrorLog(String str, Throwable th2) {
        afErrorLog(str, th2, true, false, true);
    }

    public static void afErrorLog(String str, Throwable th2, boolean z10) {
        afErrorLog(str, th2, true, z10, true);
    }

    public static void afErrorLog(String str, Throwable th2, boolean z10, boolean z11) {
        afErrorLog(str, th2, true, z10, z11);
    }

    @Deprecated
    public static void afErrorLog(Throwable th2) {
        afErrorLogForExcManagerOnly("Unknown", th2);
    }
}
