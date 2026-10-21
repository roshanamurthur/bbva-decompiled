package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: classes.dex */
public class LinearCurveFit extends CurveFit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[][] f18879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18880c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f18881d;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr2[0].length;
        this.f18881d = new double[length];
        this.f18878a = dArr;
        this.f18879b = dArr2;
        if (length <= 2) {
            return;
        }
        double d2 = 0.0d;
        int i10 = 0;
        while (true) {
            double d3 = d2;
            if (i10 >= dArr.length) {
                return;
            }
            double d7 = dArr2[i10][0];
            if (i10 > 0) {
                Math.hypot(d7 - d2, d7 - d3);
            }
            i10++;
            d2 = d7;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        double[] dArr2 = this.f18878a;
        int length = dArr2.length;
        double[][] dArr3 = this.f18879b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        if (this.f18880c) {
            double d3 = dArr2[0];
            double[] dArr4 = this.f18881d;
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
                double d12 = (d2 - d11) / (d10 - d11);
                while (i10 < length2) {
                    dArr[i10] = (dArr3[i17][i10] * d12) + ((1.0d - d12) * dArr3[i15][i10]);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d2, double[] dArr) {
        double[] dArr2 = this.f18878a;
        int length = dArr2.length;
        double[][] dArr3 = this.f18879b;
        int length2 = dArr3[0].length;
        double d3 = dArr2[0];
        if (d2 <= d3) {
            d2 = d3;
        } else {
            d3 = dArr2[length - 1];
            if (d2 >= d3) {
                d2 = d3;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d7 = dArr2[i11];
            if (d2 <= d7) {
                double d10 = d7 - dArr2[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = (dArr3[i11][i12] - dArr3[i10][i12]) / d10;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.f18878a;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v5 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d2, int i10) {
        double[] dArr = this.f18878a;
        int length = dArr.length;
        int i11 = 0;
        double d3 = dArr[0];
        if (d2 < d3) {
            d2 = d3;
        } else {
            d3 = dArr[length - 1];
            if (d2 >= d3) {
                d2 = d3;
            }
        }
        while (i11 < length - 1) {
            int i12 = i11 + 1;
            double d7 = dArr[i12];
            if (d2 <= d7) {
                double d10 = d7 - dArr[i11];
                double[][] dArr2 = this.f18879b;
                return (dArr2[i12][i10] - dArr2[i11][i10]) / d10;
            }
            i11 = i12;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        double[] dArr = this.f18878a;
        int length = dArr.length;
        double[][] dArr2 = this.f18879b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        if (this.f18880c) {
            double d3 = dArr[0];
            double[] dArr3 = this.f18881d;
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
                double d12 = (d2 - d11) / (d10 - d11);
                while (i10 < length2) {
                    fArr[i10] = (float) ((dArr2[i17][i10] * d12) + ((1.0d - d12) * dArr2[i15][i10]));
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d2, int i10) {
        double d3;
        double d7;
        double slope;
        double[] dArr = this.f18878a;
        int length = dArr.length;
        boolean z10 = this.f18880c;
        int i11 = 0;
        double[][] dArr2 = this.f18879b;
        if (z10) {
            double d10 = dArr[0];
            if (d2 <= d10) {
                d3 = dArr2[0][i10];
                d7 = d2 - d10;
                slope = getSlope(d10, i10);
            } else {
                int i12 = length - 1;
                double d11 = dArr[i12];
                if (d2 >= d11) {
                    d3 = dArr2[i12][i10];
                    d7 = d2 - d11;
                    slope = getSlope(d11, i10);
                }
            }
            return (slope * d7) + d3;
        }
        if (d2 <= dArr[0]) {
            return dArr2[0][i10];
        }
        int i13 = length - 1;
        if (d2 >= dArr[i13]) {
            return dArr2[i13][i10];
        }
        while (i11 < length - 1) {
            double d12 = dArr[i11];
            if (d2 == d12) {
                return dArr2[i11][i10];
            }
            int i14 = i11 + 1;
            double d13 = dArr[i14];
            if (d2 < d13) {
                double d14 = (d2 - d12) / (d13 - d12);
                return (dArr2[i14][i10] * d14) + ((1.0d - d14) * dArr2[i11][i10]);
            }
            i11 = i14;
        }
        return 0.0d;
    }
}
