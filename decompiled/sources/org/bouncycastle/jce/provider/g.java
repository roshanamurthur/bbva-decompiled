package org.bouncycastle.jce.provider;

import com.google.firebase.ktx.BuildConfig;
import java.io.IOException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f90498a = Extension.certificatePolicies.getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f90499b = Extension.policyMappings.getId();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f90500c = Extension.inhibitAnyPolicy.getId();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f90501d = Extension.issuingDistributionPoint.getId();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f90502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f90503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f90504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f90505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f90506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f90507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f90508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f90509l;
    public static final String[] m;

    static {
        Extension.freshestCRL.getId();
        f90502e = Extension.deltaCRLIndicator.getId();
        f90503f = Extension.policyConstraints.getId();
        f90504g = Extension.basicConstraints.getId();
        f90505h = Extension.cRLDistributionPoints.getId();
        f90506i = Extension.subjectAlternativeName.getId();
        f90507j = Extension.nameConstraints.getId();
        f90508k = Extension.authorityKeyIdentifier.getId();
        f90509l = Extension.keyUsage.getId();
        Extension.cRLNumber.getId();
        m = new String[]{BuildConfig.VERSION_NAME, "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    }

    public static void a(DistributionPoint distributionPoint, PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, c cVar, i iVar, List list, BCJcaJceHelper bCJcaJceHelper) throws AnnotatedException {
        Date date2;
        Iterator it;
        Set<String> criticalExtensionOIDs;
        Date date3 = new Date(System.currentTimeMillis());
        if (date.getTime() > date3.getTime()) {
            throw new AnnotatedException("Validation time is in future.");
        }
        Iterator it2 = b.i(distributionPoint, x509Certificate, date3, pKIXExtendedParameters).iterator();
        boolean z10 = false;
        AnnotatedException e5 = null;
        while (it2.hasNext() && cVar.f90492a == 11 && !iVar.a()) {
            try {
                X509CRL x509crl = (X509CRL) it2.next();
                i iVarF = f(x509crl, distributionPoint);
                int i10 = iVarF.f90515a;
                if ((i10 | (iVar.f90515a ^ i10)) != 0) {
                    date2 = date3;
                    it = it2;
                    try {
                        X509CRL x509crlI = pKIXExtendedParameters.isUseDeltasEnabled() ? i(b.j(pKIXExtendedParameters.getDate() != null ? pKIXExtendedParameters.getDate() : date2, x509crl, pKIXExtendedParameters.getCertStores(), pKIXExtendedParameters.getCRLStores()), h(x509crl, g(x509crl, x509Certificate2, publicKey, pKIXExtendedParameters, list, bCJcaJceHelper))) : null;
                        if (pKIXExtendedParameters.getValidityModel() != 1 && x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                            throw new AnnotatedException("No valid CRL for current time found.");
                        }
                        c(distributionPoint, x509Certificate, x509crl);
                        d(distributionPoint, x509Certificate, x509crl);
                        e(x509crlI, x509crl, pKIXExtendedParameters);
                        if (pKIXExtendedParameters.isUseDeltasEnabled() && x509crlI != null) {
                            b.h(date, x509crlI, x509Certificate, cVar);
                        }
                        if (cVar.f90492a == 11) {
                            b.h(date, x509crl, x509Certificate, cVar);
                        }
                        if (cVar.f90492a == 8) {
                            cVar.f90492a = 11;
                        }
                        iVar.f90515a |= iVarF.f90515a;
                        Set<String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs2 != null) {
                            HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                            hashSet.remove(Extension.issuingDistributionPoint.getId());
                            hashSet.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet.isEmpty()) {
                                throw new AnnotatedException("CRL contains unsupported critical extensions.");
                            }
                        }
                        if (x509crlI != null && (criticalExtensionOIDs = x509crlI.getCriticalExtensionOIDs()) != null) {
                            HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                            hashSet2.remove(Extension.issuingDistributionPoint.getId());
                            hashSet2.remove(Extension.deltaCRLIndicator.getId());
                            if (!hashSet2.isEmpty()) {
                                throw new AnnotatedException("Delta CRL contains unsupported critical extension.");
                            }
                        }
                        z10 = true;
                    } catch (AnnotatedException e7) {
                        e5 = e7;
                    }
                    date3 = date2;
                    it2 = it;
                } else {
                    continue;
                }
            } catch (AnnotatedException e10) {
                e5 = e10;
                date2 = date3;
                it = it2;
            }
        }
        if (!z10) {
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9 A[PHI: r0
      0x00e9: PHI (r0v13 'e' org.bouncycastle.jce.provider.AnnotatedException) = 
      (r0v12 'e' org.bouncycastle.jce.provider.AnnotatedException)
      (r0v25 'e' org.bouncycastle.jce.provider.AnnotatedException)
      (r0v12 'e' org.bouncycastle.jce.provider.AnnotatedException)
     binds: [B:38:0x009f, B:44:0x00de, B:40:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    public static void b(PKIXExtendedParameters pKIXExtendedParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, List list, BCJcaJceHelper bCJcaJceHelper) throws AnnotatedException {
        AnnotatedException e5;
        boolean z10;
        int i10;
        int i11;
        DistributionPoint[] distributionPointArr;
        int i12;
        try {
            CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(b.k(x509Certificate, f90505h));
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
            try {
                Iterator<PKIXCRLStore> it = b.e(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()).iterator();
                while (it.hasNext()) {
                    builder.addCRLStore(it.next());
                }
                c cVar = new c();
                i iVar = new i(0);
                PKIXExtendedParameters pKIXExtendedParametersBuild = builder.build();
                boolean z11 = true;
                int i13 = 11;
                if (cRLDistPoint != null) {
                    try {
                        DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                        if (distributionPoints != null) {
                            e5 = null;
                            int i14 = 0;
                            z10 = false;
                            while (i14 < distributionPoints.length && cVar.f90492a == i13 && !iVar.a()) {
                                try {
                                    i11 = i14;
                                    distributionPointArr = distributionPoints;
                                    i12 = i13;
                                    try {
                                        a(distributionPoints[i14], pKIXExtendedParametersBuild, x509Certificate, date, x509Certificate2, publicKey, cVar, iVar, list, bCJcaJceHelper);
                                        z10 = true;
                                    } catch (AnnotatedException e7) {
                                        e5 = e7;
                                    }
                                } catch (AnnotatedException e10) {
                                    e5 = e10;
                                    i11 = i14;
                                    distributionPointArr = distributionPoints;
                                    i12 = i13;
                                }
                                i14 = i11 + 1;
                                i13 = i12;
                                distributionPoints = distributionPointArr;
                            }
                            i10 = i13;
                        } else {
                            i10 = 11;
                            e5 = null;
                            z10 = false;
                        }
                    } catch (Exception e11) {
                        throw new AnnotatedException("Distribution points could not be read.", e11);
                    }
                } else {
                    i10 = 11;
                    e5 = null;
                    z10 = false;
                }
                if (cVar.f90492a == i10) {
                    try {
                        if (iVar.a()) {
                            z11 = z10;
                        } else {
                            try {
                                a(new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, bh.a.f(x509Certificate)))), null, null), (PKIXExtendedParameters) pKIXExtendedParameters.clone(), x509Certificate, date, x509Certificate2, publicKey, cVar, iVar, list, bCJcaJceHelper);
                            } catch (RuntimeException e12) {
                                throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e12);
                            }
                        }
                    } catch (AnnotatedException e13) {
                        e5 = e13;
                    }
                } else {
                    z11 = z10;
                }
                if (!z11) {
                    if (!(e5 instanceof AnnotatedException)) {
                        throw new AnnotatedException("No valid CRL found.", e5);
                    }
                    throw e5;
                }
                if (cVar.f90492a == i10) {
                    if (!iVar.a() && cVar.f90492a == i10) {
                        cVar.f90492a = 12;
                    }
                    if (cVar.f90492a == 12) {
                        throw new AnnotatedException("Certificate status could not be determined.");
                    }
                    return;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                StringBuilder sbE = androidx.camera.core.processing.f.e("Certificate revocation after " + simpleDateFormat.format(cVar.f90493b), ", reason: ");
                sbE.append(m[cVar.f90492a]);
                throw new AnnotatedException(sbE.toString());
            } catch (AnnotatedException e14) {
                throw new AnnotatedException("No additional CRL locations could be decoded from CRL distribution point extension.", e14);
            }
        } catch (Exception e15) {
            throw new AnnotatedException("CRL distribution point extension could not be read.", e15);
        }
    }

    public static void c(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        ASN1Primitive aSN1PrimitiveK = b.k(x509crl, f90501d);
        boolean z10 = aSN1PrimitiveK != null && IssuingDistributionPoint.getInstance(aSN1PrimitiveK).isIndirectCRL();
        try {
            byte[] encoded = bh.a.c(x509crl).getEncoded();
            if (distributionPoint.getCRLIssuer() != null) {
                GeneralName[] names = distributionPoint.getCRLIssuer().getNames();
                boolean z11 = false;
                for (int i10 = 0; i10 < names.length; i10++) {
                    if (names[i10].getTagNo() == 4) {
                        try {
                            if (Arrays.areEqual(names[i10].getName().toASN1Primitive().getEncoded(), encoded)) {
                                z11 = true;
                            }
                        } catch (IOException e5) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e5);
                        }
                    }
                }
                if (z11 && !z10) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                }
                if (!z11) {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
                if (z11) {
                    return;
                }
            } else if (bh.a.c(x509crl).equals(bh.a.b(obj))) {
                return;
            }
            throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
        } catch (IOException e7) {
            throw new AnnotatedException(androidx.camera.core.impl.a.d(e7, new StringBuilder("Exception encoding CRL issuer: ")), e7);
        }
    }

    public static void d(DistributionPoint distributionPoint, Object obj, X509CRL x509crl) throws AnnotatedException {
        GeneralName[] names;
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(b.k(x509crl, f90501d));
            if (issuingDistributionPoint != null) {
                if (issuingDistributionPoint.getDistributionPoint() == null) {
                    break;
                }
                DistributionPointName distributionPoint2 = IssuingDistributionPoint.getInstance(issuingDistributionPoint).getDistributionPoint();
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                if (distributionPoint2.getType() == 0) {
                    for (GeneralName generalName : GeneralNames.getInstance(distributionPoint2.getName()).getNames()) {
                        arrayList.add(generalName);
                    }
                }
                if (distributionPoint2.getType() == 1) {
                    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                    try {
                        Enumeration objects = ASN1Sequence.getInstance(bh.a.c(x509crl)).getObjects();
                        while (objects.hasMoreElements()) {
                            aSN1EncodableVector.add((ASN1Encodable) objects.nextElement());
                        }
                        aSN1EncodableVector.add(distributionPoint2.getName());
                        arrayList.add(new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector))));
                    } catch (Exception e5) {
                        throw new AnnotatedException("Could not read CRL issuer.", e5);
                    }
                }
                if (distributionPoint.getDistributionPoint() != null) {
                    DistributionPointName distributionPoint3 = distributionPoint.getDistributionPoint();
                    GeneralName[] names2 = distributionPoint3.getType() == 0 ? GeneralNames.getInstance(distributionPoint3.getName()).getNames() : null;
                    if (distributionPoint3.getType() == 1) {
                        if (distributionPoint.getCRLIssuer() != null) {
                            names = distributionPoint.getCRLIssuer().getNames();
                        } else {
                            names = new GeneralName[1];
                            try {
                                names[0] = new GeneralName(bh.a.b(obj));
                            } catch (Exception e7) {
                                throw new AnnotatedException("Could not read certificate issuer.", e7);
                            }
                        }
                        names2 = names;
                        for (int i11 = 0; i11 < names2.length; i11++) {
                            Enumeration objects2 = ASN1Sequence.getInstance(names2[i11].getName().toASN1Primitive()).getObjects();
                            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                            while (objects2.hasMoreElements()) {
                                aSN1EncodableVector2.add((ASN1Encodable) objects2.nextElement());
                            }
                            aSN1EncodableVector2.add(distributionPoint3.getName());
                            names2[i11] = new GeneralName(X500Name.getInstance(new DERSequence(aSN1EncodableVector2)));
                        }
                    }
                    if (names2 != null) {
                        while (true) {
                            if (i10 < names2.length) {
                                if (arrayList.contains(names2[i10])) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                }
                if (distributionPoint.getCRLIssuer() == null) {
                    throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                }
                GeneralName[] names3 = distributionPoint.getCRLIssuer().getNames();
                while (true) {
                    if (i10 >= names3.length) {
                        throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                    }
                    if (arrayList.contains(names3[i10])) {
                        break;
                    } else {
                        i10++;
                    }
                }
                try {
                    BasicConstraints basicConstraints = BasicConstraints.getInstance(b.k((X509Extension) obj, f90504g));
                    if (obj instanceof X509Certificate) {
                        if (issuingDistributionPoint.onlyContainsUserCerts() && basicConstraints != null && basicConstraints.isCA()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        }
                        if (issuingDistributionPoint.onlyContainsCACerts() && (basicConstraints == null || !basicConstraints.isCA())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (issuingDistributionPoint.onlyContainsAttributeCerts()) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e10) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e10);
                }
            }
        } catch (Exception e11) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e11);
        }
    }

    public static void e(X509CRL x509crl, X509CRL x509crl2, PKIXExtendedParameters pKIXExtendedParameters) throws AnnotatedException {
        if (x509crl == null) {
            return;
        }
        if (x509crl.hasUnsupportedCriticalExtension()) {
            throw new AnnotatedException("delta CRL has unsupported critical extensions");
        }
        try {
            String str = f90501d;
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(b.k(x509crl2, str));
            if (pKIXExtendedParameters.isUseDeltasEnabled()) {
                if (!bh.a.c(x509crl).equals(bh.a.c(x509crl2))) {
                    throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                }
                try {
                    IssuingDistributionPoint issuingDistributionPoint2 = IssuingDistributionPoint.getInstance(b.k(x509crl, str));
                    if (issuingDistributionPoint != null ? !issuingDistributionPoint.equals(issuingDistributionPoint2) : issuingDistributionPoint2 != null) {
                        throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                    }
                    try {
                        String str2 = f90508k;
                        ASN1Primitive aSN1PrimitiveK = b.k(x509crl2, str2);
                        try {
                            ASN1Primitive aSN1PrimitiveK2 = b.k(x509crl, str2);
                            if (aSN1PrimitiveK == null) {
                                throw new AnnotatedException("CRL authority key identifier is null.");
                            }
                            if (aSN1PrimitiveK2 == null) {
                                throw new AnnotatedException("Delta CRL authority key identifier is null.");
                            }
                            if (!aSN1PrimitiveK.equals(aSN1PrimitiveK2)) {
                                throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                            }
                        } catch (AnnotatedException e5) {
                            throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e5);
                        }
                    } catch (AnnotatedException e7) {
                        throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e7);
                    }
                } catch (Exception e10) {
                    throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e10);
                }
            }
        } catch (Exception e11) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e11);
        }
    }

    public static i f(X509CRL x509crl, DistributionPoint distributionPoint) throws AnnotatedException {
        try {
            IssuingDistributionPoint issuingDistributionPoint = IssuingDistributionPoint.getInstance(b.k(x509crl, f90501d));
            if (issuingDistributionPoint != null && issuingDistributionPoint.getOnlySomeReasons() != null && distributionPoint.getReasons() != null) {
                int iIntValue = distributionPoint.getReasons().intValue();
                int iIntValue2 = issuingDistributionPoint.getOnlySomeReasons().intValue();
                i iVar = new i(0);
                iVar.f90515a = iIntValue2 & iIntValue;
                return iVar;
            }
            i iVar2 = i.f90514b;
            if ((issuingDistributionPoint == null || issuingDistributionPoint.getOnlySomeReasons() == null) && distributionPoint.getReasons() == null) {
                return iVar2;
            }
            i iVar3 = distributionPoint.getReasons() == null ? iVar2 : new i(distributionPoint.getReasons());
            if (issuingDistributionPoint != null) {
                iVar2 = new i(issuingDistributionPoint.getOnlySomeReasons());
            }
            i iVar4 = new i(0);
            iVar4.f90515a = iVar3.f90515a & iVar2.f90515a;
            return iVar4;
        } catch (Exception e5) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e5);
        }
    }

    public static HashSet g(X509CRL x509crl, X509Certificate x509Certificate, PublicKey publicKey, PKIXExtendedParameters pKIXExtendedParameters, List list, BCJcaJceHelper bCJcaJceHelper) throws AnnotatedException {
        int i10;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(bh.a.c(x509crl).getEncoded());
            PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertSelector).build();
            try {
                LinkedHashSet linkedHashSetA = b.a(pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertificateStores());
                linkedHashSetA.addAll(b.a(pKIXCertStoreSelectorBuild, pKIXExtendedParameters.getCertStores()));
                linkedHashSetA.add(x509Certificate);
                Iterator it = linkedHashSetA.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            PKIXCertPathBuilderSpi pKIXCertPathBuilderSpi = new PKIXCertPathBuilderSpi(true);
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            PKIXExtendedParameters.Builder targetConstraints = new PKIXExtendedParameters.Builder(pKIXExtendedParameters).setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertSelector2).build());
                            if (list.contains(x509Certificate2)) {
                                targetConstraints.setRevocationEnabled(false);
                            } else {
                                targetConstraints.setRevocationEnabled(true);
                            }
                            List<? extends Certificate> certificates = pKIXCertPathBuilderSpi.engineBuild(new PKIXExtendedBuilderParameters.Builder(targetConstraints.build()).build()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(b.l(certificates, 0, bCJcaJceHelper));
                        } catch (CertPathBuilderException e5) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e5);
                        } catch (CertPathValidatorException e7) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e7);
                        } catch (Exception e10) {
                            throw new AnnotatedException(e10.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i10)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length >= 7 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i10));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                }
                if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                }
                throw annotatedException;
            } catch (AnnotatedException e11) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e11);
            }
        } catch (IOException e12) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e12);
        }
    }

    public static PublicKey h(X509CRL x509crl, HashSet hashSet) throws AnnotatedException {
        Iterator it = hashSet.iterator();
        Exception e5 = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e7) {
                e5 = e7;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e5);
    }

    public static X509CRL i(HashSet hashSet, PublicKey publicKey) throws AnnotatedException {
        Iterator it = hashSet.iterator();
        Exception e5 = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e7) {
                e5 = e7;
            }
        }
        if (e5 == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e5);
    }

    public static int j(CertPath certPath, int i10, int i11) throws CertPathValidatorException {
        try {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(b.k((X509Certificate) certPath.getCertificates().get(i10), f90503f));
            if (aSN1Sequence != null) {
                Enumeration objects = aSN1Sequence.getObjects();
                while (objects.hasMoreElements()) {
                    ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
                    if (aSN1TaggedObject.getTagNo() == 0) {
                        try {
                            if (ASN1Integer.getInstance(aSN1TaggedObject, false).intValueExact() == 0) {
                                return 0;
                            }
                        } catch (Exception e5) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e5, certPath, i10);
                        }
                    }
                }
            }
            return i11;
        } catch (AnnotatedException e7) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e7, certPath, i10);
        }
    }

    public static void k(int i10, CertPath certPath, List list, HashSet hashSet) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, hashSet);
            } catch (CertPathValidatorException e5) {
                throw new ExtCertPathValidatorException(e5.getMessage(), e5, certPath, i10);
            } catch (Exception e7) {
                throw new CertPathValidatorException("Additional certificate path checker failed.", e7, certPath, i10);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + hashSet, null, certPath, i10);
    }

    public static PKIXPolicyNode l(CertPath certPath, PKIXExtendedParameters pKIXExtendedParameters, Set set, int i10, List[] listArr, PKIXPolicyNode pKIXPolicyNode, HashSet hashSet) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (pKIXPolicyNode == null) {
            if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i10);
            }
            return null;
        }
        String str = b.f90489a;
        if (set != null && !set.contains("2.5.29.32.0") && !set.isEmpty()) {
            HashSet<PKIXPolicyNode> hashSet2 = new HashSet();
            for (List list : listArr) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    PKIXPolicyNode pKIXPolicyNode2 = (PKIXPolicyNode) list.get(i11);
                    if ("2.5.29.32.0".equals(pKIXPolicyNode2.getValidPolicy())) {
                        Iterator children = pKIXPolicyNode2.getChildren();
                        while (children.hasNext()) {
                            PKIXPolicyNode pKIXPolicyNode3 = (PKIXPolicyNode) children.next();
                            if (!"2.5.29.32.0".equals(pKIXPolicyNode3.getValidPolicy())) {
                                hashSet2.add(pKIXPolicyNode3);
                            }
                        }
                    }
                }
            }
            for (PKIXPolicyNode pKIXPolicyNode4 : hashSet2) {
                if (!set.contains(pKIXPolicyNode4.getValidPolicy())) {
                    pKIXPolicyNode = b.o(pKIXPolicyNode, listArr, pKIXPolicyNode4);
                }
            }
            if (pKIXPolicyNode != null) {
                for (int i12 = size - 1; i12 >= 0; i12--) {
                    List list2 = listArr[i12];
                    for (int i13 = 0; i13 < list2.size(); i13++) {
                        PKIXPolicyNode pKIXPolicyNode5 = (PKIXPolicyNode) list2.get(i13);
                        if (!pKIXPolicyNode5.hasChildren()) {
                            pKIXPolicyNode = b.o(pKIXPolicyNode, listArr, pKIXPolicyNode5);
                        }
                    }
                }
            }
        } else if (pKIXExtendedParameters.isExplicitPolicyRequired()) {
            if (hashSet.isEmpty()) {
                throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i10);
            }
            HashSet hashSet3 = new HashSet();
            for (List list3 : listArr) {
                for (int i14 = 0; i14 < list3.size(); i14++) {
                    PKIXPolicyNode pKIXPolicyNode6 = (PKIXPolicyNode) list3.get(i14);
                    if ("2.5.29.32.0".equals(pKIXPolicyNode6.getValidPolicy())) {
                        Iterator children2 = pKIXPolicyNode6.getChildren();
                        while (children2.hasNext()) {
                            hashSet3.add(children2.next());
                        }
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                hashSet.contains(((PKIXPolicyNode) it.next()).getValidPolicy());
            }
            for (int i15 = size - 1; i15 >= 0; i15--) {
                List list4 = listArr[i15];
                for (int i16 = 0; i16 < list4.size(); i16++) {
                    PKIXPolicyNode pKIXPolicyNode7 = (PKIXPolicyNode) list4.get(i16);
                    if (!pKIXPolicyNode7.hasChildren()) {
                        pKIXPolicyNode = b.o(pKIXPolicyNode, listArr, pKIXPolicyNode7);
                    }
                }
            }
        }
        return pKIXPolicyNode;
    }
}
