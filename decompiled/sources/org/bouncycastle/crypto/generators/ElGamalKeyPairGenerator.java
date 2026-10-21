package org.bouncycastle.crypto.generators;

import im.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;

/* JADX INFO: loaded from: classes4.dex */
public class ElGamalKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ElGamalKeyGenerationParameters f88720a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigInteger = a.f69724a;
        ElGamalParameters parameters = this.f88720a.getParameters();
        DHParameters dHParameters = new DHParameters(parameters.getP(), parameters.getG(), null, parameters.getL());
        BigInteger bigIntegerA = a.a(this.f88720a.getRandom(), dHParameters);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new ElGamalPublicKeyParameters(dHParameters.getG().modPow(bigIntegerA, dHParameters.getP()), parameters), (AsymmetricKeyParameter) new ElGamalPrivateKeyParameters(bigIntegerA, parameters));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88720a = (ElGamalKeyGenerationParameters) keyGenerationParameters;
    }
}
