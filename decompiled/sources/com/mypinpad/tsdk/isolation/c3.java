package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class c3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54763e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54764f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f54765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3 f54766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f54767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f54768d;

    public c3(f3 f3Var) {
        if (f3Var == null) {
            throw new NullPointerException("params == null");
        }
        this.f54765a = f3Var;
        int iIntValue = ((Integer) f3.a(new Object[]{f3Var}, 1362098093, -1362098092, System.identityHashCode(f3Var))).intValue();
        this.f54766b = new b3(iIntValue, (adu) f3.a(new Object[]{f3Var}, 30329046, -30329043, System.identityHashCode(f3Var)));
        this.f54767c = new byte[iIntValue];
        this.f54768d = new byte[iIntValue];
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        c3 c3Var = (c3) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        ban banVar = (ban) objArr[4];
        int i10 = f54763e;
        int i11 = (-2) - (((i10 ^ 116) + ((i10 & 116) << 1)) ^ (-1));
        f54764f = i11 % 128;
        if (i11 % 2 == 0) {
            f3 f3Var = c3Var.f54765a;
            ((Integer) f3.a(new Object[]{f3Var}, 1362098093, -1362098092, System.identityHashCode(f3Var))).intValue();
            throw null;
        }
        f3 f3Var2 = c3Var.f54765a;
        int iIntValue3 = ((Integer) f3.a(new Object[]{f3Var2}, 1362098093, -1362098092, System.identityHashCode(f3Var2))).intValue();
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != iIntValue3) {
            StringBuilder sb2 = new StringBuilder("startHash needs to be ");
            sb2.append(iIntValue3);
            sb2.append("bytes");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (banVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (((byte[]) ban.a(new Object[]{banVar}, 1306240669, -1306240668, System.identityHashCode(banVar))) == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i12 = iIntValue2 * 70;
        int i13 = -(~(iIntValue * (-68)));
        int i14 = (((i12 | i13) << 1) - (i12 ^ i13)) - 1;
        int i15 = ~iIntValue2;
        int i16 = (i15 | iIntValue2) & i15;
        int i17 = ~iIntValue;
        int i18 = i17 & (i17 | iIntValue);
        int i19 = ~i18;
        int i20 = ~i16;
        int i21 = (i16 & i19) | (i18 & i20);
        int i22 = i16 & i18;
        int i23 = ~((i21 ^ i22) | (i21 & i22) | iIntValue);
        int i24 = iIntValue2 & iIntValue;
        int i25 = (~i24) & (iIntValue2 | iIntValue);
        int i26 = (i25 ^ i24) | (i25 & i24);
        int i27 = i26 ^ iIntValue;
        int i28 = i26 & iIntValue;
        int i29 = ~((i27 ^ i28) | (i28 & i27));
        int i30 = ((~i23) & i29) | ((~i29) & i23);
        int i31 = i29 & i23;
        int i32 = ((i31 & i30) | (i30 ^ i31)) * 69;
        int i33 = i14 & i32;
        int i34 = ((i14 ^ i32) | i33) << 1;
        int i35 = -((i14 | i32) & (~i33));
        int i36 = (i34 & i35) + (i35 | i34);
        int i37 = (i16 & i17) | (iIntValue & i20);
        int i38 = i16 & iIntValue;
        int i39 = ~((i37 & i38) | (i37 ^ i38));
        int i40 = i15 & i17;
        int i41 = ((~i15) & iIntValue) | i40;
        int i42 = i15 & iIntValue;
        int i43 = ~(i41 | i42);
        int i44 = (i39 ^ i43) | (i39 & i43);
        int i45 = (iIntValue ^ iIntValue) | (iIntValue & iIntValue);
        int i46 = ~i45;
        int i47 = i46 & (i45 | i46);
        int i48 = (i36 - (~(-(-(((i44 & i47) | (i44 ^ i47)) * (-69)))))) - 1;
        int i49 = ~i17;
        int i50 = (iIntValue2 & i49) | i40;
        int i51 = i17 & iIntValue2;
        int i52 = (~((i50 ^ i51) | (i50 & i51))) * 69;
        int i53 = (i48 ^ i52) + ((i48 & i52) << 1);
        f3 f3Var3 = c3Var.f54765a;
        int iIntValue4 = ((Integer) f3.a(new Object[]{f3Var3}, 688063388, -688063386, System.identityHashCode(f3Var3))).intValue();
        int i54 = iIntValue4 * 319;
        int i55 = ((317 & i54) - (~(-(-(i54 | TypedValues.AttributesType.TYPE_EASING))))) - 1;
        int i56 = ~iIntValue4;
        int i57 = (i56 | iIntValue4) & i56;
        int i58 = i57 & iIntValue;
        int i59 = (i57 | iIntValue) & (~i58);
        int i60 = (i58 & i59) | (i59 ^ i58);
        int i61 = ~i60;
        int i62 = (i60 | i61) & i61;
        int i63 = (i19 ^ i18) | (i19 & i18);
        int i64 = ~((iIntValue4 & i63) | (i63 ^ iIntValue4));
        int i65 = i62 ^ i64;
        int i66 = i62 & i64;
        int i67 = -(-(((i66 & i65) | (i65 ^ i66)) * (-318)));
        int i68 = (i55 ^ i67) + ((i67 & i55) << 1);
        int i69 = i56 ^ (-1);
        int i70 = ~((i69 & i56) | (i69 ^ i56));
        int i71 = ~(((-1) ^ iIntValue) | iIntValue);
        int i72 = i68 - (~(-(-(((i70 & i71) | (i70 ^ i71)) * (-318)))));
        int i73 = (i72 ^ (-1)) + (i72 << 1);
        int i74 = i56 ^ i17;
        int i75 = i56 & i17;
        int i76 = ((i74 & i75) | (i74 ^ i75)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
        if (i53 > (i73 ^ i76) + ((i73 & i76) << 1)) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (iIntValue2 == 0) {
            int i77 = f54764f + 81;
            f54763e = i77 % 128;
            if (i77 % 2 != 0) {
                int i78 = 65 / 0;
            }
            return bArr;
        }
        byte[] bArr2 = (byte[]) c(new Object[]{c3Var, bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2 - 1), banVar}, -437281664, 437281666, iIntValue);
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new ban.setCompoundDrawableTintBlendMode();
        int iIntValue5 = ((Integer) bar.setY(new Object[]{banVar}, -322813125, 322813127, System.identityHashCode(banVar))).intValue();
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode, Integer.valueOf(iIntValue5)}, 575278009, -575278009, iIntValue5));
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode2, Long.valueOf(((Long) bar.setY(new Object[]{banVar}, 482931428, -482931427, System.identityHashCode(banVar))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setcompounddrawabletintblendmode2)));
        int iIntValue6 = ((Integer) ban.a(new Object[]{banVar}, -1482203953, 1482203956, System.identityHashCode(banVar))).intValue();
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode3, Integer.valueOf(iIntValue6)}, 391211609, -391211603, iIntValue6);
        int iIntValue7 = ((Integer) ban.a(new Object[]{banVar}, -545166502, 545166504, System.identityHashCode(banVar))).intValue();
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode4, Integer.valueOf(iIntValue7)}, 874018780, -874018778, iIntValue7);
        int i79 = iIntValue2 * (-167);
        int i80 = iIntValue * (-167);
        int i81 = (i79 & i80) + (i79 | i80);
        int i82 = (~i40) & (i15 | i17);
        int i83 = (i82 & i40) | (i82 ^ i40);
        int i84 = ~i83;
        int i85 = (i83 | i84) & i84;
        int i86 = (i19 & i17) | (i18 & i49);
        int i87 = i18 & i17;
        int i88 = ~((i86 ^ i87) | (i86 & i87));
        int i89 = i85 & i88;
        int i90 = (~i89) & (i88 | i85);
        int i91 = ((i90 & i89) | (i90 ^ i89)) * 168;
        int i92 = i81 & i91;
        int i93 = ((i81 ^ i91) | i92) << 1;
        int i94 = -((i91 | i81) & (~i92));
        int i95 = (i93 & i94) + (i94 | i93);
        int i96 = i15 & i18;
        int i97 = (~i96) & (i15 | i18);
        int i98 = (i96 & i97) | (i97 ^ i96);
        int i99 = (i98 & i17) | ((~i98) & iIntValue);
        int i100 = i98 & iIntValue;
        int i101 = (~((i100 & i99) | (i99 ^ i100))) * 168;
        int i102 = (((~i101) & i95) | ((~i95) & i101)) + ((i101 & i95) << 1);
        int i103 = (~((i15 ^ i17) | i40)) | (~((i41 ^ i42) | (i41 & i42)));
        int i104 = (i18 ^ iIntValue2) | (iIntValue2 & i18);
        int i105 = i104 & iIntValue;
        int i106 = ~(((iIntValue | i104) & (~i105)) | i105);
        int i107 = i103 & i106;
        int i108 = (i103 | i106) & (~i107);
        int i109 = (i102 - (~(((i108 & i107) | (i108 ^ i107)) * 168))) - 2;
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode6 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{(ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode5, Integer.valueOf(i109)}, -1717175544, 1717175544, i109), 0}, 1127697955, -1127697949, 0));
        ban banVar2 = (ban) ((bar) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode6}, 1084061586, -1084061582, System.identityHashCode(setcompounddrawabletintblendmode6)));
        byte[] bArr3 = c3Var.f54768d;
        byte[] bArr4 = (byte[]) ban.a(new Object[]{banVar2}, 1306240669, -1306240668, System.identityHashCode(banVar2));
        b3 b3Var = c3Var.f54766b;
        byte[] bArr5 = (byte[]) b3.a(new Object[]{b3Var, bArr3, bArr4}, 1273009689, -1273009689, System.identityHashCode(b3Var));
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode7 = new ban.setCompoundDrawableTintBlendMode();
        int iIntValue8 = ((Integer) bar.setY(new Object[]{banVar2}, -322813125, 322813127, System.identityHashCode(banVar2))).intValue();
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode8 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode7, Integer.valueOf(iIntValue8)}, 575278009, -575278009, iIntValue8));
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode9 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{setcompounddrawabletintblendmode8, Long.valueOf(((Long) bar.setY(new Object[]{banVar2}, 482931428, -482931427, System.identityHashCode(banVar2))).longValue())}, -1011452391, 1011452396, System.identityHashCode(setcompounddrawabletintblendmode8)));
        int iIntValue9 = ((Integer) ban.a(new Object[]{banVar2}, -1482203953, 1482203956, System.identityHashCode(banVar2))).intValue();
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode10 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode9, Integer.valueOf(iIntValue9)}, 391211609, -391211603, iIntValue9);
        int iIntValue10 = ((Integer) ban.a(new Object[]{banVar2}, -545166502, 545166504, System.identityHashCode(banVar2))).intValue();
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode11 = (ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode10, Integer.valueOf(iIntValue10)}, 874018780, -874018778, iIntValue10);
        int iIntValue11 = ((Integer) ban.a(new Object[]{banVar2}, -484111224, 484111224, System.identityHashCode(banVar2))).intValue();
        ban.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode12 = (ban.setCompoundDrawableTintBlendMode) ((bar.setOnFocusChangeListener) bar.setOnFocusChangeListener.setY(new Object[]{(ban.setCompoundDrawableTintBlendMode) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode11, Integer.valueOf(iIntValue11)}, -1717175544, 1717175544, iIntValue11), 1}, 1127697955, -1127697949, 1));
        ban banVar3 = (ban) ((bar) ban.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode12}, 1084061586, -1084061582, System.identityHashCode(setcompounddrawabletintblendmode12)));
        byte[] bArr6 = (byte[]) b3.a(new Object[]{b3Var, c3Var.f54768d, (byte[]) ban.a(new Object[]{banVar3}, 1306240669, -1306240668, System.identityHashCode(banVar3))}, 1273009689, -1273009689, System.identityHashCode(b3Var));
        byte[] bArr7 = new byte[iIntValue3];
        int i110 = f54764f + 11;
        f54763e = i110 % 128;
        int i111 = i110 % 2;
        int i112 = 0;
        while (i112 < iIntValue3) {
            byte b10 = bArr2[i112];
            byte b11 = bArr6[i112];
            bArr7[i112] = (byte) ((b10 | b11) & (~(b10 & b11)));
            i112 = ((i112 & 1) << 1) + ((i112 & (-2)) | ((~i112) & 1));
            int i113 = f54763e;
            int i114 = ((i113 | 63) << 1) - (i113 ^ 63);
            f54764f = i114 % 128;
            int i115 = i114 % 2;
        }
        byte[] bArr8 = (byte[]) b3.a(new Object[]{b3Var, bArr5, bArr7}, 593291519, -593291517, System.identityHashCode(b3Var));
        int i116 = f54763e;
        int i117 = (((i116 & (-98)) | ((~i116) & 97)) - (~(-(-((i116 & 97) << 1))))) - 1;
        f54764f = i117 % 128;
        if (i117 % 2 != 0) {
            return bArr8;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x042d, code lost:
    
        if (r0 < ((java.lang.Integer) com.mypinpad.tsdk.isolation.f3.a(new java.lang.Object[]{r2}, -1054280030, 1054280030, java.lang.System.identityHashCode(r2))).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x044b, code lost:
    
        if (r0 < ((java.lang.Integer) com.mypinpad.tsdk.isolation.f3.a(new java.lang.Object[]{r2}, -1054280030, 1054280030, java.lang.System.identityHashCode(r2))).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x044d, code lost:
    
        r2 = r1.f54766b;
        r16 = (byte[]) com.mypinpad.tsdk.isolation.b3.a(new java.lang.Object[]{r2, r1.f54767c, (byte[]) com.mypinpad.tsdk.isolation.bbi.setOnFocusChangeListener(new java.lang.Object[]{java.lang.Long.valueOf(r0), 32}, 450291415, -450291415, 32)}, 1273009689, -1273009689, java.lang.System.identityHashCode(r2));
        r0 = com.mypinpad.tsdk.isolation.c3.f54764f;
        r1 = ((r0 | 47) << 1) - (r0 ^ 47);
        com.mypinpad.tsdk.isolation.c3.f54763e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x049a, code lost:
    
        if ((r1 % 2) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x049c, code lost:
    
        r0 = 69 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object c(java.lang.Object[] r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.c3.c(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final b3 a() {
        return (b3) c(new Object[]{this}, 1332079466, -1332079462, System.identityHashCode(this));
    }
}
