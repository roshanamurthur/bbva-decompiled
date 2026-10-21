package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;

/* JADX INFO: loaded from: classes13.dex */
public class NHKeyPairGeneratorSpi extends KeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NHKeyPairGenerator f91474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecureRandom f91475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91476c;

    public NHKeyPairGeneratorSpi() {
        super("NH");
        this.f91474a = new NHKeyPairGenerator();
        this.f91475b = CryptoServicesRegistrar.getSecureRandom();
        this.f91476c = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        boolean z10 = this.f91476c;
        NHKeyPairGenerator nHKeyPairGenerator = this.f91474a;
        if (!z10) {
            nHKeyPairGenerator.init(new KeyGenerationParameters(this.f91475b, 1024));
            this.f91476c = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = nHKeyPairGenerator.generateKeyPair();
        return new KeyPair(new BCNHPublicKey((NHPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCNHPrivateKey((NHPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i10, SecureRandom secureRandom) {
        if (i10 != 1024) {
            throw new IllegalArgumentException("strength must be 1024 bits");
        }
        this.f91474a.init(new KeyGenerationParameters(secureRandom, 1024));
        this.f91476c = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("parameter object not recognised");
    }
}
