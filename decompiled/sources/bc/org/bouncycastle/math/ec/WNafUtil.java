package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WNafUtil {
    public static final String PRECOMP_NAME = "bc_wnaf";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25049a = {13, 41, 121, 337, 897, 2305};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f25050b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25051c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECPoint[] f25052d = new ECPoint[0];

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f25051c;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i10 = iBitLength >> 1;
        int[] iArr = new int[i10];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i11 = iBitLength - 1;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11) {
            if (bigIntegerXor.testBit(i12)) {
                iArr[i14] = i13 | ((bigInteger.testBit(i12) ? -1 : 1) << 16);
                i12++;
                i13 = 1;
                i14++;
            } else {
                i13++;
            }
            i12++;
        }
        int i15 = i14 + 1;
        iArr[i14] = 65536 | i13;
        if (i10 <= i15) {
            return iArr;
        }
        int[] iArr2 = new int[i15];
        System.arraycopy(iArr, 0, iArr2, 0, i15);
        return iArr2;
    }

    public static int[] generateCompactWindowNaf(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i10 < 2 || i10 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f25051c;
        }
        int iBitLength = (bigInteger.bitLength() / i10) + 1;
        int[] iArr = new int[iBitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int iIntValue = bigInteger.intValue() & i12;
                if (z10) {
                    iIntValue++;
                }
                z10 = (iIntValue & i13) != 0;
                if (z10) {
                    iIntValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                iArr[i15] = i14 | (iIntValue << 16);
                i14 = i10;
                i15++;
            }
        }
        if (iBitLength <= i15) {
            return iArr;
        }
        int[] iArr2 = new int[i15];
        System.arraycopy(iArr, 0, iArr2, 0, i15);
        return iArr2;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int iMax = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[iMax];
        BigInteger bigIntegerShiftRight = bigInteger;
        BigInteger bigIntegerShiftRight2 = bigInteger2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if ((i10 | i11) == 0 && bigIntegerShiftRight.bitLength() <= i12 && bigIntegerShiftRight2.bitLength() <= i12) {
                break;
            }
            int iIntValue = (bigIntegerShiftRight.intValue() >>> i12) + i10;
            int i14 = iIntValue & 7;
            int iIntValue2 = (bigIntegerShiftRight2.intValue() >>> i12) + i11;
            int i15 = iIntValue2 & 7;
            int i16 = iIntValue & 1;
            if (i16 != 0) {
                i16 -= iIntValue & 2;
                if (i14 + i16 == 4 && (iIntValue2 & 3) == 2) {
                    i16 = -i16;
                }
            }
            int i17 = iIntValue2 & 1;
            if (i17 != 0) {
                i17 -= iIntValue2 & 2;
                if (i15 + i17 == 4 && (iIntValue & 3) == 2) {
                    i17 = -i17;
                }
            }
            if ((i10 << 1) == i16 + 1) {
                i10 ^= 1;
            }
            if ((i11 << 1) == i17 + 1) {
                i11 ^= 1;
            }
            i12++;
            if (i12 == 30) {
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(30);
                bigIntegerShiftRight2 = bigIntegerShiftRight2.shiftRight(30);
                i12 = 0;
            }
            bArr[i13] = (byte) ((i17 & 15) | (i16 << 4));
            i13++;
        }
        if (iMax <= i13) {
            return bArr;
        }
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        return bArr2;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return f25050b;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i10 = iBitLength - 1;
        byte[] bArr = new byte[i10];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i11 = 1;
        while (i11 < i10) {
            if (bigIntegerXor.testBit(i11)) {
                bArr[i11 - 1] = (byte) (bigInteger.testBit(i11) ? -1 : 1);
                i11++;
            }
            i11++;
        }
        bArr[iBitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return generateNaf(bigInteger);
        }
        if (i10 < 2 || i10 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return f25050b;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int iIntValue = bigInteger.intValue() & i12;
                if (z10) {
                    iIntValue++;
                }
                z10 = (iIntValue & i13) != 0;
                if (z10) {
                    iIntValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                int i16 = i15 + i14;
                bArr[i16] = (byte) iIntValue;
                i15 = i16 + 1;
                i14 = i10;
            }
        }
        if (iBitLength <= i15) {
            return bArr;
        }
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, 0, bArr2, 0, i15);
        return bArr2;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, "bc_wnaf"));
    }

    public static int getWindowSize(int i10) {
        return getWindowSize(i10, f25049a);
    }

    public static ECPoint mapPointWithPrecomp(ECPoint eCPoint, int i10, boolean z10, ECPointMap eCPointMap) {
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfoPrecompute = precompute(eCPoint, i10, z10);
        ECPoint map = eCPointMap.map(eCPoint);
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(map, "bc_wnaf"));
        ECPoint twice = wNafPreCompInfoPrecompute.getTwice();
        if (twice != null) {
            wNafPreCompInfo.setTwice(eCPointMap.map(twice));
        }
        ECPoint[] preComp = wNafPreCompInfoPrecompute.getPreComp();
        int length = preComp.length;
        ECPoint[] eCPointArr = new ECPoint[length];
        for (int i11 = 0; i11 < preComp.length; i11++) {
            eCPointArr[i11] = eCPointMap.map(preComp[i11]);
        }
        wNafPreCompInfo.setPreComp(eCPointArr);
        if (z10) {
            ECPoint[] eCPointArr2 = new ECPoint[length];
            for (int i12 = 0; i12 < length; i12++) {
                eCPointArr2[i12] = eCPointArr[i12].negate();
            }
            wNafPreCompInfo.setPreCompNeg(eCPointArr2);
        }
        curve.setPreCompInfo(map, "bc_wnaf", wNafPreCompInfo);
        return map;
    }

    public static WNafPreCompInfo precompute(ECPoint eCPoint, int i10, boolean z10) {
        int length;
        int i11;
        int coordinateSystem;
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfo = getWNafPreCompInfo(curve.getPreCompInfo(eCPoint, "bc_wnaf"));
        int i12 = 0;
        int iMax = 1 << Math.max(0, i10 - 2);
        ECPoint[] preComp = wNafPreCompInfo.getPreComp();
        if (preComp == null) {
            preComp = f25052d;
            length = 0;
        } else {
            length = preComp.length;
        }
        if (length < iMax) {
            ECPoint[] eCPointArr = new ECPoint[iMax];
            System.arraycopy(preComp, 0, eCPointArr, 0, preComp.length);
            if (iMax == 1) {
                eCPointArr[0] = eCPoint.normalize();
            } else {
                if (length == 0) {
                    eCPointArr[0] = eCPoint;
                    i11 = 1;
                } else {
                    i11 = length;
                }
                ECFieldElement zCoord = null;
                if (iMax == 2) {
                    eCPointArr[1] = eCPoint.threeTimes();
                } else {
                    ECPoint twice = wNafPreCompInfo.getTwice();
                    ECPoint eCPointAdd = eCPointArr[i11 - 1];
                    if (twice == null) {
                        twice = eCPointArr[0].twice();
                        wNafPreCompInfo.setTwice(twice);
                        if (!twice.isInfinity() && ECAlgorithms.isFpCurve(curve) && curve.getFieldSize() >= 64 && ((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                            zCoord = twice.getZCoord(0);
                            twice = curve.createPoint(twice.getXCoord().toBigInteger(), twice.getYCoord().toBigInteger());
                            ECFieldElement eCFieldElementSquare = zCoord.square();
                            eCPointAdd = eCPointAdd.scaleX(eCFieldElementSquare).scaleY(eCFieldElementSquare.multiply(zCoord));
                            if (length == 0) {
                                eCPointArr[0] = eCPointAdd;
                            }
                        }
                    }
                    while (i11 < iMax) {
                        eCPointAdd = eCPointAdd.add(twice);
                        eCPointArr[i11] = eCPointAdd;
                        i11++;
                    }
                }
                curve.normalizeAll(eCPointArr, length, iMax - length, zCoord);
            }
            preComp = eCPointArr;
        }
        wNafPreCompInfo.setPreComp(preComp);
        if (z10) {
            ECPoint[] preCompNeg = wNafPreCompInfo.getPreCompNeg();
            if (preCompNeg == null) {
                preCompNeg = new ECPoint[iMax];
            } else {
                int length2 = preCompNeg.length;
                if (length2 < iMax) {
                    ECPoint[] eCPointArr2 = new ECPoint[iMax];
                    System.arraycopy(preCompNeg, 0, eCPointArr2, 0, preCompNeg.length);
                    i12 = length2;
                    preCompNeg = eCPointArr2;
                } else {
                    i12 = length2;
                }
            }
            while (i12 < iMax) {
                preCompNeg[i12] = preComp[i12].negate();
                i12++;
            }
            wNafPreCompInfo.setPreCompNeg(preCompNeg);
        }
        curve.setPreCompInfo(eCPoint, "bc_wnaf", wNafPreCompInfo);
        return wNafPreCompInfo;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        return (preCompInfo == null || !(preCompInfo instanceof WNafPreCompInfo)) ? new WNafPreCompInfo() : (WNafPreCompInfo) preCompInfo;
    }

    public static int getWindowSize(int i10, int[] iArr) {
        int i11 = 0;
        while (i11 < iArr.length && i10 >= iArr[i11]) {
            i11++;
        }
        return i11 + 2;
    }
}
