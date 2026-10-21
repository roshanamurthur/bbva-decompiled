package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecP160R1FieldElement extends ECFieldElement.AbstractFp {
    public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int[] f90674x;

    public SecP160R1FieldElement() {
        this.f90674x = Nat160.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.add(this.f90674x, ((SecP160R1FieldElement) eCFieldElement).f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.addOne(this.f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R1Field.f90671a, ((SecP160R1FieldElement) eCFieldElement).f90674x, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, this.f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R1FieldElement) {
            return Nat160.eq(this.f90674x, ((SecP160R1FieldElement) obj).f90674x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R1Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f90674x, 0, 5);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat160.create();
        Mod.invert(SecP160R1Field.f90671a, this.f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat160.isOne(this.f90674x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat160.isZero(this.f90674x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.multiply(this.f90674x, ((SecP160R1FieldElement) eCFieldElement).f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.negate(this.f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f90674x;
        if (Nat160.isZero(iArr) || Nat160.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.square(iArr, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArr, iArrCreate);
        int[] iArrCreate2 = Nat160.create();
        SecP160R1Field.squareN(iArrCreate, 2, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 4, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.squareN(iArrCreate, 8, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 16, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.squareN(iArrCreate, 32, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArrCreate, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 64, iArrCreate);
        SecP160R1Field.multiply(iArrCreate, iArrCreate2, iArrCreate);
        SecP160R1Field.square(iArrCreate, iArrCreate2);
        SecP160R1Field.multiply(iArrCreate2, iArr, iArrCreate2);
        SecP160R1Field.squareN(iArrCreate2, 29, iArrCreate2);
        SecP160R1Field.square(iArrCreate2, iArrCreate);
        if (Nat160.eq(iArr, iArrCreate)) {
            return new SecP160R1FieldElement(iArrCreate2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.square(this.f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat160.create();
        SecP160R1Field.subtract(this.f90674x, ((SecP160R1FieldElement) eCFieldElement).f90674x, iArrCreate);
        return new SecP160R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat160.getBit(this.f90674x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat160.toBigInteger(this.f90674x);
    }

    public SecP160R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f90674x = SecP160R1Field.fromBigInteger(bigInteger);
    }

    public SecP160R1FieldElement(int[] iArr) {
        this.f90674x = iArr;
    }
}
