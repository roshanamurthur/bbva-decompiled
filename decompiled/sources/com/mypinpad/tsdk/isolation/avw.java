package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avw extends adw {
    public static int E0 = 0;
    public static int F0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f54020r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f54021s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54022t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54023u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54024w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f54025x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final byte[] f54026y0;

    public avw(aed aedVar) {
        int iIntValue;
        adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
        if (!((Boolean) adp.setOnFocusChangeListener(new Object[]{adpVar, 0}, 920356441, -920356436, 0)).booleanValue() && !((Boolean) adp.setOnFocusChangeListener(new Object[]{adpVar, 1}, 920356441, -920356436, 1)).booleanValue()) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f54020r0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
        if (aedVar.setCompoundDrawableTintBlendMode() != 2 && aedVar.setCompoundDrawableTintBlendMode() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        aed aedVar2 = (aed) aed.setY(new Object[]{aedVar.setX(1)}, 691787085, -691787084, (int) System.currentTimeMillis());
        adp adpVar2 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar2.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f54021s0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -2079758436, 2079758436, System.identityHashCode(adpVar2))).intValue();
        ads adsVar = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54022t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(2)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54023u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar3 = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(3)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar3}, -952512304, 952512305, System.identityHashCode(adsVar3))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar4 = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(4)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54024w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar4}, -952512304, 952512305, System.identityHashCode(adsVar4))}, -150521869, 150521882, (int) System.currentTimeMillis());
        if (aedVar2.setCompoundDrawableTintBlendMode() == 6) {
            aeh aehVar = (aeh) aeh.setOnFocusChangeListener(new Object[]{aedVar2.setX(5)}, -1361475358, 1361475364, (int) System.currentTimeMillis());
            if (((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            adp adpVar3 = (adp) adp.setOnFocusChangeListener(new Object[]{aehVar, Boolean.FALSE}, 522248224, -522248221, (int) System.currentTimeMillis());
            iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar3}, -2079758436, 2079758436, System.identityHashCode(adpVar3))).intValue();
        } else {
            if (aedVar2.setCompoundDrawableTintBlendMode() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            iIntValue = -1;
        }
        this.f54025x0 = iIntValue;
        if (aedVar.setCompoundDrawableTintBlendMode() != 3) {
            this.f54026y0 = null;
        } else {
            ads adsVar5 = (ads) ads.setDividerPadding(new Object[]{(aeh) aeh.setOnFocusChangeListener(new Object[]{aedVar.setX(2)}, -1361475358, 1361475364, (int) System.currentTimeMillis()), Boolean.TRUE}, 1788383860, -1788383856, (int) System.currentTimeMillis());
            this.f54026y0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar5}, -952512304, 952512305, System.identityHashCode(adsVar5))}, -150521869, 150521882, (int) System.currentTimeMillis());
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        byte[] bArr;
        int i14 = (i11 * (-344)) + (i10 * (-344));
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = i15 | i16;
        int i18 = ((~(i17 | i12)) * 345) + (((~(i10 | i16)) | (~(i15 | (~i12)))) * 345) + (((~i17) | (~(i15 | i12))) * 345) + i14;
        avw avwVar = null;
        switch (i18) {
            case 1:
                avw avwVar2 = (avw) objArr[0];
                int i19 = E0;
                int i20 = i19 & 79;
                int i21 = (~i20) & (i19 | 79);
                int i22 = i20 << 1;
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                F0 = i23 % 128;
                int i24 = i23 % 2;
                int i25 = avwVar2.f54020r0;
                int i26 = (((i19 | 105) << 1) - (~(-(((~i19) & 105) | (i19 & (-106)))))) - 1;
                F0 = i26 % 128;
                if (i26 % 2 != 0) {
                    return Integer.valueOf(i25);
                }
                throw null;
            case 2:
                Object obj = objArr[0];
                int i27 = E0;
                int i28 = (i27 ^ 55) + ((i27 & 55) << 1);
                F0 = i28 % 128;
                int i29 = i28 % 2;
                if (!(obj instanceof avw)) {
                    if (obj != null) {
                        avw avwVar3 = new avw(aed.setCompoundDrawableTintBlendMode(obj));
                        int i30 = F0;
                        int i31 = ((i30 | 61) << 1) - (i30 ^ 61);
                        E0 = i31 % 128;
                        if (i31 % 2 != 0) {
                            throw null;
                        }
                        avwVar = avwVar3;
                    } else {
                        i13 = ((i27 & (-20)) | ((~i27) & 19)) + ((i27 & 19) << 1);
                        F0 = i13 % 128;
                    }
                    return avwVar;
                }
                int i32 = i27 ^ 77;
                int i33 = -(-((i27 & 77) << 1));
                int i34 = (i32 & i33) + (i33 | i32);
                int i35 = i34 % 128;
                F0 = i35;
                if (i34 % 2 == 0) {
                    throw null;
                }
                avwVar = (avw) obj;
                i13 = (((i35 | 92) << 1) - (i35 ^ 92)) - 1;
                E0 = i13 % 128;
                int i36 = i13 % 2;
                return avwVar;
            case 3:
                avw avwVar4 = (avw) objArr[0];
                int i37 = F0;
                int i38 = (i37 ^ 11) + ((i37 & 11) << 1);
                E0 = i38 % 128;
                int i39 = i38 % 2;
                byte[] bArr2 = avwVar4.f54024w0;
                Object[] objArr2 = new Object[1];
                if (i39 == 0) {
                    objArr2[0] = bArr2;
                    return (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                objArr2[0] = bArr2;
                byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                int i40 = 99 / 0;
                return bArr3;
            case 4:
                avw avwVar5 = (avw) objArr[0];
                int i41 = E0;
                int i42 = (i41 & 1) + (i41 | 1);
                F0 = i42 % 128;
                int i43 = i42 % 2;
                byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avwVar5.f54026y0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i44 = F0;
                int i45 = (((i44 | 51) << 1) - (~(-(i44 ^ 51)))) - 1;
                E0 = i45 % 128;
                int i46 = i45 % 2;
                return bArr4;
            case 5:
                avw avwVar6 = (avw) objArr[0];
                adh adhVar = new adh();
                if (avwVar6.f54025x0 >= 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(1L)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i47 = E0;
                    int i48 = i47 & 29;
                    int i49 = (i48 - (~(-(-((i47 ^ 29) | i48))))) - 1;
                    F0 = i49 % 128;
                    int i50 = i49 % 2;
                } else {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(0L)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i51 = E0 + 11;
                    F0 = i51 % 128;
                    int i52 = i51 % 2;
                }
                adh adhVar2 = new adh();
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new adp(avwVar6.f54021s0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avwVar6.f54022t0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avwVar6.f54023u0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avwVar6.v0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avwVar6.f54024w0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                int i53 = avwVar6.f54025x0;
                if (i53 >= 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new afx(false, 0, new adp(i53))}, 240298319, -240298315, System.identityHashCode(adhVar2));
                    int i54 = E0;
                    int i55 = ((i54 ^ 71) | (i54 & 71)) << 1;
                    int i56 = -(((~i54) & 71) | (i54 & (-72)));
                    int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                    F0 = i57 % 128;
                    int i58 = i57 % 2;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afv(adhVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, new afx(true, 0, new aft(avwVar6.f54026y0))}, 240298319, -240298315, adhVar);
                int i59 = (-2) - ((F0 + 108) ^ (-1));
                E0 = i59 % 128;
                if (i59 % 2 == 0) {
                    return afvVarA;
                }
                throw null;
            case 6:
                avw avwVar7 = (avw) objArr[0];
                int i60 = E0;
                int i61 = i60 & 65;
                int i62 = (i60 | 65) & (~i61);
                int i63 = i61 << 1;
                int i64 = (i62 & i63) + (i62 | i63);
                F0 = i64 % 128;
                int i65 = i64 % 2;
                byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avwVar7.f54023u0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i66 = E0;
                int i67 = i66 & 83;
                int i68 = (i66 | 83) & (~i67);
                int i69 = i67 << 1;
                int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
                F0 = i70 % 128;
                if (i70 % 2 != 0) {
                    return bArr5;
                }
                throw null;
            case 7:
                avw avwVar8 = (avw) objArr[0];
                int i71 = E0;
                int i72 = ((i71 & 5) - (~(-(-(i71 | 5))))) - 1;
                F0 = i72 % 128;
                int i73 = i72 % 2;
                int i74 = avwVar8.f54025x0;
                int i75 = ((i71 & 66) + (i71 | 66)) - 1;
                F0 = i75 % 128;
                if (i75 % 2 != 0) {
                    return Integer.valueOf(i74);
                }
                throw null;
            case 8:
                avw avwVar9 = (avw) objArr[0];
                int i76 = F0;
                int i77 = (i76 ^ 30) + ((i76 & 30) << 1);
                int i78 = (i77 ^ (-1)) + (i77 << 1);
                E0 = i78 % 128;
                int i79 = i78 % 2;
                byte[] bArr6 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avwVar9.f54022t0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i80 = E0;
                int i81 = ((i80 ^ 12) + ((i80 & 12) << 1)) - 1;
                F0 = i81 % 128;
                int i82 = i81 % 2;
                return bArr6;
            case 9:
                avw avwVar10 = (avw) objArr[0];
                int i83 = E0;
                int i84 = i83 & 33;
                int i85 = i84 + ((i83 ^ 33) | i84);
                F0 = i85 % 128;
                int i86 = i85 % 2;
                byte[] bArr7 = avwVar10.v0;
                Object[] objArr3 = new Object[1];
                if (i86 == 0) {
                    objArr3[0] = bArr7;
                    bArr = (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
                    int i87 = 13 / 0;
                } else {
                    objArr3[0] = bArr7;
                    bArr = (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                int i88 = E0;
                int i89 = (((i88 ^ 21) | (i88 & 21)) << 1) - (((~i88) & 21) | (i88 & (-22)));
                F0 = i89 % 128;
                int i90 = i89 % 2;
                return bArr;
            default:
                avw avwVar11 = (avw) objArr[0];
                int i91 = E0;
                int i92 = i91 & 77;
                int i93 = -(-(i91 | 77));
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                int i95 = i94 % 128;
                F0 = i95;
                int i96 = i94 % 2;
                int i97 = avwVar11.f54021s0;
                int i98 = i95 & 77;
                int i99 = (i98 - (~(-(-((i95 ^ 77) | i98))))) - 1;
                E0 = i99 % 128;
                int i100 = i99 % 2;
                return Integer.valueOf(i97);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 423536134, -423536129, System.identityHashCode(this));
    }

    public final byte[] getNavBarTitleString() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -960799240, 960799249, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 390491701, -390491694, System.identityHashCode(this))).intValue();
    }

    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1487398746, 1487398750, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1870099428, -1870099420, System.identityHashCode(this));
    }

    public final byte[] setOnLongClickListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 5288606, -5288603, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -414106717, 414106718, System.identityHashCode(this))).intValue();
    }

    public final int setY() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -496388584, 496388584, System.identityHashCode(this))).intValue();
    }

    public avw(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i11) {
        this.f54020r0 = 1;
        this.f54021s0 = i10;
        this.f54022t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54023u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54024w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54026y0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54025x0 = i11;
    }

    public static avw setY(Object obj) {
        return (avw) setCompoundDrawableTintBlendMode(new Object[]{obj}, 1905435243, -1905435241, (int) System.currentTimeMillis());
    }

    public avw(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f54020r0 = 0;
        this.f54021s0 = i10;
        this.f54022t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54023u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54024w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54026y0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54025x0 = -1;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1851227717, -1851227711, System.identityHashCode(this));
    }
}
