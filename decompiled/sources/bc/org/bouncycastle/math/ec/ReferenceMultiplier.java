package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ReferenceMultiplier extends AbstractECMultiplier {
    @Override // bc.org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint a(ECPoint eCPoint, BigInteger bigInteger) {
        return ECAlgorithms.referenceMultiply(eCPoint, bigInteger);
    }
}
