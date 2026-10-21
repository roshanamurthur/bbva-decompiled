package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atn extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53834g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53835h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final atm f53836f;

    static {
        new atq(apj.setOnFocusChangeListener);
        int i10 = f53835h;
        int i11 = i10 & 41;
        int i12 = -(-((i10 ^ 41) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f53834g = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public atn() {
        super(409, 87, 0, 0);
        this.f53836f = new atm(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(0L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(4L);
        this.setDividerPadding = 6;
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        Boolean bool;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445));
        if (i16 == 1) {
            atm atmVar = new atm((atn) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i17 = f53835h;
            int i18 = ((i17 ^ 103) | (i17 & 103)) << 1;
            int i19 = -(((~i17) & 103) | (i17 & (-104)));
            int i20 = (i18 & i19) + (i19 | i18);
            f53834g = i20 % 128;
            int i21 = i20 % 2;
            return atmVar;
        }
        if (i16 == 2) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i22 = f53835h;
            int i23 = ((i22 | 95) << 1) - (i22 ^ 95);
            int i24 = i23 % 128;
            f53834g = i24;
            int i25 = i23 % 2;
            if (iIntValue != 6) {
                int i26 = ((i22 & 54) + (i22 | 54)) - 1;
                f53834g = i26 % 128;
                int i27 = i26 % 2;
                bool = Boolean.FALSE;
            } else {
                int i28 = i24 & 117;
                int i29 = i24 | 117;
                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                f53835h = i30 % 128;
                if (i30 % 2 == 0) {
                    throw null;
                }
                bool = Boolean.TRUE;
            }
            return bool;
        }
        if (i16 == 3) {
            atn atnVar = new atn();
            int i31 = f53834g + 4;
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            f53835h = i32 % 128;
            if (i32 % 2 != 0) {
                return atnVar;
            }
            throw null;
        }
        if (i16 == 4) {
            int i33 = f53835h;
            int i34 = (i33 & (-2)) | ((~i33) & 1);
            int i35 = (i33 & 1) << 1;
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            f53834g = i36 % 128;
            return Integer.valueOf(i36 % 2 != 0 ? 15915 : 409);
        }
        if (i16 == 5) {
            atn atnVar2 = (atn) objArr[0];
            int i37 = f53835h;
            int i38 = i37 ^ 11;
            int i39 = (i37 & 11) << 1;
            int i40 = (i38 & i39) + (i39 | i38);
            f53834g = i40 % 128;
            if (i40 % 2 != 0) {
                atm atmVar2 = atnVar2.f53836f;
                throw null;
            }
            atm atmVar3 = atnVar2.f53836f;
            int i41 = i37 & 57;
            int i42 = (i37 ^ 57) | i41;
            int i43 = (i41 & i42) + (i41 | i42);
            f53834g = i43 % 128;
            if (i43 % 2 == 0) {
                return atmVar3;
            }
            throw null;
        }
        atn atnVar3 = (atn) objArr[0];
        atq atqVar = new atq((BigInteger) objArr[1]);
        int iIdentityHashCode = System.identityHashCode(atnVar3);
        int i44 = ~iIdentityHashCode;
        int i45 = (iIdentityHashCode | i44) & i44;
        int i46 = i45 & (-1291575271);
        int i47 = ((~i45) & 1291575270) | i46 | (i45 & 1291575270);
        int i48 = i47 ^ 2011785130;
        int i49 = i47 & 2011785130;
        int i50 = -(-((~((i49 & i48) | (i48 ^ i49))) * 52));
        int i51 = (2099567456 & i50) + (i50 | 2099567456);
        int i52 = (-2011785131) ^ i44;
        int i53 = (-2011785131) & i44;
        int i54 = (i53 & i52) | (i52 ^ i53);
        int i55 = ~i54;
        int i56 = (i54 | i55) & i55;
        int i57 = (i56 & 855646216) | (i56 ^ 855646216);
        int i58 = ~((i44 & 1291575270) | (i44 ^ 1291575270));
        int i59 = (i51 - (~(-(~(((i58 & i57) | (i57 ^ i58)) * (-52)))))) - 2;
        int i60 = i45 ^ (-1291575271);
        int i61 = ~((i60 & i46) | (i60 ^ i46));
        int i62 = i61 & 135436356;
        int i63 = (i61 | 135436356) & (~i62);
        int i64 = -(~(-(-(((i63 & i62) | (i63 ^ i62)) * 52))));
        int i65 = ((i59 ^ i64) + ((i64 & i59) << 1)) - 1;
        int iIdentityHashCode2 = System.identityHashCode(atnVar3);
        int i66 = ~((-171968523) | iIdentityHashCode2);
        int i67 = (-2138724768) & i66;
        int i68 = -(-((((i66 | (-2138724768)) & (~i67)) | i67) * (-756)));
        int i69 = ((1175237201 & i68) - (~(i68 | 1175237201))) - 1;
        int i70 = ~iIdentityHashCode2;
        int i71 = (-171968523) & i70;
        int i72 = -(-((((i70 | (-171968523)) & (~i71)) | i71) * 756));
        int i73 = i69 & i72;
        if (i65 <= i73 + ((i72 ^ i69) | i73)) {
            return atqVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setY(new Object[]{this}, -535994687, 535994690, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setY(new Object[]{this, apkVar, apkVar2}, -1578233960, 1578233961, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setY(new Object[]{this, bigInteger}, 1278358425, -1278358425, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setY(new Object[]{this, Integer.valueOf(i10)}, -1889533208, 1889533210, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 59549330, -59549326, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setY(new Object[]{this}, -1889278874, 1889278879, System.identityHashCode(this));
    }
}
