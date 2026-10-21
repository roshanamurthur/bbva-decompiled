package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class akc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52993a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52994b = 1;

    public static byte[] setCompoundDrawableTintBlendMode(BigInteger bigInteger, int i10) {
        return (byte[]) setDividerPadding(new Object[]{bigInteger, Integer.valueOf(i10)}, 51287140, -51287140, i10);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13;
        if (i16 == 1) {
            apk apkVar = (apk) objArr[0];
            int i17 = f52993a;
            int i18 = i17 & 19;
            int i19 = i17 | 19;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f52994b = i20 % 128;
            int i21 = i20 % 2;
            int onFocusChangeListener = apkVar.setOnFocusChangeListener();
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i22 = -(~(onFocusChangeListener * 131));
            int i23 = (((-903) ^ i22) + ((i22 & (-903)) << 1)) - 1;
            int i24 = ~onFocusChangeListener;
            int i25 = ~iCurrentTimeMillis;
            int i26 = (i25 & i24) | (i24 ^ i25);
            int i27 = (~((i26 & 7) | (i26 & (-8)) | ((~i26) & 7))) * 130;
            int i28 = ((((~i27) & i23) | ((~i23) & i27)) - (~(-(-((i27 & i23) << 1))))) - 1;
            int i29 = i24 & 7;
            int i30 = (~i29) & (i24 | 7);
            int i31 = -(-((~((i29 & i30) | (i30 ^ i29))) * (-260)));
            int i32 = ((i28 | i31) << 1) - (i31 ^ i28);
            int i33 = (i24 & (-8)) | (onFocusChangeListener & 7);
            int i34 = (-8) & onFocusChangeListener;
            int i35 = ~((i33 & i34) | (i33 ^ i34));
            int i36 = ~onFocusChangeListener;
            int i37 = (i36 & 7) | (i36 ^ 7);
            int i38 = ((~iCurrentTimeMillis) & i37) | ((~i37) & iCurrentTimeMillis);
            int i39 = i37 & iCurrentTimeMillis;
            int i40 = ~((i39 & i38) | (i38 ^ i39));
            int i41 = i35 & i40;
            int i42 = (i40 | i35) & (~i41);
            int i43 = ((i32 - (~(-(~(((i42 & i41) | (i42 ^ i41)) * 130))))) - 2) / 8;
            int i44 = f52993a;
            int i45 = ((i44 & 85) - (~(-(-(i44 | 85))))) - 1;
            f52994b = i45 % 128;
            int i46 = i45 % 2;
            return Integer.valueOf(i43);
        }
        if (i16 == 2) {
            aph aphVar = (aph) objArr[0];
            int i47 = f52993a;
            int i48 = i47 & 13;
            int i49 = (i47 ^ 13) | i48;
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            f52994b = i50 % 128;
            int i51 = i50 % 2;
            int onFocusChangeListener2 = aphVar.setOnFocusChangeListener();
            int i52 = onFocusChangeListener2 & 7;
            int i53 = -(-(onFocusChangeListener2 | 7));
            int i54 = ((i52 ^ i53) + ((i53 & i52) << 1)) / 8;
            int i55 = f52993a + 102;
            int i56 = (i55 ^ (-1)) + (i55 << 1);
            f52994b = i56 % 128;
            int i57 = i56 % 2;
            return Integer.valueOf(i54);
        }
        BigInteger bigInteger = (BigInteger) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i58 = f52994b;
        int i59 = (i58 & (-38)) | ((~i58) & 37);
        int i60 = -(-((i58 & 37) << 1));
        int i61 = (i59 & i60) + (i60 | i59);
        f52993a = i61 % 128;
        int i62 = i61 % 2;
        byte[] byteArray = bigInteger.toByteArray();
        if (iIntValue < byteArray.length) {
            int i63 = f52993a + 77;
            f52994b = i63 % 128;
            int i64 = i63 % 2;
            bArr = new byte[iIntValue];
            int length = byteArray.length;
            int i65 = -iIntValue;
            System.arraycopy(byteArray, (length & i65) + (length | i65), bArr, 0, iIntValue);
            int i66 = f52994b;
            int i67 = ((((i66 ^ 83) | (i66 & 83)) << 1) - (~(-(((~i66) & 83) | (i66 & (-84)))))) - 1;
            f52993a = i67 % 128;
            if (i67 % 2 != 0) {
                int i68 = 55 / 0;
            }
        } else {
            if (iIntValue <= byteArray.length) {
                int i69 = f52994b;
                int i70 = ((i69 & (-42)) | ((~i69) & 41)) + ((i69 & 41) << 1);
                f52993a = i70 % 128;
                int i71 = i70 % 2;
                return byteArray;
            }
            int i72 = f52994b;
            int i73 = i72 & 45;
            int i74 = ((i72 ^ 45) | i73) << 1;
            int i75 = -((i72 | 45) & (~i73));
            int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
            f52993a = i76 % 128;
            int i77 = i76 % 2;
            bArr = new byte[iIntValue];
            int i78 = -byteArray.length;
            int i79 = i78 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY;
            int i80 = iIntValue * (-520);
            int i81 = ((((i79 ^ i80) | (i79 & i80)) << 1) - (~(-(((~i79) & i80) | ((~i80) & i79))))) - 1;
            int i82 = ~iIntValue;
            int i83 = (i82 | iIntValue) & i82;
            int i84 = (i83 & i82) | ((~i83) & iIntValue);
            int i85 = i83 & iIntValue;
            int i86 = ~((i84 & i85) | (i84 ^ i85));
            int i87 = i78 & i86;
            int i88 = (i86 | i78) & (~i87);
            int i89 = -(~(((i88 & i87) | (i88 ^ i87)) * (-1042)));
            int i90 = ((i81 ^ i89) + ((i81 & i89) << 1)) - 1;
            int i91 = iIntValue ^ iIntValue;
            int i92 = iIntValue & iIntValue;
            int i93 = (i90 - (~(-(~(((i91 & i92) | (i91 ^ i92)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))) - 1;
            int i94 = (i93 ^ (-1)) + (i93 << 1);
            int i95 = ~i78;
            int i96 = ((~i82) & i95) | ((~i95) & i82);
            int i97 = i82 & i95;
            int i98 = ~((i97 & i96) | (i96 ^ i97));
            int i99 = i95 & (i95 | i78);
            int i100 = i99 & iIntValue;
            int i101 = (i99 | iIntValue) & (~i100);
            int i102 = ~((i101 & i100) | (i101 ^ i100));
            int i103 = i98 ^ i102;
            int i104 = i98 & i102;
            int i105 = (i104 & i103) | (i103 ^ i104);
            int i106 = i83 ^ i78;
            int i107 = i78 & i83;
            int i108 = (i107 & i106) | (i106 ^ i107);
            int i109 = i108 & iIntValue;
            int i110 = (iIntValue | i108) & (~i109);
            int i111 = (i110 & i109) | (i110 ^ i109);
            int i112 = ~i111;
            int i113 = (i111 | i112) & i112;
            int i114 = i105 & i113;
            int i115 = (i113 | i105) & (~i114);
            int i116 = ((i115 & i114) | (i115 ^ i114)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
            int i117 = i94 & i116;
            int i118 = (i116 ^ i94) | i117;
            System.arraycopy(byteArray, 0, bArr, (i117 ^ i118) + ((i118 & i117) << 1), byteArray.length);
            int i119 = f52994b;
            int i120 = ((i119 ^ 20) + ((i119 & 20) << 1)) - 1;
            f52993a = i120 % 128;
            int i121 = i120 % 2;
        }
        return bArr;
    }

    public static int setY(aph aphVar) {
        return ((Integer) setDividerPadding(new Object[]{aphVar}, 1681595904, -1681595902, (int) System.currentTimeMillis())).intValue();
    }

    public static int setCompoundDrawableTintBlendMode(apk apkVar) {
        return ((Integer) setDividerPadding(new Object[]{apkVar}, -545325898, 545325899, (int) System.currentTimeMillis())).intValue();
    }
}
