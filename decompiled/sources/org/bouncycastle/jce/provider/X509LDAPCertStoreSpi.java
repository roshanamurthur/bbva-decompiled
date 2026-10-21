package org.bouncycastle.jce.provider;

import androidx.camera.camera2.internal.h0;
import androidx.webkit.ProxyConfig;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;

/* JADX INFO: loaded from: classes8.dex */
public class X509LDAPCertStoreSpi extends CertStoreSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509LDAPCertStoreParameters f90468a;

    public X509LDAPCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof X509LDAPCertStoreParameters) {
            this.f90468a = (X509LDAPCertStoreParameters) certStoreParameters;
            return;
        }
        throw new InvalidAlgorithmParameterException(X509LDAPCertStoreSpi.class.getName() + ": parameter must be a " + X509LDAPCertStoreParameters.class.getName() + " object\n" + certStoreParameters.toString());
    }

    public static String c(String str, String str2) {
        String strSubstring = str.substring(str2.length() + str.toLowerCase().indexOf(str2.toLowerCase()));
        int iIndexOf = strSubstring.indexOf(44);
        if (iIndexOf == -1) {
            iIndexOf = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf - 1) == '\\') {
            iIndexOf = strSubstring.indexOf(44, iIndexOf + 1);
            if (iIndexOf == -1) {
                iIndexOf = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith("\"")) {
            strSubstring3 = strSubstring3.substring(1);
        }
        return strSubstring3.endsWith("\"") ? androidx.databinding.e.c(strSubstring3, 1, 0) : strSubstring3;
    }

    public final HashSet a(X509CertSelector x509CertSelector, String[] strArr, String str, String str2) throws CertStoreException {
        String name;
        String string;
        HashSet hashSetD;
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f90468a;
        HashSet hashSet = new HashSet();
        try {
            if (x509CertSelector.getSubjectAsBytes() != null || x509CertSelector.getSubjectAsString() != null || x509CertSelector.getCertificate() != null) {
                if (x509CertSelector.getCertificate() != null) {
                    name = x509CertSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                    string = x509CertSelector.getCertificate().getSerialNumber().toString();
                } else {
                    name = x509CertSelector.getSubjectAsBytes() != null ? new X500Principal(x509CertSelector.getSubjectAsBytes()).getName("RFC1779") : x509CertSelector.getSubjectAsString();
                    string = null;
                }
                hashSet.addAll(d(str, ProxyConfig.MATCH_ALL_SCHEMES + c(name, str2) + ProxyConfig.MATCH_ALL_SCHEMES, strArr));
                if (string != null && x509LDAPCertStoreParameters.getSearchForSerialNumberIn() != null) {
                    hashSetD = d(x509LDAPCertStoreParameters.getSearchForSerialNumberIn(), ProxyConfig.MATCH_ALL_SCHEMES + string + ProxyConfig.MATCH_ALL_SCHEMES, strArr);
                }
                return hashSet;
            }
            hashSetD = d(str, ProxyConfig.MATCH_ALL_SCHEMES, strArr);
            hashSet.addAll(hashSetD);
            return hashSet;
        } catch (IOException e5) {
            throw new CertStoreException(ad.e.d("exception processing selector: ", e5));
        }
    }

    public final DirContext b() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", this.f90468a.getLdapURL());
        properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        properties.setProperty("java.naming.referral", "ignore");
        properties.setProperty("java.naming.security.authentication", "none");
        return new InitialDirContext(properties);
    }

    public final HashSet d(String str, String str2, String[] strArr) throws CertStoreException {
        String strB = androidx.camera.core.impl.utils.a.b(str, "=", str2);
        DirContext dirContextB = null;
        if (str == null) {
            strB = null;
        }
        HashSet hashSet = new HashSet();
        try {
            try {
                dirContextB = b();
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                for (String str3 : strArr) {
                    String[] strArr2 = {str3};
                    searchControls.setReturningAttributes(strArr2);
                    String str4 = "(&(" + strB + ")(" + strArr2[0] + "=*))";
                    if (strB == null) {
                        str4 = "(" + strArr2[0] + "=*)";
                    }
                    NamingEnumeration namingEnumerationSearch = dirContextB.search(this.f90468a.getBaseDN(), str4, searchControls);
                    while (namingEnumerationSearch.hasMoreElements()) {
                        NamingEnumeration all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                        while (all.hasMore()) {
                            hashSet.add(all.next());
                        }
                    }
                }
                if (dirContextB != null) {
                    try {
                        dirContextB.close();
                    } catch (Exception unused) {
                    }
                }
                return hashSet;
            } catch (Exception e5) {
                throw new CertStoreException("Error getting results from LDAP directory " + e5);
            }
        } catch (Throwable th2) {
            if (dirContextB != null) {
                try {
                    dirContextB.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        String certificateRevocationListIssuerAttributeName;
        String name;
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f90468a;
        String[] strArr = {x509LDAPCertStoreParameters.getCertificateRevocationListAttribute()};
        if (!(cRLSelector instanceof X509CRLSelector)) {
            throw new CertStoreException("selector is not a X509CRLSelector");
        }
        X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
        HashSet hashSet = new HashSet();
        String ldapCertificateRevocationListAttributeName = x509LDAPCertStoreParameters.getLdapCertificateRevocationListAttributeName();
        HashSet hashSet2 = new HashSet();
        if (x509CRLSelector.getIssuerNames() != null) {
            for (Object obj : x509CRLSelector.getIssuerNames()) {
                if (obj instanceof String) {
                    certificateRevocationListIssuerAttributeName = x509LDAPCertStoreParameters.getCertificateRevocationListIssuerAttributeName();
                    name = (String) obj;
                } else {
                    certificateRevocationListIssuerAttributeName = x509LDAPCertStoreParameters.getCertificateRevocationListIssuerAttributeName();
                    name = new X500Principal((byte[]) obj).getName("RFC1779");
                }
                hashSet2.addAll(d(ldapCertificateRevocationListAttributeName, h0.b(ProxyConfig.MATCH_ALL_SCHEMES, c(name, certificateRevocationListIssuerAttributeName), ProxyConfig.MATCH_ALL_SCHEMES), strArr));
            }
        } else {
            hashSet2.addAll(d(ldapCertificateRevocationListAttributeName, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        hashSet2.addAll(d(null, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        Iterator it = hashSet2.iterator();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509, BouncyCastleProvider.PROVIDER_NAME);
            while (it.hasNext()) {
                CRL crlGenerateCRL = certificateFactory.generateCRL(new ByteArrayInputStream((byte[]) it.next()));
                if (x509CRLSelector.match(crlGenerateCRL)) {
                    hashSet.add(crlGenerateCRL);
                }
            }
            return hashSet;
        } catch (Exception e5) {
            throw new CertStoreException(c2.b.d("CRL cannot be constructed from LDAP result ", e5));
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        if (!(certSelector instanceof X509CertSelector)) {
            throw new CertStoreException("selector is not a X509CertSelector");
        }
        X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
        HashSet hashSet = new HashSet();
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f90468a;
        HashSet<byte[]> hashSetA = a(x509CertSelector, new String[]{x509LDAPCertStoreParameters.getUserCertificateAttribute()}, x509LDAPCertStoreParameters.getLdapUserCertificateAttributeName(), x509LDAPCertStoreParameters.getUserCertificateSubjectAttributeName());
        String[] strArr = {x509LDAPCertStoreParameters.getCACertificateAttribute()};
        HashSet hashSetA2 = a(x509CertSelector, strArr, x509LDAPCertStoreParameters.getLdapCACertificateAttributeName(), x509LDAPCertStoreParameters.getCACertificateSubjectAttributeName());
        if (hashSetA2.isEmpty()) {
            hashSetA2.addAll(d(null, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        hashSetA.addAll(hashSetA2);
        String[] strArr2 = {x509LDAPCertStoreParameters.getCrossCertificateAttribute()};
        HashSet hashSetA3 = a(x509CertSelector, strArr2, x509LDAPCertStoreParameters.getLdapCrossCertificateAttributeName(), x509LDAPCertStoreParameters.getCrossCertificateSubjectAttributeName());
        if (hashSetA3.isEmpty()) {
            hashSetA3.addAll(d(null, ProxyConfig.MATCH_ALL_SCHEMES, strArr2));
        }
        hashSetA.addAll(hashSetA3);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509, BouncyCastleProvider.PROVIDER_NAME);
            for (byte[] bArr : hashSetA) {
                if (bArr != null && bArr.length != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bArr);
                    try {
                        CertificatePair certificatePair = CertificatePair.getInstance(new ASN1InputStream(bArr).readObject());
                        arrayList.clear();
                        if (certificatePair.getForward() != null) {
                            arrayList.add(certificatePair.getForward().getEncoded());
                        }
                        if (certificatePair.getReverse() != null) {
                            arrayList.add(certificatePair.getReverse().getEncoded());
                        }
                    } catch (IOException | IllegalArgumentException unused) {
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream((byte[]) it.next()));
                            if (x509CertSelector.match(certificateGenerateCertificate)) {
                                hashSet.add(certificateGenerateCertificate);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            return hashSet;
        } catch (Exception e5) {
            throw new CertStoreException(c2.b.d("certificate cannot be constructed from LDAP result: ", e5));
        }
    }
}
