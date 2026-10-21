package org.bouncycastle.crypto.generators;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes4.dex */
public class GOST3410ParametersGenerator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f88727d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f88728e = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f88731c;

    public final int a(int i10, int i11, BigInteger[] bigIntegerArr, int i12) {
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        int i13;
        int iNextInt = i10;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            }
            iNextInt = this.f88731c.nextInt() / 32768;
        }
        int iNextInt2 = i11;
        while (true) {
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.f88731c.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger5 = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger6 = new BigInteger("19381");
        BigInteger bigInteger7 = new BigInteger(Integer.toString(iNextInt));
        int i14 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger7};
        int[] iArr = {i12};
        int i15 = 0;
        int i16 = 0;
        while (iArr[i15] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i16 = i15 + 1;
            iArr[i16] = iArr[i15] / 2;
            i15 = i16;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i16 + 1];
        int i17 = 16;
        bigIntegerArr4[i16] = new BigInteger("8003", 16);
        int i18 = i16 - 1;
        int i19 = 0;
        while (i19 < i16) {
            int i20 = iArr[i18] / i17;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i14, bigIntegerArr5, i14, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i20 + 1];
                System.arraycopy(bigIntegerArr5, i14, bigIntegerArr2, i14, length2);
                int i21 = i14;
                while (true) {
                    bigInteger2 = f88728e;
                    if (i21 >= i20) {
                        break;
                    }
                    int i22 = i21 + 1;
                    bigIntegerArr2[i22] = bigIntegerArr2[i21].multiply(bigInteger6).add(bigInteger5).mod(bigInteger2.pow(i17));
                    i21 = i22;
                }
                BigInteger bigInteger8 = new BigInteger("0");
                for (int i23 = i14; i23 < i20; i23++) {
                    bigInteger8 = bigInteger8.add(bigIntegerArr2[i23].multiply(bigInteger2.pow(i23 * 16)));
                }
                bigIntegerArr2[i14] = bigIntegerArr2[i20];
                int i24 = i18 + 1;
                BigInteger bigIntegerAdd = bigInteger2.pow(iArr[i18] - 1).divide(bigIntegerArr4[i24]).add(bigInteger2.pow(iArr[i18] - 1).multiply(bigInteger8).divide(bigIntegerArr4[i24].multiply(bigInteger2.pow(i20 * 16))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger2);
                BigInteger bigInteger9 = f88727d;
                if (bigIntegerMod.compareTo(bigInteger9) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger9);
                }
                int i25 = 0;
                while (true) {
                    bigInteger3 = bigInteger5;
                    bigInteger4 = bigInteger6;
                    long j10 = i25;
                    i13 = i16;
                    BigInteger bigIntegerAdd2 = bigIntegerArr4[i24].multiply(bigIntegerAdd.add(BigInteger.valueOf(j10))).add(bigInteger9);
                    bigIntegerArr4[i18] = bigIntegerAdd2;
                    if (bigIntegerAdd2.compareTo(bigInteger2.pow(iArr[i18])) != 1) {
                        if (bigInteger2.modPow(bigIntegerArr4[i24].multiply(bigIntegerAdd.add(BigInteger.valueOf(j10))), bigIntegerArr4[i18]).compareTo(bigInteger9) == 0 && bigInteger2.modPow(bigIntegerAdd.add(BigInteger.valueOf(j10)), bigIntegerArr4[i18]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i25 += 2;
                        i16 = i13;
                        bigInteger5 = bigInteger3;
                        bigInteger6 = bigInteger4;
                    } else {
                        i16 = i13;
                        bigIntegerArr3 = bigIntegerArr2;
                        bigInteger5 = bigInteger3;
                        bigInteger6 = bigInteger4;
                        i14 = 0;
                        i17 = 16;
                    }
                }
            }
            i18--;
            if (i18 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                return bigInteger.intValue();
            }
            i19++;
            i16 = i13;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger5 = bigInteger3;
            bigInteger6 = bigInteger4;
            i14 = 0;
            i17 = 16;
        }
        bigInteger = bigIntegerArr3[i14];
        return bigInteger.intValue();
    }

    public final long b(long j10, long j11, BigInteger[] bigIntegerArr, int i10) {
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4;
        int i11;
        long jNextInt = j10;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= SvgConstantsKt.SPECIFIED_SOLID_OPACITY) {
                break;
            }
            jNextInt = this.f88731c.nextInt() * 2;
        }
        long jNextInt2 = j11;
        while (true) {
            if (jNextInt2 >= 0 && jNextInt2 <= SvgConstantsKt.SPECIFIED_SOLID_OPACITY && jNextInt2 / 2 != 0) {
                break;
            }
            jNextInt2 = (this.f88731c.nextInt() * 2) + 1;
        }
        BigInteger bigInteger5 = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger6 = new BigInteger("97781173");
        BigInteger bigInteger7 = new BigInteger(Long.toString(jNextInt));
        int i12 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger7};
        int[] iArr = {i10};
        int i13 = 0;
        int i14 = 0;
        while (iArr[i13] >= 33) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i14 = i13 + 1;
            iArr[i14] = iArr[i13] / 2;
            i13 = i14;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i14 + 1];
        bigIntegerArr4[i14] = new BigInteger("8000000B", 16);
        int i15 = i14 - 1;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = 32;
            int i18 = iArr[i15] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i12, bigIntegerArr5, i12, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i18 + 1];
                System.arraycopy(bigIntegerArr5, i12, bigIntegerArr2, i12, length2);
                int i19 = i12;
                while (true) {
                    bigInteger2 = f88728e;
                    if (i19 >= i18) {
                        break;
                    }
                    int i20 = i19 + 1;
                    bigIntegerArr2[i20] = bigIntegerArr2[i19].multiply(bigInteger6).add(bigInteger5).mod(bigInteger2.pow(i17));
                    i19 = i20;
                }
                BigInteger bigInteger8 = new BigInteger("0");
                for (int i21 = i12; i21 < i18; i21++) {
                    bigInteger8 = bigInteger8.add(bigIntegerArr2[i21].multiply(bigInteger2.pow(i21 * 32)));
                }
                bigIntegerArr2[i12] = bigIntegerArr2[i18];
                int i22 = i15 + 1;
                BigInteger bigIntegerAdd = bigInteger2.pow(iArr[i15] - 1).divide(bigIntegerArr4[i22]).add(bigInteger2.pow(iArr[i15] - 1).multiply(bigInteger8).divide(bigIntegerArr4[i22].multiply(bigInteger2.pow(i18 * 32))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger2);
                BigInteger bigInteger9 = f88727d;
                if (bigIntegerMod.compareTo(bigInteger9) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger9);
                }
                int i23 = 0;
                while (true) {
                    bigInteger3 = bigInteger5;
                    bigInteger4 = bigInteger6;
                    long j12 = i23;
                    i11 = i14;
                    BigInteger bigIntegerAdd2 = bigIntegerArr4[i22].multiply(bigIntegerAdd.add(BigInteger.valueOf(j12))).add(bigInteger9);
                    bigIntegerArr4[i15] = bigIntegerAdd2;
                    if (bigIntegerAdd2.compareTo(bigInteger2.pow(iArr[i15])) != 1) {
                        if (bigInteger2.modPow(bigIntegerArr4[i22].multiply(bigIntegerAdd.add(BigInteger.valueOf(j12))), bigIntegerArr4[i15]).compareTo(bigInteger9) == 0 && bigInteger2.modPow(bigIntegerAdd.add(BigInteger.valueOf(j12)), bigIntegerArr4[i15]).compareTo(bigInteger9) != 0) {
                            break;
                        }
                        i23 += 2;
                        bigInteger5 = bigInteger3;
                        i14 = i11;
                        bigInteger6 = bigInteger4;
                    } else {
                        bigInteger5 = bigInteger3;
                        i14 = i11;
                        bigIntegerArr3 = bigIntegerArr2;
                        bigInteger6 = bigInteger4;
                        i12 = 0;
                        i17 = 32;
                    }
                }
            }
            i15--;
            if (i15 < 0) {
                bigIntegerArr[0] = bigIntegerArr4[0];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[0];
                return bigInteger.longValue();
            }
            i16++;
            bigInteger5 = bigInteger3;
            i14 = i11;
            bigIntegerArr3 = bigIntegerArr2;
            bigInteger6 = bigInteger4;
            i12 = 0;
        }
        bigInteger = bigIntegerArr3[i12];
        return bigInteger.longValue();
    }

    public final BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigInteger3 = f88727d;
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.f88731c);
            if (bigIntegerCreateRandomBigInteger.compareTo(bigInteger3) > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigIntegerSubtract) < 0) {
                BigInteger bigIntegerModPow = bigIntegerCreateRandomBigInteger.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger3) != 0) {
                    return bigIntegerModPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        long j10;
        long j11;
        BigInteger bigIntegerAdd;
        int i10;
        int i11;
        BigInteger bigIntegerAdd2;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        int i12 = this.f88730b;
        BigInteger bigInteger = f88727d;
        BigInteger bigInteger2 = f88728e;
        int i13 = 0;
        if (i12 != 1) {
            long jNextLong = this.f88731c.nextLong();
            long jNextLong2 = this.f88731c.nextLong();
            int i14 = this.f88729a;
            if (i14 == 512) {
                j10 = jNextLong2;
                j11 = jNextLong;
                b(j11, j10, bigIntegerArr, 512);
            } else {
                if (i14 != 1024) {
                    throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
                }
                long jNextInt = jNextLong;
                while (true) {
                    if (jNextInt >= 0 && jNextInt <= SvgConstantsKt.SPECIFIED_SOLID_OPACITY) {
                        break;
                    }
                    long j12 = jNextLong2;
                    long j13 = jNextLong;
                    jNextInt = this.f88731c.nextInt() * 2;
                    jNextLong = j13;
                    jNextLong2 = j12;
                }
                long jNextInt2 = jNextLong2;
                while (true) {
                    if (jNextInt2 >= 0 && jNextInt2 <= SvgConstantsKt.SPECIFIED_SOLID_OPACITY && jNextInt2 / 2 != 0) {
                        break;
                    }
                    long j14 = jNextLong2;
                    jNextLong = jNextLong;
                    jNextInt2 = (this.f88731c.nextInt() * 2) + 1;
                    jNextLong2 = j14;
                }
                BigInteger[] bigIntegerArr2 = new BigInteger[2];
                BigInteger bigInteger3 = new BigInteger(Long.toString(jNextInt2));
                BigInteger bigInteger4 = new BigInteger("97781173");
                long j15 = jNextInt2;
                j10 = jNextLong2;
                long jB = b(jNextInt, j15, bigIntegerArr2, 256);
                BigInteger bigInteger5 = bigIntegerArr2[0];
                j11 = jNextLong;
                long jB2 = b(jB, j15, bigIntegerArr2, 512);
                BigInteger bigInteger6 = bigIntegerArr2[0];
                BigInteger[] bigIntegerArr3 = new BigInteger[33];
                bigIntegerArr3[0] = new BigInteger(Long.toString(jB2));
                loop8: while (true) {
                    int i15 = 0;
                    while (i15 < 32) {
                        int i16 = i15 + 1;
                        bigIntegerArr3[i16] = bigIntegerArr3[i15].multiply(bigInteger4).add(bigInteger3).mod(bigInteger2.pow(32));
                        i15 = i16;
                    }
                    BigInteger bigInteger7 = bigInteger4;
                    BigInteger bigInteger8 = new BigInteger("0");
                    for (int i17 = 0; i17 < 32; i17++) {
                        bigInteger8 = bigInteger8.add(bigIntegerArr3[i17].multiply(bigInteger2.pow(i17 * 32)));
                    }
                    bigIntegerArr3[0] = bigIntegerArr3[32];
                    BigInteger bigIntegerAdd3 = bigInteger2.pow(1023).divide(bigInteger5.multiply(bigInteger6)).add(bigInteger2.pow(1023).multiply(bigInteger8).divide(bigInteger5.multiply(bigInteger6).multiply(bigInteger2.pow(1024))));
                    if (bigIntegerAdd3.mod(bigInteger2).compareTo(bigInteger) == 0) {
                        bigIntegerAdd3 = bigIntegerAdd3.add(bigInteger);
                    }
                    int i18 = 0;
                    while (true) {
                        long j16 = i18;
                        bigIntegerAdd = bigInteger5.multiply(bigInteger6).multiply(bigIntegerAdd3.add(BigInteger.valueOf(j16))).add(bigInteger);
                        BigInteger[] bigIntegerArr4 = bigIntegerArr3;
                        if (bigIntegerAdd.compareTo(bigInteger2.pow(1024)) != 1) {
                            if (bigInteger2.modPow(bigInteger5.multiply(bigInteger6).multiply(bigIntegerAdd3.add(BigInteger.valueOf(j16))), bigIntegerAdd).compareTo(bigInteger) == 0 && bigInteger2.modPow(bigInteger5.multiply(bigIntegerAdd3.add(BigInteger.valueOf(j16))), bigIntegerAdd).compareTo(bigInteger) != 0) {
                                break loop8;
                            }
                            i18 += 2;
                            bigIntegerArr3 = bigIntegerArr4;
                        } else {
                            bigInteger4 = bigInteger7;
                            bigIntegerArr3 = bigIntegerArr4;
                        }
                    }
                }
                bigIntegerArr[0] = bigIntegerAdd;
                bigIntegerArr[1] = bigInteger5;
            }
            BigInteger bigInteger9 = bigIntegerArr[0];
            BigInteger bigInteger10 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger9, bigInteger10, c(bigInteger9, bigInteger10), new GOST3410ValidationParameters(j11, j10));
        }
        int iNextInt = this.f88731c.nextInt();
        int iNextInt2 = this.f88731c.nextInt();
        int i19 = this.f88729a;
        if (i19 == 512) {
            i10 = iNextInt2;
            a(iNextInt, i10, bigIntegerArr, 512);
        } else {
            if (i19 != 1024) {
                throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
            }
            int iNextInt3 = iNextInt;
            while (true) {
                if (iNextInt3 >= 0 && iNextInt3 <= 65536) {
                    break;
                }
                int i20 = iNextInt2;
                iNextInt3 = this.f88731c.nextInt() / 32768;
                iNextInt2 = i20;
                i13 = 0;
            }
            int iNextInt4 = iNextInt2;
            while (true) {
                if (iNextInt4 >= 0 && iNextInt4 <= 65536 && iNextInt4 / 2 != 0) {
                    break;
                }
                int i21 = iNextInt2;
                iNextInt4 = (this.f88731c.nextInt() / 32768) + 1;
                iNextInt2 = i21;
                i13 = 0;
            }
            BigInteger[] bigIntegerArr5 = new BigInteger[2];
            BigInteger bigInteger11 = new BigInteger(Integer.toString(iNextInt4));
            BigInteger bigInteger12 = new BigInteger("19381");
            int iA = a(iNextInt3, iNextInt4, bigIntegerArr5, 256);
            BigInteger bigInteger13 = bigIntegerArr5[i13];
            int iA2 = a(iA, iNextInt4, bigIntegerArr5, 512);
            BigInteger bigInteger14 = bigIntegerArr5[i13];
            BigInteger[] bigIntegerArr6 = new BigInteger[65];
            bigIntegerArr6[i13] = new BigInteger(Integer.toString(iA2));
            loop2: while (true) {
                int i22 = i13;
                while (true) {
                    i11 = 64;
                    if (i22 >= 64) {
                        break;
                    }
                    int i23 = i22 + 1;
                    bigIntegerArr6[i23] = bigIntegerArr6[i22].multiply(bigInteger12).add(bigInteger11).mod(bigInteger2.pow(16));
                    i22 = i23;
                }
                BigInteger bigInteger15 = new BigInteger("0");
                int i24 = i13;
                while (i24 < i11) {
                    bigInteger15 = bigInteger15.add(bigIntegerArr6[i24].multiply(bigInteger2.pow(i24 * 16)));
                    i24++;
                    i11 = 64;
                }
                bigIntegerArr6[0] = bigIntegerArr6[i11];
                BigInteger[] bigIntegerArr7 = bigIntegerArr6;
                BigInteger bigIntegerAdd4 = bigInteger2.pow(1023).divide(bigInteger13.multiply(bigInteger14)).add(bigInteger2.pow(1023).multiply(bigInteger15).divide(bigInteger13.multiply(bigInteger14).multiply(bigInteger2.pow(1024))));
                if (bigIntegerAdd4.mod(bigInteger2).compareTo(bigInteger) == 0) {
                    bigIntegerAdd4 = bigIntegerAdd4.add(bigInteger);
                }
                BigInteger bigInteger16 = bigIntegerAdd4;
                int i25 = 0;
                while (true) {
                    i10 = iNextInt2;
                    long j17 = i25;
                    BigInteger bigInteger17 = bigInteger11;
                    bigIntegerAdd2 = bigInteger13.multiply(bigInteger14).multiply(bigInteger16.add(BigInteger.valueOf(j17))).add(bigInteger);
                    BigInteger bigInteger18 = bigInteger12;
                    if (bigIntegerAdd2.compareTo(bigInteger2.pow(1024)) != 1) {
                        if (bigInteger2.modPow(bigInteger13.multiply(bigInteger14).multiply(bigInteger16.add(BigInteger.valueOf(j17))), bigIntegerAdd2).compareTo(bigInteger) == 0 && bigInteger2.modPow(bigInteger13.multiply(bigInteger16.add(BigInteger.valueOf(j17))), bigIntegerAdd2).compareTo(bigInteger) != 0) {
                            break loop2;
                        }
                        i25 += 2;
                        iNextInt2 = i10;
                        bigInteger11 = bigInteger17;
                        bigInteger12 = bigInteger18;
                    } else {
                        iNextInt2 = i10;
                        bigIntegerArr6 = bigIntegerArr7;
                        bigInteger11 = bigInteger17;
                        bigInteger12 = bigInteger18;
                        i13 = 0;
                    }
                }
            }
            bigIntegerArr[0] = bigIntegerAdd2;
            bigIntegerArr[1] = bigInteger13;
        }
        BigInteger bigInteger19 = bigIntegerArr[0];
        BigInteger bigInteger20 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger19, bigInteger20, c(bigInteger19, bigInteger20), new GOST3410ValidationParameters(iNextInt, i10));
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.f88729a = i10;
        this.f88730b = i11;
        this.f88731c = secureRandom;
    }
}
