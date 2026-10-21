package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.u;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f6, @NonNull String str) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException(u.f(str, " must not be NaN"));
        }
        if (Float.isInfinite(f6)) {
            throw new IllegalArgumentException(u.f(str, " must not be infinite"));
        }
        return f6;
    }

    public static int checkArgumentInRange(int i10, int i11, int i12, @NonNull String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i10, @Nullable String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t10) {
        t10.getClass();
        return t10;
    }

    public static void checkState(boolean z10, @Nullable String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t10) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException();
        }
        return t10;
    }

    public static void checkArgument(boolean z10, @NonNull Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @IntRange(from = 0)
    public static int checkArgumentNonnegative(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    @NonNull
    public static <T> T checkNotNull(@Nullable T t10, @NonNull Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z10) {
        checkState(z10, null);
    }

    public static void checkArgument(boolean z10, @NonNull String str, @NonNull Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t10, @NonNull Object obj) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t10;
    }

    @NonNull
    public static <T extends CharSequence> T checkStringNotEmpty(@Nullable T t10, @NonNull String str, @NonNull Object... objArr) {
        if (TextUtils.isEmpty(t10)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t10;
    }

    public static long checkArgumentInRange(long j10, long j11, long j12, @NonNull String str) {
        if (j10 < j11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
        if (j10 <= j12) {
            return j10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j11), Long.valueOf(j12)));
    }

    public static float checkArgumentInRange(float f6, float f10, float f11, @NonNull String str) {
        if (f6 < f10) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f10), Float.valueOf(f11)));
        }
        if (f6 <= f11) {
            return f6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f10), Float.valueOf(f11)));
    }

    public static double checkArgumentInRange(double d2, double d3, double d7, @NonNull String str) {
        if (d2 < d3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d3), Double.valueOf(d7)));
        }
        if (d2 <= d7) {
            return d2;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d3), Double.valueOf(d7)));
    }
}
