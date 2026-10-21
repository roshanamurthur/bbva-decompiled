package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v3;

/* JADX INFO: loaded from: classes2.dex */
public class SecP160R1Point extends ECPoint.AbstractFp {
    public SecP160R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
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
        SecP160R1FieldElement secP160R1FieldElement = (SecP160R1FieldElement) this.f25032b;
        SecP160R1FieldElement secP160R1FieldElement2 = (SecP160R1FieldElement) this.f25033c;
        SecP160R1FieldElement secP160R1FieldElement3 = (SecP160R1FieldElement) eCPoint.getXCoord();
        SecP160R1FieldElement secP160R1FieldElement4 = (SecP160R1FieldElement) eCPoint.getYCoord();
        SecP160R1FieldElement secP160R1FieldElement5 = (SecP160R1FieldElement) this.f25034d[0];
        SecP160R1FieldElement secP160R1FieldElement6 = (SecP160R1FieldElement) eCPoint.getZCoord(0);
        int[] iArrB = v3.b();
        int[] iArrA = v3.a();
        int[] iArrA2 = v3.a();
        int[] iArrA3 = v3.a();
        boolean zIsOne = secP160R1FieldElement5.isOne();
        if (zIsOne) {
            iArr = secP160R1FieldElement3.f25083a;
            iArr2 = secP160R1FieldElement4.f25083a;
        } else {
            SecP160R1Field.square(secP160R1FieldElement5.f25083a, iArrA2);
            SecP160R1Field.multiply(iArrA2, secP160R1FieldElement3.f25083a, iArrA);
            SecP160R1Field.multiply(iArrA2, secP160R1FieldElement5.f25083a, iArrA2);
            SecP160R1Field.multiply(iArrA2, secP160R1FieldElement4.f25083a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = secP160R1FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = secP160R1FieldElement.f25083a;
            iArr4 = secP160R1FieldElement2.f25083a;
        } else {
            SecP160R1Field.square(secP160R1FieldElement6.f25083a, iArrA3);
            SecP160R1Field.multiply(iArrA3, secP160R1FieldElement.f25083a, iArrB);
            SecP160R1Field.multiply(iArrA3, secP160R1FieldElement6.f25083a, iArrA3);
            SecP160R1Field.multiply(iArrA3, secP160R1FieldElement2.f25083a, iArrA3);
            iArr3 = iArrB;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = v3.a();
        SecP160R1Field.subtract(iArr3, iArr, iArrA4);
        SecP160R1Field.subtract(iArr4, iArr2, iArrA);
        if (v3.b(iArrA4)) {
            return v3.b(iArrA) ? twice() : curve.getInfinity();
        }
        SecP160R1Field.square(iArrA4, iArrA2);
        int[] iArrA5 = v3.a();
        SecP160R1Field.multiply(iArrA2, iArrA4, iArrA5);
        SecP160R1Field.multiply(iArrA2, iArr3, iArrA2);
        SecP160R1Field.negate(iArrA5, iArrA5);
        v3.c(iArr4, iArrA5, iArrB);
        SecP160R1Field.reduce32(v3.b(iArrA2, iArrA2, iArrA5), iArrA5);
        SecP160R1FieldElement secP160R1FieldElement7 = new SecP160R1FieldElement(iArrA3);
        SecP160R1Field.square(iArrA, secP160R1FieldElement7.f25083a);
        int[] iArr5 = secP160R1FieldElement7.f25083a;
        SecP160R1Field.subtract(iArr5, iArrA5, iArr5);
        SecP160R1FieldElement secP160R1FieldElement8 = new SecP160R1FieldElement(iArrA5);
        SecP160R1Field.subtract(iArrA2, secP160R1FieldElement7.f25083a, secP160R1FieldElement8.f25083a);
        SecP160R1Field.multiplyAddToExt(secP160R1FieldElement8.f25083a, iArrA, iArrB);
        SecP160R1Field.reduce(iArrB, secP160R1FieldElement8.f25083a);
        SecP160R1FieldElement secP160R1FieldElement9 = new SecP160R1FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = secP160R1FieldElement9.f25083a;
            SecP160R1Field.multiply(iArr6, secP160R1FieldElement5.f25083a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = secP160R1FieldElement9.f25083a;
            SecP160R1Field.multiply(iArr7, secP160R1FieldElement6.f25083a, iArr7);
        }
        return new SecP160R1Point(curve, secP160R1FieldElement7, secP160R1FieldElement8, new ECFieldElement[]{secP160R1FieldElement9}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecP160R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new SecP160R1Point(this.f25031a, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
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
        SecP160R1FieldElement secP160R1FieldElement = (SecP160R1FieldElement) this.f25033c;
        if (secP160R1FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecP160R1FieldElement secP160R1FieldElement2 = (SecP160R1FieldElement) this.f25032b;
        SecP160R1FieldElement secP160R1FieldElement3 = (SecP160R1FieldElement) this.f25034d[0];
        int[] iArrA = v3.a();
        int[] iArrA2 = v3.a();
        int[] iArrA3 = v3.a();
        SecP160R1Field.square(secP160R1FieldElement.f25083a, iArrA3);
        int[] iArrA4 = v3.a();
        SecP160R1Field.square(iArrA3, iArrA4);
        boolean zIsOne = secP160R1FieldElement3.isOne();
        int[] iArr = secP160R1FieldElement3.f25083a;
        if (!zIsOne) {
            SecP160R1Field.square(iArr, iArrA2);
            iArr = iArrA2;
        }
        SecP160R1Field.subtract(secP160R1FieldElement2.f25083a, iArr, iArrA);
        SecP160R1Field.add(secP160R1FieldElement2.f25083a, iArr, iArrA2);
        SecP160R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP160R1Field.reduce32(v3.b(iArrA2, iArrA2, iArrA2), iArrA2);
        SecP160R1Field.multiply(iArrA3, secP160R1FieldElement2.f25083a, iArrA3);
        SecP160R1Field.reduce32(e4.c(5, iArrA3, 2, 0), iArrA3);
        SecP160R1Field.reduce32(e4.a(5, iArrA4, 3, 0, iArrA), iArrA);
        SecP160R1FieldElement secP160R1FieldElement4 = new SecP160R1FieldElement(iArrA4);
        SecP160R1Field.square(iArrA2, secP160R1FieldElement4.f25083a);
        int[] iArr2 = secP160R1FieldElement4.f25083a;
        SecP160R1Field.subtract(iArr2, iArrA3, iArr2);
        int[] iArr3 = secP160R1FieldElement4.f25083a;
        SecP160R1Field.subtract(iArr3, iArrA3, iArr3);
        SecP160R1FieldElement secP160R1FieldElement5 = new SecP160R1FieldElement(iArrA3);
        SecP160R1Field.subtract(iArrA3, secP160R1FieldElement4.f25083a, secP160R1FieldElement5.f25083a);
        int[] iArr4 = secP160R1FieldElement5.f25083a;
        SecP160R1Field.multiply(iArr4, iArrA2, iArr4);
        int[] iArr5 = secP160R1FieldElement5.f25083a;
        SecP160R1Field.subtract(iArr5, iArrA, iArr5);
        SecP160R1FieldElement secP160R1FieldElement6 = new SecP160R1FieldElement(iArrA2);
        SecP160R1Field.twice(secP160R1FieldElement.f25083a, secP160R1FieldElement6.f25083a);
        if (!zIsOne) {
            int[] iArr6 = secP160R1FieldElement6.f25083a;
            SecP160R1Field.multiply(iArr6, secP160R1FieldElement3.f25083a, iArr6);
        }
        return new SecP160R1Point(curve, secP160R1FieldElement4, secP160R1FieldElement5, new ECFieldElement[]{secP160R1FieldElement6}, this.f25035e);
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

    public SecP160R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecP160R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
