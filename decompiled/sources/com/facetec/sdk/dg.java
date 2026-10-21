package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public class dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f41174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f41176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f41178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41179k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41181n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object[] f41183r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f41182o = new int[12];
    private final long[] m = new long[12];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float[] f41180l = new float[12];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double[] f41184t = new double[12];

    public dg(Object obj) {
        Object[] objArr = new Object[12];
        this.f41183r = objArr;
        objArr[7] = obj;
        this.f41179k = 0;
        this.f41181n = -1;
    }

    public int d(int i10) {
        switch (i10) {
            case 1:
                Object[] objArr = this.f41183r;
                int i11 = this.f41179k;
                this.f41179k = i11 + 1;
                objArr[i11] = this.f41176h;
                return 0;
            case 2:
                int i12 = this.f41179k - 1;
                this.f41179k = i12;
                Object[] objArr2 = this.f41183r;
                Object obj = objArr2[i12];
                objArr2[i12] = null;
                this.f41171c = obj == null ? 0 : 1;
                return 0;
            case 3:
                int i13 = this.f41179k - this.f41170b;
                this.f41179k = i13;
                this.f41181n = i13;
                return 0;
            case 4:
                Object[] objArr3 = this.f41183r;
                int i14 = this.f41181n;
                this.f41181n = i14 + 1;
                Object obj2 = objArr3[i14];
                objArr3[i14] = null;
                this.f41178j = obj2;
                return 0;
            case 5:
                int[] iArr = this.f41182o;
                int i15 = this.f41179k;
                this.f41179k = i15 + 1;
                iArr[i15] = this.f41170b;
                return 0;
            case 6:
                this.f41171c = this.f41182o[this.f41179k - 1];
                return 0;
            case 7:
                Object[] objArr4 = this.f41183r;
                int i16 = this.f41179k;
                this.f41179k = i16 + 1;
                objArr4[i16] = objArr4[7];
                return 0;
            case 8:
                int[] iArr2 = this.f41182o;
                int i17 = this.f41179k;
                this.f41179k = i17 + 1;
                iArr2[i17] = 64;
                return 0;
            case 9:
                int[] iArr3 = this.f41182o;
                int i18 = this.f41181n;
                this.f41181n = i18 + 1;
                this.f41171c = iArr3[i18];
                return 0;
            case 10:
                int i19 = this.f41179k - 1;
                this.f41179k = i19;
                Object[] objArr5 = this.f41183r;
                Object obj3 = objArr5[i19];
                objArr5[i19] = null;
                objArr5[7] = obj3;
                return 0;
            case 11:
                int[] iArr4 = this.f41182o;
                int i20 = this.f41179k;
                iArr4[i20] = 5;
                this.f41179k = i20 + 2;
                iArr4[i20 + 1] = 0;
                return 0;
            case 12:
                int i21 = this.f41179k;
                int i22 = i21 - 1;
                this.f41179k = i22;
                int[] iArr5 = this.f41182o;
                iArr5[i21 - 2] = iArr5[i21 - 2] - iArr5[i22];
                return 0;
            case 13:
                int i23 = this.f41179k - 1;
                this.f41179k = i23;
                Object[] objArr6 = this.f41183r;
                Object obj4 = objArr6[i23];
                objArr6[i23] = null;
                objArr6[8] = obj4;
                return 0;
            case 14:
                Object[] objArr7 = this.f41183r;
                int i24 = this.f41179k;
                this.f41179k = i24 + 1;
                objArr7[i24] = objArr7[7];
                int[] iArr6 = this.f41182o;
                Object obj5 = objArr7[i24];
                objArr7[i24] = null;
                iArr6[i24] = ((Object[]) obj5).length;
                this.f41179k = i24;
                iArr6[9] = iArr6[i24];
                return 0;
            case 15:
                int[] iArr7 = this.f41182o;
                int i25 = this.f41179k;
                iArr7[i25] = 0;
                this.f41179k = i25;
                iArr7[10] = iArr7[i25];
                return 0;
            case 16:
                int[] iArr8 = this.f41182o;
                int i26 = this.f41179k;
                this.f41179k = i26 + 1;
                iArr8[i26] = iArr8[10];
                return 0;
            case 17:
                int i27 = this.f41179k;
                int i28 = i27 - 2;
                this.f41179k = i28;
                int[] iArr9 = this.f41182o;
                this.f41171c = iArr9[i28] >= iArr9[i27 - 1] ? 0 : 1;
                return 0;
            case 18:
                int[] iArr10 = this.f41182o;
                int i29 = this.f41179k;
                this.f41179k = i29 + 1;
                iArr10[i29] = iArr10[9];
                return 0;
            case 19:
                Object[] objArr8 = this.f41183r;
                int i30 = this.f41179k;
                objArr8[i30] = objArr8[7];
                int[] iArr11 = this.f41182o;
                iArr11[i30 + 1] = iArr11[10];
                int i31 = i30 + 1;
                this.f41179k = i31;
                Object obj6 = objArr8[i30];
                objArr8[i30] = null;
                objArr8[i30] = ((Object[]) obj6)[iArr11[i31]];
                return 0;
            case 20:
                int i32 = this.f41179k;
                int i33 = i32 - 1;
                Object[] objArr9 = this.f41183r;
                Object obj7 = objArr9[i33];
                objArr9[i33] = null;
                objArr9[11] = obj7;
                this.f41179k = i32;
                objArr9[i33] = obj7;
                return 0;
            case 21:
                int i34 = this.f41179k;
                int i35 = i34 - 1;
                Object[] objArr10 = this.f41183r;
                Object obj8 = objArr10[i35];
                objArr10[i35] = null;
                objArr10[11] = obj8;
                objArr10[i35] = objArr10[8];
                this.f41179k = i34 + 1;
                objArr10[i34] = objArr10[11];
                return 0;
            case 22:
                int[] iArr12 = this.f41182o;
                int i36 = this.f41179k;
                this.f41179k = i36 + 1;
                iArr12[i36] = 17;
                return 0;
            case 23:
                long[] jArr = this.m;
                int i37 = this.f41179k;
                this.f41179k = i37 + 1;
                jArr[i37] = this.f41169a;
                return 0;
            case 24:
                long[] jArr2 = this.m;
                int i38 = this.f41179k;
                this.f41179k = i38 + 1;
                jArr2[i38] = 0;
                return 0;
            case 25:
                int i39 = this.f41179k;
                int i40 = i39 - 1;
                this.f41179k = i40;
                long[] jArr3 = this.m;
                this.f41182o[i39 - 2] = (jArr3[i39 - 2] > jArr3[i40] ? 1 : (jArr3[i39 - 2] == jArr3[i40] ? 0 : -1));
                return 0;
            case 26:
                int i41 = this.f41179k - 1;
                this.f41179k = i41;
                this.f41171c = this.f41182o[i41] == 0 ? 0 : 1;
                return 0;
            case 27:
                int[] iArr13 = this.f41182o;
                iArr13[10] = iArr13[10] + 1;
                return 0;
            case 28:
                int[] iArr14 = this.f41182o;
                int i42 = this.f41179k;
                iArr14[i42] = 2;
                iArr14[i42 + 1] = 2;
                int i43 = i42 + 1;
                this.f41179k = i43;
                iArr14[i42] = iArr14[i42] % iArr14[i43];
                return 0;
            case 29:
                int i44 = this.f41179k - 1;
                this.f41179k = i44;
                this.f41183r[i44] = null;
                return 0;
            case 30:
                int[] iArr15 = this.f41182o;
                int i45 = this.f41179k;
                iArr15[i45] = 2;
                this.f41179k = i45 + 2;
                iArr15[i45 + 1] = 2;
                return 0;
            case 31:
                int i46 = this.f41179k;
                int i47 = i46 - 1;
                this.f41179k = i47;
                int[] iArr16 = this.f41182o;
                iArr16[i46 - 2] = iArr16[i46 - 2] % iArr16[i47];
                return 0;
            case 32:
                int[] iArr17 = this.f41182o;
                int i48 = this.f41179k;
                iArr17[i48] = 69;
                iArr17[i48 - 1] = iArr17[i48 - 1] + iArr17[i48];
                this.f41179k = i48 + 1;
                iArr17[i48] = iArr17[i48 - 1];
                return 0;
            case 33:
                int[] iArr18 = this.f41182o;
                int i49 = this.f41179k;
                iArr18[i49] = 128;
                this.f41179k = i49;
                iArr18[i49 - 1] = iArr18[i49 - 1] % iArr18[i49];
                return 0;
            case 34:
                int[] iArr19 = this.f41182o;
                int i50 = this.f41179k;
                iArr19[i50] = 2;
                this.f41179k = i50;
                iArr19[i50 - 1] = iArr19[i50 - 1] % iArr19[i50];
                return 0;
            case 35:
                int i51 = this.f41179k - 1;
                this.f41179k = i51;
                this.f41171c = this.f41182o[i51] != 0 ? 0 : 1;
                return 0;
            case 36:
                int[] iArr20 = this.f41182o;
                int i52 = this.f41179k;
                iArr20[i52] = 73;
                this.f41179k = i52;
                iArr20[i52 - 1] = iArr20[i52 - 1] + iArr20[i52];
                return 0;
            case 37:
                int[] iArr21 = this.f41182o;
                int i53 = this.f41179k;
                this.f41179k = i53 + 1;
                iArr21[i53] = iArr21[i53 - 1];
                return 0;
            case 38:
                int[] iArr22 = this.f41182o;
                int i54 = this.f41179k;
                this.f41179k = i54 + 1;
                iArr22[i54] = 128;
                return 0;
            case 39:
                Object[] objArr11 = this.f41183r;
                int i55 = this.f41179k;
                Object obj9 = objArr11[i55 - 1];
                objArr11[i55 - 1] = null;
                this.f41178j = obj9;
                return 0;
            case 40:
                Object[] objArr12 = this.f41183r;
                int i56 = this.f41179k;
                this.f41179k = i56 + 1;
                objArr12[i56] = null;
                return 0;
            case 41:
                int[] iArr23 = this.f41182o;
                int i57 = this.f41179k;
                Object[] objArr13 = this.f41183r;
                Object obj10 = objArr13[i57 - 1];
                objArr13[i57 - 1] = null;
                iArr23[i57 - 1] = ((int[]) obj10).length;
                return 0;
            case 42:
                int[] iArr24 = this.f41182o;
                int i58 = this.f41179k;
                iArr24[i58] = 105;
                iArr24[i58 - 1] = iArr24[i58 - 1] + iArr24[i58];
                this.f41179k = i58 + 1;
                iArr24[i58] = iArr24[i58 - 1];
                return 0;
            case 43:
                int[] iArr25 = this.f41182o;
                int i59 = this.f41179k;
                this.f41179k = i59 + 1;
                iArr25[i59] = 2;
                return 0;
            case 44:
                int[] iArr26 = this.f41182o;
                int i60 = this.f41179k - 1;
                this.f41179k = i60;
                this.f41171c = iArr26[i60];
                return 0;
            case 45:
                int[] iArr27 = this.f41182o;
                int i61 = this.f41179k;
                this.f41179k = i61 + 1;
                iArr27[i61] = 1;
                return 0;
            case 46:
                int[] iArr28 = this.f41182o;
                int i62 = this.f41179k;
                this.f41179k = i62 + 1;
                iArr28[i62] = 0;
                return 0;
            case 47:
                for (int i63 = this.f41179k - 1; i63 >= 0; i63--) {
                    this.f41183r[i63] = null;
                }
                Object[] objArr14 = this.f41183r;
                this.f41179k = 1;
                objArr14[0] = this.f41176h;
                return 0;
            default:
                return i10;
        }
    }
}
