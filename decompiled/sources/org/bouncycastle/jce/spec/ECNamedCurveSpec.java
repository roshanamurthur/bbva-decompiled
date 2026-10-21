package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class ECNamedCurveSpec extends java.security.spec.ECParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90520a;

    public ECNamedCurveSpec(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger) {
        super(ellipticCurve, eCPoint, bigInteger, 1);
        this.f90520a = str;
    }

    public static EllipticCurve a(ECCurve eCCurve, byte[] bArr) {
        ECField eCFieldF2m;
        FiniteField field = eCCurve.getField();
        if (ECAlgorithms.isFpField(field)) {
            eCFieldF2m = new ECFieldFp(field.getCharacteristic());
        } else {
            Polynomial minimalPolynomial = ((PolynomialExtensionField) field).getMinimalPolynomial();
            int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
            eCFieldF2m = new ECFieldF2m(minimalPolynomial.getDegree(), Arrays.reverse(Arrays.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
        }
        return new EllipticCurve(eCFieldF2m, eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), bArr);
    }

    public String getName() {
        return this.f90520a;
    }

    public ECNamedCurveSpec(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f90520a = str;
    }

    public ECNamedCurveSpec(String str, ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, BigInteger bigInteger) {
        super(a(eCCurve, null), EC5Util.convertPoint(eCPoint), bigInteger, 1);
        this.f90520a = str;
    }

    public ECNamedCurveSpec(String str, ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(a(eCCurve, null), EC5Util.convertPoint(eCPoint), bigInteger, bigInteger2.intValue());
        this.f90520a = str;
    }

    public ECNamedCurveSpec(String str, ECCurve eCCurve, org.bouncycastle.math.ec.ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(a(eCCurve, bArr), EC5Util.convertPoint(eCPoint), bigInteger, bigInteger2.intValue());
        this.f90520a = str;
    }
}
