package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class FixedPointUtil {
    public static final String PRECOMP_NAME = "bc_fixed_point";

    public static class a implements PreCompCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ECCurve f90603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ECPoint f90604b;

        public a(ECCurve eCCurve, ECPoint eCPoint) {
            this.f90603a = eCCurve;
            this.f90604b = eCPoint;
        }

        @Override // org.bouncycastle.math.ec.PreCompCallback
        public final PreCompInfo precompute(PreCompInfo preCompInfo) {
            ECLookupTable lookupTable;
            FixedPointPreCompInfo fixedPointPreCompInfo = preCompInfo instanceof FixedPointPreCompInfo ? (FixedPointPreCompInfo) preCompInfo : null;
            ECCurve eCCurve = this.f90603a;
            int combSize = FixedPointUtil.getCombSize(eCCurve);
            int i10 = combSize > 250 ? 6 : 5;
            int i11 = 1 << i10;
            if (fixedPointPreCompInfo != null && (lookupTable = fixedPointPreCompInfo.getLookupTable()) != null && lookupTable.getSize() >= i11) {
                return fixedPointPreCompInfo;
            }
            int iA = c2.b.a(combSize, i10, 1, i10);
            ECPoint[] eCPointArr = new ECPoint[i10 + 1];
            eCPointArr[0] = this.f90604b;
            for (int i12 = 1; i12 < i10; i12++) {
                eCPointArr[i12] = eCPointArr[i12 - 1].timesPow2(iA);
            }
            eCPointArr[i10] = eCPointArr[0].subtract(eCPointArr[1]);
            eCCurve.normalizeAll(eCPointArr);
            ECPoint[] eCPointArr2 = new ECPoint[i11];
            eCPointArr2[0] = eCPointArr[0];
            for (int i13 = i10 - 1; i13 >= 0; i13--) {
                ECPoint eCPoint = eCPointArr[i13];
                int i14 = 1 << i13;
                for (int i15 = i14; i15 < i11; i15 += i14 << 1) {
                    eCPointArr2[i15] = eCPointArr2[i15 - i14].add(eCPoint);
                }
            }
            eCCurve.normalizeAll(eCPointArr2);
            FixedPointPreCompInfo fixedPointPreCompInfo2 = new FixedPointPreCompInfo();
            fixedPointPreCompInfo2.setLookupTable(eCCurve.createCacheSafeLookupTable(eCPointArr2, 0, i11));
            fixedPointPreCompInfo2.setOffset(eCPointArr[i10]);
            fixedPointPreCompInfo2.setWidth(i10);
            return fixedPointPreCompInfo2;
        }
    }

    public static int getCombSize(ECCurve eCCurve) {
        BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof FixedPointPreCompInfo) {
            return (FixedPointPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static FixedPointPreCompInfo precompute(ECPoint eCPoint) {
        ECCurve curve = eCPoint.getCurve();
        return (FixedPointPreCompInfo) curve.precompute(eCPoint, "bc_fixed_point", new a(curve, eCPoint));
    }
}
