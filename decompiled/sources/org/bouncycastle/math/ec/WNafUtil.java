package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public abstract class WNafUtil {
    public static final String PRECOMP_NAME = "bc_wnaf";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f90607a = {13, 41, 121, 337, 897, 2305};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f90608b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f90609c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECPoint[] f90610d = new ECPoint[0];

    public static class a implements PreCompCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90611a;

        public a(int i10) {
            this.f90611a = i10;
        }

        @Override // org.bouncycastle.math.ec.PreCompCallback
        public final PreCompInfo precompute(PreCompInfo preCompInfo) {
            WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
            if (wNafPreCompInfo != null && wNafPreCompInfo.getConfWidth() == this.f90611a) {
                wNafPreCompInfo.f90606a = 0;
                return wNafPreCompInfo;
            }
            WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
            wNafPreCompInfo2.f90606a = 0;
            wNafPreCompInfo2.setConfWidth(this.f90611a);
            if (wNafPreCompInfo != null) {
                wNafPreCompInfo2.setPreComp(wNafPreCompInfo.getPreComp());
                wNafPreCompInfo2.setPreCompNeg(wNafPreCompInfo.getPreCompNeg());
                wNafPreCompInfo2.setTwice(wNafPreCompInfo.getTwice());
                wNafPreCompInfo2.setWidth(wNafPreCompInfo.getWidth());
            }
            return wNafPreCompInfo2;
        }
    }

    public static class b implements PreCompCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WNafPreCompInfo f90612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ECPointMap f90613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f90614c;

        public b(ECPointMap eCPointMap, WNafPreCompInfo wNafPreCompInfo, boolean z10) {
            this.f90612a = wNafPreCompInfo;
            this.f90613b = eCPointMap;
            this.f90614c = z10;
        }

        @Override // org.bouncycastle.math.ec.PreCompCallback
        public final PreCompInfo precompute(PreCompInfo preCompInfo) {
            WNafPreCompInfo wNafPreCompInfo = new WNafPreCompInfo();
            WNafPreCompInfo wNafPreCompInfo2 = this.f90612a;
            wNafPreCompInfo.setConfWidth(wNafPreCompInfo2.getConfWidth());
            ECPoint twice = wNafPreCompInfo2.getTwice();
            ECPointMap eCPointMap = this.f90613b;
            if (twice != null) {
                wNafPreCompInfo.setTwice(eCPointMap.map(twice));
            }
            ECPoint[] preComp = wNafPreCompInfo2.getPreComp();
            int length = preComp.length;
            ECPoint[] eCPointArr = new ECPoint[length];
            for (int i10 = 0; i10 < preComp.length; i10++) {
                eCPointArr[i10] = eCPointMap.map(preComp[i10]);
            }
            wNafPreCompInfo.setPreComp(eCPointArr);
            wNafPreCompInfo.setWidth(wNafPreCompInfo2.getWidth());
            if (this.f90614c) {
                ECPoint[] eCPointArr2 = new ECPoint[length];
                for (int i11 = 0; i11 < length; i11++) {
                    eCPointArr2[i11] = eCPointArr[i11].negate();
                }
                wNafPreCompInfo.setPreCompNeg(eCPointArr2);
            }
            return wNafPreCompInfo;
        }
    }

    public static class c implements PreCompCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f90616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ECPoint f90617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ECCurve f90618d;

        public c(int i10, boolean z10, ECPoint eCPoint, ECCurve eCCurve) {
            this.f90615a = i10;
            this.f90616b = z10;
            this.f90617c = eCPoint;
            this.f90618d = eCCurve;
        }

        /* JADX WARN: Code duplicated, block: B:62:0x0116 A[PHI: r14
          0x0116: PHI (r14v6 org.bouncycastle.math.ec.ECPoint) = 
          (r14v4 org.bouncycastle.math.ec.ECPoint)
          (r14v9 org.bouncycastle.math.ec.ECPoint)
          (r14v9 org.bouncycastle.math.ec.ECPoint)
          (r14v9 org.bouncycastle.math.ec.ECPoint)
          (r14v9 org.bouncycastle.math.ec.ECPoint)
         binds: [B:45:0x00b8, B:47:0x00c4, B:49:0x00cc, B:51:0x00d6, B:57:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // org.bouncycastle.math.ec.PreCompCallback
        public final PreCompInfo precompute(PreCompInfo preCompInfo) {
            ECPoint eCPointTwice;
            ECPoint[] preComp;
            ECPoint[] preCompNeg;
            int length;
            int i10;
            ECPoint eCPointCreatePoint;
            int coordinateSystem;
            ECPoint[] preComp2;
            ECPoint[] preCompNeg2;
            ECFieldElement zCoord = null;
            WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
            int iMax = Math.max(2, Math.min(16, this.f90615a));
            int i11 = 1 << (iMax - 2);
            boolean z10 = this.f90616b;
            if (wNafPreCompInfo != null && wNafPreCompInfo.getWidth() >= Math.max(wNafPreCompInfo.getConfWidth(), iMax) && (preComp2 = wNafPreCompInfo.getPreComp()) != null && preComp2.length >= i11 && (!z10 || ((preCompNeg2 = wNafPreCompInfo.getPreCompNeg()) != null && preCompNeg2.length >= i11))) {
                int i12 = wNafPreCompInfo.f90606a;
                if (i12 > 0) {
                    wNafPreCompInfo.f90606a = i12 - 1;
                }
                return wNafPreCompInfo;
            }
            WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
            if (wNafPreCompInfo != null) {
                int i13 = wNafPreCompInfo.f90606a;
                if (i13 > 0) {
                    i13--;
                    wNafPreCompInfo.f90606a = i13;
                }
                wNafPreCompInfo2.f90606a = i13;
                wNafPreCompInfo2.setConfWidth(wNafPreCompInfo.getConfWidth());
                preComp = wNafPreCompInfo.getPreComp();
                preCompNeg = wNafPreCompInfo.getPreCompNeg();
                eCPointTwice = wNafPreCompInfo.getTwice();
            } else {
                eCPointTwice = null;
                preComp = null;
                preCompNeg = null;
            }
            int iMin = Math.min(16, Math.max(wNafPreCompInfo2.getConfWidth(), iMax));
            int i14 = 1 << (iMin - 2);
            int i15 = 0;
            if (preComp == null) {
                preComp = WNafUtil.f90610d;
                length = 0;
            } else {
                length = preComp.length;
            }
            if (length < i14) {
                ECPoint[] eCPointArr = new ECPoint[i14];
                System.arraycopy(preComp, 0, eCPointArr, 0, preComp.length);
                if (i14 == 1) {
                    eCPointArr[0] = this.f90617c.normalize();
                } else {
                    if (length == 0) {
                        eCPointArr[0] = this.f90617c;
                        i10 = 1;
                    } else {
                        i10 = length;
                    }
                    if (i14 == 2) {
                        eCPointArr[1] = this.f90617c.threeTimes();
                    } else {
                        ECPoint eCPointAdd = eCPointArr[i10 - 1];
                        if (eCPointTwice == null) {
                            eCPointTwice = eCPointArr[0].twice();
                            if (eCPointTwice.isInfinity() || !ECAlgorithms.isFpCurve(this.f90618d) || this.f90618d.getFieldSize() < 64 || !((coordinateSystem = this.f90618d.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                                eCPointCreatePoint = eCPointTwice;
                            } else {
                                zCoord = eCPointTwice.getZCoord(0);
                                eCPointCreatePoint = this.f90618d.createPoint(eCPointTwice.getXCoord().toBigInteger(), eCPointTwice.getYCoord().toBigInteger());
                                ECFieldElement eCFieldElementSquare = zCoord.square();
                                eCPointAdd = eCPointAdd.scaleX(eCFieldElementSquare).scaleY(eCFieldElementSquare.multiply(zCoord));
                                if (length == 0) {
                                    eCPointArr[0] = eCPointAdd;
                                }
                            }
                        } else {
                            eCPointCreatePoint = eCPointTwice;
                        }
                        while (i10 < i14) {
                            eCPointAdd = eCPointAdd.add(eCPointCreatePoint);
                            eCPointArr[i10] = eCPointAdd;
                            i10++;
                        }
                    }
                    this.f90618d.normalizeAll(eCPointArr, length, i14 - length, zCoord);
                }
                preComp = eCPointArr;
            }
            if (this.f90616b) {
                if (preCompNeg == null) {
                    preCompNeg = new ECPoint[i14];
                } else {
                    int length2 = preCompNeg.length;
                    if (length2 < i14) {
                        ECPoint[] eCPointArr2 = new ECPoint[i14];
                        System.arraycopy(preCompNeg, 0, eCPointArr2, 0, preCompNeg.length);
                        i15 = length2;
                        preCompNeg = eCPointArr2;
                    } else {
                        i15 = length2;
                    }
                }
                while (i15 < i14) {
                    preCompNeg[i15] = preComp[i15].negate();
                    i15++;
                }
            }
            wNafPreCompInfo2.setPreComp(preComp);
            wNafPreCompInfo2.setPreCompNeg(preCompNeg);
            wNafPreCompInfo2.setTwice(eCPointTwice);
            wNafPreCompInfo2.setWidth(iMin);
            return wNafPreCompInfo2;
        }
    }

    public static class d implements PreCompCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WNafPreCompInfo f90619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f90620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ECPointMap f90621c;

        public d(ECPointMap eCPointMap, WNafPreCompInfo wNafPreCompInfo, boolean z10) {
            this.f90619a = wNafPreCompInfo;
            this.f90620b = z10;
            this.f90621c = eCPointMap;
        }

        @Override // org.bouncycastle.math.ec.PreCompCallback
        public final PreCompInfo precompute(PreCompInfo preCompInfo) {
            ECPoint[] preComp;
            ECPoint[] preCompNeg;
            WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
            int width = this.f90619a.getWidth();
            int length = this.f90619a.getPreComp().length;
            boolean z10 = this.f90620b;
            if (wNafPreCompInfo != null && wNafPreCompInfo.getWidth() >= width && (preComp = wNafPreCompInfo.getPreComp()) != null && preComp.length >= length && (!z10 || ((preCompNeg = wNafPreCompInfo.getPreCompNeg()) != null && preCompNeg.length >= length))) {
                int i10 = wNafPreCompInfo.f90606a;
                if (i10 > 0) {
                    wNafPreCompInfo.f90606a = i10 - 1;
                }
                return wNafPreCompInfo;
            }
            WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
            wNafPreCompInfo2.f90606a = this.f90619a.f90606a;
            ECPoint twice = this.f90619a.getTwice();
            if (twice != null) {
                wNafPreCompInfo2.setTwice(this.f90621c.map(twice));
            }
            ECPoint[] preComp2 = this.f90619a.getPreComp();
            int length2 = preComp2.length;
            ECPoint[] eCPointArr = new ECPoint[length2];
            for (int i11 = 0; i11 < preComp2.length; i11++) {
                eCPointArr[i11] = this.f90621c.map(preComp2[i11]);
            }
            wNafPreCompInfo2.setPreComp(eCPointArr);
            wNafPreCompInfo2.setWidth(width);
            if (this.f90620b) {
                ECPoint[] eCPointArr2 = new ECPoint[length2];
                for (int i12 = 0; i12 < length2; i12++) {
                    eCPointArr2[i12] = eCPointArr[i12].negate();
                }
                wNafPreCompInfo2.setPreCompNeg(eCPointArr2);
            }
            return wNafPreCompInfo2;
        }
    }

    public static void configureBasepoint(ECPoint eCPoint) {
        ECCurve curve = eCPoint.getCurve();
        if (curve == null) {
            return;
        }
        BigInteger order = curve.getOrder();
        curve.precompute(eCPoint, "bc_wnaf", new a(Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3)));
    }

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return f90609c;
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
                iArr[i13] = i14 | ((bigInteger.testBit(i12) ? -1 : 1) << 16);
                i12++;
                i14 = 1;
                i13++;
            } else {
                i14++;
            }
            i12++;
        }
        int i15 = i13 + 1;
        iArr[i13] = 65536 | i14;
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
            return f90609c;
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
            return f90608b;
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
            return f90608b;
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
        return getWindowSize(i10, f90607a, 16);
    }

    public static ECPoint mapPointWithPrecomp(ECPoint eCPoint, int i10, boolean z10, ECPointMap eCPointMap) {
        ECCurve curve = eCPoint.getCurve();
        WNafPreCompInfo wNafPreCompInfoPrecompute = precompute(eCPoint, i10, z10);
        ECPoint map = eCPointMap.map(eCPoint);
        curve.precompute(map, "bc_wnaf", new b(eCPointMap, wNafPreCompInfoPrecompute, z10));
        return map;
    }

    public static WNafPreCompInfo precompute(ECPoint eCPoint, int i10, boolean z10) {
        ECCurve curve = eCPoint.getCurve();
        return (WNafPreCompInfo) curve.precompute(eCPoint, "bc_wnaf", new c(i10, z10, eCPoint, curve));
    }

    public static WNafPreCompInfo precomputeWithPointMap(ECPoint eCPoint, ECPointMap eCPointMap, WNafPreCompInfo wNafPreCompInfo, boolean z10) {
        return (WNafPreCompInfo) eCPoint.getCurve().precompute(eCPoint, "bc_wnaf", new d(eCPointMap, wNafPreCompInfo, z10));
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof WNafPreCompInfo) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static int getWindowSize(int i10, int i11) {
        return getWindowSize(i10, f90607a, i11);
    }

    public static int getWindowSize(int i10, int[] iArr) {
        return getWindowSize(i10, iArr, 16);
    }

    public static int getWindowSize(int i10, int[] iArr, int i11) {
        int i12 = 0;
        while (i12 < iArr.length && i10 >= iArr[i12]) {
            i12++;
        }
        return Math.max(2, Math.min(i11, i12 + 2));
    }
}
