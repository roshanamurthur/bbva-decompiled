package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avv extends adw {
    public static int E0 = 0;
    public static int F0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f54013r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f54014s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final long f54015t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54016u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f54017w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final byte[] f54018x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final byte[] f54019y0;

    public avv(aed aedVar) {
        long jLongValue;
        adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
        if (!((Boolean) adp.setOnFocusChangeListener(new Object[]{adpVar, 0}, 920356441, -920356436, 0)).booleanValue() && !((Boolean) adp.setOnFocusChangeListener(new Object[]{adpVar, 1}, 920356441, -920356436, 1)).booleanValue()) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f54013r0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
        if (aedVar.setCompoundDrawableTintBlendMode() != 2 && aedVar.setCompoundDrawableTintBlendMode() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        aed aedVar2 = (aed) aed.setY(new Object[]{aedVar.setX(1)}, 691787085, -691787084, (int) System.currentTimeMillis());
        adp adpVar2 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar2.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f54014s0 = ((Long) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -786927668, 786927685, System.identityHashCode(adpVar2))).longValue();
        ads adsVar = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(1)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54016u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar2 = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(2)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar2}, -952512304, 952512305, System.identityHashCode(adsVar2))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar3 = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(3)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54017w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar3}, -952512304, 952512305, System.identityHashCode(adsVar3))}, -150521869, 150521882, (int) System.currentTimeMillis());
        ads adsVar4 = (ads) ads.setDividerPadding(new Object[]{aedVar2.setX(4)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
        this.f54018x0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar4}, -952512304, 952512305, System.identityHashCode(adsVar4))}, -150521869, 150521882, (int) System.currentTimeMillis());
        if (aedVar2.setCompoundDrawableTintBlendMode() == 6) {
            aeh aehVar = (aeh) aeh.setOnFocusChangeListener(new Object[]{aedVar2.setX(5)}, -1361475358, 1361475364, (int) System.currentTimeMillis());
            if (((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            adp adpVar3 = (adp) adp.setOnFocusChangeListener(new Object[]{aehVar, Boolean.FALSE}, 522248224, -522248221, (int) System.currentTimeMillis());
            jLongValue = ((Long) adp.setOnFocusChangeListener(new Object[]{adpVar3}, -786927668, 786927685, System.identityHashCode(adpVar3))).longValue();
        } else {
            if (aedVar2.setCompoundDrawableTintBlendMode() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            jLongValue = -1;
        }
        this.f54015t0 = jLongValue;
        if (aedVar.setCompoundDrawableTintBlendMode() != 3) {
            this.f54019y0 = null;
        } else {
            ads adsVar5 = (ads) ads.setDividerPadding(new Object[]{(aeh) aeh.setOnFocusChangeListener(new Object[]{aedVar.setX(2)}, -1361475358, 1361475364, (int) System.currentTimeMillis()), Boolean.TRUE}, 1788383860, -1788383856, (int) System.currentTimeMillis());
            this.f54019y0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar5}, -952512304, 952512305, System.identityHashCode(adsVar5))}, -150521869, 150521882, (int) System.currentTimeMillis());
        }
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        long j10;
        byte[] bArr;
        int i13 = ~((~i10) | i11);
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = (((~((~i12) | i14)) | i13 | i15) * 398) + ((i10 | i11) * (-1194)) + ((i13 | i15 | (~(i14 | i12))) * 398) + (i11 * 399) + (i10 * 399);
        avv avvVar = null;
        switch (i16) {
            case 1:
                Object obj = objArr[0];
                int i17 = E0;
                int i18 = i17 | 85;
                int i19 = ((i18 << 1) - (~(-((~(i17 & 85)) & i18)))) - 1;
                int i20 = i19 % 128;
                F0 = i20;
                int i21 = i19 % 2;
                if (obj instanceof avv) {
                    int i22 = i20 & 55;
                    int i23 = ((i20 ^ 55) | i22) << 1;
                    int i24 = -((~i22) & (i20 | 55));
                    int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                    E0 = i25 % 128;
                    int i26 = i25 % 2;
                    avvVar = (avv) obj;
                    int i27 = i20 ^ 113;
                    int i28 = (i20 & 113) << 1;
                    int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                    E0 = i29 % 128;
                    if (i29 % 2 != 0) {
                        int i30 = 56 / 0;
                    }
                } else if (obj != null) {
                    avv avvVar2 = new avv(aed.setCompoundDrawableTintBlendMode(obj));
                    int i31 = F0;
                    int i32 = i31 & 3;
                    int i33 = -(-((i31 ^ 3) | i32));
                    int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                    E0 = i34 % 128;
                    if (i34 % 2 != 0) {
                        throw null;
                    }
                    avvVar = avvVar2;
                } else {
                    int i35 = i20 + 29;
                    E0 = i35 % 128;
                    int i36 = i35 % 2;
                }
                return avvVar;
            case 2:
                avv avvVar3 = (avv) objArr[0];
                int i37 = F0;
                int i38 = ((i37 & (-92)) | ((~i37) & 91)) + ((i37 & 91) << 1);
                E0 = i38 % 128;
                int i39 = i38 % 2;
                int i40 = avvVar3.f54013r0;
                if (i39 == 0) {
                    return Integer.valueOf(i40);
                }
                throw null;
            case 3:
                avv avvVar4 = (avv) objArr[0];
                int iIdentityHashCode = System.identityHashCode(avvVar4);
                int i41 = (-1279489519) ^ iIdentityHashCode;
                int i42 = (-1279489519) & iIdentityHashCode;
                int i43 = ~((i42 & i41) | (i41 ^ i42));
                int i44 = ((i43 & 71499904) | (71499904 ^ i43)) * (-566);
                int i45 = 524458535 & i44;
                int i46 = i45 + ((i44 ^ 524458535) | i45);
                int i47 = (((i46 ^ 1640263222) | (i46 & 1640263222)) << 1) - ((1640263222 & (~i46)) | ((-1640263223) & i46));
                int i48 = (-1207989615) & iIdentityHashCode;
                int i49 = (iIdentityHashCode | (-1207989615)) & (~i48);
                int i50 = -(~((~((i49 & i48) | (i49 ^ i48))) * 566));
                int i51 = ((i47 | i50) << 1) - (i50 ^ i47);
                int i52 = (i51 ^ (-1)) + (i51 << 1);
                int iIdentityHashCode2 = System.identityHashCode(avvVar4);
                int i53 = ~iIdentityHashCode2;
                int i54 = ~(((i53 | iIdentityHashCode2) & i53) | (-167361140));
                int i55 = (-592974326) & i53;
                int i56 = ~((592974325 & iIdentityHashCode2) | i55 | ((-592974326) & iIdentityHashCode2));
                int i57 = i54 ^ i56;
                int i58 = i54 & i56;
                int i59 = -(~(((i58 & i57) | (i57 ^ i58)) * 333));
                int i60 = (((-214252235) ^ i59) + ((i59 & (-214252235)) << 1)) - 1;
                int i61 = (-167361140) & iIdentityHashCode2;
                int i62 = ~(((iIdentityHashCode2 | (-167361140)) & (~i61)) | i61);
                int i63 = (i53 | (-592974326)) & (~i55);
                int i64 = ~((i63 & i55) | (i63 ^ i55));
                int i65 = ((~i64) & i62) | ((~i62) & i64);
                int i66 = i62 & i64;
                int i67 = -(-(((i66 & i65) | (i65 ^ i66)) * 333));
                int i68 = ((i60 | i67) << 1) - (i67 ^ i60);
                byte[] bArr2 = avvVar4.v0;
                if (i52 > i68) {
                    return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                int i69 = 59 / 0;
                return (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
            case 4:
                avv avvVar5 = (avv) objArr[0];
                adh adhVar = new adh();
                if (avvVar5.f54015t0 >= 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(1L)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i70 = E0;
                    int i71 = (i70 ^ 49) + ((i70 & 49) << 1);
                    F0 = i71 % 128;
                    int i72 = i71 % 2;
                } else {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(0L)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i73 = F0;
                    int i74 = (i73 ^ 55) + ((i73 & 55) << 1);
                    E0 = i74 % 128;
                    int i75 = i74 % 2;
                }
                adh adhVar2 = new adh();
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new adp(avvVar5.f54014s0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avvVar5.f54016u0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avvVar5.v0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avvVar5.f54017w0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new aft(avvVar5.f54018x0)}, 240298319, -240298315, System.identityHashCode(adhVar2));
                long j11 = avvVar5.f54015t0;
                if (j11 >= 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar2, new afx(false, 0, new adp(j11))}, 240298319, -240298315, System.identityHashCode(adhVar2));
                    int i76 = F0;
                    int i77 = (i76 & 106) + (i76 | 106);
                    int i78 = (i77 ^ (-1)) + (i77 << 1);
                    E0 = i78 % 128;
                    int i79 = i78 % 2;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afv(adhVar2)}, 240298319, -240298315, System.identityHashCode(adhVar));
                afv afvVarA = c.a(adhVar, new Object[]{adhVar, new afx(true, 0, new aft(avvVar5.f54019y0))}, 240298319, -240298315, adhVar);
                int i80 = E0;
                int i81 = i80 & 23;
                int i82 = (i80 ^ 23) | i81;
                int i83 = (i81 & i82) + (i82 | i81);
                F0 = i83 % 128;
                int i84 = i83 % 2;
                return afvVarA;
            case 5:
                avv avvVar6 = (avv) objArr[0];
                int i85 = F0;
                int i86 = i85 & 69;
                int i87 = (i86 - (~(-(-((i85 ^ 69) | i86))))) - 1;
                int i88 = i87 % 128;
                E0 = i88;
                int i89 = i87 % 2;
                long j12 = avvVar6.f54014s0;
                int i90 = i88 & 45;
                int i91 = ((i88 | 45) & (~i90)) + (i90 << 1);
                F0 = i91 % 128;
                int i92 = i91 % 2;
                return Long.valueOf(j12);
            case 6:
                avv avvVar7 = (avv) objArr[0];
                int i93 = E0;
                int i94 = i93 & 81;
                int i95 = i94 + ((i93 ^ 81) | i94);
                F0 = i95 % 128;
                int i96 = i95 % 2;
                byte[] bArr3 = avvVar7.f54017w0;
                Object[] objArr2 = new Object[1];
                if (i96 != 0) {
                    objArr2[0] = bArr3;
                    return (byte[]) bek.setOnFocusChangeListener(objArr2, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                objArr2[0] = bArr3;
                throw null;
            case 7:
                avv avvVar8 = (avv) objArr[0];
                int i97 = F0;
                int i98 = i97 ^ 59;
                int i99 = ((((59 & i97) | i98) << 1) - (~(-i98))) - 1;
                E0 = i99 % 128;
                if (i99 % 2 != 0) {
                    j10 = avvVar8.f54015t0;
                    int i100 = 49 / 0;
                } else {
                    j10 = avvVar8.f54015t0;
                }
                return Long.valueOf(j10);
            case 8:
                avv avvVar9 = (avv) objArr[0];
                int i101 = E0;
                int i102 = i101 & 49;
                int i103 = i102 + ((i101 ^ 49) | i102);
                F0 = i103 % 128;
                int i104 = i103 % 2;
                byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{avvVar9.f54016u0}, -150521869, 150521882, (int) System.currentTimeMillis());
                int i105 = E0;
                int i106 = i105 & 9;
                int i107 = -(-((i105 ^ 9) | i106));
                int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                F0 = i108 % 128;
                if (i108 % 2 != 0) {
                    return bArr4;
                }
                throw null;
            case 9:
                avv avvVar10 = (avv) objArr[0];
                int i109 = E0;
                int i110 = i109 & 63;
                int i111 = (i109 | 63) & (~i110);
                int i112 = i110 << 1;
                int i113 = (i111 & i112) + (i111 | i112);
                F0 = i113 % 128;
                int i114 = i113 % 2;
                byte[] bArr5 = avvVar10.f54018x0;
                Object[] objArr3 = new Object[1];
                if (i114 != 0) {
                    objArr3[0] = bArr5;
                    return (byte[]) bek.setOnFocusChangeListener(objArr3, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                objArr3[0] = bArr5;
                throw null;
            default:
                avv avvVar11 = (avv) objArr[0];
                int i115 = F0;
                int i116 = ((i115 ^ 50) + ((i115 & 50) << 1)) - 1;
                E0 = i116 % 128;
                int i117 = i116 % 2;
                byte[] bArr6 = avvVar11.f54019y0;
                Object[] objArr4 = new Object[1];
                if (i117 != 0) {
                    objArr4[0] = bArr6;
                    bArr = (byte[]) bek.setOnFocusChangeListener(objArr4, -150521869, 150521882, (int) System.currentTimeMillis());
                    int i118 = 7 / 0;
                } else {
                    objArr4[0] = bArr6;
                    bArr = (byte[]) bek.setOnFocusChangeListener(objArr4, -150521869, 150521882, (int) System.currentTimeMillis());
                }
                int i119 = F0;
                int i120 = i119 & 115;
                int i121 = ((i119 ^ 115) | i120) << 1;
                int i122 = -((i119 | 115) & (~i120));
                int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                E0 = i123 % 128;
                int i124 = i123 % 2;
                return bArr;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 955873652, -955873648, System.identityHashCode(this));
    }

    public final byte[] getNavBarTitleString() {
        return (byte[]) setY(new Object[]{this}, -1680535431, 1680535437, System.identityHashCode(this));
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, -1788807929, 1788807937, System.identityHashCode(this));
    }

    public final long setDividerPadding() {
        return ((Long) setY(new Object[]{this}, 1893291577, -1893291570, System.identityHashCode(this))).longValue();
    }

    public final byte[] setOnDragListener() {
        return (byte[]) setY(new Object[]{this}, 1458638391, -1458638382, System.identityHashCode(this));
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 2058242378, -2058242376, System.identityHashCode(this))).intValue();
    }

    public final byte[] setOnLongClickListener() {
        return (byte[]) setY(new Object[]{this}, -432496954, 432496954, System.identityHashCode(this));
    }

    public final long setX() {
        return ((Long) setY(new Object[]{this}, 1032709696, -1032709691, System.identityHashCode(this))).longValue();
    }

    public avv(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j11) {
        this.f54013r0 = 1;
        this.f54014s0 = j10;
        this.f54016u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54017w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54018x0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54019y0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54015t0 = j11;
    }

    public static avv setDividerPadding(Object obj) {
        return (avv) setY(new Object[]{obj}, -1305372859, 1305372860, (int) System.currentTimeMillis());
    }

    public avv(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f54013r0 = 0;
        this.f54014s0 = j10;
        this.f54016u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54017w0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54018x0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54019y0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54015t0 = -1L;
    }

    public final byte[] setY() {
        return (byte[]) setY(new Object[]{this}, -571706358, 571706361, System.identityHashCode(this));
    }
}
