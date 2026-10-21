package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ajv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52940a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52941b = 1;

    public static ajz setDividerPadding(adu aduVar) {
        return (ajz) setY(new Object[]{aduVar}, -921880524, 921880524, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        adu aduVar = (adu) objArr[0];
        int i13 = f52941b;
        int i14 = i13 ^ 55;
        int i15 = (((i13 & 55) | i14) << 1) - i14;
        f52940a = i15 % 128;
        int i16 = i15 % 2;
        ajz ajzVar = (ajz) ajy.setY(new Object[]{aduVar}, -2013889902, 2013889908, (int) System.currentTimeMillis());
        if (ajzVar == null) {
            int i17 = f52941b;
            int i18 = i17 | 9;
            int i19 = i18 << 1;
            int i20 = -((~(i17 & 9)) & i18);
            int i21 = (i19 & i20) + (i20 | i19);
            f52940a = i21 % 128;
            int i22 = i21 % 2;
            ajzVar = (ajz) ahy.setOnFocusChangeListener(new Object[]{aduVar}, -1531837200, 1531837202, (int) System.currentTimeMillis());
            int i23 = f52941b + 17;
            f52940a = i23 % 128;
            int i24 = i23 % 2;
        }
        if (ajzVar == null) {
            int i25 = f52941b;
            int i26 = i25 & 67;
            int i27 = -(-(i25 | 67));
            int i28 = (i26 & i27) + (i27 | i26);
            f52940a = i28 % 128;
            if (i28 % 2 != 0) {
                ajzVar = (ajz) aic.setY(new Object[]{aduVar}, 1393763072, -1393763067, (int) System.currentTimeMillis());
                int i29 = 77 / 0;
            } else {
                ajzVar = (ajz) aic.setY(new Object[]{aduVar}, 1393763072, -1393763067, (int) System.currentTimeMillis());
            }
            int i30 = f52941b + 49;
            f52940a = i30 % 128;
            int i31 = i30 % 2;
        }
        if (ajzVar == null) {
            int i32 = f52941b;
            int i33 = i32 ^ 103;
            int i34 = (i32 & 103) << 1;
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            f52940a = i35 % 128;
            if (i35 % 2 != 0) {
                throw null;
            }
            ajzVar = (ajz) agw.setOnFocusChangeListener(new Object[]{aduVar}, -224265342, 224265349, (int) System.currentTimeMillis());
            int i36 = f52940a;
            int i37 = (i36 ^ 71) + ((i36 & 71) << 1);
            f52941b = i37 % 128;
            int i38 = i37 % 2;
        }
        if (ajzVar == null) {
            int i39 = f52941b;
            int i40 = i39 ^ 13;
            int i41 = ((i39 & 13) | i40) << 1;
            int i42 = -i40;
            int i43 = (i41 & i42) + (i41 | i42);
            f52940a = i43 % 128;
            int i44 = i43 % 2;
            ajzVar = (ajz) agz.setOnFocusChangeListener(new Object[]{aduVar}, -612046310, 612046318, (int) System.currentTimeMillis());
            int i45 = f52941b;
            int i46 = (((i45 ^ 9) | (i45 & 9)) << 1) - ((9 & (~i45)) | (i45 & (-10)));
            f52940a = i46 % 128;
            int i47 = i46 % 2;
        }
        if (ajzVar == null) {
            int i48 = f52941b + 113;
            f52940a = i48 % 128;
            int i49 = i48 % 2;
            ajzVar = (ajz) ahi.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 1187131918, -1187131911, (int) System.currentTimeMillis());
            int i50 = f52940a + 83;
            f52941b = i50 % 128;
            int i51 = i50 % 2;
        }
        int i52 = f52941b;
        int i53 = i52 & 97;
        int i54 = (i52 | 97) & (~i53);
        int i55 = -(-(i53 << 1));
        int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
        f52940a = i56 % 128;
        if (i56 % 2 == 0) {
            return ajzVar;
        }
        throw null;
    }
}
