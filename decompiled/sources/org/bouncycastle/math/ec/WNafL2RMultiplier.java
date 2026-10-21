package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public class WNafL2RMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPointAdd;
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, WNafUtil.getWindowSize(bigInteger.bitLength()), true);
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        ECPoint[] preCompNeg = wNafPreCompInfoPrecompute.getPreCompNeg();
        int width = wNafPreCompInfoPrecompute.getWidth();
        int[] iArrGenerateCompactWindowNaf = WNafUtil.generateCompactWindowNaf(width, bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = iArrGenerateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i10 = iArrGenerateCompactWindowNaf[length];
            int i11 = i10 >> 16;
            int i12 = i10 & 65535;
            int iAbs = Math.abs(i11);
            ECPoint[] eCPointArr = i11 < 0 ? preCompNeg : preComp;
            if ((iAbs << 2) < (1 << width)) {
                int iNumberOfLeadingZeros = Integers.numberOfLeadingZeros(iAbs);
                int i13 = width - (32 - iNumberOfLeadingZeros);
                eCPointAdd = eCPointArr[((1 << (width - 1)) - 1) >>> 1].add(eCPointArr[(((iAbs ^ (1 << (31 - iNumberOfLeadingZeros))) << i13) + 1) >>> 1]);
                i12 -= i13;
            } else {
                eCPointAdd = eCPointArr[iAbs >>> 1];
            }
            infinity = eCPointAdd.timesPow2(i12);
        }
        while (length > 0) {
            length--;
            int i14 = iArrGenerateCompactWindowNaf[length];
            int i15 = i14 >> 16;
            infinity = infinity.twicePlus((i15 < 0 ? preCompNeg : preComp)[Math.abs(i15) >>> 1]).timesPow2(i14 & 65535);
        }
        return infinity;
    }
}
