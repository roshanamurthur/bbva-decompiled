package com.mypinpad.tsdk.isolation;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import kotlin.ranges.LongRange;

/* JADX INFO: loaded from: classes10.dex */
public final class setTitleMargin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60719a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60720b = 1;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~(i13 | i11);
        if ((((~(i10 | (~i11))) | i12 | i16) * 397) + (i16 * (-397)) + (((~(i14 | i11)) | i15 | i16) * (-397)) + (i11 * (-396)) + (i10 * 398) == 1) {
            Long l6 = (Long) objArr[0];
            int i17 = f60720b;
            int i18 = i17 | 45;
            int i19 = i18 << 1;
            int i20 = -((~(i17 & 45)) & i18);
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f60719a = i21 % 128;
            int i22 = i21 % 2;
            boolean zBooleanValue = ((Boolean) setX(new Object[]{l6}, 2022465847, -2022465847, (int) System.currentTimeMillis())).booleanValue();
            int i23 = f60719a;
            int i24 = (i23 ^ 71) + ((i23 & 71) << 1);
            f60720b = i24 % 128;
            if (i24 % 2 != 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        Long l7 = (Long) objArr[0];
        int i25 = f60720b;
        int i26 = (((i25 | 84) << 1) - (i25 ^ 84)) - 1;
        f60719a = i26 % 128;
        int i27 = i26 % 2;
        if (l7 == null || new LongRange(0L, BusinessLogicTransactionInformation.MAX_AMOUNT).contains(l7.longValue())) {
            int i28 = f60719a;
            int i29 = (((i28 | 88) << 1) - (i28 ^ 88)) - 1;
            f60720b = i29 % 128;
            int i30 = i29 % 2;
            return Boolean.TRUE;
        }
        int i31 = f60719a;
        int i32 = i31 & 117;
        int i33 = i32 + ((i31 ^ 117) | i32);
        f60720b = i33 % 128;
        int i34 = i33 % 2;
        return Boolean.FALSE;
    }
}
