package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256R1Point extends ECPoint.AbstractFp {
    public SecP256R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP256R1FieldElement secP256R1FieldElement = (SecP256R1FieldElement) this.f25032b;
        SecP256R1FieldElement secP256R1FieldElement2 = (SecP256R1FieldElement) this.f25033c;
        SecP256R1FieldElement secP256R1FieldElement3 = (SecP256R1FieldElement) eCPoint.getXCoord();
        SecP256R1FieldElement secP256R1FieldElement4 = (SecP256R1FieldElement) eCPoint.getYCoord();
        SecP256R1FieldElement secP256R1FieldElement5 = (SecP256R1FieldElement) this.f25034d[0];
        SecP256R1FieldElement secP256R1FieldElement6 = (SecP256R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrC = y3.c();
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        int[] iArrA3 = y3.a();
        boolean zIsOne = secP256R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP256R1FieldElement3.f25125a;
            iArr2 = secP256R1FieldElement4.f25125a;
        } else {
            SecP256R1Field.square(secP256R1FieldElement5.f25125a, iArrA2);
            SecP256R1Field.multiply(iArrA2, secP256R1FieldElement3.f25125a, iArrA);
            SecP256R1Field.multiply(iArrA2, secP256R1FieldElement5.f25125a, iArrA2);
            SecP256R1Field.multiply(iArrA2, secP256R1FieldElement4.f25125a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = secP256R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP256R1FieldElement.f25125a;
            iArr4 = secP256R1FieldElement2.f25125a;
        } else {
            SecP256R1Field.square(secP256R1FieldElement6.f25125a, iArrA3);
            SecP256R1Field.multiply(iArrA3, secP256R1FieldElement.f25125a, iArrC);
            SecP256R1Field.multiply(iArrA3, secP256R1FieldElement6.f25125a, iArrA3);
            SecP256R1Field.multiply(iArrA3, secP256R1FieldElement2.f25125a, iArrA3);
            iArr3 = iArrC;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = y3.a();
        SecP256R1Field.subtract(iArr3, iArr, iArrA4);
        SecP256R1Field.subtract(iArr4, iArr2, iArrA);
        if (y3.b(iArrA4)) {
            return y3.b(iArrA) ? twice() : curve.getInfinity();
        }
        SecP256R1Field.square(iArrA4, iArrA2);
        int[] iArrA5 = y3.a();
        SecP256R1Field.multiply(iArrA2, iArrA4, iArrA5);
        SecP256R1Field.multiply(iArrA2, iArr3, iArrA2);
        SecP256R1Field.negate(iArrA5, iArrA5);
        y3.c(iArr4, iArrA5, iArrC);
        SecP256R1Field.reduce32(y3.b(iArrA2, iArrA2, iArrA5), iArrA5);
        SecP256R1FieldElement secP256R1FieldElement7 = new SecP256R1FieldElement(iArrA3);
        SecP256R1Field.square(iArrA, secP256R1FieldElement7.f25125a);
        int[] iArr5 = secP256R1FieldElement7.f25125a;
        SecP256R1Field.subtract(iArr5, iArrA5, iArr5);
        SecP256R1FieldElement secP256R1FieldElement8 = new SecP256R1FieldElement(iArrA5);
        SecP256R1Field.subtract(iArrA2, secP256R1FieldElement7.f25125a, secP256R1FieldElement8.f25125a);
        SecP256R1Field.multiplyAddToExt(secP256R1FieldElement8.f25125a, iArrA, iArrC);
        SecP256R1Field.reduce(iArrC, secP256R1FieldElement8.f25125a);
        SecP256R1FieldElement secP256R1FieldElement9 = new SecP256R1FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = secP256R1FieldElement9.f25125a;
            SecP256R1Field.multiply(iArr6, secP256R1FieldElement5.f25125a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP256R1FieldElement9.f25125a;
            SecP256R1Field.multiply(iArr7, secP256R1FieldElement6.f25125a, iArr7);
        }
        return new SecP256R1Point(curve, secP256R1FieldElement7, secP256R1FieldElement8, new ECFieldElement[]{secP256R1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP256R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP256R1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP256R1FieldElement secP256R1FieldElement = (SecP256R1FieldElement) this.f25033c;
        if (secP256R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP256R1FieldElement secP256R1FieldElement2 = (SecP256R1FieldElement) this.f25032b;
        SecP256R1FieldElement secP256R1FieldElement3 = (SecP256R1FieldElement) this.f25034d[0];
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        int[] iArrA3 = y3.a();
        SecP256R1Field.square(secP256R1FieldElement.f25125a, iArrA3);
        int[] iArrA4 = y3.a();
        SecP256R1Field.square(iArrA3, iArrA4);
        boolean zIsOne = secP256R1FieldElement3.isOne();
        int[] iArr = secP256R1FieldElement3.f25125a;
        if (!zIsOne) {
            SecP256R1Field.square(iArr, iArrA2);
            iArr = iArrA2;
        }
        SecP256R1Field.subtract(secP256R1FieldElement2.f25125a, iArr, iArrA);
        SecP256R1Field.add(secP256R1FieldElement2.f25125a, iArr, iArrA2);
        SecP256R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP256R1Field.reduce32(y3.b(iArrA2, iArrA2, iArrA2), iArrA2);
        SecP256R1Field.multiply(iArrA3, secP256R1FieldElement2.f25125a, iArrA3);
        SecP256R1Field.reduce32(e4.c(8, iArrA3, 2, 0), iArrA3);
        SecP256R1Field.reduce32(e4.a(8, iArrA4, 3, 0, iArrA), iArrA);
        SecP256R1FieldElement secP256R1FieldElement4 = new SecP256R1FieldElement(iArrA4);
        SecP256R1Field.square(iArrA2, secP256R1FieldElement4.f25125a);
        int[] iArr2 = secP256R1FieldElement4.f25125a;
        SecP256R1Field.subtract(iArr2, iArrA3, iArr2);
        int[] iArr3 = secP256R1FieldElement4.f25125a;
        SecP256R1Field.subtract(iArr3, iArrA3, iArr3);
        SecP256R1FieldElement secP256R1FieldElement5 = new SecP256R1FieldElement(iArrA3);
        SecP256R1Field.subtract(iArrA3, secP256R1FieldElement4.f25125a, secP256R1FieldElement5.f25125a);
        int[] iArr4 = secP256R1FieldElement5.f25125a;
        SecP256R1Field.multiply(iArr4, iArrA2, iArr4);
        int[] iArr5 = secP256R1FieldElement5.f25125a;
        SecP256R1Field.subtract(iArr5, iArrA, iArr5);
        SecP256R1FieldElement secP256R1FieldElement6 = new SecP256R1FieldElement(iArrA2);
        SecP256R1Field.twice(secP256R1FieldElement.f25125a, secP256R1FieldElement6.f25125a);
        if (!zIsOne) {
            int[] iArr6 = secP256R1FieldElement6.f25125a;
            SecP256R1Field.multiply(iArr6, secP256R1FieldElement3.f25125a, iArr6);
        }
        return new SecP256R1Point(curve, secP256R1FieldElement4, secP256R1FieldElement5, new ECFieldElement[]{secP256R1FieldElement6}, this.f25035e);
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

    public SecP256R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP256R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
