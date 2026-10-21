package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class alk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53036a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53037b = 1;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
        int i15 = ~i10;
        int i16 = ~i12;
        if (((~(i11 | i16)) * 301) + (((~(i10 | i16 | i11)) | (~(i12 | i15)) | (~((~i11) | i15))) * (-301)) + (((~(i15 | i16)) | i11) * (-602)) + i14 == 1) {
            BigInteger bigInteger = (BigInteger) objArr[0];
            int i17 = f53036a;
            int i18 = i17 & 119;
            int i19 = (i17 | 119) & (~i18);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            f53037b = i21 % 128;
            int i22 = i21 % 2;
            int iBitLength = bigInteger.bitLength();
            int iIntValue = ((Integer) setX(new Object[]{Integer.valueOf(iBitLength)}, -1167744496, 1167744496, iBitLength)).intValue();
            int i23 = f53036a;
            int i24 = (i23 & 101) + (i23 | 101);
            f53037b = i24 % 128;
            int i25 = i24 % 2;
            return Integer.valueOf(iIntValue);
        }
        int iIntValue2 = ((Number) objArr[0]).intValue();
        int i26 = f53037b;
        int i27 = i26 & 29;
        int i28 = (i26 ^ 29) | i27;
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        int i30 = i29 % 128;
        f53036a = i30;
        int i31 = i29 % 2;
        if (iIntValue2 >= 2048) {
            int i32 = (-2) - ((i30 + 72) ^ (-1));
            int i33 = i32 % 128;
            f53037b = i33;
            int i34 = i32 % 2;
            if (iIntValue2 >= 3072) {
                int i35 = (i33 & 43) + (i33 | 43);
                int i36 = i35 % 128;
                f53036a = i36;
                if (i35 % 2 == 0 ? iIntValue2 < 7680 : iIntValue2 < 23149) {
                    int i37 = ((i33 ^ 98) + ((i33 & 98) << 1)) - 1;
                    f53036a = i37 % 128;
                    int i38 = i37 % 2;
                    i13 = 128;
                } else if (iIntValue2 >= 15360) {
                    int i39 = i36 & 59;
                    int i40 = i39 + ((i36 ^ 59) | i39);
                    f53037b = i40 % 128;
                    i13 = i40 % 2 == 0 ? 6812 : 256;
                } else {
                    int i41 = i36 ^ 69;
                    int i42 = (i36 & 69) << 1;
                    int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
                    f53037b = i43 % 128;
                    int i44 = i43 % 2;
                    i13 = 192;
                }
            } else {
                int i45 = ((i33 & 85) - (~(-(-(i33 | 85))))) - 1;
                f53036a = i45 % 128;
                int i46 = i45 % 2;
                i13 = 112;
            }
        } else if (iIntValue2 >= 1024) {
            int i47 = i26 + 55;
            f53036a = i47 % 128;
            i13 = i47 % 2 != 0 ? 63 : 80;
        } else {
            int i48 = i26 + 60;
            int i49 = (i48 ^ (-1)) + (i48 << 1);
            f53036a = i49 % 128;
            if (i49 % 2 != 0) {
                throw null;
            }
            i13 = 20;
        }
        return Integer.valueOf(i13);
    }

    public static int setY(BigInteger bigInteger) {
        return ((Integer) setX(new Object[]{bigInteger}, -863621598, 863621599, (int) System.currentTimeMillis())).intValue();
    }
}
