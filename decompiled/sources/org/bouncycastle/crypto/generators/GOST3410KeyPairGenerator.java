package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.GOST3410KeyGenerationParameters;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class GOST3410KeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GOST3410KeyGenerationParameters f88726a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        GOST3410Parameters parameters = this.f88726a.getParameters();
        SecureRandom random = this.f88726a.getRandom();
        BigInteger q10 = parameters.getQ();
        BigInteger p4 = parameters.getP();
        BigInteger a10 = parameters.getA();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(256, random);
            if (bigIntegerCreateRandomBigInteger.signum() >= 1 && bigIntegerCreateRandomBigInteger.compareTo(q10) < 0 && WNafUtil.getNafWeight(bigIntegerCreateRandomBigInteger) >= 64) {
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GOST3410PublicKeyParameters(a10.modPow(bigIntegerCreateRandomBigInteger, p4), parameters), (AsymmetricKeyParameter) new GOST3410PrivateKeyParameters(bigIntegerCreateRandomBigInteger, parameters));
            }
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88726a = (GOST3410KeyGenerationParameters) keyGenerationParameters;
    }
}
