package mk;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
public class c extends b {
    @SinceKotlin(version = "1.2")
    public static final double acosh(double d2) {
        if (d2 < 1.0d) {
            return Double.NaN;
        }
        if (d2 > a.f83490e) {
            return Math.log(d2) + a.f83487b;
        }
        double d3 = 1;
        double d7 = d2 - d3;
        if (d7 >= a.f83489d) {
            return Math.log(Math.sqrt((d2 * d2) - d3) + d2);
        }
        double dSqrt = Math.sqrt(d7);
        if (dSqrt >= a.f83488c) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return dSqrt * Math.sqrt(2.0d);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d2) {
        double d3 = a.f83489d;
        if (d2 < d3) {
            if (d2 <= (-d3)) {
                return -asinh(-d2);
            }
            return Math.abs(d2) >= a.f83488c ? d2 - (((d2 * d2) * d2) / ((double) 6)) : d2;
        }
        if (d2 <= a.f83491f) {
            return Math.log(Math.sqrt((d2 * d2) + ((double) 1)) + d2);
        }
        if (d2 > a.f83490e) {
            return Math.log(d2) + a.f83487b;
        }
        double d7 = d2 * ((double) 2);
        return Math.log((((double) 1) / d7) + d7);
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d2) {
        if (Math.abs(d2) < a.f83489d) {
            return Math.abs(d2) > a.f83488c ? d2 + (((d2 * d2) * d2) / ((double) 3)) : d2;
        }
        double d3 = 1;
        return Math.log((d3 + d2) / (d3 - d2)) / ((double) 2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d2) {
    }

    public static int getSign(int i10) {
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d2) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d2) {
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d2, double d3) {
        if (d3 <= 0.0d || d3 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d2) / Math.log(d3);
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d2) {
        return Math.log(d2) / a.f83487b;
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return d2;
        }
        return d2 > 0.0d ? Math.floor(d2) : Math.ceil(d2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f6) {
    }

    public static int getSign(long j10) {
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f6) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f6) {
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f6, float f10) {
        if (f10 <= 0.0f || f10 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f6) / Math.log(f10));
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f6) {
        return (float) (Math.log(f6) / a.f83487b);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(float f6) {
        return roundToLong(f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i10) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i10) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j10) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j10) {
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f6) {
        double dCeil;
        if (Float.isNaN(f6) || Float.isInfinite(f6)) {
            return f6;
        }
        if (f6 > 0.0f) {
            dCeil = Math.floor(f6);
        } else {
            dCeil = Math.ceil(f6);
        }
        return (float) dCeil;
    }
}
