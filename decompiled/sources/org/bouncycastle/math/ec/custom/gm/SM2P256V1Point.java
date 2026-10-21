package org.bouncycastle.math.ec.custom.gm;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes13.dex */
public class SM2P256V1Point extends ECPoint.AbstractFp {
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
        SM2P256V1FieldElement sM2P256V1FieldElement = (SM2P256V1FieldElement) this.f90598x;
        SM2P256V1FieldElement sM2P256V1FieldElement2 = (SM2P256V1FieldElement) this.f90599y;
        SM2P256V1FieldElement sM2P256V1FieldElement3 = (SM2P256V1FieldElement) eCPoint.getXCoord();
        SM2P256V1FieldElement sM2P256V1FieldElement4 = (SM2P256V1FieldElement) eCPoint.getYCoord();
        SM2P256V1FieldElement sM2P256V1FieldElement5 = (SM2P256V1FieldElement) this.zs[0];
        SM2P256V1FieldElement sM2P256V1FieldElement6 = (SM2P256V1FieldElement) eCPoint.getZCoord(0);
        int[] iArrCreateExt = Nat256.createExt();
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        int[] iArrCreate3 = Nat256.create();
        boolean zIsOne = sM2P256V1FieldElement5.isOne();
        if (zIsOne) {
            iArr = sM2P256V1FieldElement3.f90651x;
            iArr2 = sM2P256V1FieldElement4.f90651x;
        } else {
            SM2P256V1Field.square(sM2P256V1FieldElement5.f90651x, iArrCreate2);
            SM2P256V1Field.multiply(iArrCreate2, sM2P256V1FieldElement3.f90651x, iArrCreate);
            SM2P256V1Field.multiply(iArrCreate2, sM2P256V1FieldElement5.f90651x, iArrCreate2);
            SM2P256V1Field.multiply(iArrCreate2, sM2P256V1FieldElement4.f90651x, iArrCreate2);
            iArr = iArrCreate;
            iArr2 = iArrCreate2;
        }
        boolean zIsOne2 = sM2P256V1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = sM2P256V1FieldElement.f90651x;
            iArr4 = sM2P256V1FieldElement2.f90651x;
        } else {
            SM2P256V1Field.square(sM2P256V1FieldElement6.f90651x, iArrCreate3);
            SM2P256V1Field.multiply(iArrCreate3, sM2P256V1FieldElement.f90651x, iArrCreateExt);
            SM2P256V1Field.multiply(iArrCreate3, sM2P256V1FieldElement6.f90651x, iArrCreate3);
            SM2P256V1Field.multiply(iArrCreate3, sM2P256V1FieldElement2.f90651x, iArrCreate3);
            iArr3 = iArrCreateExt;
            iArr4 = iArrCreate3;
        }
        int[] iArrCreate4 = Nat256.create();
        SM2P256V1Field.subtract(iArr3, iArr, iArrCreate4);
        SM2P256V1Field.subtract(iArr4, iArr2, iArrCreate);
        if (Nat256.isZero(iArrCreate4)) {
            return Nat256.isZero(iArrCreate) ? twice() : curve.getInfinity();
        }
        SM2P256V1Field.square(iArrCreate4, iArrCreate2);
        int[] iArrCreate5 = Nat256.create();
        SM2P256V1Field.multiply(iArrCreate2, iArrCreate4, iArrCreate5);
        SM2P256V1Field.multiply(iArrCreate2, iArr3, iArrCreate2);
        SM2P256V1Field.negate(iArrCreate5, iArrCreate5);
        Nat256.mul(iArr4, iArrCreate5, iArrCreateExt);
        SM2P256V1Field.reduce32(Nat256.addBothTo(iArrCreate2, iArrCreate2, iArrCreate5), iArrCreate5);
        SM2P256V1FieldElement sM2P256V1FieldElement7 = new SM2P256V1FieldElement(iArrCreate3);
        SM2P256V1Field.square(iArrCreate, sM2P256V1FieldElement7.f90651x);
        int[] iArr5 = sM2P256V1FieldElement7.f90651x;
        SM2P256V1Field.subtract(iArr5, iArrCreate5, iArr5);
        SM2P256V1FieldElement sM2P256V1FieldElement8 = new SM2P256V1FieldElement(iArrCreate5);
        SM2P256V1Field.subtract(iArrCreate2, sM2P256V1FieldElement7.f90651x, sM2P256V1FieldElement8.f90651x);
        SM2P256V1Field.multiplyAddToExt(sM2P256V1FieldElement8.f90651x, iArrCreate, iArrCreateExt);
        SM2P256V1Field.reduce(iArrCreateExt, sM2P256V1FieldElement8.f90651x);
        SM2P256V1FieldElement sM2P256V1FieldElement9 = new SM2P256V1FieldElement(iArrCreate4);
        if (!zIsOne) {
            int[] iArr6 = sM2P256V1FieldElement9.f90651x;
            SM2P256V1Field.multiply(iArr6, sM2P256V1FieldElement5.f90651x, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = sM2P256V1FieldElement9.f90651x;
            SM2P256V1Field.multiply(iArr7, sM2P256V1FieldElement6.f90651x, iArr7);
        }
        return new SM2P256V1Point(curve, sM2P256V1FieldElement7, sM2P256V1FieldElement8, new ECFieldElement[]{sM2P256V1FieldElement9});
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint detach() {
        return new SM2P256V1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SM2P256V1Point(this.curve, this.f90598x, this.f90599y.negate(), this.zs);
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
        SM2P256V1FieldElement sM2P256V1FieldElement = (SM2P256V1FieldElement) this.f90599y;
        if (sM2P256V1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SM2P256V1FieldElement sM2P256V1FieldElement2 = (SM2P256V1FieldElement) this.f90598x;
        SM2P256V1FieldElement sM2P256V1FieldElement3 = (SM2P256V1FieldElement) this.zs[0];
        int[] iArrCreate = Nat256.create();
        int[] iArrCreate2 = Nat256.create();
        int[] iArrCreate3 = Nat256.create();
        SM2P256V1Field.square(sM2P256V1FieldElement.f90651x, iArrCreate3);
        int[] iArrCreate4 = Nat256.create();
        SM2P256V1Field.square(iArrCreate3, iArrCreate4);
        boolean zIsOne = sM2P256V1FieldElement3.isOne();
        int[] iArr = sM2P256V1FieldElement3.f90651x;
        if (!zIsOne) {
            SM2P256V1Field.square(iArr, iArrCreate2);
            iArr = iArrCreate2;
        }
        SM2P256V1Field.subtract(sM2P256V1FieldElement2.f90651x, iArr, iArrCreate);
        SM2P256V1Field.add(sM2P256V1FieldElement2.f90651x, iArr, iArrCreate2);
        SM2P256V1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SM2P256V1Field.reduce32(Nat256.addBothTo(iArrCreate2, iArrCreate2, iArrCreate2), iArrCreate2);
        SM2P256V1Field.multiply(iArrCreate3, sM2P256V1FieldElement2.f90651x, iArrCreate3);
        SM2P256V1Field.reduce32(Nat.shiftUpBits(8, iArrCreate3, 2, 0), iArrCreate3);
        SM2P256V1Field.reduce32(Nat.shiftUpBits(8, iArrCreate4, 3, 0, iArrCreate), iArrCreate);
        SM2P256V1FieldElement sM2P256V1FieldElement4 = new SM2P256V1FieldElement(iArrCreate4);
        SM2P256V1Field.square(iArrCreate2, sM2P256V1FieldElement4.f90651x);
        int[] iArr2 = sM2P256V1FieldElement4.f90651x;
        SM2P256V1Field.subtract(iArr2, iArrCreate3, iArr2);
        int[] iArr3 = sM2P256V1FieldElement4.f90651x;
        SM2P256V1Field.subtract(iArr3, iArrCreate3, iArr3);
        SM2P256V1FieldElement sM2P256V1FieldElement5 = new SM2P256V1FieldElement(iArrCreate3);
        SM2P256V1Field.subtract(iArrCreate3, sM2P256V1FieldElement4.f90651x, sM2P256V1FieldElement5.f90651x);
        int[] iArr4 = sM2P256V1FieldElement5.f90651x;
        SM2P256V1Field.multiply(iArr4, iArrCreate2, iArr4);
        int[] iArr5 = sM2P256V1FieldElement5.f90651x;
        SM2P256V1Field.subtract(iArr5, iArrCreate, iArr5);
        SM2P256V1FieldElement sM2P256V1FieldElement6 = new SM2P256V1FieldElement(iArrCreate2);
        SM2P256V1Field.twice(sM2P256V1FieldElement.f90651x, sM2P256V1FieldElement6.f90651x);
        if (!zIsOne) {
            int[] iArr6 = sM2P256V1FieldElement6.f90651x;
            SM2P256V1Field.multiply(iArr6, sM2P256V1FieldElement3.f90651x, iArr6);
        }
        return new SM2P256V1Point(curve, sM2P256V1FieldElement4, sM2P256V1FieldElement5, new ECFieldElement[]{sM2P256V1FieldElement6});
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
