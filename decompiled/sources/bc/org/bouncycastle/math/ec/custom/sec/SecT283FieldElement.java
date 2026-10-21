package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.z3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT283FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25157a;

    public SecT283FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f25157a = SecT283Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrA = z3.a();
        SecT283Field.add(this.f25157a, ((SecT283FieldElement) eCFieldElement).f25157a, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrA = z3.a();
        SecT283Field.addOne(this.f25157a, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT283FieldElement) {
            return z3.a(this.f25157a, ((SecT283FieldElement) obj).f25157a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT283Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 283;
    }

    public int getK1() {
        return 5;
    }

    public int getK2() {
        return 7;
    }

    public int getK3() {
        return 12;
    }

    public int getM() {
        return 283;
    }

    public int getRepresentation() {
        return 3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25157a, 0, 5) ^ 2831275;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrA = z3.a();
        SecT283Field.invert(this.f25157a, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return z3.a(this.f25157a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return z3.b(this.f25157a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrA = z3.a();
        SecT283Field.multiply(this.f25157a, ((SecT283FieldElement) eCFieldElement).f25157a, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25157a;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f25157a;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f25157a;
        long[] jArr4 = ((SecT283FieldElement) eCFieldElement3).f25157a;
        long[] jArrB = e4.b(9);
        SecT283Field.multiplyAddToExt(jArr, jArr2, jArrB);
        SecT283Field.multiplyAddToExt(jArr3, jArr4, jArrB);
        long[] jArrA = z3.a();
        SecT283Field.reduce(jArrB, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrA = z3.a();
        SecT283Field.sqrt(this.f25157a, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrA = z3.a();
        SecT283Field.square(this.f25157a, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25157a;
        long[] jArr2 = ((SecT283FieldElement) eCFieldElement).f25157a;
        long[] jArr3 = ((SecT283FieldElement) eCFieldElement2).f25157a;
        long[] jArrB = e4.b(9);
        SecT283Field.squareAddToExt(jArr, jArrB);
        SecT283Field.multiplyAddToExt(jArr2, jArr3, jArrB);
        long[] jArrA = z3.a();
        SecT283Field.reduce(jArrB, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrA = z3.a();
        SecT283Field.squareN(this.f25157a, i10, jArrA);
        return new SecT283FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25157a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return z3.c(this.f25157a);
    }

    public SecT283FieldElement() {
        this.f25157a = z3.a();
    }

    public SecT283FieldElement(long[] jArr) {
        this.f25157a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
