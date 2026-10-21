package androidx.camera.core;

import android.os.Build;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.mastercard.sonic.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Logger {
    static final int DEFAULT_MIN_LOG_LEVEL = 3;
    private static final int MAX_TAG_LENGTH = 23;
    private static int sMinLogLevel = 3;

    private Logger() {
    }

    public static void d(@NonNull String str, @NonNull String str2) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        isLogLevelEnabled(truncateTag(str), 6);
    }

    public static int getMinLogLevel() {
        return sMinLogLevel;
    }

    public static void i(@NonNull String str, @NonNull String str2) {
        isLogLevelEnabled(truncateTag(str), 4);
    }

    public static boolean isDebugEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    private static boolean isLogLevelEnabled(@NonNull String str, int i10) {
        return sMinLogLevel <= i10 || Log.isLoggable(str, i10);
    }

    public static boolean isWarnEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(@IntRange(from = BuildConfig.VERSION_CODE, to = 6) int i10) {
        sMinLogLevel = i10;
    }

    @NonNull
    private static String truncateTag(@NonNull String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    public static void w(@NonNull String str, @NonNull String str2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2);
        }
    }

    public static void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        isLogLevelEnabled(truncateTag(str), 3);
    }

    public static void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        isLogLevelEnabled(truncateTag(str), 6);
    }

    public static void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        isLogLevelEnabled(truncateTag(str), 4);
    }

    public static void w(@NonNull String str, @NonNull String str2, @NonNull Throwable th2) {
        String strTruncateTag = truncateTag(str);
        if (isLogLevelEnabled(strTruncateTag, 5)) {
            Log.w(strTruncateTag, str2, th2);
        }
    }
}
