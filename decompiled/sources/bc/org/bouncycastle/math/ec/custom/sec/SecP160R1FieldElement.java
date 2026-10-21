package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP160R1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP160R1Curve.f25078q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25083a;

    public SecP160R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f25083a = SecP160R1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        SecP160R1Field.add(this.f25083a, ((SecP160R1FieldElement) eCFieldElement).f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = v3.a();
        SecP160R1Field.addOne(this.f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        q3.a(SecP160R1Field.f25080a, ((SecP160R1FieldElement) eCFieldElement).f25083a, iArrA);
        SecP160R1Field.multiply(iArrA, this.f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R1FieldElement) {
            return v3.a(this.f25083a, ((SecP160R1FieldElement) obj).f25083a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25083a, 0, 5);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = v3.a();
        q3.a(SecP160R1Field.f25080a, this.f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return v3.a(this.f25083a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return v3.b(this.f25083a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        SecP160R1Field.multiply(this.f25083a, ((SecP160R1FieldElement) eCFieldElement).f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = v3.a();
        SecP160R1Field.negate(this.f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25083a;
        if (v3.b(iArr) || v3.a(iArr)) {
            return this;
        }
        int[] iArrA = v3.a();
        SecP160R1Field.square(iArr, iArrA);
        SecP160R1Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = v3.a();
        SecP160R1Field.squareN(iArrA, 2, iArrA2);
        SecP160R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP160R1Field.squareN(iArrA2, 4, iArrA);
        SecP160R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP160R1Field.squareN(iArrA, 8, iArrA2);
        SecP160R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP160R1Field.squareN(iArrA2, 16, iArrA);
        SecP160R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP160R1Field.squareN(iArrA, 32, iArrA2);
        SecP160R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP160R1Field.squareN(iArrA2, 64, iArrA);
        SecP160R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP160R1Field.square(iArrA, iArrA2);
        SecP160R1Field.multiply(iArrA2, iArr, iArrA2);
        SecP160R1Field.squareN(iArrA2, 29, iArrA2);
        SecP160R1Field.square(iArrA2, iArrA);
        if (v3.a(iArr, iArrA)) {
            return new SecP160R1FieldElement(iArrA2);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = v3.a();
        SecP160R1Field.square(this.f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        SecP160R1Field.subtract(this.f25083a, ((SecP160R1FieldElement) eCFieldElement).f25083a, iArrA);
        return new SecP160R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return v3.a(this.f25083a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return v3.c(this.f25083a);
    }

    public SecP160R1FieldElement() {
        this.f25083a = v3.a();
    }

    public SecP160R1FieldElement(int[] iArr) {
        this.f25083a = iArr;
    }
}
