package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52791a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52792b = 1;

    /* JADX WARN: Code duplicated, block: B:31:0x0155  */
    /* JADX WARN: Code duplicated, block: B:33:0x016b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0170  */
    /* JADX WARN: Code duplicated, block: B:36:0x0173  */
    /* JADX WARN: Code duplicated, block: B:38:0x0180  */
    /* JADX WARN: Code duplicated, block: B:39:0x0188  */
    /* JADX WARN: Code duplicated, block: B:42:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:78:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:79:0x03eb  */
    public static /* synthetic */ void a(Object[] objArr) {
        String str;
        String str2;
        String str3;
        char c10;
        aeh aehVar;
        Object[] objArr2;
        int i10;
        StringBuilder sbE;
        int length;
        String string;
        StringBuilder sbE2;
        String str4;
        Object x4;
        int i11 = 0;
        String string2 = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        ady adyVarUiMessageCallbackKtWhenMappings = (ady) objArr[2];
        char c11 = 3;
        StringBuffer stringBuffer = (StringBuffer) objArr[3];
        while (true) {
            str = (String) bez.setX(new Object[i11], 464644689, -464644689, (int) System.currentTimeMillis());
            if (!(!(adyVarUiMessageCallbackKtWhenMappings instanceof adr))) {
                int i12 = f52792b;
                int i13 = ((i12 & (-70)) | ((~i12) & 69)) + ((i12 & 69) << 1);
                f52791a = i13 % 128;
                int i14 = i13 % 2;
                stringBuffer.append(string2);
                stringBuffer.append(VDVideoSelfieConfiguration.NULL);
                stringBuffer.append(str);
                int i15 = f52792b;
                int i16 = i15 & 95;
                int i17 = -(-((i15 ^ 95) | i16));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f52791a = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 67 / 0;
                    return;
                }
                return;
            }
            if (!(!(adyVarUiMessageCallbackKtWhenMappings instanceof aed))) {
                int i20 = f52791a + 87;
                f52792b = i20 % 128;
                int i21 = i20 % 2;
                stringBuffer.append(string2);
                if (!(adyVarUiMessageCallbackKtWhenMappings instanceof aey)) {
                    if (!(!(adyVarUiMessageCallbackKtWhenMappings instanceof afv))) {
                        int i22 = f52792b;
                        int i23 = i22 & 33;
                        int i24 = -(-((i22 ^ 33) | i23));
                        int i25 = (i23 & i24) + (i24 | i23);
                        f52791a = i25 % 128;
                        int i26 = i25 % 2;
                        str2 = "DER Sequence";
                    } else {
                        str2 = "Sequence";
                    }
                    stringBuffer.append(str2);
                } else {
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i27 = ~iCurrentTimeMillis;
                    int i28 = (-805591440) & i27;
                    int i29 = (iCurrentTimeMillis & 805591439) | i28;
                    int i30 = (-805591440) & iCurrentTimeMillis;
                    int i31 = ~((i29 ^ i30) | (i29 & i30));
                    int i32 = ((-41525249) & i31) | (41525248 & (~i31));
                    int i33 = i31 & 41525248;
                    int i34 = -(~(-(-(((i33 & i32) | (i32 ^ i33)) * (-502)))));
                    int i35 = ((814888276 | i34) << 1) - (i34 ^ 814888276);
                    int i36 = (i27 & 805591439) | ((~i27) & (-805591440));
                    int i37 = (i36 & i28) | (i36 ^ i28);
                    int i38 = (i37 & (-41525263)) | (i37 ^ (-41525263));
                    int i39 = ~i38;
                    int i40 = (((i35 ^ (-1)) + (i35 << 1)) - (~(-(-(((i38 | i39) & i39) * (-502)))))) - 1;
                    int i41 = 41525262 & iCurrentTimeMillis;
                    int i42 = (iCurrentTimeMillis | 41525262) & (~i41);
                    int i43 = ~((i42 & i41) | (i42 ^ i41));
                    int i44 = ((i43 & (-805591440)) | ((-805591440) ^ i43)) * 502;
                    int i45 = i40 & i44;
                    int i46 = i45 + ((i44 ^ i40) | i45);
                    System.currentTimeMillis();
                    stringBuffer.append("BER Sequence");
                    if (i46 <= -1270466176) {
                        throw null;
                    }
                }
                stringBuffer.append(str);
                aed aedVar = (aed) adyVarUiMessageCallbackKtWhenMappings;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                sb2.append("    ");
                String string3 = sb2.toString();
                int compoundDrawableTintBlendMode = aedVar.setCompoundDrawableTintBlendMode();
                int i47 = 0;
                while (i47 < compoundDrawableTintBlendMode) {
                    int i48 = f52791a;
                    int i49 = i48 & 79;
                    int i50 = (i48 | 79) & (~i49);
                    int i51 = -(-(i49 << 1));
                    int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
                    f52792b = i52 % 128;
                    int i53 = i52 % 2;
                    ady adyVarUiMessageCallbackKtWhenMappings2 = aedVar.setX(i47).UiMessageCallbackKtWhenMappings();
                    if (i53 == 0) {
                        setX(new Object[]{string3, Boolean.valueOf(zBooleanValue), adyVarUiMessageCallbackKtWhenMappings2, stringBuffer}, 1822621879, -1822621877, (int) System.currentTimeMillis());
                        i47 = (((i47 & (-127)) | ((~i47) & 126)) - (~(-(-((i47 & 126) << 1))))) - 1;
                    } else {
                        setX(new Object[]{string3, Boolean.valueOf(zBooleanValue), adyVarUiMessageCallbackKtWhenMappings2, stringBuffer}, 1822621879, -1822621877, (int) System.currentTimeMillis());
                        i47 = ((((i47 ^ 1) | (i47 & 1)) << 1) - (~(-(((~i47) & 1) | (i47 & (-2)))))) - 1;
                    }
                    int i54 = f52791a;
                    int i55 = i54 & 121;
                    int i56 = i54 | 121;
                    int i57 = (i55 & i56) + (i56 | i55);
                    f52792b = i57 % 128;
                    int i58 = i57 % 2;
                }
                int i59 = f52792b;
                int i60 = ((i59 ^ 23) | (i59 & 23)) << 1;
                int i61 = -(((~i59) & 23) | (i59 & (-24)));
                int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
                f52791a = i62 % 128;
                int i63 = i62 % 2;
                return;
            }
            if (adyVarUiMessageCallbackKtWhenMappings instanceof aee) {
                int i64 = f52792b;
                int i65 = (i64 & 32) + (i64 | 32);
                int i66 = (i65 ^ (-1)) + (i65 << 1);
                f52791a = i66 % 128;
                int i67 = i66 % 2;
                stringBuffer.append(string2);
                if (adyVarUiMessageCallbackKtWhenMappings instanceof afb) {
                    int i68 = f52791a + 31;
                    f52792b = i68 % 128;
                    int i69 = i68 % 2;
                    stringBuffer.append("BER Set");
                    if (i69 == 0) {
                        throw null;
                    }
                } else if (!(adyVarUiMessageCallbackKtWhenMappings instanceof afz)) {
                    stringBuffer.append("Set");
                    int i70 = f52792b + 15;
                    f52791a = i70 % 128;
                    int i71 = i70 % 2;
                } else {
                    int i72 = f52792b + 89;
                    f52791a = i72 % 128;
                    int i73 = i72 % 2;
                    stringBuffer.append("DER Set");
                }
                stringBuffer.append(str);
                aee aeeVar = (aee) adyVarUiMessageCallbackKtWhenMappings;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append("    ");
                String string4 = sb3.toString();
                Object[] objArr3 = new Object[1];
                objArr3[i11] = aeeVar;
                int iIntValue = ((Integer) aee.setCompoundDrawableTintBlendMode(objArr3, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue();
                int i74 = i11;
                while (i74 < iIntValue) {
                    int i75 = f52792b;
                    int i76 = i75 & 11;
                    int i77 = ((i75 ^ 11) | i76) << 1;
                    int i78 = -((i75 | 11) & (~i76));
                    int i79 = (i77 & i78) + (i78 | i77);
                    f52791a = i79 % 128;
                    int i80 = i79 % 2;
                    Object[] objArr4 = new Object[2];
                    objArr4[i11] = aeeVar;
                    objArr4[1] = Integer.valueOf(i74);
                    ady adyVarUiMessageCallbackKtWhenMappings3 = ((add) aee.setCompoundDrawableTintBlendMode(objArr4, -1624993461, 1624993461, i74)).UiMessageCallbackKtWhenMappings();
                    Object[] objArr5 = new Object[4];
                    objArr5[i11] = string4;
                    objArr5[1] = Boolean.valueOf(zBooleanValue);
                    objArr5[2] = adyVarUiMessageCallbackKtWhenMappings3;
                    objArr5[c11] = stringBuffer;
                    String str5 = string4;
                    setX(objArr5, 1822621879, -1822621877, (int) System.currentTimeMillis());
                    int i81 = (i74 & 82) | ((~i74) & (-83));
                    int i82 = (i74 & (-83)) << 1;
                    int i83 = (i81 & i82) + (i81 | i82);
                    int i84 = i83 & 84;
                    int i85 = -(-((i83 ^ 84) | i84));
                    i74 = (i84 & i85) + (i84 | i85);
                    int i86 = f52791a;
                    int i87 = (i86 ^ 99) + ((i86 & 99) << 1);
                    f52792b = i87 % 128;
                    int i88 = i87 % 2;
                    string4 = str5;
                    i11 = 0;
                }
                return;
            }
            if (!(adyVarUiMessageCallbackKtWhenMappings instanceof aeh)) {
                if (adyVarUiMessageCallbackKtWhenMappings instanceof ads) {
                    int i89 = f52791a;
                    int i90 = i89 & 67;
                    int i91 = (i89 ^ 67) | i90;
                    int i92 = (i90 & i91) + (i91 | i90);
                    f52792b = i92 % 128;
                    int i93 = i92 % 2;
                    ads adsVar = (ads) adyVarUiMessageCallbackKtWhenMappings;
                    if (adyVarUiMessageCallbackKtWhenMappings instanceof aex) {
                        sbE = f.e(string2, "BER Constructed Octet String[");
                        length = ((byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))).length;
                    } else {
                        sbE = f.e(string2, "DER Octet String[");
                        length = ((byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))).length;
                    }
                    sbE.append(length);
                    sbE.append("] ");
                    stringBuffer.append(sbE.toString());
                    if (!zBooleanValue) {
                        stringBuffer.append(str);
                        return;
                    }
                    int i94 = f52792b;
                    int i95 = (i94 & 80) + (i94 | 80);
                    int i96 = (i95 ^ (-1)) + (i95 << 1);
                    f52791a = i96 % 128;
                    int i97 = i96 % 2;
                    stringBuffer.append((String) setX(new Object[]{string2, (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, 102344760, -102344759, (int) System.currentTimeMillis()));
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    return;
                }
                if (adyVarUiMessageCallbackKtWhenMappings instanceof adu) {
                    StringBuilder sbE3 = f.e(string2, "ObjectIdentifier(");
                    adu aduVar = (adu) adyVarUiMessageCallbackKtWhenMappings;
                    sbE3.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
                    sbE3.append(")");
                    sbE3.append(str);
                    stringBuffer.append(sbE3.toString());
                    int i98 = f52792b;
                    int i99 = ((i98 | 11) << 1) - (i98 ^ 11);
                    f52791a = i99 % 128;
                    int i100 = i99 % 2;
                    return;
                }
                if (adyVarUiMessageCallbackKtWhenMappings instanceof aeg) {
                    StringBuilder sbE4 = f.e(string2, "RelativeOID(");
                    aeg aegVar = (aeg) adyVarUiMessageCallbackKtWhenMappings;
                    sbE4.append((String) aeg.setX(new Object[]{aegVar}, -1950729017, 1950729023, System.identityHashCode(aegVar)));
                    sbE4.append(")");
                    sbE4.append(str);
                    stringBuffer.append(sbE4.toString());
                    int i101 = f52791a;
                    int i102 = i101 ^ 21;
                    int i103 = ((i101 & 21) | i102) << 1;
                    int i104 = -i102;
                    int i105 = ((i103 | i104) << 1) - (i103 ^ i104);
                    f52792b = i105 % 128;
                    if (i105 % 2 == 0) {
                        int i106 = 32 / 0;
                        return;
                    }
                    return;
                }
                if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adf)) {
                    if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adp)) {
                        if (!(adyVarUiMessageCallbackKtWhenMappings instanceof acz)) {
                            if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adn)) {
                                if (!(adyVarUiMessageCallbackKtWhenMappings instanceof aen)) {
                                    if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adt)) {
                                        if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adz)) {
                                            if (!(adyVarUiMessageCallbackKtWhenMappings instanceof aer)) {
                                                if (!(adyVarUiMessageCallbackKtWhenMappings instanceof acy)) {
                                                    if (!(adyVarUiMessageCallbackKtWhenMappings instanceof ael)) {
                                                        if (!(adyVarUiMessageCallbackKtWhenMappings instanceof ado)) {
                                                            if (!(adyVarUiMessageCallbackKtWhenMappings instanceof aet)) {
                                                                if (!(adyVarUiMessageCallbackKtWhenMappings instanceof aeq)) {
                                                                    if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adm)) {
                                                                        if (!(adyVarUiMessageCallbackKtWhenMappings instanceof ade)) {
                                                                            if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adv)) {
                                                                                if (!(adyVarUiMessageCallbackKtWhenMappings instanceof adl)) {
                                                                                    sbE2 = c.d(string2);
                                                                                    sbE2.append(adyVarUiMessageCallbackKtWhenMappings.toString());
                                                                                    break;
                                                                                }
                                                                                adl adlVar = (adl) adyVarUiMessageCallbackKtWhenMappings;
                                                                                StringBuilder sb4 = new StringBuilder();
                                                                                sb4.append(string2);
                                                                                sb4.append("External ");
                                                                                sb4.append(str);
                                                                                stringBuffer.append(sb4.toString());
                                                                                StringBuilder sb5 = new StringBuilder();
                                                                                sb5.append(string2);
                                                                                sb5.append("    ");
                                                                                string2 = sb5.toString();
                                                                                if (((adu) adl.setDividerPadding(new Object[]{adlVar}, 89982222, -89982212, System.identityHashCode(adlVar))) != null) {
                                                                                    StringBuilder sbE5 = f.e(string2, "Direct Reference: ");
                                                                                    adu aduVar2 = (adu) adl.setDividerPadding(new Object[]{adlVar}, 89982222, -89982212, System.identityHashCode(adlVar));
                                                                                    sbE5.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar2}, 412071809, -412071801, System.identityHashCode(aduVar2)));
                                                                                    sbE5.append(str);
                                                                                    stringBuffer.append(sbE5.toString());
                                                                                    int i107 = f52792b;
                                                                                    int i108 = (i107 & (-32)) | (31 & (~i107));
                                                                                    int i109 = -(-((i107 & 31) << 1));
                                                                                    int i110 = (i108 & i109) + (i109 | i108);
                                                                                    f52791a = i110 % 128;
                                                                                    int i111 = i110 % 2;
                                                                                }
                                                                                if (((adp) adl.setDividerPadding(new Object[]{adlVar}, 901093441, -901093439, System.identityHashCode(adlVar))) != null) {
                                                                                    StringBuilder sbE6 = f.e(string2, "Indirect Reference: ");
                                                                                    sbE6.append(((adp) adl.setDividerPadding(new Object[]{adlVar}, 901093441, -901093439, System.identityHashCode(adlVar))).toString());
                                                                                    sbE6.append(str);
                                                                                    stringBuffer.append(sbE6.toString());
                                                                                    int i112 = f52792b;
                                                                                    int i113 = (i112 ^ 51) + ((i112 & 51) << 1);
                                                                                    f52791a = i113 % 128;
                                                                                    int i114 = i113 % 2;
                                                                                }
                                                                                if (((ady) adl.setDividerPadding(new Object[]{adlVar}, -948630986, 948630990, System.identityHashCode(adlVar))) != null) {
                                                                                    int i115 = f52791a;
                                                                                    int i116 = i115 & 117;
                                                                                    int i117 = -(-(i115 | 117));
                                                                                    int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                                                                                    f52792b = i118 % 128;
                                                                                    if (i118 % 2 == 0) {
                                                                                        setX(new Object[]{string2, Boolean.valueOf(zBooleanValue), (ady) adl.setDividerPadding(new Object[]{adlVar}, -948630986, 948630990, System.identityHashCode(adlVar)), stringBuffer}, 1822621879, -1822621877, (int) System.currentTimeMillis());
                                                                                        throw null;
                                                                                    }
                                                                                    setX(new Object[]{string2, Boolean.valueOf(zBooleanValue), (ady) adl.setDividerPadding(new Object[]{adlVar}, -948630986, 948630990, System.identityHashCode(adlVar)), stringBuffer}, 1822621879, -1822621877, (int) System.currentTimeMillis());
                                                                                }
                                                                                StringBuilder sbE7 = f.e(string2, "Encoding: ");
                                                                                sbE7.append(((Integer) adl.setDividerPadding(new Object[]{adlVar}, 2120988267, -2120988259, System.identityHashCode(adlVar))).intValue());
                                                                                sbE7.append(str);
                                                                                stringBuffer.append(sbE7.toString());
                                                                                adyVarUiMessageCallbackKtWhenMappings = (ady) adl.setDividerPadding(new Object[]{adlVar}, 538502844, -538502844, System.identityHashCode(adlVar));
                                                                                i11 = 0;
                                                                                c11 = 3;
                                                                            } else {
                                                                                adv advVar = (adv) adyVarUiMessageCallbackKtWhenMappings;
                                                                                StringBuilder sbE8 = f.e(string2, "ObjectDescriptor(");
                                                                                ado adoVar = (ado) adv.setDividerPadding(new Object[]{advVar}, -463731482, 463731484, System.identityHashCode(advVar));
                                                                                sbE8.append((String) ado.setDividerPadding(new Object[]{adoVar}, 136450461, -136450457, System.identityHashCode(adoVar)));
                                                                                sbE8.append(") ");
                                                                                sbE8.append(str);
                                                                                stringBuffer.append(sbE8.toString());
                                                                                int i119 = f52792b;
                                                                                int i120 = i119 & 27;
                                                                                int i121 = ((i119 ^ 27) | i120) << 1;
                                                                                int i122 = -((i119 | 27) & (~i120));
                                                                                int i123 = (i121 & i122) + (i122 | i121);
                                                                                f52791a = i123 % 128;
                                                                                int i124 = i123 % 2;
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            ade adeVar = (ade) adyVarUiMessageCallbackKtWhenMappings;
                                                                            StringBuilder sbE9 = f.e(string2, "DER Enumerated(");
                                                                            sbE9.append((BigInteger) ade.setY(new Object[]{adeVar}, 1706244763, -1706244762, System.identityHashCode(adeVar)));
                                                                            sbE9.append(")");
                                                                            sbE9.append(str);
                                                                            stringBuffer.append(sbE9.toString());
                                                                            int i125 = f52791a + 113;
                                                                            f52792b = i125 % 128;
                                                                            if (i125 % 2 == 0) {
                                                                                int i126 = 87 / 0;
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        StringBuilder sbE10 = f.e(string2, "GeneralizedTime(");
                                                                        adm admVar = (adm) adyVarUiMessageCallbackKtWhenMappings;
                                                                        sbE10.append((String) adm.setDividerPadding(new Object[]{admVar}, -742607419, 742607419, System.identityHashCode(admVar)));
                                                                        sbE10.append(") ");
                                                                        sbE10.append(str);
                                                                        stringBuffer.append(sbE10.toString());
                                                                        int i127 = f52791a;
                                                                        int i128 = i127 & 25;
                                                                        int i129 = -(-((i127 ^ 25) | i128));
                                                                        int i130 = ((i128 | i129) << 1) - (i129 ^ i128);
                                                                        f52792b = i130 % 128;
                                                                        int i131 = i130 % 2;
                                                                        return;
                                                                    }
                                                                } else {
                                                                    sbE2 = f.e(string2, "UTCTime(");
                                                                    aeq aeqVar = (aeq) adyVarUiMessageCallbackKtWhenMappings;
                                                                    x4 = aeq.setCompoundDrawableTintBlendMode(new Object[]{aeqVar}, 2109671480, -2109671479, System.identityHashCode(aeqVar));
                                                                }
                                                            } else {
                                                                sbE2 = f.e(string2, "VideotexString(");
                                                                aet aetVar = (aet) adyVarUiMessageCallbackKtWhenMappings;
                                                                x4 = aet.setOnFocusChangeListener(new Object[]{aetVar}, -1720775694, 1720775700, System.identityHashCode(aetVar));
                                                            }
                                                        } else {
                                                            sbE2 = f.e(string2, "GraphicString(");
                                                            ado adoVar2 = (ado) adyVarUiMessageCallbackKtWhenMappings;
                                                            x4 = ado.setDividerPadding(new Object[]{adoVar2}, 136450461, -136450457, System.identityHashCode(adoVar2));
                                                        }
                                                    } else {
                                                        sbE2 = f.e(string2, "T61String(");
                                                        ael aelVar = (ael) adyVarUiMessageCallbackKtWhenMappings;
                                                        x4 = ael.setCompoundDrawableTintBlendMode(new Object[]{aelVar}, -279697677, 279697680, System.identityHashCode(aelVar));
                                                    }
                                                } else {
                                                    StringBuilder sbE11 = f.e(string2, "BMPString(");
                                                    acy acyVar = (acy) adyVarUiMessageCallbackKtWhenMappings;
                                                    sbE11.append((String) acy.setCompoundDrawableTintBlendMode(new Object[]{acyVar}, -1319976363, 1319976366, System.identityHashCode(acyVar)));
                                                    sbE11.append(") ");
                                                    sbE11.append(str);
                                                    stringBuffer.append(sbE11.toString());
                                                    int i132 = f52792b;
                                                    int i133 = (i132 ^ 93) + ((i132 & 93) << 1);
                                                    f52791a = i133 % 128;
                                                    if (i133 % 2 != 0) {
                                                        throw null;
                                                    }
                                                    return;
                                                }
                                            } else {
                                                sbE2 = f.e(string2, "VisibleString(");
                                                aer aerVar = (aer) adyVarUiMessageCallbackKtWhenMappings;
                                                x4 = aer.setX(new Object[]{aerVar}, -1403866614, 1403866619, System.identityHashCode(aerVar));
                                            }
                                        } else {
                                            StringBuilder sbE12 = f.e(string2, "PrintableString(");
                                            adz adzVar = (adz) adyVarUiMessageCallbackKtWhenMappings;
                                            sbE12.append((String) adz.setDividerPadding(new Object[]{adzVar}, -1403301856, 1403301858, System.identityHashCode(adzVar)));
                                            sbE12.append(") ");
                                            sbE12.append(str);
                                            stringBuffer.append(sbE12.toString());
                                            int i134 = f52791a + 19;
                                            f52792b = i134 % 128;
                                            if (i134 % 2 == 0) {
                                                throw null;
                                            }
                                            return;
                                        }
                                    } else {
                                        sbE2 = f.e(string2, "NumericString(");
                                        adt adtVar = (adt) adyVarUiMessageCallbackKtWhenMappings;
                                        x4 = adt.setX(new Object[]{adtVar}, 412617720, -412617718, System.identityHashCode(adtVar));
                                    }
                                } else {
                                    sbE2 = f.e(string2, "UTF8String(");
                                    aen aenVar = (aen) adyVarUiMessageCallbackKtWhenMappings;
                                    x4 = aen.setDividerPadding(new Object[]{aenVar}, 1736212861, -1736212858, System.identityHashCode(aenVar));
                                }
                            } else {
                                sbE2 = f.e(string2, "IA5String(");
                                adn adnVar = (adn) adyVarUiMessageCallbackKtWhenMappings;
                                x4 = adn.setX(new Object[]{adnVar}, 1386730368, -1386730362, System.identityHashCode(adnVar));
                            }
                            sbE2.append((String) x4);
                            sbE2.append(") ");
                            break;
                        }
                        int i135 = f52791a;
                        int i136 = i135 & 55;
                        int i137 = (i136 - (~((i135 ^ 55) | i136))) - 1;
                        f52792b = i137 % 128;
                        acz aczVar = (acz) adyVarUiMessageCallbackKtWhenMappings;
                        if (i137 % 2 == 0) {
                            ((Integer) acz.setDividerPadding(new Object[]{aczVar}, 2120330947, -2120330940, System.identityHashCode(aczVar))).intValue();
                            boolean z10 = aczVar instanceof afk;
                            throw null;
                        }
                        byte[] bArr = (byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar));
                        int iIntValue2 = ((Integer) acz.setDividerPadding(new Object[]{aczVar}, 2120330947, -2120330940, System.identityHashCode(aczVar))).intValue();
                        if (aczVar instanceof afk) {
                            str4 = "DER Bit String[";
                        } else {
                            if (aczVar instanceof agd) {
                                str4 = "DL Bit String[";
                            } else {
                                StringBuilder sbE13 = f.e(string2, "BER Bit String[");
                                sbE13.append(bArr.length);
                                sbE13.append(", ");
                                sbE13.append(iIntValue2);
                                sbE13.append("] ");
                                stringBuffer.append(sbE13.toString());
                                int i138 = f52791a;
                                int i139 = ((i138 ^ 22) + ((i138 & 22) << 1)) - 1;
                                f52792b = i139 % 128;
                                int i140 = i139 % 2;
                            }
                            if (zBooleanValue) {
                                stringBuffer.append(str);
                                int i141 = f52791a + 37;
                                f52792b = i141 % 128;
                                int i142 = i141 % 2;
                                return;
                            }
                            int i143 = f52791a;
                            int i144 = ((i143 ^ 16) + ((i143 & 16) << 1)) - 1;
                            f52792b = i144 % 128;
                            int i145 = i144 % 2;
                            string = (String) setX(new Object[]{string2, bArr}, 102344760, -102344759, (int) System.currentTimeMillis());
                        }
                        StringBuilder sbE14 = f.e(string2, str4);
                        sbE14.append(bArr.length);
                        sbE14.append(", ");
                        sbE14.append(iIntValue2);
                        sbE14.append("] ");
                        stringBuffer.append(sbE14.toString());
                        if (zBooleanValue) {
                            stringBuffer.append(str);
                            int i146 = f52791a + 37;
                            f52792b = i146 % 128;
                            int i147 = i146 % 2;
                            return;
                        }
                        int i148 = f52791a;
                        int i149 = ((i148 ^ 16) + ((i148 & 16) << 1)) - 1;
                        f52792b = i149 % 128;
                        int i1410 = i149 % 2;
                        string = (String) setX(new Object[]{string2, bArr}, 102344760, -102344759, (int) System.currentTimeMillis());
                    } else {
                        sbE2 = f.e(string2, "Integer(");
                        adp adpVar = (adp) adyVarUiMessageCallbackKtWhenMappings;
                        sbE2.append((BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 1599682974, -1599682960, System.identityHashCode(adpVar)));
                        sbE2.append(")");
                        break;
                    }
                } else {
                    StringBuilder sbE15 = f.e(string2, "Boolean(");
                    adf adfVar = (adf) adyVarUiMessageCallbackKtWhenMappings;
                    sbE15.append(((Boolean) adf.setDividerPadding(new Object[]{adfVar}, 1550984628, -1550984623, System.identityHashCode(adfVar))).booleanValue());
                    sbE15.append(")");
                    sbE15.append(str);
                    string = sbE15.toString();
                }
                stringBuffer.append(string);
            }
            int i150 = f52791a;
            int i151 = (i150 & 21) + (i150 | 21);
            f52792b = i151 % 128;
            int i152 = i151 % 2;
            stringBuffer.append(string2);
            boolean z11 = adyVarUiMessageCallbackKtWhenMappings instanceof afd;
            if (i152 == 0) {
                int i153 = 75 / 0;
                if (z11) {
                    int i154 = f52791a;
                    int i155 = i154 & 81;
                    int i156 = ((i154 | 81) & (~i155)) + (i155 << 1);
                    f52792b = i156 % 128;
                    int i157 = i156 % 2;
                    str3 = "BER Tagged ";
                } else {
                    if (!(adyVarUiMessageCallbackKtWhenMappings instanceof afx)) {
                        str3 = "Tagged ";
                    } else {
                        i10 = f52791a + 41;
                        f52792b = i10 % 128;
                        if (i10 % 2 == 0) {
                            stringBuffer.append("DER Tagged ");
                            c10 = 0;
                            int i158 = 30 / 0;
                        } else {
                            c10 = 0;
                            stringBuffer.append("DER Tagged ");
                        }
                    }
                    aehVar = (aeh) adyVarUiMessageCallbackKtWhenMappings;
                    Object[] objArr6 = new Object[1];
                    objArr6[c10] = aehVar;
                    stringBuffer.append((String) aeu.setX(objArr6, 533451139, -533451138, (int) System.currentTimeMillis()));
                    objArr2 = new Object[1];
                    objArr2[c10] = aehVar;
                    if (!((Boolean) aeh.setOnFocusChangeListener(objArr2, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue()) {
                        int i159 = f52791a;
                        int i160 = ((i159 ^ 99) | (i159 & 99)) << 1;
                        int i161 = -(((~i159) & 99) | (i159 & (-100)));
                        int i162 = (i160 & i161) + (i161 | i160);
                        f52792b = i162 % 128;
                        int i163 = i162 % 2;
                        stringBuffer.append(" IMPLICIT ");
                        int i164 = f52791a;
                        int i165 = ((i164 ^ 115) | (i164 & 115)) << 1;
                        int i166 = -(((~i164) & 115) | (i164 & (-116)));
                        int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                        f52792b = i167 % 128;
                        int i168 = i167 % 2;
                    }
                    stringBuffer.append(str);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(string2);
                    sb6.append("    ");
                    string2 = sb6.toString();
                    adyVarUiMessageCallbackKtWhenMappings = ((adw) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1624263323, -1624263310, System.identityHashCode(aehVar))).UiMessageCallbackKtWhenMappings();
                    int i169 = f52792b;
                    int i170 = i169 & 113;
                    int i171 = (((i169 ^ 113) | i170) << 1) - ((i169 | 113) & (~i170));
                    f52791a = i171 % 128;
                    int i172 = i171 % 2;
                    i11 = 0;
                }
                stringBuffer.append(str3);
                c10 = 0;
                aehVar = (aeh) adyVarUiMessageCallbackKtWhenMappings;
                Object[] objArr7 = new Object[1];
                objArr7[c10] = aehVar;
                stringBuffer.append((String) aeu.setX(objArr7, 533451139, -533451138, (int) System.currentTimeMillis()));
                objArr2 = new Object[1];
                objArr2[c10] = aehVar;
                if (!((Boolean) aeh.setOnFocusChangeListener(objArr2, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue()) {
                    int i1510 = f52791a;
                    int i1610 = ((i1510 ^ 99) | (i1510 & 99)) << 1;
                    int i1611 = -(((~i1510) & 99) | (i1510 & (-100)));
                    int i1612 = (i1610 & i1611) + (i1611 | i1610);
                    f52792b = i1612 % 128;
                    int i1613 = i1612 % 2;
                    stringBuffer.append(" IMPLICIT ");
                    int i1614 = f52791a;
                    int i1615 = ((i1614 ^ 115) | (i1614 & 115)) << 1;
                    int i1616 = -(((~i1614) & 115) | (i1614 & (-116)));
                    int i1617 = ((i1615 | i1616) << 1) - (i1616 ^ i1615);
                    f52792b = i1617 % 128;
                    int i1618 = i1617 % 2;
                }
                stringBuffer.append(str);
                StringBuilder sb7 = new StringBuilder();
                sb7.append(string2);
                sb7.append("    ");
                string2 = sb7.toString();
                adyVarUiMessageCallbackKtWhenMappings = ((adw) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1624263323, -1624263310, System.identityHashCode(aehVar))).UiMessageCallbackKtWhenMappings();
                int i1619 = f52792b;
                int i173 = i1619 & 113;
                int i174 = (((i1619 ^ 113) | i173) << 1) - ((i1619 | 113) & (~i173));
                f52791a = i174 % 128;
                int i175 = i174 % 2;
                i11 = 0;
            } else {
                if (z11) {
                    int i1511 = f52791a;
                    int i1512 = i1511 & 81;
                    int i1513 = ((i1511 | 81) & (~i1512)) + (i1512 << 1);
                    f52792b = i1513 % 128;
                    int i1514 = i1513 % 2;
                    str3 = "BER Tagged ";
                } else {
                    if (!(adyVarUiMessageCallbackKtWhenMappings instanceof afx)) {
                        str3 = "Tagged ";
                    } else {
                        i10 = f52791a + 41;
                        f52792b = i10 % 128;
                        if (i10 % 2 == 0) {
                            stringBuffer.append("DER Tagged ");
                            c10 = 0;
                            int i1515 = 30 / 0;
                        } else {
                            c10 = 0;
                            stringBuffer.append("DER Tagged ");
                        }
                    }
                    aehVar = (aeh) adyVarUiMessageCallbackKtWhenMappings;
                    Object[] objArr8 = new Object[1];
                    objArr8[c10] = aehVar;
                    stringBuffer.append((String) aeu.setX(objArr8, 533451139, -533451138, (int) System.currentTimeMillis()));
                    objArr2 = new Object[1];
                    objArr2[c10] = aehVar;
                    if (!((Boolean) aeh.setOnFocusChangeListener(objArr2, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue()) {
                        int i1516 = f52791a;
                        int i16110 = ((i1516 ^ 99) | (i1516 & 99)) << 1;
                        int i16111 = -(((~i1516) & 99) | (i1516 & (-100)));
                        int i16112 = (i16110 & i16111) + (i16111 | i16110);
                        f52792b = i16112 % 128;
                        int i16113 = i16112 % 2;
                        stringBuffer.append(" IMPLICIT ");
                        int i16114 = f52791a;
                        int i16115 = ((i16114 ^ 115) | (i16114 & 115)) << 1;
                        int i16116 = -(((~i16114) & 115) | (i16114 & (-116)));
                        int i16117 = ((i16115 | i16116) << 1) - (i16116 ^ i16115);
                        f52792b = i16117 % 128;
                        int i16118 = i16117 % 2;
                    }
                    stringBuffer.append(str);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(string2);
                    sb8.append("    ");
                    string2 = sb8.toString();
                    adyVarUiMessageCallbackKtWhenMappings = ((adw) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1624263323, -1624263310, System.identityHashCode(aehVar))).UiMessageCallbackKtWhenMappings();
                    int i16119 = f52792b;
                    int i176 = i16119 & 113;
                    int i177 = (((i16119 ^ 113) | i176) << 1) - ((i16119 | 113) & (~i176));
                    f52791a = i177 % 128;
                    int i178 = i177 % 2;
                    i11 = 0;
                }
                stringBuffer.append(str3);
                c10 = 0;
                aehVar = (aeh) adyVarUiMessageCallbackKtWhenMappings;
                Object[] objArr9 = new Object[1];
                objArr9[c10] = aehVar;
                stringBuffer.append((String) aeu.setX(objArr9, 533451139, -533451138, (int) System.currentTimeMillis()));
                objArr2 = new Object[1];
                objArr2[c10] = aehVar;
                if (!((Boolean) aeh.setOnFocusChangeListener(objArr2, 1029869480, -1029869472, System.identityHashCode(aehVar))).booleanValue()) {
                    int i1517 = f52791a;
                    int i161110 = ((i1517 ^ 99) | (i1517 & 99)) << 1;
                    int i161111 = -(((~i1517) & 99) | (i1517 & (-100)));
                    int i161112 = (i161110 & i161111) + (i161111 | i161110);
                    f52792b = i161112 % 128;
                    int i161113 = i161112 % 2;
                    stringBuffer.append(" IMPLICIT ");
                    int i161114 = f52791a;
                    int i161115 = ((i161114 ^ 115) | (i161114 & 115)) << 1;
                    int i161116 = -(((~i161114) & 115) | (i161114 & (-116)));
                    int i161117 = ((i161115 | i161116) << 1) - (i161116 ^ i161115);
                    f52792b = i161117 % 128;
                    int i161118 = i161117 % 2;
                }
                stringBuffer.append(str);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(string2);
                sb9.append("    ");
                string2 = sb9.toString();
                adyVarUiMessageCallbackKtWhenMappings = ((adw) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 1624263323, -1624263310, System.identityHashCode(aehVar))).UiMessageCallbackKtWhenMappings();
                int i161119 = f52792b;
                int i179 = i161119 & 113;
                int i1710 = (((i161119 ^ 113) | i179) << 1) - ((i161119 | 113) & (~i179));
                f52791a = i1710 % 128;
                int i1711 = i1710 % 2;
                i11 = 0;
            }
        }
        sbE2.append(str);
        string = sbE2.toString();
        stringBuffer.append(string);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        char c10;
        boolean z10;
        String string;
        ady adyVarUiMessageCallbackKtWhenMappings;
        int i13 = i10 | i11;
        int i14 = ~i10;
        int i15 = ~((~i11) | i14);
        int i16 = i14 | (~i12);
        int i17 = i15 | (~i16);
        int i18 = ~(i12 | i13);
        int i19 = (((~(i16 | i11)) | i18) * 502) + ((i17 | i18) * (-502)) + (i13 * (-502)) + (i11 * 503) + (i10 * 503);
        int i20 = 1;
        int i21 = 2;
        if (i19 != 1) {
            if (i19 == 2) {
                a(objArr);
                return null;
            }
            if (i19 == 3) {
                Object obj = objArr[0];
                int i22 = f52791a;
                int i23 = i22 & 113;
                int i24 = -(-((i22 ^ 113) | i23));
                int i25 = (i23 & i24) + (i24 | i23);
                f52792b = i25 % 128;
                Object[] objArr2 = new Object[1];
                if (i25 % 2 != 0) {
                    objArr2[0] = obj;
                    return (String) setX(objArr2, -434948707, 434948707, (int) System.currentTimeMillis());
                }
                objArr2[0] = obj;
                throw null;
            }
            if (i19 != 4) {
                Object obj2 = objArr[0];
                int i26 = f52792b;
                int i27 = i26 + 37;
                int i28 = i27 % 128;
                f52791a = i28;
                int i29 = i27 % 2;
                if (obj2 instanceof ady) {
                    int i30 = i28 & 107;
                    int i31 = -(-((i28 ^ 107) | i30));
                    int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                    f52792b = i32 % 128;
                    adyVarUiMessageCallbackKtWhenMappings = (ady) obj2;
                    if (i32 % 2 == 0) {
                        throw null;
                    }
                    int i33 = (-2) - (((i28 & 80) + (i28 | 80)) ^ (-1));
                    f52792b = i33 % 128;
                    int i34 = i33 % 2;
                } else if (obj2 instanceof add) {
                    int i35 = (i26 & (-36)) | ((~i26) & 35);
                    int i36 = -(-((i26 & 35) << 1));
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    f52791a = i37 % 128;
                    add addVar = (add) obj2;
                    if (i37 % 2 != 0) {
                        addVar.UiMessageCallbackKtWhenMappings();
                        throw null;
                    }
                    adyVarUiMessageCallbackKtWhenMappings = addVar.UiMessageCallbackKtWhenMappings();
                } else {
                    StringBuilder sb2 = new StringBuilder("unknown object type ");
                    sb2.append(obj2.toString());
                    string = sb2.toString();
                    int i38 = f52792b;
                    int i39 = i38 & 111;
                    int i40 = (((i38 | 111) & (~i39)) - (~(i39 << 1))) - 1;
                    f52791a = i40 % 128;
                    if (i40 % 2 != 0) {
                        throw null;
                    }
                }
                StringBuffer stringBuffer = new StringBuffer();
                setX(new Object[]{"", Boolean.FALSE, adyVarUiMessageCallbackKtWhenMappings, stringBuffer}, 1822621879, -1822621877, (int) System.currentTimeMillis());
                string = stringBuffer.toString();
                int i41 = f52791a;
                int i42 = i41 & 83;
                int i43 = ((i41 ^ 83) | i42) << 1;
                int i44 = -((i41 | 83) & (~i42));
                int i45 = (i43 & i44) + (i43 | i44);
                f52792b = i45 % 128;
                int i46 = i45 % 2;
            } else {
                byte[] bArr = (byte[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                StringBuffer stringBuffer2 = new StringBuffer();
                int i47 = f52791a;
                int i48 = (i47 & 73) + (i47 | 73);
                f52792b = i48 % 128;
                int i49 = i48 % 2;
                int i50 = iIntValue;
                while (i50 != (iIntValue ^ iIntValue2) + ((iIntValue & iIntValue2) << 1)) {
                    int i51 = f52791a;
                    int i52 = (i51 & 22) + (i51 | 22);
                    int i53 = (i52 ^ (-1)) + (i52 << 1);
                    int i54 = i53 % 128;
                    f52792b = i54;
                    int i55 = i53 % 2;
                    byte b10 = bArr[i50];
                    if (b10 >= 32) {
                        int i56 = ((i54 ^ 62) + ((i54 & 62) << 1)) - 1;
                        int i57 = i56 % 128;
                        f52791a = i57;
                        int i58 = i56 % 2;
                        if (b10 <= 126) {
                            int i59 = i57 + 35;
                            f52792b = i59 % 128;
                            int i60 = i59 % 2;
                            stringBuffer2.append((char) b10);
                            int i61 = f52792b;
                            int i62 = (i61 ^ 27) + ((i61 & 27) << 1);
                            f52791a = i62 % 128;
                            int i63 = i62 % 2;
                        }
                    }
                    i50 = (((i50 ^ 1) | (i50 & 1)) << 1) - (((~i50) & 1) | (i50 & (-2)));
                    int i64 = f52791a;
                    int i65 = i64 & 39;
                    int i66 = (i64 | 39) & (~i65);
                    int i67 = -(-(i65 << 1));
                    int i68 = (i66 & i67) + (i66 | i67);
                    f52792b = i68 % 128;
                    int i69 = i68 % 2;
                }
                string = stringBuffer2.toString();
                int i70 = (-2) - ((f52792b + 22) ^ (-1));
                f52791a = i70 % 128;
                if (i70 % 2 != 0) {
                    throw null;
                }
            }
            return string;
        }
        String str = (String) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        String str2 = (String) bez.setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        String str3 = "    ";
        sb3.append("    ");
        String string2 = sb3.toString();
        stringBuffer3.append(str2);
        int i71 = f52792b + 2;
        int i72 = (i71 ^ (-1)) + (i71 << 1);
        f52791a = i72 % 128;
        int i73 = i72 % 2;
        int i74 = 0;
        while (i74 < bArr2.length) {
            int i75 = f52792b;
            int i76 = i75 & 101;
            int i77 = ((i75 ^ 101) | i76) << i20;
            int i78 = -((i75 | 101) & (~i76));
            int i79 = (i77 ^ i78) + ((i78 & i77) << i20);
            f52791a = i79 % 128;
            int i80 = i79 % i21;
            int length = bArr2.length;
            int i81 = -i74;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i82 = i81 * (-665);
            int i83 = length * 334;
            int i84 = ((i82 ^ i83) | (i82 & i83)) << 1;
            int i85 = -(((~i83) & i82) | ((~i82) & i83));
            int i86 = (i84 & i85) + (i84 | i85);
            int i87 = ~i81;
            int i88 = i87 * (-333);
            int i89 = i86 & i88;
            int i90 = i86 | i88;
            int i91 = (i89 ^ i90) + ((i89 & i90) << i20);
            int i92 = ~iCurrentTimeMillis;
            int i93 = i87 & i92;
            int i94 = ~(i93 | ((~i93) & (i87 | i92)));
            int i95 = length & iCurrentTimeMillis;
            int i96 = (~i95) & (length | iCurrentTimeMillis);
            int i97 = ~((i96 ^ i95) | (i96 & i95));
            int i98 = i94 ^ i97;
            int i99 = i97 & i94;
            int i100 = ((i99 & i98) | (i98 ^ i99)) * 333;
            int i101 = ((i91 | i100) << i20) - (i100 ^ i91);
            int i102 = ~((i87 ^ iCurrentTimeMillis) | (i87 & iCurrentTimeMillis));
            int i103 = (i92 | iCurrentTimeMillis) & i92;
            int i104 = ((~length) & i103) | ((~i103) & length);
            int i105 = i103 & length;
            int i106 = ~((i105 & i104) | (i104 ^ i105));
            if ((i101 - (~(((i102 & i106) | (((~i106) & i102) | ((~i102) & i106))) * 333))) - i20 > 32) {
                int i107 = f52791a + 5;
                f52792b = i107 % 128;
                int i108 = i107 % 2;
                stringBuffer3.append(string2);
                Object[] objArr3 = new Object[3];
                objArr3[0] = bArr2;
                objArr3[i20] = Integer.valueOf(i74);
                objArr3[2] = 32;
                Object[] objArr4 = new Object[i20];
                objArr4[0] = (byte[]) bfb.setCompoundDrawableTintBlendMode(objArr3, 447768942, -447768939, i74);
                stringBuffer3.append((String) bez.setX(objArr4, -1321203111, 1321203112, (int) System.currentTimeMillis()));
                stringBuffer3.append(str3);
                Object[] objArr5 = new Object[3];
                objArr5[0] = bArr2;
                objArr5[i20] = Integer.valueOf(i74);
                objArr5[2] = 32;
                stringBuffer3.append((String) setX(objArr5, 1972694547, -1972694543, i74));
                stringBuffer3.append(str2);
                int i109 = f52792b;
                int i110 = ((i109 ^ 54) + ((i109 & 54) << i20)) - 1;
                f52791a = i110 % 128;
                int i111 = i110 % 2;
                c10 = 3;
                z10 = false;
            } else {
                stringBuffer3.append(string2);
                int length2 = bArr2.length;
                Object[] objArr6 = new Object[3];
                objArr6[0] = bArr2;
                objArr6[i20] = Integer.valueOf(i74);
                objArr6[2] = Integer.valueOf(((length2 | i81) << i20) - (length2 ^ i81));
                Object[] objArr7 = new Object[i20];
                objArr7[0] = (byte[]) bfb.setCompoundDrawableTintBlendMode(objArr6, 447768942, -447768939, i74);
                stringBuffer3.append((String) bez.setX(objArr7, -1321203111, 1321203112, (int) System.currentTimeMillis()));
                int length3 = bArr2.length;
                int i112 = (length3 & i81) + (length3 | i81);
                int i113 = f52792b + 1;
                f52791a = i113 % 128;
                int i114 = i113 % 2;
                while (i112 != 32) {
                    int i115 = f52791a;
                    int i116 = ((i115 | 117) << i20) - (i115 ^ 117);
                    f52792b = i116 % 128;
                    int i117 = i116 % 2;
                    stringBuffer3.append("  ");
                    i112++;
                    int i118 = f52792b + 107;
                    f52791a = i118 % 128;
                    int i119 = i118 % 2;
                }
                stringBuffer3.append(str3);
                int length4 = bArr2.length;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i120 = i81 * 450;
                int i121 = length4 * (-448);
                int i122 = ((i120 ^ i121) - (~((i120 & i121) << i20))) - i20;
                int i123 = (i87 | i81) & i87;
                int i124 = i123 & length4;
                int i125 = (~i124) & (i123 | length4);
                int i126 = ~length4;
                int i127 = i125 | i124;
                int i128 = ~i127;
                int i129 = i128 & (i127 | i128);
                int i130 = ((~i126) & i81) | (i126 & i87);
                int i131 = i126 & i81;
                int i132 = (i130 ^ i131) | (i130 & i131);
                int i133 = i132 & iCurrentTimeMillis2;
                int i134 = (i132 | iCurrentTimeMillis2) & (~i133);
                int i135 = ~iCurrentTimeMillis2;
                int i136 = ~((i134 & i133) | (i134 ^ i133));
                int i137 = i129 & i136;
                int i138 = (i136 | i129) & (~i137);
                int i139 = (((i138 & i137) | (i138 ^ i137)) * 449) + i122;
                int i140 = i123 ^ length4;
                int i141 = -(-((~((i140 & i124) | (i140 ^ i124))) * (-1347)));
                int i142 = ((~i141) & i139) | ((~i139) & i141);
                int i143 = (i139 & i141) << 1;
                int i144 = (i142 & i143) + (i143 | i142);
                int i145 = i87 & length4;
                int i146 = (i87 | length4) & (~i145);
                int i147 = (i145 & i146) | (i146 ^ i145);
                int i148 = ~i147;
                int i149 = (i147 | i148) & i148;
                int i150 = i126 & (length4 | i126);
                int i151 = (i150 & i135) | (i150 ^ i135);
                int i152 = i151 & i81;
                int i153 = (i151 | i81) & (~i152);
                int i154 = ~((i153 & i152) | (i153 ^ i152));
                int i155 = i149 & i154;
                int i156 = (i149 | i154) & (~i155);
                int i157 = -(-(((i156 & i155) | (i156 ^ i155)) * 449));
                int i158 = (i144 & i157) + (i157 | i144);
                c10 = 3;
                z10 = false;
                stringBuffer3.append((String) setX(new Object[]{bArr2, Integer.valueOf(i74), Integer.valueOf(i158)}, 1972694547, -1972694543, i74));
                stringBuffer3.append(str2);
                int i159 = f52791a;
                int i160 = (i159 & 17) + (i159 | 17);
                f52792b = i160 % 128;
                int i161 = i160 % 2;
            }
            i74 = ((i74 | 32) << 1) - (i74 ^ 32);
            int i162 = f52792b;
            int i163 = i162 & 41;
            int i164 = (((i162 | 41) & (~i163)) - (~(i163 << 1))) - 1;
            f52791a = i164 % 128;
            int i165 = i164 % 2;
            string2 = string2;
            i20 = 1;
            i21 = 2;
            str3 = str3;
        }
        String string3 = stringBuffer3.toString();
        int i166 = f52791a;
        int i167 = i166 ^ 89;
        int i168 = ((i166 & 89) | i167) << 1;
        int i169 = -i167;
        int i170 = ((i168 | i169) << 1) - (i168 ^ i169);
        f52792b = i170 % 128;
        int i171 = i170 % 2;
        return string3;
    }

    public static String setX(Object obj) {
        return (String) setX(new Object[]{obj}, 495554292, -495554289, (int) System.currentTimeMillis());
    }
}
