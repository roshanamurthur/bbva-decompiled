package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ass extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53775g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53776h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final asu f53777f;

    static {
        new asw(apj.setOnFocusChangeListener);
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public ass() {
        super(Opcodes.INSTANCEOF, 15, 0, 0);
        this.f53777f = new asu(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"01000000000000000000000000C7F34A778F443ACC920EBA49"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Boolean bool;
        int i13 = (i11 * (-864)) + (i10 * 866);
        int i14 = ~i11;
        int i15 = ~i10;
        int i16 = ~i12;
        int i17 = (((~(i10 | i16)) | (~(i14 | i16))) * 865) + ((~(i12 | i10)) * 865) + (((~(i15 | i16)) | i14) * (-865)) + i13;
        if (i17 == 1) {
            ass assVar = new ass();
            int i18 = f53776h + 101;
            f53775g = i18 % 128;
            int i19 = i18 % 2;
            return assVar;
        }
        if (i17 == 2) {
            asw aswVar = new asw((BigInteger) objArr[1]);
            int i20 = f53776h + 110;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f53775g = i21 % 128;
            int i22 = i21 % 2;
            return aswVar;
        }
        if (i17 == 3) {
            ass assVar2 = (ass) objArr[0];
            int i23 = f53776h;
            int i24 = i23 & 95;
            int i25 = (i24 - (~(-(-((i23 ^ 95) | i24))))) - 1;
            f53775g = i25 % 128;
            int i26 = i25 % 2;
            asu asuVar = assVar2.f53777f;
            int i27 = i23 + 7;
            f53775g = i27 % 128;
            int i28 = i27 % 2;
            return asuVar;
        }
        if (i17 != 4) {
            if (i17 != 5) {
                asu asuVar2 = new asu((ass) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i29 = f53776h;
                int i30 = (i29 & 113) + (i29 | 113);
                f53775g = i30 % 128;
                int i31 = i30 % 2;
                return asuVar2;
            }
            int i32 = f53776h;
            int i33 = (i32 & 35) + (i32 | 35);
            int i34 = i33 % 128;
            f53775g = i34;
            int i35 = i33 % 2;
            int i36 = ((i34 | 23) << 1) - (i34 ^ 23);
            f53776h = i36 % 128;
            int i37 = i36 % 2;
            return Integer.valueOf(Opcodes.INSTANCEOF);
        }
        int iIntValue = ((Number) objArr[1]).intValue();
        int i38 = f53775g;
        int i39 = (i38 & 90) + (i38 | 90);
        int i40 = (i39 ^ (-1)) + (i39 << 1);
        int i41 = i40 % 128;
        f53776h = i41;
        int i42 = i40 % 2;
        if (iIntValue != 6) {
            int i43 = (i41 & 19) + (i41 | 19);
            f53775g = i43 % 128;
            if (i43 % 2 != 0) {
                throw null;
            }
            bool = Boolean.FALSE;
        } else {
            int i44 = ((i38 ^ 114) + ((i38 & 114) << 1)) - 1;
            f53776h = i44 % 128;
            if (i44 % 2 == 0) {
                int i45 = 16 / 0;
            }
            bool = Boolean.TRUE;
        }
        return bool;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, -2065581874, 2065581875, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -619444146, 619444148, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, 1589056199, -1589056196, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 2006922435, -2006922430, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -1209173994, 1209173994, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -801202600, 801202604, i10)).booleanValue();
    }
}
