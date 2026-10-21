package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class arc extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53653g = aqz.setOnDragListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53654h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53655i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ara f53656f;

    static {
        new aqz(apj.setOnFocusChangeListener);
        int i10 = f53654h;
        int i11 = i10 & 59;
        int i12 = -(-(i10 | 59));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53655i = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 14 / 0;
        }
    }

    public arc() {
        super(f53653g);
        this.f53656f = new ara(this, null, null);
        this.setX = setOnFocusChangeListener(apj.setY);
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(5L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 825) + (i10 * 1649);
        int i14 = ~i11;
        switch ((((~i10) | i14) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i14) * (-824)) + i13) {
            case 1:
                arc arcVar = (arc) objArr[0];
                int i15 = f53655i;
                int i16 = (((i15 | 28) << 1) - (i15 ^ 28)) - 1;
                f53654h = i16 % 128;
                int i17 = i16 % 2;
                ara araVar = arcVar.f53656f;
                int i18 = i15 & 9;
                int i19 = (i18 - (~((i15 ^ 9) | i18))) - 1;
                f53654h = i19 % 128;
                int i20 = i19 % 2;
                return araVar;
            case 2:
                int i21 = f53655i;
                int i22 = i21 | 103;
                int i23 = i22 << 1;
                int i24 = -((~(i21 & 103)) & i22);
                int i25 = (i23 & i24) + (i24 | i23);
                f53654h = i25 % 128;
                int i26 = i25 % 2;
                int iBitLength = f53653g.bitLength();
                int i27 = f53654h;
                int i28 = i27 & 121;
                int i29 = (i28 - (~(-(-((i27 ^ 121) | i28))))) - 1;
                f53655i = i29 % 128;
                int i30 = i29 % 2;
                return Integer.valueOf(iBitLength);
            case 3:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                arb.setDividerPadding(new Object[]{secureRandom, iArr}, -78534853, 78534865, (int) System.currentTimeMillis());
                aqz aqzVar = new aqz(iArr);
                int i31 = f53655i;
                int i32 = i31 | 65;
                int i33 = ((i32 << 1) - (~(-((~(i31 & 65)) & i32)))) - 1;
                f53654h = i33 % 128;
                if (i33 % 2 == 0) {
                    return aqzVar;
                }
                throw null;
            case 4:
                arc arcVar2 = new arc();
                int i34 = f53655i;
                int i35 = ((-1) << 1) - ((-1) ^ (((i34 | 108) << 1) - (i34 ^ 108)));
                f53654h = i35 % 128;
                int i36 = i35 % 2;
                return arcVar2;
            case 5:
                ara araVar2 = new ara((arc) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i37 = f53654h + 5;
                f53655i = i37 % 128;
                int i38 = i37 % 2;
                return araVar2;
            case 6:
                aqz aqzVar2 = new aqz((BigInteger) objArr[1]);
                int i39 = f53654h;
                int i40 = i39 & 85;
                int i41 = (i40 - (~((i39 ^ 85) | i40))) - 1;
                f53655i = i41 % 128;
                int i42 = i41 % 2;
                return aqzVar2;
            default:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i43 = f53654h;
                int i44 = i43 + 105;
                int i45 = i44 % 128;
                f53655i = i45;
                int i46 = i44 % 2;
                if (iIntValue != 2) {
                    int i47 = ((i43 | 89) << 1) - (((~i43) & 89) | (i43 & (-90)));
                    f53655i = i47 % 128;
                    int i48 = i47 % 2;
                    return Boolean.FALSE;
                }
                int i49 = ((i45 & (-58)) | ((~i45) & 57)) + ((i45 & 57) << 1);
                f53654h = i49 % 128;
                int i50 = i49 % 2;
                return Boolean.TRUE;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -1056485451, 1056485456, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, 583140676, -583140670, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, secureRandom}, -2122870177, 2122870180, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -18118617, 18118617, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -556981452, 556981454, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1854445641, -1854445640, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, 514290906, -514290902, System.identityHashCode(this));
    }
}
