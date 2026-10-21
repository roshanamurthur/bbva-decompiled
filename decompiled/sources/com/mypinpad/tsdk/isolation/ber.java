package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54652a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54653b = 1;

    public static /* synthetic */ Integer a(Object[] objArr) {
        int i10;
        int i11;
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i12 = f54653b;
        int i13 = i12 & 63;
        int i14 = -(-((i12 ^ 63) | i13));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        f54652a = i16;
        if (i15 % 2 != 0) {
            int i17 = bArr[iIntValue] & Constants.CVR_B1b85_0111_VERIFIED_CLOUD;
            int i18 = iIntValue & 80;
            int i19 = iIntValue | 80;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = ((i20 ^ (-76)) | (i20 & (-76))) << 1;
            int i22 = -((i20 & 75) | ((~i20) & (-76)));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            int i24 = (bArr[i23] & Constants.CVR_B2b65_CLEAR_BITS) >>> 24;
            int i25 = (i24 & i17) | (i17 ^ i24);
            int i26 = i23 & 41;
            int i27 = ((~i26) & (i23 | 41)) + (i26 << 1);
            int i28 = (bArr[i27] & 22819) / 40;
            int i29 = i25 ^ i28;
            int i30 = i25 & i28;
            int i31 = (i30 & i29) | (i29 ^ i30);
            int i32 = i27 ^ 116;
            int i33 = (i27 & 116) << 1;
            int i34 = bArr[(i32 & i33) + (i32 | i33)] >>> 124;
            int i35 = i31 & i34;
            int i36 = (i31 | i34) & (~i35);
            i10 = i36 ^ i35;
            i11 = i36 & i35;
        } else {
            int i37 = bArr[iIntValue] & 255;
            int i38 = iIntValue & 61;
            int i39 = ((iIntValue ^ 61) | i38) << 1;
            int i40 = -((iIntValue | 61) & (~i38));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            int i42 = i41 & (-60);
            int i43 = (i41 ^ (-60)) | i42;
            int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
            int i45 = (bArr[i44] & 255) << 8;
            int i46 = (i45 & i37) | (i37 ^ i45);
            int i47 = (i44 & 109) + (i44 | 109);
            int i48 = i47 & (-108);
            int i49 = -(-((i47 ^ (-108)) | i48));
            int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
            int i51 = (bArr[i50] & 255) << 16;
            int i52 = i46 & i51;
            int i53 = (i46 | i51) & (~i52);
            int i54 = (i53 & i52) | (i53 ^ i52);
            int i55 = i50 & 1;
            int i56 = (~i55) & (i50 | 1);
            int i57 = -(-(i55 << 1));
            int i58 = bArr[(i56 ^ i57) + ((i57 & i56) << 1)] << 24;
            int i59 = ((~i58) & i54) | ((~i54) & i58);
            int i60 = i54 & i58;
            i10 = i59 ^ i60;
            i11 = i60 & i59;
        }
        int i61 = i11 | i10;
        int i62 = i16 + 30;
        int i63 = (i62 ^ (-1)) + (i62 << 1);
        f54653b = i63 % 128;
        if (i63 % 2 != 0) {
            return Integer.valueOf(i61);
        }
        throw null;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i10 = f54652a;
        int i11 = (((i10 | 116) << 1) - (i10 ^ 116)) - 1;
        f54653b = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = (int) jLongValue;
            setDividerPadding(new Object[]{Integer.valueOf(i12), bArr, Integer.valueOf(iIntValue)}, 1845285142, -1845285131, i12);
            int i13 = (int) (jLongValue >> 115);
            setDividerPadding(new Object[]{Integer.valueOf(i13), bArr, Integer.valueOf(iIntValue * 5)}, 1845285142, -1845285131, i13);
        } else {
            int i14 = (int) jLongValue;
            setDividerPadding(new Object[]{Integer.valueOf(i14), bArr, Integer.valueOf(iIntValue)}, 1845285142, -1845285131, i14);
            int i15 = (int) (jLongValue >>> 32);
            int i16 = iIntValue & 4;
            int i17 = -(-((iIntValue ^ 4) | i16));
            setDividerPadding(new Object[]{Integer.valueOf(i15), bArr, Integer.valueOf((i16 ^ i17) + ((i17 & i16) << 1))}, 1845285142, -1845285131, i15);
        }
        int i18 = f54653b;
        int i19 = ((i18 | 59) << 1) - (i18 ^ 59);
        f54652a = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr = (int[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f54653b;
        int i11 = i10 & 29;
        int i12 = (i10 | 29) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        int i15 = i14 % 128;
        f54652a = i15;
        int i16 = i14 % 2;
        int i17 = (i15 & (-94)) | ((~i15) & 93);
        int i18 = -(-((i15 & 93) << 1));
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f54653b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        while (i21 < iIntValue2) {
            int i22 = f54652a;
            int i23 = i22 & 17;
            int i24 = (i22 ^ 17) | i23;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f54653b = i25 % 128;
            int i26 = i25 % 2;
            iArr[i21] = ((Integer) setDividerPadding(new Object[]{bArr, Integer.valueOf(iIntValue)}, -40285599, 40285612, iIntValue)).intValue();
            int i27 = iIntValue - 83;
            int i28 = ((i27 ^ 87) | (i27 & 87)) << 1;
            int i29 = -(((~i27) & 87) | (i27 & (-88)));
            iIntValue = (i29 | i28) + (i28 & i29);
            i21++;
            int i30 = f54652a;
            int i31 = i30 & 41;
            int i32 = (i30 ^ 41) | i31;
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            f54653b = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = f54652a;
        int i36 = ((i35 | 87) << 1) - (i35 ^ 87);
        f54653b = i36 % 128;
        if (i36 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54652a;
        int i11 = (i10 & 125) + (i10 | 125);
        f54653b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = bArr[iIntValue] << 24;
        int i14 = iIntValue & (-3);
        int i15 = (iIntValue ^ (-3)) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        int i17 = i16 & 4;
        int i18 = i17 + ((i16 ^ 4) | i17);
        int i19 = (bArr[i18] & 255) << 16;
        int i20 = (i13 & i19) | (i13 ^ i19);
        int i21 = i18 + 1;
        int i22 = (bArr[i21] & 255) << 8;
        int i23 = i20 ^ i22;
        int i24 = i20 & i22;
        int i25 = (i24 & i23) | (i23 ^ i24);
        int i26 = bArr[((i21 ^ 2) + ((i21 & 2) << 1)) - 1] & 255;
        int i27 = ((~i26) & i25) | ((~i25) & i26);
        int i28 = i26 & i25;
        int i29 = (i28 & i27) | (i27 ^ i28);
        int i30 = ((i10 | 31) << 1) - (i10 ^ 31);
        f54653b = i30 % 128;
        if (i30 % 2 != 0) {
            return Integer.valueOf(i29);
        }
        int i31 = 68 / 0;
        return Integer.valueOf(i29);
    }

    public static /* synthetic */ Long e(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f54652a;
        int i11 = ((i10 | 80) << 1) - (i10 ^ 80);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f54653b = i12 % 128;
        int i13 = i12 % 2;
        int iIntValue2 = ((Integer) setDividerPadding(new Object[]{bArr, Integer.valueOf(iIntValue)}, -40285599, 40285612, iIntValue)).intValue();
        int i14 = -(-(iIntValue * (-107)));
        int i15 = 220 & i14;
        int i16 = ((220 ^ i14) | i15) << 1;
        int i17 = -((i14 | 220) & (~i15));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        int i19 = (-5) ^ iIntValue;
        int i20 = ~iIntValue;
        int i21 = (-5) & iIntValue;
        int i22 = ~((i19 & i21) | (i19 ^ i21));
        int i23 = (i20 | iIntValue) & i20;
        int i24 = ~i23;
        int i25 = (i23 & i20) | (iIntValue & i24);
        int i26 = i23 & iIntValue;
        int i27 = ~((i25 ^ i26) | (i25 & i26));
        int i28 = i22 ^ i27;
        int i29 = i22 & i27;
        int i30 = -(-(((i28 & i29) | (i28 ^ i29)) * (-108)));
        int i31 = ((i18 ^ i30) | (i18 & i30)) << 1;
        int i32 = -(((~i30) & i18) | ((~i18) & i30));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        int i34 = ((-5) & i20) | (iIntValue & 4) | i21;
        int i35 = ~i34;
        int i36 = (i34 | i35) & i35;
        int i37 = ~((i23 & (-5)) | (i24 & 4) | (i23 & 4));
        int i38 = i36 | i37;
        int i39 = i38 & i37;
        int i40 = (i38 | i37) & (~i39);
        int i41 = (((i40 & i39) | (i40 ^ i39)) * 54) + i33;
        int i42 = ~((i20 ^ 4) | (i20 & 4));
        int i43 = iIntValue & i42;
        int i44 = (iIntValue | i42) & (~i43);
        int i45 = -(-(((i44 & i43) | (i44 ^ i43)) * 54));
        int i46 = i41 & i45;
        int i47 = (i45 ^ i41) | i46;
        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
        long jIntValue = (((long) iIntValue2) & 4294967295L) | ((((long) ((Integer) setDividerPadding(new Object[]{bArr, Integer.valueOf(i48)}, -40285599, 40285612, i48)).intValue()) & 4294967295L) << 32);
        int i49 = f54652a;
        int i50 = i49 ^ 93;
        int i51 = (i49 & 93) << 1;
        int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
        f54653b = i52 % 128;
        if (i52 % 2 != 0) {
            return Long.valueOf(jIntValue);
        }
        int i53 = 10 / 0;
        return Long.valueOf(jIntValue);
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        byte[] bArr = (byte[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f54652a + 117;
        f54653b = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (i12 < iIntValue) {
            int i13 = f54652a + 3;
            f54653b = i13 % 128;
            if (i13 % 2 == 0) {
                setDividerPadding(new Object[]{Long.valueOf(jArr[i12]), bArr, Integer.valueOf(iIntValue2)}, -703671889, 703671896, iIntValue2);
                int i14 = ((iIntValue2 ^ 147) + ((iIntValue2 & 147) << 1)) - 44;
                int i15 = (i12 & 31) | ((~i12) & (-32));
                int i16 = -(-((i12 & (-32)) << 1));
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                i12 = ((i17 & (-110)) | ((~i17) & 109)) + ((i17 & 109) << 1);
                iIntValue2 = i14;
            } else {
                setDividerPadding(new Object[]{Long.valueOf(jArr[i12]), bArr, Integer.valueOf(iIntValue2)}, -703671889, 703671896, iIntValue2);
                int i18 = iIntValue2 & (-36);
                int i19 = ((iIntValue2 ^ (-36)) | i18) << 1;
                int i20 = -((iIntValue2 | (-36)) & (~i18));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                int i22 = i21 | 44;
                int i23 = (i22 << 1) - (i22 & (~(i21 & 44)));
                int i24 = (((i12 & 110) | ((~i12) & (-111))) - (~(-(-((i12 & (-111)) << 1))))) - 1;
                int i25 = (i24 & (-113)) | ((~i24) & 112);
                int i26 = (i24 & 112) << 1;
                int i27 = (i25 & i26) + (i26 | i25);
                iIntValue2 = i23;
                i12 = i27;
            }
            int i28 = f54652a;
            int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
            f54653b = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = f54653b;
        int i32 = ((i31 | 63) << 1) - (i31 ^ 63);
        f54652a = i32 % 128;
        if (i32 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f54653b;
        int i11 = i10 + 51;
        f54652a = i11 % 128;
        int i12 = i11 % 2;
        bArr[iIntValue2] = (byte) iIntValue;
        int i13 = iIntValue2 - 96;
        int i14 = (i13 & 97) + (i13 | 97);
        bArr[i14] = (byte) (iIntValue >>> 8);
        int i15 = ((i14 | 1) << 1) - (i14 ^ 1);
        bArr[i15] = (byte) (iIntValue >>> 16);
        int i16 = i15 & 61;
        int i17 = (i15 ^ 61) | i16;
        bArr[(-2) - ((((i16 ^ i17) + ((i17 & i16) << 1)) - 59) ^ (-1))] = (byte) (iIntValue >>> 24);
        int i18 = i10 & 77;
        int i19 = (i10 ^ 77) | i18;
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        f54652a = i20 % 128;
        if (i20 % 2 != 0) {
            int i21 = 81 / 0;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i10 = f54653b;
        int i11 = (i10 ^ 25) + ((i10 & 25) << 1);
        int i12 = i11 % 128;
        f54652a = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 85;
        int i15 = i14 + ((i12 ^ 85) | i14);
        f54653b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < 2) {
            int i18 = f54653b;
            int i19 = ((i18 & 36) + (i18 | 36)) - 1;
            f54652a = i19 % 128;
            int i20 = i19 % 2;
            setDividerPadding(new Object[]{Long.valueOf(jArr[i17]), bArr, Integer.valueOf(iIntValue)}, 108647497, -108647488, iIntValue);
            int i21 = iIntValue & 8;
            int i22 = (iIntValue ^ 8) | i21;
            iIntValue = (i22 | i21) + (i21 & i22);
            int i23 = ((i17 ^ 105) | (i17 & 105)) << 1;
            int i24 = -(((~i17) & 105) | (i17 & (-106)));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            int i26 = (i25 & 103) | ((~i25) & (-104));
            int i27 = -(-((i25 & (-104)) << 1));
            i17 = ((i26 & i27) << 1) + (i26 ^ i27);
            int i28 = f54653b;
            int i29 = i28 | 51;
            int i30 = i29 << 1;
            int i31 = -((~(i28 & 51)) & i29);
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f54652a = i32 % 128;
            int i33 = i32 % 2;
        }
        int i34 = f54653b;
        int i35 = i34 ^ 13;
        int i36 = -(-((i34 & 13) << 1));
        int i37 = (i35 & i36) + (i36 | i35);
        f54652a = i37 % 128;
        if (i37 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f54653b;
        int i11 = ((i10 & (-46)) | ((~i10) & 45)) + ((i10 & 45) << 1);
        f54652a = i11 % 128;
        if (i11 % 2 != 0) {
            bArr[iIntValue2] = (byte) (iIntValue * 62);
            int i12 = iIntValue2 & 77;
            int i13 = (iIntValue2 | 77) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 & i14) + (i13 | i14);
            bArr[i15] = (byte) (iIntValue << 74);
            int i16 = (i15 ^ 174) + ((i15 & 174) << 1);
            int i17 = i16 & (-75);
            int i18 = i17 + ((i16 ^ (-75)) | i17);
            bArr[i18] = (byte) ((((iIntValue | 38) << 1) - (iIntValue ^ 38)) - 1);
            int i19 = i18 & 145;
            int i20 = i19 + ((i18 ^ 145) | i19);
            int i21 = i20 & (-98);
            int i22 = -(-(i20 | (-98)));
            bArr[((i21 | i22) << 1) - (i22 ^ i21)] = (byte) iIntValue;
        } else {
            bArr[iIntValue2] = (byte) (iIntValue >>> 24);
            int i23 = (iIntValue2 ^ (-28)) + ((iIntValue2 & (-28)) << 1);
            int i24 = (i23 & 29) + (i23 | 29);
            bArr[i24] = (byte) (iIntValue >>> 16);
            int i25 = i24 - 102;
            int i26 = ((i25 | 103) << 1) - (((~i25) & 103) | (i25 & (-104)));
            bArr[i26] = (byte) (iIntValue >>> 8);
            int i27 = (i26 ^ 121) + ((i26 & 121) << 1);
            int i28 = i27 & (-120);
            int i29 = -(-(i27 | (-120)));
            bArr[(i28 & i29) + (i29 | i28)] = (byte) iIntValue;
        }
        int i30 = i10 | 75;
        int i31 = i30 << 1;
        int i32 = -(i30 & (~(i10 & 75)));
        int i33 = (i31 & i32) + (i32 | i31);
        f54652a = i33 % 128;
        if (i33 % 2 != 0) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long j10, byte[] bArr, int i10) {
        setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i10)}, -703671889, 703671896, i10);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        byte[] bArr;
        int i15 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = ~i12;
        int i19 = (((~(i11 | i12)) | (~(i16 | i17 | i18))) * 520) + i15;
        int i20 = ~(i17 | i18);
        int i21 = ~(i12 | i10);
        switch ((((~(i10 | i17)) | (~(i16 | i18)) | i21) * 520) + ((i20 | i21) * (-1040)) + i19) {
            case 1:
                short sShortValue = ((Short) objArr[0]).shortValue();
                byte[] bArr2 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i22 = f54652a + 86;
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                f54653b = i23 % 128;
                byte b10 = (byte) sShortValue;
                if (i23 % 2 != 0) {
                    bArr2[iIntValue] = b10;
                    int i24 = iIntValue & 1;
                    int i25 = ((iIntValue ^ 1) | i24) << 1;
                    int i26 = -((iIntValue | 1) & (~i24));
                    bArr2[(i25 & i26) + (i26 | i25)] = (byte) (sShortValue >>> 8);
                    return null;
                }
                bArr2[iIntValue] = b10;
                int i27 = (iIntValue & (-40)) + (iIntValue | (-40));
                int i28 = (i27 & (-78)) | ((~i27) & 77);
                int i29 = (i27 & 77) << 1;
                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                int i31 = sShortValue & (-115);
                bArr2[i30] = (byte) ((i31 - (~((sShortValue ^ (-115)) | i31))) - 1);
                return null;
            case 2:
                f(objArr);
                return null;
            case 3:
                short sShortValue2 = ((Short) objArr[0]).shortValue();
                byte[] bArr3 = (byte[]) objArr[1];
                int i32 = f54653b;
                int i33 = (i32 & 97) + (i32 | 97);
                int i34 = i33 % 128;
                f54652a = i34;
                int i35 = i33 % 2;
                bArr3[20] = (byte) (sShortValue2 >>> 8);
                bArr3[21] = (byte) sShortValue2;
                int i36 = ((i34 & 46) + (i34 | 46)) - 1;
                f54653b = i36 % 128;
                int i37 = i36 % 2;
                return null;
            case 4:
                i(objArr);
                return null;
            case 5:
                h(objArr);
                return null;
            case 6:
                byte[] bArr4 = (byte[]) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i38 = f54653b + 23;
                f54652a = i38 % 128;
                if (i38 % 2 != 0) {
                    i13 = bArr4[iIntValue2] & 11748;
                    int i39 = iIntValue2 & 116;
                    int i40 = -(-(iIntValue2 | 116));
                    i14 = (bArr4[(i39 ^ i40) + ((i40 & i39) << 1)] & 26658) << 73;
                } else {
                    i13 = bArr4[iIntValue2] & 255;
                    i14 = (bArr4[(((iIntValue2 | 2) << 1) - (iIntValue2 ^ 2)) - 1] & 255) << 8;
                }
                return Short.valueOf((short) ((i14 & i13) | (i13 ^ i14)));
            case 7:
                b(objArr);
                return null;
            case 8:
                c(objArr);
                return null;
            case 9:
                long jLongValue = ((Number) objArr[0]).longValue();
                byte[] bArr5 = (byte[]) objArr[1];
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i41 = f54653b;
                int i42 = (i41 ^ 67) + ((i41 & 67) << 1);
                f54652a = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = (int) (jLongValue << 4);
                    setDividerPadding(new Object[]{Integer.valueOf(i43), bArr5, Integer.valueOf(iIntValue3)}, -2092293587, 2092293591, i43);
                    int i44 = (int) jLongValue;
                    setDividerPadding(new Object[]{Integer.valueOf(i44), bArr5, Integer.valueOf(iIntValue3 >> 5)}, -2092293587, 2092293591, i44);
                    return null;
                }
                int i45 = (int) (jLongValue >>> 32);
                setDividerPadding(new Object[]{Integer.valueOf(i45), bArr5, Integer.valueOf(iIntValue3)}, -2092293587, 2092293591, i45);
                int i46 = (int) jLongValue;
                setDividerPadding(new Object[]{Integer.valueOf(i46), bArr5, Integer.valueOf(((iIntValue3 ^ 4) - (~(-(-((iIntValue3 & 4) << 1))))) - 1)}, -2092293587, 2092293591, i46);
                return null;
            case 10:
                return d(objArr);
            case 11:
                g(objArr);
                return null;
            case 12:
                return e(objArr);
            case 13:
                return a(objArr);
            case 14:
                byte[] bArr6 = (byte[]) objArr[0];
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int i47 = f54653b;
                int i48 = i47 ^ 7;
                int i49 = -(-((i47 & 7) << 1));
                int i50 = (i48 & i49) + (i49 | i48);
                f54652a = i50 % 128;
                int i51 = i50 % 2;
                int iIntValue5 = ((Integer) setDividerPadding(new Object[]{bArr6, Integer.valueOf(iIntValue4)}, 450133947, -450133937, iIntValue4)).intValue();
                int i52 = -(-(iIntValue4 * (-49)));
                int i53 = 204 & i52;
                int i54 = (i53 - (~(-(-((i52 ^ 204) | i53))))) - 1;
                int i55 = iIntValue4 & 4;
                int i56 = (~i55) & (iIntValue4 | 4);
                int i57 = ~iIntValue4;
                int i58 = (i55 | i56) * (-50);
                int i59 = i54 & i58;
                int i60 = -(-((i58 ^ i54) | i59));
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                int i62 = (i57 | iIntValue4) & i57;
                int i63 = (-5) & i62;
                int i64 = ((-5) | i62) & (~i63);
                int i65 = (i64 & i63) | (i64 ^ i63);
                int i66 = ~((iIntValue4 & i65) | (i65 ^ iIntValue4));
                int i67 = (i57 ^ i57) | (i57 & i57);
                int i68 = (i67 & 4) | (i67 ^ 4);
                int i69 = ~i68;
                int i70 = (i68 | i69) & i69;
                int i71 = ((~i70) & i66) | ((~i66) & i70);
                int i72 = i66 & i70;
                int i73 = (i61 - (~(-(~(-(-(((i72 & i71) | (i71 ^ i72)) * 50))))))) - 2;
                int i74 = i62 & i57;
                int i75 = (~i74) & (i62 | i57);
                int i76 = ~((i74 & i75) | (i75 ^ i74));
                int i77 = (i62 & 4) | (i62 ^ 4);
                int i78 = ~i77;
                int i79 = (i77 | i78) & i78;
                int i80 = i76 ^ i79;
                int i81 = i76 & i79;
                int i82 = (i81 & i80) | (i80 ^ i81);
                int i83 = (i57 & (-5)) | ((~i57) & 4);
                int i84 = i57 & 4;
                int i85 = ~((i83 & i84) | (i83 ^ i84));
                int i86 = (i73 - (~(-(-(((i82 & i85) | (((~i85) & i82) | ((~i82) & i85))) * 50))))) - 1;
                long jIntValue = ((((long) iIntValue5) & 4294967295L) << 32) | (((long) ((Integer) setDividerPadding(new Object[]{bArr6, Integer.valueOf(i86)}, 450133947, -450133937, i86)).intValue()) & 4294967295L);
                int i87 = f54653b;
                int i88 = ((i87 | 17) << 1) - (i87 ^ 17);
                f54652a = i88 % 128;
                int i89 = i88 % 2;
                return Long.valueOf(jIntValue);
            case 15:
                int iIntValue6 = ((Number) objArr[0]).intValue();
                int i90 = ~iIntValue6;
                int i91 = (i90 & (-670955419)) | ((~i90) & 670955418);
                int i92 = i90 & 670955418;
                int i93 = (i91 & i92) | (i91 ^ i92);
                int i94 = ~i93;
                int i95 = (((i93 | i94) & i94) | (-1658770556)) * 764;
                int i96 = 1091720918 & i95;
                int i97 = ((1091720918 ^ i95) | i96) << 1;
                int i98 = -((~i96) & (i95 | 1091720918));
                int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                int i100 = (i90 | iIntValue6) & i90;
                int i101 = ~i100;
                int i102 = (1658770555 & i100) | ((-1658770556) & i101);
                int i103 = (-1658770556) & i100;
                int i104 = ~((i102 ^ i103) | (i103 & i102));
                int i105 = ((584897562 ^ i104) | (i104 & 584897562)) * (-1528);
                int i106 = ((i99 | i105) << 1) - (i99 ^ i105);
                int i107 = (i100 & 670955418) | (i101 & 670955418) | ((-670955419) & i100);
                int i108 = ~i107;
                int i109 = (i107 | i108) & i108;
                int i110 = (-1159930850) & i109;
                int i111 = -(~((((i109 | (-1159930850)) & (~i110)) | i110) * 764));
                int i112 = (-2) - ((((i106 | i111) << 1) - (i111 ^ i106)) ^ (-1));
                int i113 = (-1274617288) & iIntValue6;
                int i114 = (~i113) & ((-1274617288) | iIntValue6);
                int i115 = (i113 & i114) | (i114 ^ i113);
                int i116 = ~i115;
                int i117 = (i115 | i116) & i116;
                int i118 = ((i117 & 1267211264) | ((~i117) & 1267211264) | (i117 & (-1267211265))) * 345;
                int i119 = (-2030326632) & i118;
                int i120 = (i118 | (-2030326632)) & (~i119);
                int i121 = -(-(i119 << 1));
                int i122 = (i120 & i121) + (i120 | i121);
                int i123 = ~((i90 & (-1274617288)) | ((-1274617288) ^ i90));
                int i124 = i123 & 872579584;
                int i125 = (i123 | 872579584) & (~i124);
                int i126 = ((i125 & i124) | (i125 ^ i124)) * 345;
                int i127 = (((i122 ^ i126) | (i122 & i126)) << 1) - ((i126 & (~i122)) | ((~i126) & i122));
                int i128 = (-1267211265) ^ iIntValue6;
                int i129 = (-1267211265) & iIntValue6;
                int i130 = (i128 & i129) | (i128 ^ i129);
                int i131 = ~i130;
                int i132 = -(-(((i130 | i131) & i131) * 345));
                if (i112 > (i127 ^ i132) + ((i132 & i127) << 1)) {
                    bArr = new byte[5];
                    setDividerPadding(new Object[]{Integer.valueOf(iIntValue6), bArr, 0}, -2092293587, 2092293591, iIntValue6);
                } else {
                    bArr = new byte[4];
                    setDividerPadding(new Object[]{Integer.valueOf(iIntValue6), bArr, 0}, -2092293587, 2092293591, iIntValue6);
                }
                return bArr;
            default:
                byte[] bArr7 = (byte[]) objArr[0];
                int iIntValue7 = ((Number) objArr[1]).intValue();
                long[] jArr = (long[]) objArr[2];
                int i133 = f54653b;
                int i134 = i133 & 43;
                int i135 = (i134 - (~(-(-((i133 ^ 43) | i134))))) - 1;
                int i136 = i135 % 128;
                f54652a = i136;
                int i137 = i135 % 2;
                int i138 = (i136 & (-50)) | ((~i136) & 49);
                int i139 = -(-((i136 & 49) << 1));
                int i140 = ((i138 | i139) << 1) - (i139 ^ i138);
                f54653b = i140 % 128;
                int i141 = i140 % 2;
                int i142 = 0;
                while (i142 < 2) {
                    int i143 = f54653b;
                    int i144 = i143 & 29;
                    int i145 = (i144 - (~((i143 ^ 29) | i144))) - 1;
                    f54652a = i145 % 128;
                    if (i145 % 2 != 0) {
                        jArr[i142] = ((Long) setDividerPadding(new Object[]{bArr7, Integer.valueOf(iIntValue7)}, -1086518195, 1086518209, iIntValue7)).longValue();
                        iIntValue7 = (-2) - ((((iIntValue7 | 81) << 1) - (iIntValue7 ^ 81)) ^ (-1));
                        int i146 = i142 & 32;
                        int i147 = (i142 ^ 32) | i146;
                        i142 = (i146 ^ i147) + ((i147 & i146) << 1);
                    } else {
                        jArr[i142] = ((Long) setDividerPadding(new Object[]{bArr7, Integer.valueOf(iIntValue7)}, -1086518195, 1086518209, iIntValue7)).longValue();
                        int i148 = i142 + 81;
                        i142 = (i148 ^ (-80)) + ((i148 & (-80)) << 1);
                        iIntValue7 = (iIntValue7 & 8) + (iIntValue7 | 8);
                    }
                }
                int i149 = f54652a;
                int i150 = i149 & 31;
                int i151 = (((i149 | 31) & (~i150)) - (~(i150 << 1))) - 1;
                f54653b = i151 % 128;
                int i152 = i151 % 2;
                return null;
        }
    }

    public static void setOnFocusChangeListener(short s4, byte[] bArr) {
        setDividerPadding(new Object[]{Short.valueOf(s4), bArr}, -522993227, 522993230, (int) System.currentTimeMillis());
    }

    public static int setX(byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, 450133947, -450133937, i10)).intValue();
    }

    public static void setY(byte[] bArr, int i10, long[] jArr) {
        setDividerPadding(new Object[]{bArr, Integer.valueOf(i10), jArr}, 854484345, -854484345, i10);
    }

    public static long setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        return ((Long) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, 1511464331, -1511464319, i10)).longValue();
    }

    public static void setOnFocusChangeListener(short s4, byte[] bArr, int i10) {
        setDividerPadding(new Object[]{Short.valueOf(s4), bArr, Integer.valueOf(i10)}, 1856223175, -1856223174, i10);
    }

    public static long setY(byte[] bArr, int i10) {
        return ((Long) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, -1086518195, 1086518209, i10)).longValue();
    }

    public static void setCompoundDrawableTintBlendMode(int i10, byte[] bArr, int i11) {
        setDividerPadding(new Object[]{Integer.valueOf(i10), bArr, Integer.valueOf(i11)}, 1845285142, -1845285131, i10);
    }

    public static int setOnFocusChangeListener(byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, -40285599, 40285612, i10)).intValue();
    }

    public static byte[] setCompoundDrawableTintBlendMode(int i10) {
        return (byte[]) setDividerPadding(new Object[]{Integer.valueOf(i10)}, 1002534333, -1002534318, i10);
    }

    public static void setOnFocusChangeListener(long[] jArr, byte[] bArr, int i10) {
        setDividerPadding(new Object[]{jArr, bArr, Integer.valueOf(i10)}, -1441180578, 1441180583, i10);
    }

    public static void setOnFocusChangeListener(long j10, byte[] bArr, int i10) {
        setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i10)}, 108647497, -108647488, i10);
    }

    public static void setDividerPadding(long[] jArr, int i10, byte[] bArr, int i11) {
        setDividerPadding(new Object[]{jArr, Integer.valueOf(i10), bArr, Integer.valueOf(i11)}, 567217078, -567217076, i10);
    }

    public static void setDividerPadding(byte[] bArr, int i10, int[] iArr, int i11) {
        setDividerPadding(new Object[]{bArr, Integer.valueOf(i10), iArr, Integer.valueOf(i11)}, 1570947064, -1570947056, i10);
    }

    public static short setDividerPadding(byte[] bArr, int i10) {
        return ((Short) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, -969353966, 969353972, i10)).shortValue();
    }

    public static void setDividerPadding(int i10, byte[] bArr, int i11) {
        setDividerPadding(new Object[]{Integer.valueOf(i10), bArr, Integer.valueOf(i11)}, -2092293587, 2092293591, i10);
    }
}
