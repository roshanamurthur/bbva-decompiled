package bc.org.bouncycastle.math.ec.custom.gm;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SM2P256V1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SM2P256V1Curve.f25065q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25069a;

    public SM2P256V1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f25069a = SM2P256V1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SM2P256V1Field.add(this.f25069a, ((SM2P256V1FieldElement) eCFieldElement).f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = y3.a();
        SM2P256V1Field.addOne(this.f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        q3.a(SM2P256V1Field.f25067a, ((SM2P256V1FieldElement) eCFieldElement).f25069a, iArrA);
        SM2P256V1Field.multiply(iArrA, this.f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SM2P256V1FieldElement) {
            return y3.b(this.f25069a, ((SM2P256V1FieldElement) obj).f25069a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SM2P256V1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25069a, 0, 8);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = y3.a();
        q3.a(SM2P256V1Field.f25067a, this.f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return y3.a(this.f25069a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return y3.b(this.f25069a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SM2P256V1Field.multiply(this.f25069a, ((SM2P256V1FieldElement) eCFieldElement).f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = y3.a();
        SM2P256V1Field.negate(this.f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25069a;
        if (y3.b(iArr) || y3.a(iArr)) {
            return this;
        }
        int[] iArrA = y3.a();
        SM2P256V1Field.square(iArr, iArrA);
        SM2P256V1Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = y3.a();
        SM2P256V1Field.squareN(iArrA, 2, iArrA2);
        SM2P256V1Field.multiply(iArrA2, iArrA, iArrA2);
        int[] iArrA3 = y3.a();
        SM2P256V1Field.squareN(iArrA2, 2, iArrA3);
        SM2P256V1Field.multiply(iArrA3, iArrA, iArrA3);
        SM2P256V1Field.squareN(iArrA3, 6, iArrA);
        SM2P256V1Field.multiply(iArrA, iArrA3, iArrA);
        int[] iArrA4 = y3.a();
        SM2P256V1Field.squareN(iArrA, 12, iArrA4);
        SM2P256V1Field.multiply(iArrA4, iArrA, iArrA4);
        SM2P256V1Field.squareN(iArrA4, 6, iArrA);
        SM2P256V1Field.multiply(iArrA, iArrA3, iArrA);
        SM2P256V1Field.square(iArrA, iArrA3);
        SM2P256V1Field.multiply(iArrA3, iArr, iArrA3);
        SM2P256V1Field.squareN(iArrA3, 31, iArrA4);
        SM2P256V1Field.multiply(iArrA4, iArrA3, iArrA);
        SM2P256V1Field.squareN(iArrA4, 32, iArrA4);
        SM2P256V1Field.multiply(iArrA4, iArrA, iArrA4);
        SM2P256V1Field.squareN(iArrA4, 62, iArrA4);
        SM2P256V1Field.multiply(iArrA4, iArrA, iArrA4);
        SM2P256V1Field.squareN(iArrA4, 4, iArrA4);
        SM2P256V1Field.multiply(iArrA4, iArrA2, iArrA4);
        SM2P256V1Field.squareN(iArrA4, 32, iArrA4);
        SM2P256V1Field.multiply(iArrA4, iArr, iArrA4);
        SM2P256V1Field.squareN(iArrA4, 62, iArrA4);
        SM2P256V1Field.square(iArrA4, iArrA2);
        if (y3.b(iArr, iArrA2)) {
            return new SM2P256V1FieldElement(iArrA4);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = y3.a();
        SM2P256V1Field.square(this.f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        SM2P256V1Field.subtract(this.f25069a, ((SM2P256V1FieldElement) eCFieldElement).f25069a, iArrA);
        return new SM2P256V1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return y3.a(this.f25069a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return y3.c(this.f25069a);
    }

    public SM2P256V1FieldElement() {
        this.f25069a = y3.a();
    }

    public SM2P256V1FieldElement(int[] iArr) {
        this.f25069a = iArr;
    }
}
