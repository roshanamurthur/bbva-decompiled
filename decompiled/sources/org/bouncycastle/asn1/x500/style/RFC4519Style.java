package org.bouncycastle.asn1.x500.style;

import androidx.autofill.HintConstants;
import androidx.room.a;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Hashtable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* JADX INFO: loaded from: classes12.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    public static final X500NameStyle INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f87548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f87549b;
    public static final ASN1ObjectIdentifier businessCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f87550c;

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f87551cn;

    /* JADX INFO: renamed from: dc, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f87552dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f87553l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f87554o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;

    /* JADX INFO: renamed from: sn, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f87555sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(f87548a);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(f87549b);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierE = a.e("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierE;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE2 = a.e("2.5.4.6");
        f87550c = aSN1ObjectIdentifierE2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE3 = a.e(ObjectIdentifiers.commonName);
        f87551cn = aSN1ObjectIdentifierE3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE4 = a.e("0.9.2342.19200300.100.1.25");
        f87552dc = aSN1ObjectIdentifierE4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE5 = a.e("2.5.4.13");
        description = aSN1ObjectIdentifierE5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE6 = a.e("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierE6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE7 = a.e("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierE7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE8 = a.e("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierE8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE9 = a.e("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierE9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE10 = a.e("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierE10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE11 = a.e("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierE11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE12 = a.e("2.5.4.42");
        givenName = aSN1ObjectIdentifierE12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE13 = a.e("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierE13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE14 = a.e("2.5.4.43");
        initials = aSN1ObjectIdentifierE14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE15 = a.e("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierE15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE16 = a.e("2.5.4.7");
        f87553l = aSN1ObjectIdentifierE16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE17 = a.e("2.5.4.31");
        member = aSN1ObjectIdentifierE17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE18 = a.e("2.5.4.41");
        name = aSN1ObjectIdentifierE18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE19 = a.e("2.5.4.10");
        f87554o = aSN1ObjectIdentifierE19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE20 = a.e(ObjectIdentifiers.organizationalUnitName);
        ou = aSN1ObjectIdentifierE20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE21 = a.e("2.5.4.32");
        owner = aSN1ObjectIdentifierE21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE22 = a.e("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierE22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE23 = a.e("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierE23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE24 = a.e("2.5.4.17");
        postalCode = aSN1ObjectIdentifierE24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE25 = a.e("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierE25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE26 = a.e("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierE26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE27 = a.e("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierE27;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE28 = a.e("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierE28;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE29 = a.e("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierE29;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE30 = a.e("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierE30;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE31 = a.e("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierE31;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE32 = a.e("2.5.4.4");
        f87555sn = aSN1ObjectIdentifierE32;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE33 = a.e("2.5.4.8");
        st = aSN1ObjectIdentifierE33;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE34 = a.e("2.5.4.9");
        street = aSN1ObjectIdentifierE34;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE35 = a.e("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierE35;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE36 = a.e("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierE36;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE37 = a.e("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierE37;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE38 = a.e("2.5.4.12");
        title = aSN1ObjectIdentifierE38;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE39 = a.e("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierE39;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE40 = a.e("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierE40;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE41 = a.e("2.5.4.35");
        userPassword = aSN1ObjectIdentifierE41;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE42 = a.e("2.5.4.24");
        x121Address = aSN1ObjectIdentifierE42;
        ASN1ObjectIdentifier aSN1ObjectIdentifierE43 = a.e("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierE43;
        Hashtable hashtable = new Hashtable();
        f87548a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f87549b = hashtable2;
        hashtable.put(aSN1ObjectIdentifierE, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierE2, "c");
        hashtable.put(aSN1ObjectIdentifierE3, "cn");
        hashtable.put(aSN1ObjectIdentifierE4, "dc");
        hashtable.put(aSN1ObjectIdentifierE5, "description");
        hashtable.put(aSN1ObjectIdentifierE6, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierE7, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierE8, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierE9, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierE10, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierE11, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierE12, "givenName");
        hashtable.put(aSN1ObjectIdentifierE13, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierE14, "initials");
        hashtable.put(aSN1ObjectIdentifierE15, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierE16, "l");
        hashtable.put(aSN1ObjectIdentifierE17, "member");
        hashtable.put(aSN1ObjectIdentifierE18, "name");
        hashtable.put(aSN1ObjectIdentifierE19, "o");
        hashtable.put(aSN1ObjectIdentifierE20, "ou");
        hashtable.put(aSN1ObjectIdentifierE21, "owner");
        hashtable.put(aSN1ObjectIdentifierE22, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierE23, HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS);
        hashtable.put(aSN1ObjectIdentifierE24, "postalCode");
        hashtable.put(aSN1ObjectIdentifierE25, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierE26, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierE27, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierE28, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierE29, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierE30, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierE31, DigipassManagerConstants.KEY_SERIAL_NUMBER);
        hashtable.put(aSN1ObjectIdentifierE32, "sn");
        hashtable.put(aSN1ObjectIdentifierE33, DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE);
        hashtable.put(aSN1ObjectIdentifierE34, "street");
        hashtable.put(aSN1ObjectIdentifierE35, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierE36, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierE37, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierE38, "title");
        hashtable.put(aSN1ObjectIdentifierE39, "uid");
        hashtable.put(aSN1ObjectIdentifierE40, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierE41, "userPassword");
        hashtable.put(aSN1ObjectIdentifierE42, "x121Address");
        hashtable.put(aSN1ObjectIdentifierE43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierE);
        hashtable2.put("c", aSN1ObjectIdentifierE2);
        hashtable2.put("cn", aSN1ObjectIdentifierE3);
        hashtable2.put("dc", aSN1ObjectIdentifierE4);
        hashtable2.put("description", aSN1ObjectIdentifierE5);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierE6);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierE7);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierE8);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierE9);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierE10);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierE11);
        hashtable2.put("givenname", aSN1ObjectIdentifierE12);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierE13);
        hashtable2.put("initials", aSN1ObjectIdentifierE14);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierE15);
        hashtable2.put("l", aSN1ObjectIdentifierE16);
        hashtable2.put("member", aSN1ObjectIdentifierE17);
        hashtable2.put("name", aSN1ObjectIdentifierE18);
        hashtable2.put("o", aSN1ObjectIdentifierE19);
        hashtable2.put("ou", aSN1ObjectIdentifierE20);
        hashtable2.put("owner", aSN1ObjectIdentifierE21);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierE22);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierE23);
        hashtable2.put("postalcode", aSN1ObjectIdentifierE24);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierE25);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierE26);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierE27);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierE28);
        hashtable2.put("searchguide", aSN1ObjectIdentifierE29);
        hashtable2.put("seealso", aSN1ObjectIdentifierE30);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierE31);
        hashtable2.put("sn", aSN1ObjectIdentifierE32);
        hashtable2.put(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE, aSN1ObjectIdentifierE33);
        hashtable2.put("street", aSN1ObjectIdentifierE34);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierE35);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierE36);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierE37);
        hashtable2.put("title", aSN1ObjectIdentifierE38);
        hashtable2.put("uid", aSN1ObjectIdentifierE39);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierE40);
        hashtable2.put("userpassword", aSN1ObjectIdentifierE41);
        hashtable2.put("x121address", aSN1ObjectIdentifierE42);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierE43);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) f87552dc)) {
            return new DERIA5String(str);
        }
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) f87550c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        int length = rdnArrRDNsFromString.length;
        RDN[] rdnArr = new RDN[length];
        for (int i10 = 0; i10 != rdnArrRDNsFromString.length; i10++) {
            rdnArr[(length - i10) - 1] = rdnArrRDNsFromString[i10];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) f87548a.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z10 = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append(AbstractJsonLexerKt.COMMA);
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
