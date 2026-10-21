package org.bouncycastle.asn1.x500.style;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.a;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Hashtable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* JADX INFO: loaded from: classes12.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f87546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f87547b;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(f87546a);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(f87547b);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierE = a.e("2.5.4.6");
        C = aSN1ObjectIdentifierE;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE2 = a.e("2.5.4.10");
        O = aSN1ObjectIdentifierE2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE3 = a.e(ObjectIdentifiers.organizationalUnitName);
        OU = aSN1ObjectIdentifierE3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE4 = a.e("2.5.4.12");
        T = aSN1ObjectIdentifierE4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE5 = a.e(ObjectIdentifiers.commonName);
        CN = aSN1ObjectIdentifierE5;
        SN = a.e("2.5.4.5");
        ASN1ObjectIdentifier aSN1ObjectIdentifierE6 = a.e("2.5.4.9");
        STREET = aSN1ObjectIdentifierE6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE7 = a.e("2.5.4.5");
        SERIALNUMBER = aSN1ObjectIdentifierE7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE8 = a.e("2.5.4.7");
        L = aSN1ObjectIdentifierE8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE9 = a.e("2.5.4.8");
        ST = aSN1ObjectIdentifierE9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE10 = a.e("2.5.4.4");
        SURNAME = aSN1ObjectIdentifierE10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE11 = a.e("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifierE11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE12 = a.e("2.5.4.43");
        INITIALS = aSN1ObjectIdentifierE12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE13 = a.e("2.5.4.44");
        GENERATION = aSN1ObjectIdentifierE13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE14 = a.e("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifierE14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE15 = a.e("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifierE15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE16 = a.e("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifierE16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE17 = a.e("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifierE17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE18 = a.e("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifierE18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE19 = a.e("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = aSN1ObjectIdentifierE19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE20 = a.e("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = aSN1ObjectIdentifierE20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE21 = a.e("1.3.6.1.5.5.7.9.3");
        GENDER = aSN1ObjectIdentifierE21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE22 = a.e("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifierE22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE23 = a.e("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifierE23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE24 = a.e("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifierE24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE25 = a.e("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifierE25;
        DMD_NAME = a.e("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier8;
        Hashtable hashtable = new Hashtable();
        f87546a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f87547b = hashtable2;
        hashtable.put(aSN1ObjectIdentifierE, "C");
        hashtable.put(aSN1ObjectIdentifierE2, "O");
        hashtable.put(aSN1ObjectIdentifierE4, ExifInterface.GPS_DIRECTION_TRUE);
        hashtable.put(aSN1ObjectIdentifierE3, "OU");
        hashtable.put(aSN1ObjectIdentifierE5, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS);
        hashtable.put(aSN1ObjectIdentifierE8, "L");
        hashtable.put(aSN1ObjectIdentifierE9, "ST");
        hashtable.put(aSN1ObjectIdentifierE7, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, ExifInterface.LONGITUDE_EAST);
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, "UID");
        hashtable.put(aSN1ObjectIdentifierE6, "STREET");
        hashtable.put(aSN1ObjectIdentifierE10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifierE11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifierE12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifierE13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifierE14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifierE17, "DN");
        hashtable.put(aSN1ObjectIdentifierE18, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifierE25, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifierE24, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifierE22, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifierE23, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifierE21, "Gender");
        hashtable.put(aSN1ObjectIdentifierE20, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifierE19, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifierE16, "PostalCode");
        hashtable.put(aSN1ObjectIdentifierE15, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable2.put("c", aSN1ObjectIdentifierE);
        hashtable2.put("o", aSN1ObjectIdentifierE2);
        hashtable2.put("t", aSN1ObjectIdentifierE4);
        hashtable2.put("ou", aSN1ObjectIdentifierE3);
        hashtable2.put("cn", aSN1ObjectIdentifierE5);
        hashtable2.put("l", aSN1ObjectIdentifierE8);
        hashtable2.put(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, aSN1ObjectIdentifierE9);
        hashtable2.put("sn", aSN1ObjectIdentifierE10);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierE7);
        hashtable2.put("street", aSN1ObjectIdentifierE6);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", aSN1ObjectIdentifierE10);
        hashtable2.put("givenname", aSN1ObjectIdentifierE11);
        hashtable2.put("initials", aSN1ObjectIdentifierE12);
        hashtable2.put("generation", aSN1ObjectIdentifierE13);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", aSN1ObjectIdentifierE14);
        hashtable2.put("dn", aSN1ObjectIdentifierE17);
        hashtable2.put("pseudonym", aSN1ObjectIdentifierE18);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierE25);
        hashtable2.put("nameatbirth", aSN1ObjectIdentifierE24);
        hashtable2.put("countryofcitizenship", aSN1ObjectIdentifierE22);
        hashtable2.put("countryofresidence", aSN1ObjectIdentifierE23);
        hashtable2.put("gender", aSN1ObjectIdentifierE21);
        hashtable2.put("placeofbirth", aSN1ObjectIdentifierE20);
        hashtable2.put("dateofbirth", aSN1ObjectIdentifierE19);
        hashtable2.put("postalcode", aSN1ObjectIdentifierE16);
        hashtable2.put("businesscategory", aSN1ObjectIdentifierE15);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable2.put("name", aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) {
            return new DERIA5String(str);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH)) {
            return new ASN1GeneralizedTime(str);
        }
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SN) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) f87546a.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append(AbstractJsonLexerKt.COMMA);
            }
            IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
