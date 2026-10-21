package org.bouncycastle.jce.netscape;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes8.dex */
public class NetscapeCertRequest extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AlgorithmIdentifier f90366p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public AlgorithmIdentifier f90367q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f90368r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f90369s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final DERBitString f90370t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PublicKey f90371u0;

    public NetscapeCertRequest(String str, AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        this.f90369s0 = str;
        this.f90366p0 = algorithmIdentifier;
        this.f90371u0 = publicKey;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(a());
        aSN1EncodableVector.add(new DERIA5String(str));
        try {
            this.f90370t0 = new DERBitString(new DERSequence(aSN1EncodableVector));
        } catch (IOException e5) {
            throw new InvalidKeySpecException("exception encoding key: " + e5.toString());
        }
    }

    public final ASN1Primitive a() throws InvalidKeySpecException, NoSuchAlgorithmException, NoSuchProviderException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.f90371u0.getEncoded());
            byteArrayOutputStream.close();
            return new ASN1InputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (IOException e5) {
            throw new InvalidKeySpecException(e5.getMessage());
        }
    }

    public String getChallenge() {
        return this.f90369s0;
    }

    public AlgorithmIdentifier getKeyAlgorithm() {
        return this.f90367q0;
    }

    public PublicKey getPublicKey() {
        return this.f90371u0;
    }

    public AlgorithmIdentifier getSigningAlgorithm() {
        return this.f90366p0;
    }

    public void setChallenge(String str) {
        this.f90369s0 = str;
    }

    public void setKeyAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
        this.f90367q0 = algorithmIdentifier;
    }

    public void setPublicKey(PublicKey publicKey) {
        this.f90371u0 = publicKey;
    }

    public void setSigningAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
        this.f90366p0 = algorithmIdentifier;
    }

    public void sign(PrivateKey privateKey) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        sign(privateKey, null);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        try {
            aSN1EncodableVector2.add(a());
        } catch (Exception unused) {
        }
        aSN1EncodableVector2.add(new DERIA5String(this.f90369s0));
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(this.f90366p0);
        aSN1EncodableVector.add(new DERBitString(this.f90368r0));
        return new DERSequence(aSN1EncodableVector);
    }

    public boolean verify(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        if (!str.equals(this.f90369s0)) {
            return false;
        }
        Signature signature = Signature.getInstance(this.f90366p0.getAlgorithm().getId(), BouncyCastleProvider.PROVIDER_NAME);
        signature.initVerify(this.f90371u0);
        signature.update(this.f90370t0.getBytes());
        return signature.verify(this.f90368r0);
    }

    public NetscapeCertRequest(ASN1Sequence aSN1Sequence) {
        try {
            if (aSN1Sequence.size() != 3) {
                throw new IllegalArgumentException("invalid SPKAC (size):" + aSN1Sequence.size());
            }
            this.f90366p0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
            this.f90368r0 = ((DERBitString) aSN1Sequence.getObjectAt(2)).getOctets();
            ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(0);
            if (aSN1Sequence2.size() != 2) {
                throw new IllegalArgumentException("invalid PKAC (len): " + aSN1Sequence2.size());
            }
            this.f90369s0 = ((DERIA5String) aSN1Sequence2.getObjectAt(1)).getString();
            this.f90370t0 = new DERBitString(aSN1Sequence2);
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(aSN1Sequence2.getObjectAt(0));
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(new DERBitString(subjectPublicKeyInfo).getBytes());
            AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            this.f90367q0 = algorithm;
            this.f90371u0 = KeyFactory.getInstance(algorithm.getAlgorithm().getId(), BouncyCastleProvider.PROVIDER_NAME).generatePublic(x509EncodedKeySpec);
        } catch (Exception e5) {
            throw new IllegalArgumentException(e5.toString());
        }
    }

    public void sign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        Signature signature = Signature.getInstance(this.f90366p0.getAlgorithm().getId(), BouncyCastleProvider.PROVIDER_NAME);
        if (secureRandom != null) {
            signature.initSign(privateKey, secureRandom);
        } else {
            signature.initSign(privateKey);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(a());
        aSN1EncodableVector.add(new DERIA5String(this.f90369s0));
        try {
            signature.update(new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER));
            this.f90368r0 = signature.sign();
        } catch (IOException e5) {
            throw new SignatureException(e5.getMessage());
        }
    }

    public NetscapeCertRequest(byte[] bArr) throws IOException {
        this(ASN1Sequence.getInstance(new ASN1InputStream(new ByteArrayInputStream(bArr)).readObject()));
    }
}
