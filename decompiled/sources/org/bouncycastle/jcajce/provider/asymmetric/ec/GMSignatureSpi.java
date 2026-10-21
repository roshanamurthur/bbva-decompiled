package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import om.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.SM2Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.SM2ParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;

/* JADX INFO: loaded from: classes8.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BCJcaJceHelper f89841a = new BCJcaJceHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AlgorithmParameters f89842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SM2ParameterSpec f89843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SM2Signer f89844d;

    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new SM2Signer(new SHA256Digest()));
        }
    }

    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new SM2Signer());
        }
    }

    public GMSignatureSpi(SM2Signer sM2Signer) {
        this.f89844d = sM2Signer;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.f89842b == null && this.f89843c != null) {
            try {
                AlgorithmParameters algorithmParametersCreateAlgorithmParameters = this.f89841a.createAlgorithmParameters("PSS");
                this.f89842b = algorithmParametersCreateAlgorithmParameters;
                algorithmParametersCreateAlgorithmParameters.init(this.f89843c);
            } catch (Exception e5) {
                throw new RuntimeException(e5.toString());
            }
        }
        return this.f89842b;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        CipherParameters cipherParametersGeneratePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            cipherParametersGeneratePrivateKeyParameter = new ParametersWithRandom(cipherParametersGeneratePrivateKeyParameter, secureRandom);
        }
        SM2ParameterSpec sM2ParameterSpec = this.f89843c;
        SM2Signer sM2Signer = this.f89844d;
        if (sM2ParameterSpec != null) {
            sM2Signer.init(true, new ParametersWithID(cipherParametersGeneratePrivateKeyParameter, sM2ParameterSpec.getID()));
        } else {
            sM2Signer.init(true, cipherParametersGeneratePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        CipherParameters cipherParametersA = a.a(publicKey);
        SM2ParameterSpec sM2ParameterSpec = this.f89843c;
        if (sM2ParameterSpec != null) {
            cipherParametersA = new ParametersWithID(cipherParametersA, sM2ParameterSpec.getID());
        }
        this.f89844d.init(false, cipherParametersA);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f89844d.generateSignature();
        } catch (CryptoException e5) {
            throw new SignatureException("unable to create signature: " + e5.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b10) throws SignatureException {
        this.f89844d.update(b10);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f89844d.verifySignature(bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof SM2ParameterSpec)) {
            throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
        }
        this.f89843c = (SM2ParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) throws SignatureException {
        this.f89844d.update(bArr, i10, i11);
    }
}
