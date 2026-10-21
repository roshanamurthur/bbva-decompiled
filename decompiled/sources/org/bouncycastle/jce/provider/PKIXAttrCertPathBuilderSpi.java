package org.bouncycastle.jce.provider;

import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509AttributeCertificate;
import org.bouncycastle.x509.X509CertStoreSelector;

/* JADX INFO: loaded from: classes8.dex */
public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AnnotatedException f90431a;

    public static Collection findCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(x509AttributeCertStoreSelector));
                } catch (StoreException e5) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e5);
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    public final CertPathBuilderResult a(X509Certificate x509Certificate, PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters, ArrayList arrayList) {
        CertPathBuilderResult certPathBuilderResultA = null;
        if (arrayList.contains(x509Certificate) || pKIXExtendedBuilderParameters.getExcludedCerts().contains(x509Certificate)) {
            return null;
        }
        if (pKIXExtendedBuilderParameters.getMaxPathLength() != -1 && arrayList.size() - 1 > pKIXExtendedBuilderParameters.getMaxPathLength()) {
            return null;
        }
        arrayList.add(x509Certificate);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(ConstantKt.CERTIFICATE_TYPE_X509, BouncyCastleProvider.PROVIDER_NAME);
            CertPathValidator certPathValidator = CertPathValidator.getInstance("RFC3281", BouncyCastleProvider.PROVIDER_NAME);
            try {
                try {
                    if (b.c(x509Certificate, pKIXExtendedBuilderParameters.getBaseParameters().getTrustAnchors(), pKIXExtendedBuilderParameters.getBaseParameters().getSigProvider()) != null) {
                        try {
                            CertPath certPathGenerateCertPath = certificateFactory.generateCertPath(arrayList);
                            try {
                                PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) certPathValidator.validate(certPathGenerateCertPath, pKIXExtendedBuilderParameters);
                                return new PKIXCertPathBuilderResult(certPathGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                            } catch (Exception e5) {
                                throw new AnnotatedException("Certification path could not be validated.", e5);
                            }
                        } catch (Exception e7) {
                            throw new AnnotatedException("Certification path could not be constructed from certificate list.", e7);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(pKIXExtendedBuilderParameters.getBaseParameters().getCertificateStores());
                    try {
                        arrayList2.addAll(b.d(x509Certificate.getExtensionValue(Extension.issuerAlternativeName.getId()), pKIXExtendedBuilderParameters.getBaseParameters().getNamedCertificateStoreMap()));
                        HashSet hashSet = new HashSet();
                        try {
                            hashSet.addAll(b.b(x509Certificate, pKIXExtendedBuilderParameters.getBaseParameters().getCertStores(), arrayList2));
                            if (hashSet.isEmpty()) {
                                throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
                            }
                            Iterator it = hashSet.iterator();
                            while (it.hasNext() && certPathBuilderResultA == null) {
                                X509Certificate x509Certificate2 = (X509Certificate) it.next();
                                if (!x509Certificate2.getIssuerX500Principal().equals(x509Certificate2.getSubjectX500Principal())) {
                                    certPathBuilderResultA = a(x509Certificate2, pKIXExtendedBuilderParameters, arrayList);
                                }
                            }
                            if (certPathBuilderResultA == null) {
                                arrayList.remove(x509Certificate);
                            }
                            return certPathBuilderResultA;
                        } catch (AnnotatedException e10) {
                            throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e10);
                        }
                    } catch (CertificateParsingException e11) {
                        throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", e11);
                    }
                } catch (Exception unused) {
                }
            } catch (AnnotatedException e12) {
                this.f90431a = new AnnotatedException("No valid certification path could be build.", e12);
            }
            this.f90431a = new AnnotatedException("No valid certification path could be build.", e12);
            if (certPathBuilderResultA == null) {
                arrayList.remove(x509Certificate);
            }
            return certPathBuilderResultA;
        } catch (Exception unused2) {
            throw new RuntimeException("Exception creating support classes.");
        }
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        PKIXExtendedBuilderParameters pKIXExtendedBuilderParametersBuild;
        boolean z10 = certPathParameters instanceof PKIXBuilderParameters;
        if (!z10 && !(certPathParameters instanceof ExtendedPKIXBuilderParameters) && !(certPathParameters instanceof PKIXExtendedBuilderParameters)) {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + PKIXExtendedBuilderParameters.class.getName() + Constant.DOT_STRING);
        }
        List arrayList = new ArrayList();
        if (z10) {
            PKIXExtendedBuilderParameters.Builder builder = new PKIXExtendedBuilderParameters.Builder((PKIXBuilderParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (ExtendedPKIXBuilderParameters) certPathParameters;
                builder.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
                arrayList = extendedPKIXBuilderParameters.getStores();
            }
            pKIXExtendedBuilderParametersBuild = builder.build();
        } else {
            pKIXExtendedBuilderParametersBuild = (PKIXExtendedBuilderParameters) certPathParameters;
        }
        ArrayList arrayList2 = new ArrayList();
        Selector targetConstraints = pKIXExtendedBuilderParametersBuild.getBaseParameters().getTargetConstraints();
        if (!(targetConstraints instanceof X509AttributeCertStoreSelector)) {
            throw new CertPathBuilderException("TargetConstraints must be an instance of " + X509AttributeCertStoreSelector.class.getName() + " for " + getClass().getName() + " class.");
        }
        try {
            Collection collectionFindCertificates = findCertificates((X509AttributeCertStoreSelector) targetConstraints, arrayList);
            if (collectionFindCertificates.isEmpty()) {
                throw new CertPathBuilderException("No attribute certificate found matching targetConstraints.");
            }
            Iterator it = collectionFindCertificates.iterator();
            CertPathBuilderResult certPathBuilderResultA = null;
            while (it.hasNext() && certPathBuilderResultA == null) {
                X509AttributeCertificate x509AttributeCertificate = (X509AttributeCertificate) it.next();
                X509CertStoreSelector x509CertStoreSelector = new X509CertStoreSelector();
                Principal[] principals = x509AttributeCertificate.getIssuer().getPrincipals();
                HashSet hashSet = new HashSet();
                for (Principal principal : principals) {
                    try {
                        if (principal instanceof X500Principal) {
                            x509CertStoreSelector.setSubject(((X500Principal) principal).getEncoded());
                        }
                        PKIXCertStoreSelector<? extends Certificate> pKIXCertStoreSelectorBuild = new PKIXCertStoreSelector.Builder(x509CertStoreSelector).build();
                        hashSet.addAll(b.a(pKIXCertStoreSelectorBuild, pKIXExtendedBuilderParametersBuild.getBaseParameters().getCertStores()));
                        hashSet.addAll(b.a(pKIXCertStoreSelectorBuild, pKIXExtendedBuilderParametersBuild.getBaseParameters().getCertificateStores()));
                    } catch (IOException e5) {
                        throw new ExtCertPathBuilderException("cannot encode X500Principal.", e5);
                    } catch (AnnotatedException e7) {
                        throw new ExtCertPathBuilderException("Public key certificate for attribute certificate cannot be searched.", e7);
                    }
                }
                if (hashSet.isEmpty()) {
                    throw new CertPathBuilderException("Public key certificate for attribute certificate cannot be found.");
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext() && certPathBuilderResultA == null) {
                    certPathBuilderResultA = a((X509Certificate) it2.next(), pKIXExtendedBuilderParametersBuild, arrayList2);
                }
            }
            if (certPathBuilderResultA == null && this.f90431a != null) {
                throw new ExtCertPathBuilderException("Possible certificate chain could not be validated.", this.f90431a);
            }
            if (certPathBuilderResultA == null && this.f90431a == null) {
                throw new CertPathBuilderException("Unable to find certificate chain.");
            }
            return certPathBuilderResultA;
        } catch (AnnotatedException e10) {
            throw new ExtCertPathBuilderException("Error finding target attribute certificate.", e10);
        }
    }
}
