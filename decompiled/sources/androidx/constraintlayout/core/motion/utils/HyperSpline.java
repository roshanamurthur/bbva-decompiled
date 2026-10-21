package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class HyperSpline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cubic[][] f18837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double[] f18839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f18840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[][] f18841f;

    public static class Cubic {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f18842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f18843b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f18844c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f18845d;

        public Cubic(double d2, double d3, double d7, double d10) {
            this.f18842a = d2;
            this.f18843b = d3;
            this.f18844c = d7;
            this.f18845d = d10;
        }

        public double eval(double d2) {
            return (((((this.f18845d * d2) + this.f18844c) * d2) + this.f18843b) * d2) + this.f18842a;
        }

        public double vel(double d2) {
            return (((this.f18844c * 2.0d) + (this.f18845d * 3.0d * d2)) * d2) + this.f18843b;
        }
    }

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public double approxLength(Cubic[] cubicArr) {
        int i10;
        int length = cubicArr.length;
        double[] dArr = new double[length];
        double d2 = 0.0d;
        double d3 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            i10 = 0;
            if (d3 >= 1.0d) {
                break;
            }
            double d7 = 0.0d;
            while (i10 < length) {
                double d10 = dArr[i10];
                double dEval = cubicArr[i10].eval(d3);
                dArr[i10] = dEval;
                double d11 = d10 - dEval;
                d7 += d11 * d11;
                i10++;
            }
            if (d3 > 0.0d) {
                dSqrt += Math.sqrt(d7);
            }
            d3 += 0.1d;
        }
        while (i10 < length) {
            double d12 = dArr[i10];
            double dEval2 = cubicArr[i10].eval(1.0d);
            dArr[i10] = dEval2;
            double d13 = d12 - dEval2;
            d2 += d13 * d13;
            i10++;
        }
        return Math.sqrt(d2) + dSqrt;
    }

    public void getPos(double d2, double[] dArr) {
        double d3 = d2 * this.f18840e;
        int i10 = 0;
        while (true) {
            double[] dArr2 = this.f18839d;
            if (i10 >= dArr2.length - 1) {
                break;
            }
            double d7 = dArr2[i10];
            if (d7 >= d3) {
                break;
            }
            d3 -= d7;
            i10++;
        }
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr[i11] = this.f18837b[i11][i10].eval(d3 / this.f18839d[i10]);
        }
    }

    public void getVelocity(double d2, double[] dArr) {
        double d3 = d2 * this.f18840e;
        int i10 = 0;
        while (true) {
            double[] dArr2 = this.f18839d;
            if (i10 >= dArr2.length - 1) {
                break;
            }
            double d7 = dArr2[i10];
            if (d7 >= d3) {
                break;
            }
            d3 -= d7;
            i10++;
        }
        for (int i11 = 0; i11 < dArr.length; i11++) {
            dArr[i11] = this.f18837b[i11][i10].vel(d3 / this.f18839d[i10]);
        }
    }

    public void setup(double[][] dArr) {
        int i10;
        int i11 = 0;
        int length = dArr[0].length;
        this.f18838c = length;
        int length2 = dArr.length;
        this.f18836a = length2;
        this.f18841f = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.f18837b = new Cubic[this.f18838c][];
        for (int i12 = 0; i12 < this.f18838c; i12++) {
            for (int i13 = 0; i13 < this.f18836a; i13++) {
                this.f18841f[i12][i13] = dArr[i13][i12];
            }
        }
        int i14 = 0;
        while (true) {
            i10 = this.f18838c;
            int i15 = 1;
            if (i14 >= i10) {
                break;
            }
            Cubic[][] cubicArr = this.f18837b;
            double[] dArr2 = this.f18841f[i14];
            int length3 = dArr2.length;
            double[] dArr3 = new double[length3];
            double[] dArr4 = new double[length3];
            double[] dArr5 = new double[length3];
            int i16 = length3 - 1;
            dArr3[i11] = 0.5d;
            for (int i17 = 1; i17 < i16; i17++) {
                dArr3[i17] = 1.0d / (4.0d - dArr3[i17 - 1]);
            }
            int i18 = length3 - 2;
            dArr3[i16] = 1.0d / (2.0d - dArr3[i18]);
            dArr4[i11] = (dArr2[1] - dArr2[i11]) * 3.0d * dArr3[i11];
            while (i15 < i16) {
                int i19 = i15 + 1;
                int i20 = i15 - 1;
                dArr4[i15] = (((dArr2[i19] - dArr2[i20]) * 3.0d) - dArr4[i20]) * dArr3[i15];
                i15 = i19;
            }
            double d2 = (((dArr2[i16] - dArr2[i18]) * 3.0d) - dArr4[i18]) * dArr3[i16];
            dArr4[i16] = d2;
            dArr5[i16] = d2;
            while (i18 >= 0) {
                dArr5[i18] = dArr4[i18] - (dArr3[i18] * dArr5[i18 + 1]);
                i18--;
            }
            Cubic[] cubicArr2 = new Cubic[i16];
            int i21 = i11;
            while (i21 < i16) {
                double d3 = dArr2[i21];
                double d7 = dArr5[i21];
                int i22 = i21 + 1;
                double d10 = dArr2[i22];
                double d11 = dArr5[i22];
                cubicArr2[i21] = new Cubic((float) d3, d7, (((d10 - d3) * 3.0d) - (d7 * 2.0d)) - d11, ((d3 - d10) * 2.0d) + d7 + d11);
                cubicArr = cubicArr;
                i21 = i22;
            }
            cubicArr[i14] = cubicArr2;
            i14++;
            i11 = 0;
        }
        this.f18839d = new double[this.f18836a - 1];
        this.f18840e = 0.0d;
        Cubic[] cubicArr3 = new Cubic[i10];
        for (int i23 = 0; i23 < this.f18839d.length; i23++) {
            for (int i24 = 0; i24 < this.f18838c; i24++) {
                cubicArr3[i24] = this.f18837b[i24][i23];
            }
            double d12 = this.f18840e;
            double[] dArr6 = this.f18839d;
            double dApproxLength = approxLength(cubicArr3);
            dArr6[i23] = dApproxLength;
            this.f18840e = d12 + dApproxLength;
        }
    }

    public HyperSpline() {
    }

    public void getPos(double d2, float[] fArr) {
        double d3 = d2 * this.f18840e;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f18839d;
            if (i10 >= dArr.length - 1) {
                break;
            }
            double d7 = dArr[i10];
            if (d7 >= d3) {
                break;
            }
            d3 -= d7;
            i10++;
        }
        for (int i11 = 0; i11 < fArr.length; i11++) {
            fArr[i11] = (float) this.f18837b[i11][i10].eval(d3 / this.f18839d[i10]);
        }
    }

    public double getPos(double d2, int i10) {
        double[] dArr;
        double d3 = d2 * this.f18840e;
        int i11 = 0;
        while (true) {
            dArr = this.f18839d;
            if (i11 >= dArr.length - 1) {
                break;
            }
            double d7 = dArr[i11];
            if (d7 >= d3) {
                break;
            }
            d3 -= d7;
            i11++;
        }
        return this.f18837b[i10][i11].eval(d3 / dArr[i11]);
    }
}
