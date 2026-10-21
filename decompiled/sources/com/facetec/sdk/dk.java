package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public class dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f41240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f41243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f41245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f41246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f41247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f41248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41249l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long[] f41250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float[] f41251o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final double[] f41252q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object[] f41253s;

    public dk(long j10, long j11) {
        this.f41248k = new int[15];
        long[] jArr = new long[15];
        this.f41250n = jArr;
        this.f41251o = new float[15];
        this.f41252q = new double[15];
        this.f41253s = new Object[15];
        jArr[9] = j10;
        jArr[11] = j11;
        this.f41249l = 0;
        this.m = -1;
    }

    public int a(int i10) {
        switch (i10) {
            case 1:
                int[] iArr = this.f41248k;
                int i11 = this.f41249l;
                this.f41249l = i11 + 1;
                iArr[i11] = iArr[10];
                return 0;
            case 2:
                int i12 = this.f41249l - 1;
                this.f41249l = i12;
                this.f41238a = this.f41248k[i12] == 0 ? 0 : 1;
                return 0;
            case 3:
                int[] iArr2 = this.f41248k;
                int i13 = this.f41249l;
                this.f41249l = i13 + 1;
                iArr2[i13] = this.f41241d;
                return 0;
            case 4:
                Object[] objArr = this.f41253s;
                int i14 = this.f41249l;
                this.f41249l = i14 + 1;
                objArr[i14] = objArr[9];
                return 0;
            case 5:
                int i15 = this.f41249l - this.f41241d;
                this.f41249l = i15;
                this.m = i15;
                return 0;
            case 6:
                Object[] objArr2 = this.f41253s;
                int i16 = this.m;
                this.m = i16 + 1;
                Object obj = objArr2[i16];
                objArr2[i16] = null;
                this.f41243f = obj;
                return 0;
            case 7:
                int[] iArr3 = this.f41248k;
                int i17 = this.m;
                this.m = i17 + 1;
                this.f41238a = iArr3[i17];
                return 0;
            case 8:
                int i18 = this.f41249l;
                int i19 = i18 - 1;
                this.f41249l = i19;
                int[] iArr4 = this.f41248k;
                iArr4[i18 - 2] = iArr4[i18 - 2] | iArr4[i19];
                return 0;
            case 9:
                int[] iArr5 = this.f41248k;
                int i20 = this.f41249l;
                this.f41249l = i20 + 1;
                iArr5[i20] = 2;
                return 0;
            case 10:
                int i21 = this.f41249l;
                int i22 = i21 - 1;
                this.f41249l = i22;
                int[] iArr6 = this.f41248k;
                iArr6[i21 - 2] = iArr6[i21 - 2] % iArr6[i22];
                int i23 = i21 - 2;
                this.f41249l = i23;
                this.f41253s[i23] = null;
                return 0;
            case 12:
                int[] iArr7 = this.f41248k;
                int i24 = this.f41249l;
                this.f41249l = i24 + 1;
                iArr7[i24] = 123;
            case 11:
                return 0;
            case 13:
                int i25 = this.f41249l;
                int i26 = i25 - 1;
                this.f41249l = i26;
                int[] iArr8 = this.f41248k;
                iArr8[i25 - 2] = iArr8[i25 - 2] + iArr8[i26];
                return 0;
            case 14:
                int[] iArr9 = this.f41248k;
                int i27 = this.f41249l;
                iArr9[i27] = iArr9[i27 - 1];
                iArr9[i27 + 1] = 128;
                int i28 = i27 + 1;
                this.f41249l = i28;
                iArr9[i27] = iArr9[i27] % iArr9[i28];
                return 0;
            case 15:
                int[] iArr10 = this.f41248k;
                int i29 = this.f41249l;
                iArr10[i29] = 2;
                this.f41249l = i29;
                iArr10[i29 - 1] = iArr10[i29 - 1] % iArr10[i29];
                return 0;
            case 16:
                int i30 = this.f41249l - 1;
                this.f41249l = i30;
                this.f41238a = this.f41248k[i30] != 0 ? 0 : 1;
                return 0;
            case 17:
                int[] iArr11 = this.f41248k;
                int i31 = this.f41249l;
                iArr11[i31] = 19;
                iArr11[i31 - 1] = iArr11[i31 - 1] + iArr11[i31];
                this.f41249l = i31 + 1;
                iArr11[i31] = iArr11[i31 - 1];
                return 0;
            case 18:
                int[] iArr12 = this.f41248k;
                int i32 = this.f41249l;
                iArr12[i32] = 128;
                this.f41249l = i32;
                iArr12[i32 - 1] = iArr12[i32 - 1] % iArr12[i32];
                return 0;
            case 19:
                Object[] objArr3 = this.f41253s;
                int i33 = this.f41249l;
                Object obj2 = objArr3[i33 - 1];
                objArr3[i33 - 1] = null;
                this.f41243f = obj2;
                return 0;
            case 20:
                Object[] objArr4 = this.f41253s;
                int i34 = this.f41249l;
                this.f41249l = i34 + 1;
                objArr4[i34] = null;
                return 0;
            case 21:
                int i35 = this.f41249l - 1;
                this.f41249l = i35;
                this.f41253s[i35] = null;
                return 0;
            case 22:
                int[] iArr13 = this.f41248k;
                int i36 = this.f41249l - 1;
                this.f41249l = i36;
                this.f41238a = iArr13[i36];
                return 0;
            case 23:
                int[] iArr14 = this.f41248k;
                int i37 = this.f41249l;
                this.f41249l = i37 + 1;
                iArr14[i37] = 7;
                return 0;
            case 24:
                int[] iArr15 = this.f41248k;
                int i38 = this.f41249l;
                this.f41249l = i38 + 1;
                iArr15[i38] = 35;
                return 0;
            case 25:
                int[] iArr16 = this.f41248k;
                int i39 = this.f41249l;
                this.f41249l = i39 + 1;
                iArr16[i39] = 59;
                return 0;
            case 26:
                int[] iArr17 = this.f41248k;
                int i40 = this.f41249l;
                this.f41249l = i40 + 1;
                iArr17[i40] = 77;
                return 0;
            case 27:
                for (int i41 = this.f41249l - 1; i41 >= 0; i41--) {
                    this.f41253s[i41] = null;
                }
                Object[] objArr5 = this.f41253s;
                this.f41249l = 1;
                objArr5[0] = this.f41245h;
                return 0;
            case 28:
                int i42 = this.f41249l;
                int i43 = i42 - 1;
                this.f41249l = i43;
                int[] iArr18 = this.f41248k;
                iArr18[i42 - 2] = iArr18[i42 - 2] & iArr18[i43];
                return 0;
            case 29:
                int i44 = this.f41249l - 1;
                this.f41249l = i44;
                this.f41238a = this.f41248k[i44] <= 0 ? 0 : 1;
                return 0;
            case 30:
                int[] iArr19 = this.f41248k;
                int i45 = this.f41249l;
                this.f41249l = i45 + 1;
                iArr19[i45] = 1;
                return 0;
            case 31:
                this.f41238a = this.f41248k[this.f41249l - 1];
                return 0;
            case 32:
                int[] iArr20 = this.f41248k;
                int i46 = this.f41249l;
                this.f41249l = i46 + 1;
                iArr20[i46] = 0;
                return 0;
            case 33:
                int[] iArr21 = this.f41248k;
                int i47 = this.f41249l;
                iArr21[i47] = 2;
                iArr21[i47 + 1] = 2;
                int i48 = i47 + 1;
                this.f41249l = i48;
                iArr21[i47] = iArr21[i47] % iArr21[i48];
                return 0;
            case 34:
                int[] iArr22 = this.f41248k;
                int i49 = this.f41249l;
                iArr22[i49] = 25;
                this.f41249l = i49;
                iArr22[i49 - 1] = iArr22[i49 - 1] + iArr22[i49];
                return 0;
            case 35:
                int[] iArr23 = this.f41248k;
                int i50 = this.f41249l;
                this.f41249l = i50 + 1;
                iArr23[i50] = iArr23[i50 - 1];
                return 0;
            case 36:
                int[] iArr24 = this.f41248k;
                int i51 = this.f41249l;
                iArr24[i51] = 39;
                this.f41249l = i51 + 2;
                iArr24[i51 + 1] = 0;
                return 0;
            case 37:
                int i52 = this.f41249l;
                int i53 = i52 - 1;
                this.f41249l = i53;
                int[] iArr25 = this.f41248k;
                iArr25[i52 - 2] = iArr25[i52 - 2] / iArr25[i53];
                return 0;
            case 38:
                int[] iArr26 = this.f41248k;
                int i54 = this.f41249l;
                this.f41249l = i54 + 1;
                iArr26[i54] = 17;
                return 0;
            case 39:
                int[] iArr27 = this.f41248k;
                int i55 = this.f41249l;
                this.f41249l = i55 + 1;
                iArr27[i55] = 128;
                return 0;
            case 40:
                int i56 = this.f41249l;
                int i57 = i56 - 1;
                this.f41249l = i57;
                int[] iArr28 = this.f41248k;
                iArr28[i56 - 2] = iArr28[i56 - 2] % iArr28[i57];
                return 0;
            case 41:
                int[] iArr29 = this.f41248k;
                int i58 = this.f41249l;
                this.f41249l = i58 + 1;
                iArr29[i58] = 94;
                return 0;
            case 42:
                int[] iArr30 = this.f41248k;
                int i59 = this.f41249l;
                this.f41249l = i59 + 1;
                iArr30[i59] = 13;
                return 0;
            case 43:
                Object[] objArr6 = this.f41253s;
                int i60 = this.f41249l;
                this.f41249l = i60 + 1;
                objArr6[i60] = this.f41245h;
                return 0;
            case 44:
                Object[] objArr7 = this.f41253s;
                int i61 = this.f41249l;
                this.f41249l = i61 + 1;
                objArr7[i61] = objArr7[10];
                return 0;
            case 45:
                int[] iArr31 = this.f41248k;
                int i62 = this.f41249l;
                this.f41249l = i62 + 1;
                iArr31[i62] = 83;
                return 0;
            case 46:
                int i63 = this.f41249l;
                int i64 = i63 - 1;
                int[] iArr32 = this.f41248k;
                iArr32[i63 - 2] = iArr32[i63 - 2] + iArr32[i64];
                this.f41249l = i63;
                iArr32[i64] = iArr32[i63 - 2];
                return 0;
            case 47:
                int[] iArr33 = this.f41248k;
                int i65 = this.f41249l;
                iArr33[i65] = 63;
                iArr33[i65 - 1] = iArr33[i65 - 1] + iArr33[i65];
                this.f41249l = i65 + 1;
                iArr33[i65] = iArr33[i65 - 1];
                return 0;
            case 48:
                int[] iArr34 = this.f41248k;
                int i66 = this.f41249l;
                this.f41249l = i66 + 1;
                iArr34[i66] = 18;
                return 0;
            case 49:
                int[] iArr35 = this.f41248k;
                int i67 = this.f41249l;
                this.f41249l = i67 + 1;
                iArr35[i67] = 96;
                return 0;
            case 50:
                int[] iArr36 = this.f41248k;
                int i68 = this.f41249l;
                iArr36[i68] = 27;
                iArr36[i68 - 1] = iArr36[i68 - 1] + iArr36[i68];
                this.f41249l = i68 + 1;
                iArr36[i68] = iArr36[i68 - 1];
                return 0;
            case 51:
                int[] iArr37 = this.f41248k;
                int i69 = this.f41249l;
                Object[] objArr8 = this.f41253s;
                Object obj3 = objArr8[i69 - 1];
                objArr8[i69 - 1] = null;
                iArr37[i69 - 1] = ((int[]) obj3).length;
                int i70 = i69 - 1;
                this.f41249l = i70;
                objArr8[i70] = null;
                return 0;
            case 52:
                int[] iArr38 = this.f41248k;
                int i71 = this.f41249l;
                this.f41249l = i71 + 1;
                iArr38[i71] = 79;
                return 0;
            case 53:
                int i72 = this.f41249l;
                int i73 = i72 - 1;
                int[] iArr39 = this.f41248k;
                iArr39[i72 - 2] = iArr39[i72 - 2] + iArr39[i73];
                iArr39[i73] = iArr39[i72 - 2];
                this.f41249l = i72 + 1;
                iArr39[i72] = 128;
                return 0;
            case 54:
                int[] iArr40 = this.f41248k;
                int i74 = this.f41249l;
                iArr40[i74] = 78;
                this.f41249l = i74 + 2;
                iArr40[i74 + 1] = 0;
                return 0;
            case 55:
                int i75 = this.f41249l;
                int i76 = i75 - 1;
                this.f41249l = i76;
                int[] iArr41 = this.f41248k;
                iArr41[i75 - 2] = iArr41[i75 - 2] / iArr41[i76];
                int i77 = i75 - 2;
                this.f41249l = i77;
                this.f41253s[i77] = null;
                return 0;
            case 56:
                int[] iArr42 = this.f41248k;
                int i78 = this.f41249l;
                iArr42[i78] = 2;
                this.f41249l = i78 + 2;
                iArr42[i78 + 1] = 2;
                return 0;
            case 57:
                int[] iArr43 = this.f41248k;
                int i79 = this.f41249l;
                iArr43[i79] = 109;
                this.f41249l = i79;
                iArr43[i79 - 1] = iArr43[i79 - 1] + iArr43[i79];
                return 0;
            case 58:
                int[] iArr44 = this.f41248k;
                int i80 = this.f41249l;
                iArr44[i80] = iArr44[i80 - 1];
                this.f41249l = i80 + 2;
                iArr44[i80 + 1] = 128;
                return 0;
            case 59:
                int[] iArr45 = this.f41248k;
                int i81 = this.f41249l;
                iArr45[i81] = 35;
                iArr45[i81 - 1] = iArr45[i81 - 1] + iArr45[i81];
                this.f41249l = i81 + 1;
                iArr45[i81] = iArr45[i81 - 1];
                return 0;
            case 60:
                int[] iArr46 = this.f41248k;
                int i82 = this.f41249l;
                iArr46[i82] = -1;
                iArr46[10] = iArr46[i82];
                Object[] objArr9 = this.f41253s;
                this.f41249l = i82 + 1;
                objArr9[i82] = objArr9[9];
                return 0;
            case 61:
                int[] iArr47 = this.f41248k;
                int i83 = this.f41249l;
                this.f41249l = i83 + 1;
                iArr47[i83] = 48;
                return 0;
            case 62:
                int[] iArr48 = this.f41248k;
                int i84 = this.f41249l;
                iArr48[i84 - 1] = -iArr48[i84 - 1];
                return 0;
            case 63:
                int[] iArr49 = this.f41248k;
                int i85 = this.f41249l;
                iArr49[i85] = 0;
                this.f41249l = i85;
                iArr49[10] = iArr49[i85];
                return 0;
            case 64:
                Object[] objArr10 = this.f41253s;
                int i86 = this.f41249l;
                objArr10[i86] = objArr10[9];
                int[] iArr50 = this.f41248k;
                this.f41249l = i86 + 2;
                iArr50[i86 + 1] = 0;
                return 0;
            case 65:
                long[] jArr = this.f41250n;
                int i87 = this.f41249l;
                this.f41249l = i87 + 1;
                jArr[i87] = this.f41239b;
                return 0;
            case 66:
                int[] iArr51 = this.f41248k;
                int i88 = this.f41249l;
                iArr51[i88 - 1] = (char) iArr51[i88 - 1];
                this.f41249l = i88 + 1;
                iArr51[i88] = -1;
                return 0;
            case 67:
                long[] jArr2 = this.f41250n;
                int i89 = this.f41249l;
                jArr2[i89] = 0;
                int[] iArr52 = this.f41248k;
                iArr52[i89 - 1] = (jArr2[i89 - 1] > jArr2[i89] ? 1 : (jArr2[i89 - 1] == jArr2[i89] ? 0 : -1));
                int i90 = i89 - 1;
                this.f41249l = i90;
                iArr52[i89 - 2] = iArr52[i89 - 2] + iArr52[i90];
                return 0;
            case 68:
                int[] iArr53 = this.f41248k;
                int i91 = this.f41249l;
                iArr53[i91] = 48;
                this.f41249l = i91 + 2;
                iArr53[i91 + 1] = 0;
                return 0;
            case 69:
                int[] iArr54 = this.f41248k;
                int i92 = this.f41249l;
                iArr54[i92] = 1;
                this.f41249l = i92;
                iArr54[10] = iArr54[i92];
                return 0;
            case 70:
                int[] iArr55 = this.f41248k;
                int i93 = this.f41249l;
                iArr55[i93] = 2;
                this.f41249l = i93;
                iArr55[10] = iArr55[i93];
                return 0;
            case 71:
                int[] iArr56 = this.f41248k;
                int i94 = this.f41249l;
                iArr56[i94] = 1;
                this.f41249l = i94 + 2;
                iArr56[i94 + 1] = 0;
                return 0;
            case 72:
                int[] iArr57 = this.f41248k;
                int i95 = this.f41249l;
                iArr57[i95] = 3;
                this.f41249l = i95;
                iArr57[10] = iArr57[i95];
                return 0;
            case 73:
                int i96 = this.f41249l;
                int i97 = i96 - 1;
                this.f41249l = i97;
                int[] iArr58 = this.f41248k;
                iArr58[i96 - 2] = iArr58[i96 - 2] + iArr58[i97];
                iArr58[i96 - 2] = (char) iArr58[i96 - 2];
                return 0;
            case 74:
                long[] jArr3 = this.f41250n;
                int i98 = this.f41249l;
                this.f41249l = i98 + 1;
                jArr3[i98] = 0;
                return 0;
            case 75:
                int i99 = this.f41249l;
                int i100 = i99 - 1;
                this.f41249l = i100;
                long[] jArr4 = this.f41250n;
                this.f41248k[i99 - 2] = (jArr4[i99 - 2] > jArr4[i100] ? 1 : (jArr4[i99 - 2] == jArr4[i100] ? 0 : -1));
                return 0;
            case 76:
                int[] iArr59 = this.f41248k;
                int i101 = this.f41249l;
                this.f41249l = i101 + 1;
                iArr59[i101] = 4;
                return 0;
            case 77:
                int i102 = this.f41249l - 1;
                this.f41249l = i102;
                int[] iArr60 = this.f41248k;
                iArr60[10] = iArr60[i102];
                return 0;
            case 78:
                Object[] objArr11 = this.f41253s;
                int i103 = this.f41249l;
                objArr11[i103] = objArr11[9];
                int[] iArr61 = this.f41248k;
                iArr61[i103 + 1] = 0;
                this.f41249l = i103 + 3;
                iArr61[i103 + 2] = 0;
                return 0;
            case 79:
                int[] iArr62 = this.f41248k;
                int i104 = this.f41249l;
                iArr62[i104 - 1] = (char) iArr62[i104 - 1];
                this.f41249l = i104 + 1;
                iArr62[i104] = 2;
                return 0;
            case 80:
                int i105 = this.f41249l;
                int[] iArr63 = this.f41248k;
                long[] jArr5 = this.f41250n;
                iArr63[i105 - 2] = (jArr5[i105 - 2] > jArr5[i105 - 1] ? 1 : (jArr5[i105 - 2] == jArr5[i105 - 1] ? 0 : -1));
                int i106 = i105 - 2;
                iArr63[i105 - 3] = iArr63[i105 - 3] + iArr63[i106];
                this.f41249l = i105 - 1;
                iArr63[i106] = 1;
                return 0;
            case 81:
                int[] iArr64 = this.f41248k;
                int i107 = this.f41249l;
                iArr64[i107] = 16;
                this.f41249l = i107;
                iArr64[i107 - 1] = iArr64[i107 - 1] >> iArr64[i107];
                return 0;
            case 82:
                int[] iArr65 = this.f41248k;
                int i108 = this.f41249l;
                iArr65[i108] = 5;
                this.f41249l = i108;
                iArr65[10] = iArr65[i108];
                return 0;
            case 83:
                int[] iArr66 = this.f41248k;
                int i109 = this.f41249l;
                this.f41249l = i109 + 1;
                iArr66[i109] = 93;
                return 0;
            case 84:
                int[] iArr67 = this.f41248k;
                int i110 = this.f41249l;
                iArr67[i110] = 113;
                iArr67[i110 - 1] = iArr67[i110 - 1] + iArr67[i110];
                this.f41249l = i110 + 1;
                iArr67[i110] = iArr67[i110 - 1];
                return 0;
            case 85:
                int[] iArr68 = this.f41248k;
                int i111 = this.f41249l;
                this.f41249l = i111 + 1;
                iArr68[i111] = 105;
                return 0;
            case 86:
                int[] iArr69 = this.f41248k;
                int i112 = this.f41249l;
                this.f41249l = i112 + 1;
                iArr69[i112] = 23;
                return 0;
            case 87:
                int[] iArr70 = this.f41248k;
                int i113 = this.f41249l;
                this.f41249l = i113 + 1;
                iArr70[i113] = 29;
                return 0;
            case 88:
                int[] iArr71 = this.f41248k;
                int i114 = this.f41249l;
                this.f41249l = i114 + 1;
                iArr71[i114] = 82;
                return 0;
            case 89:
                int[] iArr72 = this.f41248k;
                int i115 = this.f41249l;
                this.f41249l = i115 + 1;
                iArr72[i115] = 70;
                return 0;
            case 90:
                int[] iArr73 = this.f41248k;
                int i116 = this.f41249l;
                this.f41249l = i116 + 1;
                iArr73[i116] = 65;
                return 0;
            case 91:
                int[] iArr74 = this.f41248k;
                int i117 = this.f41249l;
                this.f41249l = i117 + 1;
                iArr74[i117] = 0;
                return 0;
            case 92:
                int[] iArr75 = this.f41248k;
                int i118 = this.f41249l;
                this.f41249l = i118 + 1;
                iArr75[i118] = 21;
                return 0;
            case 93:
                int i119 = this.f41249l;
                int i120 = i119 - 2;
                this.f41249l = i120;
                int[] iArr76 = this.f41248k;
                this.f41238a = iArr76[i120] < iArr76[i119 - 1] ? 0 : 1;
                return 0;
            case 94:
                Object[] objArr12 = this.f41253s;
                int i121 = this.f41249l;
                objArr12[i121] = objArr12[i121 - 1];
                this.f41249l = i121;
                Object obj4 = objArr12[i121];
                objArr12[i121] = null;
                objArr12[11] = obj4;
                return 0;
            case 95:
                int[] iArr77 = this.f41248k;
                int i122 = this.f41249l;
                Object[] objArr13 = this.f41253s;
                Object obj5 = objArr13[i122 - 1];
                objArr13[i122 - 1] = null;
                iArr77[i122 - 1] = ((Object[]) obj5).length;
                return 0;
            case 96:
                int i123 = this.f41249l;
                int i124 = i123 - 1;
                int[] iArr78 = this.f41248k;
                iArr78[12] = iArr78[i124];
                this.f41249l = i123;
                iArr78[i124] = 0;
                return 0;
            case 97:
                int i125 = this.f41249l - 1;
                this.f41249l = i125;
                int[] iArr79 = this.f41248k;
                iArr79[13] = iArr79[i125];
                return 0;
            case 98:
                int[] iArr80 = this.f41248k;
                int i126 = this.f41249l;
                iArr80[i126] = iArr80[13];
                this.f41249l = i126 + 2;
                iArr80[i126 + 1] = iArr80[12];
                return 0;
            case 99:
                int i127 = this.f41249l;
                int i128 = i127 - 2;
                this.f41249l = i128;
                int[] iArr81 = this.f41248k;
                this.f41238a = iArr81[i128] >= iArr81[i127 - 1] ? 0 : 1;
                return 0;
            case 100:
                Object[] objArr14 = this.f41253s;
                int i129 = this.f41249l;
                this.f41249l = i129 + 1;
                objArr14[i129] = objArr14[11];
                return 0;
            case 101:
                int[] iArr82 = this.f41248k;
                int i130 = this.f41249l;
                iArr82[i130] = iArr82[13];
                this.f41249l = i130;
                Object[] objArr15 = this.f41253s;
                Object obj6 = objArr15[i130 - 1];
                objArr15[i130 - 1] = null;
                objArr15[i130 - 1] = ((Object[]) obj6)[iArr82[i130]];
                return 0;
            case 102:
                int i131 = this.f41249l;
                int[] iArr83 = this.f41248k;
                long[] jArr6 = this.f41250n;
                iArr83[i131 - 2] = (jArr6[i131 - 2] > jArr6[i131 - 1] ? 1 : (jArr6[i131 - 2] == jArr6[i131 - 1] ? 0 : -1));
                int i132 = i131 - 2;
                this.f41249l = i132;
                iArr83[i131 - 3] = iArr83[i131 - 3] + iArr83[i132];
                return 0;
            case 103:
                int[] iArr84 = this.f41248k;
                iArr84[13] = iArr84[13] + 1;
                return 0;
            case 104:
                int[] iArr85 = this.f41248k;
                int i133 = this.f41249l;
                this.f41249l = i133 + 1;
                iArr85[i133] = 43;
                return 0;
            case 105:
                int[] iArr86 = this.f41248k;
                int i134 = this.f41249l;
                iArr86[i134] = 105;
                this.f41249l = i134;
                iArr86[i134 - 1] = iArr86[i134 - 1] + iArr86[i134];
                return 0;
            case 106:
                Object[] objArr16 = this.f41253s;
                int i135 = this.f41249l;
                this.f41249l = i135 + 1;
                objArr16[i135] = null;
                int[] iArr87 = this.f41248k;
                Object obj7 = objArr16[i135];
                objArr16[i135] = null;
                iArr87[i135] = ((int[]) obj7).length;
                return 0;
            case 107:
                int[] iArr88 = this.f41248k;
                int i136 = this.f41249l;
                this.f41249l = i136 + 1;
                iArr88[i136] = 75;
                return 0;
            case 108:
                int[] iArr89 = this.f41248k;
                int i137 = this.f41249l;
                this.f41249l = i137 + 1;
                iArr89[i137] = 41;
                return 0;
            case 109:
                int[] iArr90 = this.f41248k;
                int i138 = this.f41249l;
                this.f41249l = i138 + 1;
                iArr90[i138] = 54;
                return 0;
            case 110:
                int[] iArr91 = this.f41248k;
                int i139 = this.f41249l;
                this.f41249l = i139 + 1;
                iArr91[i139] = 34;
                return 0;
            case 111:
                int[] iArr92 = this.f41248k;
                int i140 = this.f41249l;
                iArr92[i140] = 97;
                iArr92[i140 - 1] = iArr92[i140 - 1] + iArr92[i140];
                this.f41249l = i140 + 1;
                iArr92[i140] = iArr92[i140 - 1];
                return 0;
            case 112:
                int[] iArr93 = this.f41248k;
                int i141 = this.f41249l;
                this.f41249l = i141 + 1;
                iArr93[i141] = 97;
                return 0;
            case 113:
                int[] iArr94 = this.f41248k;
                int i142 = this.f41249l;
                this.f41249l = i142 + 1;
                iArr94[i142] = 73;
                return 0;
            case 114:
                int[] iArr95 = this.f41248k;
                int i143 = this.f41249l;
                this.f41249l = i143 + 1;
                iArr95[i143] = 46;
                return 0;
            case 115:
                int[] iArr96 = this.f41248k;
                int i144 = this.f41249l;
                this.f41249l = i144 + 1;
                iArr96[i144] = 55;
                return 0;
            case 116:
                int[] iArr97 = this.f41248k;
                int i145 = this.f41249l;
                iArr97[i145] = iArr97[i145 - 1];
                iArr97[10] = iArr97[i145];
                Object[] objArr17 = this.f41253s;
                this.f41249l = i145 + 1;
                objArr17[i145] = objArr17[9];
                return 0;
            case 117:
                int i146 = this.f41249l;
                int i147 = i146 - 2;
                this.f41249l = i147;
                int[] iArr98 = this.f41248k;
                this.f41238a = iArr98[i147] == iArr98[i146 - 1] ? 0 : 1;
                return 0;
            case 118:
                int[] iArr99 = this.f41248k;
                int i148 = this.f41249l;
                iArr99[i148] = iArr99[10];
                Object[] objArr18 = this.f41253s;
                objArr18[i148 + 1] = objArr18[9];
                this.f41249l = i148 + 3;
                iArr99[i148 + 2] = iArr99[10];
                return 0;
            case 119:
                int[] iArr100 = this.f41248k;
                int i149 = this.f41249l;
                iArr100[i149] = iArr100[10];
                Object[] objArr19 = this.f41253s;
                this.f41249l = i149 + 2;
                objArr19[i149 + 1] = objArr19[9];
                return 0;
            case 120:
                Object[] objArr20 = this.f41253s;
                int i150 = this.f41249l;
                objArr20[i150] = objArr20[9];
                int[] iArr101 = this.f41248k;
                this.f41249l = i150 + 2;
                iArr101[i150 + 1] = iArr101[10];
                return 0;
            case 121:
                int[] iArr102 = this.f41248k;
                int i151 = this.f41249l;
                iArr102[i151] = 73;
                iArr102[i151 - 1] = iArr102[i151 - 1] + iArr102[i151];
                this.f41249l = i151 + 1;
                iArr102[i151] = iArr102[i151 - 1];
                return 0;
            case 122:
                int[] iArr103 = this.f41248k;
                int i152 = this.f41249l;
                iArr103[i152] = 3;
                this.f41249l = i152;
                iArr103[i152 - 1] = iArr103[i152 - 1] + iArr103[i152];
                return 0;
            case 123:
                int[] iArr104 = this.f41248k;
                int i153 = this.f41249l;
                iArr104[i153] = 7;
                this.f41249l = i153;
                iArr104[i153 - 1] = iArr104[i153 - 1] + iArr104[i153];
                return 0;
            case 124:
                int[] iArr105 = this.f41248k;
                int i154 = this.f41249l;
                this.f41249l = i154 + 1;
                iArr105[i154] = 109;
                return 0;
            case 125:
                Object[] objArr21 = this.f41253s;
                int i155 = this.f41249l;
                this.f41249l = i155 + 1;
                objArr21[i155] = null;
                int[] iArr106 = this.f41248k;
                Object obj8 = objArr21[i155];
                objArr21[i155] = null;
                iArr106[i155] = ((int[]) obj8).length;
                this.f41249l = i155;
                objArr21[i155] = null;
                return 0;
            case 126:
                int[] iArr107 = this.f41248k;
                int i156 = this.f41249l;
                this.f41249l = i156 + 1;
                iArr107[i156] = 95;
                return 0;
            case 127:
                int i157 = this.f41249l - 1;
                this.f41249l = i157;
                Object[] objArr22 = this.f41253s;
                Object obj9 = objArr22[i157];
                objArr22[i157] = null;
                objArr22[11] = obj9;
                return 0;
            case 128:
                int[] iArr108 = this.f41248k;
                int i158 = this.f41249l;
                iArr108[i158] = iArr108[10];
                Object[] objArr23 = this.f41253s;
                this.f41249l = i158 + 2;
                objArr23[i158 + 1] = objArr23[11];
                return 0;
            case 129:
                int[] iArr109 = this.f41248k;
                int i159 = this.f41249l;
                iArr109[i159] = 17;
                this.f41249l = i159;
                iArr109[i159 - 1] = iArr109[i159 - 1] + iArr109[i159];
                return 0;
            case 130:
                long[] jArr7 = this.f41250n;
                int i160 = this.m;
                this.m = i160 + 1;
                this.f41242e = jArr7[i160];
                return 0;
            case 131:
                int i161 = this.f41249l;
                int i162 = i161 - 1;
                this.f41253s[i162] = null;
                long[] jArr8 = this.f41250n;
                this.f41249l = i161;
                jArr8[i162] = 0;
                return 0;
            case 132:
                int i163 = this.f41249l;
                int i164 = i163 - 1;
                this.f41253s[i164] = null;
                int[] iArr110 = this.f41248k;
                this.f41249l = i163;
                iArr110[i164] = 0;
                return 0;
            case 133:
                int[] iArr111 = this.f41248k;
                int i165 = this.f41249l;
                iArr111[i165] = 69;
                this.f41249l = i165;
                iArr111[i165 - 1] = iArr111[i165 - 1] + iArr111[i165];
                return 0;
            case 134:
                int[] iArr112 = this.f41248k;
                int i166 = this.f41249l;
                this.f41249l = i166 + 1;
                iArr112[i166] = 49;
                return 0;
            case 135:
                int[] iArr113 = this.f41248k;
                int i167 = this.f41249l;
                iArr113[i167] = 55;
                this.f41249l = i167;
                iArr113[i167 - 1] = iArr113[i167 - 1] + iArr113[i167];
                return 0;
            case 136:
                int[] iArr114 = this.f41248k;
                int i168 = this.f41249l;
                this.f41249l = i168 + 1;
                iArr114[i168] = 63;
                return 0;
            case 137:
                int[] iArr115 = this.f41248k;
                int i169 = this.f41249l;
                iArr115[i169] = 111;
                this.f41249l = i169;
                iArr115[i169 - 1] = iArr115[i169 - 1] + iArr115[i169];
                return 0;
            case 138:
                int[] iArr116 = this.f41248k;
                int i170 = this.f41249l;
                Object[] objArr24 = this.f41253s;
                Object obj10 = objArr24[i170 - 1];
                objArr24[i170 - 1] = null;
                iArr116[i170 - 1] = ((int[]) obj10).length;
                return 0;
            case 139:
                int i171 = this.f41249l - 1;
                this.f41249l = i171;
                int[] iArr117 = this.f41248k;
                iArr117[9] = iArr117[i171];
                return 0;
            case 140:
                int[] iArr118 = this.f41248k;
                int i172 = this.f41249l;
                iArr118[i172] = 0;
                this.f41249l = i172 + 2;
                iArr118[i172 + 1] = 0;
                return 0;
            case 141:
                int i173 = this.f41249l;
                int i174 = i173 - 1;
                int[] iArr119 = this.f41248k;
                iArr119[i173 - 2] = iArr119[i173 - 2] + iArr119[i174];
                iArr119[i173 - 2] = (char) iArr119[i173 - 2];
                this.f41249l = i173;
                iArr119[i174] = 47;
                return 0;
            case 142:
                int i175 = this.f41249l;
                int i176 = i175 - 1;
                int[] iArr120 = this.f41248k;
                iArr120[i175 - 2] = iArr120[i175 - 2] + iArr120[i176];
                this.f41249l = i175;
                iArr120[i176] = 13;
                return 0;
            case 143:
                long[] jArr9 = this.f41250n;
                int i177 = this.f41249l;
                jArr9[i177] = 0;
                int[] iArr121 = this.f41248k;
                iArr121[i177 - 1] = (jArr9[i177 - 1] > jArr9[i177] ? 1 : (jArr9[i177 - 1] == jArr9[i177] ? 0 : -1));
                int i178 = i177 - 1;
                this.f41249l = i178;
                iArr121[i177 - 2] = iArr121[i177 - 2] - iArr121[i178];
                return 0;
            case 144:
                Object[] objArr25 = this.f41253s;
                int i179 = this.f41249l;
                this.f41249l = i179 + 1;
                objArr25[i179] = objArr25[i179 - 1];
                return 0;
            case 145:
                int i180 = this.f41249l - 1;
                this.f41249l = i180;
                Object[] objArr26 = this.f41253s;
                Object obj11 = objArr26[i180];
                objArr26[i180] = null;
                objArr26[10] = obj11;
                return 0;
            case 146:
                int i181 = this.f41249l;
                int i182 = i181 - 1;
                this.f41249l = i182;
                Object[] objArr27 = this.f41253s;
                Object obj12 = objArr27[i182];
                objArr27[i182] = null;
                objArr27[11] = obj12;
                int[] iArr122 = this.f41248k;
                Object obj13 = objArr27[i181 - 2];
                objArr27[i181 - 2] = null;
                iArr122[i181 - 2] = ((Object[]) obj13).length;
                int i183 = i181 - 2;
                this.f41249l = i183;
                iArr122[12] = iArr122[i183];
                return 0;
            case 147:
                Object[] objArr28 = this.f41253s;
                int i184 = this.f41249l;
                objArr28[i184] = objArr28[11];
                int[] iArr123 = this.f41248k;
                this.f41249l = i184 + 2;
                iArr123[i184 + 1] = iArr123[13];
                return 0;
            case 148:
                int i185 = this.f41249l;
                int i186 = i185 - 1;
                this.f41249l = i186;
                Object[] objArr29 = this.f41253s;
                Object obj14 = objArr29[i185 - 2];
                objArr29[i185 - 2] = null;
                objArr29[i185 - 2] = ((Object[]) obj14)[this.f41248k[i186]];
                return 0;
            case 149:
                int i187 = this.f41249l;
                int i188 = i187 - 1;
                Object[] objArr30 = this.f41253s;
                Object obj15 = objArr30[i188];
                objArr30[i188] = null;
                objArr30[14] = obj15;
                objArr30[i188] = objArr30[10];
                this.f41249l = i187 + 1;
                objArr30[i187] = objArr30[14];
                return 0;
            case 150:
                int[] iArr124 = this.f41248k;
                int i189 = this.f41249l;
                iArr124[i189] = 1;
                this.f41249l = i189;
                iArr124[9] = iArr124[i189];
                return 0;
            case 151:
                int[] iArr125 = this.f41248k;
                int i190 = this.f41249l;
                this.f41249l = i190 + 1;
                iArr125[i190] = iArr125[9];
                return 0;
            case 152:
                int[] iArr126 = this.f41248k;
                int i191 = this.f41249l;
                iArr126[i191] = 11;
                this.f41249l = i191;
                iArr126[i191 - 1] = iArr126[i191 - 1] + iArr126[i191];
                return 0;
            case 153:
                int[] iArr127 = this.f41248k;
                int i192 = this.f41249l;
                iArr127[i192] = 31;
                this.f41249l = i192;
                iArr127[i192 - 1] = iArr127[i192 - 1] + iArr127[i192];
                return 0;
            case 154:
                int[] iArr128 = this.f41248k;
                int i193 = this.f41249l;
                this.f41249l = i193 + 1;
                iArr128[i193] = 68;
                return 0;
            case 155:
                int[] iArr129 = this.f41248k;
                int i194 = this.f41249l;
                this.f41249l = i194 + 1;
                iArr129[i194] = 28;
                return 0;
            case 156:
                int[] iArr130 = this.f41248k;
                int i195 = this.f41249l;
                iArr130[i195] = 79;
                iArr130[i195 - 1] = iArr130[i195 - 1] + iArr130[i195];
                this.f41249l = i195 + 1;
                iArr130[i195] = iArr130[i195 - 1];
                return 0;
            case 157:
                int[] iArr131 = this.f41248k;
                int i196 = this.f41249l;
                this.f41249l = i196 + 1;
                iArr131[i196] = 62;
                return 0;
            case 158:
                int[] iArr132 = this.f41248k;
                int i197 = this.f41249l;
                iArr132[i197] = 5;
                iArr132[i197 - 1] = iArr132[i197 - 1] + iArr132[i197];
                this.f41249l = i197 + 1;
                iArr132[i197] = iArr132[i197 - 1];
                return 0;
            case 159:
                int[] iArr133 = this.f41248k;
                int i198 = this.f41249l;
                this.f41249l = i198 + 1;
                iArr133[i198] = 10;
                return 0;
            case 160:
                int[] iArr134 = this.f41248k;
                int i199 = this.f41249l;
                this.f41249l = i199 + 1;
                iArr134[i199] = 88;
                return 0;
            case 161:
                int[] iArr135 = this.f41248k;
                int i200 = this.f41249l;
                iArr135[i200] = 71;
                iArr135[i200 - 1] = iArr135[i200 - 1] + iArr135[i200];
                this.f41249l = i200 + 1;
                iArr135[i200] = iArr135[i200 - 1];
                return 0;
            case 162:
                int[] iArr136 = this.f41248k;
                int i201 = this.f41249l;
                this.f41249l = i201 + 1;
                iArr136[i201] = 69;
                return 0;
            case 163:
                Object[] objArr31 = this.f41253s;
                int i202 = this.f41249l;
                objArr31[i202] = objArr31[9];
                int[] iArr137 = this.f41248k;
                this.f41249l = i202 + 2;
                iArr137[i202 + 1] = 1;
                return 0;
            case 164:
                int[] iArr138 = this.f41248k;
                int i203 = this.f41249l;
                this.f41249l = i203 + 1;
                iArr138[i203] = 66;
                return 0;
            case 165:
                int[] iArr139 = this.f41248k;
                int i204 = this.f41249l;
                iArr139[i204] = 13;
                iArr139[i204 - 1] = iArr139[i204 - 1] + iArr139[i204];
                this.f41249l = i204 + 1;
                iArr139[i204] = iArr139[i204 - 1];
                return 0;
            case 166:
                int[] iArr140 = this.f41248k;
                int i205 = this.f41249l;
                iArr140[i205] = 121;
                iArr140[i205 - 1] = iArr140[i205 - 1] + iArr140[i205];
                this.f41249l = i205 + 1;
                iArr140[i205] = iArr140[i205 - 1];
                return 0;
            case 167:
                int[] iArr141 = this.f41248k;
                int i206 = this.f41249l;
                this.f41249l = i206 + 1;
                iArr141[i206] = 91;
                return 0;
            case 168:
                int[] iArr142 = this.f41248k;
                int i207 = this.f41249l;
                this.f41249l = i207 + 1;
                iArr142[i207] = 1;
                return 0;
            default:
                return i10;
        }
    }

    public dk() {
        this.f41248k = new int[15];
        this.f41250n = new long[15];
        this.f41251o = new float[15];
        this.f41252q = new double[15];
        this.f41253s = new Object[15];
        this.f41249l = 0;
        this.m = -1;
    }

    public dk(Object obj, Object obj2, Object obj3) {
        this.f41248k = new int[15];
        this.f41250n = new long[15];
        this.f41251o = new float[15];
        this.f41252q = new double[15];
        Object[] objArr = new Object[15];
        this.f41253s = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        this.f41249l = 0;
        this.m = -1;
    }

    public dk(Object obj) {
        this.f41248k = new int[15];
        this.f41250n = new long[15];
        this.f41251o = new float[15];
        this.f41252q = new double[15];
        Object[] objArr = new Object[15];
        this.f41253s = objArr;
        objArr[9] = obj;
        this.f41249l = 0;
        this.m = -1;
    }

    public dk(Object obj, int i10) {
        int[] iArr = new int[15];
        this.f41248k = iArr;
        this.f41250n = new long[15];
        this.f41251o = new float[15];
        this.f41252q = new double[15];
        Object[] objArr = new Object[15];
        this.f41253s = objArr;
        objArr[9] = obj;
        iArr[10] = i10;
        this.f41249l = 0;
        this.m = -1;
    }
}
