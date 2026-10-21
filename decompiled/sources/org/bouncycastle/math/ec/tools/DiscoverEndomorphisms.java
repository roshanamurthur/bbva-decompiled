package org.bouncycastle.math.ec.tools;

import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes13.dex */
public class DiscoverEndomorphisms {
    public static BigInteger[] a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger bigIntegerDivide = bigInteger.subtract(bigInteger2).divide(bigInteger3);
        BigInteger bigIntegerDivide2 = bigInteger.add(bigInteger2).divide(bigInteger3);
        return bigIntegerDivide.compareTo(bigIntegerDivide2) <= 0 ? new BigInteger[]{bigIntegerDivide, bigIntegerDivide2} : new BigInteger[]{bigIntegerDivide2, bigIntegerDivide};
    }

    public static void b(String str) {
        X9ECParameters byName = CustomNamedCurves.getByName(str);
        if (byName != null || (byName = ECNamedCurveTable.getByName(str)) != null) {
            c(byName, str);
            return;
        }
        System.err.println("Unknown curve: " + str);
    }

    public static void c(X9ECParameters x9ECParameters, String str) {
        BigInteger bigIntegerModPow;
        ECCurve curve = x9ECParameters.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            BigInteger characteristic = curve.getField().getCharacteristic();
            if (curve.getB().isZero()) {
                BigInteger bigIntegerMod = characteristic.mod(ECConstants.FOUR);
                BigInteger bigInteger = ECConstants.ONE;
                if (bigIntegerMod.equals(bigInteger)) {
                    PrintStream printStream = System.out;
                    printStream.println("Curve '" + str + "' has a 'GLV Type A' endomorphism with these parameters:");
                    BigInteger[] bigIntegerArrK = k(x9ECParameters.getN(), bigInteger, ECConstants.ZERO, bigInteger);
                    ECFieldElement eCFieldElementSqrt = x9ECParameters.getCurve().fromBigInteger(bigInteger).negate().sqrt();
                    if (eCFieldElementSqrt == null) {
                        throw new IllegalStateException("Calculation of non-trivial order-4  field elements failed unexpectedly");
                    }
                    ECFieldElement[] eCFieldElementArr = {eCFieldElementSqrt, eCFieldElementSqrt.negate()};
                    f(x9ECParameters, bigIntegerArrK[0], eCFieldElementArr);
                    printStream.println("OR");
                    f(x9ECParameters, bigIntegerArrK[1], eCFieldElementArr);
                }
            }
            if (curve.getA().isZero()) {
                BigInteger bigInteger2 = ECConstants.THREE;
                BigInteger bigIntegerMod2 = characteristic.mod(bigInteger2);
                BigInteger bigInteger3 = ECConstants.ONE;
                if (bigIntegerMod2.equals(bigInteger3)) {
                    System.out.println("Curve '" + str + "' has a 'GLV Type B' endomorphism with these parameters:");
                    BigInteger[] bigIntegerArrK2 = k(x9ECParameters.getN(), bigInteger3, bigInteger3, bigInteger3);
                    ECCurve curve2 = x9ECParameters.getCurve();
                    BigInteger characteristic2 = curve2.getField().getCharacteristic();
                    BigInteger bigIntegerDivide = characteristic2.divide(bigInteger2);
                    SecureRandom secureRandom = new SecureRandom();
                    do {
                        BigInteger bigInteger4 = ECConstants.TWO;
                        bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger4, characteristic2.subtract(bigInteger4), secureRandom).modPow(bigIntegerDivide, characteristic2);
                    } while (bigIntegerModPow.equals(ECConstants.ONE));
                    ECFieldElement eCFieldElementFromBigInteger = curve2.fromBigInteger(bigIntegerModPow);
                    ECFieldElement[] eCFieldElementArr2 = {eCFieldElementFromBigInteger, eCFieldElementFromBigInteger.square()};
                    g(x9ECParameters, bigIntegerArrK2[0], eCFieldElementArr2);
                    System.out.println("OR");
                    g(x9ECParameters, bigIntegerArrK2[1], eCFieldElementArr2);
                }
            }
        }
    }

    public static boolean d(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iBitLength = bigIntegerAbs2.bitLength();
        int iBitLength2 = bigIntegerAbs.bitLength() * 2;
        return iBitLength2 + (-1) <= iBitLength && (iBitLength2 < iBitLength || bigIntegerAbs.multiply(bigIntegerAbs).compareTo(bigIntegerAbs2) < 0);
    }

    public static void discoverEndomorphisms(X9ECParameters x9ECParameters) {
        if (x9ECParameters == null) {
            throw new NullPointerException("x9");
        }
        c(x9ECParameters, "<UNKNOWN>");
    }

    public static boolean e(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        BigInteger bigIntegerAbs = bigIntegerArr[0].abs();
        BigInteger bigIntegerAbs2 = bigIntegerArr[1].abs();
        BigInteger bigIntegerAbs3 = bigIntegerArr2[0].abs();
        BigInteger bigIntegerAbs4 = bigIntegerArr2[1].abs();
        boolean z10 = bigIntegerAbs.compareTo(bigIntegerAbs3) < 0;
        if (z10 == (bigIntegerAbs2.compareTo(bigIntegerAbs4) < 0)) {
            return z10;
        }
        return bigIntegerAbs.multiply(bigIntegerAbs).add(bigIntegerAbs2.multiply(bigIntegerAbs2)).compareTo(bigIntegerAbs3.multiply(bigIntegerAbs3).add(bigIntegerAbs4.multiply(bigIntegerAbs4))) < 0;
    }

    public static void f(X9ECParameters x9ECParameters, BigInteger bigInteger, ECFieldElement[] eCFieldElementArr) {
        ECPoint eCPointNormalize = x9ECParameters.getG().normalize();
        ECPoint eCPointNormalize2 = eCPointNormalize.multiply(bigInteger).normalize();
        if (!eCPointNormalize.getXCoord().negate().equals(eCPointNormalize2.getXCoord())) {
            throw new IllegalStateException("Derivation of GLV Type A parameters failed unexpectedly");
        }
        ECFieldElement eCFieldElement = eCFieldElementArr[0];
        if (!eCPointNormalize.getYCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getYCoord())) {
            eCFieldElement = eCFieldElementArr[1];
            if (!eCPointNormalize.getYCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getYCoord())) {
                throw new IllegalStateException("Derivation of GLV Type A parameters failed unexpectedly");
            }
        }
        h("lambda * (x, y) = (-x, i * y)", "Point map");
        h(eCFieldElement.toBigInteger().toString(16), "i");
        h(bigInteger.toString(16), "lambda");
        i(x9ECParameters.getN(), bigInteger);
    }

    public static void g(X9ECParameters x9ECParameters, BigInteger bigInteger, ECFieldElement[] eCFieldElementArr) {
        ECPoint eCPointNormalize = x9ECParameters.getG().normalize();
        ECPoint eCPointNormalize2 = eCPointNormalize.multiply(bigInteger).normalize();
        if (!eCPointNormalize.getYCoord().equals(eCPointNormalize2.getYCoord())) {
            throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
        }
        ECFieldElement eCFieldElement = eCFieldElementArr[0];
        if (!eCPointNormalize.getXCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getXCoord())) {
            eCFieldElement = eCFieldElementArr[1];
            if (!eCPointNormalize.getXCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getXCoord())) {
                throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
            }
        }
        h("lambda * (x, y) = (beta * x, y)", "Point map");
        h(eCFieldElement.toBigInteger().toString(16), "beta");
        h(bigInteger.toString(16), "lambda");
        i(x9ECParameters.getN(), bigInteger);
    }

    public static void h(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("  ");
        stringBuffer.append(str2);
        while (stringBuffer.length() < 20) {
            stringBuffer.append(' ');
        }
        stringBuffer.append(": ");
        stringBuffer.append(str.toString());
        System.out.println(stringBuffer.toString());
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01da  */
    public static void i(BigInteger bigInteger, BigInteger bigInteger2) {
        char c10;
        BigInteger bigInteger3;
        BigInteger bigIntegerSubtract;
        char c11;
        BigInteger bigInteger4;
        BigInteger[] bigIntegerArr;
        char c12;
        char c13;
        char c14;
        BigInteger bigIntegerShiftRight;
        BigInteger bigInteger5 = ECConstants.ZERO;
        BigInteger bigInteger6 = ECConstants.ONE;
        BigInteger bigInteger7 = bigInteger;
        BigInteger bigInteger8 = bigInteger2;
        while (true) {
            BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger7.divideAndRemainder(bigInteger8);
            c10 = 0;
            BigInteger bigInteger9 = bigIntegerArrDivideAndRemainder[0];
            bigInteger3 = bigIntegerArrDivideAndRemainder[1];
            bigIntegerSubtract = bigInteger5.subtract(bigInteger9.multiply(bigInteger6));
            if (d(bigInteger8, bigInteger)) {
                break;
            }
            bigInteger5 = bigInteger6;
            bigInteger7 = bigInteger8;
            bigInteger8 = bigInteger3;
            bigInteger6 = bigIntegerSubtract;
        }
        BigInteger[] bigIntegerArr2 = {bigInteger7, bigInteger5, bigInteger8, bigInteger6, bigInteger3, bigIntegerSubtract};
        BigInteger[] bigIntegerArr3 = {bigInteger8, bigInteger6.negate()};
        BigInteger[] bigIntegerArr4 = {bigIntegerArr2[0], bigIntegerArr2[1].negate()};
        BigInteger[] bigIntegerArr5 = {bigIntegerArr2[4], bigIntegerArr2[5].negate()};
        if (!e(bigIntegerArr4, bigIntegerArr5)) {
            bigIntegerArr4 = bigIntegerArr5;
        }
        if (d(bigIntegerArr4[0].abs().max(bigIntegerArr4[1].abs()), bigInteger)) {
            c11 = 0;
        } else {
            BigInteger bigIntegerGcd = bigIntegerArr3[0].gcd(bigIntegerArr3[1]);
            BigInteger bigInteger10 = ECConstants.ONE;
            if (bigIntegerGcd.equals(bigInteger10)) {
                BigInteger bigInteger11 = bigIntegerArr3[0];
                BigInteger bigInteger12 = bigIntegerArr3[1];
                BigInteger bigIntegerDivide = bigInteger11.add(bigInteger12.multiply(bigInteger2)).divide(bigInteger);
                BigInteger bigIntegerAbs = bigInteger12.abs();
                BigInteger[] bigIntegerArr6 = {bigIntegerDivide.abs(), bigIntegerAbs};
                boolean z10 = bigIntegerArr6[0].compareTo(bigIntegerAbs) < 0;
                if (z10) {
                    BigInteger bigInteger13 = bigIntegerArr6[0];
                    bigIntegerArr6[0] = bigIntegerArr6[1];
                    bigIntegerArr6[1] = bigInteger13;
                }
                BigInteger bigInteger14 = bigIntegerArr6[0];
                BigInteger bigInteger15 = bigIntegerArr6[1];
                BigInteger bigInteger16 = ECConstants.ZERO;
                BigInteger bigInteger17 = bigInteger14;
                BigInteger bigInteger18 = bigInteger16;
                BigInteger bigInteger19 = bigInteger15;
                BigInteger bigInteger20 = bigInteger10;
                while (true) {
                    bigInteger4 = ECConstants.ONE;
                    if (bigInteger19.compareTo(bigInteger4) <= 0) {
                        break;
                    }
                    BigInteger[] bigIntegerArrDivideAndRemainder2 = bigInteger17.divideAndRemainder(bigInteger19);
                    BigInteger bigInteger21 = bigIntegerArrDivideAndRemainder2[c10];
                    BigInteger bigInteger22 = bigIntegerArrDivideAndRemainder2[1];
                    BigInteger bigIntegerSubtract2 = bigInteger10.subtract(bigInteger21.multiply(bigInteger16));
                    BigInteger bigIntegerSubtract3 = bigInteger18.subtract(bigInteger21.multiply(bigInteger20));
                    bigInteger17 = bigInteger19;
                    c10 = 0;
                    bigInteger19 = bigInteger22;
                    BigInteger bigInteger23 = bigInteger20;
                    bigInteger20 = bigIntegerSubtract3;
                    bigInteger18 = bigInteger23;
                    BigInteger bigInteger24 = bigInteger16;
                    bigInteger16 = bigIntegerSubtract2;
                    bigInteger10 = bigInteger24;
                }
                if (bigInteger19.signum() <= 0) {
                    bigIntegerArr = null;
                    c12 = 0;
                    c13 = 1;
                } else {
                    c12 = 0;
                    c13 = 1;
                    bigIntegerArr = new BigInteger[]{bigInteger16, bigInteger20};
                    if (z10) {
                        bigIntegerArr[0] = bigInteger20;
                        bigIntegerArr[1] = bigInteger16;
                    }
                }
                if (bigIntegerArr != null) {
                    BigInteger bigIntegerNegate = bigIntegerArr[c12];
                    BigInteger bigIntegerNegate2 = bigIntegerArr[c13];
                    if (bigIntegerDivide.signum() < 0) {
                        bigIntegerNegate = bigIntegerNegate.negate();
                    }
                    if (bigInteger12.signum() > 0) {
                        bigIntegerNegate2 = bigIntegerNegate2.negate();
                    }
                    if (!bigIntegerDivide.multiply(bigIntegerNegate).subtract(bigInteger12.multiply(bigIntegerNegate2)).equals(bigInteger4)) {
                        throw new IllegalStateException();
                    }
                    BigInteger bigIntegerSubtract4 = bigIntegerNegate2.multiply(bigInteger).subtract(bigIntegerNegate.multiply(bigInteger2));
                    BigInteger bigIntegerNegate3 = bigIntegerNegate.negate();
                    BigInteger bigIntegerNegate4 = bigIntegerSubtract4.negate();
                    BigInteger bigIntegerSubtract5 = bigInteger.subtract(bigInteger4);
                    BigInteger bigIntegerShiftRight2 = bigIntegerSubtract5.shiftRight(bigIntegerSubtract5.bitLength() / 2);
                    while (true) {
                        bigIntegerShiftRight = bigIntegerShiftRight2.add(bigIntegerSubtract5.divide(bigIntegerShiftRight2)).shiftRight(1);
                        if (bigIntegerShiftRight.equals(bigIntegerShiftRight2)) {
                            break;
                        } else {
                            bigIntegerShiftRight2 = bigIntegerShiftRight;
                        }
                    }
                    BigInteger bigIntegerAdd = bigIntegerShiftRight.add(ECConstants.ONE);
                    BigInteger[] bigIntegerArrA = a(bigIntegerNegate3, bigIntegerAdd, bigInteger12);
                    BigInteger[] bigIntegerArrA2 = a(bigIntegerNegate4, bigIntegerAdd, bigInteger11);
                    char c15 = 0;
                    BigInteger bigIntegerMax = bigIntegerArrA[0].max(bigIntegerArrA2[0]);
                    BigInteger bigIntegerMin = bigIntegerArrA[1].min(bigIntegerArrA2[1]);
                    BigInteger[] bigIntegerArr7 = bigIntegerMax.compareTo(bigIntegerMin) <= 0 ? new BigInteger[]{bigIntegerMax, bigIntegerMin} : null;
                    if (bigIntegerArr7 != null) {
                        BigInteger bigIntegerAdd2 = bigIntegerArr7[0];
                        for (c14 = 1; bigIntegerAdd2.compareTo(bigIntegerArr7[c14]) <= 0; c14 = 1) {
                            BigInteger[] bigIntegerArr8 = new BigInteger[2];
                            bigIntegerArr8[c15] = bigIntegerSubtract4.add(bigIntegerAdd2.multiply(bigInteger11));
                            bigIntegerArr8[c14] = bigIntegerNegate.add(bigIntegerAdd2.multiply(bigInteger12));
                            if (e(bigIntegerArr8, bigIntegerArr4)) {
                                bigIntegerArr4 = bigIntegerArr8;
                            }
                            bigIntegerAdd2 = bigIntegerAdd2.add(ECConstants.ONE);
                            c15 = 0;
                        }
                        c11 = c15;
                    } else {
                        c11 = 0;
                    }
                } else {
                    c11 = 0;
                }
            } else {
                c11 = 0;
            }
        }
        BigInteger bigIntegerSubtract6 = bigIntegerArr3[c11].multiply(bigIntegerArr4[1]).subtract(bigIntegerArr3[1].multiply(bigIntegerArr4[c11]));
        int iBitLength = (bigInteger.bitLength() + 16) - (bigInteger.bitLength() & 7);
        BigInteger bigIntegerJ = j(bigIntegerArr4[1].shiftLeft(iBitLength), bigIntegerSubtract6);
        BigInteger bigIntegerNegate5 = j(bigIntegerArr3[1].shiftLeft(iBitLength), bigIntegerSubtract6).negate();
        h("{ " + bigIntegerArr3[0].toString(16) + ", " + bigIntegerArr3[1].toString(16) + " }", ConfigConstantsKt.CUSTOMERS_API_VERSION);
        h("{ " + bigIntegerArr4[0].toString(16) + ", " + bigIntegerArr4[1].toString(16) + " }", "v2");
        h(bigIntegerSubtract6.toString(16), "d");
        h(bigIntegerJ.toString(16), "(OPT) g1");
        h(bigIntegerNegate5.toString(16), "(OPT) g2");
        h(Integer.toString(iBitLength), "(OPT) bits");
    }

    public static BigInteger j(BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z10 = bigInteger.signum() != bigInteger2.signum();
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        BigInteger bigIntegerDivide = bigIntegerAbs.add(bigIntegerAbs2.shiftRight(1)).divide(bigIntegerAbs2);
        return z10 ? bigIntegerDivide.negate() : bigIntegerDivide;
    }

    public static BigInteger[] k(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        ECFieldElement eCFieldElementSqrt = new ECFieldElement.Fp(bigInteger, bigInteger3.multiply(bigInteger3).subtract(bigInteger2.multiply(bigInteger4).shiftLeft(2)).mod(bigInteger)).sqrt();
        if (eCFieldElementSqrt == null) {
            throw new IllegalStateException("Solving quadratic equation failed unexpectedly");
        }
        BigInteger bigInteger5 = eCFieldElementSqrt.toBigInteger();
        BigInteger bigIntegerModInverse = bigInteger2.shiftLeft(1).modInverse(bigInteger);
        return new BigInteger[]{bigInteger5.subtract(bigInteger3).multiply(bigIntegerModInverse).mod(bigInteger), bigInteger5.negate().subtract(bigInteger3).multiply(bigIntegerModInverse).mod(bigInteger)};
    }

    public static void main(String[] strArr) {
        if (strArr.length > 0) {
            for (String str : strArr) {
                b(str);
            }
            return;
        }
        Enumeration names = ECNamedCurveTable.getNames();
        ArrayList arrayList = new ArrayList();
        while (names.hasMoreElements()) {
            arrayList.add(names.nextElement());
        }
        TreeSet treeSet = new TreeSet(arrayList);
        Enumeration names2 = CustomNamedCurves.getNames();
        ArrayList arrayList2 = new ArrayList();
        while (names2.hasMoreElements()) {
            arrayList2.add(names2.nextElement());
        }
        treeSet.addAll(arrayList2);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
    }
}
