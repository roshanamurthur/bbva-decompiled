package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class aqf extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53576g = aqn.setNavigationOnClickListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53577h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53578i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aqo f53579f;

    static {
        new aqn(apj.setOnFocusChangeListener);
        int i10 = f53577h;
        int i11 = (i10 & (-24)) | ((~i10) & 23);
        int i12 = (i10 & 23) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53578i = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public aqf() {
        super(f53576g);
        this.f53579f = new aqo(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0100000000000000000001F4C8F927AED3CA752257"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-195)) + (i10 * (-391));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~(i12 | i11);
        switch ((((~((~i10) | i14)) | i16) * 196) + ((i11 | i10) * 392) + ((i15 | i16) * (-196)) + i13) {
            case 1:
                aqo aqoVar = new aqo((aqf) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i17 = f53578i;
                int i18 = ((((i17 ^ 111) | (i17 & 111)) << 1) - (~(-(((~i17) & 111) | (i17 & (-112)))))) - 1;
                f53577h = i18 % 128;
                int i19 = i18 % 2;
                return aqoVar;
            case 2:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i20 = f53577h;
                int i21 = i20 & 115;
                int i22 = (i20 ^ 115) | i21;
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                f53578i = i23 % 128;
                int i24 = i23 % 2;
                if (iIntValue == 2) {
                    return Boolean.TRUE;
                }
                int i25 = i20 + 45;
                f53578i = i25 % 128;
                int i26 = i25 % 2;
                return Boolean.FALSE;
            case 3:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aqm.setDividerPadding(new Object[]{secureRandom, iArr}, 1147428156, -1147428154, (int) System.currentTimeMillis());
                aqn aqnVar = new aqn(iArr);
                int i27 = f53578i;
                int i28 = (i27 ^ 117) + ((i27 & 117) << 1);
                f53577h = i28 % 128;
                int i29 = i28 % 2;
                return aqnVar;
            case 4:
                aqf aqfVar = (aqf) objArr[0];
                int i30 = f53578i;
                int i31 = ((i30 ^ 62) + ((i30 & 62) << 1)) - 1;
                int i32 = i31 % 128;
                f53577h = i32;
                int i33 = i31 % 2;
                aqo aqoVar2 = aqfVar.f53579f;
                int i34 = (i32 & (-82)) | ((~i32) & 81);
                int i35 = (i32 & 81) << 1;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f53578i = i36 % 128;
                int i37 = i36 % 2;
                return aqoVar2;
            case 5:
                int i38 = f53578i;
                int i39 = ((i38 ^ 101) | (i38 & 101)) << 1;
                int i40 = -(((~i38) & 101) | (i38 & (-102)));
                int i41 = (i39 & i40) + (i40 | i39);
                f53577h = i41 % 128;
                int i42 = i41 % 2;
                int iBitLength = f53576g.bitLength();
                int i43 = f53578i;
                int i44 = (((i43 | 49) << 1) - (~(-(((~i43) & 49) | (i43 & (-50)))))) - 1;
                f53577h = i44 % 128;
                if (i44 % 2 == 0) {
                    return Integer.valueOf(iBitLength);
                }
                throw null;
            case 6:
                aqn aqnVar2 = new aqn((BigInteger) objArr[1]);
                int i45 = f53578i;
                int i46 = ((i45 ^ 29) | (i45 & 29)) << 1;
                int i47 = -(((~i45) & 29) | (i45 & (-30)));
                int i48 = (i46 & i47) + (i47 | i46);
                f53577h = i48 % 128;
                int i49 = i48 % 2;
                return aqnVar2;
            default:
                aqf aqfVar2 = new aqf();
                int i50 = f53577h;
                int i51 = (((i50 | 36) << 1) - (i50 ^ 36)) - 1;
                f53578i = i51 % 128;
                int i52 = i51 % 2;
                return aqfVar2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, -490964890, 490964890, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, 1215293061, -1215293055, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setDividerPadding(new Object[]{this, secureRandom}, -1405105076, 1405105079, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -415983212, 415983217, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, 1086553008, -1086553004, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, 1466296983, -1466296982, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1176792028, -1176792026, i10)).booleanValue();
    }
}
