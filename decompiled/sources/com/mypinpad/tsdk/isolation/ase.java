package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ase extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53739g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53740h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final asg f53741f;

    static {
        new asf(apj.setOnFocusChangeListener);
        int i10 = f53740h;
        int i11 = ((i10 | 73) << 1) - (((~i10) & 73) | (i10 & (-74)));
        f53739g = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public ase() {
        super(131, 2, 3, 8);
        this.f53741f = new asg(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"07A11B09A76B562144418FF3FF8C2570B8"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0217C05610884B63B9C6C7291678F9D341"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0400000000000000023123953A9464B54D"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (~i12) | i13;
        int i17 = (((~(i10 | i14)) | (~(i11 | i16))) * 241) + ((i10 | i11) * (-482)) + (((~i16) | i15) * (-241)) + (i11 * 242) + (i10 * 483);
        if (i17 == 1) {
            int i18 = f53740h;
            int i19 = i18 & 31;
            int i20 = ((i18 | 31) & (~i19)) + (i19 << 1);
            int i21 = i20 % 128;
            f53739g = i21;
            int i22 = i20 % 2 != 0 ? 2333 : 131;
            int i23 = i21 & 3;
            int i24 = -(-(i21 | 3));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f53740h = i25 % 128;
            int i26 = i25 % 2;
            return Integer.valueOf(i22);
        }
        if (i17 == 2) {
            ase aseVar = new ase();
            int i27 = f53739g;
            int i28 = i27 | 91;
            int i29 = i28 << 1;
            int i30 = -((~(i27 & 91)) & i28);
            int i31 = (i29 & i30) + (i30 | i29);
            f53740h = i31 % 128;
            int i32 = i31 % 2;
            return aseVar;
        }
        if (i17 == 3) {
            asf asfVar = new asf((BigInteger) objArr[1]);
            int i33 = f53739g + 13;
            f53740h = i33 % 128;
            int i34 = i33 % 2;
            return asfVar;
        }
        if (i17 == 4) {
            ase aseVar2 = (ase) objArr[0];
            int i35 = f53740h;
            int i36 = i35 | 35;
            int i37 = (i36 << 1) - (i36 & (~(i35 & 35)));
            f53739g = i37 % 128;
            int i38 = i37 % 2;
            asg asgVar = aseVar2.f53741f;
            int i39 = (i35 & (-108)) | ((~i35) & 107);
            int i40 = -(-((i35 & 107) << 1));
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            f53739g = i41 % 128;
            if (i41 % 2 == 0) {
                return asgVar;
            }
            int i42 = 64 / 0;
            return asgVar;
        }
        if (i17 == 5) {
            asg asgVar2 = new asg((ase) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i43 = f53740h;
            int i44 = i43 & 17;
            int i45 = -(-((i43 ^ 17) | i44));
            int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
            f53739g = i46 % 128;
            int i47 = i46 % 2;
            return asgVar2;
        }
        int iIntValue = ((Number) objArr[1]).intValue();
        int i48 = f53740h + 83;
        int i49 = i48 % 128;
        f53739g = i49;
        if (i48 % 2 != 0) {
            throw null;
        }
        if (iIntValue == 6) {
            int i50 = (i49 ^ 67) + ((i49 & 67) << 1);
            f53740h = i50 % 128;
            int i51 = i50 % 2;
            return Boolean.TRUE;
        }
        int i52 = i49 ^ 85;
        int i53 = ((i49 & 85) | i52) << 1;
        int i54 = -i52;
        int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
        f53740h = i55 % 128;
        int i56 = i55 % 2;
        return Boolean.FALSE;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -771779348, 771779353, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, -539345797, 539345800, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 623350720, -623350716, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1046253608, 1046253608, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -2104947617, 2104947618, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, -1485033098, 1485033100, System.identityHashCode(this));
    }
}
