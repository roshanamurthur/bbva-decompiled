package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ath extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53818g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53819h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atp f53820f;

    static {
        new atj(apj.setOnFocusChangeListener);
        int i10 = f53818g;
        int i11 = ((i10 ^ 124) + ((i10 & 124) << 1)) - 1;
        f53819h = i11 % 128;
        int i12 = i11 % 2;
    }

    public ath() {
        super(283, 5, 7, 12);
        this.f53820f = new atp(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-1917)) + (i10 * 960);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~(i14 | i12))) * 959) + (i14 * (-959)) + (((~(i14 | i15)) | (~(i10 | i12))) * 959) + i13;
        if (i16 == 1) {
            ath athVar = (ath) objArr[0];
            int i17 = f53818g;
            int i18 = (i17 ^ 53) + ((i17 & 53) << 1);
            f53819h = i18 % 128;
            int i19 = i18 % 2;
            atp atpVar = athVar.f53820f;
            int i20 = i17 + 115;
            f53819h = i20 % 128;
            int i21 = i20 % 2;
            return atpVar;
        }
        if (i16 == 2) {
            atj atjVar = new atj((BigInteger) objArr[1]);
            int i22 = f53819h;
            int i23 = (i22 & (-30)) | ((~i22) & 29);
            int i24 = (i22 & 29) << 1;
            int i25 = (i23 & i24) + (i24 | i23);
            f53818g = i25 % 128;
            int i26 = i25 % 2;
            return atjVar;
        }
        if (i16 == 3) {
            ath athVar2 = new ath();
            int i27 = f53819h;
            int i28 = i27 & 27;
            int i29 = (i27 | 27) & (~i28);
            int i30 = i28 << 1;
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            f53818g = i31 % 128;
            if (i31 % 2 == 0) {
                return athVar2;
            }
            throw null;
        }
        if (i16 == 4) {
            atp atpVar2 = new atp((ath) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i32 = f53819h;
            int i33 = ((i32 & 82) + (i32 | 82)) - 1;
            f53818g = i33 % 128;
            if (i33 % 2 == 0) {
                return atpVar2;
            }
            throw null;
        }
        if (i16 == 5) {
            int i34 = f53818g;
            int i35 = (i34 ^ 37) + ((i34 & 37) << 1);
            int i36 = i35 % 128;
            f53819h = i36;
            int i37 = i35 % 2 == 0 ? 13130 : 283;
            int i38 = i36 + 45;
            f53818g = i38 % 128;
            if (i38 % 2 == 0) {
                return Integer.valueOf(i37);
            }
            throw null;
        }
        int iIntValue = ((Number) objArr[1]).intValue();
        int i39 = f53819h;
        int i40 = i39 & 35;
        int i41 = ((i39 ^ 35) | i40) << 1;
        int i42 = -((~i40) & (i39 | 35));
        int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
        int i44 = i43 % 128;
        f53818g = i44;
        if (i43 % 2 != 0) {
            throw null;
        }
        if (iIntValue != 6) {
            int i45 = (i44 & 71) + (i44 | 71);
            f53819h = i45 % 128;
            int i46 = i45 % 2;
            return Boolean.FALSE;
        }
        int i47 = i39 & 105;
        int i48 = (i47 - (~((i39 ^ 105) | i47))) - 1;
        f53818g = i48 % 128;
        if (i48 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setY(new Object[]{this}, -478354357, 478354360, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setY(new Object[]{this, apkVar, apkVar2}, -909679855, 909679859, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setY(new Object[]{this, bigInteger}, 1914958901, -1914958899, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setY(new Object[]{this, Integer.valueOf(i10)}, 85699265, -85699265, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 1450413908, -1450413903, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setY(new Object[]{this}, 917186134, -917186133, System.identityHashCode(this));
    }
}
