package org.bouncycastle.pqc.jcajce.provider.qtesla;

import af.c;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.pqc.crypto.qtesla.QTESLASigner;

/* JADX INFO: loaded from: classes13.dex */
public class SignatureSpi extends Signature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f91484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QTESLASigner f91485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f91486c;

    public static class PI extends SignatureSpi {
        public PI() {
            super(QTESLASecurityCategory.getName(5), new NullDigest(), new QTESLASigner());
        }
    }

    public static class PIII extends SignatureSpi {
        public PIII() {
            super(QTESLASecurityCategory.getName(6), new NullDigest(), new QTESLASigner());
        }
    }

    public static class qTESLA extends SignatureSpi {
        public qTESLA() {
            super("qTESLA", new NullDigest(), new QTESLASigner());
        }
    }

    public SignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof BCqTESLAPrivateKey)) {
            throw new InvalidKeyException("unknown private key passed to qTESLA");
        }
        CipherParameters parametersWithRandom = ((BCqTESLAPrivateKey) privateKey).f91477p0;
        SecureRandom secureRandom = this.f91486c;
        if (secureRandom != null) {
            parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
        }
        this.f91485b.init(true, parametersWithRandom);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof BCqTESLAPublicKey)) {
            throw new InvalidKeyException("unknown public key passed to qTESLA");
        }
        QTESLAPublicKeyParameters qTESLAPublicKeyParameters = ((BCqTESLAPublicKey) publicKey).f91479p0;
        this.f91484a.reset();
        this.f91485b.init(false, qTESLAPublicKeyParameters);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f91485b.generateSignature(c.b(this.f91484a));
        } catch (Exception e5) {
            if (e5 instanceof IllegalStateException) {
                throw new SignatureException(e5.getMessage());
            }
            throw new SignatureException(e5.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f91484a.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f91485b.verifySignature(c.b(this.f91484a), bArr);
    }

    public SignatureSpi(String str, Digest digest, QTESLASigner qTESLASigner) {
        super(str);
        this.f91484a = digest;
        this.f91485b = qTESLASigner;
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f91484a.update(bArr, i10, i11);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f91486c = secureRandom;
        engineInitSign(privateKey);
    }
}
