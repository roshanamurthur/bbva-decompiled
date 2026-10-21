package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public class X25519KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecureRandom f88791a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        X25519PrivateKeyParameters x25519PrivateKeyParameters = new X25519PrivateKeyParameters(this.f88791a);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) x25519PrivateKeyParameters.generatePublicKey(), (AsymmetricKeyParameter) x25519PrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88791a = keyGenerationParameters.getRandom();
    }
}
