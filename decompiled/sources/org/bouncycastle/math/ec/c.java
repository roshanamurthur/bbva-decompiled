package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f90627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f90628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f[] f90629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[][] f90630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f[] f90631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[][] f90632f;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        f90627a = bigIntegerNegate;
        f90628b = ECConstants.TWO.negate();
        BigInteger bigIntegerNegate2 = ECConstants.THREE.negate();
        BigInteger bigInteger2 = ECConstants.ZERO;
        f90629c = new f[]{null, new f(bigInteger, bigInteger2), null, new f(bigIntegerNegate2, bigIntegerNegate), null, new f(bigIntegerNegate, bigIntegerNegate), null, new f(bigInteger, bigIntegerNegate), null};
        f90630d = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        f90631e = new f[]{null, new f(bigInteger, bigInteger2), null, new f(bigIntegerNegate2, bigInteger), null, new f(bigIntegerNegate, bigInteger), null, new f(bigInteger, bigInteger), null};
        f90632f = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static b a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b10, int i10) {
        int i11 = (i10 + 5) / 2;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i10 - (i11 + 10)) - 2) + b10));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i10)));
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i11);
        if (bigIntegerAdd.testBit(i11 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(ECConstants.ONE);
        }
        return new b(bigIntegerShiftRight, 10);
    }

    public static BigInteger[] b(byte b10, int i10, boolean z10) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b10 != 1 && b10 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z10) {
            bigInteger = ECConstants.TWO;
            bigIntegerSubtract = BigInteger.valueOf(b10);
        } else {
            bigInteger = ECConstants.ZERO;
            bigIntegerSubtract = ECConstants.ONE;
        }
        int i11 = 1;
        while (i11 < i10) {
            i11++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b10 == 1 ? bigIntegerSubtract : bigIntegerSubtract.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static BigInteger[] c(ECCurve.AbstractF2m abstractF2m) {
        int i10;
        if (!abstractF2m.isKoblitz()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int fieldSize = abstractF2m.getFieldSize();
        int iIntValue = abstractF2m.getA().toBigInteger().intValue();
        byte b10 = (byte) (iIntValue == 0 ? -1 : 1);
        BigInteger cofactor = abstractF2m.getCofactor();
        if (cofactor != null) {
            if (cofactor.equals(ECConstants.TWO)) {
                i10 = 1;
            } else if (cofactor.equals(ECConstants.FOUR)) {
                i10 = 2;
            }
            BigInteger[] bigIntegerArrB = b(b10, (fieldSize + 3) - iIntValue, false);
            if (b10 == 1) {
                bigIntegerArrB[0] = bigIntegerArrB[0].negate();
                bigIntegerArrB[1] = bigIntegerArrB[1].negate();
            }
            BigInteger bigInteger = ECConstants.ONE;
            return new BigInteger[]{bigInteger.add(bigIntegerArrB[1]).shiftRight(i10), bigInteger.add(bigIntegerArrB[0]).shiftRight(i10).negate()};
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }
}
