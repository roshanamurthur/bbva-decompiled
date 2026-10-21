package org.bouncycastle.pqc.jcajce.provider.lms;

import b4.o;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSSigner;
import org.bouncycastle.pqc.crypto.lms.LMSKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSSigner;

/* JADX INFO: loaded from: classes13.dex */
public class LMSSignatureSpi extends Signature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f91450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MessageSigner f91451b;

    public static class generic extends LMSSignatureSpi {
        public generic() {
            super("LMS", new NullDigest());
        }
    }

    public LMSSignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCLMSPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to XMSS");
        }
        LMSKeyParameters lMSKeyParameters = ((BCLMSPrivateKey) privateKey).f91443p0;
        this.f91451b = lMSKeyParameters instanceof HSSPrivateKeyParameters ? new HSSSigner() : new LMSSigner();
        this.f91450a.reset();
        this.f91451b.init(true, lMSKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCLMSPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to XMSS");
        }
        LMSKeyParameters lMSKeyParameters = ((BCLMSPublicKey) publicKey).f91445p0;
        this.f91450a.reset();
        this.f91451b = lMSKeyParameters instanceof LMSPublicKeyParameters ? new LMSSigner() : new HSSSigner();
        this.f91451b.init(false, lMSKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f91451b.generateSignature(o.c(this.f91450a));
        } catch (Exception e5) {
            if (e5 instanceof IllegalStateException) {
                throw new SignatureException(e5.getMessage(), e5);
            }
            throw new SignatureException(e5.toString(), e5);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f91450a.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f91451b.verifySignature(o.c(this.f91450a), bArr);
    }

    public LMSSignatureSpi(String str, Digest digest) {
        super(str);
        this.f91450a = digest;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f91450a.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        engineInitSign(privateKey);
    }
}
