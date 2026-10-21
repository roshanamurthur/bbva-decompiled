package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256R1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP256R1Curve.f25121q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25125a;

    public SecP256R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f25125a = SecP256R1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SecP256R1Field.add(this.f25125a, ((SecP256R1FieldElement) eCFieldElement).f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = y3.a();
        SecP256R1Field.addOne(this.f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        q3.a(SecP256R1Field.f25123a, ((SecP256R1FieldElement) eCFieldElement).f25125a, iArrA);
        SecP256R1Field.multiply(iArrA, this.f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256R1FieldElement) {
            return y3.b(this.f25125a, ((SecP256R1FieldElement) obj).f25125a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP256R1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25125a, 0, 8);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = y3.a();
        q3.a(SecP256R1Field.f25123a, this.f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return y3.a(this.f25125a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return y3.b(this.f25125a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SecP256R1Field.multiply(this.f25125a, ((SecP256R1FieldElement) eCFieldElement).f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = y3.a();
        SecP256R1Field.negate(this.f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25125a;
        if (y3.b(iArr) || y3.a(iArr)) {
            return this;
        }
        int[] iArrA = y3.a();
        int[] iArrA2 = y3.a();
        SecP256R1Field.square(iArr, iArrA);
        SecP256R1Field.multiply(iArrA, iArr, iArrA);
        SecP256R1Field.squareN(iArrA, 2, iArrA2);
        SecP256R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP256R1Field.squareN(iArrA2, 4, iArrA);
        SecP256R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP256R1Field.squareN(iArrA, 8, iArrA2);
        SecP256R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP256R1Field.squareN(iArrA2, 16, iArrA);
        SecP256R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP256R1Field.squareN(iArrA, 32, iArrA);
        SecP256R1Field.multiply(iArrA, iArr, iArrA);
        SecP256R1Field.squareN(iArrA, 96, iArrA);
        SecP256R1Field.multiply(iArrA, iArr, iArrA);
        SecP256R1Field.squareN(iArrA, 94, iArrA);
        SecP256R1Field.square(iArrA, iArrA2);
        if (y3.b(iArr, iArrA2)) {
            return new SecP256R1FieldElement(iArrA);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = y3.a();
        SecP256R1Field.square(this.f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SecP256R1Field.subtract(this.f25125a, ((SecP256R1FieldElement) eCFieldElement).f25125a, iArrA);
        return new SecP256R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return y3.a(this.f25125a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return y3.c(this.f25125a);
    }

    public SecP256R1FieldElement() {
        this.f25125a = y3.a();
    }

    public SecP256R1FieldElement(int[] iArr) {
        this.f25125a = iArr;
    }
}
