package org.bouncycastle.x509;

import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
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
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V3TBSCertificateGenerator;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.x509.extension.X509ExtensionUtil;

/* JADX INFO: loaded from: classes13.dex */
public class X509V3CertificateGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CertificateFactory f91739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V3TBSCertificateGenerator f91740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ASN1ObjectIdentifier f91741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AlgorithmIdentifier f91742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f91743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X509ExtensionsGenerator f91744f;

    public X509V3CertificateGenerator() {
        new BCJcaJceHelper();
        this.f91739a = new CertificateFactory();
        this.f91740b = new V3TBSCertificateGenerator();
        this.f91744f = new X509ExtensionsGenerator();
    }

    public static DERBitString a(boolean[] zArr) {
        byte[] bArr = new byte[(zArr.length + 7) / 8];
        for (int i10 = 0; i10 != zArr.length; i10++) {
            int i11 = i10 / 8;
            bArr[i11] = (byte) (bArr[i11] | (zArr[i10] ? 1 << (7 - (i10 % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new DERBitString(bArr) : new DERBitString(bArr, 8 - length);
    }

    public void addExtension(String str, boolean z10, ASN1Encodable aSN1Encodable) {
        addExtension(new ASN1ObjectIdentifier(str), z10, aSN1Encodable);
    }

    public final X509Certificate b(TBSCertificate tBSCertificate, byte[] bArr) throws Exception {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertificate);
        aSN1EncodableVector.add(this.f91742d);
        aSN1EncodableVector.add(new DERBitString(bArr));
        return (X509Certificate) this.f91739a.engineGenerateCertificate(new ByteArrayInputStream(new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER)));
    }

    public void copyAndAddExtension(String str, boolean z10, X509Certificate x509Certificate) throws CertificateParsingException {
        byte[] extensionValue = x509Certificate.getExtensionValue(str);
        if (extensionValue == null) {
            throw new CertificateParsingException(h0.b("extension ", str, " not present"));
        }
        try {
            addExtension(str, z10, X509ExtensionUtil.fromExtensionValue(extensionValue));
        } catch (IOException e5) {
            throw new CertificateParsingException(e5.toString());
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
        this.f91740b = new V3TBSCertificateGenerator();
        this.f91744f.reset();
    }

    public void setIssuerDN(X500Principal x500Principal) {
        try {
            this.f91740b.setIssuer(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e5) {
            throw new IllegalArgumentException(ad.e.d("can't process principal: ", e5));
        }
    }

    public void setIssuerUniqueID(boolean[] zArr) {
        this.f91740b.setIssuerUniqueID(a(zArr));
    }

    public void setNotAfter(Date date) {
        this.f91740b.setEndDate(new Time(date));
    }

    public void setNotBefore(Date date) {
        this.f91740b.setStartDate(new Time(date));
    }

    public void setPublicKey(PublicKey publicKey) throws IllegalArgumentException {
        try {
            this.f91740b.setSubjectPublicKeyInfo(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(publicKey.getEncoded()).readObject()));
        } catch (Exception e5) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.b.c(e5, new StringBuilder("unable to process key - ")));
        }
    }

    public void setSerialNumber(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException("serial number must be a positive integer");
        }
        this.f91740b.setSerialNumber(new ASN1Integer(bigInteger));
    }

    public void setSignatureAlgorithm(String str) {
        this.f91743e = str;
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifierE = e.e(str);
            this.f91741c = aSN1ObjectIdentifierE;
            AlgorithmIdentifier algorithmIdentifierI = e.i(str, aSN1ObjectIdentifierE);
            this.f91742d = algorithmIdentifierI;
            this.f91740b.setSignature(algorithmIdentifierI);
        } catch (Exception unused) {
            throw new IllegalArgumentException(f.d("Unknown signature type requested: ", str));
        }
    }

    public void setSubjectDN(X500Principal x500Principal) {
        try {
            this.f91740b.setSubject(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e5) {
            throw new IllegalArgumentException(ad.e.d("can't process principal: ", e5));
        }
    }

    public void setSubjectUniqueID(boolean[] zArr) {
        this.f91740b.setSubjectUniqueID(a(zArr));
    }

    public void addExtension(String str, boolean z10, byte[] bArr) {
        addExtension(new ASN1ObjectIdentifier(str), z10, bArr);
    }

    public X509Certificate generate(PrivateKey privateKey, String str) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        return generate(privateKey, str, null);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, String str) throws SignatureException, SecurityException, InvalidKeyException, NoSuchProviderException {
        return generateX509Certificate(privateKey, str, null);
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) {
        this.f91744f.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z10, aSN1Encodable);
    }

    public X509Certificate generate(PrivateKey privateKey, String str, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException, CertificateEncodingException {
        X509ExtensionsGenerator x509ExtensionsGenerator = this.f91744f;
        if (!x509ExtensionsGenerator.isEmpty()) {
            this.f91740b.setExtensions(x509ExtensionsGenerator.generate());
        }
        TBSCertificate tBSCertificateGenerateTBSCertificate = this.f91740b.generateTBSCertificate();
        try {
            try {
                return b(tBSCertificateGenerateTBSCertificate, e.a(this.f91741c, this.f91743e, str, privateKey, secureRandom, tBSCertificateGenerateTBSCertificate));
            } catch (Exception e5) {
                throw new c("exception producing certificate object", e5);
            }
        } catch (IOException e7) {
            throw new c("exception encoding TBS cert", e7);
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

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, byte[] bArr) {
        this.f91744f.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z10, bArr);
    }

    public X509Certificate generateX509Certificate(PrivateKey privateKey, SecureRandom secureRandom) throws SignatureException, SecurityException, InvalidKeyException {
        try {
            return generateX509Certificate(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public X509Certificate generate(PrivateKey privateKey, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateEncodingException {
        X509ExtensionsGenerator x509ExtensionsGenerator = this.f91744f;
        if (!x509ExtensionsGenerator.isEmpty()) {
            this.f91740b.setExtensions(x509ExtensionsGenerator.generate());
        }
        TBSCertificate tBSCertificateGenerateTBSCertificate = this.f91740b.generateTBSCertificate();
        try {
            try {
                return b(tBSCertificateGenerateTBSCertificate, e.b(this.f91741c, this.f91743e, privateKey, secureRandom, tBSCertificateGenerateTBSCertificate));
            } catch (Exception e5) {
                throw new c("exception producing certificate object", e5);
            }
        } catch (IOException e7) {
            throw new c("exception encoding TBS cert", e7);
        }
    }

    public void setIssuerDN(X509Name x509Name) {
        this.f91740b.setIssuer(x509Name);
    }

    public void setSubjectDN(X509Name x509Name) {
        this.f91740b.setSubject(x509Name);
    }

    public void copyAndAddExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, X509Certificate x509Certificate) throws CertificateParsingException {
        copyAndAddExtension(aSN1ObjectIdentifier.getId(), z10, x509Certificate);
    }
}
