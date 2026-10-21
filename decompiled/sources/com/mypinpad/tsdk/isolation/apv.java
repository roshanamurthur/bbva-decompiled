package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;

/* JADX INFO: loaded from: classes10.dex */
public final class apv extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53540f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53541g = 1;

    /* JADX WARN: Code duplicated, block: B:52:0x0530  */
    public static apl i(Object[] objArr) {
        int[] iArr;
        int[] iArr2;
        apz apzVar;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i10;
        int[] iArr6;
        int i11;
        apv apvVar = (apv) objArr[0];
        apl aplVar = (apl) objArr[1];
        int i12 = f53540f;
        int i13 = ((i12 ^ 95) | (i12 & 95)) << 1;
        int i14 = -(((~i12) & 95) | (i12 & (-96)));
        int i15 = (i13 & i14) + (i14 | i13);
        f53541g = i15 % 128;
        int i16 = i15 % 2;
        if (apvVar.setIncludeFontPadding()) {
            int i17 = f53540f;
            int i18 = i17 | 37;
            int i19 = i18 << 1;
            int i20 = -((~(i17 & 37)) & i18);
            int i21 = (i19 & i20) + (i20 | i19);
            int i22 = i21 % 128;
            f53541g = i22;
            if (i21 % 2 == 0) {
                throw null;
            }
            int i23 = i22 + 96;
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            f53540f = i24 % 128;
            if (i24 % 2 == 0) {
                return aplVar;
            }
            throw null;
        }
        if (aplVar.setIncludeFontPadding()) {
            int i25 = f53541g;
            int i26 = (i25 ^ 11) + ((i25 & 11) << 1);
            f53540f = i26 % 128;
            int i27 = i26 % 2;
            int i28 = i25 & 109;
            int i29 = (((i25 | 109) & (~i28)) - (~(-(-(i28 << 1))))) - 1;
            f53540f = i29 % 128;
            int i30 = i29 % 2;
            return apvVar;
        }
        if (apvVar == aplVar) {
            int i31 = f53541g;
            int i32 = (((i31 ^ 115) | (i31 & 115)) << 1) - (((~i31) & 115) | (i31 & (-116)));
            f53540f = i32 % 128;
            int i33 = i32 % 2;
            apl onEditorActionListener = apvVar.setOnEditorActionListener();
            int i34 = f53540f;
            int i35 = i34 & 103;
            int i36 = ((i34 | 103) & (~i35)) + (i35 << 1);
            f53541g = i36 % 128;
            int i37 = i36 % 2;
            return onEditorActionListener;
        }
        aph x4 = apvVar.setX();
        apz apzVar2 = (apz) apvVar.setX;
        apz apzVar3 = (apz) apvVar.setOnFocusChangeListener;
        apz apzVar4 = (apz) apvVar.setY[0];
        apz apzVar5 = (apz) aplVar.getNavBarTitleString();
        apz apzVar6 = (apz) aplVar.setNavigationOnClickListener();
        apz apzVar7 = (apz) aplVar.setY(0);
        int[] iArr7 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
        int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        int[] iArr9 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        int[] iArr10 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        boolean navBarTitleString = apzVar4.getNavBarTitleString();
        if (!navBarTitleString) {
            apw.setOnFocusChangeListener(new Object[]{apzVar4.setNavigationOnClickListener, iArr9}, -650561249, 650561261, (int) System.currentTimeMillis());
            apw.setOnFocusChangeListener(new Object[]{iArr9, apzVar5.setNavigationOnClickListener, iArr8}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            apw.setOnFocusChangeListener(new Object[]{iArr9, apzVar4.setNavigationOnClickListener, iArr9}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            apw.setOnFocusChangeListener(new Object[]{iArr9, apzVar6.setNavigationOnClickListener, iArr9}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            int i38 = f53540f;
            int i39 = (i38 ^ 62) + ((i38 & 62) << 1);
            int i40 = (i39 ^ (-1)) + (i39 << 1);
            f53541g = i40 % 128;
            int i41 = i40 % 2;
            iArr2 = iArr9;
            iArr = iArr8;
        } else {
            int i42 = f53540f;
            int i43 = (i42 & 2) + (i42 | 2);
            int i44 = (i43 ^ (-1)) + (i43 << 1);
            f53541g = i44 % 128;
            int i45 = i44 % 2;
            iArr = apzVar5.setNavigationOnClickListener;
            iArr2 = apzVar6.setNavigationOnClickListener;
            int i46 = i42 & 49;
            int i47 = i46 + ((i42 ^ 49) | i46);
            f53541g = i47 % 128;
            int i48 = i47 % 2;
        }
        boolean navBarTitleString2 = apzVar7.getNavBarTitleString();
        if (navBarTitleString2) {
            int i49 = f53541g;
            int i50 = (i49 ^ 113) + ((i49 & 113) << 1);
            f53540f = i50 % 128;
            int i51 = i50 % 2;
            int[] iArr11 = apzVar2.setNavigationOnClickListener;
            int[] iArr12 = apzVar3.setNavigationOnClickListener;
            System.identityHashCode(apvVar);
            System.identityHashCode(apvVar);
            iArr5 = iArr11;
            iArr3 = iArr7;
            apzVar = apzVar7;
            i10 = 0;
            iArr4 = iArr12;
        } else {
            apzVar = apzVar7;
            apw.setOnFocusChangeListener(new Object[]{apzVar.setNavigationOnClickListener, iArr10}, -650561249, 650561261, (int) System.currentTimeMillis());
            apw.setOnFocusChangeListener(new Object[]{iArr10, apzVar2.setNavigationOnClickListener, iArr7}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            iArr3 = iArr7;
            apw.setOnFocusChangeListener(new Object[]{iArr10, apzVar.setNavigationOnClickListener, iArr10}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            apw.setOnFocusChangeListener(new Object[]{iArr10, apzVar3.setNavigationOnClickListener, iArr10}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            int i52 = f53541g;
            int i53 = (i52 & 67) + (i52 | 67);
            f53540f = i53 % 128;
            int i54 = i53 % 2;
            iArr4 = iArr10;
            iArr5 = iArr3;
            i10 = 0;
        }
        int[] iArr13 = (int[]) avf.setX(new Object[i10], 2141150830, -2141150807, (int) System.currentTimeMillis());
        Object[] objArr2 = new Object[3];
        objArr2[i10] = iArr5;
        objArr2[1] = iArr;
        objArr2[2] = iArr13;
        apw.setOnFocusChangeListener(objArr2, 1022739355, -1022739350, (int) System.currentTimeMillis());
        int[] iArr14 = iArr4;
        apw.setOnFocusChangeListener(new Object[]{iArr4, iArr2, iArr8}, 1022739355, -1022739350, (int) System.currentTimeMillis());
        if (((Boolean) avf.setX(new Object[]{iArr13}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
            int i55 = f53540f;
            int i56 = (i55 ^ 120) + ((i55 & 120) << 1);
            int i57 = (i56 ^ (-1)) + (i56 << 1);
            f53541g = i57 % 128;
            int i58 = i57 % 2;
            if (!((Boolean) avf.setX(new Object[]{iArr8}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
                apl y7 = x4.setY();
                int i59 = f53540f;
                int i60 = (i59 & 110) + (i59 | 110);
                int i61 = (i60 ^ (-1)) + (i60 << 1);
                f53541g = i61 % 128;
                int i62 = i61 % 2;
                return y7;
            }
            int i63 = f53540f;
            int i64 = (i63 ^ 41) + ((i63 & 41) << 1);
            f53541g = i64 % 128;
            int i65 = i64 % 2;
            apl onEditorActionListener2 = apvVar.setOnEditorActionListener();
            int i66 = f53541g;
            int i67 = i66 & 61;
            int i68 = ((i66 ^ 61) | i67) << 1;
            int i69 = -((i66 | 61) & (~i67));
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            f53540f = i70 % 128;
            int i71 = i70 % 2;
            return onEditorActionListener2;
        }
        int[] iArr15 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        apw.setOnFocusChangeListener(new Object[]{iArr13, iArr15}, -650561249, 650561261, (int) System.currentTimeMillis());
        int[] iArr16 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        apw.setOnFocusChangeListener(new Object[]{iArr15, iArr13, iArr16}, -1896380356, 1896380367, (int) System.currentTimeMillis());
        apw.setOnFocusChangeListener(new Object[]{iArr15, iArr5, iArr9}, -1896380356, 1896380367, (int) System.currentTimeMillis());
        apw.setOnFocusChangeListener(new Object[]{iArr16, iArr16}, -1179246970, 1179246978, (int) System.currentTimeMillis());
        avf.setX(new Object[]{iArr14, iArr16, iArr3}, -701222223, 701222256, (int) System.currentTimeMillis());
        int iIntValue = ((Integer) avf.setX(new Object[]{iArr9, iArr9, iArr16}, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
        apw.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue), iArr16}, 1288032085, -1288032084, iIntValue);
        apz apzVar8 = new apz(iArr10);
        apw.setOnFocusChangeListener(new Object[]{iArr8, apzVar8.setNavigationOnClickListener}, -650561249, 650561261, (int) System.currentTimeMillis());
        int[] iArr17 = apzVar8.setNavigationOnClickListener;
        apw.setOnFocusChangeListener(new Object[]{iArr17, iArr16, iArr17}, 1022739355, -1022739350, (int) System.currentTimeMillis());
        apz apzVar9 = new apz(iArr16);
        apw.setOnFocusChangeListener(new Object[]{iArr9, apzVar8.setNavigationOnClickListener, apzVar9.setNavigationOnClickListener}, 1022739355, -1022739350, (int) System.currentTimeMillis());
        apw.setOnFocusChangeListener(new Object[]{apzVar9.setNavigationOnClickListener, iArr8, iArr3}, 2077163775, -2077163765, (int) System.currentTimeMillis());
        apw.setOnFocusChangeListener(new Object[]{iArr3, apzVar9.setNavigationOnClickListener}, -761961495, 761961499, (int) System.currentTimeMillis());
        apz apzVar10 = new apz(iArr13);
        if (!navBarTitleString) {
            int i72 = f53541g;
            int i73 = ((i72 | 102) << 1) - (i72 ^ 102);
            int i74 = (i73 ^ (-1)) + (i73 << 1);
            f53540f = i74 % 128;
            int i75 = i74 % 2;
            int[] iArr18 = apzVar10.setNavigationOnClickListener;
            apw.setOnFocusChangeListener(new Object[]{iArr18, apzVar4.setNavigationOnClickListener, iArr18}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            int i76 = f53541g + 83;
            f53540f = i76 % 128;
            int i77 = i76 % 2;
        }
        if (!navBarTitleString2) {
            int i78 = f53541g;
            int i79 = i78 ^ 61;
            int i80 = -(-((i78 & 61) << 1));
            int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
            f53540f = i81 % 128;
            if (i81 % 2 != 0) {
                int[] iArr19 = apzVar10.setNavigationOnClickListener;
                apw.setOnFocusChangeListener(new Object[]{iArr19, apzVar.setNavigationOnClickListener, iArr19}, -1896380356, 1896380367, (int) System.currentTimeMillis());
                int i82 = 47 / 0;
            } else {
                int[] iArr20 = apzVar10.setNavigationOnClickListener;
                apw.setOnFocusChangeListener(new Object[]{iArr20, apzVar.setNavigationOnClickListener, iArr20}, -1896380356, 1896380367, (int) System.currentTimeMillis());
            }
        }
        if (navBarTitleString) {
            int i83 = f53541g;
            int i84 = i83 & 107;
            int i85 = ((i83 ^ 107) | i84) << 1;
            int i86 = -((i83 | 107) & (~i84));
            int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
            int i88 = i87 % 128;
            f53540f = i88;
            int i89 = i87 % 2;
            if (navBarTitleString2) {
                int i90 = i88 + 57;
                int i91 = i90 % 128;
                f53541g = i91;
                if (i90 % 2 == 0) {
                    throw null;
                }
                int i92 = i91 & 97;
                int i93 = -(-((i91 ^ 97) | i92));
                int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                f53540f = i94 % 128;
                int i95 = i94 % 2;
                iArr6 = iArr15;
                i11 = 2;
            } else {
                iArr6 = null;
                int i96 = f53540f;
                int i97 = (i96 & 29) + (i96 | 29);
                f53541g = i97 % 128;
                i11 = 2;
                int i98 = i97 % 2;
            }
        } else {
            iArr6 = null;
            int i99 = f53540f;
            int i910 = (i99 & 29) + (i99 | 29);
            f53541g = i910 % 128;
            i11 = 2;
            int i911 = i910 % 2;
        }
        Object[] objArr3 = new Object[3];
        objArr3[0] = apvVar;
        objArr3[1] = apzVar10;
        objArr3[i11] = iArr6;
        apz apzVar11 = (apz) setCompoundDrawableTintBlendMode(objArr3, 872887095, -872887092, System.identityHashCode(apvVar));
        apk[] apkVarArr = new apk[i11];
        apkVarArr[0] = apzVar10;
        apkVarArr[1] = apzVar11;
        apv apvVar2 = new apv(x4, apzVar8, apzVar9, apkVarArr);
        int iIdentityHashCode = System.identityHashCode(apvVar);
        int i100 = ~iIdentityHashCode;
        int i101 = (-1222912394) & i100;
        int i102 = ~(((-1222912394) ^ i100) | i101);
        int i103 = (i102 & 1086595081) | (i102 ^ 1086595081);
        int i104 = i100 & (-774540259);
        int i105 = ((~i100) & 774540258) | i104;
        int i106 = i100 & 774540258;
        int i107 = ~((i105 & i106) | (i105 ^ i106));
        int i108 = (i103 & i107) | (i103 ^ i107);
        int i109 = ((-638222947) & i100) | (638222946 & iIdentityHashCode);
        int i110 = iIdentityHashCode & (-638222947);
        int i111 = ~((i110 & i109) | (i109 ^ i110));
        int i112 = ((~i111) & i108) | ((~i108) & i111);
        int i113 = i111 & i108;
        int i114 = ((i113 & i112) | (i112 ^ i113)) * 590;
        int i115 = ((249039949 | i114) << 1) - (i114 ^ 249039949);
        int i116 = (~i101) & ((-1222912394) | i100);
        int i117 = ~((i116 & i101) | (i116 ^ i101));
        int i118 = i117 & 1086595081;
        int i119 = (i117 | 1086595081) & (~i118);
        int i120 = (i119 & i118) | (i119 ^ i118);
        int i121 = ~(i100 | 774540258);
        int i122 = (i115 - (~(-(-(((i120 & i121) | (i120 ^ i121)) * (-1180)))))) - 1;
        int i123 = (~i104) & ((-774540259) | i100);
        int i124 = (i123 & i104) | (i123 ^ i104);
        int i125 = ~i124;
        int i126 = (i124 | i125) & i125;
        int i127 = ~((i100 & 1222912393) | (i100 ^ 1222912393));
        int i128 = i126 ^ i127;
        int i129 = i126 & i127;
        int i130 = -(-(((i129 & i128) | (i128 ^ i129)) * 590));
        int i131 = (i122 & i130) + (i130 | i122);
        int iIdentityHashCode2 = System.identityHashCode(apvVar);
        int i132 = 412756161 ^ iIdentityHashCode2;
        int i133 = ~iIdentityHashCode2;
        int i134 = 412756161 & iIdentityHashCode2;
        int i135 = ~((i132 & i134) | (i132 ^ i134));
        int i136 = ~i133;
        int i137 = ~((i133 & 468674497) | ((-468674498) & i136) | ((-468674498) & i133));
        int i138 = ((~i137) & i135) | ((~i135) & i137);
        int i139 = i135 & i137;
        int i140 = (i139 & i138) | (i138 ^ i139);
        int i141 = (412756161 & i133) | (i136 & (-412756162));
        int i142 = i133 & (-412756162);
        int i143 = (i141 & i142) | (i141 ^ i142);
        int i144 = ~i143;
        int i145 = (i143 | i144) & i144;
        int i146 = ((~i145) & i140) | ((~i140) & i145);
        int i147 = i145 & i140;
        int i148 = ((i147 & i146) | (i146 ^ i147)) * (-516);
        int i149 = ((((~i148) & (-2092340356)) | (2092340355 & i148)) - (~(-(-((i148 & (-2092340356)) << 1))))) - 1;
        int i150 = 469725121 & iIdentityHashCode2;
        int i151 = (469725121 | iIdentityHashCode2) & (~i150);
        int i152 = ~((i151 & i150) | (i151 ^ i150));
        int i153 = (iIdentityHashCode2 | i133) & i133;
        int i154 = (i153 & 468674497) | (468674497 ^ i153);
        int i155 = i154 & (-412756162);
        int i156 = ((i154 | (-412756162)) & (~i155)) | i155;
        int i157 = ~i156;
        int i158 = (i156 | i157) & i157;
        int i159 = i152 ^ i158;
        int i160 = i158 & i152;
        int i161 = -(-(((i160 & i159) | (i159 ^ i160)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
        int i162 = (i149 ^ i161) + ((i161 & i149) << 1);
        int i163 = 1050624 & i144;
        int i164 = (1050624 | i144) & (~i163);
        if (i131 <= (((i164 & i163) | (i164 ^ i163)) * LibMCryptConstants.IND_HEX_SEGMENTO2) + i162) {
            int i165 = 21 / 0;
        }
        return apvVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0312, code lost:
    
        if ((!r1.setIncludeFontPadding()) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x031b, code lost:
    
        if ((!r1.setIncludeFontPadding()) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x031d, code lost:
    
        r0 = r1.setX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0327, code lost:
    
        if (r1.setOnFocusChangeListener.setOnDragListener() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0329, code lost:
    
        r1 = com.mypinpad.tsdk.isolation.apv.f53541g;
        r2 = r1 & 77;
        r1 = (r1 | 77) & (~r2);
        r2 = -(-(r2 << 1));
        r3 = ((r1 | r2) << 1) - (r1 ^ r2);
        com.mypinpad.tsdk.isolation.apv.f53540f = r3 % 128;
        r3 = r3 % 2;
        r0 = r0.setY();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0345, code lost:
    
        if (r3 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0347, code lost:
    
        r0 = r0;
        r1 = 10 / 0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x034e, code lost:
    
        r0 = (com.mypinpad.tsdk.isolation.apv) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -1101686153, 1101686153, java.lang.System.identityHashCode(r1));
        r1 = com.mypinpad.tsdk.isolation.apv.f53541g;
        r2 = (((r1 & (-60)) | ((~r1) & 59)) - (~(-(-((r1 & 59) << 1))))) - 1;
        com.mypinpad.tsdk.isolation.apv.f53540f = r2 % 128;
        r2 = r2 % 2;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x037c, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.apv.f53541g;
        r2 = r0 & 39;
        r0 = (r0 ^ 39) | r2;
        r3 = (r2 ^ r0) + ((r0 & r2) << 1);
        com.mypinpad.tsdk.isolation.apv.f53540f = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x038f, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0393, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.apv.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 742341021, -742341016, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -1673769595, 1673769601, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, aplVar}, 608673622, -608673621, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setY(int i10) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1486216620, 1486216624, i10);
    }
}
