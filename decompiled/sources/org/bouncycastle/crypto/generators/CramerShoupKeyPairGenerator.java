package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.CramerShoupKeyGenerationParameters;
import org.bouncycastle.crypto.params.CramerShoupParameters;
import org.bouncycastle.crypto.params.CramerShoupPrivateKeyParameters;
import org.bouncycastle.crypto.params.CramerShoupPublicKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class CramerShoupKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f88692b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CramerShoupKeyGenerationParameters f88693a;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        CramerShoupParameters parameters = this.f88693a.getParameters();
        SecureRandom random = this.f88693a.getRandom();
        BigInteger p4 = parameters.getP();
        BigInteger bigInteger = f88692b;
        CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = new CramerShoupPrivateKeyParameters(parameters, BigIntegers.createRandomInRange(bigInteger, p4.subtract(bigInteger), random), BigIntegers.createRandomInRange(bigInteger, p4.subtract(bigInteger), random), BigIntegers.createRandomInRange(bigInteger, p4.subtract(bigInteger), random), BigIntegers.createRandomInRange(bigInteger, p4.subtract(bigInteger), random), BigIntegers.createRandomInRange(bigInteger, p4.subtract(bigInteger), random));
        BigInteger g6 = parameters.getG1();
        BigInteger g7 = parameters.getG2();
        BigInteger p10 = parameters.getP();
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = new CramerShoupPublicKeyParameters(parameters, g6.modPow(cramerShoupPrivateKeyParameters.getX1(), p10).multiply(g7.modPow(cramerShoupPrivateKeyParameters.getX2(), p10)), g6.modPow(cramerShoupPrivateKeyParameters.getY1(), p10).multiply(g7.modPow(cramerShoupPrivateKeyParameters.getY2(), p10)), g6.modPow(cramerShoupPrivateKeyParameters.getZ(), p10));
        cramerShoupPrivateKeyParameters.setPk(cramerShoupPublicKeyParameters);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) cramerShoupPublicKeyParameters, (AsymmetricKeyParameter) cramerShoupPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88693a = (CramerShoupKeyGenerationParameters) keyGenerationParameters;
    }
}
