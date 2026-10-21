package org.bouncycastle.crypto.generators;

import im.b;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class DHParametersGenerator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f88701d = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f88704c;

    public DHParameters generateParameters() {
        BigInteger bigIntegerModPow;
        BigInteger[] bigIntegerArrA = b.a(this.f88702a, this.f88703b, this.f88704c);
        BigInteger bigInteger = bigIntegerArrA[0];
        BigInteger bigInteger2 = bigIntegerArrA[1];
        SecureRandom secureRandom = this.f88704c;
        BigInteger bigInteger3 = b.f69727b;
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
        do {
            bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger3, bigIntegerSubtract, secureRandom).modPow(bigInteger3, bigInteger);
        } while (bigIntegerModPow.equals(b.f69726a));
        return new DHParameters(bigInteger, bigIntegerModPow, bigInteger2, f88701d, (DHValidationParameters) null);
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.f88702a = i10;
        this.f88703b = i11;
        this.f88704c = secureRandom;
    }
}
