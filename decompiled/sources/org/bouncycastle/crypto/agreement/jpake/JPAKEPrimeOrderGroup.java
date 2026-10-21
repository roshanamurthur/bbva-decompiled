package org.bouncycastle.crypto.agreement.jpake;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class JPAKEPrimeOrderGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f87920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f87921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger f87922c;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }

    public BigInteger getG() {
        return this.f87922c;
    }

    public BigInteger getP() {
        return this.f87920a;
    }

    public BigInteger getQ() {
        return this.f87921b;
    }

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z10) {
        JPAKEUtil.validateNotNull(bigInteger, "p");
        JPAKEUtil.validateNotNull(bigInteger2, "q");
        JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z10) {
            BigInteger bigInteger4 = JPAKEUtil.f87934b;
            if (!bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.f87933a)) {
                throw new IllegalArgumentException("p-1 must be evenly divisible by q");
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(bigInteger4)) == 1) {
                throw new IllegalArgumentException("g must be in [2, p-1]");
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                throw new IllegalArgumentException("g^q mod p must equal 1");
            }
            if (!bigInteger.isProbablePrime(20)) {
                throw new IllegalArgumentException("p must be prime");
            }
            if (!bigInteger2.isProbablePrime(20)) {
                throw new IllegalArgumentException("q must be prime");
            }
        }
        this.f87920a = bigInteger;
        this.f87921b = bigInteger2;
        this.f87922c = bigInteger3;
    }
}
