package org.bouncycastle.asn1.x500.style;

import ad.e;
import androidx.camera.camera2.internal.h0;
import com.bbva.cellswidgets.MaskTextWatcher;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public class IETFUtils {
    public static int a(char c10) {
        if ('0' > c10 || c10 > '9') {
            return ('a' > c10 || c10 > 'f') ? c10 - '7' : c10 - 'W';
        }
        return c10 - '0';
    }

    public static void appendRDN(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(stringBuffer, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z10 = true;
        for (int i10 = 0; i10 != typesAndValues.length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append('+');
            }
            appendTypeAndValue(stringBuffer, typesAndValues[i10], hashtable);
        }
    }

    public static void appendTypeAndValue(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String id = (String) hashtable.get(attributeTypeAndValue.getType());
        if (id == null) {
            id = attributeTypeAndValue.getType().getId();
        }
        stringBuffer.append(id);
        stringBuffer.append('=');
        stringBuffer.append(valueToString(attributeTypeAndValue.getValue()));
    }

    public static String b(String str) {
        int i10;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append("\\#");
            i10 = 2;
        } else {
            i10 = 0;
        }
        boolean z10 = false;
        int length = 0;
        boolean z11 = false;
        boolean z12 = false;
        char c10 = 0;
        while (i10 != charArray.length) {
            char c11 = charArray[i10];
            if (c11 != ' ') {
                z12 = true;
            }
            if (c11 != '\"') {
                if (c11 == '\\' && !z10 && !z11) {
                    length = stringBuffer.length();
                    z10 = true;
                } else if (c11 != ' ' || z10 || z12) {
                    if (!z10 || (('0' > c11 || c11 > '9') && (('a' > c11 || c11 > 'f') && ('A' > c11 || c11 > 'F')))) {
                        stringBuffer.append(c11);
                    } else if (c10 != 0) {
                        stringBuffer.append((char) (a(c11) + (a(c10) * 16)));
                        z10 = false;
                        c10 = 0;
                    } else {
                        c10 = c11;
                    }
                }
                i10++;
            } else if (z10) {
                stringBuffer.append(c11);
            } else {
                z11 = !z11;
            }
            z10 = false;
            i10++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && length != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static String canonicalString(ASN1Encodable aSN1Encodable) {
        return canonicalize(valueToString(aSN1Encodable));
    }

    public static String canonicalize(String str) {
        int i10 = 0;
        if (str.length() > 0 && str.charAt(0) == '#') {
            try {
                ASN1Encodable aSN1EncodableFromByteArray = ASN1Primitive.fromByteArray(Hex.decodeStrict(str, 1, str.length() - 1));
                if (aSN1EncodableFromByteArray instanceof ASN1String) {
                    str = ((ASN1String) aSN1EncodableFromByteArray).getString();
                }
            } catch (IOException e5) {
                throw new IllegalStateException(e.d("unknown encoding in name: ", e5));
            }
        }
        String lowerCase = Strings.toLowerCase(str);
        int length = lowerCase.length();
        if (length < 2) {
            return lowerCase;
        }
        int i11 = length - 1;
        while (i10 < i11 && lowerCase.charAt(i10) == '\\' && lowerCase.charAt(i10 + 1) == ' ') {
            i10 += 2;
        }
        int i12 = i10 + 1;
        int i13 = i11;
        while (i13 > i12 && lowerCase.charAt(i13 - 1) == '\\' && lowerCase.charAt(i13) == ' ') {
            i13 -= 2;
        }
        if (i10 > 0 || i13 < i11) {
            lowerCase = lowerCase.substring(i10, i13 + 1);
        }
        return stripInternalSpaces(lowerCase);
    }

    public static ASN1ObjectIdentifier decodeAttrName(String str, Hashtable hashtable) {
        if (Strings.toUpperCase(str).startsWith("OID.")) {
            return new ASN1ObjectIdentifier(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new ASN1ObjectIdentifier(str);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(h0.b("Unknown object id - ", str, " - passed to distinguished name"));
    }

    public static String[] findAttrNamesForOID(ASN1ObjectIdentifier aSN1ObjectIdentifier, Hashtable hashtable) {
        Enumeration enumerationElements = hashtable.elements();
        int i10 = 0;
        int i11 = 0;
        while (enumerationElements.hasMoreElements()) {
            if (aSN1ObjectIdentifier.equals(enumerationElements.nextElement())) {
                i11++;
            }
        }
        String[] strArr = new String[i11];
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (aSN1ObjectIdentifier.equals(hashtable.get(str))) {
                strArr[i10] = str;
                i10++;
            }
        }
        return strArr;
    }

    public static boolean rDNAreEqual(RDN rdn, RDN rdn2) {
        if (rdn.size() != rdn2.size()) {
            return false;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        AttributeTypeAndValue[] typesAndValues2 = rdn2.getTypesAndValues();
        if (typesAndValues.length != typesAndValues2.length) {
            return false;
        }
        for (int i10 = 0; i10 != typesAndValues.length; i10++) {
            AttributeTypeAndValue attributeTypeAndValue = typesAndValues[i10];
            AttributeTypeAndValue attributeTypeAndValue2 = typesAndValues2[i10];
            if (attributeTypeAndValue != attributeTypeAndValue2 && (attributeTypeAndValue == null || attributeTypeAndValue2 == null || !attributeTypeAndValue.getType().equals((ASN1Primitive) attributeTypeAndValue2.getType()) || !canonicalString(attributeTypeAndValue.getValue()).equals(canonicalString(attributeTypeAndValue2.getValue())))) {
                return false;
            }
        }
        return true;
    }

    public static RDN[] rDNsFromString(String str, X500NameStyle x500NameStyle) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str);
        X500NameBuilder x500NameBuilder = new X500NameBuilder(x500NameStyle);
        while (x500NameTokenizer.hasMoreTokens()) {
            String strNextToken = x500NameTokenizer.nextToken();
            if (strNextToken.indexOf(43) > 0) {
                X500NameTokenizer x500NameTokenizer2 = new X500NameTokenizer(strNextToken, '+');
                X500NameTokenizer x500NameTokenizer3 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                String strNextToken2 = x500NameTokenizer3.nextToken();
                if (!x500NameTokenizer3.hasMoreTokens()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                String strNextToken3 = x500NameTokenizer3.nextToken();
                ASN1ObjectIdentifier aSN1ObjectIdentifierAttrNameToOID = x500NameStyle.attrNameToOID(strNextToken2.trim());
                if (x500NameTokenizer2.hasMoreTokens()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    while (true) {
                        vector.addElement(aSN1ObjectIdentifierAttrNameToOID);
                        vector2.addElement(b(strNextToken3));
                        if (!x500NameTokenizer2.hasMoreTokens()) {
                            int size = vector.size();
                            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
                            for (int i10 = 0; i10 != size; i10++) {
                                aSN1ObjectIdentifierArr[i10] = (ASN1ObjectIdentifier) vector.elementAt(i10);
                            }
                            int size2 = vector2.size();
                            String[] strArr = new String[size2];
                            for (int i11 = 0; i11 != size2; i11++) {
                                strArr[i11] = (String) vector2.elementAt(i11);
                            }
                            x500NameBuilder.addMultiValuedRDN(aSN1ObjectIdentifierArr, strArr);
                            break;
                        }
                        X500NameTokenizer x500NameTokenizer4 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                        String strNextToken4 = x500NameTokenizer4.nextToken();
                        if (!x500NameTokenizer4.hasMoreTokens()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        strNextToken3 = x500NameTokenizer4.nextToken();
                        aSN1ObjectIdentifierAttrNameToOID = x500NameStyle.attrNameToOID(strNextToken4.trim());
                    }
                } else {
                    x500NameBuilder.addRDN(aSN1ObjectIdentifierAttrNameToOID, b(strNextToken3));
                }
            } else {
                X500NameTokenizer x500NameTokenizer5 = new X500NameTokenizer(strNextToken, '=');
                String strNextToken5 = x500NameTokenizer5.nextToken();
                if (!x500NameTokenizer5.hasMoreTokens()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                x500NameBuilder.addRDN(x500NameStyle.attrNameToOID(strNextToken5.trim()), b(x500NameTokenizer5.nextToken()));
            }
        }
        return x500NameBuilder.build().getRDNs();
    }

    public static String stripInternalSpaces(String str) {
        if (str.indexOf("  ") < 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char cCharAt = str.charAt(0);
        stringBuffer.append(cCharAt);
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt != ' ' || cCharAt2 != ' ') {
                stringBuffer.append(cCharAt2);
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static ASN1Encodable valueFromHexString(String str, int i10) throws IOException {
        int length = (str.length() - i10) / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            int i12 = (i11 * 2) + i10;
            char cCharAt = str.charAt(i12);
            char cCharAt2 = str.charAt(i12 + 1);
            bArr[i11] = (byte) (a(cCharAt2) | (a(cCharAt) << 4));
        }
        return ASN1Primitive.fromByteArray(bArr);
    }

    public static String valueToString(ASN1Encodable aSN1Encodable) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(aSN1Encodable instanceof ASN1String) || (aSN1Encodable instanceof DERUniversalString)) {
            try {
                stringBuffer.append(MaskTextWatcher.WILDCARD);
                stringBuffer.append(Hex.toHexString(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((ASN1String) aSN1Encodable).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer.append(AbstractJsonLexerKt.STRING_ESC);
            }
            stringBuffer.append(string);
        }
        int length = stringBuffer.length();
        int i10 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i10 != length) {
            char cCharAt = stringBuffer.charAt(i10);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i10++;
                        break;
                }
            }
            stringBuffer.insert(i10, "\\");
            i10 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i11 = 0; stringBuffer.length() > i11 && stringBuffer.charAt(i11) == ' '; i11 += 2) {
                stringBuffer.insert(i11, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, AbstractJsonLexerKt.STRING_ESC);
        }
        return stringBuffer.toString();
    }
}
