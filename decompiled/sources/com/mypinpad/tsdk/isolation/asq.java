package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asq extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53769g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53770h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final asp f53771f;

    static {
        new ask(apj.setOnFocusChangeListener);
        int i10 = f53769g;
        int i11 = (i10 | 3) << 1;
        int i12 = -(((~i10) & 3) | (i10 & (-4)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53770h = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 91 / 0;
        }
    }

    public asq() {
        super(163, 3, 6, 7);
        this.f53771f = new asp(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"07B6882CAAEFA84F9554FF8428BD88E246D2782AE2"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = (((~((~i10) | i11)) | (~(i11 | i13))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i13 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        if (i14 == 1) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i15 = f53770h;
            int i16 = ((((i15 ^ 53) | (i15 & 53)) << 1) - (~(-(((~i15) & 53) | (i15 & (-54)))))) - 1;
            int i17 = i16 % 128;
            f53769g = i17;
            int i18 = i16 % 2;
            if (iIntValue != 6) {
                int i19 = i17 + 9;
                f53770h = i19 % 128;
                int i20 = i19 % 2;
                return Boolean.FALSE;
            }
            int i21 = (i17 & 9) + (i17 | 9);
            f53770h = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.TRUE;
        }
        if (i14 == 2) {
            asq asqVar = (asq) objArr[0];
            int i23 = f53770h;
            int i24 = i23 + 101;
            f53769g = i24 % 128;
            int i25 = i24 % 2;
            asp aspVar = asqVar.f53771f;
            int i26 = i23 + 115;
            f53769g = i26 % 128;
            if (i26 % 2 == 0) {
                return aspVar;
            }
            throw null;
        }
        if (i14 == 3) {
            ask askVar = new ask((BigInteger) objArr[1]);
            int i27 = f53770h;
            int i28 = (i27 ^ 115) + ((i27 & 115) << 1);
            f53769g = i28 % 128;
            if (i28 % 2 == 0) {
                return askVar;
            }
            throw null;
        }
        if (i14 == 4) {
            asq asqVar2 = new asq();
            int i29 = f53770h;
            int i30 = i29 & 81;
            int i31 = (i29 ^ 81) | i30;
            int i32 = (i30 & i31) + (i31 | i30);
            f53769g = i32 % 128;
            int i33 = i32 % 2;
            return asqVar2;
        }
        if (i14 == 5) {
            asp aspVar2 = new asp((asq) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i34 = f53769g;
            int i35 = (i34 ^ 11) + ((i34 & 11) << 1);
            f53770h = i35 % 128;
            int i36 = i35 % 2;
            return aspVar2;
        }
        asq asqVar3 = (asq) objArr[0];
        System.identityHashCode(asqVar3);
        System.identityHashCode(asqVar3);
        int i37 = f53769g;
        int i38 = (((i37 & (-84)) | ((~i37) & 83)) - (~((i37 & 83) << 1))) - 1;
        f53770h = i38 % 128;
        int i39 = i38 % 2;
        return 163;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -2046032059, 2046032064, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, -1619361815, 1619361818, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -38655798, 38655800, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -282766780, 282766781, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1401992027, -1401992027, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, 322675027, -322675023, System.identityHashCode(this));
    }
}
