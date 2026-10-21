package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    public int a(int i10) {
        return i10 > 257 ? 6 : 5;
    }

    @Override // bc.org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint a(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint, a(combSize));
        ECPoint[] preComp = fixedPointPreCompInfoPrecompute.getPreComp();
        int width = fixedPointPreCompInfoPrecompute.getWidth();
        int iA = c2.b.a(combSize, width, 1, width);
        ECPoint infinity = curve.getInfinity();
        int i10 = (width * iA) - 1;
        for (int i11 = 0; i11 < iA; i11++) {
            int i12 = 0;
            for (int i13 = i10 - i11; i13 >= 0; i13 -= iA) {
                i12 <<= 1;
                if (bigInteger.testBit(i13)) {
                    i12 |= 1;
                }
            }
            infinity = infinity.twicePlus(preComp[i12]);
        }
        return infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
    }
}
