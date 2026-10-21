package org.bouncycastle.asn1.x509;

import ad.e;
import androidx.camera.camera2.internal.h0;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes12.dex */
public class X509Name extends ASN1Object {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    public static final Hashtable DefaultLookUp;
    public static boolean DefaultReverse;
    public static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final Hashtable OIDLookUp;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final Hashtable RFC1779Symbols;
    public static final Hashtable RFC2253Symbols;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final Hashtable SymbolLookUp;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final Boolean f87774w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final Boolean f87775x0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final X509NameEntryConverter f87776p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Vector f87777q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Vector f87778r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Vector f87779s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ASN1Sequence f87780t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f87781u0;
    public int v0;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.5.4.6");
        C = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier("2.5.4.10");
        O = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(ObjectIdentifiers.organizationalUnitName);
        OU = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier("2.5.4.12");
        T = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(ObjectIdentifiers.commonName);
        CN = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier("2.5.4.5");
        SN = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("2.5.4.9");
        STREET = aSN1ObjectIdentifier7;
        SERIALNUMBER = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("2.5.4.7");
        L = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("2.5.4.8");
        ST = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("2.5.4.4");
        SURNAME = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifier11;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier("2.5.4.43");
        INITIALS = aSN1ObjectIdentifier12;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = new ASN1ObjectIdentifier("2.5.4.44");
        GENERATION = aSN1ObjectIdentifier13;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = new ASN1ObjectIdentifier("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifier14;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = new ASN1ObjectIdentifier("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifier15;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = new ASN1ObjectIdentifier("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifier16;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = new ASN1ObjectIdentifier("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifier17;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = new ASN1ObjectIdentifier("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifier18;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = aSN1ObjectIdentifier19;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = aSN1ObjectIdentifier20;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.3");
        GENDER = aSN1ObjectIdentifier21;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifier22;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifier23;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = new ASN1ObjectIdentifier("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifier24;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = new ASN1ObjectIdentifier("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifier25;
        DMD_NAME = new ASN1ObjectIdentifier("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier26;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier27;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier29;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier30;
        E = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier31;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier32;
        DefaultReverse = false;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        RFC2253Symbols = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        RFC1779Symbols = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        DefaultLookUp = hashtable4;
        OIDLookUp = hashtable;
        SymbolLookUp = hashtable4;
        f87774w0 = new Boolean(true);
        f87775x0 = new Boolean(false);
        hashtable.put(aSN1ObjectIdentifier, "C");
        hashtable.put(aSN1ObjectIdentifier2, "O");
        hashtable.put(aSN1ObjectIdentifier4, ExifInterface.GPS_DIRECTION_TRUE);
        hashtable.put(aSN1ObjectIdentifier3, "OU");
        hashtable.put(aSN1ObjectIdentifier5, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS);
        hashtable.put(aSN1ObjectIdentifier8, "L");
        hashtable.put(aSN1ObjectIdentifier9, "ST");
        hashtable.put(aSN1ObjectIdentifier6, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier28, ExifInterface.LONGITUDE_EAST);
        hashtable.put(aSN1ObjectIdentifier31, "DC");
        hashtable.put(aSN1ObjectIdentifier32, "UID");
        hashtable.put(aSN1ObjectIdentifier7, "STREET");
        hashtable.put(aSN1ObjectIdentifier10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifier11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifier12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifier13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifier30, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier29, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifier14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifier17, "DN");
        hashtable.put(aSN1ObjectIdentifier18, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifier25, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifier24, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifier22, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifier23, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifier21, "Gender");
        hashtable.put(aSN1ObjectIdentifier20, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifier19, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifier16, "PostalCode");
        hashtable.put(aSN1ObjectIdentifier15, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier26, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier27, "Name");
        hashtable2.put(aSN1ObjectIdentifier, "C");
        hashtable2.put(aSN1ObjectIdentifier2, "O");
        hashtable2.put(aSN1ObjectIdentifier3, "OU");
        hashtable2.put(aSN1ObjectIdentifier5, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS);
        hashtable2.put(aSN1ObjectIdentifier8, "L");
        hashtable2.put(aSN1ObjectIdentifier9, "ST");
        hashtable2.put(aSN1ObjectIdentifier7, "STREET");
        hashtable2.put(aSN1ObjectIdentifier31, "DC");
        hashtable2.put(aSN1ObjectIdentifier32, "UID");
        hashtable3.put(aSN1ObjectIdentifier, "C");
        hashtable3.put(aSN1ObjectIdentifier2, "O");
        hashtable3.put(aSN1ObjectIdentifier3, "OU");
        hashtable3.put(aSN1ObjectIdentifier5, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS);
        hashtable3.put(aSN1ObjectIdentifier8, "L");
        hashtable3.put(aSN1ObjectIdentifier9, "ST");
        hashtable3.put(aSN1ObjectIdentifier7, "STREET");
        hashtable4.put("c", aSN1ObjectIdentifier);
        hashtable4.put("o", aSN1ObjectIdentifier2);
        hashtable4.put("t", aSN1ObjectIdentifier4);
        hashtable4.put("ou", aSN1ObjectIdentifier3);
        hashtable4.put("cn", aSN1ObjectIdentifier5);
        hashtable4.put("l", aSN1ObjectIdentifier8);
        hashtable4.put(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, aSN1ObjectIdentifier9);
        hashtable4.put("sn", aSN1ObjectIdentifier6);
        hashtable4.put("serialnumber", aSN1ObjectIdentifier6);
        hashtable4.put("street", aSN1ObjectIdentifier7);
        hashtable4.put("emailaddress", aSN1ObjectIdentifier28);
        hashtable4.put("dc", aSN1ObjectIdentifier31);
        hashtable4.put("e", aSN1ObjectIdentifier28);
        hashtable4.put("uid", aSN1ObjectIdentifier32);
        hashtable4.put("surname", aSN1ObjectIdentifier10);
        hashtable4.put("givenname", aSN1ObjectIdentifier11);
        hashtable4.put("initials", aSN1ObjectIdentifier12);
        hashtable4.put("generation", aSN1ObjectIdentifier13);
        hashtable4.put("unstructuredaddress", aSN1ObjectIdentifier30);
        hashtable4.put("unstructuredname", aSN1ObjectIdentifier29);
        hashtable4.put("uniqueidentifier", aSN1ObjectIdentifier14);
        hashtable4.put("dn", aSN1ObjectIdentifier17);
        hashtable4.put("pseudonym", aSN1ObjectIdentifier18);
        hashtable4.put("postaladdress", aSN1ObjectIdentifier25);
        hashtable4.put("nameofbirth", aSN1ObjectIdentifier24);
        hashtable4.put("countryofcitizenship", aSN1ObjectIdentifier22);
        hashtable4.put("countryofresidence", aSN1ObjectIdentifier23);
        hashtable4.put("gender", aSN1ObjectIdentifier21);
        hashtable4.put("placeofbirth", aSN1ObjectIdentifier20);
        hashtable4.put("dateofbirth", aSN1ObjectIdentifier19);
        hashtable4.put("postalcode", aSN1ObjectIdentifier16);
        hashtable4.put("businesscategory", aSN1ObjectIdentifier15);
        hashtable4.put("telephonenumber", aSN1ObjectIdentifier26);
        hashtable4.put("name", aSN1ObjectIdentifier27);
    }

    public X509Name() {
        this.f87776p0 = null;
        this.f87777q0 = new Vector();
        this.f87778r0 = new Vector();
        this.f87779s0 = new Vector();
    }

    public static void b(StringBuffer stringBuffer, Hashtable hashtable, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        String id = (String) hashtable.get(aSN1ObjectIdentifier);
        if (id == null) {
            id = aSN1ObjectIdentifier.getId();
        }
        stringBuffer.append(id);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, AbstractJsonLexerKt.STRING_ESC);
            }
        }
        while (length <= length2) {
            char cCharAt = stringBuffer.charAt(length);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        break;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    public static String c(String str) {
        String lowerCase = Strings.toLowerCase(str.trim());
        if (lowerCase.length() <= 0 || lowerCase.charAt(0) != '#') {
            return lowerCase;
        }
        try {
            ASN1Encodable aSN1EncodableFromByteArray = ASN1Primitive.fromByteArray(Hex.decodeStrict(lowerCase, 1, lowerCase.length() - 1));
            return aSN1EncodableFromByteArray instanceof ASN1String ? Strings.toLowerCase(((ASN1String) aSN1EncodableFromByteArray).getString().trim()) : lowerCase;
        } catch (IOException e5) {
            throw new IllegalStateException(e.d("unknown encoding in name: ", e5));
        }
    }

    public static String d(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i10 = 1;
            while (i10 < str.length()) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i10++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static X509Name getInstance(Object obj) {
        if (obj == null || (obj instanceof X509Name)) {
            return (X509Name) obj;
        }
        return obj instanceof X500Name ? new X509Name(ASN1Sequence.getInstance(((X500Name) obj).toASN1Primitive())) : new X509Name(ASN1Sequence.getInstance(obj));
    }

    public final void a(Hashtable hashtable, String str, Boolean bool) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        String strTrim;
        int i10;
        X509NameTokenizer x509NameTokenizer = new X509NameTokenizer(str, '=');
        String strNextToken = x509NameTokenizer.nextToken();
        if (!x509NameTokenizer.hasMoreTokens()) {
            throw new IllegalArgumentException("badly formatted directory string");
        }
        String strNextToken2 = x509NameTokenizer.nextToken();
        String strTrim2 = strNextToken.trim();
        if (Strings.toUpperCase(strTrim2).startsWith("OID.")) {
            aSN1ObjectIdentifier = new ASN1ObjectIdentifier(strTrim2.substring(4));
        } else if (strTrim2.charAt(0) < '0' || strTrim2.charAt(0) > '9') {
            aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(strTrim2));
            if (aSN1ObjectIdentifier == null) {
                throw new IllegalArgumentException(h0.b("Unknown object id - ", strTrim2, " - passed to distinguished name"));
            }
        } else {
            aSN1ObjectIdentifier = new ASN1ObjectIdentifier(strTrim2);
        }
        this.f87777q0.addElement(aSN1ObjectIdentifier);
        if (strNextToken2.length() == 0 || (strNextToken2.indexOf(92) < 0 && strNextToken2.indexOf(34) < 0)) {
            strTrim = strNextToken2.trim();
        } else {
            char[] charArray = strNextToken2.toCharArray();
            StringBuffer stringBuffer = new StringBuffer(strNextToken2.length());
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
            while (i10 != charArray.length) {
                char c10 = charArray[i10];
                if (c10 != ' ') {
                    z12 = true;
                }
                if (c10 == '\"') {
                    if (!z10) {
                        z11 = !z11;
                    }
                    z10 = false;
                    i10++;
                } else {
                    if (c10 == '\\' && !z10 && !z11) {
                        length = stringBuffer.length();
                        z10 = true;
                    } else if (c10 != ' ' || z10 || z12) {
                    }
                    i10++;
                }
                stringBuffer.append(c10);
                z10 = false;
                i10++;
            }
            if (stringBuffer.length() > 0) {
                while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && length != stringBuffer.length() - 1) {
                    stringBuffer.setLength(stringBuffer.length() - 1);
                }
            }
            strTrim = stringBuffer.toString();
        }
        this.f87778r0.addElement(strTrim);
        this.f87779s0.addElement(bool);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        int i10;
        int i11;
        int i12;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            X509Name x509Name = getInstance(obj);
            Vector vector = this.f87777q0;
            int size = vector.size();
            if (size != x509Name.f87777q0.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            Object objElementAt = vector.elementAt(0);
            Vector vector2 = x509Name.f87777q0;
            if (objElementAt.equals(vector2.elementAt(0))) {
                i12 = 1;
                i10 = 0;
                i11 = size;
            } else {
                i10 = size - 1;
                i11 = -1;
                i12 = -1;
            }
            while (i10 != i11) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) vector.elementAt(i10);
                String str = (String) this.f87778r0.elementAt(i10);
                for (int i13 = 0; i13 < size; i13++) {
                    if (!zArr[i13] && aSN1ObjectIdentifier.equals((ASN1Primitive) vector2.elementAt(i13))) {
                        String str2 = (String) x509Name.f87778r0.elementAt(i13);
                        String strC = c(str);
                        String strC2 = c(str2);
                        if (strC.equals(strC2) || d(strC).equals(d(strC2))) {
                            zArr[i13] = true;
                            i10 += i12;
                        }
                    }
                }
                return false;
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public Vector getOIDs() {
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            Vector vector2 = this.f87777q0;
            if (i10 == vector2.size()) {
                return vector;
            }
            vector.addElement(vector2.elementAt(i10));
            i10++;
        }
    }

    public Vector getValues() {
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            Vector vector2 = this.f87778r0;
            if (i10 == vector2.size()) {
                return vector;
            }
            vector.addElement(vector2.elementAt(i10));
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.f87781u0) {
            return this.v0;
        }
        this.f87781u0 = true;
        int i10 = 0;
        while (true) {
            Vector vector = this.f87777q0;
            if (i10 == vector.size()) {
                return this.v0;
            }
            String strD = d(c((String) this.f87778r0.elementAt(i10)));
            int iHashCode = vector.elementAt(i10).hashCode() ^ this.v0;
            this.v0 = iHashCode;
            this.v0 = iHashCode ^ strD.hashCode();
            i10++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DERSequence dERSequence;
        if (this.f87780t0 == null) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = null;
            int i10 = 0;
            while (true) {
                Vector vector = this.f87777q0;
                if (i10 == vector.size()) {
                    break;
                }
                ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector(2);
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) vector.elementAt(i10);
                aSN1EncodableVector3.add(aSN1ObjectIdentifier2);
                aSN1EncodableVector3.add(this.f87776p0.getConvertedValue(aSN1ObjectIdentifier2, (String) this.f87778r0.elementAt(i10)));
                if (aSN1ObjectIdentifier == null || ((Boolean) this.f87779s0.elementAt(i10)).booleanValue()) {
                    dERSequence = new DERSequence(aSN1EncodableVector3);
                } else {
                    aSN1EncodableVector.add(new DERSet(aSN1EncodableVector2));
                    aSN1EncodableVector2 = new ASN1EncodableVector();
                    dERSequence = new DERSequence(aSN1EncodableVector3);
                }
                aSN1EncodableVector2.add(dERSequence);
                i10++;
                aSN1ObjectIdentifier = aSN1ObjectIdentifier2;
            }
            aSN1EncodableVector.add(new DERSet(aSN1EncodableVector2));
            this.f87780t0 = new DERSequence(aSN1EncodableVector);
        }
        return this.f87780t0;
    }

    public String toString() {
        return toString(DefaultReverse, DefaultSymbols);
    }

    public X509Name(String str) {
        this(DefaultReverse, DefaultLookUp, str);
    }

    public static X509Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }

    public Vector getValues(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            Vector vector2 = this.f87778r0;
            if (i10 == vector2.size()) {
                return vector;
            }
            if (this.f87777q0.elementAt(i10).equals(aSN1ObjectIdentifier)) {
                String strSubstring = (String) vector2.elementAt(i10);
                if (strSubstring.length() > 2 && strSubstring.charAt(0) == '\\' && strSubstring.charAt(1) == '#') {
                    strSubstring = strSubstring.substring(1);
                }
                vector.addElement(strSubstring);
            }
            i10++;
        }
    }

    public String toString(boolean z10, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        int i10 = 0;
        while (true) {
            Vector vector2 = this.f87777q0;
            if (i10 >= vector2.size()) {
                break;
            }
            boolean zBooleanValue = ((Boolean) this.f87779s0.elementAt(i10)).booleanValue();
            Vector vector3 = this.f87778r0;
            if (zBooleanValue) {
                stringBuffer2.append('+');
                b(stringBuffer2, hashtable, (ASN1ObjectIdentifier) vector2.elementAt(i10), (String) vector3.elementAt(i10));
            } else {
                stringBuffer2 = new StringBuffer();
                b(stringBuffer2, hashtable, (ASN1ObjectIdentifier) vector2.elementAt(i10), (String) vector3.elementAt(i10));
                vector.addElement(stringBuffer2);
            }
            i10++;
        }
        boolean z11 = true;
        if (z10) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z11) {
                    z11 = false;
                } else {
                    stringBuffer.append(AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i11 = 0; i11 < vector.size(); i11++) {
                if (z11) {
                    z11 = false;
                } else {
                    stringBuffer.append(AbstractJsonLexerKt.COMMA);
                }
                stringBuffer.append(vector.elementAt(i11).toString());
            }
        }
        return stringBuffer.toString();
    }

    public X509Name(String str, X509NameEntryConverter x509NameEntryConverter) {
        this(DefaultReverse, DefaultLookUp, str, x509NameEntryConverter);
    }

    public boolean equals(Object obj, boolean z10) {
        if (!z10) {
            return equals(obj);
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            X509Name x509Name = getInstance(obj);
            Vector vector = this.f87777q0;
            int size = vector.size();
            if (size != x509Name.f87777q0.size()) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (!((ASN1ObjectIdentifier) vector.elementAt(i10)).equals((ASN1Primitive) x509Name.f87777q0.elementAt(i10))) {
                    return false;
                }
                String str = (String) this.f87778r0.elementAt(i10);
                String str2 = (String) x509Name.f87778r0.elementAt(i10);
                String strC = c(str);
                String strC2 = c(str2);
                if (!strC.equals(strC2) && !d(strC).equals(d(strC2))) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public X509Name(Hashtable hashtable) {
        this((Vector) null, hashtable);
    }

    public X509Name(Vector vector, Hashtable hashtable) {
        this(vector, hashtable, new X509DefaultEntryConverter());
    }

    public X509Name(Vector vector, Hashtable hashtable, X509NameEntryConverter x509NameEntryConverter) {
        this.f87776p0 = null;
        this.f87777q0 = new Vector();
        this.f87778r0 = new Vector();
        this.f87779s0 = new Vector();
        this.f87776p0 = x509NameEntryConverter;
        Boolean bool = f87775x0;
        if (vector != null) {
            for (int i10 = 0; i10 != vector.size(); i10++) {
                this.f87777q0.addElement(vector.elementAt(i10));
                this.f87779s0.addElement(bool);
            }
        } else {
            Enumeration enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                this.f87777q0.addElement(enumerationKeys.nextElement());
                this.f87779s0.addElement(bool);
            }
        }
        for (int i11 = 0; i11 != this.f87777q0.size(); i11++) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) this.f87777q0.elementAt(i11);
            if (hashtable.get(aSN1ObjectIdentifier) == null) {
                throw new IllegalArgumentException("No attribute for object id - " + aSN1ObjectIdentifier.getId() + " - passed to distinguished name");
            }
            this.f87778r0.addElement(hashtable.get(aSN1ObjectIdentifier));
        }
    }

    public X509Name(Vector vector, Vector vector2) {
        this(vector, vector2, new X509DefaultEntryConverter());
    }

    public X509Name(Vector vector, Vector vector2, X509NameEntryConverter x509NameEntryConverter) {
        this.f87776p0 = null;
        this.f87777q0 = new Vector();
        this.f87778r0 = new Vector();
        this.f87779s0 = new Vector();
        this.f87776p0 = x509NameEntryConverter;
        if (vector.size() != vector2.size()) {
            throw new IllegalArgumentException("oids vector must be same length as values.");
        }
        for (int i10 = 0; i10 < vector.size(); i10++) {
            this.f87777q0.addElement(vector.elementAt(i10));
            this.f87778r0.addElement(vector2.elementAt(i10));
            this.f87779s0.addElement(f87775x0);
        }
    }

    public X509Name(ASN1Sequence aSN1Sequence) {
        Vector vector;
        this.f87776p0 = null;
        this.f87777q0 = new Vector();
        this.f87778r0 = new Vector();
        this.f87779s0 = new Vector();
        this.f87780t0 = aSN1Sequence;
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Set aSN1Set = ASN1Set.getInstance(((ASN1Encodable) objects.nextElement()).toASN1Primitive());
            int i10 = 0;
            while (i10 < aSN1Set.size()) {
                ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Set.getObjectAt(i10).toASN1Primitive());
                if (aSN1Sequence2.size() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.f87777q0.addElement(ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0)));
                ASN1Encodable objectAt = aSN1Sequence2.getObjectAt(1);
                if (!(objectAt instanceof ASN1String) || (objectAt instanceof DERUniversalString)) {
                    try {
                        Vector vector2 = this.f87778r0;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("#");
                        byte[] bArrEncode = Hex.encode(objectAt.toASN1Primitive().getEncoded(ASN1Encoding.DER));
                        int length = bArrEncode.length;
                        char[] cArr = new char[length];
                        for (int i11 = 0; i11 != length; i11++) {
                            cArr[i11] = (char) (bArrEncode[i11] & 255);
                        }
                        sb2.append(new String(cArr));
                        vector2.addElement(sb2.toString());
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String string = ((ASN1String) objectAt).getString();
                    if (string.length() <= 0 || string.charAt(0) != '#') {
                        vector = this.f87778r0;
                    } else {
                        vector = this.f87778r0;
                        string = "\\".concat(string);
                    }
                    vector.addElement(string);
                }
                this.f87779s0.addElement(i10 != 0 ? f87774w0 : f87775x0);
                i10++;
            }
        }
    }

    public X509Name(boolean z10, String str) {
        this(z10, DefaultLookUp, str);
    }

    public X509Name(boolean z10, String str, X509NameEntryConverter x509NameEntryConverter) {
        this(z10, DefaultLookUp, str, x509NameEntryConverter);
    }

    public X509Name(boolean z10, Hashtable hashtable, String str) {
        this(z10, hashtable, str, new X509DefaultEntryConverter());
    }

    public X509Name(boolean z10, Hashtable hashtable, String str, X509NameEntryConverter x509NameEntryConverter) {
        this.f87776p0 = null;
        this.f87777q0 = new Vector();
        this.f87778r0 = new Vector();
        this.f87779s0 = new Vector();
        this.f87776p0 = x509NameEntryConverter;
        X509NameTokenizer x509NameTokenizer = new X509NameTokenizer(str);
        while (x509NameTokenizer.hasMoreTokens()) {
            String strNextToken = x509NameTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(43);
            Boolean bool = f87775x0;
            if (iIndexOf > 0) {
                X509NameTokenizer x509NameTokenizer2 = new X509NameTokenizer(strNextToken, '+');
                a(hashtable, x509NameTokenizer2.nextToken(), bool);
                while (x509NameTokenizer2.hasMoreTokens()) {
                    a(hashtable, x509NameTokenizer2.nextToken(), f87774w0);
                }
            } else {
                a(hashtable, strNextToken, bool);
            }
        }
        if (z10) {
            Vector vector = new Vector();
            Vector vector2 = new Vector();
            Vector vector3 = new Vector();
            int i10 = 1;
            for (int i11 = 0; i11 < this.f87777q0.size(); i11++) {
                if (((Boolean) this.f87779s0.elementAt(i11)).booleanValue()) {
                    vector.insertElementAt(this.f87777q0.elementAt(i11), i10);
                    vector2.insertElementAt(this.f87778r0.elementAt(i11), i10);
                    vector3.insertElementAt(this.f87779s0.elementAt(i11), i10);
                    i10++;
                } else {
                    vector.insertElementAt(this.f87777q0.elementAt(i11), 0);
                    vector2.insertElementAt(this.f87778r0.elementAt(i11), 0);
                    vector3.insertElementAt(this.f87779s0.elementAt(i11), 0);
                    i10 = 1;
                }
            }
            this.f87777q0 = vector;
            this.f87778r0 = vector2;
            this.f87779s0 = vector3;
        }
    }
}
