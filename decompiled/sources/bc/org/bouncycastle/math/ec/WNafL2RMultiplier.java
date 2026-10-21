package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class WNafL2RMultiplier extends AbstractECMultiplier {
    @Override // bc.org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint a(ECPoint eCPoint, BigInteger bigInteger) {
        ECPoint eCPointAdd;
        int iMax = Math.max(2, Math.min(16, a(bigInteger.bitLength())));
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, iMax, true);
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        ECPoint[] preCompNeg = wNafPreCompInfoPrecompute.getPreCompNeg();
        int[] iArrGenerateCompactWindowNaf = WNafUtil.generateCompactWindowNaf(iMax, bigInteger);
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = iArrGenerateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i10 = iArrGenerateCompactWindowNaf[length];
            int i11 = i10 >> 16;
            int i12 = i10 & 65535;
            int iAbs = Math.abs(i11);
            ECPoint[] eCPointArr = i11 < 0 ? preCompNeg : preComp;
            if ((iAbs << 2) < (1 << iMax)) {
                byte b10 = b.f25055r0[iAbs];
                int i13 = iMax - b10;
                eCPointAdd = eCPointArr[((1 << (iMax - 1)) - 1) >>> 1].add(eCPointArr[(((iAbs ^ (1 << (b10 - 1))) << i13) + 1) >>> 1]);
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

    public int a(int i10) {
        return WNafUtil.getWindowSize(i10);
    }
}
