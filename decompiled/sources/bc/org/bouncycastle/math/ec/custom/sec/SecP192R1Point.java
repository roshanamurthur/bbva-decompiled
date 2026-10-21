package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;

/* JADX INFO: loaded from: classes2.dex */
public class SecP192R1Point extends ECPoint.AbstractFp {
    public SecP192R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP192R1FieldElement secP192R1FieldElement = (SecP192R1FieldElement) this.f25032b;
        SecP192R1FieldElement secP192R1FieldElement2 = (SecP192R1FieldElement) this.f25033c;
        SecP192R1FieldElement secP192R1FieldElement3 = (SecP192R1FieldElement) eCPoint.getXCoord();
        SecP192R1FieldElement secP192R1FieldElement4 = (SecP192R1FieldElement) eCPoint.getYCoord();
        SecP192R1FieldElement secP192R1FieldElement5 = (SecP192R1FieldElement) this.f25034d[0];
        SecP192R1FieldElement secP192R1FieldElement6 = (SecP192R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrC = w3.c();
        int[] iArrA = w3.a();
        int[] iArrA2 = w3.a();
        int[] iArrA3 = w3.a();
        boolean zIsOne = secP192R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP192R1FieldElement3.f25101a;
            iArr2 = secP192R1FieldElement4.f25101a;
        } else {
            SecP192R1Field.square(secP192R1FieldElement5.f25101a, iArrA2);
            SecP192R1Field.multiply(iArrA2, secP192R1FieldElement3.f25101a, iArrA);
            SecP192R1Field.multiply(iArrA2, secP192R1FieldElement5.f25101a, iArrA2);
            SecP192R1Field.multiply(iArrA2, secP192R1FieldElement4.f25101a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = secP192R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP192R1FieldElement.f25101a;
            iArr4 = secP192R1FieldElement2.f25101a;
        } else {
            SecP192R1Field.square(secP192R1FieldElement6.f25101a, iArrA3);
            SecP192R1Field.multiply(iArrA3, secP192R1FieldElement.f25101a, iArrC);
            SecP192R1Field.multiply(iArrA3, secP192R1FieldElement6.f25101a, iArrA3);
            SecP192R1Field.multiply(iArrA3, secP192R1FieldElement2.f25101a, iArrA3);
            iArr3 = iArrC;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = w3.a();
        SecP192R1Field.subtract(iArr3, iArr, iArrA4);
        SecP192R1Field.subtract(iArr4, iArr2, iArrA);
        if (w3.b(iArrA4)) {
            return w3.b(iArrA) ? twice() : curve.getInfinity();
        }
        SecP192R1Field.square(iArrA4, iArrA2);
        int[] iArrA5 = w3.a();
        SecP192R1Field.multiply(iArrA2, iArrA4, iArrA5);
        SecP192R1Field.multiply(iArrA2, iArr3, iArrA2);
        SecP192R1Field.negate(iArrA5, iArrA5);
        w3.c(iArr4, iArrA5, iArrC);
        SecP192R1Field.reduce32(w3.b(iArrA2, iArrA2, iArrA5), iArrA5);
        SecP192R1FieldElement secP192R1FieldElement7 = new SecP192R1FieldElement(iArrA3);
        SecP192R1Field.square(iArrA, secP192R1FieldElement7.f25101a);
        int[] iArr5 = secP192R1FieldElement7.f25101a;
        SecP192R1Field.subtract(iArr5, iArrA5, iArr5);
        SecP192R1FieldElement secP192R1FieldElement8 = new SecP192R1FieldElement(iArrA5);
        SecP192R1Field.subtract(iArrA2, secP192R1FieldElement7.f25101a, secP192R1FieldElement8.f25101a);
        SecP192R1Field.multiplyAddToExt(secP192R1FieldElement8.f25101a, iArrA, iArrC);
        SecP192R1Field.reduce(iArrC, secP192R1FieldElement8.f25101a);
        SecP192R1FieldElement secP192R1FieldElement9 = new SecP192R1FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = secP192R1FieldElement9.f25101a;
            SecP192R1Field.multiply(iArr6, secP192R1FieldElement5.f25101a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP192R1FieldElement9.f25101a;
            SecP192R1Field.multiply(iArr7, secP192R1FieldElement6.f25101a, iArr7);
        }
        return new SecP192R1Point(curve, secP192R1FieldElement7, secP192R1FieldElement8, new ECFieldElement[]{secP192R1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP192R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP192R1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP192R1FieldElement secP192R1FieldElement = (SecP192R1FieldElement) this.f25033c;
        if (secP192R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP192R1FieldElement secP192R1FieldElement2 = (SecP192R1FieldElement) this.f25032b;
        SecP192R1FieldElement secP192R1FieldElement3 = (SecP192R1FieldElement) this.f25034d[0];
        int[] iArrA = w3.a();
        int[] iArrA2 = w3.a();
        int[] iArrA3 = w3.a();
        SecP192R1Field.square(secP192R1FieldElement.f25101a, iArrA3);
        int[] iArrA4 = w3.a();
        SecP192R1Field.square(iArrA3, iArrA4);
        boolean zIsOne = secP192R1FieldElement3.isOne();
        int[] iArr = secP192R1FieldElement3.f25101a;
        if (!zIsOne) {
            SecP192R1Field.square(iArr, iArrA2);
            iArr = iArrA2;
        }
        SecP192R1Field.subtract(secP192R1FieldElement2.f25101a, iArr, iArrA);
        SecP192R1Field.add(secP192R1FieldElement2.f25101a, iArr, iArrA2);
        SecP192R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP192R1Field.reduce32(w3.b(iArrA2, iArrA2, iArrA2), iArrA2);
        SecP192R1Field.multiply(iArrA3, secP192R1FieldElement2.f25101a, iArrA3);
        SecP192R1Field.reduce32(e4.c(6, iArrA3, 2, 0), iArrA3);
        SecP192R1Field.reduce32(e4.a(6, iArrA4, 3, 0, iArrA), iArrA);
        SecP192R1FieldElement secP192R1FieldElement4 = new SecP192R1FieldElement(iArrA4);
        SecP192R1Field.square(iArrA2, secP192R1FieldElement4.f25101a);
        int[] iArr2 = secP192R1FieldElement4.f25101a;
        SecP192R1Field.subtract(iArr2, iArrA3, iArr2);
        int[] iArr3 = secP192R1FieldElement4.f25101a;
        SecP192R1Field.subtract(iArr3, iArrA3, iArr3);
        SecP192R1FieldElement secP192R1FieldElement5 = new SecP192R1FieldElement(iArrA3);
        SecP192R1Field.subtract(iArrA3, secP192R1FieldElement4.f25101a, secP192R1FieldElement5.f25101a);
        int[] iArr4 = secP192R1FieldElement5.f25101a;
        SecP192R1Field.multiply(iArr4, iArrA2, iArr4);
        int[] iArr5 = secP192R1FieldElement5.f25101a;
        SecP192R1Field.subtract(iArr5, iArrA, iArr5);
        SecP192R1FieldElement secP192R1FieldElement6 = new SecP192R1FieldElement(iArrA2);
        SecP192R1Field.twice(secP192R1FieldElement.f25101a, secP192R1FieldElement6.f25101a);
        if (!zIsOne) {
            int[] iArr6 = secP192R1FieldElement6.f25101a;
            SecP192R1Field.multiply(iArr6, secP192R1FieldElement3.f25101a, iArr6);
        }
        return new SecP192R1Point(curve, secP192R1FieldElement4, secP192R1FieldElement5, new ECFieldElement[]{secP192R1FieldElement6}, this.f25035e);
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

    public SecP192R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP192R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
