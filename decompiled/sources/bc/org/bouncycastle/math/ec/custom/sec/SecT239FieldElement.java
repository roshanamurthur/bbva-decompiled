package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT239FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25154a;

    public SecT239FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f25154a = SecT239Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrB = y3.b();
        SecT239Field.add(this.f25154a, ((SecT239FieldElement) eCFieldElement).f25154a, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrB = y3.b();
        SecT239Field.addOne(this.f25154a, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT239FieldElement) {
            return y3.a(this.f25154a, ((SecT239FieldElement) obj).f25154a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT239Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 239;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25154a, 0, 4) ^ 23900158;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrB = y3.b();
        SecT239Field.invert(this.f25154a, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return y3.a(this.f25154a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return y3.b(this.f25154a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrB = y3.b();
        SecT239Field.multiply(this.f25154a, ((SecT239FieldElement) eCFieldElement).f25154a, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25154a;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f25154a;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f25154a;
        long[] jArr4 = ((SecT239FieldElement) eCFieldElement3).f25154a;
        long[] jArrD = y3.d();
        SecT239Field.multiplyAddToExt(jArr, jArr2, jArrD);
        SecT239Field.multiplyAddToExt(jArr3, jArr4, jArrD);
        long[] jArrB = y3.b();
        SecT239Field.reduce(jArrD, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrB = y3.b();
        SecT239Field.sqrt(this.f25154a, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrB = y3.b();
        SecT239Field.square(this.f25154a, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25154a;
        long[] jArr2 = ((SecT239FieldElement) eCFieldElement).f25154a;
        long[] jArr3 = ((SecT239FieldElement) eCFieldElement2).f25154a;
        long[] jArrD = y3.d();
        SecT239Field.squareAddToExt(jArr, jArrD);
        SecT239Field.multiplyAddToExt(jArr2, jArr3, jArrD);
        long[] jArrB = y3.b();
        SecT239Field.reduce(jArrD, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrB = y3.b();
        SecT239Field.squareN(this.f25154a, i10, jArrB);
        return new SecT239FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25154a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return y3.c(this.f25154a);
    }

    public SecT239FieldElement() {
        this.f25154a = y3.b();
    }

    public SecT239FieldElement(long[] jArr) {
        this.f25154a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
