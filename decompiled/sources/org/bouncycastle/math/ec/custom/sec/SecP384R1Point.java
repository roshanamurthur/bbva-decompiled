package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;

/* JADX INFO: loaded from: classes13.dex */
public class SecP384R1Point extends ECPoint.AbstractFp {
    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        if (this == eCPoint) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f90598x;
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f90599y;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) eCPoint.getXCoord();
        SecP384R1FieldElement secP384R1FieldElement4 = (SecP384R1FieldElement) eCPoint.getYCoord();
        SecP384R1FieldElement secP384R1FieldElement5 = (SecP384R1FieldElement) this.zs[0];
        SecP384R1FieldElement secP384R1FieldElement6 = (SecP384R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreate = Nat.create(24);
        int[] iArrCreate2 = Nat.create(24);
        int[] iArrCreate3 = Nat.create(12);
        int[] iArrCreate4 = Nat.create(12);
        boolean zIsOne = secP384R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP384R1FieldElement3.f90746x;
            iArr2 = secP384R1FieldElement4.f90746x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement5.f90746x, iArrCreate3);
            SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement3.f90746x, iArrCreate2);
            SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement5.f90746x, iArrCreate3);
            SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement4.f90746x, iArrCreate3);
            iArr = iArrCreate2;
            iArr2 = iArrCreate3;
        }
        boolean zIsOne2 = secP384R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP384R1FieldElement.f90746x;
            iArr4 = secP384R1FieldElement2.f90746x;
        } else {
            SecP384R1Field.square(secP384R1FieldElement6.f90746x, iArrCreate4);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement.f90746x, iArrCreate);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement6.f90746x, iArrCreate4);
            SecP384R1Field.multiply(iArrCreate4, secP384R1FieldElement2.f90746x, iArrCreate4);
            iArr3 = iArrCreate;
            iArr4 = iArrCreate4;
        }
        int[] iArrCreate5 = Nat.create(12);
        SecP384R1Field.subtract(iArr3, iArr, iArrCreate5);
        int[] iArrCreate6 = Nat.create(12);
        SecP384R1Field.subtract(iArr4, iArr2, iArrCreate6);
        if (Nat.isZero(12, iArrCreate5)) {
            return Nat.isZero(12, iArrCreate6) ? twice() : curve.getInfinity();
        }
        SecP384R1Field.square(iArrCreate5, iArrCreate3);
        int[] iArrCreate7 = Nat.create(12);
        SecP384R1Field.multiply(iArrCreate3, iArrCreate5, iArrCreate7);
        SecP384R1Field.multiply(iArrCreate3, iArr3, iArrCreate3);
        SecP384R1Field.negate(iArrCreate7, iArrCreate7);
        Nat384.mul(iArr4, iArrCreate7, iArrCreate);
        SecP384R1Field.reduce32(Nat.addBothTo(12, iArrCreate3, iArrCreate3, iArrCreate7), iArrCreate7);
        SecP384R1FieldElement secP384R1FieldElement7 = new SecP384R1FieldElement(iArrCreate4);
        SecP384R1Field.square(iArrCreate6, secP384R1FieldElement7.f90746x);
        int[] iArr5 = secP384R1FieldElement7.f90746x;
        SecP384R1Field.subtract(iArr5, iArrCreate7, iArr5);
        SecP384R1FieldElement secP384R1FieldElement8 = new SecP384R1FieldElement(iArrCreate7);
        SecP384R1Field.subtract(iArrCreate3, secP384R1FieldElement7.f90746x, secP384R1FieldElement8.f90746x);
        Nat384.mul(secP384R1FieldElement8.f90746x, iArrCreate6, iArrCreate2);
        SecP384R1Field.addExt(iArrCreate, iArrCreate2, iArrCreate);
        SecP384R1Field.reduce(iArrCreate, secP384R1FieldElement8.f90746x);
        SecP384R1FieldElement secP384R1FieldElement9 = new SecP384R1FieldElement(iArrCreate5);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement9.f90746x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement5.f90746x, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP384R1FieldElement9.f90746x;
            SecP384R1Field.multiply(iArr7, secP384R1FieldElement6.f90746x, iArr7);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement7, secP384R1FieldElement8, new ECFieldElement[]{secP384R1FieldElement9});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP384R1Point(this.curve, this.f90598x, this.f90599y.negate(), this.zs);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f90599y.isZero()) ? this : twice().add(this);
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f90599y;
        if (secP384R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f90598x;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) this.zs[0];
        int[] iArrCreate = Nat.create(12);
        int[] iArrCreate2 = Nat.create(12);
        int[] iArrCreate3 = Nat.create(12);
        SecP384R1Field.square(secP384R1FieldElement.f90746x, iArrCreate3);
        int[] iArrCreate4 = Nat.create(12);
        SecP384R1Field.square(iArrCreate3, iArrCreate4);
        boolean zIsOne = secP384R1FieldElement3.isOne();
        int[] iArr = secP384R1FieldElement3.f90746x;
        if (!zIsOne) {
            SecP384R1Field.square(iArr, iArrCreate2);
            iArr = iArrCreate2;
        }
        SecP384R1Field.subtract(secP384R1FieldElement2.f90746x, iArr, iArrCreate);
        SecP384R1Field.add(secP384R1FieldElement2.f90746x, iArr, iArrCreate2);
        SecP384R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP384R1Field.reduce32(Nat.addBothTo(12, iArrCreate2, iArrCreate2, iArrCreate2), iArrCreate2);
        SecP384R1Field.multiply(iArrCreate3, secP384R1FieldElement2.f90746x, iArrCreate3);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, iArrCreate3, 2, 0), iArrCreate3);
        SecP384R1Field.reduce32(Nat.shiftUpBits(12, iArrCreate4, 3, 0, iArrCreate), iArrCreate);
        SecP384R1FieldElement secP384R1FieldElement4 = new SecP384R1FieldElement(iArrCreate4);
        SecP384R1Field.square(iArrCreate2, secP384R1FieldElement4.f90746x);
        int[] iArr2 = secP384R1FieldElement4.f90746x;
        SecP384R1Field.subtract(iArr2, iArrCreate3, iArr2);
        int[] iArr3 = secP384R1FieldElement4.f90746x;
        SecP384R1Field.subtract(iArr3, iArrCreate3, iArr3);
        SecP384R1FieldElement secP384R1FieldElement5 = new SecP384R1FieldElement(iArrCreate3);
        SecP384R1Field.subtract(iArrCreate3, secP384R1FieldElement4.f90746x, secP384R1FieldElement5.f90746x);
        int[] iArr4 = secP384R1FieldElement5.f90746x;
        SecP384R1Field.multiply(iArr4, iArrCreate2, iArr4);
        int[] iArr5 = secP384R1FieldElement5.f90746x;
        SecP384R1Field.subtract(iArr5, iArrCreate, iArr5);
        SecP384R1FieldElement secP384R1FieldElement6 = new SecP384R1FieldElement(iArrCreate2);
        SecP384R1Field.twice(secP384R1FieldElement.f90746x, secP384R1FieldElement6.f90746x);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement6.f90746x;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement3.f90746x, iArr6);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement4, secP384R1FieldElement5, new ECFieldElement[]{secP384R1FieldElement6});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (this == eCPoint) {
            return threeTimes();
        }
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        return this.f90599y.isZero() ? eCPoint : twice().add(eCPoint);
    }
}
