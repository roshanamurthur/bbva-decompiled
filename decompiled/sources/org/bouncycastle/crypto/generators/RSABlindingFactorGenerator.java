package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class RSABlindingFactorGenerator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f88785c = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f88786d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RSAKeyParameters f88787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f88788b;

    public BigInteger generateBlindingFactor() {
        RSAKeyParameters rSAKeyParameters = this.f88787a;
        if (rSAKeyParameters == null) {
            throw new IllegalStateException("generator not initialised");
        }
        BigInteger modulus = rSAKeyParameters.getModulus();
        int iBitLength = modulus.bitLength() - 1;
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.f88788b);
            BigInteger bigIntegerGcd = bigIntegerCreateRandomBigInteger.gcd(modulus);
            if (!bigIntegerCreateRandomBigInteger.equals(f88785c)) {
                BigInteger bigInteger = f88786d;
                if (!bigIntegerCreateRandomBigInteger.equals(bigInteger) && bigIntegerGcd.equals(bigInteger)) {
                    return bigIntegerCreateRandomBigInteger;
                }
            }
        }
    }

    public void init(CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f88787a = (RSAKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.f88787a = (RSAKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.f88788b = secureRandom;
        if (this.f88787a instanceof RSAPrivateCrtKeyParameters) {
            throw new IllegalArgumentException("generator requires RSA public key");
        }
    }
}
