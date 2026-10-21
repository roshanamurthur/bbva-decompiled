package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT163FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25144a;

    public SecT163FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f25144a = SecT163Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrB = w3.b();
        SecT163Field.add(this.f25144a, ((SecT163FieldElement) eCFieldElement).f25144a, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrB = w3.b();
        SecT163Field.addOne(this.f25144a, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT163FieldElement) {
            return w3.a(this.f25144a, ((SecT163FieldElement) obj).f25144a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT163Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return 163;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return 163;
    }

    public int getRepresentation() {
        return 3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25144a, 0, 3) ^ 163763;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrB = w3.b();
        SecT163Field.invert(this.f25144a, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return w3.a(this.f25144a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return w3.b(this.f25144a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrB = w3.b();
        SecT163Field.multiply(this.f25144a, ((SecT163FieldElement) eCFieldElement).f25144a, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25144a;
        long[] jArr2 = ((SecT163FieldElement) eCFieldElement).f25144a;
        long[] jArr3 = ((SecT163FieldElement) eCFieldElement2).f25144a;
        long[] jArr4 = ((SecT163FieldElement) eCFieldElement3).f25144a;
        long[] jArrD = w3.d();
        SecT163Field.multiplyAddToExt(jArr, jArr2, jArrD);
        SecT163Field.multiplyAddToExt(jArr3, jArr4, jArrD);
        long[] jArrB = w3.b();
        SecT163Field.reduce(jArrD, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrB = w3.b();
        SecT163Field.sqrt(this.f25144a, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrB = w3.b();
        SecT163Field.square(this.f25144a, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25144a;
        long[] jArr2 = ((SecT163FieldElement) eCFieldElement).f25144a;
        long[] jArr3 = ((SecT163FieldElement) eCFieldElement2).f25144a;
        long[] jArrD = w3.d();
        SecT163Field.squareAddToExt(jArr, jArrD);
        SecT163Field.multiplyAddToExt(jArr2, jArr3, jArrD);
        long[] jArrB = w3.b();
        SecT163Field.reduce(jArrD, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrB = w3.b();
        SecT163Field.squareN(this.f25144a, i10, jArrB);
        return new SecT163FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25144a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return w3.c(this.f25144a);
    }

    public SecT163FieldElement() {
        this.f25144a = w3.b();
    }

    public SecT163FieldElement(long[] jArr) {
        this.f25144a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
