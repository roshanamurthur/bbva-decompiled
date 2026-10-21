package bc.org.bouncycastle.math.ec.tools;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;
import bc.org.bouncycastle.math.ec.ECAlgorithms;
import bc.org.bouncycastle.math.ec.ECConstants;
import bc.org.bouncycastle.math.ec.ECCurve;
import bc.org.bouncycastle.math.ec.ECFieldElement;
import bc.org.bouncycastle.math.ec.ECPoint;
import com.bbva.glomoconfig.constants.ConfigConstantsKt;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o0;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class DiscoverEndomorphisms {
    public static void a(X9ECParameters x9ECParameters) {
        BigInteger bigIntegerModPow;
        BigInteger n7 = x9ECParameters.getN();
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger bigInteger2 = new ECFieldElement.Fp(n7, bigInteger.multiply(bigInteger).subtract(bigInteger.shiftLeft(2)).mod(n7)).sqrt().toBigInteger();
        BigInteger bigIntegerSubtract = n7.subtract(bigInteger2);
        if (bigInteger2.testBit(0)) {
            bigIntegerSubtract = bigIntegerSubtract.add(n7);
        } else {
            bigInteger2 = bigInteger2.add(n7);
        }
        BigInteger[] bigIntegerArr = {bigInteger2.shiftRight(1), bigIntegerSubtract.shiftRight(1)};
        ECCurve curve = x9ECParameters.getCurve();
        BigInteger bigIntegerC = curve.getField().c();
        BigInteger bigIntegerDivide = bigIntegerC.divide(ECConstants.THREE);
        SecureRandom secureRandom = new SecureRandom();
        do {
            BigInteger bigInteger3 = ECConstants.TWO;
            bigIntegerModPow = o0.a(bigInteger3, bigIntegerC.subtract(bigInteger3), secureRandom).modPow(bigIntegerDivide, bigIntegerC);
        } while (bigIntegerModPow.equals(ECConstants.ONE));
        ECFieldElement eCFieldElementFromBigInteger = curve.fromBigInteger(bigIntegerModPow);
        ECFieldElement[] eCFieldElementArr = {eCFieldElementFromBigInteger, eCFieldElementFromBigInteger.square()};
        b(x9ECParameters, bigIntegerArr[0], eCFieldElementArr);
        b(x9ECParameters, bigIntegerArr[1], eCFieldElementArr);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x022b  */
    public static void b(X9ECParameters x9ECParameters, BigInteger bigInteger, ECFieldElement[] eCFieldElementArr) {
        BigInteger bigInteger2;
        BigInteger bigIntegerSubtract;
        char c10;
        BigInteger bigInteger3;
        BigInteger[] bigIntegerArr;
        char c11;
        char c12;
        char c13;
        BigInteger bigIntegerShiftRight;
        int i10;
        BigInteger[] bigIntegerArr2;
        ECPoint eCPointNormalize = x9ECParameters.getG().normalize();
        ECPoint eCPointNormalize2 = eCPointNormalize.multiply(bigInteger).normalize();
        if (!eCPointNormalize.getYCoord().equals(eCPointNormalize2.getYCoord())) {
            throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
        }
        char c14 = 0;
        ECFieldElement eCFieldElement = eCFieldElementArr[0];
        if (!eCPointNormalize.getXCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getXCoord())) {
            eCFieldElement = eCFieldElementArr[1];
            if (!eCPointNormalize.getXCoord().multiply(eCFieldElement).equals(eCPointNormalize2.getXCoord())) {
                throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
            }
        }
        BigInteger n7 = x9ECParameters.getN();
        BigInteger bigInteger4 = ECConstants.ZERO;
        BigInteger bigInteger5 = ECConstants.ONE;
        BigInteger bigInteger6 = bigInteger;
        BigInteger bigInteger7 = n7;
        while (true) {
            BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger7.divideAndRemainder(bigInteger6);
            BigInteger bigInteger8 = bigIntegerArrDivideAndRemainder[0];
            bigInteger2 = bigIntegerArrDivideAndRemainder[1];
            bigIntegerSubtract = bigInteger4.subtract(bigInteger8.multiply(bigInteger5));
            if (e(bigInteger6, n7)) {
                break;
            }
            bigInteger4 = bigInteger5;
            bigInteger7 = bigInteger6;
            bigInteger6 = bigInteger2;
            bigInteger5 = bigIntegerSubtract;
        }
        BigInteger[] bigIntegerArr3 = {bigInteger7, bigInteger4, bigInteger6, bigInteger5, bigInteger2, bigIntegerSubtract};
        BigInteger[] bigIntegerArr4 = {bigInteger6, bigInteger5.negate()};
        BigInteger[] bigIntegerArr5 = {bigIntegerArr3[0], bigIntegerArr3[1].negate()};
        BigInteger[] bigIntegerArr6 = {bigIntegerArr3[4], bigIntegerArr3[5].negate()};
        if (!f(bigIntegerArr5, bigIntegerArr6)) {
            bigIntegerArr5 = bigIntegerArr6;
        }
        if (e(bigIntegerArr5[0].abs().max(bigIntegerArr5[1].abs()), n7)) {
            c10 = 0;
        } else {
            BigInteger bigIntegerGcd = bigIntegerArr4[0].gcd(bigIntegerArr4[1]);
            BigInteger bigInteger9 = ECConstants.ONE;
            if (bigIntegerGcd.equals(bigInteger9)) {
                BigInteger bigInteger10 = bigIntegerArr4[0];
                BigInteger bigInteger11 = bigIntegerArr4[1];
                BigInteger bigIntegerDivide = bigInteger10.add(bigInteger11.multiply(bigInteger)).divide(n7);
                BigInteger bigIntegerAbs = bigInteger11.abs();
                BigInteger[] bigIntegerArr7 = {bigIntegerDivide.abs(), bigIntegerAbs};
                boolean z10 = bigIntegerArr7[0].compareTo(bigIntegerAbs) < 0;
                if (z10) {
                    BigInteger bigInteger12 = bigIntegerArr7[0];
                    bigIntegerArr7[0] = bigIntegerArr7[1];
                    bigIntegerArr7[1] = bigInteger12;
                }
                BigInteger bigInteger13 = bigIntegerArr7[0];
                BigInteger bigInteger14 = bigIntegerArr7[1];
                BigInteger bigInteger15 = ECConstants.ZERO;
                BigInteger bigInteger16 = bigInteger13;
                BigInteger bigInteger17 = bigInteger15;
                BigInteger bigInteger18 = bigInteger14;
                BigInteger bigInteger19 = bigInteger9;
                while (true) {
                    bigInteger3 = ECConstants.ONE;
                    if (bigInteger18.compareTo(bigInteger3) <= 0) {
                        break;
                    }
                    BigInteger[] bigIntegerArrDivideAndRemainder2 = bigInteger16.divideAndRemainder(bigInteger18);
                    BigInteger bigInteger20 = bigIntegerArrDivideAndRemainder2[c14];
                    BigInteger bigInteger21 = bigIntegerArrDivideAndRemainder2[1];
                    BigInteger bigIntegerSubtract2 = bigInteger19.subtract(bigInteger20.multiply(bigInteger15));
                    BigInteger bigIntegerSubtract3 = bigInteger17.subtract(bigInteger20.multiply(bigInteger9));
                    bigInteger17 = bigInteger9;
                    bigInteger19 = bigInteger15;
                    bigInteger15 = bigIntegerSubtract2;
                    bigInteger9 = bigIntegerSubtract3;
                    c14 = 0;
                    BigInteger bigInteger22 = bigInteger18;
                    bigInteger18 = bigInteger21;
                    bigInteger16 = bigInteger22;
                }
                if (bigInteger18.signum() <= 0) {
                    c11 = 0;
                    bigIntegerArr = null;
                    c12 = 1;
                } else {
                    c11 = 0;
                    c12 = 1;
                    bigIntegerArr = new BigInteger[]{bigInteger15, bigInteger9};
                    if (z10) {
                        bigIntegerArr[0] = bigInteger9;
                        bigIntegerArr[1] = bigInteger15;
                    }
                }
                if (bigIntegerArr != null) {
                    BigInteger bigIntegerNegate = bigIntegerArr[c11];
                    BigInteger bigIntegerNegate2 = bigIntegerArr[c12];
                    if (bigIntegerDivide.signum() < 0) {
                        bigIntegerNegate = bigIntegerNegate.negate();
                    }
                    if (bigInteger11.signum() > 0) {
                        bigIntegerNegate2 = bigIntegerNegate2.negate();
                    }
                    if (!bigIntegerDivide.multiply(bigIntegerNegate).subtract(bigInteger11.multiply(bigIntegerNegate2)).equals(bigInteger3)) {
                        throw new IllegalStateException();
                    }
                    BigInteger bigIntegerSubtract4 = bigIntegerNegate2.multiply(n7).subtract(bigIntegerNegate.multiply(bigInteger));
                    BigInteger bigIntegerNegate3 = bigIntegerNegate.negate();
                    BigInteger bigIntegerNegate4 = bigIntegerSubtract4.negate();
                    BigInteger bigIntegerSubtract5 = n7.subtract(bigInteger3);
                    BigInteger bigIntegerShiftRight2 = bigIntegerSubtract5.shiftRight(bigIntegerSubtract5.bitLength() / 2);
                    while (true) {
                        c13 = 1;
                        bigIntegerShiftRight = bigIntegerShiftRight2.add(bigIntegerSubtract5.divide(bigIntegerShiftRight2)).shiftRight(1);
                        if (bigIntegerShiftRight.equals(bigIntegerShiftRight2)) {
                            break;
                        } else {
                            bigIntegerShiftRight2 = bigIntegerShiftRight;
                        }
                    }
                    BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger3);
                    BigInteger[] bigIntegerArrD = d(bigIntegerNegate3, bigIntegerAdd, bigInteger11);
                    BigInteger[] bigIntegerArrD2 = d(bigIntegerNegate4, bigIntegerAdd, bigInteger10);
                    char c15 = 0;
                    BigInteger bigIntegerMax = bigIntegerArrD[0].max(bigIntegerArrD2[0]);
                    BigInteger bigIntegerMin = bigIntegerArrD[1].min(bigIntegerArrD2[1]);
                    if (bigIntegerMax.compareTo(bigIntegerMin) > 0) {
                        bigIntegerArr2 = null;
                        i10 = 2;
                    } else {
                        i10 = 2;
                        bigIntegerArr2 = new BigInteger[]{bigIntegerMax, bigIntegerMin};
                    }
                    if (bigIntegerArr2 != null) {
                        BigInteger bigIntegerAdd2 = bigIntegerArr2[0];
                        while (bigIntegerAdd2.compareTo(bigIntegerArr2[c13]) <= 0) {
                            BigInteger[] bigIntegerArr8 = new BigInteger[i10];
                            bigIntegerArr8[c15] = bigIntegerSubtract4.add(bigIntegerAdd2.multiply(bigInteger10));
                            bigIntegerArr8[c13] = bigIntegerNegate.add(bigIntegerAdd2.multiply(bigInteger11));
                            if (f(bigIntegerArr8, bigIntegerArr5)) {
                                bigIntegerArr5 = bigIntegerArr8;
                            }
                            bigIntegerAdd2 = bigIntegerAdd2.add(ECConstants.ONE);
                            c13 = 1;
                            c15 = 0;
                        }
                        c10 = c15;
                    } else {
                        c10 = 0;
                    }
                } else {
                    c10 = 0;
                }
            } else {
                c10 = 0;
            }
        }
        BigInteger bigIntegerSubtract6 = bigIntegerArr4[c10].multiply(bigIntegerArr5[1]).subtract(bigIntegerArr4[1].multiply(bigIntegerArr5[c10]));
        int iBitLength = (n7.bitLength() + 16) - (n7.bitLength() & 7);
        BigInteger bigIntegerG = g(bigIntegerArr5[1].shiftLeft(iBitLength), bigIntegerSubtract6);
        BigInteger bigIntegerNegate5 = g(bigIntegerArr4[1].shiftLeft(iBitLength), bigIntegerSubtract6).negate();
        c("Beta", eCFieldElement.toBigInteger().toString(16));
        c("Lambda", bigInteger.toString(16));
        c(ConfigConstantsKt.CUSTOMERS_API_VERSION, "{ " + bigIntegerArr4[0].toString(16) + ", " + bigIntegerArr4[1].toString(16) + " }");
        c("v2", "{ " + bigIntegerArr5[0].toString(16) + ", " + bigIntegerArr5[1].toString(16) + " }");
        c("d", bigIntegerSubtract6.toString(16));
        c("(OPT) g1", bigIntegerG.toString(16));
        c("(OPT) g2", bigIntegerNegate5.toString(16));
        c("(OPT) bits", Integer.toString(iBitLength));
    }

    public static void c(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("  ");
        stringBuffer.append(str);
        while (stringBuffer.length() < 20) {
            stringBuffer.append(' ');
        }
        stringBuffer.append("= ");
        stringBuffer.append(str2.toString());
    }

    public static BigInteger[] d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger bigIntegerDivide = bigInteger.subtract(bigInteger2).divide(bigInteger3);
        BigInteger bigIntegerDivide2 = bigInteger.add(bigInteger2).divide(bigInteger3);
        return bigIntegerDivide.compareTo(bigIntegerDivide2) <= 0 ? new BigInteger[]{bigIntegerDivide, bigIntegerDivide2} : new BigInteger[]{bigIntegerDivide2, bigIntegerDivide};
    }

    public static void discoverEndomorphisms(X9ECParameters x9ECParameters) {
        if (x9ECParameters == null) {
            throw new NullPointerException("x9");
        }
        ECCurve curve = x9ECParameters.getCurve();
        if (ECAlgorithms.isFpCurve(curve)) {
            BigInteger bigIntegerC = curve.getField().c();
            if (curve.getA().isZero() && bigIntegerC.mod(ECConstants.THREE).equals(ECConstants.ONE)) {
                a(x9ECParameters);
            }
        }
    }

    public static boolean e(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iBitLength = bigIntegerAbs2.bitLength();
        int iBitLength2 = bigIntegerAbs.bitLength() * 2;
        return iBitLength2 + (-1) <= iBitLength && (iBitLength2 < iBitLength || bigIntegerAbs.multiply(bigIntegerAbs).compareTo(bigIntegerAbs2) < 0);
    }

    public static boolean f(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
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

    public static BigInteger g(BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z10 = bigInteger.signum() != bigInteger2.signum();
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        BigInteger bigIntegerDivide = bigIntegerAbs.add(bigIntegerAbs2.shiftRight(1)).divide(bigIntegerAbs2);
        return z10 ? bigIntegerDivide.negate() : bigIntegerDivide;
    }

    public static void main(String[] strArr) {
        if (strArr.length < 1) {
            return;
        }
        for (String str : strArr) {
            X9ECParameters x9ECParametersA = n2.a(str);
            if (x9ECParametersA != null) {
                ECCurve curve = x9ECParametersA.getCurve();
                if (ECAlgorithms.isFpCurve(curve)) {
                    BigInteger bigIntegerC = curve.getField().c();
                    if (curve.getA().isZero() && bigIntegerC.mod(ECConstants.THREE).equals(ECConstants.ONE)) {
                        a(x9ECParametersA);
                    }
                }
            }
        }
    }
}
