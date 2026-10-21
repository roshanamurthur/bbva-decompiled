package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class FixedPointUtil {
    public static final String PRECOMP_NAME = "bc_fixed_point";

    public static int getCombSize(ECCurve eCCurve) {
        BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo preCompInfo) {
        return (preCompInfo == null || !(preCompInfo instanceof FixedPointPreCompInfo)) ? new FixedPointPreCompInfo() : (FixedPointPreCompInfo) preCompInfo;
    }

    public static FixedPointPreCompInfo precompute(ECPoint eCPoint, int i10) {
        ECCurve curve = eCPoint.getCurve();
        int i11 = 1 << i10;
        FixedPointPreCompInfo fixedPointPreCompInfo = getFixedPointPreCompInfo(curve.getPreCompInfo(eCPoint, "bc_fixed_point"));
        ECPoint[] preComp = fixedPointPreCompInfo.getPreComp();
        if (preComp == null || preComp.length < i11) {
            int combSize = ((getCombSize(curve) + i10) - 1) / i10;
            ECPoint[] eCPointArr = new ECPoint[i10 + 1];
            eCPointArr[0] = eCPoint;
            for (int i12 = 1; i12 < i10; i12++) {
                eCPointArr[i12] = eCPointArr[i12 - 1].timesPow2(combSize);
            }
            eCPointArr[i10] = eCPointArr[0].subtract(eCPointArr[1]);
            curve.normalizeAll(eCPointArr);
            ECPoint[] eCPointArr2 = new ECPoint[i11];
            eCPointArr2[0] = eCPointArr[0];
            for (int i13 = i10 - 1; i13 >= 0; i13--) {
                ECPoint eCPoint2 = eCPointArr[i13];
                int i14 = 1 << i13;
                for (int i15 = i14; i15 < i11; i15 += i14 << 1) {
                    eCPointArr2[i15] = eCPointArr2[i15 - i14].add(eCPoint2);
                }
            }
            curve.normalizeAll(eCPointArr2);
            fixedPointPreCompInfo.setOffset(eCPointArr[i10]);
            fixedPointPreCompInfo.setPreComp(eCPointArr2);
            fixedPointPreCompInfo.setWidth(i10);
            curve.setPreCompInfo(eCPoint, "bc_fixed_point", fixedPointPreCompInfo);
        }
        return fixedPointPreCompInfo;
    }
}
