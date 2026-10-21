package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class afh extends acy {
    public afh(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i10 = length / 2;
        char[] cArr = new char[i10];
        int i11 = 0;
        while (i11 != i10) {
            int i12 = i11 * 2;
            int i13 = bArr[i12] << 8;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i14 = -(-(i11 * (-1728)));
            int i15 = 866 & i14;
            int i16 = i15 + ((i14 ^ 866) | i15);
            int i17 = ~i12;
            int i18 = ~iCurrentTimeMillis;
            int i19 = (i18 | iCurrentTimeMillis) & i18;
            int i20 = (-2) & i19;
            int i21 = (i19 | (-2)) & (~i20);
            int i22 = ~((i21 & i20) | (i21 ^ i20));
            int i23 = -(-(((i22 & i17) | ((~i22) & i17) | ((~i17) & i22)) * (-865)));
            int i24 = ((~i23) & i16) | ((~i16) & i23);
            int i25 = (i23 & i16) << 1;
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            int i27 = i18 & 1;
            int i28 = (iCurrentTimeMillis & (-2)) | i27;
            int i29 = iCurrentTimeMillis & 1;
            int i30 = (~((i29 & i28) | (i28 ^ i29))) * 865;
            int i31 = ((((~i30) & i26) | ((~i26) & i30)) - (~((i30 & i26) << 1))) - 1;
            int i32 = ~((i17 & i18) | (i17 ^ i18));
            int i33 = (~i27) & (i18 | 1);
            int i34 = ~((i33 & i27) | (i33 ^ i27));
            int i35 = i32 ^ i34;
            int i36 = i32 & i34;
            int i37 = bArr[(i31 - (~(-(-(((i36 & i35) | (i35 ^ i36)) * 865))))) - 1] & 255;
            cArr[i11] = (char) ((i37 & i13) | (i13 ^ i37));
            int i38 = (i11 & (-3)) | ((~i11) & 2);
            int i39 = (i11 & 2) << 1;
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            i11 = (i40 - (~(-(-((i40 ^ (-1)) | i40))))) - 1;
        }
        this.f52436t0 = cArr;
    }
}
