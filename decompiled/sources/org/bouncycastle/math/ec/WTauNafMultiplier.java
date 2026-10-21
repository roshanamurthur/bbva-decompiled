package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes13.dex */
public class WTauNafMultiplier extends AbstractECMultiplier {
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr;
        b bVar;
        b bVarA;
        b bVar2;
        int i10;
        byte b10;
        BigInteger bigIntegerSubtract;
        byte b11;
        boolean z10;
        if (!(eCPoint instanceof ECPoint.AbstractF2m)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m) eCPoint;
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        byte bByteValue = abstractF2m2.getA().toBigInteger().byteValue();
        BigInteger bigInteger2 = c.f90627a;
        byte b12 = (byte) (bByteValue == 0 ? -1 : 1);
        synchronized (abstractF2m2) {
            try {
                if (abstractF2m2.f90572c == null) {
                    abstractF2m2.f90572c = c.c(abstractF2m2);
                }
                bigIntegerArr = abstractF2m2.f90572c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        BigInteger bigIntegerAdd = b12 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger3 = c.b(b12, fieldSize, true)[1];
        b bVarA2 = c.a(bigInteger, bigIntegerArr[0], bigInteger3, bByteValue, fieldSize);
        b bVarA3 = c.a(bigInteger, bigIntegerArr[1], bigInteger3, bByteValue, fieldSize);
        if (bVarA3.f90626b != bVarA2.f90626b) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if (b12 != 1 && b12 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerC = bVarA2.c();
        BigInteger bigIntegerC2 = bVarA3.c();
        int i11 = bVarA2.f90626b;
        b bVar3 = new b(bVarA2.f90625a.subtract(bigIntegerC.shiftLeft(i11)), i11);
        int i12 = bVarA3.f90626b;
        BigInteger bigIntegerSubtract2 = bVarA3.f90625a.subtract(bigIntegerC2.shiftLeft(i12));
        b bVar4 = new b(bigIntegerSubtract2, i12);
        b bVarA4 = bVar3.a(bVar3);
        if (b12 == 1) {
            bVar = bVarA4.a(bVar4);
        } else {
            BigInteger bigIntegerNegate = bigIntegerSubtract2.negate();
            if (i12 < 0) {
                throw new IllegalArgumentException("scale may not be negative");
            }
            int i13 = bVarA4.f90626b;
            if (i13 != i12) {
                throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
            }
            bVar = new b(bVarA4.f90625a.add(bigIntegerNegate), i13);
        }
        b bVarA5 = bVar4.a(bVar4).a(bVar4);
        b bVarA6 = bVarA5.a(bVar4);
        if (b12 == 1) {
            BigInteger bigIntegerNegate2 = bVarA5.f90625a.negate();
            int i14 = bVarA5.f90626b;
            if (i14 < 0) {
                throw new IllegalArgumentException("scale may not be negative");
            }
            int i15 = bVar3.f90626b;
            if (i15 != i14) {
                throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
            }
            bVarA = new b(bVar3.f90625a.add(bigIntegerNegate2), i15);
            bVar2 = bVar3.a(bVarA6);
        } else {
            bVarA = bVar3.a(bVarA5);
            BigInteger bigIntegerNegate3 = bVarA6.f90625a.negate();
            int i16 = bVarA6.f90626b;
            if (i16 < 0) {
                throw new IllegalArgumentException("scale may not be negative");
            }
            int i17 = bVar3.f90626b;
            if (i17 != i16) {
                throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
            }
            bVar2 = new b(bVar3.f90625a.add(bigIntegerNegate3), i17);
        }
        BigInteger bigInteger4 = ECConstants.ONE;
        int iB = bVar.b(bigInteger4);
        BigInteger bigInteger5 = c.f90627a;
        if (iB >= 0) {
            if (bVarA.b(bigInteger5) < 0) {
                b10 = b12;
                i10 = 0;
            } else {
                i10 = 1;
                b10 = 0;
            }
        } else if (bVar2.b(ECConstants.TWO) >= 0) {
            b10 = b12;
            i10 = 0;
        } else {
            i10 = 0;
            b10 = 0;
        }
        if (bVar.b(bigInteger5) < 0) {
            if (bVarA.b(bigInteger4) >= 0) {
                b10 = (byte) (-b12);
            } else {
                i10 = -1;
            }
        } else if (bVar2.b(c.f90628b) < 0) {
            b10 = (byte) (-b12);
        }
        BigInteger bigIntegerAdd2 = bigIntegerC.add(BigInteger.valueOf(i10));
        BigInteger bigIntegerAdd3 = bigIntegerC2.add(BigInteger.valueOf(b10));
        BigInteger bigIntegerSubtract3 = bigInteger.subtract(bigIntegerAdd.multiply(bigIntegerAdd2)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(bigIntegerAdd3));
        BigInteger bigIntegerSubtract4 = bigIntegerArr[1].multiply(bigIntegerAdd2).subtract(bigIntegerArr[0].multiply(bigIntegerAdd3));
        f[] fVarArr = bByteValue == 0 ? c.f90629c : c.f90631e;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(b12 == 1 ? 6L : 10L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(16L);
        if (b12 != 1 && b12 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerMultiply = bigIntegerSubtract3.multiply(bigIntegerSubtract3);
        BigInteger bigIntegerMultiply2 = bigIntegerSubtract3.multiply(bigIntegerSubtract4);
        BigInteger bigIntegerShiftLeft = bigIntegerSubtract4.multiply(bigIntegerSubtract4).shiftLeft(1);
        if (b12 == 1) {
            bigIntegerSubtract = bigIntegerMultiply.add(bigIntegerMultiply2);
        } else {
            if (b12 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerSubtract = bigIntegerMultiply.subtract(bigIntegerMultiply2);
        }
        int iBitLength = bigIntegerSubtract.add(bigIntegerShiftLeft).bitLength();
        int i18 = iBitLength > 30 ? iBitLength + 8 : 38;
        byte[] bArr = new byte[i18];
        BigInteger bigIntegerShiftRight = bigIntegerValueOf2.shiftRight(1);
        int i19 = 0;
        while (true) {
            BigInteger bigInteger6 = ECConstants.ZERO;
            if (bigIntegerSubtract3.equals(bigInteger6) && bigIntegerSubtract4.equals(bigInteger6)) {
                break;
            }
            if (bigIntegerSubtract3.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerSubtract3.add(bigIntegerSubtract4.multiply(bigIntegerValueOf)).mod(bigIntegerValueOf2);
                if (bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0) {
                    bigIntegerMod = bigIntegerMod.subtract(bigIntegerValueOf2);
                }
                byte bIntValue = (byte) bigIntegerMod.intValue();
                bArr[i19] = bIntValue;
                if (bIntValue < 0) {
                    b11 = (byte) (-bIntValue);
                    z10 = false;
                } else {
                    b11 = bIntValue;
                    z10 = true;
                }
                if (z10) {
                    bigIntegerSubtract3 = bigIntegerSubtract3.subtract(fVarArr[b11].f90851a);
                    bigIntegerSubtract4 = bigIntegerSubtract4.subtract(fVarArr[b11].f90852b);
                } else {
                    bigIntegerSubtract3 = bigIntegerSubtract3.add(fVarArr[b11].f90851a);
                    bigIntegerSubtract4 = bigIntegerSubtract4.add(fVarArr[b11].f90852b);
                }
            } else {
                bArr[i19] = 0;
            }
            BigInteger bigIntegerShiftRight2 = bigIntegerSubtract3.shiftRight(1);
            i19++;
            BigInteger bigIntegerAdd4 = b12 == 1 ? bigIntegerSubtract4.add(bigIntegerShiftRight2) : bigIntegerSubtract4.subtract(bigIntegerShiftRight2);
            bigIntegerSubtract4 = bigIntegerSubtract3.shiftRight(1).negate();
            bigIntegerSubtract3 = bigIntegerAdd4;
        }
        ECCurve.AbstractF2m abstractF2m3 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        ECPoint.AbstractF2m[] preComp = ((WTauNafPreCompInfo) abstractF2m3.precompute(abstractF2m, "bc_wtnaf", new e(abstractF2m, abstractF2m3.getA().toBigInteger().byteValue()))).getPreComp();
        ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[preComp.length];
        for (int i20 = 0; i20 < preComp.length; i20++) {
            abstractF2mArr[i20] = (ECPoint.AbstractF2m) preComp[i20].negate();
        }
        ECPoint.AbstractF2m abstractF2m4 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i21 = 0;
        for (int i22 = i18 - 1; i22 >= 0; i22--) {
            i21++;
            byte b13 = bArr[i22];
            if (b13 != 0) {
                abstractF2m4 = (ECPoint.AbstractF2m) abstractF2m4.tauPow(i21).add(b13 > 0 ? preComp[b13 >>> 1] : abstractF2mArr[(-b13) >>> 1]);
                i21 = 0;
            }
        }
        return i21 > 0 ? abstractF2m4.tauPow(i21) : abstractF2m4;
    }
}
