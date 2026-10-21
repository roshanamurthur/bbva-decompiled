package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class RandomDSAKCalculator implements DSAKCalculator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f89594c = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BigInteger f89595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f89596b;

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public boolean isDeterministic() {
        return false;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public BigInteger nextK() {
        int iBitLength = this.f89595a.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.f89596b);
            if (!bigIntegerCreateRandomBigInteger.equals(f89594c) && bigIntegerCreateRandomBigInteger.compareTo(this.f89595a) < 0) {
                return bigIntegerCreateRandomBigInteger;
            }
        }
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        this.f89595a = bigInteger;
        this.f89596b = secureRandom;
    }
}
