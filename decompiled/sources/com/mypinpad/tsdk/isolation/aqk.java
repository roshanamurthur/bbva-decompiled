package com.mypinpad.tsdk.isolation;

import androidx.databinding.f;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqk extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53590g = aqp.setLayoutAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53591h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53592i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aqt f53593f;

    static {
        new aqp(apj.setOnFocusChangeListener);
        int i10 = f53592i;
        int i11 = i10 ^ 5;
        int i12 = ((((i10 & 5) | i11) << 1) - (~(-i11))) - 1;
        f53591h = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 94 / 0;
        }
    }

    public aqk() {
        super(f53590g);
        this.f53593f = new aqt(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"B4E134D3FB59EB8BAB57274904664D5AF50388BA"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0100000000000000000000351EE786A818F3A1A16B"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        switch (((i10 | i11) * 624) + ((i13 | i11) * 624) + (i13 * (-624)) + (i11 * (-623)) + (i10 * (-623))) {
            case 1:
                aqk aqkVar = new aqk();
                int i14 = f53591h + 93;
                f53592i = i14 % 128;
                if (i14 % 2 != 0) {
                    return aqkVar;
                }
                throw null;
            case 2:
                aqt aqtVar = new aqt((aqk) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i15 = f53592i;
                int i16 = (i15 ^ 17) + ((i15 & 17) << 1);
                f53591h = i16 % 128;
                if (i16 % 2 == 0) {
                    return aqtVar;
                }
                throw null;
            case 3:
                int i17 = f53591h;
                int i18 = ((i17 ^ 25) | (i17 & 25)) << 1;
                int i19 = -(((~i17) & 25) | (i17 & (-26)));
                int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
                f53592i = i20 % 128;
                int i21 = i20 % 2;
                int iBitLength = f53590g.bitLength();
                int i22 = ((-1) << 1) - ((f53591h + 36) ^ (-1));
                f53592i = i22 % 128;
                int i23 = i22 % 2;
                return Integer.valueOf(iBitLength);
            case 4:
                aqk aqkVar2 = (aqk) objArr[0];
                int i24 = f53592i;
                int i25 = (i24 & 108) + (i24 | 108);
                int i26 = (i25 ^ (-1)) + (i25 << 1);
                f53591h = i26 % 128;
                int i27 = i26 % 2;
                aqt aqtVar2 = aqkVar2.f53593f;
                if (i27 == 0) {
                    return aqtVar2;
                }
                throw null;
            case 5:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqp aqpVarE = f.e(new Object[]{secureRandom, iArr}, 1406394007, -1406393994, (int) System.currentTimeMillis(), iArr);
                int i28 = f53592i;
                int i29 = i28 & 117;
                int i30 = -(-(i28 | 117));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f53591h = i31 % 128;
                if (i31 % 2 == 0) {
                    return aqpVarE;
                }
                throw null;
            case 6:
                aqp aqpVar = new aqp((BigInteger) objArr[1]);
                int i32 = f53592i;
                int i33 = i32 & 67;
                int i34 = -(-((i32 ^ 67) | i33));
                int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
                f53591h = i35 % 128;
                if (i35 % 2 == 0) {
                    return aqpVar;
                }
                throw null;
            default:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i36 = f53591h;
                int i37 = i36 & 35;
                int i38 = (i37 - (~(-(-((i36 ^ 35) | i37))))) - 1;
                int i39 = i38 % 128;
                f53592i = i39;
                int i40 = i38 % 2;
                if (iIntValue == 2) {
                    int i41 = i39 & 107;
                    int i42 = -(-((i39 ^ 107) | i41));
                    int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                    f53591h = i43 % 128;
                    int i44 = i43 % 2;
                    return Boolean.TRUE;
                }
                int i45 = i36 ^ 97;
                int i46 = ((i36 & 97) | i45) << 1;
                int i47 = -i45;
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                f53592i = i48 % 128;
                int i49 = i48 % 2;
                return Boolean.FALSE;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, -840321387, 840321388, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setOnFocusChangeListener(new Object[]{this, apkVar, apkVar2}, -1053301821, 1053301823, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setOnFocusChangeListener(new Object[]{this, secureRandom}, -696206658, 696206663, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -422226640, 422226640, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, -833787512, 833787516, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setOnFocusChangeListener(new Object[]{this, bigInteger}, 494806382, -494806376, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1794723029, 1794723032, System.identityHashCode(this))).intValue();
    }
}
