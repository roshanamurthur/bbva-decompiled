package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public class ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f41576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f41580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f41581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f41582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f41583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f41584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long[] f41586l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41588o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f41587n = new int[7];
    private final float[] m = new float[7];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double[] f41590t = new double[7];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object[] f41589s = new Object[7];

    public ff(long j10, long j11) {
        long[] jArr = new long[7];
        this.f41586l = jArr;
        jArr[3] = j10;
        jArr[5] = j11;
        this.f41588o = 0;
        this.f41585k = -1;
    }

    public int d(int i10) {
        switch (i10) {
            case 1:
                int[] iArr = this.f41587n;
                int i11 = this.f41588o;
                this.f41588o = i11 + 1;
                iArr[i11] = this.f41579e;
                return 0;
            case 2:
                Object[] objArr = this.f41589s;
                int i12 = this.f41588o;
                this.f41588o = i12 + 1;
                objArr[i12] = this.f41581g;
                return 0;
            case 3:
                int i13 = this.f41588o - this.f41579e;
                this.f41588o = i13;
                this.f41585k = i13;
                return 0;
            case 4:
                Object[] objArr2 = this.f41589s;
                int i14 = this.f41585k;
                this.f41585k = i14 + 1;
                Object obj = objArr2[i14];
                objArr2[i14] = null;
                this.f41582h = obj;
                return 0;
            case 5:
                int[] iArr2 = this.f41587n;
                int i15 = this.f41585k;
                this.f41585k = i15 + 1;
                this.f41578d = iArr2[i15];
                return 0;
            case 6:
                int i16 = this.f41588o;
                int i17 = i16 - 1;
                this.f41588o = i17;
                int[] iArr3 = this.f41587n;
                iArr3[i16 - 2] = iArr3[i16 - 2] | iArr3[i17];
                return 0;
            case 7:
                int[] iArr4 = this.f41587n;
                int i18 = this.f41588o;
                iArr4[i18] = 2;
                this.f41588o = i18 + 2;
                iArr4[i18 + 1] = 2;
                return 0;
            case 8:
                int i19 = this.f41588o;
                int i20 = i19 - 1;
                this.f41588o = i20;
                int[] iArr5 = this.f41587n;
                iArr5[i19 - 2] = iArr5[i19 - 2] % iArr5[i20];
                int i21 = i19 - 2;
                this.f41588o = i21;
                this.f41589s[i21] = null;
                return 0;
            case 10:
                int[] iArr6 = this.f41587n;
                int i22 = this.f41588o;
                this.f41588o = i22 + 1;
                iArr6[i22] = 27;
            case 9:
                return 0;
            case 11:
                int i23 = this.f41588o;
                int i24 = i23 - 1;
                int[] iArr7 = this.f41587n;
                iArr7[i23 - 2] = iArr7[i23 - 2] + iArr7[i24];
                iArr7[i24] = iArr7[i23 - 2];
                this.f41588o = i23 + 1;
                iArr7[i23] = 128;
                return 0;
            case 12:
                int i25 = this.f41588o;
                int i26 = i25 - 1;
                this.f41588o = i26;
                int[] iArr8 = this.f41587n;
                iArr8[i25 - 2] = iArr8[i25 - 2] % iArr8[i26];
                return 0;
            case 13:
                int[] iArr9 = this.f41587n;
                int i27 = this.f41588o;
                this.f41588o = i27 + 1;
                iArr9[i27] = 2;
                return 0;
            case 14:
                int i28 = this.f41588o - 1;
                this.f41588o = i28;
                this.f41578d = this.f41587n[i28] == 0 ? 0 : 1;
                return 0;
            case 15:
                int[] iArr10 = this.f41587n;
                int i29 = this.f41588o;
                iArr10[i29] = 99;
                this.f41588o = i29;
                iArr10[i29 - 1] = iArr10[i29 - 1] + iArr10[i29];
                return 0;
            case 16:
                int[] iArr11 = this.f41587n;
                int i30 = this.f41588o;
                this.f41588o = i30 + 1;
                iArr11[i30] = iArr11[i30 - 1];
                return 0;
            case 17:
                int[] iArr12 = this.f41587n;
                int i31 = this.f41588o;
                this.f41588o = i31 + 1;
                iArr12[i31] = 128;
                return 0;
            default:
                return i10;
        }
    }
}
