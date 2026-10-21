package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP128R1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP128R1Curve.f25070q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25075a;

    public SecP128R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f25075a = SecP128R1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = u3.a();
        SecP128R1Field.add(this.f25075a, ((SecP128R1FieldElement) eCFieldElement).f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = u3.a();
        SecP128R1Field.addOne(this.f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = u3.a();
        q3.a(SecP128R1Field.f25072a, ((SecP128R1FieldElement) eCFieldElement).f25075a, iArrA);
        SecP128R1Field.multiply(iArrA, this.f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP128R1FieldElement) {
            return u3.a(this.f25075a, ((SecP128R1FieldElement) obj).f25075a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP128R1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25075a, 0, 4);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = u3.a();
        q3.a(SecP128R1Field.f25072a, this.f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return u3.a(this.f25075a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return u3.b(this.f25075a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = u3.a();
        SecP128R1Field.multiply(this.f25075a, ((SecP128R1FieldElement) eCFieldElement).f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = u3.a();
        SecP128R1Field.negate(this.f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25075a;
        if (u3.b(iArr) || u3.a(iArr)) {
            return this;
        }
        int[] iArrA = u3.a();
        SecP128R1Field.square(iArr, iArrA);
        SecP128R1Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = u3.a();
        SecP128R1Field.squareN(iArrA, 2, iArrA2);
        SecP128R1Field.multiply(iArrA2, iArrA, iArrA2);
        int[] iArrA3 = u3.a();
        SecP128R1Field.squareN(iArrA2, 4, iArrA3);
        SecP128R1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP128R1Field.squareN(iArrA3, 2, iArrA2);
        SecP128R1Field.multiply(iArrA2, iArrA, iArrA2);
        SecP128R1Field.squareN(iArrA2, 10, iArrA);
        SecP128R1Field.multiply(iArrA, iArrA2, iArrA);
        SecP128R1Field.squareN(iArrA, 10, iArrA3);
        SecP128R1Field.multiply(iArrA3, iArrA2, iArrA3);
        SecP128R1Field.square(iArrA3, iArrA2);
        SecP128R1Field.multiply(iArrA2, iArr, iArrA2);
        SecP128R1Field.squareN(iArrA2, 95, iArrA2);
        SecP128R1Field.square(iArrA2, iArrA3);
        if (u3.a(iArr, iArrA3)) {
            return new SecP128R1FieldElement(iArrA2);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = u3.a();
        SecP128R1Field.square(this.f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = u3.a();
        SecP128R1Field.subtract(this.f25075a, ((SecP128R1FieldElement) eCFieldElement).f25075a, iArrA);
        return new SecP128R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return u3.a(this.f25075a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return u3.c(this.f25075a);
    }

    public SecP128R1FieldElement() {
        this.f25075a = u3.a();
    }

    public SecP128R1FieldElement(int[] iArr) {
        this.f25075a = iArr;
    }
}
