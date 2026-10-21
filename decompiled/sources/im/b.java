package im;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f69726a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f69727b = BigInteger.valueOf(2);

    public static BigInteger[] a(int i10, int i11, SecureRandom secureRandom) {
        int i12 = i10 - 1;
        int i13 = i10 >>> 2;
        while (true) {
            BigInteger bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i12, 2, secureRandom);
            BigInteger bigIntegerAdd = bigIntegerCreateRandomPrime.shiftLeft(1).add(f69726a);
            if (bigIntegerAdd.isProbablePrime(i11) && (i11 <= 2 || bigIntegerCreateRandomPrime.isProbablePrime(i11 - 2))) {
                if (WNafUtil.getNafWeight(bigIntegerAdd) >= i13) {
                    return new BigInteger[]{bigIntegerAdd, bigIntegerCreateRandomPrime};
                }
            }
        }
    }
}
