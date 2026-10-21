package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aig extends adw {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52773x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52774y0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f52775r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aih f52776s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public adp f52777t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ads f52778u0;
    public adp v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ads f52779w0;

    /* JADX WARN: Code duplicated, block: B:35:0x0193  */
    /* JADX WARN: Code duplicated, block: B:37:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0244  */
    /* JADX WARN: Code duplicated, block: B:53:0x030f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0313  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        aed compoundDrawableTintBlendMode;
        int i14;
        int i15;
        aeh aehVar;
        byte[] bArr;
        int i16 = ~i12;
        int i17 = ((i10 | i11 | i16) * (-369)) + (i11 * 370) + (i10 * 370);
        int i18 = (~i10) | i16;
        aig aigVar = null;
        switch ((((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i18))) * 369) + (((~i18) | i11) * (-369)) + i17) {
            case 1:
                aig aigVar2 = (aig) objArr[0];
                adh adhVar = new adh(6);
                if (aigVar2.f52775r0.compareTo(BigInteger.valueOf(0L)) != 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(true, 0, new adp(aigVar2.f52775r0))}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i19 = f52773x0;
                    int i20 = ((i19 | 111) << 1) - (i19 ^ 111);
                    f52774y0 = i20 % 128;
                    int i21 = i20 % 2;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aigVar2.f52776s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aigVar2.f52777t0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aigVar2.f52778u0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aigVar2.v0}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, aigVar2.f52779w0}, 240298319, -240298315, adhVar);
                int i22 = f52773x0;
                int i23 = (((i22 | 104) << 1) - (i22 ^ 104)) - 1;
                f52774y0 = i23 % 128;
                if (i23 % 2 != 0) {
                    return afvVarA;
                }
                throw null;
            case 2:
                aig aigVar3 = (aig) objArr[0];
                int i24 = f52773x0;
                int i25 = ((i24 & 116) + (i24 | 116)) - 1;
                f52774y0 = i25 % 128;
                int i26 = i25 % 2;
                adp adpVar = aigVar3.v0;
                Object[] objArr2 = new Object[1];
                if (i26 != 0) {
                    objArr2[0] = adpVar;
                    return (BigInteger) adp.setOnFocusChangeListener(objArr2, 1599682974, -1599682960, System.identityHashCode(adpVar));
                }
                objArr2[0] = adpVar;
                throw null;
            case 3:
                Object obj = objArr[0];
                int i27 = f52773x0;
                int i28 = i27 & 3;
                int i29 = i28 + ((i27 ^ 3) | i28);
                int i30 = i29 % 128;
                f52774y0 = i30;
                if (i29 % 2 == 0) {
                    int i31 = 82 / 0;
                    if (obj instanceof aig) {
                        i13 = ((i27 | 109) << 1) - (((~i27) & 109) | (i27 & (-110)));
                        f52774y0 = i13 % 128;
                        if (i13 % 2 != 0) {
                            throw null;
                        }
                        aigVar = (aig) obj;
                    } else if (obj != null) {
                        compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                        aigVar = new aig();
                        aigVar.f52775r0 = BigInteger.valueOf(0L);
                        if (compoundDrawableTintBlendMode.setX(0) instanceof aeh) {
                            aehVar = (aeh) compoundDrawableTintBlendMode.setX(0);
                            if (((Boolean) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue() || ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue() != 0) {
                                throw new IllegalArgumentException("object parse error");
                            }
                            adp adpVar2 = (adp) adp.setOnFocusChangeListener(new Object[]{(ady) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 923737994, -923737990, System.identityHashCode(aehVar))}, -837021952, 837021958, (int) System.currentTimeMillis());
                            aigVar.f52775r0 = (BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar2}, 1599682974, -1599682960, System.identityHashCode(adpVar2));
                            i14 = 1;
                        } else {
                            i14 = 0;
                        }
                        aigVar.f52776s0 = (aih) aih.setY(new Object[]{compoundDrawableTintBlendMode.setX(i14)}, 917412038, -917412034, (int) System.currentTimeMillis());
                        int i32 = (i14 ^ 1) + ((i14 & 1) << 1);
                        aigVar.f52777t0 = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(i32)}, -837021952, 837021958, (int) System.currentTimeMillis());
                        int i33 = i32 & (-113);
                        int i34 = -(-((i32 ^ (-113)) | i33));
                        int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                        int i36 = ((i35 | 115) << 1) - (i35 ^ 115);
                        int i37 = (i36 ^ (-1)) + (i36 << 1);
                        aigVar.f52778u0 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(i37)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                        int i38 = (i37 | (-33)) << 1;
                        int i39 = -(((~i37) & (-33)) | (i37 & 32));
                        int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
                        int i41 = i40 ^ 34;
                        int i42 = (i40 & 34) << 1;
                        int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                        aigVar.v0 = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(i43)}, -837021952, 837021958, (int) System.currentTimeMillis());
                        int i44 = (i43 ^ (-30)) + ((i43 & (-30)) << 1);
                        aigVar.f52779w0 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(((i44 | 31) << 1) - (i44 ^ 31))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                        int i45 = f52773x0;
                        int i46 = i45 & 71;
                        int i47 = (i45 | 71) & (~i46);
                        int i48 = -(-(i46 << 1));
                        i15 = (i47 & i48) + (i47 | i48);
                        f52774y0 = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i49 = 87 / 0;
                        }
                    } else {
                        int i50 = i30 + 63;
                        f52773x0 = i50 % 128;
                        int i51 = i50 % 2;
                    }
                } else if (obj instanceof aig) {
                    i13 = ((i27 | 109) << 1) - (((~i27) & 109) | (i27 & (-110)));
                    f52774y0 = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    aigVar = (aig) obj;
                } else if (obj != null) {
                    compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                    aigVar = new aig();
                    aigVar.f52775r0 = BigInteger.valueOf(0L);
                    if (compoundDrawableTintBlendMode.setX(0) instanceof aeh) {
                        aehVar = (aeh) compoundDrawableTintBlendMode.setX(0);
                        if (((Boolean) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue()) {
                        }
                        throw new IllegalArgumentException("object parse error");
                    }
                    i14 = 0;
                    aigVar.f52776s0 = (aih) aih.setY(new Object[]{compoundDrawableTintBlendMode.setX(i14)}, 917412038, -917412034, (int) System.currentTimeMillis());
                    int i310 = (i14 ^ 1) + ((i14 & 1) << 1);
                    aigVar.f52777t0 = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(i310)}, -837021952, 837021958, (int) System.currentTimeMillis());
                    int i311 = i310 & (-113);
                    int i312 = -(-((i310 ^ (-113)) | i311));
                    int i313 = (i311 ^ i312) + ((i311 & i312) << 1);
                    int i314 = ((i313 | 115) << 1) - (i313 ^ 115);
                    int i315 = (i314 ^ (-1)) + (i314 << 1);
                    aigVar.f52778u0 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(i315)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    int i316 = (i315 | (-33)) << 1;
                    int i317 = -(((~i315) & (-33)) | (i315 & 32));
                    int i410 = ((i316 | i317) << 1) - (i316 ^ i317);
                    int i411 = i410 ^ 34;
                    int i412 = (i410 & 34) << 1;
                    int i413 = (i411 ^ i412) + ((i411 & i412) << 1);
                    aigVar.v0 = (adp) adp.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode.setX(i413)}, -837021952, 837021958, (int) System.currentTimeMillis());
                    int i414 = (i413 ^ (-30)) + ((i413 & (-30)) << 1);
                    aigVar.f52779w0 = (ads) ads.setDividerPadding(new Object[]{compoundDrawableTintBlendMode.setX(((i414 | 31) << 1) - (i414 ^ 31))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    int i415 = f52773x0;
                    int i416 = i415 & 71;
                    int i417 = (i415 | 71) & (~i416);
                    int i418 = -(-(i416 << 1));
                    i15 = (i417 & i418) + (i417 | i418);
                    f52774y0 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i419 = 87 / 0;
                    }
                } else {
                    int i52 = i30 + 63;
                    f52773x0 = i52 % 128;
                    int i53 = i52 % 2;
                }
                return aigVar;
            case 4:
                aig aigVar4 = (aig) objArr[0];
                int i54 = f52774y0 + 13;
                int i55 = i54 % 128;
                f52773x0 = i55;
                int i56 = i54 % 2;
                aih aihVar = aigVar4.f52776s0;
                if (i56 != 0) {
                    throw null;
                }
                int i57 = i55 & 17;
                int i58 = ((i55 ^ 17) | i57) << 1;
                int i59 = -((i55 | 17) & (~i57));
                int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                f52774y0 = i60 % 128;
                if (i60 % 2 != 0) {
                    return aihVar;
                }
                throw null;
            case 5:
                aig aigVar5 = (aig) objArr[0];
                int i61 = f52774y0;
                int i62 = ((i61 | 9) << 1) - (i61 ^ 9);
                f52773x0 = i62 % 128;
                int i63 = i62 % 2;
                ads adsVar = aigVar5.f52779w0;
                Object[] objArr3 = new Object[1];
                if (i63 != 0) {
                    objArr3[0] = adsVar;
                    bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(objArr3, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
                    int i64 = 37 / 0;
                } else {
                    objArr3[0] = adsVar;
                    bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(objArr3, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                int i65 = f52774y0;
                int i66 = i65 & 83;
                int i67 = ((i65 ^ 83) | i66) << 1;
                int i68 = -((i65 | 83) & (~i66));
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                f52773x0 = i69 % 128;
                if (i69 % 2 == 0) {
                    return bArr;
                }
                throw null;
            case 6:
                aig aigVar6 = (aig) objArr[0];
                int i70 = f52773x0;
                int i71 = (-2) - (((i70 ^ 36) + ((i70 & 36) << 1)) ^ (-1));
                f52774y0 = i71 % 128;
                int i72 = i71 % 2;
                ads adsVar2 = aigVar6.f52778u0;
                if (i72 == 0) {
                    throw null;
                }
                byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i73 = f52774y0;
                int i74 = i73 & 65;
                int i75 = (i74 - (~((i73 ^ 65) | i74))) - 1;
                f52773x0 = i75 % 128;
                int i76 = i75 % 2;
                return bArr2;
            default:
                aig aigVar7 = (aig) objArr[0];
                int i77 = f52773x0;
                int i78 = (i77 | 31) << 1;
                int i79 = -(((~i77) & 31) | (i77 & (-32)));
                int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
                f52774y0 = i80 % 128;
                int i81 = i80 % 2;
                adp adpVar3 = aigVar7.f52777t0;
                Object[] objArr4 = new Object[1];
                if (i81 != 0) {
                    objArr4[0] = adpVar3;
                    return (BigInteger) adp.setOnFocusChangeListener(objArr4, 1599682974, -1599682960, System.identityHashCode(adpVar3));
                }
                objArr4[0] = adpVar3;
                BigInteger bigInteger = (BigInteger) adp.setOnFocusChangeListener(objArr4, 1599682974, -1599682960, System.identityHashCode(adpVar3));
                int i82 = 10 / 0;
                return bigInteger;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, -356458386, 356458387, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1665078170, 1665078175, System.identityHashCode(this));
    }

    public final BigInteger setOnFocusChangeListener() {
        return (BigInteger) setDividerPadding(new Object[]{this}, -266185672, 266185672, System.identityHashCode(this));
    }

    public final aih setX() {
        return (aih) setDividerPadding(new Object[]{this}, 1004177238, -1004177234, System.identityHashCode(this));
    }

    public final BigInteger setY() {
        return (BigInteger) setDividerPadding(new Object[]{this}, -2037262492, 2037262494, System.identityHashCode(this));
    }

    public static aig setOnFocusChangeListener(Object obj) {
        return (aig) setDividerPadding(new Object[]{obj}, -983722736, 983722739, (int) System.currentTimeMillis());
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, -557516030, 557516036, System.identityHashCode(this));
    }
}
