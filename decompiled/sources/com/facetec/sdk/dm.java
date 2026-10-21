package com.facetec.sdk;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.veridas.detect.ImageAnalysisKt;

/* JADX INFO: loaded from: classes9.dex */
public class dm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f41271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f41274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f41275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f41276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f41277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f41279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long[] f41281l;
    private final int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f41282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object[] f41284p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double[] f41285t;

    public dm(int i10) {
        int[] iArr = new int[15];
        this.m = iArr;
        this.f41281l = new long[15];
        this.f41282n = new float[15];
        this.f41285t = new double[15];
        this.f41284p = new Object[15];
        iArr[8] = i10;
        this.f41280k = 0;
        this.f41283o = -1;
    }

    public int e(int i10) {
        switch (i10) {
            case 1:
                int[] iArr = this.m;
                int i11 = this.f41280k;
                this.f41280k = i11 + 1;
                iArr[i11] = this.f41270a;
                return 0;
            case 2:
                int[] iArr2 = this.m;
                int i12 = this.f41280k;
                iArr2[i12] = 2;
                iArr2[i12 + 1] = 2;
                int i13 = i12 + 1;
                this.f41280k = i13;
                iArr2[i12] = iArr2[i12] % iArr2[i13];
                return 0;
            case 3:
                int i14 = this.f41280k - 1;
                this.f41280k = i14;
                this.f41284p[i14] = null;
                return 0;
            case 4:
                this.f41273d = this.m[this.f41280k - 1];
                return 0;
            case 6:
                int[] iArr3 = this.m;
                int i15 = this.f41280k;
                this.f41280k = i15 + 1;
                iArr3[i15] = 9;
            case 5:
                return 0;
            case 7:
                int i16 = this.f41280k;
                int i17 = i16 - 1;
                int[] iArr4 = this.m;
                iArr4[i16 - 2] = iArr4[i16 - 2] + iArr4[i17];
                this.f41280k = i16;
                iArr4[i17] = iArr4[i16 - 2];
                return 0;
            case 8:
                int[] iArr5 = this.m;
                int i18 = this.f41280k;
                iArr5[i18] = 128;
                this.f41280k = i18;
                iArr5[i18 - 1] = iArr5[i18 - 1] % iArr5[i18];
                return 0;
            case 9:
                int i19 = this.f41280k - this.f41270a;
                this.f41280k = i19;
                this.f41283o = i19;
                return 0;
            case 10:
                int[] iArr6 = this.m;
                int i20 = this.f41283o;
                this.f41283o = i20 + 1;
                this.f41273d = iArr6[i20];
                return 0;
            case 11:
                int[] iArr7 = this.m;
                int i21 = this.f41280k;
                iArr7[i21] = 2;
                this.f41280k = i21;
                iArr7[i21 - 1] = iArr7[i21 - 1] % iArr7[i21];
                return 0;
            case 12:
                int i22 = this.f41280k - 1;
                this.f41280k = i22;
                this.f41273d = this.m[i22] == 0 ? 0 : 1;
                return 0;
            case 13:
                Object[] objArr = this.f41284p;
                int i23 = this.f41280k;
                Object obj = objArr[i23 - 1];
                objArr[i23 - 1] = null;
                this.f41278i = obj;
                return 0;
            case 14:
                Object[] objArr2 = this.f41284p;
                int i24 = this.f41280k;
                this.f41280k = i24 + 1;
                objArr2[i24] = null;
                return 0;
            case 15:
                Object[] objArr3 = this.f41284p;
                int i25 = this.f41283o;
                this.f41283o = i25 + 1;
                Object obj2 = objArr3[i25];
                objArr3[i25] = null;
                this.f41278i = obj2;
                return 0;
            case 16:
                int[] iArr8 = this.m;
                int i26 = this.f41280k - 1;
                this.f41280k = i26;
                this.f41273d = iArr8[i26];
                return 0;
            case 17:
                int[] iArr9 = this.m;
                int i27 = this.f41280k;
                this.f41280k = i27 + 1;
                iArr9[i27] = 1;
                return 0;
            case 18:
                int[] iArr10 = this.m;
                int i28 = this.f41280k;
                this.f41280k = i28 + 1;
                iArr10[i28] = 0;
                return 0;
            case 19:
                for (int i29 = this.f41280k - 1; i29 >= 0; i29--) {
                    this.f41284p[i29] = null;
                }
                Object[] objArr4 = this.f41284p;
                this.f41280k = 1;
                objArr4[0] = this.f41277h;
                return 0;
            case 20:
                Object[] objArr5 = this.f41284p;
                int i30 = this.f41280k;
                this.f41280k = i30 + 1;
                objArr5[i30] = this.f41277h;
                return 0;
            case 21:
                int[] iArr11 = this.m;
                int i31 = this.f41280k;
                iArr11[i31] = 109;
                iArr11[i31 - 1] = iArr11[i31 - 1] + iArr11[i31];
                this.f41280k = i31 + 1;
                iArr11[i31] = iArr11[i31 - 1];
                return 0;
            case 22:
                int[] iArr12 = this.m;
                int i32 = this.f41280k;
                this.f41280k = i32 + 1;
                iArr12[i32] = 2;
                return 0;
            case 23:
                int i33 = this.f41280k - 1;
                this.f41280k = i33;
                this.f41273d = this.m[i33] != 0 ? 0 : 1;
                return 0;
            case 24:
                int i34 = this.f41280k;
                int i35 = i34 - 1;
                this.f41280k = i35;
                int[] iArr13 = this.m;
                iArr13[i34 - 2] = iArr13[i34 - 2] % iArr13[i35];
                return 0;
            case 25:
                int[] iArr14 = this.m;
                int i36 = this.f41280k;
                this.f41280k = i36 + 1;
                iArr14[i36] = 77;
                return 0;
            case 26:
                int[] iArr15 = this.m;
                int i37 = this.f41280k;
                this.f41280k = i37 + 1;
                iArr15[i37] = 66;
                return 0;
            case 27:
                int[] iArr16 = this.m;
                int i38 = this.f41280k;
                this.f41280k = i38 + 1;
                iArr16[i38] = 99;
                return 0;
            case 28:
                int[] iArr17 = this.m;
                int i39 = this.f41280k;
                this.f41280k = i39 + 1;
                iArr17[i39] = 128;
                return 0;
            case 29:
                int[] iArr18 = this.m;
                int i40 = this.f41280k;
                this.f41280k = i40 + 1;
                iArr18[i40] = 63;
                return 0;
            case 30:
                int[] iArr19 = this.m;
                int i41 = this.f41280k;
                iArr19[i41] = 93;
                iArr19[i41 - 1] = iArr19[i41 - 1] + iArr19[i41];
                this.f41280k = i41 + 1;
                iArr19[i41] = iArr19[i41 - 1];
                return 0;
            case 31:
                int[] iArr20 = this.m;
                int i42 = this.f41280k;
                this.f41280k = i42 + 1;
                iArr20[i42] = 30;
                return 0;
            case 32:
                int i43 = this.f41280k;
                int i44 = i43 - 2;
                this.f41280k = i44;
                Object[] objArr6 = this.f41284p;
                Object obj3 = objArr6[i44];
                objArr6[i44] = null;
                Object obj4 = objArr6[i43 - 1];
                objArr6[i43 - 1] = null;
                this.f41273d = obj3 != obj4 ? 0 : 1;
                return 0;
            case 33:
                int[] iArr21 = this.m;
                int i45 = this.f41280k;
                this.f41280k = i45 + 1;
                iArr21[i45] = -1;
                return 0;
            case 34:
                int[] iArr22 = this.m;
                int i46 = this.f41280k;
                this.f41280k = i46 + 1;
                iArr22[i46] = 640;
                return 0;
            case 35:
                int[] iArr23 = this.m;
                int i47 = this.f41280k;
                this.f41280k = i47 + 1;
                iArr23[i47] = 107;
                return 0;
            case 36:
                int i48 = this.f41280k;
                int i49 = i48 - 1;
                int[] iArr24 = this.m;
                iArr24[i48 - 2] = iArr24[i48 - 2] + iArr24[i49];
                iArr24[i49] = iArr24[i48 - 2];
                this.f41280k = i48 + 1;
                iArr24[i48] = 128;
                return 0;
            case 37:
                int[] iArr25 = this.m;
                int i50 = this.f41280k;
                iArr25[i50] = 71;
                iArr25[i50 - 1] = iArr25[i50 - 1] + iArr25[i50];
                this.f41280k = i50 + 1;
                iArr25[i50] = iArr25[i50 - 1];
                return 0;
            case 38:
                int[] iArr26 = this.m;
                int i51 = this.f41280k;
                iArr26[i51] = 2;
                this.f41280k = i51 + 2;
                iArr26[i51 + 1] = 2;
                return 0;
            case 39:
                int[] iArr27 = this.m;
                int i52 = this.f41280k;
                this.f41280k = i52 + 1;
                iArr27[i52] = 93;
                return 0;
            case 40:
                int i53 = this.f41280k;
                int i54 = i53 - 1;
                this.f41280k = i54;
                int[] iArr28 = this.m;
                iArr28[i53 - 2] = iArr28[i53 - 2] + iArr28[i54];
                return 0;
            case 41:
                int[] iArr29 = this.m;
                int i55 = this.f41280k;
                iArr29[i55] = iArr29[i55 - 1];
                this.f41280k = i55 + 2;
                iArr29[i55 + 1] = 128;
                return 0;
            case 42:
                int[] iArr30 = this.m;
                int i56 = this.f41280k;
                this.f41280k = i56 + 1;
                iArr30[i56] = 3;
                return 0;
            case 43:
                int[] iArr31 = this.m;
                int i57 = this.f41280k;
                iArr31[i57] = 3;
                this.f41280k = i57;
                iArr31[i57 - 1] = iArr31[i57 - 1] / iArr31[i57];
                return 0;
            case 44:
                Object[] objArr7 = this.f41284p;
                int i58 = this.f41280k;
                this.f41280k = i58 + 1;
                objArr7[i58] = objArr7[8];
                return 0;
            case 45:
                int[] iArr32 = this.m;
                int i59 = this.f41280k;
                this.f41280k = i59 + 1;
                iArr32[i59] = 18119;
                return 0;
            case 46:
                int i60 = this.f41280k;
                int i61 = i60 - 1;
                this.f41280k = i61;
                int[] iArr33 = this.m;
                iArr33[i60 - 2] = iArr33[i60 - 2] - iArr33[i61];
                return 0;
            case 47:
                int[] iArr34 = this.m;
                int i62 = this.f41280k;
                this.f41280k = i62 + 1;
                iArr34[i62] = 16;
                return 0;
            case 48:
                int i63 = this.f41280k;
                int[] iArr35 = this.m;
                iArr35[i63 - 2] = iArr35[i63 - 2] >> iArr35[i63 - 1];
                int i64 = i63 - 2;
                this.f41280k = i64;
                iArr35[i63 - 3] = iArr35[i63 - 3] + iArr35[i64];
                return 0;
            case 49:
                int[] iArr36 = this.m;
                int i65 = this.f41280k;
                iArr36[i65] = 2;
                this.f41280k = i65;
                iArr36[i65 - 1] = iArr36[i65 - 1] % iArr36[i65];
                int i66 = i65 - 1;
                this.f41280k = i66;
                this.f41284p[i66] = null;
                return 0;
            case 50:
                int[] iArr37 = this.m;
                int i67 = this.f41280k;
                iArr37[i67] = 5;
                this.f41280k = i67;
                iArr37[i67 - 1] = iArr37[i67 - 1] + iArr37[i67];
                return 0;
            case 51:
                int[] iArr38 = this.m;
                int i68 = this.f41280k;
                this.f41280k = i68 + 1;
                iArr38[i68] = iArr38[i68 - 1];
                return 0;
            case 52:
                int[] iArr39 = this.m;
                int i69 = this.f41280k;
                iArr39[i69] = 25;
                this.f41280k = i69;
                iArr39[i69 - 1] = iArr39[i69 - 1] + iArr39[i69];
                return 0;
            case 53:
                int[] iArr40 = this.m;
                int i70 = this.f41280k;
                iArr40[i70] = 39;
                this.f41280k = i70;
                iArr40[i70 - 1] = iArr40[i70 - 1] + iArr40[i70];
                return 0;
            case 54:
                int[] iArr41 = this.m;
                int i71 = this.f41280k;
                iArr41[i71] = 3;
                iArr41[i71 + 1] = 3;
                int i72 = i71 + 1;
                this.f41280k = i72;
                iArr41[i71] = iArr41[i71] >> iArr41[i72];
                return 0;
            case 55:
                int i73 = this.f41280k;
                int[] iArr42 = this.m;
                iArr42[i73 - 2] = iArr42[i73 - 2] << iArr42[i73 - 1];
                int i74 = i73 - 2;
                this.f41280k = i74;
                this.f41284p[i74] = null;
                return 0;
            case 56:
                int[] iArr43 = this.m;
                int i75 = this.f41280k;
                this.f41280k = i75 + 1;
                iArr43[i75] = 22;
                return 0;
            case 57:
                int[] iArr44 = this.m;
                int i76 = this.f41280k;
                this.f41280k = i76 + 1;
                iArr44[i76] = 61;
                return 0;
            case 58:
                int i77 = this.f41280k - 1;
                this.f41280k = i77;
                int[] iArr45 = this.m;
                iArr45[8] = iArr45[i77];
                return 0;
            case 59:
                int[] iArr46 = this.m;
                int i78 = this.f41280k;
                iArr46[i78] = 6;
                this.f41280k = i78;
                iArr46[8] = iArr46[i78];
                return 0;
            case 60:
                int[] iArr47 = this.m;
                int i79 = this.f41280k;
                this.f41280k = i79 + 1;
                iArr47[i79] = iArr47[8];
                return 0;
            case 61:
                int i80 = this.f41280k;
                int i81 = i80 - 1;
                this.f41280k = i81;
                int[] iArr48 = this.m;
                iArr48[i80 - 2] = iArr48[i80 - 2] % iArr48[i81];
                int i82 = i80 - 2;
                this.f41280k = i82;
                this.f41284p[i82] = null;
                return 0;
            case 62:
                int[] iArr49 = this.m;
                int i83 = this.f41280k;
                iArr49[i83] = 89;
                iArr49[i83 - 1] = iArr49[i83 - 1] + iArr49[i83];
                this.f41280k = i83 + 1;
                iArr49[i83] = iArr49[i83 - 1];
                return 0;
            case 63:
                int[] iArr50 = this.m;
                int i84 = this.f41280k;
                iArr50[i84] = 13;
                iArr50[i84 - 1] = iArr50[i84 - 1] + iArr50[i84];
                this.f41280k = i84 + 1;
                iArr50[i84] = iArr50[i84 - 1];
                return 0;
            case 64:
                int[] iArr51 = this.m;
                int i85 = this.f41280k;
                this.f41280k = i85 + 1;
                iArr51[i85] = 5;
                return 0;
            case 65:
                int[] iArr52 = this.m;
                int i86 = this.f41280k;
                this.f41280k = i86 + 1;
                iArr52[i86] = 58;
                return 0;
            case 66:
                int[] iArr53 = this.m;
                int i87 = this.f41280k;
                this.f41280k = i87 + 1;
                iArr53[i87] = 38;
                return 0;
            case 67:
                int[] iArr54 = this.m;
                int i88 = this.f41280k;
                iArr54[i88] = 45;
                iArr54[i88 - 1] = iArr54[i88 - 1] + iArr54[i88];
                this.f41280k = i88 + 1;
                iArr54[i88] = iArr54[i88 - 1];
                return 0;
            case 68:
                int[] iArr55 = this.m;
                int i89 = this.f41280k;
                iArr55[i89] = 61;
                iArr55[i89 - 1] = iArr55[i89 - 1] + iArr55[i89];
                this.f41280k = i89 + 1;
                iArr55[i89] = iArr55[i89 - 1];
                return 0;
            case 69:
                int[] iArr56 = this.m;
                int i90 = this.f41280k;
                Object[] objArr8 = this.f41284p;
                Object obj5 = objArr8[i90 - 1];
                objArr8[i90 - 1] = null;
                iArr56[i90 - 1] = ((int[]) obj5).length;
                return 0;
            case 70:
                int i91 = this.f41280k - 1;
                this.f41280k = i91;
                Object[] objArr9 = this.f41284p;
                Object obj6 = objArr9[i91];
                objArr9[i91] = null;
                objArr9[8] = obj6;
                return 0;
            case 71:
                int[] iArr57 = this.m;
                int i92 = this.f41280k;
                this.f41280k = i92 + 1;
                iArr57[i92] = 8;
                return 0;
            case 72:
                int i93 = this.f41280k;
                int i94 = i93 - 1;
                this.f41280k = i94;
                int[] iArr58 = this.m;
                iArr58[i93 - 2] = iArr58[i93 - 2] >> iArr58[i94];
                return 0;
            case 73:
                int[] iArr59 = this.m;
                int i95 = this.f41280k;
                this.f41280k = i95 + 1;
                iArr59[i95] = 97;
                return 0;
            case 74:
                int[] iArr60 = this.m;
                int i96 = this.f41280k;
                this.f41280k = i96 + 1;
                iArr60[i96] = 27;
                return 0;
            case 75:
                int[] iArr61 = this.m;
                int i97 = this.f41280k;
                this.f41280k = i97 + 1;
                iArr61[i97] = 87;
                return 0;
            case 76:
                int[] iArr62 = this.m;
                int i98 = this.f41280k;
                this.f41280k = i98 + 1;
                iArr62[i98] = 37;
                return 0;
            case 77:
                long[] jArr = this.f41281l;
                int i99 = this.f41280k;
                this.f41280k = i99 + 1;
                jArr[i99] = this.f41274e;
                return 0;
            case 78:
                long[] jArr2 = this.f41281l;
                int i100 = this.f41280k;
                jArr2[i100] = jArr2[i100 - 1];
                this.f41280k = i100;
                jArr2[13] = jArr2[i100];
                return 0;
            case 79:
                int i101 = this.f41280k;
                int i102 = i101 - 1;
                this.f41280k = i102;
                long[] jArr3 = this.f41281l;
                this.m[i101 - 2] = (jArr3[i101 - 2] > jArr3[i102] ? 1 : (jArr3[i101 - 2] == jArr3[i102] ? 0 : -1));
                return 0;
            case 80:
                long[] jArr4 = this.f41281l;
                int i103 = this.f41280k;
                this.f41280k = i103 + 1;
                jArr4[i103] = jArr4[13];
                return 0;
            case 81:
                int i104 = this.f41280k;
                int i105 = i104 - 1;
                this.f41280k = i105;
                long[] jArr5 = this.f41281l;
                jArr5[i104 - 2] = jArr5[i104 - 2] + jArr5[i105];
                return 0;
            case 82:
                Object[] objArr10 = this.f41284p;
                int i106 = this.f41280k;
                objArr10[i106] = null;
                int[] iArr63 = this.m;
                this.f41280k = i106 + 2;
                iArr63[i106 + 1] = 0;
                return 0;
            case 83:
                int i107 = this.f41280k - 1;
                this.f41280k = i107;
                this.f41273d = this.m[i107] < 0 ? 0 : 1;
                return 0;
            case 84:
                int i108 = this.f41280k - 1;
                this.f41280k = i108;
                Object[] objArr11 = this.f41284p;
                Object obj7 = objArr11[i108];
                objArr11[i108] = null;
                objArr11[10] = obj7;
                return 0;
            case 85:
                int[] iArr64 = this.m;
                int i109 = this.f41280k;
                iArr64[i109] = 0;
                this.f41280k = i109 + 2;
                iArr64[i109 + 1] = 0;
                return 0;
            case 86:
                Object[] objArr12 = this.f41284p;
                int i110 = this.f41280k;
                objArr12[i110] = objArr12[i110 - 1];
                this.f41280k = i110;
                Object obj8 = objArr12[i110];
                objArr12[i110] = null;
                objArr12[10] = obj8;
                return 0;
            case 87:
                long[] jArr6 = this.f41281l;
                int i111 = this.f41283o;
                this.f41283o = i111 + 1;
                this.f41272c = jArr6[i111];
                return 0;
            case 88:
                Object[] objArr13 = this.f41284p;
                int i112 = this.f41280k;
                objArr13[i112] = objArr13[10];
                int[] iArr65 = this.m;
                this.f41280k = i112 + 2;
                iArr65[i112 + 1] = 1;
                return 0;
            case 89:
                int i113 = this.f41280k;
                int i114 = i113 - 1;
                this.f41280k = i114;
                Object[] objArr14 = this.f41284p;
                Object obj9 = objArr14[i113 - 2];
                objArr14[i113 - 2] = null;
                objArr14[i113 - 2] = ((Object[]) obj9)[this.m[i114]];
                return 0;
            case 90:
                int i115 = this.f41280k;
                int i116 = i115 - 1;
                this.f41280k = i116;
                int[] iArr66 = this.m;
                Object[] objArr15 = this.f41284p;
                Object obj10 = objArr15[i115 - 2];
                objArr15[i115 - 2] = null;
                iArr66[i115 - 2] = ((int[]) obj10)[iArr66[i116]];
                int i117 = i115 - 2;
                iArr66[9] = iArr66[i117];
                this.f41280k = i115 - 1;
                objArr15[i117] = objArr15[10];
                return 0;
            case 91:
                int[] iArr67 = this.m;
                int i118 = this.f41280k;
                iArr67[i118] = 0;
                this.f41280k = i118;
                Object[] objArr16 = this.f41284p;
                Object obj11 = objArr16[i118 - 1];
                objArr16[i118 - 1] = null;
                iArr67[i118 - 1] = ((int[]) obj11)[iArr67[i118]];
                return 0;
            case 92:
                int[] iArr68 = this.m;
                int i119 = this.f41280k;
                iArr68[i119] = iArr68[i119 - 1];
                this.f41280k = i119;
                iArr68[8] = iArr68[i119];
                return 0;
            case 93:
                int i120 = this.f41280k;
                int i121 = i120 - 2;
                this.f41280k = i121;
                int[] iArr69 = this.m;
                this.f41273d = iArr69[i121] != iArr69[i120 - 1] ? 0 : 1;
                return 0;
            case 94:
                int[] iArr70 = this.m;
                int i122 = this.f41280k;
                this.f41280k = i122 + 1;
                iArr70[i122] = iArr70[9];
                return 0;
            case 95:
                Object[] objArr17 = this.f41284p;
                int i123 = this.f41280k;
                this.f41280k = i123 + 1;
                objArr17[i123] = objArr17[10];
                return 0;
            case 96:
                Object[] objArr18 = this.f41284p;
                int i124 = this.f41280k;
                objArr18[i124] = objArr18[i124 - 1];
                int[] iArr71 = this.m;
                this.f41280k = i124 + 2;
                iArr71[i124 + 1] = 9;
                return 0;
            case 97:
                int[] iArr72 = this.m;
                int i125 = this.f41280k;
                iArr72[i125] = 0;
                this.f41280k = i125;
                Object[] objArr19 = this.f41284p;
                Object obj12 = objArr19[i125 - 1];
                objArr19[i125 - 1] = null;
                iArr72[i125 - 1] = ((int[]) obj12)[iArr72[i125]];
                this.f41280k = i125 + 1;
                iArr72[i125] = 0;
                return 0;
            case 98:
                Object[] objArr20 = this.f41284p;
                int i126 = this.f41280k;
                this.f41280k = i126 + 1;
                objArr20[i126] = objArr20[i126 - 1];
                return 0;
            case 99:
                int i127 = this.f41280k - 1;
                this.f41280k = i127;
                Object[] objArr21 = this.f41284p;
                Object obj13 = objArr21[i127];
                objArr21[i127] = null;
                objArr21[9] = obj13;
                return 0;
            case 100:
                Object[] objArr22 = this.f41284p;
                int i128 = this.f41280k;
                objArr22[i128] = objArr22[9];
                this.f41280k = i128 + 2;
                objArr22[i128 + 1] = objArr22[10];
                return 0;
            case 101:
                int[] iArr73 = this.m;
                int i129 = this.f41280k;
                iArr73[i129] = 3;
                this.f41280k = i129;
                Object[] objArr23 = this.f41284p;
                Object obj14 = objArr23[i129 - 1];
                objArr23[i129 - 1] = null;
                objArr23[i129 - 1] = ((Object[]) obj14)[iArr73[i129]];
                return 0;
            case 102:
                int i130 = this.f41280k;
                int i131 = i130 - 1;
                Object[] objArr24 = this.f41284p;
                objArr24[i131] = null;
                objArr24[i131] = objArr24[9];
                this.f41280k = i130 + 1;
                objArr24[i130] = objArr24[10];
                return 0;
            case 103:
                int[] iArr74 = this.m;
                int i132 = this.f41280k;
                this.f41280k = i132 + 1;
                iArr74[i132] = 4;
                return 0;
            case 104:
                int[] iArr75 = this.m;
                int i133 = this.f41280k;
                this.f41280k = i133 + 1;
                iArr75[i133] = 5;
                return 0;
            case 105:
                int[] iArr76 = this.m;
                int i134 = this.f41280k;
                this.f41280k = i134 + 1;
                iArr76[i134] = 6;
                return 0;
            case 106:
                int i135 = this.f41280k;
                int i136 = i135 - 1;
                Object[] objArr25 = this.f41284p;
                objArr25[i136] = null;
                this.f41280k = i135;
                objArr25[i136] = objArr25[9];
                return 0;
            case 107:
                int[] iArr77 = this.m;
                int i137 = this.f41280k;
                this.f41280k = i137 + 1;
                iArr77[i137] = 7;
                return 0;
            case 108:
                Object[] objArr26 = this.f41284p;
                int i138 = this.f41280k;
                objArr26[i138] = objArr26[10];
                int[] iArr78 = this.m;
                this.f41280k = i138 + 2;
                iArr78[i138 + 1] = 8;
                return 0;
            case 109:
                int i139 = this.f41280k;
                int i140 = i139 - 1;
                Object[] objArr27 = this.f41284p;
                objArr27[i140] = null;
                objArr27[i140] = null;
                int[] iArr79 = this.m;
                this.f41280k = i139 + 1;
                iArr79[i139] = iArr79[8];
                return 0;
            case 110:
                Object[] objArr28 = this.f41284p;
                int i141 = this.f41280k;
                objArr28[i141 - 1] = new int[this.m[i141 - 1]];
                objArr28[i141] = objArr28[i141 - 1];
                this.f41280k = i141;
                Object obj15 = objArr28[i141];
                objArr28[i141] = null;
                objArr28[9] = obj15;
                return 0;
            case 111:
                int i142 = this.f41280k;
                int i143 = i142 - 3;
                this.f41280k = i143;
                Object[] objArr29 = this.f41284p;
                Object obj16 = objArr29[i143];
                objArr29[i143] = null;
                int[] iArr80 = this.m;
                ((int[]) obj16)[iArr80[i142 - 2]] = iArr80[i142 - 1];
                return 0;
            case 112:
                Object[] objArr30 = this.f41284p;
                int i144 = this.f41280k;
                objArr30[i144] = objArr30[9];
                int[] iArr81 = this.m;
                iArr81[i144 + 1] = iArr81[8];
                this.f41280k = i144 + 3;
                iArr81[i144 + 2] = iArr81[i144 + 1];
                return 0;
            case 113:
                int i145 = this.f41280k;
                int i146 = i145 - 1;
                this.f41280k = i146;
                int[] iArr82 = this.m;
                iArr82[i145 - 2] = iArr82[i145 - 2] * iArr82[i146];
                return 0;
            case 114:
                int i147 = this.f41280k;
                int i148 = i147 - 1;
                this.f41280k = i148;
                int[] iArr83 = this.m;
                iArr83[i147 - 2] = iArr83[i147 - 2] % iArr83[i148];
                this.f41280k = i147;
                iArr83[i148] = 1;
                return 0;
            case 115:
                int i149 = this.f41280k;
                int i150 = i149 - 1;
                this.f41280k = i150;
                int[] iArr84 = this.m;
                Object[] objArr31 = this.f41284p;
                Object obj17 = objArr31[i149 - 2];
                objArr31[i149 - 2] = null;
                iArr84[i149 - 2] = ((int[]) obj17)[iArr84[i150]];
                this.f41280k = i149;
                iArr84[i150] = 1;
                return 0;
            case 116:
                Object[] objArr32 = this.f41284p;
                int i151 = this.f41280k;
                objArr32[i151] = objArr32[10];
                objArr32[i151 + 1] = objArr32[i151];
                int[] iArr85 = this.m;
                this.f41280k = i151 + 3;
                iArr85[i151 + 2] = 9;
                return 0;
            case 117:
                int i152 = this.f41280k;
                int i153 = i152 - 1;
                this.f41280k = i153;
                Object[] objArr33 = this.f41284p;
                Object obj18 = objArr33[i153];
                objArr33[i153] = null;
                objArr33[8] = obj18;
                int[] iArr86 = this.m;
                Object obj19 = objArr33[i152 - 2];
                objArr33[i152 - 2] = null;
                iArr86[i152 - 2] = ((Object[]) obj19).length;
                int i154 = i152 - 2;
                this.f41280k = i154;
                iArr86[9] = iArr86[i154];
                return 0;
            case 118:
                Object[] objArr34 = this.f41284p;
                int i155 = this.f41280k;
                objArr34[i155] = objArr34[10];
                int[] iArr87 = this.m;
                this.f41280k = i155 + 2;
                iArr87[i155 + 1] = 9;
                return 0;
            case 119:
                int i156 = this.f41280k;
                int i157 = i156 - 1;
                this.f41280k = i157;
                int[] iArr88 = this.m;
                Object[] objArr35 = this.f41284p;
                Object obj20 = objArr35[i156 - 2];
                objArr35[i156 - 2] = null;
                iArr88[i156 - 2] = ((int[]) obj20)[iArr88[i157]];
                iArr88[i157] = iArr88[i156 - 2];
                this.f41280k = i156 + 1;
                iArr88[i156] = iArr88[i156 - 1];
                return 0;
            case 120:
                int[] iArr89 = this.m;
                int i158 = this.f41280k;
                iArr89[i158] = iArr89[i158 - 1];
                this.f41280k = i158;
                iArr89[i158 - 1] = iArr89[i158 - 1] * iArr89[i158];
                int i159 = iArr89[i158 - 1];
                iArr89[i158 - 1] = iArr89[i158 - 2];
                iArr89[i158 - 2] = i159;
                return 0;
            case 121:
                int i160 = this.f41280k;
                int i161 = i160 - 1;
                int[] iArr90 = this.m;
                iArr90[i160 - 2] = iArr90[i160 - 2] * iArr90[i161];
                this.f41280k = i160 + 1;
                iArr90[i160] = iArr90[i160 - 2];
                iArr90[i161] = iArr90[i160 - 3];
                return 0;
            case 122:
                int[] iArr91 = this.m;
                int i162 = this.f41280k;
                iArr91[i162 - 1] = -iArr91[i162 - 1];
                return 0;
            case 123:
                int i163 = this.f41280k;
                int i164 = i163 - 1;
                this.f41280k = i164;
                int[] iArr92 = this.m;
                iArr92[i163 - 2] = iArr92[i163 - 2] & iArr92[i164];
                return 0;
            case 124:
                int[] iArr93 = this.m;
                int i165 = this.f41280k;
                this.f41280k = i165 + 1;
                int i166 = iArr93[i165 - 1];
                iArr93[i165] = i166;
                iArr93[i165 - 1] = iArr93[i165 - 2];
                iArr93[i165 - 2] = iArr93[i165 - 3];
                iArr93[i165 - 3] = i166;
                return 0;
            case 125:
                int i167 = this.f41280k;
                int[] iArr94 = this.m;
                iArr94[i167 - 2] = iArr94[i167 - 1] | iArr94[i167 - 2];
                int i168 = i167 - 2;
                this.f41280k = i168;
                iArr94[i167 - 3] = iArr94[i167 - 3] + iArr94[i168];
                return 0;
            case 126:
                int[] iArr95 = this.m;
                int i169 = this.f41280k;
                int i170 = iArr95[i169 - 1];
                iArr95[i169 - 1] = iArr95[i169 - 2];
                iArr95[i169 - 2] = i170;
                return 0;
            case 127:
                int[] iArr96 = this.m;
                int i171 = this.f41280k;
                iArr96[i171 + 1] = iArr96[i171 - 1];
                iArr96[i171] = iArr96[i171 - 2];
                iArr96[i171 + 1] = -iArr96[i171 + 1];
                int i172 = i171 + 1;
                this.f41280k = i172;
                iArr96[i171] = iArr96[i172] & iArr96[i171];
                return 0;
            case 128:
                int[] iArr97 = this.m;
                int i173 = this.f41280k;
                int i174 = iArr97[i173 - 1];
                iArr97[i173] = i174;
                iArr97[i173 - 1] = iArr97[i173 - 2];
                iArr97[i173 - 2] = iArr97[i173 - 3];
                iArr97[i173 - 3] = i174;
                this.f41280k = i173;
                this.f41284p[i173] = null;
                return 0;
            case 129:
                int i175 = this.f41280k;
                int i176 = i175 - 1;
                this.f41280k = i176;
                int[] iArr98 = this.m;
                iArr98[i175 - 2] = iArr98[i175 - 2] | iArr98[i176];
                return 0;
            case 130:
                int[] iArr99 = this.m;
                int i177 = this.f41280k;
                this.f41280k = i177 + 2;
                iArr99[i177 + 1] = iArr99[i177 - 1];
                iArr99[i177] = iArr99[i177 - 2];
                return 0;
            case 131:
                int i178 = this.f41280k;
                int i179 = i178 - 1;
                int[] iArr100 = this.m;
                iArr100[i178 - 2] = iArr100[i178 - 2] & iArr100[i179];
                this.f41280k = i178;
                int i180 = iArr100[i178 - 2];
                iArr100[i179] = i180;
                iArr100[i178 - 2] = iArr100[i178 - 3];
                iArr100[i178 - 3] = iArr100[i178 - 4];
                iArr100[i178 - 4] = i180;
                return 0;
            case 132:
                int[] iArr101 = this.m;
                int i181 = this.f41280k;
                this.f41280k = i181 + 1;
                iArr101[i181] = 19;
                return 0;
            case 133:
                int i182 = this.f41280k;
                int i183 = i182 - 1;
                int[] iArr102 = this.m;
                iArr102[i182 - 2] = iArr102[i182 - 2] >> iArr102[i183];
                this.f41280k = i182;
                iArr102[i183] = iArr102[i182 - 2];
                return 0;
            case 134:
                int[] iArr103 = this.m;
                int i184 = this.f41280k;
                this.f41280k = i184 + 1;
                iArr103[i184] = -16383;
                return 0;
            case 135:
                int i185 = this.f41280k;
                int i186 = i185 - 1;
                this.f41280k = i186;
                int[] iArr104 = this.m;
                iArr104[i185 - 2] = iArr104[i186] & iArr104[i185 - 2];
                int i187 = iArr104[i185 - 2];
                iArr104[i185 - 2] = iArr104[i185 - 3];
                iArr104[i185 - 3] = i187;
                return 0;
            case 136:
                int i188 = this.f41280k;
                int i189 = i188 - 1;
                this.f41280k = i189;
                int[] iArr105 = this.m;
                iArr105[i188 - 2] = iArr105[i188 - 2] / iArr105[i189];
                iArr105[i189] = -2;
                int i190 = i188 - 1;
                this.f41280k = i190;
                iArr105[i188 - 2] = iArr105[i188 - 2] - iArr105[i190];
                return 0;
            case 137:
                int[] iArr106 = this.m;
                int i191 = this.f41280k;
                iArr106[i191] = 1;
                this.f41280k = i191;
                iArr106[i191 - 1] = iArr106[i191 - 1] - iArr106[i191];
                return 0;
            case 138:
                int[] iArr107 = this.m;
                int i192 = this.f41280k;
                iArr107[i192 + 1] = iArr107[i192 - 1];
                iArr107[i192] = iArr107[i192 - 2];
                int i193 = i192 + 1;
                iArr107[i192] = iArr107[i192] & iArr107[i193];
                this.f41280k = i192 + 2;
                int i194 = iArr107[i192];
                iArr107[i193] = i194;
                iArr107[i192] = iArr107[i192 - 1];
                iArr107[i192 - 1] = iArr107[i192 - 2];
                iArr107[i192 - 2] = i194;
                return 0;
            case 139:
                int[] iArr108 = this.m;
                int i195 = this.f41280k;
                int i196 = iArr108[i195 - 1];
                iArr108[i195 - 1] = iArr108[i195 - 2];
                iArr108[i195 - 2] = i196;
                iArr108[i195] = 29;
                this.f41280k = i195;
                iArr108[i195 - 1] = iArr108[i195 - 1] >> iArr108[i195];
                return 0;
            case 140:
                int[] iArr109 = this.m;
                int i197 = this.f41280k;
                iArr109[i197] = iArr109[i197 - 1];
                this.f41280k = i197 + 2;
                iArr109[i197 + 1] = -15;
                return 0;
            case 141:
                int i198 = this.f41280k;
                int i199 = i198 - 1;
                this.f41280k = i199;
                int[] iArr110 = this.m;
                iArr110[i198 - 2] = iArr110[i199] ^ iArr110[i198 - 2];
                int i200 = iArr110[i198 - 2];
                iArr110[i198 - 2] = iArr110[i198 - 3];
                iArr110[i198 - 3] = i200;
                return 0;
            case 142:
                int[] iArr111 = this.m;
                int i201 = this.f41280k;
                iArr111[i201] = -15;
                this.f41280k = i201;
                iArr111[i201 - 1] = iArr111[i201] & iArr111[i201 - 1];
                return 0;
            case 143:
                int[] iArr112 = this.m;
                int i202 = this.f41280k;
                iArr112[i202] = 1;
                iArr112[i202 - 1] = iArr112[i202 - 1] << iArr112[i202];
                int i203 = i202 - 1;
                this.f41280k = i203;
                iArr112[i202 - 2] = iArr112[i202 - 2] + iArr112[i203];
                return 0;
            case 144:
                int i204 = this.f41280k;
                int i205 = i204 - 1;
                this.f41280k = i205;
                int[] iArr113 = this.m;
                iArr113[i204 - 2] = iArr113[i204 - 2] / iArr113[i205];
                iArr113[i205] = 1;
                this.f41280k = i204 + 2;
                iArr113[i204 + 1] = iArr113[i204 - 1];
                iArr113[i204] = iArr113[i204 - 2];
                return 0;
            case 145:
                int[] iArr114 = this.m;
                int i206 = this.f41280k;
                iArr114[i206] = 1;
                this.f41280k = i206;
                iArr114[i206 - 1] = iArr114[i206 - 1] << iArr114[i206];
                return 0;
            case 146:
                int[] iArr115 = this.m;
                int i207 = this.f41280k;
                int i208 = iArr115[i207 - 1];
                iArr115[i207] = i208;
                iArr115[i207 - 1] = iArr115[i207 - 2];
                iArr115[i207 - 2] = iArr115[i207 - 3];
                iArr115[i207 - 3] = i208;
                this.f41284p[i207] = null;
                int i209 = i207 - 1;
                this.f41280k = i209;
                iArr115[i207 - 2] = iArr115[i207 - 2] ^ iArr115[i209];
                return 0;
            case 147:
                int i210 = this.f41280k;
                int[] iArr116 = this.m;
                iArr116[i210 - 2] = iArr116[i210 - 2] - iArr116[i210 - 1];
                int i211 = i210 - 2;
                this.f41280k = i211;
                iArr116[i210 - 3] = iArr116[i210 - 3] ^ iArr116[i211];
                return 0;
            case 148:
                int[] iArr117 = this.m;
                int i212 = this.f41280k;
                iArr117[i212 - 1] = -iArr117[i212 - 1];
                iArr117[i212] = -2;
                this.f41280k = i212;
                iArr117[i212 - 1] = iArr117[i212 - 1] - iArr117[i212];
                return 0;
            case 149:
                int[] iArr118 = this.m;
                int i213 = this.f41280k;
                iArr118[i213] = iArr118[i213 - 1];
                this.f41280k = i213 + 2;
                iArr118[i213 + 1] = 26;
                return 0;
            case 150:
                int[] iArr119 = this.m;
                int i214 = this.f41280k;
                this.f41280k = i214 + 1;
                iArr119[i214] = -127;
                return 0;
            case 151:
                int i215 = this.f41280k;
                int[] iArr120 = this.m;
                iArr120[i215 - 2] = iArr120[i215 - 1] ^ iArr120[i215 - 2];
                int i216 = i215 - 2;
                this.f41280k = i216;
                iArr120[i215 - 3] = iArr120[i215 - 3] - iArr120[i216];
                return 0;
            case 152:
                int i217 = this.f41280k;
                int i218 = i217 - 1;
                this.f41280k = i218;
                int[] iArr121 = this.m;
                iArr121[i217 - 2] = iArr121[i217 - 2] / iArr121[i218];
                return 0;
            case 153:
                int[] iArr122 = this.m;
                int i219 = this.f41280k;
                iArr122[i219] = 1;
                this.f41280k = i219 + 3;
                iArr122[i219 + 2] = iArr122[i219];
                iArr122[i219 + 1] = iArr122[i219 - 1];
                return 0;
            case 154:
                int i220 = this.f41280k;
                this.f41284p[i220 - 1] = null;
                int[] iArr123 = this.m;
                iArr123[i220 - 3] = iArr123[i220 - 2] | iArr123[i220 - 3];
                int i221 = i220 - 3;
                this.f41280k = i221;
                iArr123[i220 - 4] = iArr123[i220 - 4] + iArr123[i221];
                return 0;
            case 155:
                int[] iArr124 = this.m;
                int i222 = this.f41280k;
                iArr124[i222 + 1] = iArr124[i222 - 1];
                iArr124[i222] = iArr124[i222 - 2];
                int i223 = i222 + 1;
                this.f41280k = i223;
                iArr124[i222] = iArr124[i223] & iArr124[i222];
                return 0;
            case 156:
                int[] iArr125 = this.m;
                int i224 = this.f41280k;
                int i225 = iArr125[i224 - 1];
                iArr125[i224] = i225;
                iArr125[i224 - 1] = iArr125[i224 - 2];
                iArr125[i224 - 2] = iArr125[i224 - 3];
                iArr125[i224 - 3] = i225;
                this.f41284p[i224] = null;
                int i226 = i224 - 1;
                this.f41280k = i226;
                iArr125[i224 - 2] = iArr125[i224 - 2] | iArr125[i226];
                return 0;
            case 157:
                int i227 = this.f41280k;
                int[] iArr126 = this.m;
                iArr126[i227 - 2] = iArr126[i227 - 2] + iArr126[i227 - 1];
                iArr126[i227 - 2] = -iArr126[i227 - 2];
                int i228 = i227 - 2;
                this.f41280k = i228;
                iArr126[i227 - 3] = iArr126[i227 - 3] & iArr126[i228];
                return 0;
            case 158:
                int[] iArr127 = this.m;
                int i229 = this.f41280k;
                int i230 = iArr127[i229 - 1];
                iArr127[i229 - 1] = iArr127[i229 - 2];
                iArr127[i229 - 2] = i230;
                int i231 = i229 - 1;
                this.f41280k = i231;
                iArr127[i229 - 2] = iArr127[i229 - 2] / iArr127[i231];
                return 0;
            case 159:
                int i232 = this.f41280k - 1;
                this.f41280k = i232;
                int[] iArr128 = this.m;
                iArr128[10] = iArr128[i232];
                return 0;
            case 160:
                int[] iArr129 = this.m;
                int i233 = this.f41280k;
                this.f41280k = i233 + 1;
                iArr129[i233] = iArr129[10];
                return 0;
            case 161:
                int i234 = this.f41280k;
                int i235 = i234 - 2;
                this.f41280k = i235;
                int[] iArr130 = this.m;
                this.f41273d = iArr130[i235] >= iArr130[i234 - 1] ? 0 : 1;
                return 0;
            case 162:
                int[] iArr131 = this.m;
                int i236 = this.f41280k;
                iArr131[i236] = iArr131[10];
                this.f41280k = i236;
                Object[] objArr36 = this.f41284p;
                Object obj21 = objArr36[i236 - 1];
                objArr36[i236 - 1] = null;
                objArr36[i236 - 1] = ((Object[]) obj21)[iArr131[i236]];
                this.f41280k = i236 + 1;
                objArr36[i236] = objArr36[i236 - 1];
                return 0;
            case 163:
                int i237 = this.f41280k - 1;
                this.f41280k = i237;
                Object[] objArr37 = this.f41284p;
                Object obj22 = objArr37[i237];
                objArr37[i237] = null;
                objArr37[11] = obj22;
                return 0;
            case 164:
                int i238 = this.f41280k - 1;
                this.f41280k = i238;
                Object[] objArr38 = this.f41284p;
                Object obj23 = objArr38[i238];
                objArr38[i238] = null;
                this.f41273d = obj23 == null ? 0 : 1;
                return 0;
            case 165:
                Object[] objArr39 = this.f41284p;
                int i239 = this.f41280k;
                objArr39[i239] = objArr39[i239 - 1];
                this.f41280k = i239;
                Object obj24 = objArr39[i239];
                objArr39[i239] = null;
                objArr39[12] = obj24;
                return 0;
            case 166:
                Object[] objArr40 = this.f41284p;
                int i240 = this.f41280k;
                this.f41280k = i240 + 1;
                objArr40[i240] = objArr40[12];
                return 0;
            case 167:
                Object[] objArr41 = this.f41284p;
                int i241 = this.f41280k;
                this.f41280k = i241 + 1;
                objArr41[i241] = objArr41[11];
                return 0;
            case 168:
                int[] iArr132 = this.m;
                iArr132[10] = iArr132[10] + 1;
                return 0;
            case 169:
                int[] iArr133 = this.m;
                int i242 = this.f41280k;
                iArr133[i242] = 11;
                iArr133[i242 - 1] = iArr133[i242 - 1] + iArr133[i242];
                this.f41280k = i242 + 1;
                iArr133[i242] = iArr133[i242 - 1];
                return 0;
            case 170:
                int[] iArr134 = this.m;
                int i243 = this.f41280k;
                iArr134[i243] = 49;
                this.f41280k = i243;
                iArr134[i243 - 1] = iArr134[i243 - 1] + iArr134[i243];
                return 0;
            case 171:
                int[] iArr135 = this.m;
                int i244 = this.f41280k;
                Object[] objArr42 = this.f41284p;
                Object obj25 = objArr42[i244 - 1];
                objArr42[i244 - 1] = null;
                iArr135[i244 - 1] = ((int[]) obj25).length;
                int i245 = i244 - 1;
                this.f41280k = i245;
                objArr42[i245] = null;
                return 0;
            case 172:
                int[] iArr136 = this.m;
                int i246 = this.f41280k;
                this.f41280k = i246 + 1;
                iArr136[i246] = 3;
                return 0;
            case 173:
                int i247 = this.f41280k;
                int i248 = i247 - 1;
                this.f41280k = i248;
                Object[] objArr43 = this.f41284p;
                Object obj26 = objArr43[i247 - 2];
                objArr43[i247 - 2] = null;
                objArr43[i247 - 2] = ((Object[]) obj26)[this.m[i248]];
                objArr43[i248] = objArr43[i247 - 2];
                int i249 = i247 - 1;
                this.f41280k = i249;
                Object obj27 = objArr43[i249];
                objArr43[i249] = null;
                objArr43[11] = obj27;
                return 0;
            case 174:
                Object[] objArr44 = this.f41284p;
                int i250 = this.f41280k;
                this.f41280k = i250 + 1;
                objArr44[i250] = null;
                int[] iArr137 = this.m;
                Object obj28 = objArr44[i250];
                objArr44[i250] = null;
                iArr137[i250] = ((int[]) obj28).length;
                return 0;
            case 175:
                int[] iArr138 = this.m;
                int i251 = this.f41280k;
                iArr138[i251] = 105;
                iArr138[i251 - 1] = iArr138[i251 - 1] + iArr138[i251];
                this.f41280k = i251 + 1;
                iArr138[i251] = iArr138[i251 - 1];
                return 0;
            case 176:
                int[] iArr139 = this.m;
                int i252 = this.f41280k;
                this.f41280k = i252 + 1;
                iArr139[i252] = 53;
                return 0;
            case 177:
                int[] iArr140 = this.m;
                int i253 = this.f41280k;
                this.f41280k = i253 + 1;
                iArr140[i253] = 95;
                return 0;
            case 178:
                int i254 = this.f41280k - 1;
                this.f41280k = i254;
                Object[] objArr45 = this.f41284p;
                Object obj29 = objArr45[i254];
                objArr45[i254] = null;
                this.f41273d = obj29 != null ? 0 : 1;
                return 0;
            case 179:
                int[] iArr141 = this.m;
                int i255 = this.f41280k;
                this.f41280k = i255 + 1;
                iArr141[i255] = 31;
                return 0;
            case 180:
                int[] iArr142 = this.m;
                int i256 = this.f41280k;
                this.f41280k = i256 + 1;
                iArr142[i256] = 115;
                return 0;
            case 181:
                int[] iArr143 = this.m;
                int i257 = this.f41280k;
                iArr143[i257] = iArr143[i257 - 1];
                iArr143[i257 + 1] = 128;
                int i258 = i257 + 1;
                this.f41280k = i258;
                iArr143[i257] = iArr143[i257] % iArr143[i258];
                return 0;
            case 182:
                int[] iArr144 = this.m;
                int i259 = this.f41280k;
                iArr144[i259] = 71;
                this.f41280k = i259;
                iArr144[i259 - 1] = iArr144[i259 - 1] + iArr144[i259];
                return 0;
            case 183:
                int i260 = this.f41280k;
                int i261 = i260 - 2;
                this.f41280k = i261;
                Object[] objArr46 = this.f41284p;
                Object obj30 = objArr46[i261];
                objArr46[i261] = null;
                Object obj31 = objArr46[i260 - 1];
                objArr46[i260 - 1] = null;
                this.f41273d = obj30 == obj31 ? 0 : 1;
                return 0;
            case 184:
                int i262 = this.f41280k - 1;
                this.f41280k = i262;
                int[] iArr145 = this.m;
                iArr145[9] = iArr145[i262];
                return 0;
            case 185:
                int[] iArr146 = this.m;
                int i263 = this.f41280k;
                this.f41280k = i263 + 1;
                iArr146[i263] = 20442;
                return 0;
            case 186:
                int[] iArr147 = this.m;
                int i264 = this.f41280k;
                iArr147[i264 - 1] = (byte) iArr147[i264 - 1];
                return 0;
            case 187:
                int[] iArr148 = this.m;
                int i265 = this.f41280k;
                this.f41280k = i265 + 1;
                iArr148[i265] = 5622;
                return 0;
            case 188:
                int i266 = this.f41280k;
                int i267 = i266 - 1;
                Object[] objArr47 = this.f41284p;
                Object obj32 = objArr47[i267];
                objArr47[i267] = null;
                objArr47[9] = obj32;
                this.f41280k = i266;
                objArr47[i267] = obj32;
                return 0;
            case 189:
                Object[] objArr48 = this.f41284p;
                int i268 = this.f41280k;
                this.f41280k = i268 + 1;
                objArr48[i268] = objArr48[9];
                return 0;
            case 190:
                int[] iArr149 = this.m;
                int i269 = this.f41280k;
                this.f41280k = i269 + 1;
                iArr149[i269] = 20441;
                return 0;
            case Opcodes.ATHROW /* 191 */:
                int i270 = this.f41280k;
                int[] iArr150 = this.m;
                iArr150[i270 - 2] = iArr150[i270 - 2] >> iArr150[i270 - 1];
                int i271 = i270 - 2;
                this.f41280k = i271;
                iArr150[i270 - 3] = iArr150[i270 - 3] - iArr150[i271];
                return 0;
            case 192:
                int[] iArr151 = this.m;
                int i272 = this.f41280k;
                iArr151[i272] = 103;
                this.f41280k = i272;
                iArr151[i272 - 1] = iArr151[i272 - 1] + iArr151[i272];
                return 0;
            case Opcodes.INSTANCEOF /* 193 */:
                int[] iArr152 = this.m;
                int i273 = this.f41280k;
                this.f41280k = i273 + 1;
                iArr152[i273] = 56;
                return 0;
            case Opcodes.MONITORENTER /* 194 */:
                int[] iArr153 = this.m;
                int i274 = this.f41280k;
                iArr153[i274] = 0;
                this.f41280k = i274;
                iArr153[i274 - 1] = iArr153[i274 - 1] / iArr153[i274];
                return 0;
            case Opcodes.MONITOREXIT /* 195 */:
                int[] iArr154 = this.m;
                int i275 = this.f41280k;
                iArr154[i275] = 75;
                iArr154[i275 - 1] = iArr154[i275 - 1] + iArr154[i275];
                this.f41280k = i275 + 1;
                iArr154[i275] = iArr154[i275 - 1];
                return 0;
            case 196:
                int[] iArr155 = this.m;
                int i276 = this.f41280k;
                this.f41280k = i276 + 1;
                iArr155[i276] = 98;
                return 0;
            case Opcodes.MULTIANEWARRAY /* 197 */:
                int[] iArr156 = this.m;
                int i277 = this.f41280k;
                this.f41280k = i277 + 1;
                iArr156[i277] = 13;
                return 0;
            case Opcodes.IFNULL /* 198 */:
                int[] iArr157 = this.m;
                int i278 = this.f41280k;
                this.f41280k = i278 + 1;
                iArr157[i278] = 34;
                return 0;
            case Opcodes.IFNONNULL /* 199 */:
                int[] iArr158 = this.m;
                int i279 = this.f41280k;
                this.f41280k = i279 + 1;
                iArr158[i279] = 67;
                return 0;
            case 200:
                Object[] objArr49 = this.f41284p;
                int i280 = this.f41280k;
                objArr49[i280] = objArr49[i280 - 1];
                this.f41280k = i280;
                Object obj33 = objArr49[i280];
                objArr49[i280] = null;
                objArr49[9] = obj33;
                return 0;
            case 201:
                int[] iArr159 = this.m;
                int i281 = this.f41280k;
                Object[] objArr50 = this.f41284p;
                Object obj34 = objArr50[i281 - 1];
                objArr50[i281 - 1] = null;
                iArr159[i281 - 1] = ((Object[]) obj34).length;
                return 0;
            case 202:
                int i282 = this.f41280k;
                int i283 = i282 - 1;
                int[] iArr160 = this.m;
                iArr160[10] = iArr160[i283];
                iArr160[i283] = 0;
                int i284 = i282 - 1;
                this.f41280k = i284;
                iArr160[11] = iArr160[i284];
                return 0;
            case 203:
                int[] iArr161 = this.m;
                int i285 = this.f41280k;
                this.f41280k = i285 + 1;
                iArr161[i285] = iArr161[11];
                return 0;
            case 204:
                int[] iArr162 = this.m;
                iArr162[11] = iArr162[11] + 1;
                return 0;
            case 205:
                int[] iArr163 = this.m;
                int i286 = this.f41280k;
                iArr163[i286] = 83;
                this.f41280k = i286;
                iArr163[i286 - 1] = iArr163[i286 - 1] + iArr163[i286];
                return 0;
            case 206:
                int[] iArr164 = this.m;
                int i287 = this.f41280k;
                iArr164[i287] = 65;
                this.f41280k = i287;
                iArr164[i287 - 1] = iArr164[i287 - 1] + iArr164[i287];
                return 0;
            case 207:
                int[] iArr165 = this.m;
                int i288 = this.f41280k;
                Object[] objArr51 = this.f41284p;
                Object obj35 = objArr51[i288 - 1];
                objArr51[i288 - 1] = null;
                iArr165[i288 - 1] = ((Object[]) obj35).length;
                int i289 = i288 - 1;
                iArr165[10] = iArr165[i289];
                this.f41280k = i288;
                iArr165[i289] = 1;
                return 0;
            case ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY /* 208 */:
                int i290 = this.f41280k - 1;
                this.f41280k = i290;
                int[] iArr166 = this.m;
                iArr166[11] = iArr166[i290];
                return 0;
            case ErrorCodes.ERR_CRY_BAD_PROTO /* 209 */:
                int[] iArr167 = this.m;
                int i291 = this.f41280k;
                this.f41280k = i291 + 1;
                iArr167[i291] = 25;
                return 0;
            case ErrorCodes.ERR_CRY_IO_PROPERTIES /* 210 */:
                int[] iArr168 = this.m;
                int i292 = this.f41280k;
                this.f41280k = i292 + 1;
                iArr168[i292] = 49;
                return 0;
            case 211:
                int i293 = this.f41280k - 1;
                this.f41280k = i293;
                Object[] objArr52 = this.f41284p;
                Object obj36 = objArr52[i293];
                objArr52[i293] = null;
                objArr52[12] = obj36;
                return 0;
            case ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE /* 212 */:
                Object[] objArr53 = this.f41284p;
                int i294 = this.f41280k;
                objArr53[i294 - 1] = new byte[this.m[i294 - 1]];
                return 0;
            case ErrorCodes.ERR_CRY_BAD_PIN_SIZE /* 213 */:
                int i295 = this.f41280k - 1;
                this.f41280k = i295;
                Object[] objArr54 = this.f41284p;
                Object obj37 = objArr54[i295];
                objArr54[i295] = null;
                objArr54[13] = obj37;
                return 0;
            case ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND /* 214 */:
                Object[] objArr55 = this.f41284p;
                int i296 = this.f41280k;
                this.f41280k = i296 + 1;
                objArr55[i296] = objArr55[13];
                return 0;
            case ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY /* 215 */:
                int i297 = this.f41280k - 1;
                this.f41280k = i297;
                this.f41273d = this.m[i297] <= 0 ? 0 : 1;
                return 0;
            case 216:
                int[] iArr169 = this.m;
                int i298 = this.f41280k;
                iArr169[i298] = iArr169[i298 - 1];
                this.f41280k = i298;
                iArr169[14] = iArr169[i298];
                return 0;
            case 217:
                Object[] objArr56 = this.f41284p;
                int i299 = this.f41280k;
                objArr56[i299] = objArr56[12];
                objArr56[i299 + 1] = objArr56[13];
                int[] iArr170 = this.m;
                this.f41280k = i299 + 3;
                iArr170[i299 + 2] = 0;
                return 0;
            case 218:
                int[] iArr171 = this.m;
                int i300 = this.f41280k;
                this.f41280k = i300 + 1;
                iArr171[i300] = iArr171[14];
                return 0;
            case 219:
                Object[] objArr57 = this.f41284p;
                int i301 = this.f41280k;
                objArr57[i301] = objArr57[8];
                this.f41280k = i301 + 2;
                objArr57[i301 + 1] = objArr57[9];
                return 0;
            case 220:
                int i302 = this.f41280k;
                int i303 = i302 - 1;
                Object[] objArr58 = this.f41284p;
                objArr58[i303] = null;
                this.f41280k = i302;
                objArr58[i303] = objArr58[12];
                return 0;
            case 221:
                int i304 = this.f41280k - 1;
                this.f41280k = i304;
                Object[] objArr59 = this.f41284p;
                Object obj38 = objArr59[i304];
                objArr59[i304] = null;
                objArr59[14] = obj38;
                return 0;
            case 222:
                int[] iArr172 = this.m;
                int i305 = this.f41280k;
                Object[] objArr60 = this.f41284p;
                Object obj39 = objArr60[i305 - 1];
                objArr60[i305 - 1] = null;
                iArr172[i305 - 1] = ((Object[]) obj39).length;
                int i306 = i305 - 1;
                iArr172[13] = iArr172[i306];
                this.f41280k = i305;
                iArr172[i306] = 0;
                return 0;
            case 223:
                int[] iArr173 = this.m;
                int i307 = this.f41280k;
                this.f41280k = i307 + 1;
                iArr173[i307] = iArr173[13];
                return 0;
            case 224:
                Object[] objArr61 = this.f41284p;
                int i308 = this.f41280k;
                this.f41280k = i308 + 1;
                objArr61[i308] = objArr61[14];
                return 0;
            case 225:
                int i309 = this.f41280k;
                int i310 = i309 - 1;
                this.f41280k = i310;
                Object[] objArr62 = this.f41284p;
                Object obj40 = objArr62[i309 - 2];
                objArr62[i309 - 2] = null;
                objArr62[i309 - 2] = ((Object[]) obj40)[this.m[i310]];
                int i311 = i309 - 2;
                Object obj41 = objArr62[i311];
                objArr62[i311] = null;
                objArr62[12] = obj41;
                this.f41280k = i309 - 1;
                objArr62[i311] = objArr62[8];
                return 0;
            case 226:
                int[] iArr174 = this.m;
                int i312 = this.f41280k;
                this.f41280k = i312 + 1;
                iArr174[i312] = 20440;
                return 0;
            case 227:
                long[] jArr7 = this.f41281l;
                int i313 = this.f41280k;
                this.f41280k = i313 + 1;
                jArr7[i313] = 0;
                return 0;
            case 228:
                int i314 = this.f41280k;
                int[] iArr175 = this.m;
                long[] jArr8 = this.f41281l;
                iArr175[i314 - 2] = (jArr8[i314 - 2] > jArr8[i314 - 1] ? 1 : (jArr8[i314 - 2] == jArr8[i314 - 1] ? 0 : -1));
                int i315 = i314 - 2;
                this.f41280k = i315;
                iArr175[i314 - 3] = iArr175[i314 - 3] + iArr175[i315];
                return 0;
            case 229:
                int[] iArr176 = this.m;
                int i316 = this.f41280k;
                iArr176[i316] = 16;
                this.f41280k = i316;
                iArr176[i316 - 1] = iArr176[i316 - 1] >> iArr176[i316];
                return 0;
            case ImageAnalysisKt.OVER_EXPOSED_THRESHOLD /* 230 */:
                int[] iArr177 = this.m;
                int i317 = this.f41280k;
                iArr177[i317] = 55;
                iArr177[i317 - 1] = iArr177[i317 - 1] + iArr177[i317];
                this.f41280k = i317 + 1;
                iArr177[i317] = iArr177[i317 - 1];
                return 0;
            case 231:
                int[] iArr178 = this.m;
                int i318 = this.f41280k;
                iArr178[i318] = 125;
                iArr178[i318 - 1] = iArr178[i318 - 1] + iArr178[i318];
                this.f41280k = i318 + 1;
                iArr178[i318] = iArr178[i318 - 1];
                return 0;
            case 232:
                int[] iArr179 = this.m;
                int i319 = this.f41280k;
                this.f41280k = i319 + 1;
                iArr179[i319] = 11;
                return 0;
            case 233:
                int[] iArr180 = this.m;
                int i320 = this.f41280k;
                this.f41280k = i320 + 1;
                iArr180[i320] = 47;
                return 0;
            case 234:
                int[] iArr181 = this.m;
                int i321 = this.f41280k;
                iArr181[i321] = iArr181[8];
                this.f41280k = i321;
                Object[] objArr63 = this.f41284p;
                Object obj42 = objArr63[i321 - 1];
                objArr63[i321 - 1] = null;
                objArr63[i321 - 1] = ((Object[]) obj42)[iArr181[i321]];
                return 0;
            case 235:
                int[] iArr182 = this.m;
                int i322 = this.f41280k;
                this.f41280k = i322 + 1;
                iArr182[i322] = 111;
                return 0;
            case 236:
                Object[] objArr64 = this.f41284p;
                int i323 = this.f41280k;
                this.f41280k = i323 + 1;
                objArr64[i323] = null;
                int[] iArr183 = this.m;
                Object obj43 = objArr64[i323];
                objArr64[i323] = null;
                iArr183[i323] = ((int[]) obj43).length;
                this.f41280k = i323;
                objArr64[i323] = null;
                return 0;
            case 237:
                int[] iArr184 = this.m;
                int i324 = this.f41280k;
                this.f41280k = i324 + 1;
                iArr184[i324] = 41;
                return 0;
            case 238:
                int[] iArr185 = this.m;
                int i325 = this.f41280k;
                this.f41280k = i325 + 1;
                iArr185[i325] = 76;
                return 0;
            case 239:
                int[] iArr186 = this.m;
                int i326 = this.f41280k;
                iArr186[i326] = 13;
                this.f41280k = i326;
                iArr186[i326 - 1] = iArr186[i326 - 1] + iArr186[i326];
                return 0;
            case 240:
                int[] iArr187 = this.m;
                int i327 = this.f41280k;
                this.f41280k = i327 + 1;
                iArr187[i327] = 10;
                return 0;
            case 241:
                int[] iArr188 = this.m;
                int i328 = this.f41280k;
                this.f41280k = i328 + 1;
                iArr188[i328] = 35;
                return 0;
            case 242:
                int[] iArr189 = this.m;
                int i329 = this.f41280k;
                this.f41280k = i329 + 1;
                iArr189[i329] = 119;
                return 0;
            case 243:
                int[] iArr190 = this.m;
                int i330 = this.f41280k;
                iArr190[i330] = 27;
                iArr190[i330 + 1] = 0;
                int i331 = i330 + 1;
                this.f41280k = i331;
                iArr190[i330] = iArr190[i330] / iArr190[i331];
                return 0;
            case 244:
                int[] iArr191 = this.m;
                int i332 = this.f41280k;
                this.f41280k = i332 + 1;
                iArr191[i332] = 15;
                return 0;
            case 245:
                int[] iArr192 = this.m;
                int i333 = this.f41280k;
                this.f41280k = i333 + 1;
                iArr192[i333] = 23;
                return 0;
            case 246:
                int[] iArr193 = this.m;
                int i334 = this.f41280k;
                iArr193[i334] = 123;
                this.f41280k = i334;
                iArr193[i334 - 1] = iArr193[i334 - 1] + iArr193[i334];
                return 0;
            case 247:
                int[] iArr194 = this.m;
                int i335 = this.f41280k;
                iArr194[i335] = 97;
                iArr194[i335 - 1] = iArr194[i335 - 1] + iArr194[i335];
                this.f41280k = i335 + 1;
                iArr194[i335] = iArr194[i335 - 1];
                return 0;
            case 248:
                int[] iArr195 = this.m;
                int i336 = this.f41280k;
                iArr195[i336] = 83;
                iArr195[i336 - 1] = iArr195[i336 - 1] + iArr195[i336];
                this.f41280k = i336 + 1;
                iArr195[i336] = iArr195[i336 - 1];
                return 0;
            case 249:
                int[] iArr196 = this.m;
                int i337 = this.f41280k;
                this.f41280k = i337 + 1;
                iArr196[i337] = 64;
                return 0;
            case 250:
                int[] iArr197 = this.m;
                int i338 = this.f41280k;
                this.f41280k = i338 + 1;
                iArr197[i338] = 14;
                return 0;
            case 251:
                int[] iArr198 = this.m;
                int i339 = this.f41280k;
                this.f41280k = i339 + 1;
                iArr198[i339] = 59;
                return 0;
            case 252:
                int[] iArr199 = this.m;
                int i340 = this.f41280k;
                this.f41280k = i340 + 1;
                iArr199[i340] = 79;
                return 0;
            case 253:
                Object[] objArr65 = this.f41284p;
                int i341 = this.f41280k;
                objArr65[i341] = objArr65[i341 - 1];
                this.f41280k = i341;
                Object obj44 = objArr65[i341];
                objArr65[i341] = null;
                objArr65[8] = obj44;
                return 0;
            case 254:
                int[] iArr200 = this.m;
                int i342 = this.f41280k;
                this.f41280k = i342 + 1;
                iArr200[i342] = 17;
                return 0;
            case 255:
                int[] iArr201 = this.m;
                int i343 = this.f41280k;
                iArr201[i343] = 35;
                this.f41280k = i343;
                iArr201[i343 - 1] = iArr201[i343 - 1] + iArr201[i343];
                return 0;
            case 256:
                int[] iArr202 = this.m;
                int i344 = this.f41280k;
                this.f41280k = i344 + 1;
                iArr202[i344] = 2069;
                return 0;
            case 257:
                int[] iArr203 = this.m;
                int i345 = this.f41280k;
                this.f41280k = i345 + 1;
                iArr203[i345] = 17939;
                return 0;
            case 258:
                int[] iArr204 = this.m;
                int i346 = this.f41280k;
                iArr204[i346] = 8;
                iArr204[i346 - 1] = iArr204[i346 - 1] >> iArr204[i346];
                int i347 = i346 - 1;
                this.f41280k = i347;
                iArr204[i346 - 2] = iArr204[i346 - 2] + iArr204[i347];
                return 0;
            case 259:
                int[] iArr205 = this.m;
                int i348 = this.f41280k;
                iArr205[i348] = 123;
                iArr205[i348 - 1] = iArr205[i348 - 1] + iArr205[i348];
                this.f41280k = i348 + 1;
                iArr205[i348] = iArr205[i348 - 1];
                return 0;
            case 260:
                int[] iArr206 = this.m;
                int i349 = this.f41280k;
                this.f41280k = i349 + 1;
                iArr206[i349] = 1;
                return 0;
            default:
                return i10;
        }
    }

    public dm(Object obj, Object obj2, Object obj3) {
        this.m = new int[15];
        this.f41281l = new long[15];
        this.f41282n = new float[15];
        this.f41285t = new double[15];
        Object[] objArr = new Object[15];
        this.f41284p = objArr;
        objArr[8] = obj;
        objArr[9] = obj2;
        objArr[10] = obj3;
        this.f41280k = 0;
        this.f41283o = -1;
    }

    public dm(Object obj) {
        this.m = new int[15];
        this.f41281l = new long[15];
        this.f41282n = new float[15];
        this.f41285t = new double[15];
        Object[] objArr = new Object[15];
        this.f41284p = objArr;
        objArr[8] = obj;
        this.f41280k = 0;
        this.f41283o = -1;
    }

    public dm() {
        this.m = new int[15];
        this.f41281l = new long[15];
        this.f41282n = new float[15];
        this.f41285t = new double[15];
        this.f41284p = new Object[15];
        this.f41280k = 0;
        this.f41283o = -1;
    }
}
