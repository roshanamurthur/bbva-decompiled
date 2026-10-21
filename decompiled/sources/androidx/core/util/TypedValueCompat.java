package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.g0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        public static float deriveDimension(int i10, float f6, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i10, f6, displayMetrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i10, float f6, @NonNull DisplayMetrics displayMetrics) {
        float f10;
        float f11;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i10, f6, displayMetrics);
        }
        if (i10 == 0) {
            return f6;
        }
        if (i10 == 1) {
            float f12 = displayMetrics.density;
            if (f12 == 0.0f) {
                return 0.0f;
            }
            return f6 / f12;
        }
        if (i10 == 2) {
            float f13 = displayMetrics.scaledDensity;
            if (f13 == 0.0f) {
                return 0.0f;
            }
            return f6 / f13;
        }
        if (i10 == 3) {
            float f14 = displayMetrics.xdpi;
            if (f14 == 0.0f) {
                return 0.0f;
            }
            f10 = f6 / f14;
            f11 = INCHES_PER_PT;
        } else {
            if (i10 == 4) {
                float f15 = displayMetrics.xdpi;
                if (f15 == 0.0f) {
                    return 0.0f;
                }
                return f6 / f15;
            }
            if (i10 != 5) {
                throw new IllegalArgumentException(g0.c("Invalid unitToConvertTo ", i10));
            }
            float f16 = displayMetrics.xdpi;
            if (f16 == 0.0f) {
                return 0.0f;
            }
            f10 = f6 / f16;
            f11 = INCHES_PER_MM;
        }
        return f10 / f11;
    }

    public static float dpToPx(float f6, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f6, displayMetrics);
    }

    @SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int i10) {
        return i10 & 15;
    }

    public static float pxToDp(float f6, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(1, f6, displayMetrics);
    }

    public static float pxToSp(float f6, @NonNull DisplayMetrics displayMetrics) {
        return deriveDimension(2, f6, displayMetrics);
    }

    public static float spToPx(float f6, @NonNull DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f6, displayMetrics);
    }
}
