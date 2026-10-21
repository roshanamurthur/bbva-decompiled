package bc.org.bouncycastle.math.ec;

import bc.org.bouncycastle.util.Arrays;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.q3;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECFieldElement implements ECConstants {

    public static class Fp extends ECFieldElement {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigInteger f25027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigInteger f25028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BigInteger f25029d;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, a(bigInteger), bigInteger2);
        }

        public static BigInteger a(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return ECConstants.ONE.shiftLeft(iBitLength).subtract(bigInteger);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new Fp(this.f25027b, this.f25028c, a(this.f25029d, eCFieldElement.toBigInteger()));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger bigIntegerAdd = this.f25029d.add(ECConstants.ONE);
            BigInteger bigInteger = this.f25027b;
            if (bigIntegerAdd.compareTo(bigInteger) == 0) {
                bigIntegerAdd = ECConstants.ZERO;
            }
            return new Fp(bigInteger, this.f25028c, bigIntegerAdd);
        }

        public BigInteger b(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            BigInteger bigInteger2 = this.f25027b;
            return bigIntegerShiftLeft.compareTo(bigInteger2) >= 0 ? bigIntegerShiftLeft.subtract(bigInteger2) : bigIntegerShiftLeft;
        }

        public BigInteger c(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f25027b.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger d(BigInteger bigInteger) {
            int fieldSize = getFieldSize();
            int i10 = (fieldSize + 31) >> 5;
            int[] iArrA = e4.a(fieldSize, this.f25027b);
            int[] iArrA2 = e4.a(fieldSize, bigInteger);
            int[] iArrA3 = e4.a(i10);
            q3.a(iArrA, iArrA2, iArrA3);
            return e4.f(i10, iArrA3);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new Fp(this.f25027b, this.f25028c, b(this.f25029d, d(eCFieldElement.toBigInteger())));
        }

        public BigInteger e(BigInteger bigInteger) {
            BigInteger bigInteger2 = this.f25027b;
            BigInteger bigInteger3 = this.f25028c;
            if (bigInteger3 == null) {
                return bigInteger.mod(bigInteger2);
            }
            boolean z10 = bigInteger.signum() < 0;
            if (z10) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = bigInteger2.bitLength();
            boolean zEquals = bigInteger3.equals(ECConstants.ONE);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(bigInteger3);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(bigInteger2) >= 0) {
                bigInteger = bigInteger.subtract(bigInteger2);
            }
            return (!z10 || bigInteger.signum() == 0) ? bigInteger : bigInteger2.subtract(bigInteger);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fp)) {
                return false;
            }
            Fp fp = (Fp) obj;
            return this.f25027b.equals(fp.f25027b) && this.f25029d.equals(fp.f25029d);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f25027b.bitLength();
        }

        public BigInteger getQ() {
            return this.f25027b;
        }

        public int hashCode() {
            return this.f25027b.hashCode() ^ this.f25029d.hashCode();
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            return new Fp(this.f25027b, this.f25028c, d(this.f25029d));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new Fp(this.f25027b, this.f25028c, b(this.f25029d, eCFieldElement.toBigInteger()));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return new Fp(this.f25027b, this.f25028c, e(this.f25029d.multiply(eCFieldElement.toBigInteger()).subtract(eCFieldElement2.toBigInteger().multiply(eCFieldElement3.toBigInteger()))));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return new Fp(this.f25027b, this.f25028c, e(this.f25029d.multiply(eCFieldElement.toBigInteger()).add(eCFieldElement2.toBigInteger().multiply(eCFieldElement3.toBigInteger()))));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            BigInteger bigInteger = this.f25029d;
            if (bigInteger.signum() == 0) {
                return this;
            }
            BigInteger bigInteger2 = this.f25027b;
            return new Fp(bigInteger2, this.f25028c, bigInteger2.subtract(bigInteger));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            SecureRandom secureRandom;
            if (isZero() || isOne()) {
                return this;
            }
            BigInteger bigInteger = this.f25027b;
            if (!bigInteger.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            int i10 = 1;
            boolean zTestBit = bigInteger.testBit(1);
            BigInteger bigInteger2 = this.f25028c;
            BigInteger bigInteger3 = this.f25029d;
            Object obj = null;
            if (zTestBit) {
                Fp fp = new Fp(bigInteger, bigInteger2, bigInteger3.modPow(bigInteger.shiftRight(2).add(ECConstants.ONE), bigInteger));
                if (fp.square().equals(this)) {
                    return fp;
                }
                return null;
            }
            if (bigInteger.testBit(2)) {
                BigInteger bigIntegerModPow = bigInteger3.modPow(bigInteger.shiftRight(3), bigInteger);
                BigInteger bigIntegerB = b(bigIntegerModPow, bigInteger3);
                if (b(bigIntegerB, bigIntegerModPow).equals(ECConstants.ONE)) {
                    Fp fp2 = new Fp(bigInteger, bigInteger2, bigIntegerB);
                    if (fp2.square().equals(this)) {
                        return fp2;
                    }
                    return null;
                }
                Fp fp3 = new Fp(bigInteger, bigInteger2, b(bigIntegerB, ECConstants.TWO.modPow(bigInteger.shiftRight(2), bigInteger)));
                if (fp3.square().equals(this)) {
                    return fp3;
                }
                return null;
            }
            BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
            BigInteger bigIntegerModPow2 = bigInteger3.modPow(bigIntegerShiftRight, bigInteger);
            BigInteger bigInteger4 = ECConstants.ONE;
            if (!bigIntegerModPow2.equals(bigInteger4)) {
                return null;
            }
            BigInteger bigIntegerB2 = b(b(bigInteger3));
            BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger4);
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger4);
            SecureRandom secureRandom2 = new SecureRandom();
            while (true) {
                BigInteger bigInteger5 = new BigInteger(bigInteger.bitLength(), secureRandom2);
                if (bigInteger5.compareTo(bigInteger) >= 0 || !e(bigInteger5.multiply(bigInteger5).subtract(bigIntegerB2)).modPow(bigIntegerShiftRight, bigInteger).equals(bigIntegerSubtract)) {
                    obj = obj;
                    i10 = i10;
                } else {
                    int iBitLength = bigIntegerAdd.bitLength();
                    int lowestSetBit = bigIntegerAdd.getLowestSetBit();
                    BigInteger bigInteger6 = ECConstants.ONE;
                    int i11 = iBitLength - i10;
                    BigInteger bigInteger7 = bigIntegerShiftRight;
                    BigInteger bigIntegerE = bigInteger5;
                    BigInteger bigIntegerB3 = bigInteger6;
                    BigInteger bigIntegerE2 = ECConstants.TWO;
                    BigInteger bigIntegerB4 = bigIntegerB3;
                    while (true) {
                        secureRandom = secureRandom2;
                        if (i11 < lowestSetBit + 1) {
                            break;
                        }
                        bigIntegerB4 = b(bigIntegerB4, bigIntegerB3);
                        if (bigIntegerAdd.testBit(i11)) {
                            bigIntegerB3 = b(bigIntegerB4, bigInteger3);
                            BigInteger bigIntegerB5 = b(bigInteger6, bigIntegerE);
                            BigInteger bigIntegerE3 = e(bigIntegerE.multiply(bigIntegerE2).subtract(bigInteger5.multiply(bigIntegerB4)));
                            bigIntegerE = e(bigIntegerE.multiply(bigIntegerE).subtract(bigIntegerB3.shiftLeft(1)));
                            bigInteger6 = bigIntegerB5;
                            bigIntegerE2 = bigIntegerE3;
                        } else {
                            BigInteger bigIntegerE4 = e(bigInteger6.multiply(bigIntegerE2).subtract(bigIntegerB4));
                            bigIntegerE = e(bigIntegerE.multiply(bigIntegerE2).subtract(bigInteger5.multiply(bigIntegerB4)));
                            bigIntegerE2 = e(bigIntegerE2.multiply(bigIntegerE2).subtract(bigIntegerB4.shiftLeft(1)));
                            bigInteger6 = bigIntegerE4;
                            bigIntegerB3 = bigIntegerB4;
                        }
                        i11--;
                        secureRandom2 = secureRandom;
                    }
                    BigInteger bigIntegerB6 = b(bigIntegerB4, bigIntegerB3);
                    BigInteger bigIntegerB7 = b(bigIntegerB6, bigInteger3);
                    BigInteger bigIntegerE5 = e(bigInteger6.multiply(bigIntegerE2).subtract(bigIntegerB6));
                    BigInteger bigIntegerE6 = e(bigIntegerE.multiply(bigIntegerE2).subtract(bigInteger5.multiply(bigIntegerB6)));
                    BigInteger bigIntegerB8 = b(bigIntegerB6, bigIntegerB7);
                    for (int i12 = 1; i12 <= lowestSetBit; i12++) {
                        bigIntegerE5 = b(bigIntegerE5, bigIntegerE6);
                        bigIntegerE6 = e(bigIntegerE6.multiply(bigIntegerE6).subtract(bigIntegerB8.shiftLeft(1)));
                        bigIntegerB8 = b(bigIntegerB8, bigIntegerB8);
                    }
                    if (b(bigIntegerE6, bigIntegerE6).equals(bigIntegerB2)) {
                        return new Fp(bigInteger, bigInteger2, c(bigIntegerE6));
                    }
                    if (!bigIntegerE5.equals(ECConstants.ONE) && !bigIntegerE5.equals(bigIntegerSubtract)) {
                        return null;
                    }
                    i10 = 1;
                    bigIntegerShiftRight = bigInteger7;
                    secureRandom2 = secureRandom;
                    obj = null;
                }
            }
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f25029d;
            return new Fp(this.f25027b, this.f25028c, b(bigInteger, bigInteger));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = eCFieldElement.toBigInteger();
            BigInteger bigInteger2 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger3 = this.f25029d;
            return new Fp(this.f25027b, this.f25028c, e(bigInteger3.multiply(bigInteger3).subtract(bigInteger.multiply(bigInteger2))));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = eCFieldElement.toBigInteger();
            BigInteger bigInteger2 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger3 = this.f25029d;
            return new Fp(this.f25027b, this.f25028c, e(bigInteger3.multiply(bigInteger3).add(bigInteger.multiply(bigInteger2))));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new Fp(this.f25027b, this.f25028c, c(this.f25029d, eCFieldElement.toBigInteger()));
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f25029d;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f25027b = bigInteger;
            this.f25028c = bigInteger2;
            this.f25029d = bigInteger3;
        }

        public BigInteger b(BigInteger bigInteger, BigInteger bigInteger2) {
            return e(bigInteger.multiply(bigInteger2));
        }

        public BigInteger c(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.f25027b) : bigIntegerSubtract;
        }

        public BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            BigInteger bigInteger3 = this.f25027b;
            return bigIntegerAdd.compareTo(bigInteger3) >= 0 ? bigIntegerAdd.subtract(bigInteger3) : bigIntegerAdd;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return o0.a((getFieldSize() + 7) / 8, toBigInteger());
    }

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public boolean isOne() {
        return bitLength() == 1;
    }

    public boolean isZero() {
        return toBigInteger().signum() == 0;
    }

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).subtract(eCFieldElement2.multiply(eCFieldElement3));
    }

    public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return multiply(eCFieldElement).add(eCFieldElement2.multiply(eCFieldElement3));
    }

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().subtract(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return square().add(eCFieldElement.multiply(eCFieldElement2));
    }

    public ECFieldElement squarePow(int i10) {
        ECFieldElement eCFieldElementSquare = this;
        for (int i11 = 0; i11 < i10; i11++) {
            eCFieldElementSquare = eCFieldElementSquare.square();
        }
        return eCFieldElementSquare;
    }

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public boolean testBitZero() {
        return toBigInteger().testBit(0);
    }

    public abstract BigInteger toBigInteger();

    public String toString() {
        return toBigInteger().toString(16);
    }

    public static class F2m extends ECFieldElement {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f25024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f25025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f25026e;

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i12 == 0 && i13 == 0) {
                this.f25023b = 2;
                this.f25025d = new int[]{i11};
            } else {
                if (i12 >= i13) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i12 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f25023b = 3;
                this.f25025d = new int[]{i11, i12, i13};
            }
            this.f25024c = i10;
            this.f25026e = new b(bigInteger);
        }

        public static void checkFieldElements(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            if (!(eCFieldElement instanceof F2m) || !(eCFieldElement2 instanceof F2m)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            F2m f2m = (F2m) eCFieldElement;
            F2m f2m2 = (F2m) eCFieldElement2;
            if (f2m.f25023b != f2m2.f25023b) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (f2m.f25024c != f2m2.f25024c || !Arrays.areEqual(f2m.f25025d, f2m2.f25025d)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            b bVar = (b) this.f25026e.clone();
            bVar.e(((F2m) eCFieldElement).f25026e);
            return new F2m(this.f25024c, bVar, this.f25025d);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            b bVar;
            b bVar2 = this.f25026e;
            if (bVar2.f25056p0.length == 0) {
                bVar = new b(new long[]{1});
            } else {
                int iMax = Math.max(1, bVar2.m());
                long[] jArr = new long[iMax];
                long[] jArr2 = bVar2.f25056p0;
                System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, iMax));
                jArr[0] = jArr[0] ^ 1;
                bVar = new b(jArr);
            }
            return new F2m(this.f25024c, bVar, this.f25025d);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.f25026e.l();
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return multiply(eCFieldElement.invert());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F2m)) {
                return false;
            }
            F2m f2m = (F2m) obj;
            return this.f25024c == f2m.f25024c && this.f25023b == f2m.f25023b && Arrays.areEqual(this.f25025d, f2m.f25025d) && this.f25026e.equals(f2m.f25026e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f25024c;
        }

        public int getK1() {
            return this.f25025d[0];
        }

        public int getK2() {
            int[] iArr = this.f25025d;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f25025d;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f25024c;
        }

        public int getRepresentation() {
            return this.f25023b;
        }

        public int hashCode() {
            return (this.f25026e.hashCode() ^ this.f25024c) ^ Arrays.hashCode(this.f25025d);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            b bVar = this.f25026e;
            int i10 = this.f25024c;
            int[] iArr = this.f25025d;
            return new F2m(i10, bVar.c(i10, iArr), iArr);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.f25026e.r();
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public boolean isZero() {
            for (long j10 : this.f25026e.f25056p0) {
                if (j10 != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i10;
            int i11;
            long[] jArr;
            b bVar = ((F2m) eCFieldElement).f25026e;
            b bVar2 = this.f25026e;
            int iL = bVar2.l();
            int i12 = this.f25024c;
            int[] iArr = this.f25025d;
            if (iL != 0) {
                int iL2 = bVar.l();
                if (iL2 != 0) {
                    if (iL > iL2) {
                        bVar2 = bVar;
                        bVar = bVar2;
                        iL2 = iL;
                        iL = iL2;
                    }
                    int i13 = (iL + 63) >>> 6;
                    int i14 = (iL2 + 63) >>> 6;
                    int i15 = ((iL + iL2) + 62) >>> 6;
                    if (i13 == 1) {
                        long j10 = bVar2.f25056p0[0];
                        if (j10 != 1) {
                            long[] jArr2 = new long[i15];
                            b.i(bVar.f25056p0, i14, j10, jArr2);
                            bVar = new b(jArr2, b.n(jArr2, i15, i12, iArr));
                        }
                    } else {
                        int i16 = (iL2 + 70) >>> 6;
                        int i17 = 16;
                        int[] iArr2 = new int[16];
                        int i18 = i16 << 4;
                        long[] jArr3 = new long[i18];
                        iArr2[1] = i16;
                        System.arraycopy(bVar.f25056p0, 0, jArr3, i16, i14);
                        int i19 = 2;
                        int i20 = i16;
                        while (i19 < i17) {
                            i20 += i16;
                            iArr2[i19] = i20;
                            if ((i19 & 1) == 0) {
                                jArr = jArr3;
                                b.q(jArr3, i20 >>> 1, jArr, i20, i16, 1);
                            } else {
                                jArr = jArr3;
                                int i21 = i20 - i16;
                                for (int i22 = 0; i22 < i16; i22++) {
                                    jArr[i20 + i22] = jArr[i16 + i22] ^ jArr[i21 + i22];
                                }
                            }
                            i19++;
                            i18 = i18;
                            iArr2 = iArr2;
                            i17 = i17;
                            jArr3 = jArr;
                        }
                        long[] jArr4 = jArr3;
                        int i23 = i18;
                        int[] iArr3 = iArr2;
                        long[] jArr5 = new long[i23];
                        b.q(jArr4, 0, jArr5, 0, i23, 4);
                        long[] jArr6 = bVar2.f25056p0;
                        int i24 = i15 << 3;
                        long[] jArr7 = new long[i24];
                        int i25 = 0;
                        while (i25 < i13) {
                            long j11 = jArr6[i25];
                            int i26 = i25;
                            while (true) {
                                i10 = i13;
                                i11 = i24;
                                int i27 = iArr3[((int) j11) & 15];
                                int i28 = iArr3[((int) (j11 >>> 4)) & 15];
                                for (int i29 = 0; i29 < i16; i29++) {
                                    int i30 = i26 + i29;
                                    jArr7[i30] = jArr7[i30] ^ (jArr4[i27 + i29] ^ jArr5[i28 + i29]);
                                }
                                j11 >>>= 8;
                                if (j11 == 0) {
                                    break;
                                }
                                i26 += i15;
                                i13 = i10;
                                i24 = i11;
                            }
                            i25++;
                            i13 = i10;
                            i24 = i11;
                        }
                        while (true) {
                            i24 -= i15;
                            if (i24 == 0) {
                                break;
                            }
                            b.j(jArr7, i24 - i15, jArr7, i24, i15, 8);
                            jArr7 = jArr7;
                        }
                        long[] jArr8 = jArr7;
                        bVar2 = new b(jArr8, b.n(jArr8, i15, i12, iArr));
                        bVar = bVar2;
                    }
                }
            } else {
                bVar = bVar2;
            }
            return new F2m(i12, bVar, iArr);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            b bVar = ((F2m) eCFieldElement).f25026e;
            b bVar2 = ((F2m) eCFieldElement2).f25026e;
            b bVar3 = ((F2m) eCFieldElement3).f25026e;
            b bVar4 = this.f25026e;
            int i10 = this.f25024c;
            int[] iArr = this.f25025d;
            b bVarK = bVar4.k(bVar);
            b bVarK2 = bVar2.k(bVar3);
            if (bVarK == bVar4 || bVarK == bVar) {
                bVarK = (b) bVarK.clone();
            }
            bVarK.e(bVarK2);
            long[] jArr = bVarK.f25056p0;
            int iN = b.n(jArr, jArr.length, i10, iArr);
            if (iN < jArr.length) {
                long[] jArr2 = new long[iN];
                bVarK.f25056p0 = jArr2;
                System.arraycopy(jArr, 0, jArr2, 0, iN);
            }
            return new F2m(i10, bVarK, iArr);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            b bVar = this.f25026e;
            for (long j10 : bVar.f25056p0) {
                if (j10 != 0) {
                    if (bVar.r()) {
                        break;
                    }
                    return squarePow(this.f25024c - 1);
                }
            }
            return this;
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            b bVar = this.f25026e;
            int iM = bVar.m();
            int i10 = this.f25024c;
            int[] iArr = this.f25025d;
            if (iM != 0) {
                int i11 = iM << 1;
                long[] jArr = new long[i11];
                int i12 = 0;
                while (i12 < i11) {
                    long j10 = bVar.f25056p0[i12 >>> 1];
                    int i13 = i12 + 1;
                    jArr[i12] = b.o((int) j10);
                    i12 += 2;
                    jArr[i13] = b.o((int) (j10 >>> 32));
                }
                bVar = new b(jArr, b.n(jArr, i11, i10, iArr));
            }
            return new F2m(i10, bVar, iArr);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            b bVar;
            b bVar2 = ((F2m) eCFieldElement).f25026e;
            b bVar3 = ((F2m) eCFieldElement2).f25026e;
            b bVar4 = this.f25026e;
            int iM = bVar4.m();
            if (iM == 0) {
                bVar = bVar4;
            } else {
                int i10 = iM << 1;
                long[] jArr = new long[i10];
                int i11 = 0;
                while (i11 < i10) {
                    long j10 = bVar4.f25056p0[i11 >>> 1];
                    int i12 = i11 + 1;
                    jArr[i11] = b.o((int) j10);
                    i11 += 2;
                    jArr[i12] = b.o((int) (j10 >>> 32));
                }
                bVar = new b(jArr, i10);
            }
            int i13 = this.f25024c;
            int[] iArr = this.f25025d;
            b bVarK = bVar2.k(bVar3);
            if (bVar == bVar4) {
                bVar = (b) bVar.clone();
            }
            bVar.e(bVarK);
            long[] jArr2 = bVar.f25056p0;
            int iN = b.n(jArr2, jArr2.length, i13, iArr);
            if (iN < jArr2.length) {
                long[] jArr3 = new long[iN];
                bVar.f25056p0 = jArr3;
                System.arraycopy(jArr2, 0, jArr3, 0, iN);
            }
            return new F2m(i13, bVar, iArr);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePow(int i10) {
            if (i10 < 1) {
                return this;
            }
            b bVar = this.f25026e;
            int iM = bVar.m();
            int i11 = this.f25024c;
            int[] iArr = this.f25025d;
            if (iM != 0) {
                int i12 = ((i11 + 63) >>> 6) << 1;
                long[] jArr = new long[i12];
                System.arraycopy(bVar.f25056p0, 0, jArr, 0, iM);
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        break;
                    }
                    int i13 = iM << 1;
                    while (true) {
                        iM--;
                        if (iM >= 0) {
                            long j10 = jArr[iM];
                            jArr[i13 - 1] = b.o((int) (j10 >>> 32));
                            i13 -= 2;
                            jArr[i13] = b.o((int) j10);
                        }
                    }
                    iM = b.n(jArr, i12, i11, iArr);
                }
                bVar = new b(jArr, iM);
            }
            return new F2m(i11, bVar, iArr);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            long[] jArr = this.f25026e.f25056p0;
            return jArr.length > 0 && (1 & jArr[0]) != 0;
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f25026e.s();
        }

        public F2m(int i10, int i11, BigInteger bigInteger) {
            this(i10, i11, 0, 0, bigInteger);
        }

        public F2m(int i10, b bVar, int[] iArr) {
            this.f25024c = i10;
            this.f25023b = iArr.length == 1 ? 2 : 3;
            this.f25025d = iArr;
            this.f25026e = bVar;
        }

        @Override // bc.org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }
    }
}
