package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asr extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53772g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53773h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aso f53774f;

    static {
        new ask(apj.setOnFocusChangeListener);
        int i10 = f53772g;
        int i11 = ((i10 & 27) - (~(i10 | 27))) - 1;
        f53773h = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 12 / 0;
        }
    }

    public asr() {
        super(163, 3, 6, 7);
        this.f53774f = new aso(this, null, null);
        this.setX = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"020A601907B8C953CA1481EB10512F78744A3205FD"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"040000000000000000000292FE77E70C12A4234C33"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i11;
        int i16 = ((i12 | i14 | (~(i15 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i17 = ~i12;
        int i18 = (((~(i10 | i17 | i11)) | (~(i13 | i15 | i17))) * 614) + (((~(i13 | i17)) | i14 | (~(i17 | i11))) * (-1228)) + i16;
        if (i18 == 1) {
            ask askVar = new ask((BigInteger) objArr[1]);
            int i19 = f53773h;
            int i20 = (((i19 | 49) << 1) - (~(-(((~i19) & 49) | (i19 & (-50)))))) - 1;
            f53772g = i20 % 128;
            if (i20 % 2 == 0) {
                return askVar;
            }
            throw null;
        }
        if (i18 == 2) {
            asr asrVar = (asr) objArr[0];
            int i21 = f53772g;
            int i22 = ((i21 & (-20)) | ((~i21) & 19)) + ((i21 & 19) << 1);
            f53773h = i22 % 128;
            int i23 = i22 % 2;
            aso asoVar = asrVar.f53774f;
            int i24 = (i21 ^ 27) + ((i21 & 27) << 1);
            f53773h = i24 % 128;
            int i25 = i24 % 2;
            return asoVar;
        }
        if (i18 == 3) {
            int i26 = f53772g;
            int i27 = ((i26 | 66) << 1) - (i26 ^ 66);
            int i28 = (i27 ^ (-1)) + (i27 << 1);
            f53773h = i28 % 128;
            return Integer.valueOf(i28 % 2 == 0 ? 20694 : 163);
        }
        if (i18 == 4) {
            asr asrVar2 = new asr();
            int i29 = f53772g;
            int i30 = i29 & 103;
            int i31 = -(-((i29 ^ 103) | i30));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            f53773h = i32 % 128;
            int i33 = i32 % 2;
            return asrVar2;
        }
        if (i18 == 5) {
            aso asoVar2 = new aso((asr) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i34 = f53773h;
            int i35 = i34 & 91;
            int i36 = i35 + ((i34 ^ 91) | i35);
            f53772g = i36 % 128;
            int i37 = i36 % 2;
            return asoVar2;
        }
        int iIntValue = ((Number) objArr[1]).intValue();
        int i38 = f53773h;
        int i39 = i38 ^ 47;
        int i40 = -(-((i38 & 47) << 1));
        int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
        int i42 = i41 % 128;
        f53772g = i42;
        if (i41 % 2 != 0) {
            throw null;
        }
        if (iIntValue != 6) {
            int i43 = (-2) - (((i42 & 42) + (i42 | 42)) ^ (-1));
            f53773h = i43 % 128;
            if (i43 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i44 = (i38 & 109) + (i38 | 109);
        f53772g = i44 % 128;
        if (i44 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, 1363562985, -1363562981, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -356351769, 356351770, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -1273965771, 1273965773, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1731262649, 1731262652, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -252145070, 252145075, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, 1622489705, -1622489705, i10)).booleanValue();
    }
}
