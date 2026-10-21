package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class NafR2LMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iArrGenerateCompactNaf.length) {
            int i12 = iArrGenerateCompactNaf[i10];
            int i13 = i12 >> 16;
            eCPoint = eCPoint.timesPow2(i11 + (i12 & 65535));
            infinity = infinity.add(i13 < 0 ? eCPoint.negate() : eCPoint);
            i10++;
            i11 = 1;
        }
        return infinity;
    }
}
