package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public class Ed448KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f88719a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        Ed448PrivateKeyParameters ed448PrivateKeyParameters = new Ed448PrivateKeyParameters(this.f88719a);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) ed448PrivateKeyParameters.generatePublicKey(), (AsymmetricKeyParameter) ed448PrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88719a = keyGenerationParameters.getRandom();
    }
}
