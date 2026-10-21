package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asm extends aph.setDividerPadding {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53760g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53761h = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final asj f53762f;

    static {
        new ask(apj.setOnFocusChangeListener);
        int i10 = f53761h;
        int i11 = i10 & 25;
        int i12 = (i11 - (~((i10 ^ 25) | i11))) - 1;
        f53760g = i12 % 128;
        int i13 = i12 % 2;
    }

    public asm() {
        super(163, 3, 6, 7);
        this.f53762f = new asj(this, null, null);
        apk onFocusChangeListener = setOnFocusChangeListener(BigInteger.valueOf(1L));
        this.setX = onFocusChangeListener;
        this.setCompoundDrawableTintBlendMode = onFocusChangeListener;
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"04000000000000000000020108A2E0CC0D99F8A5EF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(2L);
        this.setDividerPadding = 6;
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (~i12) | i13;
        int i15 = (((~i14) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i16 = ~i10;
        int i17 = ((~(i13 | i12)) * 113) + (((~(i10 | i14)) | (~(i11 | i16)) | (~(i16 | i12))) * (-113)) + i15;
        if (i17 == 1) {
            ask askVar = new ask((BigInteger) objArr[1]);
            int i18 = f53760g + 91;
            f53761h = i18 % 128;
            int i19 = i18 % 2;
            return askVar;
        }
        if (i17 == 2) {
            asm asmVar = new asm();
            int i20 = f53760g + 45;
            f53761h = i20 % 128;
            if (i20 % 2 != 0) {
                return asmVar;
            }
            throw null;
        }
        if (i17 == 3) {
            asm asmVar2 = (asm) objArr[0];
            int i21 = f53760g;
            int i22 = i21 & 53;
            int i23 = (((~i22) & (i21 | 53)) - (~(i22 << 1))) - 1;
            f53761h = i23 % 128;
            int i24 = i23 % 2;
            asj asjVar = asmVar2.f53762f;
            int i25 = i21 & 95;
            int i26 = i25 + ((i21 ^ 95) | i25);
            f53761h = i26 % 128;
            int i27 = i26 % 2;
            return asjVar;
        }
        if (i17 == 4) {
            int i28 = f53760g;
            int i29 = ((i28 ^ 12) + ((i28 & 12) << 1)) - 1;
            f53761h = i29 % 128;
            int i30 = i29 % 2;
            int i31 = ((i28 ^ 10) + ((i28 & 10) << 1)) - 1;
            f53761h = i31 % 128;
            int i32 = i31 % 2;
            return 163;
        }
        if (i17 == 5) {
            asj asjVar2 = new asj((asm) objArr[0], (apk) objArr[1], (apk) objArr[2]);
            int i33 = f53760g;
            int i34 = (((i33 ^ 25) | (i33 & 25)) << 1) - (((~i33) & 25) | (i33 & (-26)));
            f53761h = i34 % 128;
            int i35 = i34 % 2;
            return asjVar2;
        }
        int iIntValue = ((Number) objArr[1]).intValue();
        int i36 = f53760g;
        int i37 = i36 & 109;
        int i38 = -(-((i36 ^ 109) | i37));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        int i40 = i39 % 128;
        f53761h = i40;
        if (i39 % 2 == 0) {
            throw null;
        }
        if (iIntValue != 6) {
            int i41 = i40 & 97;
            int i42 = ((i40 | 97) & (~i41)) + (i41 << 1);
            f53760g = i42 % 128;
            int i43 = i42 % 2;
            return Boolean.FALSE;
        }
        int i44 = i40 & 35;
        int i45 = -(-((i40 ^ 35) | i44));
        int i46 = (i44 & i45) + (i44 | i45);
        f53760g = i46 % 128;
        if (i46 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -256256592, 256256597, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, bigInteger}, -362388602, 362388603, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1676805932, -1676805929, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1086740957, 1086740957, i10)).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 783823684, -783823680, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setCompoundDrawableTintBlendMode(new Object[]{this}, -1114781645, 1114781647, System.identityHashCode(this));
    }
}
