package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class ECKeyPairGenerator implements AsymmetricCipherKeyPairGenerator, ECConstants {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ECDomainParameters f88716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f88717b;

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger n7 = this.f88716a.getN();
        int iBitLength = n7.bitLength();
        int i10 = iBitLength >>> 2;
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.f88717b);
            if (bigIntegerCreateRandomBigInteger.compareTo(ECConstants.ONE) >= 0 && bigIntegerCreateRandomBigInteger.compareTo(n7) < 0 && WNafUtil.getNafWeight(bigIntegerCreateRandomBigInteger) >= i10) {
                return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new ECPublicKeyParameters(createBasePointMultiplier().multiply(this.f88716a.getG(), bigIntegerCreateRandomBigInteger), this.f88716a), (AsymmetricKeyParameter) new ECPrivateKeyParameters(bigIntegerCreateRandomBigInteger, this.f88716a));
            }
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        ECKeyGenerationParameters eCKeyGenerationParameters = (ECKeyGenerationParameters) keyGenerationParameters;
        this.f88717b = eCKeyGenerationParameters.getRandom();
        this.f88716a = eCKeyGenerationParameters.getDomainParameters();
        if (this.f88717b == null) {
            this.f88717b = CryptoServicesRegistrar.getSecureRandom();
        }
    }
}
