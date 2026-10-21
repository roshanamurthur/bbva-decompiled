package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public class di {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f41201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f41206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f41208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f41210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float[] f41212l;
    private final int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long[] f41213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object[] f41215p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double[] f41216r;

    public di() {
        this.m = new int[10];
        this.f41213n = new long[10];
        this.f41212l = new float[10];
        this.f41216r = new double[10];
        this.f41215p = new Object[10];
        this.f41211k = 0;
        this.f41214o = -1;
    }

    public int b(int i10) {
        switch (i10) {
            case 1:
                int[] iArr = this.m;
                int i11 = this.f41211k;
                this.f41211k = i11 + 1;
                iArr[i11] = 1;
                return 0;
            case 2:
                int i12 = this.f41211k - this.f41205e;
                this.f41211k = i12;
                this.f41214o = i12;
                return 0;
            case 3:
                int[] iArr2 = this.m;
                int i13 = this.f41214o;
                this.f41214o = i13 + 1;
                this.f41202b = iArr2[i13];
                return 0;
            case 4:
                Object[] objArr = this.f41215p;
                int i14 = this.f41211k;
                this.f41211k = i14 + 1;
                objArr[i14] = this.f41208h;
                return 0;
            case 5:
                Object[] objArr2 = this.f41215p;
                int i15 = this.f41214o;
                this.f41214o = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.f41209i = obj;
                return 0;
            case 6:
                int[] iArr3 = this.m;
                int i16 = this.f41211k;
                this.f41211k = i16 + 1;
                iArr3[i16] = this.f41205e;
                return 0;
            case 7:
                int i17 = this.f41211k - 1;
                this.f41211k = i17;
                this.f41202b = this.m[i17] == 0 ? 0 : 1;
                return 0;
            case 8:
                Object[] objArr3 = this.f41215p;
                int i18 = this.f41211k;
                this.f41211k = i18 + 1;
                objArr3[i18] = objArr3[5];
                return 0;
            case 9:
                int i19 = this.f41211k;
                int i20 = i19 - 2;
                this.f41211k = i20;
                Object[] objArr4 = this.f41215p;
                Object obj2 = objArr4[i20];
                objArr4[i20] = null;
                Object obj3 = objArr4[i19 - 1];
                objArr4[i19 - 1] = null;
                this.f41202b = obj2 != obj3 ? 0 : 1;
                return 0;
            case 10:
                Object[] objArr5 = this.f41215p;
                int i21 = this.f41211k;
                objArr5[i21] = objArr5[5];
                this.f41211k = i21 + 2;
                objArr5[i21 + 1] = objArr5[8];
                return 0;
            case 11:
                Object[] objArr6 = this.f41215p;
                int i22 = this.f41211k;
                this.f41211k = i22 + 1;
                objArr6[i22] = objArr6[6];
                return 0;
            case 12:
                int[] iArr4 = this.m;
                int i23 = this.f41211k;
                this.f41211k = i23 + 1;
                iArr4[i23] = 0;
                return 0;
            case 13:
                int i24 = this.f41211k - 1;
                this.f41211k = i24;
                Object[] objArr7 = this.f41215p;
                Object obj4 = objArr7[i24];
                objArr7[i24] = null;
                this.f41202b = obj4 != null ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr8 = this.f41215p;
                int i25 = this.f41211k;
                this.f41211k = i25 + 1;
                objArr8[i25] = objArr8[8];
                return 0;
            case 15:
                Object[] objArr9 = this.f41215p;
                int i26 = this.f41211k;
                objArr9[i26] = objArr9[7];
                this.f41211k = i26 + 2;
                objArr9[i26 + 1] = objArr9[5];
                return 0;
            case 16:
                int i27 = this.f41211k - 1;
                this.f41211k = i27;
                this.f41215p[i27] = null;
                return 0;
            case 17:
                int[] iArr5 = this.m;
                int i28 = this.f41211k;
                this.f41211k = i28 + 1;
                iArr5[i28] = 2;
                return 0;
            case 18:
                int[] iArr6 = this.m;
                int i29 = this.f41211k;
                iArr6[i29] = 2;
                this.f41211k = i29;
                iArr6[i29 - 1] = iArr6[i29 - 1] % iArr6[i29];
                int i30 = i29 - 1;
                this.f41211k = i30;
                this.f41215p[i30] = null;
                return 0;
            case 20:
                int[] iArr7 = this.m;
                int i31 = this.f41211k;
                iArr7[i31] = 2;
                this.f41211k = i31 + 2;
                iArr7[i31 + 1] = 2;
            case 19:
                return 0;
            case 21:
                int i32 = this.f41211k;
                int i33 = i32 - 1;
                this.f41211k = i33;
                int[] iArr8 = this.m;
                iArr8[i32 - 2] = iArr8[i32 - 2] % iArr8[i33];
                return 0;
            case 22:
                int[] iArr9 = this.m;
                int i34 = this.f41211k;
                this.f41211k = i34 + 1;
                iArr9[i34] = 45;
                return 0;
            case 23:
                int i35 = this.f41211k;
                int i36 = i35 - 1;
                int[] iArr10 = this.m;
                iArr10[i35 - 2] = iArr10[i35 - 2] + iArr10[i36];
                this.f41211k = i35;
                iArr10[i36] = iArr10[i35 - 2];
                return 0;
            case 24:
                int[] iArr11 = this.m;
                int i37 = this.f41211k;
                this.f41211k = i37 + 1;
                iArr11[i37] = 128;
                return 0;
            case 25:
                int[] iArr12 = this.m;
                int i38 = this.f41211k;
                iArr12[i38] = 2;
                this.f41211k = i38;
                iArr12[i38 - 1] = iArr12[i38 - 1] % iArr12[i38];
                return 0;
            case 26:
                int i39 = this.f41211k - 1;
                this.f41211k = i39;
                this.f41202b = this.m[i39] != 0 ? 0 : 1;
                return 0;
            case 27:
                int[] iArr13 = this.m;
                int i40 = this.f41211k;
                this.f41211k = i40 + 1;
                iArr13[i40] = 5;
                return 0;
            case 28:
                int i41 = this.f41211k;
                int i42 = i41 - 1;
                int[] iArr14 = this.m;
                iArr14[i41 - 2] = iArr14[i41 - 2] + iArr14[i42];
                iArr14[i42] = iArr14[i41 - 2];
                this.f41211k = i41 + 1;
                iArr14[i41] = 128;
                return 0;
            case 29:
                int[] iArr15 = this.m;
                int i43 = this.f41211k;
                iArr15[i43] = 95;
                iArr15[i43 - 1] = iArr15[i43 - 1] + iArr15[i43];
                this.f41211k = i43 + 1;
                iArr15[i43] = iArr15[i43 - 1];
                return 0;
            case 30:
                int[] iArr16 = this.m;
                int i44 = this.f41211k;
                iArr16[i44] = 128;
                this.f41211k = i44;
                iArr16[i44 - 1] = iArr16[i44 - 1] % iArr16[i44];
                return 0;
            case 31:
                int[] iArr17 = this.m;
                int i45 = this.f41211k - 1;
                this.f41211k = i45;
                this.f41202b = iArr17[i45];
                return 0;
            case 32:
                int[] iArr18 = this.m;
                int i46 = this.f41211k;
                this.f41211k = i46 + 1;
                iArr18[i46] = 28;
                return 0;
            case 33:
                int[] iArr19 = this.m;
                int i47 = this.f41211k;
                this.f41211k = i47 + 1;
                iArr19[i47] = 80;
                return 0;
            case 34:
                Object[] objArr10 = this.f41215p;
                int i48 = this.f41211k;
                objArr10[i48] = objArr10[5];
                objArr10[i48 + 1] = objArr10[9];
                int[] iArr20 = this.m;
                this.f41211k = i48 + 3;
                iArr20[i48 + 2] = 1;
                return 0;
            case 35:
                Object[] objArr11 = this.f41215p;
                int i49 = this.f41211k;
                objArr11[i49] = objArr11[5];
                this.f41211k = i49 + 2;
                objArr11[i49 + 1] = objArr11[9];
                return 0;
            case 36:
                Object[] objArr12 = this.f41215p;
                int i50 = this.f41211k;
                this.f41211k = i50 + 1;
                objArr12[i50] = objArr12[7];
                return 0;
            case 37:
                Object[] objArr13 = this.f41215p;
                int i51 = this.f41211k;
                objArr13[i51] = objArr13[8];
                objArr13[i51 + 1] = objArr13[5];
                this.f41211k = i51 + 3;
                objArr13[i51 + 2] = objArr13[9];
                return 0;
            case 38:
                Object[] objArr14 = this.f41215p;
                int i52 = this.f41211k;
                objArr14[i52] = objArr14[6];
                this.f41211k = i52 + 2;
                objArr14[i52 + 1] = objArr14[7];
                return 0;
            case 39:
                Object[] objArr15 = this.f41215p;
                int i53 = this.f41211k;
                objArr15[i53] = objArr15[5];
                objArr15[i53 + 1] = objArr15[9];
                int[] iArr21 = this.m;
                this.f41211k = i53 + 3;
                iArr21[i53 + 2] = 0;
                return 0;
            case 40:
                int[] iArr22 = this.m;
                int i54 = this.f41211k;
                iArr22[i54] = 2;
                iArr22[i54 + 1] = 2;
                int i55 = i54 + 1;
                this.f41211k = i55;
                iArr22[i54] = iArr22[i54] % iArr22[i55];
                return 0;
            case 41:
                int[] iArr23 = this.m;
                int i56 = this.f41211k;
                iArr23[i56] = 115;
                this.f41211k = i56;
                iArr23[i56 - 1] = iArr23[i56 - 1] + iArr23[i56];
                return 0;
            case 42:
                int[] iArr24 = this.m;
                int i57 = this.f41211k;
                iArr24[i57] = iArr24[i57 - 1];
                iArr24[i57 + 1] = 128;
                int i58 = i57 + 1;
                this.f41211k = i58;
                iArr24[i57] = iArr24[i57] % iArr24[i58];
                return 0;
            case 43:
                int[] iArr25 = this.m;
                int i59 = this.f41211k;
                iArr25[i59] = 79;
                this.f41211k = i59;
                iArr25[i59 - 1] = iArr25[i59 - 1] + iArr25[i59];
                return 0;
            case 44:
                Object[] objArr16 = this.f41215p;
                int i60 = this.f41211k;
                Object obj5 = objArr16[i60 - 1];
                objArr16[i60 - 1] = null;
                this.f41209i = obj5;
                return 0;
            case 45:
                Object[] objArr17 = this.f41215p;
                int i61 = this.f41211k;
                this.f41211k = i61 + 1;
                objArr17[i61] = null;
                return 0;
            case 46:
                int[] iArr26 = this.m;
                int i62 = this.f41211k;
                this.f41211k = i62 + 1;
                iArr26[i62] = 60;
                return 0;
            case 47:
                int[] iArr27 = this.m;
                int i63 = this.f41211k;
                this.f41211k = i63 + 1;
                iArr27[i63] = 64;
                return 0;
            case 48:
                for (int i64 = this.f41211k - 1; i64 >= 0; i64--) {
                    this.f41215p[i64] = null;
                }
                Object[] objArr18 = this.f41215p;
                this.f41211k = 1;
                objArr18[0] = this.f41208h;
                return 0;
            case 49:
                Object[] objArr19 = this.f41215p;
                int i65 = this.f41211k;
                objArr19[i65] = objArr19[5];
                objArr19[i65 + 1] = objArr19[i65];
                this.f41211k = i65 + 3;
                objArr19[i65 + 2] = objArr19[6];
                return 0;
            case 50:
                int[] iArr28 = this.m;
                int i66 = this.f41211k;
                iArr28[i66] = 61;
                this.f41211k = i66;
                iArr28[i66 - 1] = iArr28[i66 - 1] + iArr28[i66];
                return 0;
            case 51:
                int[] iArr29 = this.m;
                int i67 = this.f41211k;
                this.f41211k = i67 + 1;
                iArr29[i67] = iArr29[i67 - 1];
                return 0;
            case 52:
                int[] iArr30 = this.m;
                int i68 = this.f41211k;
                iArr30[i68] = 21;
                this.f41211k = i68;
                iArr30[i68 - 1] = iArr30[i68 - 1] + iArr30[i68];
                return 0;
            case 53:
                int[] iArr31 = this.m;
                int i69 = this.f41211k;
                this.f41211k = i69 + 1;
                iArr31[i69] = 4;
                return 0;
            case 54:
                int[] iArr32 = this.m;
                int i70 = this.f41211k;
                this.f41211k = i70 + 1;
                iArr32[i70] = 68;
                return 0;
            case 55:
                int i71 = this.f41211k;
                int i72 = i71 - 1;
                Object[] objArr20 = this.f41215p;
                objArr20[i72] = null;
                this.f41211k = i71;
                objArr20[i72] = objArr20[5];
                return 0;
            case 56:
                Object[] objArr21 = this.f41215p;
                int i73 = this.f41211k;
                this.f41211k = i73 + 1;
                objArr21[i73] = objArr21[i73 - 1];
                return 0;
            case 57:
                int i74 = this.f41211k - 1;
                this.f41211k = i74;
                Object[] objArr22 = this.f41215p;
                Object obj6 = objArr22[i74];
                objArr22[i74] = null;
                objArr22[6] = obj6;
                return 0;
            case 58:
                Object[] objArr23 = this.f41215p;
                int i75 = this.f41211k;
                objArr23[i75] = objArr23[5];
                objArr23[i75 + 1] = objArr23[8];
                int[] iArr33 = this.m;
                this.f41211k = i75 + 3;
                iArr33[i75 + 2] = 0;
                return 0;
            case 59:
                int[] iArr34 = this.m;
                int i76 = this.f41211k;
                this.f41211k = i76 + 1;
                iArr34[i76] = 67;
                return 0;
            case 60:
                int i77 = this.f41211k;
                int i78 = i77 - 1;
                this.f41211k = i78;
                int[] iArr35 = this.m;
                iArr35[i77 - 2] = iArr35[i77 - 2] + iArr35[i78];
                return 0;
            case 61:
                int[] iArr36 = this.m;
                int i79 = this.f41211k;
                iArr36[i79] = 117;
                this.f41211k = i79;
                iArr36[i79 - 1] = iArr36[i79 - 1] + iArr36[i79];
                return 0;
            case 62:
                int[] iArr37 = this.m;
                int i80 = this.f41211k;
                this.f41211k = i80 + 1;
                iArr37[i80] = 107;
                return 0;
            case 63:
                int[] iArr38 = this.m;
                int i81 = this.f41211k;
                this.f41211k = i81 + 1;
                iArr38[i81] = 33;
                return 0;
            case 64:
                int[] iArr39 = this.m;
                int i82 = this.f41211k;
                this.f41211k = i82 + 1;
                iArr39[i82] = 39;
                return 0;
            case 65:
                int i83 = this.f41211k;
                int i84 = i83 - 1;
                this.f41211k = i84;
                int[] iArr40 = this.m;
                iArr40[i83 - 2] = iArr40[i83 - 2] % iArr40[i84];
                int i85 = i83 - 2;
                this.f41211k = i85;
                this.f41215p[i85] = null;
                return 0;
            case 66:
                int[] iArr41 = this.m;
                int i86 = this.f41211k;
                this.f41211k = i86 + 1;
                iArr41[i86] = 117;
                return 0;
            case 67:
                int[] iArr42 = this.m;
                int i87 = this.f41211k;
                this.f41211k = i87 + 1;
                iArr42[i87] = 43;
                return 0;
            default:
                return i10;
        }
    }

    public di(Object obj) {
        this.m = new int[10];
        this.f41213n = new long[10];
        this.f41212l = new float[10];
        this.f41216r = new double[10];
        Object[] objArr = new Object[10];
        this.f41215p = objArr;
        objArr[5] = obj;
        this.f41211k = 0;
        this.f41214o = -1;
    }

    public di(Object obj, Object obj2) {
        this.m = new int[10];
        this.f41213n = new long[10];
        this.f41212l = new float[10];
        this.f41216r = new double[10];
        Object[] objArr = new Object[10];
        this.f41215p = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        this.f41211k = 0;
        this.f41214o = -1;
    }

    public di(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.m = new int[10];
        this.f41213n = new long[10];
        this.f41212l = new float[10];
        this.f41216r = new double[10];
        Object[] objArr = new Object[10];
        this.f41215p = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        objArr[9] = obj5;
        this.f41211k = 0;
        this.f41214o = -1;
    }

    public di(Object obj, Object obj2, Object obj3, Object obj4) {
        this.m = new int[10];
        this.f41213n = new long[10];
        this.f41212l = new float[10];
        this.f41216r = new double[10];
        Object[] objArr = new Object[10];
        this.f41215p = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        objArr[8] = obj4;
        this.f41211k = 0;
        this.f41214o = -1;
    }
}
