package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MathUtils {
    public static double clampDouble(double d2, double d3, double d7) {
        if (d7 < d2) {
            return d2;
        }
        return d7 > d3 ? d3 : d7;
    }

    public static int clampInt(int i10, int i11, int i12) {
        if (i12 < i10) {
            return i10;
        }
        return i12 > i11 ? i11 : i12;
    }

    public static double differenceDegrees(double d2, double d3) {
        return 180.0d - Math.abs(Math.abs(d2 - d3) - 180.0d);
    }

    public static double lerp(double d2, double d3, double d7) {
        return (d7 * d3) + ((1.0d - d7) * d2);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d7 = dArr[1];
        double d10 = (dArr3[1] * d7) + d3;
        double d11 = dArr[2];
        double d12 = (dArr3[2] * d11) + d10;
        double[] dArr4 = dArr2[1];
        double d13 = (dArr4[2] * d11) + (dArr4[1] * d7) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        return new double[]{d12, d13, (d11 * dArr5[2]) + (d7 * dArr5[1]) + (d2 * dArr5[0])};
    }

    public static double rotationDirection(double d2, double d3) {
        return sanitizeDegreesDouble(d3 - d2) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double sanitizeDegreesDouble(double d2) {
        double d3 = d2 % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    public static int sanitizeDegreesInt(int i10) {
        int i11 = i10 % 360;
        return i11 < 0 ? i11 + 360 : i11;
    }

    public static int signum(double d2) {
        if (d2 < 0.0d) {
            return -1;
        }
        return d2 == 0.0d ? 0 : 1;
    }
}
