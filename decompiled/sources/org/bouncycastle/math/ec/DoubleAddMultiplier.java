package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class DoubleAddMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint[] eCPointArr = new ECPoint[2];
        eCPointArr[0] = eCPoint.getCurve().getInfinity();
        eCPointArr[1] = eCPoint;
        int iBitLength = bigInteger.bitLength();
        for (int i10 = 0; i10 < iBitLength; i10++) {
            boolean zTestBit = bigInteger.testBit(i10);
            int i11 = 1 - (zTestBit ? 1 : 0);
            eCPointArr[i11] = eCPointArr[i11].twicePlus(eCPointArr[zTestBit ? 1 : 0]);
        }
        return eCPointArr[0];
    }
}
