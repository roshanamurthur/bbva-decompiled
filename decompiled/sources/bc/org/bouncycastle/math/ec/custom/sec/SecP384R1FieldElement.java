package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP384R1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP384R1Curve.f25126q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25131a;

    public SecP384R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f25131a = SecP384R1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(12);
        SecP384R1Field.add(this.f25131a, ((SecP384R1FieldElement) eCFieldElement).f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = e4.a(12);
        SecP384R1Field.addOne(this.f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(12);
        q3.a(SecP384R1Field.f25128a, ((SecP384R1FieldElement) eCFieldElement).f25131a, iArrA);
        SecP384R1Field.multiply(iArrA, this.f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP384R1FieldElement) {
            return e4.b(12, this.f25131a, ((SecP384R1FieldElement) obj).f25131a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP384R1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25131a, 0, 12);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = e4.a(12);
        q3.a(SecP384R1Field.f25128a, this.f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return e4.d(12, this.f25131a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return e4.e(12, this.f25131a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(12);
        SecP384R1Field.multiply(this.f25131a, ((SecP384R1FieldElement) eCFieldElement).f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = e4.a(12);
        SecP384R1Field.negate(this.f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25131a;
        if (e4.e(12, iArr) || e4.d(12, iArr)) {
            return this;
        }
        int[] iArrA = e4.a(12);
        int[] iArrA2 = e4.a(12);
        int[] iArrA3 = e4.a(12);
        int[] iArrA4 = e4.a(12);
        SecP384R1Field.square(iArr, iArrA);
        SecP384R1Field.multiply(iArrA, iArr, iArrA);
        SecP384R1Field.squareN(iArrA, 2, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP384R1Field.square(iArrA2, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArr, iArrA2);
        SecP384R1Field.squareN(iArrA2, 5, iArrA3);
        SecP384R1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP384R1Field.squareN(iArrA3, 5, iArrA4);
        SecP384R1Field.multiply(iArrA4, iArrA2, iArrA4);
        SecP384R1Field.squareN(iArrA4, 15, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArrA4, iArrA2);
        SecP384R1Field.squareN(iArrA2, 2, iArrA3);
        SecP384R1Field.multiply(iArrA, iArrA3, iArrA);
        SecP384R1Field.squareN(iArrA3, 28, iArrA3);
        SecP384R1Field.multiply(iArrA2, iArrA3, iArrA2);
        SecP384R1Field.squareN(iArrA2, 60, iArrA3);
        SecP384R1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP384R1Field.squareN(iArrA3, 120, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArrA3, iArrA2);
        SecP384R1Field.squareN(iArrA2, 15, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArrA4, iArrA2);
        SecP384R1Field.squareN(iArrA2, 33, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP384R1Field.squareN(iArrA2, 64, iArrA2);
        SecP384R1Field.multiply(iArrA2, iArr, iArrA2);
        SecP384R1Field.squareN(iArrA2, 30, iArrA);
        SecP384R1Field.square(iArrA, iArrA2);
        if (e4.b(12, iArr, iArrA2)) {
            return new SecP384R1FieldElement(iArrA);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = e4.a(12);
        SecP384R1Field.square(this.f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(12);
        SecP384R1Field.subtract(this.f25131a, ((SecP384R1FieldElement) eCFieldElement).f25131a, iArrA);
        return new SecP384R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return e4.a(this.f25131a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return e4.f(12, this.f25131a);
    }

    public SecP384R1FieldElement() {
        this.f25131a = e4.a(12);
    }

    public SecP384R1FieldElement(int[] iArr) {
        this.f25131a = iArr;
    }
}
