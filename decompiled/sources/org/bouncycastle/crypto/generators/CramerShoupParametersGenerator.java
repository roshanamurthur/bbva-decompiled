package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.CramerShoupParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class CramerShoupParametersGenerator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f88694d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f88697c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BigInteger f88698a = BigInteger.valueOf(2);

        public static BigInteger a(BigInteger bigInteger, SecureRandom secureRandom) {
            BigInteger bigIntegerModPow;
            BigInteger bigInteger2 = f88698a;
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            do {
                bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger2, bigIntegerSubtract, secureRandom).modPow(bigInteger2, bigInteger);
            } while (bigIntegerModPow.equals(CramerShoupParametersGenerator.f88694d));
            return bigIntegerModPow;
        }
    }

    public CramerShoupParameters generateParameters() {
        BigInteger bigIntegerCreateRandomPrime;
        BigInteger bigIntegerA;
        int i10 = this.f88695a;
        int i11 = this.f88696b;
        SecureRandom secureRandom = this.f88697c;
        BigInteger bigInteger = a.f88698a;
        int i12 = i10 - 1;
        while (true) {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i12, 2, secureRandom);
            if (bigIntegerCreateRandomPrime.shiftLeft(1).add(f88694d).isProbablePrime(i11) && (i11 <= 2 || bigIntegerCreateRandomPrime.isProbablePrime(i11))) {
                break;
            }
        }
        BigInteger bigIntegerA2 = a.a(bigIntegerCreateRandomPrime, this.f88697c);
        do {
            bigIntegerA = a.a(bigIntegerCreateRandomPrime, this.f88697c);
        } while (bigIntegerA2.equals(bigIntegerA));
        return new CramerShoupParameters(bigIntegerCreateRandomPrime, bigIntegerA2, bigIntegerA, new SHA256Digest());
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.f88695a = i10;
        this.f88696b = i11;
        this.f88697c = secureRandom;
    }

    public CramerShoupParameters generateParameters(DHParameters dHParameters) {
        BigInteger bigIntegerA;
        BigInteger p4 = dHParameters.getP();
        BigInteger g6 = dHParameters.getG();
        do {
            bigIntegerA = a.a(p4, this.f88697c);
        } while (g6.equals(bigIntegerA));
        return new CramerShoupParameters(p4, g6, bigIntegerA, new SHA256Digest());
    }
}
