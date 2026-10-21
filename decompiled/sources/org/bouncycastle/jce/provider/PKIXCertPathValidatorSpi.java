package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.BCStyle;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.GeneralSubtree;
import org.bouncycastle.asn1.x509.NameConstraints;
import org.bouncycastle.asn1.x509.PolicyInformation;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes8.dex */
public class PKIXCertPathValidatorSpi extends CertPathValidatorSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f90435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90436b;

    public PKIXCertPathValidatorSpi() {
        this(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(X509Certificate x509Certificate) throws AnnotatedException {
        if (!(x509Certificate instanceof BCX509Certificate)) {
            try {
                TBSCertificate.getInstance(x509Certificate.getTBSCertificate());
                return;
            } catch (IllegalArgumentException e5) {
                throw new AnnotatedException(e5.getMessage());
            } catch (CertificateEncodingException e7) {
                throw new AnnotatedException("unable to process TBSCertificate", e7);
            }
        }
        try {
            if (((BCX509Certificate) x509Certificate).getTBSCertificateNative() != null) {
                return;
            }
            e = null;
            throw new AnnotatedException("unable to process TBSCertificate", e);
        } catch (RuntimeException e10) {
            e = e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r2v125, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v133, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v135, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r6v75, types: [java.util.List] */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters baseParameters;
        X500Name x500NameH;
        PublicKey cAPublicKey;
        HashSet hashSet;
        String str;
        PublicKey publicKey;
        HashSet hashSet2;
        int i10;
        BCJcaJceHelper bCJcaJceHelper;
        int i11;
        X509Certificate x509Certificate;
        PKIXNameConstraintValidator pKIXNameConstraintValidator;
        TrustAnchor trustAnchor;
        HashSet hashSet3;
        X509Certificate x509Certificate2;
        HashSet hashSet4;
        BigInteger pathLenConstraint;
        int iIntValue;
        int iIntValueExact;
        HashSet hashSetM;
        String id;
        TrustAnchor trustAnchor2;
        int i12;
        X509Certificate x509Certificate3;
        int i13;
        String str2 = "Basic constraints extension cannot be decoded.";
        String str3 = "Policy constraints extension cannot be decoded.";
        String str4 = "Policy mappings extension could not be decoded.";
        String str5 = "Could not read certificate policies extension from certificate.";
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
            }
            baseParameters = builder.build();
        } else if (certPathParameters instanceof PKIXExtendedBuilderParameters) {
            baseParameters = ((PKIXExtendedBuilderParameters) certPathParameters).getBaseParameters();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedParameters)) {
                throw new InvalidAlgorithmParameterException(androidx.datastore.preferences.protobuf.e.e(PKIXParameters.class, new StringBuilder("Parameters must be a "), " instance."));
            }
            baseParameters = (PKIXExtendedParameters) certPathParameters;
        }
        if (baseParameters.getTrustAnchors() == null) {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
        List<? extends Certificate> certificates = certPath.getCertificates();
        int size = certificates.size();
        if (certificates.isEmpty()) {
            throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
        }
        Set initialPolicies = baseParameters.getInitialPolicies();
        try {
            TrustAnchor trustAnchorC = b.c((X509Certificate) certificates.get(certificates.size() - 1), baseParameters.getTrustAnchors(), baseParameters.getSigProvider());
            if (trustAnchorC != null) {
                a(trustAnchorC.getTrustedCert());
                PKIXExtendedParameters pKIXExtendedParametersBuild = new PKIXExtendedParameters.Builder(baseParameters).setTrustAnchor(trustAnchorC).build();
                int i14 = size + 1;
                ArrayList[] arrayListArr = new ArrayList[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    arrayListArr[i15] = new ArrayList();
                }
                HashSet hashSet5 = new HashSet();
                hashSet5.add("2.5.29.32.0");
                PKIXPolicyNode pKIXPolicyNode = new PKIXPolicyNode(new ArrayList(), 0, hashSet5, null, new HashSet(), "2.5.29.32.0", false);
                int i16 = i14;
                arrayListArr[0].add(pKIXPolicyNode);
                PKIXNameConstraintValidator pKIXNameConstraintValidator2 = new PKIXNameConstraintValidator();
                HashSet hashSet6 = new HashSet();
                int i17 = pKIXExtendedParametersBuild.isExplicitPolicyRequired() ? 0 : i16;
                int i18 = pKIXExtendedParametersBuild.isAnyPolicyInhibited() ? 0 : i16;
                if (pKIXExtendedParametersBuild.isPolicyMappingInhibited()) {
                    i16 = 0;
                }
                X509Certificate trustedCert = trustAnchorC.getTrustedCert();
                try {
                    if (trustedCert != null) {
                        x500NameH = bh.a.g(trustedCert);
                        cAPublicKey = trustedCert.getPublicKey();
                    } else {
                        x500NameH = bh.a.h(trustAnchorC.getCA());
                        cAPublicKey = trustAnchorC.getCAPublicKey();
                    }
                    try {
                        AlgorithmIdentifier algorithmIdentifierF = b.f(cAPublicKey);
                        algorithmIdentifierF.getAlgorithm();
                        algorithmIdentifierF.getParameters();
                        if (pKIXExtendedParametersBuild.getTargetConstraints() != null && !pKIXExtendedParametersBuild.getTargetConstraints().match((Certificate) certificates.get(0))) {
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        }
                        List certPathCheckers = pKIXExtendedParametersBuild.getCertPathCheckers();
                        Iterator it = certPathCheckers.iterator();
                        while (it.hasNext()) {
                            ((PKIXCertPathChecker) it.next()).init(false);
                            certPathCheckers = certPathCheckers;
                        }
                        List list = certPathCheckers;
                        int size2 = certificates.size() - 1;
                        int i19 = size;
                        int i20 = i17;
                        int i21 = i18;
                        X509Certificate x509Certificate4 = trustedCert;
                        X500Name x500Name = x500NameH;
                        PublicKey publicKey2 = cAPublicKey;
                        int i22 = i16;
                        X509Certificate x509Certificate5 = null;
                        while (size2 >= 0) {
                            Set set = initialPolicies;
                            X509Certificate x509Certificate6 = (X509Certificate) certificates.get(size2);
                            int i23 = size - size2;
                            boolean z10 = size2 == certificates.size() + (-1);
                            try {
                                a(x509Certificate6);
                                List<? extends Certificate> list2 = certificates;
                                BCJcaJceHelper bCJcaJceHelper2 = this.f90435a;
                                String str6 = g.f90498a;
                                ArrayList[] arrayListArr2 = arrayListArr;
                                String str7 = str5;
                                List<? extends Certificate> certificates2 = certPath.getCertificates();
                                String str8 = str4;
                                X509Certificate x509Certificate7 = (X509Certificate) certificates2.get(size2);
                                if (z10) {
                                    str = str3;
                                    publicKey = publicKey2;
                                } else {
                                    try {
                                        String sigProvider = pKIXExtendedParametersBuild.getSigProvider();
                                        str = str3;
                                        publicKey = publicKey2;
                                        if (sigProvider == null) {
                                            x509Certificate7.verify(publicKey);
                                        } else {
                                            x509Certificate7.verify(publicKey, sigProvider);
                                        }
                                    } catch (GeneralSecurityException e5) {
                                        throw new ExtCertPathValidatorException("Could not validate certificate signature.", e5, certPath, size2);
                                    }
                                }
                                try {
                                    x509Certificate7.checkValidity(b.n(pKIXExtendedParametersBuild, certPath, size2));
                                    if (pKIXExtendedParametersBuild.isRevocationEnabled()) {
                                        try {
                                            hashSet2 = hashSet6;
                                            g.b(pKIXExtendedParametersBuild, x509Certificate7, b.n(pKIXExtendedParametersBuild, certPath, size2), x509Certificate4, publicKey, certificates2, bCJcaJceHelper2);
                                        } catch (AnnotatedException e7) {
                                            throw new ExtCertPathValidatorException(e7.getMessage(), e7.getCause() != null ? e7.getCause() : e7, certPath, size2);
                                        }
                                    } else {
                                        hashSet2 = hashSet6;
                                    }
                                    X500Name x500NameF = bh.a.f(x509Certificate7);
                                    X500Name x500Name2 = x500Name;
                                    if (!x500NameF.equals(x500Name2)) {
                                        throw new ExtCertPathValidatorException("IssuerName(" + x500NameF + ") does not match SubjectName(" + x500Name2 + ") of signing certificate.", null, certPath, size2);
                                    }
                                    List<? extends Certificate> certificates3 = certPath.getCertificates();
                                    X509Certificate x509Certificate8 = (X509Certificate) certificates3.get(size2);
                                    int size3 = certificates3.size();
                                    int i24 = size3 - size2;
                                    PublicKey publicKey3 = publicKey;
                                    boolean zEquals = x509Certificate8.getSubjectDN().equals(x509Certificate8.getIssuerDN());
                                    boolean z11 = this.f90436b;
                                    if (!zEquals || (i24 >= size3 && !z11)) {
                                        try {
                                            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bh.a.g(x509Certificate8).getEncoded());
                                            try {
                                                pKIXNameConstraintValidator2.checkPermittedDN(aSN1Sequence);
                                                pKIXNameConstraintValidator2.checkExcludedDN(aSN1Sequence);
                                                try {
                                                    GeneralNames generalNames = GeneralNames.getInstance(b.k(x509Certificate8, g.f90506i));
                                                    RDN[] rDNs = X500Name.getInstance(aSN1Sequence).getRDNs(BCStyle.EmailAddress);
                                                    int i25 = 0;
                                                    while (i25 != rDNs.length) {
                                                        RDN[] rdnArr = rDNs;
                                                        GeneralName generalName = new GeneralName(1, ((ASN1String) rDNs[i25].getFirst().getValue()).getString());
                                                        try {
                                                            pKIXNameConstraintValidator2.checkPermitted(generalName);
                                                            pKIXNameConstraintValidator2.checkExcluded(generalName);
                                                            i25++;
                                                            rDNs = rdnArr;
                                                        } catch (PKIXNameConstraintValidatorException e10) {
                                                            throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e10, certPath, size2);
                                                        }
                                                    }
                                                    if (generalNames != null) {
                                                        try {
                                                            GeneralName[] names = generalNames.getNames();
                                                            for (int i26 = 0; i26 < names.length; i26++) {
                                                                try {
                                                                    pKIXNameConstraintValidator2.checkPermitted(names[i26]);
                                                                    pKIXNameConstraintValidator2.checkExcluded(names[i26]);
                                                                } catch (PKIXNameConstraintValidatorException e11) {
                                                                    throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e11, certPath, size2);
                                                                }
                                                            }
                                                        } catch (Exception e12) {
                                                            throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e12, certPath, size2);
                                                        }
                                                    }
                                                } catch (Exception e13) {
                                                    throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e13, certPath, size2);
                                                }
                                            } catch (PKIXNameConstraintValidatorException e14) {
                                                throw new CertPathValidatorException("Subtree check for certificate subject failed.", e14, certPath, size2);
                                            }
                                        } catch (Exception e15) {
                                            throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e15, certPath, size2);
                                        }
                                    }
                                    String str9 = g.f90498a;
                                    List<? extends Certificate> certificates4 = certPath.getCertificates();
                                    X509Certificate x509Certificate9 = (X509Certificate) certificates4.get(size2);
                                    int size4 = certificates4.size();
                                    int i27 = size4 - size2;
                                    try {
                                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(b.k(x509Certificate9, str9));
                                        if (aSN1Sequence2 == null || pKIXPolicyNode == null) {
                                            i10 = i23;
                                            bCJcaJceHelper = bCJcaJceHelper2;
                                            i11 = size;
                                            x509Certificate = x509Certificate6;
                                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                            trustAnchor = trustAnchorC;
                                            hashSet3 = hashSet2;
                                            pKIXPolicyNode = null;
                                        } else {
                                            Enumeration objects = aSN1Sequence2.getObjects();
                                            bCJcaJceHelper = bCJcaJceHelper2;
                                            HashSet hashSet7 = new HashSet();
                                            while (objects.hasMoreElements()) {
                                                PolicyInformation policyInformation = PolicyInformation.getInstance(objects.nextElement());
                                                ASN1ObjectIdentifier policyIdentifier = policyInformation.getPolicyIdentifier();
                                                PKIXNameConstraintValidator pKIXNameConstraintValidator3 = pKIXNameConstraintValidator2;
                                                hashSet7.add(policyIdentifier.getId());
                                                if ("2.5.29.32.0".equals(policyIdentifier.getId())) {
                                                    i12 = i23;
                                                    i13 = size;
                                                    x509Certificate3 = x509Certificate6;
                                                    trustAnchor2 = trustAnchorC;
                                                } else {
                                                    try {
                                                        HashSet hashSetM2 = b.m(policyInformation.getPolicyQualifiers());
                                                        int i28 = i27 - 1;
                                                        trustAnchor2 = trustAnchorC;
                                                        i12 = i23;
                                                        x509Certificate3 = x509Certificate6;
                                                        int i29 = 0;
                                                        ?? r13 = arrayListArr2[i28];
                                                        while (true) {
                                                            if (i29 >= r13.size()) {
                                                                i13 = size;
                                                                ?? r3 = arrayListArr2[i28];
                                                                for (int i30 = 0; i30 < r3.size(); i30++) {
                                                                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) r3.get(i30);
                                                                    if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                                                                        HashSet hashSet8 = new HashSet();
                                                                        hashSet8.add(policyIdentifier.getId());
                                                                        PKIXPolicyNode pKIXPolicyNode3 = new PKIXPolicyNode(new ArrayList(), i27, hashSet8, pKIXPolicyNode2, hashSetM2, policyIdentifier.getId(), false);
                                                                        pKIXPolicyNode2.addChild(pKIXPolicyNode3);
                                                                        arrayListArr2[i27].add(pKIXPolicyNode3);
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            PKIXPolicyNode pKIXPolicyNode4 = (PKIXPolicyNode) r13.get(i29);
                                                            ?? r36 = r13;
                                                            i13 = size;
                                                            if (pKIXPolicyNode4.getExpectedPolicies().contains(policyIdentifier.getId())) {
                                                                HashSet hashSet9 = new HashSet();
                                                                hashSet9.add(policyIdentifier.getId());
                                                                PKIXPolicyNode pKIXPolicyNode5 = new PKIXPolicyNode(new ArrayList(), i27, hashSet9, pKIXPolicyNode4, hashSetM2, policyIdentifier.getId(), false);
                                                                pKIXPolicyNode4.addChild(pKIXPolicyNode5);
                                                                arrayListArr2[i27].add(pKIXPolicyNode5);
                                                                break;
                                                            }
                                                            i29++;
                                                            r13 = r36;
                                                            size = i13;
                                                        }
                                                    } catch (CertPathValidatorException e16) {
                                                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e16, certPath, size2);
                                                    }
                                                }
                                                trustAnchorC = trustAnchor2;
                                                pKIXNameConstraintValidator2 = pKIXNameConstraintValidator3;
                                                x509Certificate6 = x509Certificate3;
                                                i23 = i12;
                                                size = i13;
                                            }
                                            i10 = i23;
                                            i11 = size;
                                            x509Certificate = x509Certificate6;
                                            pKIXNameConstraintValidator = pKIXNameConstraintValidator2;
                                            trustAnchor = trustAnchorC;
                                            hashSet3 = hashSet2;
                                            if (hashSet2.isEmpty() || hashSet3.contains("2.5.29.32.0")) {
                                                hashSet3.clear();
                                                hashSet3.addAll(hashSet7);
                                            } else {
                                                HashSet hashSet10 = new HashSet();
                                                for (Object obj : hashSet3) {
                                                    if (hashSet7.contains(obj)) {
                                                        hashSet10.add(obj);
                                                    }
                                                }
                                                hashSet3.clear();
                                                hashSet3.addAll(hashSet10);
                                            }
                                            if (i21 > 0 || ((i27 < size4 || z11) && x509Certificate9.getSubjectDN().equals(x509Certificate9.getIssuerDN()))) {
                                                Enumeration objects2 = aSN1Sequence2.getObjects();
                                                while (objects2.hasMoreElements()) {
                                                    PolicyInformation policyInformation2 = PolicyInformation.getInstance(objects2.nextElement());
                                                    if ("2.5.29.32.0".equals(policyInformation2.getPolicyIdentifier().getId())) {
                                                        HashSet hashSetM3 = b.m(policyInformation2.getPolicyQualifiers());
                                                        int i31 = 0;
                                                        ?? r4 = arrayListArr2[i27 - 1];
                                                        while (i31 < r4.size()) {
                                                            PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) r4.get(i31);
                                                            for (Object obj2 : pKIXPolicyNode6.getExpectedPolicies()) {
                                                                if (obj2 instanceof String) {
                                                                    id = (String) obj2;
                                                                } else if (obj2 instanceof ASN1ObjectIdentifier) {
                                                                    id = ((ASN1ObjectIdentifier) obj2).getId();
                                                                }
                                                                Iterator children = pKIXPolicyNode6.getChildren();
                                                                boolean z12 = false;
                                                                ?? r10 = r4;
                                                                while (children.hasNext()) {
                                                                    ?? r29 = r10;
                                                                    if (id.equals(((PKIXPolicyNode) children.next()).getValidPolicy())) {
                                                                        z12 = true;
                                                                    }
                                                                    r10 = r29;
                                                                }
                                                                ?? r210 = r10;
                                                                if (!z12) {
                                                                    HashSet hashSet11 = new HashSet();
                                                                    hashSet11.add(id);
                                                                    PKIXPolicyNode pKIXPolicyNode7 = new PKIXPolicyNode(new ArrayList(), i27, hashSet11, pKIXPolicyNode6, hashSetM3, id, false);
                                                                    pKIXPolicyNode6.addChild(pKIXPolicyNode7);
                                                                    arrayListArr2[i27].add(pKIXPolicyNode7);
                                                                }
                                                                r4 = r210;
                                                            }
                                                            i31++;
                                                            r4 = r4;
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                            for (int i32 = i27 - 1; i32 >= 0; i32--) {
                                                ?? r11 = arrayListArr2[i32];
                                                PKIXPolicyNode pKIXPolicyNodeO = pKIXPolicyNode;
                                                for (int i33 = 0; i33 < r11.size(); i33++) {
                                                    PKIXPolicyNode pKIXPolicyNode8 = (PKIXPolicyNode) r11.get(i33);
                                                    if (!pKIXPolicyNode8.hasChildren() && (pKIXPolicyNodeO = b.o(pKIXPolicyNodeO, arrayListArr2, pKIXPolicyNode8)) == null) {
                                                        break;
                                                    }
                                                }
                                                pKIXPolicyNode = pKIXPolicyNodeO;
                                            }
                                            Set<String> criticalExtensionOIDs = x509Certificate9.getCriticalExtensionOIDs();
                                            if (criticalExtensionOIDs != null) {
                                                boolean zContains = criticalExtensionOIDs.contains(str9);
                                                ?? r12 = arrayListArr2[i27];
                                                for (int i34 = 0; i34 < r12.size(); i34++) {
                                                    ((PKIXPolicyNode) r12.get(i34)).setCritical(zContains);
                                                }
                                            }
                                        }
                                        try {
                                            if (ASN1Sequence.getInstance(b.k((X509Certificate) certPath.getCertificates().get(size2), g.f90498a)) == null) {
                                                pKIXPolicyNode = null;
                                            }
                                            if (i20 <= 0 && pKIXPolicyNode == null) {
                                                throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, size2);
                                            }
                                            int i35 = i10;
                                            int i36 = i11;
                                            if (i35 != i36) {
                                                if (x509Certificate != null && x509Certificate.getVersion() == 1) {
                                                    if (i35 == 1) {
                                                        x509Certificate2 = x509Certificate;
                                                        if (x509Certificate2.equals(trustAnchor.getTrustedCert())) {
                                                        }
                                                    }
                                                    throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, size2);
                                                }
                                                x509Certificate2 = x509Certificate;
                                                try {
                                                    ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(b.k((X509Certificate) certPath.getCertificates().get(size2), g.f90499b));
                                                    if (aSN1Sequence3 != null) {
                                                        for (int i37 = 0; i37 < aSN1Sequence3.size(); i37++) {
                                                            try {
                                                                ASN1Sequence aSN1Sequence4 = ASN1Sequence.getInstance(aSN1Sequence3.getObjectAt(i37));
                                                                ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence4.getObjectAt(0));
                                                                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = ASN1ObjectIdentifier.getInstance(aSN1Sequence4.getObjectAt(1));
                                                                if ("2.5.29.32.0".equals(aSN1ObjectIdentifier.getId())) {
                                                                    throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, size2);
                                                                }
                                                                if ("2.5.29.32.0".equals(aSN1ObjectIdentifier2.getId())) {
                                                                    throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy", null, certPath, size2);
                                                                }
                                                            } catch (Exception e17) {
                                                                throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e17, certPath, size2);
                                                            }
                                                        }
                                                    }
                                                    String str10 = g.f90498a;
                                                    List<? extends Certificate> certificates5 = certPath.getCertificates();
                                                    X509Certificate x509Certificate10 = (X509Certificate) certificates5.get(size2);
                                                    int size5 = certificates5.size() - size2;
                                                    try {
                                                        ASN1Sequence aSN1Sequence5 = ASN1Sequence.getInstance(b.k(x509Certificate10, g.f90499b));
                                                        if (aSN1Sequence5 != null) {
                                                            HashMap map = new HashMap();
                                                            HashSet hashSet12 = new HashSet();
                                                            int i38 = 0;
                                                            while (i38 < aSN1Sequence5.size()) {
                                                                ASN1Sequence aSN1Sequence6 = (ASN1Sequence) aSN1Sequence5.getObjectAt(i38);
                                                                String id2 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(0)).getId();
                                                                int i39 = i36;
                                                                String id3 = ((ASN1ObjectIdentifier) aSN1Sequence6.getObjectAt(1)).getId();
                                                                if (map.containsKey(id2)) {
                                                                    ((Set) map.get(id2)).add(id3);
                                                                } else {
                                                                    HashSet hashSet13 = new HashSet();
                                                                    hashSet13.add(id3);
                                                                    map.put(id2, hashSet13);
                                                                    hashSet12.add(id2);
                                                                }
                                                                i38++;
                                                                i36 = i39;
                                                            }
                                                            i36 = i36;
                                                            Iterator it2 = hashSet12.iterator();
                                                            while (it2.hasNext()) {
                                                                String str11 = (String) it2.next();
                                                                if (i22 > 0) {
                                                                    Iterator it3 = arrayListArr2[size5].iterator();
                                                                    while (true) {
                                                                        if (!it3.hasNext()) {
                                                                            for (PKIXPolicyNode pKIXPolicyNode9 : arrayListArr2[size5]) {
                                                                                if ("2.5.29.32.0".equals(pKIXPolicyNode9.getValidPolicy())) {
                                                                                    try {
                                                                                        Enumeration objects3 = ((ASN1Sequence) b.k(x509Certificate10, str10)).getObjects();
                                                                                        while (true) {
                                                                                            if (!objects3.hasMoreElements()) {
                                                                                                hashSetM = null;
                                                                                                break;
                                                                                            }
                                                                                            try {
                                                                                                PolicyInformation policyInformation3 = PolicyInformation.getInstance(objects3.nextElement());
                                                                                                if ("2.5.29.32.0".equals(policyInformation3.getPolicyIdentifier().getId())) {
                                                                                                    try {
                                                                                                        hashSetM = b.m(policyInformation3.getPolicyQualifiers());
                                                                                                        break;
                                                                                                    } catch (CertPathValidatorException e18) {
                                                                                                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", e18, certPath, size2);
                                                                                                    }
                                                                                                }
                                                                                            } catch (Exception e19) {
                                                                                                throw new CertPathValidatorException("Policy information could not be decoded.", e19, certPath, size2);
                                                                                            }
                                                                                        }
                                                                                        boolean zContains2 = x509Certificate10.getCriticalExtensionOIDs() != null ? x509Certificate10.getCriticalExtensionOIDs().contains(str10) : false;
                                                                                        PKIXPolicyNode pKIXPolicyNode10 = (PKIXPolicyNode) pKIXPolicyNode9.getParent();
                                                                                        if (!"2.5.29.32.0".equals(pKIXPolicyNode10.getValidPolicy())) {
                                                                                            break;
                                                                                        }
                                                                                        PKIXPolicyNode pKIXPolicyNode11 = new PKIXPolicyNode(new ArrayList(), size5, (Set) map.get(str11), pKIXPolicyNode10, hashSetM, str11, zContains2);
                                                                                        pKIXPolicyNode10.addChild(pKIXPolicyNode11);
                                                                                        arrayListArr2[size5].add(pKIXPolicyNode11);
                                                                                        break;
                                                                                    } catch (AnnotatedException e20) {
                                                                                        throw new ExtCertPathValidatorException("Certificate policies extension could not be decoded.", e20, certPath, size2);
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        PKIXPolicyNode pKIXPolicyNode12 = (PKIXPolicyNode) it3.next();
                                                                        if (pKIXPolicyNode12.getValidPolicy().equals(str11)) {
                                                                            pKIXPolicyNode12.expectedPolicies = (Set) map.get(str11);
                                                                            break;
                                                                        }
                                                                    }
                                                                } else if (i22 <= 0) {
                                                                    Iterator it4 = arrayListArr2[size5].iterator();
                                                                    while (it4.hasNext()) {
                                                                        PKIXPolicyNode pKIXPolicyNode13 = (PKIXPolicyNode) it4.next();
                                                                        if (pKIXPolicyNode13.getValidPolicy().equals(str11)) {
                                                                            ((PKIXPolicyNode) pKIXPolicyNode13.getParent()).removeChild(pKIXPolicyNode13);
                                                                            it4.remove();
                                                                            int i40 = size5 - 1;
                                                                            while (i40 >= 0) {
                                                                                ?? r14 = arrayListArr2[i40];
                                                                                Iterator it5 = it2;
                                                                                String str12 = str10;
                                                                                PKIXPolicyNode pKIXPolicyNode14 = pKIXPolicyNode;
                                                                                int i41 = 0;
                                                                                while (true) {
                                                                                    if (i41 >= r14.size()) {
                                                                                        pKIXPolicyNode = pKIXPolicyNode14;
                                                                                        break;
                                                                                    }
                                                                                    PKIXPolicyNode pKIXPolicyNode15 = (PKIXPolicyNode) r14.get(i41);
                                                                                    if (!pKIXPolicyNode15.hasChildren()) {
                                                                                        PKIXPolicyNode pKIXPolicyNodeO2 = b.o(pKIXPolicyNode14, arrayListArr2, pKIXPolicyNode15);
                                                                                        if (pKIXPolicyNodeO2 == null) {
                                                                                            pKIXPolicyNode = pKIXPolicyNodeO2;
                                                                                            break;
                                                                                        }
                                                                                        pKIXPolicyNode14 = pKIXPolicyNodeO2;
                                                                                    }
                                                                                    i41++;
                                                                                }
                                                                                i40--;
                                                                                it2 = it5;
                                                                                str10 = str12;
                                                                            }
                                                                        }
                                                                        it2 = it2;
                                                                        str10 = str10;
                                                                    }
                                                                }
                                                                it2 = it2;
                                                                str10 = str10;
                                                            }
                                                        } else {
                                                            i36 = i36;
                                                        }
                                                        try {
                                                            ASN1Sequence aSN1Sequence7 = ASN1Sequence.getInstance(b.k((X509Certificate) certPath.getCertificates().get(size2), g.f90507j));
                                                            NameConstraints nameConstraints = aSN1Sequence7 != null ? NameConstraints.getInstance(aSN1Sequence7) : null;
                                                            if (nameConstraints != null) {
                                                                GeneralSubtree[] permittedSubtrees = nameConstraints.getPermittedSubtrees();
                                                                if (permittedSubtrees != null) {
                                                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator;
                                                                    try {
                                                                        pKIXNameConstraintValidator.intersectPermittedSubtree(permittedSubtrees);
                                                                    } catch (Exception e21) {
                                                                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e21, certPath, size2);
                                                                    }
                                                                } else {
                                                                    pKIXNameConstraintValidator = pKIXNameConstraintValidator;
                                                                }
                                                                GeneralSubtree[] excludedSubtrees = nameConstraints.getExcludedSubtrees();
                                                                if (excludedSubtrees != null) {
                                                                    for (int i42 = 0; i42 != excludedSubtrees.length; i42++) {
                                                                        try {
                                                                            pKIXNameConstraintValidator.addExcludedSubtree(excludedSubtrees[i42]);
                                                                        } catch (Exception e22) {
                                                                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e22, certPath, size2);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                pKIXNameConstraintValidator = pKIXNameConstraintValidator;
                                                            }
                                                            X509Certificate x509Certificate11 = (X509Certificate) certPath.getCertificates().get(size2);
                                                            if (!x509Certificate11.getSubjectDN().equals(x509Certificate11.getIssuerDN()) && i20 != 0) {
                                                                i20--;
                                                            }
                                                            int i43 = i20;
                                                            X509Certificate x509Certificate12 = (X509Certificate) certPath.getCertificates().get(size2);
                                                            if (!x509Certificate12.getSubjectDN().equals(x509Certificate12.getIssuerDN()) && i22 != 0) {
                                                                i22--;
                                                            }
                                                            int i44 = i22;
                                                            X509Certificate x509Certificate13 = (X509Certificate) certPath.getCertificates().get(size2);
                                                            if (!x509Certificate13.getSubjectDN().equals(x509Certificate13.getIssuerDN()) && i21 != 0) {
                                                                i21--;
                                                            }
                                                            int i45 = i21;
                                                            try {
                                                                ASN1Sequence aSN1Sequence8 = ASN1Sequence.getInstance(b.k((X509Certificate) certPath.getCertificates().get(size2), g.f90503f));
                                                                if (aSN1Sequence8 != null) {
                                                                    Enumeration objects4 = aSN1Sequence8.getObjects();
                                                                    while (objects4.hasMoreElements()) {
                                                                        try {
                                                                            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(objects4.nextElement());
                                                                            if (aSN1TaggedObject.getTagNo() == 0) {
                                                                                int iIntValueExact2 = ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact();
                                                                                if (iIntValueExact2 >= i43) {
                                                                                    break;
                                                                                }
                                                                                i43 = iIntValueExact2;
                                                                                break;
                                                                            }
                                                                        } catch (IllegalArgumentException e23) {
                                                                            throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e23, certPath, size2);
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    ASN1Sequence aSN1Sequence9 = ASN1Sequence.getInstance(b.k((X509Certificate) certPath.getCertificates().get(size2), g.f90503f));
                                                                    if (aSN1Sequence9 == null) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    Enumeration objects5 = aSN1Sequence9.getObjects();
                                                                    while (true) {
                                                                        if (!objects5.hasMoreElements()) {
                                                                            break;
                                                                        }
                                                                        try {
                                                                            ASN1TaggedObject aSN1TaggedObject2 = ASN1TaggedObject.getInstance(objects5.nextElement());
                                                                            if (aSN1TaggedObject2.getTagNo() == 1) {
                                                                                int iIntValueExact3 = ASN1Integer.getInstance(aSN1TaggedObject2, false).intValueExact();
                                                                                if (iIntValueExact3 >= i44) {
                                                                                    break;
                                                                                }
                                                                                i44 = iIntValueExact3;
                                                                                break;
                                                                            }
                                                                        } catch (IllegalArgumentException e24) {
                                                                            throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e24, certPath, size2);
                                                                        }
                                                                    }
                                                                    X509Certificate x509Certificate14 = (X509Certificate) certPath.getCertificates().get(size2);
                                                                    try {
                                                                        String str13 = g.f90500c;
                                                                        ASN1Integer aSN1Integer = ASN1Integer.getInstance(b.k(x509Certificate14, str13));
                                                                        if (aSN1Integer != null && (iIntValueExact = aSN1Integer.intValueExact()) < i45) {
                                                                            i45 = iIntValueExact;
                                                                        }
                                                                        X509Certificate x509Certificate15 = (X509Certificate) certPath.getCertificates().get(size2);
                                                                        try {
                                                                            String str14 = g.f90504g;
                                                                            BasicConstraints basicConstraints = BasicConstraints.getInstance(b.k(x509Certificate15, str14));
                                                                            if (basicConstraints == null) {
                                                                                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints", null, certPath, size2);
                                                                            }
                                                                            if (!basicConstraints.isCA()) {
                                                                                throw new CertPathValidatorException("Not a CA certificate", null, certPath, size2);
                                                                            }
                                                                            X509Certificate x509Certificate16 = (X509Certificate) certPath.getCertificates().get(size2);
                                                                            if (!x509Certificate16.getSubjectDN().equals(x509Certificate16.getIssuerDN())) {
                                                                                if (i19 <= 0) {
                                                                                    throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, size2);
                                                                                }
                                                                                i19--;
                                                                            }
                                                                            int i46 = i19;
                                                                            try {
                                                                                BasicConstraints basicConstraints2 = BasicConstraints.getInstance(b.k((X509Certificate) certPath.getCertificates().get(size2), str14));
                                                                                i19 = (basicConstraints2 == null || (pathLenConstraint = basicConstraints2.getPathLenConstraint()) == null || (iIntValue = pathLenConstraint.intValue()) >= i46) ? i46 : iIntValue;
                                                                                boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(size2)).getKeyUsage();
                                                                                if (keyUsage != null && !keyUsage[5]) {
                                                                                    throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, size2);
                                                                                }
                                                                                Set<String> criticalExtensionOIDs2 = x509Certificate2.getCriticalExtensionOIDs();
                                                                                if (criticalExtensionOIDs2 != null) {
                                                                                    hashSet4 = new HashSet(criticalExtensionOIDs2);
                                                                                    hashSet4.remove(g.f90509l);
                                                                                    hashSet4.remove(g.f90498a);
                                                                                    hashSet4.remove(g.f90499b);
                                                                                    hashSet4.remove(str13);
                                                                                    hashSet4.remove(g.f90501d);
                                                                                    hashSet4.remove(g.f90502e);
                                                                                    hashSet4.remove(g.f90503f);
                                                                                    hashSet4.remove(str14);
                                                                                    hashSet4.remove(g.f90506i);
                                                                                    hashSet4.remove(g.f90507j);
                                                                                } else {
                                                                                    hashSet4 = new HashSet();
                                                                                }
                                                                                X509Certificate x509Certificate17 = (X509Certificate) certPath.getCertificates().get(size2);
                                                                                Iterator it6 = list.iterator();
                                                                                while (it6.hasNext()) {
                                                                                    try {
                                                                                        ((PKIXCertPathChecker) it6.next()).check(x509Certificate17, hashSet4);
                                                                                    } catch (CertPathValidatorException e25) {
                                                                                        throw new CertPathValidatorException(e25.getMessage(), e25.getCause(), certPath, size2);
                                                                                    }
                                                                                }
                                                                                if (!hashSet4.isEmpty()) {
                                                                                    throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + hashSet4, null, certPath, size2);
                                                                                }
                                                                                X500Name x500NameG = bh.a.g(x509Certificate2);
                                                                                try {
                                                                                    PublicKey publicKeyL = b.l(certPath.getCertificates(), size2, bCJcaJceHelper);
                                                                                    AlgorithmIdentifier algorithmIdentifierF2 = b.f(publicKeyL);
                                                                                    algorithmIdentifierF2.getAlgorithm();
                                                                                    algorithmIdentifierF2.getParameters();
                                                                                    i20 = i43;
                                                                                    i22 = i44;
                                                                                    x509Certificate4 = x509Certificate2;
                                                                                    i21 = i45;
                                                                                    x500Name = x500NameG;
                                                                                    publicKey3 = publicKeyL;
                                                                                    str2 = str2;
                                                                                    str8 = str8;
                                                                                    str = str;
                                                                                } catch (CertPathValidatorException e26) {
                                                                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e26, certPath, size2);
                                                                                }
                                                                            } catch (Exception e27) {
                                                                                throw new ExtCertPathValidatorException(str2, e27, certPath, size2);
                                                                            }
                                                                        } catch (Exception e28) {
                                                                            throw new ExtCertPathValidatorException(str2, e28, certPath, size2);
                                                                        }
                                                                    } catch (Exception e29) {
                                                                        throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e29, certPath, size2);
                                                                    }
                                                                } catch (Exception e30) {
                                                                    throw new ExtCertPathValidatorException(str, e30, certPath, size2);
                                                                }
                                                            } catch (Exception e31) {
                                                                throw new ExtCertPathValidatorException(str, e31, certPath, size2);
                                                            }
                                                        } catch (Exception e32) {
                                                            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e32, certPath, size2);
                                                        }
                                                    } catch (AnnotatedException e33) {
                                                        throw new ExtCertPathValidatorException(str8, e33, certPath, size2);
                                                    }
                                                } catch (AnnotatedException e34) {
                                                    throw new ExtCertPathValidatorException(str8, e34, certPath, size2);
                                                }
                                                size2--;
                                                arrayListArr = arrayListArr2;
                                                pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                                str4 = str8;
                                                hashSet6 = hashSet3;
                                                trustAnchorC = trustAnchor;
                                                initialPolicies = set;
                                                pKIXExtendedParametersBuild = pKIXExtendedParametersBuild;
                                                certificates = list2;
                                                size = i36;
                                                publicKey2 = publicKey3;
                                                x509Certificate5 = x509Certificate2;
                                                str3 = str;
                                                str5 = str7;
                                            } else {
                                                x509Certificate2 = x509Certificate;
                                            }
                                            x500Name = x500Name2;
                                            size2--;
                                            arrayListArr = arrayListArr2;
                                            pKIXNameConstraintValidator2 = pKIXNameConstraintValidator;
                                            str4 = str8;
                                            hashSet6 = hashSet3;
                                            trustAnchorC = trustAnchor;
                                            initialPolicies = set;
                                            pKIXExtendedParametersBuild = pKIXExtendedParametersBuild;
                                            certificates = list2;
                                            size = i36;
                                            publicKey2 = publicKey3;
                                            x509Certificate5 = x509Certificate2;
                                            str3 = str;
                                            str5 = str7;
                                        } catch (AnnotatedException e35) {
                                            throw new ExtCertPathValidatorException(str7, e35, certPath, size2);
                                        }
                                    } catch (AnnotatedException e36) {
                                        throw new ExtCertPathValidatorException(str7, e36, certPath, size2);
                                    }
                                } catch (CertificateExpiredException e37) {
                                    throw new ExtCertPathValidatorException("Could not validate certificate: " + e37.getMessage(), e37, certPath, size2);
                                } catch (CertificateNotYetValidException e38) {
                                    throw new ExtCertPathValidatorException("Could not validate certificate: " + e38.getMessage(), e38, certPath, size2);
                                } catch (AnnotatedException e39) {
                                    throw new ExtCertPathValidatorException("Could not validate time of certificate.", e39, certPath, size2);
                                }
                            } catch (AnnotatedException e40) {
                                throw new CertPathValidatorException(e40.getMessage(), e40.f90372p0, certPath, size2);
                            }
                        }
                        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
                        Set set2 = initialPolicies;
                        TrustAnchor trustAnchor3 = trustAnchorC;
                        ArrayList[] arrayListArr3 = arrayListArr;
                        HashSet hashSet14 = hashSet6;
                        String str15 = g.f90498a;
                        String str16 = b.f90489a;
                        if (!x509Certificate5.getSubjectDN().equals(x509Certificate5.getIssuerDN()) && i20 != 0) {
                            i20--;
                        }
                        int i47 = size2 + 1;
                        int iJ = g.j(certPath, i47, i20);
                        Set<String> criticalExtensionOIDs3 = x509Certificate5.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs3 != null) {
                            hashSet = new HashSet(criticalExtensionOIDs3);
                            hashSet.remove(g.f90509l);
                            hashSet.remove(g.f90498a);
                            hashSet.remove(g.f90499b);
                            hashSet.remove(g.f90500c);
                            hashSet.remove(g.f90501d);
                            hashSet.remove(g.f90502e);
                            hashSet.remove(g.f90503f);
                            hashSet.remove(g.f90504g);
                            hashSet.remove(g.f90506i);
                            hashSet.remove(g.f90507j);
                            hashSet.remove(g.f90505h);
                            hashSet.remove(Extension.extendedKeyUsage.getId());
                        } else {
                            hashSet = new HashSet();
                        }
                        g.k(i47, certPath, list, hashSet);
                        PKIXPolicyNode pKIXPolicyNodeL = g.l(certPath, pKIXExtendedParameters, set2, i47, arrayListArr3, pKIXPolicyNode, hashSet14);
                        if (iJ > 0 || pKIXPolicyNodeL != null) {
                            return new PKIXCertPathValidatorResult(trustAnchor3, pKIXPolicyNodeL, x509Certificate5.getPublicKey());
                        }
                        throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, size2);
                    } catch (CertPathValidatorException e41) {
                        throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e41, certPath, -1);
                    }
                } catch (RuntimeException e42) {
                    throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e42, certPath, -1);
                }
            }
            try {
                throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
            } catch (AnnotatedException e43) {
                e = e43;
            }
        } catch (AnnotatedException e44) {
            e = e44;
        }
        throw new CertPathValidatorException(e.getMessage(), e.f90372p0, certPath, certificates.size() - 1);
    }

    public PKIXCertPathValidatorSpi(boolean z10) {
        this.f90435a = new BCJcaJceHelper();
        this.f90436b = z10;
    }
}
