package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqb extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53563g = aqj.setLayoutAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53564h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53565i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aqi f53566f;

    static {
        new aqj(apj.setOnFocusChangeListener);
        int i10 = f53565i;
        int i11 = i10 & 123;
        int i12 = -(-((i10 ^ 123) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f53564h = i13 % 128;
        int i14 = i13 % 2;
    }

    public aqb() {
        super(f53563g);
        this.f53566f = new aqi(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"E87579C11079F43DD824993C2CEE5ED3"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFE0000000075A30D1B9038A115"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object aqjVar;
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        switch (((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13) {
            case 1:
                aqi aqiVar = new aqi((aqb) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i17 = f53564h;
                int i18 = i17 & 3;
                int i19 = (i18 - (~(-(-((i17 ^ 3) | i18))))) - 1;
                f53565i = i19 % 128;
                int i20 = i19 % 2;
                return aqiVar;
            case 2:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
                aqc.setX(new Object[]{secureRandom, iArr}, 762479969, -762479957, (int) System.currentTimeMillis());
                aqjVar = new aqj(iArr);
                int i21 = f53565i;
                int i22 = (i21 & 25) + (25 | i21);
                f53564h = i22 % 128;
                int i23 = i22 % 2;
                break;
            case 3:
                int i24 = f53565i;
                int i25 = i24 & 55;
                int i26 = ((i24 ^ 55) | i25) << 1;
                int i27 = -((i24 | 55) & (~i25));
                int i28 = (i26 & i27) + (i27 | i26);
                f53564h = i28 % 128;
                int i29 = i28 % 2;
                BigInteger bigInteger = f53563g;
                if (i29 != 0) {
                    bigInteger.bitLength();
                    throw null;
                }
                int iBitLength = bigInteger.bitLength();
                int i30 = f53565i;
                int i31 = i30 & 17;
                int i32 = (i30 | 17) & (~i31);
                int i33 = -(-(i31 << 1));
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                f53564h = i34 % 128;
                if (i34 % 2 != 0) {
                    int i35 = 34 / 0;
                }
                aqjVar = Integer.valueOf(iBitLength);
                break;
                break;
            case 4:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i36 = f53564h;
                int i37 = (i36 & (-124)) | ((~i36) & 123);
                int i38 = (i36 & 123) << 1;
                int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                int i40 = i39 % 128;
                f53565i = i40;
                int i41 = i39 % 2;
                if (iIntValue != 2) {
                    int i42 = ((i40 | 109) << 1) - (i40 ^ 109);
                    f53564h = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i43 = 25 / 0;
                    }
                    aqjVar = Boolean.FALSE;
                } else {
                    int i44 = ((i40 ^ 57) - (~(-(-((i40 & 57) << 1))))) - 1;
                    f53564h = i44 % 128;
                    if (i44 % 2 != 0) {
                        throw null;
                    }
                    aqjVar = Boolean.TRUE;
                }
                break;
            case 5:
                aqb aqbVar = new aqb();
                int i45 = f53565i;
                int i46 = ((i45 | 33) << 1) - (((~i45) & 33) | (i45 & (-34)));
                f53564h = i46 % 128;
                if (i46 % 2 == 0) {
                    return aqbVar;
                }
                throw null;
            case 6:
                aqb aqbVar2 = (aqb) objArr[0];
                int i47 = f53564h;
                int i48 = (i47 & (-56)) | ((~i47) & 55);
                int i49 = -(-((i47 & 55) << 1));
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                int i51 = i50 % 128;
                f53565i = i51;
                int i52 = i50 % 2;
                aqjVar = aqbVar2.f53566f;
                int i53 = (i51 ^ 17) + ((i51 & 17) << 1);
                f53564h = i53 % 128;
                int i54 = i53 % 2;
                break;
            default:
                aqj aqjVar2 = new aqj((BigInteger) objArr[1]);
                int i55 = f53564h;
                int i56 = (i55 ^ 97) + ((i55 & 97) << 1);
                f53565i = i56 % 128;
                int i57 = i56 % 2;
                return aqjVar2;
        }
        return aqjVar;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -1916588445, 1916588446, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, -994081206, 994081206, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, secureRandom}, -518004290, 518004292, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 1654509276, -1654509272, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -606345803, 606345806, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 468294010, -468294004, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, -611305995, 611306000, System.identityHashCode(this));
    }
}
