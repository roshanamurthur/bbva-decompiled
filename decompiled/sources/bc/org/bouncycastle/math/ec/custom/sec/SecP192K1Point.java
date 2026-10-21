package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;

/* JADX INFO: loaded from: classes2.dex */
public class SecP192K1Point extends ECPoint.AbstractFp {
    public SecP192K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP192K1FieldElement secP192K1FieldElement = (SecP192K1FieldElement) this.f25032b;
        SecP192K1FieldElement secP192K1FieldElement2 = (SecP192K1FieldElement) this.f25033c;
        SecP192K1FieldElement secP192K1FieldElement3 = (SecP192K1FieldElement) eCPoint.getXCoord();
        SecP192K1FieldElement secP192K1FieldElement4 = (SecP192K1FieldElement) eCPoint.getYCoord();
        SecP192K1FieldElement secP192K1FieldElement5 = (SecP192K1FieldElement) this.f25034d[0];
        SecP192K1FieldElement secP192K1FieldElement6 = (SecP192K1FieldElement) eCPoint.getZCoord(0);
        int[] iArrC = w3.c();
        int[] iArrA = w3.a();
        int[] iArrA2 = w3.a();
        int[] iArrA3 = w3.a();
        boolean zIsOne = secP192K1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP192K1FieldElement3.f25095a;
            iArr2 = secP192K1FieldElement4.f25095a;
        } else {
            SecP192K1Field.square(secP192K1FieldElement5.f25095a, iArrA2);
            SecP192K1Field.multiply(iArrA2, secP192K1FieldElement3.f25095a, iArrA);
            SecP192K1Field.multiply(iArrA2, secP192K1FieldElement5.f25095a, iArrA2);
            SecP192K1Field.multiply(iArrA2, secP192K1FieldElement4.f25095a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = secP192K1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP192K1FieldElement.f25095a;
            iArr4 = secP192K1FieldElement2.f25095a;
        } else {
            SecP192K1Field.square(secP192K1FieldElement6.f25095a, iArrA3);
            SecP192K1Field.multiply(iArrA3, secP192K1FieldElement.f25095a, iArrC);
            SecP192K1Field.multiply(iArrA3, secP192K1FieldElement6.f25095a, iArrA3);
            SecP192K1Field.multiply(iArrA3, secP192K1FieldElement2.f25095a, iArrA3);
            iArr3 = iArrC;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = w3.a();
        SecP192K1Field.subtract(iArr3, iArr, iArrA4);
        SecP192K1Field.subtract(iArr4, iArr2, iArrA);
        if (w3.b(iArrA4)) {
            return w3.b(iArrA) ? twice() : curve.getInfinity();
        }
        SecP192K1Field.square(iArrA4, iArrA2);
        int[] iArrA5 = w3.a();
        SecP192K1Field.multiply(iArrA2, iArrA4, iArrA5);
        SecP192K1Field.multiply(iArrA2, iArr3, iArrA2);
        SecP192K1Field.negate(iArrA5, iArrA5);
        w3.c(iArr4, iArrA5, iArrC);
        SecP192K1Field.reduce32(w3.b(iArrA2, iArrA2, iArrA5), iArrA5);
        SecP192K1FieldElement secP192K1FieldElement7 = new SecP192K1FieldElement(iArrA3);
        SecP192K1Field.square(iArrA, secP192K1FieldElement7.f25095a);
        int[] iArr5 = secP192K1FieldElement7.f25095a;
        SecP192K1Field.subtract(iArr5, iArrA5, iArr5);
        SecP192K1FieldElement secP192K1FieldElement8 = new SecP192K1FieldElement(iArrA5);
        SecP192K1Field.subtract(iArrA2, secP192K1FieldElement7.f25095a, secP192K1FieldElement8.f25095a);
        SecP192K1Field.multiplyAddToExt(secP192K1FieldElement8.f25095a, iArrA, iArrC);
        SecP192K1Field.reduce(iArrC, secP192K1FieldElement8.f25095a);
        SecP192K1FieldElement secP192K1FieldElement9 = new SecP192K1FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = secP192K1FieldElement9.f25095a;
            SecP192K1Field.multiply(iArr6, secP192K1FieldElement5.f25095a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP192K1FieldElement9.f25095a;
            SecP192K1Field.multiply(iArr7, secP192K1FieldElement6.f25095a, iArr7);
        }
        return new SecP192K1Point(curve, secP192K1FieldElement7, secP192K1FieldElement8, new ECFieldElement[]{secP192K1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP192K1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP192K1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP192K1FieldElement secP192K1FieldElement = (SecP192K1FieldElement) this.f25033c;
        if (secP192K1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP192K1FieldElement secP192K1FieldElement2 = (SecP192K1FieldElement) this.f25032b;
        SecP192K1FieldElement secP192K1FieldElement3 = (SecP192K1FieldElement) this.f25034d[0];
        int[] iArrA = w3.a();
        SecP192K1Field.square(secP192K1FieldElement.f25095a, iArrA);
        int[] iArrA2 = w3.a();
        SecP192K1Field.square(iArrA, iArrA2);
        int[] iArrA3 = w3.a();
        SecP192K1Field.square(secP192K1FieldElement2.f25095a, iArrA3);
        SecP192K1Field.reduce32(w3.b(iArrA3, iArrA3, iArrA3), iArrA3);
        SecP192K1Field.multiply(iArrA, secP192K1FieldElement2.f25095a, iArrA);
        SecP192K1Field.reduce32(e4.c(6, iArrA, 2, 0), iArrA);
        int[] iArrA4 = w3.a();
        SecP192K1Field.reduce32(e4.a(6, iArrA2, 3, 0, iArrA4), iArrA4);
        SecP192K1FieldElement secP192K1FieldElement4 = new SecP192K1FieldElement(iArrA2);
        SecP192K1Field.square(iArrA3, secP192K1FieldElement4.f25095a);
        int[] iArr = secP192K1FieldElement4.f25095a;
        SecP192K1Field.subtract(iArr, iArrA, iArr);
        int[] iArr2 = secP192K1FieldElement4.f25095a;
        SecP192K1Field.subtract(iArr2, iArrA, iArr2);
        SecP192K1FieldElement secP192K1FieldElement5 = new SecP192K1FieldElement(iArrA);
        SecP192K1Field.subtract(iArrA, secP192K1FieldElement4.f25095a, secP192K1FieldElement5.f25095a);
        int[] iArr3 = secP192K1FieldElement5.f25095a;
        SecP192K1Field.multiply(iArr3, iArrA3, iArr3);
        int[] iArr4 = secP192K1FieldElement5.f25095a;
        SecP192K1Field.subtract(iArr4, iArrA4, iArr4);
        SecP192K1FieldElement secP192K1FieldElement6 = new SecP192K1FieldElement(iArrA3);
        SecP192K1Field.twice(secP192K1FieldElement.f25095a, secP192K1FieldElement6.f25095a);
        if (!secP192K1FieldElement3.isOne()) {
            int[] iArr5 = secP192K1FieldElement6.f25095a;
            SecP192K1Field.multiply(iArr5, secP192K1FieldElement3.f25095a, iArr5);
        }
        return new SecP192K1Point(curve, secP192K1FieldElement4, secP192K1FieldElement5, new ECFieldElement[]{secP192K1FieldElement6}, this.f25035e);
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

    public SecP192K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP192K1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
