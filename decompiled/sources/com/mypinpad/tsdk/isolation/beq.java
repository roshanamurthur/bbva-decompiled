package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class beq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54650a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54651b = 1;

    public static int setDividerPadding(int i10) {
        return ((Integer) setY(new Object[]{Integer.valueOf(i10)}, 339562877, -339562877, i10)).intValue();
    }

    public static Integer setOnFocusChangeListener(int i10) {
        return (Integer) setY(new Object[]{Integer.valueOf(i10)}, 843618426, -843618423, i10);
    }

    public static int setX(int i10, int i11) {
        return ((Integer) setY(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 582008537, -582008536, i10)).intValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-574)) + (i10 * (-574));
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~((~i11) | i12);
        int i18 = ((~(i11 | i15)) | i17) * (-575);
        int i19 = (((~(i10 | i15)) | (~(i12 | i14))) * 575) + i18 + ((i16 | i17) * 1150) + i13;
        if (i19 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int iIntValue2 = ((Number) objArr[1]).intValue();
            int i20 = f54650a + 77;
            f54651b = i20 % 128;
            int i21 = i20 % 2;
            int iRotateLeft = Integer.rotateLeft(iIntValue, iIntValue2);
            if (i21 == 0) {
                int i22 = 69 / 0;
            }
            int i23 = f54650a;
            int i24 = i23 & 13;
            int i25 = i24 + ((i23 ^ 13) | i24);
            f54651b = i25 % 128;
            int i26 = i25 % 2;
            return Integer.valueOf(iRotateLeft);
        }
        if (i19 == 2) {
            int iIntValue3 = ((Number) objArr[0]).intValue();
            int i27 = f54651b;
            int i28 = i27 & 45;
            int i29 = ((((i27 ^ 45) | i28) << 1) - (~(-((i27 | 45) & (~i28))))) - 1;
            f54650a = i29 % 128;
            if (i29 % 2 == 0) {
                return Integer.valueOf(Integer.numberOfTrailingZeros(iIntValue3));
            }
            Integer.numberOfTrailingZeros(iIntValue3);
            throw null;
        }
        if (i19 == 3) {
            int iIntValue4 = ((Number) objArr[0]).intValue();
            int i30 = f54650a + 15;
            f54651b = i30 % 128;
            int i31 = i30 % 2;
            Integer numValueOf = Integer.valueOf(iIntValue4);
            int i32 = f54650a;
            int i33 = (i32 ^ 27) + ((i32 & 27) << 1);
            f54651b = i33 % 128;
            int i34 = i33 % 2;
            return numValueOf;
        }
        int iIntValue5 = ((Number) objArr[0]).intValue();
        int i35 = f54650a;
        int i36 = i35 & 17;
        int i37 = i36 + ((i35 ^ 17) | i36);
        f54651b = i37 % 128;
        int i38 = i37 % 2;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(iIntValue5);
        int i39 = f54651b;
        int i40 = (i39 & (-40)) | ((~i39) & 39);
        int i41 = -(-((i39 & 39) << 1));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        f54650a = i42 % 128;
        if (i42 % 2 != 0) {
            int i43 = 89 / 0;
        }
        return Integer.valueOf(iNumberOfLeadingZeros);
    }

    public static int setX(int i10) {
        return ((Integer) setY(new Object[]{Integer.valueOf(i10)}, -315691484, 315691486, i10)).intValue();
    }
}
