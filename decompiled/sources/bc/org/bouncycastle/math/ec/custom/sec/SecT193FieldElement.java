package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.esotericsoftware.asm.Opcodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT193FieldElement extends ECFieldElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected long[] f25148a;

    public SecT193FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f25148a = SecT193Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        long[] jArrB = y3.b();
        SecT193Field.add(this.f25148a, ((SecT193FieldElement) eCFieldElement).f25148a, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        long[] jArrB = y3.b();
        SecT193Field.addOne(this.f25148a, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        return multiply(eCFieldElement.invert());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecT193FieldElement) {
            return y3.a(this.f25148a, ((SecT193FieldElement) obj).f25148a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecT193Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Opcodes.INSTANCEOF;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return Opcodes.INSTANCEOF;
    }

    public int getRepresentation() {
        return 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f25148a, 0, 4) ^ 1930015;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        long[] jArrB = y3.b();
        SecT193Field.invert(this.f25148a, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return y3.a(this.f25148a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return y3.b(this.f25148a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        long[] jArrB = y3.b();
        SecT193Field.multiply(this.f25148a, ((SecT193FieldElement) eCFieldElement).f25148a, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        long[] jArr = this.f25148a;
        long[] jArr2 = ((SecT193FieldElement) eCFieldElement).f25148a;
        long[] jArr3 = ((SecT193FieldElement) eCFieldElement2).f25148a;
        long[] jArr4 = ((SecT193FieldElement) eCFieldElement3).f25148a;
        long[] jArrD = y3.d();
        SecT193Field.multiplyAddToExt(jArr, jArr2, jArrD);
        SecT193Field.multiplyAddToExt(jArr3, jArr4, jArrD);
        long[] jArrB = y3.b();
        SecT193Field.reduce(jArrD, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        long[] jArrB = y3.b();
        SecT193Field.sqrt(this.f25148a, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        long[] jArrB = y3.b();
        SecT193Field.square(this.f25148a, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return squarePlusProduct(eCFieldElement, eCFieldElement2);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        long[] jArr = this.f25148a;
        long[] jArr2 = ((SecT193FieldElement) eCFieldElement).f25148a;
        long[] jArr3 = ((SecT193FieldElement) eCFieldElement2).f25148a;
        long[] jArrD = y3.d();
        SecT193Field.squareAddToExt(jArr, jArrD);
        SecT193Field.multiplyAddToExt(jArr2, jArr3, jArrD);
        long[] jArrB = y3.b();
        SecT193Field.reduce(jArrD, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement squarePow(int i10) {
        if (i10 < 1) {
            return this;
        }
        long[] jArrB = y3.b();
        SecT193Field.squareN(this.f25148a, i10, jArrB);
        return new SecT193FieldElement(jArrB);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        return add(eCFieldElement);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return (this.f25148a[0] & 1) != 0;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return y3.c(this.f25148a);
    }

    public SecT193FieldElement() {
        this.f25148a = y3.b();
    }

    public SecT193FieldElement(long[] jArr) {
        this.f25148a = jArr;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        return this;
    }
}
