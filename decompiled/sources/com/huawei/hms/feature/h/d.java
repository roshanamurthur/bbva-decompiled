package com.huawei.hms.feature.h;

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

/* JADX INFO: loaded from: classes10.dex */
class d extends X509Certificate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X509Certificate f50383a;

    public static class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f50384b;

        public a(X509Certificate x509Certificate, byte[] bArr) {
            super(x509Certificate);
            this.f50384b = bArr;
        }

        @Override // com.huawei.hms.feature.h.d, java.security.cert.Certificate
        public byte[] getEncoded() throws CertificateEncodingException {
            return this.f50384b;
        }
    }

    public d(X509Certificate x509Certificate) {
        this.f50383a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        this.f50383a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        return this.f50383a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        return this.f50383a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f50383a.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return this.f50383a.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return this.f50383a.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return this.f50383a.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.f50383a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        return this.f50383a.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.f50383a.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.f50383a.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        return this.f50383a.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.f50383a.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.f50383a.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.f50383a.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return this.f50383a.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.f50383a.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return this.f50383a.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return this.f50383a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f50383a.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.f50383a.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return this.f50383a.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return this.f50383a.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f50383a.verify(publicKey);
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        this.f50383a.checkValidity(date);
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f50383a.verify(publicKey, str);
    }
}
