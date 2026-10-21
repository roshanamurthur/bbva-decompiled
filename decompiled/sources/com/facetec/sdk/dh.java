package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public class dh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f41187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f41190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f41192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f41194j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float[] f41196l;
    private final int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f41197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long[] f41198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object[] f41199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double[] f41200q;

    public dh(Object obj) {
        this.m = new int[10];
        this.f41198o = new long[10];
        this.f41196l = new float[10];
        this.f41200q = new double[10];
        Object[] objArr = new Object[10];
        this.f41199p = objArr;
        objArr[4] = obj;
        this.f41197n = 0;
        this.f41195k = -1;
    }

    public int c(int i10) {
        switch (i10) {
            case 1:
                long[] jArr = this.f41198o;
                int i11 = this.f41197n;
                this.f41197n = i11 + 1;
                jArr[i11] = jArr[4];
                return 0;
            case 2:
                Object[] objArr = this.f41199p;
                int i12 = this.f41197n;
                this.f41197n = i12 + 1;
                objArr[i12] = objArr[6];
                return 0;
            case 3:
                Object[] objArr2 = this.f41199p;
                int i13 = this.f41197n;
                this.f41197n = i13 + 1;
                objArr2[i13] = objArr2[7];
                return 0;
            case 4:
                int i14 = this.f41197n - this.f41186b;
                this.f41197n = i14;
                this.f41195k = i14;
                return 0;
            case 5:
                long[] jArr2 = this.f41198o;
                int i15 = this.f41195k;
                this.f41195k = i15 + 1;
                this.f41185a = jArr2[i15];
                return 0;
            case 6:
                Object[] objArr3 = this.f41199p;
                int i16 = this.f41195k;
                this.f41195k = i16 + 1;
                Object obj = objArr3[i16];
                objArr3[i16] = null;
                this.f41192h = obj;
                return 0;
            case 7:
                int[] iArr = this.m;
                int i17 = this.f41197n;
                this.f41197n = i17 + 1;
                iArr[i17] = 2;
                return 0;
            case 8:
                int[] iArr2 = this.m;
                int i18 = this.f41197n;
                iArr2[i18] = 2;
                this.f41197n = i18;
                iArr2[i18 - 1] = iArr2[i18 - 1] % iArr2[i18];
                int i19 = i18 - 1;
                this.f41197n = i19;
                this.f41199p[i19] = null;
                return 0;
            case 10:
                int[] iArr3 = this.m;
                int i20 = this.f41197n;
                this.f41197n = i20 + 1;
                iArr3[i20] = this.f41186b;
            case 9:
                return 0;
            case 11:
                int[] iArr4 = this.m;
                int i21 = this.f41197n;
                iArr4[i21] = 119;
                this.f41197n = i21;
                iArr4[i21 - 1] = iArr4[i21 - 1] + iArr4[i21];
                return 0;
            case 12:
                int[] iArr5 = this.m;
                int i22 = this.f41197n;
                iArr5[i22] = iArr5[i22 - 1];
                this.f41197n = i22 + 2;
                iArr5[i22 + 1] = 128;
                return 0;
            case 13:
                int[] iArr6 = this.m;
                int i23 = this.f41195k;
                this.f41195k = i23 + 1;
                this.f41189e = iArr6[i23];
                return 0;
            case 14:
                int i24 = this.f41197n;
                int i25 = i24 - 1;
                this.f41197n = i25;
                int[] iArr7 = this.m;
                iArr7[i24 - 2] = iArr7[i24 - 2] % iArr7[i25];
                return 0;
            case 15:
                int i26 = this.f41197n - 1;
                this.f41197n = i26;
                this.f41189e = this.m[i26] != 0 ? 0 : 1;
                return 0;
            case 16:
                Object[] objArr4 = this.f41199p;
                int i27 = this.f41197n;
                Object obj2 = objArr4[i27 - 1];
                objArr4[i27 - 1] = null;
                this.f41192h = obj2;
                return 0;
            case 17:
                long[] jArr3 = this.f41198o;
                int i28 = this.f41197n;
                jArr3[i28] = jArr3[4];
                Object[] objArr5 = this.f41199p;
                this.f41197n = i28 + 2;
                objArr5[i28 + 1] = objArr5[6];
                return 0;
            case 18:
                Object[] objArr6 = this.f41199p;
                int i29 = this.f41197n;
                this.f41197n = i29 + 1;
                objArr6[i29] = null;
                return 0;
            case 19:
                int[] iArr8 = this.m;
                int i30 = this.f41197n;
                Object[] objArr7 = this.f41199p;
                Object obj3 = objArr7[i30 - 1];
                objArr7[i30 - 1] = null;
                iArr8[i30 - 1] = ((int[]) obj3).length;
                return 0;
            case 20:
                int i31 = this.f41197n - 1;
                this.f41197n = i31;
                this.f41199p[i31] = null;
                return 0;
            case 21:
                int[] iArr9 = this.m;
                int i32 = this.f41197n - 1;
                this.f41197n = i32;
                this.f41189e = iArr9[i32];
                return 0;
            case 22:
                int[] iArr10 = this.m;
                int i33 = this.f41197n;
                this.f41197n = i33 + 1;
                iArr10[i33] = 1;
                return 0;
            case 23:
                int[] iArr11 = this.m;
                int i34 = this.f41197n;
                this.f41197n = i34 + 1;
                iArr11[i34] = 0;
                return 0;
            case 24:
                for (int i35 = this.f41197n - 1; i35 >= 0; i35--) {
                    this.f41199p[i35] = null;
                }
                Object[] objArr8 = this.f41199p;
                this.f41197n = 1;
                objArr8[0] = this.f41193i;
                return 0;
            case 25:
                Object[] objArr9 = this.f41199p;
                int i36 = this.f41197n;
                objArr9[i36] = objArr9[4];
                this.f41197n = i36 + 2;
                objArr9[i36 + 1] = objArr9[5];
                return 0;
            case 26:
                int[] iArr12 = this.m;
                int i37 = this.f41197n;
                iArr12[i37] = 2;
                this.f41197n = i37 + 2;
                iArr12[i37 + 1] = 2;
                return 0;
            case 27:
                int[] iArr13 = this.m;
                int i38 = this.f41197n;
                this.f41197n = i38 + 1;
                iArr13[i38] = 117;
                return 0;
            case 28:
                int i39 = this.f41197n;
                int i40 = i39 - 1;
                this.f41197n = i40;
                int[] iArr14 = this.m;
                iArr14[i39 - 2] = iArr14[i39 - 2] + iArr14[i40];
                return 0;
            case 29:
                int[] iArr15 = this.m;
                int i41 = this.f41197n;
                this.f41197n = i41 + 1;
                iArr15[i41] = iArr15[i41 - 1];
                return 0;
            case 30:
                int[] iArr16 = this.m;
                int i42 = this.f41197n;
                iArr16[i42] = 128;
                this.f41197n = i42;
                iArr16[i42 - 1] = iArr16[i42 - 1] % iArr16[i42];
                return 0;
            case 31:
                int i43 = this.f41197n - 1;
                this.f41197n = i43;
                this.f41189e = this.m[i43] == 0 ? 0 : 1;
                return 0;
            case 32:
                Object[] objArr10 = this.f41199p;
                int i44 = this.f41197n;
                this.f41197n = i44 + 1;
                objArr10[i44] = null;
                int[] iArr17 = this.m;
                Object obj4 = objArr10[i44];
                objArr10[i44] = null;
                iArr17[i44] = ((int[]) obj4).length;
                return 0;
            case 33:
                int[] iArr18 = this.m;
                int i45 = this.f41197n;
                this.f41197n = i45 + 1;
                iArr18[i45] = 5;
                return 0;
            case 34:
                int i46 = this.f41197n;
                int i47 = i46 - 1;
                int[] iArr19 = this.m;
                iArr19[i46 - 2] = iArr19[i46 - 2] + iArr19[i47];
                this.f41197n = i46;
                iArr19[i47] = iArr19[i46 - 2];
                return 0;
            case 35:
                int[] iArr20 = this.m;
                int i48 = this.f41197n;
                iArr20[i48] = 2;
                this.f41197n = i48;
                iArr20[i48 - 1] = iArr20[i48 - 1] % iArr20[i48];
                return 0;
            case 36:
                Object[] objArr11 = this.f41199p;
                int i49 = this.f41197n;
                this.f41197n = i49 + 1;
                objArr11[i49] = this.f41193i;
                return 0;
            case 37:
                int i50 = this.f41197n;
                int i51 = i50 - 1;
                Object[] objArr12 = this.f41199p;
                Object obj5 = objArr12[i51];
                objArr12[i51] = null;
                objArr12[7] = obj5;
                long[] jArr4 = this.f41198o;
                jArr4[i51] = jArr4[4];
                this.f41197n = i50 + 1;
                objArr12[i50] = objArr12[6];
                return 0;
            case 38:
                int[] iArr21 = this.m;
                int i52 = this.f41197n;
                iArr21[i52] = 77;
                iArr21[i52 - 1] = iArr21[i52 - 1] + iArr21[i52];
                this.f41197n = i52 + 1;
                iArr21[i52] = iArr21[i52 - 1];
                return 0;
            case 39:
                int[] iArr22 = this.m;
                int i53 = this.f41197n;
                this.f41197n = i53 + 1;
                iArr22[i53] = 128;
                return 0;
            case 40:
                int[] iArr23 = this.m;
                int i54 = this.f41197n;
                this.f41197n = i54 + 1;
                iArr23[i54] = 79;
                return 0;
            case 41:
                int i55 = this.f41197n;
                int i56 = i55 - 1;
                int[] iArr24 = this.m;
                iArr24[i55 - 2] = iArr24[i55 - 2] + iArr24[i56];
                iArr24[i56] = iArr24[i55 - 2];
                this.f41197n = i55 + 1;
                iArr24[i55] = 128;
                return 0;
            case 42:
                int i57 = this.f41197n - 1;
                this.f41197n = i57;
                Object[] objArr13 = this.f41199p;
                Object obj6 = objArr13[i57];
                objArr13[i57] = null;
                objArr13[7] = obj6;
                return 0;
            case 43:
                Object[] objArr14 = this.f41199p;
                int i58 = this.f41197n;
                this.f41197n = i58 + 1;
                objArr14[i58] = null;
                int[] iArr25 = this.m;
                Object obj7 = objArr14[i58];
                objArr14[i58] = null;
                iArr25[i58] = ((int[]) obj7).length;
                this.f41197n = i58;
                objArr14[i58] = null;
                return 0;
            case 44:
                int i59 = this.f41197n - 1;
                this.f41197n = i59;
                Object[] objArr15 = this.f41199p;
                Object obj8 = objArr15[i59];
                objArr15[i59] = null;
                objArr15[5] = obj8;
                return 0;
            case 45:
                Object[] objArr16 = this.f41199p;
                int i60 = this.f41197n;
                this.f41197n = i60 + 1;
                objArr16[i60] = objArr16[4];
                return 0;
            case 46:
                Object[] objArr17 = this.f41199p;
                int i61 = this.f41197n;
                objArr17[i61] = objArr17[i61 - 1];
                this.f41197n = i61;
                Object obj9 = objArr17[i61];
                objArr17[i61] = null;
                objArr17[6] = obj9;
                return 0;
            case 47:
                int[] iArr26 = this.m;
                int i62 = this.f41197n;
                Object[] objArr18 = this.f41199p;
                Object obj10 = objArr18[i62 - 1];
                objArr18[i62 - 1] = null;
                iArr26[i62 - 1] = ((Object[]) obj10).length;
                return 0;
            case 48:
                int i63 = this.f41197n;
                int i64 = i63 - 1;
                int[] iArr27 = this.m;
                iArr27[7] = iArr27[i64];
                this.f41197n = i63;
                iArr27[i64] = 0;
                return 0;
            case 49:
                int i65 = this.f41197n - 1;
                this.f41197n = i65;
                int[] iArr28 = this.m;
                iArr28[8] = iArr28[i65];
                return 0;
            case 50:
                int i66 = this.f41197n;
                int i67 = i66 - 2;
                this.f41197n = i67;
                int[] iArr29 = this.m;
                this.f41189e = iArr29[i67] >= iArr29[i66 - 1] ? 0 : 1;
                return 0;
            case 51:
                int[] iArr30 = this.m;
                int i68 = this.f41197n;
                iArr30[i68] = iArr30[8];
                this.f41197n = i68 + 2;
                iArr30[i68 + 1] = iArr30[7];
                return 0;
            case 52:
                int[] iArr31 = this.m;
                int i69 = this.f41197n;
                this.f41197n = i69 + 1;
                iArr31[i69] = iArr31[8];
                return 0;
            case 53:
                int i70 = this.f41197n;
                int i71 = i70 - 1;
                this.f41197n = i71;
                Object[] objArr19 = this.f41199p;
                Object obj11 = objArr19[i70 - 2];
                objArr19[i70 - 2] = null;
                objArr19[i70 - 2] = ((Object[]) obj11)[this.m[i71]];
                return 0;
            case 54:
                int i72 = this.f41197n - 1;
                this.f41197n = i72;
                Object[] objArr20 = this.f41199p;
                Object obj12 = objArr20[i72];
                objArr20[i72] = null;
                objArr20[9] = obj12;
                return 0;
            case 55:
                Object[] objArr21 = this.f41199p;
                int i73 = this.f41197n;
                this.f41197n = i73 + 1;
                objArr21[i73] = objArr21[5];
                return 0;
            case 56:
                Object[] objArr22 = this.f41199p;
                int i74 = this.f41197n;
                this.f41197n = i74 + 1;
                objArr22[i74] = objArr22[9];
                return 0;
            case 57:
                int i75 = this.f41197n - 1;
                this.f41197n = i75;
                this.f41199p[i75] = null;
                int[] iArr32 = this.m;
                iArr32[8] = iArr32[8] + 1;
                return 0;
            case 58:
                Object[] objArr23 = this.f41199p;
                int i76 = this.f41197n;
                objArr23[i76] = objArr23[5];
                int[] iArr33 = this.m;
                this.f41197n = i76 + 2;
                iArr33[i76 + 1] = 41;
                return 0;
            case 59:
                int[] iArr34 = this.m;
                int i77 = this.f41197n;
                iArr34[i77] = 2;
                iArr34[i77 + 1] = 2;
                int i78 = i77 + 1;
                this.f41197n = i78;
                iArr34[i77] = iArr34[i77] % iArr34[i78];
                return 0;
            case 60:
                int[] iArr35 = this.m;
                int i79 = this.f41197n;
                iArr35[i79] = 119;
                iArr35[i79 - 1] = iArr35[i79 - 1] + iArr35[i79];
                this.f41197n = i79 + 1;
                iArr35[i79] = iArr35[i79 - 1];
                return 0;
            case 61:
                int[] iArr36 = this.m;
                int i80 = this.f41197n;
                iArr36[i80] = 83;
                this.f41197n = i80;
                iArr36[i80 - 1] = iArr36[i80 - 1] + iArr36[i80];
                return 0;
            case 62:
                int[] iArr37 = this.m;
                int i81 = this.f41197n;
                iArr37[i81] = iArr37[i81 - 1];
                iArr37[i81 + 1] = 128;
                int i82 = i81 + 1;
                this.f41197n = i82;
                iArr37[i81] = iArr37[i81] % iArr37[i82];
                return 0;
            case 63:
                Object[] objArr24 = this.f41199p;
                int i83 = this.f41197n;
                objArr24[i83] = objArr24[6];
                int[] iArr38 = this.m;
                this.f41197n = i83 + 2;
                iArr38[i83 + 1] = iArr38[8];
                return 0;
            case 64:
                int i84 = this.f41197n;
                int i85 = i84 - 1;
                this.f41197n = i85;
                Object[] objArr25 = this.f41199p;
                Object obj13 = objArr25[i84 - 2];
                objArr25[i84 - 2] = null;
                objArr25[i84 - 2] = ((Object[]) obj13)[this.m[i85]];
                int i86 = i84 - 2;
                this.f41197n = i86;
                Object obj14 = objArr25[i86];
                objArr25[i86] = null;
                objArr25[9] = obj14;
                return 0;
            case 65:
                Object[] objArr26 = this.f41199p;
                int i87 = this.f41197n;
                objArr26[i87] = objArr26[5];
                this.f41197n = i87 + 2;
                objArr26[i87 + 1] = objArr26[9];
                return 0;
            case 66:
                int i88 = this.f41197n - 1;
                this.f41197n = i88;
                this.f41199p[i88] = null;
                int[] iArr39 = this.m;
                iArr39[8] = iArr39[8] + 29;
                return 0;
            case 67:
                int[] iArr40 = this.m;
                int i89 = this.f41197n;
                iArr40[i89] = 125;
                iArr40[i89 - 1] = iArr40[i89 - 1] + iArr40[i89];
                this.f41197n = i89 + 1;
                iArr40[i89] = iArr40[i89 - 1];
                return 0;
            case 68:
                int[] iArr41 = this.m;
                int i90 = this.f41197n;
                this.f41197n = i90 + 1;
                iArr41[i90] = 57;
                return 0;
            case 69:
                int[] iArr42 = this.m;
                int i91 = this.f41197n;
                this.f41197n = i91 + 1;
                iArr42[i91] = 20;
                return 0;
            case 70:
                int[] iArr43 = this.m;
                int i92 = this.f41197n;
                this.f41197n = i92 + 1;
                iArr43[i92] = 83;
                return 0;
            case 71:
                int[] iArr44 = this.m;
                int i93 = this.f41197n;
                this.f41197n = i93 + 1;
                iArr44[i93] = 93;
                return 0;
            case 72:
                int i94 = this.f41197n - 1;
                this.f41197n = i94;
                Object[] objArr27 = this.f41199p;
                Object obj15 = objArr27[i94];
                objArr27[i94] = null;
                objArr27[4] = obj15;
                return 0;
            case 73:
                int[] iArr45 = this.m;
                int i95 = this.f41197n;
                this.f41197n = i95 + 1;
                iArr45[i95] = 46;
                return 0;
            case 74:
                int[] iArr46 = this.m;
                int i96 = this.f41197n;
                this.f41197n = i96 + 1;
                iArr46[i96] = 47;
                return 0;
            case 75:
                int[] iArr47 = this.m;
                int i97 = this.f41197n;
                this.f41197n = i97 + 1;
                iArr47[i97] = 59;
                return 0;
            case 76:
                int i98 = this.f41197n;
                int i99 = i98 - 1;
                this.f41197n = i99;
                int[] iArr48 = this.m;
                iArr48[i98 - 2] = iArr48[i98 - 2] % iArr48[i99];
                int i100 = i98 - 2;
                this.f41197n = i100;
                this.f41199p[i100] = null;
                return 0;
            case 77:
                int[] iArr49 = this.m;
                int i101 = this.f41197n;
                this.f41197n = i101 + 1;
                iArr49[i101] = 23;
                return 0;
            case 78:
                int[] iArr50 = this.m;
                int i102 = this.f41197n;
                this.f41197n = i102 + 1;
                iArr50[i102] = 85;
                return 0;
            case 79:
                int[] iArr51 = this.m;
                int i103 = this.f41197n;
                Object[] objArr28 = this.f41199p;
                Object obj16 = objArr28[i103 - 1];
                objArr28[i103 - 1] = null;
                iArr51[i103 - 1] = ((int[]) obj16).length;
                int i104 = i103 - 1;
                this.f41197n = i104;
                objArr28[i104] = null;
                return 0;
            case 80:
                int[] iArr52 = this.m;
                int i105 = this.f41197n;
                this.f41197n = i105 + 1;
                iArr52[i105] = 98;
                return 0;
            case 81:
                int[] iArr53 = this.m;
                int i106 = this.f41197n;
                this.f41197n = i106 + 1;
                iArr53[i106] = 69;
                return 0;
            case 82:
                int[] iArr54 = this.m;
                int i107 = this.f41197n;
                this.f41197n = i107 + 1;
                iArr54[i107] = 64;
                return 0;
            case 83:
                int[] iArr55 = this.m;
                int i108 = this.f41197n;
                this.f41197n = i108 + 1;
                iArr55[i108] = 21;
                return 0;
            default:
                return i10;
        }
    }

    public dh(long j10, Object obj) {
        this.m = new int[10];
        long[] jArr = new long[10];
        this.f41198o = jArr;
        this.f41196l = new float[10];
        this.f41200q = new double[10];
        Object[] objArr = new Object[10];
        this.f41199p = objArr;
        jArr[4] = j10;
        objArr[6] = obj;
        this.f41197n = 0;
        this.f41195k = -1;
    }

    public dh(Object obj, Object obj2) {
        this.m = new int[10];
        this.f41198o = new long[10];
        this.f41196l = new float[10];
        this.f41200q = new double[10];
        Object[] objArr = new Object[10];
        this.f41199p = objArr;
        objArr[4] = obj;
        objArr[5] = obj2;
        this.f41197n = 0;
        this.f41195k = -1;
    }

    public dh(long j10, Object obj, Object obj2) {
        this.m = new int[10];
        long[] jArr = new long[10];
        this.f41198o = jArr;
        this.f41196l = new float[10];
        this.f41200q = new double[10];
        Object[] objArr = new Object[10];
        this.f41199p = objArr;
        jArr[4] = j10;
        objArr[6] = obj;
        objArr[7] = obj2;
        this.f41197n = 0;
        this.f41195k = -1;
    }
}
