package org.bouncycastle.asn1.x509;

import androidx.room.a;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes12.dex */
public interface X509ObjectIdentifiers {
    public static final ASN1ObjectIdentifier crlAccessMethod;
    public static final ASN1ObjectIdentifier id_ad;
    public static final ASN1ObjectIdentifier id_ad_caIssuers;
    public static final ASN1ObjectIdentifier id_ad_ocsp;
    public static final ASN1ObjectIdentifier id_ce;
    public static final ASN1ObjectIdentifier id_pe;
    public static final ASN1ObjectIdentifier id_pkix;
    public static final ASN1ObjectIdentifier ocspAccessMethod;
    public static final ASN1ObjectIdentifier commonName = a.e(ObjectIdentifiers.commonName);
    public static final ASN1ObjectIdentifier countryName = a.e("2.5.4.6");
    public static final ASN1ObjectIdentifier localityName = a.e("2.5.4.7");
    public static final ASN1ObjectIdentifier stateOrProvinceName = a.e("2.5.4.8");
    public static final ASN1ObjectIdentifier organization = a.e("2.5.4.10");
    public static final ASN1ObjectIdentifier organizationalUnitName = a.e(ObjectIdentifiers.organizationalUnitName);
    public static final ASN1ObjectIdentifier id_at_telephoneNumber = a.e("2.5.4.20");
    public static final ASN1ObjectIdentifier id_at_name = a.e("2.5.4.41");
    public static final ASN1ObjectIdentifier id_at_organizationIdentifier = a.e("2.5.4.97");
    public static final ASN1ObjectIdentifier id_SHA1 = a.e("1.3.14.3.2.26");
    public static final ASN1ObjectIdentifier ripemd160 = a.e("1.3.36.3.2.1");
    public static final ASN1ObjectIdentifier ripemd160WithRSAEncryption = a.e("1.3.36.3.3.1.2");
    public static final ASN1ObjectIdentifier id_ea_rsa = a.e("2.5.8.1.1");

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        id_pe = aSN1ObjectIdentifier.branch("1");
        id_ce = new ASN1ObjectIdentifier("2.5.29");
        ASN1ObjectIdentifier aSN1ObjectIdentifierBranch = aSN1ObjectIdentifier.branch("48");
        id_ad = aSN1ObjectIdentifierBranch;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern = aSN1ObjectIdentifierBranch.branch("2").intern();
        id_ad_caIssuers = aSN1ObjectIdentifierIntern;
        ASN1ObjectIdentifier aSN1ObjectIdentifierIntern2 = aSN1ObjectIdentifierBranch.branch("1").intern();
        id_ad_ocsp = aSN1ObjectIdentifierIntern2;
        ocspAccessMethod = aSN1ObjectIdentifierIntern2;
        crlAccessMethod = aSN1ObjectIdentifierIntern;
    }
}
