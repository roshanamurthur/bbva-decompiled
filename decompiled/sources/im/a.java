package im;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.WNafUtil;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f69724a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f69725b = BigInteger.valueOf(2);

    public static BigInteger a(SecureRandom secureRandom, DHParameters dHParameters) {
        BigInteger bigIntegerCreateRandomInRange;
        BigInteger bit;
        int l6 = dHParameters.getL();
        if (l6 != 0) {
            int i10 = l6 >>> 2;
            do {
                bit = BigIntegers.createRandomBigInteger(l6, secureRandom).setBit(l6 - 1);
            } while (WNafUtil.getNafWeight(bit) < i10);
            return bit;
        }
        int m = dHParameters.getM();
        BigInteger bigInteger = f69725b;
        BigInteger bigIntegerShiftLeft = m != 0 ? f69724a.shiftLeft(m - 1) : bigInteger;
        BigInteger q10 = dHParameters.getQ();
        if (q10 == null) {
            q10 = dHParameters.getP();
        }
        BigInteger bigIntegerSubtract = q10.subtract(bigInteger);
        int iBitLength = bigIntegerSubtract.bitLength() >>> 2;
        do {
            bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
        } while (WNafUtil.getNafWeight(bigIntegerCreateRandomInRange) < iBitLength);
        return bigIntegerCreateRandomInRange;
    }
}
