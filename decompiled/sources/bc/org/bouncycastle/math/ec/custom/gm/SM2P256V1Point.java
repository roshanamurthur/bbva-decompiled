package bc.org.bouncycastle.math.ec.custom.gm;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;

/* JADX INFO: loaded from: classes2.dex */
public class SM2P256V1Point extends ECPoint.AbstractFp {
    public SM2P256V1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
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
        SM2P256V1FieldElement sM2P256V1FieldElement = (SM2P256V1FieldElement) this.f25032b;
        SM2P256V1FieldElement sM2P256V1FieldElement2 = (SM2P256V1FieldElement) this.f25033c;
        SM2P256V1FieldElement sM2P256V1FieldElement3 = (SM2P256V1FieldElement) eCPoint.getXCoord();
        SM2P256V1FieldElement sM2P256V1FieldElement4 = (SM2P256V1FieldElement) eCPoint.getYCoord();
        SM2P256V1FieldElement sM2P256V1FieldElement5 = (SM2P256V1FieldElement) this.f25034d[0];
        SM2P256V1FieldElement sM2P256V1FieldElement6 = (SM2P256V1FieldElement) eCPoint.getZCoord(0);
        int[] iArrC = y3.c();
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        int[] iArrA3 = y3.a();
        boolean zIsOne = sM2P256V1FieldElement5.isOne();
        if (zIsOne) {
            iArr = sM2P256V1FieldElement3.f25069a;
            iArr2 = sM2P256V1FieldElement4.f25069a;
        } else {
            SM2P256V1Field.square(sM2P256V1FieldElement5.f25069a, iArrA2);
            SM2P256V1Field.multiply(iArrA2, sM2P256V1FieldElement3.f25069a, iArrA);
            SM2P256V1Field.multiply(iArrA2, sM2P256V1FieldElement5.f25069a, iArrA2);
            SM2P256V1Field.multiply(iArrA2, sM2P256V1FieldElement4.f25069a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = sM2P256V1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = sM2P256V1FieldElement.f25069a;
            iArr4 = sM2P256V1FieldElement2.f25069a;
        } else {
            SM2P256V1Field.square(sM2P256V1FieldElement6.f25069a, iArrA3);
            SM2P256V1Field.multiply(iArrA3, sM2P256V1FieldElement.f25069a, iArrC);
            SM2P256V1Field.multiply(iArrA3, sM2P256V1FieldElement6.f25069a, iArrA3);
            SM2P256V1Field.multiply(iArrA3, sM2P256V1FieldElement2.f25069a, iArrA3);
            iArr3 = iArrC;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = y3.a();
        SM2P256V1Field.subtract(iArr3, iArr, iArrA4);
        SM2P256V1Field.subtract(iArr4, iArr2, iArrA);
        if (y3.b(iArrA4)) {
            return y3.b(iArrA) ? twice() : curve.getInfinity();
        }
        SM2P256V1Field.square(iArrA4, iArrA2);
        int[] iArrA5 = y3.a();
        SM2P256V1Field.multiply(iArrA2, iArrA4, iArrA5);
        SM2P256V1Field.multiply(iArrA2, iArr3, iArrA2);
        SM2P256V1Field.negate(iArrA5, iArrA5);
        y3.c(iArr4, iArrA5, iArrC);
        SM2P256V1Field.reduce32(y3.b(iArrA2, iArrA2, iArrA5), iArrA5);
        SM2P256V1FieldElement sM2P256V1FieldElement7 = new SM2P256V1FieldElement(iArrA3);
        SM2P256V1Field.square(iArrA, sM2P256V1FieldElement7.f25069a);
        int[] iArr5 = sM2P256V1FieldElement7.f25069a;
        SM2P256V1Field.subtract(iArr5, iArrA5, iArr5);
        SM2P256V1FieldElement sM2P256V1FieldElement8 = new SM2P256V1FieldElement(iArrA5);
        SM2P256V1Field.subtract(iArrA2, sM2P256V1FieldElement7.f25069a, sM2P256V1FieldElement8.f25069a);
        SM2P256V1Field.multiplyAddToExt(sM2P256V1FieldElement8.f25069a, iArrA, iArrC);
        SM2P256V1Field.reduce(iArrC, sM2P256V1FieldElement8.f25069a);
        SM2P256V1FieldElement sM2P256V1FieldElement9 = new SM2P256V1FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = sM2P256V1FieldElement9.f25069a;
            SM2P256V1Field.multiply(iArr6, sM2P256V1FieldElement5.f25069a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = sM2P256V1FieldElement9.f25069a;
            SM2P256V1Field.multiply(iArr7, sM2P256V1FieldElement6.f25069a, iArr7);
        }
        return new SM2P256V1Point(curve, sM2P256V1FieldElement7, sM2P256V1FieldElement8, new ECFieldElement[]{sM2P256V1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SM2P256V1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SM2P256V1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f25033c.isZero()) ? this : twice().add(this);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SM2P256V1FieldElement sM2P256V1FieldElement = (SM2P256V1FieldElement) this.f25033c;
        if (sM2P256V1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SM2P256V1FieldElement sM2P256V1FieldElement2 = (SM2P256V1FieldElement) this.f25032b;
        SM2P256V1FieldElement sM2P256V1FieldElement3 = (SM2P256V1FieldElement) this.f25034d[0];
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        int[] iArrA3 = y3.a();
        SM2P256V1Field.square(sM2P256V1FieldElement.f25069a, iArrA3);
        int[] iArrA4 = y3.a();
        SM2P256V1Field.square(iArrA3, iArrA4);
        boolean zIsOne = sM2P256V1FieldElement3.isOne();
        int[] iArr = sM2P256V1FieldElement3.f25069a;
        if (!zIsOne) {
            SM2P256V1Field.square(iArr, iArrA2);
            iArr = iArrA2;
        }
        SM2P256V1Field.subtract(sM2P256V1FieldElement2.f25069a, iArr, iArrA);
        SM2P256V1Field.add(sM2P256V1FieldElement2.f25069a, iArr, iArrA2);
        SM2P256V1Field.multiply(iArrA2, iArrA, iArrA2);
        SM2P256V1Field.reduce32(y3.b(iArrA2, iArrA2, iArrA2), iArrA2);
        SM2P256V1Field.multiply(iArrA3, sM2P256V1FieldElement2.f25069a, iArrA3);
        SM2P256V1Field.reduce32(e4.c(8, iArrA3, 2, 0), iArrA3);
        SM2P256V1Field.reduce32(e4.a(8, iArrA4, 3, 0, iArrA), iArrA);
        SM2P256V1FieldElement sM2P256V1FieldElement4 = new SM2P256V1FieldElement(iArrA4);
        SM2P256V1Field.square(iArrA2, sM2P256V1FieldElement4.f25069a);
        int[] iArr2 = sM2P256V1FieldElement4.f25069a;
        SM2P256V1Field.subtract(iArr2, iArrA3, iArr2);
        int[] iArr3 = sM2P256V1FieldElement4.f25069a;
        SM2P256V1Field.subtract(iArr3, iArrA3, iArr3);
        SM2P256V1FieldElement sM2P256V1FieldElement5 = new SM2P256V1FieldElement(iArrA3);
        SM2P256V1Field.subtract(iArrA3, sM2P256V1FieldElement4.f25069a, sM2P256V1FieldElement5.f25069a);
        int[] iArr4 = sM2P256V1FieldElement5.f25069a;
        SM2P256V1Field.multiply(iArr4, iArrA2, iArr4);
        int[] iArr5 = sM2P256V1FieldElement5.f25069a;
        SM2P256V1Field.subtract(iArr5, iArrA, iArr5);
        SM2P256V1FieldElement sM2P256V1FieldElement6 = new SM2P256V1FieldElement(iArrA2);
        SM2P256V1Field.twice(sM2P256V1FieldElement.f25069a, sM2P256V1FieldElement6.f25069a);
        if (!zIsOne) {
            int[] iArr6 = sM2P256V1FieldElement6.f25069a;
            SM2P256V1Field.multiply(iArr6, sM2P256V1FieldElement3.f25069a, iArr6);
        }
        return new SM2P256V1Point(curve, sM2P256V1FieldElement4, sM2P256V1FieldElement5, new ECFieldElement[]{sM2P256V1FieldElement6}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
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
        return this.f25033c.isZero() ? eCPoint : twice().add(eCPoint);
    }

    public SM2P256V1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SM2P256V1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
