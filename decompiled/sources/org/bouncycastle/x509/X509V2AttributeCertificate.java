package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class X509V2AttributeCertificate implements X509AttributeCertificate {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AttributeCertificate f91730p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Date f91731q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Date f91732r0;

    public X509V2AttributeCertificate(InputStream inputStream) throws IOException {
        try {
            AttributeCertificate attributeCertificate = AttributeCertificate.getInstance(new ASN1InputStream(inputStream).readObject());
            this.f91730p0 = attributeCertificate;
            try {
                this.f91732r0 = attributeCertificate.getAcinfo().getAttrCertValidityPeriod().getNotAfterTime().getDate();
                this.f91731q0 = attributeCertificate.getAcinfo().getAttrCertValidityPeriod().getNotBeforeTime().getDate();
            } catch (ParseException unused) {
                throw new IOException("invalid data structure in certificate!");
            }
        } catch (IOException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new IOException(androidx.appcompat.view.menu.b.c(e7, new StringBuilder("exception decoding certificate structure: ")));
        }
    }

    public final HashSet a(boolean z10) {
        Extensions extensions = this.f91730p0.getAcinfo().getExtensions();
        if (extensions == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationOids = extensions.oids();
        while (enumerationOids.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) enumerationOids.nextElement();
            if (extensions.getExtension(aSN1ObjectIdentifier).isCritical() == z10) {
                hashSet.add(aSN1ObjectIdentifier.getId());
            }
        }
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509AttributeCertificate)) {
            return false;
        }
        try {
            return Arrays.areEqual(getEncoded(), ((X509AttributeCertificate) obj).getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public X509Attribute[] getAttributes() {
        ASN1Sequence attributes = this.f91730p0.getAcinfo().getAttributes();
        X509Attribute[] x509AttributeArr = new X509Attribute[attributes.size()];
        for (int i10 = 0; i10 != attributes.size(); i10++) {
            x509AttributeArr[i10] = new X509Attribute(attributes.getObjectAt(i10));
        }
        return x509AttributeArr;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return a(true);
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public byte[] getEncoded() throws IOException {
        return this.f91730p0.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        Extension extension;
        Extensions extensions = this.f91730p0.getAcinfo().getExtensions();
        if (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(str))) == null) {
            return null;
        }
        try {
            return extension.getExtnValue().getEncoded(ASN1Encoding.DER);
        } catch (Exception e5) {
            throw new RuntimeException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("error encoding ")));
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public AttributeCertificateHolder getHolder() {
        return new AttributeCertificateHolder((ASN1Sequence) this.f91730p0.getAcinfo().getHolder().toASN1Primitive());
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public AttributeCertificateIssuer getIssuer() {
        return new AttributeCertificateIssuer(this.f91730p0.getAcinfo().getIssuer());
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public boolean[] getIssuerUniqueID() {
        DERBitString issuerUniqueID = this.f91730p0.getAcinfo().getIssuerUniqueID();
        if (issuerUniqueID == null) {
            return null;
        }
        byte[] bytes = issuerUniqueID.getBytes();
        int length = (bytes.length * 8) - issuerUniqueID.getPadBits();
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 != length; i10++) {
            zArr[i10] = (bytes[i10 / 8] & (128 >>> (i10 % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return a(false);
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public Date getNotAfter() {
        return this.f91732r0;
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public Date getNotBefore() {
        return this.f91731q0;
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public BigInteger getSerialNumber() {
        return this.f91730p0.getAcinfo().getSerialNumber().getValue();
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public byte[] getSignature() {
        return this.f91730p0.getSignatureValue().getOctets();
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public int getVersion() {
        return this.f91730p0.getAcinfo().getVersion().intValueExact() + 1;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(getEncoded());
        } catch (IOException unused) {
            return 0;
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        AttributeCertificate attributeCertificate = this.f91730p0;
        if (!attributeCertificate.getSignatureAlgorithm().equals(attributeCertificate.getAcinfo().getSignature())) {
            throw new CertificateException("Signature algorithm in certificate info not same as outer certificate");
        }
        Signature signature = Signature.getInstance(attributeCertificate.getSignatureAlgorithm().getAlgorithm().getId(), str);
        signature.initVerify(publicKey);
        try {
            signature.update(attributeCertificate.getAcinfo().getEncoded());
            if (!signature.verify(getSignature())) {
                throw new InvalidKeyException("Public key presented not for certificate signature");
            }
        } catch (IOException unused) {
            throw new SignatureException("Exception encoding certificate info object");
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.after(getNotAfter())) {
            throw new CertificateExpiredException("certificate expired on " + getNotAfter());
        }
        if (date.before(getNotBefore())) {
            throw new CertificateNotYetValidException("certificate not valid till " + getNotBefore());
        }
    }

    @Override // org.bouncycastle.x509.X509AttributeCertificate
    public X509Attribute[] getAttributes(String str) {
        ASN1Sequence attributes = this.f91730p0.getAcinfo().getAttributes();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != attributes.size(); i10++) {
            X509Attribute x509Attribute = new X509Attribute(attributes.getObjectAt(i10));
            if (x509Attribute.getOID().equals(str)) {
                arrayList.add(x509Attribute);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (X509Attribute[]) arrayList.toArray(new X509Attribute[arrayList.size()]);
    }

    public X509V2AttributeCertificate(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
