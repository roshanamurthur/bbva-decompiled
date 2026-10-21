package org.bouncycastle.jcajce;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes6.dex */
public class PKIXCRLStoreSelector<T extends CRL> implements Selector<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CRLSelector f89694p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f89695q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f89696r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f89697s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f89698t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f89699u0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CRLSelector f89700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f89701b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f89702c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public BigInteger f89703d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f89704e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f89705f = false;

        public Builder(CRLSelector cRLSelector) {
            this.f89700a = (CRLSelector) cRLSelector.clone();
        }

        public PKIXCRLStoreSelector<? extends CRL> build() {
            return new PKIXCRLStoreSelector<>(this);
        }

        public Builder setCompleteCRLEnabled(boolean z10) {
            this.f89702c = z10;
            return this;
        }

        public Builder setDeltaCRLIndicatorEnabled(boolean z10) {
            this.f89701b = z10;
            return this;
        }

        public void setIssuingDistributionPoint(byte[] bArr) {
            this.f89704e = Arrays.clone(bArr);
        }

        public void setIssuingDistributionPointEnabled(boolean z10) {
            this.f89705f = z10;
        }

        public void setMaxBaseCRLNumber(BigInteger bigInteger) {
            this.f89703d = bigInteger;
        }
    }

    public static class a extends X509CRLSelector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final PKIXCRLStoreSelector f89706p0;

        public a(PKIXCRLStoreSelector pKIXCRLStoreSelector) {
            this.f89706p0 = pKIXCRLStoreSelector;
            CRLSelector cRLSelector = pKIXCRLStoreSelector.f89694p0;
            if (cRLSelector instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
        public final boolean match(CRL crl) {
            PKIXCRLStoreSelector pKIXCRLStoreSelector = this.f89706p0;
            if (pKIXCRLStoreSelector == null) {
                return crl != null;
            }
            return pKIXCRLStoreSelector.match(crl);
        }
    }

    public PKIXCRLStoreSelector(Builder builder) {
        this.f89694p0 = builder.f89700a;
        this.f89695q0 = builder.f89701b;
        this.f89696r0 = builder.f89702c;
        this.f89697s0 = builder.f89703d;
        this.f89698t0 = builder.f89704e;
        this.f89699u0 = builder.f89705f;
    }

    public static Collection<? extends CRL> getCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, CertStore certStore) throws CertStoreException {
        return certStore.getCRLs(new a(pKIXCRLStoreSelector));
    }

    public X509Certificate getCertificateChecking() {
        CRLSelector cRLSelector = this.f89694p0;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    public byte[] getIssuingDistributionPoint() {
        return Arrays.clone(this.f89698t0);
    }

    public BigInteger getMaxBaseCRLNumber() {
        return this.f89697s0;
    }

    public boolean isCompleteCRLEnabled() {
        return this.f89696r0;
    }

    public boolean isDeltaCRLIndicatorEnabled() {
        return this.f89695q0;
    }

    public boolean isIssuingDistributionPointEnabled() {
        return this.f89699u0;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(CRL crl) {
        BigInteger bigInteger;
        boolean z10 = crl instanceof X509CRL;
        CRLSelector cRLSelector = this.f89694p0;
        if (!z10) {
            return cRLSelector.match(crl);
        }
        X509CRL x509crl = (X509CRL) crl;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(Extension.deltaCRLIndicator.getId());
            ASN1Integer aSN1Integer = extensionValue != null ? ASN1Integer.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()) : null;
            if (isDeltaCRLIndicatorEnabled() && aSN1Integer == null) {
                return false;
            }
            if (isCompleteCRLEnabled() && aSN1Integer != null) {
                return false;
            }
            if (aSN1Integer != null && (bigInteger = this.f89697s0) != null && aSN1Integer.getPositiveValue().compareTo(bigInteger) == 1) {
                return false;
            }
            if (this.f89699u0) {
                byte[] extensionValue2 = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
                byte[] bArr = this.f89698t0;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!Arrays.areEqual(extensionValue2, bArr)) {
                    return false;
                }
            }
            return cRLSelector.match(crl);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return this;
    }
}
