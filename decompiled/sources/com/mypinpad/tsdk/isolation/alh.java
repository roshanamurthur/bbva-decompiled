package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class alh extends akt implements ali {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53033d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53034e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aki f53035c;

    public alh(aki akiVar) {
        this.f53035c = akiVar;
    }

    public abstract byte setCompoundDrawableTintBlendMode(byte b10);

    public int setDividerPadding(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws akr {
        int i13 = f53033d;
        int i14 = i13 | 11;
        int i15 = i14 << 1;
        int i16 = -(i14 & (~(i13 & 11)));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f53034e = i17 % 128;
        int i18 = i17 % 2;
        int i19 = i11 * (-183);
        int i20 = i10 * 185;
        int i21 = i19 | i20;
        int i22 = (i21 << 1) - ((~(i19 & i20)) & i21);
        int i23 = ~i11;
        int i24 = i10 ^ i23;
        int i25 = i10 & i23;
        int i26 = ((i24 & i25) | (i24 ^ i25)) * (-368);
        int i27 = i22 & i26;
        int i28 = (((i22 ^ i26) | i27) << 1) - ((i26 | i22) & (~i27));
        int i29 = ~i10;
        int i30 = ~i10;
        int i31 = -(-(((i11 ^ i29) | (i11 & i29) | i30) * 184));
        int i32 = (i28 & i31) + (i28 | i31);
        int i33 = i23 ^ i29;
        int i34 = i29 & i23;
        int i35 = ~((i34 & i33) | (i33 ^ i34));
        int i36 = ~(i30 | i11);
        int i37 = i35 & i36;
        int i38 = (i35 | i36) & (~i37);
        int i39 = (i38 & i37) | (i38 ^ i37);
        int i40 = (i23 & i10) | (i11 & i30);
        int i41 = i11 & i10;
        int i42 = (i40 & i41) | (i40 ^ i41);
        int i43 = (i42 | (~i42)) & (~i42);
        int i44 = ((~i43) & i39) | ((~i39) & i43);
        int i45 = i43 & i39;
        int i46 = -(-(((i45 & i44) | (i44 ^ i45)) * 184));
        int i47 = ((i32 ^ i46) | (i32 & i46)) << 1;
        int i48 = -((i46 & (~i32)) | ((~i46) & i32));
        if ((i47 ^ i48) + ((i48 & i47) << 1) > bArr.length) {
            throw new akr("input buffer too small");
        }
        if (((i12 | i11) << 1) - (i12 ^ i11) > bArr2.length) {
            throw new ald("output buffer too short");
        }
        int i49 = -(-i11);
        int i50 = ((i10 ^ i49) | (i10 & i49)) << 1;
        int i51 = -((i49 & i30) | ((~i49) & i10));
        int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
        int i53 = i13 & 59;
        int i54 = (((i13 ^ 59) | i53) << 1) - ((i13 | 59) & (~i53));
        f53034e = i54 % 128;
        int i55 = i54 % 2;
        while (i10 < i52) {
            int i56 = f53033d + 111;
            f53034e = i56 % 128;
            int i57 = i56 % 2;
            int i58 = i12 & 54;
            int i59 = (i12 ^ 54) | i58;
            int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
            int i61 = i60 & (-53);
            int i62 = (i61 - (~(-(-((i60 ^ (-53)) | i61))))) - 1;
            int i63 = i10 & 1;
            int i64 = i63 + ((i10 ^ 1) | i63);
            bArr2[i12] = setCompoundDrawableTintBlendMode(bArr[i10]);
            int i65 = f53034e;
            int i66 = (i65 & (-58)) | ((~i65) & 57);
            int i67 = (i65 & 57) << 1;
            int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
            f53033d = i68 % 128;
            int i69 = i68 % 2;
            i12 = i62;
            i10 = i64;
        }
        int i70 = f53034e;
        int i71 = ((((i70 ^ 117) | (i70 & 117)) << 1) - (~(-(((~i70) & 117) | (i70 & (-118)))))) - 1;
        f53033d = i71 % 128;
        if (i71 % 2 == 0) {
            return i11;
        }
        throw null;
    }
}
