package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyPairGenerator;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowKeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RainbowKeyPairGenerator f91497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f91498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91499c;

    public RainbowKeyPairGeneratorSpi() {
        super("Rainbow");
        this.f91497a = new RainbowKeyPairGenerator();
        this.f91498b = CryptoServicesRegistrar.getSecureRandom();
        this.f91499c = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        boolean z10 = this.f91499c;
        RainbowKeyPairGenerator rainbowKeyPairGenerator = this.f91497a;
        if (!z10) {
            rainbowKeyPairGenerator.init(new RainbowKeyGenerationParameters(this.f91498b, new RainbowParameters(new RainbowParameterSpec().getVi())));
            this.f91499c = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = rainbowKeyPairGenerator.generateKeyPair();
        return new KeyPair(new BCRainbowPublicKey((RainbowPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCRainbowPrivateKey((RainbowPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        this.f91498b = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RainbowParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RainbowParameterSpec");
        }
        this.f91497a.init(new RainbowKeyGenerationParameters(secureRandom, new RainbowParameters(((RainbowParameterSpec) algorithmParameterSpec).getVi())));
        this.f91499c = true;
    }
}
