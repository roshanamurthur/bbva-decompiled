package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f18889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MonotonicCurveFit f18890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18891e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f18887a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f18888b = new double[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f18892f = 6.283185307179586d;

    public final double a(double d2) {
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.f18888b, d2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f18887a;
        float f6 = fArr[iBinarySearch];
        int i10 = iBinarySearch - 1;
        float f10 = fArr[i10];
        double d3 = f6 - f10;
        double[] dArr = this.f18888b;
        double d7 = dArr[iBinarySearch];
        double d10 = dArr[i10];
        double d11 = d3 / (d7 - d10);
        return ((((d2 * d2) - (d10 * d10)) * d11) / 2.0d) + ((d2 - d10) * (((double) f10) - (d11 * d10))) + this.f18889c[i10];
    }

    public void addPoint(double d2, float f6) {
        int length = this.f18887a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f18888b, d2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f18888b = Arrays.copyOf(this.f18888b, length);
        this.f18887a = Arrays.copyOf(this.f18887a, length);
        this.f18889c = new double[length];
        double[] dArr = this.f18888b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f18888b[iBinarySearch] = d2;
        this.f18887a[iBinarySearch] = f6;
    }

    public double getSlope(double d2, double d3, double d7) {
        double d10;
        double dA = a(d2) + d3;
        if (d2 <= 0.0d) {
            d10 = 0.0d;
        } else if (d2 >= 1.0d) {
            d10 = 1.0d;
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f18888b, d2);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 1;
            }
            float[] fArr = this.f18887a;
            float f6 = fArr[iBinarySearch];
            int i10 = iBinarySearch - 1;
            float f10 = fArr[i10];
            double d11 = f6 - f10;
            double[] dArr = this.f18888b;
            double d12 = dArr[iBinarySearch];
            double d13 = dArr[i10];
            double d14 = d11 / (d12 - d13);
            d10 = (((double) f10) - (d14 * d13)) + (d2 * d14);
        }
        double d15 = d10 + d7;
        int i11 = this.f18891e;
        double d16 = this.f18892f;
        switch (i11) {
            case 1:
                return 0.0d;
            case 2:
                return Math.signum((((dA * 4.0d) + 3.0d) % 4.0d) - 2.0d) * d15 * 4.0d;
            case 3:
                return d15 * 2.0d;
            case 4:
                return (-d15) * 2.0d;
            case 5:
                return Math.sin(d16 * dA) * (-d16) * d15;
            case 6:
                return ((((dA * 4.0d) + 2.0d) % 4.0d) - 2.0d) * d15 * 4.0d;
            case 7:
                return this.f18890d.getSlope(dA % 1.0d, 0);
            default:
                return Math.cos(d16 * dA) * d15 * d16;
        }
    }

    public double getValue(double d2, double d3) {
        double dAbs;
        double dA = a(d2) + d3;
        int i10 = this.f18891e;
        double d7 = this.f18892f;
        switch (i10) {
            case 1:
                return Math.signum(0.5d - (dA % 1.0d));
            case 2:
                dAbs = Math.abs((((dA * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dA * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dA * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d3 + dA) * d7);
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dA * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f18890d.getPos(dA % 1.0d, 0);
            default:
                return Math.sin(d7 * dA);
        }
        return 1.0d - dAbs;
    }

    public void normalize() {
        double d2 = 0.0d;
        int i10 = 0;
        while (true) {
            float[] fArr = this.f18887a;
            if (i10 >= fArr.length) {
                break;
            }
            d2 += (double) fArr[i10];
            i10++;
        }
        int i11 = 1;
        double d3 = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr2 = this.f18887a;
            if (i12 >= fArr2.length) {
                break;
            }
            int i13 = i12 - 1;
            float f6 = (fArr2[i13] + fArr2[i12]) / 2.0f;
            double[] dArr = this.f18888b;
            d3 += (dArr[i12] - dArr[i13]) * ((double) f6);
            i12++;
        }
        int i14 = 0;
        while (true) {
            float[] fArr3 = this.f18887a;
            if (i14 >= fArr3.length) {
                break;
            }
            fArr3[i14] = fArr3[i14] * ((float) (d2 / d3));
            i14++;
        }
        this.f18889c[0] = 0.0d;
        while (true) {
            float[] fArr4 = this.f18887a;
            if (i11 >= fArr4.length) {
                return;
            }
            int i15 = i11 - 1;
            float f10 = (fArr4[i15] + fArr4[i11]) / 2.0f;
            double[] dArr2 = this.f18888b;
            double d7 = dArr2[i11] - dArr2[i15];
            double[] dArr3 = this.f18889c;
            dArr3[i11] = (d7 * ((double) f10)) + dArr3[i15];
            i11++;
        }
    }

    public void setType(int i10, String str) {
        this.f18891e = i10;
        if (str != null) {
            this.f18890d = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f18888b) + " period=" + Arrays.toString(this.f18887a);
    }
}
