package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAValidationParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes4.dex */
public class DSAParametersGenerator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f88707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BigInteger f88708i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Digest f88709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SecureRandom f88713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88715g;

    static {
        BigInteger.valueOf(0L);
        f88707h = BigInteger.valueOf(1L);
        f88708i = BigInteger.valueOf(2L);
    }

    public DSAParametersGenerator() {
        this(DigestFactory.createSHA1());
    }

    public static void a(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b10 = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }

    public DSAParameters generateParameters() {
        BigInteger bigInteger;
        int i10;
        BigInteger bigIntegerSubtract;
        BigInteger bigIntegerModPow;
        BigInteger bit;
        BigInteger bigInteger2;
        int i11;
        BigInteger bigIntegerSubtract2;
        BigInteger bigInteger3;
        BigInteger bigIntegerModPow2;
        BigInteger bigIntegerModPow3;
        boolean z10 = this.f88714f;
        Digest digest = this.f88709a;
        BigInteger bigInteger4 = f88708i;
        BigInteger bigInteger5 = f88707h;
        int i12 = 0;
        int i13 = 1;
        if (!z10) {
            int i14 = 20;
            byte[] bArr = new byte[20];
            byte[] bArr2 = new byte[20];
            byte[] bArr3 = new byte[20];
            byte[] bArr4 = new byte[20];
            int i15 = this.f88710b;
            int i16 = (i15 - 1) / 160;
            int i17 = i15 / 8;
            byte[] bArr5 = new byte[i17];
            if (!(digest instanceof SHA1Digest)) {
                throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
            }
            loop5: while (true) {
                this.f88713e.nextBytes(bArr);
                digest.update(bArr, 0, i14);
                digest.doFinal(bArr2, 0);
                System.arraycopy(bArr, 0, bArr3, 0, i14);
                a(bArr3);
                digest.update(bArr3, 0, i14);
                digest.doFinal(bArr3, 0);
                for (int i18 = 0; i18 != i14; i18++) {
                    bArr4[i18] = (byte) (bArr2[i18] ^ bArr3[i18]);
                }
                bArr4[0] = (byte) (bArr4[0] | (-128));
                bArr4[19] = (byte) (bArr4[19] | 1);
                bigInteger = new BigInteger(1, bArr4);
                if (bigInteger.isProbablePrime(this.f88712d)) {
                    byte[] bArrClone = Arrays.clone(bArr);
                    a(bArrClone);
                    i10 = 0;
                    while (i10 < 4096) {
                        int i19 = 1;
                        while (i19 <= i16) {
                            a(bArrClone);
                            digest.update(bArrClone, 0, bArrClone.length);
                            digest.doFinal(bArr5, i17 - (i19 * 20));
                            i19++;
                            bArr3 = bArr3;
                            bArr4 = bArr4;
                        }
                        byte[] bArr6 = bArr3;
                        byte[] bArr7 = bArr4;
                        int i20 = i17 - (i16 * 20);
                        a(bArrClone);
                        digest.update(bArrClone, 0, bArrClone.length);
                        digest.doFinal(bArr2, 0);
                        System.arraycopy(bArr2, 20 - i20, bArr5, 0, i20);
                        bArr5[0] = (byte) (bArr5[0] | (-128));
                        BigInteger bigInteger6 = new BigInteger(1, bArr5);
                        bigIntegerSubtract = bigInteger6.subtract(bigInteger6.mod(bigInteger.shiftLeft(1)).subtract(bigInteger5));
                        if (bigIntegerSubtract.bitLength() == this.f88710b && bigIntegerSubtract.isProbablePrime(this.f88712d)) {
                            break loop5;
                        }
                        i10++;
                        bArr3 = bArr6;
                        bArr4 = bArr7;
                        i14 = 20;
                    }
                }
            }
            SecureRandom secureRandom = this.f88713e;
            BigInteger bigIntegerDivide = bigIntegerSubtract.subtract(bigInteger5).divide(bigInteger);
            BigInteger bigIntegerSubtract3 = bigIntegerSubtract.subtract(bigInteger4);
            do {
                bigIntegerModPow = BigIntegers.createRandomInRange(bigInteger4, bigIntegerSubtract3, secureRandom).modPow(bigIntegerDivide, bigIntegerSubtract);
            } while (bigIntegerModPow.bitLength() <= 1);
            return new DSAParameters(bigIntegerSubtract, bigInteger, bigIntegerModPow, new DSAValidationParameters(bArr, i10));
        }
        int digestSize = digest.getDigestSize() * 8;
        int i21 = this.f88711c / 8;
        byte[] bArr8 = new byte[i21];
        int i22 = this.f88710b;
        int i23 = i22 - 1;
        int i24 = i23 / digestSize;
        int i25 = i23 % digestSize;
        int i26 = i22 / 8;
        byte[] bArr9 = new byte[i26];
        int digestSize2 = digest.getDigestSize();
        byte[] bArr10 = new byte[digestSize2];
        loop0: while (true) {
            this.f88713e.nextBytes(bArr8);
            digest.update(bArr8, i12, i21);
            digest.doFinal(bArr10, i12);
            bit = new BigInteger(i13, bArr10).mod(bigInteger5.shiftLeft(this.f88711c - i13)).setBit(i12).setBit(this.f88711c - i13);
            if (bit.isProbablePrime(this.f88712d)) {
                byte[] bArrClone2 = Arrays.clone(bArr8);
                int i27 = this.f88710b * 4;
                int i28 = i12;
                while (i28 < i27) {
                    int i29 = 1;
                    while (i29 <= i24) {
                        a(bArrClone2);
                        digest.update(bArrClone2, 0, bArrClone2.length);
                        digest.doFinal(bArr9, i26 - (i29 * digestSize2));
                        i29++;
                        i28 = i28;
                        i27 = i27;
                        bigInteger4 = bigInteger4;
                    }
                    bigInteger2 = bigInteger4;
                    i11 = i28;
                    int i30 = i27;
                    int i31 = i26 - (i24 * digestSize2);
                    a(bArrClone2);
                    digest.update(bArrClone2, 0, bArrClone2.length);
                    digest.doFinal(bArr10, 0);
                    System.arraycopy(bArr10, digestSize2 - i31, bArr9, 0, i31);
                    bArr9[0] = (byte) (bArr9[0] | (-128));
                    BigInteger bigInteger7 = new BigInteger(1, bArr9);
                    bigIntegerSubtract2 = bigInteger7.subtract(bigInteger7.mod(bit.shiftLeft(1)).subtract(bigInteger5));
                    if (bigIntegerSubtract2.bitLength() == this.f88710b && bigIntegerSubtract2.isProbablePrime(this.f88712d)) {
                        break loop0;
                    }
                    i28 = i11 + 1;
                    bigInteger4 = bigInteger2;
                    i27 = i30;
                    i12 = 0;
                }
                i13 = 1;
            }
        }
        int i32 = this.f88715g;
        if (i32 >= 0) {
            BigInteger bigIntegerDivide2 = bigIntegerSubtract2.subtract(bigInteger5).divide(bit);
            byte[] bArrDecodeStrict = Hex.decodeStrict("6767656E");
            int length = bArrDecodeStrict.length + i21;
            int i33 = length + 3;
            byte[] bArr11 = new byte[i33];
            int i34 = 0;
            System.arraycopy(bArr8, 0, bArr11, 0, i21);
            System.arraycopy(bArrDecodeStrict, 0, bArr11, i21, bArrDecodeStrict.length);
            bArr11[length] = (byte) i32;
            byte[] bArr12 = new byte[digest.getDigestSize()];
            int i35 = 1;
            while (true) {
                if (i35 >= 65536) {
                    bigInteger3 = bigInteger2;
                    bigIntegerModPow3 = null;
                    break;
                }
                a(bArr11);
                digest.update(bArr11, i34, i33);
                digest.doFinal(bArr12, i34);
                bigIntegerModPow3 = new BigInteger(1, bArr12).modPow(bigIntegerDivide2, bigIntegerSubtract2);
                bigInteger3 = bigInteger2;
                if (bigIntegerModPow3.compareTo(bigInteger3) >= 0) {
                    break;
                }
                i35++;
                bigInteger2 = bigInteger3;
                i34 = 0;
            }
            if (bigIntegerModPow3 != null) {
                return new DSAParameters(bigIntegerSubtract2, bit, bigIntegerModPow3, new DSAValidationParameters(bArr8, i11, this.f88715g));
            }
        } else {
            bigInteger3 = bigInteger2;
        }
        SecureRandom secureRandom2 = this.f88713e;
        BigInteger bigIntegerDivide3 = bigIntegerSubtract2.subtract(bigInteger5).divide(bit);
        BigInteger bigIntegerSubtract4 = bigIntegerSubtract2.subtract(bigInteger3);
        do {
            bigIntegerModPow2 = BigIntegers.createRandomInRange(bigInteger3, bigIntegerSubtract4, secureRandom2).modPow(bigIntegerDivide3, bigIntegerSubtract2);
        } while (bigIntegerModPow2.bitLength() <= 1);
        return new DSAParameters(bigIntegerSubtract2, bit, bigIntegerModPow2, new DSAValidationParameters(bArr8, i11));
    }

    public void init(int i10, int i11, SecureRandom secureRandom) {
        this.f88710b = i10;
        this.f88711c = i10 > 1024 ? 256 : 160;
        this.f88712d = i11;
        Math.max(i10 <= 1024 ? 40 : (((i10 - 1) / 1024) * 8) + 48, (i11 + 1) / 2);
        this.f88713e = secureRandom;
        this.f88714f = false;
        this.f88715g = -1;
    }

    public DSAParametersGenerator(Digest digest) {
        this.f88709a = digest;
    }

    public void init(DSAParameterGenerationParameters dSAParameterGenerationParameters) {
        int l6 = dSAParameterGenerationParameters.getL();
        int n7 = dSAParameterGenerationParameters.getN();
        if (l6 < 1024 || l6 > 3072 || l6 % 1024 != 0) {
            throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
        }
        if (l6 == 1024 && n7 != 160) {
            throw new IllegalArgumentException("N must be 160 for L = 1024");
        }
        if (l6 == 2048 && n7 != 224 && n7 != 256) {
            throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
        }
        if (l6 == 3072 && n7 != 256) {
            throw new IllegalArgumentException("N must be 256 for L = 3072");
        }
        if (this.f88709a.getDigestSize() * 8 < n7) {
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        this.f88710b = l6;
        this.f88711c = n7;
        int certainty = dSAParameterGenerationParameters.getCertainty();
        this.f88712d = certainty;
        Math.max(l6 <= 1024 ? 40 : (((l6 - 1) / 1024) * 8) + 48, (certainty + 1) / 2);
        this.f88713e = dSAParameterGenerationParameters.getRandom();
        this.f88714f = true;
        this.f88715g = dSAParameterGenerationParameters.getUsageIndex();
    }
}
