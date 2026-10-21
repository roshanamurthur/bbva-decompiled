package bc.org.bouncycastle.math.ec;

import bc.org.bouncycastle.math.ec.endo.GLVEndomorphism;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GLVMultiplier extends AbstractECMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ECCurve f25040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final GLVEndomorphism f25041b;

    public GLVMultiplier(ECCurve eCCurve, GLVEndomorphism gLVEndomorphism) {
        if (eCCurve == null || eCCurve.getOrder() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.f25040a = eCCurve;
        this.f25041b = gLVEndomorphism;
    }

    @Override // bc.org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint a(ECPoint eCPoint, BigInteger bigInteger) {
        if (!this.f25040a.equals(eCPoint.getCurve())) {
            throw new IllegalStateException();
        }
        BigInteger[] bigIntegerArrDecomposeScalar = this.f25041b.decomposeScalar(bigInteger.mod(eCPoint.getCurve().getOrder()));
        BigInteger bigInteger2 = bigIntegerArrDecomposeScalar[0];
        BigInteger bigInteger3 = bigIntegerArrDecomposeScalar[1];
        ECPointMap pointMap = this.f25041b.getPointMap();
        if (!this.f25041b.hasEfficientPointMap()) {
            return ECAlgorithms.e(eCPoint, bigInteger2, pointMap.map(eCPoint), bigInteger3);
        }
        boolean z10 = bigInteger2.signum() < 0;
        boolean z11 = bigInteger3.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger2.abs();
        BigInteger bigIntegerAbs2 = bigInteger3.abs();
        int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        ECPoint eCPointMapPointWithPrecomp = WNafUtil.mapPointWithPrecomp(eCPoint, iMax, true, pointMap);
        WNafPreCompInfo wNafPreCompInfo = WNafUtil.getWNafPreCompInfo(eCPoint);
        WNafPreCompInfo wNafPreCompInfo2 = WNafUtil.getWNafPreCompInfo(eCPointMapPointWithPrecomp);
        return ECAlgorithms.a(z10 ? wNafPreCompInfo.getPreCompNeg() : wNafPreCompInfo.getPreComp(), z10 ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs), z11 ? wNafPreCompInfo2.getPreCompNeg() : wNafPreCompInfo2.getPreComp(), z11 ? wNafPreCompInfo2.getPreComp() : wNafPreCompInfo2.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs2));
    }
}
