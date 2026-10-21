package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Contrast {
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    public static double darker(double d2, double d3) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d2);
            double d7 = ((dYFromLstar + 5.0d) / d3) - 5.0d;
            if (d7 >= 0.0d && d7 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(dYFromLstar, d7);
                double dAbs = Math.abs(dRatioOfYs - d3);
                if (dRatioOfYs < d3 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d7) - 0.4d;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double darkerUnsafe(double d2, double d3) {
        return Math.max(0.0d, darker(d2, d3));
    }

    public static double lighter(double d2, double d3) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d2);
            double d7 = ((dYFromLstar + 5.0d) * d3) - 5.0d;
            if (d7 >= 0.0d && d7 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(d7, dYFromLstar);
                double dAbs = Math.abs(dRatioOfYs - d3);
                if (dRatioOfYs < d3 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d7) + 0.4d;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighterUnsafe(double d2, double d3) {
        double dLighter = lighter(d2, d3);
        if (dLighter < 0.0d) {
            return 100.0d;
        }
        return dLighter;
    }

    public static double ratioOfTones(double d2, double d3) {
        return ratioOfYs(ColorUtils.yFromLstar(d2), ColorUtils.yFromLstar(d3));
    }

    public static double ratioOfYs(double d2, double d3) {
        double dMax = Math.max(d2, d3);
        if (dMax != d3) {
            d2 = d3;
        }
        return (dMax + 5.0d) / (d2 + 5.0d);
    }
}
