package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes13.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = fixedPointPreCompInfoPrecompute.getLookupTable();
        int width = fixedPointPreCompInfoPrecompute.getWidth();
        int iA = c2.b.a(combSize, width, 1, width);
        ECPoint infinity = curve.getInfinity();
        int i10 = width * iA;
        int[] iArrFromBigInteger = Nat.fromBigInteger(i10, bigInteger);
        int i11 = i10 - 1;
        for (int i12 = 0; i12 < iA; i12++) {
            int i13 = 0;
            for (int i14 = i11 - i12; i14 >= 0; i14 -= iA) {
                int i15 = iArrFromBigInteger[i14 >>> 5] >>> (i14 & 31);
                i13 = ((i13 ^ (i15 >>> 1)) << 1) ^ i15;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i13));
        }
        return infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
    }
}
