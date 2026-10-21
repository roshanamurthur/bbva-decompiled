package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecP224R1FieldElement extends ECFieldElement.AbstractFp {
    public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int[] f90720x;

    public SecP224R1FieldElement() {
        this.f90720x = Nat224.create();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.add(this.f90720x, ((SecP224R1FieldElement) eCFieldElement).f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.addOne(this.f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224R1Field.f90717a, ((SecP224R1FieldElement) eCFieldElement).f90720x, iArrCreate);
        SecP224R1Field.multiply(iArrCreate, this.f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224R1FieldElement) {
            return Nat224.eq(this.f90720x, ((SecP224R1FieldElement) obj).f90720x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP224R1Field";
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f90720x, 0, 7);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrCreate = Nat224.create();
        Mod.invert(SecP224R1Field.f90717a, this.f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return Nat224.isOne(this.f90720x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return Nat224.isZero(this.f90720x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.multiply(this.f90720x, ((SecP224R1FieldElement) eCFieldElement).f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.negate(this.f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int i10;
        int[] iArrCreate;
        int[] iArrCreate2;
        int[] iArr = this.f90720x;
        if (Nat224.isZero(iArr) || Nat224.isOne(iArr)) {
            return this;
        }
        int[] iArrCreate3 = Nat224.create();
        SecP224R1Field.negate(iArr, iArrCreate3);
        int[] iArr2 = SecP224R1Field.f90717a;
        int[] iArrRandom = Mod.random(iArr2);
        int[] iArrCreate4 = Nat224.create();
        int[] iArrCreate5 = Nat224.create();
        int[] iArrCreate6 = Nat224.create();
        Nat224.copy(iArr, iArrCreate5);
        int i11 = 0;
        while (true) {
            i10 = 1;
            if (i11 >= 7) {
                break;
            }
            Nat224.copy(iArrCreate5, iArrCreate6);
            SecP224R1Field.squareN(iArrCreate5, 1 << i11, iArrCreate5);
            SecP224R1Field.multiply(iArrCreate5, iArrCreate6, iArrCreate5);
            i11++;
        }
        SecP224R1Field.squareN(iArrCreate5, 95, iArrCreate5);
        if (!Nat224.isOne(iArrCreate5)) {
            return null;
        }
        loop1: while (true) {
            int[] iArrCreate7 = Nat224.create();
            Nat224.copy(iArrRandom, iArrCreate7);
            int[] iArrCreate8 = Nat224.create();
            iArrCreate8[0] = i10;
            int[] iArrCreate9 = Nat224.create();
            Nat224.copy(iArrCreate3, iArrCreate9);
            int[] iArrCreate10 = Nat224.create();
            int[] iArrCreate11 = Nat224.create();
            int i12 = 0;
            while (i12 < 7) {
                Nat224.copy(iArrCreate7, iArrCreate10);
                Nat224.copy(iArrCreate8, iArrCreate11);
                int i13 = i10 << i12;
                while (true) {
                    i13--;
                    if (i13 >= 0) {
                        SecP224R1Field.multiply(iArrCreate8, iArrCreate7, iArrCreate8);
                        SecP224R1Field.twice(iArrCreate8, iArrCreate8);
                        SecP224R1Field.square(iArrCreate7, iArrCreate4);
                        SecP224R1Field.add(iArrCreate9, iArrCreate4, iArrCreate7);
                        SecP224R1Field.multiply(iArrCreate9, iArrCreate4, iArrCreate9);
                        SecP224R1Field.reduce32(Nat.shiftUpBits(7, iArrCreate9, 2, 0), iArrCreate9);
                    }
                }
                SecP224R1Field.multiply(iArrCreate8, iArrCreate11, iArrCreate4);
                SecP224R1Field.multiply(iArrCreate4, iArrCreate3, iArrCreate4);
                SecP224R1Field.multiply(iArrCreate7, iArrCreate10, iArrCreate9);
                SecP224R1Field.add(iArrCreate9, iArrCreate4, iArrCreate9);
                SecP224R1Field.multiply(iArrCreate7, iArrCreate11, iArrCreate4);
                Nat224.copy(iArrCreate9, iArrCreate7);
                SecP224R1Field.multiply(iArrCreate8, iArrCreate10, iArrCreate8);
                SecP224R1Field.add(iArrCreate8, iArrCreate4, iArrCreate8);
                SecP224R1Field.square(iArrCreate8, iArrCreate9);
                SecP224R1Field.multiply(iArrCreate9, iArrCreate3, iArrCreate9);
                i12++;
                i10 = 1;
            }
            iArrCreate = Nat224.create();
            iArrCreate2 = Nat224.create();
            for (int i14 = 1; i14 < 96; i14++) {
                Nat224.copy(iArrCreate7, iArrCreate);
                Nat224.copy(iArrCreate8, iArrCreate2);
                SecP224R1Field.multiply(iArrCreate8, iArrCreate7, iArrCreate8);
                SecP224R1Field.twice(iArrCreate8, iArrCreate8);
                SecP224R1Field.square(iArrCreate7, iArrCreate4);
                SecP224R1Field.add(iArrCreate9, iArrCreate4, iArrCreate7);
                SecP224R1Field.multiply(iArrCreate9, iArrCreate4, iArrCreate9);
                SecP224R1Field.reduce32(Nat.shiftUpBits(7, iArrCreate9, 2, 0), iArrCreate9);
                if (Nat224.isZero(iArrCreate7)) {
                    break loop1;
                }
            }
            SecP224R1Field.addOne(iArrRandom, iArrRandom);
            i10 = 1;
        }
        Mod.invert(iArr2, iArrCreate2, iArrCreate4);
        SecP224R1Field.multiply(iArrCreate4, iArrCreate, iArrCreate4);
        SecP224R1Field.square(iArrCreate4, iArrRandom);
        if (Nat224.eq(iArr, iArrRandom)) {
            return new SecP224R1FieldElement(iArrCreate4);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.square(this.f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrCreate = Nat224.create();
        SecP224R1Field.subtract(this.f90720x, ((SecP224R1FieldElement) eCFieldElement).f90720x, iArrCreate);
        return new SecP224R1FieldElement(iArrCreate);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return Nat224.getBit(this.f90720x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return Nat224.toBigInteger(this.f90720x);
    }

    public SecP224R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f90720x = SecP224R1Field.fromBigInteger(bigInteger);
    }

    public SecP224R1FieldElement(int[] iArr) {
        this.f90720x = iArr;
    }
}
