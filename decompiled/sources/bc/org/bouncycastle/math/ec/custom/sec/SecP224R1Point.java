package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.x3;

/* JADX INFO: loaded from: classes2.dex */
public class SecP224R1Point extends ECPoint.AbstractFp {
    public SecP224R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP224R1FieldElement secP224R1FieldElement = (SecP224R1FieldElement) this.f25032b;
        SecP224R1FieldElement secP224R1FieldElement2 = (SecP224R1FieldElement) this.f25033c;
        SecP224R1FieldElement secP224R1FieldElement3 = (SecP224R1FieldElement) eCPoint.getXCoord();
        SecP224R1FieldElement secP224R1FieldElement4 = (SecP224R1FieldElement) eCPoint.getYCoord();
        SecP224R1FieldElement secP224R1FieldElement5 = (SecP224R1FieldElement) this.f25034d[0];
        SecP224R1FieldElement secP224R1FieldElement6 = (SecP224R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrB = x3.b();
        int[] iArrA = x3.a();
        int[] iArrA2 = x3.a();
        int[] iArrA3 = x3.a();
        boolean zIsOne = secP224R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP224R1FieldElement3.f25114a;
            iArr2 = secP224R1FieldElement4.f25114a;
        } else {
            SecP224R1Field.square(secP224R1FieldElement5.f25114a, iArrA2);
            SecP224R1Field.multiply(iArrA2, secP224R1FieldElement3.f25114a, iArrA);
            SecP224R1Field.multiply(iArrA2, secP224R1FieldElement5.f25114a, iArrA2);
            SecP224R1Field.multiply(iArrA2, secP224R1FieldElement4.f25114a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = secP224R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP224R1FieldElement.f25114a;
            iArr4 = secP224R1FieldElement2.f25114a;
        } else {
            SecP224R1Field.square(secP224R1FieldElement6.f25114a, iArrA3);
            SecP224R1Field.multiply(iArrA3, secP224R1FieldElement.f25114a, iArrB);
            SecP224R1Field.multiply(iArrA3, secP224R1FieldElement6.f25114a, iArrA3);
            SecP224R1Field.multiply(iArrA3, secP224R1FieldElement2.f25114a, iArrA3);
            iArr3 = iArrB;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = x3.a();
        SecP224R1Field.subtract(iArr3, iArr, iArrA4);
        SecP224R1Field.subtract(iArr4, iArr2, iArrA);
        if (x3.b(iArrA4)) {
            return x3.b(iArrA) ? twice() : curve.getInfinity();
        }
        SecP224R1Field.square(iArrA4, iArrA2);
        int[] iArrA5 = x3.a();
        SecP224R1Field.multiply(iArrA2, iArrA4, iArrA5);
        SecP224R1Field.multiply(iArrA2, iArr3, iArrA2);
        SecP224R1Field.negate(iArrA5, iArrA5);
        x3.c(iArr4, iArrA5, iArrB);
        SecP224R1Field.reduce32(x3.b(iArrA2, iArrA2, iArrA5), iArrA5);
        SecP224R1FieldElement secP224R1FieldElement7 = new SecP224R1FieldElement(iArrA3);
        SecP224R1Field.square(iArrA, secP224R1FieldElement7.f25114a);
        int[] iArr5 = secP224R1FieldElement7.f25114a;
        SecP224R1Field.subtract(iArr5, iArrA5, iArr5);
        SecP224R1FieldElement secP224R1FieldElement8 = new SecP224R1FieldElement(iArrA5);
        SecP224R1Field.subtract(iArrA2, secP224R1FieldElement7.f25114a, secP224R1FieldElement8.f25114a);
        SecP224R1Field.multiplyAddToExt(secP224R1FieldElement8.f25114a, iArrA, iArrB);
        SecP224R1Field.reduce(iArrB, secP224R1FieldElement8.f25114a);
        SecP224R1FieldElement secP224R1FieldElement9 = new SecP224R1FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = secP224R1FieldElement9.f25114a;
            SecP224R1Field.multiply(iArr6, secP224R1FieldElement5.f25114a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP224R1FieldElement9.f25114a;
            SecP224R1Field.multiply(iArr7, secP224R1FieldElement6.f25114a, iArr7);
        }
        return new SecP224R1Point(curve, secP224R1FieldElement7, secP224R1FieldElement8, new ECFieldElement[]{secP224R1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP224R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP224R1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP224R1FieldElement secP224R1FieldElement = (SecP224R1FieldElement) this.f25033c;
        if (secP224R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP224R1FieldElement secP224R1FieldElement2 = (SecP224R1FieldElement) this.f25032b;
        SecP224R1FieldElement secP224R1FieldElement3 = (SecP224R1FieldElement) this.f25034d[0];
        int[] iArrA = x3.a();
        int[] iArrA2 = x3.a();
        int[] iArrA3 = x3.a();
        SecP224R1Field.square(secP224R1FieldElement.f25114a, iArrA3);
        int[] iArrA4 = x3.a();
        SecP224R1Field.square(iArrA3, iArrA4);
        boolean zIsOne = secP224R1FieldElement3.isOne();
        int[] iArr = secP224R1FieldElement3.f25114a;
        if (!zIsOne) {
            SecP224R1Field.square(iArr, iArrA2);
            iArr = iArrA2;
        }
        SecP224R1Field.subtract(secP224R1FieldElement2.f25114a, iArr, iArrA);
        SecP224R1Field.add(secP224R1FieldElement2.f25114a, iArr, iArrA2);
        SecP224R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP224R1Field.reduce32(x3.b(iArrA2, iArrA2, iArrA2), iArrA2);
        SecP224R1Field.multiply(iArrA3, secP224R1FieldElement2.f25114a, iArrA3);
        SecP224R1Field.reduce32(e4.c(7, iArrA3, 2, 0), iArrA3);
        SecP224R1Field.reduce32(e4.a(7, iArrA4, 3, 0, iArrA), iArrA);
        SecP224R1FieldElement secP224R1FieldElement4 = new SecP224R1FieldElement(iArrA4);
        SecP224R1Field.square(iArrA2, secP224R1FieldElement4.f25114a);
        int[] iArr2 = secP224R1FieldElement4.f25114a;
        SecP224R1Field.subtract(iArr2, iArrA3, iArr2);
        int[] iArr3 = secP224R1FieldElement4.f25114a;
        SecP224R1Field.subtract(iArr3, iArrA3, iArr3);
        SecP224R1FieldElement secP224R1FieldElement5 = new SecP224R1FieldElement(iArrA3);
        SecP224R1Field.subtract(iArrA3, secP224R1FieldElement4.f25114a, secP224R1FieldElement5.f25114a);
        int[] iArr4 = secP224R1FieldElement5.f25114a;
        SecP224R1Field.multiply(iArr4, iArrA2, iArr4);
        int[] iArr5 = secP224R1FieldElement5.f25114a;
        SecP224R1Field.subtract(iArr5, iArrA, iArr5);
        SecP224R1FieldElement secP224R1FieldElement6 = new SecP224R1FieldElement(iArrA2);
        SecP224R1Field.twice(secP224R1FieldElement.f25114a, secP224R1FieldElement6.f25114a);
        if (!zIsOne) {
            int[] iArr6 = secP224R1FieldElement6.f25114a;
            SecP224R1Field.multiply(iArr6, secP224R1FieldElement3.f25114a, iArr6);
        }
        return new SecP224R1Point(curve, secP224R1FieldElement4, secP224R1FieldElement5, new ECFieldElement[]{secP224R1FieldElement6}, this.f25035e);
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

    public SecP224R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP224R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
