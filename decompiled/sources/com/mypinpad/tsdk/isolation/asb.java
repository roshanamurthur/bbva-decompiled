package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asb extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53730g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53731h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final arz f53732f;

    static {
        new asc(apj.setOnFocusChangeListener);
        int i10 = f53730g + 33;
        f53731h = i10 % 128;
        int i11 = i10 % 2;
    }

    public asb() {
        super(113, 9, 0, 0);
        this.f53732f = new arz(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"00689918DBEC7E5A0DD6DFC0AA55C7"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0095E9A9EC9B297BD4BF36E059184F"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"010000000000000108789B2496AF93"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object asbVar;
        int i13 = ~i10;
        int i14 = (~((~i11) | i13)) | i12;
        int i15 = ~(i10 | i11);
        int i16 = ((i11 | (~(i12 | i13))) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + ((i14 | i15) * 376) + (i11 * (-375)) + (i10 * (-375));
        if (i16 == 1) {
            asb asbVar2 = (asb) objArr[0];
            int i17 = f53730g;
            int i18 = i17 & 91;
            int i19 = (i17 ^ 91) | i18;
            int i20 = (i18 & i19) + (i18 | i19);
            f53731h = i20 % 128;
            if (i20 % 2 == 0) {
                arz arzVar = asbVar2.f53732f;
                throw null;
            }
            arz arzVar2 = asbVar2.f53732f;
            int i21 = ((i17 & 78) + (i17 | 78)) - 1;
            f53731h = i21 % 128;
            if (i21 % 2 != 0) {
                return arzVar2;
            }
            throw null;
        }
        if (i16 == 2) {
            int i22 = f53731h + 93;
            f53730g = i22 % 128;
            return Integer.valueOf(i22 % 2 != 0 ? 91 : 113);
        }
        if (i16 == 3) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i23 = f53730g;
            int i24 = i23 & 69;
            int i25 = (i23 ^ 69) | i24;
            int i26 = (i24 & i25) + (i24 | i25);
            int i27 = i26 % 128;
            f53731h = i27;
            if (i26 % 2 == 0) {
                throw null;
            }
            if (iIntValue != 6) {
                int i28 = (i27 & 105) + (i27 | 105);
                f53730g = i28 % 128;
                int i29 = i28 % 2;
                asbVar = Boolean.FALSE;
            } else {
                int i30 = (((i23 ^ 83) | (i23 & 83)) << 1) - ((i23 & (-84)) | ((~i23) & 83));
                f53731h = i30 % 128;
                int i31 = i30 % 2;
                asbVar = Boolean.TRUE;
            }
        } else {
            if (i16 == 4) {
                asc ascVar = new asc((BigInteger) objArr[1]);
                int i32 = f53731h;
                int i33 = (i32 ^ 27) + ((i32 & 27) << 1);
                f53730g = i33 % 128;
                if (i33 % 2 == 0) {
                    return ascVar;
                }
                throw null;
            }
            if (i16 != 5) {
                arz arzVar3 = new arz((asb) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i34 = f53731h;
                int i35 = (((i34 & (-120)) | ((~i34) & 119)) - (~(-(-((i34 & 119) << 1))))) - 1;
                f53730g = i35 % 128;
                int i36 = i35 % 2;
                return arzVar3;
            }
            asbVar = new asb();
            int i37 = f53731h;
            int i38 = (((i37 ^ 77) | (i37 & 77)) << 1) - (((~i37) & 77) | (i37 & (-78)));
            f53730g = i38 % 128;
            if (i38 % 2 != 0) {
                int i39 = 81 / 0;
            }
        }
        return asbVar;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setY(new Object[]{this}, -1339187604, 1339187609, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setY(new Object[]{this, apkVar, apkVar2}, 1044581322, -1044581322, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setY(new Object[]{this, bigInteger}, 338715738, -338715734, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setY(new Object[]{this, Integer.valueOf(i10)}, -912867541, 912867544, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, -116392950, 116392952, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setY(new Object[]{this}, 1610092163, -1610092162, System.identityHashCode(this));
    }
}
