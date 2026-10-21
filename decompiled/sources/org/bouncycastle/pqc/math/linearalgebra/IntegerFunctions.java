package org.bouncycastle.pqc.math.linearalgebra;

import androidx.appcompat.widget.o1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.esotericsoftware.asm.Opcodes;
import com.google.zxing.pdf417.PDF417Common;
import com.mastercard.sonic.StatusCode;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes13.dex */
public final class IntegerFunctions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f91615a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f91616b = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f91617c = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f91618d = BigInteger.valueOf(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f91619e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static SecureRandom f91620f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f91621g = {0, 1, 0, -1, 0, -1, 0, 1};

    public static double a(double d2) {
        double[] dArr = {1.0d, 0.5849625007211562d, 0.32192809488736235d, 0.16992500144231237d, 0.0874628412503394d, 0.044394119358453436d, 0.02236781302845451d, 0.01122725542325412d, 0.005624549193878107d, 0.0028150156070540383d, 0.0014081943928083889d, 7.042690112466433E-4d, 3.5217748030102726E-4d, 1.7609948644250602E-4d, 8.80524301221769E-5d, 4.4026886827316716E-5d, 2.2013611360340496E-5d, 1.1006847667481442E-5d, 5.503434330648604E-6d, 2.751719789561283E-6d, 1.375860550841138E-6d, 6.879304394358497E-7d, 3.4396526072176454E-7d, 1.7198264061184464E-7d, 8.599132286866321E-8d, 4.299566207501687E-8d, 2.1497831197679756E-8d, 1.0748915638882709E-8d, 5.374457829452062E-9d, 2.687228917228708E-9d, 1.3436144592400231E-9d, 6.718072297764289E-10d, 3.3590361492731876E-10d, 1.6795180747343547E-10d, 8.397590373916176E-11d, 4.1987951870191886E-11d, 2.0993975935248694E-11d, 1.0496987967662534E-11d, 5.2484939838408146E-12d, 2.624246991922794E-12d, 1.3121234959619935E-12d, 6.56061747981146E-13d, 3.2803087399061026E-13d, 1.6401543699531447E-13d, 8.200771849765956E-14d, 4.1003859248830365E-14d, 2.0501929624415328E-14d, 1.02509648122077E-14d, 5.1254824061038595E-15d, 2.5627412030519317E-15d, 1.2813706015259665E-15d, 6.406853007629834E-16d, 3.203426503814917E-16d, 1.6017132519074588E-16d, 8.008566259537294E-17d, 4.004283129768647E-17d, 2.0021415648843235E-17d, 1.0010707824421618E-17d, 5.005353912210809E-18d, 2.5026769561054044E-18d, 1.2513384780527022E-18d, 6.256692390263511E-19d, 3.1283461951317555E-19d, 1.5641730975658778E-19d, 7.820865487829389E-20d, 3.9104327439146944E-20d, 1.9552163719573472E-20d, 9.776081859786736E-21d, 4.888040929893368E-21d, 2.444020464946684E-21d, 1.222010232473342E-21d, 6.11005116236671E-22d, 3.055025581183355E-22d, 1.5275127905916775E-22d, 7.637563952958387E-23d, 3.818781976479194E-23d, 1.909390988239597E-23d, 9.546954941197984E-24d, 4.773477470598992E-24d, 2.386738735299496E-24d, 1.193369367649748E-24d, 5.96684683824874E-25d, 2.98342341912437E-25d, 1.491711709562185E-25d, 7.458558547810925E-26d, 3.7292792739054626E-26d, 1.8646396369527313E-26d, 9.323198184763657E-27d, 4.661599092381828E-27d, 2.330799546190914E-27d, 1.165399773095457E-27d, 5.826998865477285E-28d, 2.9134994327386427E-28d, 1.4567497163693213E-28d, 7.283748581846607E-29d, 3.6418742909233034E-29d, 1.8209371454616517E-29d, 9.104685727308258E-30d, 4.552342863654129E-30d, 2.2761714318270646E-30d};
        double d3 = 1.0d;
        double d7 = 0.0d;
        double d10 = 1.0d;
        for (int i10 = 0; i10 < 53; i10++) {
            double d11 = (d3 * d10) + d3;
            if (d11 <= d2) {
                d7 += dArr[i10];
                d3 = d11;
            }
            d10 *= 0.5d;
        }
        return d7;
    }

    public static BigInteger binomial(int i10, int i11) {
        BigInteger bigIntegerDivide = f91616b;
        if (i10 == 0) {
            return i11 == 0 ? bigIntegerDivide : f91615a;
        }
        if (i11 > (i10 >>> 1)) {
            i11 = i10 - i11;
        }
        for (int i12 = 1; i12 <= i11; i12++) {
            bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(i10 - (i12 - 1))).divide(BigInteger.valueOf(i12));
        }
        return bigIntegerDivide;
    }

    public static int bitCount(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>>= 1;
        }
        return i11;
    }

    public static int ceilLog(int i10) {
        int i11 = 0;
        int i12 = 1;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    public static int ceilLog256(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 < 0) {
            i10 = -i10;
        }
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 8;
        }
        return i11;
    }

    public static BigInteger divideAndRound(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.signum() < 0) {
            return divideAndRound(bigInteger.negate(), bigInteger2).negate();
        }
        return bigInteger2.signum() < 0 ? divideAndRound(bigInteger, bigInteger2.negate()).negate() : bigInteger.shiftLeft(1).add(bigInteger2).divide(bigInteger2.shiftLeft(1));
    }

    public static int[] extGCD(int i10, int i11) {
        BigInteger[] bigIntegerArrExtgcd = extgcd(BigInteger.valueOf(i10), BigInteger.valueOf(i11));
        return new int[]{bigIntegerArrExtgcd[0].intValue(), bigIntegerArrExtgcd[1].intValue(), bigIntegerArrExtgcd[2].intValue()};
    }

    public static BigInteger[] extgcd(BigInteger bigInteger, BigInteger bigInteger2) {
        int iSignum = bigInteger2.signum();
        BigInteger bigInteger3 = f91616b;
        BigInteger bigIntegerDivide = f91615a;
        if (iSignum != 0) {
            BigInteger bigInteger4 = bigInteger;
            BigInteger bigInteger5 = bigInteger2;
            while (bigInteger5.signum() != 0) {
                BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger4.divideAndRemainder(bigInteger5);
                BigInteger bigInteger6 = bigIntegerArrDivideAndRemainder[0];
                BigInteger bigInteger7 = bigIntegerArrDivideAndRemainder[1];
                bigInteger4 = bigInteger5;
                bigInteger5 = bigInteger7;
                BigInteger bigInteger8 = bigIntegerDivide;
                bigIntegerDivide = bigInteger3.subtract(bigInteger6.multiply(bigIntegerDivide));
                bigInteger3 = bigInteger8;
            }
            bigIntegerDivide = bigInteger4.subtract(bigInteger.multiply(bigInteger3)).divide(bigInteger2);
            bigInteger = bigInteger4;
        }
        return new BigInteger[]{bigInteger, bigInteger3, bigIntegerDivide};
    }

    public static float floatPow(float f6, int i10) {
        float f10 = 1.0f;
        while (i10 > 0) {
            f10 *= f6;
            i10--;
        }
        return f10;
    }

    public static int floorLog(int i10) {
        if (i10 <= 0) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = i10 >>> 1; i12 > 0; i12 >>>= 1) {
            i11++;
        }
        return i11;
    }

    public static int gcd(int i10, int i11) {
        return BigInteger.valueOf(i10).gcd(BigInteger.valueOf(i11)).intValue();
    }

    public static float intRoot(int i10, int i11) {
        float fFloatPow;
        float fFloatPow2 = i10 / i11;
        float f6 = 0.0f;
        while (Math.abs(f6 - fFloatPow2) > 1.0E-4d) {
            while (true) {
                fFloatPow = floatPow(fFloatPow2, i11);
                if (Float.isInfinite(fFloatPow)) {
                    fFloatPow2 = (fFloatPow2 + f6) / 2.0f;
                }
            }
            f6 = fFloatPow2;
            fFloatPow2 -= (fFloatPow - i10) / (floatPow(fFloatPow2, i11 - 1) * i11);
        }
        return fFloatPow2;
    }

    public static byte[] integerToOctets(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.abs().toByteArray();
        if ((bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int iBitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[iBitLength];
        System.arraycopy(byteArray, 1, bArr, 0, iBitLength);
        return bArr;
    }

    public static boolean isIncreasing(int[] iArr) {
        for (int i10 = 1; i10 < iArr.length; i10++) {
            int i11 = i10 - 1;
            if (iArr[i11] >= iArr[i10]) {
                PrintStream printStream = System.out;
                StringBuilder sbC = o1.c("a[", i11, "] = ");
                sbC.append(iArr[i11]);
                sbC.append(" >= ");
                sbC.append(iArr[i10]);
                sbC.append(" = a[");
                sbC.append(i10);
                sbC.append(Constant.BRACKET_CLOSE);
                printStream.println(sbC.toString());
                return false;
            }
        }
        return true;
    }

    public static int isPower(int i10, int i11) {
        if (i10 <= 0) {
            return -1;
        }
        int i12 = 0;
        while (i10 > 1) {
            if (i10 % i11 != 0) {
                return -1;
            }
            i10 /= i11;
            i12++;
        }
        return i12;
    }

    public static boolean isPrime(int i10) {
        if (i10 < 2) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if ((i10 & 1) == 0) {
            return false;
        }
        if (i10 < 42) {
            int i11 = 0;
            while (true) {
                int[] iArr = f91619e;
                if (i11 >= iArr.length) {
                    break;
                }
                if (i10 == iArr[i11]) {
                    return true;
                }
                i11++;
            }
        }
        if (i10 % 3 == 0 || i10 % 5 == 0 || i10 % 7 == 0 || i10 % 11 == 0 || i10 % 13 == 0 || i10 % 17 == 0 || i10 % 19 == 0 || i10 % 23 == 0 || i10 % 29 == 0 || i10 % 31 == 0 || i10 % 37 == 0 || i10 % 41 == 0) {
            return false;
        }
        return BigInteger.valueOf(i10).isProbablePrime(20);
    }

    public static int jacobi(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3;
        BigInteger bigInteger4 = f91615a;
        boolean zEquals = bigInteger2.equals(bigInteger4);
        BigInteger bigInteger5 = f91616b;
        if (zEquals) {
            return bigInteger.abs().equals(bigInteger5) ? 1 : 0;
        }
        if (!bigInteger.testBit(0) && !bigInteger2.testBit(0)) {
            return 0;
        }
        long j10 = 1;
        if (bigInteger2.signum() == -1) {
            bigInteger2 = bigInteger2.negate();
            if (bigInteger.signum() == -1) {
                j10 = -1;
            }
        }
        BigInteger bigIntegerAdd = bigInteger4;
        while (true) {
            boolean zTestBit = bigInteger2.testBit(0);
            bigInteger3 = f91617c;
            if (zTestBit) {
                break;
            }
            bigIntegerAdd = bigIntegerAdd.add(bigInteger5);
            bigInteger2 = bigInteger2.divide(bigInteger3);
        }
        boolean zTestBit2 = bigIntegerAdd.testBit(0);
        int[] iArr = f91621g;
        if (zTestBit2) {
            j10 *= (long) iArr[bigInteger.intValue() & 7];
        }
        if (bigInteger.signum() < 0) {
            if (bigInteger2.testBit(1)) {
                j10 = -j10;
            }
            bigInteger = bigInteger.negate();
        }
        while (bigInteger.signum() != 0) {
            BigInteger bigIntegerAdd2 = bigInteger4;
            while (!bigInteger.testBit(0)) {
                bigIntegerAdd2 = bigIntegerAdd2.add(bigInteger5);
                bigInteger = bigInteger.divide(bigInteger3);
            }
            if (bigIntegerAdd2.testBit(0)) {
                j10 *= (long) iArr[bigInteger2.intValue() & 7];
            }
            if (bigInteger.compareTo(bigInteger2) >= 0) {
                BigInteger bigInteger6 = bigInteger2;
                bigInteger2 = bigInteger;
                bigInteger = bigInteger6;
            } else if (bigInteger2.testBit(1) && bigInteger.testBit(1)) {
                j10 = -j10;
            }
            BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger);
            bigInteger2 = bigInteger;
            bigInteger = bigIntegerSubtract;
        }
        if (bigInteger2.equals(bigInteger5)) {
            return (int) j10;
        }
        return 0;
    }

    public static BigInteger leastCommonMultiple(BigInteger[] bigIntegerArr) {
        int length = bigIntegerArr.length;
        BigInteger bigIntegerDivide = bigIntegerArr[0];
        for (int i10 = 1; i10 < length; i10++) {
            bigIntegerDivide = bigIntegerDivide.multiply(bigIntegerArr[i10]).divide(bigIntegerDivide.gcd(bigIntegerArr[i10]));
        }
        return bigIntegerDivide;
    }

    public static int leastDiv(int i10) {
        if (i10 < 0) {
            i10 = -i10;
        }
        if (i10 == 0) {
            return 1;
        }
        if ((i10 & 1) == 0) {
            return 2;
        }
        for (int i11 = 3; i11 <= i10 / i11; i11 += 2) {
            if (i10 % i11 == 0) {
                return i11;
            }
        }
        return i10;
    }

    public static double log(double d2) {
        double d3 = 1.0d;
        if (d2 > 0.0d && d2 < 1.0d) {
            return -log(1.0d / d2);
        }
        int i10 = 0;
        double d7 = d2;
        while (d7 > 2.0d) {
            d7 /= 2.0d;
            i10++;
            d3 *= 2.0d;
        }
        return ((double) i10) + a(d2 / d3);
    }

    public static int maxPower(int i10) {
        int i11 = 0;
        if (i10 != 0) {
            for (int i12 = 1; (i10 & i12) == 0; i12 <<= 1) {
                i11++;
            }
        }
        return i11;
    }

    public static long mod(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 < 0 ? j12 + j11 : j12;
    }

    public static int modInverse(int i10, int i11) {
        return BigInteger.valueOf(i10).modInverse(BigInteger.valueOf(i11)).intValue();
    }

    public static int modPow(int i10, int i11, int i12) {
        if (i12 <= 0 || i12 * i12 > Integer.MAX_VALUE || i11 < 0) {
            return 0;
        }
        int i13 = ((i10 % i12) + i12) % i12;
        int i14 = 1;
        while (i11 > 0) {
            if ((i11 & 1) == 1) {
                i14 = (i14 * i13) % i12;
            }
            i13 = (i13 * i13) % i12;
            i11 >>>= 1;
        }
        return i14;
    }

    public static BigInteger nextPrime(long j10) {
        if (j10 <= 1) {
            return BigInteger.valueOf(2L);
        }
        if (j10 == 2) {
            return BigInteger.valueOf(3L);
        }
        boolean z10 = false;
        long j11 = 0;
        for (long j12 = j10 + 1 + (j10 & 1); j12 <= (j10 << 1) && !z10; j12 += 2) {
            for (long j13 = 3; j13 <= (j12 >> 1) && !z10; j13 += 2) {
                if (j12 % j13 == 0) {
                    z10 = true;
                }
            }
            if (!z10) {
                j11 = j12;
            }
            z10 = !z10;
        }
        return BigInteger.valueOf(j11);
    }

    public static BigInteger nextProbablePrime(BigInteger bigInteger) {
        return nextProbablePrime(bigInteger, 20);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010 A[LOOP:0: B:13:0x0012->B:12:0x0010, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0012, code lost:
    
        r2 = r2 - 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int nextSmallerPrime(int r2) {
        /*
            r0 = 2
            if (r2 > r0) goto L5
            r2 = 1
            return r2
        L5:
            r1 = 3
            if (r2 != r1) goto L9
            return r0
        L9:
            r0 = r2 & 1
            if (r0 != 0) goto L10
            int r2 = r2 + (-1)
            goto L12
        L10:
            int r2 = r2 + (-2)
        L12:
            if (r2 <= r1) goto L1b
            boolean r0 = isPrime(r2)
            if (r0 != 0) goto L1b
            goto L10
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.nextSmallerPrime(int):int");
    }

    public static BigInteger octetsToInteger(byte[] bArr) {
        return octetsToInteger(bArr, 0, bArr.length);
    }

    public static int order(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 == 0) {
            throw new IllegalArgumentException(i10 + " is not an element of Z/(" + i11 + "Z)^*; it is not meaningful to compute its order.");
        }
        int i13 = 1;
        while (i12 != 1) {
            i12 = (i12 * i10) % i11;
            if (i12 < 0) {
                i12 += i11;
            }
            i13++;
        }
        return i13;
    }

    public static boolean passesSmallPrimeTest(BigInteger bigInteger) {
        int[] iArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, Opcodes.ATHROW, Opcodes.INSTANCEOF, Opcodes.MULTIANEWARRAY, Opcodes.IFNONNULL, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, TypedValues.AttributesType.TYPE_EASING, 331, 337, 347, 349, ResultCode.ERROR_CONN_SSL_KEY, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, StatusCode.ERROR_WHILE_PLAYING_ANIMATION, 911, 919, PDF417Common.NUMBER_OF_CODEWORDS, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997, PointerIconCompat.TYPE_VERTICAL_TEXT, PointerIconCompat.TYPE_ALL_SCROLL, PointerIconCompat.TYPE_ZOOM_OUT, PointerIconCompat.TYPE_GRABBING, 1031, 1033, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097, ReturnCode.ERR_INIT_NODEVICEUID, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, ReturnCode.ERR_CRY_LENGTH_KEY_TYPE, ReturnCode.ERR_CRY_PADDING_METHOD, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277, 1279, 1283, 1289, 1291, 1297, ReturnCode.ERR_CONFIG_FILE_NOT_FOUND, ReturnCode.ERR_CONFIG_ORIGIN_NOT_FOUND, ReturnCode.ERR_CONFIG_VERIFY_INIT, 1319, 1321, 1327, 1361, 1367, 1373, 1381, 1399, 1409, 1423, 1427, 1429, 1433, 1439, 1447, 1451, 1453, 1459, 1471, 1481, 1483, 1487, 1489, 1493, 1499};
        for (int i10 = 0; i10 < 239; i10++) {
            if (bigInteger.mod(BigInteger.valueOf(iArr[i10])).equals(f91615a)) {
                return false;
            }
        }
        return true;
    }

    public static int pow(int i10, int i11) {
        int i12 = 1;
        while (i11 > 0) {
            if ((i11 & 1) == 1) {
                i12 *= i10;
            }
            i10 *= i10;
            i11 >>>= 1;
        }
        return i12;
    }

    public static BigInteger randomize(BigInteger bigInteger) {
        if (f91620f == null) {
            f91620f = CryptoServicesRegistrar.getSecureRandom();
        }
        return randomize(bigInteger, f91620f);
    }

    public static BigInteger reduceInto(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger.subtract(bigInteger2).mod(bigInteger3.subtract(bigInteger2)).add(bigInteger2);
    }

    public static BigInteger ressol(BigInteger bigInteger, BigInteger bigInteger2) throws IllegalArgumentException {
        BigInteger bigInteger3 = f91615a;
        BigInteger bigIntegerAdd = bigInteger;
        if (bigIntegerAdd.compareTo(bigInteger3) < 0) {
            bigIntegerAdd = bigInteger.add(bigInteger2);
        }
        if (bigIntegerAdd.equals(bigInteger3)) {
            return bigInteger3;
        }
        BigInteger bigInteger4 = f91617c;
        if (bigInteger2.equals(bigInteger4)) {
            return bigIntegerAdd;
        }
        boolean zTestBit = bigInteger2.testBit(0);
        BigInteger bigInteger5 = f91616b;
        if (zTestBit && bigInteger2.testBit(1)) {
            if (jacobi(bigIntegerAdd, bigInteger2) == 1) {
                return bigIntegerAdd.modPow(bigInteger2.add(bigInteger5).shiftRight(2), bigInteger2);
            }
            throw new IllegalArgumentException("No quadratic residue: " + bigIntegerAdd + ", " + bigInteger2);
        }
        BigInteger bigIntegerSubtract = bigInteger2.subtract(bigInteger5);
        long j10 = 0;
        while (!bigIntegerSubtract.testBit(0)) {
            j10++;
            bigIntegerSubtract = bigIntegerSubtract.shiftRight(1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.subtract(bigInteger5).shiftRight(1);
        BigInteger bigIntegerModPow = bigIntegerAdd.modPow(bigIntegerShiftRight, bigInteger2);
        BigInteger bigIntegerRemainder = bigIntegerModPow.multiply(bigIntegerModPow).remainder(bigInteger2).multiply(bigIntegerAdd).remainder(bigInteger2);
        BigInteger bigIntegerRemainder2 = bigIntegerModPow.multiply(bigIntegerAdd).remainder(bigInteger2);
        if (bigIntegerRemainder.equals(bigInteger5)) {
            return bigIntegerRemainder2;
        }
        BigInteger bigIntegerAdd2 = bigInteger4;
        while (jacobi(bigIntegerAdd2, bigInteger2) == 1) {
            bigIntegerAdd2 = bigIntegerAdd2.add(bigInteger5);
        }
        BigInteger bigIntegerModPow2 = bigIntegerAdd2.modPow(bigIntegerShiftRight.multiply(bigInteger4).add(bigInteger5), bigInteger2);
        while (bigIntegerRemainder.compareTo(bigInteger5) == 1) {
            BigInteger bigIntegerMod = bigIntegerRemainder;
            long j11 = 0;
            while (!bigIntegerMod.equals(bigInteger5)) {
                bigIntegerMod = bigIntegerMod.multiply(bigIntegerMod).mod(bigInteger2);
                j11++;
            }
            long j12 = j10 - j11;
            if (j12 == 0) {
                throw new IllegalArgumentException("No quadratic residue: " + bigIntegerAdd + ", " + bigInteger2);
            }
            BigInteger bigIntegerShiftLeft = bigInteger5;
            for (long j13 = 0; j13 < j12 - 1; j13++) {
                bigIntegerShiftLeft = bigIntegerShiftLeft.shiftLeft(1);
            }
            BigInteger bigIntegerModPow3 = bigIntegerModPow2.modPow(bigIntegerShiftLeft, bigInteger2);
            bigIntegerRemainder2 = bigIntegerRemainder2.multiply(bigIntegerModPow3).remainder(bigInteger2);
            bigIntegerModPow2 = bigIntegerModPow3.multiply(bigIntegerModPow3).remainder(bigInteger2);
            bigIntegerRemainder = bigIntegerRemainder.multiply(bigIntegerModPow2).mod(bigInteger2);
            j10 = j11;
        }
        return bigIntegerRemainder2;
    }

    public static BigInteger squareRoot(BigInteger bigInteger) {
        int i10;
        BigInteger bigIntegerAdd = f91615a;
        if (bigInteger.compareTo(bigIntegerAdd) < 0) {
            throw new ArithmeticException("cannot extract root of negative number" + bigInteger + Constant.DOT_STRING);
        }
        int iBitLength = bigInteger.bitLength();
        int i11 = iBitLength & 1;
        BigInteger bigInteger2 = f91616b;
        if (i11 != 0) {
            bigIntegerAdd = bigIntegerAdd.add(bigInteger2);
            i10 = iBitLength - 1;
        } else {
            i10 = iBitLength;
        }
        while (i10 > 0) {
            BigInteger bigInteger3 = f91618d;
            BigInteger bigIntegerMultiply = bigIntegerAdd.multiply(bigInteger3);
            int i12 = bigInteger.testBit(i10 + (-1)) ? 2 : 0;
            i10 -= 2;
            bigIntegerAdd = bigIntegerMultiply.add(BigInteger.valueOf((bigInteger.testBit(i10) ? 1 : 0) + i12));
            BigInteger bigIntegerAdd2 = bigIntegerAdd.multiply(bigInteger3).add(bigInteger2);
            bigIntegerAdd = bigIntegerAdd.multiply(f91617c);
            if (bigIntegerAdd.compareTo(bigIntegerAdd2) != -1) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger2);
                bigIntegerAdd = bigIntegerAdd.subtract(bigIntegerAdd2);
            }
        }
        return bigIntegerAdd;
    }

    public static int ceilLog(BigInteger bigInteger) {
        int i10 = 0;
        for (BigInteger bigIntegerShiftLeft = f91616b; bigIntegerShiftLeft.compareTo(bigInteger) < 0; bigIntegerShiftLeft = bigIntegerShiftLeft.shiftLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static int ceilLog256(long j10) {
        if (j10 == 0) {
            return 1;
        }
        if (j10 < 0) {
            j10 = -j10;
        }
        int i10 = 0;
        while (j10 > 0) {
            i10++;
            j10 >>>= 8;
        }
        return i10;
    }

    public static BigInteger[] divideAndRound(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        for (int i10 = 0; i10 < bigIntegerArr.length; i10++) {
            bigIntegerArr2[i10] = divideAndRound(bigIntegerArr[i10], bigInteger);
        }
        return bigIntegerArr2;
    }

    public static int floorLog(BigInteger bigInteger) {
        int i10 = -1;
        for (BigInteger bigIntegerShiftLeft = f91616b; bigIntegerShiftLeft.compareTo(bigInteger) <= 0; bigIntegerShiftLeft = bigIntegerShiftLeft.shiftLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static double log(long j10) {
        int iFloorLog = floorLog(BigInteger.valueOf(j10));
        return ((double) iFloorLog) + a(j10 / ((double) (1 << iFloorLog)));
    }

    public static long modInverse(long j10, long j11) {
        return BigInteger.valueOf(j10).modInverse(BigInteger.valueOf(j11)).longValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    public static BigInteger nextProbablePrime(BigInteger bigInteger, int i10) {
        int iSignum = bigInteger.signum();
        BigInteger bigInteger2 = f91617c;
        if (iSignum >= 0 && bigInteger.signum() != 0) {
            BigInteger bigInteger3 = f91616b;
            if (!bigInteger.equals(bigInteger3)) {
                BigInteger bigIntegerAdd = bigInteger.add(bigInteger3);
                if (!bigIntegerAdd.testBit(0)) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger3);
                }
                while (true) {
                    if (bigIntegerAdd.bitLength() > 6) {
                        long jLongValue = bigIntegerAdd.remainder(BigInteger.valueOf(152125131763605L)).longValue();
                        if (jLongValue % 3 != 0 && jLongValue % 5 != 0 && jLongValue % 7 != 0 && jLongValue % 11 != 0 && jLongValue % 13 != 0 && jLongValue % 17 != 0 && jLongValue % 19 != 0 && jLongValue % 23 != 0 && jLongValue % 29 != 0 && jLongValue % 31 != 0 && jLongValue % 37 != 0 && jLongValue % 41 != 0) {
                            if (bigIntegerAdd.bitLength() >= 4 || bigIntegerAdd.isProbablePrime(i10)) {
                                return bigIntegerAdd;
                            }
                        }
                    } else if (bigIntegerAdd.bitLength() >= 4) {
                        return bigIntegerAdd;
                    }
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger2);
                }
            }
        }
        return bigInteger2;
    }

    public static BigInteger octetsToInteger(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, i10, bArr2, 1, i11);
        return new BigInteger(bArr2);
    }

    public static long pow(long j10, int i10) {
        long j11 = 1;
        while (i10 > 0) {
            if ((i10 & 1) == 1) {
                j11 *= j10;
            }
            j10 *= j10;
            i10 >>>= 1;
        }
        return j11;
    }

    public static BigInteger randomize(BigInteger bigInteger, SecureRandom secureRandom) {
        int iBitLength = bigInteger.bitLength();
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        if (secureRandom == null && (secureRandom = f91620f) == null) {
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        for (int i10 = 0; i10 < 20; i10++) {
            bigIntegerValueOf = BigIntegers.createRandomBigInteger(iBitLength, secureRandom);
            if (bigIntegerValueOf.compareTo(bigInteger) < 0) {
                return bigIntegerValueOf;
            }
        }
        return bigIntegerValueOf.mod(bigInteger);
    }
}
