package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat320;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class SecT283FieldElement extends ECFieldElement.AbstractF2m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected long[] f90811x;

    public SecT283FieldElement() {
        this.f90811x = Nat320.create64();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.add(this.f90811x, ((SecT283FieldElement) eCFieldElement).f90811x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.addOne(this.f90811x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT283FieldElement) {
            return Nat320.eq64(this.f90811x, ((SecT283FieldElement) obj).f90811x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT283Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 283;
    }

    public int getK1() {
        return 5;
    }

    public int getK2() {
        return 7;
    }

    public int getK3() {
        return 12;
    }

    public int getM() {
        return 283;
    }

    public int getRepresentation() {
        return 3;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public ECFieldElement halfTrace() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.halfTrace(this.f90811x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public boolean hasFastTrace() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f90811x, 0, 5) ^ 2831275;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.invert(this.f90811x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat320.isOne64(this.f90811x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat320.isZero64(this.f90811x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.multiply(this.f90811x, ((SecT283FieldElement) eCFieldElement).f90811x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f90811x;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f90811x;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f90811x;
        long[] jArr4 = ((SecT283FieldElement) eCFieldElement3).f90811x;
        long[] jArrCreate64 = Nat.create64(9);
        SecT283Field.multiplyAddToExt(jArr, jArr2, jArrCreate64);
        SecT283Field.multiplyAddToExt(jArr3, jArr4, jArrCreate64);
        long[] jArrCreate65 = Nat320.create64();
        SecT283Field.reduce(jArrCreate64, jArrCreate65);
        return new SecT283FieldElement(jArrCreate65);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.sqrt(this.f90811x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.square(this.f90811x, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f90811x;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f90811x;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f90811x;
        long[] jArrCreate64 = Nat.create64(9);
        SecT283Field.squareAddToExt(jArr, jArrCreate64);
        SecT283Field.multiplyAddToExt(jArr2, jArr3, jArrCreate64);
        long[] jArrCreate65 = Nat320.create64();
        SecT283Field.reduce(jArrCreate64, jArrCreate65);
        return new SecT283FieldElement(jArrCreate65);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrCreate64 = Nat320.create64();
        SecT283Field.squareN(this.f90811x, i10, jArrCreate64);
        return new SecT283FieldElement(jArrCreate64);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f90811x[0] & 1) != 0;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat320.toBigInteger64(this.f90811x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement.AbstractF2m
    public int trace() {
        return SecT283Field.trace(this.f90811x);
    }

    public SecT283FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f90811x = SecT283Field.fromBigInteger(bigInteger);
    }

    public SecT283FieldElement(long[] jArr) {
        this.f90811x = jArr;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
