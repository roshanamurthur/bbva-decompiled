package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class MixedNafR2LMultiplier extends AbstractECMultiplier {
    protected int additionCoord;
    protected int doublingCoord;

    public MixedNafR2LMultiplier() {
        this(2, 4);
    }

    public ECCurve configureCurve(ECCurve eCCurve, int i10) {
        if (eCCurve.getCoordinateSystem() == i10) {
            return eCCurve;
        }
        if (eCCurve.supportsCoordinateSystem(i10)) {
            return eCCurve.configure().setCoordinateSystem(i10).create();
        }
        throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("Coordinate system ", i10, " not supported by this curve"));
    }

    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        ECCurve eCCurveConfigureCurve = configureCurve(curve, this.additionCoord);
        ECCurve eCCurveConfigureCurve2 = configureCurve(curve, this.doublingCoord);
        int[] iArrGenerateCompactNaf = WNafUtil.generateCompactNaf(bigInteger);
        ECPoint infinity = eCCurveConfigureCurve.getInfinity();
        ECPoint eCPointImportPoint = eCCurveConfigureCurve2.importPoint(eCPoint);
        int i10 = 0;
        ECPoint eCPointAdd = infinity;
        int i11 = 0;
        while (i10 < iArrGenerateCompactNaf.length) {
            int i12 = iArrGenerateCompactNaf[i10];
            int i13 = i12 >> 16;
            eCPointImportPoint = eCPointImportPoint.timesPow2(i11 + (i12 & 65535));
            ECPoint eCPointImportPoint2 = eCCurveConfigureCurve.importPoint(eCPointImportPoint);
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
        this.additionCoord = i10;
        this.doublingCoord = i11;
    }
}
