package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aeh extends ady implements aem {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52541x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52542y0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f52543t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f52544u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final add f52545w0;

    public aeh(int i10, int i11, int i12, add addVar) {
        if (addVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i11 == 0 || (i11 & 192) != i11) {
            throw new IllegalArgumentException("invalid tag class: ".concat(String.valueOf(i11)));
        }
        this.f52543t0 = addVar instanceof adg ? 1 : i10;
        this.f52544u0 = i11;
        this.v0 = i12;
        this.f52545w0 = addVar;
    }

    public static /* synthetic */ Boolean g(Object[] objArr) {
        Boolean bool = Boolean.FALSE;
        aeh aehVar = (aeh) objArr[0];
        ady adyVar = (ady) objArr[1];
        int i10 = f52541x0;
        int i11 = i10 & 33;
        int i12 = -(-((i10 ^ 33) | i11));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f52542y0 = i13 % 128;
        int i14 = i13 % 2;
        if (!(adyVar instanceof aeh)) {
            int i15 = i10 & 105;
            int i16 = (i10 ^ 105) | i15;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            int i18 = i17 % 128;
            f52542y0 = i18;
            int i19 = i17 % 2;
            int i20 = i18 & 103;
            int i21 = ((i18 | 103) & (~i20)) + (i20 << 1);
            f52541x0 = i21 % 128;
            int i22 = i21 % 2;
            return bool;
        }
        aeh aehVar2 = (aeh) adyVar;
        if (aehVar.v0 == aehVar2.v0) {
            int i23 = ((i10 | 81) << 1) - (i10 ^ 81);
            f52542y0 = i23 % 128;
            if (i23 % 2 == 0) {
                throw null;
            }
            if (aehVar.f52544u0 == aehVar2.f52544u0) {
                if (aehVar.f52543t0 != aehVar2.f52543t0) {
                    int i24 = i10 + 79;
                    f52542y0 = i24 % 128;
                    int i25 = i24 % 2;
                    if (((Boolean) setOnFocusChangeListener(new Object[]{aehVar}, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue() != ((Boolean) setOnFocusChangeListener(new Object[]{aehVar2}, 1029869480, -1029869472, System.identityHashCode(aehVar2))).booleanValue()) {
                        int i26 = f52542y0;
                        int i27 = i26 & 35;
                        int i28 = -(-(i26 | 35));
                        int i29 = (i27 & i28) + (i28 | i27);
                        int i30 = i29 % 128;
                        f52541x0 = i30;
                        int i31 = i29 % 2;
                        int i32 = ((i30 | 100) << 1) - (i30 ^ 100);
                        int i33 = (i32 ^ (-1)) + (i32 << 1);
                        f52542y0 = i33 % 128;
                        if (i33 % 2 == 0) {
                            int i34 = 37 / 0;
                        }
                        return bool;
                    }
                }
                ady adyVarUiMessageCallbackKtWhenMappings = aehVar.f52545w0.UiMessageCallbackKtWhenMappings();
                ady adyVarUiMessageCallbackKtWhenMappings2 = aehVar2.f52545w0.UiMessageCallbackKtWhenMappings();
                if (adyVarUiMessageCallbackKtWhenMappings == adyVarUiMessageCallbackKtWhenMappings2) {
                    int i35 = f52542y0;
                    int i36 = (i35 ^ 123) + ((i35 & 123) << 1);
                    int i37 = i36 % 128;
                    f52541x0 = i37;
                    int i38 = i36 % 2;
                    int i39 = i37 + 99;
                    f52542y0 = i39 % 128;
                    if (i39 % 2 != 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
                if (((Boolean) setOnFocusChangeListener(new Object[]{aehVar}, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue()) {
                    boolean zD = adyVarUiMessageCallbackKtWhenMappings.d(adyVarUiMessageCallbackKtWhenMappings2);
                    int i40 = f52542y0;
                    int i41 = (((i40 | 33) << 1) - (~(-(((~i40) & 33) | (i40 & (-34)))))) - 1;
                    f52541x0 = i41 % 128;
                    if (i41 % 2 == 0) {
                        return Boolean.valueOf(zD);
                    }
                    throw null;
                }
                int iIdentityHashCode = System.identityHashCode(aehVar) | (-1297853850);
                int i42 = ~iIdentityHashCode;
                int i43 = (iIdentityHashCode | i42) & i42;
                int i44 = ((~i43) & (-1990426465)) | (1990426464 & i43);
                int i45 = i43 & (-1990426465);
                int i46 = ((i45 & i44) | (i44 ^ i45)) * (-220);
                int i47 = ((-241009062) ^ i46) + ((i46 & (-241009062)) << 1);
                int i48 = -(~(((156795033 & i42) | (156795033 ^ i42)) * 220));
                int i49 = 991254674 - ((((i47 | i48) << 1) - (i48 ^ i47)) ^ (-1));
                int iIdentityHashCode2 = System.identityHashCode(aehVar);
                int i50 = ~iIdentityHashCode2;
                int i51 = ((-1977078747) & i50) | ((-1977078747) ^ i50);
                int i52 = ~i51;
                int i53 = (i51 | i52) & i52;
                int i54 = ((~i53) & 622067994) | (i53 & (-622067995));
                int i55 = i53 & 622067994;
                int i56 = -(~(-(-(((i55 & i54) | (i54 ^ i55)) * 168))));
                int i57 = (((-805791532) ^ i56) + ((i56 & (-805791532)) << 1)) - 1;
                int i58 = (-622067995) & iIdentityHashCode2;
                int i59 = (~(i58 | ((~i58) & ((-622067995) | iIdentityHashCode2)))) * 168;
                int i60 = i57 ^ i59;
                int i61 = -(-((i59 & i57) << 1));
                int i62 = (i60 & i61) + (i61 | i60);
                int i63 = i50 & (i50 | iIdentityHashCode2);
                int i64 = ~((i63 & 1355012837) | (1355012837 ^ i63));
                int i65 = i64 & (-1977080832);
                int i66 = (i64 | (-1977080832)) & (~i65);
                int i67 = (i66 & i65) | (i66 ^ i65);
                int i68 = (-1355010753) & iIdentityHashCode2;
                int i69 = ~(((iIdentityHashCode2 | (-1355010753)) & (~i68)) | i68);
                int i70 = ((~i69) & i67) | ((~i67) & i69);
                int i71 = i69 & i67;
                int i72 = ((i71 & i70) | (i70 ^ i71)) * 168;
                int i73 = i62 & i72;
                int i74 = ((i62 ^ i72) | i73) << 1;
                int i75 = -((i72 | i62) & (~i73));
                try {
                    if (i49 > (i74 & i75) + (i75 | i74)) {
                        return Boolean.valueOf(((Boolean) bek.setOnFocusChangeListener(new Object[]{aehVar.setAlwaysDrawnWithCacheEnabled(), aehVar2.setAlwaysDrawnWithCacheEnabled()}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue());
                    }
                    ((Boolean) bek.setOnFocusChangeListener(new Object[]{aehVar.setAlwaysDrawnWithCacheEnabled(), aehVar2.setAlwaysDrawnWithCacheEnabled()}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                } catch (IOException unused) {
                    return Boolean.FALSE;
                }
            }
        }
        int i76 = i10 & 29;
        int i77 = (~i76) & (i10 | 29);
        int i78 = i76 << 1;
        int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
        f52542y0 = i79 % 128;
        int i80 = i79 % 2;
        return bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r0}, 1029869480, -1029869472, java.lang.System.identityHashCode(r0))).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.j0.c(-589139092, 589139094, java.lang.System.identityHashCode(r4), new java.lang.Object[]{r4, r0.f52545w0.UiMessageCallbackKtWhenMappings()});
        r1 = com.mypinpad.tsdk.isolation.aeh.f52541x0;
        r2 = ((r1 & 58) + (r1 | 58)) - 1;
        com.mypinpad.tsdk.isolation.aeh.f52542y0 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c0, code lost:
    
        throw new java.lang.IllegalStateException("object explicit - implicit expected.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x05f6, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.adh.setCompoundDrawableTintBlendMode(r6, -186238093, 186238095, java.lang.System.identityHashCode(r5))).intValue() == 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0609, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.adh.setCompoundDrawableTintBlendMode(r6, -186238093, 186238095, java.lang.System.identityHashCode(r5))).intValue() == 1) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x060b, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.aeh.f52541x0;
        r7 = ((r6 | 13) << 1) - (r6 ^ 13);
        r6 = r7 % 128;
        com.mypinpad.tsdk.isolation.aeh.f52542y0 = r6;
        r7 = r7 % 2;
        r7 = (r6 & (-12)) | ((~r6) & 11);
        r3 = (11 & r6) << 1;
        r6 = ((r7 | r3) << 1) - (r3 ^ r7);
        com.mypinpad.tsdk.isolation.aeh.f52541x0 = r6 % 128;
        r6 = r6 % 2;
        r3 = new com.mypinpad.tsdk.isolation.afd(3, r0, r4, (com.mypinpad.tsdk.isolation.add) com.mypinpad.tsdk.isolation.adh.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5, 0}, 2076264086, -2076264080, 0));
        r0 = com.mypinpad.tsdk.isolation.aeh.f52541x0;
        r1 = r0 ^ 97;
        r0 = -(-((r0 & 97) << 1));
        r2 = (r1 ^ r0) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.aeh.f52542y0 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0655, code lost:
    
        r2 = com.mypinpad.tsdk.isolation.aeh.f52541x0;
        r3 = r2 ^ 9;
        r2 = (r2 & 9) << 1;
        r6 = (r3 & r2) + (r2 | r3);
        com.mypinpad.tsdk.isolation.aeh.f52542y0 = r6 % 128;
        r6 = r6 % 2;
        r3 = new java.lang.Object[]{r5};
        java.lang.System.currentTimeMillis();
        r5 = com.mypinpad.tsdk.isolation.k0.f56736a;
        r3 = (com.mypinpad.tsdk.isolation.adh) r3[0];
        r5 = com.mypinpad.tsdk.isolation.k0.f56737b;
        r6 = (((r5 ^ 107) | (r5 & 107)) << 1) - (((~r5) & 107) | (r5 & (-108)));
        com.mypinpad.tsdk.isolation.k0.f56738c = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x069a, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.adh.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3}, -186238093, 186238095, java.lang.System.identityHashCode(r3))).intValue() > 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x069c, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.k0.f56737b;
        r3 = (r1 & 87) + (r1 | 87);
        r1 = r3 % 128;
        com.mypinpad.tsdk.isolation.k0.f56738c = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x06a8, code lost:
    
        if ((r3 % 2) == 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x06aa, code lost:
    
        r3 = r1 ^ 121;
        r1 = ((((r1 & 121) | r3) << 1) - (~(-r3))) - 1;
        com.mypinpad.tsdk.isolation.k0.f56737b = r1 % 128;
        r1 = r1 % 2;
        r1 = com.mypinpad.tsdk.isolation.k0.f56736a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x06bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x06bd, code lost:
    
        r1 = new com.mypinpad.tsdk.isolation.aey(r3);
        r3 = com.mypinpad.tsdk.isolation.k0.f56737b;
        r5 = r3 & 25;
        r3 = ((r3 | 25) & (~r5)) + (r5 << 1);
        com.mypinpad.tsdk.isolation.k0.f56738c = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x06d2, code lost:
    
        if ((r3 % 2) == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x06d4, code lost:
    
        r2 = new com.mypinpad.tsdk.isolation.afd(4, r0, r4, r1);
        r0 = com.mypinpad.tsdk.isolation.aeh.f52541x0;
        r1 = r0 & 75;
        r0 = (r0 | 75) & (~r1);
        r1 = -(-(r1 << 1));
        r3 = (r0 ^ r1) + ((r0 & r1) << 1);
        com.mypinpad.tsdk.isolation.aeh.f52542y0 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x06ee, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x06ef, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[]{r0}, 1029869480, -1029869472, java.lang.System.identityHashCode(r0))).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setOnFocusChangeListener(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aeh.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady a() {
        agm agmVar = new agm(this.f52543t0, this.f52544u0, this.v0, this.f52545w0);
        int i10 = f52541x0;
        int i11 = ((i10 ^ 1) - (~(-(-((i10 & 1) << 1))))) - 1;
        f52542y0 = i11 % 128;
        int i12 = i11 % 2;
        return agmVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, adyVar}, -384773638, 384773640, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady e() {
        afx afxVar = new afx(this.f52543t0, this.f52544u0, this.v0, this.f52545w0);
        int i10 = f52542y0;
        int i11 = (((i10 | 72) << 1) - (i10 ^ 72)) - 1;
        f52541x0 = i11 % 128;
        int i12 = i11 % 2;
        return afxVar;
    }

    public abstract aed f(ady adyVar);

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10;
        int i11 = f52541x0;
        int i12 = (i11 & (-10)) | ((~i11) & 9);
        int i13 = -(-((i11 & 9) << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        f52542y0 = i14 % 128;
        int i15 = i14 % 2;
        int i16 = this.f52544u0 * 7919;
        int i17 = this.v0;
        int i18 = (i16 | i17) & (~(i16 & i17));
        if (!((Boolean) setOnFocusChangeListener(new Object[]{this}, 1029869480, -1029869472, System.identityHashCode(this))).booleanValue()) {
            int i19 = f52542y0;
            int i20 = (i19 & 23) + (i19 | 23);
            f52541x0 = i20 % 128;
            int i21 = i20 % 2;
            i10 = 240;
        } else {
            int i22 = f52541x0;
            int i23 = i22 & 41;
            int i24 = ((i22 ^ 41) | i23) << 1;
            int i25 = -((i22 | 41) & (~i23));
            int i26 = (i24 & i25) + (i25 | i24);
            f52542y0 = i26 % 128;
            i10 = i26 % 2 == 0 ? 27 : 15;
        }
        int i27 = i18 & i10;
        int i28 = ((i18 ^ i10) | i27) & (~i27);
        int iHashCode = this.f52545w0.UiMessageCallbackKtWhenMappings().hashCode();
        int i29 = (~iHashCode) & i28;
        int i30 = (~i28) & iHashCode;
        int i31 = (i30 & i29) | (i29 ^ i30);
        int i32 = f52542y0;
        int i33 = i32 & 9;
        int i34 = -(-((i32 ^ 9) | i33));
        int i35 = (i33 & i34) + (i34 | i33);
        f52541x0 = i35 % 128;
        int i36 = i35 % 2;
        return i31;
    }

    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1417963191, 1417963201, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, 923737994, -923737990, System.identityHashCode(this));
    }

    public final adw setNavigationOnClickListener() {
        return (adw) setOnFocusChangeListener(new Object[]{this}, 1624263323, -1624263310, System.identityHashCode(this));
    }

    public final adw setOnDragListener() {
        return (adw) setOnFocusChangeListener(new Object[]{this}, 872654789, -872654774, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1270018882, -1270018871, System.identityHashCode(this))).intValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f52544u0;
        sb2.append((String) aeu.setX(new Object[]{Integer.valueOf(i10), Integer.valueOf(this.v0)}, 1539419709, -1539419709, i10));
        sb2.append(this.f52545w0);
        String string = sb2.toString();
        int i11 = f52541x0 + 83;
        f52542y0 = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public aeh(boolean z10, int i10, add addVar) {
        this(z10 ? 1 : 2, 128, i10, addVar);
    }

    public static aeh setCompoundDrawableTintBlendMode(aeh aehVar) {
        return (aeh) setOnFocusChangeListener(new Object[]{aehVar}, 1689127353, -1689127341, (int) System.currentTimeMillis());
    }

    public static aeh setX(Object obj) {
        return (aeh) setOnFocusChangeListener(new Object[]{obj}, -1361475358, 1361475364, (int) System.currentTimeMillis());
    }

    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1029869480, -1029869472, System.identityHashCode(this))).booleanValue();
    }
}
