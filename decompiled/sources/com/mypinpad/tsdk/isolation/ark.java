package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public final class ark extends aph.setOnFocusChangeListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f53681g = arl.setLayoutAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53682h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53683i = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final arq f53684f;

    static {
        new arl(apj.setOnFocusChangeListener);
        int i10 = f53682h;
        int i11 = ((-1) << 1) - ((-1) ^ (((i10 | 102) << 1) - (i10 ^ 102)));
        f53683i = i11 % 128;
        int i12 = i11 % 2;
    }

    public ark() {
        super(f53681g);
        this.f53684f = new arq(this, null, null);
        this.setX = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setCompoundDrawableTintBlendMode = setOnFocusChangeListener(new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B"}, -666540625, 666540626, (int) System.currentTimeMillis())));
        this.setY = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"}, -666540625, 666540626, (int) System.currentTimeMillis()));
        this.setOnFocusChangeListener = BigInteger.valueOf(1L);
        this.setDividerPadding = 2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0066  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Boolean bool;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~(i14 | i15);
        switch ((i16 * 446) + (((~(i10 | i15 | i12)) | (~(i11 | i14))) * 446) + (((~((~i12) | i15)) | i16) * 446) + (i11 * (-445)) + (i10 * (-445))) {
            case 1:
                arl arlVar = new arl((BigInteger) objArr[1]);
                int i17 = f53682h;
                int i18 = (i17 ^ 43) + ((i17 & 43) << 1);
                f53683i = i18 % 128;
                int i19 = i18 % 2;
                return arlVar;
            case 2:
                int i20 = f53682h;
                int i21 = ((i20 & (-38)) | ((~i20) & 37)) + ((i20 & 37) << 1);
                f53683i = i21 % 128;
                int i22 = i21 % 2;
                int iBitLength = f53681g.bitLength();
                if (i22 == 0) {
                    int i23 = 42 / 0;
                }
                return Integer.valueOf(iBitLength);
            case 3:
                ark arkVar = (ark) objArr[0];
                int i24 = f53683i;
                int i25 = (((i24 | 30) << 1) - (i24 ^ 30)) - 1;
                int i26 = i25 % 128;
                f53682h = i26;
                int i27 = i25 % 2;
                arq arqVar = arkVar.f53684f;
                int i28 = i26 & 77;
                int i29 = ((i26 | 77) & (~i28)) + (i28 << 1);
                f53683i = i29 % 128;
                if (i29 % 2 != 0) {
                    return arqVar;
                }
                throw null;
            case 4:
                ark arkVar2 = new ark();
                int i30 = f53682h;
                int i31 = i30 & 35;
                int i32 = ((i30 ^ 35) | i31) << 1;
                int i33 = -((i30 | 35) & (~i31));
                int i34 = (i32 & i33) + (i33 | i32);
                f53683i = i34 % 128;
                if (i34 % 2 != 0) {
                    return arkVar2;
                }
                int i35 = 18 / 0;
                return arkVar2;
            case 5:
                ark arkVar3 = (ark) objArr[0];
                SecureRandom secureRandom = (SecureRandom) objArr[1];
                int[] iArr = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arm.setX(new Object[]{secureRandom, iArr}, -413207273, 413207284, (int) System.currentTimeMillis());
                arl arlVar2 = new arl(iArr);
                System.identityHashCode(arkVar3);
                System.identityHashCode(arkVar3);
                return arlVar2;
            case 6:
                int iIntValue = ((Number) objArr[1]).intValue();
                int i36 = f53683i;
                int i37 = i36 + 11;
                int i38 = i37 % 128;
                f53682h = i38;
                if (i37 % 2 != 0) {
                    int i39 = 80 / 0;
                    if (iIntValue != 2) {
                        i13 = ((i38 | 113) << 1) - ((i38 & (-114)) | ((~i38) & 113));
                        f53683i = i13 % 128;
                        if (i13 % 2 != 0) {
                            throw null;
                        }
                        bool = Boolean.FALSE;
                    } else {
                        int i40 = i36 + 3;
                        f53682h = i40 % 128;
                        int i41 = i40 % 2;
                        bool = Boolean.TRUE;
                    }
                } else if (iIntValue != 2) {
                    i13 = ((i38 | 113) << 1) - ((i38 & (-114)) | ((~i38) & 113));
                    f53683i = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    bool = Boolean.FALSE;
                } else {
                    int i42 = i36 + 3;
                    f53682h = i42 % 128;
                    int i43 = i42 % 2;
                    bool = Boolean.TRUE;
                }
                return bool;
            default:
                arq arqVar2 = new arq((ark) objArr[0], (apk) objArr[1], (apk) objArr[2]);
                int i44 = f53682h + 54;
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                f53683i = i45 % 128;
                if (i45 % 2 != 0) {
                    return arqVar2;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final aph setCompoundDrawableTintBlendMode() {
        return (aph) setDividerPadding(new Object[]{this}, 1100236209, -1100236205, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apk setOnFocusChangeListener(BigInteger bigInteger) {
        return (apk) setDividerPadding(new Object[]{this, bigInteger}, -238399443, 238399444, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.aph.setOnFocusChangeListener, com.mypinpad.tsdk.isolation.aph
    public final apk setY(SecureRandom secureRandom) {
        return (apk) setDividerPadding(new Object[]{this, secureRandom}, -1457283876, 1457283881, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -319409209, 319409211, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setY() {
        return (apl) setDividerPadding(new Object[]{this}, -1591069751, 1591069754, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final apl setDividerPadding(apk apkVar, apk apkVar2) {
        return (apl) setDividerPadding(new Object[]{this, apkVar, apkVar2}, -2052236491, 2052236491, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aph
    public final boolean setDividerPadding(int i10) {
        return ((Boolean) setDividerPadding(new Object[]{this, Integer.valueOf(i10)}, -1278758579, 1278758585, i10)).booleanValue();
    }
}
