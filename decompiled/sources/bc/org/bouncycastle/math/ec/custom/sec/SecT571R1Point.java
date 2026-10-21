package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.d4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;

/* JADX INFO: loaded from: classes2.dex */
public class SecT571R1Point extends ECPoint.AbstractF2m {
    public SecT571R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        SecT571FieldElement secT571FieldElement;
        SecT571FieldElement secT571FieldElement2;
        SecT571FieldElement secT571FieldElement3;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecT571FieldElement secT571FieldElement4 = (SecT571FieldElement) this.f25032b;
        SecT571FieldElement secT571FieldElement5 = (SecT571FieldElement) eCPoint.getRawXCoord();
        if (secT571FieldElement4.isZero()) {
            return secT571FieldElement5.isZero() ? curve.getInfinity() : eCPoint.add(this);
        }
        SecT571FieldElement secT571FieldElement6 = (SecT571FieldElement) this.f25033c;
        SecT571FieldElement secT571FieldElement7 = (SecT571FieldElement) this.f25034d[0];
        SecT571FieldElement secT571FieldElement8 = (SecT571FieldElement) eCPoint.getRawYCoord();
        SecT571FieldElement secT571FieldElement9 = (SecT571FieldElement) eCPoint.getZCoord(0);
        long[] jArrA = d4.a();
        long[] jArrA2 = d4.a();
        long[] jArrA3 = d4.a();
        long[] jArrA4 = d4.a();
        long[] jArrPrecompMultiplicand = secT571FieldElement7.isOne() ? null : SecT571Field.precompMultiplicand(secT571FieldElement7.f25164a);
        if (jArrPrecompMultiplicand == null) {
            jArr = secT571FieldElement5.f25164a;
            jArr2 = secT571FieldElement8.f25164a;
        } else {
            SecT571Field.multiplyPrecomp(secT571FieldElement5.f25164a, jArrPrecompMultiplicand, jArrA2);
            SecT571Field.multiplyPrecomp(secT571FieldElement8.f25164a, jArrPrecompMultiplicand, jArrA4);
            jArr = jArrA2;
            jArr2 = jArrA4;
        }
        long[] jArrPrecompMultiplicand2 = secT571FieldElement9.isOne() ? null : SecT571Field.precompMultiplicand(secT571FieldElement9.f25164a);
        if (jArrPrecompMultiplicand2 == null) {
            jArr3 = secT571FieldElement4.f25164a;
            jArr4 = secT571FieldElement6.f25164a;
        } else {
            SecT571Field.multiplyPrecomp(secT571FieldElement4.f25164a, jArrPrecompMultiplicand2, jArrA);
            SecT571Field.multiplyPrecomp(secT571FieldElement6.f25164a, jArrPrecompMultiplicand2, jArrA3);
            jArr3 = jArrA;
            jArr4 = jArrA3;
        }
        SecT571Field.add(jArr4, jArr2, jArrA3);
        SecT571Field.add(jArr3, jArr, jArrA4);
        if (d4.b(jArrA4)) {
            return d4.b(jArrA3) ? twice() : curve.getInfinity();
        }
        if (secT571FieldElement5.isZero()) {
            ECPoint eCPointNormalize = normalize();
            SecT571FieldElement secT571FieldElement10 = (SecT571FieldElement) eCPointNormalize.getXCoord();
            ECFieldElement yCoord = eCPointNormalize.getYCoord();
            ECFieldElement eCFieldElementDivide = yCoord.add(secT571FieldElement8).divide(secT571FieldElement10);
            secT571FieldElement = (SecT571FieldElement) eCFieldElementDivide.square().add(eCFieldElementDivide).add(secT571FieldElement10).addOne();
            if (secT571FieldElement.isZero()) {
                return new SecT571R1Point(curve, secT571FieldElement, SecT571R1Curve.m, this.f25035e);
            }
            SecT571FieldElement secT571FieldElement11 = (SecT571FieldElement) eCFieldElementDivide.multiply(secT571FieldElement10.add(secT571FieldElement)).add(secT571FieldElement).add(yCoord).divide(secT571FieldElement).add(secT571FieldElement);
            secT571FieldElement3 = (SecT571FieldElement) curve.fromBigInteger(ECConstants.ONE);
            secT571FieldElement2 = secT571FieldElement11;
        } else {
            SecT571Field.square(jArrA4, jArrA4);
            long[] jArrPrecompMultiplicand3 = SecT571Field.precompMultiplicand(jArrA3);
            SecT571Field.multiplyPrecomp(jArr3, jArrPrecompMultiplicand3, jArrA);
            SecT571Field.multiplyPrecomp(jArr, jArrPrecompMultiplicand3, jArrA2);
            SecT571FieldElement secT571FieldElement12 = new SecT571FieldElement(jArrA);
            SecT571Field.multiply(jArrA, jArrA2, secT571FieldElement12.f25164a);
            if (secT571FieldElement12.isZero()) {
                return new SecT571R1Point(curve, secT571FieldElement12, SecT571R1Curve.m, this.f25035e);
            }
            SecT571FieldElement secT571FieldElement13 = new SecT571FieldElement(jArrA3);
            SecT571Field.multiplyPrecomp(jArrA4, jArrPrecompMultiplicand3, secT571FieldElement13.f25164a);
            if (jArrPrecompMultiplicand2 != null) {
                long[] jArr5 = secT571FieldElement13.f25164a;
                SecT571Field.multiplyPrecomp(jArr5, jArrPrecompMultiplicand2, jArr5);
            }
            long[] jArrB = d4.b();
            SecT571Field.add(jArrA2, jArrA4, jArrA4);
            SecT571Field.squareAddToExt(jArrA4, jArrB);
            SecT571Field.add(secT571FieldElement6.f25164a, secT571FieldElement7.f25164a, jArrA4);
            SecT571Field.multiplyAddToExt(jArrA4, secT571FieldElement13.f25164a, jArrB);
            SecT571FieldElement secT571FieldElement14 = new SecT571FieldElement(jArrA4);
            SecT571Field.reduce(jArrB, secT571FieldElement14.f25164a);
            if (jArrPrecompMultiplicand != null) {
                long[] jArr6 = secT571FieldElement13.f25164a;
                SecT571Field.multiplyPrecomp(jArr6, jArrPrecompMultiplicand, jArr6);
            }
            secT571FieldElement = secT571FieldElement12;
            secT571FieldElement2 = secT571FieldElement14;
            secT571FieldElement3 = secT571FieldElement13;
        }
        return new SecT571R1Point(curve, secT571FieldElement, secT571FieldElement2, new ECFieldElement[]{secT571FieldElement3}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecT571R1Point(null, getAffineXCoord(), getAffineYCoord());
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public boolean c() {
        ECFieldElement rawXCoord = getRawXCoord();
        return (rawXCoord.isZero() || getRawYCoord().testBitZero() == rawXCoord.testBitZero()) ? false : true;
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECFieldElement getYCoord() {
        ECFieldElement eCFieldElement = this.f25032b;
        ECFieldElement eCFieldElement2 = this.f25033c;
        if (isInfinity() || eCFieldElement.isZero()) {
            return eCFieldElement2;
        }
        ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
        ECFieldElement eCFieldElement3 = this.f25034d[0];
        return !eCFieldElement3.isOne() ? eCFieldElementMultiply.divide(eCFieldElement3) : eCFieldElementMultiply;
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint negate() {
        if (isInfinity()) {
            return this;
        }
        ECFieldElement eCFieldElement = this.f25032b;
        if (eCFieldElement.isZero()) {
            return this;
        }
        ECFieldElement eCFieldElement2 = this.f25033c;
        ECFieldElement eCFieldElement3 = this.f25034d[0];
        return new SecT571R1Point(this.f25031a, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        SecT571FieldElement secT571FieldElement = (SecT571FieldElement) this.f25032b;
        if (secT571FieldElement.isZero()) {
            return curve.getInfinity();
        }
        SecT571FieldElement secT571FieldElement2 = (SecT571FieldElement) this.f25033c;
        SecT571FieldElement secT571FieldElement3 = (SecT571FieldElement) this.f25034d[0];
        long[] jArrA = d4.a();
        long[] jArrA2 = d4.a();
        long[] jArrPrecompMultiplicand = secT571FieldElement3.isOne() ? null : SecT571Field.precompMultiplicand(secT571FieldElement3.f25164a);
        if (jArrPrecompMultiplicand == null) {
            jArr = secT571FieldElement2.f25164a;
            jArr2 = secT571FieldElement3.f25164a;
        } else {
            SecT571Field.multiplyPrecomp(secT571FieldElement2.f25164a, jArrPrecompMultiplicand, jArrA);
            SecT571Field.square(secT571FieldElement3.f25164a, jArrA2);
            jArr = jArrA;
            jArr2 = jArrA2;
        }
        long[] jArrA3 = d4.a();
        SecT571Field.square(secT571FieldElement2.f25164a, jArrA3);
        SecT571Field.addBothTo(jArr, jArr2, jArrA3);
        if (d4.b(jArrA3)) {
            return new SecT571R1Point(curve, new SecT571FieldElement(jArrA3), SecT571R1Curve.m, this.f25035e);
        }
        long[] jArrB = d4.b();
        SecT571Field.multiplyAddToExt(jArrA3, jArr, jArrB);
        SecT571FieldElement secT571FieldElement4 = new SecT571FieldElement(jArrA);
        SecT571Field.square(jArrA3, secT571FieldElement4.f25164a);
        SecT571FieldElement secT571FieldElement5 = new SecT571FieldElement(jArrA3);
        if (jArrPrecompMultiplicand != null) {
            long[] jArr4 = secT571FieldElement5.f25164a;
            SecT571Field.multiply(jArr4, jArr2, jArr4);
        }
        if (jArrPrecompMultiplicand == null) {
            jArr3 = secT571FieldElement.f25164a;
        } else {
            SecT571Field.multiplyPrecomp(secT571FieldElement.f25164a, jArrPrecompMultiplicand, jArrA2);
            jArr3 = jArrA2;
        }
        SecT571Field.squareAddToExt(jArr3, jArrB);
        SecT571Field.reduce(jArrB, jArrA2);
        SecT571Field.addBothTo(secT571FieldElement4.f25164a, secT571FieldElement5.f25164a, jArrA2);
        return new SecT571R1Point(curve, secT571FieldElement4, new SecT571FieldElement(jArrA2), new ECFieldElement[]{secT571FieldElement5}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint twicePlus(ECPoint eCPoint) {
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return twice();
        }
        ECCurve curve = getCurve();
        SecT571FieldElement secT571FieldElement = (SecT571FieldElement) this.f25032b;
        if (secT571FieldElement.isZero()) {
            return eCPoint;
        }
        SecT571FieldElement secT571FieldElement2 = (SecT571FieldElement) eCPoint.getRawXCoord();
        SecT571FieldElement secT571FieldElement3 = (SecT571FieldElement) eCPoint.getZCoord(0);
        if (secT571FieldElement2.isZero() || !secT571FieldElement3.isOne()) {
            return twice().add(eCPoint);
        }
        SecT571FieldElement secT571FieldElement4 = (SecT571FieldElement) this.f25033c;
        SecT571FieldElement secT571FieldElement5 = (SecT571FieldElement) this.f25034d[0];
        SecT571FieldElement secT571FieldElement6 = (SecT571FieldElement) eCPoint.getRawYCoord();
        long[] jArrA = d4.a();
        long[] jArrA2 = d4.a();
        long[] jArrA3 = d4.a();
        long[] jArrA4 = d4.a();
        SecT571Field.square(secT571FieldElement.f25164a, jArrA);
        SecT571Field.square(secT571FieldElement4.f25164a, jArrA2);
        SecT571Field.square(secT571FieldElement5.f25164a, jArrA3);
        SecT571Field.multiply(secT571FieldElement4.f25164a, secT571FieldElement5.f25164a, jArrA4);
        SecT571Field.addBothTo(jArrA3, jArrA2, jArrA4);
        long[] jArrPrecompMultiplicand = SecT571Field.precompMultiplicand(jArrA3);
        SecT571Field.multiplyPrecomp(secT571FieldElement6.f25164a, jArrPrecompMultiplicand, jArrA3);
        SecT571Field.add(jArrA3, jArrA2, jArrA3);
        long[] jArrB = d4.b();
        SecT571Field.multiplyAddToExt(jArrA3, jArrA4, jArrB);
        SecT571Field.multiplyPrecompAddToExt(jArrA, jArrPrecompMultiplicand, jArrB);
        SecT571Field.reduce(jArrB, jArrA3);
        SecT571Field.multiplyPrecomp(secT571FieldElement2.f25164a, jArrPrecompMultiplicand, jArrA);
        SecT571Field.add(jArrA, jArrA4, jArrA2);
        SecT571Field.square(jArrA2, jArrA2);
        if (d4.b(jArrA2)) {
            return d4.b(jArrA3) ? eCPoint.twice() : curve.getInfinity();
        }
        if (d4.b(jArrA3)) {
            return new SecT571R1Point(curve, new SecT571FieldElement(jArrA3), SecT571R1Curve.m, this.f25035e);
        }
        SecT571FieldElement secT571FieldElement7 = new SecT571FieldElement();
        SecT571Field.square(jArrA3, secT571FieldElement7.f25164a);
        long[] jArr = secT571FieldElement7.f25164a;
        SecT571Field.multiply(jArr, jArrA, jArr);
        SecT571FieldElement secT571FieldElement8 = new SecT571FieldElement(jArrA);
        SecT571Field.multiply(jArrA3, jArrA2, secT571FieldElement8.f25164a);
        long[] jArr2 = secT571FieldElement8.f25164a;
        SecT571Field.multiplyPrecomp(jArr2, jArrPrecompMultiplicand, jArr2);
        SecT571FieldElement secT571FieldElement9 = new SecT571FieldElement(jArrA2);
        SecT571Field.add(jArrA3, jArrA2, secT571FieldElement9.f25164a);
        long[] jArr3 = secT571FieldElement9.f25164a;
        SecT571Field.square(jArr3, jArr3);
        e4.a(18, jArrB);
        SecT571Field.multiplyAddToExt(secT571FieldElement9.f25164a, jArrA4, jArrB);
        SecT571Field.addOne(secT571FieldElement6.f25164a, jArrA4);
        SecT571Field.multiplyAddToExt(jArrA4, secT571FieldElement8.f25164a, jArrB);
        SecT571Field.reduce(jArrB, secT571FieldElement9.f25164a);
        return new SecT571R1Point(curve, secT571FieldElement7, secT571FieldElement9, new ECFieldElement[]{secT571FieldElement8}, this.f25035e);
    }

    public SecT571R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecT571R1Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
