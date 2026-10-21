package org.bouncycastle.crypto.generators;

import im.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public class DHKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DHKeyGenerationParameters f88700a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigInteger = a.f69724a;
        DHParameters parameters = this.f88700a.getParameters();
        BigInteger bigIntegerA = a.a(this.f88700a.getRandom(), parameters);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new DHPublicKeyParameters(parameters.getG().modPow(bigIntegerA, parameters.getP()), parameters), (AsymmetricKeyParameter) new DHPrivateKeyParameters(bigIntegerA, parameters));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88700a = (DHKeyGenerationParameters) keyGenerationParameters;
    }
}
