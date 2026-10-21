package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class DSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f88705b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DSAKeyGenerationParameters f88706a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigIntegerCreateRandomInRange;
        DSAParameters parameters = this.f88706a.getParameters();
        BigInteger q10 = parameters.getQ();
        SecureRandom random = this.f88706a.getRandom();
        int iBitLength = q10.bitLength() >>> 2;
        do {
            BigInteger bigInteger = f88705b;
            bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger, q10.subtract(bigInteger), random);
        } while (WNafUtil.getNafWeight(bigIntegerCreateRandomInRange) < iBitLength);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new DSAPublicKeyParameters(parameters.getG().modPow(bigIntegerCreateRandomInRange, parameters.getP()), parameters), (AsymmetricKeyParameter) new DSAPrivateKeyParameters(bigIntegerCreateRandomInRange, parameters));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88706a = (DSAKeyGenerationParameters) keyGenerationParameters;
    }
}
