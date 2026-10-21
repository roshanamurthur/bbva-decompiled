package org.bouncycastle.crypto.generators;

import androidx.appcompat.widget.a;
import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class RSAKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f88789b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RSAKeyGenerationParameters f88790a;

    public BigInteger chooseRandomPrime(int i10, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i11 = 0; i11 != i10 * 5; i11++) {
            BigInteger bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i10, 1, this.f88790a.getRandom());
            BigInteger bigIntegerMod = bigIntegerCreateRandomPrime.mod(bigInteger);
            BigInteger bigInteger3 = f88789b;
            if (!bigIntegerMod.equals(bigInteger3) && bigIntegerCreateRandomPrime.multiply(bigIntegerCreateRandomPrime).compareTo(bigInteger2) >= 0 && isProbablePrime(bigIntegerCreateRandomPrime) && bigInteger.gcd(bigIntegerCreateRandomPrime.subtract(bigInteger3)).equals(bigInteger3)) {
                return bigIntegerCreateRandomPrime;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger bigIntegerChooseRandomPrime;
        BigInteger bigIntegerMultiply;
        BigInteger bigInteger;
        this = this;
        int strength = this.f88790a.getStrength();
        int i10 = (strength + 1) / 2;
        int i11 = strength - i10;
        int i12 = strength / 2;
        int i13 = i12 - 100;
        int i14 = strength / 3;
        if (i13 < i14) {
            i13 = i14;
        }
        int i15 = strength >> 2;
        BigInteger bigIntegerPow = BigInteger.valueOf(2L).pow(i12);
        BigInteger bigInteger2 = f88789b;
        BigInteger bigIntegerShiftLeft = bigInteger2.shiftLeft(strength - 1);
        BigInteger bigIntegerShiftLeft2 = bigInteger2.shiftLeft(i13);
        AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z10 = false;
        while (!z10) {
            BigInteger publicExponent = this.f88790a.getPublicExponent();
            BigInteger bigIntegerChooseRandomPrime2 = this.chooseRandomPrime(i10, publicExponent, bigIntegerShiftLeft);
            while (true) {
                bigIntegerChooseRandomPrime = this.chooseRandomPrime(i11, publicExponent, bigIntegerShiftLeft);
                BigInteger bigIntegerAbs = bigIntegerChooseRandomPrime.subtract(bigIntegerChooseRandomPrime2).abs();
                i11 = i11;
                if (bigIntegerAbs.bitLength() >= i13 && bigIntegerAbs.compareTo(bigIntegerShiftLeft2) > 0) {
                    bigIntegerMultiply = bigIntegerChooseRandomPrime2.multiply(bigIntegerChooseRandomPrime);
                    if (bigIntegerMultiply.bitLength() == strength) {
                        if (WNafUtil.getNafWeight(bigIntegerMultiply) >= i15) {
                            break;
                        }
                        bigIntegerChooseRandomPrime2 = this.chooseRandomPrime(i10, publicExponent, bigIntegerShiftLeft);
                    } else {
                        bigIntegerChooseRandomPrime2 = bigIntegerChooseRandomPrime2.max(bigIntegerChooseRandomPrime);
                    }
                } else {
                    this = this;
                    strength = strength;
                }
            }
            if (bigIntegerChooseRandomPrime2.compareTo(bigIntegerChooseRandomPrime) < 0) {
                bigInteger = bigIntegerChooseRandomPrime;
                bigIntegerChooseRandomPrime = bigIntegerChooseRandomPrime2;
            } else {
                bigInteger = bigIntegerChooseRandomPrime2;
            }
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            BigInteger bigIntegerSubtract2 = bigIntegerChooseRandomPrime.subtract(bigInteger2);
            strength = strength;
            BigInteger bigIntegerModInverse = publicExponent.modInverse(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2));
            if (bigIntegerModInverse.compareTo(bigIntegerPow) > 0) {
                asymmetricCipherKeyPair = new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RSAKeyParameters(false, bigIntegerMultiply, publicExponent), (AsymmetricKeyParameter) new RSAPrivateCrtKeyParameters(bigIntegerMultiply, publicExponent, bigIntegerModInverse, bigInteger, bigIntegerChooseRandomPrime, bigIntegerModInverse.remainder(bigIntegerSubtract), bigIntegerModInverse.remainder(bigIntegerSubtract2), bigIntegerChooseRandomPrime.modInverse(bigInteger)));
                z10 = true;
            }
        }
        return asymmetricCipherKeyPair;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88790a = (RSAKeyGenerationParameters) keyGenerationParameters;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public boolean isProbablePrime(BigInteger bigInteger) {
        int iA;
        int i10;
        int iBitLength = bigInteger.bitLength();
        int certainty = this.f88790a.getCertainty();
        int iA2 = 4;
        if (iBitLength >= 1536) {
            if (certainty <= 100) {
                iA2 = 3;
            } else if (certainty > 128) {
                iA2 = a.a(certainty, 127, 2, 4);
            }
        } else if (iBitLength < 1024) {
            if (iBitLength < 512) {
                iA = 40;
                if (certainty > 80) {
                    i10 = 79;
                    iA = a.a(certainty, i10, 2, iA);
                }
            } else if (certainty <= 80) {
                iA2 = 5;
            } else {
                iA = 7;
                if (certainty > 100) {
                    i10 = 99;
                    iA = a.a(certainty, i10, 2, iA);
                }
            }
            iA2 = iA;
        } else if (certainty > 100) {
            if (certainty <= 112) {
                iA2 = 5;
            } else {
                iA2 = a.a(certainty, 111, 2, 5);
            }
        }
        return !Primes.hasAnySmallFactors(bigInteger) && Primes.isMRProbablePrime(bigInteger, this.f88790a.getRandom(), iA2);
    }
}
