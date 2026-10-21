package com.mypinpad.tsdk.isolation;

import androidx.databinding.f;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqg extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53580g = aqp.setLayoutAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53581h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53582i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aqh f53583f;

    static {
        new aqp(apj.setOnFocusChangeListener);
        int i10 = f53582i;
        int i11 = ((i10 | 101) << 1) - (i10 ^ 101);
        f53581h = i11 % 128;
        int i12 = i11 % 2;
    }

    public aqg() {
        super(f53580g);
        this.f53583f = new aqh(this, null, null);
        this.setX = setOnFocusChangeListener(apj.setY);
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(7L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0100000000000000000001B8FA16DFAB9ACA16B6B3"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object objE;
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        switch (((i13 | i16) * 712) + (((~(i10 | i11 | i12)) | (~(i13 | i15 | i10))) * (-712)) + ((i14 | i16) * (-712)) + (i11 * 713) + (i10 * (-711))) {
            case 1:
                aqg aqgVar = (aqg) objArr[0];
                int i17 = f53581h;
                int i18 = i17 ^ 49;
                int i19 = (i17 & 49) << 1;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                int i21 = i20 % 128;
                f53582i = i21;
                if (i20 % 2 == 0) {
                    aqh aqhVar = aqgVar.f53583f;
                    throw null;
                }
                aqh aqhVar2 = aqgVar.f53583f;
                int i22 = i21 ^ 107;
                int i23 = (i21 & 107) << 1;
                int i24 = (i22 & i23) + (i22 | i23);
                f53581h = i24 % 128;
                int i25 = i24 % 2;
                return aqhVar2;
            case 2:
                aqp aqpVar = new aqp((BigInteger) objArr[1]);
                int i26 = f53581h;
                int i27 = ((i26 ^ 65) - (~(-(-((i26 & 65) << 1))))) - 1;
                f53582i = i27 % 128;
                if (i27 % 2 != 0) {
                    return aqpVar;
                }
                throw null;
            case 3:
                aqg aqgVar2 = new aqg();
                int i28 = f53581h;
                int i29 = i28 & 61;
                int i30 = (((i28 ^ 61) | i29) << 1) - ((i28 | 61) & (~i29));
                f53582i = i30 % 128;
                int i31 = i30 % 2;
                return aqgVar2;
            case 4:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i32 = f53582i;
                int i33 = (-2) - ((i32 + 18) ^ (-1));
                int i34 = i33 % 128;
                f53581h = i34;
                if (i33 % 2 != 0) {
                    throw null;
                }
                if (iIntValue != 2) {
                    int i35 = (-2) - (((i34 & 42) + (i34 | 42)) ^ (-1));
                    f53582i = i35 % 128;
                    if (i35 % 2 == 0) {
                        throw null;
                    }
                    objE = Boolean.FALSE;
                } else {
                    int i36 = i32 + 54;
                    int i37 = (i36 ^ (-1)) + (i36 << 1);
                    f53581h = i37 % 128;
                    if (i37 % 2 != 0) {
                        throw null;
                    }
                    objE = Boolean.TRUE;
                }
                break;
                break;
            case 5:
                int i38 = f53582i;
                int i39 = i38 & 49;
                int i40 = ((i38 | 49) & (~i39)) + (i39 << 1);
                f53581h = i40 % 128;
                int i41 = i40 % 2;
                BigInteger bigInteger = f53580g;
                if (i41 == 0) {
                    return Integer.valueOf(bigInteger.bitLength());
                }
                bigInteger.bitLength();
                throw null;
            case 6:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                objE = f.e(new Object[]{secureRandom, iArr}, 1406394007, -1406393994, (int) System.currentTimeMillis(), iArr);
                int i42 = f53582i;
                int i43 = (((i42 & (-50)) | ((~i42) & 49)) - (~((i42 & 49) << 1))) - 1;
                f53581h = i43 % 128;
                if (i43 % 2 != 0) {
                    int i44 = 35 / 0;
                }
                break;
            default:
                aqh aqhVar3 = new aqh((aqg) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i45 = f53582i + 121;
                f53581h = i45 % 128;
                if (i45 % 2 == 0) {
                    return aqhVar3;
                }
                throw null;
        }
        return objE;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -1522853602, 1522853602, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, 833342809, -833342807, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, secureRandom}, 1439770386, -1439770380, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 965912243, -965912239, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -339122599, 339122604, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -55035606, 55035607, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, 386329957, -386329954, System.identityHashCode(this));
    }
}
