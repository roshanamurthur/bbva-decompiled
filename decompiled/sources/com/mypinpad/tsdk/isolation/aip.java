package com.mypinpad.tsdk.isolation;

import com.bbva.cellswidgets.MaskTextWatcher;
import java.io.IOException;
import java.util.Hashtable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class aip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52808a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52809b = 1;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008b, code lost:
    
        r1 = (com.mypinpad.tsdk.isolation.aii[]) com.mypinpad.tsdk.isolation.aim.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 1291608961, -1291608956, java.lang.System.identityHashCode(r1));
        r12 = (com.mypinpad.tsdk.isolation.aii[]) com.mypinpad.tsdk.isolation.aim.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r12}, 1291608961, -1291608956, java.lang.System.identityHashCode(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00af, code lost:
    
        if (r1.length == r12.length) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aip.f52808a;
        r1 = r12 + 99;
        com.mypinpad.tsdk.isolation.aip.f52809b = r1 % 128;
        r1 = r1 % 2;
        r1 = (r12 | 105) << 1;
        r12 = -(((~r12) & 105) | (r12 & (-106)));
        r2 = ((r1 | r12) << 1) - (r12 ^ r1);
        com.mypinpad.tsdk.isolation.aip.f52809b = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d0, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d2, code lost:
    
        r12 = 97 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d7, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00da, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
    
        r4 = com.mypinpad.tsdk.isolation.aip.f52808a;
        r5 = r4 ^ 61;
        r4 = ((((r4 & 61) | r5) << 1) - (~(-r5))) - 1;
        com.mypinpad.tsdk.isolation.aip.f52809b = r4 % 128;
        r4 = r4 % 2;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ee, code lost:
    
        if (r4 == r1.length) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f0, code lost:
    
        r5 = com.mypinpad.tsdk.isolation.aip.f52808a;
        r6 = r5 ^ 41;
        r5 = ((((r5 & 41) | r6) << 1) - (~(-r6))) - 1;
        com.mypinpad.tsdk.isolation.aip.f52809b = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0107, code lost:
    
        if ((r5 % 2) == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0123, code lost:
    
        if ((!((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r1[r4], r12[r4]}, -1152603673, 1152603673, (int) java.lang.System.currentTimeMillis())).booleanValue()) == true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0125, code lost:
    
        r5 = ((((r4 ^ 81) | (r4 & 81)) << 1) - (~(-(((~r4) & 81) | (r4 & (-82)))))) - 80;
        r4 = (r5 ^ (-1)) + (r5 << 1);
        r5 = com.mypinpad.tsdk.isolation.aip.f52809b;
        r6 = r5 | 69;
        r7 = r6 << 1;
        r5 = -((~(r5 & 69)) & r6);
        r6 = ((r7 | r5) << 1) - (r5 ^ r7);
        com.mypinpad.tsdk.isolation.aip.f52808a = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0150, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aip.f52808a + 73;
        com.mypinpad.tsdk.isolation.aip.f52809b = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0159, code lost:
    
        if ((r12 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x015b, code lost:
    
        r12 = 52 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0160, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0163, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0164, code lost:
    
        ((java.lang.Boolean) setDividerPadding(new java.lang.Object[]{r1[r4], r12[r4]}, -1152603673, 1152603673, (int) java.lang.System.currentTimeMillis())).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x017d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x017e, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aip.f52809b;
        r0 = r12 & 41;
        r12 = (r12 | 41) & (~r0);
        r0 = r0 << 1;
        r1 = (r12 ^ r0) + ((r12 & r0) << 1);
        com.mypinpad.tsdk.isolation.aip.f52808a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0193, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004d, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.aim.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 1665474108, -1665474107, java.lang.System.identityHashCode(r1))).intValue() != ((java.lang.Integer) com.mypinpad.tsdk.isolation.aim.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r12}, 1665474108, -1665474107, java.lang.System.identityHashCode(r12))).intValue()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        if (((java.lang.Integer) com.mypinpad.tsdk.isolation.aim.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, 1665474108, -1665474107, java.lang.System.identityHashCode(r1))).intValue() != ((java.lang.Integer) com.mypinpad.tsdk.isolation.aim.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r12}, 1665474108, -1665474107, java.lang.System.identityHashCode(r12))).intValue()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.aip.f52809b;
        r0 = r12 & 87;
        r12 = (r12 | 87) & (~r0);
        r0 = r0 << 1;
        r1 = (r12 & r0) + (r12 | r0);
        com.mypinpad.tsdk.isolation.aip.f52808a = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean a(java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aip.a(java.lang.Object[]):java.lang.Boolean");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0369 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x036a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* synthetic */ String b(Object[] objArr) {
        int i10;
        String string;
        int i11;
        int i12 = 0;
        add addVar = (add) objArr[0];
        StringBuffer stringBuffer = new StringBuffer();
        if (!(!(addVar instanceof aei))) {
            int i13 = f52809b;
            int i14 = i13 ^ 41;
            int i15 = ((i13 & 41) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            int i18 = i17 % 128;
            f52808a = i18;
            if (i17 % 2 != 0) {
                boolean z10 = addVar instanceof aep;
                throw null;
            }
            if (!(!(addVar instanceof aep))) {
                try {
                    stringBuffer.append(MaskTextWatcher.WILDCARD);
                    ady adyVarUiMessageCallbackKtWhenMappings = addVar.UiMessageCallbackKtWhenMappings();
                    stringBuffer.append((String) bfb.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) adw.setOnLongClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings))}, 421028844, -421028844, (int) System.currentTimeMillis()));
                    int i19 = f52809b;
                    int i20 = (((i19 | 8) << 1) - (i19 ^ 8)) - 1;
                    f52808a = i20 % 128;
                    int i21 = i20 % 2;
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Other value has no encoded form");
                }
            } else {
                int i22 = i18 & 15;
                int i23 = i22 + ((i18 ^ 15) | i22);
                f52809b = i23 % 128;
                int i24 = i23 % 2;
                String onFocusChangeListener = ((aei) addVar).setOnFocusChangeListener();
                if (onFocusChangeListener.length() > 0) {
                    int i25 = f52809b;
                    int i26 = (((i25 ^ 7) | (i25 & 7)) << 1) - (((~i25) & 7) | (i25 & (-8)));
                    f52808a = i26 % 128;
                    int i27 = i26 % 2;
                    if (onFocusChangeListener.charAt(0) == '#') {
                        int i28 = f52808a;
                        int i29 = ((i28 | 49) << 1) - (i28 ^ 49);
                        f52809b = i29 % 128;
                        int i30 = i29 % 2;
                        stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                        int i31 = f52809b + 43;
                        f52808a = i31 % 128;
                        int i32 = i31 % 2;
                    }
                }
                stringBuffer.append(onFocusChangeListener);
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
        } else {
            stringBuffer.append(MaskTextWatcher.WILDCARD);
            ady adyVarUiMessageCallbackKtWhenMappings2 = addVar.UiMessageCallbackKtWhenMappings();
            stringBuffer.append((String) bfb.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) adw.setOnLongClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings2, ASN1Encoding.DER}, -2049344731, 2049344731, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings2))}, 421028844, -421028844, (int) System.currentTimeMillis()));
            int i110 = f52809b;
            int i210 = (((i110 | 8) << 1) - (i110 ^ 8)) - 1;
            f52808a = i210 % 128;
            int i211 = i210 % 2;
        }
        int length = stringBuffer.length();
        if (stringBuffer.length() >= 2) {
            int i33 = f52809b;
            int i34 = i33 | 73;
            int i35 = ((i34 << 1) - (~(-((~(i33 & 73)) & i34)))) - 1;
            f52808a = i35 % 128;
            int i36 = i35 % 2;
            if (stringBuffer.charAt(0) == '\\') {
                int i37 = f52808a;
                int i38 = (i37 | 73) << 1;
                int i39 = -(((~i37) & 73) | (i37 & (-74)));
                int i40 = (i38 & i39) + (i39 | i38);
                f52809b = i40 % 128;
                int i41 = i40 % 2;
                if (stringBuffer.charAt(1) == '#') {
                    int i42 = f52808a;
                    int i43 = (((i42 | 60) << 1) - (i42 ^ 60)) - 1;
                    f52809b = i43 % 128;
                    int i44 = i43 % 2;
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    i10 = 2;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        while (i10 != length) {
            int i45 = f52808a;
            int i46 = (i45 & 77) + (i45 | 77);
            f52809b = i46 % 128;
            int i47 = i46 % 2;
            char cCharAt = stringBuffer.charAt(i10);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        int i48 = ((i10 & (-75)) - (~(-(-(i10 | (-75)))))) - 1;
                        int i49 = (i48 & (-77)) | ((~i48) & 76);
                        int i50 = -(-((i48 & 76) << 1));
                        i10 = ((i49 | i50) << 1) - (i49 ^ i50);
                        int i51 = f52808a;
                        int i52 = (i51 & 25) + (i51 | 25);
                        f52809b = i52 % 128;
                        int i53 = i52 % 2;
                        break;
                }
            }
            stringBuffer.insert(i10, "\\");
            int i54 = (i10 & (-3)) | ((~i10) & 2);
            int i55 = -(-((i10 & 2) << 1));
            i10 = ((i54 | i55) << 1) - (i55 ^ i54);
            int i56 = ((length | 2) << 1) - (length ^ 2);
            length = (i56 ^ (-1)) + (i56 << 1);
            int i57 = f52808a;
            int i58 = i57 & 107;
            int i59 = ((i57 | 107) & (~i58)) + (i58 << 1);
            f52809b = i59 % 128;
            int i60 = i59 % 2;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i12) {
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i61 = ~iCurrentTimeMillis;
                int i62 = -(~((((iCurrentTimeMillis | i61) & i61) | 498956031) * 494));
                int i63 = (-2) - ((((-519123364) & i62) + (i62 | (-519123364))) ^ (-1));
                int i64 = i61 ^ 415056636;
                int i65 = i61 & 415056636;
                int i66 = ~((i65 & i64) | (i64 ^ i65));
                int i67 = (i66 & 3932244) | (3932244 ^ i66);
                int i68 = ((-83899396) & i67) | ((~i67) & 83899395);
                int i69 = i67 & 83899395;
                int i70 = -(-(((i69 & i68) | (i68 ^ i69)) * 494));
                int i71 = i63 & i70;
                int i72 = -(-((i63 ^ i70) | i71));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i74 = ~iCurrentTimeMillis2;
                int i75 = i74 & (i74 | iCurrentTimeMillis2);
                int i76 = -(-((~((1720324309 ^ i75) | (1720324309 & i75))) * 979));
                int i77 = (((-332430128) ^ i76) | ((-332430128) & i76)) << 1;
                int i78 = -((i76 & 332430127) | ((-332430128) & (~i76)));
                int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                int i80 = -(-((((-1879309587) ^ iCurrentTimeMillis2) | ((-1879309587) & iCurrentTimeMillis2)) * (-979)));
                int i81 = (i79 & i80) + (i79 | i80);
                int i82 = 1720324309 ^ iCurrentTimeMillis2;
                int i83 = iCurrentTimeMillis2 & 1720324309;
                int i84 = (i83 & i82) | (i82 ^ i83);
                int i85 = ~i84;
                int i86 = (i84 | i85) & i85;
                int i87 = i75 ^ (-1879309587);
                int i88 = i75 & (-1879309587);
                int i89 = ~((i88 & i87) | (i87 ^ i88));
                if (i73 > (-2) - ((i81 - (~(((i86 & i89) | (i86 ^ i89)) * 979))) ^ (-1))) {
                    if (stringBuffer.charAt(i12) == 'm') {
                        int i90 = f52809b + 69;
                        f52808a = i90 % 128;
                        int i91 = i90 % 2;
                        stringBuffer.insert(i12, "\\");
                        int i92 = i12 - 18;
                        int i93 = (i92 ^ (-1)) + (i92 << 1);
                        int i94 = i93 & 21;
                        i12 = i94 + ((i93 ^ 21) | i94);
                        int i95 = f52808a + 119;
                        f52809b = i95 % 128;
                        int i96 = i95 % 2;
                    }
                } else if (stringBuffer.charAt(i12) == ' ') {
                    int i97 = f52809b + 69;
                    f52808a = i97 % 128;
                    int i98 = i97 % 2;
                    stringBuffer.insert(i12, "\\");
                    int i99 = i12 - 18;
                    int i910 = (i99 ^ (-1)) + (i99 << 1);
                    int i911 = i910 & 21;
                    i12 = i911 + ((i910 ^ 21) | i911);
                    int i912 = f52808a + 119;
                    f52809b = i912 % 128;
                    int i913 = i912 % 2;
                }
            }
        }
        int length2 = stringBuffer.length();
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i100 = -(-(length2 * 503));
        int i101 = (-503) & i100;
        int i102 = -(-(i100 | (-503)));
        int i103 = (i101 & i102) + (i102 | i101);
        int i104 = ~length2;
        int i105 = (i104 ^ length2) | (i104 & length2);
        int i106 = i105 * (-502);
        int i107 = (i103 ^ i106) + ((i103 & i106) << 1);
        int i108 = i104 | length2;
        int i109 = i104 & i108;
        int i111 = ~i109;
        int i112 = (i109 | i111) & i111;
        int i113 = ~iCurrentTimeMillis3;
        int i114 = ~i113;
        int i115 = ((~i112) & i114) | ((~i114) & i112);
        int i116 = i112 & i114;
        int i117 = (i115 & i116) | (i115 ^ i116);
        int i118 = i108 | iCurrentTimeMillis3;
        int i119 = ~i118;
        int i120 = (i118 | i119) & i119;
        int i121 = ((~i120) & i117) | ((~i117) & i120);
        int i122 = i117 & i120;
        int i123 = -(-(((i122 & i121) | (i121 ^ i122)) * (-502)));
        int i124 = i107 & i123;
        int i125 = (i124 - (~(-(-((i123 ^ i107) | i124))))) - 1;
        int i126 = (length2 & i113) | (i113 ^ length2);
        int i127 = ~i126;
        int i128 = (i126 | i127) & i127;
        int i129 = i105 & iCurrentTimeMillis3;
        int i130 = (iCurrentTimeMillis3 | i105) & (~i129);
        int i131 = (i130 & i129) | (i130 ^ i129);
        int i132 = ~i131;
        int i133 = (i131 | i132) & i132;
        int i134 = -(~(((i128 & i133) | (i128 ^ i133)) * 502));
        int i135 = (((i125 | i134) << 1) - (i134 ^ i125)) - 1;
        int i136 = f52809b;
        int i137 = i136 & 27;
        int i138 = i137 + ((i136 ^ 27) | i137);
        f52808a = i138 % 128;
        int i139 = i138 % 2;
        while (i135 >= i12) {
            int i140 = f52809b;
            int i141 = ((i140 ^ 65) - (~((i140 & 65) << 1))) - 1;
            f52808a = i141 % 128;
            if (i141 % 2 != 0) {
                if (stringBuffer.charAt(i135) != '9') {
                    string = stringBuffer.toString();
                    int i142 = f52808a;
                    i11 = ((i142 | 11) << 1) - (i142 ^ 11);
                    f52809b = i11 % 128;
                    if (i11 % 2 != 0) {
                        return string;
                    }
                    throw null;
                }
                stringBuffer.insert(i135, AbstractJsonLexerKt.STRING_ESC);
                int i143 = (i135 & 57) | ((~i135) & (-58));
                int i144 = -(-((i135 & (-58)) << 1));
                int i145 = (i143 & i144) + (i144 | i143);
                int i146 = ((i145 ^ 57) | (i145 & 57)) << 1;
                int i147 = -((57 & (~i145)) | (i145 & (-58)));
                i135 = (i146 & i147) + (i147 | i146);
                int i148 = f52808a;
                int i149 = i148 ^ 11;
                int i150 = (((i148 & 11) | i149) << 1) - i149;
                f52809b = i150 % 128;
                int i151 = i150 % 2;
            } else {
                if (stringBuffer.charAt(i135) != ' ') {
                    string = stringBuffer.toString();
                    int i1410 = f52808a;
                    i11 = ((i1410 | 11) << 1) - (i1410 ^ 11);
                    f52809b = i11 % 128;
                    if (i11 % 2 != 0) {
                        return string;
                    }
                    throw null;
                }
                stringBuffer.insert(i135, AbstractJsonLexerKt.STRING_ESC);
                int i1411 = (i135 & 57) | ((~i135) & (-58));
                int i1412 = -(-((i135 & (-58)) << 1));
                int i1413 = (i1411 & i1412) + (i1412 | i1411);
                int i1414 = ((i1413 ^ 57) | (i1413 & 57)) << 1;
                int i1415 = -((57 & (~i1413)) | (i1413 & (-58)));
                i135 = (i1414 & i1415) + (i1415 | i1414);
                int i1416 = f52808a;
                int i1417 = i1416 ^ 11;
                int i152 = (((i1416 & 11) | i1417) << 1) - i1417;
                f52809b = i152 % 128;
                int i153 = i152 % 2;
            }
        }
        string = stringBuffer.toString();
        int i1418 = f52808a;
        i11 = ((i1418 | 11) << 1) - (i1418 ^ 11);
        f52809b = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public static boolean setCompoundDrawableTintBlendMode(aim aimVar, aim aimVar2) {
        return ((Boolean) setDividerPadding(new Object[]{aimVar, aimVar2}, -642320840, 642320842, (int) System.currentTimeMillis())).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:142:0x06e4 A[PHI: r6
      0x06e4: PHI (r6v13 char) = (r6v12 char), (r6v19 char) binds: [B:141:0x06e2, B:138:0x06db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0379 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x035f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x03e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x03c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0333  */
    /* JADX WARN: Code duplicated, block: B:67:0x0346  */
    /* JADX WARN: Code duplicated, block: B:70:0x034f  */
    /* JADX WARN: Code duplicated, block: B:75:0x038f  */
    /* JADX WARN: Code duplicated, block: B:77:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:82:0x03c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0439  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        String str;
        char cCharAt;
        int i13;
        int i14;
        String str2;
        String str3;
        int i15;
        int i16;
        int i17;
        char cCharAt2;
        int i18;
        int i19;
        Object obj;
        int i20;
        int i21 = ~((~i10) | i11);
        switch ((((~(i10 | i12)) | (~((~i11) | i10)) | i21) * 70) + ((~(i10 | i11 | i12)) * 70) + (((~(i11 | i12)) | i21) * (-140)) + (i11 * (-69)) + (i10 * 71)) {
            case 1:
                return b(objArr);
            case 2:
                return a(objArr);
            case 3:
                str = (String) objArr[0];
                int i22 = (-2) - ((f52809b + 48) ^ (-1));
                f52808a = i22 % 128;
                int i23 = i22 % 2;
                if (str.indexOf("  ") >= 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    char cCharAt3 = str.charAt(0);
                    stringBuffer.append(cCharAt3);
                    int i24 = f52808a;
                    int i25 = (i24 & (-108)) | ((~i24) & 107);
                    int i26 = (i24 & 107) << 1;
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    f52809b = i27 % 128;
                    int i28 = i27 % 2;
                    int i29 = 1;
                    while (i29 < str.length()) {
                        int i30 = f52809b;
                        int i31 = i30 & 97;
                        int i32 = ((((i30 ^ 97) | i31) << 1) - (~(-((i30 | 97) & (~i31))))) - 1;
                        f52808a = i32 % 128;
                        if (i32 % 2 != 0) {
                            cCharAt = str.charAt(i29);
                            if (cCharAt3 == 30) {
                                int i33 = f52808a;
                                int i34 = (i33 & 61) + (i33 | 61);
                                f52809b = i34 % 128;
                                int i35 = i34 % 2;
                                if (cCharAt != ' ') {
                                }
                            }
                            int i36 = (i29 ^ 120) + ((i29 & 120) << 1);
                            i29 = (i36 & (-119)) + (i36 | (-119));
                            int i37 = f52809b;
                            int i38 = ((i37 & (-88)) | ((~i37) & 87)) + ((i37 & 87) << 1);
                            f52808a = i38 % 128;
                            int i39 = i38 % 2;
                        } else {
                            cCharAt = str.charAt(i29);
                            if (cCharAt3 == ' ') {
                                int i310 = f52808a;
                                int i311 = (i310 & 61) + (i310 | 61);
                                f52809b = i311 % 128;
                                int i312 = i311 % 2;
                                if (cCharAt != ' ') {
                                }
                            }
                            int i313 = (i29 ^ 120) + ((i29 & 120) << 1);
                            i29 = (i313 & (-119)) + (i313 | (-119));
                            int i314 = f52809b;
                            int i315 = ((i314 & (-88)) | ((~i314) & 87)) + ((i314 & 87) << 1);
                            f52808a = i315 % 128;
                            int i316 = i315 % 2;
                        }
                        stringBuffer.append(cCharAt);
                        int i40 = f52808a;
                        int i41 = i40 & 41;
                        int i42 = (i41 - (~((i40 ^ 41) | i41))) - 1;
                        f52809b = i42 % 128;
                        int i43 = i42 % 2;
                        cCharAt3 = cCharAt;
                        int i317 = (i29 ^ 120) + ((i29 & 120) << 1);
                        i29 = (i317 & (-119)) + (i317 | (-119));
                        int i318 = f52809b;
                        int i319 = ((i318 & (-88)) | ((~i318) & 87)) + ((i318 & 87) << 1);
                        f52808a = i319 % 128;
                        int i3110 = i319 % 2;
                    }
                    String string = stringBuffer.toString();
                    int i44 = f52808a;
                    int i45 = ((i44 ^ 42) + ((i44 & 42) << 1)) - 1;
                    f52809b = i45 % 128;
                    int i46 = i45 % 2;
                    obj = string;
                } else {
                    int i47 = f52808a + 17;
                    f52809b = i47 % 128;
                    if (i47 % 2 == 0) {
                        obj = str;
                        int i48 = 19 / 0;
                        obj = str;
                    }
                }
                break;
            case 4:
                StringBuffer stringBuffer2 = (StringBuffer) objArr[0];
                aim aimVar = (aim) objArr[1];
                Hashtable hashtable = (Hashtable) objArr[2];
                int i49 = f52808a + 47;
                f52809b = i49 % 128;
                if (i49 % 2 == 0) {
                    ((Boolean) aim.setCompoundDrawableTintBlendMode(new Object[]{aimVar}, -366917963, 366917967, System.identityHashCode(aimVar))).booleanValue();
                    throw null;
                }
                int i50 = 3;
                if (((Boolean) aim.setCompoundDrawableTintBlendMode(new Object[]{aimVar}, -366917963, 366917967, System.identityHashCode(aimVar))).booleanValue()) {
                    aii[] aiiVarArr = (aii[]) aim.setCompoundDrawableTintBlendMode(new Object[]{aimVar}, 1291608961, -1291608956, System.identityHashCode(aimVar));
                    int i51 = f52808a;
                    int i52 = (((i51 ^ 87) | (i51 & 87)) << 1) - (((~i51) & 87) | (i51 & (-88)));
                    f52809b = i52 % 128;
                    int i53 = i52 % 2;
                    int i54 = 0;
                    boolean z10 = true;
                    while (i54 != aiiVarArr.length) {
                        int i55 = f52809b;
                        int i56 = i55 ^ 77;
                        int i57 = -(-((i55 & 77) << 1));
                        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                        int i59 = i58 % 128;
                        f52808a = i59;
                        int i60 = i58 % 2;
                        if (!(!z10)) {
                            int i61 = i59 & 57;
                            int i62 = ((i59 | 57) & (~i61)) + (i61 << 1);
                            int i63 = i62 % 128;
                            f52809b = i63;
                            int i64 = i62 % 2;
                            int i65 = i63 & 95;
                            int i66 = i65 + ((i63 ^ 95) | i65);
                            f52808a = i66 % 128;
                            int i67 = i66 % 2;
                            z10 = false;
                        } else {
                            stringBuffer2.append('+');
                            int i68 = f52809b;
                            int i69 = ((i68 ^ 29) - (~(-(-((i68 & 29) << 1))))) - 1;
                            f52808a = i69 % 128;
                            int i70 = i69 % 2;
                        }
                        aii aiiVar = aiiVarArr[i54];
                        Object[] objArr2 = new Object[i50];
                        objArr2[0] = stringBuffer2;
                        objArr2[1] = aiiVar;
                        objArr2[2] = hashtable;
                        setDividerPadding(objArr2, -2119982868, 2119982876, (int) System.currentTimeMillis());
                        int i71 = i54 & 1;
                        i54 = (i71 - (~(-(-((i54 ^ 1) | i71))))) - 1;
                        int i72 = f52809b;
                        int i73 = (((i72 | 92) << 1) - (i72 ^ 92)) - 1;
                        f52808a = i73 % 128;
                        int i74 = i73 % 2;
                        i50 = 3;
                    }
                    int i75 = f52809b;
                    int i76 = (i75 ^ 3) + ((i75 & 3) << 1);
                    f52808a = i76 % 128;
                    if (i76 % 2 != 0) {
                        throw null;
                    }
                } else {
                    if (((aii) aim.setCompoundDrawableTintBlendMode(new Object[]{aimVar}, -410583318, 410583321, System.identityHashCode(aimVar))) != null) {
                        int i77 = f52808a;
                        int i78 = i77 & 77;
                        int i79 = (i77 ^ 77) | i78;
                        int i80 = (i78 & i79) + (i79 | i78);
                        f52809b = i80 % 128;
                        int i81 = i80 % 2;
                        setDividerPadding(new Object[]{stringBuffer2, (aii) aim.setCompoundDrawableTintBlendMode(new Object[]{aimVar}, -410583318, 410583321, System.identityHashCode(aimVar)), hashtable}, -2119982868, 2119982876, (int) System.currentTimeMillis());
                        int i82 = f52809b;
                        int i83 = ((i82 | 31) << 1) - (i82 ^ 31);
                        f52808a = i83 % 128;
                        int i84 = i83 % 2;
                    }
                    int i85 = f52808a;
                    int i86 = i85 & 123;
                    int i87 = (i85 ^ 123) | i86;
                    int i88 = (i86 & i87) + (i87 | i86);
                    f52809b = i88 % 128;
                    int i89 = i88 % 2;
                }
                return null;
            case 5:
                add addVar = (add) objArr[0];
                int i90 = f52808a;
                int i91 = i90 & 79;
                int i92 = (i90 | 79) & (~i91);
                int i93 = i91 << 1;
                int i94 = (i92 & i93) + (i92 | i93);
                f52809b = i94 % 128;
                int i95 = i94 % 2;
                String str4 = (String) setDividerPadding(new Object[]{(String) setDividerPadding(new Object[]{addVar}, 1946908321, -1946908320, (int) System.currentTimeMillis())}, 1813537058, -1813537051, (int) System.currentTimeMillis());
                int i96 = f52809b;
                int i97 = ((i96 ^ 117) | (i96 & 117)) << 1;
                int i98 = -(((~i96) & 117) | (i96 & (-118)));
                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                f52808a = i99 % 128;
                obj = str4;
                if (i99 % 2 != 0) {
                    throw null;
                }
                break;
            case 6:
                String str5 = (String) objArr[0];
                int i100 = f52809b;
                int i101 = (i100 & (-24)) | ((~i100) & 23);
                int i102 = (i100 & 23) << 1;
                int i103 = (i101 & i102) + (i102 | i101);
                f52808a = i103 % 128;
                int i104 = i103 % 2;
                try {
                    int length = str5.length() - 1;
                    ady adyVar = (ady) ady.setNavigationOnClickListener(new Object[]{(byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{str5, Integer.valueOf(length)}, 9548453, -9548448, length)}, -1692126728, 1692126730, (int) System.currentTimeMillis());
                    int i105 = f52808a;
                    int i106 = (i105 & 53) + (i105 | 53);
                    f52809b = i106 % 128;
                    int i107 = i106 % 2;
                    return adyVar;
                } catch (IOException e5) {
                    throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e5)));
                }
            case 7:
                String onFocusChangeListener = (String) objArr[0];
                int i108 = f52809b;
                int i109 = (i108 ^ 119) + ((i108 & 119) << 1);
                f52808a = i109 % 128;
                if (i109 % 2 != 0) {
                    onFocusChangeListener.getClass();
                    throw null;
                }
                if (onFocusChangeListener.length() > 0) {
                    int i110 = f52809b;
                    int i111 = ((i110 ^ 25) | (i110 & 25)) << 1;
                    int i112 = -(((~i110) & 25) | (i110 & (-26)));
                    int i113 = (i111 & i112) + (i112 | i111);
                    f52808a = i113 % 128;
                    if (i113 % 2 == 0 ? onFocusChangeListener.charAt(0) == '#' : onFocusChangeListener.charAt(1) == 'C') {
                        add addVar2 = (ady) setDividerPadding(new Object[]{onFocusChangeListener}, -794359093, 794359099, (int) System.currentTimeMillis());
                        if (addVar2 instanceof aei) {
                            int i114 = f52809b;
                            int i115 = i114 & 9;
                            int i116 = (i115 - (~(-(-((i114 ^ 9) | i115))))) - 1;
                            f52808a = i116 % 128;
                            int i117 = i116 % 2;
                            onFocusChangeListener = ((aei) addVar2).setOnFocusChangeListener();
                            int i118 = f52808a;
                            int i119 = ((i118 & (-38)) | ((~i118) & 37)) + ((i118 & 37) << 1);
                            f52809b = i119 % 128;
                            int i120 = i119 % 2;
                        }
                    }
                }
                String str6 = (String) bez.setX(new Object[]{onFocusChangeListener}, 2131988623, -2131988618, (int) System.currentTimeMillis());
                int length2 = str6.length();
                if (length2 >= 2) {
                    int i121 = length2 & 126;
                    int i122 = (i121 - (~(-(-((length2 ^ 126) | i121))))) - 1;
                    int i123 = i122 ^ (-127);
                    int i124 = (i122 & (-127)) << 1;
                    int i125 = (i123 ^ i124) + ((i123 & i124) << 1);
                    int i126 = f52809b;
                    int i127 = i126 & 55;
                    int i128 = (i127 - (~((i126 ^ 55) | i127))) - 1;
                    f52808a = i128 % 128;
                    int i129 = i128 % 2;
                    int i130 = 0;
                    while (i130 < i125) {
                        int i131 = f52809b;
                        int i132 = (-2) - (((i131 ^ 104) + ((i131 & 104) << 1)) ^ (-1));
                        f52808a = i132 % 128;
                        if (i132 % 2 != 0) {
                            if (str6.charAt(i130) == '8') {
                                int i133 = f52808a;
                                int i134 = (i133 ^ 126) + ((i133 & 126) << 1);
                                i18 = (i134 ^ (-1)) + (i134 << 1);
                                f52809b = i18 % 128;
                                if (i18 % 2 == 0) {
                                    i19 = i130 ^ 1;
                                    if (str6.charAt(((((i130 & 1) | i19) << 1) - (~(-i19))) - 1) == ' ') {
                                        i130 = ((i130 & 2) << 1) + (i130 ^ 2);
                                        int i135 = f52809b;
                                        int i136 = (i135 & (-98)) | ((~i135) & 97);
                                        int i137 = (i135 & 97) << 1;
                                        int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                                        f52808a = i138 % 128;
                                        int i139 = i138 % 2;
                                    }
                                } else if (str6.charAt(0) == 27) {
                                    i130 = ((i130 & 2) << 1) + (i130 ^ 2);
                                    int i1310 = f52809b;
                                    int i1311 = (i1310 & (-98)) | ((~i1310) & 97);
                                    int i1312 = (i1310 & 97) << 1;
                                    int i1313 = (i1311 ^ i1312) + ((i1312 & i1311) << 1);
                                    f52808a = i1313 % 128;
                                    int i1314 = i1313 % 2;
                                }
                            }
                        } else if (str6.charAt(i130) == '\\') {
                            int i1315 = f52808a;
                            int i1316 = (i1315 ^ 126) + ((i1315 & 126) << 1);
                            i18 = (i1316 ^ (-1)) + (i1316 << 1);
                            f52809b = i18 % 128;
                            if (i18 % 2 == 0) {
                                i19 = i130 ^ 1;
                                if (str6.charAt(((((i130 & 1) | i19) << 1) - (~(-i19))) - 1) == ' ') {
                                    i130 = ((i130 & 2) << 1) + (i130 ^ 2);
                                    int i1317 = f52809b;
                                    int i1318 = (i1317 & (-98)) | ((~i1317) & 97);
                                    int i1319 = (i1317 & 97) << 1;
                                    int i13110 = (i1318 ^ i1319) + ((i1319 & i1318) << 1);
                                    f52808a = i13110 % 128;
                                    int i13111 = i13110 % 2;
                                }
                            } else if (str6.charAt(0) == 27) {
                                i130 = ((i130 & 2) << 1) + (i130 ^ 2);
                                int i13112 = f52809b;
                                int i13113 = (i13112 & (-98)) | ((~i13112) & 97);
                                int i13114 = (i13112 & 97) << 1;
                                int i13115 = (i13113 ^ i13114) + ((i13114 & i13113) << 1);
                                f52808a = i13115 % 128;
                                int i13116 = i13115 % 2;
                            }
                        }
                        int i140 = i130 & 1;
                        i13 = (((~i140) & (i130 | 1)) - (~(i140 << 1))) - 1;
                        int i141 = f52809b + 11;
                        f52808a = i141 % 128;
                        int i142 = i141 % 2;
                        i14 = i125;
                        while (i14 > i13) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            i16 = -(-((i14 ^ (-1)) | i14));
                            if (str6.charAt((i14 ^ i16) + ((i16 & i14) << 1)) == '\\') {
                                int i143 = f52809b;
                                int i144 = i143 & 37;
                                int i145 = (i143 | 37) & (~i144);
                                int i146 = -(-(i144 << 1));
                                int i147 = ((i145 | i146) << 1) - (i145 ^ i146);
                                f52808a = i147 % 128;
                                i17 = i147 % 2;
                                cCharAt2 = str6.charAt(i14);
                                if (i17 != 0) {
                                    if (cCharAt2 == '@') {
                                        int i148 = f52809b;
                                        int i149 = ((i148 | 33) << 1) - ((i148 & (-34)) | ((~i148) & 33));
                                        f52808a = i149 % 128;
                                        int i150 = i149 % 2;
                                        i14 -= 2;
                                        int i151 = (((i148 | 74) << 1) - (i148 ^ 74)) - 1;
                                        f52808a = i151 % 128;
                                        int i152 = i151 % 2;
                                    }
                                } else if (cCharAt2 == ' ') {
                                    int i1410 = f52809b;
                                    int i1411 = ((i1410 | 33) << 1) - ((i1410 & (-34)) | ((~i1410) & 33));
                                    f52808a = i1411 % 128;
                                    int i153 = i1411 % 2;
                                    i14 -= 2;
                                    int i154 = (((i1410 | 74) << 1) - (i1410 ^ 74)) - 1;
                                    f52808a = i154 % 128;
                                    int i155 = i154 % 2;
                                }
                            }
                            if (i130 <= 0) {
                                System.currentTimeMillis();
                                System.currentTimeMillis();
                                if (i14 < i125) {
                                    str2 = str6;
                                    String strSubstring = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                                    int i156 = f52809b;
                                    int i157 = ((i156 ^ 67) | (i156 & 67)) << 1;
                                    int i158 = -(((~i156) & 67) | (i156 & (-68)));
                                    int i159 = (i157 & i158) + (i158 | i157);
                                    f52808a = i159 % 128;
                                    int i160 = i159 % 2;
                                    str2 = strSubstring;
                                }
                            } else {
                                str2 = str6;
                                String strSubstring2 = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                                int i1510 = f52809b;
                                int i1511 = ((i1510 ^ 67) | (i1510 & 67)) << 1;
                                int i1512 = -(((~i1510) & 67) | (i1510 & (-68)));
                                int i1513 = (i1511 & i1512) + (i1512 | i1511);
                                f52808a = i1513 % 128;
                                int i161 = i1513 % 2;
                                str2 = strSubstring2;
                            }
                            str2 = str6;
                            str3 = (String) setDividerPadding(new Object[]{str2}, -299974757, 299974760, (int) System.currentTimeMillis());
                            int i162 = f52808a;
                            int i163 = i162 ^ 87;
                            i15 = (((i162 & 87) | i163) << 1) - i163;
                            f52809b = i15 % 128;
                            obj = str3;
                            if (i15 % 2 == 0) {
                                int i164 = 85 / 0;
                                obj = str3;
                            }
                            break;
                        }
                        if (i130 <= 0) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            if (i14 < i125) {
                                str2 = str6;
                                String strSubstring3 = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                                int i1514 = f52809b;
                                int i1515 = ((i1514 ^ 67) | (i1514 & 67)) << 1;
                                int i1516 = -(((~i1514) & 67) | (i1514 & (-68)));
                                int i1517 = (i1515 & i1516) + (i1516 | i1515);
                                f52808a = i1517 % 128;
                                int i165 = i1517 % 2;
                                str2 = strSubstring3;
                            }
                        } else {
                            str2 = str6;
                            String strSubstring4 = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                            int i1518 = f52809b;
                            int i1519 = ((i1518 ^ 67) | (i1518 & 67)) << 1;
                            int i15110 = -(((~i1518) & 67) | (i1518 & (-68)));
                            int i15111 = (i1519 & i15110) + (i15110 | i1519);
                            f52808a = i15111 % 128;
                            int i166 = i15111 % 2;
                            str2 = strSubstring4;
                        }
                        str2 = str6;
                        str3 = (String) setDividerPadding(new Object[]{str2}, -299974757, 299974760, (int) System.currentTimeMillis());
                        int i167 = f52808a;
                        int i168 = i167 ^ 87;
                        i15 = (((i167 & 87) | i168) << 1) - i168;
                        f52809b = i15 % 128;
                        obj = str3;
                        if (i15 % 2 == 0) {
                            int i169 = 85 / 0;
                            obj = str3;
                        }
                        break;
                    }
                    int i1412 = i130 & 1;
                    i13 = (((~i1412) & (i130 | 1)) - (~(i1412 << 1))) - 1;
                    int i1413 = f52809b + 11;
                    f52808a = i1413 % 128;
                    int i1414 = i1413 % 2;
                    i14 = i125;
                    while (i14 > i13) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        i16 = -(-((i14 ^ (-1)) | i14));
                        if (str6.charAt((i14 ^ i16) + ((i16 & i14) << 1)) == '\\') {
                            int i1415 = f52809b;
                            int i1416 = i1415 & 37;
                            int i1417 = (i1415 | 37) & (~i1416);
                            int i1418 = -(-(i1416 << 1));
                            int i1419 = ((i1417 | i1418) << 1) - (i1417 ^ i1418);
                            f52808a = i1419 % 128;
                            i17 = i1419 % 2;
                            cCharAt2 = str6.charAt(i14);
                            if (i17 != 0) {
                                if (cCharAt2 == '@') {
                                    int i14110 = f52809b;
                                    int i14111 = ((i14110 | 33) << 1) - ((i14110 & (-34)) | ((~i14110) & 33));
                                    f52808a = i14111 % 128;
                                    int i1520 = i14111 % 2;
                                    i14 -= 2;
                                    int i1521 = (((i14110 | 74) << 1) - (i14110 ^ 74)) - 1;
                                    f52808a = i1521 % 128;
                                    int i1522 = i1521 % 2;
                                }
                            } else if (cCharAt2 == ' ') {
                                int i14112 = f52809b;
                                int i14113 = ((i14112 | 33) << 1) - ((i14112 & (-34)) | ((~i14112) & 33));
                                f52808a = i14113 % 128;
                                int i1523 = i14113 % 2;
                                i14 -= 2;
                                int i1524 = (((i14112 | 74) << 1) - (i14112 ^ 74)) - 1;
                                f52808a = i1524 % 128;
                                int i1525 = i1524 % 2;
                            }
                        }
                        if (i130 <= 0) {
                            System.currentTimeMillis();
                            System.currentTimeMillis();
                            if (i14 < i125) {
                                str2 = str6;
                                String strSubstring5 = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                                int i15112 = f52809b;
                                int i15113 = ((i15112 ^ 67) | (i15112 & 67)) << 1;
                                int i15114 = -(((~i15112) & 67) | (i15112 & (-68)));
                                int i15115 = (i15113 & i15114) + (i15114 | i15113);
                                f52808a = i15115 % 128;
                                int i1610 = i15115 % 2;
                                str2 = strSubstring5;
                            }
                        } else {
                            str2 = str6;
                            String strSubstring6 = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                            int i15116 = f52809b;
                            int i15117 = ((i15116 ^ 67) | (i15116 & 67)) << 1;
                            int i15118 = -(((~i15116) & 67) | (i15116 & (-68)));
                            int i15119 = (i15117 & i15118) + (i15118 | i15117);
                            f52808a = i15119 % 128;
                            int i1611 = i15119 % 2;
                            str2 = strSubstring6;
                        }
                        str2 = str6;
                        str3 = (String) setDividerPadding(new Object[]{str2}, -299974757, 299974760, (int) System.currentTimeMillis());
                        int i1612 = f52808a;
                        int i1613 = i1612 ^ 87;
                        i15 = (((i1612 & 87) | i1613) << 1) - i1613;
                        f52809b = i15 % 128;
                        obj = str3;
                        if (i15 % 2 == 0) {
                            int i1614 = 85 / 0;
                            obj = str3;
                        }
                        break;
                    }
                    if (i130 <= 0) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        if (i14 < i125) {
                            str2 = str6;
                            String strSubstring7 = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                            int i151110 = f52809b;
                            int i151111 = ((i151110 ^ 67) | (i151110 & 67)) << 1;
                            int i151112 = -(((~i151110) & 67) | (i151110 & (-68)));
                            int i151113 = (i151111 & i151112) + (i151112 | i151111);
                            f52808a = i151113 % 128;
                            int i1615 = i151113 % 2;
                            str2 = strSubstring7;
                        }
                    } else {
                        str2 = str6;
                        String strSubstring8 = str6.substring(i130, (((i14 | 2) << 1) - (i14 ^ 2)) - 1);
                        int i151114 = f52809b;
                        int i151115 = ((i151114 ^ 67) | (i151114 & 67)) << 1;
                        int i151116 = -(((~i151114) & 67) | (i151114 & (-68)));
                        int i151117 = (i151115 & i151116) + (i151116 | i151115);
                        f52808a = i151117 % 128;
                        int i1616 = i151117 % 2;
                        str2 = strSubstring8;
                    }
                    str2 = str6;
                    str3 = (String) setDividerPadding(new Object[]{str2}, -299974757, 299974760, (int) System.currentTimeMillis());
                    int i1617 = f52808a;
                    int i1618 = i1617 ^ 87;
                    i15 = (((i1617 & 87) | i1618) << 1) - i1618;
                    f52809b = i15 % 128;
                    obj = str3;
                    if (i15 % 2 == 0) {
                        int i1619 = 85 / 0;
                        obj = str3;
                    }
                } else {
                    int i170 = f52809b;
                    int i171 = ((i170 ^ 54) + ((i170 & 54) << 1)) - 1;
                    f52808a = i171 % 128;
                    int i172 = i171 % 2;
                    int i173 = i170 & 55;
                    int i174 = -(-((i170 ^ 55) | i173));
                    int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
                    f52808a = i175 % 128;
                    int i176 = i175 % 2;
                    obj = str6;
                }
                break;
                break;
            case 8:
                StringBuffer stringBuffer3 = (StringBuffer) objArr[0];
                aii aiiVar2 = (aii) objArr[1];
                Hashtable hashtable2 = (Hashtable) objArr[2];
                int i177 = f52808a + 83;
                f52809b = i177 % 128;
                if (i177 % 2 == 0) {
                    throw null;
                }
                String str7 = (String) hashtable2.get((adu) aii.setCompoundDrawableTintBlendMode(new Object[]{aiiVar2}, 416665965, -416665962, System.identityHashCode(aiiVar2)));
                if (str7 != null) {
                    int i178 = f52808a;
                    int i179 = i178 & 125;
                    int i180 = -(-((i178 ^ 125) | i179));
                    int i181 = ((i179 | i180) << 1) - (i180 ^ i179);
                    f52809b = i181 % 128;
                    int i182 = i181 % 2;
                    stringBuffer3.append(str7);
                    if (i182 == 0) {
                        throw null;
                    }
                    int i183 = f52809b;
                    int i184 = i183 & 77;
                    int i185 = i184 + ((i183 ^ 77) | i184);
                    f52808a = i185 % 128;
                    int i186 = i185 % 2;
                } else {
                    adu aduVar = (adu) aii.setCompoundDrawableTintBlendMode(new Object[]{aiiVar2}, 416665965, -416665962, System.identityHashCode(aiiVar2));
                    stringBuffer3.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                    int i187 = f52808a + 113;
                    f52809b = i187 % 128;
                    int i188 = i187 % 2;
                }
                stringBuffer3.append('=');
                stringBuffer3.append((String) setDividerPadding(new Object[]{(add) aii.setCompoundDrawableTintBlendMode(new Object[]{aiiVar2}, -1419288037, 1419288038, System.identityHashCode(aiiVar2))}, 1946908321, -1946908320, (int) System.currentTimeMillis()));
                int i189 = f52808a;
                int i190 = i189 & 89;
                int i191 = -(-(i189 | 89));
                int i192 = (i190 & i191) + (i191 | i190);
                f52809b = i192 % 128;
                if (i192 % 2 != 0) {
                    return null;
                }
                throw null;
            default:
                Boolean bool = Boolean.FALSE;
                aii aiiVar3 = (aii) objArr[0];
                aii aiiVar4 = (aii) objArr[1];
                int i193 = f52809b;
                int i194 = i193 & 75;
                int i195 = i193 | 75;
                int i196 = ((i194 | i195) << 1) - (i194 ^ i195);
                f52808a = i196 % 128;
                int i197 = i196 % 2;
                if (aiiVar3 == aiiVar4) {
                    int i198 = i193 + 101;
                    int i199 = i198 % 128;
                    f52808a = i199;
                    int i200 = i198 % 2;
                    int i201 = i199 + 118;
                    int i202 = (i201 ^ (-1)) + (i201 << 1);
                    f52809b = i202 % 128;
                    if (i202 % 2 == 0) {
                        int i203 = 67 / 0;
                    }
                } else if (aiiVar3 == null) {
                    int i204 = ((i193 | 55) << 1) - ((i193 & (-56)) | ((~i193) & 55));
                    f52808a = i204 % 128;
                    int i205 = i204 % 2;
                    obj = bool;
                } else {
                    int i206 = (((i193 ^ 99) | (i193 & 99)) << 1) - ((i193 & (-100)) | ((~i193) & 99));
                    f52808a = i206 % 128;
                    int i207 = i206 % 2;
                    if (aiiVar4 != null) {
                        adu aduVar2 = (adu) aii.setCompoundDrawableTintBlendMode(new Object[]{aiiVar3}, 416665965, -416665962, System.identityHashCode(aiiVar3));
                        if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, (adu) aii.setCompoundDrawableTintBlendMode(new Object[]{aiiVar4}, 416665965, -416665962, System.identityHashCode(aiiVar4))}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                            int i208 = f52808a;
                            i20 = (((i208 | 44) << 1) - (i208 ^ 44)) - 1;
                            f52809b = i20 % 128;
                        } else if (((String) setDividerPadding(new Object[]{(add) aii.setCompoundDrawableTintBlendMode(new Object[]{aiiVar3}, -1419288037, 1419288038, System.identityHashCode(aiiVar3))}, 1188432987, -1188432982, (int) System.currentTimeMillis())).equals((String) setDividerPadding(new Object[]{(add) aii.setCompoundDrawableTintBlendMode(new Object[]{aiiVar4}, -1419288037, 1419288038, System.identityHashCode(aiiVar4))}, 1188432987, -1188432982, (int) System.currentTimeMillis()))) {
                            int i209 = f52808a;
                            int i210 = i209 & 97;
                            int i211 = (((i209 ^ 97) | i210) << 1) - ((i209 | 97) & (~i210));
                            f52809b = i211 % 128;
                            int i212 = i211 % 2;
                        } else {
                            int i213 = f52809b;
                            i20 = (i213 ^ 57) + ((i213 & 57) << 1);
                            f52808a = i20 % 128;
                        }
                        int i214 = i20 % 2;
                        obj = bool;
                    } else {
                        int i2010 = ((i193 | 55) << 1) - ((i193 & (-56)) | ((~i193) & 55));
                        f52808a = i2010 % 128;
                        int i2011 = i2010 % 2;
                        obj = bool;
                    }
                }
                obj = Boolean.TRUE;
                break;
        }
        obj = str;
        return obj;
    }

    public static void setOnFocusChangeListener(StringBuffer stringBuffer, aim aimVar, Hashtable hashtable) {
        setDividerPadding(new Object[]{stringBuffer, aimVar, hashtable}, -45786345, 45786349, (int) System.currentTimeMillis());
    }

    public static String setY(add addVar) {
        return (String) setDividerPadding(new Object[]{addVar}, 1188432987, -1188432982, (int) System.currentTimeMillis());
    }
}
