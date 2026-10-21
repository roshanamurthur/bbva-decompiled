package bc.org.bouncycastle.math.ec;

import androidx.camera.camera2.internal.compat.u;
import bc.org.bouncycastle.math.ec.endo.ECEndomorphism;
import bc.org.bouncycastle.math.ec.endo.GLVEndomorphism;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y2;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ECAlgorithms {
    public static ECPoint a(ECPoint[] eCPointArr, ECPoint[] eCPointArr2, byte[] bArr, ECPoint[] eCPointArr3, ECPoint[] eCPointArr4, byte[] bArr2) {
        ECPoint eCPointAdd;
        int iMax = Math.max(bArr.length, bArr2.length);
        ECPoint infinity = eCPointArr[0].getCurve().getInfinity();
        int i10 = iMax - 1;
        int i11 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i10 >= 0) {
            byte b10 = i10 < bArr.length ? bArr[i10] : (byte) 0;
            byte b11 = i10 < bArr2.length ? bArr2[i10] : (byte) 0;
            if ((b10 | b11) == 0) {
                i11++;
            } else {
                if (b10 != 0) {
                    eCPointAdd = infinity.add((b10 < 0 ? eCPointArr2 : eCPointArr)[Math.abs((int) b10) >>> 1]);
                } else {
                    eCPointAdd = infinity;
                }
                if (b11 != 0) {
                    eCPointAdd = eCPointAdd.add((b11 < 0 ? eCPointArr4 : eCPointArr3)[Math.abs((int) b11) >>> 1]);
                }
                if (i11 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i11);
                    i11 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i10--;
        }
        return i11 > 0 ? eCPointTwicePlus.timesPow2(i11) : eCPointTwicePlus;
    }

    public static ECPoint b(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        int length = eCPointArr.length;
        boolean[] zArr = new boolean[length];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[length];
        byte[][] bArr = new byte[length][];
        for (int i10 = 0; i10 < length; i10++) {
            BigInteger bigInteger = bigIntegerArr[i10];
            zArr[i10] = bigInteger.signum() < 0;
            BigInteger bigIntegerAbs = bigInteger.abs();
            int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs.bitLength())));
            wNafPreCompInfoArr[i10] = WNafUtil.precompute(eCPointArr[i10], iMax, true);
            bArr[i10] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs);
        }
        return d(zArr, wNafPreCompInfoArr, bArr);
    }

    public static ECPoint c(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr, GLVEndomorphism gLVEndomorphism) {
        boolean z10 = false;
        BigInteger order = eCPointArr[0].getCurve().getOrder();
        int length = eCPointArr.length;
        int i10 = length << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            BigInteger[] bigIntegerArrDecomposeScalar = gLVEndomorphism.decomposeScalar(bigIntegerArr[i12].mod(order));
            int i13 = i11 + 1;
            bigIntegerArr2[i11] = bigIntegerArrDecomposeScalar[0];
            i11 += 2;
            bigIntegerArr2[i13] = bigIntegerArrDecomposeScalar[1];
        }
        ECPointMap pointMap = gLVEndomorphism.getPointMap();
        if (!gLVEndomorphism.hasEfficientPointMap()) {
            ECPoint[] eCPointArr2 = new ECPoint[i10];
            int i14 = 0;
            for (ECPoint eCPoint : eCPointArr) {
                ECPoint map = pointMap.map(eCPoint);
                int i15 = i14 + 1;
                eCPointArr2[i14] = eCPoint;
                i14 += 2;
                eCPointArr2[i15] = map;
            }
            return b(eCPointArr2, bigIntegerArr2);
        }
        int length2 = eCPointArr.length;
        int i16 = length2 << 1;
        boolean[] zArr = new boolean[i16];
        WNafPreCompInfo[] wNafPreCompInfoArr = new WNafPreCompInfo[i16];
        byte[][] bArr = new byte[i16][];
        int i17 = 0;
        while (i17 < length2) {
            int i18 = i17 << 1;
            int i19 = i18 + 1;
            BigInteger bigInteger = bigIntegerArr2[i18];
            zArr[i18] = bigInteger.signum() < 0 ? true : z10;
            BigInteger bigIntegerAbs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr2[i19];
            zArr[i19] = bigInteger2.signum() < 0 ? true : z10;
            BigInteger bigIntegerAbs2 = bigInteger2.abs();
            int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
            ECPoint eCPoint2 = eCPointArr[i17];
            ECPoint eCPointMapPointWithPrecomp = WNafUtil.mapPointWithPrecomp(eCPoint2, iMax, true, pointMap);
            wNafPreCompInfoArr[i18] = WNafUtil.getWNafPreCompInfo(eCPoint2);
            wNafPreCompInfoArr[i19] = WNafUtil.getWNafPreCompInfo(eCPointMapPointWithPrecomp);
            bArr[i18] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs);
            bArr[i19] = WNafUtil.generateWindowNaf(iMax, bigIntegerAbs2);
            i17++;
            z10 = false;
        }
        return d(zArr, wNafPreCompInfoArr, bArr);
    }

    public static ECPoint d(boolean[] zArr, WNafPreCompInfo[] wNafPreCompInfoArr, byte[][] bArr) {
        int length = bArr.length;
        int iMax = 0;
        for (byte[] bArr2 : bArr) {
            iMax = Math.max(iMax, bArr2.length);
        }
        ECPoint infinity = wNafPreCompInfoArr[0].getPreComp()[0].getCurve().getInfinity();
        int i10 = iMax - 1;
        int i11 = 0;
        ECPoint eCPointTwicePlus = infinity;
        while (i10 >= 0) {
            ECPoint eCPointAdd = infinity;
            for (int i12 = 0; i12 < length; i12++) {
                byte[] bArr3 = bArr[i12];
                byte b10 = i10 < bArr3.length ? bArr3[i10] : (byte) 0;
                if (b10 != 0) {
                    int iAbs = Math.abs((int) b10);
                    WNafPreCompInfo wNafPreCompInfo = wNafPreCompInfoArr[i12];
                    eCPointAdd = eCPointAdd.add(((b10 < 0) == zArr[i12] ? wNafPreCompInfo.getPreComp() : wNafPreCompInfo.getPreCompNeg())[iAbs >>> 1]);
                }
            }
            if (eCPointAdd == infinity) {
                i11++;
            } else {
                if (i11 > 0) {
                    eCPointTwicePlus = eCPointTwicePlus.timesPow2(i11);
                    i11 = 0;
                }
                eCPointTwicePlus = eCPointTwicePlus.twicePlus(eCPointAdd);
            }
            i10--;
        }
        return i11 > 0 ? eCPointTwicePlus.timesPow2(i11) : eCPointTwicePlus;
    }

    public static ECPoint e(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        boolean z10 = bigInteger.signum() < 0;
        boolean z11 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs.bitLength())));
        int iMax2 = Math.max(2, Math.min(16, WNafUtil.getWindowSize(bigIntegerAbs2.bitLength())));
        WNafPreCompInfo wNafPreCompInfoPrecompute = WNafUtil.precompute(eCPoint, iMax, true);
        WNafPreCompInfo wNafPreCompInfoPrecompute2 = WNafUtil.precompute(eCPoint2, iMax2, true);
        return a(z10 ? wNafPreCompInfoPrecompute.getPreCompNeg() : wNafPreCompInfoPrecompute.getPreComp(), z10 ? wNafPreCompInfoPrecompute.getPreComp() : wNafPreCompInfoPrecompute.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax, bigIntegerAbs), z11 ? wNafPreCompInfoPrecompute2.getPreCompNeg() : wNafPreCompInfoPrecompute2.getPreComp(), z11 ? wNafPreCompInfoPrecompute2.getPreComp() : wNafPreCompInfoPrecompute2.getPreCompNeg(), WNafUtil.generateWindowNaf(iMax2, bigIntegerAbs2));
    }

    public static ECPoint importPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCCurve.equals(eCPoint.getCurve())) {
            return eCCurve.importPoint(eCPoint);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    public static boolean isF2mCurve(ECCurve eCCurve) {
        return isF2mField(eCCurve.getField());
    }

    public static boolean isF2mField(y2 y2Var) {
        return y2Var.b() > 1 && y2Var.c().equals(ECConstants.TWO) && (y2Var instanceof n4);
    }

    public static boolean isFpCurve(ECCurve eCCurve) {
        return isFpField(eCCurve.getField());
    }

    public static boolean isFpField(y2 y2Var) {
        return y2Var.b() == 1;
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i10, int i11) {
        montgomeryTrick(eCFieldElementArr, i10, i11, null);
    }

    public static ECPoint referenceMultiply(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        ECPoint infinity = eCPoint.getCurve().getInfinity();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                infinity = eCPoint;
            }
            for (int i10 = 1; i10 < iBitLength; i10++) {
                eCPoint = eCPoint.twice();
                if (bigIntegerAbs.testBit(i10)) {
                    infinity = infinity.add(eCPoint);
                }
            }
        }
        return bigInteger.signum() < 0 ? infinity.negate() : infinity;
    }

    public static ECPoint shamirsTrick(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECPoint eCPointImportPoint = importPoint(eCPoint.getCurve(), eCPoint2);
        ECCurve curve = eCPoint.getCurve();
        ECPoint infinity = curve.getInfinity();
        ECPoint[] eCPointArr = {eCPointImportPoint, eCPoint.subtract(eCPointImportPoint), eCPoint, eCPoint.add(eCPointImportPoint)};
        curve.normalizeAll(eCPointArr);
        ECPoint[] eCPointArr2 = {eCPointArr[3].negate(), eCPointArr[2].negate(), eCPointArr[1].negate(), eCPointArr[0].negate(), infinity, eCPointArr[0], eCPointArr[1], eCPointArr[2], eCPointArr[3]};
        byte[] bArrGenerateJSF = WNafUtil.generateJSF(bigInteger, bigInteger2);
        int length = bArrGenerateJSF.length;
        while (true) {
            length--;
            if (length < 0) {
                return validatePoint(infinity);
            }
            byte b10 = bArrGenerateJSF[length];
            infinity = infinity.twicePlus(eCPointArr2[u.b((b10 << 24) >> 28, 3, 4, (b10 << 28) >> 28)]);
        }
    }

    public static ECPoint sumOfMultiplies(ECPoint[] eCPointArr, BigInteger[] bigIntegerArr) {
        if (eCPointArr != null && bigIntegerArr != null && eCPointArr.length == bigIntegerArr.length) {
            if (eCPointArr.length >= 1) {
                int length = eCPointArr.length;
                if (length == 1) {
                    return eCPointArr[0].multiply(bigIntegerArr[0]);
                }
                if (length == 2) {
                    return sumOfTwoMultiplies(eCPointArr[0], bigIntegerArr[0], eCPointArr[1], bigIntegerArr[1]);
                }
                ECPoint eCPoint = eCPointArr[0];
                ECCurve curve = eCPoint.getCurve();
                ECPoint[] eCPointArr2 = new ECPoint[length];
                eCPointArr2[0] = eCPoint;
                for (int i10 = 1; i10 < length; i10++) {
                    eCPointArr2[i10] = importPoint(curve, eCPointArr[i10]);
                }
                ECEndomorphism endomorphism = curve.getEndomorphism();
                return endomorphism instanceof GLVEndomorphism ? validatePoint(c(eCPointArr2, bigIntegerArr, (GLVEndomorphism) endomorphism)) : validatePoint(b(eCPointArr2, bigIntegerArr));
            }
        }
        throw new IllegalArgumentException("point and scalar arrays should be non-null, and of equal, non-zero, length");
    }

    public static ECPoint sumOfTwoMultiplies(ECPoint eCPoint, BigInteger bigInteger, ECPoint eCPoint2, BigInteger bigInteger2) {
        ECCurve curve = eCPoint.getCurve();
        ECPoint eCPointImportPoint = importPoint(curve, eCPoint2);
        if ((curve instanceof ECCurve.AbstractF2m) && ((ECCurve.AbstractF2m) curve).isKoblitz()) {
            return validatePoint(eCPoint.multiply(bigInteger).add(eCPointImportPoint.multiply(bigInteger2)));
        }
        ECEndomorphism endomorphism = curve.getEndomorphism();
        return endomorphism instanceof GLVEndomorphism ? validatePoint(c(new ECPoint[]{eCPoint, eCPointImportPoint}, new BigInteger[]{bigInteger, bigInteger2}, (GLVEndomorphism) endomorphism)) : validatePoint(e(eCPoint, bigInteger, eCPointImportPoint, bigInteger2));
    }

    public static ECPoint validatePoint(ECPoint eCPoint) {
        if (eCPoint.isValid()) {
            return eCPoint;
        }
        throw new IllegalArgumentException("Invalid point");
    }

    public static void montgomeryTrick(ECFieldElement[] eCFieldElementArr, int i10, int i11, ECFieldElement eCFieldElement) {
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[i11];
        int i12 = 0;
        eCFieldElementArr2[0] = eCFieldElementArr[i10];
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11) {
                break;
            }
            eCFieldElementArr2[i13] = eCFieldElementArr2[i12].multiply(eCFieldElementArr[i10 + i13]);
            i12 = i13;
        }
        if (eCFieldElement != null) {
            eCFieldElementArr2[i12] = eCFieldElementArr2[i12].multiply(eCFieldElement);
        }
        ECFieldElement eCFieldElementInvert = eCFieldElementArr2[i12].invert();
        while (i12 > 0) {
            int i14 = i12 - 1;
            int i15 = i12 + i10;
            ECFieldElement eCFieldElement2 = eCFieldElementArr[i15];
            eCFieldElementArr[i15] = eCFieldElementArr2[i14].multiply(eCFieldElementInvert);
            eCFieldElementInvert = eCFieldElementInvert.multiply(eCFieldElement2);
            i12 = i14;
        }
        eCFieldElementArr[i10] = eCFieldElementInvert;
    }
}
