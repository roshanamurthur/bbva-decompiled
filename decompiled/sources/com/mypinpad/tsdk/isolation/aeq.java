package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* JADX INFO: loaded from: classes10.dex */
public class aeq extends ady {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52558u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52559t0;

    static {
        Integer num = 23;
        num.intValue();
        int i10 = v0;
        int i11 = ((i10 ^ 37) | (i10 & 37)) << 1;
        int i12 = -(((~i10) & 37) | (i10 & (-38)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52558u0 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0190 A[PHI: r0
      0x0190: PHI (r0v75 java.lang.String) = (r0v74 java.lang.String), (r0v81 java.lang.String) binds: [B:48:0x018e, B:43:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b1 A[PHI: r0
      0x01b1: PHI (r0v77 java.lang.String) = (r0v74 java.lang.String), (r0v81 java.lang.String) binds: [B:48:0x018e, B:43:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x033f A[PHI: r3
      0x033f: PHI (r3v11 java.lang.String) = (r3v10 java.lang.String), (r3v25 java.lang.String) binds: [B:81:0x033d, B:78:0x0325] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0345  */
    /* JADX WARN: Code duplicated, block: B:86:0x0354  */
    /* JADX WARN: Code duplicated, block: B:87:0x0374  */
    /* JADX WARN: Code duplicated, block: B:89:0x039f  */
    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        String strConcat;
        Object string;
        int i13;
        int iIntValue;
        String str;
        int i14;
        byte b10;
        int i15 = ~i11;
        int i16 = ~i10;
        switch (((i16 | i11) * 629) + ((~(i15 | i16)) * (-629)) + (i15 * (-629)) + (i11 * (-628)) + (i10 * 630)) {
            case 1:
                aeq aeqVar = (aeq) objArr[0];
                int i17 = f52558u0;
                int i18 = ((i17 | 5) << 1) - (i17 ^ 5);
                v0 = i18 % 128;
                if (i18 % 2 != 0) {
                    strConcat = (String) bez.setX(new Object[]{aeqVar.f52559t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                    if (strConcat.indexOf(45) < 0) {
                        if (strConcat.indexOf(43) < 0) {
                            int i19 = v0 + 125;
                            f52558u0 = i19 % 128;
                            int i20 = i19 % 2;
                            if (strConcat.length() == 11) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(strConcat.substring(0, 10));
                                sb2.append("00GMT+00:00");
                                String string2 = sb2.toString();
                                System.identityHashCode(aeqVar);
                                System.identityHashCode(aeqVar);
                                return string2;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(strConcat.substring(0, 12));
                            sb3.append("GMT+00:00");
                            string = sb3.toString();
                            int i21 = v0;
                            int i22 = i21 ^ 89;
                            int i23 = ((i21 & 89) | i22) << 1;
                            int i24 = -i22;
                            i13 = (i23 & i24) + (i23 | i24);
                            f52558u0 = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i25 = 3 / 0;
                            }
                        }
                    }
                } else {
                    strConcat = (String) bez.setX(new Object[]{aeqVar.f52559t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                    if (strConcat.indexOf(34) < 0) {
                        if (strConcat.indexOf(43) < 0) {
                            int i110 = v0 + 125;
                            f52558u0 = i110 % 128;
                            int i26 = i110 % 2;
                            if (strConcat.length() == 11) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(strConcat.substring(0, 10));
                                sb4.append("00GMT+00:00");
                                String string3 = sb4.toString();
                                System.identityHashCode(aeqVar);
                                System.identityHashCode(aeqVar);
                                return string3;
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(strConcat.substring(0, 12));
                            sb5.append("GMT+00:00");
                            string = sb5.toString();
                            int i27 = v0;
                            int i28 = i27 ^ 89;
                            int i29 = ((i27 & 89) | i28) << 1;
                            int i210 = -i28;
                            i13 = (i29 & i210) + (i29 | i210);
                            f52558u0 = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i211 = 3 / 0;
                            }
                        }
                    }
                }
                int iIndexOf = strConcat.indexOf(45);
                if (iIndexOf < 0) {
                    int i30 = f52558u0;
                    int i31 = i30 & 11;
                    int i32 = -(-(i30 | 11));
                    int i33 = (i31 & i32) + (i32 | i31);
                    v0 = i33 % 128;
                    int i34 = i33 % 2;
                    iIndexOf = strConcat.indexOf(43);
                    int i35 = v0;
                    int i36 = (i35 ^ 101) + ((i35 & 101) << 1);
                    f52558u0 = i36 % 128;
                    int i37 = i36 % 2;
                }
                int length = strConcat.length();
                int iIdentityHashCode = System.identityHashCode(aeqVar);
                int i38 = -(-(length * (-195)));
                int i39 = 1173 & i38;
                int i40 = (i38 | 1173) & (~i39);
                int i41 = i39 << 1;
                int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                int i43 = ~length;
                int i44 = (i43 | length) & i43;
                int i45 = i44 & (-3);
                int i46 = ~(i45 | ((~i45) & (i44 | (-3))));
                int i47 = ((~iIdentityHashCode) & length) | (iIdentityHashCode & i43);
                int i48 = length & iIdentityHashCode;
                int i49 = ~((i47 & i48) | (i47 ^ i48));
                int i50 = ((~i49) & i46) | ((~i46) & i49);
                int i51 = i46 & i49;
                int i52 = -(-(((i51 & i50) | (i50 ^ i51)) * (-196)));
                int i53 = (i42 & i52) + (i42 | i52);
                int i54 = ((i43 & (-3)) | (length & 2) | ((-3) & length)) * 392;
                int i55 = i53 & i54;
                int i56 = (i54 | i53) & (~i55);
                int i57 = -(-(i55 << 1));
                int i58 = (i56 & i57) + (i56 | i57);
                int i59 = ~((2 ^ i44) | (i44 & 2));
                int i60 = ~((iIdentityHashCode ^ length) | i48);
                int i61 = i59 & i60;
                int i62 = (i60 | i59) & (~i61);
                int i63 = ((i62 & i61) | (i62 ^ i61)) * 196;
                int i64 = i58 ^ i63;
                int i65 = (i63 & i58) << 1;
                if (iIndexOf == (i64 & i65) + (i65 | i64)) {
                    strConcat = strConcat.concat("00");
                    int i66 = f52558u0;
                    int i67 = i66 & 69;
                    int i68 = (i66 | 69) & (~i67);
                    int i69 = -(-(i67 << 1));
                    int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
                    v0 = i70 % 128;
                    int i71 = i70 % 2;
                }
                if (iIndexOf != 10) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(strConcat.substring(0, 12));
                    sb6.append(Time.GMT);
                    sb6.append(strConcat.substring(12, 15));
                    sb6.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    sb6.append(strConcat.substring(15, 17));
                    string = sb6.toString();
                    int i72 = f52558u0;
                    int i73 = i72 & 81;
                    int i74 = (i72 | 81) & (~i73);
                    int i75 = -(-(i73 << 1));
                    int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                    v0 = i76 % 128;
                    if (i76 % 2 == 0) {
                        int i77 = 2 / 0;
                    }
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(strConcat.substring(0, 10));
                    sb7.append("00GMT");
                    sb7.append(strConcat.substring(10, 13));
                    sb7.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                    sb7.append(strConcat.substring(13, 15));
                    string = sb7.toString();
                    int i78 = f52558u0 + 65;
                    v0 = i78 % 128;
                    if (i78 % 2 == 0) {
                        throw null;
                    }
                }
                break;
            case 2:
                aeq aeqVar2 = (aeq) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i79 = f52558u0;
                int i80 = i79 & 83;
                int i81 = ((((i79 ^ 83) | i80) << 1) - (~(-((i79 | 83) & (~i80))))) - 1;
                int i82 = i81 % 128;
                v0 = i82;
                if (i81 % 2 == 0) {
                    boolean z10 = adyVar instanceof aeq;
                    throw null;
                }
                if (!(adyVar instanceof aeq)) {
                    int i83 = i82 + 111;
                    f52558u0 = i83 % 128;
                    int i84 = i83 % 2;
                    string = Boolean.FALSE;
                } else {
                    boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{aeqVar2.f52559t0, ((aeq) adyVar).f52559t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i85 = f52558u0;
                    int i86 = ((i85 & 56) + (i85 | 56)) - 1;
                    v0 = i86 % 128;
                    int i87 = i86 % 2;
                    string = Boolean.valueOf(zBooleanValue);
                }
                break;
                break;
            case 3:
                aeq aeqVar3 = (aeq) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                int i88 = f52558u0;
                int i89 = (((i88 ^ 73) | (i88 & 73)) << 1) - (((~i88) & 73) | (i88 & (-74)));
                v0 = i89 % 128;
                int i90 = i89 % 2;
                aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 23, aeqVar3.f52559t0}, 478760665, -478760661, 23);
                int i91 = f52558u0;
                int i92 = ((i91 ^ 29) | (i91 & 29)) << 1;
                int i93 = -(((~i91) & 29) | (i91 & (-30)));
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                v0 = i94 % 128;
                if (i94 % 2 != 0) {
                    return null;
                }
                throw null;
            case 4:
                aeq aeqVar4 = (aeq) objArr[0];
                boolean zBooleanValue3 = ((Boolean) objArr[1]).booleanValue();
                int i95 = f52558u0;
                int i96 = i95 & 1;
                int i97 = i95 | 1;
                int i98 = (i96 & i97) + (i97 | i96);
                v0 = i98 % 128;
                int i99 = i98 % 2;
                byte[] bArr = aeqVar4.f52559t0;
                if (i99 == 0) {
                    int length2 = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue3), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                    int i100 = 40 / 0;
                } else {
                    int length3 = bArr.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue3), Integer.valueOf(length3)}, 1150803379, -1150803367, length3)).intValue();
                }
                return Integer.valueOf(iIntValue);
            case 5:
                aeq aeqVar5 = (aeq) objArr[0];
                int i101 = f52558u0;
                int i102 = i101 & 111;
                int i103 = -(-(i101 | 111));
                int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                v0 = i104 % 128;
                if (i104 % 2 != 0) {
                    str = (String) setCompoundDrawableTintBlendMode(new Object[]{aeqVar5}, 2109671480, -2109671479, System.identityHashCode(aeqVar5));
                    if (str.charAt(0) >= '5') {
                        string = "19".concat(str);
                        int i105 = f52558u0;
                        int i106 = (i105 & 119) + (i105 | 119);
                        v0 = i106 % 128;
                        int i107 = i106 % 2;
                    } else {
                        int i108 = v0;
                        int i109 = i108 & 75;
                        i14 = (((i108 | 75) & (~i109)) - (~(-(-(i109 << 1))))) - 1;
                        f52558u0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND.concat(str);
                            throw null;
                        }
                        string = PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND.concat(str);
                    }
                } else {
                    str = (String) setCompoundDrawableTintBlendMode(new Object[]{aeqVar5}, 2109671480, -2109671479, System.identityHashCode(aeqVar5));
                    if (str.charAt(0) >= 'k') {
                        string = "19".concat(str);
                        int i1010 = f52558u0;
                        int i1011 = (i1010 & 119) + (i1010 | 119);
                        v0 = i1011 % 128;
                        int i1012 = i1011 % 2;
                    } else {
                        int i1013 = v0;
                        int i1014 = i1013 & 75;
                        i14 = (((i1013 | 75) & (~i1014)) - (~(-(-(i1014 << 1))))) - 1;
                        f52558u0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND.concat(str);
                            throw null;
                        }
                        string = PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND.concat(str);
                    }
                }
                break;
            case 6:
                int i111 = f52558u0;
                int i112 = i111 + 3;
                v0 = i112 % 128;
                int i113 = i112 % 2;
                int i114 = i111 & 87;
                int i115 = (i111 | 87) & (~i114);
                int i116 = -(-(i114 << 1));
                int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
                v0 = i117 % 128;
                if (i117 % 2 == 0) {
                    int i118 = 29 / 0;
                }
                string = Boolean.FALSE;
                break;
            case 7:
                byte[] bArr2 = (byte[]) objArr[0];
                aeq aeqVar6 = new aeq();
                if (bArr2.length < 2) {
                    throw new IllegalArgumentException("UTCTime string too short");
                }
                aeqVar6.f52559t0 = bArr2;
                if (!((Boolean) setCompoundDrawableTintBlendMode(new Object[]{aeqVar6, 0}, -1617465830, 1617465830, 0)).booleanValue() || !((Boolean) setCompoundDrawableTintBlendMode(new Object[]{aeqVar6, 1}, -1617465830, 1617465830, 1)).booleanValue()) {
                    throw new IllegalArgumentException("illegal characters in UTCTime string");
                }
                int i119 = v0;
                int i120 = i119 ^ 19;
                int i121 = -(-((i119 & 19) << 1));
                int i122 = (i120 & i121) + (i121 | i120);
                f52558u0 = i122 % 128;
                int i123 = i122 % 2;
                return aeqVar6;
            case 8:
                aeq aeqVar7 = (aeq) objArr[0];
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", agv.setDividerPadding);
                simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
                Date date = simpleDateFormat.parse((String) setCompoundDrawableTintBlendMode(new Object[]{aeqVar7}, -1116567257, 1116567262, System.identityHashCode(aeqVar7)));
                int i124 = f52558u0 + 59;
                v0 = i124 % 128;
                if (i124 % 2 != 0) {
                    return date;
                }
                int i125 = 65 / 0;
                return date;
            default:
                aeq aeqVar8 = (aeq) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i126 = v0;
                int i127 = (i126 & 67) + (i126 | 67);
                int i128 = i127 % 128;
                f52558u0 = i128;
                if (i127 % 2 != 0) {
                    int i129 = 40 / 0;
                    if (aeqVar8.f52559t0.length > iIntValue2) {
                        b10 = aeqVar8.f52559t0[iIntValue2];
                        if (b10 < 48 && b10 <= 57) {
                            int i130 = (i126 & 53) + (i126 | 53);
                            f52558u0 = i130 % 128;
                            string = Boolean.valueOf(i130 % 2 == 0);
                            break;
                        }
                    }
                } else if (aeqVar8.f52559t0.length > iIntValue2) {
                    b10 = aeqVar8.f52559t0[iIntValue2];
                    if (b10 < 48) {
                    }
                }
                int i131 = ((i128 & 49) - (~(-(-(i128 | 49))))) - 1;
                v0 = i131 % 128;
                int i132 = i131 % 2;
                string = Boolean.FALSE;
                break;
        }
        return string;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 1989022329, -1989022325, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 905814948, -905814945, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, adyVar}, 431966792, -431966790, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = v0;
        int i11 = (((i10 ^ 89) | (i10 & 89)) << 1) - (((~i10) & 89) | (i10 & (-90)));
        f52558u0 = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = this.f52559t0;
        if (i12 == 0) {
            return ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        }
        ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
        throw null;
    }

    public final Date setDividerPadding() throws ParseException {
        return (Date) setCompoundDrawableTintBlendMode(new Object[]{this}, 1578669810, -1578669802, System.identityHashCode(this));
    }

    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 2109671480, -2109671479, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -517319536, 517319542, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = v0;
        int i11 = i10 & 39;
        int i12 = ((i10 | 39) & (~i11)) + (i11 << 1);
        f52558u0 = i12 % 128;
        int i13 = i12 % 2;
        String str = (String) bez.setX(new Object[]{this.f52559t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
        int i14 = v0 + 114;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f52558u0 = i15 % 128;
        if (i15 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -1116567257, 1116567262, System.identityHashCode(this));
    }
}
