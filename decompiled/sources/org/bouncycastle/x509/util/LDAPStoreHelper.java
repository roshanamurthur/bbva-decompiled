package org.bouncycastle.x509.util;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.a;
import androidx.camera.core.impl.utils.c;
import androidx.camera.core.processing.f;
import androidx.databinding.e;
import androidx.webkit.ProxyConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.CertificatePair;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.jce.provider.X509AttrCertParser;
import org.bouncycastle.jce.provider.X509CRLParser;
import org.bouncycastle.jce.provider.X509CertPairParser;
import org.bouncycastle.jce.provider.X509CertParser;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CRLStoreSelector;
import org.bouncycastle.x509.X509CertPairStoreSelector;
import org.bouncycastle.x509.X509CertStoreSelector;
import org.bouncycastle.x509.X509CertificatePair;

/* JADX INFO: loaded from: classes13.dex */
public class LDAPStoreHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509LDAPCertStoreParameters f91751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f91752b = new HashMap(32);

    public LDAPStoreHelper(X509LDAPCertStoreParameters x509LDAPCertStoreParameters) {
        this.f91751a = x509LDAPCertStoreParameters;
    }

    public static HashSet f(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, ArrayList arrayList) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        X509AttrCertParser x509AttrCertParser = new X509AttrCertParser();
        while (it.hasNext()) {
            try {
                x509AttrCertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) x509AttrCertParser.engineRead();
                if (x509AttributeCertStoreSelector.match(x509AttributeCertificate)) {
                    hashSet.add(x509AttributeCertificate);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    public static HashSet g(ArrayList arrayList, X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        HashSet hashSet = new HashSet();
        X509CRLParser x509CRLParser = new X509CRLParser();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                x509CRLParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509CRL x509crl = (X509CRL) x509CRLParser.engineRead();
                if (x509CRLStoreSelector.match((Object) x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    public static HashSet h(X509CertStoreSelector x509CertStoreSelector, ArrayList arrayList) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        X509CertParser x509CertParser = new X509CertParser();
        while (it.hasNext()) {
            try {
                x509CertParser.engineInit(new ByteArrayInputStream((byte[]) it.next()));
                X509Certificate x509Certificate = (X509Certificate) x509CertParser.engineRead();
                if (x509CertStoreSelector.match((Object) x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    public static HashSet i(ArrayList arrayList, X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        X509CertificatePair x509CertificatePair;
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            try {
                try {
                    X509CertPairParser x509CertPairParser = new X509CertPairParser();
                    x509CertPairParser.engineInit(new ByteArrayInputStream((byte[]) arrayList.get(i10)));
                    x509CertificatePair = (X509CertificatePair) x509CertPairParser.engineRead();
                } catch (IOException | CertificateParsingException unused) {
                }
            } catch (StreamParsingException unused2) {
                int i11 = i10 + 1;
                i10 = i11;
                x509CertificatePair = new X509CertificatePair(new CertificatePair(Certificate.getInstance(new ASN1InputStream((byte[]) arrayList.get(i10)).readObject()), Certificate.getInstance(new ASN1InputStream((byte[]) arrayList.get(i11)).readObject())));
            }
            if (x509CertPairStoreSelector.match(x509CertificatePair)) {
                hashSet.add(x509CertificatePair);
            }
            i10++;
        }
        return hashSet;
    }

    public static String k(X509CertStoreSelector x509CertStoreSelector) {
        try {
            byte[] subjectAsBytes = x509CertStoreSelector.getSubjectAsBytes();
            if (subjectAsBytes != null) {
                return new X500Principal(subjectAsBytes).getName("RFC1779");
            }
            return null;
        } catch (IOException e5) {
            throw new StoreException(a.d(e5, new StringBuilder("exception processing name: ")), e5);
        }
    }

    public static String l(String str, String str2) {
        int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase() + "=");
        if (iIndexOf == -1) {
            return "";
        }
        String strSubstring = str.substring(str2.length() + iIndexOf);
        int iIndexOf2 = strSubstring.indexOf(44);
        if (iIndexOf2 == -1) {
            iIndexOf2 = strSubstring.length();
        }
        while (strSubstring.charAt(iIndexOf2 - 1) == '\\') {
            iIndexOf2 = strSubstring.indexOf(44, iIndexOf2 + 1);
            if (iIndexOf2 == -1) {
                iIndexOf2 = strSubstring.length();
            }
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf2);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(61) + 1);
        if (strSubstring3.charAt(0) == ' ') {
            strSubstring3 = strSubstring3.substring(1);
        }
        if (strSubstring3.startsWith("\"")) {
            strSubstring3 = strSubstring3.substring(1);
        }
        return strSubstring3.endsWith("\"") ? e.c(strSubstring3, 1, 0) : strSubstring3;
    }

    public final synchronized void a(String str, ArrayList arrayList) {
        try {
            Date date = new Date(System.currentTimeMillis());
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(date);
            arrayList2.add(arrayList);
            if (!this.f91752b.containsKey(str) && this.f91752b.size() >= 32) {
                long time = date.getTime();
                Object key = null;
                for (Map.Entry entry : this.f91752b.entrySet()) {
                    long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                    if (time2 < time) {
                        key = entry.getKey();
                        time = time2;
                    }
                }
                this.f91752b.remove(key);
            }
            HashMap map = this.f91752b;
            map.put(str, arrayList2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    public final ArrayList b(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        Principal[] entityNames;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        String name = null;
        if (x509AttributeCertStoreSelector.getHolder() == null) {
            entityNames = null;
        } else {
            if (x509AttributeCertStoreSelector.getHolder().getSerialNumber() != null) {
                hashSet.add(x509AttributeCertStoreSelector.getHolder().getSerialNumber().toString());
            }
            if (x509AttributeCertStoreSelector.getHolder().getEntityNames() != null) {
                entityNames = x509AttributeCertStoreSelector.getHolder().getEntityNames();
            } else {
                entityNames = null;
            }
        }
        if (x509AttributeCertStoreSelector.getAttributeCert() != null) {
            if (x509AttributeCertStoreSelector.getAttributeCert().getHolder().getEntityNames() != null) {
                entityNames = x509AttributeCertStoreSelector.getAttributeCert().getHolder().getEntityNames();
            }
            hashSet.add(x509AttributeCertStoreSelector.getAttributeCert().getSerialNumber().toString());
        }
        if (entityNames != null) {
            Principal principal = entityNames[0];
            name = principal instanceof X500Principal ? ((X500Principal) principal).getName("RFC1779") : principal.getName();
        }
        if (x509AttributeCertStoreSelector.getSerialNumber() != null) {
            hashSet.add(x509AttributeCertStoreSelector.getSerialNumber().toString());
        }
        if (name != null) {
            for (String str : strArr3) {
                arrayList.addAll(m(strArr2, h0.b(ProxyConfig.MATCH_ALL_SCHEMES, l(name, str), ProxyConfig.MATCH_ALL_SCHEMES), strArr));
            }
        }
        if (hashSet.size() > 0) {
            X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
            if (x509LDAPCertStoreParameters.getSearchForSerialNumberIn() != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m(x509LDAPCertStoreParameters.getSearchForSerialNumberIn().split("\\s+"), (String) it.next(), strArr));
                }
            }
        }
        if (hashSet.size() == 0 && name == null) {
            arrayList.addAll(m(strArr2, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        return arrayList;
    }

    public final ArrayList c(X509CRLStoreSelector x509CRLStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (x509CRLStoreSelector.getIssuers() != null) {
            hashSet.addAll(x509CRLStoreSelector.getIssuers());
        }
        if (x509CRLStoreSelector.getCertificateChecking() != null) {
            hashSet.add(x509CRLStoreSelector.getCertificateChecking().getIssuerX500Principal());
        }
        if (x509CRLStoreSelector.getAttrCertificateChecking() != null) {
            for (Principal principal : x509CRLStoreSelector.getAttrCertificateChecking().getIssuer().getPrincipals()) {
                if (principal instanceof X500Principal) {
                    hashSet.add(principal);
                }
            }
        }
        Iterator it = hashSet.iterator();
        String name = null;
        while (it.hasNext()) {
            name = ((X500Principal) it.next()).getName("RFC1779");
            for (String str : strArr3) {
                arrayList.addAll(m(strArr2, h0.b(ProxyConfig.MATCH_ALL_SCHEMES, l(name, str), ProxyConfig.MATCH_ALL_SCHEMES), strArr));
            }
        }
        if (name == null) {
            arrayList.addAll(m(strArr2, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        return arrayList;
    }

    public final ArrayList d(X509CertStoreSelector x509CertStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        String strK = k(x509CertStoreSelector);
        String string = x509CertStoreSelector.getSerialNumber() != null ? x509CertStoreSelector.getSerialNumber().toString() : null;
        if (x509CertStoreSelector.getCertificate() != null) {
            strK = x509CertStoreSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
            string = x509CertStoreSelector.getCertificate().getSerialNumber().toString();
        }
        if (strK != null) {
            for (String str : strArr3) {
                arrayList.addAll(m(strArr2, h0.b(ProxyConfig.MATCH_ALL_SCHEMES, l(strK, str), ProxyConfig.MATCH_ALL_SCHEMES), strArr));
            }
        }
        if (string != null) {
            X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
            if (x509LDAPCertStoreParameters.getSearchForSerialNumberIn() != null) {
                arrayList.addAll(m(x509LDAPCertStoreParameters.getSearchForSerialNumberIn().split("\\s+"), string, strArr));
            }
        }
        if (string == null && strK == null) {
            arrayList.addAll(m(strArr2, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        return arrayList;
    }

    public final DirContext e() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", this.f91751a.getLdapURL());
        properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        properties.setProperty("java.naming.referral", "ignore");
        properties.setProperty("java.naming.security.authentication", "none");
        return new InitialDirContext(properties);
    }

    public Collection getAACertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getAACertificateAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapAACertificateAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getAACertificateSubjectAttributeName().split("\\s+");
        HashSet hashSetF = f(x509AttributeCertStoreSelector, b(x509AttributeCertStoreSelector, strArrSplit, strArrSplit2, strArrSplit3));
        if (hashSetF.size() == 0) {
            hashSetF.addAll(f(x509AttributeCertStoreSelector, b(new X509AttributeCertStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3)));
        }
        return hashSetF;
    }

    public Collection getAttributeAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getAttributeAuthorityRevocationListAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapAttributeAuthorityRevocationListAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getAttributeAuthorityRevocationListIssuerAttributeName().split("\\s+");
        HashSet hashSetG = g(c(x509CRLStoreSelector, strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector);
        if (hashSetG.size() == 0) {
            hashSetG.addAll(g(c(new X509CRLStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector));
        }
        return hashSetG;
    }

    public Collection getAttributeCertificateAttributes(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getAttributeCertificateAttributeAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapAttributeCertificateAttributeAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getAttributeCertificateAttributeSubjectAttributeName().split("\\s+");
        HashSet hashSetF = f(x509AttributeCertStoreSelector, b(x509AttributeCertStoreSelector, strArrSplit, strArrSplit2, strArrSplit3));
        if (hashSetF.size() == 0) {
            hashSetF.addAll(f(x509AttributeCertStoreSelector, b(new X509AttributeCertStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3)));
        }
        return hashSetF;
    }

    public Collection getAttributeCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getAttributeCertificateRevocationListAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapAttributeCertificateRevocationListAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getAttributeCertificateRevocationListIssuerAttributeName().split("\\s+");
        HashSet hashSetG = g(c(x509CRLStoreSelector, strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector);
        if (hashSetG.size() == 0) {
            hashSetG.addAll(g(c(new X509CRLStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector));
        }
        return hashSetG;
    }

    public Collection getAttributeDescriptorCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getAttributeDescriptorCertificateAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapAttributeDescriptorCertificateAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getAttributeDescriptorCertificateSubjectAttributeName().split("\\s+");
        HashSet hashSetF = f(x509AttributeCertStoreSelector, b(x509AttributeCertStoreSelector, strArrSplit, strArrSplit2, strArrSplit3));
        if (hashSetF.size() == 0) {
            hashSetF.addAll(f(x509AttributeCertStoreSelector, b(new X509AttributeCertStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3)));
        }
        return hashSetF;
    }

    public Collection getAuthorityRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getAuthorityRevocationListAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapAuthorityRevocationListAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getAuthorityRevocationListIssuerAttributeName().split("\\s+");
        HashSet hashSetG = g(c(x509CRLStoreSelector, strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector);
        if (hashSetG.size() == 0) {
            hashSetG.addAll(g(c(new X509CRLStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector));
        }
        return hashSetG;
    }

    public Collection getCACertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getCACertificateAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapCACertificateAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getCACertificateSubjectAttributeName().split("\\s+");
        HashSet hashSetH = h(x509CertStoreSelector, d(x509CertStoreSelector, strArrSplit, strArrSplit2, strArrSplit3));
        if (hashSetH.size() == 0) {
            hashSetH.addAll(h(x509CertStoreSelector, d(new X509CertStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3)));
        }
        return hashSetH;
    }

    public Collection getCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getCertificateRevocationListAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapCertificateRevocationListAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getCertificateRevocationListIssuerAttributeName().split("\\s+");
        HashSet hashSetG = g(c(x509CRLStoreSelector, strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector);
        if (hashSetG.size() == 0) {
            hashSetG.addAll(g(c(new X509CRLStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector));
        }
        return hashSetG;
    }

    public Collection getCrossCertificatePairs(X509CertPairStoreSelector x509CertPairStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getCrossCertificateAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapCrossCertificateAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getCrossCertificateSubjectAttributeName().split("\\s+");
        HashSet hashSetI = i(j(x509CertPairStoreSelector, strArrSplit, strArrSplit2, strArrSplit3), x509CertPairStoreSelector);
        if (hashSetI.size() == 0) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            X509CertPairStoreSelector x509CertPairStoreSelector2 = new X509CertPairStoreSelector();
            x509CertPairStoreSelector2.setForwardSelector(x509CertStoreSelector);
            x509CertPairStoreSelector2.setReverseSelector(x509CertStoreSelector);
            hashSetI.addAll(i(j(x509CertPairStoreSelector2, strArrSplit, strArrSplit2, strArrSplit3), x509CertPairStoreSelector));
        }
        return hashSetI;
    }

    public Collection getDeltaCertificateRevocationLists(X509CRLStoreSelector x509CRLStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getDeltaRevocationListAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapDeltaRevocationListAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getDeltaRevocationListIssuerAttributeName().split("\\s+");
        HashSet hashSetG = g(c(x509CRLStoreSelector, strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector);
        if (hashSetG.size() == 0) {
            hashSetG.addAll(g(c(new X509CRLStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3), x509CRLStoreSelector));
        }
        return hashSetG;
    }

    public Collection getUserCertificates(X509CertStoreSelector x509CertStoreSelector) throws StoreException {
        X509LDAPCertStoreParameters x509LDAPCertStoreParameters = this.f91751a;
        String[] strArrSplit = x509LDAPCertStoreParameters.getUserCertificateAttribute().split("\\s+");
        String[] strArrSplit2 = x509LDAPCertStoreParameters.getLdapUserCertificateAttributeName().split("\\s+");
        String[] strArrSplit3 = x509LDAPCertStoreParameters.getUserCertificateSubjectAttributeName().split("\\s+");
        HashSet hashSetH = h(x509CertStoreSelector, d(x509CertStoreSelector, strArrSplit, strArrSplit2, strArrSplit3));
        if (hashSetH.size() == 0) {
            hashSetH.addAll(h(x509CertStoreSelector, d(new X509CertStoreSelector(), strArrSplit, strArrSplit2, strArrSplit3)));
        }
        return hashSetH;
    }

    public final ArrayList j(X509CertPairStoreSelector x509CertPairStoreSelector, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        String strK = x509CertPairStoreSelector.getForwardSelector() != null ? k(x509CertPairStoreSelector.getForwardSelector()) : null;
        if (x509CertPairStoreSelector.getCertPair() != null && x509CertPairStoreSelector.getCertPair().getForward() != null) {
            strK = x509CertPairStoreSelector.getCertPair().getForward().getSubjectX500Principal().getName("RFC1779");
        }
        if (strK != null) {
            for (String str : strArr3) {
                arrayList.addAll(m(strArr2, h0.b(ProxyConfig.MATCH_ALL_SCHEMES, l(strK, str), ProxyConfig.MATCH_ALL_SCHEMES), strArr));
            }
        }
        if (strK == null) {
            arrayList.addAll(m(strArr2, ProxyConfig.MATCH_ALL_SCHEMES, strArr));
        }
        return arrayList;
    }

    public final List m(String[] strArr, String str, String[] strArr2) throws StoreException {
        String strB;
        DirContext dirContextE = null;
        if (strArr == null) {
            strB = null;
        } else {
            if (str.equals("**")) {
                str = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            String strB2 = "";
            for (String str2 : strArr) {
                strB2 = c.b(f.e(strB2, "("), str2, "=", str, ")");
            }
            strB = h0.b("(|", strB2, ")");
        }
        String strF = "";
        for (String str3 : strArr2) {
            strF = d.f(f.e(strF, "("), str3, "=*)");
        }
        String strB3 = h0.b("(|", strF, ")");
        String strG = u.g("(&", strB, "", strB3, ")");
        if (strB != null) {
            strB3 = strG;
        }
        List list = (List) this.f91752b.get(strB3);
        List list2 = (list == null || ((Date) list.get(0)).getTime() < System.currentTimeMillis() - 60000) ? null : (List) list.get(1);
        if (list2 != null) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                dirContextE = e();
                SearchControls searchControls = new SearchControls();
                searchControls.setSearchScope(2);
                searchControls.setCountLimit(0L);
                searchControls.setReturningAttributes(strArr2);
                NamingEnumeration namingEnumerationSearch = dirContextE.search(this.f91751a.getBaseDN(), strB3, searchControls);
                while (namingEnumerationSearch.hasMoreElements()) {
                    NamingEnumeration all = ((Attribute) ((SearchResult) namingEnumerationSearch.next()).getAttributes().getAll().next()).getAll();
                    while (all.hasMore()) {
                        arrayList.add(all.next());
                    }
                }
                a(strB3, arrayList);
            } catch (NamingException unused) {
                if (dirContextE != null) {
                }
                return arrayList;
            } catch (Throwable th2) {
                if (dirContextE != null) {
                    try {
                        dirContextE.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th2;
            }
            dirContextE.close();
        } catch (Exception unused3) {
        }
        return arrayList;
    }
}
