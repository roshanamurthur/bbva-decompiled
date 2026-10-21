package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.PreCompCallback;
import org.bouncycastle.math.ec.PreCompInfo;

/* JADX INFO: loaded from: classes13.dex */
public abstract class EndoUtil {
    public static final String PRECOMP_NAME = "bc_endo";

    public static class a implements PreCompCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ECEndomorphism f90846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ECPoint f90847b;

        public a(ECEndomorphism eCEndomorphism, ECPoint eCPoint) {
            this.f90846a = eCEndomorphism;
            this.f90847b = eCPoint;
        }

        @Override // org.bouncycastle.math.ec.PreCompCallback
        public final PreCompInfo precompute(PreCompInfo preCompInfo) {
            EndoPreCompInfo endoPreCompInfo = preCompInfo instanceof EndoPreCompInfo ? (EndoPreCompInfo) preCompInfo : null;
            ECEndomorphism eCEndomorphism = this.f90846a;
            if (endoPreCompInfo != null && endoPreCompInfo.getEndomorphism() == eCEndomorphism && endoPreCompInfo.getMappedPoint() != null) {
                return endoPreCompInfo;
            }
            ECPoint map = eCEndomorphism.getPointMap().map(this.f90847b);
            EndoPreCompInfo endoPreCompInfo2 = new EndoPreCompInfo();
            endoPreCompInfo2.setEndomorphism(eCEndomorphism);
            endoPreCompInfo2.setMappedPoint(map);
            return endoPreCompInfo2;
        }
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        boolean z10 = bigInteger2.signum() < 0;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2.abs());
        boolean zTestBit = bigIntegerMultiply.testBit(i10 - 1);
        BigInteger bigIntegerShiftRight = bigIntegerMultiply.shiftRight(i10);
        if (zTestBit) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return z10 ? bigIntegerShiftRight.negate() : bigIntegerShiftRight;
    }

    public static BigInteger[] decomposeScalar(ScalarSplitParameters scalarSplitParameters, BigInteger bigInteger) {
        int bits = scalarSplitParameters.getBits();
        BigInteger bigIntegerA = a(bigInteger, scalarSplitParameters.getG1(), bits);
        BigInteger bigIntegerA2 = a(bigInteger, scalarSplitParameters.getG2(), bits);
        return new BigInteger[]{bigInteger.subtract(bigIntegerA.multiply(scalarSplitParameters.getV1A()).add(bigIntegerA2.multiply(scalarSplitParameters.getV2A()))), bigIntegerA.multiply(scalarSplitParameters.getV1B()).add(bigIntegerA2.multiply(scalarSplitParameters.getV2B())).negate()};
    }

    public static ECPoint mapPoint(ECEndomorphism eCEndomorphism, ECPoint eCPoint) {
        return ((EndoPreCompInfo) eCPoint.getCurve().precompute(eCPoint, PRECOMP_NAME, new a(eCEndomorphism, eCPoint))).getMappedPoint();
    }
}
