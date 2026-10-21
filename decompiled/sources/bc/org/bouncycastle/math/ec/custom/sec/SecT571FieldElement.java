package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.d4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT571FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25164a;

    public SecT571FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f25164a = SecT571Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrA = d4.a();
        SecT571Field.add(this.f25164a, ((SecT571FieldElement) eCFieldElement).f25164a, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrA = d4.a();
        SecT571Field.addOne(this.f25164a, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT571FieldElement) {
            return d4.a(this.f25164a, ((SecT571FieldElement) obj).f25164a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT571Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 571;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 5;
    }

    public int getK3() {
        return 10;
    }

    public int getM() {
        return 571;
    }

    public int getRepresentation() {
        return 3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25164a, 0, 9) ^ 5711052;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrA = d4.a();
        SecT571Field.invert(this.f25164a, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return d4.a(this.f25164a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return d4.b(this.f25164a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrA = d4.a();
        SecT571Field.multiply(this.f25164a, ((SecT571FieldElement) eCFieldElement).f25164a, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25164a;
        long[] jArr2 = ((SecT571FieldElement) eCFieldElement).f25164a;
        long[] jArr3 = ((SecT571FieldElement) eCFieldElement2).f25164a;
        long[] jArr4 = ((SecT571FieldElement) eCFieldElement3).f25164a;
        long[] jArrB = d4.b();
        SecT571Field.multiplyAddToExt(jArr, jArr2, jArrB);
        SecT571Field.multiplyAddToExt(jArr3, jArr4, jArrB);
        long[] jArrA = d4.a();
        SecT571Field.reduce(jArrB, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrA = d4.a();
        SecT571Field.sqrt(this.f25164a, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrA = d4.a();
        SecT571Field.square(this.f25164a, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25164a;
        long[] jArr2 = ((SecT571FieldElement) eCFieldElement).f25164a;
        long[] jArr3 = ((SecT571FieldElement) eCFieldElement2).f25164a;
        long[] jArrB = d4.b();
        SecT571Field.squareAddToExt(jArr, jArrB);
        SecT571Field.multiplyAddToExt(jArr2, jArr3, jArrB);
        long[] jArrA = d4.a();
        SecT571Field.reduce(jArrB, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrA = d4.a();
        SecT571Field.squareN(this.f25164a, i10, jArrA);
        return new SecT571FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25164a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return d4.c(this.f25164a);
    }

    public SecT571FieldElement() {
        this.f25164a = d4.a();
    }

    public SecT571FieldElement(long[] jArr) {
        this.f25164a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
