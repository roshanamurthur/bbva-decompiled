package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54598a;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = ~i11;
        int i16 = ((i10 | i15) * 983) + (i11 * 984) + (i10 * (-1965));
        int i17 = ~i10;
        int i18 = ~i12;
        if ((((~(i17 | i11)) | (~(i18 | i17))) * 983) + (((~(i15 | i18)) | i17) * (-983)) + i16 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i19 = f54598a;
            int i20 = ((i19 ^ 91) | (i19 & 91)) << 1;
            int i21 = -((i19 & (-92)) | ((~i19) & 91));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            int i23 = i22 % 128;
            int i24 = i22 % 2;
            if (iIntValue == 5) {
                int i25 = i19 + 3;
                int i26 = i25 % 128;
                int i27 = i25 % 2;
                i13 = 5224;
            } else {
                if (iIntValue != 6) {
                    throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(iIntValue)));
                }
                int i28 = i19 + 12;
                int i29 = (i28 ^ (-1)) + (i28 << 1);
                int i30 = i29 % 128;
                int i31 = i29 % 2;
                i13 = 12392;
            }
            return Integer.valueOf(i13);
        }
        int iIntValue2 = ((Number) objArr[0]).intValue();
        int i32 = f54598a;
        int i33 = i32 + 59;
        int i34 = i33 % 128;
        if (i33 % 2 == 0) {
            throw null;
        }
        if (iIntValue2 == 5) {
            int i35 = i34 & 83;
            int i36 = (i35 - (~((i34 ^ 83) | i35))) - 1;
            f54598a = i36 % 128;
            int i37 = i36 % 2;
            i14 = 14880;
        } else {
            if (iIntValue2 != 6) {
                throw new IllegalArgumentException("unknown security category: ".concat(String.valueOf(iIntValue2)));
            }
            int i38 = i32 & 55;
            int i39 = (((i32 | 55) & (~i38)) - (~(-(-(i38 << 1))))) - 1;
            int i40 = i39 % 128;
            int i41 = i39 % 2;
            i14 = 38432;
        }
        return Integer.valueOf(i14);
    }
}
