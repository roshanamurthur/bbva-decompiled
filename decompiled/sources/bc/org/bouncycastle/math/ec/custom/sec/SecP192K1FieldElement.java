package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP192K1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP192K1Curve.f25090q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25095a;

    public SecP192K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f25095a = SecP192K1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        SecP192K1Field.add(this.f25095a, ((SecP192K1FieldElement) eCFieldElement).f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = w3.a();
        SecP192K1Field.addOne(this.f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        q3.a(SecP192K1Field.f25092a, ((SecP192K1FieldElement) eCFieldElement).f25095a, iArrA);
        SecP192K1Field.multiply(iArrA, this.f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP192K1FieldElement) {
            return w3.a(this.f25095a, ((SecP192K1FieldElement) obj).f25095a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP192K1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25095a, 0, 6);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = w3.a();
        q3.a(SecP192K1Field.f25092a, this.f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return w3.a(this.f25095a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return w3.b(this.f25095a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        SecP192K1Field.multiply(this.f25095a, ((SecP192K1FieldElement) eCFieldElement).f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = w3.a();
        SecP192K1Field.negate(this.f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25095a;
        if (w3.b(iArr) || w3.a(iArr)) {
            return this;
        }
        int[] iArrA = w3.a();
        SecP192K1Field.square(iArr, iArrA);
        SecP192K1Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = w3.a();
        SecP192K1Field.square(iArrA, iArrA2);
        SecP192K1Field.multiply(iArrA2, iArr, iArrA2);
        int[] iArrA3 = w3.a();
        SecP192K1Field.squareN(iArrA2, 3, iArrA3);
        SecP192K1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP192K1Field.squareN(iArrA3, 2, iArrA3);
        SecP192K1Field.multiply(iArrA3, iArrA, iArrA3);
        SecP192K1Field.squareN(iArrA3, 8, iArrA);
        SecP192K1Field.multiply(iArrA, iArrA3, iArrA);
        SecP192K1Field.squareN(iArrA, 3, iArrA3);
        SecP192K1Field.multiply(iArrA3, iArrA2, iArrA3);
        int[] iArrA4 = w3.a();
        SecP192K1Field.squareN(iArrA3, 16, iArrA4);
        SecP192K1Field.multiply(iArrA4, iArrA, iArrA4);
        SecP192K1Field.squareN(iArrA4, 35, iArrA);
        SecP192K1Field.multiply(iArrA, iArrA4, iArrA);
        SecP192K1Field.squareN(iArrA, 70, iArrA4);
        SecP192K1Field.multiply(iArrA4, iArrA, iArrA4);
        SecP192K1Field.squareN(iArrA4, 19, iArrA);
        SecP192K1Field.multiply(iArrA, iArrA3, iArrA);
        SecP192K1Field.squareN(iArrA, 20, iArrA);
        SecP192K1Field.multiply(iArrA, iArrA3, iArrA);
        SecP192K1Field.squareN(iArrA, 4, iArrA);
        SecP192K1Field.multiply(iArrA, iArrA2, iArrA);
        SecP192K1Field.squareN(iArrA, 6, iArrA);
        SecP192K1Field.multiply(iArrA, iArrA2, iArrA);
        SecP192K1Field.square(iArrA, iArrA);
        SecP192K1Field.square(iArrA, iArrA2);
        if (w3.a(iArr, iArrA2)) {
            return new SecP192K1FieldElement(iArrA);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = w3.a();
        SecP192K1Field.square(this.f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = w3.a();
        SecP192K1Field.subtract(this.f25095a, ((SecP192K1FieldElement) eCFieldElement).f25095a, iArrA);
        return new SecP192K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return w3.a(this.f25095a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return w3.c(this.f25095a);
    }

    public SecP192K1FieldElement() {
        this.f25095a = w3.a();
    }

    public SecP192K1FieldElement(int[] iArr) {
        this.f25095a = iArr;
    }
}
