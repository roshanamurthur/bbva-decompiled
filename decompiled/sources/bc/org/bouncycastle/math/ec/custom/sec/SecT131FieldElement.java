package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT131FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25140a;

    public SecT131FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f25140a = SecT131Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrB = w3.b();
        SecT131Field.add(this.f25140a, ((SecT131FieldElement) eCFieldElement).f25140a, jArrB);
        return new SecT131FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrB = w3.b();
        SecT131Field.addOne(this.f25140a, jArrB);
        return new SecT131FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT131FieldElement) {
            return w3.a(this.f25140a, ((SecT131FieldElement) obj).f25140a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT131Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 131;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 3;
    }

    public int getK3() {
        return 8;
    }

    public int getM() {
        return 131;
    }

    public int getRepresentation() {
        return 3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25140a, 0, 3) ^ 131832;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrB = w3.b();
        SecT131Field.invert(this.f25140a, jArrB);
        return new SecT131FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return w3.a(this.f25140a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return w3.b(this.f25140a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrB = w3.b();
        SecT131Field.multiply(this.f25140a, ((SecT131FieldElement) eCFieldElement).f25140a, jArrB);
        return new SecT131FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25140a;
        long[] jArr2 = ((SecT131FieldElement) eCFieldElement).f25140a;
        long[] jArr3 = ((SecT131FieldElement) eCFieldElement2).f25140a;
        long[] jArr4 = ((SecT131FieldElement) eCFieldElement3).f25140a;
        long[] jArrB = e4.b(5);
        SecT131Field.multiplyAddToExt(jArr, jArr2, jArrB);
        SecT131Field.multiplyAddToExt(jArr3, jArr4, jArrB);
        long[] jArrB2 = w3.b();
        SecT131Field.reduce(jArrB, jArrB2);
        return new SecT131FieldElement(jArrB2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrB = w3.b();
        SecT131Field.sqrt(this.f25140a, jArrB);
        return new SecT131FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrB = w3.b();
        SecT131Field.square(this.f25140a, jArrB);
        return new SecT131FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25140a;
        long[] jArr2 = ((SecT131FieldElement) eCFieldElement).f25140a;
        long[] jArr3 = ((SecT131FieldElement) eCFieldElement2).f25140a;
        long[] jArrB = e4.b(5);
        SecT131Field.squareAddToExt(jArr, jArrB);
        SecT131Field.multiplyAddToExt(jArr2, jArr3, jArrB);
        long[] jArrB2 = w3.b();
        SecT131Field.reduce(jArrB, jArrB2);
        return new SecT131FieldElement(jArrB2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrB = w3.b();
        SecT131Field.squareN(this.f25140a, i10, jArrB);
        return new SecT131FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25140a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return w3.c(this.f25140a);
    }

    public SecT131FieldElement() {
        this.f25140a = w3.b();
    }

    public SecT131FieldElement(long[] jArr) {
        this.f25140a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
