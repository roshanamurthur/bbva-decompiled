package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class beb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54627a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54628b = 1;

    static {
        BigInteger.valueOf(0L);
        BigInteger.valueOf(1L);
        BigInteger.valueOf(2L);
        BigInteger.valueOf(4L);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = (836944821 & i10) | (iCurrentTimeMillis & (-836944822));
        int i12 = 836944821 & iCurrentTimeMillis;
        int i13 = (~((i11 & i12) | (i11 ^ i12))) | (~((374229063 & i10) | (i10 ^ 374229063)));
        int i14 = ~iCurrentTimeMillis;
        int i15 = (836944821 & i14) | ((~i14) & (-836944822));
        int i16 = i14 & (-836944822);
        int i17 = ~((i15 & i16) | (i15 ^ i16));
        int i18 = ((~i17) & i13) | ((~i13) & i17);
        int i19 = i17 & i13;
        int i20 = ((i19 & i18) | (i18 ^ i19)) * (-516);
        int i21 = ((1636784797 & i20) - (~(-(-(i20 | 1636784797))))) - 1;
        int i22 = ~((iCurrentTimeMillis & (-101451843)) | ((-101451843) ^ iCurrentTimeMillis));
        int i23 = (-374229064) & i10;
        int i24 = ((-374229064) | i10) & (~i23);
        int i25 = (i24 & i23) | (i24 ^ i23);
        int i26 = i25 ^ (-836944822);
        int i27 = i25 & (-836944822);
        int i28 = ~((i27 & i26) | (i26 ^ i27));
        int i29 = ((~i28) & i22) | ((~i22) & i28);
        int i30 = i22 & i28;
        int i31 = ((i30 & i29) | (i29 ^ i30)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
        int i32 = (i21 & i31) + (i31 | i21);
        int i33 = i10 & (-836944822);
        int i34 = i33 | ((i10 | (-836944822)) & (~i33));
        int i35 = (i34 | (~i34)) & (~i34);
        int i36 = ((~i35) & 272777221) | ((-272777222) & i35);
        int i37 = i35 & 272777221;
        int i38 = ((-1) << 1) - ((i32 - (~(((i37 & i36) | (i36 ^ i37)) * LibMCryptConstants.IND_HEX_SEGMENTO2))) ^ (-1));
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i39 = ~iCurrentTimeMillis2;
        int i40 = ~iCurrentTimeMillis2;
        int i41 = (i40 | iCurrentTimeMillis2) & i39;
        int i42 = (i41 & (-306324415)) | ((~i41) & 306324414);
        int i43 = i41 & 306324414;
        int i44 = (i43 & i42) | (i42 ^ i43);
        int i45 = (((i44 | (~i44)) & (~i44)) | 447388718) * (-1042);
        int i46 = 1233771484 & i45;
        int i47 = (i45 | 1233771484) & (~i46);
        int i48 = -(-(i46 << 1));
        int i49 = (i47 & i48) + (i47 | i48);
        int i50 = (i40 & 306324414) | (iCurrentTimeMillis2 & (-306324415));
        int i51 = 306324414 & iCurrentTimeMillis2;
        int i52 = -(~(-(-(((i50 & i51) | (i50 ^ i51)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))));
        int i53 = ((-1) << 1) - (((i49 ^ i52) + ((i52 & i49) << 1)) ^ (-1));
        int i54 = (-447388719) & iCurrentTimeMillis2;
        int i55 = (iCurrentTimeMillis2 | (-447388719)) & (~i54);
        int i56 = (i55 & i54) | (i55 ^ i54);
        int i57 = (i56 | (~i56)) & (~i56);
        int i58 = ((~i57) & 302121006) | ((-302121007) & i57);
        int i59 = i57 & 302121006;
        int i60 = (i59 & i58) | (i58 ^ i59);
        int i61 = ((-447388719) & i39) | ((~i39) & 447388718);
        int i62 = i39 & 447388718;
        int i63 = (i62 & i61) | (i61 ^ i62);
        int i64 = (i63 & (-306324415)) | ((~i63) & 306324414);
        int i65 = i63 & 306324414;
        int i66 = ~((i65 & i64) | (i64 ^ i65));
        int i67 = i60 & i66;
        int i68 = (i60 | i66) & (~i67);
        int i69 = -(~(((i68 & i67) | (i68 ^ i67)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
        int i70 = ((i53 | i69) << 1) - (i69 ^ i53);
        if (i38 > (i70 ^ (-1)) + (i70 << 1)) {
            throw null;
        }
    }

    public static int setDividerPadding(int i10) {
        return ((Integer) setX(new Object[]{Integer.valueOf(i10)}, -1794478525, 1794478525, i10)).intValue();
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i14 = f54628b;
        int i15 = (i14 ^ 25) + ((i14 & 25) << 1);
        int i16 = i15 % 128;
        f54627a = i16;
        int i17 = i15 % 2;
        if (iIntValue == 0) {
            int i18 = (-2) - (((i16 ^ 38) + ((i16 & 38) << 1)) ^ (-1));
            f54628b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = i16 & 91;
            int i21 = (i20 - (~((i16 ^ 91) | i20))) - 1;
            f54628b = i21 % 128;
            int i22 = i21 % 2;
            return 1;
        }
        if (iIntValue < 0) {
            int i23 = i16 + 65;
            int i24 = i23 % 128;
            f54628b = i24;
            iIntValue = -iIntValue;
            if (i23 % 2 == 0) {
                int i25 = 63 / 0;
            }
            int i26 = i24 + 21;
            f54627a = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = f54628b;
        int i29 = (i28 & (-98)) | ((~i28) & 97);
        int i30 = (i28 & 97) << 1;
        int i31 = (i29 & i30) + (i30 | i29);
        f54627a = i31 % 128;
        int i32 = i31 % 2;
        while (iIntValue > 0) {
            int i33 = f54628b;
            int i34 = (((i33 | 39) << 1) - (~(-(((~i33) & 39) | (i33 & (-40)))))) - 1;
            f54627a = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = i13 ^ 54;
                i13 = ((((i13 & 54) | i35) << 1) - (~(-i35))) - 1;
                int i36 = iIntValue & 107;
                int i37 = -(-((iIntValue ^ 107) | i36));
                iIntValue = ((i36 | i37) << 1) - (i37 ^ i36);
            } else {
                int i38 = (i13 & (-2)) | ((~i13) & 1);
                int i39 = (i13 & 1) << 1;
                iIntValue >>>= 8;
                i13 = ((i38 | i39) << 1) - (i39 ^ i38);
            }
        }
        int i40 = f54627a;
        int i41 = i40 & 99;
        int i42 = -(-(i40 | 99));
        int i43 = (i41 & i42) + (i42 | i41);
        f54628b = i43 % 128;
        int i44 = i43 % 2;
        return Integer.valueOf(i13);
    }
}
