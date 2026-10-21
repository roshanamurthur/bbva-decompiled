package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asa extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53727g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53728h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ary f53729f;

    static {
        new asc(apj.setOnFocusChangeListener);
        int i10 = f53727g;
        int i11 = i10 & 55;
        int i12 = (((i10 ^ 55) | i11) << 1) - ((i10 | 55) & (~i11));
        f53728h = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 25 / 0;
        }
    }

    public asa() {
        super(113, 9, 0, 0);
        this.f53729f = new ary(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"003088250CA6E7C7FE649CE85820F7"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"00E8BEE4D3E2260744188BE0E9C723"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0100000000000000D9CCEC8A39E56F"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628);
        if (i13 == 1) {
            asc ascVar = new asc((BigInteger) objArr[1]);
            int i14 = f53727g;
            int i15 = (i14 ^ 121) + ((i14 & 121) << 1);
            f53728h = i15 % 128;
            if (i15 % 2 != 0) {
                return ascVar;
            }
            throw null;
        }
        if (i13 == 2) {
            int i16 = f53728h;
            int i17 = ((-1) << 1) - ((((i16 | 124) << 1) - (i16 ^ 124)) ^ (-1));
            int i18 = i17 % 128;
            f53727g = i18;
            int i19 = i17 % 2;
            int i20 = ((i18 | 7) << 1) - (((~i18) & 7) | (i18 & (-8)));
            f53728h = i20 % 128;
            int i21 = i20 % 2;
            return 113;
        }
        if (i13 == 3) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i22 = f53727g;
            int i23 = i22 & 115;
            int i24 = ((i22 ^ 115) | i23) << 1;
            int i25 = -((~i23) & (i22 | 115));
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            f53728h = i26 % 128;
            if (i26 % 2 == 0) {
                throw null;
            }
            if (iIntValue != 6) {
                int i27 = (((i22 & (-58)) | ((~i22) & 57)) - (~(-(-((i22 & 57) << 1))))) - 1;
                f53728h = i27 % 128;
                int i28 = i27 % 2;
                return Boolean.FALSE;
            }
            int i29 = ((i22 & 56) + (i22 | 56)) - 1;
            f53728h = i29 % 128;
            if (i29 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (i13 == 4) {
            ary aryVar = new ary((asa) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i30 = f53727g + 75;
            f53728h = i30 % 128;
            if (i30 % 2 != 0) {
                return aryVar;
            }
            throw null;
        }
        if (i13 == 5) {
            asa asaVar = new asa();
            int i31 = f53728h + 91;
            f53727g = i31 % 128;
            if (i31 % 2 == 0) {
                return asaVar;
            }
            int i32 = 30 / 0;
            return asaVar;
        }
        asa asaVar2 = (asa) objArr[0];
        int i33 = f53727g;
        int i34 = (i33 ^ 17) + ((i33 & 17) << 1);
        int i35 = i34 % 128;
        f53728h = i35;
        int i36 = i34 % 2;
        ary aryVar2 = asaVar2.f53729f;
        if (i36 == 0) {
            throw null;
        }
        int i37 = ((i35 | 105) << 1) - (((~i35) & 105) | (i35 & (-106)));
        f53727g = i37 % 128;
        int i38 = i37 % 2;
        return aryVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, 64185013, -64185008, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -1756273367, 1756273368, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -9941991, 9941991, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 950754641, -950754639, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -1842583544, 1842583548, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1541078456, -1541078453, i10)).booleanValue();
    }
}
