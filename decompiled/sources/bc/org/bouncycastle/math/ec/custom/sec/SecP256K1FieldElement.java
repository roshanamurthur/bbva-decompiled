package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256K1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP256K1Curve.f25115q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25120a;

    public SecP256K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f25120a = SecP256K1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SecP256K1Field.add(this.f25120a, ((SecP256K1FieldElement) eCFieldElement).f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = y3.a();
        SecP256K1Field.addOne(this.f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        q3.a(SecP256K1Field.f25117a, ((SecP256K1FieldElement) eCFieldElement).f25120a, iArrA);
        SecP256K1Field.multiply(iArrA, this.f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP256K1FieldElement) {
            return y3.b(this.f25120a, ((SecP256K1FieldElement) obj).f25120a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP256K1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25120a, 0, 8);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = y3.a();
        q3.a(SecP256K1Field.f25117a, this.f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return y3.a(this.f25120a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return y3.b(this.f25120a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SecP256K1Field.multiply(this.f25120a, ((SecP256K1FieldElement) eCFieldElement).f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = y3.a();
        SecP256K1Field.negate(this.f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25120a;
        if (y3.b(iArr) || y3.a(iArr)) {
            return this;
        }
        int[] iArrA = y3.a();
        SecP256K1Field.square(iArr, iArrA);
        SecP256K1Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = y3.a();
        SecP256K1Field.square(iArrA, iArrA2);
        SecP256K1Field.multiply(iArrA2, iArr, iArrA2);
        int[] iArrA3 = y3.a();
        SecP256K1Field.squareN(iArrA2, 3, iArrA3);
        SecP256K1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP256K1Field.squareN(iArrA3, 3, iArrA3);
        SecP256K1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP256K1Field.squareN(iArrA3, 2, iArrA3);
        SecP256K1Field.multiply(iArrA3, iArrA, iArrA3);
        int[] iArrA4 = y3.a();
        SecP256K1Field.squareN(iArrA3, 11, iArrA4);
        SecP256K1Field.multiply(iArrA4, iArrA3, iArrA4);
        SecP256K1Field.squareN(iArrA4, 22, iArrA3);
        SecP256K1Field.multiply(iArrA3, iArrA4, iArrA3);
        int[] iArrA5 = y3.a();
        SecP256K1Field.squareN(iArrA3, 44, iArrA5);
        SecP256K1Field.multiply(iArrA5, iArrA3, iArrA5);
        int[] iArrA6 = y3.a();
        SecP256K1Field.squareN(iArrA5, 88, iArrA6);
        SecP256K1Field.multiply(iArrA6, iArrA5, iArrA6);
        SecP256K1Field.squareN(iArrA6, 44, iArrA5);
        SecP256K1Field.multiply(iArrA5, iArrA3, iArrA5);
        SecP256K1Field.squareN(iArrA5, 3, iArrA3);
        SecP256K1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP256K1Field.squareN(iArrA3, 23, iArrA3);
        SecP256K1Field.multiply(iArrA3, iArrA4, iArrA3);
        SecP256K1Field.squareN(iArrA3, 6, iArrA3);
        SecP256K1Field.multiply(iArrA3, iArrA, iArrA3);
        SecP256K1Field.squareN(iArrA3, 2, iArrA3);
        SecP256K1Field.square(iArrA3, iArrA);
        if (y3.b(iArr, iArrA)) {
            return new SecP256K1FieldElement(iArrA3);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = y3.a();
        SecP256K1Field.square(this.f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SecP256K1Field.subtract(this.f25120a, ((SecP256K1FieldElement) eCFieldElement).f25120a, iArrA);
        return new SecP256K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return y3.a(this.f25120a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return y3.c(this.f25120a);
    }

    public SecP256K1FieldElement() {
        this.f25120a = y3.a();
    }

    public SecP256K1FieldElement(int[] iArr) {
        this.f25120a = iArr;
    }
}
