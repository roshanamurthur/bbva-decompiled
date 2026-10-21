package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public class ku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f42183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f42184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f42185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f42186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f42187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f42188j;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long[] f42192o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f42190l = new int[7];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f42189k = new float[7];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double[] f42194t = new double[7];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object[] f42193s = new Object[7];

    public ku(long j10, long j11) {
        long[] jArr = new long[7];
        this.f42192o = jArr;
        jArr[3] = j10;
        jArr[5] = j11;
        this.f42191n = 0;
        this.m = -1;
    }

    public int e(int i10) {
        switch (i10) {
            case 1:
                int[] iArr = this.f42190l;
                int i11 = this.f42191n;
                this.f42191n = i11 + 1;
                iArr[i11] = this.f42179a;
                return 0;
            case 2:
                Object[] objArr = this.f42193s;
                int i12 = this.f42191n;
                this.f42191n = i12 + 1;
                objArr[i12] = this.f42187i;
                return 0;
            case 3:
                int i13 = this.f42191n - this.f42179a;
                this.f42191n = i13;
                this.m = i13;
                return 0;
            case 4:
                Object[] objArr2 = this.f42193s;
                int i14 = this.m;
                this.m = i14 + 1;
                Object obj = objArr2[i14];
                objArr2[i14] = null;
                this.f42186h = obj;
                return 0;
            case 5:
                int i15 = this.f42191n;
                int i16 = i15 - 1;
                this.f42191n = i16;
                int[] iArr2 = this.f42190l;
                iArr2[i15 - 2] = iArr2[i15 - 2] | iArr2[i16];
                return 0;
            case 6:
                int[] iArr3 = this.f42190l;
                int i17 = this.m;
                this.m = i17 + 1;
                this.f42181c = iArr3[i17];
                return 0;
            case 7:
                int[] iArr4 = this.f42190l;
                int i18 = this.f42191n;
                iArr4[i18] = 2;
                iArr4[i18 + 1] = 2;
                int i19 = i18 + 1;
                this.f42191n = i19;
                iArr4[i18] = iArr4[i18] % iArr4[i19];
                return 0;
            case 8:
                int i20 = this.f42191n - 1;
                this.f42191n = i20;
                this.f42193s[i20] = null;
                return 0;
            case 10:
                int[] iArr5 = this.f42190l;
                int i21 = this.f42191n;
                this.f42191n = i21 + 1;
                iArr5[i21] = 113;
            case 9:
                return 0;
            case 11:
                int i22 = this.f42191n;
                int i23 = i22 - 1;
                this.f42191n = i23;
                int[] iArr6 = this.f42190l;
                iArr6[i22 - 2] = iArr6[i22 - 2] + iArr6[i23];
                return 0;
            case 12:
                int[] iArr7 = this.f42190l;
                int i24 = this.f42191n;
                this.f42191n = i24 + 1;
                iArr7[i24] = iArr7[i24 - 1];
                return 0;
            case 13:
                int[] iArr8 = this.f42190l;
                int i25 = this.f42191n;
                iArr8[i25] = 128;
                this.f42191n = i25;
                iArr8[i25 - 1] = iArr8[i25 - 1] % iArr8[i25];
                return 0;
            case 14:
                int[] iArr9 = this.f42190l;
                int i26 = this.f42191n;
                this.f42191n = i26 + 1;
                iArr9[i26] = 2;
                return 0;
            case 15:
                int i27 = this.f42191n;
                int i28 = i27 - 1;
                this.f42191n = i28;
                int[] iArr10 = this.f42190l;
                iArr10[i27 - 2] = iArr10[i27 - 2] % iArr10[i28];
                return 0;
            case 16:
                int i29 = this.f42191n - 1;
                this.f42191n = i29;
                this.f42181c = this.f42190l[i29] == 0 ? 0 : 1;
                return 0;
            case 17:
                Object[] objArr3 = this.f42193s;
                int i30 = this.f42191n;
                Object obj2 = objArr3[i30 - 1];
                objArr3[i30 - 1] = null;
                this.f42186h = obj2;
                return 0;
            case 18:
                Object[] objArr4 = this.f42193s;
                int i31 = this.f42191n;
                this.f42191n = i31 + 1;
                objArr4[i31] = null;
                return 0;
            case 19:
                int[] iArr11 = this.f42190l;
                int i32 = this.f42191n - 1;
                this.f42191n = i32;
                this.f42181c = iArr11[i32];
                return 0;
            case 20:
                int[] iArr12 = this.f42190l;
                int i33 = this.f42191n;
                this.f42191n = i33 + 1;
                iArr12[i33] = 1;
                return 0;
            case 21:
                int[] iArr13 = this.f42190l;
                int i34 = this.f42191n;
                this.f42191n = i34 + 1;
                iArr13[i34] = 0;
                return 0;
            case 22:
                for (int i35 = this.f42191n - 1; i35 >= 0; i35--) {
                    this.f42193s[i35] = null;
                }
                Object[] objArr5 = this.f42193s;
                this.f42191n = 1;
                objArr5[0] = this.f42187i;
                return 0;
            default:
                return i10;
        }
    }
}
