package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ats extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53847g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53848h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atw f53849f;

    static {
        new att(apj.setOnFocusChangeListener);
        int i10 = f53848h;
        int i11 = ((i10 & (-62)) | ((~i10) & 61)) + ((i10 & 61) << 1);
        f53847g = i11 % 128;
        int i12 = i11 % 2;
    }

    public ats() {
        super(571, 2, 5, 10);
        this.f53849f = new atw(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(0L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(4L);
        this.setDividerPadding = 6;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (~i12) | i13;
        int i17 = (((~(i10 | i14)) | (~(i11 | i16))) * 241) + ((i10 | i11) * (-482)) + (((~i16) | i15) * (-241)) + (i11 * 242) + (i10 * 483);
        if (i17 == 1) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i18 = f53847g;
            int i19 = (i18 & 118) + (i18 | 118);
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            int i21 = i20 % 128;
            f53848h = i21;
            int i22 = i20 % 2;
            if (iIntValue != 6) {
                return Boolean.FALSE;
            }
            int i23 = i21 | 123;
            int i24 = (i23 << 1) - (i23 & (~(i21 & 123)));
            f53847g = i24 % 128;
            int i25 = i24 % 2;
            return Boolean.TRUE;
        }
        if (i17 == 2) {
            att attVar = new att((BigInteger) objArr[1]);
            int i26 = f53847g;
            int i27 = i26 & 35;
            int i28 = ((((i26 ^ 35) | i27) << 1) - (~(-((i26 | 35) & (~i27))))) - 1;
            f53848h = i28 % 128;
            int i29 = i28 % 2;
            return attVar;
        }
        if (i17 == 3) {
            int i30 = f53847g;
            int i31 = ((i30 | 107) << 1) - (i30 ^ 107);
            int i32 = i31 % 128;
            f53848h = i32;
            int i33 = i31 % 2 == 0 ? 30901 : 571;
            int i34 = (i32 | 53) << 1;
            int i35 = -(((~i32) & 53) | (i32 & (-54)));
            int i36 = (i34 & i35) + (i35 | i34);
            f53847g = i36 % 128;
            if (i36 % 2 == 0) {
                return Integer.valueOf(i33);
            }
            throw null;
        }
        if (i17 == 4) {
            ats atsVar = new ats();
            int i37 = f53847g;
            int i38 = (i37 & (-112)) | ((~i37) & 111);
            int i39 = (i37 & 111) << 1;
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            f53848h = i40 % 128;
            int i41 = i40 % 2;
            return atsVar;
        }
        if (i17 == 5) {
            atw atwVar = new atw((ats) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i42 = f53847g + 107;
            f53848h = i42 % 128;
            if (i42 % 2 != 0) {
                return atwVar;
            }
            throw null;
        }
        ats atsVar2 = (ats) objArr[0];
        int i43 = f53848h;
        int i44 = (i43 & 89) + (i43 | 89);
        f53847g = i44 % 128;
        int i45 = i44 % 2;
        atw atwVar2 = atsVar2.f53849f;
        if (i45 == 0) {
            return atwVar2;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, 1234656913, -1234656909, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, 187693149, -187693147, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -314496345, 314496345, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 462039517, -462039514, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -1644858637, 1644858642, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1809249636, -1809249635, i10)).booleanValue();
    }
}
