package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;

/* JADX INFO: loaded from: classes2.dex */
public class SecP521R1Point extends ECPoint.AbstractFp {
    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f25032b;
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f25033c;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) eCPoint.getXCoord();
        SecP521R1FieldElement secP521R1FieldElement4 = (SecP521R1FieldElement) eCPoint.getYCoord();
        SecP521R1FieldElement secP521R1FieldElement5 = (SecP521R1FieldElement) this.f25034d[0];
        SecP521R1FieldElement secP521R1FieldElement6 = (SecP521R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrA = e4.a(17);
        int[] iArrA2 = e4.a(17);
        int[] iArrA3 = e4.a(17);
        int[] iArrA4 = e4.a(17);
        boolean zIsOne = secP521R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP521R1FieldElement3.f25135a;
            iArr2 = secP521R1FieldElement4.f25135a;
        } else {
            SecP521R1Field.square(secP521R1FieldElement5.f25135a, iArrA3);
            SecP521R1Field.multiply(iArrA3, secP521R1FieldElement3.f25135a, iArrA2);
            SecP521R1Field.multiply(iArrA3, secP521R1FieldElement5.f25135a, iArrA3);
            SecP521R1Field.multiply(iArrA3, secP521R1FieldElement4.f25135a, iArrA3);
            iArr = iArrA2;
            iArr2 = iArrA3;
        }
        boolean zIsOne2 = secP521R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP521R1FieldElement.f25135a;
            iArr4 = secP521R1FieldElement2.f25135a;
        } else {
            SecP521R1Field.square(secP521R1FieldElement6.f25135a, iArrA4);
            SecP521R1Field.multiply(iArrA4, secP521R1FieldElement.f25135a, iArrA);
            SecP521R1Field.multiply(iArrA4, secP521R1FieldElement6.f25135a, iArrA4);
            SecP521R1Field.multiply(iArrA4, secP521R1FieldElement2.f25135a, iArrA4);
            iArr3 = iArrA;
            iArr4 = iArrA4;
        }
        int[] iArrA5 = e4.a(17);
        SecP521R1Field.subtract(iArr3, iArr, iArrA5);
        SecP521R1Field.subtract(iArr4, iArr2, iArrA2);
        if (e4.e(17, iArrA5)) {
            return e4.e(17, iArrA2) ? twice() : curve.getInfinity();
        }
        SecP521R1Field.square(iArrA5, iArrA3);
        int[] iArrA6 = e4.a(17);
        SecP521R1Field.multiply(iArrA3, iArrA5, iArrA6);
        SecP521R1Field.multiply(iArrA3, iArr3, iArrA3);
        SecP521R1Field.multiply(iArr4, iArrA6, iArrA);
        SecP521R1FieldElement secP521R1FieldElement7 = new SecP521R1FieldElement(iArrA4);
        SecP521R1Field.square(iArrA2, secP521R1FieldElement7.f25135a);
        int[] iArr5 = secP521R1FieldElement7.f25135a;
        SecP521R1Field.add(iArr5, iArrA6, iArr5);
        int[] iArr6 = secP521R1FieldElement7.f25135a;
        SecP521R1Field.subtract(iArr6, iArrA3, iArr6);
        int[] iArr7 = secP521R1FieldElement7.f25135a;
        SecP521R1Field.subtract(iArr7, iArrA3, iArr7);
        SecP521R1FieldElement secP521R1FieldElement8 = new SecP521R1FieldElement(iArrA6);
        SecP521R1Field.subtract(iArrA3, secP521R1FieldElement7.f25135a, secP521R1FieldElement8.f25135a);
        SecP521R1Field.multiply(secP521R1FieldElement8.f25135a, iArrA2, iArrA2);
        SecP521R1Field.subtract(iArrA2, iArrA, secP521R1FieldElement8.f25135a);
        SecP521R1FieldElement secP521R1FieldElement9 = new SecP521R1FieldElement(iArrA5);
        if (!zIsOne) {
            int[] iArr8 = secP521R1FieldElement9.f25135a;
            SecP521R1Field.multiply(iArr8, secP521R1FieldElement5.f25135a, iArr8);
        }
        if (!zIsOne2) {
            int[] iArr9 = secP521R1FieldElement9.f25135a;
            SecP521R1Field.multiply(iArr9, secP521R1FieldElement6.f25135a, iArr9);
        }
        return new SecP521R1Point(curve, secP521R1FieldElement7, secP521R1FieldElement8, new ECFieldElement[]{secP521R1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP521R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP521R1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP521R1FieldElement secP521R1FieldElement = (SecP521R1FieldElement) this.f25033c;
        if (secP521R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement) this.f25032b;
        SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement) this.f25034d[0];
        int[] iArrA = e4.a(17);
        int[] iArrA2 = e4.a(17);
        int[] iArrA3 = e4.a(17);
        SecP521R1Field.square(secP521R1FieldElement.f25135a, iArrA3);
        int[] iArrA4 = e4.a(17);
        SecP521R1Field.square(iArrA3, iArrA4);
        boolean zIsOne = secP521R1FieldElement3.isOne();
        int[] iArr = secP521R1FieldElement3.f25135a;
        if (!zIsOne) {
            SecP521R1Field.square(iArr, iArrA2);
            iArr = iArrA2;
        }
        SecP521R1Field.subtract(secP521R1FieldElement2.f25135a, iArr, iArrA);
        SecP521R1Field.add(secP521R1FieldElement2.f25135a, iArr, iArrA2);
        SecP521R1Field.multiply(iArrA2, iArrA, iArrA2);
        e4.b(17, iArrA2, iArrA2, iArrA2);
        SecP521R1Field.reduce23(iArrA2);
        SecP521R1Field.multiply(iArrA3, secP521R1FieldElement2.f25135a, iArrA3);
        e4.c(17, iArrA3, 2, 0);
        SecP521R1Field.reduce23(iArrA3);
        e4.a(17, iArrA4, 3, 0, iArrA);
        SecP521R1Field.reduce23(iArrA);
        SecP521R1FieldElement secP521R1FieldElement4 = new SecP521R1FieldElement(iArrA4);
        SecP521R1Field.square(iArrA2, secP521R1FieldElement4.f25135a);
        int[] iArr2 = secP521R1FieldElement4.f25135a;
        SecP521R1Field.subtract(iArr2, iArrA3, iArr2);
        int[] iArr3 = secP521R1FieldElement4.f25135a;
        SecP521R1Field.subtract(iArr3, iArrA3, iArr3);
        SecP521R1FieldElement secP521R1FieldElement5 = new SecP521R1FieldElement(iArrA3);
        SecP521R1Field.subtract(iArrA3, secP521R1FieldElement4.f25135a, secP521R1FieldElement5.f25135a);
        int[] iArr4 = secP521R1FieldElement5.f25135a;
        SecP521R1Field.multiply(iArr4, iArrA2, iArr4);
        int[] iArr5 = secP521R1FieldElement5.f25135a;
        SecP521R1Field.subtract(iArr5, iArrA, iArr5);
        SecP521R1FieldElement secP521R1FieldElement6 = new SecP521R1FieldElement(iArrA2);
        SecP521R1Field.twice(secP521R1FieldElement.f25135a, secP521R1FieldElement6.f25135a);
        if (!zIsOne) {
            int[] iArr6 = secP521R1FieldElement6.f25135a;
            SecP521R1Field.multiply(iArr6, secP521R1FieldElement3.f25135a, iArr6);
        }
        return new SecP521R1Point(curve, secP521R1FieldElement4, secP521R1FieldElement5, new ECFieldElement[]{secP521R1FieldElement6}, this.f25035e);
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

    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP521R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
