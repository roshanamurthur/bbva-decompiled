package org.bouncycastle.crypto.generators;

import im.b;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class ElGamalParametersGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f88723c;

    public ElGamalParameters generateParameters() {
        BigInteger bigIntegerModPow;
        BigInteger bigInteger = b.a(this.f88721a, this.f88722b, this.f88723c)[0];
        SecureRandom secureRandom = this.f88723c;
        BigInteger bigInteger2 = b.f69727b;
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
        do {
            bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger2, bigIntegerSubtract, secureRandom).modPow(bigInteger2, bigInteger);
        } while (bigIntegerModPow.equals(b.f69726a));
        return new ElGamalParameters(bigInteger, bigIntegerModPow);
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.f88721a = i10;
        this.f88722b = i11;
        this.f88723c = secureRandom;
    }
}
