package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class MixedNafR2LMultiplier extends AbstractECMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f25042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f25043b;

    public MixedNafR2LMultiplier() {
        this(2, 4);
    }

    @Override // bc.org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint a(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        ECCurve eCCurveA = a(curve, this.f25042a);
        ECCurve eCCurveA2 = a(curve, this.f25043b);
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCCurveA.getInfinity();
        ECPoint eCPointImportPoint = eCCurveA2.importPoint(eCPoint);
        int i10 = 0;
        ECPoint eCPointAdd = infinity;
        int i11 = 0;
        while (i10 < iArrGenerateCompactNaf.length) {
            int i12 = iArrGenerateCompactNaf[i10];
            int i13 = i12 >> 16;
            eCPointImportPoint = eCPointImportPoint.timesPow2(i11 + (i12 & 65535));
            ECPoint eCPointImportPoint2 = eCCurveA.importPoint(eCPointImportPoint);
            if (i13 < 0) {
                eCPointImportPoint2 = eCPointImportPoint2.negate();
            }
            eCPointAdd = eCPointAdd.add(eCPointImportPoint2);
            i10++;
            i11 = 1;
        }
        return curve.importPoint(eCPointAdd);
    }

    public MixedNafR2LMultiplier(int i10, int i11) {
        this.f25042a = i10;
        this.f25043b = i11;
    }

    public ECCurve a(ECCurve eCCurve, int i10) {
        if (eCCurve.getCoordinateSystem() == i10) {
            return eCCurve;
        }
        if (eCCurve.supportsCoordinateSystem(i10)) {
            return eCCurve.configure().setCoordinateSystem(i10).create();
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Coordinate system ", i10, " not supported by this curve"));
    }
}
