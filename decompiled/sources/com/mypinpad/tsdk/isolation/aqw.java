package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqw extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53627g = aqv.getNavBarTitleString;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53628h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53629i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aqu f53630f;

    static {
        new aqv(apj.setOnFocusChangeListener);
        int i10 = f53628h;
        int i11 = i10 & 51;
        int i12 = (i10 ^ 51) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f53629i = i13 % 128;
        int i14 = i13 % 2;
    }

    public aqw() {
        super(f53627g);
        this.f53630f = new aqu(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        switch ((((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i13 | i11 | i12)) * (-604)) + (((~((~i12) | i13 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303)) {
            case 1:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i14 = f53629i;
                int i15 = i14 & 13;
                int i16 = -(-(i14 | 13));
                int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                int i18 = i17 % 128;
                f53628h = i18;
                int i19 = i17 % 2;
                if (iIntValue == 2) {
                    int i20 = i18 + 35;
                    f53629i = i20 % 128;
                    int i21 = i20 % 2;
                    return Boolean.TRUE;
                }
                int i22 = (i14 ^ 39) + ((i14 & 39) << 1);
                f53628h = i22 % 128;
                if (i22 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 2:
                aqw aqwVar = new aqw();
                int i23 = f53629i;
                int i24 = (i23 & 95) + (i23 | 95);
                f53628h = i24 % 128;
                if (i24 % 2 == 0) {
                    return aqwVar;
                }
                throw null;
            case 3:
                aqu aquVar = new aqu((aqw) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i25 = f53629i;
                int i26 = i25 & 9;
                int i27 = (i25 | 9) & (~i26);
                int i28 = i26 << 1;
                int i29 = (i27 & i28) + (i27 | i28);
                f53628h = i29 % 128;
                int i30 = i29 % 2;
                return aquVar;
            case 4:
                int i31 = f53629i;
                int i32 = (i31 ^ 45) + ((i31 & 45) << 1);
                f53628h = i32 % 128;
                int i33 = i32 % 2;
                int iBitLength = f53627g.bitLength();
                if (i33 != 0) {
                    int i34 = 26 / 0;
                }
                return Integer.valueOf(iBitLength);
            case 5:
                aqw aqwVar2 = (aqw) objArr[0];
                int i35 = f53628h;
                int i36 = i35 ^ 67;
                int i37 = ((i35 & 67) | i36) << 1;
                int i38 = -i36;
                int i39 = (i37 & i38) + (i37 | i38);
                int i40 = i39 % 128;
                f53629i = i40;
                int i41 = i39 % 2;
                aqu aquVar2 = aqwVar2.f53630f;
                if (i41 == 0) {
                    int i42 = 14 / 0;
                }
                int i43 = ((i40 ^ 78) + ((i40 & 78) << 1)) - 1;
                f53628h = i43 % 128;
                if (i43 % 2 == 0) {
                    return aquVar2;
                }
                throw null;
            case 6:
                aqv aqvVar = new aqv((BigInteger) objArr[1]);
                int i44 = f53629i;
                int i45 = i44 & 51;
                int i46 = i45 + ((i44 ^ 51) | i45);
                f53628h = i46 % 128;
                if (i46 % 2 != 0) {
                    int i47 = 1 / 0;
                }
                return aqvVar;
            default:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqy.setDividerPadding(new Object[]{secureRandom, iArr}, 699509921, -699509914, (int) System.currentTimeMillis());
                aqv aqvVar2 = new aqv(iArr);
                int i48 = f53628h + 113;
                f53629i = i48 % 128;
                if (i48 % 2 != 0) {
                    return aqvVar2;
                }
                int i49 = 25 / 0;
                return aqvVar2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, 451710378, -451710376, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setOnFocusChangeListener(new Object[]{this, apkVar, apkVar2}, -112723983, 112723986, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setOnFocusChangeListener(new Object[]{this, secureRandom}, 97049847, -97049847, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, 356133189, -356133188, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, 1831252264, -1831252259, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setOnFocusChangeListener(new Object[]{this, bigInteger}, -955935923, 955935929, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 440126920, -440126916, System.identityHashCode(this))).intValue();
    }
}
