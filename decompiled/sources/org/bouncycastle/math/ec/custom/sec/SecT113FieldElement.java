package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class SecT113FieldElement extends ECFieldElement.AbstractF2m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected long[] f90754x;

    public SecT113FieldElement() {
        this.f90754x = Nat128.create64();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.add(this.f90754x, ((SecT113FieldElement) eCFieldElement).f90754x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.addOne(this.f90754x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT113FieldElement) {
            return Nat128.eq64(this.f90754x, ((SecT113FieldElement) obj).f90754x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT113Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 113;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    public int getRepresentation() {
        return 2;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public ECFieldElement halfTrace() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.halfTrace(this.f90754x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f90754x, 0, 2) ^ 113009;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.invert(this.f90754x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat128.isOne64(this.f90754x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat128.isZero64(this.f90754x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.multiply(this.f90754x, ((SecT113FieldElement) eCFieldElement).f90754x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f90754x;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f90754x;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f90754x;
        long[] jArr4 = ((SecT113FieldElement) eCFieldElement3).f90754x;
        long[] jArrCreateExt64 = Nat128.createExt64();
        SecT113Field.multiplyAddToExt(jArr, jArr2, jArrCreateExt64);
        SecT113Field.multiplyAddToExt(jArr3, jArr4, jArrCreateExt64);
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.sqrt(this.f90754x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.square(this.f90754x, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f90754x;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f90754x;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f90754x;
        long[] jArrCreateExt64 = Nat128.createExt64();
        SecT113Field.squareAddToExt(jArr, jArrCreateExt64);
        SecT113Field.multiplyAddToExt(jArr2, jArr3, jArrCreateExt64);
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.reduce(jArrCreateExt64, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat128.create64();
        SecT113Field.squareN(this.f90754x, i10, jArrCreate64);
        return new SecT113FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f90754x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat128.toBigInteger64(this.f90754x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return SecT113Field.trace(this.f90754x);
    }

    public SecT113FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f90754x = SecT113Field.fromBigInteger(bigInteger);
    }

    public SecT113FieldElement(long[] jArr) {
        this.f90754x = jArr;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
