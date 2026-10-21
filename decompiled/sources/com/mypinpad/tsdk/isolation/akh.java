package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;

/* JADX INFO: loaded from: classes10.dex */
public final class akh {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53002g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53003h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aki f53006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final akz f53007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f53008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f53009f;

    public akh() {
    }

    public akh(aki akiVar) {
        this.f53006c = akiVar;
        if (akiVar instanceof akz) {
            akz akzVar = (akz) akiVar;
            this.f53007d = akzVar;
            this.f53004a = new byte[akzVar.setX()];
        } else {
            this.f53007d = null;
            this.f53004a = new byte[akiVar.setY()];
        }
        boolean z10 = false;
        this.f53005b = 0;
        String compoundDrawableTintBlendMode = akiVar.setCompoundDrawableTintBlendMode();
        int iIndexOf = compoundDrawableTintBlendMode.indexOf(47);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = iIndexOf * (-575);
        int i11 = (-575) & i10;
        int i12 = ((i10 | (-575)) & (~i11)) + (i11 << 1);
        int i13 = ~iIndexOf;
        int i14 = ((-2) ^ i13) | ((-2) & i13);
        int i15 = (i14 | (~i14)) & (~i14);
        int i16 = (~iIndexOf) & (i13 | iIndexOf);
        int i17 = ~((i16 & iCurrentTimeMillis) | (i16 ^ iCurrentTimeMillis));
        int i18 = i15 & i17;
        int i19 = ((((i15 | i17) & (~i18)) | i18) * 576) + i12;
        int i20 = ~(((-2) ^ iIndexOf) | ((-2) & iIndexOf));
        int i21 = ~iIndexOf;
        int i22 = ~iCurrentTimeMillis;
        int i23 = ((~i22) & i21) | ((~i21) & i22);
        int i24 = i21 & i22;
        int i25 = (i24 & i23) | (i23 ^ i24);
        int i26 = (i25 & (-2)) | ((~i25) & 1);
        int i27 = i25 & 1;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = (i28 | (~i28)) & (~i28);
        int i30 = i20 ^ i29;
        int i31 = i29 & i20;
        int i32 = ((i31 & i30) | (i30 ^ i31)) * 576;
        int i33 = i19 & i32;
        int i34 = -(-((i32 ^ i19) | i33));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        int i36 = (-2) & i13;
        int i37 = (~i36) & (i13 | (-2));
        int i38 = (i36 & i37) | (i37 ^ i36);
        int i39 = -(-(((i38 | (~i38)) & (~i38)) * 576));
        int i40 = ((i35 ^ i39) | (i35 & i39)) << 1;
        int i41 = -((i39 & (~i35)) | ((~i39) & i35));
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        boolean z11 = i42 > 0 && compoundDrawableTintBlendMode.startsWith("PGP", i42);
        this.f53009f = z11;
        if (z11 || (akiVar instanceof ali) || (i42 > 0 && compoundDrawableTintBlendMode.startsWith("OpenPGP", i42))) {
            z10 = true;
        }
        this.f53008e = z10;
    }

    public static /* synthetic */ Integer a(Object[] objArr) {
        akh akhVar = (akh) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53003h;
        int i11 = (-2) - (((i10 ^ 78) + ((i10 & 78) << 1)) ^ (-1));
        f53002g = i11 % 128;
        int i12 = i11 % 2;
        if (akhVar.f53009f) {
            int i13 = i10 & 63;
            int i14 = (i10 ^ 63) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            int i16 = i15 % 128;
            f53002g = i16;
            int i17 = i15 % 2;
            int i18 = (i16 ^ 95) + ((i16 & 95) << 1);
            f53003h = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = akhVar.f53005b;
        int i21 = (i20 * (-500)) - (~(-(-(iIntValue * (-500)))));
        int i22 = (i21 ^ (-1)) + (i21 << 1);
        int i23 = ~iIntValue;
        int i24 = ~i20;
        int i25 = (i23 & i24) | ((~i23) & i20);
        int i26 = i23 & i20;
        int i27 = (i25 & i26) | (i25 ^ i26);
        int i28 = ~i27;
        int i29 = (i27 | i28) & i28;
        int i30 = (i20 | i24) & i24;
        int i31 = i30 & i23;
        int i32 = ((~i30) & iIntValue) | i31;
        int i33 = i30 & iIntValue;
        int i34 = (i32 & i33) | (i32 ^ i33);
        int i35 = (i34 & i23) | ((~i34) & iIntValue);
        int i36 = i34 & iIntValue;
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = ~i37;
        int i39 = (i37 | i38) & i38;
        int i40 = i29 & i39;
        int i41 = (i29 | i39) & (~i40);
        int i42 = (-2) - ((i22 - (~(((i41 & i40) | (i41 ^ i40)) * 501))) ^ (-1));
        int i43 = (i23 | iIntValue) & i23;
        int i44 = -(-((~((i24 & i43) | (i24 ^ i43))) * 1002));
        int i45 = i42 & i44;
        int i46 = -(-((i42 ^ i44) | i45));
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        int i48 = i30 ^ i23;
        int i49 = (i48 & i31) | (i48 ^ i31);
        int i50 = (i23 & i49) | ((~i49) & iIntValue);
        int i51 = iIntValue & i49;
        int i52 = (~((i51 & i50) | (i50 ^ i51))) * 501;
        int i53 = i47 & i52;
        int i54 = (i52 | i47) & (~i53);
        int i55 = -(-(i53 << 1));
        int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
        int i57 = f53003h + 49;
        f53002g = i57 % 128;
        if (i57 % 2 == 0) {
            return Integer.valueOf(i56);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r3 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Integer b(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            com.mypinpad.tsdk.i.akh r1 = (com.mypinpad.tsdk.isolation.akh) r1
            r2 = 1
            r9 = r9[r2]
            byte[] r9 = (byte[]) r9
            int r3 = com.mypinpad.tsdk.isolation.akh.f53002g
            r4 = r3 & 80
            r3 = r3 | 80
            int r4 = r4 + r3
            int r4 = r4 - r2
            int r3 = r4 % 128
            com.mypinpad.tsdk.isolation.akh.f53003h = r3
            int r4 = r4 % 2
            r4 = 1691578600(0x64d370e8, float:3.120319E22)
            r5 = -1691578599(0xffffffff9b2c8f19, float:-1.4273744E-22)
            int r6 = r1.f53005b     // Catch: java.lang.Throwable -> L41
            byte[] r7 = r1.f53004a
            int r8 = r9.length     // Catch: java.lang.Throwable -> L41
            if (r6 > r8) goto L87
            if (r6 == 0) goto L68
            r6 = r3 & 99
            r3 = r3 ^ 99
            r3 = r3 | r6
            int r3 = -r3
            int r3 = -r3
            int r3 = ~r3
            int r6 = r6 - r3
            int r6 = r6 - r2
            int r3 = r6 % 128
            com.mypinpad.tsdk.isolation.akh.f53002g = r3
            int r6 = r6 % 2
            boolean r3 = r1.f53008e
            if (r6 == 0) goto L43
            r6 = 84
            int r6 = r6 / r0
            if (r3 == 0) goto L60
            goto L45
        L41:
            r9 = move-exception
            goto L8f
        L43:
            if (r3 == 0) goto L60
        L45:
            com.mypinpad.tsdk.i.aki r3 = r1.f53006c     // Catch: java.lang.Throwable -> L41
            r3.setDividerPadding(r7, r0, r7, r0)     // Catch: java.lang.Throwable -> L41
            int r3 = r1.f53005b     // Catch: java.lang.Throwable -> L41
            r1.f53005b = r0     // Catch: java.lang.Throwable -> L41
            java.lang.System.arraycopy(r7, r0, r9, r0, r3)     // Catch: java.lang.Throwable -> L41
            int r9 = com.mypinpad.tsdk.isolation.akh.f53002g
            int r9 = r9 + 126
            r6 = r9 ^ (-1)
            int r9 = r9 << r2
            int r6 = r6 + r9
            int r9 = r6 % 128
            com.mypinpad.tsdk.isolation.akh.f53003h = r9
            int r6 = r6 % 2
            goto L69
        L60:
            com.mypinpad.tsdk.i.akr r9 = new com.mypinpad.tsdk.i.akr     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "data not block size aligned"
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L41
            throw r9     // Catch: java.lang.Throwable -> L41
        L68:
            r3 = r0
        L69:
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r0] = r1
            int r0 = java.lang.System.identityHashCode(r1)
            setY(r9, r5, r4, r0)
            int r9 = com.mypinpad.tsdk.isolation.akh.f53003h
            int r9 = r9 + 81
            int r0 = r9 % 128
            com.mypinpad.tsdk.isolation.akh.f53002g = r0
            int r9 = r9 % 2
            if (r9 != 0) goto L85
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            return r9
        L85:
            r9 = 0
            throw r9
        L87:
            com.mypinpad.tsdk.i.ald r9 = new com.mypinpad.tsdk.i.ald     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "output buffer too short for doFinal()"
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L41
            throw r9     // Catch: java.lang.Throwable -> L41
        L8f:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            int r0 = java.lang.System.identityHashCode(r1)
            setY(r2, r5, r4, r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.akh.b(java.lang.Object[]):java.lang.Integer");
    }

    public static /* synthetic */ void c(Object[] objArr) {
        akh akhVar = (akh) objArr[0];
        int i10 = f53002g;
        int i11 = i10 ^ 89;
        int i12 = ((i10 & 89) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = i14 % 128;
        f53003h = i15;
        int i16 = i14 % 2 == 0 ? 1 : 0;
        int i17 = i15 & 33;
        int i18 = (i15 ^ 33) | i17;
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        f53002g = i19 % 128;
        int i20 = i19 % 2;
        while (true) {
            byte[] bArr = akhVar.f53004a;
            if (i16 >= bArr.length) {
                break;
            }
            int i21 = f53003h;
            int i22 = (i21 & (-84)) | ((~i21) & 83);
            int i23 = (i21 & 83) << 1;
            int i24 = (i22 & i23) + (i23 | i22);
            f53002g = i24 % 128;
            if (i24 % 2 != 0) {
                bArr[i16] = 0;
                i16 = (i16 ^ 103) + ((i16 & 103) << 1);
            } else {
                bArr[i16] = 0;
                int i25 = i16 & (-18);
                int i26 = ((((i16 ^ (-18)) | i25) << 1) - (~(-((i16 | (-18)) & (~i25))))) - 1;
                int i27 = i26 & 19;
                int i28 = ((i26 ^ 19) | i27) << 1;
                int i29 = -((i26 | 19) & (~i27));
                i16 = (i28 & i29) + (i29 | i28);
            }
        }
        akhVar.f53005b = 0;
        akhVar.f53006c.setOnFocusChangeListener();
        int i30 = f53002g + 1;
        f53003h = i30 % 128;
        if (i30 % 2 == 0) {
            int i31 = 65 / 0;
        }
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        akh akhVar = (akh) objArr[0];
        int i10 = f53002g;
        int i11 = ((i10 ^ 62) + ((i10 & 62) << 1)) - 1;
        f53003h = i11 % 128;
        int i12 = i11 % 2;
        aki akiVar = akhVar.f53006c;
        if (i12 != 0) {
            return Integer.valueOf(akiVar.setY());
        }
        akiVar.setY();
        throw null;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int length;
        aki akiVar;
        int i13;
        akh akhVar;
        int i14;
        int i15;
        int i16;
        int i17 = ~i11;
        int i18 = ~i12;
        int i19 = (((~(i10 | i18 | i11)) | (~(i12 | i17)) | (~((~i10) | i17))) * 988) + ((i10 | i17) * (-988)) + (((~(i17 | i18 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989);
        if (i19 == 1) {
            c(objArr);
            return null;
        }
        if (i19 == 2) {
            return d(objArr);
        }
        if (i19 == 3) {
            return b(objArr);
        }
        if (i19 == 4) {
            akh akhVar2 = (akh) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i20 = f53003h;
            int i21 = (((i20 | 74) << 1) - (i20 ^ 74)) - 1;
            int i22 = i21 % 128;
            f53002g = i22;
            int i23 = i21 % 2;
            int i24 = akhVar2.f53005b;
            int i25 = iIntValue & i24;
            int i26 = ((iIntValue ^ i24) | i25) << 1;
            int i27 = -((i24 | iIntValue) & (~i25));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            boolean z10 = akhVar2.f53009f;
            byte[] bArr = akhVar2.f53004a;
            if (z10) {
                int i29 = (i22 | 9) << 1;
                int i30 = -((i22 & (-10)) | ((~i22) & 9));
                int i31 = (i29 & i30) + (i30 | i29);
                int i32 = i31 % 128;
                f53003h = i32;
                int i33 = i31 % 2;
                length = i28 % bArr.length;
                int i34 = (i32 ^ 107) + ((i32 & 107) << 1);
                f53002g = i34 % 128;
                int i35 = i34 % 2;
            } else {
                length = i28 % bArr.length;
                int i36 = (-2) - ((((i20 | 64) << 1) - (i20 ^ 64)) ^ (-1));
                f53002g = i36 % 128;
                int i37 = i36 % 2;
            }
            int i38 = -length;
            int i39 = i38 * (-129);
            int i40 = i28 * 131;
            int i41 = ((((i39 ^ i40) | (i39 & i40)) << 1) - (~(-(((~i39) & i40) | ((~i40) & i39))))) - 1;
            int i42 = ~i28;
            int i43 = ~iIntValue;
            int i44 = ((~i43) & i42) | ((~i42) & i43);
            int i45 = i42 & i43;
            int i46 = (i44 & i45) | (i44 ^ i45);
            int i47 = i46 ^ i38;
            int i48 = i46 & i38;
            int i49 = (~((i48 & i47) | (i47 ^ i48))) * 130;
            int i50 = i41 ^ i49;
            int i51 = ((i41 & i49) | i50) << 1;
            int i52 = -i50;
            int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
            int i54 = i42 & i38;
            int i55 = (~i54) & (i42 | i38);
            int i56 = ~i38;
            int i57 = -(-((~(i55 | i54)) * (-260)));
            int i58 = i53 & i57;
            int i59 = i58 + ((i57 ^ i53) | i58);
            int i60 = (i56 | i38) & i56;
            int i61 = i60 & i28;
            int i62 = (i60 | i28) & (~i61);
            int i63 = (i62 & i61) | (i62 ^ i61);
            int i64 = ~i63;
            int i65 = (i63 | i64) & i64;
            int i66 = i38 ^ i42;
            int i67 = (i66 & i54) | (i66 ^ i54);
            int i68 = (i67 & i43) | ((~i67) & iIntValue);
            int i69 = i67 & iIntValue;
            int i70 = (i69 & i68) | (i68 ^ i69);
            int i71 = ~i70;
            int i72 = (i70 | i71) & i71;
            int i73 = -(-(((i72 & i65) | (i65 ^ i72)) * 130));
            int i74 = i59 & i73;
            int i75 = (i73 | i59) & (~i74);
            int i76 = i74 << 1;
            int i77 = (i75 & i76) + (i75 | i76);
            int i78 = f53003h;
            int i79 = (i78 ^ 23) + ((i78 & 23) << 1);
            f53002g = i79 % 128;
            int i80 = i79 % 2;
            return Integer.valueOf(i77);
        }
        if (i19 == 5) {
            return a(objArr);
        }
        akh akhVar3 = (akh) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        byte[] bArr3 = (byte[]) objArr[4];
        int i81 = f53003h;
        int i82 = ((i81 ^ 91) | (i81 & 91)) << 1;
        int i83 = -(((~i81) & 91) | (i81 & (-92)));
        int i84 = (i82 & i83) + (i83 | i82);
        f53002g = i84 % 128;
        int i85 = i84 % 2;
        if (iIntValue3 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int iIntValue4 = ((Integer) setY(new Object[]{akhVar3}, -1736273225, 1736273227, System.identityHashCode(akhVar3))).intValue();
        int iIntValue5 = ((Integer) setY(new Object[]{akhVar3, Integer.valueOf(iIntValue3)}, -1498406433, 1498406437, iIntValue3)).intValue();
        if (iIntValue5 > 0) {
            int i86 = f53003h;
            int i87 = i86 & 49;
            int i88 = (i86 | 49) & (~i87);
            int i89 = -(-(i87 << 1));
            int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
            f53002g = i90 % 128;
            int i91 = i90 % 2;
            if (iIntValue5 > bArr3.length) {
                throw new ald("output buffer too short");
            }
        }
        byte[] bArr4 = akhVar3.f53004a;
        int length2 = bArr4.length;
        int i92 = akhVar3.f53005b;
        int i93 = -i92;
        int i94 = i93 * (-337);
        int i95 = length2 * 339;
        int i96 = (i94 & i95) + (i94 | i95);
        int i97 = ~i93;
        int i98 = ~iIntValue2;
        int i99 = i98 & (i98 | iIntValue2);
        int i100 = i97 & i99;
        int i101 = (~i100) & (i97 | i99);
        int i102 = ~i99;
        int i103 = ~(i101 | i100);
        int i104 = ~length2;
        int i105 = i104 ^ i93;
        int i106 = i104 & i93;
        int i107 = ~((i105 ^ i106) | (i105 & i106));
        int i108 = (i103 ^ i107) | (i103 & i107);
        int i109 = (i93 & i98) | (iIntValue2 & i97);
        int i110 = i93 & iIntValue2;
        int i111 = (i109 ^ i110) | (i109 & i110);
        int i112 = iIntValue4;
        int i113 = ~i111;
        int i114 = -(-((i108 | ((i111 | i113) & i113)) * (-338)));
        int i115 = (i96 ^ i114) + ((i96 & i114) << 1);
        int i116 = -(-((~((i97 ^ length2) | (i97 & length2))) * 338));
        int i117 = i115 & i116;
        int i118 = -(-(i116 | i115));
        int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
        int i120 = (i97 | i93) & i97;
        int i121 = ~i98;
        int i122 = (i120 & i98) | (i120 & i121) | ((~i120) & i98);
        int i123 = ~i122;
        int i124 = (i122 | i123) & i123;
        int i125 = (i93 ^ length2) | (length2 & i93);
        int i126 = ~((i125 & iIntValue2) | (i125 ^ iIntValue2));
        int i127 = ((i124 & i126) | (i124 ^ i126)) * 338;
        int i128 = (i127 | i119) + (i119 & i127);
        aki akiVar2 = akhVar3.f53006c;
        if (iIntValue3 > i128) {
            int i129 = f53003h;
            int i130 = i129 ^ 19;
            int i131 = ((i129 & 19) | i130) << 1;
            int i132 = -i130;
            int i133 = (i131 ^ i132) + ((i131 & i132) << 1);
            f53002g = i133 % 128;
            int i134 = i133 % 2;
            System.arraycopy(bArr2, 0, bArr4, i92, i128);
            int dividerPadding = akiVar2.setDividerPadding(bArr4, 0, bArr3, 0);
            int i135 = (-1) - (~(-(-(dividerPadding * (-519)))));
            int i136 = ~dividerPadding;
            int i137 = (~i136) | i136;
            int i138 = i137 & i98;
            aki akiVar3 = akiVar2;
            int i139 = (~i138) & (i137 | i98);
            int i140 = ~((i139 & i138) | (i139 ^ i138));
            int i141 = (i140 & i102) | ((~i140) & i99);
            int i142 = i140 & i99;
            int i143 = ((i142 & i141) | (i141 ^ i142)) * 520;
            int i144 = i135 & i143;
            int i145 = i143 | i135;
            int i146 = (i144 ^ i145) + ((i145 & i144) << 1);
            int i147 = ~((i121 ^ i98) | (i121 & i98));
            int i148 = dividerPadding & iIntValue2;
            int i149 = ~((dividerPadding ^ iIntValue2) | i148);
            int i150 = ((i147 ^ i149) | (i147 & i149)) * (-1040);
            int i151 = (i146 & i150) + (i150 | i146);
            int i152 = (i136 | dividerPadding) & i136;
            int i153 = ~((i152 & i98) | (i152 ^ i98));
            int i154 = ~(((-1) ^ dividerPadding) | dividerPadding);
            int i155 = (i153 & i154) | (i153 ^ i154);
            int i156 = (~i148) & (dividerPadding | iIntValue2);
            int i157 = ~((i156 & i148) | (i156 ^ i148));
            int i158 = i155 ^ i157;
            int i159 = i155 & i157;
            int i160 = ((i159 & i158) | (i158 ^ i159)) * 520;
            int i161 = ((i151 ^ i160) | (i151 & i160)) << 1;
            int i162 = -((i160 & (~i151)) | ((~i160) & i151));
            int i163 = ((i162 & i161) << 1) + (i161 ^ i162);
            akhVar3.f53005b = 0;
            int i164 = -i128;
            int i165 = (iIntValue3 * (-518)) + (i164 * (-518));
            int i166 = ~i164;
            int i167 = (i166 ^ i98) | (i166 & i98);
            int i168 = ~i167;
            int i169 = (i167 | i168) & i168;
            int i170 = iIntValue3 ^ i169;
            int i171 = i169 & iIntValue3;
            int i172 = ((i170 ^ i171) | (i171 & i170)) * 519;
            int i173 = ((((i165 ^ i172) | (i165 & i172)) << 1) - (~(-(((~i172) & i165) | ((~i165) & i172))))) - 1;
            int i174 = (i166 | i164) & i166;
            int i175 = (i174 & i121) | ((~i174) & i98);
            int i176 = i174 & i98;
            int i177 = (i176 & i175) | (i175 ^ i176);
            int i178 = ~((i177 & iIntValue3) | (i177 ^ iIntValue3));
            int i179 = i164 & iIntValue3;
            int i180 = ~(i179 | ((~i179) & (i164 | iIntValue3)) | iIntValue2);
            int i181 = ((i178 & i180) | ((~i180) & i178) | ((~i178) & i180)) * (-519);
            int i182 = i173 & i181;
            int i183 = -(-((i181 ^ i173) | i182));
            int i184 = (i182 & i183) + (i183 | i182);
            int i185 = (iIntValue3 & i98) | ((~iIntValue3) & iIntValue2);
            int i186 = iIntValue3 & iIntValue2;
            int i187 = ~((i185 & i186) | (i185 ^ i186));
            int i188 = i164 ^ i187;
            int i189 = i187 & i164;
            int i190 = ((i189 & i188) | (i188 ^ i189)) * 519;
            iIntValue3 = (i184 & i190) + (i190 | i184);
            akz akzVar = akhVar3.f53007d;
            if (akzVar != null) {
                int i191 = f53003h;
                int i192 = i191 & 119;
                int i193 = i192 + ((i191 ^ 119) | i192);
                f53002g = i193 % 128;
                int i194 = i193 % 2;
                int x4 = akzVar.setX();
                if (i194 == 0 ? (i15 = iIntValue3 / x4) <= 0 : (i15 = iIntValue3 >> x4) <= 0) {
                    i13 = i98;
                    i16 = 2;
                } else {
                    int i195 = i15;
                    int i196 = f53003h;
                    int i197 = (((i196 & (-16)) | ((~i196) & 15)) - (~((i196 & 15) << 1))) - 1;
                    f53002g = i197 % 128;
                    int i198 = i197 % 2;
                    i13 = i98;
                    int x6 = akhVar3.f53007d.setX(bArr2, i128, i195, bArr3, i163);
                    int i199 = ((x6 * (-1965)) - (~(-(~(i163 * 984))))) - 2;
                    int i200 = ~i163;
                    int i201 = (i200 | i163) & i200;
                    int i202 = (~i201) & x6;
                    int i203 = ~x6;
                    int i204 = i202 | (i201 & i203);
                    int i205 = i201 & x6;
                    int i206 = (i199 - (~(((i204 ^ i205) | (i205 & i204)) * 983))) - 1;
                    int i207 = (x6 | i203) & i203;
                    int i208 = i200 ^ i13;
                    int i209 = i200 & i13;
                    int i210 = (i208 ^ i209) | (i208 & i209);
                    int i211 = ~i210;
                    int i212 = (i210 | i211) & i211;
                    int i213 = i207 & i212;
                    int i214 = (~i213) & (i212 | i207);
                    int i215 = -(~(-(-(((i214 & i213) | (i214 ^ i213)) * (-983)))));
                    int i216 = (((i206 | i215) << 1) - (i215 ^ i206)) - 1;
                    int i217 = ~((i203 ^ i99) | (i203 & i99));
                    int i218 = (i207 & i200) | ((~i207) & i163);
                    int i219 = i163 & i207;
                    int i220 = ~((i219 & i218) | (i218 ^ i219));
                    int i221 = ((i217 & i220) | (i217 ^ i220)) * 983;
                    int i222 = i216 & i221;
                    i163 = i222 + ((i221 ^ i216) | i222);
                    int x7 = akzVar.setX() * i195;
                    iIntValue3 -= x7;
                    int i223 = x7 * (-661);
                    int i224 = -(-(i128 * (-661)));
                    int i225 = i223 & i224;
                    int i226 = ((i223 ^ i224) | i225) << 1;
                    int i227 = -((i223 | i224) & (~i225));
                    int i228 = (i226 & i227) + (i227 | i226);
                    int i229 = ~x7;
                    int i230 = ~i229;
                    int i231 = ~i128;
                    int i232 = (i231 | i128) & i231;
                    int i233 = i229 & i232;
                    int i234 = ~(((i232 | i229) & (~i233)) | i233);
                    int i235 = i13 & i234;
                    int i236 = (i13 | i234) & (~i235);
                    int i237 = -(-(((i236 & i235) | (i236 ^ i235)) * 1324));
                    int i238 = i228 & i237;
                    int i239 = (i238 - (~(-(-((i228 ^ i237) | i238))))) - 1;
                    int i240 = x7 & iIntValue2;
                    int i241 = (~i240) & (x7 | iIntValue2);
                    int i242 = ~((i240 & i241) | (i241 ^ i240));
                    int i243 = i128 & iIntValue2;
                    int i244 = (~i243) & (i128 | iIntValue2);
                    int i245 = ~((i244 ^ i243) | (i243 & i244));
                    int i246 = -(-(((i242 & i245) | (i242 ^ i245)) * (-1324)));
                    int i247 = i239 & i246;
                    int i248 = (i246 | i239) & (~i247);
                    int i249 = i247 << 1;
                    int i250 = ((i248 | i249) << 1) - (i248 ^ i249);
                    int i251 = (i229 & i231) | (i230 & i128);
                    int i252 = i229 & i128;
                    int i253 = (i252 & i251) | (i251 ^ i252);
                    int i254 = ~i253;
                    int i255 = (i253 | i254) & i254;
                    int i256 = i231 & x7;
                    int i257 = ~(((x7 | i231) & (~i256)) | i256);
                    int i258 = -(~(-(-(((i257 & i255) | (i255 ^ i257)) * 662))));
                    i128 = ((i250 & i258) + (i258 | i250)) - 1;
                    int i259 = f53003h;
                    int i260 = (i259 & (-114)) | ((~i259) & 113);
                    int i261 = -(-((i259 & 113) << 1));
                    int i262 = (i260 & i261) + (i261 | i260);
                    f53002g = i262 % 128;
                    i16 = 2;
                    int i263 = i262 % 2;
                }
                int i264 = f53002g + 53;
                f53003h = i264 % 128;
                int i265 = i264 % i16;
                i14 = i163;
                akiVar = akiVar3;
            } else {
                akhVar3 = akhVar3;
                i13 = i98;
                while (iIntValue3 > bArr4.length) {
                    int i266 = f53002g;
                    int i267 = i266 & 59;
                    int i268 = i267 + ((i266 ^ 59) | i267);
                    f53003h = i268 % 128;
                    int i269 = i268 % 2;
                    aki akiVar4 = akiVar3;
                    int dividerPadding2 = akiVar4.setDividerPadding(bArr2, i128, bArr3, i163);
                    int i270 = dividerPadding2 * (-518);
                    int i271 = i163 * (-518);
                    int i272 = ((~i271) & i270) | ((~i270) & i271);
                    int i273 = (i270 & i271) << 1;
                    int i274 = (i272 & i273) + (i273 | i272);
                    int i275 = ~dividerPadding2;
                    int i276 = (i275 | dividerPadding2) & i275;
                    int i277 = (i276 & i121) | (i13 & (~i276));
                    int i278 = i276 & i13;
                    int i279 = (i278 & i277) | (i277 ^ i278);
                    int i280 = ~i279;
                    int i281 = (i279 | i280) & i280;
                    int i282 = (~i281) & i163;
                    int i283 = ~i163;
                    int i284 = i282 | (i281 & i283);
                    int i285 = i281 & i163;
                    int i286 = -(~(-(-(((i285 & i284) | (i284 ^ i285)) * 519))));
                    int i287 = ((i274 & i286) + (i274 | i286)) - 1;
                    int i288 = (i275 ^ i13) | (i275 & i13);
                    int i289 = (i288 & i283) | ((~i288) & i163);
                    int i290 = i288 & i163;
                    int i291 = ~((i290 & i289) | (i289 ^ i290));
                    int i292 = (dividerPadding2 ^ i163) | (dividerPadding2 & i163);
                    int i293 = i292 ^ iIntValue2;
                    int i294 = i292 & iIntValue2;
                    int i295 = (i293 ^ i294) | (i294 & i293);
                    int i296 = ~i295;
                    int i297 = (i295 | i296) & i296;
                    int i298 = (-2) - ((i287 - (~(((i291 & i297) | (i291 ^ i297)) * (-519)))) ^ (-1));
                    int i299 = (i163 & i13) | (iIntValue2 & i283);
                    int i300 = i163 & iIntValue2;
                    int i301 = ~((i300 & i299) | (i299 ^ i300));
                    int i302 = (i275 & i301) | ((~i301) & dividerPadding2);
                    int i303 = dividerPadding2 & i301;
                    i163 = (((i303 & i302) | (i302 ^ i303)) * 519) + i298;
                    int i304 = i112;
                    int i305 = -i304;
                    int i306 = ((iIntValue3 & i305) - (~(-(-(iIntValue3 | i305))))) - 1;
                    i128 = ((i128 | i304) << 1) - (i128 ^ i304);
                    int i307 = f53003h;
                    int i308 = i307 & 101;
                    int i309 = ((i307 ^ 101) | i308) << 1;
                    int i310 = -((~i308) & (i307 | 101));
                    int i311 = (i309 & i310) + (i310 | i309);
                    f53002g = i311 % 128;
                    int i312 = i311 % 2;
                    akiVar3 = akiVar4;
                    i112 = i304;
                    iIntValue3 = i306;
                }
                akiVar = akiVar3;
                i14 = i163;
            }
            akhVar = akhVar3;
        } else {
            akiVar = akiVar2;
            i13 = i98;
            i128 = iIntValue2;
            akhVar = akhVar3;
            i14 = 0;
        }
        System.arraycopy(bArr2, i128, bArr4, akhVar.f53005b, iIntValue3);
        int i313 = akhVar.f53005b;
        int i314 = (((i313 ^ iIntValue3) | (i313 & iIntValue3)) << 1) - (((~i313) & iIntValue3) | ((~iIntValue3) & i313));
        akhVar.f53005b = i314;
        if (i314 == bArr4.length) {
            int dividerPadding3 = akiVar.setDividerPadding(bArr4, 0, bArr3, i14);
            int i315 = ((dividerPadding3 * Opcodes.INSTANCEOF) - (~(-(-(i14 * Opcodes.INSTANCEOF))))) - 1;
            int i316 = ~dividerPadding3;
            int i317 = (i316 | dividerPadding3) & i316;
            int i318 = ~((i317 ^ i14) | (i317 & i14));
            int i319 = ((i13 & i318) | (i13 & (~i318)) | (i318 & i121)) * (-192);
            int i320 = i315 & i319;
            int i321 = (i315 ^ i319) | i320;
            int i322 = (i320 ^ i321) + ((i321 & i320) << 1);
            int i323 = ~i14;
            int i324 = (i323 | i14) & i323;
            int i325 = ~((i316 ^ i324) | (i316 & i324));
            int i326 = i324 ^ i13;
            int i327 = i324 & i13;
            int i328 = ~((i326 & i327) | (i326 ^ i327));
            int i329 = ((i325 & i328) | (i325 ^ i328)) * (-384);
            int i330 = (i322 & i329) + (i322 | i329);
            int i331 = (i317 & i324) | (i317 ^ i324);
            int i332 = i331 & iIntValue2;
            int i333 = (i331 | iIntValue2) & (~i332);
            int i334 = (i333 & i332) | (i333 ^ i332);
            int i335 = ~i334;
            int i336 = (i334 | i335) & i335;
            int i337 = (i323 & i102) | ((~i323) & i99);
            int i338 = i323 & i99;
            int i339 = (i338 & i337) | (i337 ^ i338);
            int i340 = (i316 & i339) | ((~i339) & dividerPadding3);
            int i341 = i339 & dividerPadding3;
            int i342 = (i341 & i340) | (i340 ^ i341);
            int i343 = ~i342;
            int i344 = (i342 | i343) & i343;
            int i345 = ((~i344) & i336) | ((~i336) & i344);
            int i346 = i344 & i336;
            int i347 = (i346 & i345) | (i345 ^ i346);
            int i348 = dividerPadding3 | i14;
            int i349 = i348 ^ iIntValue2;
            int i350 = i348 & iIntValue2;
            int i351 = (i350 & i349) | (i349 ^ i350);
            int i352 = ~i351;
            int i353 = (i351 | i352) & i352;
            int i354 = i347 & i353;
            int i355 = (i353 | i347) & (~i354);
            int i356 = -(-(((i355 & i354) | (i355 ^ i354)) * 192));
            i14 = (((i330 ^ i356) | (i330 & i356)) << 1) - ((i356 & (~i330)) | ((~i356) & i330));
            akhVar.f53005b = 0;
            int i357 = f53003h;
            int i358 = i357 & 41;
            int i359 = ((i357 | 41) & (~i358)) + (i358 << 1);
            f53002g = i359 % 128;
            int i360 = i359 % 2;
        }
        int i361 = f53002g;
        int i362 = i361 & 125;
        int i363 = -(-((i361 ^ 125) | i362));
        int i364 = ((i362 | i363) << 1) - (i363 ^ i362);
        f53003h = i364 % 128;
        int i365 = i364 % 2;
        return Integer.valueOf(i14);
    }

    public final int setDividerPadding(byte[] bArr, int i10, int i11, byte[] bArr2) throws IllegalStateException, akr {
        return ((Integer) setY(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11), bArr2}, 1000438278, -1000438278, i10)).intValue();
    }

    public final int setOnFocusChangeListener(int i10) {
        return ((Integer) setY(new Object[]{this, Integer.valueOf(i10)}, 428416267, -428416262, i10)).intValue();
    }

    public final int setDividerPadding(int i10) {
        return ((Integer) setY(new Object[]{this, Integer.valueOf(i10)}, -1498406433, 1498406437, i10)).intValue();
    }

    public final int setY(byte[] bArr) throws akx, IllegalStateException, akr {
        return ((Integer) setY(new Object[]{this, bArr}, 284365035, -284365032, System.identityHashCode(this))).intValue();
    }
}
