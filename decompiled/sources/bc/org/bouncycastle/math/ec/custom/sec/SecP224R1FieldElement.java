package bc.org.bouncycastle.math.ec.custom.sec;

import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.x3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP224R1FieldElement extends ECFieldElement {
    public static final BigInteger Q = SecP224R1Curve.f25109q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f25114a;

    public SecP224R1FieldElement(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        this.f25114a = SecP224R1Field.fromBigInteger(bigInteger);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement add(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        SecP224R1Field.add(this.f25114a, ((SecP224R1FieldElement) eCFieldElement).f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement addOne() {
        int[] iArrA = x3.a();
        SecP224R1Field.addOne(this.f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement divide(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        q3.a(SecP224R1Field.f25111a, ((SecP224R1FieldElement) eCFieldElement).f25114a, iArrA);
        SecP224R1Field.multiply(iArrA, this.f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SecP224R1FieldElement) {
            return x3.b(this.f25114a, ((SecP224R1FieldElement) obj).f25114a);
        }
        return false;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public String getFieldName() {
        return "SecP224R1Field";
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    public int hashCode() {
        return Q.hashCode() ^ Arrays.hashCode(this.f25114a, 0, 7);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement invert() {
        int[] iArrA = x3.a();
        q3.a(SecP224R1Field.f25111a, this.f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return x3.a(this.f25114a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return x3.b(this.f25114a);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement multiply(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        SecP224R1Field.multiply(this.f25114a, ((SecP224R1FieldElement) eCFieldElement).f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement negate() {
        int[] iArrA = x3.a();
        SecP224R1Field.negate(this.f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement sqrt() {
        int i10;
        int[] iArrA;
        int[] iArrA2;
        int[] iArr = this.f25114a;
        if (x3.b(iArr) || x3.a(iArr)) {
            return this;
        }
        int[] iArrA3 = x3.a();
        SecP224R1Field.negate(iArr, iArrA3);
        int[] iArr2 = SecP224R1Field.f25111a;
        int[] iArrA4 = q3.a(iArr2);
        int[] iArrA5 = x3.a();
        int[] iArrA6 = x3.a();
        int[] iArrA7 = x3.a();
        x3.a(iArr, iArrA6);
        int i11 = 0;
        while (true) {
            i10 = 1;
            if (i11 >= 7) {
                break;
            }
            x3.a(iArrA6, iArrA7);
            SecP224R1Field.squareN(iArrA6, 1 << i11, iArrA6);
            SecP224R1Field.multiply(iArrA6, iArrA7, iArrA6);
            i11++;
        }
        SecP224R1Field.squareN(iArrA6, 95, iArrA6);
        if (!x3.a(iArrA6)) {
            return null;
        }
        loop1: while (true) {
            int[] iArrA8 = x3.a();
            x3.a(iArrA4, iArrA8);
            int[] iArrA9 = x3.a();
            iArrA9[0] = i10;
            int[] iArrA10 = x3.a();
            x3.a(iArrA3, iArrA10);
            int[] iArrA11 = x3.a();
            int[] iArrA12 = x3.a();
            int i12 = 0;
            while (i12 < 7) {
                x3.a(iArrA8, iArrA11);
                x3.a(iArrA9, iArrA12);
                int i13 = i10 << i12;
                while (true) {
                    i13--;
                    if (i13 >= 0) {
                        SecP224R1Field.multiply(iArrA9, iArrA8, iArrA9);
                        SecP224R1Field.twice(iArrA9, iArrA9);
                        SecP224R1Field.square(iArrA8, iArrA5);
                        SecP224R1Field.add(iArrA10, iArrA5, iArrA8);
                        SecP224R1Field.multiply(iArrA10, iArrA5, iArrA10);
                        SecP224R1Field.reduce32(e4.c(7, iArrA10, 2, 0), iArrA10);
                    }
                }
                SecP224R1Field.multiply(iArrA9, iArrA12, iArrA5);
                SecP224R1Field.multiply(iArrA5, iArrA3, iArrA5);
                SecP224R1Field.multiply(iArrA8, iArrA11, iArrA10);
                SecP224R1Field.add(iArrA10, iArrA5, iArrA10);
                SecP224R1Field.multiply(iArrA8, iArrA12, iArrA5);
                x3.a(iArrA10, iArrA8);
                SecP224R1Field.multiply(iArrA9, iArrA11, iArrA9);
                SecP224R1Field.add(iArrA9, iArrA5, iArrA9);
                SecP224R1Field.square(iArrA9, iArrA10);
                SecP224R1Field.multiply(iArrA10, iArrA3, iArrA10);
                i12++;
                i10 = 1;
            }
            iArrA = x3.a();
            iArrA2 = x3.a();
            for (int i14 = 1; i14 < 96; i14++) {
                x3.a(iArrA8, iArrA);
                x3.a(iArrA9, iArrA2);
                SecP224R1Field.multiply(iArrA9, iArrA8, iArrA9);
                SecP224R1Field.twice(iArrA9, iArrA9);
                SecP224R1Field.square(iArrA8, iArrA5);
                SecP224R1Field.add(iArrA10, iArrA5, iArrA8);
                SecP224R1Field.multiply(iArrA10, iArrA5, iArrA10);
                SecP224R1Field.reduce32(e4.c(7, iArrA10, 2, 0), iArrA10);
                if (x3.b(iArrA8)) {
                    break loop1;
                }
            }
            SecP224R1Field.addOne(iArrA4, iArrA4);
            i10 = 1;
        }
        q3.a(iArr2, iArrA2, iArrA5);
        SecP224R1Field.multiply(iArrA5, iArrA, iArrA5);
        SecP224R1Field.square(iArrA5, iArrA4);
        if (x3.b(iArr, iArrA4)) {
            return new SecP224R1FieldElement(iArrA5);
        }
        return null;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement square() {
        int[] iArrA = x3.a();
        SecP224R1Field.square(this.f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public ECFieldElement subtract(ECFieldElement eCFieldElement) {
        int[] iArrA = x3.a();
        SecP224R1Field.subtract(this.f25114a, ((SecP224R1FieldElement) eCFieldElement).f25114a, iArrA);
        return new SecP224R1FieldElement(iArrA);
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return x3.a(this.f25114a, 0) == 1;
    }

    @Override // bc.org.bouncycastle.math.ec.ECFieldElement
    public BigInteger toBigInteger() {
        return x3.c(this.f25114a);
    }

    public SecP224R1FieldElement() {
        this.f25114a = x3.a();
    }

    public SecP224R1FieldElement(int[] iArr) {
        this.f25114a = iArr;
    }
}
