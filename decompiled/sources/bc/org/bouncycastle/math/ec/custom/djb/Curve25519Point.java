package bc.org.bouncycastle.math.ec.custom.djb;

import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;

/* JADX INFO: loaded from: classes2.dex */
public class Curve25519Point extends ECPoint.AbstractFp {
    public Curve25519Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    public Curve25519FieldElement a(Curve25519FieldElement curve25519FieldElement, int[] iArr) {
        Curve25519FieldElement curve25519FieldElement2 = (Curve25519FieldElement) getCurve().getA();
        if (curve25519FieldElement.isOne()) {
            return curve25519FieldElement2;
        }
        Curve25519FieldElement curve25519FieldElement3 = new Curve25519FieldElement();
        if (iArr == null) {
            iArr = curve25519FieldElement3.f25064a;
            Curve25519Field.square(curve25519FieldElement.f25064a, iArr);
        }
        Curve25519Field.square(iArr, curve25519FieldElement3.f25064a);
        int[] iArr2 = curve25519FieldElement3.f25064a;
        Curve25519Field.multiply(iArr2, curve25519FieldElement2.f25064a, iArr2);
        return curve25519FieldElement3;
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
        Curve25519FieldElement curve25519FieldElement = (Curve25519FieldElement) this.f25032b;
        Curve25519FieldElement curve25519FieldElement2 = (Curve25519FieldElement) this.f25033c;
        Curve25519FieldElement curve25519FieldElement3 = (Curve25519FieldElement) this.f25034d[0];
        Curve25519FieldElement curve25519FieldElement4 = (Curve25519FieldElement) eCPoint.getXCoord();
        Curve25519FieldElement curve25519FieldElement5 = (Curve25519FieldElement) eCPoint.getYCoord();
        Curve25519FieldElement curve25519FieldElement6 = (Curve25519FieldElement) eCPoint.getZCoord(0);
        int[] iArrC = y3.c();
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        int[] iArrA3 = y3.a();
        boolean zIsOne = curve25519FieldElement3.isOne();
        if (zIsOne) {
            iArr = curve25519FieldElement4.f25064a;
            iArr2 = curve25519FieldElement5.f25064a;
        } else {
            Curve25519Field.square(curve25519FieldElement3.f25064a, iArrA2);
            Curve25519Field.multiply(iArrA2, curve25519FieldElement4.f25064a, iArrA);
            Curve25519Field.multiply(iArrA2, curve25519FieldElement3.f25064a, iArrA2);
            Curve25519Field.multiply(iArrA2, curve25519FieldElement5.f25064a, iArrA2);
            iArr = iArrA;
            iArr2 = iArrA2;
        }
        boolean zIsOne2 = curve25519FieldElement6.isOne();
        if (zIsOne2) {
            iArr3 = curve25519FieldElement.f25064a;
            iArr4 = curve25519FieldElement2.f25064a;
        } else {
            Curve25519Field.square(curve25519FieldElement6.f25064a, iArrA3);
            Curve25519Field.multiply(iArrA3, curve25519FieldElement.f25064a, iArrC);
            Curve25519Field.multiply(iArrA3, curve25519FieldElement6.f25064a, iArrA3);
            Curve25519Field.multiply(iArrA3, curve25519FieldElement2.f25064a, iArrA3);
            iArr3 = iArrC;
            iArr4 = iArrA3;
        }
        int[] iArrA4 = y3.a();
        Curve25519Field.subtract(iArr3, iArr, iArrA4);
        Curve25519Field.subtract(iArr4, iArr2, iArrA);
        if (y3.b(iArrA4)) {
            return y3.b(iArrA) ? twice() : curve.getInfinity();
        }
        int[] iArrA5 = y3.a();
        Curve25519Field.square(iArrA4, iArrA5);
        int[] iArrA6 = y3.a();
        Curve25519Field.multiply(iArrA5, iArrA4, iArrA6);
        Curve25519Field.multiply(iArrA5, iArr3, iArrA2);
        Curve25519Field.negate(iArrA6, iArrA6);
        y3.c(iArr4, iArrA6, iArrC);
        Curve25519Field.reduce27(y3.b(iArrA2, iArrA2, iArrA6), iArrA6);
        Curve25519FieldElement curve25519FieldElement7 = new Curve25519FieldElement(iArrA3);
        Curve25519Field.square(iArrA, curve25519FieldElement7.f25064a);
        int[] iArr5 = curve25519FieldElement7.f25064a;
        Curve25519Field.subtract(iArr5, iArrA6, iArr5);
        Curve25519FieldElement curve25519FieldElement8 = new Curve25519FieldElement(iArrA6);
        Curve25519Field.subtract(iArrA2, curve25519FieldElement7.f25064a, curve25519FieldElement8.f25064a);
        Curve25519Field.multiplyAddToExt(curve25519FieldElement8.f25064a, iArrA, iArrC);
        Curve25519Field.reduce(iArrC, curve25519FieldElement8.f25064a);
        Curve25519FieldElement curve25519FieldElement9 = new Curve25519FieldElement(iArrA4);
        if (!zIsOne) {
            int[] iArr6 = curve25519FieldElement9.f25064a;
            Curve25519Field.multiply(iArr6, curve25519FieldElement3.f25064a, iArr6);
        }
        if (!zIsOne2) {
            int[] iArr7 = curve25519FieldElement9.f25064a;
            Curve25519Field.multiply(iArr7, curve25519FieldElement6.f25064a, iArr7);
        }
        if (!zIsOne || !zIsOne2) {
            iArrA5 = null;
        }
        return new Curve25519Point(curve, curve25519FieldElement7, curve25519FieldElement8, new ECFieldElement[]{curve25519FieldElement9, a(curve25519FieldElement9, iArrA5)}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new Curve25519Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECFieldElement getZCoord(int i10) {
        return i10 == 1 ? h() : super.getZCoord(i10);
    }

    public Curve25519FieldElement h() {
        ECFieldElement[] eCFieldElementArr = this.f25034d;
        Curve25519FieldElement curve25519FieldElement = (Curve25519FieldElement) eCFieldElementArr[1];
        if (curve25519FieldElement != null) {
            return curve25519FieldElement;
        }
        Curve25519FieldElement curve25519FieldElementA = a((Curve25519FieldElement) eCFieldElementArr[0], (int[]) null);
        eCFieldElementArr[1] = curve25519FieldElementA;
        return curve25519FieldElementA;
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        return isInfinity() ? this : new Curve25519Point(getCurve(), this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint threeTimes() {
        return (isInfinity() || this.f25033c.isZero()) ? this : a(false).add(this);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        return this.f25033c.isZero() ? getCurve().getInfinity() : a(true);
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
        return this.f25033c.isZero() ? eCPoint : a(false).add(eCPoint);
    }

    public Curve25519Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public Curve25519Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }

    public Curve25519Point a(boolean z10) {
        Curve25519FieldElement curve25519FieldElement;
        Curve25519FieldElement curve25519FieldElement2 = (Curve25519FieldElement) this.f25032b;
        Curve25519FieldElement curve25519FieldElement3 = (Curve25519FieldElement) this.f25033c;
        Curve25519FieldElement curve25519FieldElement4 = (Curve25519FieldElement) this.f25034d[0];
        Curve25519FieldElement curve25519FieldElementH = h();
        int[] iArrA = y3.a();
        Curve25519Field.square(curve25519FieldElement2.f25064a, iArrA);
        Curve25519Field.reduce27(y3.a(curve25519FieldElementH.f25064a, iArrA) + y3.b(iArrA, iArrA, iArrA), iArrA);
        int[] iArrA2 = y3.a();
        Curve25519Field.twice(curve25519FieldElement3.f25064a, iArrA2);
        int[] iArrA3 = y3.a();
        Curve25519Field.multiply(iArrA2, curve25519FieldElement3.f25064a, iArrA3);
        int[] iArrA4 = y3.a();
        Curve25519Field.multiply(iArrA3, curve25519FieldElement2.f25064a, iArrA4);
        Curve25519Field.twice(iArrA4, iArrA4);
        int[] iArrA5 = y3.a();
        Curve25519Field.square(iArrA3, iArrA5);
        Curve25519Field.twice(iArrA5, iArrA5);
        Curve25519FieldElement curve25519FieldElement5 = new Curve25519FieldElement(iArrA3);
        Curve25519Field.square(iArrA, curve25519FieldElement5.f25064a);
        int[] iArr = curve25519FieldElement5.f25064a;
        Curve25519Field.subtract(iArr, iArrA4, iArr);
        int[] iArr2 = curve25519FieldElement5.f25064a;
        Curve25519Field.subtract(iArr2, iArrA4, iArr2);
        Curve25519FieldElement curve25519FieldElement6 = new Curve25519FieldElement(iArrA4);
        Curve25519Field.subtract(iArrA4, curve25519FieldElement5.f25064a, curve25519FieldElement6.f25064a);
        int[] iArr3 = curve25519FieldElement6.f25064a;
        Curve25519Field.multiply(iArr3, iArrA, iArr3);
        int[] iArr4 = curve25519FieldElement6.f25064a;
        Curve25519Field.subtract(iArr4, iArrA5, iArr4);
        Curve25519FieldElement curve25519FieldElement7 = new Curve25519FieldElement(iArrA2);
        if (!y3.a(curve25519FieldElement4.f25064a)) {
            int[] iArr5 = curve25519FieldElement7.f25064a;
            Curve25519Field.multiply(iArr5, curve25519FieldElement4.f25064a, iArr5);
        }
        if (z10) {
            curve25519FieldElement = new Curve25519FieldElement(iArrA5);
            int[] iArr6 = curve25519FieldElement.f25064a;
            Curve25519Field.multiply(iArr6, curve25519FieldElementH.f25064a, iArr6);
            int[] iArr7 = curve25519FieldElement.f25064a;
            Curve25519Field.twice(iArr7, iArr7);
        } else {
            curve25519FieldElement = null;
        }
        return new Curve25519Point(getCurve(), curve25519FieldElement5, curve25519FieldElement6, new ECFieldElement[]{curve25519FieldElement7, curve25519FieldElement}, this.f25035e);
    }
}
