package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Random;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ECFieldElement implements ECConstants {

    public static abstract class AbstractF2m extends ECFieldElement {
        public ECFieldElement halfTrace() {
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) == 0) {
                throw new IllegalStateException("Half-trace only defined for odd m");
            }
            int i10 = (fieldSize + 1) >>> 1;
            int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(i10);
            ECFieldElement eCFieldElementAdd = this;
            int i11 = 1;
            while (iNumberOfLeadingZeros > 0) {
                eCFieldElementAdd = eCFieldElementAdd.squarePow(i11 << 1).add(eCFieldElementAdd);
                iNumberOfLeadingZeros--;
                i11 = i10 >>> iNumberOfLeadingZeros;
                if ((i11 & 1) != 0) {
                    eCFieldElementAdd = eCFieldElementAdd.squarePow(2).add(this);
                }
            }
            return eCFieldElementAdd;
        }

        public boolean hasFastTrace() {
            return false;
        }

        public int trace() {
            int fieldSize = getFieldSize();
            int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
            ECFieldElement eCFieldElementAdd = this;
            int i10 = 1;
            while (iNumberOfLeadingZeros > 0) {
                eCFieldElementAdd = eCFieldElementAdd.squarePow(i10).add(eCFieldElementAdd);
                iNumberOfLeadingZeros--;
                i10 = fieldSize >>> iNumberOfLeadingZeros;
                if ((i10 & 1) != 0) {
                    eCFieldElementAdd = eCFieldElementAdd.square().add(this);
                }
            }
            if (eCFieldElementAdd.isZero()) {
                return 0;
            }
            if (eCFieldElementAdd.isOne()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }
    }

    public static abstract class AbstractFp extends ECFieldElement {
    }

    public static class F2m extends AbstractF2m {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f90593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f90594d;

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i12 == 0 && i13 == 0) {
                this.f90591a = 2;
                this.f90593c = new int[]{i11};
            } else {
                if (i12 >= i13) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i12 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f90591a = 3;
                this.f90593c = new int[]{i11, i12, i13};
            }
            this.f90592b = i10;
            this.f90594d = new a(bigInteger);
        }

        public static void checkFieldElements(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            if (!(eCFieldElement instanceof F2m) || !(eCFieldElement2 instanceof F2m)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            F2m f2m = (F2m) eCFieldElement;
            F2m f2m2 = (F2m) eCFieldElement2;
            if (f2m.f90591a != f2m2.f90591a) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (f2m.f90592b != f2m2.f90592b || !Arrays.areEqual(f2m.f90593c, f2m2.f90593c)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            a aVar = (a) this.f90594d.clone();
            aVar.c(((F2m) eCFieldElement).f90594d);
            return new F2m(this.f90592b, aVar, this.f90593c);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            a aVar;
            a aVar2 = this.f90594d;
            if (aVar2.f90624p0.length == 0) {
                aVar = new a(new long[]{1});
            } else {
                int iMax = Math.max(1, aVar2.k());
                long[] jArr = new long[iMax];
                long[] jArr2 = aVar2.f90624p0;
                System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, iMax));
                jArr[0] = jArr[0] ^ 1;
                aVar = new a(jArr);
            }
            return new F2m(this.f90592b, aVar, this.f90593c);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int bitLength() {
            return this.f90594d.f();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
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
            return this.f90592b == f2m.f90592b && this.f90591a == f2m.f90591a && Arrays.areEqual(this.f90593c, f2m.f90593c) && this.f90594d.equals(f2m.f90594d);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "F2m";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f90592b;
        }

        public int getK1() {
            return this.f90593c[0];
        }

        public int getK2() {
            int[] iArr = this.f90593c;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        public int getK3() {
            int[] iArr = this.f90593c;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        public int getM() {
            return this.f90592b;
        }

        public int getRepresentation() {
            return this.f90591a;
        }

        public int hashCode() {
            return (this.f90594d.hashCode() ^ this.f90592b) ^ Arrays.hashCode(this.f90593c);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            a aVar = this.f90594d;
            int i10 = this.f90592b;
            int[] iArr = this.f90593c;
            return new F2m(i10, aVar.n(i10, iArr), iArr);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isOne() {
            return this.f90594d.m();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean isZero() {
            for (long j10 : this.f90594d.f90624p0) {
                if (j10 != 0) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            int i10;
            int i11;
            long[] jArr;
            a aVar = ((F2m) eCFieldElement).f90594d;
            a aVar2 = this.f90594d;
            int iF = aVar2.f();
            int i12 = this.f90592b;
            int[] iArr = this.f90593c;
            if (iF != 0) {
                int iF2 = aVar.f();
                if (iF2 != 0) {
                    if (iF > iF2) {
                        aVar2 = aVar;
                        aVar = aVar2;
                        iF2 = iF;
                        iF = iF2;
                    }
                    int i13 = (iF + 63) >>> 6;
                    int i14 = (iF2 + 63) >>> 6;
                    int i15 = ((iF + iF2) + 62) >>> 6;
                    if (i13 == 1) {
                        long j10 = aVar2.f90624p0[0];
                        if (j10 != 1) {
                            long[] jArr2 = new long[i15];
                            a.p(aVar.f90624p0, i14, j10, jArr2);
                            aVar = new a(jArr2, a.q(jArr2, i15, i12, iArr));
                        }
                    } else {
                        int i16 = (iF2 + 70) >>> 6;
                        int i17 = 16;
                        int[] iArr2 = new int[16];
                        int i18 = i16 << 4;
                        long[] jArr3 = new long[i18];
                        iArr2[1] = i16;
                        System.arraycopy(aVar.f90624p0, 0, jArr3, i16, i14);
                        int i19 = 2;
                        int i20 = i16;
                        while (i19 < i17) {
                            i20 += i16;
                            iArr2[i19] = i20;
                            if ((i19 & 1) == 0) {
                                jArr = jArr3;
                                a.r(jArr3, i20 >>> 1, jArr, i20, i16, 1);
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
                        a.r(jArr4, 0, jArr5, 0, i23, 4);
                        long[] jArr6 = aVar2.f90624p0;
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
                            a.d(jArr7, i24 - i15, jArr7, i24, i15, 8);
                            jArr7 = jArr7;
                        }
                        long[] jArr8 = jArr7;
                        aVar2 = new a(jArr8, a.q(jArr8, i15, i12, iArr));
                        aVar = aVar2;
                    }
                }
            } else {
                aVar = aVar2;
            }
            return new F2m(i12, aVar, iArr);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return multiplyPlusProduct(eCFieldElement, eCFieldElement2, eCFieldElement3);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            a aVar = ((F2m) eCFieldElement).f90594d;
            a aVar2 = ((F2m) eCFieldElement2).f90594d;
            a aVar3 = ((F2m) eCFieldElement3).f90594d;
            a aVar4 = this.f90594d;
            int i10 = this.f90592b;
            int[] iArr = this.f90593c;
            a aVarO = aVar4.o(aVar);
            a aVarO2 = aVar2.o(aVar3);
            if (aVarO == aVar4 || aVarO == aVar) {
                aVarO = (a) aVarO.clone();
            }
            aVarO.c(aVarO2);
            long[] jArr = aVarO.f90624p0;
            int iQ = a.q(jArr, jArr.length, i10, iArr);
            if (iQ < jArr.length) {
                long[] jArr2 = new long[iQ];
                aVarO.f90624p0 = jArr2;
                System.arraycopy(jArr, 0, jArr2, 0, iQ);
            }
            return new F2m(i10, aVarO, iArr);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            a aVar = this.f90594d;
            for (long j10 : aVar.f90624p0) {
                if (j10 != 0) {
                    if (aVar.m()) {
                        break;
                    }
                    return squarePow(this.f90592b - 1);
                }
            }
            return this;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            a aVar = this.f90594d;
            int iK = aVar.k();
            int i10 = this.f90592b;
            int[] iArr = this.f90593c;
            if (iK != 0) {
                int i11 = iK << 1;
                long[] jArr = new long[i11];
                int i12 = 0;
                while (i12 < i11) {
                    long j10 = aVar.f90624p0[i12 >>> 1];
                    int i13 = i12 + 1;
                    jArr[i12] = a.l((int) j10);
                    i12 += 2;
                    jArr[i13] = a.l((int) (j10 >>> 32));
                }
                aVar = new a(jArr, a.q(jArr, i11, i10, iArr));
            }
            return new F2m(i10, aVar, iArr);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return squarePlusProduct(eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            a aVar;
            a aVar2 = ((F2m) eCFieldElement).f90594d;
            a aVar3 = ((F2m) eCFieldElement2).f90594d;
            a aVar4 = this.f90594d;
            int iK = aVar4.k();
            if (iK == 0) {
                aVar = aVar4;
            } else {
                int i10 = iK << 1;
                long[] jArr = new long[i10];
                int i11 = 0;
                while (i11 < i10) {
                    long j10 = aVar4.f90624p0[i11 >>> 1];
                    int i12 = i11 + 1;
                    jArr[i11] = a.l((int) j10);
                    i11 += 2;
                    jArr[i12] = a.l((int) (j10 >>> 32));
                }
                aVar = new a(jArr, i10);
            }
            int i13 = this.f90592b;
            int[] iArr = this.f90593c;
            a aVarO = aVar2.o(aVar3);
            if (aVar == aVar4) {
                aVar = (a) aVar.clone();
            }
            aVar.c(aVarO);
            long[] jArr2 = aVar.f90624p0;
            int iQ = a.q(jArr2, jArr2.length, i13, iArr);
            if (iQ < jArr2.length) {
                long[] jArr3 = new long[iQ];
                aVar.f90624p0 = jArr3;
                System.arraycopy(jArr2, 0, jArr3, 0, iQ);
            }
            return new F2m(i13, aVar, iArr);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePow(int i10) {
            if (i10 < 1) {
                return this;
            }
            a aVar = this.f90594d;
            int iK = aVar.k();
            int i11 = this.f90592b;
            int[] iArr = this.f90593c;
            if (iK != 0) {
                int i12 = ((i11 + 63) >>> 6) << 1;
                long[] jArr = new long[i12];
                System.arraycopy(aVar.f90624p0, 0, jArr, 0, iK);
                while (true) {
                    i10--;
                    if (i10 < 0) {
                        break;
                    }
                    int i13 = iK << 1;
                    while (true) {
                        iK--;
                        if (iK >= 0) {
                            long j10 = jArr[iK];
                            jArr[i13 - 1] = a.l((int) (j10 >>> 32));
                            i13 -= 2;
                            jArr[i13] = a.l((int) j10);
                        }
                    }
                    iK = a.q(jArr, i12, i11, iArr);
                }
                aVar = new a(jArr, iK);
            }
            return new F2m(i11, aVar, iArr);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return add(eCFieldElement);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public boolean testBitZero() {
            long[] jArr = this.f90594d.f90624p0;
            return jArr.length > 0 && (1 & jArr[0]) != 0;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f90594d.s();
        }

        public F2m(int i10, a aVar, int[] iArr) {
            this.f90592b = i10;
            this.f90591a = iArr.length == 1 ? 2 : 3;
            this.f90593c = iArr;
            this.f90594d = aVar;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }
    }

    public static class Fp extends AbstractFp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigInteger f90595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigInteger f90596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigInteger f90597c;

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

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return new Fp(this.f90595a, this.f90596b, modAdd(this.f90597c, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement addOne() {
            BigInteger bigIntegerAdd = this.f90597c.add(ECConstants.ONE);
            BigInteger bigInteger = this.f90595a;
            if (bigIntegerAdd.compareTo(bigInteger) == 0) {
                bigIntegerAdd = ECConstants.ZERO;
            }
            return new Fp(bigInteger, this.f90596b, bigIntegerAdd);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return new Fp(this.f90595a, this.f90596b, modMult(this.f90597c, modInverse(eCFieldElement.toBigInteger())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fp)) {
                return false;
            }
            Fp fp = (Fp) obj;
            return this.f90595a.equals(fp.f90595a) && this.f90597c.equals(fp.f90597c);
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public String getFieldName() {
            return "Fp";
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public int getFieldSize() {
            return this.f90595a.bitLength();
        }

        public BigInteger getQ() {
            return this.f90595a;
        }

        public int hashCode() {
            return this.f90595a.hashCode() ^ this.f90597c.hashCode();
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement invert() {
            return new Fp(this.f90595a, this.f90596b, modInverse(this.f90597c));
        }

        public BigInteger modAdd(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
            BigInteger bigInteger3 = this.f90595a;
            return bigIntegerAdd.compareTo(bigInteger3) >= 0 ? bigIntegerAdd.subtract(bigInteger3) : bigIntegerAdd;
        }

        public BigInteger modDouble(BigInteger bigInteger) {
            BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(1);
            BigInteger bigInteger2 = this.f90595a;
            return bigIntegerShiftLeft.compareTo(bigInteger2) >= 0 ? bigIntegerShiftLeft.subtract(bigInteger2) : bigIntegerShiftLeft;
        }

        public BigInteger modHalf(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f90595a.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modHalfAbs(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f90595a.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger modInverse(BigInteger bigInteger) {
            int fieldSize = getFieldSize();
            int i10 = (fieldSize + 31) >> 5;
            int[] iArrFromBigInteger = Nat.fromBigInteger(fieldSize, this.f90595a);
            int[] iArrFromBigInteger2 = Nat.fromBigInteger(fieldSize, bigInteger);
            int[] iArrCreate = Nat.create(i10);
            Mod.invert(iArrFromBigInteger, iArrFromBigInteger2, iArrCreate);
            return Nat.toBigInteger(i10, iArrCreate);
        }

        public BigInteger modMult(BigInteger bigInteger, BigInteger bigInteger2) {
            return modReduce(bigInteger.multiply(bigInteger2));
        }

        public BigInteger modReduce(BigInteger bigInteger) {
            BigInteger bigInteger2 = this.f90595a;
            BigInteger bigInteger3 = this.f90596b;
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

        public BigInteger modSubtract(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
            return bigIntegerSubtract.signum() < 0 ? bigIntegerSubtract.add(this.f90595a) : bigIntegerSubtract;
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return new Fp(this.f90595a, this.f90596b, modMult(this.f90597c, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return new Fp(this.f90595a, this.f90596b, modReduce(this.f90597c.multiply(eCFieldElement.toBigInteger()).subtract(eCFieldElement2.toBigInteger().multiply(eCFieldElement3.toBigInteger()))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement multiplyPlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
            return new Fp(this.f90595a, this.f90596b, modReduce(this.f90597c.multiply(eCFieldElement.toBigInteger()).add(eCFieldElement2.toBigInteger().multiply(eCFieldElement3.toBigInteger()))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement negate() {
            BigInteger bigInteger = this.f90597c;
            if (bigInteger.signum() == 0) {
                return this;
            }
            BigInteger bigInteger2 = this.f90596b;
            BigInteger bigInteger3 = this.f90595a;
            return new Fp(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement sqrt() {
            Random random;
            if (isZero() || isOne()) {
                return this;
            }
            BigInteger bigInteger = this.f90595a;
            if (!bigInteger.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            int i10 = 1;
            boolean zTestBit = bigInteger.testBit(1);
            BigInteger bigInteger2 = this.f90596b;
            BigInteger bigInteger3 = this.f90597c;
            if (zTestBit) {
                Fp fp = new Fp(bigInteger, bigInteger2, bigInteger3.modPow(bigInteger.shiftRight(2).add(ECConstants.ONE), bigInteger));
                if (fp.square().equals(this)) {
                    return fp;
                }
                return null;
            }
            if (bigInteger.testBit(2)) {
                BigInteger bigIntegerModPow = bigInteger3.modPow(bigInteger.shiftRight(3), bigInteger);
                BigInteger bigIntegerModMult = modMult(bigIntegerModPow, bigInteger3);
                if (modMult(bigIntegerModMult, bigIntegerModPow).equals(ECConstants.ONE)) {
                    Fp fp2 = new Fp(bigInteger, bigInteger2, bigIntegerModMult);
                    if (fp2.square().equals(this)) {
                        return fp2;
                    }
                    return null;
                }
                Fp fp3 = new Fp(bigInteger, bigInteger2, modMult(bigIntegerModMult, ECConstants.TWO.modPow(bigInteger.shiftRight(2), bigInteger)));
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
            BigInteger bigIntegerModDouble = modDouble(modDouble(bigInteger3));
            BigInteger bigIntegerAdd = bigIntegerShiftRight.add(bigInteger4);
            BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger4);
            Random random2 = new Random();
            while (true) {
                BigInteger bigInteger5 = new BigInteger(bigInteger.bitLength(), random2);
                if (bigInteger5.compareTo(bigInteger) < 0 && modReduce(bigInteger5.multiply(bigInteger5).subtract(bigIntegerModDouble)).modPow(bigIntegerShiftRight, bigInteger).equals(bigIntegerSubtract)) {
                    int iBitLength = bigIntegerAdd.bitLength();
                    int lowestSetBit = bigIntegerAdd.getLowestSetBit();
                    BigInteger bigIntegerModMult2 = ECConstants.ONE;
                    int i11 = iBitLength - i10;
                    BigInteger bigInteger6 = bigIntegerShiftRight;
                    BigInteger bigIntegerModReduce = bigInteger5;
                    BigInteger bigIntegerModReduce2 = bigIntegerModMult2;
                    BigInteger bigIntegerModReduce3 = ECConstants.TWO;
                    BigInteger bigInteger7 = bigIntegerModReduce2;
                    while (true) {
                        random = random2;
                        if (i11 < lowestSetBit + 1) {
                            break;
                        }
                        bigIntegerModMult2 = modMult(bigIntegerModMult2, bigInteger7);
                        if (bigIntegerAdd.testBit(i11)) {
                            BigInteger bigIntegerModMult3 = modMult(bigIntegerModMult2, bigInteger3);
                            bigIntegerModReduce2 = modMult(bigIntegerModReduce2, bigIntegerModReduce);
                            BigInteger bigIntegerModReduce4 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce3).subtract(bigInteger5.multiply(bigIntegerModMult2)));
                            bigIntegerModReduce = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce).subtract(bigIntegerModMult3.shiftLeft(1)));
                            bigInteger7 = bigIntegerModMult3;
                            bigIntegerModReduce3 = bigIntegerModReduce4;
                        } else {
                            bigIntegerModReduce2 = modReduce(bigIntegerModReduce2.multiply(bigIntegerModReduce3).subtract(bigIntegerModMult2));
                            bigIntegerModReduce = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce3).subtract(bigInteger5.multiply(bigIntegerModMult2)));
                            bigIntegerModReduce3 = modReduce(bigIntegerModReduce3.multiply(bigIntegerModReduce3).subtract(bigIntegerModMult2.shiftLeft(1)));
                            bigInteger7 = bigIntegerModMult2;
                        }
                        i11--;
                        random2 = random;
                    }
                    BigInteger bigIntegerModMult4 = modMult(bigIntegerModMult2, bigInteger7);
                    BigInteger bigIntegerModMult5 = modMult(bigIntegerModMult4, bigInteger3);
                    BigInteger bigIntegerModReduce5 = modReduce(bigIntegerModReduce2.multiply(bigIntegerModReduce3).subtract(bigIntegerModMult4));
                    BigInteger bigIntegerModReduce6 = modReduce(bigIntegerModReduce.multiply(bigIntegerModReduce3).subtract(bigInteger5.multiply(bigIntegerModMult4)));
                    BigInteger bigIntegerModMult6 = modMult(bigIntegerModMult4, bigIntegerModMult5);
                    for (int i12 = 1; i12 <= lowestSetBit; i12++) {
                        bigIntegerModReduce5 = modMult(bigIntegerModReduce5, bigIntegerModReduce6);
                        bigIntegerModReduce6 = modReduce(bigIntegerModReduce6.multiply(bigIntegerModReduce6).subtract(bigIntegerModMult6.shiftLeft(1)));
                        bigIntegerModMult6 = modMult(bigIntegerModMult6, bigIntegerModMult6);
                    }
                    if (modMult(bigIntegerModReduce6, bigIntegerModReduce6).equals(bigIntegerModDouble)) {
                        return new Fp(bigInteger, bigInteger2, modHalfAbs(bigIntegerModReduce6));
                    }
                    if (!bigIntegerModReduce5.equals(ECConstants.ONE) && !bigIntegerModReduce5.equals(bigIntegerSubtract)) {
                        return null;
                    }
                    i10 = 1;
                    bigIntegerShiftRight = bigInteger6;
                    random2 = random;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement square() {
            BigInteger bigInteger = this.f90597c;
            return new Fp(this.f90595a, this.f90596b, modMult(bigInteger, bigInteger));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squareMinusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = eCFieldElement.toBigInteger();
            BigInteger bigInteger2 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger3 = this.f90597c;
            return new Fp(this.f90595a, this.f90596b, modReduce(bigInteger3.multiply(bigInteger3).subtract(bigInteger.multiply(bigInteger2))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement squarePlusProduct(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            BigInteger bigInteger = eCFieldElement.toBigInteger();
            BigInteger bigInteger2 = eCFieldElement2.toBigInteger();
            BigInteger bigInteger3 = this.f90597c;
            return new Fp(this.f90595a, this.f90596b, modReduce(bigInteger3.multiply(bigInteger3).add(bigInteger.multiply(bigInteger2))));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return new Fp(this.f90595a, this.f90596b, modSubtract(this.f90597c, eCFieldElement.toBigInteger()));
        }

        @Override // org.bouncycastle.math.ec.ECFieldElement
        public BigInteger toBigInteger() {
            return this.f90597c;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f90595a = bigInteger;
            this.f90596b = bigInteger2;
            this.f90597c = bigInteger3;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement addOne();

    public int bitLength() {
        return toBigInteger().bitLength();
    }

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public byte[] getEncoded() {
        return BigIntegers.asUnsignedByteArray((getFieldSize() + 7) / 8, toBigInteger());
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
}
