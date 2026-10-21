package org.bouncycastle.crypto.generators;

import androidx.appcompat.widget.o1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.esotericsoftware.asm.Opcodes;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f88772b = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, Opcodes.ATHROW, Opcodes.INSTANCEOF, Opcodes.MULTIANEWARRAY, Opcodes.IFNONNULL, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, TypedValues.AttributesType.TYPE_EASING, 331, 337, 347, 349, ResultCode.ERROR_CONN_SSL_KEY, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY, 523, 541, 547, 557};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f88773c = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NaccacheSternKeyGenerationParameters f88774a;

    public static BigInteger a(int i10, int i11, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomPrime;
        do {
            bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(i10, i11, secureRandom);
        } while (bigIntegerCreateRandomPrime.bitLength() != i10);
        return bigIntegerCreateRandomPrime;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        long j10;
        BigInteger bigIntegerA;
        BigInteger bigIntegerAdd;
        BigInteger bigIntegerA2;
        BigInteger bigIntegerAdd2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        long j11;
        BigInteger bigInteger3;
        BigInteger bigIntegerMod;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        PrintStream printStream;
        StringBuilder sb2;
        BigInteger bigInteger6;
        BigInteger bigIntegerCreateRandomPrime;
        int i10;
        int iNextInt;
        int i11;
        int iNextInt2;
        int strength = this.f88774a.getStrength();
        SecureRandom random = this.f88774a.getRandom();
        int certainty = this.f88774a.getCertainty();
        boolean zIsDebug = this.f88774a.isDebug();
        if (zIsDebug) {
            System.out.println("Fetching first " + this.f88774a.getCntSmallPrimes() + " primes.");
        }
        int cntSmallPrimes = this.f88774a.getCntSmallPrimes();
        Vector vector = new Vector(cntSmallPrimes);
        for (int i12 = 0; i12 != cntSmallPrimes; i12++) {
            vector.addElement(BigInteger.valueOf(f88772b[i12]));
        }
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i13 = 0; i13 < vector.size(); i13++) {
            vector3.addElement(vector.elementAt(i13));
        }
        vector2.addElement(vector3.elementAt(0));
        vector3.removeElementAt(0);
        while (vector3.size() != 0) {
            Object objElementAt = vector3.elementAt(0);
            int size = vector2.size();
            int i14 = size + 1;
            if (((-i14) & i14) == i14) {
                iNextInt2 = (int) ((((long) i14) * ((long) (random.nextInt() & Integer.MAX_VALUE))) >> 31);
            } else {
                do {
                    iNextInt = random.nextInt() & Integer.MAX_VALUE;
                    i11 = iNextInt % i14;
                } while ((iNextInt - i11) + size < 0);
                iNextInt2 = i11;
            }
            vector2.insertElementAt(objElementAt, iNextInt2);
            vector3.removeElementAt(0);
        }
        BigInteger bigInteger7 = f88773c;
        BigInteger bigIntegerMultiply = bigInteger7;
        for (int i15 = 0; i15 < vector2.size() / 2; i15++) {
            bigIntegerMultiply = bigIntegerMultiply.multiply((BigInteger) vector2.elementAt(i15));
        }
        BigInteger bigIntegerMultiply2 = bigInteger7;
        for (int size2 = vector2.size() / 2; size2 < vector2.size(); size2++) {
            bigIntegerMultiply2 = bigIntegerMultiply2.multiply((BigInteger) vector2.elementAt(size2));
        }
        BigInteger bigIntegerMultiply3 = bigIntegerMultiply.multiply(bigIntegerMultiply2);
        int iBitLength = (((strength - bigIntegerMultiply3.bitLength()) - 48) / 2) + 1;
        BigInteger bigIntegerA3 = a(iBitLength, certainty, random);
        BigInteger bigIntegerA4 = a(iBitLength, certainty, random);
        if (zIsDebug) {
            System.out.println("generating p and q");
        }
        BigInteger bigIntegerShiftLeft = bigIntegerA3.multiply(bigIntegerMultiply).shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bigIntegerA4.multiply(bigIntegerMultiply2).shiftLeft(1);
        long j12 = 0;
        while (true) {
            j10 = j12 + 1;
            bigIntegerA = a(24, certainty, random);
            bigIntegerAdd = bigIntegerA.multiply(bigIntegerShiftLeft).add(bigInteger7);
            BigInteger bigInteger8 = bigIntegerShiftLeft;
            if (bigIntegerAdd.isProbablePrime(certainty)) {
                do {
                    do {
                        bigIntegerA2 = a(24, certainty, random);
                    } while (bigIntegerA.equals(bigIntegerA2));
                    bigIntegerAdd2 = bigIntegerA2.multiply(bigIntegerShiftLeft2).add(bigInteger7);
                } while (!bigIntegerAdd2.isProbablePrime(certainty));
                bigInteger = bigIntegerShiftLeft2;
                if (!bigIntegerMultiply3.gcd(bigIntegerA.multiply(bigIntegerA2)).equals(bigInteger7)) {
                    continue;
                } else {
                    if (bigIntegerAdd.multiply(bigIntegerAdd2).bitLength() >= strength) {
                        break;
                    }
                    if (zIsDebug) {
                        PrintStream printStream2 = System.out;
                        StringBuilder sbC = o1.c("key size too small. Should be ", strength, " but is actually ");
                        sbC.append(bigIntegerAdd.multiply(bigIntegerAdd2).bitLength());
                        printStream2.println(sbC.toString());
                    }
                }
            } else {
                bigInteger = bigIntegerShiftLeft2;
            }
            bigIntegerShiftLeft = bigInteger8;
            bigIntegerShiftLeft2 = bigInteger;
            j12 = j10;
        }
        BigInteger bigInteger9 = bigIntegerA4;
        if (zIsDebug) {
            System.out.println("needed " + j10 + " tries to generate p and q.");
        }
        BigInteger bigIntegerMultiply4 = bigIntegerAdd.multiply(bigIntegerAdd2);
        BigInteger bigIntegerMultiply5 = bigIntegerAdd.subtract(bigInteger7).multiply(bigIntegerAdd2.subtract(bigInteger7));
        if (zIsDebug) {
            System.out.println("generating g");
        }
        long j13 = 0;
        while (true) {
            Vector vector4 = new Vector();
            bigInteger2 = bigIntegerAdd2;
            j11 = j13;
            int i16 = 0;
            while (i16 != vector2.size()) {
                BigInteger bigIntegerDivide = bigIntegerMultiply5.divide((BigInteger) vector2.elementAt(i16));
                while (true) {
                    j11++;
                    bigInteger6 = bigIntegerAdd;
                    bigIntegerCreateRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    i10 = strength;
                    if (bigIntegerCreateRandomPrime.modPow(bigIntegerDivide, bigIntegerMultiply4).equals(bigInteger7)) {
                        bigIntegerAdd = bigInteger6;
                        strength = i10;
                    }
                }
                vector4.addElement(bigIntegerCreateRandomPrime);
                i16++;
                bigIntegerAdd = bigInteger6;
                strength = i10;
            }
            int i17 = strength;
            bigInteger3 = bigIntegerAdd;
            bigIntegerMod = bigInteger7;
            for (int i18 = 0; i18 < vector2.size(); i18++) {
                bigIntegerMod = bigIntegerMod.multiply(((BigInteger) vector4.elementAt(i18)).modPow(bigIntegerMultiply3.divide((BigInteger) vector2.elementAt(i18)), bigIntegerMultiply4)).mod(bigIntegerMultiply4);
            }
            int i19 = 0;
            while (true) {
                if (i19 >= vector2.size()) {
                    if (!bigIntegerMod.modPow(bigIntegerMultiply5.divide(BigInteger.valueOf(4L)), bigIntegerMultiply4).equals(bigInteger7)) {
                        if (!bigIntegerMod.modPow(bigIntegerMultiply5.divide(bigIntegerA), bigIntegerMultiply4).equals(bigInteger7)) {
                            if (!bigIntegerMod.modPow(bigIntegerMultiply5.divide(bigIntegerA2), bigIntegerMultiply4).equals(bigInteger7)) {
                                bigInteger4 = bigIntegerA3;
                                if (!bigIntegerMod.modPow(bigIntegerMultiply5.divide(bigInteger4), bigIntegerMultiply4).equals(bigInteger7)) {
                                    bigInteger5 = bigInteger9;
                                    if (!bigIntegerMod.modPow(bigIntegerMultiply5.divide(bigInteger5), bigIntegerMultiply4).equals(bigInteger7)) {
                                        break;
                                    }
                                    if (zIsDebug) {
                                        System.out.println("g has order phi(n)/b\n g: " + bigIntegerMod);
                                    }
                                } else {
                                    if (zIsDebug) {
                                        System.out.println("g has order phi(n)/a\n g: " + bigIntegerMod);
                                    }
                                    bigInteger5 = bigInteger9;
                                }
                            } else if (zIsDebug) {
                                printStream = System.out;
                                sb2 = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb2.append(bigIntegerMod);
                                printStream.println(sb2.toString());
                            }
                        } else if (zIsDebug) {
                            printStream = System.out;
                            sb2 = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb2.append(bigIntegerMod);
                            printStream.println(sb2.toString());
                        }
                    } else if (zIsDebug) {
                        printStream = System.out;
                        sb2 = new StringBuilder("g has order phi(n)/4\n g:");
                        sb2.append(bigIntegerMod);
                        printStream.println(sb2.toString());
                    }
                    bigIntegerA3 = bigInteger4;
                    random = random;
                    j13 = j11;
                    bigIntegerAdd2 = bigInteger2;
                    bigIntegerAdd = bigInteger3;
                    strength = i17;
                    bigInteger9 = bigInteger5;
                } else if (!bigIntegerMod.modPow(bigIntegerMultiply5.divide((BigInteger) vector2.elementAt(i19)), bigIntegerMultiply4).equals(bigInteger7)) {
                    i19++;
                } else if (zIsDebug) {
                    System.out.println("g has order phi(n)/" + vector2.elementAt(i19) + "\n g: " + bigIntegerMod);
                }
                bigInteger5 = bigInteger9;
                bigInteger4 = bigIntegerA3;
                bigIntegerA3 = bigInteger4;
                random = random;
                j13 = j11;
                bigIntegerAdd2 = bigInteger2;
                bigIntegerAdd = bigInteger3;
                strength = i17;
                bigInteger9 = bigInteger5;
            }
        }
        if (zIsDebug) {
            PrintStream printStream3 = System.out;
            printStream3.println("needed " + j11 + " tries to generate g");
            printStream3.println();
            printStream3.println("found new NaccacheStern cipher variables:");
            printStream3.println("smallPrimes: " + vector2);
            printStream3.println("sigma:...... " + bigIntegerMultiply3 + " (" + bigIntegerMultiply3.bitLength() + " bits)");
            StringBuilder sb3 = new StringBuilder("a:.......... ");
            sb3.append(bigInteger4);
            printStream3.println(sb3.toString());
            printStream3.println("b:.......... " + bigInteger5);
            printStream3.println("p':......... " + bigIntegerA);
            printStream3.println("q':......... " + bigIntegerA2);
            printStream3.println("p:.......... " + bigInteger3);
            printStream3.println("q:.......... " + bigInteger2);
            printStream3.println("n:.......... " + bigIntegerMultiply4);
            printStream3.println("phi(n):..... " + bigIntegerMultiply5);
            printStream3.println("g:.......... " + bigIntegerMod);
            printStream3.println();
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigIntegerMod, bigIntegerMultiply4, bigIntegerMultiply3.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigIntegerMod, bigIntegerMultiply4, bigIntegerMultiply3.bitLength(), vector2, bigIntegerMultiply5));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.f88774a = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
    }
}
