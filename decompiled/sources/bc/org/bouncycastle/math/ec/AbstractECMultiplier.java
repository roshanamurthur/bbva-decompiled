package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractECMultiplier implements ECMultiplier {
    public abstract ECPoint a(ECPoint eCPoint, BigInteger bigInteger);

    @Override // bc.org.bouncycastle.math.ec.ECMultiplier
    public ECPoint multiply(ECPoint eCPoint, BigInteger bigInteger) {
        int iSignum = bigInteger.signum();
        if (iSignum == 0 || eCPoint.isInfinity()) {
            return eCPoint.getCurve().getInfinity();
        }
        ECPoint eCPointA = a(eCPoint, bigInteger.abs());
        return iSignum > 0 ? eCPointA : eCPointA.negate();
    }
}
