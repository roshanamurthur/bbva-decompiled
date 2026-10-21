package bc.org.bouncycastle.math.ec;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.math.BigInteger;
import java.util.Hashtable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECPoint {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static ECFieldElement[] f25030g = new ECFieldElement[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ECCurve f25031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ECFieldElement f25032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ECFieldElement f25033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ECFieldElement[] f25034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f25035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Hashtable f25036f;

    public static abstract class AbstractF2m extends ECPoint {
        public AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public boolean g() {
            ECFieldElement eCFieldElementMultiplyPlusProduct;
            ECFieldElement eCFieldElementSquarePlusProduct;
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f25032b;
            ECFieldElement a10 = curve.getA();
            ECFieldElement b10 = curve.getB();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 6) {
                ECFieldElement eCFieldElement2 = this.f25033c;
                ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement2);
                if (coordinateSystem != 0) {
                    if (coordinateSystem != 1) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    ECFieldElement eCFieldElement3 = this.f25034d[0];
                    if (!eCFieldElement3.isOne()) {
                        ECFieldElement eCFieldElementMultiply2 = eCFieldElement3.multiply(eCFieldElement3.square());
                        eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement3);
                        a10 = a10.multiply(eCFieldElement3);
                        b10 = b10.multiply(eCFieldElementMultiply2);
                    }
                }
                return eCFieldElementMultiply.equals(eCFieldElement.add(a10).multiply(eCFieldElement.square()).add(b10));
            }
            ECFieldElement eCFieldElement4 = this.f25034d[0];
            boolean zIsOne = eCFieldElement4.isOne();
            if (eCFieldElement.isZero()) {
                ECFieldElement eCFieldElementSquare = this.f25033c.square();
                if (!zIsOne) {
                    b10 = b10.multiply(eCFieldElement4.square());
                }
                return eCFieldElementSquare.equals(b10);
            }
            ECFieldElement eCFieldElement5 = this.f25033c;
            ECFieldElement eCFieldElementSquare2 = eCFieldElement.square();
            if (zIsOne) {
                eCFieldElementMultiplyPlusProduct = a.e(eCFieldElement5, eCFieldElement5, a10);
                eCFieldElementSquarePlusProduct = eCFieldElementSquare2.square().add(b10);
            } else {
                ECFieldElement eCFieldElementSquare3 = eCFieldElement4.square();
                ECFieldElement eCFieldElementSquare4 = eCFieldElementSquare3.square();
                eCFieldElementMultiplyPlusProduct = eCFieldElement5.add(eCFieldElement4).multiplyPlusProduct(eCFieldElement5, a10, eCFieldElementSquare3);
                eCFieldElementSquarePlusProduct = eCFieldElementSquare2.squarePlusProduct(b10, eCFieldElementSquare4);
            }
            return eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare2).equals(eCFieldElementSquarePlusProduct);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint scaleX(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int iD = d();
            if (iD == 5) {
                ECFieldElement rawXCoord = getRawXCoord();
                return getCurve().a(rawXCoord, getRawYCoord().add(rawXCoord).divide(eCFieldElement).add(rawXCoord.multiply(eCFieldElement)), e(), this.f25035e);
            }
            if (iD != 6) {
                return super.scaleX(eCFieldElement);
            }
            ECFieldElement rawXCoord2 = getRawXCoord();
            ECFieldElement rawYCoord = getRawYCoord();
            ECFieldElement eCFieldElement2 = e()[0];
            ECFieldElement eCFieldElementMultiply = rawXCoord2.multiply(eCFieldElement.square());
            return getCurve().a(eCFieldElementMultiply, rawYCoord.add(rawXCoord2).add(eCFieldElementMultiply), new ECFieldElement[]{eCFieldElement2.multiply(eCFieldElement)}, this.f25035e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint scaleY(ECFieldElement eCFieldElement) {
            if (isInfinity()) {
                return this;
            }
            int iD = d();
            if (iD != 5 && iD != 6) {
                return super.scaleY(eCFieldElement);
            }
            ECFieldElement rawXCoord = getRawXCoord();
            return getCurve().a(rawXCoord, getRawYCoord().add(rawXCoord).multiply(eCFieldElement).add(rawXCoord), e(), this.f25035e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        public AbstractF2m tau() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.f25032b;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                return (AbstractF2m) curve.a(eCFieldElement.square(), this.f25033c.square(), new ECFieldElement[]{this.f25034d[0].square()}, this.f25035e);
            }
            return (AbstractF2m) curve.a(eCFieldElement.square(), this.f25033c.square(), this.f25035e);
        }

        public AbstractF2m tauPow(int i10) {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement = this.f25032b;
            if (coordinateSystem != 0) {
                if (coordinateSystem != 1) {
                    if (coordinateSystem != 5) {
                        if (coordinateSystem != 6) {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                return (AbstractF2m) curve.a(eCFieldElement.squarePow(i10), this.f25033c.squarePow(i10), new ECFieldElement[]{this.f25034d[0].squarePow(i10)}, this.f25035e);
            }
            return (AbstractF2m) curve.a(eCFieldElement.squarePow(i10), this.f25033c.squarePow(i10), this.f25035e);
        }

        public AbstractF2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }
    }

    public static abstract class AbstractFp extends ECPoint {
        public AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public boolean c() {
            return getAffineYCoord().testBitZero();
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public boolean g() {
            ECFieldElement eCFieldElement = this.f25032b;
            ECFieldElement eCFieldElement2 = this.f25033c;
            ECFieldElement a10 = this.f25031a.getA();
            ECFieldElement b10 = this.f25031a.getB();
            ECFieldElement eCFieldElementSquare = eCFieldElement2.square();
            int iD = d();
            if (iD != 0) {
                if (iD == 1) {
                    ECFieldElement eCFieldElement3 = this.f25034d[0];
                    if (!eCFieldElement3.isOne()) {
                        ECFieldElement eCFieldElementSquare2 = eCFieldElement3.square();
                        ECFieldElement eCFieldElementMultiply = eCFieldElement3.multiply(eCFieldElementSquare2);
                        eCFieldElementSquare = eCFieldElementSquare.multiply(eCFieldElement3);
                        a10 = a10.multiply(eCFieldElementSquare2);
                        b10 = b10.multiply(eCFieldElementMultiply);
                    }
                } else {
                    if (iD != 2 && iD != 3 && iD != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    ECFieldElement eCFieldElement4 = this.f25034d[0];
                    if (!eCFieldElement4.isOne()) {
                        ECFieldElement eCFieldElementSquare3 = eCFieldElement4.square();
                        ECFieldElement eCFieldElementSquare4 = eCFieldElementSquare3.square();
                        ECFieldElement eCFieldElementMultiply2 = eCFieldElementSquare3.multiply(eCFieldElementSquare4);
                        a10 = a10.multiply(eCFieldElementSquare4);
                        b10 = b10.multiply(eCFieldElementMultiply2);
                    }
                }
            }
            return eCFieldElementSquare.equals(eCFieldElement.square().add(a10).multiply(eCFieldElement).add(b10));
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return eCPoint.isInfinity() ? this : add(eCPoint.negate());
        }

        public AbstractFp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }
    }

    public static class F2m extends AbstractF2m {
        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint add(ECPoint eCPoint) {
            ECFieldElement eCFieldElementMultiply;
            ECFieldElement eCFieldElementMultiply2;
            ECFieldElement eCFieldElementMultiply3;
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger;
            ECFieldElement eCFieldElementAdd2;
            if (isInfinity()) {
                return eCPoint;
            }
            if (eCPoint.isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElementMultiply4 = this.f25032b;
            ECFieldElement eCFieldElement = eCPoint.f25032b;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElement2 = this.f25033c;
                ECFieldElement eCFieldElement3 = eCPoint.f25033c;
                ECFieldElement eCFieldElementAdd3 = eCFieldElementMultiply4.add(eCFieldElement);
                ECFieldElement eCFieldElementAdd4 = eCFieldElement2.add(eCFieldElement3);
                if (eCFieldElementAdd3.isZero()) {
                    return eCFieldElementAdd4.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementDivide = eCFieldElementAdd4.divide(eCFieldElementAdd3);
                ECFieldElement eCFieldElementAdd5 = a.e(eCFieldElementDivide, eCFieldElementDivide, eCFieldElementAdd3).add(curve.getA());
                return new F2m(curve, eCFieldElementAdd5, eCFieldElementDivide.multiply(eCFieldElementMultiply4.add(eCFieldElementAdd5)).add(eCFieldElementAdd5).add(eCFieldElement2), this.f25035e);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElement4 = this.f25033c;
                ECFieldElement eCFieldElementMultiply5 = this.f25034d[0];
                ECFieldElement eCFieldElement5 = eCPoint.f25033c;
                ECFieldElement eCFieldElement6 = eCPoint.f25034d[0];
                boolean zIsOne = eCFieldElement6.isOne();
                ECFieldElement eCFieldElementAdd6 = eCFieldElementMultiply5.multiply(eCFieldElement5).add(zIsOne ? eCFieldElement4 : eCFieldElement4.multiply(eCFieldElement6));
                ECFieldElement eCFieldElementAdd7 = eCFieldElementMultiply5.multiply(eCFieldElement).add(zIsOne ? eCFieldElementMultiply4 : eCFieldElementMultiply4.multiply(eCFieldElement6));
                if (eCFieldElementAdd7.isZero()) {
                    return eCFieldElementAdd6.isZero() ? twice() : curve.getInfinity();
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementAdd7.square();
                ECFieldElement eCFieldElementMultiply6 = eCFieldElementSquare.multiply(eCFieldElementAdd7);
                if (!zIsOne) {
                    eCFieldElementMultiply5 = eCFieldElementMultiply5.multiply(eCFieldElement6);
                }
                ECFieldElement eCFieldElementAdd8 = eCFieldElementAdd6.add(eCFieldElementAdd7);
                ECFieldElement eCFieldElementAdd9 = eCFieldElementAdd8.multiplyPlusProduct(eCFieldElementAdd6, eCFieldElementSquare, curve.getA()).multiply(eCFieldElementMultiply5).add(eCFieldElementMultiply6);
                ECFieldElement eCFieldElementMultiply7 = eCFieldElementAdd7.multiply(eCFieldElementAdd9);
                if (!zIsOne) {
                    eCFieldElementSquare = eCFieldElementSquare.multiply(eCFieldElement6);
                }
                return new F2m(curve, eCFieldElementMultiply7, eCFieldElementAdd6.multiplyPlusProduct(eCFieldElementMultiply4, eCFieldElementAdd7, eCFieldElement4).multiplyPlusProduct(eCFieldElementSquare, eCFieldElementAdd8, eCFieldElementAdd9), new ECFieldElement[]{eCFieldElementMultiply6.multiply(eCFieldElementMultiply5)}, this.f25035e);
            }
            if (coordinateSystem != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            if (eCFieldElementMultiply4.isZero()) {
                return eCFieldElement.isZero() ? curve.getInfinity() : eCPoint.add(this);
            }
            ECFieldElement eCFieldElement7 = this.f25033c;
            ECFieldElement eCFieldElement8 = this.f25034d[0];
            ECFieldElement eCFieldElement9 = eCPoint.f25033c;
            ECFieldElement eCFieldElement10 = eCPoint.f25034d[0];
            boolean zIsOne2 = eCFieldElement8.isOne();
            if (zIsOne2) {
                eCFieldElementMultiply = eCFieldElement;
                eCFieldElementMultiply2 = eCFieldElement9;
            } else {
                eCFieldElementMultiply = eCFieldElement.multiply(eCFieldElement8);
                eCFieldElementMultiply2 = eCFieldElement9.multiply(eCFieldElement8);
            }
            boolean zIsOne3 = eCFieldElement10.isOne();
            if (zIsOne3) {
                eCFieldElementMultiply3 = eCFieldElement7;
            } else {
                eCFieldElementMultiply4 = eCFieldElementMultiply4.multiply(eCFieldElement10);
                eCFieldElementMultiply3 = eCFieldElement7.multiply(eCFieldElement10);
            }
            ECFieldElement eCFieldElementAdd10 = eCFieldElementMultiply3.add(eCFieldElementMultiply2);
            ECFieldElement eCFieldElementAdd11 = eCFieldElementMultiply4.add(eCFieldElementMultiply);
            if (eCFieldElementAdd11.isZero()) {
                return eCFieldElementAdd10.isZero() ? twice() : curve.getInfinity();
            }
            if (eCFieldElement.isZero()) {
                ECPoint eCPointNormalize = normalize();
                ECFieldElement xCoord = eCPointNormalize.getXCoord();
                ECFieldElement yCoord = eCPointNormalize.getYCoord();
                ECFieldElement eCFieldElementDivide2 = yCoord.add(eCFieldElement9).divide(xCoord);
                eCFieldElementAdd = a.e(eCFieldElementDivide2, eCFieldElementDivide2, xCoord).add(curve.getA());
                if (eCFieldElementAdd.isZero()) {
                    return new F2m(curve, eCFieldElementAdd, curve.getB().sqrt(), this.f25035e);
                }
                eCFieldElementAdd2 = eCFieldElementDivide2.multiply(xCoord.add(eCFieldElementAdd)).add(eCFieldElementAdd).add(yCoord).divide(eCFieldElementAdd).add(eCFieldElementAdd);
                eCFieldElementFromBigInteger = curve.fromBigInteger(ECConstants.ONE);
            } else {
                ECFieldElement eCFieldElementSquare2 = eCFieldElementAdd11.square();
                ECFieldElement eCFieldElementMultiply8 = eCFieldElementAdd10.multiply(eCFieldElementMultiply4);
                ECFieldElement eCFieldElementMultiply9 = eCFieldElementAdd10.multiply(eCFieldElementMultiply);
                ECFieldElement eCFieldElementMultiply10 = eCFieldElementMultiply8.multiply(eCFieldElementMultiply9);
                if (eCFieldElementMultiply10.isZero()) {
                    return new F2m(curve, eCFieldElementMultiply10, curve.getB().sqrt(), this.f25035e);
                }
                ECFieldElement eCFieldElementMultiply11 = eCFieldElementAdd10.multiply(eCFieldElementSquare2);
                ECFieldElement eCFieldElementMultiply12 = !zIsOne3 ? eCFieldElementMultiply11.multiply(eCFieldElement10) : eCFieldElementMultiply11;
                ECFieldElement eCFieldElementSquarePlusProduct = eCFieldElementMultiply9.add(eCFieldElementSquare2).squarePlusProduct(eCFieldElementMultiply12, eCFieldElement7.add(eCFieldElement8));
                if (!zIsOne2) {
                    eCFieldElementMultiply12 = eCFieldElementMultiply12.multiply(eCFieldElement8);
                }
                eCFieldElementAdd = eCFieldElementMultiply10;
                eCFieldElementFromBigInteger = eCFieldElementMultiply12;
                eCFieldElementAdd2 = eCFieldElementSquarePlusProduct;
            }
            return new F2m(curve, eCFieldElementAdd, eCFieldElementAdd2, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.f25035e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint b() {
            return new F2m(null, getAffineXCoord(), getAffineYCoord());
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public boolean c() {
            ECFieldElement rawXCoord = getRawXCoord();
            if (rawXCoord.isZero()) {
                return false;
            }
            ECFieldElement rawYCoord = getRawYCoord();
            int iD = d();
            if (iD == 5 || iD == 6) {
                return rawYCoord.testBitZero() != rawXCoord.testBitZero();
            }
            return rawYCoord.divide(rawXCoord).testBitZero();
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECFieldElement getYCoord() {
            int iD = d();
            if (iD != 5 && iD != 6) {
                return this.f25033c;
            }
            ECFieldElement eCFieldElement = this.f25032b;
            ECFieldElement eCFieldElement2 = this.f25033c;
            if (isInfinity() || eCFieldElement.isZero()) {
                return eCFieldElement2;
            }
            ECFieldElement eCFieldElementMultiply = eCFieldElement2.add(eCFieldElement).multiply(eCFieldElement);
            if (6 != iD) {
                return eCFieldElementMultiply;
            }
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
            int iD = d();
            if (iD == 0) {
                return new F2m(this.f25031a, eCFieldElement, this.f25033c.add(eCFieldElement), this.f25035e);
            }
            if (iD == 1) {
                return new F2m(this.f25031a, eCFieldElement, this.f25033c.add(eCFieldElement), new ECFieldElement[]{this.f25034d[0]}, this.f25035e);
            }
            if (iD == 5) {
                return new F2m(this.f25031a, eCFieldElement, this.f25033c.addOne(), this.f25035e);
            }
            if (iD != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECFieldElement eCFieldElement2 = this.f25033c;
            ECFieldElement eCFieldElement3 = this.f25034d[0];
            return new F2m(this.f25031a, eCFieldElement, eCFieldElement2.add(eCFieldElement3), new ECFieldElement[]{eCFieldElement3}, this.f25035e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint twice() {
            ECFieldElement eCFieldElementAdd;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElementMultiply = this.f25032b;
            if (eCFieldElementMultiply.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementAdd2 = this.f25033c.divide(eCFieldElementMultiply).add(eCFieldElementMultiply);
                ECFieldElement eCFieldElementAdd3 = eCFieldElementAdd2.square().add(eCFieldElementAdd2).add(curve.getA());
                return new F2m(curve, eCFieldElementAdd3, eCFieldElementMultiply.squarePlusProduct(eCFieldElementAdd3, eCFieldElementAdd2.addOne()), this.f25035e);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElementMultiply2 = this.f25033c;
                ECFieldElement eCFieldElement = this.f25034d[0];
                boolean zIsOne = eCFieldElement.isOne();
                ECFieldElement eCFieldElementMultiply3 = zIsOne ? eCFieldElementMultiply : eCFieldElementMultiply.multiply(eCFieldElement);
                if (!zIsOne) {
                    eCFieldElementMultiply2 = eCFieldElementMultiply2.multiply(eCFieldElement);
                }
                ECFieldElement eCFieldElementSquare = eCFieldElementMultiply.square();
                ECFieldElement eCFieldElementAdd4 = eCFieldElementSquare.add(eCFieldElementMultiply2);
                ECFieldElement eCFieldElementSquare2 = eCFieldElementMultiply3.square();
                ECFieldElement eCFieldElementAdd5 = eCFieldElementAdd4.add(eCFieldElementMultiply3);
                ECFieldElement eCFieldElementMultiplyPlusProduct = eCFieldElementAdd5.multiplyPlusProduct(eCFieldElementAdd4, eCFieldElementSquare2, curve.getA());
                return new F2m(curve, eCFieldElementMultiply3.multiply(eCFieldElementMultiplyPlusProduct), eCFieldElementSquare.square().multiplyPlusProduct(eCFieldElementMultiply3, eCFieldElementMultiplyPlusProduct, eCFieldElementAdd5), new ECFieldElement[]{eCFieldElementMultiply3.multiply(eCFieldElementSquare2)}, this.f25035e);
            }
            if (coordinateSystem != 6) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECFieldElement eCFieldElement2 = this.f25033c;
            ECFieldElement eCFieldElement3 = this.f25034d[0];
            boolean zIsOne2 = eCFieldElement3.isOne();
            ECFieldElement eCFieldElementMultiply4 = zIsOne2 ? eCFieldElement2 : eCFieldElement2.multiply(eCFieldElement3);
            ECFieldElement eCFieldElementSquare3 = zIsOne2 ? eCFieldElement3 : eCFieldElement3.square();
            ECFieldElement a10 = curve.getA();
            ECFieldElement eCFieldElementMultiply5 = zIsOne2 ? a10 : a10.multiply(eCFieldElementSquare3);
            ECFieldElement eCFieldElementE = a.e(eCFieldElement2, eCFieldElementMultiply4, eCFieldElementMultiply5);
            if (eCFieldElementE.isZero()) {
                return new F2m(curve, eCFieldElementE, curve.getB().sqrt(), this.f25035e);
            }
            ECFieldElement eCFieldElementSquare4 = eCFieldElementE.square();
            ECFieldElement eCFieldElementMultiply6 = zIsOne2 ? eCFieldElementE : eCFieldElementE.multiply(eCFieldElementSquare3);
            ECFieldElement b10 = curve.getB();
            if (b10.bitLength() < (curve.getFieldSize() >> 1)) {
                ECFieldElement eCFieldElementSquare5 = eCFieldElement2.add(eCFieldElementMultiply).square();
                eCFieldElementAdd = eCFieldElementSquare5.add(eCFieldElementE).add(eCFieldElementSquare3).multiply(eCFieldElementSquare5).add(b10.isOne() ? eCFieldElementMultiply5.add(eCFieldElementSquare3).square() : eCFieldElementMultiply5.squarePlusProduct(b10, eCFieldElementSquare3.square())).add(eCFieldElementSquare4);
                if (a10.isZero()) {
                    eCFieldElementAdd = eCFieldElementAdd.add(eCFieldElementMultiply6);
                } else if (!a10.isOne()) {
                    eCFieldElementAdd = eCFieldElementAdd.add(a10.addOne().multiply(eCFieldElementMultiply6));
                }
            } else {
                if (!zIsOne2) {
                    eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElement3);
                }
                eCFieldElementAdd = eCFieldElementMultiply.squarePlusProduct(eCFieldElementE, eCFieldElementMultiply4).add(eCFieldElementSquare4).add(eCFieldElementMultiply6);
            }
            return new F2m(curve, eCFieldElementSquare4, eCFieldElementAdd, new ECFieldElement[]{eCFieldElementMultiply6}, this.f25035e);
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
            if (curve.getCoordinateSystem() != 6) {
                return twice().add(eCPoint);
            }
            ECFieldElement eCFieldElement2 = eCPoint.f25032b;
            ECFieldElement eCFieldElement3 = eCPoint.f25034d[0];
            if (eCFieldElement2.isZero() || !eCFieldElement3.isOne()) {
                return twice().add(eCPoint);
            }
            ECFieldElement eCFieldElement4 = this.f25033c;
            ECFieldElement eCFieldElement5 = this.f25034d[0];
            ECFieldElement eCFieldElement6 = eCPoint.f25033c;
            ECFieldElement eCFieldElementSquare = eCFieldElement.square();
            ECFieldElement eCFieldElementSquare2 = eCFieldElement4.square();
            ECFieldElement eCFieldElementSquare3 = eCFieldElement5.square();
            ECFieldElement eCFieldElementAdd = curve.getA().multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).add(eCFieldElement4.multiply(eCFieldElement5));
            ECFieldElement eCFieldElementAddOne = eCFieldElement6.addOne();
            ECFieldElement eCFieldElementMultiplyPlusProduct = curve.getA().add(eCFieldElementAddOne).multiply(eCFieldElementSquare3).add(eCFieldElementSquare2).multiplyPlusProduct(eCFieldElementAdd, eCFieldElementSquare, eCFieldElementSquare3);
            ECFieldElement eCFieldElementMultiply = eCFieldElement2.multiply(eCFieldElementSquare3);
            ECFieldElement eCFieldElementSquare4 = eCFieldElementMultiply.add(eCFieldElementAdd).square();
            if (eCFieldElementSquare4.isZero()) {
                return eCFieldElementMultiplyPlusProduct.isZero() ? eCPoint.twice() : curve.getInfinity();
            }
            if (eCFieldElementMultiplyPlusProduct.isZero()) {
                return new F2m(curve, eCFieldElementMultiplyPlusProduct, curve.getB().sqrt(), this.f25035e);
            }
            ECFieldElement eCFieldElementMultiply2 = eCFieldElementMultiplyPlusProduct.square().multiply(eCFieldElementMultiply);
            ECFieldElement eCFieldElementMultiply3 = eCFieldElementMultiplyPlusProduct.multiply(eCFieldElementSquare4).multiply(eCFieldElementSquare3);
            return new F2m(curve, eCFieldElementMultiply2, eCFieldElementMultiplyPlusProduct.add(eCFieldElementSquare4).square().multiplyPlusProduct(eCFieldElementAdd, eCFieldElementAddOne, eCFieldElementMultiply3), new ECFieldElement[]{eCFieldElementMultiply3}, this.f25035e);
        }

        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            if (eCFieldElement != null) {
                ECFieldElement.F2m.checkFieldElements(this.f25032b, this.f25033c);
                if (eCCurve != null) {
                    ECFieldElement.F2m.checkFieldElements(this.f25032b, this.f25031a.getA());
                }
            }
            this.f25035e = z10;
        }

        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.f25035e = z10;
        }
    }

    public static class Fp extends AbstractFp {
        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(eCCurve, eCFieldElement, eCFieldElement2, false);
        }

        public Fp a(boolean z10) {
            ECFieldElement eCFieldElement = this.f25032b;
            ECFieldElement eCFieldElement2 = this.f25033c;
            ECFieldElement eCFieldElement3 = this.f25034d[0];
            ECFieldElement eCFieldElementH = h();
            ECFieldElement eCFieldElementAdd = d(eCFieldElement.square()).add(eCFieldElementH);
            ECFieldElement eCFieldElementE = e(eCFieldElement2);
            ECFieldElement eCFieldElementMultiply = eCFieldElementE.multiply(eCFieldElement2);
            ECFieldElement eCFieldElementE2 = e(eCFieldElement.multiply(eCFieldElementMultiply));
            ECFieldElement eCFieldElementSubtract = eCFieldElementAdd.square().subtract(e(eCFieldElementE2));
            ECFieldElement eCFieldElementE3 = e(eCFieldElementMultiply.square());
            ECFieldElement eCFieldElementSubtract2 = eCFieldElementAdd.multiply(eCFieldElementE2.subtract(eCFieldElementSubtract)).subtract(eCFieldElementE3);
            ECFieldElement eCFieldElementE4 = z10 ? e(eCFieldElementE3.multiply(eCFieldElementH)) : null;
            if (!eCFieldElement3.isOne()) {
                eCFieldElementE = eCFieldElementE.multiply(eCFieldElement3);
            }
            return new Fp(getCurve(), eCFieldElementSubtract, eCFieldElementSubtract2, new ECFieldElement[]{eCFieldElementE, eCFieldElementE4}, this.f25035e);
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5431. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public bc.org.bouncycastle.math.ec.ECPoint add(bc.org.bouncycastle.math.ec.ECPoint r17) {
            /*
                Method dump skipped, instruction units count: 543
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bc.org.bouncycastle.math.ec.ECPoint.Fp.add(bc.org.bouncycastle.math.ec.ECPoint):bc.org.bouncycastle.math.ec.ECPoint");
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint b() {
            return new Fp(null, getAffineXCoord(), getAffineYCoord());
        }

        public ECFieldElement c(ECFieldElement eCFieldElement) {
            return e(e(eCFieldElement));
        }

        public ECFieldElement d(ECFieldElement eCFieldElement) {
            return e(eCFieldElement).add(eCFieldElement);
        }

        public ECFieldElement e(ECFieldElement eCFieldElement) {
            return eCFieldElement.add(eCFieldElement);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECFieldElement getZCoord(int i10) {
            return (i10 == 1 && 4 == d()) ? h() : super.getZCoord(i10);
        }

        public ECFieldElement h() {
            ECFieldElement[] eCFieldElementArr = this.f25034d;
            ECFieldElement eCFieldElement = eCFieldElementArr[1];
            if (eCFieldElement != null) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementB = b(eCFieldElementArr[0], null);
            eCFieldElementArr[1] = eCFieldElementB;
            return eCFieldElementB;
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint negate() {
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            return curve.getCoordinateSystem() != 0 ? new Fp(curve, this.f25032b, this.f25033c.negate(), this.f25034d, this.f25035e) : new Fp(curve, this.f25032b, this.f25033c.negate(), this.f25035e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint threeTimes() {
            if (isInfinity()) {
                return this;
            }
            ECFieldElement eCFieldElement = this.f25033c;
            if (eCFieldElement.isZero()) {
                return this;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                return coordinateSystem != 4 ? twice().add(this) : a(false).add(this);
            }
            ECFieldElement eCFieldElement2 = this.f25032b;
            ECFieldElement eCFieldElementE = e(eCFieldElement);
            ECFieldElement eCFieldElementSquare = eCFieldElementE.square();
            ECFieldElement eCFieldElementAdd = d(eCFieldElement2.square()).add(getCurve().getA());
            ECFieldElement eCFieldElementSubtract = d(eCFieldElement2).multiply(eCFieldElementSquare).subtract(eCFieldElementAdd.square());
            if (eCFieldElementSubtract.isZero()) {
                return getCurve().getInfinity();
            }
            ECFieldElement eCFieldElementInvert = eCFieldElementSubtract.multiply(eCFieldElementE).invert();
            ECFieldElement eCFieldElementMultiply = eCFieldElementSubtract.multiply(eCFieldElementInvert).multiply(eCFieldElementAdd);
            ECFieldElement eCFieldElementSubtract2 = eCFieldElementSquare.square().multiply(eCFieldElementInvert).subtract(eCFieldElementMultiply);
            ECFieldElement eCFieldElementAdd2 = eCFieldElementSubtract2.subtract(eCFieldElementMultiply).multiply(eCFieldElementMultiply.add(eCFieldElementSubtract2)).add(eCFieldElement2);
            return new Fp(curve, eCFieldElementAdd2, eCFieldElement2.subtract(eCFieldElementAdd2).multiply(eCFieldElementSubtract2).subtract(eCFieldElement), this.f25035e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint timesPow2(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("'e' cannot be negative");
            }
            if (i10 == 0 || isInfinity()) {
                return this;
            }
            if (i10 == 1) {
                return twice();
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElementMultiply = this.f25033c;
            if (eCFieldElementMultiply.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement a10 = curve.getA();
            ECFieldElement eCFieldElementMultiply2 = this.f25032b;
            ECFieldElement[] eCFieldElementArr = this.f25034d;
            ECFieldElement eCFieldElementFromBigInteger = eCFieldElementArr.length < 1 ? curve.fromBigInteger(ECConstants.ONE) : eCFieldElementArr[0];
            if (!eCFieldElementFromBigInteger.isOne() && coordinateSystem != 0) {
                if (coordinateSystem == 1) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementFromBigInteger.square();
                    eCFieldElementMultiply2 = eCFieldElementMultiply2.multiply(eCFieldElementFromBigInteger);
                    eCFieldElementMultiply = eCFieldElementMultiply.multiply(eCFieldElementSquare);
                    a10 = b(eCFieldElementFromBigInteger, eCFieldElementSquare);
                } else if (coordinateSystem == 2) {
                    a10 = b(eCFieldElementFromBigInteger, null);
                } else {
                    if (coordinateSystem != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    a10 = h();
                }
            }
            int i11 = 0;
            ECFieldElement eCFieldElement = a10;
            ECFieldElement eCFieldElementSubtract = eCFieldElementMultiply;
            ECFieldElement eCFieldElement2 = eCFieldElementMultiply2;
            ECFieldElement eCFieldElementE = eCFieldElement;
            while (i11 < i10) {
                if (eCFieldElementSubtract.isZero()) {
                    return curve.getInfinity();
                }
                ECFieldElement eCFieldElementD = d(eCFieldElement2.square());
                ECFieldElement eCFieldElementE2 = e(eCFieldElementSubtract);
                ECFieldElement eCFieldElementMultiply3 = eCFieldElementE2.multiply(eCFieldElementSubtract);
                ECFieldElement eCFieldElementE3 = e(eCFieldElement2.multiply(eCFieldElementMultiply3));
                ECFieldElement eCFieldElementE4 = e(eCFieldElementMultiply3.square());
                if (!eCFieldElementE.isZero()) {
                    eCFieldElementD = eCFieldElementD.add(eCFieldElementE);
                    eCFieldElementE = e(eCFieldElementE4.multiply(eCFieldElementE));
                }
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementD.square().subtract(e(eCFieldElementE3));
                eCFieldElementSubtract = eCFieldElementD.multiply(eCFieldElementE3.subtract(eCFieldElementSubtract2)).subtract(eCFieldElementE4);
                eCFieldElementFromBigInteger = eCFieldElementFromBigInteger.isOne() ? eCFieldElementE2 : eCFieldElementE2.multiply(eCFieldElementFromBigInteger);
                i11++;
                eCFieldElement2 = eCFieldElementSubtract2;
            }
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementInvert = eCFieldElementFromBigInteger.invert();
                ECFieldElement eCFieldElementSquare2 = eCFieldElementInvert.square();
                return new Fp(curve, eCFieldElement2.multiply(eCFieldElementSquare2), eCFieldElementSubtract.multiply(eCFieldElementSquare2.multiply(eCFieldElementInvert)), this.f25035e);
            }
            if (coordinateSystem == 1) {
                return new Fp(curve, eCFieldElement2.multiply(eCFieldElementFromBigInteger), eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger.multiply(eCFieldElementFromBigInteger.square())}, this.f25035e);
            }
            if (coordinateSystem == 2) {
                return new Fp(curve, eCFieldElement2, eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger}, this.f25035e);
            }
            if (coordinateSystem == 4) {
                return new Fp(curve, eCFieldElement2, eCFieldElementSubtract, new ECFieldElement[]{eCFieldElementFromBigInteger, eCFieldElementE}, this.f25035e);
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        @Override // bc.org.bouncycastle.math.ec.ECPoint
        public ECPoint twice() {
            ECFieldElement eCFieldElementSubtract;
            ECFieldElement eCFieldElementC;
            if (isInfinity()) {
                return this;
            }
            ECCurve curve = getCurve();
            ECFieldElement eCFieldElement = this.f25033c;
            if (eCFieldElement.isZero()) {
                return curve.getInfinity();
            }
            int coordinateSystem = curve.getCoordinateSystem();
            ECFieldElement eCFieldElement2 = this.f25032b;
            if (coordinateSystem == 0) {
                ECFieldElement eCFieldElementDivide = d(eCFieldElement2.square()).add(getCurve().getA()).divide(e(eCFieldElement));
                ECFieldElement eCFieldElementSubtract2 = eCFieldElementDivide.square().subtract(e(eCFieldElement2));
                return new Fp(curve, eCFieldElementSubtract2, eCFieldElementDivide.multiply(eCFieldElement2.subtract(eCFieldElementSubtract2)).subtract(eCFieldElement), this.f25035e);
            }
            if (coordinateSystem == 1) {
                ECFieldElement eCFieldElement3 = this.f25034d[0];
                boolean zIsOne = eCFieldElement3.isOne();
                ECFieldElement a10 = curve.getA();
                if (!a10.isZero() && !zIsOne) {
                    a10 = a10.multiply(eCFieldElement3.square());
                }
                ECFieldElement eCFieldElementAdd = a10.add(d(eCFieldElement2.square()));
                ECFieldElement eCFieldElementMultiply = zIsOne ? eCFieldElement : eCFieldElement.multiply(eCFieldElement3);
                ECFieldElement eCFieldElementSquare = zIsOne ? eCFieldElement.square() : eCFieldElementMultiply.multiply(eCFieldElement);
                ECFieldElement eCFieldElementC2 = c(eCFieldElement2.multiply(eCFieldElementSquare));
                ECFieldElement eCFieldElementSubtract3 = eCFieldElementAdd.square().subtract(e(eCFieldElementC2));
                ECFieldElement eCFieldElementE = e(eCFieldElementMultiply);
                ECFieldElement eCFieldElementMultiply2 = eCFieldElementSubtract3.multiply(eCFieldElementE);
                ECFieldElement eCFieldElementE2 = e(eCFieldElementSquare);
                return new Fp(curve, eCFieldElementMultiply2, eCFieldElementC2.subtract(eCFieldElementSubtract3).multiply(eCFieldElementAdd).subtract(e(eCFieldElementE2.square())), new ECFieldElement[]{e(zIsOne ? e(eCFieldElementE2) : eCFieldElementE.square()).multiply(eCFieldElementMultiply)}, this.f25035e);
            }
            if (coordinateSystem != 2) {
                if (coordinateSystem == 4) {
                    return a(true);
                }
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECFieldElement eCFieldElement4 = this.f25034d[0];
            boolean zIsOne2 = eCFieldElement4.isOne();
            ECFieldElement eCFieldElementSquare2 = eCFieldElement.square();
            ECFieldElement eCFieldElementSquare3 = eCFieldElementSquare2.square();
            ECFieldElement a11 = curve.getA();
            ECFieldElement eCFieldElementNegate = a11.negate();
            if (eCFieldElementNegate.toBigInteger().equals(BigInteger.valueOf(3L))) {
                ECFieldElement eCFieldElementSquare4 = zIsOne2 ? eCFieldElement4 : eCFieldElement4.square();
                eCFieldElementSubtract = d(eCFieldElement2.add(eCFieldElementSquare4).multiply(eCFieldElement2.subtract(eCFieldElementSquare4)));
                eCFieldElementC = c(eCFieldElementSquare2.multiply(eCFieldElement2));
            } else {
                ECFieldElement eCFieldElementD = d(eCFieldElement2.square());
                if (zIsOne2) {
                    eCFieldElementSubtract = eCFieldElementD.add(a11);
                } else if (a11.isZero()) {
                    eCFieldElementSubtract = eCFieldElementD;
                } else {
                    ECFieldElement eCFieldElementSquare5 = eCFieldElement4.square().square();
                    eCFieldElementSubtract = eCFieldElementNegate.bitLength() < a11.bitLength() ? eCFieldElementD.subtract(eCFieldElementSquare5.multiply(eCFieldElementNegate)) : eCFieldElementD.add(eCFieldElementSquare5.multiply(a11));
                }
                eCFieldElementC = c(eCFieldElement2.multiply(eCFieldElementSquare2));
            }
            ECFieldElement eCFieldElementSubtract4 = eCFieldElementSubtract.square().subtract(e(eCFieldElementC));
            ECFieldElement eCFieldElementSubtract5 = eCFieldElementC.subtract(eCFieldElementSubtract4).multiply(eCFieldElementSubtract).subtract(b(eCFieldElementSquare3));
            ECFieldElement eCFieldElementE3 = e(eCFieldElement);
            if (!zIsOne2) {
                eCFieldElementE3 = eCFieldElementE3.multiply(eCFieldElement4);
            }
            return new Fp(curve, eCFieldElementSubtract4, eCFieldElementSubtract5, new ECFieldElement[]{eCFieldElementE3}, this.f25035e);
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
            ECFieldElement eCFieldElement = this.f25033c;
            if (eCFieldElement.isZero()) {
                return eCPoint;
            }
            ECCurve curve = getCurve();
            int coordinateSystem = curve.getCoordinateSystem();
            if (coordinateSystem != 0) {
                return coordinateSystem != 4 ? twice().add(eCPoint) : a(false).add(eCPoint);
            }
            ECFieldElement eCFieldElement2 = this.f25032b;
            ECFieldElement eCFieldElement3 = eCPoint.f25032b;
            ECFieldElement eCFieldElement4 = eCPoint.f25033c;
            ECFieldElement eCFieldElementSubtract = eCFieldElement3.subtract(eCFieldElement2);
            ECFieldElement eCFieldElementSubtract2 = eCFieldElement4.subtract(eCFieldElement);
            if (eCFieldElementSubtract.isZero()) {
                return eCFieldElementSubtract2.isZero() ? threeTimes() : this;
            }
            ECFieldElement eCFieldElementSquare = eCFieldElementSubtract.square();
            ECFieldElement eCFieldElementSubtract3 = eCFieldElementSquare.multiply(e(eCFieldElement2).add(eCFieldElement3)).subtract(eCFieldElementSubtract2.square());
            if (eCFieldElementSubtract3.isZero()) {
                return curve.getInfinity();
            }
            ECFieldElement eCFieldElementInvert = eCFieldElementSubtract3.multiply(eCFieldElementSubtract).invert();
            ECFieldElement eCFieldElementMultiply = eCFieldElementSubtract3.multiply(eCFieldElementInvert).multiply(eCFieldElementSubtract2);
            ECFieldElement eCFieldElementSubtract4 = e(eCFieldElement).multiply(eCFieldElementSquare).multiply(eCFieldElementSubtract).multiply(eCFieldElementInvert).subtract(eCFieldElementMultiply);
            ECFieldElement eCFieldElementAdd = eCFieldElementSubtract4.subtract(eCFieldElementMultiply).multiply(eCFieldElementMultiply.add(eCFieldElementSubtract4)).add(eCFieldElement3);
            return new Fp(curve, eCFieldElementAdd, eCFieldElement2.subtract(eCFieldElementAdd).multiply(eCFieldElementSubtract4).subtract(eCFieldElement), this.f25035e);
        }

        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
            super(eCCurve, eCFieldElement, eCFieldElement2);
            if ((eCFieldElement == null) != (eCFieldElement2 == null)) {
                throw new IllegalArgumentException("Exactly one of the field elements is null");
            }
            this.f25035e = z10;
        }

        public ECFieldElement b(ECFieldElement eCFieldElement) {
            return c(e(eCFieldElement));
        }

        public ECFieldElement b(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            ECFieldElement a10 = getCurve().getA();
            if (a10.isZero() || eCFieldElement.isOne()) {
                return a10;
            }
            if (eCFieldElement2 == null) {
                eCFieldElement2 = eCFieldElement.square();
            }
            ECFieldElement eCFieldElementSquare = eCFieldElement2.square();
            ECFieldElement eCFieldElementNegate = a10.negate();
            if (eCFieldElementNegate.bitLength() < a10.bitLength()) {
                return eCFieldElementSquare.multiply(eCFieldElementNegate).negate();
            }
            return eCFieldElementSquare.multiply(a10);
        }

        public Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
            super(eCCurve, eCFieldElement, eCFieldElement2, eCFieldElementArr);
            this.f25035e = z10;
        }
    }

    public ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        this(eCCurve, eCFieldElement, eCFieldElement2, a(eCCurve));
    }

    public static ECFieldElement[] a(ECCurve eCCurve) {
        int coordinateSystem = eCCurve == null ? 0 : eCCurve.getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            return f25030g;
        }
        ECFieldElement eCFieldElementFromBigInteger = eCCurve.fromBigInteger(ECConstants.ONE);
        if (coordinateSystem != 1 && coordinateSystem != 2) {
            if (coordinateSystem == 3) {
                return new ECFieldElement[]{eCFieldElementFromBigInteger, eCFieldElementFromBigInteger, eCFieldElementFromBigInteger};
            }
            if (coordinateSystem == 4) {
                return new ECFieldElement[]{eCFieldElementFromBigInteger, eCCurve.getA()};
            }
            if (coordinateSystem != 6) {
                throw new IllegalArgumentException("unknown coordinate system");
            }
        }
        return new ECFieldElement[]{eCFieldElementFromBigInteger};
    }

    public abstract ECPoint add(ECPoint eCPoint);

    public abstract ECPoint b();

    public abstract boolean c();

    public int d() {
        ECCurve eCCurve = this.f25031a;
        if (eCCurve == null) {
            return 0;
        }
        return eCCurve.getCoordinateSystem();
    }

    public final ECFieldElement[] e() {
        return this.f25034d;
    }

    public boolean equals(ECPoint eCPoint) {
        ECPoint eCPointNormalize;
        if (eCPoint == null) {
            return false;
        }
        ECCurve curve = getCurve();
        ECCurve curve2 = eCPoint.getCurve();
        boolean z10 = curve == null;
        boolean z11 = curve2 == null;
        boolean zIsInfinity = isInfinity();
        boolean zIsInfinity2 = eCPoint.isInfinity();
        if (zIsInfinity || zIsInfinity2) {
            if (zIsInfinity && zIsInfinity2) {
                return z10 || z11 || curve.equals(curve2);
            }
            return false;
        }
        if (z10 && z11) {
            eCPointNormalize = this;
        } else if (z10) {
            eCPoint = eCPoint.normalize();
            eCPointNormalize = this;
        } else if (z11) {
            eCPointNormalize = normalize();
        } else {
            if (!curve.equals(curve2)) {
                return false;
            }
            ECPoint[] eCPointArr = {this, curve.importPoint(eCPoint)};
            curve.normalizeAll(eCPointArr);
            eCPointNormalize = eCPointArr[0];
            eCPoint = eCPointArr[1];
        }
        return eCPointNormalize.getXCoord().equals(eCPoint.getXCoord()) && eCPointNormalize.getYCoord().equals(eCPoint.getYCoord());
    }

    public boolean f() {
        BigInteger cofactor = this.f25031a.getCofactor();
        return cofactor == null || cofactor.equals(ECConstants.ONE) || !ECAlgorithms.referenceMultiply(this, cofactor).isInfinity();
    }

    public abstract boolean g();

    public ECFieldElement getAffineXCoord() {
        a();
        return getXCoord();
    }

    public ECFieldElement getAffineYCoord() {
        a();
        return getYCoord();
    }

    public ECCurve getCurve() {
        return this.f25031a;
    }

    public final ECPoint getDetachedPoint() {
        return normalize().b();
    }

    public byte[] getEncoded() {
        return getEncoded(this.f25035e);
    }

    public final ECFieldElement getRawXCoord() {
        return this.f25032b;
    }

    public final ECFieldElement getRawYCoord() {
        return this.f25033c;
    }

    public ECFieldElement getX() {
        return normalize().getXCoord();
    }

    public ECFieldElement getXCoord() {
        return this.f25032b;
    }

    public ECFieldElement getY() {
        return normalize().getYCoord();
    }

    public ECFieldElement getYCoord() {
        return this.f25033c;
    }

    public ECFieldElement getZCoord(int i10) {
        if (i10 >= 0) {
            ECFieldElement[] eCFieldElementArr = this.f25034d;
            if (i10 < eCFieldElementArr.length) {
                return eCFieldElementArr[i10];
            }
        }
        return null;
    }

    public ECFieldElement[] getZCoords() {
        ECFieldElement[] eCFieldElementArr = this.f25034d;
        int length = eCFieldElementArr.length;
        if (length == 0) {
            return f25030g;
        }
        ECFieldElement[] eCFieldElementArr2 = new ECFieldElement[length];
        System.arraycopy(eCFieldElementArr, 0, eCFieldElementArr2, 0, length);
        return eCFieldElementArr2;
    }

    public int hashCode() {
        ECCurve curve = getCurve();
        int i10 = curve == null ? 0 : ~curve.hashCode();
        if (isInfinity()) {
            return i10;
        }
        ECPoint eCPointNormalize = normalize();
        return (i10 ^ (eCPointNormalize.getXCoord().hashCode() * 17)) ^ (eCPointNormalize.getYCoord().hashCode() * 257);
    }

    public boolean isCompressed() {
        return this.f25035e;
    }

    public boolean isInfinity() {
        if (this.f25032b != null && this.f25033c != null) {
            ECFieldElement[] eCFieldElementArr = this.f25034d;
            if (eCFieldElementArr.length <= 0 || !eCFieldElementArr[0].isZero()) {
                return false;
            }
        }
        return true;
    }

    public boolean isNormalized() {
        int iD = d();
        return iD == 0 || iD == 5 || isInfinity() || this.f25034d[0].isOne();
    }

    public boolean isValid() {
        return isInfinity() || getCurve() == null || (g() && f());
    }

    public ECPoint multiply(BigInteger bigInteger) {
        return getCurve().getMultiplier().multiply(this, bigInteger);
    }

    public abstract ECPoint negate();

    public ECPoint normalize() {
        int iD;
        if (isInfinity() || (iD = d()) == 0 || iD == 5) {
            return this;
        }
        ECFieldElement zCoord = getZCoord(0);
        return zCoord.isOne() ? this : a(zCoord.invert());
    }

    public ECPoint scaleX(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().a(getRawXCoord().multiply(eCFieldElement), getRawYCoord(), e(), this.f25035e);
    }

    public ECPoint scaleY(ECFieldElement eCFieldElement) {
        return isInfinity() ? this : getCurve().a(getRawXCoord(), getRawYCoord().multiply(eCFieldElement), e(), this.f25035e);
    }

    public abstract ECPoint subtract(ECPoint eCPoint);

    public ECPoint threeTimes() {
        return twicePlus(this);
    }

    public ECPoint timesPow2(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("'e' cannot be negative");
        }
        ECPoint eCPointTwice = this;
        while (true) {
            i10--;
            if (i10 < 0) {
                return eCPointTwice;
            }
            eCPointTwice = eCPointTwice.twice();
        }
    }

    public String toString() {
        if (isInfinity()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(getRawXCoord());
        stringBuffer.append(AbstractJsonLexerKt.COMMA);
        stringBuffer.append(getRawYCoord());
        for (int i10 = 0; i10 < this.f25034d.length; i10++) {
            stringBuffer.append(AbstractJsonLexerKt.COMMA);
            stringBuffer.append(this.f25034d[i10]);
        }
        stringBuffer.append(RootService.CLOSE_BRACKET);
        return stringBuffer.toString();
    }

    public abstract ECPoint twice();

    public ECPoint twicePlus(ECPoint eCPoint) {
        return twice().add(eCPoint);
    }

    public ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        this.f25036f = null;
        this.f25031a = eCCurve;
        this.f25032b = eCFieldElement;
        this.f25033c = eCFieldElement2;
        this.f25034d = eCFieldElementArr;
    }

    public byte[] getEncoded(boolean z10) {
        if (isInfinity()) {
            return new byte[1];
        }
        ECPoint eCPointNormalize = normalize();
        byte[] encoded = eCPointNormalize.getXCoord().getEncoded();
        if (z10) {
            byte[] bArr = new byte[encoded.length + 1];
            bArr[0] = (byte) (eCPointNormalize.c() ? 3 : 2);
            System.arraycopy(encoded, 0, bArr, 1, encoded.length);
            return bArr;
        }
        byte[] encoded2 = eCPointNormalize.getYCoord().getEncoded();
        byte[] bArr2 = new byte[encoded.length + encoded2.length + 1];
        bArr2[0] = 4;
        System.arraycopy(encoded, 0, bArr2, 1, encoded.length);
        System.arraycopy(encoded2, 0, bArr2, encoded.length + 1, encoded2.length);
        return bArr2;
    }

    public void a() {
        if (!isNormalized()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public final ECPoint a(ECFieldElement eCFieldElement) {
        int iD = d();
        if (iD != 1) {
            if (iD == 2 || iD == 3 || iD == 4) {
                ECFieldElement eCFieldElementSquare = eCFieldElement.square();
                return a(eCFieldElementSquare, eCFieldElementSquare.multiply(eCFieldElement));
            }
            if (iD != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return a(eCFieldElement, eCFieldElement);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ECPoint) {
            return equals((ECPoint) obj);
        }
        return false;
    }

    public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return getCurve().a(getRawXCoord().multiply(eCFieldElement), getRawYCoord().multiply(eCFieldElement2), this.f25035e);
    }
}
