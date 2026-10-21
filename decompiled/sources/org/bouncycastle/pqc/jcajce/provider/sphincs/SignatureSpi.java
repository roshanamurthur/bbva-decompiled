package org.bouncycastle.pqc.jcajce.provider.sphincs;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCS256Signer;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;

/* JADX INFO: loaded from: classes13.dex */
public class SignatureSpi extends java.security.SignatureSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ASN1ObjectIdentifier f91508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Digest f91509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SPHINCS256Signer f91510c;

    public static class withSha3_512 extends SignatureSpi {
        public withSha3_512() {
            super(new SHA3Digest(512), NISTObjectIdentifiers.id_sha3_256, new SPHINCS256Signer(new SHA3Digest(256), new SHA3Digest(512)));
        }
    }

    public static class withSha512 extends SignatureSpi {
        public withSha512() {
            super(new SHA512Digest(), NISTObjectIdentifiers.id_sha512_256, new SPHINCS256Signer(new SHA512tDigest(256), new SHA512Digest()));
        }
    }

    public SignatureSpi(Digest digest, ASN1ObjectIdentifier aSN1ObjectIdentifier, SPHINCS256Signer sPHINCS256Signer) {
        this.f91509b = digest;
        this.f91508a = aSN1ObjectIdentifier;
        this.f91510c = sPHINCS256Signer;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCSphincs256PrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to SPHINCS-256");
        }
        BCSphincs256PrivateKey bCSphincs256PrivateKey = (BCSphincs256PrivateKey) privateKey;
        if (!this.f91508a.equals((ASN1Primitive) bCSphincs256PrivateKey.f91503p0)) {
            throw new InvalidKeyException("SPHINCS-256 signature for tree digest: " + bCSphincs256PrivateKey.f91503p0);
        }
        SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters = bCSphincs256PrivateKey.f91504q0;
        this.f91509b.reset();
        this.f91510c.init(true, sPHINCSPrivateKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCSphincs256PublicKey)) {
            throw new InvalidKeyException("unknown public key passed to SPHINCS-256");
        }
        BCSphincs256PublicKey bCSphincs256PublicKey = (BCSphincs256PublicKey) publicKey;
        if (!this.f91508a.equals((ASN1Primitive) bCSphincs256PublicKey.f91506p0)) {
            throw new InvalidKeyException("SPHINCS-256 signature for tree digest: " + bCSphincs256PublicKey.f91506p0);
        }
        SPHINCSPublicKeyParameters sPHINCSPublicKeyParameters = bCSphincs256PublicKey.f91507q0;
        this.f91509b.reset();
        this.f91510c.init(false, sPHINCSPublicKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        Digest digest = this.f91509b;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        try {
            return this.f91510c.generateSignature(bArr);
        } catch (Exception e5) {
            throw new SignatureException(e5.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f91509b.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        Digest digest = this.f91509b;
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr2, 0);
        return this.f91510c.verifySignature(bArr2, bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f91509b.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        engineInitSign(privateKey);
    }
}
