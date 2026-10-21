package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Cam16 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final double[][] f44347k = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final double[][] f44348l = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f44349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f44350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f44352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f44353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f44354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f44355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f44356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f44357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double[] f44358j = {0.0d, 0.0d, 0.0d};

    public Cam16(double d2, double d3, double d7, double d10, double d11, double d12, double d13, double d14, double d15) {
        this.f44349a = d2;
        this.f44350b = d3;
        this.f44351c = d7;
        this.f44352d = d10;
        this.f44353e = d11;
        this.f44354f = d12;
        this.f44355g = d13;
        this.f44356h = d14;
        this.f44357i = d15;
    }

    public static Cam16 a(double d2, double d3, double d7, ViewingConditions viewingConditions) {
        double[][] dArr = f44347k;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d7) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d7) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        double d12 = (dArr4[2] * d7) + (dArr4[1] * d3) + (dArr4[0] * d2);
        double d13 = viewingConditions.getRgbD()[0] * d10;
        double d14 = viewingConditions.getRgbD()[1] * d11;
        double d15 = viewingConditions.getRgbD()[2] * d12;
        double dAbs = Math.abs(d13);
        double d16 = viewingConditions.f44453h;
        double dPow = Math.pow((dAbs * d16) / 100.0d, 0.42d);
        double dPow2 = Math.pow((Math.abs(d14) * d16) / 100.0d, 0.42d);
        double dPow3 = Math.pow((Math.abs(d15) * d16) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d17 = ((((-12.0d) * dSignum2) + (dSignum * 11.0d)) + dSignum3) / 11.0d;
        double d18 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d19 = dSignum2 * 20.0d;
        double d20 = ((21.0d * dSignum3) + ((dSignum * 20.0d) + d19)) / 20.0d;
        double d21 = (((dSignum * 40.0d) + d19) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d18, d17));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d22 = degrees;
        double radians = Math.toRadians(d22);
        double nbb = (viewingConditions.getNbb() * d21) / viewingConditions.getAw();
        double d23 = viewingConditions.f44449d;
        double dPow4 = Math.pow(nbb, viewingConditions.f44455j * d23) * 100.0d;
        double d24 = dPow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d24) * (4.0d / d23);
        double dPow5 = Math.pow((Math.hypot(d17, d18) * (((((Math.cos(Math.toRadians(d22 < 20.14d ? d22 + 360.0d : d22) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.f44450e) * viewingConditions.f44448c)) / (d20 + 0.305d), 0.9d) * Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d);
        double dSqrt = Math.sqrt(d24) * dPow5;
        double flRoot2 = viewingConditions.getFlRoot() * dSqrt;
        double dSqrt2 = Math.sqrt((dPow5 * d23) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d25 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d22, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d25, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public static Cam16 fromInt(int i10) {
        ViewingConditions viewingConditions = ViewingConditions.DEFAULT;
        double dLinearized = ColorUtils.linearized((16711680 & i10) >> 16);
        double dLinearized2 = ColorUtils.linearized((65280 & i10) >> 8);
        double dLinearized3 = ColorUtils.linearized(i10 & 255);
        return a((0.18051042d * dLinearized3) + (0.35762064d * dLinearized2) + (0.41233895d * dLinearized), (0.0722d * dLinearized3) + (0.7152d * dLinearized2) + (0.2126d * dLinearized), (dLinearized3 * 0.95034478d) + (dLinearized2 * 0.11916382d) + (dLinearized * 0.01932141d), viewingConditions);
    }

    public static Cam16 fromUcs(double d2, double d3, double d7) {
        return fromUcsInViewingConditions(d2, d3, d7, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcsInViewingConditions(double d2, double d3, double d7, ViewingConditions viewingConditions) {
        double dExpm1 = (Math.expm1(Math.hypot(d3, d7) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double dAtan2 = Math.atan2(d7, d3) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        double d10 = dAtan2;
        double d11 = d2 / (1.0d - ((d2 - 100.0d) * 0.007d));
        double d12 = viewingConditions.f44449d;
        double d13 = d11 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0d) * Math.sqrt(d13) * (4.0d / d12);
        double flRoot2 = viewingConditions.getFlRoot() * dExpm1;
        double dSqrt = Math.sqrt(((dExpm1 / Math.sqrt(d13)) * d12) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d10);
        double d14 = (1.7000000000000002d * d11) / ((0.007d * d11) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d10, dExpm1, d11, flRoot, flRoot2, dSqrt, d14, Math.cos(radians) * dLog1p, Math.sin(radians) * dLog1p);
    }

    public final double[] b(ViewingConditions viewingConditions, double[] dArr) {
        double dPow = Math.pow(((getChroma() == 0.0d || getJ() == 0.0d) ? 0.0d : getChroma() / Math.sqrt(getJ() / 100.0d)) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double dPow2 = Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.f44449d) / viewingConditions.f44455j) * viewingConditions.getAw();
        double d2 = dCos * 3846.153846153846d * viewingConditions.f44450e * viewingConditions.f44448c;
        double nbb = dPow2 / viewingConditions.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d3 = (((0.305d + nbb) * 23.0d) * dPow) / (((dPow * 108.0d) * dSin) + (((11.0d * dPow) * dCos2) + (d2 * 23.0d)));
        double d7 = dCos2 * d3;
        double d10 = d3 * dSin;
        double d11 = nbb * 460.0d;
        double d12 = ((288.0d * d10) + ((451.0d * d7) + d11)) / 1403.0d;
        double d13 = ((d11 - (891.0d * d7)) - (261.0d * d10)) / 1403.0d;
        double d14 = ((d11 - (d7 * 220.0d)) - (d10 * 6300.0d)) / 1403.0d;
        double dMax = Math.max(0.0d, (Math.abs(d12) * 27.13d) / (400.0d - Math.abs(d12)));
        double dSignum = Math.signum(d12);
        double d15 = viewingConditions.f44453h;
        double dPow3 = Math.pow(dMax, 2.380952380952381d) * (100.0d / d15) * dSignum;
        double dPow4 = Math.pow(Math.max(0.0d, (Math.abs(d13) * 27.13d) / (400.0d - Math.abs(d13))), 2.380952380952381d) * (100.0d / d15) * Math.signum(d13);
        double dPow5 = Math.pow(Math.max(0.0d, (Math.abs(d14) * 27.13d) / (400.0d - Math.abs(d14))), 2.380952380952381d) * (100.0d / d15) * Math.signum(d14);
        double d16 = dPow3 / viewingConditions.getRgbD()[0];
        double d17 = dPow4 / viewingConditions.getRgbD()[1];
        double d18 = dPow5 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = f44348l;
        double[] dArr3 = dArr2[0];
        double d19 = (dArr3[2] * d18) + (dArr3[1] * d17) + (dArr3[0] * d16);
        double[] dArr4 = dArr2[1];
        double d20 = (dArr4[2] * d18) + (dArr4[1] * d17) + (dArr4[0] * d16);
        double[] dArr5 = dArr2[2];
        double d21 = (d18 * dArr5[2]) + (d17 * dArr5[1]) + (d16 * dArr5[0]);
        if (dArr == null) {
            return new double[]{d19, d20, d21};
        }
        dArr[0] = d19;
        dArr[1] = d20;
        dArr[2] = d21;
        return dArr;
    }

    public double getAstar() {
        return this.f44356h;
    }

    public double getBstar() {
        return this.f44357i;
    }

    public double getChroma() {
        return this.f44350b;
    }

    public double getHue() {
        return this.f44349a;
    }

    public double getJ() {
        return this.f44351c;
    }

    public double getJstar() {
        return this.f44355g;
    }

    public double getM() {
        return this.f44353e;
    }

    public double getQ() {
        return this.f44352d;
    }

    public double getS() {
        return this.f44354f;
    }

    public int toInt() {
        double[] dArrB = b(ViewingConditions.DEFAULT, this.f44358j);
        return ColorUtils.argbFromXyz(dArrB[0], dArrB[1], dArrB[2]);
    }
}
