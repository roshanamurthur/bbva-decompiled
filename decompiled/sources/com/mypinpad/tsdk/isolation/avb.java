package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.emoji2.text.flatbuffer.a;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import java.math.BigInteger;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public abstract class avb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53942a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53943b = 1;

    public static /* synthetic */ Integer a(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53943b;
        int i11 = i10 ^ 87;
        int i12 = ((i10 & 87) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f53942a = i14 % 128;
        int i15 = i14 % 2;
        long j10 = ((long) iIntValue) & 4294967295L;
        long j11 = (6803 * j10) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = j10 + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
        iArr[1] = (int) j12;
        long j13 = (j12 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j13;
        if ((j13 >>> 32) != 0) {
            int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr, 0, 3}, 716282167, -716282152, 7)).intValue();
            int i16 = f53942a;
            int i17 = i16 & 23;
            int i18 = ((i16 | 23) & (~i17)) + (i17 << 1);
            f53943b = i18 % 128;
            if (i18 % 2 != 0) {
                return Integer.valueOf(iIntValue2);
            }
            throw null;
        }
        int i19 = i10 & 35;
        int i20 = (i10 ^ 35) | i19;
        int i21 = (i19 & i20) + (i19 | i20);
        f53942a = i21 % 128;
        int i22 = i21 % 2;
        int i23 = ((i10 | 87) << 1) - i11;
        f53942a = i23 % 128;
        if (i23 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53943b;
        int i11 = i10 & 33;
        int i12 = i10 | 33;
        int i13 = (i11 & i12) + (i11 | i12);
        int i14 = i13 % 128;
        f53942a = i14;
        int i15 = i13 % 2;
        if (iArr[0] != 1) {
            int i16 = (i10 ^ 48) + ((i10 & 48) << 1);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            f53942a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i10 + 5;
            f53942a = i19 % 128;
            if (i19 % 2 == 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i20 = ((i14 & 34) + (i14 | 34)) - 1;
        f53943b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 1;
        while (i22 < 7) {
            int i23 = f53943b;
            int i24 = i23 + 79;
            f53942a = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = iArr[i22];
                throw null;
            }
            if (iArr[i22] != 0) {
                int i26 = ((i23 ^ 56) + ((i23 & 56) << 1)) - 1;
                f53942a = i26 % 128;
                int i27 = i26 % 2;
                return Boolean.FALSE;
            }
            i22 = ((i22 & 1) << 1) + (i22 ^ 1);
            int i28 = (i23 | 7) << 1;
            int i29 = -(i23 ^ 7);
            int i30 = (i28 & i29) + (i29 | i28);
            f53942a = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = f53942a;
        int i33 = i32 & 87;
        int i34 = ((i32 ^ 87) | i33) << 1;
        int i35 = -((i32 | 87) & (~i33));
        int i36 = (i34 & i35) + (i35 | i34);
        f53943b = i36 % 128;
        int i37 = i36 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53942a + 115;
        int i12 = i11 % 128;
        f53943b = i12;
        int i13 = i11 % 2;
        int i14 = (i12 & (-18)) | ((~i12) & 17);
        int i15 = -(-((i12 & 17) << 1));
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        f53942a = i16 % 128;
        int i17 = i16 % 2;
        while (i10 < 7) {
            int i18 = f53943b;
            int i19 = ((i18 & 65) - (~(i18 | 65))) - 1;
            f53942a = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = iArr[i10];
                throw null;
            }
            if (iArr[i10] != 0) {
                int i21 = i18 & 55;
                int i22 = (~i21) & (i18 | 55);
                int i23 = -(-(i21 << 1));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f53942a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = i18 ^ 119;
                int i27 = (i18 & 119) << 1;
                int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
                f53942a = i28 % 128;
                int i29 = i28 % 2;
                return Boolean.FALSE;
            }
            int i30 = ((i10 ^ 1) | (i10 & 1)) << 1;
            int i31 = -(((~i10) & 1) | (i10 & (-2)));
            i10 = ((i30 | i31) << 1) - (i31 ^ i30);
            int i32 = (-2) - ((i18 + 14) ^ (-1));
            f53942a = i32 % 128;
            int i33 = i32 % 2;
        }
        System.currentTimeMillis();
        System.currentTimeMillis();
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53943b;
        int i11 = i10 | 43;
        int i12 = i11 << 1;
        int i13 = -(i11 & (~(i10 & 43)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f53942a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (i10 & 62) + (i10 | 62);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        f53942a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 6;
        while (i19 >= 0) {
            int i20 = f53942a;
            int i21 = i20 & 31;
            int i22 = ((i20 ^ 31) | i21) << 1;
            int i23 = -((~i21) & (i20 | 31));
            int i24 = (i22 & i23) + (i22 | i23);
            int i25 = i24 % 128;
            f53943b = i25;
            int i26 = i24 % 2;
            int i27 = iArr[i19];
            int i28 = i27 & Integer.MIN_VALUE;
            int i29 = ((i27 ^ Integer.MIN_VALUE) | i28) & (~i28);
            int i30 = iArr2[i19];
            int i31 = (Integer.MIN_VALUE & (~i30)) | (Integer.MAX_VALUE & i30);
            if (i29 < i31) {
                int i32 = i25 & 85;
                int i33 = (((~i32) & (i25 | 85)) - (~(-(-(i32 << 1))))) - 1;
                f53942a = i33 % 128;
                return Boolean.valueOf(i33 % 2 != 0);
            }
            if (i29 > i31) {
                int i34 = i20 + 43;
                f53943b = i34 % 128;
                int i35 = i34 % 2;
                int i36 = i20 + 46;
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f53943b = i37 % 128;
                int i38 = i37 % 2;
                return Boolean.TRUE;
            }
            i19--;
            int i39 = ((((i20 ^ 7) | (i20 & 7)) << 1) - (~(-(((~i20) & 7) | (i20 & (-8)))))) - 1;
            f53943b = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = f53942a;
        int i42 = i41 & 51;
        int i43 = ((i41 ^ 51) | i42) << 1;
        int i44 = -((i41 | 51) & (~i42));
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        f53943b = i45 % 128;
        if (i45 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53942a + 111;
        int i11 = i10 % 128;
        f53943b = i11;
        int i12 = i10 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (4294967295L & ((long) iArr2[6])) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        int i13 = (int) (j16 >>> 32);
        int i14 = ((i11 & 68) + (i11 | 68)) - 1;
        f53942a = i14 % 128;
        if (i14 % 2 == 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    public static /* synthetic */ Boolean f(Object[] objArr) {
        int i10;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i11 = f53942a;
        int i12 = ((i11 & (-36)) | ((~i11) & 35)) + ((i11 & 35) << 1);
        int i13 = i12 % 128;
        f53943b = i13;
        int i14 = i12 % 2 == 0 ? 85 : 6;
        int i15 = i13 + 1;
        f53942a = i15 % 128;
        while (true) {
            int i16 = i15 % 2;
            if (i14 < 0) {
                int i17 = f53943b;
                int i18 = i17 & 97;
                int i19 = i18 + ((i17 ^ 97) | i18);
                f53942a = i19 % 128;
                if (i19 % 2 == 0) {
                    return Boolean.TRUE;
                }
                int i20 = 40 / 0;
                return Boolean.TRUE;
            }
            int i21 = f53943b;
            int i22 = ((i21 & (-56)) | ((~i21) & 55)) + ((i21 & 55) << 1);
            i10 = i22 % 128;
            f53942a = i10;
            if (i22 % 2 != 0) {
                int i23 = 60 / 0;
                if (iArr[i14] != iArr2[i14]) {
                    break;
                }
                int i24 = (i14 << 1) - i14;
                i14 = (i24 ^ (-1)) + (i24 << 1);
                i15 = i10 + 83;
                f53943b = i15 % 128;
            } else {
                if (iArr[i14] != iArr2[i14]) {
                    break;
                }
                int i25 = (i14 << 1) - i14;
                i14 = (i25 ^ (-1)) + (i25 << 1);
                i15 = i10 + 83;
                f53943b = i15 % 128;
            }
        }
        int i26 = (-2) - (((i10 & 70) + (i10 | 70)) ^ (-1));
        int i27 = i26 % 128;
        f53943b = i27;
        int i28 = i26 % 2;
        int i29 = i27 + 69;
        f53942a = i29 % 128;
        if (i29 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i30 = 63 / 0;
        return Boolean.FALSE;
    }

    public static /* synthetic */ Object g(Object[] objArr) {
        int i10 = 0;
        BigInteger bigIntegerShiftRight = (BigInteger) objArr[0];
        int i11 = f53943b + 39;
        f53942a = i11 % 128;
        int i12 = i11 % 2;
        if (bigIntegerShiftRight.signum() >= 0) {
            int i13 = f53943b;
            int i14 = ((i13 ^ 41) | (i13 & 41)) << 1;
            int i15 = -(((~i13) & 41) | (i13 & (-42)));
            int i16 = (i14 & i15) + (i15 | i14);
            f53942a = i16 % 128;
            int i17 = i16 % 2;
            if (bigIntegerShiftRight.bitLength() <= 224) {
                int[] iArr = (int[]) setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                int i18 = f53943b;
                int i19 = ((i18 ^ 70) + ((i18 & 70) << 1)) - 1;
                f53942a = i19 % 128;
                int i20 = i19 % 2;
                while (i10 < 7) {
                    int i21 = f53942a + 101;
                    f53943b = i21 % 128;
                    int i22 = i21 % 2;
                    iArr[i10] = bigIntegerShiftRight.intValue();
                    bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                    i10++;
                    int i23 = f53942a + 111;
                    f53943b = i23 % 128;
                    int i24 = i23 % 2;
                }
                int i25 = f53942a;
                int i26 = ((i25 | 27) << 1) - (i25 ^ 27);
                f53943b = i26 % 128;
                if (i26 % 2 != 0) {
                    return iArr;
                }
                throw null;
            }
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ Long h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53943b;
        int i11 = ((i10 ^ 101) | (i10 & 101)) << 1;
        int i12 = -(((~i10) & 101) | (i10 & (-102)));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f53942a = i14;
        int i15 = i13 % 2;
        long j10 = ((long) iArr[7]) & 4294967295L;
        long j11 = (j10 * 6803) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j11;
        long j12 = ((long) iArr[8]) & 4294967295L;
        long j13 = (j12 * 6803) + j10 + (((long) iArr2[1]) & 4294967295L) + (j11 >>> 32);
        iArr3[1] = (int) j13;
        long j14 = ((long) iArr[9]) & 4294967295L;
        long j15 = (j14 * 6803) + j12 + (((long) iArr2[2]) & 4294967295L) + (j13 >>> 32);
        iArr3[2] = (int) j15;
        long j16 = ((long) iArr[10]) & 4294967295L;
        long j17 = (j16 * 6803) + j14 + (((long) iArr2[3]) & 4294967295L) + (j15 >>> 32);
        iArr3[3] = (int) j17;
        long j18 = ((long) iArr[11]) & 4294967295L;
        long j19 = (j18 * 6803) + j16 + (((long) iArr2[4]) & 4294967295L) + (j17 >>> 32);
        iArr3[4] = (int) j19;
        long j20 = ((long) iArr[12]) & 4294967295L;
        long j21 = (j20 * 6803) + j18 + (((long) iArr2[5]) & 4294967295L) + (j19 >>> 32);
        iArr3[5] = (int) j21;
        long j22 = j21 >>> 32;
        long j23 = ((long) iArr[13]) & 4294967295L;
        long j24 = (6803 * j23) + j20 + (4294967295L & ((long) iArr2[6])) + j22;
        iArr3[6] = (int) j24;
        long j25 = (j24 >>> 32) + j23;
        int i16 = (i14 & 3) + (3 | i14);
        f53943b = i16 % 128;
        if (i16 % 2 != 0) {
            return Long.valueOf(j25);
        }
        int i17 = 41 / 0;
        return Long.valueOf(j25);
    }

    public static /* synthetic */ Integer i(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53942a;
        int i11 = ((i10 ^ 21) | (i10 & 21)) << 1;
        int i12 = -((i10 & (-22)) | ((~i10) & 21));
        int i13 = (i11 & i12) + (i11 | i12);
        f53943b = i13 % 128;
        int i14 = i13 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((((long) iArr[6]) & 4294967295L) - (4294967295L & ((long) iArr2[6]))) + (j15 >> 32);
        iArr3[6] = (int) j16;
        int i15 = (int) (j16 >> 32);
        int i16 = i10 & 7;
        int i17 = (~i16) & (i10 | 7);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f53943b = i19 % 128;
        if (i19 % 2 != 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static /* synthetic */ Integer j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53942a;
        int i11 = i10 & 91;
        int i12 = ((~i11) & (i10 | 91)) + (i11 << 1);
        f53943b = i12 % 128;
        int i13 = i12 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (4294967295L & ((long) iArr3[6])) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        int i14 = (int) (j16 >>> 32);
        int i15 = ((i10 | 121) << 1) - (i10 ^ 121);
        f53943b = i15 % 128;
        if (i15 % 2 != 0) {
            return Integer.valueOf(i14);
        }
        throw null;
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53943b;
        int i11 = i10 & 91;
        int i12 = ((i10 ^ 91) | i11) << 1;
        int i13 = -((~i11) & (i10 | 91));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f53942a = i14 % 128;
        int i15 = i14 % 2;
        long j10 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6]))) + (j15 >> 32);
        iArr2[6] = (int) j16;
        int i16 = (int) (j16 >> 32);
        int i17 = i10 & 121;
        int i18 = -(-((i10 ^ 121) | i17));
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f53942a = i19 % 128;
        if (i19 % 2 == 0) {
            return Integer.valueOf(i16);
        }
        throw null;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int[] iArr;
        byte[] bArr;
        int i13;
        int i14 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i15 = ~i12;
        int i16 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i15 | i11)) | i10) * (-1042)) + i14;
        int i17 = ~i10;
        int iValueOf = 0;
        switch ((((~(i10 | i15 | i11)) | (~(i12 | i17)) | (~((~i11) | i17))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i16) {
            case 1:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int[] iArr4 = (int[]) objArr[2];
                int i18 = f53942a + 71;
                int i19 = i18 % 128;
                f53943b = i19;
                int i20 = i18 % 2;
                long j10 = ((long) iArr3[0]) & 4294967295L;
                long j11 = ((long) iArr3[1]) & 4294967295L;
                long j12 = ((long) iArr3[2]) & 4294967295L;
                long j13 = ((long) iArr3[3]) & 4294967295L;
                long j14 = ((long) iArr3[4]) & 4294967295L;
                long j15 = ((long) iArr3[5]) & 4294967295L;
                long j16 = ((long) iArr3[6]) & 4294967295L;
                long j17 = ((long) iArr2[0]) & 4294967295L;
                long j18 = j17 * j10;
                iArr4[0] = (int) j18;
                long j19 = (j17 * j11) + (j18 >>> 32);
                iArr4[1] = (int) j19;
                long j20 = (j17 * j12) + (j19 >>> 32);
                iArr4[2] = (int) j20;
                long j21 = (j17 * j13) + (j20 >>> 32);
                iArr4[3] = (int) j21;
                long j22 = (j17 * j14) + (j21 >>> 32);
                iArr4[4] = (int) j22;
                long j23 = (j17 * j15) + (j22 >>> 32);
                iArr4[5] = (int) j23;
                long j24 = (j17 * j16) + (j23 >>> 32);
                iArr4[6] = (int) j24;
                iArr4[7] = (int) (j24 >>> 32);
                int i21 = i19 | 13;
                int i22 = i21 << 1;
                int i23 = -(i21 & (~(i19 & 13)));
                int i24 = (i22 & i23) + (i23 | i22);
                f53942a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 1;
                int i27 = 7;
                while (i26 < i27) {
                    int i28 = f53942a;
                    int i29 = i28 & 119;
                    int i30 = (i28 ^ 119) | i29;
                    int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                    f53943b = i31 % 128;
                    int i32 = i31 % 2;
                    long j25 = ((long) iArr2[i26]) & 4294967295L;
                    long j26 = j12;
                    long j27 = (j25 * j10) + (((long) iArr4[i26]) & 4294967295L);
                    iArr4[i26] = (int) j27;
                    long j28 = j27 >>> 32;
                    long j29 = j25 * j11;
                    long j30 = j10;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i33 = -(-(i26 * 530));
                    long j31 = j11;
                    int i34 = ((((~i33) & 1588) | (i33 & (-1589))) - (~(-(-((i33 & 1588) << 1))))) - 1;
                    int i35 = ~iCurrentTimeMillis;
                    int i36 = i35 & 1;
                    int i37 = (i35 | 1) & (~i36);
                    int i38 = (i37 & i36) | (i37 ^ i36);
                    int i39 = ~i38;
                    int i40 = (i38 | i39) & i39;
                    int i41 = ~i26;
                    int i42 = i26 & 1;
                    int i43 = ~((i41 & 1) | (i26 & (-2)) | i42);
                    long j32 = j13;
                    int i44 = i40 & i43;
                    int i45 = (i40 | i43) & (~i44);
                    int i46 = -(-(((i45 & i44) | (i45 ^ i44)) * 529));
                    int i47 = i34 ^ i46;
                    int i48 = ((i46 & i34) | i47) << 1;
                    int i49 = -i47;
                    int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
                    int i51 = iCurrentTimeMillis & 1;
                    int i52 = (iCurrentTimeMillis | 1) & (~i51);
                    int i53 = ~((i52 & i51) | (i52 ^ i51));
                    int i54 = i41 ^ i53;
                    int i55 = i53 & i41;
                    long j33 = j29 + (((long) iArr4[(i50 - (~(((i55 & i54) | (i54 ^ i55)) * 529))) - 1]) & 4294967295L) + j28;
                    int i56 = (~i42) & (i26 | 1);
                    int i57 = -(-(i42 << 1));
                    iArr4[(i56 & i57) + (i57 | i56)] = (int) j33;
                    int i58 = i26 & 2;
                    long j34 = (j25 * j26) + (((long) iArr4[((~i58) & (i26 | 2)) + (i58 << 1)]) & 4294967295L) + (j33 >>> 32);
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i59 = -(~(-(-(i26 * (-903)))));
                    int i60 = ((1810 ^ i59) + ((i59 & 1810) << 1)) - 1;
                    int i61 = ~iCurrentTimeMillis2;
                    int i62 = (-3) & i61;
                    int i63 = (iCurrentTimeMillis2 & 2) | i62;
                    int i64 = (-3) & iCurrentTimeMillis2;
                    int i65 = ~((i63 ^ i64) | (i63 & i64));
                    int i66 = ~((i61 ^ i26) | (i61 & i26));
                    int i67 = ((~i66) & i65) | ((~i65) & i66);
                    int i68 = i66 & i65;
                    int i69 = -(-(((i67 & i68) | (i67 ^ i68)) * (-1808)));
                    int i70 = i60 & i69;
                    int i71 = (i69 | i60) & (~i70);
                    int i72 = -(-(i70 << 1));
                    int i73 = (i71 & i72) + (i71 | i72);
                    int i74 = (-3) & i41;
                    int i75 = (~i74) & ((-3) | i41);
                    int i76 = (i75 & i74) | (i75 ^ i74);
                    int i77 = ~((i76 & iCurrentTimeMillis2) | (i76 & i61) | ((~i76) & iCurrentTimeMillis2));
                    int i78 = ((~i61) & 2) | i62;
                    int i79 = i61 & 2;
                    int i80 = (i78 & i79) | (i78 ^ i79);
                    int i81 = i80 & i26;
                    int i82 = (i80 | i26) & (~i81);
                    int i83 = ~((i82 & i81) | (i82 ^ i81));
                    int i84 = (i73 - (~(-(-(((i77 & i83) | (i77 ^ i83)) * 904))))) - 1;
                    int i85 = (-3) & i26;
                    int i86 = ((-3) | i26) & (~i85);
                    int i87 = ~((i86 & i85) | (i86 ^ i85));
                    int i88 = ~i41;
                    int i89 = (i41 & i61) | (iCurrentTimeMillis2 & i88) | (i41 & iCurrentTimeMillis2);
                    int i90 = ~i89;
                    int i91 = (i89 | i90) & i90;
                    int i92 = ((~i91) & i87) | ((~i87) & i91);
                    int i93 = i87 & i91;
                    int i94 = (i93 & i92) | (i92 ^ i93);
                    int i95 = ((iCurrentTimeMillis2 | i61) & i61) | 2;
                    int i96 = ~i95;
                    int i97 = (i95 | i96) & i96;
                    int i98 = ((i97 & i94) | (i94 ^ i97)) * 904;
                    int i99 = i84 & i98;
                    int i100 = (i98 | i84) & (~i99);
                    int i101 = i99 << 1;
                    iArr4[(i100 ^ i101) + ((i100 & i101) << 1)] = (int) j34;
                    long j35 = j34 >>> 32;
                    long j36 = j25 * j32;
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i102 = (-1570) - (~(-(-(i26 * 263))));
                    int i103 = (-4) ^ i26;
                    int i104 = (-4) & i26;
                    int i105 = i41 & (-4);
                    int i106 = i105 | (i88 & 3);
                    int i107 = i41 & 3;
                    int i108 = (~(i106 | i107)) | (~((i103 ^ i104) | (i103 & i104)));
                    int i109 = (i41 ^ iCurrentTimeMillis3) | (i41 & iCurrentTimeMillis3);
                    int i110 = ~i109;
                    int i111 = i110 & (i109 | i110);
                    int i112 = i108 & i111;
                    int i113 = (~i112) & (i108 | i111);
                    int i114 = ((i113 & i112) | (i113 ^ i112)) * 262;
                    int i115 = i102 & i114;
                    int i116 = (((i102 ^ i114) | i115) << 1) - ((i114 | i102) & (~i115));
                    int i117 = (~((i106 ^ i107) | (i106 & i107))) * (-786);
                    int i118 = i116 & i117;
                    int i119 = (((i116 ^ i117) | i118) << 1) - ((i117 | i116) & (~i118));
                    int i120 = ~iCurrentTimeMillis3;
                    int i121 = i120 & (i120 | iCurrentTimeMillis3);
                    int i122 = ((~i121) & i41) | (i121 & i88);
                    int i123 = i121 & i41;
                    int i124 = ~((i123 & i122) | (i122 ^ i123));
                    int i125 = i26 & 3;
                    int i126 = i105 | i125;
                    int i127 = ~((i126 & i104) | (i126 ^ i104));
                    int i128 = (i124 & i127) | (i124 ^ i127);
                    int i129 = (i41 | i26) & i41;
                    int i130 = i129 & 3;
                    int i131 = (~i130) & (i129 | 3);
                    int i132 = ~((i130 & i131) | (i131 ^ i130));
                    int i133 = i128 & i132;
                    int i134 = (((i128 | i132) & (~i133)) | i133) * 262;
                    int i135 = i119 & i134;
                    int i136 = i134 | i119;
                    long j37 = j36 + (((long) iArr4[(i135 ^ i136) + ((i136 & i135) << 1)]) & 4294967295L) + j35;
                    int i137 = i26 ^ 3;
                    iArr4[(((i125 | i137) << 1) - (~(-i137))) - 1] = (int) j37;
                    long j38 = (j25 * j14) + (((long) iArr4[(i26 ^ 4) + ((i26 & 4) << 1)]) & 4294967295L) + (j37 >>> 32);
                    int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                    int i138 = i26 * 517;
                    int i139 = (-2060) ^ i138;
                    int i140 = (i138 & (-2060)) << 1;
                    int i141 = ((i139 | i140) << 1) - (i140 ^ i139);
                    int i142 = (i41 ^ iCurrentTimeMillis4) | (i41 & iCurrentTimeMillis4);
                    int i143 = ~i142;
                    int i144 = (i142 | i143) & i143;
                    int i145 = ~iCurrentTimeMillis4;
                    int i146 = ((i145 | iCurrentTimeMillis4) & i145) | 4;
                    int i147 = ~i146;
                    int i148 = (i146 | i147) & i147;
                    int i149 = ((~i148) & i144) | ((~i144) & i148);
                    int i150 = i144 & i148;
                    int i151 = (i150 & i149) | (i149 ^ i150);
                    int i152 = i145 & i26;
                    int i153 = (i145 ^ i26) | i152;
                    int i154 = ~i153;
                    int i155 = (i153 | i154) & i154;
                    int i156 = i151 ^ i155;
                    int i157 = i151 & i155;
                    int i158 = (((i157 & i156) | (i156 ^ i157)) * (-516)) + i141;
                    int i159 = (-5) & i41;
                    int i160 = i159 | ((~i159) & ((-5) | i41));
                    int i161 = ~((iCurrentTimeMillis4 & i160) | (i160 ^ iCurrentTimeMillis4));
                    int i162 = ~i145;
                    int i163 = ((-5) & i162) | (i145 & 4);
                    int i164 = (-5) & i145;
                    int i165 = (i163 ^ i164) | (i163 & i164);
                    int i166 = ((~i165) & i26) | (i165 & i41);
                    int i167 = i165 & i26;
                    int i168 = ~((i166 & i167) | (i166 ^ i167));
                    int i169 = ((~i168) & i161) | ((~i161) & i168);
                    int i170 = i161 & i168;
                    int i171 = -(-(((i170 & i169) | (i169 ^ i170)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
                    int i172 = ((~i158) & i171) | ((~i171) & i158);
                    int i173 = (i171 & i158) << 1;
                    int i174 = ((i172 | i173) << 1) - (i173 ^ i172);
                    int i175 = ~(((-5) ^ i26) | ((-5) & i26));
                    int i176 = (i145 & i41) | (i26 & i162);
                    int i177 = ~((i176 & i152) | (i176 ^ i152));
                    int i178 = ((~i177) & i175) | ((~i175) & i177);
                    int i179 = i175 & i177;
                    int i180 = ((i179 & i178) | (i178 ^ i179)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                    int i181 = i174 & i180;
                    iArr4[i181 + ((i180 ^ i174) | i181)] = (int) j38;
                    int i182 = i26 & 5;
                    long j39 = (j25 * j15) + (((long) iArr4[(i26 ^ 5) + (i182 << 1)]) & 4294967295L) + (j38 >>> 32);
                    int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
                    int i183 = -(-(i26 * Constant.ERROR_CODE_408));
                    int i184 = (-4065) ^ i183;
                    int i185 = -(-((i183 & DigipassSDKReturnCodes.DATA_FIELDS_NOT_CONTIGUOUS) << 1));
                    int i186 = (i184 & i185) + (i185 | i184);
                    int i187 = i41 & 5;
                    int i188 = ~(i187 | ((~i187) & (i41 | 5)));
                    int i189 = iCurrentTimeMillis5 & 5;
                    int i190 = (~i189) & (iCurrentTimeMillis5 | 5);
                    int i191 = ~iCurrentTimeMillis5;
                    int i192 = ~(i190 | i189);
                    int i193 = -(-(((i188 & i192) | ((~i192) & i188) | ((~i188) & i192)) * (-814)));
                    int i194 = (i186 ^ i193) + ((i193 & i186) << 1);
                    int i195 = ((~i191) & i41) | (i191 & i88);
                    int i196 = i41 & i191;
                    int i197 = ~((i195 & i196) | (i195 ^ i196));
                    int i198 = i182 | ((-6) & i41);
                    int i199 = (-6) & i26;
                    int i200 = (i198 ^ i199) | (i198 & i199);
                    int i201 = ~i200;
                    int i202 = (i200 | i201) & i201;
                    int i203 = ((~i197) & i202) | ((~i202) & i197);
                    int i204 = i197 & i202;
                    int i205 = (i204 & i203) | (i203 ^ i204);
                    int i206 = iCurrentTimeMillis5 & (-6);
                    int i207 = (i191 & 5) | i206;
                    int i208 = (i207 & i189) | (i207 ^ i189);
                    int i209 = ~i208;
                    int i210 = -(-((i205 | ((i208 | i209) & i209)) * 407));
                    int i211 = i194 ^ i210;
                    int i212 = ((((i210 & i194) | i211) << 1) - (~(-i211))) - 1;
                    int i213 = ((-6) ^ i26) | i199;
                    int i214 = ~i213;
                    int i215 = (i213 | i214) & i214;
                    int i216 = ~(i206 | ((-6) ^ iCurrentTimeMillis5));
                    int i217 = (i216 & i215) | (i215 ^ i216);
                    int i218 = (i191 & i26) | (iCurrentTimeMillis5 & i41);
                    int i219 = iCurrentTimeMillis5 & i26;
                    int i220 = (i218 & i219) | (i218 ^ i219);
                    int i221 = ~i220;
                    int i222 = (i220 | i221) & i221;
                    int i223 = ((~i222) & i217) | ((~i217) & i222);
                    int i224 = i222 & i217;
                    int i225 = ((i224 & i223) | (i223 ^ i224)) * 407;
                    int i226 = i212 & i225;
                    int i227 = -(-((i225 ^ i212) | i226));
                    iArr4[((i226 | i227) << 1) - (i227 ^ i226)] = (int) j39;
                    int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                    int i228 = -(-(i26 * (-344)));
                    int i229 = (((-2064) | i228) << 1) - (i228 ^ (-2064));
                    int i230 = (i88 & (-7)) | (i41 & 6);
                    int i231 = (-7) & i41;
                    int i232 = ~((i230 & i231) | (i230 ^ i231));
                    int i233 = (-7) & iCurrentTimeMillis6;
                    int i234 = (~i233) & ((-7) | iCurrentTimeMillis6);
                    int i235 = ~iCurrentTimeMillis6;
                    int i236 = ~((i234 ^ i233) | (i234 & i233));
                    int i237 = (i229 - (~(-(-(((i236 & i232) | (i232 ^ i236)) * 345))))) - 1;
                    int i238 = (i235 | iCurrentTimeMillis6) & i235;
                    int i239 = (-7) ^ i238;
                    int i240 = i238 & (-7);
                    int i241 = ~((i240 & i239) | (i239 ^ i240));
                    int i242 = i129 & 6;
                    int i243 = (~i242) & (i129 | 6);
                    int i244 = (i243 & i242) | (i243 ^ i242);
                    int i245 = ~i244;
                    int i246 = i241 & i245;
                    int i247 = (i241 | i245) & (~i246);
                    int i248 = (i237 - (~(((i247 & i246) | (i247 ^ i246)) * 345))) - 1;
                    int i249 = (~i231) & ((-7) | i41);
                    int i250 = (i249 & i231) | (i249 ^ i231);
                    int i251 = (~((iCurrentTimeMillis6 & i250) | (i250 ^ iCurrentTimeMillis6))) * 345;
                    long j40 = (j25 * j16) + (((long) iArr4[(i248 & i251) + (i251 | i248)]) & 4294967295L) + (j39 >>> 32);
                    int iCurrentTimeMillis7 = (int) System.currentTimeMillis();
                    int i252 = i26 * (-209);
                    int i253 = (-1254) & i252;
                    int i254 = i253 + ((i252 ^ (-1254)) | i253);
                    int i255 = ((~i129) & (-7)) | i242;
                    int i256 = (-7) & i129;
                    int i257 = -(~((~((i255 & i256) | (i255 ^ i256))) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                    int i258 = (i254 & i257) + (i257 | i254);
                    int i259 = (i258 ^ (-1)) + (i258 << 1);
                    int i260 = ~iCurrentTimeMillis7;
                    int i261 = (i260 | iCurrentTimeMillis7) & i260;
                    int i262 = (i261 & i129) | (i129 ^ i261);
                    int i263 = ~i262;
                    int i264 = (i262 | i263) & i263;
                    int i265 = ~(((-7) ^ iCurrentTimeMillis7) | ((-7) & iCurrentTimeMillis7));
                    int i266 = -(-(((i264 & i265) | ((~i265) & i264) | ((~i264) & i265)) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                    int i267 = (i259 ^ i266) + ((i259 & i266) << 1);
                    int i268 = ((~i260) & (-7)) | (i260 & 6) | ((-7) & i260);
                    int i269 = (i268 & i41) | ((~i268) & i26);
                    int i270 = i268 & i26;
                    int i271 = ~((i270 & i269) | (i269 ^ i270));
                    int i272 = (i244 & i260) | (iCurrentTimeMillis7 & i245);
                    int i273 = i244 & iCurrentTimeMillis7;
                    int i274 = ~((i273 & i272) | (i272 ^ i273));
                    int i275 = i271 & i274;
                    int i276 = (i274 | i271) & (~i275);
                    int i277 = -(-(((i276 & i275) | (i276 ^ i275)) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
                    int i278 = i267 & i277;
                    iArr4[(i278 - (~((i277 ^ i267) | i278))) - 1] = (int) j40;
                    long j41 = j40 >>> 32;
                    int iCurrentTimeMillis8 = (int) System.currentTimeMillis();
                    int i279 = -(-(i26 * (-167)));
                    int i280 = (-1169) & i279;
                    int i281 = (i279 | (-1169)) & (~i280);
                    int i282 = -(-(i280 << 1));
                    int i283 = (i281 ^ i282) + ((i281 & i282) << 1);
                    int i284 = (-8) ^ i41;
                    int i285 = (-8) & i41;
                    int i286 = ~((i284 & i285) | (i284 ^ i285));
                    int i287 = i41 & iCurrentTimeMillis8;
                    int i288 = (i41 | iCurrentTimeMillis8) & (~i287);
                    int i289 = (i288 & i287) | (i288 ^ i287);
                    int i290 = ~i289;
                    int i291 = (((i289 | i290) & i290) | i286) * 336;
                    int i292 = i283 & i291;
                    int i293 = (((i291 | i283) & (~i292)) - (~(i292 << 1))) - 1;
                    int i294 = ~((i26 ^ 7) | (i26 & 7));
                    int i295 = ~((iCurrentTimeMillis8 ^ 7) | (iCurrentTimeMillis8 & 7));
                    int i296 = i294 ^ i295;
                    int i297 = i294 & i295;
                    int i298 = -(~(-(-(((i297 & i296) | (i296 ^ i297)) * (-168)))));
                    int i299 = ((i293 ^ i298) + ((i293 & i298) << 1)) - 1;
                    int i300 = ~iCurrentTimeMillis8;
                    int i301 = i300 & 7;
                    int i302 = (i300 | 7) & (~i301);
                    int i303 = ~((i302 & i301) | (i302 ^ i301));
                    int i304 = i129 ^ i303;
                    int i305 = i303 & i129;
                    int i306 = ((i305 & i304) | (i304 ^ i305)) * 168;
                    int i307 = i299 & i306;
                    int i308 = -(-((i306 ^ i299) | i307));
                    iArr4[(i307 ^ i308) + ((i308 & i307) << 1)] = (int) j41;
                    int i309 = i26 & 26;
                    int i310 = ((i26 | 26) & (~i309)) + (i309 << 1);
                    int i311 = i310 & (-25);
                    int i312 = ((i310 ^ (-25)) | i311) << 1;
                    int i313 = -((i310 | (-25)) & (~i311));
                    i26 = ((i313 & i312) << 1) + (i312 ^ i313);
                    int i314 = f53943b;
                    int i315 = (i314 & 69) + (i314 | 69);
                    f53942a = i315 % 128;
                    int i316 = i315 % 2;
                    j12 = j26;
                    i27 = 7;
                    j10 = j30;
                    j11 = j31;
                    j13 = j32;
                }
                int i317 = f53942a;
                int i318 = ((i317 & 114) + (i317 | 114)) - 1;
                f53943b = i318 % 128;
                int i319 = i318 % 2;
                return null;
            case 2:
                int i320 = f53943b;
                int i321 = i320 | 47;
                int i322 = i321 << 1;
                int i323 = -((~(i320 & 47)) & i321);
                int i324 = (i322 & i323) + (i323 | i322);
                f53942a = i324 % 128;
                iArr = new int[i324 % 2 != 0 ? 25 : 7];
                return iArr;
            case 3:
                return k(objArr);
            case 4:
                return h(objArr);
            case 5:
                return j(objArr);
            case 6:
                return d(objArr);
            case 7:
                int[] iArr5 = (int[]) objArr[0];
                int[] iArr6 = (int[]) objArr[1];
                int i325 = f53943b;
                int i326 = (i325 ^ 29) + ((i325 & 29) << 1);
                int i327 = i326 % 128;
                f53942a = i327;
                int i328 = i326 % 2;
                long j42 = ((long) iArr5[0]) & 4294967295L;
                int i329 = i327 + 121;
                f53943b = i329 % 128;
                int i330 = i329 % 2;
                int i331 = 14;
                int i332 = 6;
                int i333 = 0;
                while (true) {
                    int i334 = -(~i332);
                    int i335 = (((-2) | i334) << 1) - (i334 ^ (-2));
                    long j43 = ((long) iArr5[i332]) & 4294967295L;
                    long j44 = j43 * j43;
                    int i336 = i331 & 56;
                    int i337 = (i331 | 56) & (~i336);
                    int i338 = -(-(i336 << 1));
                    int i339 = (i337 ^ i338) + ((i337 & i338) << 1);
                    int i340 = i339 & (-57);
                    int i341 = ((~i340) & (i339 | (-57))) + (i340 << 1);
                    int i342 = i333 << 31;
                    int i343 = (int) (j44 >>> 33);
                    int i344 = i342 & i343;
                    int i345 = (i342 | i343) & (~i344);
                    iArr6[i341] = (i345 & i344) | (i345 ^ i344);
                    i331 = (~i341) + (i341 << 1);
                    iArr6[i331] = (int) (j44 >>> 1);
                    i333 = (int) j44;
                    if (i335 <= 0) {
                        int i346 = f53942a;
                        int i347 = i346 & 103;
                        int i348 = (i346 ^ 103) | i347;
                        int i349 = (i347 & i348) + (i348 | i347);
                        int i350 = i349 % 128;
                        f53943b = i350;
                        int i351 = i349 % 2;
                        long j45 = j42 * j42;
                        long j46 = (j45 >>> 33) | (((long) (i333 << 31)) & 4294967295L);
                        iArr6[0] = (int) j45;
                        int i352 = ((int) (j45 >>> 32)) & 1;
                        long j47 = ((long) iArr5[1]) & 4294967295L;
                        long j48 = ((long) iArr6[2]) & 4294967295L;
                        long j49 = (j47 * j42) + j46;
                        int i353 = (int) j49;
                        int i354 = i353 << 1;
                        int i355 = i354 & i352;
                        int i356 = (i352 | i354) & (~i355);
                        iArr6[1] = (i356 & i355) | (i356 ^ i355);
                        int i357 = i353 >>> 31;
                        long j50 = j48 + (j49 >>> 32);
                        long j51 = ((long) iArr5[2]) & 4294967295L;
                        long j52 = ((long) iArr6[3]) & 4294967295L;
                        long j53 = ((long) iArr6[4]) & 4294967295L;
                        long j54 = (j51 * j42) + j50;
                        int i358 = (int) j54;
                        int i359 = i358 << 1;
                        iArr6[2] = (i359 ^ i357) | (i359 & i357);
                        int i360 = i358 >>> 31;
                        long jA = a.a(j51, j47, j54 >>> 32, j52);
                        long j55 = j53 + (jA >>> 32);
                        long j56 = ((long) iArr5[3]) & 4294967295L;
                        long j57 = (((long) iArr6[5]) & 4294967295L) + (j55 >>> 32);
                        long j58 = j55 & 4294967295L;
                        long j59 = (((long) iArr6[6]) & 4294967295L) + (j57 >>> 32);
                        long j60 = (j56 * j42) + (jA & 4294967295L);
                        int i361 = (int) j60;
                        int i362 = i361 << 1;
                        int i363 = i362 & i360;
                        int i364 = (i362 | i360) & (~i363);
                        iArr6[3] = (i364 & i363) | (i364 ^ i363);
                        int i365 = i361 >>> 31;
                        long jA2 = a.a(j56, j47, j60 >>> 32, j58);
                        long jA3 = a.a(j56, j51, jA2 >>> 32, j57 & 4294967295L);
                        long j61 = j59 + (jA3 >>> 32);
                        long j62 = jA3 & 4294967295L;
                        long j63 = ((long) iArr5[4]) & 4294967295L;
                        long j64 = (((long) iArr6[7]) & 4294967295L) + (j61 >>> 32);
                        long j65 = (((long) iArr6[8]) & 4294967295L) + (j64 >>> 32);
                        long j66 = (j63 * j42) + (jA2 & 4294967295L);
                        int i366 = (int) j66;
                        int i367 = i366 << 1;
                        int i368 = i367 & i365;
                        int i369 = (i365 | i367) & (~i368);
                        iArr6[4] = (i369 & i368) | (i369 ^ i368);
                        int i370 = i366 >>> 31;
                        long jA4 = a.a(j63, j47, j66 >>> 32, j62);
                        long jA5 = a.a(j63, j51, jA4 >>> 32, j61 & 4294967295L);
                        long jA6 = a.a(j63, j56, jA5 >>> 32, j64 & 4294967295L);
                        long j67 = jA5 & 4294967295L;
                        long j68 = j65 + (jA6 >>> 32);
                        long j69 = ((long) iArr5[5]) & 4294967295L;
                        long j70 = (((long) iArr6[9]) & 4294967295L) + (j68 >>> 32);
                        long j71 = (((long) iArr6[10]) & 4294967295L) + (j70 >>> 32);
                        long j72 = j70 & 4294967295L;
                        long j73 = (j69 * j42) + (jA4 & 4294967295L);
                        int i371 = (int) j73;
                        int i372 = i371 << 1;
                        int i373 = i372 ^ i370;
                        int i374 = i370 & i372;
                        iArr6[5] = (i373 & i374) | (i373 ^ i374);
                        int i375 = i371 >>> 31;
                        long jA7 = a.a(j69, j47, j73 >>> 32, j67);
                        long jA8 = a.a(j69, j51, jA7 >>> 32, jA6 & 4294967295L);
                        long jA9 = a.a(j69, j56, jA8 >>> 32, j68 & 4294967295L);
                        long j74 = jA8 & 4294967295L;
                        long jA10 = a.a(j69, j63, jA9 >>> 32, j72);
                        long j75 = j71 + (jA10 >>> 32);
                        long j76 = ((long) iArr5[6]) & 4294967295L;
                        long j77 = (((long) iArr6[11]) & 4294967295L) + (j75 >>> 32);
                        long j78 = j75 & 4294967295L;
                        long j79 = (((long) iArr6[12]) & 4294967295L) + (j77 >>> 32);
                        long j80 = j77 & 4294967295L;
                        long j81 = (j76 * j42) + (jA7 & 4294967295L);
                        int i376 = (int) j81;
                        int i377 = i376 << 1;
                        int i378 = i377 & i375;
                        int i379 = (i377 | i375) & (~i378);
                        iArr6[6] = (i379 & i378) | (i379 ^ i378);
                        int i380 = i376 >>> 31;
                        long jA11 = a.a(j76, j47, j81 >>> 32, j74);
                        long jA12 = a.a(j76, j51, jA11 >>> 32, jA9 & 4294967295L);
                        long jA13 = a.a(j76, j56, jA12 >>> 32, jA10 & 4294967295L);
                        long jA14 = a.a(j76, j63, jA13 >>> 32, j78);
                        long jA15 = a.a(j76, j69, jA14 >>> 32, j80);
                        long j82 = j79 + (jA15 >>> 32);
                        int i381 = (int) jA11;
                        int i382 = i381 << 1;
                        int i383 = i382 & i380;
                        iArr6[7] = ((i380 | i382) & (~i383)) | i383;
                        int i384 = i381 >>> 31;
                        int i385 = (int) jA12;
                        int i386 = i385 << 1;
                        iArr6[8] = (i384 & i386) | (i386 ^ i384);
                        int i387 = i385 >>> 31;
                        int i388 = (int) jA13;
                        int i389 = i388 << 1;
                        int i390 = i389 ^ i387;
                        int i391 = i387 & i389;
                        iArr6[9] = (i391 & i390) | (i390 ^ i391);
                        int i392 = i388 >>> 31;
                        int i393 = (int) jA14;
                        int i394 = i393 << 1;
                        int i395 = i394 ^ i392;
                        int i396 = i392 & i394;
                        iArr6[10] = (i396 & i395) | (i395 ^ i396);
                        int i397 = i393 >>> 31;
                        int i398 = (int) jA15;
                        int i399 = i398 << 1;
                        int i400 = ((~i397) & i399) | ((~i399) & i397);
                        int i401 = i397 & i399;
                        iArr6[11] = (i401 & i400) | (i400 ^ i401);
                        int i402 = i398 >>> 31;
                        int i403 = (int) j82;
                        int i404 = i403 << 1;
                        int i405 = ((~i402) & i404) | ((~i404) & i402);
                        int i406 = i402 & i404;
                        iArr6[12] = (i406 & i405) | (i405 ^ i406);
                        int i407 = i403 >>> 31;
                        int i408 = iArr6[13];
                        int i409 = (int) (j82 >>> 32);
                        int i410 = i408 & i409;
                        int i411 = i409 | i408;
                        int i412 = ((i410 & i411) + (i411 | i410)) << 1;
                        int i413 = i412 & i407;
                        int i414 = (i407 | i412) & (~i413);
                        iArr6[13] = (i414 & i413) | (i414 ^ i413);
                        int i415 = (i350 ^ 105) + ((i350 & 105) << 1);
                        f53942a = i415 % 128;
                        int i416 = i415 % 2;
                        return null;
                    }
                    i332 = i335;
                }
                break;
            case 8:
                return c(objArr);
            case 9:
                return g(objArr);
            case 10:
                int iCurrentTimeMillis9 = (int) System.currentTimeMillis();
                int i417 = ~iCurrentTimeMillis9;
                int i418 = (iCurrentTimeMillis9 | i417) & i417;
                int i419 = ((~i418) & (-1478116281)) | (1478116280 & i418);
                int i420 = (-1478116281) & i418;
                int i421 = (i419 & i420) | (i419 ^ i420);
                int i422 = ~((i421 & (-1675245518)) | (i421 ^ (-1675245518)));
                int i423 = (i417 & 1675245517) | (1675245517 ^ i417);
                int i424 = (i423 & 1478116280) | (i423 ^ 1478116280);
                int i425 = ~i424;
                int i426 = (i424 | i425) & i425;
                int i427 = i422 & i426;
                int i428 = (i426 | i422) & (~i427);
                int i429 = -(-(((i428 & i427) | (i428 ^ i427)) * (-184)));
                int i430 = ((1714912186 | i429) << 1) - (i429 ^ 1714912186);
                int i431 = (~i420) & ((-1478116281) | i418);
                int i432 = (~((i431 & i420) | (i431 ^ i420))) | 402669616;
                int i433 = ~((i418 & 1675245517) | (1675245517 ^ i418));
                int i434 = i432 ^ i433;
                int i435 = i433 & i432;
                int i436 = ((i435 & i434) | (i434 ^ i435)) * 184;
                int i437 = (i430 ^ i436) + ((i436 & i430) << 1);
                int i438 = i437 & 1306160560;
                int i439 = -(-((1306160560 ^ i437) | i438));
                int i440 = (i438 & i439) + (i439 | i438);
                int iCurrentTimeMillis10 = (int) System.currentTimeMillis();
                int i441 = ~iCurrentTimeMillis10;
                int i442 = (i441 | iCurrentTimeMillis10) & i441;
                int i443 = (-2) - (((-1181508376) - (~((~((i442 & 176010039) | (176010039 ^ i442))) * 979))) ^ (-1));
                int i444 = 68570246 & i441;
                int i445 = ((-68570247) & iCurrentTimeMillis10) | i444;
                int i446 = 68570246 & iCurrentTimeMillis10;
                int i447 = ((i445 & i446) | (i445 ^ i446)) * (-979);
                int i448 = ((i443 ^ i447) - (~((i443 & i447) << 1))) - 1;
                int i449 = (176010039 & i441) | ((-176010040) & iCurrentTimeMillis10);
                int i450 = iCurrentTimeMillis10 & 176010039;
                int i451 = ~((i450 & i449) | (i449 ^ i450));
                int i452 = (i441 | 68570246) & (~i444);
                int i453 = ~((i452 & i444) | (i452 ^ i444));
                int i454 = i451 & i453;
                int i455 = -(-((((i451 | i453) & (~i454)) | i454) * 979));
                iArr = new int[i440 > ((i448 | i455) << 1) - (i455 ^ i448) ? 4 : 14];
                return iArr;
            case 11:
                return i(objArr);
            case 12:
                int[] iArr7 = (int[]) objArr[0];
                int[] iArr8 = (int[]) objArr[1];
                int i456 = f53942a;
                int i457 = i456 ^ 23;
                int i458 = ((i456 & 23) | i457) << 1;
                int i459 = -i457;
                int i460 = (i458 ^ i459) + ((i458 & i459) << 1);
                f53943b = i460 % 128;
                if (i460 % 2 == 0) {
                    iArr8[1] = iArr7[1];
                    iArr8[1] = iArr7[1];
                    iArr8[3] = iArr7[2];
                    iArr8[4] = iArr7[3];
                    int i461 = iArr7[5];
                    iArr8[4] = i461;
                    iArr8[3] = i461;
                    iArr8[92] = iArr7[58];
                } else {
                    iArr8[0] = iArr7[0];
                    iArr8[1] = iArr7[1];
                    iArr8[2] = iArr7[2];
                    iArr8[3] = iArr7[3];
                    iArr8[4] = iArr7[4];
                    iArr8[5] = iArr7[5];
                    iArr8[6] = iArr7[6];
                }
                return null;
            case 13:
                int[] iArr9 = (int[]) objArr[0];
                int[] iArr10 = (int[]) objArr[1];
                int[] iArr11 = (int[]) objArr[2];
                int i462 = f53943b;
                int i463 = i462 + 93;
                f53942a = i463 % 128;
                int i464 = i463 % 2;
                long j83 = ((long) iArr10[0]) & 4294967295L;
                long j84 = ((long) iArr10[1]) & 4294967295L;
                long j85 = ((long) iArr10[2]) & 4294967295L;
                long j86 = ((long) iArr10[3]) & 4294967295L;
                long j87 = j83;
                long j88 = ((long) iArr10[4]) & 4294967295L;
                long j89 = ((long) iArr10[5]) & 4294967295L;
                long j90 = ((long) iArr10[6]) & 4294967295L;
                int i465 = ((~i462) & 59) | (i462 & (-60));
                int i466 = (i462 & 59) << 1;
                int i467 = (i465 ^ i466) + ((i465 & i466) << 1);
                f53942a = i467 % 128;
                int i468 = i467 % 2;
                long j91 = 0;
                int i469 = 0;
                while (i469 < 7) {
                    int i470 = f53942a;
                    int i471 = (i470 ^ 107) + ((i470 & 107) << 1);
                    f53943b = i471 % 128;
                    int i472 = i471 % 2;
                    int[] iArr12 = iArr9;
                    long j92 = j90;
                    long j93 = ((long) iArr9[i469]) & 4294967295L;
                    long j94 = j87;
                    long j95 = j89;
                    long j96 = (j93 * j94) + (((long) iArr11[i469]) & 4294967295L);
                    iArr11[i469] = (int) j96;
                    int i473 = i469 ^ 1;
                    int i474 = i469 & 1;
                    long j97 = j84;
                    long j98 = (j93 * j84) + (((long) iArr11[(i474 << 1) + i473]) & 4294967295L) + (j96 >>> 32);
                    iArr11[i474 + (i473 | i474)] = (int) j98;
                    int i475 = i469 & 2;
                    int i476 = -(-((i469 ^ 2) | i475));
                    long j99 = j85;
                    long j100 = (j93 * j85) + (((long) iArr11[(i475 ^ i476) + ((i476 & i475) << 1)]) & 4294967295L) + (j98 >>> 32);
                    iArr11[i475 + (i469 | 2)] = (int) j100;
                    long j101 = j100 >>> 32;
                    long j102 = j93 * j86;
                    int iCurrentTimeMillis11 = (int) System.currentTimeMillis();
                    int i477 = (-1217) - (~(-(~(i469 * 407))));
                    int i478 = ~i469;
                    int i479 = ~iCurrentTimeMillis11;
                    int i480 = ~i478;
                    int i481 = (i478 & i479) | (iCurrentTimeMillis11 & i480);
                    int i482 = i478 & iCurrentTimeMillis11;
                    long j103 = j86;
                    int i483 = ~((i481 ^ i482) | (i481 & i482));
                    int i484 = i479 & 3;
                    int i485 = (~i484) & (i479 | 3);
                    int i486 = (i485 & i484) | (i485 ^ i484);
                    int i487 = (i486 & i478) | ((~i486) & i469);
                    int i488 = i486 & i469;
                    int i489 = ~((i488 & i487) | (i487 ^ i488));
                    int i490 = ((~i489) & i483) | ((~i483) & i489);
                    int i491 = i489 & i483;
                    int i492 = ((i491 & i490) | (i490 ^ i491)) * (-406);
                    int i493 = i477 ^ i492;
                    int i494 = ((((i492 & i477) | i493) << 1) - (~(-i493))) - 1;
                    int i495 = (i478 | i469) & i478;
                    int i496 = ((~i479) & i495) | ((~i495) & i479);
                    int i497 = i495 & i479;
                    int i498 = (i496 ^ i497) | (i496 & i497);
                    int i499 = i498 & 3;
                    int i500 = (~(((~i499) & (i498 | 3)) | i499)) * (-406);
                    int i501 = i494 & i500;
                    int i502 = (((i494 | i500) & (~i501)) - (~(-(-(i501 << 1))))) - 1;
                    int i503 = (-4) & iCurrentTimeMillis11;
                    int i504 = (~i503) & (iCurrentTimeMillis11 | (-4));
                    int i505 = ~((i504 & i503) | (i504 ^ i503));
                    int i506 = (i479 ^ i469) | (i479 & i469);
                    int i507 = ~i506;
                    int i508 = (i506 | i507) & i507;
                    int i509 = ((~i508) & i505) | ((~i505) & i508);
                    int i510 = i505 & i508;
                    int i511 = -(-(((i510 & i509) | (i509 ^ i510)) * 406));
                    long j104 = j102 + (((long) iArr11[((((~i511) & i502) | ((~i502) & i511)) - (~(-(-((i502 & i511) << 1))))) - 1]) & 4294967295L) + j101;
                    int iCurrentTimeMillis12 = (int) System.currentTimeMillis();
                    int i512 = -(-(i469 * (-500)));
                    int i513 = ((~i512) & (-1500)) | (i512 & 1499);
                    int i514 = -(-((i512 & (-1500)) << 1));
                    int i515 = (i513 & i514) + (i514 | i513);
                    int i516 = i478 & (-4);
                    int i517 = i478 & 3;
                    int i518 = ~((i480 & 3) | i516 | i517);
                    int i519 = ((-4) ^ i469) | ((-4) & i469);
                    int i520 = (i519 & iCurrentTimeMillis12) | (i519 ^ iCurrentTimeMillis12);
                    int i521 = ~i520;
                    int i522 = (i520 | i521) & i521;
                    int i523 = i518 & i522;
                    int i524 = (((i518 | i522) & (~i523)) | i523) * 501;
                    int i525 = (((i515 ^ i524) | (i515 & i524)) << 1) - ((i524 & (~i515)) | ((~i524) & i515));
                    int i526 = ((-4) & i480) | i517;
                    int i527 = -(-((~((i516 & i526) | (i526 ^ i516))) * 1002));
                    int i528 = i525 ^ i527;
                    int i529 = ((i527 & i525) | i528) << 1;
                    int i530 = -i528;
                    int i531 = ((i529 | i530) << 1) - (i529 ^ i530);
                    int i532 = ~iCurrentTimeMillis12;
                    int i533 = ((~i532) & (-4)) | (i532 & 3);
                    int i534 = i532 & (-4);
                    int i535 = (i534 & i533) | (i533 ^ i534);
                    int i536 = i535 ^ i469;
                    int i537 = i535 & i469;
                    int i538 = (i537 & i536) | (i536 ^ i537);
                    int i539 = ~i538;
                    int i540 = -(~(((i538 | i539) & i539) * 501));
                    iArr11[((i531 ^ i540) + ((i540 & i531) << 1)) - 1] = (int) j104;
                    long j105 = j104 >>> 32;
                    long j106 = j93 * j88;
                    int iCurrentTimeMillis13 = (int) System.currentTimeMillis();
                    int i541 = i469 * (-949);
                    int i542 = (((-3796) | i541) << 1) - (i541 ^ (-3796));
                    int i543 = ~iCurrentTimeMillis13;
                    int i544 = i478 & i543;
                    int i545 = (~i544) & (i478 | i543);
                    int i546 = ~((i545 ^ i544) | (i545 & i544));
                    int i547 = (-5) & iCurrentTimeMillis13;
                    long j107 = j88;
                    int i548 = (~i547) & ((-5) | iCurrentTimeMillis13);
                    int i549 = (i547 & i548) | (i548 ^ i547);
                    int i550 = ~i549;
                    int i551 = (i549 | i550) & i550;
                    int i552 = i546 & i551;
                    int i553 = i542 - (~(-(-((((i551 | i546) & (~i552)) | i552) * ReturnCode.ERR_REPOSITORY))));
                    int i554 = (i553 ^ (-1)) + (i553 << 1);
                    int i555 = (i543 ^ 4) | (i543 & 4);
                    int i556 = ~i555;
                    int i557 = (i555 | i556) & i556;
                    int i558 = i469 ^ iCurrentTimeMillis13;
                    int i559 = i469 & iCurrentTimeMillis13;
                    int i560 = ~((i558 ^ i559) | (i558 & i559));
                    int i561 = i557 & i560;
                    int i562 = (~i561) & (i557 | i560);
                    int i563 = ((i562 & i561) | (i562 ^ i561)) * (-950);
                    int i564 = ((((~i563) & i554) | ((~i554) & i563)) - (~(-(-((i554 & i563) << 1))))) - 1;
                    int i565 = ((~i543) & i469) | i544;
                    int i566 = i543 & i469;
                    int i567 = ~((i565 & i566) | (i565 ^ i566));
                    int i568 = iCurrentTimeMillis13 & 4;
                    int i569 = (iCurrentTimeMillis13 | 4) & (~i568);
                    int i570 = ~((i569 & i568) | (i569 ^ i568));
                    int i571 = i567 & i570;
                    int i572 = (i570 | i567) & (~i571);
                    int i573 = -(-(((i572 & i571) | (i572 ^ i571)) * 950));
                    long j108 = j106 + (((long) iArr11[(i564 & i573) + (i573 | i564)]) & 4294967295L) + j105;
                    int iCurrentTimeMillis14 = (int) System.currentTimeMillis();
                    int i574 = -(-(i469 * 319));
                    int i575 = ((~i574) & (-1268)) | (i574 & 1267);
                    int i576 = -(-((i574 & (-1268)) << 1));
                    int i577 = (i575 ^ i576) + ((i576 & i575) << 1);
                    int i578 = (-5) ^ i478;
                    int i579 = (-5) & i478;
                    int i580 = (i578 ^ i579) | (i578 & i579);
                    int i581 = i580 & iCurrentTimeMillis14;
                    int i582 = (i580 | iCurrentTimeMillis14) & (~i581);
                    int i583 = ~iCurrentTimeMillis14;
                    int i584 = (i582 & i581) | (i582 ^ i581);
                    int i585 = ~i584;
                    int i586 = (i584 | i585) & i585;
                    int i587 = (i583 ^ 4) | (i583 & 4);
                    int i588 = i587 ^ i469;
                    int i589 = i587 & i469;
                    int i590 = ~((i589 & i588) | (i588 ^ i589));
                    int i591 = ((~i590) & i586) | ((~i586) & i590);
                    int i592 = i586 & i590;
                    int i593 = -(~(((i592 & i591) | (i591 ^ i592)) * (-318)));
                    int i594 = (i577 & i593) + (i593 | i577);
                    int i595 = (i594 ^ (-1)) + (i594 << 1);
                    int i596 = i495 & 4;
                    int i597 = (~i596) & (i495 | 4);
                    int i598 = (i596 & i597) | (i597 ^ i596);
                    int i599 = ~i598;
                    int i600 = (i598 | i599) & i599;
                    int i601 = iCurrentTimeMillis14 ^ 4;
                    int i602 = iCurrentTimeMillis14 & 4;
                    int i603 = ~((i601 & i602) | (i601 ^ i602));
                    int i604 = i600 & i603;
                    int i605 = (i600 | i603) & (~i604);
                    int i606 = -(-(((i605 & i604) | (i605 ^ i604)) * (-318)));
                    int i607 = i595 ^ i606;
                    int i608 = (i595 & i606) << 1;
                    int i609 = ((i607 | i608) << 1) - (i608 ^ i607);
                    int i610 = (-5) ^ iCurrentTimeMillis14;
                    int i611 = iCurrentTimeMillis14 & (-5);
                    int i612 = (i611 & i610) | (i610 ^ i611);
                    int i613 = ~i612;
                    int i614 = (i612 | i613) & i613;
                    int i615 = i478 ^ i614;
                    int i616 = i614 & i478;
                    int i617 = -(-(((i616 & i615) | (i615 ^ i616)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                    iArr11[(i609 & i617) + (i617 | i609)] = (int) j108;
                    long j109 = j108 >>> 32;
                    j89 = j95;
                    int iCurrentTimeMillis15 = (int) System.currentTimeMillis();
                    int i618 = (-2096) - (~(-(~(-(-(i469 * 421))))));
                    int i619 = (i618 ^ (-1)) + (i618 << 1);
                    int i620 = ~iCurrentTimeMillis15;
                    int i621 = (i469 & i620) | (iCurrentTimeMillis15 & i478);
                    int i622 = i469 & iCurrentTimeMillis15;
                    int i623 = (~((i621 ^ i622) | (i621 & i622))) * TypedValues.CycleType.TYPE_EASING;
                    int i624 = i619 & i623;
                    int i625 = (((~i624) & (i619 | i623)) - (~(-(-(i624 << 1))))) - 1;
                    int i626 = i469 & 5;
                    int i627 = (-6) & i478;
                    int i628 = i626 | i627;
                    int i629 = i469 & (-6);
                    int i630 = (((i628 ^ i629) | (i628 & i629)) * (-420)) + i625;
                    int i631 = (-6) ^ i478;
                    int i632 = (i631 & i627) | (i631 ^ i627);
                    int i633 = ~i632;
                    int i634 = (i632 | i633) & i633;
                    int i635 = (iCurrentTimeMillis15 | i620) & i620;
                    int i636 = ~((i635 & i469) | (i635 ^ i469));
                    int i637 = -(-(((i634 & i636) | (i634 ^ i636)) * TypedValues.CycleType.TYPE_EASING));
                    int i638 = i630 & i637;
                    int i639 = (i637 ^ i630) | i638;
                    long j110 = (j93 * j89) + (((long) iArr11[((i638 | i639) << 1) - (i639 ^ i638)]) & 4294967295L) + j109;
                    int i640 = -(-((i469 ^ 5) | i626));
                    iArr11[((i626 | i640) << 1) - (i626 ^ i640)] = (int) j110;
                    int iCurrentTimeMillis16 = (int) System.currentTimeMillis();
                    int i641 = -(~(i469 * 131));
                    int i642 = ((((-774) | i641) << 1) - (i641 ^ (-774))) - 1;
                    int i643 = ~iCurrentTimeMillis16;
                    int i644 = i643 & (i643 | iCurrentTimeMillis16);
                    int i645 = ((~i644) & i478) | (i644 & i480);
                    int i646 = i644 & i478;
                    int i647 = (i646 & i645) | (i645 ^ i646);
                    int i648 = i647 & 6;
                    int i649 = (i647 | 6) & (~i648);
                    int i650 = (i649 & i648) | (i649 ^ i648);
                    int i651 = ~i650;
                    int i652 = (-2) - (((i642 - (~(-(~(-(-(((i650 | i651) & i651) * 130))))))) - 1) ^ (-1));
                    int i653 = (i478 & (-7)) | (i480 & 6);
                    int i654 = i478 & 6;
                    int i655 = (~(i653 | i654)) * (-260);
                    int i656 = (i652 ^ i655) + ((i652 & i655) << 1);
                    int i657 = (-7) & i469;
                    int i658 = (~i657) & ((-7) | i469);
                    int i659 = ~((i658 & i657) | (i658 ^ i657));
                    int i660 = (i653 ^ i654) | (i653 & i654);
                    int i661 = (iCurrentTimeMillis16 & i660) | (i660 ^ iCurrentTimeMillis16);
                    int i662 = ~i661;
                    int i663 = (i661 | i662) & i662;
                    int i664 = ((~i663) & i659) | ((~i659) & i663);
                    int i665 = i659 & i663;
                    int i666 = -(-(((i665 & i664) | (i664 ^ i665)) * 130));
                    long j111 = (j93 * j92) + (((long) iArr11[((i656 | i666) << 1) - (i656 ^ i666)]) & 4294967295L) + (j110 >>> 32);
                    int iCurrentTimeMillis17 = (int) System.currentTimeMillis();
                    int i667 = -(-(i469 * (-1917)));
                    int i668 = ((((~i667) & 5760) | (i667 & (-5761))) - (~((i667 & 5760) << 1))) - 1;
                    int i669 = ~iCurrentTimeMillis17;
                    int i670 = (i480 & i669) | ((~i669) & i478);
                    int i671 = i478 & i669;
                    int i672 = (i670 & i671) | (i670 ^ i671);
                    int i673 = ~i672;
                    int i674 = (i672 | i673) & i673;
                    int i675 = (iCurrentTimeMillis17 ^ 6) | (iCurrentTimeMillis17 & 6);
                    int i676 = ~i675;
                    int i677 = (i675 | i676) & i676;
                    int i678 = ((~i677) & i674) | ((~i674) & i677);
                    int i679 = i674 & i677;
                    int i680 = (((i679 & i678) | (i678 ^ i679)) * 959) + i668;
                    int i681 = i495 * (-959);
                    int i682 = ((((~i681) & i680) | ((~i680) & i681)) - (~(-(-((i681 & i680) << 1))))) - 1;
                    int i683 = i478 ^ iCurrentTimeMillis17;
                    int i684 = iCurrentTimeMillis17 & i478;
                    int i685 = ~((i684 & i683) | (i683 ^ i684));
                    int i686 = i669 ^ 6;
                    int i687 = i669 & 6;
                    int i688 = ~((i686 & i687) | (i686 ^ i687));
                    int i689 = ((i685 & i688) | ((~i688) & i685) | ((~i685) & i688)) * 959;
                    int i690 = i682 & i689;
                    iArr11[i690 + ((i689 ^ i682) | i690)] = (int) j111;
                    long j112 = j111 >>> 32;
                    int iCurrentTimeMillis18 = (int) System.currentTimeMillis();
                    int i691 = -(-(i469 * 565));
                    int i692 = (-3941) & i691;
                    int i693 = (i692 - (~(-(-((i691 ^ (-3941)) | i692))))) - 1;
                    int i694 = ~iCurrentTimeMillis18;
                    int i695 = i478 ^ i694;
                    int i696 = i478 & i694;
                    int i697 = ~((i695 & i696) | (i695 ^ i696));
                    int i698 = (-8) & i697;
                    int i699 = (i697 | (-8)) & (~i698);
                    int i700 = (i699 & i698) | (i699 ^ i698);
                    int i701 = i469 & iCurrentTimeMillis18;
                    int i702 = (~i701) & (i469 | iCurrentTimeMillis18);
                    int i703 = ~((i701 & i702) | (i702 ^ i701));
                    int i704 = -(-(((i700 & i703) | (i700 ^ i703)) * (-564)));
                    int i705 = ((i693 | i704) << 1) - (i704 ^ i693);
                    int i706 = i469 & 7;
                    int i707 = ((-8) & i478) | i706;
                    int i708 = (-8) & i469;
                    int i709 = (i707 ^ i708) | (i707 & i708);
                    int i710 = i709 ^ iCurrentTimeMillis18;
                    int i711 = iCurrentTimeMillis18 & i709;
                    int i712 = (~((i711 & i710) | (i710 ^ i711))) * 1128;
                    int i713 = (i705 & i712) + (i712 | i705);
                    int i714 = ((~i694) & (-8)) | (i694 & 7);
                    int i715 = i694 & (-8);
                    int i716 = ~((i714 & i715) | (i714 ^ i715));
                    int i717 = ~((i469 ^ 7) | i706);
                    int i718 = ((~i717) & i716) | ((~i716) & i717);
                    int i719 = i716 & i717;
                    int i720 = -(-(((i719 & i718) | (i718 ^ i719)) * 564));
                    int i721 = i713 & i720;
                    long j113 = j112 + (((long) iArr11[(i721 - (~(-(-((i720 ^ i713) | i721))))) - 1]) & 4294967295L) + j91;
                    iArr11[(((~i706) & (i469 | 7)) - (~(-(-(i706 << 1))))) - 1] = (int) j113;
                    j91 = j113 >>> 32;
                    int i722 = ((((i469 ^ 25) | (i469 & 25)) << 1) - (~(-((i469 & (-26)) | (i478 & 25))))) - 1;
                    i469 = (i722 & (-24)) + (i722 | (-24));
                    int i723 = f53943b;
                    int i724 = i723 & 69;
                    int i725 = (i723 ^ 69) | i724;
                    int i726 = (i724 & i725) + (i725 | i724);
                    f53942a = i726 % 128;
                    int i727 = i726 % 2;
                    iArr9 = iArr12;
                    j90 = j92;
                    j87 = j94;
                    j85 = j99;
                    j84 = j97;
                    j86 = j103;
                    j88 = j107;
                }
                int i728 = f53943b;
                int i729 = (i728 & (-36)) | ((~i728) & 35);
                int i730 = -(-((i728 & 35) << 1));
                int i731 = (i729 & i730) + (i730 | i729);
                f53942a = i731 % 128;
                int i732 = i731 % 2;
                return Integer.valueOf((int) j91);
            case 14:
                return f(objArr);
            case 15:
                long jLongValue = ((Number) objArr[0]).longValue();
                int[] iArr13 = (int[]) objArr[1];
                int i733 = f53943b;
                int i734 = ((i733 ^ 71) | (i733 & 71)) << 1;
                int i735 = -(((~i733) & 71) | (i733 & (-72)));
                int i736 = (i734 ^ i735) + ((i735 & i734) << 1);
                int i737 = i736 % 128;
                f53942a = i737;
                int i738 = i736 % 2;
                long j114 = jLongValue & 4294967295L;
                long j115 = (6803 * j114) + (((long) iArr13[0]) & 4294967295L);
                iArr13[0] = (int) j115;
                long j116 = jLongValue >>> 32;
                long j117 = (6803 * j116) + j114 + (((long) iArr13[1]) & 4294967295L) + (j115 >>> 32);
                iArr13[1] = (int) j117;
                long j118 = j116 + (((long) iArr13[2]) & 4294967295L) + (j117 >>> 32);
                iArr13[2] = (int) j118;
                long j119 = (j118 >>> 32) + (((long) iArr13[3]) & 4294967295L);
                iArr13[3] = (int) j119;
                if ((j119 >>> 32) == 0) {
                    int i739 = (i737 & 105) + (i737 | 105);
                    f53943b = i739 % 128;
                    int i740 = i739 % 2;
                } else {
                    int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr13, 0, 4}, 716282167, -716282152, 7)).intValue();
                    int i741 = f53943b;
                    int i742 = i741 & 83;
                    int i743 = i742 + ((i741 ^ 83) | i742);
                    f53942a = i743 % 128;
                    int i744 = i743 % 2;
                    iValueOf = Integer.valueOf(iIntValue);
                }
                return iValueOf;
            case 16:
                return e(objArr);
            case 17:
                int[] iArr14 = (int[]) objArr[0];
                int i745 = f53943b;
                int i746 = i745 + 97;
                f53942a = i746 % 128;
                int i747 = i746 % 2;
                int i748 = iArr14[0] & 1;
                int i749 = i745 ^ 97;
                int i750 = (i745 & 97) << 1;
                int i751 = (i749 ^ i750) + ((i749 & i750) << 1);
                f53942a = i751 % 128;
                int i752 = i751 % 2;
                return Integer.valueOf(i748);
            case 18:
                return b(objArr);
            case 19:
                return a(objArr);
            default:
                int[] iArr15 = (int[]) objArr[0];
                int i753 = f53943b;
                int i754 = ((i753 | 39) << 1) - (i753 ^ 39);
                f53942a = i754 % 128;
                if (i754 % 2 != 0) {
                    bArr = new byte[69];
                    i13 = 1;
                } else {
                    bArr = new byte[28];
                    i13 = 0;
                }
                while (i13 < 7) {
                    int i755 = f53943b;
                    int i756 = (i755 & 77) + (i755 | 77);
                    int i757 = i756 % 128;
                    f53942a = i757;
                    int i758 = i756 % 2;
                    int i759 = iArr15[i13];
                    if (i759 != 0) {
                        int i760 = (i757 ^ 23) + ((i757 & 23) << 1);
                        f53943b = i760 % 128;
                        if (i760 % 2 == 0) {
                            ber.setDividerPadding(new Object[]{Integer.valueOf(i759), bArr, Integer.valueOf((54 >>> i13) >> 5)}, -2092293587, 2092293591, i759);
                        } else {
                            int i761 = -i13;
                            ber.setDividerPadding(new Object[]{Integer.valueOf(i759), bArr, Integer.valueOf((((i761 | 6) << 1) - (i761 ^ 6)) << 2)}, -2092293587, 2092293591, i759);
                        }
                        int i762 = f53943b;
                        int i763 = ((i762 & 42) + (i762 | 42)) - 1;
                        f53942a = i763 % 128;
                        int i764 = i763 % 2;
                    }
                    int i765 = (i13 & 11) + (i13 | 11);
                    int i766 = (i765 ^ (-1)) + (i765 << 1);
                    i13 = (((i766 & 8) | ((~i766) & (-9))) - (~(-(-((i766 & (-9)) << 1))))) - 1;
                    int i767 = f53943b;
                    int i768 = i767 & 33;
                    int i769 = i768 + ((i767 ^ 33) | i768);
                    f53942a = i769 % 128;
                    int i770 = i769 % 2;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                int i771 = f53942a;
                int i772 = i771 & 125;
                int i773 = (i772 - (~(-(-((i771 ^ 125) | i772))))) - 1;
                f53943b = i773 % 128;
                int i774 = i773 % 2;
                return bigInteger;
        }
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, 1407394238, -1407394231, (int) System.currentTimeMillis());
    }

    public static int setNavigationOnClickListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, -201684302, 201684313, (int) System.currentTimeMillis())).intValue();
    }

    public static BigInteger setOnFocusChangeListener(int[] iArr) {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{iArr}, 1483085012, -1483085012, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, 1112455082, -1112455081, (int) System.currentTimeMillis());
    }

    public static int setY(int i10, int[] iArr) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10), iArr}, 1238931695, -1238931676, i10)).intValue();
    }

    public static boolean setDividerPadding(int[] iArr) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{iArr}, -1700010143, 1700010151, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -1905808826, 1905808829, (int) System.currentTimeMillis())).intValue();
    }

    public static int setX(int[] iArr) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{iArr}, -393396839, 393396856, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setY(int[] iArr) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{iArr}, -1420812761, 1420812779, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, 210372306, -210372290, (int) System.currentTimeMillis())).intValue();
    }

    public static int setOnFocusChangeListener(long j10, int[] iArr) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(j10), iArr}, 1298222076, -1298222061, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setX(int[] iArr, int[] iArr2) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -1978536009, 1978536023, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setY() {
        return (int[]) setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
    }

    public static long setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, -1380286297, 1380286301, (int) System.currentTimeMillis())).longValue();
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, -1793227349, 1793227361, (int) System.currentTimeMillis());
    }

    public static int[] setOnFocusChangeListener() {
        return (int[]) setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
    }

    public static int setY(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, -1985953730, 1985953735, (int) System.currentTimeMillis())).intValue();
    }

    public static int setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3}, -1558441269, 1558441282, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2}, 48348050, -48348044, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (int[]) setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1823441057, -1823441048, (int) System.currentTimeMillis());
    }
}
