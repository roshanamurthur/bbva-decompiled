package com.google.android.play.core.splitinstall.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class p extends X509Certificate {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final X509Certificate f46276p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f46277q0;

    public p(X509Certificate x509Certificate, byte[] bArr) {
        this.f46276p0 = x509Certificate;
        this.f46277q0 = bArr;
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        this.f46276p0.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        this.f46276p0.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f46276p0.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f46276p0.verify(publicKey, str);
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return this.f46276p0.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return this.f46276p0.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f46277q0;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        return this.f46276p0.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return this.f46276p0.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        return this.f46276p0.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return this.f46276p0.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return this.f46276p0.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.f46276p0.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.f46276p0.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        return this.f46276p0.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.f46276p0.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.f46276p0.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.f46276p0.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return this.f46276p0.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.f46276p0.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return this.f46276p0.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        return this.f46276p0.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        return this.f46276p0.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.f46276p0.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        return this.f46276p0.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        return this.f46276p0.toString();
    }
}
