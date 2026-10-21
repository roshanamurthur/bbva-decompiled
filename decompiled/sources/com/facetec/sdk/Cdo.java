package com.facetec.sdk;

/* JADX INFO: renamed from: com.facetec.sdk.do, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f41317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f41321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f41322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f41323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f41325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float[] f41327l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long[] f41328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f41329o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object[] f41330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final double[] f41331s;

    public Cdo(Object obj, Object obj2, int i10) {
        int[] iArr = new int[11];
        this.f41329o = iArr;
        this.f41328n = new long[11];
        this.f41327l = new float[11];
        this.f41331s = new double[11];
        Object[] objArr = new Object[11];
        this.f41330r = objArr;
        objArr[6] = obj;
        objArr[7] = obj2;
        iArr[8] = i10;
        this.f41326k = 0;
        this.m = -1;
    }

    public int d(int i10) {
        switch (i10) {
            case 1:
                Object[] objArr = this.f41330r;
                int i11 = this.f41326k;
                this.f41326k = i11 + 1;
                objArr[i11] = this.f41324i;
                return 0;
            case 2:
                Object[] objArr2 = this.f41330r;
                int i12 = this.f41326k;
                this.f41326k = i12 + 1;
                objArr2[i12] = objArr2[6];
                return 0;
            case 3:
                int i13 = this.f41326k - this.f41319d;
                this.f41326k = i13;
                this.m = i13;
                return 0;
            case 4:
                Object[] objArr3 = this.f41330r;
                int i14 = this.m;
                this.m = i14 + 1;
                Object obj = objArr3[i14];
                objArr3[i14] = null;
                this.f41321f = obj;
                return 0;
            case 5:
                int[] iArr = this.f41329o;
                int i15 = this.f41326k;
                Object[] objArr4 = this.f41330r;
                Object obj2 = objArr4[i15 - 1];
                objArr4[i15 - 1] = null;
                iArr[i15 - 1] = ((Object[]) obj2).length;
                return 0;
            case 6:
                int[] iArr2 = this.f41329o;
                int i16 = this.m;
                this.m = i16 + 1;
                this.f41318c = iArr2[i16];
                return 0;
            case 7:
                int[] iArr3 = this.f41329o;
                int i17 = this.f41326k;
                this.f41326k = i17 + 1;
                iArr3[i17] = this.f41319d;
                return 0;
            case 8:
                int i18 = this.f41326k;
                int i19 = i18 - 1;
                int[] iArr4 = this.f41329o;
                iArr4[7] = iArr4[i19];
                Object[] objArr5 = this.f41330r;
                this.f41326k = i18;
                objArr5[i19] = objArr5[6];
                return 0;
            case 9:
                int[] iArr5 = this.f41329o;
                int i20 = this.f41326k;
                iArr5[i20] = iArr5[7];
                this.f41326k = i20;
                Object[] objArr6 = this.f41330r;
                Object obj3 = objArr6[i20 - 1];
                objArr6[i20 - 1] = null;
                objArr6[i20 - 1] = ((Object[]) obj3)[iArr5[i20]];
                return 0;
            case 10:
                int[] iArr6 = this.f41329o;
                int i21 = this.f41326k;
                this.f41326k = i21 + 1;
                iArr6[i21] = 2;
                return 0;
            case 11:
                int[] iArr7 = this.f41329o;
                int i22 = this.f41326k;
                iArr7[i22] = 2;
                this.f41326k = i22;
                iArr7[i22 - 1] = iArr7[i22 - 1] % iArr7[i22];
                return 0;
            case 12:
                int i23 = this.f41326k - 1;
                this.f41326k = i23;
                this.f41330r[i23] = null;
                return 0;
            case 14:
                Object[] objArr7 = this.f41330r;
                int i24 = this.f41326k;
                Object obj4 = objArr7[i24 - 1];
                objArr7[i24 - 1] = null;
                this.f41321f = obj4;
            case 13:
                return 0;
            case 15:
                int[] iArr8 = this.f41329o;
                int i25 = this.f41326k;
                iArr8[i25] = 67;
                iArr8[i25 - 1] = iArr8[i25 - 1] + iArr8[i25];
                this.f41326k = i25 + 1;
                iArr8[i25] = iArr8[i25 - 1];
                return 0;
            case 16:
                int[] iArr9 = this.f41329o;
                int i26 = this.f41326k;
                this.f41326k = i26 + 1;
                iArr9[i26] = 128;
                return 0;
            case 17:
                int i27 = this.f41326k;
                int i28 = i27 - 1;
                this.f41326k = i28;
                int[] iArr10 = this.f41329o;
                iArr10[i27 - 2] = iArr10[i27 - 2] % iArr10[i28];
                return 0;
            case 18:
                int i29 = this.f41326k - 1;
                this.f41326k = i29;
                this.f41318c = this.f41329o[i29] != 0 ? 0 : 1;
                return 0;
            case 19:
                int[] iArr11 = this.f41329o;
                int i30 = this.f41326k;
                this.f41326k = i30 + 1;
                iArr11[i30] = 53;
                return 0;
            case 20:
                int[] iArr12 = this.f41329o;
                int i31 = this.f41326k;
                this.f41326k = i31 + 1;
                iArr12[i31] = 0;
                return 0;
            case 21:
                int i32 = this.f41326k;
                int i33 = i32 - 1;
                this.f41326k = i33;
                int[] iArr13 = this.f41329o;
                iArr13[i32 - 2] = iArr13[i32 - 2] / iArr13[i33];
                int i34 = i32 - 2;
                this.f41326k = i34;
                this.f41330r[i34] = null;
                return 0;
            case 22:
                int[] iArr14 = this.f41329o;
                int i35 = this.f41326k - 1;
                this.f41326k = i35;
                this.f41318c = iArr14[i35];
                return 0;
            case 23:
                int[] iArr15 = this.f41329o;
                int i36 = this.f41326k;
                this.f41326k = i36 + 1;
                iArr15[i36] = 82;
                return 0;
            case 24:
                int[] iArr16 = this.f41329o;
                int i37 = this.f41326k;
                this.f41326k = i37 + 1;
                iArr16[i37] = 92;
                return 0;
            case 25:
                for (int i38 = this.f41326k - 1; i38 >= 0; i38--) {
                    this.f41330r[i38] = null;
                }
                Object[] objArr8 = this.f41330r;
                this.f41326k = 1;
                objArr8[0] = this.f41324i;
                return 0;
            case 26:
                int i39 = this.f41326k;
                int i40 = i39 - 2;
                this.f41326k = i40;
                Object[] objArr9 = this.f41330r;
                Object obj5 = objArr9[i40];
                objArr9[i40] = null;
                Object obj6 = objArr9[i39 - 1];
                objArr9[i39 - 1] = null;
                this.f41318c = obj5 != obj6 ? 0 : 1;
                return 0;
            case 27:
                int i41 = this.f41326k - 1;
                this.f41326k = i41;
                Object[] objArr10 = this.f41330r;
                Object obj7 = objArr10[i41];
                objArr10[i41] = null;
                this.f41318c = obj7 == null ? 0 : 1;
                return 0;
            case 28:
                Object[] objArr11 = this.f41330r;
                int i42 = this.f41326k;
                this.f41326k = i42 + 1;
                objArr11[i42] = objArr11[i42 - 1];
                return 0;
            case 29:
                this.f41318c = this.f41329o[this.f41326k - 1];
                return 0;
            case 30:
                int[] iArr17 = this.f41329o;
                int i43 = this.f41326k;
                this.f41326k = i43 + 1;
                iArr17[i43] = 1;
                return 0;
            case 31:
                int[] iArr18 = this.f41329o;
                int i44 = this.f41326k;
                this.f41326k = i44 + 1;
                iArr18[i44] = 0;
                return 0;
            case 32:
                int[] iArr19 = this.f41329o;
                int i45 = this.f41326k;
                iArr19[i45] = iArr19[i45 - 1];
                this.f41326k = i45;
                iArr19[9] = iArr19[i45];
                return 0;
            case 33:
                int i46 = this.f41326k;
                int i47 = i46 - 1;
                int[] iArr20 = this.f41329o;
                iArr20[10] = iArr20[i47];
                this.f41326k = i46;
                iArr20[i47] = iArr20[9];
                return 0;
            case 34:
                int[] iArr21 = this.f41329o;
                int i48 = this.f41326k;
                this.f41326k = i48 + 1;
                iArr21[i48] = iArr21[10];
                return 0;
            case 35:
                int[] iArr22 = this.f41329o;
                int i49 = this.f41326k;
                this.f41326k = i49 + 1;
                iArr22[i49] = iArr22[9];
                return 0;
            case 36:
                int i50 = this.f41326k - 1;
                this.f41326k = i50;
                this.f41318c = this.f41329o[i50] == 0 ? 0 : 1;
                return 0;
            case 37:
                int[] iArr23 = this.f41329o;
                int i51 = this.f41326k;
                iArr23[i51] = 1;
                this.f41326k = i51;
                iArr23[i51 - 1] = iArr23[i51 - 1] + iArr23[i51];
                return 0;
            case 38:
                int i52 = this.f41326k;
                int i53 = i52 - 1;
                this.f41326k = i53;
                int[] iArr24 = this.f41329o;
                Object[] objArr12 = this.f41330r;
                Object obj8 = objArr12[i52 - 2];
                objArr12[i52 - 2] = null;
                iArr24[i52 - 2] = ((int[]) obj8)[iArr24[i53]];
                return 0;
            case 39:
                int[] iArr25 = this.f41329o;
                int i54 = this.f41326k;
                this.f41326k = i54 + 1;
                iArr25[i54] = iArr25[8];
                return 0;
            case 40:
                Object[] objArr13 = this.f41330r;
                int i55 = this.f41326k;
                this.f41326k = i55 + 1;
                objArr13[i55] = objArr13[7];
                return 0;
            case 41:
                int[] iArr26 = this.f41329o;
                int i56 = this.f41326k;
                iArr26[i56] = 2;
                this.f41326k = i56;
                iArr26[i56 - 1] = iArr26[i56 - 1] % iArr26[i56];
                int i57 = i56 - 1;
                this.f41326k = i57;
                this.f41330r[i57] = null;
                return 0;
            case 42:
                int[] iArr27 = this.f41329o;
                int i58 = this.f41326k;
                iArr27[i58] = 2;
                this.f41326k = i58 + 2;
                iArr27[i58 + 1] = 2;
                return 0;
            case 43:
                int[] iArr28 = this.f41329o;
                int i59 = this.f41326k;
                this.f41326k = i59 + 1;
                iArr28[i59] = 29;
                return 0;
            case 44:
                int i60 = this.f41326k;
                int i61 = i60 - 1;
                this.f41326k = i61;
                int[] iArr29 = this.f41329o;
                iArr29[i60 - 2] = iArr29[i60 - 2] + iArr29[i61];
                return 0;
            case 45:
                int[] iArr30 = this.f41329o;
                int i62 = this.f41326k;
                iArr30[i62] = iArr30[i62 - 1];
                this.f41326k = i62 + 2;
                iArr30[i62 + 1] = 128;
                return 0;
            case 46:
                int[] iArr31 = this.f41329o;
                int i63 = this.f41326k;
                this.f41326k = i63 + 1;
                iArr31[i63] = 11;
                return 0;
            case 47:
                int i64 = this.f41326k;
                int i65 = i64 - 1;
                int[] iArr32 = this.f41329o;
                iArr32[i64 - 2] = iArr32[i64 - 2] + iArr32[i65];
                iArr32[i65] = iArr32[i64 - 2];
                this.f41326k = i64 + 1;
                iArr32[i64] = 128;
                return 0;
            case 48:
                int[] iArr33 = this.f41329o;
                int i66 = this.f41326k;
                iArr33[i66] = 64;
                iArr33[i66 + 1] = 0;
                int i67 = i66 + 1;
                this.f41326k = i67;
                iArr33[i66] = iArr33[i66] / iArr33[i67];
                return 0;
            case 49:
                int[] iArr34 = this.f41329o;
                int i68 = this.f41326k;
                this.f41326k = i68 + 1;
                iArr34[i68] = 77;
                return 0;
            case 50:
                int i69 = this.f41326k;
                int i70 = i69 - 1;
                int[] iArr35 = this.f41329o;
                iArr35[i69 - 2] = iArr35[i69 - 2] + iArr35[i70];
                this.f41326k = i69;
                iArr35[i70] = iArr35[i69 - 2];
                return 0;
            case 51:
                int[] iArr36 = this.f41329o;
                int i71 = this.f41326k;
                iArr36[i71] = 128;
                this.f41326k = i71;
                iArr36[i71 - 1] = iArr36[i71 - 1] % iArr36[i71];
                return 0;
            case 52:
                int[] iArr37 = this.f41329o;
                int i72 = this.f41326k;
                iArr37[i72] = 5;
                iArr37[i72 + 1] = 4;
                int i73 = i72 + 1;
                this.f41326k = i73;
                iArr37[i72] = iArr37[i72] >>> iArr37[i73];
                return 0;
            case 53:
                int[] iArr38 = this.f41329o;
                int i74 = this.f41326k;
                this.f41326k = i74 + 1;
                iArr38[i74] = 117;
                return 0;
            case 54:
                int[] iArr39 = this.f41329o;
                int i75 = this.f41326k;
                iArr39[i75] = 27;
                this.f41326k = i75;
                iArr39[i75 - 1] = iArr39[i75 - 1] + iArr39[i75];
                return 0;
            case 55:
                int[] iArr40 = this.f41329o;
                int i76 = this.f41326k;
                iArr40[i76] = iArr40[i76 - 1];
                iArr40[i76 + 1] = 128;
                int i77 = i76 + 1;
                this.f41326k = i77;
                iArr40[i76] = iArr40[i76] % iArr40[i77];
                return 0;
            case 56:
                int[] iArr41 = this.f41329o;
                int i78 = this.f41326k;
                iArr41[i78] = 5;
                this.f41326k = i78 + 2;
                iArr41[i78 + 1] = 2;
                return 0;
            case 57:
                int i79 = this.f41326k;
                int i80 = i79 - 1;
                this.f41326k = i80;
                int[] iArr42 = this.f41329o;
                iArr42[i79 - 2] = iArr42[i79 - 2] - iArr42[i80];
                return 0;
            case 58:
                int[] iArr43 = this.f41329o;
                int i81 = this.f41326k;
                this.f41326k = i81 + 1;
                iArr43[i81] = 13;
                return 0;
            case 59:
                int[] iArr44 = this.f41329o;
                int i82 = this.f41326k;
                this.f41326k = i82 + 1;
                iArr44[i82] = 42;
                return 0;
            default:
                return i10;
        }
    }

    public Cdo(Object obj) {
        this.f41329o = new int[11];
        this.f41328n = new long[11];
        this.f41327l = new float[11];
        this.f41331s = new double[11];
        Object[] objArr = new Object[11];
        this.f41330r = objArr;
        objArr[6] = obj;
        this.f41326k = 0;
        this.m = -1;
    }
}
