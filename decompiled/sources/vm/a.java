package vm;

import java.math.BigInteger;
import org.bouncycastle.pqc.math.linearalgebra.GF2Vector;
import org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f94105a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f94106b = BigInteger.valueOf(1);

    public static GF2Vector a(int i10, int i11, byte[] bArr) {
        if (i10 < i11) {
            throw new IllegalArgumentException("n < t");
        }
        BigInteger bigIntegerBinomial = IntegerFunctions.binomial(i10, i11);
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(bigIntegerBinomial) >= 0) {
            throw new IllegalArgumentException("Encoded number too large.");
        }
        GF2Vector gF2Vector = new GF2Vector(i10);
        int i12 = i10;
        for (int i13 = 0; i13 < i10; i13++) {
            bigIntegerBinomial = bigIntegerBinomial.multiply(BigInteger.valueOf(i12 - i11)).divide(BigInteger.valueOf(i12));
            i12--;
            if (bigIntegerBinomial.compareTo(bigInteger) <= 0) {
                gF2Vector.setBit(i13);
                bigInteger = bigInteger.subtract(bigIntegerBinomial);
                int i14 = i11 - 1;
                bigIntegerBinomial = i12 == i14 ? f94106b : bigIntegerBinomial.multiply(BigInteger.valueOf(i11)).divide(BigInteger.valueOf(i12 - i14));
                i11 = i14;
            }
        }
        return gF2Vector;
    }
}
