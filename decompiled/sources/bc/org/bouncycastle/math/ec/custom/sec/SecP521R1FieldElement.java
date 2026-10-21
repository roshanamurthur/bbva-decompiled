package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP521R1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP521R1Curve.f25132q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25135a;

    public SecP521R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f25135a = SecP521R1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(17);
        SecP521R1Field.add(this.f25135a, ((SecP521R1FieldElement) eCFieldElement).f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = e4.a(17);
        SecP521R1Field.addOne(this.f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(17);
        q3.a(SecP521R1Field.f25134a, ((SecP521R1FieldElement) eCFieldElement).f25135a, iArrA);
        SecP521R1Field.multiply(iArrA, this.f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP521R1FieldElement) {
            return e4.b(17, this.f25135a, ((SecP521R1FieldElement) obj).f25135a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP521R1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25135a, 0, 17);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = e4.a(17);
        q3.a(SecP521R1Field.f25134a, this.f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return e4.d(17, this.f25135a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return e4.e(17, this.f25135a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(17);
        SecP521R1Field.multiply(this.f25135a, ((SecP521R1FieldElement) eCFieldElement).f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = e4.a(17);
        SecP521R1Field.negate(this.f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25135a;
        if (e4.e(17, iArr) || e4.d(17, iArr)) {
            return this;
        }
        int[] iArrA = e4.a(17);
        int[] iArrA2 = e4.a(17);
        SecP521R1Field.squareN(iArr, 519, iArrA);
        SecP521R1Field.square(iArrA, iArrA2);
        if (e4.b(17, iArr, iArrA2)) {
            return new SecP521R1FieldElement(iArrA);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = e4.a(17);
        SecP521R1Field.square(this.f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = e4.a(17);
        SecP521R1Field.subtract(this.f25135a, ((SecP521R1FieldElement) eCFieldElement).f25135a, iArrA);
        return new SecP521R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return e4.a(this.f25135a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return e4.f(17, this.f25135a);
    }

    public SecP521R1FieldElement() {
        this.f25135a = e4.a(17);
    }

    public SecP521R1FieldElement(int[] iArr) {
        this.f25135a = iArr;
    }
}
