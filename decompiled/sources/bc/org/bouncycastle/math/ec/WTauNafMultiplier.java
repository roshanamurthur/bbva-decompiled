package bc.org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class WTauNafMultiplier extends AbstractECMultiplier {
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    @Override // bc.org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint a(ECPoint eCPoint, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr;
        c cVar;
        c cVarB;
        c cVar2;
        int i10;
        byte b10;
        BigInteger bigIntegerAdd;
        byte b11;
        boolean z10;
        ECPoint.AbstractF2m[] preComp;
        if (!(eCPoint instanceof ECPoint.AbstractF2m)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        ECPoint.AbstractF2m abstractF2m = (ECPoint.AbstractF2m) eCPoint;
        ECCurve.AbstractF2m abstractF2m2 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        byte bByteValue = abstractF2m2.getA().toBigInteger().byteValue();
        BigInteger bigInteger2 = d.f25168a;
        byte b12 = (byte) (bByteValue == 0 ? -1 : 1);
        synchronized (abstractF2m2) {
            try {
                if (abstractF2m2.f25012k == null) {
                    abstractF2m2.f25012k = d.c(abstractF2m2);
                }
                bigIntegerArr = abstractF2m2.f25012k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        BigInteger bigIntegerAdd2 = b12 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger3 = d.b(b12, fieldSize, true)[1];
        c cVarA = d.a(bigInteger, bigIntegerArr[0], bigInteger3, bByteValue, fieldSize);
        c cVarA2 = d.a(bigInteger, bigIntegerArr[1], bigInteger3, bByteValue, fieldSize);
        if (cVarA2.f25058b != cVarA.f25058b) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if (b12 != 1 && b12 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerC = cVarA.c();
        BigInteger bigIntegerC2 = cVarA2.c();
        int i11 = cVarA.f25058b;
        c cVar3 = new c(cVarA.f25057a.subtract(bigIntegerC.shiftLeft(i11)), i11);
        int i12 = cVarA2.f25058b;
        BigInteger bigIntegerSubtract = cVarA2.f25057a.subtract(bigIntegerC2.shiftLeft(i12));
        c cVar4 = new c(bigIntegerSubtract, i12);
        c cVarB2 = cVar3.b(cVar3);
        if (b12 == 1) {
            cVar = cVarB2.b(cVar4);
        } else {
            BigInteger bigIntegerNegate = bigIntegerSubtract.negate();
            if (i12 < 0) {
                throw new IllegalArgumentException("scale may not be negative");
            }
            int i13 = cVarB2.f25058b;
            if (i13 != i12) {
                throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
            }
            cVar = new c(cVarB2.f25057a.add(bigIntegerNegate), i13);
        }
        c cVarB3 = cVar4.b(cVar4).b(cVar4);
        c cVarB4 = cVarB3.b(cVar4);
        if (b12 == 1) {
            BigInteger bigIntegerNegate2 = cVarB3.f25057a.negate();
            int i14 = cVarB3.f25058b;
            if (i14 < 0) {
                throw new IllegalArgumentException("scale may not be negative");
            }
            int i15 = cVar3.f25058b;
            if (i15 != i14) {
                throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
            }
            cVarB = new c(cVar3.f25057a.add(bigIntegerNegate2), i15);
            cVar2 = cVar3.b(cVarB4);
        } else {
            cVarB = cVar3.b(cVarB3);
            BigInteger bigIntegerNegate3 = cVarB4.f25057a.negate();
            int i16 = cVarB4.f25058b;
            if (i16 < 0) {
                throw new IllegalArgumentException("scale may not be negative");
            }
            int i17 = cVar3.f25058b;
            if (i17 != i16) {
                throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
            }
            cVar2 = new c(cVar3.f25057a.add(bigIntegerNegate3), i17);
        }
        BigInteger bigInteger4 = ECConstants.ONE;
        int iA = cVar.a(bigInteger4);
        BigInteger bigInteger5 = d.f25168a;
        if (iA >= 0) {
            if (cVarB.a(bigInteger5) < 0) {
                b10 = b12;
                i10 = 0;
            } else {
                i10 = 1;
                b10 = 0;
            }
        } else if (cVar2.a(ECConstants.TWO) >= 0) {
            b10 = b12;
            i10 = 0;
        } else {
            i10 = 0;
            b10 = 0;
        }
        if (cVar.a(bigInteger5) < 0) {
            if (cVarB.a(bigInteger4) >= 0) {
                b10 = (byte) (-b12);
            } else {
                i10 = -1;
            }
        } else if (cVar2.a(d.f25169b) < 0) {
            b10 = (byte) (-b12);
        }
        BigInteger bigIntegerAdd3 = bigIntegerC.add(BigInteger.valueOf(i10));
        BigInteger bigIntegerAdd4 = bigIntegerC2.add(BigInteger.valueOf(b10));
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(bigIntegerAdd2.multiply(bigIntegerAdd3)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(bigIntegerAdd4));
        BigInteger bigIntegerSubtract3 = bigIntegerArr[1].multiply(bigIntegerAdd3).subtract(bigIntegerArr[0].multiply(bigIntegerAdd4));
        PreCompInfo preCompInfo = abstractF2m2.getPreCompInfo(abstractF2m, "bc_wtnaf");
        e[] eVarArr = bByteValue == 0 ? d.f25170c : d.f25172e;
        BigInteger bigIntegerValueOf = b12 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(16L);
        if (b12 != 1 && b12 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigIntegerMultiply = bigIntegerSubtract2.multiply(bigIntegerSubtract2);
        BigInteger bigIntegerMultiply2 = bigIntegerSubtract2.multiply(bigIntegerSubtract3);
        BigInteger bigIntegerShiftLeft = bigIntegerSubtract3.multiply(bigIntegerSubtract3).shiftLeft(1);
        if (b12 == 1) {
            bigIntegerAdd = bigIntegerMultiply.add(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        } else {
            if (b12 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerAdd = bigIntegerMultiply.subtract(bigIntegerMultiply2).add(bigIntegerShiftLeft);
        }
        int iBitLength = bigIntegerAdd.bitLength();
        int i18 = iBitLength > 30 ? iBitLength + 8 : 38;
        byte[] bArr = new byte[i18];
        BigInteger bigIntegerShiftRight = bigIntegerValueOf2.shiftRight(1);
        int i19 = 0;
        while (true) {
            BigInteger bigInteger6 = ECConstants.ZERO;
            if (bigIntegerSubtract2.equals(bigInteger6) && bigIntegerSubtract3.equals(bigInteger6)) {
                break;
            }
            if (bigIntegerSubtract2.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerSubtract2.add(bigIntegerSubtract3.multiply(bigIntegerValueOf)).mod(bigIntegerValueOf2);
                byte bIntValue = (byte) (bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0 ? bigIntegerMod.subtract(bigIntegerValueOf2).intValue() : bigIntegerMod.intValue());
                bArr[i19] = bIntValue;
                if (bIntValue < 0) {
                    b11 = (byte) (-bIntValue);
                    z10 = false;
                } else {
                    b11 = bIntValue;
                    z10 = true;
                }
                if (z10) {
                    bigIntegerSubtract2 = bigIntegerSubtract2.subtract(eVarArr[b11].f25174a);
                    bigIntegerSubtract3 = bigIntegerSubtract3.subtract(eVarArr[b11].f25175b);
                } else {
                    bigIntegerSubtract2 = bigIntegerSubtract2.add(eVarArr[b11].f25174a);
                    bigIntegerSubtract3 = bigIntegerSubtract3.add(eVarArr[b11].f25175b);
                }
            } else {
                bArr[i19] = 0;
            }
            i19++;
            BigInteger bigIntegerAdd5 = b12 == 1 ? bigIntegerSubtract3.add(bigIntegerSubtract2.shiftRight(1)) : bigIntegerSubtract3.subtract(bigIntegerSubtract2.shiftRight(1));
            bigIntegerSubtract3 = bigIntegerSubtract2.shiftRight(1).negate();
            bigIntegerSubtract2 = bigIntegerAdd5;
        }
        ECCurve.AbstractF2m abstractF2m3 = (ECCurve.AbstractF2m) abstractF2m.getCurve();
        byte bByteValue2 = abstractF2m3.getA().toBigInteger().byteValue();
        if (preCompInfo == null || !(preCompInfo instanceof WTauNafPreCompInfo)) {
            byte[][] bArr2 = bByteValue2 == 0 ? d.f25171d : d.f25173f;
            ECPoint.AbstractF2m[] abstractF2mArr = new ECPoint.AbstractF2m[(bArr2.length + 1) >>> 1];
            abstractF2mArr[0] = abstractF2m;
            int length = bArr2.length;
            for (int i20 = 3; i20 < length; i20 += 2) {
                int i21 = i20 >>> 1;
                byte[] bArr3 = bArr2[i20];
                ECPoint.AbstractF2m abstractF2mTauPow = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
                ECPoint.AbstractF2m abstractF2m4 = (ECPoint.AbstractF2m) abstractF2m.negate();
                int i22 = 0;
                for (int length2 = bArr3.length - 1; length2 >= 0; length2--) {
                    i22++;
                    byte b13 = bArr3[length2];
                    if (b13 != 0) {
                        abstractF2mTauPow = (ECPoint.AbstractF2m) abstractF2mTauPow.tauPow(i22).add(b13 > 0 ? abstractF2m : abstractF2m4);
                        i22 = 0;
                    }
                }
                if (i22 > 0) {
                    abstractF2mTauPow = abstractF2mTauPow.tauPow(i22);
                }
                abstractF2mArr[i21] = abstractF2mTauPow;
            }
            abstractF2m.getCurve().normalizeAll(abstractF2mArr);
            WTauNafPreCompInfo wTauNafPreCompInfo = new WTauNafPreCompInfo();
            wTauNafPreCompInfo.setPreComp(abstractF2mArr);
            abstractF2m3.setPreCompInfo(abstractF2m, "bc_wtnaf", wTauNafPreCompInfo);
            preComp = abstractF2mArr;
        } else {
            preComp = ((WTauNafPreCompInfo) preCompInfo).getPreComp();
        }
        ECPoint.AbstractF2m[] abstractF2mArr2 = new ECPoint.AbstractF2m[preComp.length];
        for (int i23 = 0; i23 < preComp.length; i23++) {
            abstractF2mArr2[i23] = (ECPoint.AbstractF2m) preComp[i23].negate();
        }
        ECPoint.AbstractF2m abstractF2m5 = (ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i24 = 0;
        for (int i25 = i18 - 1; i25 >= 0; i25--) {
            i24++;
            byte b14 = bArr[i25];
            if (b14 != 0) {
                abstractF2m5 = (ECPoint.AbstractF2m) abstractF2m5.tauPow(i24).add(b14 > 0 ? preComp[b14 >>> 1] : abstractF2mArr2[(-b14) >>> 1]);
                i24 = 0;
            }
        }
        return i24 > 0 ? abstractF2m5.tauPow(i24) : abstractF2m5;
    }
}
