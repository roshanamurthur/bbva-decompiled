package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.jcajce.PKIXCertStore;
import org.bouncycastle.jcajce.PKIXCertStoreSelector;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* JADX INFO: loaded from: classes8.dex */
public class PKIXCertPathBuilderSpi extends CertPathBuilderSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnnotatedException f90434b;

    public PKIXCertPathBuilderSpi() {
        this(false);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    public CertPathBuilderResult build(X509Certificate x509Certificate, PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters, List list) {
        CertPathBuilderResult certPathBuilderResultBuild = null;
        if (list.contains(x509Certificate) || pKIXExtendedBuilderParameters.getExcludedCerts().contains(x509Certificate)) {
            return null;
        }
        if (pKIXExtendedBuilderParameters.getMaxPathLength() != -1 && list.size() - 1 > pKIXExtendedBuilderParameters.getMaxPathLength()) {
            return null;
        }
        list.add(x509Certificate);
        try {
            CertificateFactory certificateFactory = new CertificateFactory();
            PKIXCertPathValidatorSpi pKIXCertPathValidatorSpi = new PKIXCertPathValidatorSpi(this.f90433a);
            try {
                try {
                    if (b.c(x509Certificate, pKIXExtendedBuilderParameters.getBaseParameters().getTrustAnchors(), pKIXExtendedBuilderParameters.getBaseParameters().getSigProvider()) != null) {
                        try {
                            CertPath certPathEngineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                            try {
                                PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) pKIXCertPathValidatorSpi.engineValidate(certPathEngineGenerateCertPath, pKIXExtendedBuilderParameters);
                                return new PKIXCertPathBuilderResult(certPathEngineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                            } catch (Exception e5) {
                                throw new AnnotatedException("Certification path could not be validated.", e5);
                            }
                        } catch (Exception e7) {
                            throw new AnnotatedException("Certification path could not be constructed from certificate list.", e7);
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(pKIXExtendedBuilderParameters.getBaseParameters().getCertificateStores());
                    try {
                        arrayList.addAll(b.d(x509Certificate.getExtensionValue(Extension.issuerAlternativeName.getId()), pKIXExtendedBuilderParameters.getBaseParameters().getNamedCertificateStoreMap()));
                        HashSet hashSet = new HashSet();
                        try {
                            hashSet.addAll(b.b(x509Certificate, pKIXExtendedBuilderParameters.getBaseParameters().getCertStores(), arrayList));
                            if (hashSet.isEmpty()) {
                                throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
                            }
                            Iterator it = hashSet.iterator();
                            while (it.hasNext() && certPathBuilderResultBuild == null) {
                                certPathBuilderResultBuild = build((X509Certificate) it.next(), pKIXExtendedBuilderParameters, list);
                            }
                            if (certPathBuilderResultBuild == null) {
                                list.remove(x509Certificate);
                            }
                            return certPathBuilderResultBuild;
                        } catch (AnnotatedException e10) {
                            throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e10);
                        }
                    } catch (CertificateParsingException e11) {
                        throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", e11);
                    }
                } catch (Exception unused) {
                }
            } catch (AnnotatedException e12) {
                this.f90434b = e12;
            }
            this.f90434b = e12;
            if (certPathBuilderResultBuild == null) {
                list.remove(x509Certificate);
            }
            return certPathBuilderResultBuild;
        } catch (Exception unused2) {
            throw new RuntimeException("Exception creating support classes.");
        }
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        PKIXExtendedBuilderParameters pKIXExtendedBuilderParametersBuild;
        PKIXExtendedBuilderParameters.Builder builder;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            PKIXExtendedParameters.Builder builder2 = new PKIXExtendedParameters.Builder(pKIXBuilderParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (ExtendedPKIXBuilderParameters) certPathParameters;
                Iterator it = extendedPKIXBuilderParameters.getAdditionalStores().iterator();
                while (it.hasNext()) {
                    builder2.addCertificateStore((PKIXCertStore) it.next());
                }
                builder = new PKIXExtendedBuilderParameters.Builder(builder2.build());
                builder.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
            } else {
                builder = new PKIXExtendedBuilderParameters.Builder(pKIXBuilderParameters);
            }
            pKIXExtendedBuilderParametersBuild = builder.build();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedBuilderParameters)) {
                throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + PKIXExtendedBuilderParameters.class.getName() + Constant.DOT_STRING);
            }
            pKIXExtendedBuilderParametersBuild = (PKIXExtendedBuilderParameters) certPathParameters;
        }
        ArrayList arrayList = new ArrayList();
        PKIXCertStoreSelector targetConstraints = pKIXExtendedBuilderParametersBuild.getBaseParameters().getTargetConstraints();
        try {
            LinkedHashSet linkedHashSetA = b.a(targetConstraints, pKIXExtendedBuilderParametersBuild.getBaseParameters().getCertificateStores());
            linkedHashSetA.addAll(b.a(targetConstraints, pKIXExtendedBuilderParametersBuild.getBaseParameters().getCertStores()));
            if (linkedHashSetA.isEmpty()) {
                throw new CertPathBuilderException("No certificate found matching targetConstraints.");
            }
            Iterator it2 = linkedHashSetA.iterator();
            CertPathBuilderResult certPathBuilderResultBuild = null;
            while (it2.hasNext() && certPathBuilderResultBuild == null) {
                certPathBuilderResultBuild = build((X509Certificate) it2.next(), pKIXExtendedBuilderParametersBuild, arrayList);
            }
            if (certPathBuilderResultBuild == null && this.f90434b != null) {
                throw new CertPathBuilderException(this.f90434b.getMessage(), this.f90434b.getCause());
            }
            if (certPathBuilderResultBuild == null && this.f90434b == null) {
                throw new CertPathBuilderException("Unable to find certificate chain.");
            }
            return certPathBuilderResultBuild;
        } catch (AnnotatedException e5) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e5);
        }
    }

    public PKIXCertPathBuilderSpi(boolean z10) {
        this.f90433a = z10;
    }
}
