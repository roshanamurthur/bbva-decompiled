package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT113FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25136a;

    public SecT113FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f25136a = SecT113Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrB = u3.b();
        SecT113Field.add(this.f25136a, ((SecT113FieldElement) eCFieldElement).f25136a, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrB = u3.b();
        SecT113Field.addOne(this.f25136a, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT113FieldElement) {
            return u3.a(this.f25136a, ((SecT113FieldElement) obj).f25136a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT113Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 113;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25136a, 0, 2) ^ 113009;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrB = u3.b();
        SecT113Field.invert(this.f25136a, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return u3.a(this.f25136a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return u3.b(this.f25136a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrB = u3.b();
        SecT113Field.multiply(this.f25136a, ((SecT113FieldElement) eCFieldElement).f25136a, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25136a;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f25136a;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f25136a;
        long[] jArr4 = ((SecT113FieldElement) eCFieldElement3).f25136a;
        long[] jArrD = u3.d();
        SecT113Field.multiplyAddToExt(jArr, jArr2, jArrD);
        SecT113Field.multiplyAddToExt(jArr3, jArr4, jArrD);
        long[] jArrB = u3.b();
        SecT113Field.reduce(jArrD, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrB = u3.b();
        SecT113Field.sqrt(this.f25136a, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrB = u3.b();
        SecT113Field.square(this.f25136a, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25136a;
        long[] jArr2 = ((SecT113FieldElement) eCFieldElement).f25136a;
        long[] jArr3 = ((SecT113FieldElement) eCFieldElement2).f25136a;
        long[] jArrD = u3.d();
        SecT113Field.squareAddToExt(jArr, jArrD);
        SecT113Field.multiplyAddToExt(jArr2, jArr3, jArrD);
        long[] jArrB = u3.b();
        SecT113Field.reduce(jArrD, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrB = u3.b();
        SecT113Field.squareN(this.f25136a, i10, jArrB);
        return new SecT113FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25136a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return u3.c(this.f25136a);
    }

    public SecT113FieldElement() {
        this.f25136a = u3.b();
    }

    public SecT113FieldElement(long[] jArr) {
        this.f25136a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
