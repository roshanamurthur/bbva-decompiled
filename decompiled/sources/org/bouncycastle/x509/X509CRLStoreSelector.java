package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

/* JADX INFO: loaded from: classes13.dex */
public class X509CRLStoreSelector extends X509CRLSelector implements Selector {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f91709p0 = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f91710q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public BigInteger f91711r0 = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public byte[] f91712s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f91713t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public X509AttributeCertificate f91714u0;

    public static X509CRLStoreSelector getInstance(X509CRLSelector x509CRLSelector) {
        if (x509CRLSelector == null) {
            throw new IllegalArgumentException("cannot create from null selector");
        }
        X509CRLStoreSelector x509CRLStoreSelector = new X509CRLStoreSelector();
        x509CRLStoreSelector.setCertificateChecking(x509CRLSelector.getCertificateChecking());
        x509CRLStoreSelector.setDateAndTime(x509CRLSelector.getDateAndTime());
        try {
            x509CRLStoreSelector.setIssuerNames(x509CRLSelector.getIssuerNames());
            x509CRLStoreSelector.setIssuers(x509CRLSelector.getIssuers());
            x509CRLStoreSelector.setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            x509CRLStoreSelector.setMinCRLNumber(x509CRLSelector.getMinCRL());
            return x509CRLStoreSelector;
        } catch (IOException e5) {
            throw new IllegalArgumentException(e5.getMessage());
        }
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector, org.bouncycastle.util.Selector
    public Object clone() {
        X509CRLStoreSelector x509CRLStoreSelector = getInstance(this);
        x509CRLStoreSelector.f91709p0 = this.f91709p0;
        x509CRLStoreSelector.f91710q0 = this.f91710q0;
        x509CRLStoreSelector.f91711r0 = this.f91711r0;
        x509CRLStoreSelector.f91714u0 = this.f91714u0;
        x509CRLStoreSelector.f91713t0 = this.f91713t0;
        x509CRLStoreSelector.f91712s0 = Arrays.clone(this.f91712s0);
        return x509CRLStoreSelector;
    }

    public X509AttributeCertificate getAttrCertificateChecking() {
        return this.f91714u0;
    }

    public byte[] getIssuingDistributionPoint() {
        return Arrays.clone(this.f91712s0);
    }

    public BigInteger getMaxBaseCRLNumber() {
        return this.f91711r0;
    }

    public boolean isCompleteCRLEnabled() {
        return this.f91710q0;
    }

    public boolean isDeltaCRLIndicatorEnabled() {
        return this.f91709p0;
    }

    public boolean isIssuingDistributionPointEnabled() {
        return this.f91713t0;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        X509CRL x509crl = (X509CRL) obj;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(Extension.deltaCRLIndicator.getId());
            ASN1Integer aSN1Integer = extensionValue != null ? ASN1Integer.getInstance(X509ExtensionUtil.fromExtensionValue(extensionValue)) : null;
            if (isDeltaCRLIndicatorEnabled() && aSN1Integer == null) {
                return false;
            }
            if (isCompleteCRLEnabled() && aSN1Integer != null) {
                return false;
            }
            if (aSN1Integer != null && this.f91711r0 != null && aSN1Integer.getPositiveValue().compareTo(this.f91711r0) == 1) {
                return false;
            }
            if (this.f91713t0) {
                byte[] extensionValue2 = x509crl.getExtensionValue(Extension.issuingDistributionPoint.getId());
                byte[] bArr = this.f91712s0;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!Arrays.areEqual(extensionValue2, bArr)) {
                    return false;
                }
            }
            return super.match((CRL) x509crl);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setAttrCertificateChecking(X509AttributeCertificate x509AttributeCertificate) {
        this.f91714u0 = x509AttributeCertificate;
    }

    public void setCompleteCRLEnabled(boolean z10) {
        this.f91710q0 = z10;
    }

    public void setDeltaCRLIndicatorEnabled(boolean z10) {
        this.f91709p0 = z10;
    }

    public void setIssuingDistributionPoint(byte[] bArr) {
        this.f91712s0 = Arrays.clone(bArr);
    }

    public void setIssuingDistributionPointEnabled(boolean z10) {
        this.f91713t0 = z10;
    }

    public void setMaxBaseCRLNumber(BigInteger bigInteger) {
        this.f91711r0 = bigInteger;
    }

    @Override // java.security.cert.X509CRLSelector, java.security.cert.CRLSelector
    public boolean match(CRL crl) {
        return match((Object) crl);
    }
}
