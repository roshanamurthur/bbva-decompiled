package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class MonotonicCurveFit extends CurveFit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[][] f18883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[][] f18884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18885d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double[] f18886e;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f18886e = new double[length2];
        int i10 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i10, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i11 = 0; i11 < length2; i11++) {
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i12 + 1;
                double d2 = dArr[i13] - dArr[i12];
                double[] dArr5 = dArr3[i12];
                double d3 = (dArr2[i13][i11] - dArr2[i12][i11]) / d2;
                dArr5[i11] = d3;
                if (i12 == 0) {
                    dArr4[i12][i11] = d3;
                } else {
                    dArr4[i12][i11] = (dArr3[i12 - 1][i11] + d3) * 0.5d;
                }
                i12 = i13;
            }
            dArr4[i10][i11] = dArr3[length - 2][i11];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < length2; i15++) {
                double d7 = dArr3[i14][i15];
                if (d7 == 0.0d) {
                    dArr4[i14][i15] = 0.0d;
                    dArr4[i14 + 1][i15] = 0.0d;
                } else {
                    double d10 = dArr4[i14][i15] / d7;
                    int i16 = i14 + 1;
                    double d11 = dArr4[i16][i15] / d7;
                    double dHypot = Math.hypot(d10, d11);
                    if (dHypot > 9.0d) {
                        double d12 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i14];
                        double[] dArr7 = dArr3[i14];
                        dArr6[i15] = d10 * d12 * dArr7[i15];
                        dArr4[i16][i15] = d12 * d11 * dArr7[i15];
                    }
                }
            }
        }
        this.f18882a = dArr;
        this.f18883b = dArr2;
        this.f18884c = dArr4;
    }

    public static double a(double d2, double d3, double d7, double d10, double d11, double d12) {
        double d13 = d3 * d3;
        double d14 = d3 * 6.0d;
        double d15 = 6.0d * d13 * d7;
        double d16 = 3.0d * d2;
        return (d2 * d11) + (((((d16 * d11) * d13) + (((d16 * d12) * d13) + ((d15 + ((d14 * d10) + (((-6.0d) * d13) * d10))) - (d14 * d7)))) - (((2.0d * d2) * d12) * d3)) - (((4.0d * d2) * d11) * d3));
    }

    public static double b(double d2, double d3, double d7, double d10, double d11, double d12) {
        double d13 = d3 * d3;
        double d14 = d13 * d3;
        double d15 = 3.0d * d13;
        double d16 = d14 * 2.0d * d7;
        double d17 = ((d16 + ((d15 * d10) + (((-2.0d) * d14) * d10))) - (d15 * d7)) + d7;
        double d18 = d2 * d12;
        double d19 = (d18 * d14) + d17;
        double d20 = d2 * d11;
        return (d20 * d3) + ((((d14 * d20) + d19) - (d18 * d13)) - (((2.0d * d2) * d11) * d13));
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i10 = 0;
        while (iIndexOf2 != -1) {
            dArr[i10] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i10++;
        }
        dArr[i10] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        double[] dArrCopyOf = Arrays.copyOf(dArr, i10 + 1);
        int length = (dArrCopyOf.length * 3) - 2;
        int length2 = dArrCopyOf.length - 1;
        double d2 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i11 = 0; i11 < dArrCopyOf.length; i11++) {
            double d3 = dArrCopyOf[i11];
            int i12 = i11 + length2;
            dArr2[i12][0] = d3;
            double d7 = ((double) i11) * d2;
            dArr3[i12] = d7;
            if (i11 > 0) {
                int i13 = (length2 * 2) + i11;
                dArr2[i13][0] = d3 + 1.0d;
                dArr3[i13] = d7 + 1.0d;
                int i14 = i11 - 1;
                dArr2[i14][0] = (d3 - 1.0d) - d2;
                dArr3[i14] = (d7 - 1.0d) - d2;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        double[] dArr2 = this.f18882a;
        int length = dArr2.length;
        double[][] dArr3 = this.f18883b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        if (this.f18885d) {
            double d3 = dArr2[0];
            double[] dArr4 = this.f18886e;
            if (d2 <= d3) {
                getSlope(d3, dArr4);
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = ((d2 - dArr2[0]) * dArr4[i11]) + dArr3[0][i11];
                }
                return;
            }
            int i12 = length - 1;
            double d7 = dArr2[i12];
            if (d2 >= d7) {
                getSlope(d7, dArr4);
                while (i10 < length2) {
                    dArr[i10] = ((d2 - dArr2[i12]) * dArr4[i10]) + dArr3[i12][i10];
                    i10++;
                }
                return;
            }
        } else {
            if (d2 <= dArr2[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = dArr3[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d2 >= dArr2[i14]) {
                while (i10 < length2) {
                    dArr[i10] = dArr3[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d2 == dArr2[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = dArr3[i15][i16];
                }
            }
            int i17 = i15 + 1;
            double d10 = dArr2[i17];
            if (d2 < d10) {
                double d11 = dArr2[i15];
                double d12 = d10 - d11;
                double d13 = (d2 - d11) / d12;
                while (i10 < length2) {
                    double d14 = dArr3[i15][i10];
                    double d15 = dArr3[i17][i10];
                    double[][] dArr5 = this.f18884c;
                    dArr[i10] = b(d12, d13, d14, d15, dArr5[i15][i10], dArr5[i17][i10]);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d2, double[] dArr) {
        double[] dArr2 = this.f18882a;
        int length = dArr2.length;
        double[][] dArr3 = this.f18883b;
        int length2 = dArr3[0].length;
        double d3 = dArr2[0];
        if (d2 > d3) {
            d3 = dArr2[length - 1];
            if (d2 < d3) {
                d3 = d2;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d7 = dArr2[i11];
            if (d3 <= d7) {
                double d10 = dArr2[i10];
                double d11 = d7 - d10;
                double d12 = (d3 - d10) / d11;
                for (int i12 = 0; i12 < length2; i12++) {
                    double d13 = dArr3[i10][i12];
                    double d14 = dArr3[i11][i12];
                    double[][] dArr4 = this.f18884c;
                    dArr[i12] = a(d11, d12, d13, d14, dArr4[i10][i12], dArr4[i11][i12]) / d11;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f18882a;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d2, int i10) {
        double[] dArr = this.f18882a;
        int length = dArr.length;
        int i11 = 0;
        double d3 = dArr[0];
        if (d2 >= d3) {
            d3 = dArr[length - 1];
            if (d2 < d3) {
                d3 = d2;
            }
        }
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d7 = dArr[i12];
            if (d3 <= d7) {
                double d10 = dArr[i11];
                double d11 = d7 - d10;
                double[][] dArr2 = this.f18883b;
                double d12 = dArr2[i11][i10];
                double d13 = dArr2[i12][i10];
                double[][] dArr3 = this.f18884c;
                return a(d11, (d3 - d10) / d11, d12, d13, dArr3[i11][i10], dArr3[i12][i10]) / d11;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        double[] dArr = this.f18882a;
        int length = dArr.length;
        double[][] dArr2 = this.f18883b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        if (this.f18885d) {
            double d3 = dArr[0];
            double[] dArr3 = this.f18886e;
            if (d2 <= d3) {
                getSlope(d3, dArr3);
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) (((d2 - dArr[0]) * dArr3[i11]) + dArr2[0][i11]);
                }
                return;
            }
            int i12 = length - 1;
            double d7 = dArr[i12];
            if (d2 >= d7) {
                getSlope(d7, dArr3);
                while (i10 < length2) {
                    fArr[i10] = (float) (((d2 - dArr[i12]) * dArr3[i10]) + dArr2[i12][i10]);
                    i10++;
                }
                return;
            }
        } else {
            if (d2 <= dArr[0]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) dArr2[0][i13];
                }
                return;
            }
            int i14 = length - 1;
            if (d2 >= dArr[i14]) {
                while (i10 < length2) {
                    fArr[i10] = (float) dArr2[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d2 == dArr[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) dArr2[i15][i16];
                }
            }
            int i17 = i15 + 1;
            double d10 = dArr[i17];
            if (d2 < d10) {
                double d11 = dArr[i15];
                double d12 = d10 - d11;
                double d13 = (d2 - d11) / d12;
                while (i10 < length2) {
                    double d14 = dArr2[i15][i10];
                    double d15 = dArr2[i17][i10];
                    double[][] dArr4 = this.f18884c;
                    fArr[i10] = (float) b(d12, d13, d14, d15, dArr4[i15][i10], dArr4[i17][i10]);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d2, int i10) {
        double[] dArr = this.f18882a;
        int length = dArr.length;
        boolean z10 = this.f18885d;
        int i11 = 0;
        double[][] dArr2 = this.f18883b;
        if (z10) {
            double d3 = dArr[0];
            if (d2 <= d3) {
                return (getSlope(d3, i10) * (d2 - d3)) + dArr2[0][i10];
            }
            int i12 = length - 1;
            double d7 = dArr[i12];
            if (d2 >= d7) {
                return (getSlope(d7, i10) * (d2 - d7)) + dArr2[i12][i10];
            }
        } else {
            if (d2 <= dArr[0]) {
                return dArr2[0][i10];
            }
            int i13 = length - 1;
            if (d2 >= dArr[i13]) {
                return dArr2[i13][i10];
            }
        }
        while (i11 < length - 1) {
            double d10 = dArr[i11];
            if (d2 == d10) {
                return dArr2[i11][i10];
            }
            int i14 = i11 + 1;
            double d11 = dArr[i14];
            if (d2 < d11) {
                double d12 = d11 - d10;
                double d13 = (d2 - d10) / d12;
                double d14 = dArr2[i11][i10];
                double d15 = dArr2[i14][i10];
                double[][] dArr3 = this.f18884c;
                return b(d12, d13, d14, d15, dArr3[i11][i10], dArr3[i14][i10]);
            }
            i11 = i14;
        }
        return 0.0d;
    }
}
