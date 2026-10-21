package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class arv extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53713g = arx.getNavBarTitleString;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53714h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53715i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final art f53716f;

    static {
        new arx(apj.setOnFocusChangeListener);
        int i10 = f53714h;
        int i11 = i10 & 61;
        int i12 = ((i10 | 61) & (~i11)) + (i11 << 1);
        f53715i = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public arv() {
        super(f53713g);
        this.f53716f = new art(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        switch ((((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559))) {
            case 1:
                arx arxVar = new arx((BigInteger) objArr[1]);
                int i14 = f53714h;
                int i15 = (i14 ^ 35) + ((i14 & 35) << 1);
                f53715i = i15 % 128;
                if (i15 % 2 != 0) {
                    return arxVar;
                }
                throw null;
            case 2:
                art artVar = new art((arv) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i16 = f53714h;
                int i17 = (((i16 | 74) << 1) - (i16 ^ 74)) - 1;
                f53715i = i17 % 128;
                if (i17 % 2 == 0) {
                    int i18 = 21 / 0;
                }
                return artVar;
            case 3:
                int i19 = f53714h;
                int i20 = i19 & 23;
                int i21 = (i19 | 23) & (~i20);
                int i22 = -(-(i20 << 1));
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                f53715i = i23 % 128;
                int i24 = i23 % 2;
                BigInteger bigInteger = f53713g;
                if (i24 == 0) {
                    bigInteger.bitLength();
                    throw null;
                }
                int iBitLength = bigInteger.bitLength();
                int i25 = f53715i;
                int i26 = ((((i25 ^ 15) | (i25 & 15)) << 1) - (~(-(((~i25) & 15) | (i25 & (-16)))))) - 1;
                f53714h = i26 % 128;
                if (i26 % 2 == 0) {
                    return Integer.valueOf(iBitLength);
                }
                throw null;
            case 4:
                arv arvVar = new arv();
                int i27 = f53714h;
                int i28 = (i27 & (-46)) | ((~i27) & 45);
                int i29 = -(-((i27 & 45) << 1));
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f53715i = i30 % 128;
                int i31 = i30 % 2;
                return arvVar;
            case 5:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i32 = f53715i;
                int i33 = i32 | 79;
                int i34 = i33 << 1;
                int i35 = -((~(i32 & 79)) & i33);
                int i36 = (i34 & i35) + (i35 | i34);
                int i37 = i36 % 128;
                f53714h = i37;
                int i38 = i36 % 2;
                if (iIntValue != 2) {
                    int i39 = (((i37 | 50) << 1) - (i37 ^ 50)) - 1;
                    f53715i = i39 % 128;
                    int i40 = i39 % 2;
                    return Boolean.FALSE;
                }
                int i41 = i37 + 123;
                f53715i = i41 % 128;
                if (i41 % 2 == 0) {
                    int i42 = 5 / 0;
                }
                return Boolean.TRUE;
            case 6:
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) auy.setOnFocusChangeListener(new Object[]{17}, 1950542281, -1950542250, 17);
                aru.setDividerPadding(new Object[]{secureRandom, iArr}, 431866319, -431866318, (int) System.currentTimeMillis());
                arx arxVar2 = new arx(iArr);
                int i43 = f53714h;
                int i44 = ((i43 & 54) + (i43 | 54)) - 1;
                f53715i = i44 % 128;
                int i45 = i44 % 2;
                return arxVar2;
            default:
                arv arvVar2 = (arv) objArr[0];
                int i46 = f53714h;
                int i47 = i46 & 97;
                int i48 = ((i46 | 97) & (~i47)) + (i47 << 1);
                f53715i = i48 % 128;
                int i49 = i48 % 2;
                art artVar2 = arvVar2.f53716f;
                if (i49 != 0) {
                    return artVar2;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setOnFocusChangeListener(new Object[]{this}, 1942852566, -1942852562, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setOnFocusChangeListener(new Object[]{this, apkVar, apkVar2}, -1939721065, 1939721067, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setOnFocusChangeListener(new Object[]{this, secureRandom}, -32916270, 32916276, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, Integer.valueOf(i10)}, -1793562356, 1793562361, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setOnFocusChangeListener(new Object[]{this}, -1907491616, 1907491616, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setOnFocusChangeListener(new Object[]{this, bigInteger}, -476950957, 476950958, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -109823834, 109823837, System.identityHashCode(this))).intValue();
    }
}
