package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ECFieldElement f90570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ECFieldElement f90571b;
    protected BigInteger cofactor;
    protected FiniteField field;
    protected BigInteger order;
    protected int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    public static abstract class AbstractF2m extends ECCurve {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BigInteger[] f90572c;

        /* JADX WARN: Illegal instructions before constructor call */
        public AbstractF2m(int i10, int i11, int i12, int i13) {
            PolynomialExtensionField binaryExtensionField;
            if (i11 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i12 == 0) {
                if (i13 != 0) {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
                binaryExtensionField = FiniteFields.getBinaryExtensionField(new int[]{0, i11, i10});
            } else {
                if (i12 <= i11) {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                if (i13 <= i12) {
                    throw new IllegalArgumentException("k3 must be > k2");
                }
                binaryExtensionField = FiniteFields.getBinaryExtensionField(new int[]{0, i11, i12, i13, i10});
            }
            super(binaryExtensionField);
            this.f90572c = null;
        }

        public static BigInteger inverse(int i10, int[] iArr, BigInteger bigInteger) {
            return new org.bouncycastle.math.ec.a(bigInteger).n(i10, iArr).s();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!eCFieldElementFromBigInteger.isZero()) {
                    eCFieldElementFromBigInteger2 = eCFieldElementFromBigInteger2.divide(eCFieldElementFromBigInteger).add(eCFieldElementFromBigInteger);
                } else if (!eCFieldElementFromBigInteger2.square().equals(getB())) {
                    throw new IllegalArgumentException();
                }
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementFromBigInteger2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i10, BigInteger bigInteger) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            if (eCFieldElementFromBigInteger.isZero()) {
                eCFieldElementAdd = getB().sqrt();
            } else {
                ECFieldElement eCFieldElementSolveQuadraticEquation = solveQuadraticEquation(eCFieldElementFromBigInteger.square().invert().multiply(getB()).add(getA()).add(eCFieldElementFromBigInteger));
                if (eCFieldElementSolveQuadraticEquation != null) {
                    if (eCFieldElementSolveQuadraticEquation.testBitZero() != (i10 == 1)) {
                        eCFieldElementSolveQuadraticEquation = eCFieldElementSolveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElementAdd = (coordinateSystem == 5 || coordinateSystem == 6) ? eCFieldElementSolveQuadraticEquation.add(eCFieldElementFromBigInteger) : eCFieldElementSolveQuadraticEquation.multiply(eCFieldElementFromBigInteger);
                } else {
                    eCFieldElementAdd = null;
                }
            }
            if (eCFieldElementAdd != null) {
                return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementAdd);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public boolean isKoblitz() {
            return this.order != null && this.cofactor != null && this.f90571b.isOne() && (this.f90570a.isZero() || this.f90570a.isOne());
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }

        public ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement.AbstractF2m abstractF2m = (ECFieldElement.AbstractF2m) eCFieldElement;
            boolean zHasFastTrace = abstractF2m.hasFastTrace();
            if (zHasFastTrace && abstractF2m.trace() != 0) {
                return null;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                ECFieldElement eCFieldElementHalfTrace = abstractF2m.halfTrace();
                if (zHasFastTrace || eCFieldElementHalfTrace.square().add(eCFieldElementHalfTrace).add(eCFieldElement).isZero()) {
                    return eCFieldElementHalfTrace;
                }
                return null;
            }
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(ECConstants.ZERO);
            Random random = new Random();
            do {
                ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                ECFieldElement eCFieldElementAdd2 = eCFieldElement;
                eCFieldElementAdd = eCFieldElementFromBigInteger;
                for (int i10 = 1; i10 < fieldSize; i10++) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
                    eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElementSquare.multiply(eCFieldElementFromBigInteger2));
                    eCFieldElementAdd2 = eCFieldElementSquare.add(eCFieldElement);
                }
                if (!eCFieldElementAdd2.isZero()) {
                    return null;
                }
            } while (eCFieldElementAdd.square().add(eCFieldElementAdd).isZero());
            return eCFieldElementAdd;
        }
    }

    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i10, BigInteger bigInteger) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.square().add(this.f90570a).multiply(eCFieldElementFromBigInteger).add(this.f90571b).sqrt();
            if (eCFieldElementSqrt == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (eCFieldElementSqrt.testBitZero() != (i10 == 1)) {
                eCFieldElementSqrt = eCFieldElementSqrt.negate();
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementSqrt);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().getCharacteristic()) < 0;
        }
    }

    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        public Config(int i10, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.coord = i10;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            if (!ECCurve.this.supportsCoordinateSystem(this.coord)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECCurve eCCurveCloneCurve = ECCurve.this.cloneCurve();
            if (eCCurveCloneCurve == ECCurve.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (eCCurveCloneCurve) {
                eCCurveCloneCurve.coord = this.coord;
                eCCurveCloneCurve.endomorphism = this.endomorphism;
                eCCurveCloneCurve.multiplier = this.multiplier;
            }
            return eCCurveCloneCurve;
        }

        public Config setCoordinateSystem(int i10) {
            this.coord = i10;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }
    }

    public static class F2m extends AbstractF2m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f90574d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f90575e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f90576f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f90577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ECPoint.F2m f90578h;

        public class a extends AbstractECLookupTable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f90579a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f90580b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long[] f90581c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int[] f90582d;

            public a(int i10, int i11, long[] jArr, int[] iArr) {
                this.f90579a = i10;
                this.f90580b = i11;
                this.f90581c = jArr;
                this.f90582d = iArr;
            }

            public final ECPoint a(long[] jArr, long[] jArr2) {
                F2m f2m = F2m.this;
                int i10 = f2m.f90574d;
                org.bouncycastle.math.ec.a aVar = new org.bouncycastle.math.ec.a(jArr);
                int[] iArr = this.f90582d;
                return f2m.createRawPoint(new ECFieldElement.F2m(i10, aVar, iArr), new ECFieldElement.F2m(f2m.f90574d, new org.bouncycastle.math.ec.a(jArr2), iArr));
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public final int getSize() {
                return this.f90579a;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public final ECPoint lookup(int i10) {
                int i11 = this.f90580b;
                long[] jArrCreate64 = Nat.create64(i11);
                long[] jArrCreate65 = Nat.create64(i11);
                int i12 = 0;
                for (int i13 = 0; i13 < this.f90579a; i13++) {
                    long j10 = ((i13 ^ i10) - 1) >> 31;
                    for (int i14 = 0; i14 < i11; i14++) {
                        long j11 = jArrCreate64[i14];
                        long[] jArr = this.f90581c;
                        jArrCreate64[i14] = j11 ^ (jArr[i12 + i14] & j10);
                        jArrCreate65[i14] = jArrCreate65[i14] ^ (jArr[(i12 + i11) + i14] & j10);
                    }
                    i12 += i11 * 2;
                }
                return a(jArrCreate64, jArrCreate65);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public final ECPoint lookupVar(int i10) {
                int i11 = this.f90580b;
                long[] jArrCreate64 = Nat.create64(i11);
                long[] jArrCreate65 = Nat.create64(i11);
                int i12 = i10 * i11 * 2;
                for (int i13 = 0; i13 < i11; i13++) {
                    long[] jArr = this.f90581c;
                    jArrCreate64[i13] = jArr[i12 + i13];
                    jArrCreate65[i13] = jArr[i12 + i11 + i13];
                }
                return a(jArrCreate64, jArrCreate65);
            }
        }

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, i12, i13, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new F2m(this.f90574d, this.f90575e, this.f90576f, this.f90577g, this.f90570a, this.f90571b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
            int i12 = (this.f90574d + 63) >>> 6;
            boolean zIsTrinomial = isTrinomial();
            int i13 = this.f90575e;
            int[] iArr = zIsTrinomial ? new int[]{i13} : new int[]{i13, this.f90576f, this.f90577g};
            long[] jArr = new long[i11 * i12 * 2];
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                ECPoint eCPoint = eCPointArr[i10 + i15];
                long[] jArr2 = ((ECFieldElement.F2m) eCPoint.getRawXCoord()).f90594d.f90624p0;
                System.arraycopy(jArr2, 0, jArr, i14, jArr2.length);
                int i16 = i14 + i12;
                long[] jArr3 = ((ECFieldElement.F2m) eCPoint.getRawYCoord()).f90594d.f90624p0;
                System.arraycopy(jArr3, 0, jArr, i16, jArr3.length);
                i14 = i16 + i12;
            }
            return new a(i11, i12, jArr, iArr);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECMultiplier createDefaultMultiplier() {
            return isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.F2m(this.f90574d, this.f90575e, this.f90576f, this.f90577g, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f90574d;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.f90578h;
        }

        public int getK1() {
            return this.f90575e;
        }

        public int getK2() {
            return this.f90576f;
        }

        public int getK3() {
            return this.f90577g;
        }

        public int getM() {
            return this.f90574d;
        }

        public boolean isTrinomial() {
            return this.f90576f == 0 && this.f90577g == 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 6;
        }

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i10, i11, i12, i13);
            this.f90574d = i10;
            this.f90575e = i11;
            this.f90576f = i12;
            this.f90577g = i13;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.f90578h = new ECPoint.F2m(this, null, null);
            this.f90570a = fromBigInteger(bigInteger);
            this.f90571b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public F2m(int i10, int i11, int i12, int i13, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i10, i11, i12, i13);
            this.f90574d = i10;
            this.f90575e = i11;
            this.f90576f = i12;
            this.f90577g = i13;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.f90578h = new ECPoint.F2m(this, null, null);
            this.f90570a = eCFieldElement;
            this.f90571b = eCFieldElement2;
            this.coord = 6;
        }

        public F2m(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    public static class Fp extends AbstractFp {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BigInteger f90584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BigInteger f90585d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ECPoint.Fp f90586e;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new Fp(this.f90584c, this.f90585d, this.f90570a, this.f90571b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.Fp(this.f90584c, this.f90585d, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f90584c.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.f90586e;
        }

        public BigInteger getQ() {
            return this.f90584c;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.Fp(this, fromBigInteger(eCPoint.f90598x.toBigInteger()), fromBigInteger(eCPoint.f90599y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.zs[0].toBigInteger())});
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f90584c = bigInteger;
            this.f90585d = ECFieldElement.Fp.a(bigInteger);
            this.f90586e = new ECPoint.Fp(this, null, null);
            this.f90570a = fromBigInteger(bigInteger2);
            this.f90571b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            this(bigInteger, bigInteger2, eCFieldElement, eCFieldElement2, null, null);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f90584c = bigInteger;
            this.f90585d = bigInteger2;
            this.f90586e = new ECPoint.Fp(this, null, null);
            this.f90570a = eCFieldElement;
            this.f90571b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f90588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f90589c;

        public a(int i10, int i11, byte[] bArr) {
            this.f90587a = i10;
            this.f90588b = i11;
            this.f90589c = bArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90587a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int i11 = this.f90588b;
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.f90587a; i13++) {
                int i14 = ((i13 ^ i10) - 1) >> 31;
                for (int i15 = 0; i15 < i11; i15++) {
                    byte b10 = bArr[i15];
                    byte[] bArr3 = this.f90589c;
                    bArr[i15] = (byte) (b10 ^ (bArr3[i12 + i15] & i14));
                    bArr2[i15] = (byte) (bArr2[i15] ^ (bArr3[(i12 + i11) + i15] & i14));
                }
                i12 += i11 * 2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            ECCurve eCCurve = ECCurve.this;
            return eCCurve.createRawPoint(eCCurve.fromBigInteger(bigInteger), eCCurve.fromBigInteger(new BigInteger(1, bArr2)));
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int i11 = this.f90588b;
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[i11];
            int i12 = i10 * i11 * 2;
            for (int i13 = 0; i13 < i11; i13++) {
                byte[] bArr3 = this.f90589c;
                bArr[i13] = bArr3[i12 + i13];
                bArr2[i13] = bArr3[i12 + i11 + i13];
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            ECCurve eCCurve = ECCurve.this;
            return eCCurve.createRawPoint(eCCurve.fromBigInteger(bigInteger), eCCurve.fromBigInteger(new BigInteger(1, bArr2)));
        }
    }

    public ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    public void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public void checkPoints(ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    public abstract ECCurve cloneCurve();

    public synchronized Config configure() {
        return new Config(this.coord, this.endomorphism, this.multiplier);
    }

    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int fieldSize = (getFieldSize() + 7) >>> 3;
        byte[] bArr = new byte[i11 * fieldSize * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            byte[] byteArray = eCPoint.getRawXCoord().toBigInteger().toByteArray();
            byte[] byteArray2 = eCPoint.getRawYCoord().toBigInteger().toByteArray();
            int i14 = 1;
            int i15 = byteArray.length > fieldSize ? 1 : 0;
            int length = byteArray.length - i15;
            if (byteArray2.length <= fieldSize) {
                i14 = 0;
            }
            int length2 = byteArray2.length - i14;
            int i16 = i12 + fieldSize;
            System.arraycopy(byteArray, i15, bArr, i16 - length, length);
            i12 = i16 + fieldSize;
            System.arraycopy(byteArray2, i14, bArr, i12 - length2, length2);
        }
        return new a(i11, fieldSize, bArr);
    }

    public ECMultiplier createDefaultMultiplier() {
        ECEndomorphism eCEndomorphism = this.endomorphism;
        return eCEndomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism) : new WNafL2RMultiplier();
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2);

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr);

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b10 = bArr[0];
        if (b10 != 0) {
            if (b10 == 2 || b10 == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                infinity = decompressPoint(b10 & 1, BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize));
                if (!infinity.a(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b10 != 4) {
                if (b10 != 6 && b10 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b10, 16));
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize);
                BigInteger bigIntegerFromUnsignedByteArray2 = BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                if (bigIntegerFromUnsignedByteArray2.testBit(0) != (b10 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                infinity = validatePoint(bigIntegerFromUnsignedByteArray, bigIntegerFromUnsignedByteArray2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                infinity = validatePoint(BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize), BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            infinity = getInfinity();
        }
        if (b10 == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public abstract ECPoint decompressPoint(int i10, BigInteger bigInteger);

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ECCurve) && equals((ECCurve) obj));
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f90570a;
    }

    public ECFieldElement getB() {
        return this.f90571b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public FiniteField getField() {
        return this.field;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public synchronized ECMultiplier getMultiplier() {
        try {
            if (this.multiplier == null) {
                this.multiplier = createDefaultMultiplier();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        Hashtable hashtable;
        PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            preCompInfo = (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return createPoint(eCPointNormalize.getXCoord().toBigInteger(), eCPointNormalize.getYCoord().toBigInteger());
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public PreCompInfo precompute(ECPoint eCPoint, String str, PreCompCallback preCompCallback) {
        Hashtable hashtable;
        PreCompInfo preCompInfoPrecompute;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            try {
                hashtable = eCPoint.preCompTable;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    eCPoint.preCompTable = hashtable;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (hashtable) {
            try {
                PreCompInfo preCompInfo = (PreCompInfo) hashtable.get(str);
                preCompInfoPrecompute = preCompCallback.precompute(preCompInfo);
                if (preCompInfoPrecompute != preCompInfo) {
                    hashtable.put(str, preCompInfoPrecompute);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return preCompInfoPrecompute;
    }

    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint eCPointCreatePoint = createPoint(bigInteger, bigInteger2);
        if (eCPointCreatePoint.isValid()) {
            return eCPointCreatePoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public void checkPoints(ECPoint[] eCPointArr, int i10, int i11) {
        if (eCPointArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i10 < 0 || i11 < 0 || i10 > eCPointArr.length - i11) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            ECPoint eCPoint = eCPointArr[i10 + i12];
            if (eCPoint != null && this != eCPoint.getCurve()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public boolean equals(ECCurve eCCurve) {
        return this == eCCurve || (eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger()));
    }

    public void normalizeAll(ECPoint[] eCPointArr, int i10, int i11, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i10, i11);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i10 + i13;
            ECPoint eCPoint = eCPointArr[i14];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i12] = eCPoint.getZCoord(0);
                iArr[i12] = i14;
                i12++;
            }
        }
        if (i12 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i12, eCFieldElement);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = iArr[i15];
            eCPointArr[i16] = eCPointArr[i16].b(eCFieldElementArr[i15]);
        }
    }
}
