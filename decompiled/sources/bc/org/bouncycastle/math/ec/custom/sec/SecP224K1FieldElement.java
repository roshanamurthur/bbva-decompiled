package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.x3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP224K1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP224K1Curve.f25102q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25107b = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25108a;

    public SecP224K1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f25108a = SecP224K1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        SecP224K1Field.add(this.f25108a, ((SecP224K1FieldElement) eCFieldElement).f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = x3.a();
        SecP224K1Field.addOne(this.f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        q3.a(SecP224K1Field.f25104a, ((SecP224K1FieldElement) eCFieldElement).f25108a, iArrA);
        SecP224K1Field.multiply(iArrA, this.f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224K1FieldElement) {
            return x3.b(this.f25108a, ((SecP224K1FieldElement) obj).f25108a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP224K1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25108a, 0, 7);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = x3.a();
        q3.a(SecP224K1Field.f25104a, this.f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return x3.a(this.f25108a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return x3.b(this.f25108a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        SecP224K1Field.multiply(this.f25108a, ((SecP224K1FieldElement) eCFieldElement).f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = x3.a();
        SecP224K1Field.negate(this.f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25108a;
        if (x3.b(iArr) || x3.a(iArr)) {
            return this;
        }
        int[] iArrA = x3.a();
        SecP224K1Field.square(iArr, iArrA);
        SecP224K1Field.multiply(iArrA, iArr, iArrA);
        SecP224K1Field.square(iArrA, iArrA);
        SecP224K1Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = x3.a();
        SecP224K1Field.square(iArrA, iArrA2);
        SecP224K1Field.multiply(iArrA2, iArr, iArrA2);
        int[] iArrA3 = x3.a();
        SecP224K1Field.squareN(iArrA2, 4, iArrA3);
        SecP224K1Field.multiply(iArrA3, iArrA2, iArrA3);
        int[] iArrA4 = x3.a();
        SecP224K1Field.squareN(iArrA3, 3, iArrA4);
        SecP224K1Field.multiply(iArrA4, iArrA, iArrA4);
        SecP224K1Field.squareN(iArrA4, 8, iArrA4);
        SecP224K1Field.multiply(iArrA4, iArrA3, iArrA4);
        SecP224K1Field.squareN(iArrA4, 4, iArrA3);
        SecP224K1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP224K1Field.squareN(iArrA3, 19, iArrA2);
        SecP224K1Field.multiply(iArrA2, iArrA4, iArrA2);
        int[] iArrA5 = x3.a();
        SecP224K1Field.squareN(iArrA2, 42, iArrA5);
        SecP224K1Field.multiply(iArrA5, iArrA2, iArrA5);
        SecP224K1Field.squareN(iArrA5, 23, iArrA2);
        SecP224K1Field.multiply(iArrA2, iArrA3, iArrA2);
        SecP224K1Field.squareN(iArrA2, 84, iArrA3);
        SecP224K1Field.multiply(iArrA3, iArrA5, iArrA3);
        SecP224K1Field.squareN(iArrA3, 20, iArrA3);
        SecP224K1Field.multiply(iArrA3, iArrA4, iArrA3);
        SecP224K1Field.squareN(iArrA3, 3, iArrA3);
        SecP224K1Field.multiply(iArrA3, iArr, iArrA3);
        SecP224K1Field.squareN(iArrA3, 2, iArrA3);
        SecP224K1Field.multiply(iArrA3, iArr, iArrA3);
        SecP224K1Field.squareN(iArrA3, 4, iArrA3);
        SecP224K1Field.multiply(iArrA3, iArrA, iArrA3);
        SecP224K1Field.square(iArrA3, iArrA3);
        SecP224K1Field.square(iArrA3, iArrA5);
        if (x3.b(iArr, iArrA5)) {
            return new SecP224K1FieldElement(iArrA3);
        }
        SecP224K1Field.multiply(iArrA3, f25107b, iArrA3);
        SecP224K1Field.square(iArrA3, iArrA5);
        if (x3.b(iArr, iArrA5)) {
            return new SecP224K1FieldElement(iArrA3);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = x3.a();
        SecP224K1Field.square(this.f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        SecP224K1Field.subtract(this.f25108a, ((SecP224K1FieldElement) eCFieldElement).f25108a, iArrA);
        return new SecP224K1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return x3.a(this.f25108a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return x3.c(this.f25108a);
    }

    public SecP224K1FieldElement() {
        this.f25108a = x3.a();
    }

    public SecP224K1FieldElement(int[] iArr) {
        this.f25108a = iArr;
    }
}
