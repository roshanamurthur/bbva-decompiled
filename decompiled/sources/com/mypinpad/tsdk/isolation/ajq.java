package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public class ajq extends adw {
    public static final Boolean E0;
    public static int F0 = 0;
    public static int G0 = 1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Hashtable f52920x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final Boolean f52921y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Vector f52922r0 = new Vector();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Vector f52923s0 = new Vector();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Vector f52924t0 = new Vector();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public aed f52925u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f52926w0;

    static {
        adu aduVar = new adu("2.5.4.6");
        adu aduVar2 = new adu("2.5.4.10");
        adu aduVar3 = new adu(ObjectIdentifiers.organizationalUnitName);
        adu aduVar4 = new adu("2.5.4.12");
        adu aduVar5 = new adu(ObjectIdentifiers.commonName);
        adu aduVar6 = new adu("2.5.4.5");
        adu aduVar7 = new adu("2.5.4.9");
        adu aduVar8 = new adu("2.5.4.7");
        adu aduVar9 = new adu("2.5.4.8");
        adu aduVar10 = new adu("2.5.4.4");
        adu aduVar11 = new adu("2.5.4.42");
        adu aduVar12 = new adu("2.5.4.43");
        adu aduVar13 = new adu("2.5.4.44");
        adu aduVar14 = new adu("2.5.4.45");
        adu aduVar15 = new adu("2.5.4.15");
        adu aduVar16 = new adu("2.5.4.17");
        adu aduVar17 = new adu("2.5.4.46");
        adu aduVar18 = new adu("2.5.4.65");
        adu aduVar19 = new adu("1.3.6.1.5.5.7.9.1");
        adu aduVar20 = new adu("1.3.6.1.5.5.7.9.2");
        adu aduVar21 = new adu("1.3.6.1.5.5.7.9.3");
        adu aduVar22 = new adu("1.3.6.1.5.5.7.9.4");
        adu aduVar23 = new adu("1.3.6.1.5.5.7.9.5");
        adu aduVar24 = new adu("1.3.36.8.3.14");
        adu aduVar25 = new adu("2.5.4.16");
        new adu("2.5.4.54");
        adu aduVar26 = ajr.setDividerPadding;
        adu aduVar27 = ajr.setX;
        adu aduVar28 = ahv.UiMessageCallbackKtWhenMappings;
        adu aduVar29 = ahv.getAmountFieldTextColor;
        adu aduVar30 = ahv.setChildDivider;
        adu aduVar31 = new adu("0.9.2342.19200300.100.1.25");
        adu aduVar32 = new adu("0.9.2342.19200300.100.1.1");
        Hashtable hashtable = new Hashtable();
        f52920x0 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        Hashtable hashtable3 = new Hashtable();
        Hashtable hashtable4 = new Hashtable();
        f52921y0 = Boolean.TRUE;
        E0 = Boolean.FALSE;
        hashtable.put(aduVar, "C");
        hashtable.put(aduVar2, "O");
        hashtable.put(aduVar4, ExifInterface.GPS_DIRECTION_TRUE);
        hashtable.put(aduVar3, "OU");
        hashtable.put(aduVar5, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS);
        hashtable.put(aduVar8, "L");
        hashtable.put(aduVar9, "ST");
        hashtable.put(aduVar6, "SERIALNUMBER");
        hashtable.put(aduVar28, ExifInterface.LONGITUDE_EAST);
        hashtable.put(aduVar31, "DC");
        hashtable.put(aduVar32, "UID");
        hashtable.put(aduVar7, "STREET");
        hashtable.put(aduVar10, "SURNAME");
        hashtable.put(aduVar11, "GIVENNAME");
        hashtable.put(aduVar12, "INITIALS");
        hashtable.put(aduVar13, "GENERATION");
        hashtable.put(aduVar30, "unstructuredAddress");
        hashtable.put(aduVar29, "unstructuredName");
        hashtable.put(aduVar14, "UniqueIdentifier");
        hashtable.put(aduVar17, "DN");
        hashtable.put(aduVar18, "Pseudonym");
        hashtable.put(aduVar25, "PostalAddress");
        hashtable.put(aduVar24, "NameAtBirth");
        hashtable.put(aduVar22, "CountryOfCitizenship");
        hashtable.put(aduVar23, "CountryOfResidence");
        hashtable.put(aduVar21, "Gender");
        hashtable.put(aduVar20, "PlaceOfBirth");
        hashtable.put(aduVar19, "DateOfBirth");
        hashtable.put(aduVar16, "PostalCode");
        hashtable.put(aduVar15, "BusinessCategory");
        hashtable.put(aduVar26, "TelephoneNumber");
        hashtable.put(aduVar27, "Name");
        hashtable2.put(aduVar, "C");
        hashtable2.put(aduVar2, "O");
        hashtable2.put(aduVar3, "OU");
        hashtable2.put(aduVar5, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS);
        hashtable2.put(aduVar8, "L");
        hashtable2.put(aduVar9, "ST");
        hashtable2.put(aduVar7, "STREET");
        hashtable2.put(aduVar31, "DC");
        hashtable2.put(aduVar32, "UID");
        hashtable3.put(aduVar, "C");
        hashtable3.put(aduVar2, "O");
        hashtable3.put(aduVar3, "OU");
        hashtable3.put(aduVar5, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS);
        hashtable3.put(aduVar8, "L");
        hashtable3.put(aduVar9, "ST");
        hashtable3.put(aduVar7, "STREET");
        hashtable4.put("c", aduVar);
        hashtable4.put("o", aduVar2);
        hashtable4.put("t", aduVar4);
        hashtable4.put("ou", aduVar3);
        hashtable4.put("cn", aduVar5);
        hashtable4.put("l", aduVar8);
        hashtable4.put(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, aduVar9);
        hashtable4.put("sn", aduVar6);
        hashtable4.put("serialnumber", aduVar6);
        hashtable4.put("street", aduVar7);
        hashtable4.put("emailaddress", aduVar28);
        hashtable4.put("dc", aduVar31);
        hashtable4.put("e", aduVar28);
        hashtable4.put("uid", aduVar32);
        hashtable4.put("surname", aduVar10);
        hashtable4.put("givenname", aduVar11);
        hashtable4.put("initials", aduVar12);
        hashtable4.put("generation", aduVar13);
        hashtable4.put("unstructuredaddress", aduVar30);
        hashtable4.put("unstructuredname", aduVar29);
        hashtable4.put("uniqueidentifier", aduVar14);
        hashtable4.put("dn", aduVar17);
        hashtable4.put("pseudonym", aduVar18);
        hashtable4.put("postaladdress", aduVar25);
        hashtable4.put("nameofbirth", aduVar24);
        hashtable4.put("countryofcitizenship", aduVar22);
        hashtable4.put("countryofresidence", aduVar23);
        hashtable4.put("gender", aduVar21);
        hashtable4.put("placeofbirth", aduVar20);
        hashtable4.put("dateofbirth", aduVar19);
        hashtable4.put("postalcode", aduVar16);
        hashtable4.put("businesscategory", aduVar15);
        hashtable4.put("telephonenumber", aduVar26);
        hashtable4.put("name", aduVar27);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = ~iCurrentTimeMillis;
        int i11 = ~((2142240205 ^ iCurrentTimeMillis) | (2142240205 & iCurrentTimeMillis));
        int i12 = 1124188229 & i11;
        int i13 = -(~(-(-((((i11 | 1124188229) & (~i12)) | i12) * (-756)))));
        int i14 = (-2) - ((((-1876686734) & i13) + (i13 | (-1876686734))) ^ (-1));
        int i15 = (iCurrentTimeMillis | i10) & i10;
        int i16 = ((~i15) & 2142240205) | ((-2142240206) & i15);
        int i17 = i15 & 2142240205;
        int i18 = ((i17 & i16) | (i16 ^ i17)) * 756;
        int i19 = i14 & i18;
        int i20 = i19 + ((i18 ^ i14) | i19);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i21 = ~iCurrentTimeMillis2;
        int i22 = (i21 | iCurrentTimeMillis2) & i21;
        int i23 = (-725256117) ^ i22;
        int i24 = (-725256117) & i22;
        int i25 = ~((i23 & i24) | (i23 ^ i24));
        int i26 = (i25 & 540018448) | ((~i25) & 540018448) | (i25 & (-540018449));
        int i27 = (-821309201) ^ i21;
        int i28 = i21 & (-821309201);
        int i29 = (i28 & i27) | (i27 ^ i28);
        int i30 = ~i29;
        int i31 = (i29 | i30) & i30;
        int i32 = i26 & i31;
        int i33 = (i31 | i26) & (~i32);
        int i34 = -(~(((i33 & i32) | (i33 ^ i32)) * (-1136)));
        int i35 = ((((-472630876) | i34) << 1) - (i34 ^ (-472630876))) - 1;
        int i36 = (-725256117) & iCurrentTimeMillis2;
        int i37 = ((-725256117) | iCurrentTimeMillis2) & (~i36);
        int i38 = ~((i36 & i37) | (i37 ^ i36));
        int i39 = ~(((-821309201) ^ iCurrentTimeMillis2) | ((-821309201) & iCurrentTimeMillis2));
        int i40 = i38 & i39;
        int i41 = (i38 | i39) & (~i40);
        int i42 = ((~i22) & 725256116) | i24;
        int i43 = i22 & 725256116;
        int i44 = (i42 & i43) | (i42 ^ i43);
        int i45 = -(~(-(-(((i41 & i40) | (i41 ^ i40) | (~((i44 & 821309200) | (i44 ^ 821309200)))) * (-568)))));
        int i46 = (-2) - (((i35 & i45) + (i45 | i35)) ^ (-1));
        int i47 = ((~i43) & (725256116 | i22)) | i43;
        int i48 = ~i47;
        int i49 = (i47 | i48) & i48;
        int i50 = ~(i22 | 821309200);
        int i51 = (i50 & i49) | (i49 ^ i50);
        int i52 = (-540018449) & iCurrentTimeMillis2;
        int i53 = ((iCurrentTimeMillis2 | (-540018449)) & (~i52)) | i52;
        int i54 = ~i53;
        int i55 = (i53 | i54) & i54;
        int i56 = ((~i55) & i51) | ((~i51) & i55);
        int i57 = i55 & i51;
        int i58 = -(~(((i57 & i56) | (i56 ^ i57)) * 568));
        if (i20 > (-2) - ((((i46 | i58) << 1) - (i58 ^ i46)) ^ (-1))) {
            throw null;
        }
    }

    public ajq(aed aedVar) {
        Vector vector;
        this.f52925u0 = aedVar;
        Enumeration dividerPadding = aedVar.setDividerPadding();
        while (dividerPadding.hasMoreElements()) {
            aee aeeVar = (aee) aee.setCompoundDrawableTintBlendMode(new Object[]{((add) dividerPadding.nextElement()).UiMessageCallbackKtWhenMappings()}, -156503718, 156503719, (int) System.currentTimeMillis());
            int i10 = 0;
            while (i10 < ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue()) {
                aed aedVar2 = (aed) aed.setY(new Object[]{((add) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar, Integer.valueOf(i10)}, -1624993461, 1624993461, i10)).UiMessageCallbackKtWhenMappings()}, 691787085, -691787084, (int) System.currentTimeMillis());
                if (aedVar2.setCompoundDrawableTintBlendMode() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.f52922r0.addElement((adu) adu.setCompoundDrawableTintBlendMode(new Object[]{aedVar2.setX(0)}, -892573455, 892573460, (int) System.currentTimeMillis()));
                add x4 = aedVar2.setX(1);
                if (!(x4 instanceof aei) || (x4 instanceof aep)) {
                    try {
                        Vector vector2 = this.f52923s0;
                        StringBuilder sb2 = new StringBuilder("#");
                        sb2.append((String) setX(new Object[]{(byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{x4.UiMessageCallbackKtWhenMappings().setX(ASN1Encoding.DER)}, 1477946699, -1477946695, (int) System.currentTimeMillis())}, -23257271, 23257277, (int) System.currentTimeMillis()));
                        vector2.addElement(sb2.toString());
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String onFocusChangeListener = ((aei) x4).setOnFocusChangeListener();
                    if (onFocusChangeListener.length() <= 0 || onFocusChangeListener.charAt(0) != '#') {
                        vector = this.f52923s0;
                    } else {
                        vector = this.f52923s0;
                        onFocusChangeListener = "\\".concat(onFocusChangeListener);
                    }
                    vector.addElement(onFocusChangeListener);
                }
                this.f52924t0.addElement(i10 != 0 ? f52921y0 : E0);
                i10 = ((((i10 ^ 1) | (i10 & 1)) << 1) - (~(-(((~i10) & 1) | (i10 & (-2)))))) - 1;
            }
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        StringBuffer stringBuffer = (StringBuffer) objArr[0];
        Hashtable hashtable = (Hashtable) objArr[1];
        adu aduVar = (adu) objArr[2];
        String str = (String) objArr[3];
        int i10 = G0;
        int i11 = i10 & 93;
        int i12 = -(-((i10 ^ 93) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        F0 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        String str2 = (String) hashtable.get(aduVar);
        if (str2 != null) {
            stringBuffer.append(str2);
            int i14 = G0;
            int i15 = i14 & 13;
            int i16 = i14 | 13;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            F0 = i17 % 128;
            int i18 = i17 % 2;
        } else {
            stringBuffer.append((String) adu.setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
            int i19 = G0 + 1;
            F0 = i19 % 128;
            int i20 = i19 % 2;
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2) {
            int i21 = F0;
            int i22 = (i21 & 49) + (i21 | 49);
            G0 = i22 % 128;
            int i23 = i22 % 2;
            char cCharAt = str.charAt(0);
            if (i23 != 0 ? cCharAt == '\\' : cCharAt == 'q') {
                int i24 = F0 + 1;
                G0 = i24 % 128;
                if (i24 % 2 != 0 ? str.charAt(1) == '#' : str.charAt(0) == 23) {
                    length += 2;
                    int i25 = F0;
                    int i26 = i25 & 21;
                    int i27 = i25 | 21;
                    int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                    G0 = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
        }
        while (length < length2) {
            int i30 = F0;
            int i31 = (i30 ^ 41) + ((i30 & 41) << 1);
            G0 = i31 % 128;
            int i32 = i31 % 2;
            char cCharAt2 = stringBuffer.charAt(length);
            if (i32 != 0) {
                if (cCharAt2 != ' ') {
                    break;
                }
                stringBuffer.insert(length, "\\");
                length += 2;
                int i33 = length2 & 1;
                length2 = (i33 - (~(-(-((length2 ^ 1) | i33))))) - 1;
                int i34 = G0 + 121;
                F0 = i34 % 128;
                int i35 = i34 % 2;
            } else {
                if (cCharAt2 != 't') {
                    break;
                }
                stringBuffer.insert(length, "\\");
                length += 2;
                int i36 = length2 & 1;
                length2 = (i36 - (~(-(-((length2 ^ 1) | i36))))) - 1;
                int i37 = G0 + 121;
                F0 = i37 % 128;
                int i38 = i37 % 2;
            }
        }
        while (true) {
            length2 = (length2 - (~(-(-((~length2) | length2))))) - 1;
            if (length2 <= length) {
                break;
            }
            int i39 = F0;
            int i40 = i39 & 3;
            int i41 = i40 + ((i39 ^ 3) | i40);
            G0 = i41 % 128;
            int i42 = i41 % 2;
            if (stringBuffer.charAt(length2) != ' ') {
                break;
            }
            int i43 = F0;
            int i44 = ((i43 ^ 82) + ((i43 & 82) << 1)) - 1;
            G0 = i44 % 128;
            if (i44 % 2 == 0) {
                stringBuffer.insert(length2, '4');
            } else {
                stringBuffer.insert(length2, AbstractJsonLexerKt.STRING_ESC);
            }
            int i45 = F0 + 117;
            G0 = i45 % 128;
            int i46 = i45 % 2;
        }
        while (length <= length2) {
            int i47 = F0 + 53;
            G0 = i47 % 128;
            int i48 = i47 % 2;
            char cCharAt3 = stringBuffer.charAt(length);
            if (cCharAt3 != '\"' && cCharAt3 != '\\' && cCharAt3 != '+' && cCharAt3 != ',') {
                switch (cCharAt3) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length = ((length & 1) << 1) + (length ^ 1);
                        int i49 = F0;
                        int i50 = i49 ^ 83;
                        int i51 = (((i49 & 83) | i50) << 1) - i50;
                        G0 = i51 % 128;
                        int i52 = i51 % 2;
                        break;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            int i53 = (length2 & (-126)) | ((~length2) & 125);
            int i54 = -(-((length2 & 125) << 1));
            length2 = ((i53 ^ i54) + ((i53 & i54) << 1)) - 124;
            int i55 = G0;
            int i56 = i55 & 107;
            int i57 = (((i55 ^ 107) | i56) << 1) - ((i55 | 107) & (~i56));
            F0 = i57 % 128;
            int i58 = i57 % 2;
        }
        int i59 = G0;
        int i60 = (i59 & 21) + (i59 | 21);
        F0 = i60 % 128;
        if (i60 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ String b(Object[] objArr) {
        String str = (String) objArr[0];
        int i10 = F0;
        int i11 = ((i10 | 59) << 1) - (i10 ^ 59);
        G0 = i11 % 128;
        int i12 = i11 % 2;
        String str2 = (String) bez.setX(new Object[]{str.trim()}, 2131988623, -2131988618, (int) System.currentTimeMillis());
        if (str2.length() > 0) {
            int i13 = G0;
            int i14 = (i13 & 13) + (i13 | 13);
            F0 = i14 % 128;
            int i15 = i14 % 2;
            char cCharAt = str2.charAt(0);
            if (i15 == 0 ? cCharAt == '#' : cCharAt == 'C') {
                add addVar = (ady) setX(new Object[]{str2}, -151066935, 151066935, (int) System.currentTimeMillis());
                if (addVar instanceof aei) {
                    int i16 = F0;
                    int i17 = ((i16 ^ 101) | (i16 & 101)) << 1;
                    int i18 = -(((~i16) & 101) | (i16 & (-102)));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    G0 = i19 % 128;
                    int i20 = i19 % 2;
                    String strTrim = ((aei) addVar).setOnFocusChangeListener().trim();
                    Object[] objArr2 = new Object[1];
                    if (i20 == 0) {
                        objArr2[0] = strTrim;
                        throw null;
                    }
                    objArr2[0] = strTrim;
                    str2 = (String) bez.setX(objArr2, 2131988623, -2131988618, (int) System.currentTimeMillis());
                }
            }
        }
        int i21 = F0;
        int i22 = i21 & 61;
        int i23 = -(-((i21 ^ 61) | i22));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        G0 = i24 % 128;
        int i25 = i24 % 2;
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0078 A[PHI: r2 r9
      0x0078: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0076, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r9v6 java.lang.String) = (r9v5 java.lang.String), (r9v29 java.lang.String) binds: [B:8:0x0076, B:5:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Boolean c(Object[] objArr) {
        String str;
        String str2;
        String str3 = (String) objArr[1];
        String str4 = (String) objArr[2];
        int i10 = G0;
        int i11 = i10 & 71;
        int i12 = (i10 | 71) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        F0 = i14 % 128;
        if (i14 % 2 != 0) {
            str = (String) setX(new Object[]{str3}, -23488285, 23488290, (int) System.currentTimeMillis());
            str2 = (String) setX(new Object[]{str4}, -23488285, 23488290, (int) System.currentTimeMillis());
            int i15 = 88 / 0;
            if (!str.equals(str2)) {
                if (!((String) setX(new Object[]{str}, 123071441, -123071438, (int) System.currentTimeMillis())).equals((String) setX(new Object[]{str2}, 123071441, -123071438, (int) System.currentTimeMillis()))) {
                    int i16 = G0;
                    int i17 = i16 ^ 49;
                    int i18 = (((i16 & 49) | i17) << 1) - i17;
                    int i19 = i18 % 128;
                    F0 = i19;
                    int i20 = i18 % 2;
                    int i21 = i19 & 61;
                    int i22 = i21 + ((i19 ^ 61) | i21);
                    G0 = i22 % 128;
                    int i23 = i22 % 2;
                    return Boolean.FALSE;
                }
            }
        } else {
            str = (String) setX(new Object[]{str3}, -23488285, 23488290, (int) System.currentTimeMillis());
            str2 = (String) setX(new Object[]{str4}, -23488285, 23488290, (int) System.currentTimeMillis());
            if (!str.equals(str2)) {
                if (!((String) setX(new Object[]{str}, 123071441, -123071438, (int) System.currentTimeMillis())).equals((String) setX(new Object[]{str2}, 123071441, -123071438, (int) System.currentTimeMillis()))) {
                    int i110 = G0;
                    int i111 = i110 ^ 49;
                    int i112 = (((i110 & 49) | i111) << 1) - i111;
                    int i113 = i112 % 128;
                    F0 = i113;
                    int i24 = i112 % 2;
                    int i25 = i113 & 61;
                    int i26 = i25 + ((i113 ^ 61) | i25);
                    G0 = i26 % 128;
                    int i27 = i26 % 2;
                    return Boolean.FALSE;
                }
            }
        }
        int i28 = G0 + 77;
        F0 = i28 % 128;
        if (i28 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x04e4  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        ajq ajqVar;
        int i13;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~i10;
        int i18 = ((i16 | (~(i17 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
        int i19 = (~(i12 | i14)) | (~(i17 | i15));
        int i20 = ~(i10 | i11);
        StringBuffer stringBuffer = null;
        int i21 = 0;
        switch ((i20 * 370) + ((i19 | i20) * (-370)) + i18) {
            case 1:
                return c(objArr);
            case 2:
                a(objArr);
                return null;
            case 3:
                String str = (String) objArr[0];
                StringBuffer stringBuffer2 = new StringBuffer();
                if (str.length() != 0) {
                    int i22 = G0;
                    int i23 = (((i22 & (-54)) | ((~i22) & 53)) - (~((i22 & 53) << 1))) - 1;
                    F0 = i23 % 128;
                    int i24 = i23 % 2;
                    char cCharAt = str.charAt(0);
                    stringBuffer2.append(cCharAt);
                    int i25 = F0 + 51;
                    G0 = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = 1;
                    while (i27 < str.length()) {
                        int i28 = F0 + 3;
                        G0 = i28 % 128;
                        int i29 = i28 % 2;
                        char cCharAt2 = str.charAt(i27);
                        if (cCharAt == ' ') {
                            int i30 = G0;
                            int i31 = (((i30 | 56) << 1) - (i30 ^ 56)) - 1;
                            F0 = i31 % 128;
                            int i32 = i31 % 2;
                            if (cCharAt2 != ' ') {
                                stringBuffer2.append(cCharAt2);
                                int i33 = G0;
                                int i34 = i33 & 33;
                                int i35 = (i34 - (~(-(-((i33 ^ 33) | i34))))) - 1;
                                F0 = i35 % 128;
                                int i36 = i35 % 2;
                            }
                        } else {
                            stringBuffer2.append(cCharAt2);
                            int i37 = G0;
                            int i38 = i37 & 33;
                            int i39 = (i38 - (~(-(-((i37 ^ 33) | i38))))) - 1;
                            F0 = i39 % 128;
                            int i310 = i39 % 2;
                        }
                        int i40 = (i27 | 1) << 1;
                        int i41 = -(((~i27) & 1) | (i27 & (-2)));
                        i27 = ((i40 | i41) << 1) - (i40 ^ i41);
                        int i42 = F0;
                        int i43 = (i42 & (-18)) | ((~i42) & 17);
                        int i44 = (i42 & 17) << 1;
                        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                        G0 = i45 % 128;
                        int i46 = i45 % 2;
                        cCharAt = cCharAt2;
                    }
                }
                String string = stringBuffer2.toString();
                int i47 = F0;
                int i48 = i47 & 91;
                int i49 = ((i47 ^ 91) | i48) << 1;
                int i50 = -((i47 | 91) & (~i48));
                int i51 = ((i49 | i50) << 1) - (i50 ^ i49);
                G0 = i51 % 128;
                int i52 = i51 % 2;
                return string;
            case 4:
                Object obj = objArr[0];
                int i53 = F0;
                int i54 = i53 & 45;
                int i55 = -(-((i53 ^ 45) | i54));
                int i56 = (i54 ^ i55) + ((i54 & i55) << 1);
                G0 = i56 % 128;
                int i57 = i56 % 2;
                if (obj instanceof ajq) {
                    int i58 = i53 + 25;
                    int i59 = i58 % 128;
                    G0 = i59;
                    int i60 = i58 % 2;
                    ajqVar = (ajq) obj;
                    i13 = ((i59 & 72) + (i59 | 72)) - 1;
                    F0 = i13 % 128;
                } else {
                    if (obj instanceof ain) {
                        ajq ajqVar2 = new ajq(aed.setCompoundDrawableTintBlendMode((Object) ((ain) obj).UiMessageCallbackKtWhenMappings()));
                        int i61 = F0;
                        int i62 = ((i61 & 103) - (~(i61 | 103))) - 1;
                        G0 = i62 % 128;
                        int i63 = i62 % 2;
                        return ajqVar2;
                    }
                    if (obj == null) {
                        int i64 = (i53 ^ 117) + ((i53 & 117) << 1);
                        G0 = i64 % 128;
                        if (i64 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                    ajqVar = new ajq(aed.setCompoundDrawableTintBlendMode(obj));
                    i13 = F0 + 25;
                    G0 = i13 % 128;
                }
                int i65 = i13 % 2;
                return ajqVar;
            case 5:
                return b(objArr);
            case 6:
                byte[] bArr = (byte[]) objArr[0];
                int i66 = G0;
                int i67 = ((i66 & (-50)) | ((~i66) & 49)) + ((i66 & 49) << 1);
                int i68 = i67 % 128;
                F0 = i68;
                int i69 = i67 % 2;
                int length = bArr.length;
                char[] cArr = new char[length];
                int i70 = i68 & 29;
                int i71 = (i70 - (~(-(-((i68 ^ 29) | i70))))) - 1;
                G0 = i71 % 128;
                int i72 = i71 % 2;
                while (i21 != length) {
                    int i73 = G0;
                    int i74 = ((((i73 ^ 113) | (i73 & 113)) << 1) - (~(-(((~i73) & 113) | (i73 & (-114)))))) - 1;
                    int i75 = i74 % 128;
                    F0 = i75;
                    int i76 = i74 % 2;
                    cArr[i21] = (char) (bArr[i21] & 255);
                    i21++;
                    int i77 = i75 & 61;
                    int i78 = ((i75 ^ 61) | i77) << 1;
                    int i79 = -((i75 | 61) & (~i77));
                    int i80 = (i78 & i79) + (i79 | i78);
                    G0 = i80 % 128;
                    int i81 = i80 % 2;
                }
                String str2 = new String(cArr);
                int i82 = G0;
                int i83 = i82 & 119;
                int i84 = i83 + ((i82 ^ 119) | i83);
                F0 = i84 % 128;
                int i85 = i84 % 2;
                return str2;
            case 7:
                ajq ajqVar3 = (ajq) objArr[0];
                int i86 = G0;
                int i87 = i86 & 45;
                int i88 = -(-((i86 ^ 45) | i87));
                int i89 = (i87 & i88) + (i88 | i87);
                F0 = i89 % 128;
                if (i89 % 2 != 0) {
                    aed aedVar = ajqVar3.f52925u0;
                    throw null;
                }
                if (ajqVar3.f52925u0 == null) {
                    adh adhVar = new adh();
                    adh adhVar2 = new adh();
                    Vector vector = ajqVar3.f52922r0;
                    if (vector.size() != 0) {
                        adh adhVar3 = new adh(2);
                        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar3, (adu) vector.elementAt(0)}, 240298319, -240298315, System.identityHashCode(adhVar3));
                        throw null;
                    }
                    ajqVar3.f52925u0 = c.a(adhVar, new Object[]{adhVar, new afz(adhVar2)}, 240298319, -240298315, adhVar);
                    int i90 = F0;
                    int i91 = i90 & 9;
                    int i92 = (i90 | 9) & (~i91);
                    int i93 = i91 << 1;
                    int i94 = (i92 & i93) + (i92 | i93);
                    G0 = i94 % 128;
                    int i95 = i94 % 2;
                }
                aed aedVar2 = ajqVar3.f52925u0;
                int i96 = G0 + 6;
                int i97 = (i96 ^ (-1)) + (i96 << 1);
                F0 = i97 % 128;
                int i98 = i97 % 2;
                return aedVar2;
            case 8:
                ajq ajqVar4 = (ajq) objArr[0];
                ((Boolean) objArr[1]).booleanValue();
                Hashtable hashtable = (Hashtable) objArr[2];
                StringBuffer stringBuffer3 = new StringBuffer();
                Vector vector2 = new Vector();
                int i99 = F0;
                int i100 = (i99 & 73) + (i99 | 73);
                G0 = i100 % 128;
                int i101 = i100 % 2;
                int i102 = 0;
                while (i102 < ajqVar4.f52922r0.size()) {
                    int i103 = F0;
                    int i104 = i103 ^ 101;
                    int i105 = (i103 & 101) << 1;
                    int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                    G0 = i106 % 128;
                    int i107 = i106 % 2;
                    boolean zBooleanValue = ((Boolean) ajqVar4.f52924t0.elementAt(i102)).booleanValue();
                    Vector vector3 = ajqVar4.f52923s0;
                    Vector vector4 = ajqVar4.f52922r0;
                    if (zBooleanValue) {
                        int i108 = G0;
                        int i109 = (((i108 | 101) << 1) - (~(-((i108 & (-102)) | ((~i108) & 101))))) - 1;
                        F0 = i109 % 128;
                        if (i109 % 2 != 0) {
                            stringBuffer.append((char) 17);
                            setX(new Object[]{stringBuffer, hashtable, (adu) vector4.elementAt(i102), (String) vector3.elementAt(i102)}, 1968169280, -1968169278, (int) System.currentTimeMillis());
                        } else {
                            stringBuffer.append('+');
                            setX(new Object[]{stringBuffer, hashtable, (adu) vector4.elementAt(i102), (String) vector3.elementAt(i102)}, 1968169280, -1968169278, (int) System.currentTimeMillis());
                        }
                        int i110 = G0;
                        int i111 = i110 ^ 11;
                        int i112 = (((i110 & 11) | i111) << 1) - i111;
                        F0 = i112 % 128;
                        int i113 = i112 % 2;
                    } else {
                        stringBuffer = new StringBuffer();
                        setX(new Object[]{stringBuffer, hashtable, (adu) vector4.elementAt(i102), (String) vector3.elementAt(i102)}, 1968169280, -1968169278, (int) System.currentTimeMillis());
                        vector2.addElement(stringBuffer);
                        int i114 = G0;
                        int i115 = ((i114 ^ 24) + ((i114 & 24) << 1)) - 1;
                        F0 = i115 % 128;
                        int i116 = i115 % 2;
                    }
                    int i117 = i102 | 66;
                    int i118 = i117 << 1;
                    int i119 = -(i117 & (~(i102 & 66)));
                    int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
                    int i121 = ((i120 ^ (-65)) | (i120 & (-65))) << 1;
                    int i122 = -(((~i120) & (-65)) | (i120 & 64));
                    i102 = (i121 & i122) + (i121 | i122);
                    int i123 = F0;
                    int i124 = (((i123 & (-40)) | ((~i123) & 39)) - (~(-(-((i123 & 39) << 1))))) - 1;
                    G0 = i124 % 128;
                    int i125 = i124 % 2;
                }
                int i126 = F0;
                int i127 = ((i126 & 110) + (i126 | 110)) - 1;
                G0 = i127 % 128;
                int i128 = i127 % 2;
                int i129 = 0;
                boolean z10 = true;
                while (i129 < vector2.size()) {
                    int i130 = F0;
                    int i131 = ((i130 | 81) << 1) - (i130 ^ 81);
                    G0 = i131 % 128;
                    int i132 = i131 % 2;
                    if (z10) {
                        int i133 = (-2) - (((i130 ^ 40) + ((i130 & 40) << 1)) ^ (-1));
                        G0 = i133 % 128;
                        int i134 = i133 % 2;
                        int i135 = (i130 & 103) + (i130 | 103);
                        G0 = i135 % 128;
                        int i136 = i135 % 2;
                        z10 = false;
                    } else {
                        stringBuffer3.append(AbstractJsonLexerKt.COMMA);
                        int i137 = F0;
                        int i138 = (((i137 & (-76)) | ((~i137) & 75)) - (~((i137 & 75) << 1))) - 1;
                        G0 = i138 % 128;
                        int i139 = i138 % 2;
                    }
                    stringBuffer3.append(vector2.elementAt(i129).toString());
                    int i140 = i129 & 1;
                    int i141 = ((i129 ^ 1) | i140) << 1;
                    int i142 = -((i129 | 1) & (~i140));
                    i129 = ((i142 & i141) << 1) + (i141 ^ i142);
                    int i143 = G0;
                    int i144 = ((i143 ^ 85) - (~((i143 & 85) << 1))) - 1;
                    F0 = i144 % 128;
                    int i145 = i144 % 2;
                }
                String string2 = stringBuffer3.toString();
                int i146 = G0;
                int i147 = (((i146 | 62) << 1) - (i146 ^ 62)) - 1;
                F0 = i147 % 128;
                int i148 = i147 % 2;
                return string2;
            default:
                String str3 = (String) objArr[0];
                int i149 = F0;
                int i150 = ((i149 | 119) << 1) - (i149 ^ 119);
                G0 = i150 % 128;
                int i151 = i150 % 2;
                try {
                    int length2 = str3.length();
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i152 = -(-(length2 * 85));
                    int i153 = (-85) & i152;
                    int i154 = (((-85) ^ i152) | i153) << 1;
                    int i155 = -((i152 | (-85)) & (~i153));
                    int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
                    int i157 = ~length2;
                    int i158 = ~i157;
                    int i159 = ~iCurrentTimeMillis;
                    int i160 = ~i159;
                    int i161 = i160 & (i160 | i159);
                    int i162 = ((~i161) & i158) | ((~i158) & i161);
                    int i163 = i161 & i158;
                    int i164 = (i163 & i162) | (i162 ^ i163);
                    int i165 = (i157 | length2) & i157;
                    int i166 = (i165 & i159) | (i165 ^ i159);
                    int i167 = ~i166;
                    int i168 = (i166 | i167) & i167;
                    int i169 = i164 & i168;
                    int i170 = (i164 | i168) & (~i169);
                    int i171 = (i170 & i169) | (i170 ^ i169);
                    int i172 = ((-1) ^ length2) | length2;
                    int i173 = (i172 & i159) | ((~i172) & iCurrentTimeMillis);
                    int i174 = i172 & iCurrentTimeMillis;
                    int i175 = (i174 & i173) | (i173 ^ i174);
                    int i176 = ~i175;
                    int i177 = (i175 | i176) & i176;
                    int i178 = i171 & i177;
                    int i179 = (i177 | i171) & (~i178);
                    int i180 = ((i179 & i178) | (i179 ^ i178)) * (-84);
                    int i181 = ((i156 | i180) << 1) - ((i180 & (~i156)) | ((~i180) & i156));
                    int i182 = (i157 & i159) | (iCurrentTimeMillis & i158);
                    int i183 = i157 & iCurrentTimeMillis;
                    int i184 = ~((i182 & i183) | (i182 ^ i183));
                    int i185 = ~i184;
                    int i186 = (i184 & i185) | (i185 ^ i184);
                    int i187 = (iCurrentTimeMillis | i159) & i159;
                    int i188 = i187 & length2;
                    int i189 = ~(((i187 | length2) & (~i188)) | i188);
                    int i190 = ((~i189) & i186) | ((~i186) & i189);
                    int i191 = i186 & i189;
                    int i192 = -(-(((i191 & i190) | (i190 ^ i191)) * (-84)));
                    int i193 = ((~i192) & i181) | ((~i181) & i192);
                    int i194 = -(-((i192 & i181) << 1));
                    int i195 = (((i193 ^ i194) + ((i194 & i193) << 1)) - (~((~(length2 | i159)) * 84))) - 1;
                    ady adyVar = (ady) ady.setNavigationOnClickListener(new Object[]{(byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{str3, Integer.valueOf(i195)}, 9548453, -9548448, i195)}, -1692126728, 1692126730, (int) System.currentTimeMillis());
                    int i196 = G0;
                    int i197 = i196 ^ 7;
                    int i198 = (i196 & 7) << 1;
                    int i199 = (i197 & i198) + (i198 | i197);
                    F0 = i199 % 128;
                    if (i199 % 2 == 0) {
                        return adyVar;
                    }
                    int i200 = 89 / 0;
                    return adyVar;
                } catch (IOException e5) {
                    throw new IllegalStateException("unknown encoding in name: ".concat(String.valueOf(e5)));
                }
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, 1125676026, -1125676019, System.identityHashCode(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mypinpad.tsdk.isolation.adw
    public boolean equals(Object obj) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13 = G0;
        int i14 = i13 ^ 63;
        int i15 = 1;
        int i16 = ((i13 & 63) | i14) << 1;
        int i17 = -i14;
        int i18 = (i16 & i17) + (i17 | i16);
        F0 = i18 % 128;
        int i19 = 2;
        if (i18 % 2 != 0) {
            throw null;
        }
        if (obj == this) {
            int i20 = (i13 ^ 61) + ((i13 & 61) << 1);
            F0 = i20 % 128;
            if (i20 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i21 = 0;
        if (!(obj instanceof ajq)) {
            int i22 = (i13 ^ 97) + ((i13 & 97) << 1);
            F0 = i22 % 128;
            if (i22 % 2 != 0) {
                boolean z11 = obj instanceof aed;
                throw null;
            }
            if (!(obj instanceof aed)) {
                int i23 = i13 & 49;
                int i24 = (i13 ^ 49) | i23;
                int i25 = (i23 & i24) + (i23 | i24);
                F0 = i25 % 128;
                int i26 = i25 % 2;
                return false;
            }
        }
        ady adyVarUiMessageCallbackKtWhenMappings = ((add) obj).UiMessageCallbackKtWhenMappings();
        ady adyVarUiMessageCallbackKtWhenMappings2 = UiMessageCallbackKtWhenMappings();
        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings2, adyVarUiMessageCallbackKtWhenMappings}, -109201153, 109201153, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings2))).booleanValue()) {
            int i27 = F0;
            int i28 = (i27 ^ 21) + ((i27 & 21) << 1);
            G0 = i28 % 128;
            int i29 = i28 % 2;
            return true;
        }
        try {
            ajq ajqVar = (ajq) setX(new Object[]{obj}, -1183317492, 1183317496, (int) System.currentTimeMillis());
            int i30 = F0 + 113;
            int i31 = i30 % 128;
            G0 = i31;
            int i32 = i30 % 2;
            int i33 = (i31 & (-112)) | ((~i31) & 111);
            int i34 = -(-((i31 & 111) << 1));
            int i35 = (i33 & i34) + (i33 | i34);
            F0 = i35 % 128;
            int i36 = i35 % 2;
            Vector vector = this.f52922r0;
            int size = vector.size();
            if (size != ajqVar.f52922r0.size()) {
                int i37 = G0;
                int i38 = (((i37 ^ 43) | (i37 & 43)) << 1) - ((i37 & (-44)) | ((~i37) & 43));
                F0 = i38 % 128;
                int i39 = i38 % 2;
                int i40 = ((i37 ^ 121) | (i37 & 121)) << 1;
                int i41 = -(((~i37) & 121) | (i37 & (-122)));
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                F0 = i42 % 128;
                if (i42 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            boolean[] zArr = new boolean[size];
            Object objElementAt = vector.elementAt(0);
            Vector vector2 = ajqVar.f52922r0;
            if (!(!objElementAt.equals(vector2.elementAt(0)))) {
                int i43 = G0;
                int i44 = ((i43 | 5) << 1) - (i43 ^ 5);
                int i45 = i44 % 128;
                F0 = i45;
                int i46 = i44 % 2;
                int i47 = i45 & 79;
                int i48 = (i45 ^ 79) | i47;
                int i49 = (i47 & i48) + (i48 | i47);
                G0 = i49 % 128;
                int i50 = i49 % 2;
                i12 = 1;
                i10 = 0;
                i11 = size;
            } else {
                int iIdentityHashCode = System.identityHashCode(this);
                int i51 = -(-(size * (-929)));
                int i52 = 464 & i51;
                int i53 = ((464 ^ i51) | i52) << 1;
                int i54 = -((~i52) & (i51 | 464));
                int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
                int i56 = (~iIdentityHashCode) & size;
                int i57 = ~size;
                int i58 = i56 | (iIdentityHashCode & i57);
                int i59 = size & iIdentityHashCode;
                int i60 = (i55 - (~((~((i58 ^ i59) | (i58 & i59))) * (-465)))) - 1;
                int i61 = ~iIdentityHashCode;
                int i62 = ((~i61) & size) | (i57 & i61);
                int i63 = i61 & size;
                int i64 = ((i63 & i62) | (i62 ^ i63)) * 930;
                int i65 = i60 & i64;
                int i66 = ((i60 ^ i64) | i65) << 1;
                int i67 = -((i64 | i60) & (~i65));
                int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                int i69 = ((size | iIdentityHashCode) & (~0)) * 465;
                int i70 = i68 & i69;
                i10 = ((i69 | i68) & (~i70)) + (i70 << 1);
                int i71 = F0;
                int i72 = (((i71 | 97) << 1) - (~(-(i71 ^ 97)))) - 1;
                G0 = i72 % 128;
                int i73 = i72 % 2;
                i11 = -1;
                i12 = -1;
            }
            loop0: while (true) {
                if (i10 == i11) {
                    boolean z12 = i15;
                    int i74 = G0;
                    int i75 = (((i74 | 116) << (z12 ? 1 : 0)) - (i74 ^ 116)) - (z12 ? 1 : 0);
                    F0 = i75 % 128;
                    if (i75 % 2 == 0) {
                        return z12;
                    }
                    throw null;
                }
                int i76 = F0;
                int i77 = i76 & 97;
                int i78 = (i77 - (~((i76 ^ 97) | i77))) - i15;
                G0 = i78 % 128;
                int i79 = i78 % i19;
                Vector vector3 = this.f52923s0;
                adu aduVar = (adu) vector.elementAt(i10);
                String str = (String) vector3.elementAt(i10);
                int i80 = F0;
                int i81 = ((((i80 ^ 113) | (i80 & 113)) << 1) - (~(-((i80 & (-114)) | (113 & (~i80)))))) - 1;
                G0 = i81 % 128;
                int i82 = i81 % i19;
                int i83 = i21;
                while (true) {
                    if (i83 >= size) {
                        break loop0;
                    }
                    int i84 = G0;
                    int i85 = i84 + 29;
                    F0 = i85 % 128;
                    int i86 = i85 % i19;
                    if (!zArr[i83]) {
                        int i87 = i84 & 117;
                        int i88 = ((((i84 ^ 117) | i87) << 1) - (~(-((~i87) & (i84 | 117))))) - 1;
                        F0 = i88 % 128;
                        if (i88 % 2 != 0) {
                            ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, (adu) vector2.elementAt(i83)}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue();
                            throw null;
                        }
                        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, (adu) vector2.elementAt(i83)}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue() && !(!((Boolean) setX(new Object[]{this, str, (String) ajqVar.f52923s0.elementAt(i83)}, 2047928254, -2047928253, System.identityHashCode(this))).booleanValue())) {
                            break;
                        }
                    }
                    int i89 = i83 & (-117);
                    int i90 = (i83 | (-117)) & (~i89);
                    int i91 = i89 << 1;
                    int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
                    int i93 = i92 & 118;
                    int i94 = (i92 ^ 118) | i93;
                    i83 = ((i93 | i94) << 1) - (i93 ^ i94);
                    int i95 = G0;
                    int i96 = i95 ^ 47;
                    int i97 = -(-((i95 & 47) << 1));
                    int i98 = ((i96 | i97) << 1) - (i96 ^ i97);
                    F0 = i98 % 128;
                    int i99 = i98 % 2;
                    i19 = 2;
                }
                int i100 = G0;
                int i101 = ((-1) << 1) - ((((i100 | 92) << 1) - (i100 ^ 92)) ^ (-1));
                F0 = i101 % 128;
                if (i101 % 2 != 0) {
                    zArr[i83] = false;
                    z10 = false;
                } else {
                    zArr[i83] = true;
                    z10 = true;
                }
                int i102 = ((i100 ^ 1) | (i100 & 1)) << 1;
                int i103 = -(((~i100) & 1) | (i100 & (-2)));
                int i104 = ((i102 | i103) << 1) - (i103 ^ i102);
                F0 = i104 % 128;
                int i105 = i104 % 2;
                if (!z10) {
                    break;
                }
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i106 = i12 * (-559);
                int i107 = -(~(i10 * 561));
                int i108 = (i106 ^ i107) + ((i106 & i107) << 1);
                int i109 = (i108 ^ (-1)) + (i108 << 1);
                int i110 = ~iIdentityHashCode2;
                int i111 = ~i12;
                int i112 = (i110 & i111) | ((~i110) & i12);
                int i113 = i110 & i12;
                int i114 = (i113 & i112) | (i112 ^ i113);
                int i115 = ((i114 | (~i114)) & (~i114)) * (-560);
                int i116 = i109 & i115;
                int i117 = (i109 | i115) & (~i116);
                int i118 = -(-(i116 << 1));
                int i119 = (i117 & i118) + (i117 | i118);
                int i120 = (~i10) & ((~i10) | i10);
                int i121 = i120 ^ i12;
                int i122 = i120 & i12;
                int i123 = (i122 & i121) | (i121 ^ i122);
                int i124 = -(-((~((i123 & iIdentityHashCode2) | (i123 ^ iIdentityHashCode2))) * (-560)));
                int i125 = i119 & i124;
                int i126 = ((i124 | i119) & (~i125)) + (i125 << 1);
                int i127 = (~i12) & (i111 | i12);
                int i128 = i127 ^ i10;
                int i129 = i127 & i10;
                int i130 = (i129 & i128) | (i128 ^ i129);
                int i131 = (i130 | (~i130)) & (~i130);
                int i132 = ~iIdentityHashCode2;
                int i133 = (i132 & i10) | (i132 ^ i10);
                int i134 = (i133 | (~i133)) & (~i133);
                int i135 = ((i134 & i131) | ((~i134) & i131) | ((~i131) & i134)) * 560;
                i10 = (((i126 ^ i135) | (i126 & i135)) << 1) - ((i135 & (~i126)) | ((~i135) & i126));
                int i136 = F0;
                int i137 = ((i136 ^ 99) | (i136 & 99)) << 1;
                int i138 = -(((~i136) & 99) | (i136 & (-100)));
                int i139 = ((i137 | i138) << 1) - (i138 ^ i137);
                G0 = i139 % 128;
                i19 = 2;
                int i140 = i139 % 2;
                i15 = 1;
                i21 = 0;
            }
            int i141 = ((-1) << 1) - ((F0 + 14) ^ (-1));
            int i142 = i141 % 128;
            G0 = i142;
            int i143 = i141 % 2;
            int i144 = i142 & 85;
            int i145 = (((i142 | 85) & (~i144)) - (~(-(-(i144 << 1))))) - 1;
            F0 = i145 % 128;
            if (i145 % 2 == 0) {
                return false;
            }
            throw null;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = F0;
        int i11 = (i10 & 111) + (i10 | 111);
        int i12 = i11 % 128;
        G0 = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (!(!this.v0)) {
            int i13 = this.f52926w0;
            int i14 = ((i12 | 1) << 1) - (i12 ^ 1);
            F0 = i14 % 128;
            if (i14 % 2 == 0) {
                return i13;
            }
            throw null;
        }
        this.v0 = true;
        int i15 = ((i12 ^ 122) + ((i12 & 122) << 1)) - 1;
        F0 = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (true) {
            Vector vector = this.f52922r0;
            if (i17 == vector.size()) {
                break;
            }
            int i18 = G0;
            int i19 = ((-1) << 1) - (((i18 & 40) + (i18 | 40)) ^ (-1));
            F0 = i19 % 128;
            int i20 = i19 % 2;
            String str = (String) setX(new Object[]{(String) setX(new Object[]{(String) this.f52923s0.elementAt(i17)}, -23488285, 23488290, (int) System.currentTimeMillis())}, 123071441, -123071438, (int) System.currentTimeMillis());
            int i21 = this.f52926w0;
            int iHashCode = vector.elementAt(i17).hashCode();
            int i22 = (iHashCode | i21) & (~(i21 & iHashCode));
            this.f52926w0 = i22;
            int iHashCode2 = str.hashCode();
            this.f52926w0 = (i22 | iHashCode2) & (~(i22 & iHashCode2));
            int i23 = (i17 & 111) + (i17 | 111);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            int i25 = i24 & (-109);
            i17 = ((i24 | (-109)) & (~i25)) + (i25 << 1);
            int i26 = F0 + 71;
            G0 = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = this.f52926w0;
        int i29 = F0;
        int i30 = i29 & 25;
        int i31 = (i29 ^ 25) | i30;
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        G0 = i32 % 128;
        if (i32 % 2 != 0) {
            return i28;
        }
        throw null;
    }

    public String toString() {
        int i10 = G0;
        int i11 = i10 & 33;
        int i12 = -(-(i10 | 33));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        F0 = i13 % 128;
        int i14 = i13 % 2;
        String str = (String) setX(new Object[]{this, Boolean.FALSE, f52920x0}, 788978032, -788978024, System.identityHashCode(this));
        int i15 = F0 + 119;
        G0 = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 66 / 0;
        }
        return str;
    }

    public ajq() {
    }
}
