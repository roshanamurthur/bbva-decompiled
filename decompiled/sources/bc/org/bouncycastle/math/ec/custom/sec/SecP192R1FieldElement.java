package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP192R1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP192R1Curve.f25096q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25101a;

    public SecP192R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f25101a = SecP192R1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        SecP192R1Field.add(this.f25101a, ((SecP192R1FieldElement) eCFieldElement).f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = w3.a();
        SecP192R1Field.addOne(this.f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        q3.a(SecP192R1Field.f25098a, ((SecP192R1FieldElement) eCFieldElement).f25101a, iArrA);
        SecP192R1Field.multiply(iArrA, this.f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192R1FieldElement) {
            return w3.a(this.f25101a, ((SecP192R1FieldElement) obj).f25101a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP192R1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25101a, 0, 6);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = w3.a();
        q3.a(SecP192R1Field.f25098a, this.f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return w3.a(this.f25101a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return w3.b(this.f25101a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        SecP192R1Field.multiply(this.f25101a, ((SecP192R1FieldElement) eCFieldElement).f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = w3.a();
        SecP192R1Field.negate(this.f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25101a;
        if (w3.b(iArr) || w3.a(iArr)) {
            return this;
        }
        int[] iArrA = w3.a();
        int[] iArrA2 = w3.a();
        SecP192R1Field.square(iArr, iArrA);
        SecP192R1Field.multiply(iArrA, iArr, iArrA);
        SecP192R1Field.squareN(iArrA, 2, iArrA2);
        SecP192R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP192R1Field.squareN(iArrA2, 4, iArrA);
        SecP192R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP192R1Field.squareN(iArrA, 8, iArrA2);
        SecP192R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP192R1Field.squareN(iArrA2, 16, iArrA);
        SecP192R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP192R1Field.squareN(iArrA, 32, iArrA2);
        SecP192R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP192R1Field.squareN(iArrA2, 64, iArrA);
        SecP192R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP192R1Field.squareN(iArrA, 62, iArrA);
        SecP192R1Field.square(iArrA, iArrA2);
        if (w3.a(iArr, iArrA2)) {
            return new SecP192R1FieldElement(iArrA);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = w3.a();
        SecP192R1Field.square(this.f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        SecP192R1Field.subtract(this.f25101a, ((SecP192R1FieldElement) eCFieldElement).f25101a, iArrA);
        return new SecP192R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return w3.a(this.f25101a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return w3.c(this.f25101a);
    }

    public SecP192R1FieldElement() {
        this.f25101a = w3.a();
    }

    public SecP192R1FieldElement(int[] iArr) {
        this.f25101a = iArr;
    }
}
