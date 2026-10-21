package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aee extends ady implements bem {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final a f52536t0 = new a(aee.class, 17);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52537u0 = 0;
    public static int v0 = 1;
    protected add[] setCompoundDrawableTintBlendMode;
    protected final add[] setOnFocusChangeListener;

    public static class a extends j0 {
        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady d(aed aedVar) {
            Object[] objArr = {this, aedVar};
            System.identityHashCode(this);
            return ((aed) objArr[1]).g();
        }
    }

    static {
        int i10 = v0;
        int i11 = (-2) - (((i10 ^ 32) + ((i10 & 32) << 1)) ^ (-1));
        f52537u0 = i11 % 128;
        int i12 = i11 % 2;
    }

    public aee(add[] addVarArr, add[] addVarArr2) {
        this.setOnFocusChangeListener = addVarArr;
        this.setCompoundDrawableTintBlendMode = addVarArr2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0506  */
    /* JADX WARN: Code duplicated, block: B:103:0x0508  */
    /* JADX WARN: Code duplicated, block: B:106:0x0519  */
    /* JADX WARN: Code duplicated, block: B:108:0x051b A[LOOP:2: B:93:0x04c3->B:108:0x051b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x053c  */
    /* JADX WARN: Code duplicated, block: B:112:0x056a  */
    /* JADX WARN: Code duplicated, block: B:115:0x057c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0532 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x040f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0426  */
    /* JADX WARN: Code duplicated, block: B:90:0x043e  */
    /* JADX WARN: Code duplicated, block: B:94:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x04e9  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException, CloneNotSupportedException {
        Object objValueOf;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        byte b10;
        byte b11;
        int i22;
        int i23;
        int i24;
        int length;
        int i25;
        byte[] bArr;
        int i26;
        int i27;
        int i28 = ~i11;
        int i29 = i28 | i10;
        int i30 = (((~(i10 | i12)) | (~(i28 | i12)) | (~i29)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i29 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        int i31 = -1;
        char c10 = 0;
        int i32 = 1;
        switch (i30) {
            case 1:
                Object obj = objArr[0];
                int i33 = v0;
                int i34 = (i33 ^ 37) + ((i33 & 37) << 1);
                f52537u0 = i34 % 128;
                int i35 = i34 % 2;
                if (obj != null) {
                    int i36 = (i33 & 125) + (i33 | 125);
                    int i37 = i36 % 128;
                    f52537u0 = i37;
                    int i38 = i36 % 2;
                    if (!(obj instanceof aee)) {
                        if (!(obj instanceof add)) {
                            if (obj instanceof byte[]) {
                                int i39 = (i37 & 121) + (i37 | 121);
                                v0 = i39 % 128;
                                int i40 = i39 % 2;
                                a aVar = f52536t0;
                                try {
                                    if (i40 == 0) {
                                        throw null;
                                    }
                                    objValueOf = (aee) j0.c(-1221427223, 1221427224, System.identityHashCode(aVar), new Object[]{aVar, (byte[]) obj});
                                    int i41 = f52537u0;
                                    int i42 = i41 & 125;
                                    int i43 = (i41 ^ 125) | i42;
                                    int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                                    v0 = i44 % 128;
                                    int i45 = i44 % 2;
                                } catch (IOException e5) {
                                    StringBuilder sb2 = new StringBuilder("failed to construct set from byte[]: ");
                                    sb2.append(e5.getMessage());
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                break;
                            }
                            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
                        }
                        int i46 = i33 & 15;
                        int i47 = -(-((i33 ^ 15) | i46));
                        int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                        f52537u0 = i48 % 128;
                        if (i48 % 2 != 0) {
                            boolean z11 = ((add) obj).UiMessageCallbackKtWhenMappings() instanceof aee;
                            throw null;
                        }
                        ady adyVarUiMessageCallbackKtWhenMappings = ((add) obj).UiMessageCallbackKtWhenMappings();
                        if (!(adyVarUiMessageCallbackKtWhenMappings instanceof aee)) {
                            int i49 = v0;
                            int i50 = ((i49 | 79) << 1) - (i49 ^ 79);
                            f52537u0 = i50 % 128;
                            int i51 = i50 % 2;
                            throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
                        }
                        objValueOf = (aee) adyVarUiMessageCallbackKtWhenMappings;
                        int i52 = v0 + 105;
                        f52537u0 = i52 % 128;
                        if (i52 % 2 != 0) {
                            int i53 = 73 / 0;
                        }
                    }
                    break;
                }
                aee aeeVar = (aee) obj;
                int i54 = (i33 & 89) + (i33 | 89);
                f52537u0 = i54 % 128;
                int i55 = i54 % 2;
                return aeeVar;
            case 2:
                aee aeeVar2 = (aee) objArr[0];
                int i56 = f52537u0;
                int i57 = (i56 & 67) + (i56 | 67);
                v0 = i57 % 128;
                int i58 = i57 % 2;
                add[] addVarArr = aeeVar2.setOnFocusChangeListener;
                if (i58 != 0) {
                    return Integer.valueOf(addVarArr.length);
                }
                int length2 = addVarArr.length;
                throw null;
            case 3:
                aee aeeVar3 = (aee) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i59 = f52537u0;
                int i60 = ((i59 ^ 25) | (i59 & 25)) << 1;
                int i61 = -(((~i59) & 25) | (i59 & (-26)));
                int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                int i63 = i62 % 128;
                v0 = i63;
                if (i62 % 2 == 0) {
                    boolean z12 = adyVar instanceof aee;
                    throw null;
                }
                if (adyVar instanceof aee) {
                    aee aeeVar4 = (aee) adyVar;
                    int iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{aeeVar3}, -1113602318, 1113602320, System.identityHashCode(aeeVar3))).intValue();
                    if (((Integer) setCompoundDrawableTintBlendMode(new Object[]{aeeVar4}, -1113602318, 1113602320, System.identityHashCode(aeeVar4))).intValue() == iIntValue) {
                        afz afzVar = (afz) aeeVar3.e();
                        afz afzVar2 = (afz) aeeVar4.e();
                        int i64 = v0;
                        int i65 = (-2) - ((-1) ^ (((i64 | 104) << 1) - (i64 ^ 104)));
                        f52537u0 = i65 % 128;
                        int i66 = i65 % 2;
                        int i67 = 0;
                        while (i67 < iIntValue) {
                            int i68 = f52537u0;
                            int i69 = (i68 & (-36)) | ((~i68) & 35);
                            int i70 = (i68 & 35) << 1;
                            int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                            v0 = i71 % 128;
                            int i72 = i71 % 2;
                            ady adyVarUiMessageCallbackKtWhenMappings2 = afzVar.setOnFocusChangeListener[i67].UiMessageCallbackKtWhenMappings();
                            ady adyVarUiMessageCallbackKtWhenMappings3 = afzVar2.setOnFocusChangeListener[i67].UiMessageCallbackKtWhenMappings();
                            if (adyVarUiMessageCallbackKtWhenMappings2 != adyVarUiMessageCallbackKtWhenMappings3) {
                                int i73 = f52537u0;
                                int i74 = (i73 & (-112)) | ((~i73) & 111);
                                int i75 = (i73 & 111) << 1;
                                int i76 = (i74 ^ i75) + ((i75 & i74) << 1);
                                v0 = i76 % 128;
                                int i77 = i76 % 2;
                                if (!adyVarUiMessageCallbackKtWhenMappings2.d(adyVarUiMessageCallbackKtWhenMappings3)) {
                                    int i78 = f52537u0;
                                    int i79 = i78 | 111;
                                    int i80 = (i79 << 1) - ((~(i78 & 111)) & i79);
                                    v0 = i80 % 128;
                                    int i81 = i80 % 2;
                                    objValueOf = Boolean.FALSE;
                                    break;
                                }
                            }
                            int i82 = i67 & 1;
                            i67 = ((i67 | 1) & (~i82)) + (i82 << 1);
                            int i83 = v0 + 21;
                            f52537u0 = i83 % 128;
                            int i84 = i83 % 2;
                        }
                        int i85 = f52537u0 + 107;
                        v0 = i85 % 128;
                        int i86 = i85 % 2;
                        objValueOf = Boolean.TRUE;
                    } else {
                        int i87 = f52537u0;
                        int i88 = i87 ^ 81;
                        int i89 = (((i87 & 81) | i88) << 1) - i88;
                        int i90 = i89 % 128;
                        v0 = i90;
                        z10 = i89 % 2 == 0;
                        int i91 = i90 & 121;
                        int i92 = ((i90 | 121) & (~i91)) + (i91 << 1);
                        f52537u0 = i92 % 128;
                        int i93 = i92 % 2;
                    }
                } else {
                    int i94 = (((i63 | 44) << 1) - (i63 ^ 44)) - 1;
                    f52537u0 = i94 % 128;
                    z10 = i94 % 2 != 0;
                }
                objValueOf = Boolean.valueOf(z10);
                break;
                break;
            case 4:
                aeh aehVar = (aeh) objArr[0];
                int i95 = f52537u0;
                int i96 = i95 & 77;
                int i97 = (i95 ^ 77) | i96;
                int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                v0 = i98 % 128;
                int i99 = i98 % 2;
                a aVar2 = f52536t0;
                aee aeeVar5 = (aee) (i99 == 0 ? j0.c(-1072042084, 1072042084, System.identityHashCode(aVar2), new Object[]{aVar2, aehVar, Boolean.TRUE}) : j0.c(-1072042084, 1072042084, System.identityHashCode(aVar2), new Object[]{aVar2, aehVar, Boolean.FALSE}));
                int i100 = v0;
                int i101 = i100 | 81;
                int i102 = (i101 << 1) - ((~(i100 & 81)) & i101);
                f52537u0 = i102 % 128;
                if (i102 % 2 == 0) {
                    return aeeVar5;
                }
                int i103 = 77 / 0;
                return aeeVar5;
            case 5:
                aee aeeVar6 = (aee) objArr[0];
                int i104 = v0;
                int i105 = i104 & 43;
                int i106 = i104 | 43;
                int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                f52537u0 = i107 % 128;
                if (i107 % 2 == 0) {
                    return (add[]) adh.setCompoundDrawableTintBlendMode(new Object[]{aeeVar6.setOnFocusChangeListener}, -558945811, 558945816, (int) System.currentTimeMillis());
                }
                throw null;
            case 6:
                byte[] bArr2 = (byte[]) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i108 = f52537u0 + 47;
                int i109 = i108 % 128;
                v0 = i109;
                if (i108 % 2 != 0) {
                    int i110 = bArr2[0] & 223;
                    int i111 = bArr3[0] & 223;
                    if (i110 != i111) {
                        i13 = i111;
                        i14 = i110;
                        int i112 = i109 ^ 11;
                        int i113 = ((i109 & 11) | i112) << 1;
                        int i114 = -i112;
                        i15 = ((i113 | i114) << 1) - (i114 ^ i113);
                        i16 = i15 % 128;
                        f52537u0 = i16;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        if (i14 < i13) {
                            int i115 = (((i109 & (-120)) | ((~i109) & 119)) - (~(-(-((i109 & 119) << 1))))) - 1;
                            f52537u0 = i115 % 128;
                            int i116 = i115 % 2;
                            objValueOf = Boolean.FALSE;
                        } else {
                            int i117 = i16 ^ 59;
                            int i118 = ((i16 & 59) | i117) << 1;
                            int i119 = -i117;
                            int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                            v0 = i120 % 128;
                            int i121 = i120 % 2;
                            objValueOf = Boolean.TRUE;
                        }
                    }
                    int iMin = Math.min(bArr2.length, bArr3.length);
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i122 = -(-(iMin * (-195)));
                    int i123 = 391 ^ i122;
                    int i124 = ((((i122 & 391) | i123) << 1) - (~(-i123))) - 1;
                    int i125 = ~iMin;
                    int i126 = ~((i125 ^ (-1)) | i125);
                    int i127 = iMin & iCurrentTimeMillis;
                    int i128 = ((~i127) & (iMin | iCurrentTimeMillis)) | i127;
                    int i129 = ~i128;
                    int i130 = (i128 | i129) & i129;
                    int i131 = ((~i130) & i126) | ((~i126) & i130);
                    int i132 = i126 & i130;
                    int i133 = -(-(((i132 & i131) | (i131 ^ i132)) * (-196)));
                    int i134 = i124 & i133;
                    int i135 = ((i124 ^ i133) | i134) << 1;
                    int i136 = -((i124 | i133) & (~i134));
                    int i137 = (((i135 & i136) + (i136 | i135)) - (~(-(-((((-1) ^ iMin) | iMin) * 392))))) - 1;
                    int i138 = ~i125;
                    int i139 = ~((iMin & (~iCurrentTimeMillis)) | (iCurrentTimeMillis & i125) | i127);
                    int i140 = i138 & i139;
                    int i141 = (i139 | i138) & (~i140);
                    int i142 = -(-(((i141 & i140) | (i141 ^ i140)) * 196));
                    i17 = ((((~i142) & i137) | ((~i137) & i142)) - (~(-(-((i142 & i137) << 1))))) - 1;
                    int i143 = v0 + 100;
                    int i144 = (i143 ^ (-1)) + (i143 << 1);
                    f52537u0 = i144 % 128;
                    int i145 = i144 % 2;
                    i18 = 1;
                    while (true) {
                        if (i18 < i17) {
                            i20 = f52537u0;
                            int i146 = i20 + 53;
                            i21 = i146 % 128;
                            v0 = i21;
                            int i147 = i146 % 2;
                            b10 = bArr2[i18];
                            b11 = bArr3[i18];
                            if (b10 != b11) {
                                i22 = i21 ^ 53;
                                int i148 = (i21 & 53) << 1;
                                int i149 = (i22 & i148) + (i148 | i22);
                                f52537u0 = i149 % 128;
                                int i150 = i149 % 2;
                                if ((b10 & 255) < (b11 & 255)) {
                                    i23 = ((i21 ^ 68) + ((i21 & 68) << 1)) - 1;
                                    f52537u0 = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        throw null;
                                    }
                                    objValueOf = Boolean.FALSE;
                                } else {
                                    int i151 = i21 & 41;
                                    int i152 = (i21 ^ 41) | i151;
                                    int i153 = (i151 ^ i152) + ((i151 & i152) << 1);
                                    f52537u0 = i153 % 128;
                                    int i154 = i153 % 2;
                                    i24 = ((i21 | 53) << 1) - i22;
                                    f52537u0 = i24 % 128;
                                    if (i24 % 2 != 0) {
                                        throw null;
                                    }
                                    objValueOf = Boolean.TRUE;
                                }
                            } else {
                                i18 = ((i18 & 1) << 1) + (i18 ^ 1);
                                int i155 = (-2) - (((i20 & 126) + (i20 | 126)) ^ (-1));
                                v0 = i155 % 128;
                                int i156 = i155 % 2;
                            }
                        } else if ((bArr2[i17] & 255) <= (bArr3[i17] & 255)) {
                            int i157 = v0 + 112;
                            i19 = (i157 ^ (-1)) + (i157 << 1);
                            f52537u0 = i19 % 128;
                            if (i19 % 2 != 0) {
                                throw null;
                            }
                            objValueOf = Boolean.FALSE;
                        } else {
                            int i158 = f52537u0;
                            int i159 = ((i158 ^ 71) | (i158 & 71)) << 1;
                            int i160 = -(((~i158) & 71) | (i158 & (-72)));
                            int i161 = ((i159 | i160) << 1) - (i160 ^ i159);
                            int i162 = i161 % 128;
                            v0 = i162;
                            int i163 = i161 % 2;
                            int i164 = (-2) - ((-1) ^ ((i162 ^ 90) + ((i162 & 90) << 1)));
                            f52537u0 = i164 % 128;
                            int i165 = i164 % 2;
                            objValueOf = Boolean.TRUE;
                        }
                        break;
                    }
                } else {
                    i14 = bArr2[0] & 12125;
                    i13 = bArr3[1] & 11590;
                    if (i14 == i13) {
                        int iMin2 = Math.min(bArr2.length, bArr3.length);
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i1210 = -(-(iMin2 * (-195)));
                        int i1211 = 391 ^ i1210;
                        int i1212 = ((((i1210 & 391) | i1211) << 1) - (~(-i1211))) - 1;
                        int i1213 = ~iMin2;
                        int i1214 = ~((i1213 ^ (-1)) | i1213);
                        int i1215 = iMin2 & iCurrentTimeMillis2;
                        int i1216 = ((~i1215) & (iMin2 | iCurrentTimeMillis2)) | i1215;
                        int i1217 = ~i1216;
                        int i1310 = (i1216 | i1217) & i1217;
                        int i1311 = ((~i1310) & i1214) | ((~i1214) & i1310);
                        int i1312 = i1214 & i1310;
                        int i1313 = -(-(((i1312 & i1311) | (i1311 ^ i1312)) * (-196)));
                        int i1314 = i1212 & i1313;
                        int i1315 = ((i1212 ^ i1313) | i1314) << 1;
                        int i1316 = -((i1212 | i1313) & (~i1314));
                        int i1317 = (((i1315 & i1316) + (i1316 | i1315)) - (~(-(-((((-1) ^ iMin2) | iMin2) * 392))))) - 1;
                        int i1318 = ~i1213;
                        int i1319 = ~((iMin2 & (~iCurrentTimeMillis2)) | (iCurrentTimeMillis2 & i1213) | i1215);
                        int i1410 = i1318 & i1319;
                        int i1411 = (i1319 | i1318) & (~i1410);
                        int i1412 = -(-(((i1411 & i1410) | (i1411 ^ i1410)) * 196));
                        i17 = ((((~i1412) & i1317) | ((~i1317) & i1412)) - (~(-(-((i1412 & i1317) << 1))))) - 1;
                        int i1413 = v0 + 100;
                        int i1414 = (i1413 ^ (-1)) + (i1413 << 1);
                        f52537u0 = i1414 % 128;
                        int i1415 = i1414 % 2;
                        i18 = 1;
                        while (true) {
                            if (i18 < i17) {
                                i20 = f52537u0;
                                int i1416 = i20 + 53;
                                i21 = i1416 % 128;
                                v0 = i21;
                                int i1417 = i1416 % 2;
                                b10 = bArr2[i18];
                                b11 = bArr3[i18];
                                if (b10 != b11) {
                                    i22 = i21 ^ 53;
                                    int i1418 = (i21 & 53) << 1;
                                    int i1419 = (i22 & i1418) + (i1418 | i22);
                                    f52537u0 = i1419 % 128;
                                    int i1510 = i1419 % 2;
                                    if ((b10 & 255) < (b11 & 255)) {
                                        i23 = ((i21 ^ 68) + ((i21 & 68) << 1)) - 1;
                                        f52537u0 = i23 % 128;
                                        if (i23 % 2 != 0) {
                                            throw null;
                                        }
                                        objValueOf = Boolean.FALSE;
                                    } else {
                                        int i1511 = i21 & 41;
                                        int i1512 = (i21 ^ 41) | i1511;
                                        int i1513 = (i1511 ^ i1512) + ((i1511 & i1512) << 1);
                                        f52537u0 = i1513 % 128;
                                        int i1514 = i1513 % 2;
                                        i24 = ((i21 | 53) << 1) - i22;
                                        f52537u0 = i24 % 128;
                                        if (i24 % 2 != 0) {
                                            throw null;
                                        }
                                        objValueOf = Boolean.TRUE;
                                    }
                                } else {
                                    i18 = ((i18 & 1) << 1) + (i18 ^ 1);
                                    int i1515 = (-2) - (((i20 & 126) + (i20 | 126)) ^ (-1));
                                    v0 = i1515 % 128;
                                    int i1516 = i1515 % 2;
                                }
                            } else if ((bArr2[i17] & 255) <= (bArr3[i17] & 255)) {
                                int i1517 = v0 + 112;
                                i19 = (i1517 ^ (-1)) + (i1517 << 1);
                                f52537u0 = i19 % 128;
                                if (i19 % 2 != 0) {
                                    throw null;
                                }
                                objValueOf = Boolean.FALSE;
                            } else {
                                int i1518 = f52537u0;
                                int i1519 = ((i1518 ^ 71) | (i1518 & 71)) << 1;
                                int i166 = -(((~i1518) & 71) | (i1518 & (-72)));
                                int i167 = ((i1519 | i166) << 1) - (i166 ^ i1519);
                                int i168 = i167 % 128;
                                v0 = i168;
                                int i169 = i167 % 2;
                                int i1610 = (-2) - ((-1) ^ ((i168 ^ 90) + ((i168 & 90) << 1)));
                                f52537u0 = i1610 % 128;
                                int i1611 = i1610 % 2;
                                objValueOf = Boolean.TRUE;
                            }
                        }
                    } else {
                        int i1110 = i109 ^ 11;
                        int i1111 = ((i109 & 11) | i1110) << 1;
                        int i1112 = -i1110;
                        i15 = ((i1111 | i1112) << 1) - (i1112 ^ i1111);
                        i16 = i15 % 128;
                        f52537u0 = i16;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        if (i14 < i13) {
                            int i1113 = (((i109 & (-120)) | ((~i109) & 119)) - (~(-(-((i109 & 119) << 1))))) - 1;
                            f52537u0 = i1113 % 128;
                            int i1114 = i1113 % 2;
                            objValueOf = Boolean.FALSE;
                        } else {
                            int i1115 = i16 ^ 59;
                            int i1116 = ((i16 & 59) | i1115) << 1;
                            int i1117 = -i1115;
                            int i1218 = ((i1116 | i1117) << 1) - (i1117 ^ i1116);
                            v0 = i1218 % 128;
                            int i1219 = i1218 % 2;
                            objValueOf = Boolean.TRUE;
                        }
                    }
                }
                break;
            case 7:
                add addVar = (add) objArr[0];
                int i170 = f52537u0;
                int i171 = (-2) - ((-1) ^ ((i170 ^ 108) + ((i170 & 108) << 1)));
                v0 = i171 % 128;
                try {
                    if (i171 % 2 == 0) {
                        objValueOf = addVar.UiMessageCallbackKtWhenMappings().setX(ASN1Encoding.DER);
                        int i172 = 42 / 0;
                    } else {
                        objValueOf = addVar.UiMessageCallbackKtWhenMappings().setX(ASN1Encoding.DER);
                    }
                } catch (IOException unused) {
                    throw new IllegalArgumentException("cannot encode object added to SET");
                }
                break;
            case 8:
                add[] addVarArr2 = (add[]) objArr[0];
                int i173 = v0;
                int i174 = ~i173;
                int i175 = (((i173 & (-78)) | (i174 & 77)) - (~(-(-((i173 & 77) << 1))))) - 1;
                f52537u0 = i175 % 128;
                if (i175 % 2 == 0 ? (length = addVarArr2.length) >= 2 : (length = addVarArr2.length) >= 4) {
                    add addVar2 = addVarArr2[0];
                    add addVar3 = addVarArr2[1];
                    byte[] bArr4 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{addVar2}, -677682591, 677682598, (int) System.currentTimeMillis());
                    byte[] bArr5 = (byte[]) setCompoundDrawableTintBlendMode(new Object[]{addVar3}, -677682591, 677682598, (int) System.currentTimeMillis());
                    int i176 = 456436294;
                    int i177 = -456436288;
                    if (!(!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{bArr5, bArr4}, 456436294, -456436288, (int) System.currentTimeMillis())).booleanValue())) {
                        int i178 = f52537u0;
                        int i179 = i178 & 39;
                        int i180 = i179 + ((i178 ^ 39) | i179);
                        v0 = i180 % 128;
                        if (i180 % 2 == 0) {
                            throw null;
                        }
                        int i181 = i178 | 67;
                        int i182 = i181 << 1;
                        int i183 = -(i181 & (~(i178 & 67)));
                        int i184 = (i182 & i183) + (i183 | i182);
                        v0 = i184 % 128;
                        int i185 = i184 % 2;
                        addVar3 = addVar2;
                        addVar2 = addVar3;
                        bArr5 = bArr4;
                        bArr4 = bArr5;
                    }
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    int i186 = 2;
                    while (i186 < length) {
                        int i187 = v0;
                        int i188 = (((i187 | 110) << i32) - (i187 ^ 110)) + i31;
                        f52537u0 = i188 % 128;
                        int i189 = i188 % 2;
                        add addVar4 = addVarArr2[i186];
                        Object[] objArr2 = new Object[i32];
                        objArr2[c10] = addVar4;
                        byte[] bArr6 = (byte[]) setCompoundDrawableTintBlendMode(objArr2, -677682591, 677682598, (int) System.currentTimeMillis());
                        Object[] objArr3 = new Object[2];
                        objArr3[c10] = bArr5;
                        objArr3[1] = bArr6;
                        byte[] bArr7 = bArr6;
                        if (((Boolean) setCompoundDrawableTintBlendMode(objArr3, i176, i177, (int) System.currentTimeMillis())).booleanValue()) {
                            int i190 = f52537u0 + 43;
                            int i191 = i190 % 128;
                            v0 = i191;
                            if (i190 % 2 == 0) {
                                addVarArr2[i186 / 4] = addVar2;
                                i27 = 1;
                            } else {
                                int i192 = i186 & (-2);
                                i27 = 1;
                                int i193 = ((i186 ^ (-2)) | i192) << 1;
                                int i194 = -((~i192) & (i186 | (-2)));
                                addVarArr2[(i193 ^ i194) + ((i193 & i194) << 1)] = addVar2;
                            }
                            int i195 = (i191 ^ 53) + ((i191 & 53) << i27);
                            f52537u0 = i195 % 128;
                            int i196 = i195 % 2;
                            addVar2 = addVar3;
                            i25 = length;
                            addVar3 = addVar4;
                            i26 = i176;
                            bArr7 = bArr5;
                            bArr5 = bArr7;
                        } else {
                            add addVar5 = addVar3;
                            if (!(!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{bArr4, bArr7}, i176, i177, (int) System.currentTimeMillis())).booleanValue())) {
                                int i197 = v0;
                                int i198 = i197 & 109;
                                int i199 = i198 + ((i197 ^ 109) | i198);
                                f52537u0 = i199 % 128;
                                int i200 = i199 % 2;
                                int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                                int i201 = i186 * (-565);
                                int i202 = (-1134) & i201;
                                int i203 = ((i201 | (-1134)) & (~i202)) + (i202 << 1);
                                int i204 = (1 ^ i186) | (1 & i186);
                                int i205 = ~i204;
                                int i206 = (i204 | i205) & i205;
                                int i207 = 1 ^ iCurrentTimeMillis3;
                                int i208 = ~iCurrentTimeMillis3;
                                int i209 = 1 & iCurrentTimeMillis3;
                                int i210 = ~((i207 ^ i209) | (i207 & i209));
                                int i211 = i206 ^ i210;
                                int i212 = i210 & i206;
                                int i213 = ((i212 & i211) | (i211 ^ i212)) * (-566);
                                int i214 = i203 ^ i213;
                                int i215 = ((((i203 & i213) | i214) << 1) - (~(-i214))) - 1;
                                int i216 = ~i186;
                                int i217 = (i216 | i186) & i216;
                                int i218 = (i217 & 1) | ((-2) & (~i217));
                                int i219 = i217 & (-2);
                                int i220 = (i219 & i218) | (i218 ^ i219);
                                int i221 = ~i220;
                                int i222 = -(-(((i220 | i221) & i221) * 566));
                                int i223 = i215 & i222;
                                int i224 = ((i215 | i222) & (~i223)) + (i223 << 1);
                                int i225 = (i216 & 1) | (1 ^ i216);
                                int i226 = (i225 & i208) | ((~i225) & iCurrentTimeMillis3);
                                int i227 = iCurrentTimeMillis3 & i225;
                                int i228 = -(-((~((i227 & i226) | (i226 ^ i227))) * 566));
                                addVarArr2[(i224 ^ i228) + ((i228 & i224) << 1)] = addVar2;
                                int i229 = f52537u0;
                                int i230 = (i229 | 91) << 1;
                                int i231 = -(((~i229) & 91) | (i229 & (-92)));
                                int i232 = (i230 ^ i231) + ((i231 & i230) << 1);
                                v0 = i232 % 128;
                                int i233 = i232 % 2;
                                addVar3 = addVar5;
                                i25 = length;
                                addVar2 = addVar4;
                                i26 = 456436294;
                            } else {
                                int i234 = (i186 ^ (-1)) + (i186 << 1);
                                System.currentTimeMillis();
                                System.currentTimeMillis();
                                while (true) {
                                    i234--;
                                    if (i234 > 0) {
                                        int i235 = f52537u0;
                                        int i236 = (((i235 ^ 65) | (i235 & 65)) << 1) - (((~i235) & 65) | (i235 & (-66)));
                                        v0 = i236 % 128;
                                        int i237 = i236 % 2;
                                        add addVar6 = addVarArr2[((i234 << 1) - i234) - 1];
                                        i25 = length;
                                        bArr = bArr4;
                                        i26 = 456436294;
                                        if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{(byte[]) setCompoundDrawableTintBlendMode(new Object[]{addVar6}, -677682591, 677682598, (int) System.currentTimeMillis()), bArr7}, 456436294, -456436288, (int) System.currentTimeMillis())).booleanValue()) {
                                            int i238 = f52537u0;
                                            int i239 = (-2) - ((((i238 | 94) << 1) - (i238 ^ 94)) ^ (-1));
                                            v0 = i239 % 128;
                                            if (i239 % 2 == 0) {
                                                addVarArr2[i234] = addVar6;
                                                int i240 = 37 / 0;
                                            } else {
                                                addVarArr2[i234] = addVar6;
                                            }
                                            int i241 = ((i238 & (-50)) | (49 & (~i238))) + ((i238 & 49) << 1);
                                            v0 = i241 % 128;
                                            int i242 = i241 % 2;
                                            bArr4 = bArr;
                                            length = i25;
                                        }
                                    } else {
                                        i25 = length;
                                        bArr = bArr4;
                                        i26 = 456436294;
                                    }
                                }
                                addVarArr2[i234] = addVar4;
                                int i243 = v0;
                                int i244 = (i243 & 103) + (i243 | 103);
                                f52537u0 = i244 % 128;
                                int i245 = i244 % 2;
                                bArr7 = bArr;
                                addVar3 = addVar5;
                            }
                        }
                        int i246 = (i186 | 1) << 1;
                        int i247 = -(((~i186) & 1) | (i186 & (-2)));
                        i186 = ((i247 & i246) << 1) + (i246 ^ i247);
                        int i248 = f52537u0;
                        int i249 = (i248 & 11) + (i248 | 11);
                        v0 = i249 % 128;
                        int i250 = i249 % 2;
                        i176 = i26;
                        bArr4 = bArr7;
                        length = i25;
                        i31 = -1;
                        c10 = 0;
                        i32 = 1;
                        i177 = -456436288;
                    }
                    int i251 = length;
                    addVarArr2[((i251 | (-2)) << 1) - (i251 ^ (-2))] = addVar2;
                    int i252 = ((i251 ^ (-1)) | i251) << 1;
                    int i253 = -(~length);
                    addVarArr2[((i252 | i253) << 1) - (i252 ^ i253)] = addVar3;
                    int i254 = v0 + 112;
                    int i255 = (i254 ^ (-1)) + (i254 << 1);
                    f52537u0 = i255 % 128;
                    int i256 = i255 % 2;
                } else {
                    int i257 = (((i173 ^ 79) | (i173 & 79)) << 1) - ((79 & i174) | (i173 & (-80)));
                    f52537u0 = i257 % 128;
                    if (i257 % 2 != 0) {
                        throw null;
                    }
                }
                return null;
            case 9:
                int i258 = f52537u0;
                int i259 = i258 & 35;
                int i260 = i259 + ((i258 ^ 35) | i259);
                v0 = i260 % 128;
                int i261 = i260 % 2;
                int i262 = (i258 & (-10)) | ((~i258) & 9);
                int i263 = (i258 & 9) << 1;
                int i264 = (i262 ^ i263) + ((i263 & i262) << 1);
                v0 = i264 % 128;
                if (i264 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            default:
                aee aeeVar7 = (aee) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i265 = v0;
                int i266 = i265 & 111;
                int i267 = (i266 - (~((i265 ^ 111) | i266))) - 1;
                f52537u0 = i267 % 128;
                int i268 = i267 % 2;
                Object[] objArr4 = aeeVar7.setOnFocusChangeListener;
                if (i268 != 0) {
                    Object obj2 = objArr4[iIntValue2];
                    throw null;
                }
                objValueOf = objArr4[iIntValue2];
                int i269 = i265 & 99;
                int i270 = i269 + ((i265 ^ 99) | i269);
                f52537u0 = i270 % 128;
                if (i270 % 2 != 0) {
                    throw null;
                }
                break;
        }
        return objValueOf;
    }

    public static aee setX(Object obj) {
        return (aee) setCompoundDrawableTintBlendMode(new Object[]{obj}, -156503718, 156503719, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public ady a() {
        ago agoVar = new ago(this.setOnFocusChangeListener, this.setCompoundDrawableTintBlendMode);
        agoVar.f52626w0 = -1;
        int i10 = v0;
        int i11 = i10 & 59;
        int i12 = -(-(i10 | 59));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f52537u0 = i13 % 128;
        int i14 = i13 % 2;
        return agoVar;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, adyVar}, 675187594, -675187591, System.identityHashCode(this))).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    /* JADX WARN: Code duplicated, block: B:12:0x005a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.mypinpad.tsdk.isolation.ady
    public ady e() throws IOException, CloneNotSupportedException {
        int i10;
        int i11 = f52537u0;
        int i12 = i11 ^ 67;
        int i13 = (i11 & 67) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        int i15 = i14 % 128;
        v0 = i15;
        if (i14 % 2 == 0) {
            int i16 = 87 / 0;
            if (this.setCompoundDrawableTintBlendMode == null) {
                int i17 = i15 & 5;
                int i18 = ((i15 ^ 5) | i17) << 1;
                int i19 = -((i15 | 5) & (~i17));
                i10 = (i18 ^ i19) + ((i19 & i18) << 1);
                f52537u0 = i10 % 128;
                if (i10 % 2 != 0) {
                    add[] addVarArr = (add[]) this.setOnFocusChangeListener.clone();
                    this.setCompoundDrawableTintBlendMode = addVarArr;
                    setCompoundDrawableTintBlendMode(new Object[]{addVarArr}, -907479747, 907479755, (int) System.currentTimeMillis());
                    int i20 = 88 / 0;
                } else {
                    add[] addVarArr2 = (add[]) this.setOnFocusChangeListener.clone();
                    this.setCompoundDrawableTintBlendMode = addVarArr2;
                    setCompoundDrawableTintBlendMode(new Object[]{addVarArr2}, -907479747, 907479755, (int) System.currentTimeMillis());
                }
            }
        } else if (this.setCompoundDrawableTintBlendMode == null) {
            int i110 = i15 & 5;
            int i111 = ((i15 ^ 5) | i110) << 1;
            int i112 = -((i15 | 5) & (~i110));
            i10 = (i111 ^ i112) + ((i112 & i111) << 1);
            f52537u0 = i10 % 128;
            if (i10 % 2 != 0) {
                add[] addVarArr3 = (add[]) this.setOnFocusChangeListener.clone();
                this.setCompoundDrawableTintBlendMode = addVarArr3;
                setCompoundDrawableTintBlendMode(new Object[]{addVarArr3}, -907479747, 907479755, (int) System.currentTimeMillis());
                int i21 = 88 / 0;
            } else {
                add[] addVarArr4 = (add[]) this.setOnFocusChangeListener.clone();
                this.setCompoundDrawableTintBlendMode = addVarArr4;
                setCompoundDrawableTintBlendMode(new Object[]{addVarArr4}, -907479747, 907479755, (int) System.currentTimeMillis());
            }
        }
        afz afzVar = new afz(((Boolean) afz.setDividerPadding(new Object[]{Boolean.TRUE}, 824292920, -824292917, (int) System.currentTimeMillis())).booleanValue(), this.setCompoundDrawableTintBlendMode);
        afzVar.f52610w0 = -1;
        int i22 = f52537u0;
        int i23 = i22 & 45;
        int i24 = (((i22 | 45) & (~i23)) - (~(i23 << 1))) - 1;
        v0 = i24 % 128;
        if (i24 % 2 != 0) {
            return afzVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = v0;
        int i11 = i10 + 37;
        f52537u0 = i11 % 128;
        int i12 = i11 % 2;
        int length = this.setOnFocusChangeListener.length;
        int i13 = length ^ 1;
        int i14 = ((length & 1) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        int i17 = ((((i10 ^ 3) | (i10 & 3)) << 1) - (~(-(((~i10) & 3) | (i10 & (-4)))))) - 1;
        while (true) {
            f52537u0 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((~length) | length) << 1;
            int i20 = -(~length);
            length = (i19 & i20) + (i19 | i20);
            if (length < 0) {
                break;
            }
            int i21 = v0;
            int i22 = ((i21 | 119) << 1) - (i21 ^ 119);
            f52537u0 = i22 % 128;
            int i23 = i22 % 2;
            int iHashCode = this.setOnFocusChangeListener[length].UiMessageCallbackKtWhenMappings().hashCode();
            int iIdentityHashCode = System.identityHashCode(this);
            int i24 = iHashCode * (-589);
            int i25 = -(-(i16 * 591));
            int i26 = i24 & i25;
            int i27 = i26 + ((i24 ^ i25) | i26);
            int i28 = ~i16;
            int i29 = ~iIdentityHashCode;
            int i30 = ((~i29) & i28) | ((~i28) & i29);
            int i31 = i28 & i29;
            int i32 = (i30 & i31) | (i30 ^ i31);
            int i33 = (i32 | (~i32)) & (~i32);
            int i34 = ~i16;
            int i35 = i34 & iHashCode;
            int i36 = (i34 | iHashCode) & (~i35);
            int i37 = ~((i36 & i35) | (i36 ^ i35));
            int i38 = ((~i37) & i33) | ((~i33) & i37);
            int i39 = i33 & i37;
            int i40 = (i39 & i38) | (i38 ^ i39);
            int i41 = ~iIdentityHashCode;
            int i42 = (i41 | iIdentityHashCode) & i29;
            int i43 = ~((i42 ^ iHashCode) | (i42 & iHashCode));
            int i44 = i40 ^ i43;
            int i45 = i40 & i43;
            int i46 = (i45 & i44) | (i44 ^ i45);
            int i47 = ~iHashCode;
            int i48 = ((~iHashCode) | iHashCode) & i47;
            int i49 = i48 & i16;
            int i50 = (i48 | i16) & (~i49);
            int i51 = ~i16;
            int i52 = (i50 & i49) | (i50 ^ i49);
            int i53 = i52 ^ iIdentityHashCode;
            int i54 = iIdentityHashCode & i52;
            int i55 = ~((i54 & i53) | (i53 ^ i54));
            int i56 = i46 ^ i55;
            int i57 = i55 & i46;
            int i58 = ((i57 & i56) | (i56 ^ i57)) * 590;
            int i59 = (i27 ^ i58) + ((i58 & i27) << 1);
            int i60 = (i51 | i16) & i28;
            int i61 = i60 ^ i42;
            int i62 = i60 & i42;
            int i63 = ~((i62 & i61) | (i61 ^ i62));
            int i64 = i28 & iHashCode;
            int i65 = (i28 | iHashCode) & (~i64);
            int i66 = ~((i65 & i64) | (i65 ^ i64));
            int i67 = i63 & i66;
            int i68 = (i63 | i66) & (~i67);
            int i69 = (i68 & i67) | (i68 ^ i67);
            int i70 = i41 ^ iHashCode;
            int i71 = iHashCode & i41;
            int i72 = (i71 & i70) | (i70 ^ i71);
            int i73 = (i72 | (~i72)) & (~i72);
            int i74 = ((i73 & i69) | (i69 ^ i73)) * (-1180);
            int i75 = i59 & i74;
            int i76 = (i75 - (~(-(-((i74 ^ i59) | i75))))) - 1;
            int i77 = ~((i47 ^ i29) | (i47 & i29));
            int i78 = i29 ^ i16;
            int i79 = i16 & i29;
            int i80 = ~((i78 & i79) | (i78 ^ i79));
            int i81 = -(-(((i77 & i80) | (i77 ^ i80)) * 590));
            i16 = ((i76 | i81) << 1) - (i81 ^ i76);
            int i82 = v0;
            i17 = (i82 ^ 93) + ((i82 & 93) << 1);
        }
        int i83 = f52537u0;
        int i84 = i83 & 33;
        int i85 = (i84 - (~(-(-((i83 ^ 33) | i84))))) - 1;
        v0 = i85 % 128;
        if (i85 % 2 == 0) {
            int i86 = 11 / 0;
        }
        return i16;
    }

    @Override // java.lang.Iterable
    public Iterator<add> iterator() {
        bek.setDividerPadding setdividerpadding = new bek.setDividerPadding((add[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1399803012, -1399803007, System.identityHashCode(this)));
        int i10 = v0;
        int i11 = i10 & 3;
        int i12 = ((i10 ^ 3) | i11) << 1;
        int i13 = -((i10 | 3) & (~i11));
        int i14 = (i12 & i13) + (i12 | i13);
        f52537u0 = i14 % 128;
        if (i14 % 2 == 0) {
            return setdividerpadding;
        }
        throw null;
    }

    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1113602318, 1113602320, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -744449179, 744449188, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = v0;
        int i11 = ((i10 ^ 52) + ((i10 & 52) << 1)) - 1;
        f52537u0 = i11 % 128;
        int i12 = 0;
        if (i11 % 2 != 0) {
            ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1113602318, 1113602320, System.identityHashCode(this))).intValue();
            throw null;
        }
        int iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1113602318, 1113602320, System.identityHashCode(this))).intValue();
        if (iIntValue == 0) {
            int i13 = v0 + 59;
            f52537u0 = i13 % 128;
            if (i13 % 2 == 0) {
                return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            throw null;
        }
        StringBuffer stringBuffer = new StringBuffer(Constant.BRACKET_OPEN);
        int i14 = f52537u0;
        int i15 = i14 & 73;
        int i16 = ((i14 ^ 73) | i15) << 1;
        int i17 = -((i14 | 73) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        v0 = i18 % 128;
        int i19 = i18 % 2;
        while (true) {
            stringBuffer.append(this.setOnFocusChangeListener[i12]);
            int i20 = i12 & 1;
            int i21 = ((i12 ^ 1) | i20) << 1;
            int i22 = -((i12 | 1) & (~i20));
            i12 = (i21 ^ i22) + ((i21 & i22) << 1);
            if (i12 >= iIntValue) {
                stringBuffer.append(AbstractJsonLexerKt.END_LIST);
                String string = stringBuffer.toString();
                int i23 = f52537u0;
                int i24 = ((i23 | 119) << 1) - (i23 ^ 119);
                v0 = i24 % 128;
                if (i24 % 2 != 0) {
                    return string;
                }
                throw null;
            }
            int i25 = v0;
            int i26 = i25 & 7;
            int i27 = i26 + ((i25 ^ 7) | i26);
            f52537u0 = i27 % 128;
            int i28 = i27 % 2;
            stringBuffer.append(", ");
            if (i28 != 0) {
                throw null;
            }
            int i29 = f52537u0;
            int i30 = (i29 ^ 3) + ((i29 & 3) << 1);
            v0 = i30 % 128;
            int i31 = i30 % 2;
        }
    }

    public aee(boolean z10, add[] addVarArr) {
        this.setOnFocusChangeListener = addVarArr;
        if (!z10 && addVarArr.length >= 2) {
            addVarArr = null;
        }
        this.setCompoundDrawableTintBlendMode = addVarArr;
    }

    public static aee setDividerPadding(aeh aehVar) {
        return (aee) setCompoundDrawableTintBlendMode(new Object[]{aehVar}, -474267233, 474267237, (int) System.currentTimeMillis());
    }

    public aee(adh adhVar, boolean z10) throws IOException, CloneNotSupportedException {
        add[] addVarArr;
        if (adhVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z10 || ((Integer) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar}, -186238093, 186238095, System.identityHashCode(adhVar))).intValue() < 2) {
            addVarArr = (add[]) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar}, -497700352, 497700355, System.identityHashCode(adhVar));
        } else {
            addVarArr = (add[]) adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar}, 40694744, -40694744, System.identityHashCode(adhVar));
            setCompoundDrawableTintBlendMode(new Object[]{addVarArr}, -907479747, 907479755, (int) System.currentTimeMillis());
        }
        this.setOnFocusChangeListener = addVarArr;
        if (!z10 && addVarArr.length >= 2) {
            addVarArr = null;
        }
        this.setCompoundDrawableTintBlendMode = addVarArr;
    }

    public aee() {
        add[] addVarArr = adh.f52466d;
        this.setOnFocusChangeListener = addVarArr;
        this.setCompoundDrawableTintBlendMode = addVarArr;
    }

    public final add setCompoundDrawableTintBlendMode(int i10) {
        return (add) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -1624993461, 1624993461, i10);
    }
}
