package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.b4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT409FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25160a;

    public SecT409FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f25160a = SecT409Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrA = b4.a();
        SecT409Field.add(this.f25160a, ((SecT409FieldElement) eCFieldElement).f25160a, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrA = b4.a();
        SecT409Field.addOne(this.f25160a, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT409FieldElement) {
            return b4.a(this.f25160a, ((SecT409FieldElement) obj).f25160a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT409Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 409;
    }

    public int getK1() {
        return 87;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 409;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25160a, 0, 7) ^ 4090087;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrA = b4.a();
        SecT409Field.invert(this.f25160a, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return b4.a(this.f25160a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return b4.b(this.f25160a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrA = b4.a();
        SecT409Field.multiply(this.f25160a, ((SecT409FieldElement) eCFieldElement).f25160a, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25160a;
        long[] jArr2 = ((SecT409FieldElement) eCFieldElement).f25160a;
        long[] jArr3 = ((SecT409FieldElement) eCFieldElement2).f25160a;
        long[] jArr4 = ((SecT409FieldElement) eCFieldElement3).f25160a;
        long[] jArrB = e4.b(13);
        SecT409Field.multiplyAddToExt(jArr, jArr2, jArrB);
        SecT409Field.multiplyAddToExt(jArr3, jArr4, jArrB);
        long[] jArrA = b4.a();
        SecT409Field.reduce(jArrB, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrA = b4.a();
        SecT409Field.sqrt(this.f25160a, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrA = b4.a();
        SecT409Field.square(this.f25160a, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25160a;
        long[] jArr2 = ((SecT409FieldElement) eCFieldElement).f25160a;
        long[] jArr3 = ((SecT409FieldElement) eCFieldElement2).f25160a;
        long[] jArrB = e4.b(13);
        SecT409Field.squareAddToExt(jArr, jArrB);
        SecT409Field.multiplyAddToExt(jArr2, jArr3, jArrB);
        long[] jArrA = b4.a();
        SecT409Field.reduce(jArrB, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrA = b4.a();
        SecT409Field.squareN(this.f25160a, i10, jArrA);
        return new SecT409FieldElement(jArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25160a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return b4.c(this.f25160a);
    }

    public SecT409FieldElement() {
        this.f25160a = b4.a();
    }

    public SecT409FieldElement(long[] jArr) {
        this.f25160a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
