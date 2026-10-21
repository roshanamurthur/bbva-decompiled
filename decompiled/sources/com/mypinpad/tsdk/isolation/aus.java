package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53923a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53924b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ((~i15) * 497) + (i11 * (-496)) + (i10 * (-496));
        int i17 = ~(i15 | i12);
        int i18 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i18 | i13))) * 497) + ((i17 | (~(i14 | i18 | i10))) * 497) + i16 == 1) {
            long jLongValue = ((Number) objArr[0]).longValue();
            long jLongValue2 = ((Number) objArr[1]).longValue();
            int iIntValue = ((Number) objArr[2]).intValue();
            int i19 = f53923a;
            int i20 = i19 ^ 57;
            int i21 = ((i19 & 57) | i20) << 1;
            int i22 = -i20;
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            f53924b = i23 % 128;
            int i24 = i23 % 2;
            long j10 = ((jLongValue >>> iIntValue) ^ jLongValue) & jLongValue2;
            long j11 = (j10 ^ (j10 << iIntValue)) ^ jLongValue;
            int i25 = (i19 & 11) + (i19 | 11);
            f53924b = i25 % 128;
            if (i25 % 2 != 0) {
                return Long.valueOf(j11);
            }
            throw null;
        }
        int iIntValue2 = ((Number) objArr[0]).intValue();
        int iIntValue3 = ((Number) objArr[1]).intValue();
        int iIntValue4 = ((Number) objArr[2]).intValue();
        int i26 = f53924b;
        int i27 = ((i26 | 21) << 1) - (i26 ^ 21);
        f53923a = i27 % 128;
        int i28 = i27 % 2;
        int i29 = iIntValue2 >>> iIntValue4;
        int i30 = iIntValue2 & i29;
        int i31 = iIntValue3 & ((i29 ^ iIntValue2) | i30) & (~i30);
        int i32 = i31 << iIntValue4;
        int i33 = (i32 | i31) & (~(i31 & i32));
        int i34 = i33 & iIntValue2;
        int i35 = ((i33 ^ iIntValue2) | i34) & (~i34);
        int i36 = (i26 & 29) + (i26 | 29);
        f53923a = i36 % 128;
        int i37 = i36 % 2;
        return Integer.valueOf(i35);
    }

    public static long setY(long j10, long j11, int i10) {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)}, 474490917, -474490916, i10)).longValue();
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int i11, int i12) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, -795789696, 795789696, i10)).intValue();
    }
}
