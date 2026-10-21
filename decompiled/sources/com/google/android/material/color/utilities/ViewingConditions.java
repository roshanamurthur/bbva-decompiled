package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f44446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f44447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f44449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f44450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f44451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double[] f44452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f44453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f44454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f44455j;

    public ViewingConditions(double d2, double d3, double d7, double d10, double d11, double d12, double[] dArr, double d13, double d14, double d15) {
        this.f44451f = d2;
        this.f44446a = d3;
        this.f44447b = d7;
        this.f44448c = d10;
        this.f44449d = d11;
        this.f44450e = d12;
        this.f44452g = dArr;
        this.f44453h = d13;
        this.f44454i = d14;
        this.f44455j = d15;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d2) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d2, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d2, double d3, double d7, boolean z10) {
        double dMax = Math.max(0.1d, d3);
        double[][] dArr2 = Cam16.f44347k;
        double d10 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d11 = dArr3[0] * d10;
        double d12 = dArr[1];
        double d13 = (dArr3[1] * d12) + d11;
        double d14 = dArr[2];
        double d15 = (dArr3[2] * d14) + d13;
        double[] dArr4 = dArr2[1];
        double d16 = (dArr4[2] * d14) + (dArr4[1] * d12) + (dArr4[0] * d10);
        double[] dArr5 = dArr2[2];
        double d17 = (d14 * dArr5[2]) + (d12 * dArr5[1]) + (d10 * dArr5[0]);
        double d18 = (d7 / 10.0d) + 0.8d;
        double dLerp = d18 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d18 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d18 - 0.8d) * 10.0d);
        double dClampDouble = MathUtils.clampDouble(0.0d, 1.0d, z10 ? 1.0d : (1.0d - (Math.exp(((-d2) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d18);
        double[] dArr6 = {(((100.0d / d15) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d16) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d17) * dClampDouble) + 1.0d) - dClampDouble};
        double d19 = 5.0d * d2;
        double d20 = 1.0d / (d19 + 1.0d);
        double d21 = d20 * d20 * d20 * d20;
        double d22 = 1.0d - d21;
        double dCbrt = (Math.cbrt(d19) * 0.1d * d22 * d22) + (d21 * d2);
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double dPow2 = Math.pow(((dArr6[2] * dCbrt) * d17) / 100.0d, 0.42d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d15) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d16) / 100.0d, 0.42d), dPow2};
        double d23 = dArr7[0];
        double d24 = (d23 * 400.0d) / (d23 + 27.13d);
        double d25 = dArr7[1];
        return new ViewingConditions(dYFromLstar, ((((400.0d * dPow2) / (dPow2 + 27.13d)) * 0.05d) + (d24 * 2.0d) + ((d25 * 400.0d) / (d25 + 27.13d))) * dPow, dPow, dPow, dLerp, d18, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f44446a;
    }

    public double getFlRoot() {
        return this.f44454i;
    }

    public double getN() {
        return this.f44451f;
    }

    public double getNbb() {
        return this.f44447b;
    }

    public double[] getRgbD() {
        return this.f44452g;
    }
}
