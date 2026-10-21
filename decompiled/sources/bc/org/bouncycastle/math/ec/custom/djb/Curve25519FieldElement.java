package bc.org.bouncycastle.math.ec.custom.djb;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class Curve25519FieldElement extends ECFieldElement {
    public static final BigInteger Q = Curve25519.f25059q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25063b = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25064a;

    public Curve25519FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f25064a = Curve25519Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        Curve25519Field.add(this.f25064a, ((Curve25519FieldElement) eCFieldElement).f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = y3.a();
        Curve25519Field.addOne(this.f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        q3.a(Curve25519Field.f25061a, ((Curve25519FieldElement) eCFieldElement).f25064a, iArrA);
        Curve25519Field.multiply(iArrA, this.f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Curve25519FieldElement) {
            return y3.b(this.f25064a, ((Curve25519FieldElement) obj).f25064a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "Curve25519Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25064a, 0, 8);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = y3.a();
        q3.a(Curve25519Field.f25061a, this.f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return y3.a(this.f25064a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return y3.b(this.f25064a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        Curve25519Field.multiply(this.f25064a, ((Curve25519FieldElement) eCFieldElement).f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = y3.a();
        Curve25519Field.negate(this.f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int[] iArr = this.f25064a;
        if (y3.b(iArr) || y3.a(iArr)) {
            return this;
        }
        int[] iArrA = y3.a();
        Curve25519Field.square(iArr, iArrA);
        Curve25519Field.multiply(iArrA, iArr, iArrA);
        Curve25519Field.square(iArrA, iArrA);
        Curve25519Field.multiply(iArrA, iArr, iArrA);
        int[] iArrA2 = y3.a();
        Curve25519Field.square(iArrA, iArrA2);
        Curve25519Field.multiply(iArrA2, iArr, iArrA2);
        int[] iArrA3 = y3.a();
        Curve25519Field.squareN(iArrA2, 3, iArrA3);
        Curve25519Field.multiply(iArrA3, iArrA, iArrA3);
        Curve25519Field.squareN(iArrA3, 4, iArrA);
        Curve25519Field.multiply(iArrA, iArrA2, iArrA);
        Curve25519Field.squareN(iArrA, 4, iArrA3);
        Curve25519Field.multiply(iArrA3, iArrA2, iArrA3);
        Curve25519Field.squareN(iArrA3, 15, iArrA2);
        Curve25519Field.multiply(iArrA2, iArrA3, iArrA2);
        Curve25519Field.squareN(iArrA2, 30, iArrA3);
        Curve25519Field.multiply(iArrA3, iArrA2, iArrA3);
        Curve25519Field.squareN(iArrA3, 60, iArrA2);
        Curve25519Field.multiply(iArrA2, iArrA3, iArrA2);
        Curve25519Field.squareN(iArrA2, 11, iArrA3);
        Curve25519Field.multiply(iArrA3, iArrA, iArrA3);
        Curve25519Field.squareN(iArrA3, 120, iArrA);
        Curve25519Field.multiply(iArrA, iArrA2, iArrA);
        Curve25519Field.square(iArrA, iArrA);
        Curve25519Field.square(iArrA, iArrA2);
        if (y3.b(iArr, iArrA2)) {
            return new Curve25519FieldElement(iArrA);
        }
        Curve25519Field.multiply(iArrA, f25063b, iArrA);
        Curve25519Field.square(iArrA, iArrA2);
        if (y3.b(iArr, iArrA2)) {
            return new Curve25519FieldElement(iArrA);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = y3.a();
        Curve25519Field.square(this.f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = y3.a();
        Curve25519Field.subtract(this.f25064a, ((Curve25519FieldElement) eCFieldElement).f25064a, iArrA);
        return new Curve25519FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return y3.a(this.f25064a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return y3.c(this.f25064a);
    }

    public Curve25519FieldElement() {
        this.f25064a = y3.a();
    }

    public Curve25519FieldElement(int[] iArr) {
        this.f25064a = iArr;
    }
}
