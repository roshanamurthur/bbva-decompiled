package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256K1Point extends ECPoint.AbstractFp {
    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP256K1FieldElement secP256K1FieldElement = (SecP256K1FieldElement) this.f25032b;
        SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement) this.f25033c;
        SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement) eCPoint.getXCoord();
        SecP256K1FieldElement secP256K1FieldElement4 = (SecP256K1FieldElement) eCPoint.getYCoord();
        SecP256K1FieldElement secP256K1FieldElement5 = (SecP256K1FieldElement) this.f25034d[0];
        SecP256K1FieldElement secP256K1FieldElement6 = (SecP256K1FieldElement) eCPoint.getZCoord(0);
        int[] iArrC = y3.c();
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        int[] iArrA3 = y3.a();
        boolean zIsOne = secP256K1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP256K1FieldElement3.f25120a;
            iArr2 = secP256K1FieldElement4.f25120a;
        } else {
            SecP256K1Field.square(secP256K1FieldElement5.f25120a, iArrA2);
            SecP256K1Field.multiply(iArrA2, secP256K1FieldElement3.f25120a, iArrA);
            SecP256K1Field.multiply(iArrA2, secP256K1FieldElement5.f25120a, iArrA2);
            SecP256K1Field.multiply(iArrA2, secP256K1FieldElement4.f25120a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = secP256K1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP256K1FieldElement.f25120a;
            iArr4 = secP256K1FieldElement2.f25120a;
        } else {
            SecP256K1Field.square(secP256K1FieldElement6.f25120a, iArrA3);
            SecP256K1Field.multiply(iArrA3, secP256K1FieldElement.f25120a, iArrC);
            SecP256K1Field.multiply(iArrA3, secP256K1FieldElement6.f25120a, iArrA3);
            SecP256K1Field.multiply(iArrA3, secP256K1FieldElement2.f25120a, iArrA3);
            iArr3 = iArrC;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = y3.a();
        SecP256K1Field.subtract(iArr3, iArr, iArrA4);
        SecP256K1Field.subtract(iArr4, iArr2, iArrA);
        if (y3.b(iArrA4)) {
            return y3.b(iArrA) ? twice() : curve.getInfinity();
        }
        SecP256K1Field.square(iArrA4, iArrA2);
        int[] iArrA5 = y3.a();
        SecP256K1Field.multiply(iArrA2, iArrA4, iArrA5);
        SecP256K1Field.multiply(iArrA2, iArr3, iArrA2);
        SecP256K1Field.negate(iArrA5, iArrA5);
        y3.c(iArr4, iArrA5, iArrC);
        SecP256K1Field.reduce32(y3.b(iArrA2, iArrA2, iArrA5), iArrA5);
        SecP256K1FieldElement secP256K1FieldElement7 = new SecP256K1FieldElement(iArrA3);
        SecP256K1Field.square(iArrA, secP256K1FieldElement7.f25120a);
        int[] iArr5 = secP256K1FieldElement7.f25120a;
        SecP256K1Field.subtract(iArr5, iArrA5, iArr5);
        SecP256K1FieldElement secP256K1FieldElement8 = new SecP256K1FieldElement(iArrA5);
        SecP256K1Field.subtract(iArrA2, secP256K1FieldElement7.f25120a, secP256K1FieldElement8.f25120a);
        SecP256K1Field.multiplyAddToExt(secP256K1FieldElement8.f25120a, iArrA, iArrC);
        SecP256K1Field.reduce(iArrC, secP256K1FieldElement8.f25120a);
        SecP256K1FieldElement secP256K1FieldElement9 = new SecP256K1FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = secP256K1FieldElement9.f25120a;
            SecP256K1Field.multiply(iArr6, secP256K1FieldElement5.f25120a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP256K1FieldElement9.f25120a;
            SecP256K1Field.multiply(iArr7, secP256K1FieldElement6.f25120a, iArr7);
        }
        return new SecP256K1Point(curve, secP256K1FieldElement7, secP256K1FieldElement8, new ECFieldElement[]{secP256K1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP256K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP256K1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP256K1FieldElement secP256K1FieldElement = (SecP256K1FieldElement) this.f25033c;
        if (secP256K1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement) this.f25032b;
        SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement) this.f25034d[0];
        int[] iArrA = y3.a();
        SecP256K1Field.square(secP256K1FieldElement.f25120a, iArrA);
        int[] iArrA2 = y3.a();
        SecP256K1Field.square(iArrA, iArrA2);
        int[] iArrA3 = y3.a();
        SecP256K1Field.square(secP256K1FieldElement2.f25120a, iArrA3);
        SecP256K1Field.reduce32(y3.b(iArrA3, iArrA3, iArrA3), iArrA3);
        SecP256K1Field.multiply(iArrA, secP256K1FieldElement2.f25120a, iArrA);
        SecP256K1Field.reduce32(e4.c(8, iArrA, 2, 0), iArrA);
        int[] iArrA4 = y3.a();
        SecP256K1Field.reduce32(e4.a(8, iArrA2, 3, 0, iArrA4), iArrA4);
        SecP256K1FieldElement secP256K1FieldElement4 = new SecP256K1FieldElement(iArrA2);
        SecP256K1Field.square(iArrA3, secP256K1FieldElement4.f25120a);
        int[] iArr = secP256K1FieldElement4.f25120a;
        SecP256K1Field.subtract(iArr, iArrA, iArr);
        int[] iArr2 = secP256K1FieldElement4.f25120a;
        SecP256K1Field.subtract(iArr2, iArrA, iArr2);
        SecP256K1FieldElement secP256K1FieldElement5 = new SecP256K1FieldElement(iArrA);
        SecP256K1Field.subtract(iArrA, secP256K1FieldElement4.f25120a, secP256K1FieldElement5.f25120a);
        int[] iArr3 = secP256K1FieldElement5.f25120a;
        SecP256K1Field.multiply(iArr3, iArrA3, iArr3);
        int[] iArr4 = secP256K1FieldElement5.f25120a;
        SecP256K1Field.subtract(iArr4, iArrA4, iArr4);
        SecP256K1FieldElement secP256K1FieldElement6 = new SecP256K1FieldElement(iArrA3);
        SecP256K1Field.twice(secP256K1FieldElement.f25120a, secP256K1FieldElement6.f25120a);
        if (!secP256K1FieldElement3.isOne()) {
            int[] iArr5 = secP256K1FieldElement6.f25120a;
            SecP256K1Field.multiply(iArr5, secP256K1FieldElement3.f25120a, iArr5);
        }
        return new SecP256K1Point(curve, secP256K1FieldElement4, secP256K1FieldElement5, new ECFieldElement[]{secP256K1FieldElement6}, this.f25035e);
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

    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP256K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
