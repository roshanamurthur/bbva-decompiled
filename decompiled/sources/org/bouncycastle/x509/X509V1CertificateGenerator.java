package org.bouncycastle.x509;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V1TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes13.dex */
public class X509V1CertificateGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CertificateFactory f91725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V1TBSCertificateGenerator f91726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ASN1ObjectIdentifier f91727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlgorithmIdentifier f91728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f91729e;

    public X509V1CertificateGenerator() {
        new BCJcaJceHelper();
        this.f91725a = new CertificateFactory();
        this.f91726b = new V1TBSCertificateGenerator();
    }

    public final X509Certificate a(TBSCertificate tBSCertificate, byte[] bArr) throws CertificateEncodingException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(this.f91728d);
        aSN1EncodableVector.add(new DERBitString(bArr));
        try {
            return (X509Certificate) this.f91725a.engineGenerateCertificate(new ByteArrayInputStream(new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER)));
        } catch (Exception e5) {
            throw new c("exception producing certificate object", e5);
        }
    }

    public X509Certificate generate(PrivateKey privateKey) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        return generate(privateKey, (SecureRandom) null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey) throws SignatureException, SecurityException, InvalidKeyException {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public Iterator getSignatureAlgNames() {
        return e.d();
    }

    public void reset() {
        this.f91726b = new V1TBSCertificateGenerator();
    }

    public void setIssuerDN(X500Principal x500Principal) {
        try {
            this.f91726b.setIssuer(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e5) {
            throw new IllegalArgumentException(ad.e.d("can't process principal: ", e5));
        }
    }

    public void setNotAfter(Date date) {
        this.f91726b.setEndDate(new Time(date));
    }

    public void setNotBefore(Date date) {
        this.f91726b.setStartDate(new Time(date));
    }

    public void setPublicKey(PublicKey publicKey) {
        try {
            this.f91726b.setSubjectPublicKeyInfo(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("unable to process key - ")));
        }
    }

    public void setSerialNumber(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("serial number must be a positive integer");
        }
        this.f91726b.setSerialNumber(new ASN1Integer(bigInteger));
    }

    public void setSignatureAlgorithm(String str) {
        this.f91729e = str;
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifierE = e.e(str);
            this.f91727c = aSN1ObjectIdentifierE;
            AlgorithmIdentifier algorithmIdentifierI = e.i(str, aSN1ObjectIdentifierE);
            this.f91728d = algorithmIdentifierI;
            this.f91726b.setSignature(algorithmIdentifierI);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested");
        }
    }

    public void setSubjectDN(X500Principal x500Principal) {
        try {
            this.f91726b.setSubject(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e5) {
            throw new IllegalArgumentException(ad.e.d("can't process principal: ", e5));
        }
    }

    public X509Certificate generate(PrivateKey privateKey, String str) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        return generate(privateKey, str, null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str) throws SignatureException, SecurityException, InvalidKeyException, NoSuchProviderException {
        return generateX509Certificate(privateKey, str, null);
    }

    public X509Certificate generate(PrivateKey privateKey, String str, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        TBSCertificate tBSCertificateGenerateTBSCertificate = this.f91726b.generateTBSCertificate();
        try {
            return a(tBSCertificateGenerateTBSCertificate, e.a(this.f91727c, this.f91729e, str, privateKey, secureRandom, tBSCertificateGenerateTBSCertificate));
        } catch (IOException e5) {
            throw new c("exception encoding TBS cert", e5);
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str, SecureRandom secureRandom) throws SignatureException, InvalidKeyException, SecurityException, NoSuchProviderException {
        try {
            return generate(privateKey, str, secureRandom);
        } catch (InvalidKeyException e5) {
            throw e5;
        } catch (NoSuchProviderException e7) {
            throw e7;
        } catch (SignatureException e10) {
            throw e10;
        } catch (GeneralSecurityException e11) {
            throw new SecurityException("exception: " + e11);
        }
    }

    public X509Certificate generate(PrivateKey privateKey, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        TBSCertificate tBSCertificateGenerateTBSCertificate = this.f91726b.generateTBSCertificate();
        try {
            return a(tBSCertificateGenerateTBSCertificate, e.b(this.f91727c, this.f91729e, privateKey, secureRandom, tBSCertificateGenerateTBSCertificate));
        } catch (IOException e5) {
            throw new c("exception encoding TBS cert", e5);
        }
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, SecureRandom secureRandom) throws SignatureException, SecurityException, InvalidKeyException {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public void setIssuerDN(X509Name x509Name) {
        this.f91726b.setIssuer(x509Name);
    }

    public void setSubjectDN(X509Name x509Name) {
        this.f91726b.setSubject(x509Name);
    }
}
