package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.a4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;

/* JADX INFO: loaded from: classes2.dex */
public class SecP384R1Point extends ECPoint.AbstractFp {
    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f25032b;
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f25033c;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) eCPoint.getXCoord();
        SecP384R1FieldElement secP384R1FieldElement4 = (SecP384R1FieldElement) eCPoint.getYCoord();
        SecP384R1FieldElement secP384R1FieldElement5 = (SecP384R1FieldElement) this.f25034d[0];
        SecP384R1FieldElement secP384R1FieldElement6 = (SecP384R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrA = e4.a(24);
        int[] iArrA2 = e4.a(24);
        int[] iArrA3 = e4.a(12);
        int[] iArrA4 = e4.a(12);
        boolean zIsOne = secP384R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP384R1FieldElement3.f25131a;
            iArr2 = secP384R1FieldElement4.f25131a;
        } else {
            SecP384R1Field.square(secP384R1FieldElement5.f25131a, iArrA3);
            SecP384R1Field.multiply(iArrA3, secP384R1FieldElement3.f25131a, iArrA2);
            SecP384R1Field.multiply(iArrA3, secP384R1FieldElement5.f25131a, iArrA3);
            SecP384R1Field.multiply(iArrA3, secP384R1FieldElement4.f25131a, iArrA3);
            iArr = iArrA2;
            iArr2 = iArrA3;
        }
        boolean zIsOne2 = secP384R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP384R1FieldElement.f25131a;
            iArr4 = secP384R1FieldElement2.f25131a;
        } else {
            SecP384R1Field.square(secP384R1FieldElement6.f25131a, iArrA4);
            SecP384R1Field.multiply(iArrA4, secP384R1FieldElement.f25131a, iArrA);
            SecP384R1Field.multiply(iArrA4, secP384R1FieldElement6.f25131a, iArrA4);
            SecP384R1Field.multiply(iArrA4, secP384R1FieldElement2.f25131a, iArrA4);
            iArr3 = iArrA;
            iArr4 = iArrA4;
        }
        int[] iArrA5 = e4.a(12);
        SecP384R1Field.subtract(iArr3, iArr, iArrA5);
        int[] iArrA6 = e4.a(12);
        SecP384R1Field.subtract(iArr4, iArr2, iArrA6);
        if (e4.e(12, iArrA5)) {
            return e4.e(12, iArrA6) ? twice() : curve.getInfinity();
        }
        SecP384R1Field.square(iArrA5, iArrA3);
        int[] iArrA7 = e4.a(12);
        SecP384R1Field.multiply(iArrA3, iArrA5, iArrA7);
        SecP384R1Field.multiply(iArrA3, iArr3, iArrA3);
        SecP384R1Field.negate(iArrA7, iArrA7);
        a4.a(iArr4, iArrA7, iArrA);
        SecP384R1Field.reduce32(e4.b(12, iArrA3, iArrA3, iArrA7), iArrA7);
        SecP384R1FieldElement secP384R1FieldElement7 = new SecP384R1FieldElement(iArrA4);
        SecP384R1Field.square(iArrA6, secP384R1FieldElement7.f25131a);
        int[] iArr5 = secP384R1FieldElement7.f25131a;
        SecP384R1Field.subtract(iArr5, iArrA7, iArr5);
        SecP384R1FieldElement secP384R1FieldElement8 = new SecP384R1FieldElement(iArrA7);
        SecP384R1Field.subtract(iArrA3, secP384R1FieldElement7.f25131a, secP384R1FieldElement8.f25131a);
        a4.a(secP384R1FieldElement8.f25131a, iArrA6, iArrA2);
        SecP384R1Field.addExt(iArrA, iArrA2, iArrA);
        SecP384R1Field.reduce(iArrA, secP384R1FieldElement8.f25131a);
        SecP384R1FieldElement secP384R1FieldElement9 = new SecP384R1FieldElement(iArrA5);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement9.f25131a;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement5.f25131a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP384R1FieldElement9.f25131a;
            SecP384R1Field.multiply(iArr7, secP384R1FieldElement6.f25131a, iArr7);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement7, secP384R1FieldElement8, new ECFieldElement[]{secP384R1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP384R1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP384R1FieldElement secP384R1FieldElement = (SecP384R1FieldElement) this.f25033c;
        if (secP384R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement) this.f25032b;
        SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement) this.f25034d[0];
        int[] iArrA = e4.a(12);
        int[] iArrA2 = e4.a(12);
        int[] iArrA3 = e4.a(12);
        SecP384R1Field.square(secP384R1FieldElement.f25131a, iArrA3);
        int[] iArrA4 = e4.a(12);
        SecP384R1Field.square(iArrA3, iArrA4);
        boolean zIsOne = secP384R1FieldElement3.isOne();
        int[] iArr = secP384R1FieldElement3.f25131a;
        if (!zIsOne) {
            SecP384R1Field.square(iArr, iArrA2);
            iArr = iArrA2;
        }
        SecP384R1Field.subtract(secP384R1FieldElement2.f25131a, iArr, iArrA);
        SecP384R1Field.add(secP384R1FieldElement2.f25131a, iArr, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP384R1Field.reduce32(e4.b(12, iArrA2, iArrA2, iArrA2), iArrA2);
        SecP384R1Field.multiply(iArrA3, secP384R1FieldElement2.f25131a, iArrA3);
        SecP384R1Field.reduce32(e4.c(12, iArrA3, 2, 0), iArrA3);
        SecP384R1Field.reduce32(e4.a(12, iArrA4, 3, 0, iArrA), iArrA);
        SecP384R1FieldElement secP384R1FieldElement4 = new SecP384R1FieldElement(iArrA4);
        SecP384R1Field.square(iArrA2, secP384R1FieldElement4.f25131a);
        int[] iArr2 = secP384R1FieldElement4.f25131a;
        SecP384R1Field.subtract(iArr2, iArrA3, iArr2);
        int[] iArr3 = secP384R1FieldElement4.f25131a;
        SecP384R1Field.subtract(iArr3, iArrA3, iArr3);
        SecP384R1FieldElement secP384R1FieldElement5 = new SecP384R1FieldElement(iArrA3);
        SecP384R1Field.subtract(iArrA3, secP384R1FieldElement4.f25131a, secP384R1FieldElement5.f25131a);
        int[] iArr4 = secP384R1FieldElement5.f25131a;
        SecP384R1Field.multiply(iArr4, iArrA2, iArr4);
        int[] iArr5 = secP384R1FieldElement5.f25131a;
        SecP384R1Field.subtract(iArr5, iArrA, iArr5);
        SecP384R1FieldElement secP384R1FieldElement6 = new SecP384R1FieldElement(iArrA2);
        SecP384R1Field.twice(secP384R1FieldElement.f25131a, secP384R1FieldElement6.f25131a);
        if (!zIsOne) {
            int[] iArr6 = secP384R1FieldElement6.f25131a;
            SecP384R1Field.multiply(iArr6, secP384R1FieldElement3.f25131a, iArr6);
        }
        return new SecP384R1Point(curve, secP384R1FieldElement4, secP384R1FieldElement5, new ECFieldElement[]{secP384R1FieldElement6}, this.f25035e);
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

    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP384R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
