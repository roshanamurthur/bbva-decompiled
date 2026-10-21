package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP160R2FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP160R2Curve.f25084q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25089a;

    public SecP160R2FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f25089a = SecP160R2Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        SecP160R2Field.add(this.f25089a, ((SecP160R2FieldElement) eCFieldElement).f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = v3.a();
        SecP160R2Field.addOne(this.f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        q3.a(SecP160R2Field.f25086a, ((SecP160R2FieldElement) eCFieldElement).f25089a, iArrA);
        SecP160R2Field.multiply(iArrA, this.f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP160R2FieldElement) {
            return v3.a(this.f25089a, ((SecP160R2FieldElement) obj).f25089a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP160R2Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25089a, 0, 5);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = v3.a();
        q3.a(SecP160R2Field.f25086a, this.f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return v3.a(this.f25089a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return v3.b(this.f25089a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        SecP160R2Field.multiply(this.f25089a, ((SecP160R2FieldElement) eCFieldElement).f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = v3.a();
        SecP160R2Field.negate(this.f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25089a;
        if (v3.b(iArr) || v3.a(iArr)) {
            return this;
        }
        int[] iArrA = v3.a();
        SecP160R2Field.square(iArr, iArrA);
        SecP160R2Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = v3.a();
        SecP160R2Field.square(iArrA, iArrA2);
        SecP160R2Field.multiply(iArrA2, iArr, iArrA2);
        int[] iArrA3 = v3.a();
        SecP160R2Field.square(iArrA2, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArr, iArrA3);
        int[] iArrA4 = v3.a();
        SecP160R2Field.squareN(iArrA3, 3, iArrA4);
        SecP160R2Field.multiply(iArrA4, iArrA2, iArrA4);
        SecP160R2Field.squareN(iArrA4, 7, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArrA4, iArrA3);
        SecP160R2Field.squareN(iArrA3, 3, iArrA4);
        SecP160R2Field.multiply(iArrA4, iArrA2, iArrA4);
        int[] iArrA5 = v3.a();
        SecP160R2Field.squareN(iArrA4, 14, iArrA5);
        SecP160R2Field.multiply(iArrA5, iArrA3, iArrA5);
        SecP160R2Field.squareN(iArrA5, 31, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArrA5, iArrA3);
        SecP160R2Field.squareN(iArrA3, 62, iArrA5);
        SecP160R2Field.multiply(iArrA5, iArrA3, iArrA5);
        SecP160R2Field.squareN(iArrA5, 3, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP160R2Field.squareN(iArrA3, 18, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArrA4, iArrA3);
        SecP160R2Field.squareN(iArrA3, 2, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArr, iArrA3);
        SecP160R2Field.squareN(iArrA3, 3, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArrA, iArrA3);
        SecP160R2Field.squareN(iArrA3, 6, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP160R2Field.squareN(iArrA3, 2, iArrA3);
        SecP160R2Field.multiply(iArrA3, iArr, iArrA3);
        SecP160R2Field.square(iArrA3, iArrA);
        if (v3.a(iArr, iArrA)) {
            return new SecP160R2FieldElement(iArrA3);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = v3.a();
        SecP160R2Field.square(this.f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = v3.a();
        SecP160R2Field.subtract(this.f25089a, ((SecP160R2FieldElement) eCFieldElement).f25089a, iArrA);
        return new SecP160R2FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return v3.a(this.f25089a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return v3.c(this.f25089a);
    }

    public SecP160R2FieldElement() {
        this.f25089a = v3.a();
    }

    public SecP160R2FieldElement(int[] iArr) {
        this.f25089a = iArr;
    }
}
