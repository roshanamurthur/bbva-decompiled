package org.bouncycastle.x509;

import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.TBSCertList;
import org.bouncycastle.asn1.x509.Time;
import org.bouncycastle.asn1.x509.V2TBSCertListGenerator;
import org.bouncycastle.asn1.x509.X509Extensions;
import org.bouncycastle.asn1.x509.X509ExtensionsGenerator;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.X509Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.X509CRLObject;

/* JADX INFO: loaded from: classes13.dex */
public class X509V2CRLGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V2TBSCertListGenerator f91733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ASN1ObjectIdentifier f91734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AlgorithmIdentifier f91735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f91736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X509ExtensionsGenerator f91737e;

    public static class a extends CRLException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Throwable f91738p0;

        public a(IOException iOException) {
            super("cannot generate CRL encoding");
            this.f91738p0 = iOException;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f91738p0;
        }
    }

    public X509V2CRLGenerator() {
        new BCJcaJceHelper();
        this.f91733a = new V2TBSCertListGenerator();
        this.f91737e = new X509ExtensionsGenerator();
    }

    public final X509CRLObject a(TBSCertList tBSCertList, byte[] bArr) throws CRLException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(tBSCertList);
        aSN1EncodableVector.add(this.f91735c);
        aSN1EncodableVector.add(new DERBitString(bArr));
        return new X509CRLObject(new CertificateList(new DERSequence(aSN1EncodableVector)));
    }

    public void addCRL(X509CRL x509crl) throws CRLException {
        Set<? extends X509CRLEntry> revokedCertificates = x509crl.getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator<? extends X509CRLEntry> it = revokedCertificates.iterator();
            while (it.hasNext()) {
                try {
                    this.f91733a.addCRLEntry(ASN1Sequence.getInstance(new ASN1InputStream(it.next().getEncoded()).readObject()));
                } catch (IOException e5) {
                    throw new CRLException("exception processing encoding of CRL: " + e5.toString());
                }
            }
        }
    }

    public void addCRLEntry(BigInteger bigInteger, Date date, int i10) {
        this.f91733a.addCRLEntry(new ASN1Integer(bigInteger), new Time(date), i10);
    }

    public void addExtension(String str, boolean z10, ASN1Encodable aSN1Encodable) {
        addExtension(new ASN1ObjectIdentifier(str), z10, aSN1Encodable);
    }

    public X509CRL generate(PrivateKey privateKey) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        return generate(privateKey, (SecureRandom) null);
    }

    public X509CRL generateX509CRL(PrivateKey privateKey) throws SignatureException, SecurityException, InvalidKeyException {
        try {
            return generateX509CRL(privateKey, BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public Iterator getSignatureAlgNames() {
        return e.d();
    }

    public void reset() {
        this.f91733a = new V2TBSCertListGenerator();
        this.f91737e.reset();
    }

    public void setIssuerDN(X500Principal x500Principal) {
        try {
            this.f91733a.setIssuer(new X509Principal(x500Principal.getEncoded()));
        } catch (IOException e5) {
            throw new IllegalArgumentException(ad.e.d("can't process principal: ", e5));
        }
    }

    public void setNextUpdate(Date date) {
        this.f91733a.setNextUpdate(new Time(date));
    }

    public void setSignatureAlgorithm(String str) {
        this.f91736d = str;
        try {
            ASN1ObjectIdentifier aSN1ObjectIdentifierE = e.e(str);
            this.f91734b = aSN1ObjectIdentifierE;
            AlgorithmIdentifier algorithmIdentifierI = e.i(str, aSN1ObjectIdentifierE);
            this.f91735c = algorithmIdentifierI;
            this.f91733a.setSignature(algorithmIdentifierI);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested");
        }
    }

    public void setThisUpdate(Date date) {
        this.f91733a.setThisUpdate(new Time(date));
    }

    public void addCRLEntry(BigInteger bigInteger, Date date, int i10, Date date2) {
        this.f91733a.addCRLEntry(new ASN1Integer(bigInteger), new Time(date), i10, new ASN1GeneralizedTime(date2));
    }

    public void addExtension(String str, boolean z10, byte[] bArr) {
        addExtension(new ASN1ObjectIdentifier(str), z10, bArr);
    }

    public X509CRL generate(PrivateKey privateKey, String str) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
        return generate(privateKey, str, null);
    }

    public X509CRL generateX509CRL(PrivateKey privateKey, String str) throws SignatureException, SecurityException, InvalidKeyException, NoSuchProviderException {
        return generateX509CRL(privateKey, str, null);
    }

    public void addCRLEntry(BigInteger bigInteger, Date date, X509Extensions x509Extensions) {
        this.f91733a.addCRLEntry(new ASN1Integer(bigInteger), new Time(date), Extensions.getInstance(x509Extensions));
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z10, ASN1Encodable aSN1Encodable) {
        this.f91737e.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z10, aSN1Encodable);
    }

    public X509CRL generate(PrivateKey privateKey, String str, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException, NoSuchProviderException {
        X509ExtensionsGenerator x509ExtensionsGenerator = this.f91737e;
        if (!x509ExtensionsGenerator.isEmpty()) {
            this.f91733a.setExtensions(x509ExtensionsGenerator.generate());
        }
        TBSCertList tBSCertListGenerateTBSCertList = this.f91733a.generateTBSCertList();
        try {
            return a(tBSCertListGenerateTBSCertList, e.a(this.f91734b, this.f91736d, str, privateKey, secureRandom, tBSCertListGenerateTBSCertList));
        } catch (IOException e5) {
            throw new a(e5);
        }
    }

    public X509CRL generateX509CRL(PrivateKey privateKey, String str, SecureRandom secureRandom) throws SignatureException, InvalidKeyException, SecurityException, NoSuchProviderException {
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
        this.f91737e.addExtension(new ASN1ObjectIdentifier(aSN1ObjectIdentifier.getId()), z10, bArr);
    }

    public X509CRL generateX509CRL(PrivateKey privateKey, SecureRandom secureRandom) throws SignatureException, SecurityException, InvalidKeyException {
        try {
            return generateX509CRL(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public X509CRL generate(PrivateKey privateKey, SecureRandom secureRandom) throws IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CRLException {
        X509ExtensionsGenerator x509ExtensionsGenerator = this.f91737e;
        if (!x509ExtensionsGenerator.isEmpty()) {
            this.f91733a.setExtensions(x509ExtensionsGenerator.generate());
        }
        TBSCertList tBSCertListGenerateTBSCertList = this.f91733a.generateTBSCertList();
        try {
            return a(tBSCertListGenerateTBSCertList, e.b(this.f91734b, this.f91736d, privateKey, secureRandom, tBSCertListGenerateTBSCertList));
        } catch (IOException e5) {
            throw new a(e5);
        }
    }

    public void setIssuerDN(X509Name x509Name) {
        this.f91733a.setIssuer(x509Name);
    }
}
