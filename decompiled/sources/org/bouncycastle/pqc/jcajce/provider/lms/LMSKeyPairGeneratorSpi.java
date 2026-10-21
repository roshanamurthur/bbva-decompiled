package org.bouncycastle.pqc.jcajce.provider.lms;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.HSSKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.HSSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.lms.LMSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.lms.LMSParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.pqc.jcajce.spec.LMSHSSParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.LMSParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class LMSKeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public KeyGenerationParameters f91446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AsymmetricCipherKeyPairGenerator f91447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SecureRandom f91448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f91449d;

    public LMSKeyPairGeneratorSpi() {
        super("LMS");
        this.f91447b = new LMSKeyPairGenerator();
        this.f91448c = CryptoServicesRegistrar.getSecureRandom();
        this.f91449d = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.f91449d) {
            LMSKeyGenerationParameters lMSKeyGenerationParameters = new LMSKeyGenerationParameters(new LMSParameters(LMSigParameters.lms_sha256_n32_h10, LMOtsParameters.sha256_n32_w2), this.f91448c);
            this.f91446a = lMSKeyGenerationParameters;
            this.f91447b.init(lMSKeyGenerationParameters);
            this.f91449d = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.f91447b.generateKeyPair();
        if (this.f91447b instanceof LMSKeyPairGenerator) {
            return new KeyPair(new BCLMSPublicKey((LMSPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCLMSPrivateKey((LMSPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
        }
        return new KeyPair(new BCLMSPublicKey((HSSPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCLMSPrivateKey((HSSPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        AsymmetricCipherKeyPairGenerator hSSKeyPairGenerator;
        if (algorithmParameterSpec instanceof LMSParameterSpec) {
            LMSParameterSpec lMSParameterSpec = (LMSParameterSpec) algorithmParameterSpec;
            this.f91446a = new LMSKeyGenerationParameters(new LMSParameters(lMSParameterSpec.getSigParams(), lMSParameterSpec.getOtsParams()), secureRandom);
            hSSKeyPairGenerator = new LMSKeyPairGenerator();
        } else {
            if (!(algorithmParameterSpec instanceof LMSHSSParameterSpec)) {
                throw new InvalidAlgorithmParameterException("parameter object not a LMSParameterSpec/LMSHSSParameterSpec");
            }
            LMSParameterSpec[] lMSSpecs = ((LMSHSSParameterSpec) algorithmParameterSpec).getLMSSpecs();
            LMSParameters[] lMSParametersArr = new LMSParameters[lMSSpecs.length];
            for (int i10 = 0; i10 != lMSSpecs.length; i10++) {
                lMSParametersArr[i10] = new LMSParameters(lMSSpecs[i10].getSigParams(), lMSSpecs[i10].getOtsParams());
            }
            this.f91446a = new HSSKeyGenerationParameters(lMSParametersArr, secureRandom);
            hSSKeyPairGenerator = new HSSKeyPairGenerator();
        }
        this.f91447b = hSSKeyPairGenerator;
        hSSKeyPairGenerator.init(this.f91446a);
        this.f91449d = true;
    }
}
