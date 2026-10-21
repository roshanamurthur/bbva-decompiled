package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class SecT163R2Point extends ECPoint.AbstractF2m {
    public SecT163R2Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, false);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint add(ECPoint eCPoint) {
        ECFieldElement eCFieldElementMultiply;
        ECFieldElement eCFieldElementMultiply2;
        ECFieldElement eCFieldElementMultiply3;
        ECFieldElement eCFieldElementAddOne;
        ECFieldElement eCFieldElement;
        ECFieldElement eCFieldElementFromBigInteger;
        if (isInfinity()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElementMultiply4 = this.f25032b;
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        if (eCFieldElementMultiply4.isZero()) {
            return rawXCoord.isZero() ? curve.getInfinity() : eCPoint.add(this);
        }
        ECFieldElement eCFieldElement2 = this.f25033c;
        ECFieldElement eCFieldElement3 = this.f25034d[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        boolean zIsOne = eCFieldElement3.isOne();
        if (zIsOne) {
            eCFieldElementMultiply = rawXCoord;
            eCFieldElementMultiply2 = rawYCoord;
        } else {
            eCFieldElementMultiply = rawXCoord.multiply(eCFieldElement3);
            eCFieldElementMultiply2 = rawYCoord.multiply(eCFieldElement3);
        }
        boolean zIsOne2 = zCoord.isOne();
        if (zIsOne2) {
            eCFieldElementMultiply3 = eCFieldElement2;
        } else {
            eCFieldElementMultiply4 = eCFieldElementMultiply4.multiply(zCoord);
            eCFieldElementMultiply3 = eCFieldElement2.multiply(zCoord);
        }
        ECFieldElement eCFieldElementAdd = eCFieldElementMultiply3.add(eCFieldElementMultiply2);
        ECFieldElement eCFieldElementAdd2 = eCFieldElementMultiply4.add(eCFieldElementMultiply);
        if (eCFieldElementAdd2.isZero()) {
            return eCFieldElementAdd.isZero() ? twice() : curve.getInfinity();
        }
        if (rawXCoord.isZero()) {
            ECPoint eCPointNormalize = normalize();
            ECFieldElement xCoord = eCPointNormalize.getXCoord();
            ECFieldElement yCoord = eCPointNormalize.getYCoord();
            ECFieldElement eCFieldElementDivide = yCoord.add(rawYCoord).divide(xCoord);
            eCFieldElementAddOne = eCFieldElementDivide.square().add(eCFieldElementDivide).add(xCoord).addOne();
            if (eCFieldElementAddOne.isZero()) {
                return new SecT163R2Point(curve, eCFieldElementAddOne, curve.getB().sqrt(), this.f25035e);
            }
            ECFieldElement eCFieldElementAdd3 = eCFieldElementDivide.multiply(xCoord.add(eCFieldElementAddOne)).add(eCFieldElementAddOne).add(yCoord).divide(eCFieldElementAddOne).add(eCFieldElementAddOne);
            eCFieldElementFromBigInteger = curve.fromBigInteger(ECConstants.ONE);
            eCFieldElement = eCFieldElementAdd3;
        } else {
            ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
            ECFieldElement eCFieldElementMultiply5 = eCFieldElementAdd.multiply(eCFieldElementMultiply4);
            ECFieldElement eCFieldElementMultiply6 = eCFieldElementAdd.multiply(eCFieldElementMultiply);
            ECFieldElement eCFieldElementMultiply7 = eCFieldElementMultiply5.multiply(eCFieldElementMultiply6);
            if (eCFieldElementMultiply7.isZero()) {
                return new SecT163R2Point(curve, eCFieldElementMultiply7, curve.getB().sqrt(), this.f25035e);
            }
            ECFieldElement eCFieldElementMultiply8 = eCFieldElementAdd.multiply(eCFieldElementSquare);
            ECFieldElement eCFieldElementMultiply9 = !zIsOne2 ? eCFieldElementMultiply8.multiply(zCoord) : eCFieldElementMultiply8;
            ECFieldElement eCFieldElementSquarePlusProduct = eCFieldElementMultiply6.add(eCFieldElementSquare).squarePlusProduct(eCFieldElementMultiply9, eCFieldElement2.add(eCFieldElement3));
            if (!zIsOne) {
                eCFieldElementMultiply9 = eCFieldElementMultiply9.multiply(eCFieldElement3);
            }
            eCFieldElementAddOne = eCFieldElementMultiply7;
            eCFieldElement = eCFieldElementSquarePlusProduct;
            eCFieldElementFromBigInteger = eCFieldElementMultiply9;
        }
        return new SecT163R2Point(curve, eCFieldElementAddOne, eCFieldElement, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint b() {
        return new SecT163R2Point(null, getAffineXCoord(), getAffineYCoord());
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
        return new SecT163R2Point(this.f25031a, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.f25035e);
    }

    @Override // bc.org.bouncycastle.math.ec.ECPoint
    public ECPoint twice() {
        if (isInfinity()) {
            return this;
        }
        ECCurve curve = getCurve();
        ECFieldElement eCFieldElementMultiply = this.f25032b;
        if (eCFieldElementMultiply.isZero()) {
            return curve.getInfinity();
        }
        ECFieldElement eCFieldElement = this.f25033c;
        ECFieldElement eCFieldElement2 = this.f25034d[0];
        boolean zIsOne = eCFieldElement2.isOne();
        ECFieldElement eCFieldElementMultiply2 = zIsOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement2);
        ECFieldElement eCFieldElementSquare = zIsOne ? eCFieldElement2 : eCFieldElement2.square();
        ECFieldElement eCFieldElementE = bc.org.bouncycastle.math.ec.a.e(eCFieldElement, eCFieldElementMultiply2, eCFieldElementSquare);
        if (eCFieldElementE.isZero()) {
            return new SecT163R2Point(curve, eCFieldElementE, curve.getB().sqrt(), this.f25035e);
        }
        ECFieldElement eCFieldElementSquare2 = eCFieldElementE.square();
        ECFieldElement eCFieldElementMultiply3 = zIsOne ? eCFieldElementE : eCFieldElementE.multiply(eCFieldElementSquare);
        if (!zIsOne) {
            eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement2);
        }
        return new SecT163R2Point(curve, eCFieldElementSquare2, eCFieldElementMultiply.squarePlusProduct(eCFieldElementE, eCFieldElementMultiply2).add(eCFieldElementSquare2).add(eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.f25035e);
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
        ECFieldElement eCFieldElement = this.f25032b;
        if (eCFieldElement.isZero()) {
            return eCPoint;
        }
        ECFieldElement rawXCoord = eCPoint.getRawXCoord();
        ECFieldElement zCoord = eCPoint.getZCoord(0);
        if (rawXCoord.isZero() || !zCoord.isOne()) {
            return twice().add(eCPoint);
        }
        ECFieldElement eCFieldElement2 = this.f25033c;
        ECFieldElement eCFieldElement3 = this.f25034d[0];
        ECFieldElement rawYCoord = eCPoint.getRawYCoord();
        ECFieldElement eCFieldElementSquare = eCFieldElement.square();
        ECFieldElement eCFieldElementSquare2 = eCFieldElement2.square();
        ECFieldElement eCFieldElementSquare3 = eCFieldElement3.square();
        ECFieldElement eCFieldElementAdd = eCFieldElementSquare3.add(eCFieldElementSquare2).add(eCFieldElement2.multiply(eCFieldElement3));
        ECFieldElement eCFieldElementMultiplyPlusProduct = rawYCoord.multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).multiplyPlusProduct(eCFieldElementAdd, eCFieldElementSquare, eCFieldElementSquare3);
        ECFieldElement eCFieldElementMultiply = rawXCoord.multiply(eCFieldElementSquare3);
        ECFieldElement eCFieldElementSquare4 = eCFieldElementMultiply.add(eCFieldElementAdd).square();
        if (eCFieldElementSquare4.isZero()) {
            return eCFieldElementMultiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
        }
        if (eCFieldElementMultiplyPlusProduct.isZero()) {
            return new SecT163R2Point(curve, eCFieldElementMultiplyPlusProduct, curve.getB().sqrt(), this.f25035e);
        }
        ECFieldElement eCFieldElementMultiply2 = eCFieldElementMultiplyPlusProduct.square().multiply(eCFieldElementMultiply);
        ECFieldElement eCFieldElementMultiply3 = eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare4).multiply(eCFieldElementSquare3);
        return new SecT163R2Point(curve, eCFieldElementMultiply2, eCFieldElementMultiplyPlusProduct.add(eCFieldElementSquare4).square().multiplyPlusProduct(eCFieldElementAdd, rawYCoord.addOne(), eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.f25035e);
    }

    public SecT163R2Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2);
        if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f25035e = z10;
    }

    public SecT163R2Point(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
        super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        this.f25035e = z10;
    }
}
