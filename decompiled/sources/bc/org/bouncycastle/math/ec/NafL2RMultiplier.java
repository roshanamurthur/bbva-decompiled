package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class NafL2RMultiplier extends AbstractECMultiplier {
    @Override // bc.org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint a(ECPoint eCPoint, BigInteger bigInteger) {
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint eCPointNormalize = eCPoint.normalize();
        ECPoint eCPointNegate = eCPointNormalize.negate();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = iArrGenerateCompactNaf.length;
        while (true) {
            length--;
            if (length < 0) {
                return infinity;
            }
            int i10 = iArrGenerateCompactNaf[length];
            infinity = infinity.twicePlus((i10 >> 16) < 0 ? eCPointNegate : eCPointNormalize).timesPow2(i10 & 65535);
        }
    }
}
