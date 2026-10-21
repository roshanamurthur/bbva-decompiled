package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.jcajce.PKIXCertStore;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509AttributeCertificate;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f90489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f90490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f90491c;

    static {
        Extension.certificatePolicies.getId();
        Extension.basicConstraints.getId();
        Extension.policyMappings.getId();
        Extension.subjectAlternativeName.getId();
        Extension.nameConstraints.getId();
        Extension.keyUsage.getId();
        Extension.inhibitAnyPolicy.getId();
        f90489a = Extension.issuingDistributionPoint.getId();
        Extension.deltaCRLIndicator.getId();
        Extension.policyConstraints.getId();
        Extension.freshestCRL.getId();
        Extension.cRLDistributionPoints.getId();
        f90490b = Extension.authorityKeyIdentifier.getId();
        f90491c = Extension.cRLNumber.getId();
    }

    public static LinkedHashSet a(PKIXCertStoreSelector pKIXCertStoreSelector, List list) throws AnnotatedException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    linkedHashSet.addAll(((Store) obj).getMatches(pKIXCertStoreSelector));
                } catch (StoreException e5) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e5);
                }
            } else {
                try {
                    linkedHashSet.addAll(PKIXCertStoreSelector.getCertificates(pKIXCertStoreSelector, (CertStore) obj));
                } catch (CertStoreException e7) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e7);
                }
            }
        }
        return linkedHashSet;
    }

    public static LinkedHashSet b(X509Certificate x509Certificate, List list, ArrayList arrayList) throws AnnotatedException {
        byte[] keyIdentifier;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(bh.a.f(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(f90490b);
                if (extensionValue != null && (keyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new DEROctetString(keyIdentifier).getEncoded());
                }
            } catch (Exception unused) {
            }
            PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(a(pKIXCertStoreSelectorBuild, list));
                arrayList2.addAll(a(pKIXCertStoreSelectorBuild, arrayList));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((X509Certificate) it.next());
                }
                return linkedHashSet;
            } catch (AnnotatedException e5) {
                throw new AnnotatedException("Issuer certificate cannot be searched.", e5);
            }
        } catch (Exception e7) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c A[PHI: r5
      0x003c: PHI (r5v5 org.bouncycastle.asn1.x500.X500Name) = 
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
      (r5v2 org.bouncycastle.asn1.x500.X500Name)
      (r5v2 org.bouncycastle.asn1.x500.X500Name)
      (r5v1 org.bouncycastle.asn1.x500.X500Name)
     binds: [B:13:0x0042, B:15:0x0048, B:17:0x004e, B:37:0x003c, B:21:0x006a, B:9:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    public static TrustAnchor c(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        X509CertSelector x509CertSelector = new X509CertSelector();
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        x509CertSelector.setSubject(issuerX500Principal);
        Iterator it = set.iterator();
        TrustAnchor trustAnchor = null;
        Exception exc = null;
        X500Name x500Name = null;
        PublicKey cAPublicKey = null;
        while (it.hasNext() && trustAnchor == null) {
            trustAnchor = (TrustAnchor) it.next();
            if (trustAnchor.getTrustedCert() != null) {
                if (x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    cAPublicKey = trustAnchor.getTrustedCert().getPublicKey();
                } else {
                    trustAnchor = null;
                }
            } else if (trustAnchor.getCA() == null || trustAnchor.getCAName() == null || trustAnchor.getCAPublicKey() == null) {
                trustAnchor = null;
            } else {
                if (x500Name == null) {
                    x500Name = X500Name.getInstance(issuerX500Principal.getEncoded());
                }
                try {
                    if (x500Name.equals(X500Name.getInstance(trustAnchor.getCA().getEncoded()))) {
                        cAPublicKey = trustAnchor.getCAPublicKey();
                    } else {
                        trustAnchor = null;
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            if (cAPublicKey != null) {
                if (str == null) {
                    try {
                        x509Certificate.verify(cAPublicKey);
                    } catch (Exception e5) {
                        exc = e5;
                        trustAnchor = null;
                        cAPublicKey = null;
                    }
                } else {
                    x509Certificate.verify(cAPublicKey, str);
                }
            }
        }
        if (trustAnchor != null || exc == null) {
            return trustAnchor;
        }
        throw new AnnotatedException("TrustAnchor found but certificate validation failed.", exc);
    }

    public static List<PKIXCertStore> d(byte[] bArr, Map<GeneralName, PKIXCertStore> map) throws CertificateParsingException {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        GeneralName[] names = GeneralNames.getInstance(ASN1OctetString.getInstance(bArr).getOctets()).getNames();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != names.length; i10++) {
            PKIXCertStore pKIXCertStore = map.get(names[i10]);
            if (pKIXCertStore != null) {
                arrayList.add(pKIXCertStore);
            }
        }
        return arrayList;
    }

    public static List<PKIXCRLStore> e(CRLDistPoint cRLDistPoint, Map<GeneralName, PKIXCRLStore> map) throws AnnotatedException {
        if (cRLDistPoint == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
            ArrayList arrayList = new ArrayList();
            for (DistributionPoint distributionPoint : distributionPoints) {
                DistributionPointName distributionPoint2 = distributionPoint.getDistributionPoint();
                if (distributionPoint2 != null && distributionPoint2.getType() == 0) {
                    for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        PKIXCRLStore pKIXCRLStore = map.get(generalName);
                        if (pKIXCRLStore != null) {
                            arrayList.add(pKIXCRLStore);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e5) {
            throw new AnnotatedException("Distribution points could not be read.", e5);
        }
    }

    public static AlgorithmIdentifier f(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return SubjectPublicKeyInfo.getInstance(new ASN1InputStream(publicKey.getEncoded()).readObject()).getAlgorithm();
        } catch (Exception e5) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e5);
        }
    }

    public static void g(DistributionPoint distributionPoint, HashSet hashSet, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList arrayList = new ArrayList();
        if (distributionPoint.getCRLIssuer() != null) {
            GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
            for (int i10 = 0; i10 < names.length; i10++) {
                if (names[i10].getTagNo() == 4) {
                    try {
                        arrayList.add(X500Name.getInstance(names[i10].getName().toASN1Primitive().getEncoded()));
                    } catch (IOException e5) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e5);
                    }
                }
            }
        } else {
            if (distributionPoint.getDistributionPoint() == null) {
                throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                x509CRLSelector.addIssuerName(((X500Name) it2.next()).getEncoded());
            } catch (IOException e7) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e7);
            }
        }
    }

    public static void h(Date date, X509CRL x509crl, Object obj, c cVar) throws AnnotatedException {
        X509CRLEntry revokedCertificate;
        ASN1Enumerated aSN1Enumerated;
        try {
            if (X509CRLObject.isIndirectCRL(x509crl)) {
                revokedCertificate = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber());
                if (revokedCertificate == null) {
                    return;
                }
                X500Principal certificateIssuer = revokedCertificate.getCertificateIssuer();
                if (!bh.a.b(obj).equals(certificateIssuer == null ? bh.a.c(x509crl) : bh.a.h(certificateIssuer))) {
                    return;
                }
            } else if (!bh.a.b(obj).equals(bh.a.c(x509crl)) || (revokedCertificate = x509crl.getRevokedCertificate(((X509Certificate) obj).getSerialNumber())) == null) {
                return;
            }
            if (!revokedCertificate.hasExtensions()) {
                aSN1Enumerated = null;
            } else {
                if (revokedCertificate.hasUnsupportedCriticalExtension()) {
                    throw new AnnotatedException("CRL entry has unsupported critical extensions.");
                }
                try {
                    aSN1Enumerated = ASN1Enumerated.getInstance(k(revokedCertificate, Extension.reasonCode.getId()));
                } catch (Exception e5) {
                    throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e5);
                }
            }
            int iIntValueExact = aSN1Enumerated == null ? 0 : aSN1Enumerated.intValueExact();
            if (date.getTime() >= revokedCertificate.getRevocationDate().getTime() || iIntValueExact == 0 || iIntValueExact == 1 || iIntValueExact == 2 || iIntValueExact == 10) {
                cVar.f90492a = iIntValueExact;
                cVar.f90493b = revokedCertificate.getRevocationDate();
            }
        } catch (CRLException e7) {
            throw new AnnotatedException("Failed check for indirect CRL.", e7);
        }
    }

    public static HashSet i(DistributionPoint distributionPoint, Object obj, Date date, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(bh.a.b(obj));
            g(distributionPoint, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            PKIXCRLStoreSelector<? extends CRL> pKIXCRLStoreSelectorBuild = new PKIXCRLStoreSelector.Builder(x509CRLSelector).setCompleteCRLEnabled(true).build();
            if (pKIXExtendedParameters.getDate() != null) {
                date = pKIXExtendedParameters.getDate();
            }
            HashSet hashSetA = f.a(pKIXCRLStoreSelectorBuild, date, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores());
            if (!hashSetA.isEmpty()) {
                return hashSetA;
            }
            if (obj instanceof X509AttributeCertificate) {
                throw new AnnotatedException("No CRLs found for issuer \"" + ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0] + "\"");
            }
            throw new AnnotatedException("No CRLs found for issuer \"" + RFC4519Style.INSTANCE.toString(bh.a.f((X509Certificate) obj)) + "\"");
        } catch (AnnotatedException e5) {
            throw new AnnotatedException("Could not get issuer information from distribution point.", e5);
        }
    }

    public static HashSet j(Date date, X509CRL x509crl, List list, List list2) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(bh.a.c(x509crl).getEncoded());
            try {
                ASN1Primitive aSN1PrimitiveK = k(x509crl, f90491c);
                BigInteger positiveValue = aSN1PrimitiveK != null ? ASN1Integer.getInstance(aSN1PrimitiveK).getPositiveValue() : null;
                try {
                    byte[] extensionValue = x509crl.getExtensionValue(f90489a);
                    x509CRLSelector.setMinCRLNumber(positiveValue != null ? positiveValue.add(BigInteger.valueOf(1L)) : null);
                    PKIXCRLStoreSelector.Builder builder = new PKIXCRLStoreSelector.Builder(x509CRLSelector);
                    builder.setIssuingDistributionPoint(extensionValue);
                    builder.setIssuingDistributionPointEnabled(true);
                    builder.setMaxBaseCRLNumber(positiveValue);
                    HashSet<X509CRL> hashSetA = f.a(builder.build(), date, list, list2);
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : hashSetA) {
                        Set<String> criticalExtensionOIDs = x509crl2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null && criticalExtensionOIDs.contains(g.f90502e)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e5) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e5);
                }
            } catch (Exception e7) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e7);
            }
        } catch (IOException e10) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e10);
        }
    }

    public static ASN1Primitive k(X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        try {
            return ASN1Primitive.fromByteArray(ASN1OctetString.getInstance(new ASN1InputStream(extensionValue).readObject()).getOctets());
        } catch (Exception e5) {
            throw new AnnotatedException(androidx.camera.core.processing.f.d("exception processing extension ", str), e5);
        }
    }

    public static PublicKey l(List list, int i10, BCJcaJceHelper bCJcaJceHelper) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i10)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i10++;
            if (i10 >= list.size()) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            PublicKey publicKey2 = ((X509Certificate) list.get(i10)).getPublicKey();
            if (!(publicKey2 instanceof DSAPublicKey)) {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
            dSAPublicKey = (DSAPublicKey) publicKey2;
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return bCJcaJceHelper.createKeyFactory("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage());
        }
    }

    public static final HashSet m(ASN1Sequence aSN1Sequence) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (aSN1Sequence == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ASN1OutputStream aSN1OutputStreamCreate = ASN1OutputStream.create(byteArrayOutputStream);
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            try {
                aSN1OutputStreamCreate.writeObject((ASN1Encodable) objects.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.reset();
            } catch (IOException e5) {
                throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e5);
            }
        }
        return hashSet;
    }

    public static Date n(PKIXExtendedParameters pKIXExtendedParameters, CertPath certPath, int i10) throws AnnotatedException {
        if (pKIXExtendedParameters.getValidityModel() != 1) {
            Date date = pKIXExtendedParameters.getDate();
            return date == null ? new Date() : date;
        }
        if (i10 <= 0) {
            Date date2 = pKIXExtendedParameters.getDate();
            return date2 == null ? new Date() : date2;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i11)).getExtensionValue(ISISMTTObjectIdentifiers.id_isismtt_at_dateOfCertGen.getId());
                ASN1GeneralizedTime aSN1GeneralizedTime = extensionValue != null ? ASN1GeneralizedTime.getInstance(ASN1Primitive.fromByteArray(extensionValue)) : null;
                if (aSN1GeneralizedTime != null) {
                    try {
                        return aSN1GeneralizedTime.getDate();
                    } catch (ParseException e5) {
                        throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", e5);
                    }
                }
            } catch (IOException unused) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            } catch (IllegalArgumentException unused2) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            }
        }
        return ((X509Certificate) certPath.getCertificates().get(i11)).getNotBefore();
    }

    public static PKIXPolicyNode o(PKIXPolicyNode pKIXPolicyNode, List[] listArr, PKIXPolicyNode pKIXPolicyNode2) {
        PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) pKIXPolicyNode2.getParent();
        if (pKIXPolicyNode == null) {
            return null;
        }
        if (pKIXPolicyNode3 != null) {
            pKIXPolicyNode3.removeChild(pKIXPolicyNode2);
            p(listArr, pKIXPolicyNode2);
            return pKIXPolicyNode;
        }
        for (int i10 = 0; i10 < listArr.length; i10++) {
            listArr[i10] = new ArrayList();
        }
        return null;
    }

    public static void p(List[] listArr, PKIXPolicyNode pKIXPolicyNode) {
        listArr[pKIXPolicyNode.getDepth()].remove(pKIXPolicyNode);
        if (pKIXPolicyNode.hasChildren()) {
            Iterator children = pKIXPolicyNode.getChildren();
            while (children.hasNext()) {
                p(listArr, (PKIXPolicyNode) children.next());
            }
        }
    }
}
