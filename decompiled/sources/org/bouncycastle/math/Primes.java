package org.bouncycastle.math;

import androidx.camera.camera2.internal.h0;
import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Primes {
    public static final int SMALL_FACTOR_LIMIT = 211;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f90562a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f90563b = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f90564c = BigInteger.valueOf(3);

    public static class MROutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f90565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigInteger f90566b;

        public MROutput(boolean z10, BigInteger bigInteger) {
            this.f90565a = z10;
            this.f90566b = bigInteger;
        }

        public BigInteger getFactor() {
            return this.f90566b;
        }

        public boolean isNotPrimePower() {
            return this.f90565a && this.f90566b == null;
        }

        public boolean isProvablyComposite() {
            return this.f90565a;
        }
    }

    public static class STOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigInteger f90567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f90568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f90569c;

        public STOutput(BigInteger bigInteger, byte[] bArr, int i10) {
            this.f90567a = bigInteger;
            this.f90568b = bArr;
            this.f90569c = i10;
        }

        public BigInteger getPrime() {
            return this.f90567a;
        }

        public int getPrimeGenCounter() {
            return this.f90569c;
        }

        public byte[] getPrimeSeed() {
            return this.f90568b;
        }
    }

    public static void a(String str, BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 1 || bigInteger.bitLength() < 2) {
            throw new IllegalArgumentException(h0.b("'", str, "' must be non-null and >= 2"));
        }
    }

    public static int b(byte[] bArr) {
        int iMin = Math.min(4, bArr.length);
        int i10 = 0;
        int i11 = 0;
        while (i10 < iMin) {
            int i12 = i10 + 1;
            i11 |= (bArr[bArr.length - i12] & 255) << (i10 * 8);
            i10 = i12;
        }
        return i11;
    }

    public static BigInteger c(Digest digest, int i10, byte[] bArr) {
        int digestSize = digest.getDigestSize();
        int i11 = i10 * digestSize;
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 < i10; i12++) {
            i11 -= digestSize;
            digest.update(bArr, 0, bArr.length);
            digest.doFinal(bArr2, i11);
            g(1, bArr);
        }
        return new BigInteger(1, bArr2);
    }

    public static boolean d(BigInteger bigInteger) {
        int iIntValue = bigInteger.mod(BigInteger.valueOf(223092870)).intValue();
        if (iIntValue % 2 != 0 && iIntValue % 3 != 0 && iIntValue % 5 != 0 && iIntValue % 7 != 0 && iIntValue % 11 != 0 && iIntValue % 13 != 0 && iIntValue % 17 != 0 && iIntValue % 19 != 0 && iIntValue % 23 != 0) {
            int iIntValue2 = bigInteger.mod(BigInteger.valueOf(58642669)).intValue();
            if (iIntValue2 % 29 != 0 && iIntValue2 % 31 != 0 && iIntValue2 % 37 != 0 && iIntValue2 % 41 != 0 && iIntValue2 % 43 != 0) {
                int iIntValue3 = bigInteger.mod(BigInteger.valueOf(600662303)).intValue();
                if (iIntValue3 % 47 != 0 && iIntValue3 % 53 != 0 && iIntValue3 % 59 != 0 && iIntValue3 % 61 != 0 && iIntValue3 % 67 != 0) {
                    int iIntValue4 = bigInteger.mod(BigInteger.valueOf(33984931)).intValue();
                    if (iIntValue4 % 71 != 0 && iIntValue4 % 73 != 0 && iIntValue4 % 79 != 0 && iIntValue4 % 83 != 0) {
                        int iIntValue5 = bigInteger.mod(BigInteger.valueOf(89809099)).intValue();
                        if (iIntValue5 % 89 != 0 && iIntValue5 % 97 != 0 && iIntValue5 % 101 != 0 && iIntValue5 % 103 != 0) {
                            int iIntValue6 = bigInteger.mod(BigInteger.valueOf(167375713)).intValue();
                            if (iIntValue6 % 107 != 0 && iIntValue6 % 109 != 0 && iIntValue6 % 113 != 0 && iIntValue6 % 127 != 0) {
                                int iIntValue7 = bigInteger.mod(BigInteger.valueOf(371700317)).intValue();
                                if (iIntValue7 % 131 != 0 && iIntValue7 % 137 != 0 && iIntValue7 % 139 != 0 && iIntValue7 % 149 != 0) {
                                    int iIntValue8 = bigInteger.mod(BigInteger.valueOf(645328247)).intValue();
                                    if (iIntValue8 % 151 != 0 && iIntValue8 % 157 != 0 && iIntValue8 % 163 != 0 && iIntValue8 % 167 != 0) {
                                        int iIntValue9 = bigInteger.mod(BigInteger.valueOf(1070560157)).intValue();
                                        if (iIntValue9 % 173 != 0 && iIntValue9 % 179 != 0 && iIntValue9 % 181 != 0 && iIntValue9 % Opcodes.ATHROW != 0) {
                                            int iIntValue10 = bigInteger.mod(BigInteger.valueOf(1596463769)).intValue();
                                            if (iIntValue10 % Opcodes.INSTANCEOF != 0 && iIntValue10 % Opcodes.MULTIANEWARRAY != 0 && iIntValue10 % Opcodes.IFNONNULL != 0 && iIntValue10 % 211 != 0) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean e(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10) {
        BigInteger bigIntegerModPow = bigInteger4.modPow(bigInteger3, bigInteger);
        BigInteger bigInteger5 = f90562a;
        if (bigIntegerModPow.equals(bigInteger5) || bigIntegerModPow.equals(bigInteger2)) {
            return true;
        }
        for (int i11 = 1; i11 < i10; i11++) {
            bigIntegerModPow = bigIntegerModPow.modPow(f90563b, bigInteger);
            if (bigIntegerModPow.equals(bigInteger2)) {
                return true;
            }
            if (bigIntegerModPow.equals(bigInteger5)) {
                return false;
            }
        }
        return false;
    }

    public static MROutput enhancedMRProbablePrimeTest(BigInteger bigInteger, SecureRandom secureRandom, int i10) {
        boolean z10;
        BigInteger bigIntegerModPow;
        a("candidate", bigInteger);
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return new MROutput(false, null);
        }
        boolean zTestBit = bigInteger.testBit(0);
        BigInteger bigInteger2 = f90563b;
        if (!zTestBit) {
            return new MROutput(true, bigInteger2);
        }
        BigInteger bigInteger3 = f90562a;
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(bigInteger2);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i11 = 0; i11 < i10; i11++) {
            BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger2, bigIntegerSubtract2, secureRandom);
            BigInteger bigIntegerGcd = bigIntegerCreateRandomInRange.gcd(bigInteger);
            if (bigIntegerGcd.compareTo(bigInteger3) > 0) {
                return new MROutput(true, bigIntegerGcd);
            }
            BigInteger bigIntegerModPow2 = bigIntegerCreateRandomInRange.modPow(bigIntegerShiftRight, bigInteger);
            if (!bigIntegerModPow2.equals(bigInteger3) && !bigIntegerModPow2.equals(bigIntegerSubtract)) {
                int i12 = 1;
                while (true) {
                    if (i12 >= lowestSetBit) {
                        z10 = false;
                        bigIntegerModPow = bigIntegerModPow2;
                        break;
                    }
                    bigIntegerModPow = bigIntegerModPow2.modPow(bigInteger2, bigInteger);
                    if (bigIntegerModPow.equals(bigIntegerSubtract)) {
                        z10 = true;
                        break;
                    }
                    if (bigIntegerModPow.equals(bigInteger3)) {
                        z10 = false;
                        break;
                    }
                    i12++;
                    bigIntegerModPow2 = bigIntegerModPow;
                }
                if (!z10) {
                    if (!bigIntegerModPow.equals(bigInteger3)) {
                        bigIntegerModPow2 = bigIntegerModPow.modPow(bigInteger2, bigInteger);
                        if (bigIntegerModPow2.equals(bigInteger3)) {
                            bigIntegerModPow2 = bigIntegerModPow;
                        }
                    }
                    BigInteger bigIntegerGcd2 = bigIntegerModPow2.subtract(bigInteger3).gcd(bigInteger);
                    return bigIntegerGcd2.compareTo(bigInteger3) > 0 ? new MROutput(true, bigIntegerGcd2) : new MROutput(true, null);
                }
            }
        }
        return new MROutput(false, null);
    }

    public static STOutput f(Digest digest, int i10, byte[] bArr) {
        int digestSize = digest.getDigestSize();
        String str = "Too many iterations in Shawe-Taylor Random_Prime Routine";
        int i11 = 1;
        if (i10 < 33) {
            byte[] bArr2 = new byte[digestSize];
            byte[] bArr3 = new byte[digestSize];
            int i12 = 0;
            do {
                digest.update(bArr, 0, bArr.length);
                digest.doFinal(bArr2, 0);
                g(1, bArr);
                digest.update(bArr, 0, bArr.length);
                digest.doFinal(bArr3, 0);
                g(1, bArr);
                i12++;
                long jB = ((b(bArr2) ^ b(bArr3)) & ((-1) >>> (32 - i10))) | (1 << (i10 - 1)) | 1;
                long j10 = 4294967295L & jB;
                if ((j10 >>> 32) != 0) {
                    throw new IllegalArgumentException("Size limit exceeded");
                }
                if (j10 <= 5) {
                    if (j10 == 2 || j10 == 3 || j10 == 5) {
                        return new STOutput(BigInteger.valueOf(j10), bArr, i12);
                    }
                } else if ((jB & 1) != 0 && j10 % 3 != 0 && j10 % 5 != 0) {
                    long[] jArr = {1, 7, 11, 13, 17, 19, 23, 29};
                    int i13 = 1;
                    long j11 = 0;
                    while (true) {
                        if (i13 >= 8) {
                            j11 += 30;
                            if (j11 * j11 >= j10) {
                                return new STOutput(BigInteger.valueOf(j10), bArr, i12);
                            }
                            i13 = 0;
                        } else {
                            if (j10 % (j11 + jArr[i13]) == 0) {
                                if (j10 >= 30) {
                                    break;
                                }
                                return new STOutput(BigInteger.valueOf(j10), bArr, i12);
                            }
                            i13++;
                        }
                    }
                }
            } while (i12 <= i10 * 4);
            throw new IllegalStateException("Too many iterations in Shawe-Taylor Random_Prime Routine");
        }
        STOutput sTOutputF = f(digest, (i10 + 3) / 2, bArr);
        BigInteger prime = sTOutputF.getPrime();
        byte[] primeSeed = sTOutputF.getPrimeSeed();
        int primeGenCounter = sTOutputF.getPrimeGenCounter();
        int i14 = i10 - 1;
        int i15 = (i14 / (digestSize * 8)) + 1;
        BigInteger bigIntegerC = c(digest, i15, primeSeed);
        BigInteger bigInteger = f90562a;
        BigInteger bit = bigIntegerC.mod(bigInteger.shiftLeft(i14)).setBit(i14);
        BigInteger bigIntegerShiftLeft = prime.shiftLeft(1);
        BigInteger bigIntegerShiftLeft2 = bit.subtract(bigInteger).divide(bigIntegerShiftLeft).add(bigInteger).shiftLeft(1);
        BigInteger bigIntegerAdd = bigIntegerShiftLeft2.multiply(prime).add(bigInteger);
        int i16 = primeGenCounter;
        int i17 = 0;
        while (true) {
            if (bigIntegerAdd.bitLength() > i10) {
                bigIntegerShiftLeft2 = bigInteger.shiftLeft(i14).subtract(bigInteger).divide(bigIntegerShiftLeft).add(bigInteger).shiftLeft(i11);
                bigIntegerAdd = bigIntegerShiftLeft2.multiply(prime).add(bigInteger);
            }
            i16 += i11;
            if (d(bigIntegerAdd)) {
                g(i15, primeSeed);
            } else {
                BigInteger bigIntegerAdd2 = c(digest, i15, primeSeed).mod(bigIntegerAdd.subtract(f90564c)).add(f90563b);
                BigInteger bigIntegerAdd3 = bigIntegerShiftLeft2.add(BigInteger.valueOf(i17));
                BigInteger bigIntegerModPow = bigIntegerAdd2.modPow(bigIntegerAdd3, bigIntegerAdd);
                if (bigIntegerAdd.gcd(bigIntegerModPow.subtract(bigInteger)).equals(bigInteger) && bigIntegerModPow.modPow(prime, bigIntegerAdd).equals(bigInteger)) {
                    return new STOutput(bigIntegerAdd, primeSeed, i16);
                }
                bigIntegerShiftLeft2 = bigIntegerAdd3;
                i17 = 0;
            }
            if (i16 >= (i10 * 4) + primeGenCounter) {
                throw new IllegalStateException(str);
            }
            i17 += 2;
            bigIntegerAdd = bigIntegerAdd.add(bigIntegerShiftLeft);
            i14 = i14;
            str = str;
            i11 = 1;
        }
    }

    public static void g(int i10, byte[] bArr) {
        int length = bArr.length;
        while (i10 > 0) {
            length--;
            if (length < 0) {
                return;
            }
            int i11 = i10 + (bArr[length] & 255);
            bArr[length] = (byte) i11;
            i10 = i11 >>> 8;
        }
    }

    public static STOutput generateSTRandomPrime(Digest digest, int i10, byte[] bArr) {
        if (digest == null) {
            throw new IllegalArgumentException("'hash' cannot be null");
        }
        if (i10 < 2) {
            throw new IllegalArgumentException("'length' must be >= 2");
        }
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("'inputSeed' cannot be null or empty");
        }
        return f(digest, i10, Arrays.clone(bArr));
    }

    public static boolean hasAnySmallFactors(BigInteger bigInteger) {
        a("candidate", bigInteger);
        return d(bigInteger);
    }

    public static boolean isMRProbablePrime(BigInteger bigInteger, SecureRandom secureRandom, int i10) {
        a("candidate", bigInteger);
        if (secureRandom == null) {
            throw new IllegalArgumentException("'random' cannot be null");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("'iterations' must be > 0");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        if (!bigInteger.testBit(0)) {
            return false;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(f90562a);
        BigInteger bigInteger2 = f90563b;
        BigInteger bigIntegerSubtract2 = bigInteger.subtract(bigInteger2);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        BigInteger bigIntegerShiftRight = bigIntegerSubtract.shiftRight(lowestSetBit);
        for (int i11 = 0; i11 < i10; i11++) {
            if (!e(bigInteger, bigIntegerSubtract, bigIntegerShiftRight, BigIntegers.createRandomInRange(bigInteger2, bigIntegerSubtract2, secureRandom), lowestSetBit)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMRProbablePrimeToBase(BigInteger bigInteger, BigInteger bigInteger2) {
        a("candidate", bigInteger);
        a("base", bigInteger2);
        BigInteger bigInteger3 = f90562a;
        if (bigInteger2.compareTo(bigInteger.subtract(bigInteger3)) >= 0) {
            throw new IllegalArgumentException("'base' must be < ('candidate' - 1)");
        }
        if (bigInteger.bitLength() == 2) {
            return true;
        }
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
        int lowestSetBit = bigIntegerSubtract.getLowestSetBit();
        return e(bigInteger, bigIntegerSubtract, bigIntegerSubtract.shiftRight(lowestSetBit), bigInteger2, lowestSetBit);
    }
}
