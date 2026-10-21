package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55299a;

    public static /* synthetic */ Integer a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
        int i17 = ~(i15 | i12);
        int i18 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i18 | i13))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16 != 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i19 = f55299a;
            int i20 = i19 & 125;
            int i21 = (i19 ^ 125) | i20;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            int i23 = i22 % 128;
            return Integer.valueOf(i22 % 2 == 0 ? (iIntValue >>> 84) * 122 : ((-2) - ((iIntValue + 64) ^ (-1))) / 64);
        }
        int iIntValue2 = ((Number) objArr[0]).intValue();
        int i24 = f55299a;
        int i25 = i24 ^ 47;
        int i26 = -(-((i24 & 47) << 1));
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        int i28 = i27 % 128;
        int i29 = i27 % 2;
        int i30 = (iIntValue2 * (-1917)) + 6720;
        int i31 = ~iIntValue2;
        int i32 = ~(i31 | i31);
        int i33 = iIntValue2 ^ 7;
        int i34 = iIntValue2 & 7;
        int i35 = ~((i33 & i34) | (i33 ^ i34));
        int i36 = ((i32 & i35) | (i32 ^ i35)) * 959;
        int i37 = i30 & i36;
        int i38 = (i37 - (~(-(-((i30 ^ i36) | i37))))) - 1;
        int i39 = i31 * (-959);
        int i40 = ((i38 ^ i39) | (i38 & i39)) << 1;
        int i41 = -((i39 & (~i38)) | ((~i39) & i38));
        int i42 = (i40 & i41) + (i41 | i40);
        int i43 = (i31 | iIntValue2) & i31;
        int i44 = i43 & iIntValue2;
        int i45 = ((iIntValue2 | i43) & (~i44)) | i44;
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = i43 & 7;
        int i49 = ((i43 | 7) & (~i48)) | i48;
        int i50 = ~i49;
        int i51 = (i49 | i50) & i50;
        int i52 = i47 ^ i51;
        int i53 = i47 & i51;
        int i54 = -(~(-(-(((i53 & i52) | (i52 ^ i53)) * 959))));
        int i55 = ((((i42 | i54) << 1) - (i54 ^ i42)) - 1) / 8;
        int i56 = ((i28 & 96) + (i28 | 96)) - 1;
        f55299a = i56 % 128;
        if (i56 % 2 == 0) {
            return Integer.valueOf(i55);
        }
        throw null;
    }
}
