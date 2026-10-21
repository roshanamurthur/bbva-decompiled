package org.bouncycastle.jce.provider;

import androidx.camera.camera2.internal.h0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.x509.CRLDistPoint;
import org.bouncycastle.asn1.x509.DistributionPoint;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.TargetInformation;
import org.bouncycastle.jcajce.PKIXCRLStore;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.PKIXAttrCertChecker;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CertStoreSelector;

/* JADX INFO: loaded from: classes8.dex */
public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f90432a = new BCJcaJceHelper();

    /* JADX WARN: Code duplicated, block: B:197:0x03e5 A[PHI: r0
      0x03e5: PHI (r0v47 org.bouncycastle.jce.provider.AnnotatedException) = 
      (r0v46 org.bouncycastle.jce.provider.AnnotatedException)
      (r0v46 org.bouncycastle.jce.provider.AnnotatedException)
      (r0v59 org.bouncycastle.jce.provider.AnnotatedException)
     binds: [B:186:0x039d, B:188:0x03a3, B:196:0x03df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:199:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:201:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:209:0x0402  */
    /* JADX WARN: Code duplicated, block: B:211:0x040a  */
    /* JADX WARN: Code duplicated, block: B:213:0x0433  */
    /* JADX WARN: Instruction removed from duplicated block: B:211:0x040a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters pKIXExtendedParametersBuild;
        boolean z10;
        String str;
        i iVar;
        c cVar;
        AnnotatedException annotatedException;
        boolean z11 = certPathParameters instanceof ExtendedPKIXParameters;
        if (!z11 && !(certPathParameters instanceof PKIXExtendedParameters)) {
            throw new InvalidAlgorithmParameterException(androidx.datastore.preferences.protobuf.e.e(ExtendedPKIXParameters.class, new StringBuilder("Parameters must be a "), " instance."));
        }
        Set hashSet = new HashSet();
        Set<String> hashSet2 = new HashSet();
        Set<String> hashSet3 = new HashSet();
        HashSet<TrustAnchor> hashSet4 = new HashSet();
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (z11) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
                hashSet = extendedPKIXParameters.getAttrCertCheckers();
                hashSet2 = extendedPKIXParameters.getProhibitedACAttributes();
                hashSet3 = extendedPKIXParameters.getNecessaryACAttributes();
            }
            pKIXExtendedParametersBuild = builder.build();
        } else {
            pKIXExtendedParametersBuild = (PKIXExtendedParameters) certPathParameters;
        }
        PKIXExtendedParameters pKIXExtendedParameters = pKIXExtendedParametersBuild;
        Selector targetConstraints = pKIXExtendedParameters.getTargetConstraints();
        if (!(targetConstraints instanceof X509AttributeCertStoreSelector)) {
            throw new InvalidAlgorithmParameterException("TargetConstraints must be an instance of " + X509AttributeCertStoreSelector.class.getName() + " for " + getClass().getName() + " class.");
        }
        X509AttributeCertificate attributeCert = ((X509AttributeCertStoreSelector) targetConstraints).getAttributeCert();
        String str2 = h.f90510a;
        HashSet hashSet5 = new HashSet();
        if (attributeCert.getHolder().getIssuer() != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(attributeCert.getHolder().getSerialNumber());
            for (Principal principal : attributeCert.getHolder().getIssuer()) {
                try {
                    if (principal instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) principal).getEncoded());
                    }
                    hashSet5.addAll(b.a(new PKIXCertStoreSelector.Builder(x509CertSelector).build(), pKIXExtendedParameters.getCertStores()));
                } catch (IOException e5) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e5);
                } catch (AnnotatedException e7) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e7);
                }
            }
            if (hashSet5.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (attributeCert.getHolder().getEntityNames() != null) {
            X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
            for (Principal principal2 : attributeCert.getHolder().getEntityNames()) {
                try {
                    if (principal2 instanceof X500Principal) {
                        x509CertStoreSelector.setIssuer(((X500Principal) principal2).getEncoded());
                    }
                    hashSet5.addAll(b.a(new PKIXCertStoreSelector.Builder(x509CertStoreSelector).build(), pKIXExtendedParameters.getCertStores()));
                } catch (IOException e10) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e10);
                } catch (AnnotatedException e11) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e11);
                }
            }
            if (hashSet5.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        PKIXExtendedParameters.Builder builder2 = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
        Iterator it = hashSet5.iterator();
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResultBuild = null;
        while (it.hasNext()) {
            X509CertStoreSelector x509CertStoreSelector2 = new X509CertStoreSelector();
            x509CertStoreSelector2.setCertificate((X509Certificate) it.next());
            builder2.setTargetConstraints(new PKIXCertStoreSelector.Builder(x509CertStoreSelector2).build());
            try {
                try {
                    certPathBuilderResultBuild = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new PKIXExtendedBuilderParameters.Builder(builder2.build()).build());
                } catch (InvalidAlgorithmParameterException e12) {
                    throw new RuntimeException(e12.getMessage());
                } catch (CertPathBuilderException e13) {
                    extCertPathValidatorException = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", e13);
                }
            } catch (NoSuchAlgorithmException e14) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e14);
            } catch (NoSuchProviderException e15) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e15);
            }
        }
        if (extCertPathValidatorException != null) {
            throw extCertPathValidatorException;
        }
        CertPath certPath2 = certPathBuilderResultBuild.getCertPath();
        try {
            try {
                CertPathValidatorResult certPathValidatorResultValidate = CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, pKIXExtendedParameters);
                X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(0);
                boolean z12 = true;
                if (x509Certificate.getKeyUsage() != null && !x509Certificate.getKeyUsage()[0] && !x509Certificate.getKeyUsage()[1]) {
                    throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
                }
                if (x509Certificate.getBasicConstraints() != -1) {
                    throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
                }
                boolean z13 = false;
                for (TrustAnchor trustAnchor : hashSet4) {
                    if (x509Certificate.getSubjectX500Principal().getName("RFC2253").equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                        z13 = true;
                    }
                }
                if (!z13) {
                    throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
                }
                try {
                    String str3 = b.f90489a;
                    Date date = pKIXExtendedParameters.getDate();
                    if (date == null) {
                        date = new Date();
                    }
                    attributeCert.checkValidity(date);
                    Set<String> criticalExtensionOIDs = attributeCert.getCriticalExtensionOIDs();
                    String str4 = h.f90510a;
                    if (criticalExtensionOIDs.contains(str4)) {
                        try {
                            TargetInformation.getInstance(b.k(attributeCert, str4));
                        } catch (IllegalArgumentException e16) {
                            throw new ExtCertPathValidatorException("Target information extension could not be read.", e16);
                        } catch (AnnotatedException e17) {
                            throw new ExtCertPathValidatorException("Target information extension could not be read.", e17);
                        }
                    }
                    criticalExtensionOIDs.remove(str4);
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((PKIXAttrCertChecker) it2.next()).check(attributeCert, certPath, certPath2, criticalExtensionOIDs);
                    }
                    if (!criticalExtensionOIDs.isEmpty()) {
                        throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
                    }
                    for (String str5 : hashSet2) {
                        if (attributeCert.getAttributes(str5) != null) {
                            throw new CertPathValidatorException(h0.b("Attribute certificate contains prohibited attribute: ", str5, Constant.DOT_STRING));
                        }
                    }
                    for (String str6 : hashSet3) {
                        if (attributeCert.getAttributes(str6) == null) {
                            throw new CertPathValidatorException(h0.b("Attribute certificate does not contain necessary attribute: ", str6, Constant.DOT_STRING));
                        }
                    }
                    try {
                        Date dateN = b.n(pKIXExtendedParameters, null, -1);
                        List<? extends Certificate> certificates = certPath.getCertificates();
                        BCJcaJceHelper bCJcaJceHelper = this.f90432a;
                        if (pKIXExtendedParameters.isRevocationEnabled()) {
                            byte[] extensionValue = attributeCert.getExtensionValue(h.f90511b);
                            String str7 = h.f90512c;
                            if (extensionValue == null) {
                                try {
                                    CRLDistPoint cRLDistPoint = CRLDistPoint.getInstance(b.k(attributeCert, str7));
                                    ArrayList arrayList = new ArrayList();
                                    try {
                                        arrayList.addAll(b.e(cRLDistPoint, pKIXExtendedParameters.getNamedCRLStoreMap()));
                                        PKIXExtendedParameters.Builder builder3 = new PKIXExtendedParameters.Builder(pKIXExtendedParameters);
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            builder3.addCRLStore((PKIXCRLStore) arrayList);
                                        }
                                        PKIXExtendedParameters pKIXExtendedParametersBuild2 = builder3.build();
                                        c cVar2 = new c();
                                        boolean z14 = false;
                                        i iVar2 = new i(0);
                                        String str8 = "No valid CRL for distribution point found.";
                                        int i10 = 11;
                                        if (cRLDistPoint != null) {
                                            try {
                                                DistributionPoint[] distributionPoints = cRLDistPoint.getDistributionPoints();
                                                int i11 = 0;
                                                z10 = false;
                                                while (i11 < distributionPoints.length && cVar2.f90492a == i10 && !iVar2.a()) {
                                                    try {
                                                        int i12 = i11;
                                                        str = str8;
                                                        iVar = iVar2;
                                                        cVar = cVar2;
                                                        try {
                                                            h.a(distributionPoints[i11], attributeCert, (PKIXExtendedParameters) pKIXExtendedParametersBuild2.clone(), dateN, cVar2, iVar2, certificates, bCJcaJceHelper);
                                                            i11 = i12 + 1;
                                                            str8 = str;
                                                            cVar2 = cVar;
                                                            z10 = true;
                                                            iVar2 = iVar;
                                                            i10 = 11;
                                                            z14 = false;
                                                        } catch (AnnotatedException e18) {
                                                            e = e18;
                                                            annotatedException = new AnnotatedException(str, e);
                                                            if (cVar.f90492a == 11) {
                                                                z12 = z10;
                                                            } else {
                                                                z12 = z10;
                                                            }
                                                            if (z12) {
                                                                throw new ExtCertPathValidatorException("No valid CRL found.", annotatedException);
                                                            }
                                                            if (cVar.f90492a != 11) {
                                                                if (!iVar.a()) {
                                                                    cVar.f90492a = 12;
                                                                }
                                                                if (cVar.f90492a == 12) {
                                                                    throw new CertPathValidatorException("Attribute certificate status could not be determined.");
                                                                }
                                                                return certPathValidatorResultValidate;
                                                            }
                                                            StringBuilder sbE = androidx.camera.core.processing.f.e("Attribute certificate revocation after " + cVar.f90493b, ", reason: ");
                                                            sbE.append(g.m[cVar.f90492a]);
                                                            throw new CertPathValidatorException(sbE.toString());
                                                        }
                                                    } catch (AnnotatedException e19) {
                                                        e = e19;
                                                        str = str8;
                                                        iVar = iVar2;
                                                        cVar = cVar2;
                                                    }
                                                }
                                                str = str8;
                                                iVar = iVar2;
                                                cVar = cVar2;
                                                annotatedException = null;
                                            } catch (Exception e20) {
                                                throw new ExtCertPathValidatorException("Distribution points could not be read.", e20);
                                            }
                                        } else {
                                            str = "No valid CRL for distribution point found.";
                                            iVar = iVar2;
                                            cVar = cVar2;
                                            annotatedException = null;
                                            z10 = false;
                                        }
                                        if (cVar.f90492a == 11 || iVar.a()) {
                                            z12 = z10;
                                        } else {
                                            try {
                                                try {
                                                    h.a(new DistributionPoint(new DistributionPointName(0, new GeneralNames(new GeneralName(4, bh.a.b(attributeCert)))), null, null), attributeCert, (PKIXExtendedParameters) pKIXExtendedParametersBuild2.clone(), dateN, cVar, iVar, certificates, bCJcaJceHelper);
                                                } catch (Exception e21) {
                                                    throw new AnnotatedException("Issuer from certificate for CRL could not be reencoded.", e21);
                                                }
                                            } catch (AnnotatedException e22) {
                                                annotatedException = new AnnotatedException(str, e22);
                                                z12 = z10;
                                            }
                                        }
                                        if (z12) {
                                            throw new ExtCertPathValidatorException("No valid CRL found.", annotatedException);
                                        }
                                        if (cVar.f90492a != 11) {
                                            StringBuilder sbE2 = androidx.camera.core.processing.f.e("Attribute certificate revocation after " + cVar.f90493b, ", reason: ");
                                            sbE2.append(g.m[cVar.f90492a]);
                                            throw new CertPathValidatorException(sbE2.toString());
                                        }
                                        if (!iVar.a() && cVar.f90492a == 11) {
                                            cVar.f90492a = 12;
                                        }
                                        if (cVar.f90492a == 12) {
                                            throw new CertPathValidatorException("Attribute certificate status could not be determined.");
                                        }
                                    } catch (AnnotatedException e23) {
                                        throw new CertPathValidatorException("No additional CRL locations could be decoded from CRL distribution point extension.", e23);
                                    }
                                } catch (AnnotatedException e24) {
                                    throw new CertPathValidatorException("CRL distribution point extension could not be read.", e24);
                                }
                            } else if (attributeCert.getExtensionValue(str7) != null || attributeCert.getExtensionValue(h.f90513d) != null) {
                                throw new CertPathValidatorException("No rev avail extension is set, but also an AC revocation pointer.");
                            }
                        }
                        return certPathValidatorResultValidate;
                    } catch (AnnotatedException e25) {
                        throw new ExtCertPathValidatorException("Could not get validity date from attribute certificate.", e25);
                    }
                } catch (CertificateExpiredException e26) {
                    throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e26);
                } catch (CertificateNotYetValidException e27) {
                    throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e27);
                }
            } catch (InvalidAlgorithmParameterException e28) {
                throw new RuntimeException(e28.getMessage());
            } catch (CertPathValidatorException e29) {
                throw new ExtCertPathValidatorException("Certification path for issuer certificate of attribute certificate could not be validated.", e29);
            }
        } catch (NoSuchAlgorithmException e30) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e30);
        } catch (NoSuchProviderException e31) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e31);
        }
    }
}
