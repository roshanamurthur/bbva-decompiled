package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public class dl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f41254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f41261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f41262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f41263j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41265l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long[] f41266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f41267o = new int[7];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f41264k = new float[7];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double[] f41268q = new double[7];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object[] f41269r = new Object[7];

    public dl(long j10, long j11) {
        long[] jArr = new long[7];
        this.f41266n = jArr;
        jArr[3] = j10;
        jArr[5] = j11;
        this.f41265l = 0;
        this.m = -1;
    }

    public int b(int i10) {
        switch (i10) {
            case 1:
                int[] iArr = this.f41267o;
                int i11 = this.f41265l;
                this.f41265l = i11 + 1;
                iArr[i11] = this.f41257d;
                return 0;
            case 2:
                Object[] objArr = this.f41269r;
                int i12 = this.f41265l;
                this.f41265l = i12 + 1;
                objArr[i12] = this.f41261h;
                return 0;
            case 3:
                int i13 = this.f41265l - this.f41257d;
                this.f41265l = i13;
                this.m = i13;
                return 0;
            case 4:
                Object[] objArr2 = this.f41269r;
                int i14 = this.m;
                this.m = i14 + 1;
                Object obj = objArr2[i14];
                objArr2[i14] = null;
                this.f41263j = obj;
                return 0;
            case 5:
                int[] iArr2 = this.f41267o;
                int i15 = this.m;
                this.m = i15 + 1;
                this.f41258e = iArr2[i15];
                return 0;
            case 6:
                int i16 = this.f41265l;
                int i17 = i16 - 1;
                this.f41265l = i17;
                int[] iArr3 = this.f41267o;
                iArr3[i16 - 2] = iArr3[i16 - 2] | iArr3[i17];
                return 0;
            case 7:
                int[] iArr4 = this.f41267o;
                int i18 = this.f41265l;
                iArr4[i18] = 2;
                iArr4[i18 + 1] = 2;
                int i19 = i18 + 1;
                this.f41265l = i19;
                iArr4[i18] = iArr4[i18] % iArr4[i19];
                return 0;
            case 8:
                int i20 = this.f41265l - 1;
                this.f41265l = i20;
                this.f41269r[i20] = null;
                return 0;
            case 10:
                int[] iArr5 = this.f41267o;
                int i21 = this.f41265l;
                iArr5[i21] = 89;
                this.f41265l = i21;
                iArr5[i21 - 1] = iArr5[i21 - 1] + iArr5[i21];
            case 9:
                return 0;
            case 11:
                int[] iArr6 = this.f41267o;
                int i22 = this.f41265l;
                this.f41265l = i22 + 1;
                iArr6[i22] = iArr6[i22 - 1];
                return 0;
            case 12:
                int[] iArr7 = this.f41267o;
                int i23 = this.f41265l;
                this.f41265l = i23 + 1;
                iArr7[i23] = 128;
                return 0;
            case 13:
                int i24 = this.f41265l;
                int i25 = i24 - 1;
                this.f41265l = i25;
                int[] iArr8 = this.f41267o;
                iArr8[i24 - 2] = iArr8[i24 - 2] % iArr8[i25];
                return 0;
            case 14:
                int i26 = this.f41265l - 1;
                this.f41265l = i26;
                this.f41258e = this.f41267o[i26] == 0 ? 0 : 1;
                return 0;
            case 15:
                int[] iArr9 = this.f41267o;
                int i27 = this.f41265l;
                iArr9[i27] = 2;
                this.f41265l = i27;
                iArr9[i27 - 1] = iArr9[i27 - 1] % iArr9[i27];
                return 0;
            case 16:
                Object[] objArr3 = this.f41269r;
                int i28 = this.f41265l;
                Object obj2 = objArr3[i28 - 1];
                objArr3[i28 - 1] = null;
                this.f41263j = obj2;
                return 0;
            case 17:
                int[] iArr10 = this.f41267o;
                int i29 = this.f41265l;
                iArr10[i29] = 77;
                this.f41265l = i29 + 2;
                iArr10[i29 + 1] = 0;
                return 0;
            case 18:
                int i30 = this.f41265l;
                int i31 = i30 - 1;
                this.f41265l = i31;
                int[] iArr11 = this.f41267o;
                iArr11[i30 - 2] = iArr11[i30 - 2] / iArr11[i31];
                int i32 = i30 - 2;
                this.f41265l = i32;
                this.f41269r[i32] = null;
                return 0;
            case 19:
                int[] iArr12 = this.f41267o;
                int i33 = this.f41265l - 1;
                this.f41265l = i33;
                this.f41258e = iArr12[i33];
                return 0;
            case 20:
                int[] iArr13 = this.f41267o;
                int i34 = this.f41265l;
                this.f41265l = i34 + 1;
                iArr13[i34] = 57;
                return 0;
            case 21:
                int[] iArr14 = this.f41267o;
                int i35 = this.f41265l;
                this.f41265l = i35 + 1;
                iArr14[i35] = 75;
                return 0;
            case 22:
                for (int i36 = this.f41265l - 1; i36 >= 0; i36--) {
                    this.f41269r[i36] = null;
                }
                Object[] objArr4 = this.f41269r;
                this.f41265l = 1;
                objArr4[0] = this.f41261h;
                return 0;
            default:
                return i10;
        }
    }
}
