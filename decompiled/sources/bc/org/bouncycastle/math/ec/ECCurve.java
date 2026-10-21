package bc.org.bouncycastle.math.ec;

import bc.org.bouncycastle.math.ec.endo.ECEndomorphism;
import bc.org.bouncycastle.math.ec.endo.GLVEndomorphism;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.i3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.n4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.o0;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y2;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.z2;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes2.dex */
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
    protected y2 f25004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ECFieldElement f25005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ECFieldElement f25006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected BigInteger f25007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected BigInteger f25008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f25009f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected ECEndomorphism f25010g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ECMultiplier f25011h = null;

    public static abstract class AbstractF2m extends ECCurve {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public BigInteger[] f25012k;

        /* JADX WARN: Illegal instructions before constructor call */
        public AbstractF2m(int i10, int i11, int i12, int i13) {
            n4 n4VarA;
            if (i11 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            }
            if (i12 == 0) {
                if (i13 != 0) {
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                }
                n4VarA = z2.a(new int[]{0, i11, i10});
            } else {
                if (i12 <= i11) {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                if (i13 <= i12) {
                    throw new IllegalArgumentException("k3 must be > k2");
                }
                n4VarA = z2.a(new int[]{0, i11, i12, i13, i10});
            }
            super(n4VarA);
            this.f25012k = null;
        }

        public static BigInteger inverse(int i10, int[] iArr, BigInteger bigInteger) {
            return new b(bigInteger).c(i10, iArr).s();
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint a(int i10, BigInteger bigInteger) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            if (eCFieldElementFromBigInteger.isZero()) {
                eCFieldElementAdd = getB().sqrt();
            } else {
                ECFieldElement eCFieldElementAdd2 = eCFieldElementFromBigInteger.square().invert().multiply(getB()).add(getA()).add(eCFieldElementFromBigInteger);
                if (!eCFieldElementAdd2.isZero()) {
                    ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(ECConstants.ZERO);
                    int fieldSize = getFieldSize();
                    SecureRandom secureRandom = new SecureRandom();
                    while (true) {
                        ECFieldElement eCFieldElementFromBigInteger3 = fromBigInteger(new BigInteger(fieldSize, secureRandom));
                        ECFieldElement eCFieldElementAdd3 = eCFieldElementAdd2;
                        ECFieldElement eCFieldElementAdd4 = eCFieldElementFromBigInteger2;
                        for (int i11 = 1; i11 < fieldSize; i11++) {
                            ECFieldElement eCFieldElementSquare = eCFieldElementAdd3.square();
                            eCFieldElementAdd4 = eCFieldElementAdd4.square().add(eCFieldElementSquare.multiply(eCFieldElementFromBigInteger3));
                            eCFieldElementAdd3 = eCFieldElementSquare.add(eCFieldElementAdd2);
                        }
                        if (!eCFieldElementAdd3.isZero()) {
                            eCFieldElementAdd2 = null;
                            break;
                        }
                        if (!eCFieldElementAdd4.square().add(eCFieldElementAdd4).isZero()) {
                            eCFieldElementAdd2 = eCFieldElementAdd4;
                            break;
                        }
                    }
                }
                if (eCFieldElementAdd2 != null) {
                    if (eCFieldElementAdd2.testBitZero() != (i10 == 1)) {
                        eCFieldElementAdd2 = eCFieldElementAdd2.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElementAdd = (coordinateSystem == 5 || coordinateSystem == 6) ? eCFieldElementAdd2.add(eCFieldElementFromBigInteger) : eCFieldElementAdd2.multiply(eCFieldElementFromBigInteger);
                } else {
                    eCFieldElementAdd = null;
                }
            }
            if (eCFieldElementAdd != null) {
                return a(eCFieldElementFromBigInteger, eCFieldElementAdd, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z10) {
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
            return a(eCFieldElementFromBigInteger, eCFieldElementFromBigInteger2, z10);
        }

        public boolean isKoblitz() {
            return this.f25007d != null && this.f25008e != null && this.f25006c.isOne() && (this.f25005b.isZero() || this.f25005b.isOne());
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }
    }

    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(z2.a(bigInteger));
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint a(int i10, BigInteger bigInteger) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.square().add(this.f25005b).multiply(eCFieldElementFromBigInteger).add(this.f25006c).sqrt();
            if (eCFieldElementSqrt == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (eCFieldElementSqrt.testBitZero() != (i10 == 1)) {
                eCFieldElementSqrt = eCFieldElementSqrt.negate();
            }
            return a(eCFieldElementFromBigInteger, eCFieldElementSqrt, true);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().c()) < 0;
        }
    }

    public class Config {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f25013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected ECEndomorphism f25014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected ECMultiplier f25015c;

        public Config(int i10, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.f25013a = i10;
            this.f25014b = eCEndomorphism;
            this.f25015c = eCMultiplier;
        }

        public ECCurve create() {
            if (!ECCurve.this.supportsCoordinateSystem(this.f25013a)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECCurve eCCurveA = ECCurve.this.a();
            if (eCCurveA == ECCurve.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (eCCurveA) {
                eCCurveA.f25009f = this.f25013a;
                eCCurveA.f25010g = this.f25014b;
                eCCurveA.f25011h = this.f25015c;
            }
            return eCCurveA;
        }

        public Config setCoordinateSystem(int i10) {
            this.f25013a = i10;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.f25014b = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.f25015c = eCMultiplier;
            return this;
        }
    }

    public static class F2m extends AbstractF2m {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f25017l;
        public final int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f25018n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f25019o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final ECPoint.F2m f25020p;

        public F2m(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECCurve a() {
            return new F2m(this.f25017l, this.m, this.f25018n, this.f25019o, this.f25005b, this.f25006c, this.f25007d, this.f25008e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECMultiplier b() {
            return isKoblitz() ? new WTauNafMultiplier() : super.b();
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.F2m(this.f25017l, this.m, this.f25018n, this.f25019o, bigInteger);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f25017l;
        }

        public BigInteger getH() {
            return this.f25008e;
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.f25020p;
        }

        public int getK1() {
            return this.m;
        }

        public int getK2() {
            return this.f25018n;
        }

        public int getK3() {
            return this.f25019o;
        }

        public int getM() {
            return this.f25017l;
        }

        public BigInteger getN() {
            return this.f25007d;
        }

        public boolean isTrinomial() {
            return this.f25018n == 0 && this.f25019o == 0;
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 6;
        }

        public F2m(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, z10);
        }

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, i12, i13, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
        }

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i10, i11, i12, i13);
            this.f25017l = i10;
            this.m = i11;
            this.f25018n = i12;
            this.f25019o = i13;
            this.f25007d = bigInteger3;
            this.f25008e = bigInteger4;
            this.f25020p = new ECPoint.F2m(this, null, null);
            this.f25005b = fromBigInteger(bigInteger);
            this.f25006c = fromBigInteger(bigInteger2);
            this.f25009f = 6;
        }

        public F2m(int i10, int i11, int i12, int i13, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i10, i11, i12, i13);
            this.f25017l = i10;
            this.m = i11;
            this.f25018n = i12;
            this.f25019o = i13;
            this.f25007d = bigInteger;
            this.f25008e = bigInteger2;
            this.f25020p = new ECPoint.F2m(this, null, null);
            this.f25005b = eCFieldElement;
            this.f25006c = eCFieldElement2;
            this.f25009f = 6;
        }
    }

    public static class Fp extends AbstractFp {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final BigInteger f25021k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final BigInteger f25022l;
        public final ECPoint.Fp m;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECCurve a() {
            return new Fp(this.f25021k, this.f25022l, this.f25005b, this.f25006c, this.f25007d, this.f25008e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return new ECFieldElement.Fp(this.f25021k, this.f25022l, bigInteger);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f25021k.bitLength();
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.m;
        }

        public BigInteger getQ() {
            return this.f25021k;
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.Fp(this, fromBigInteger(eCPoint.f25032b.toBigInteger()), fromBigInteger(eCPoint.f25033c.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.f25034d[0].toBigInteger())}, eCPoint.f25035e);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.f25021k = bigInteger;
            this.f25022l = ECFieldElement.Fp.a(bigInteger);
            this.m = new ECPoint.Fp(this, null, null);
            this.f25005b = fromBigInteger(bigInteger2);
            this.f25006c = fromBigInteger(bigInteger3);
            this.f25007d = bigInteger4;
            this.f25008e = bigInteger5;
            this.f25009f = 4;
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, z10);
        }

        @Override // bc.org.bouncycastle.math.ec.ECCurve
        public ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr, z10);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f25021k = bigInteger;
            this.f25022l = bigInteger2;
            this.m = new ECPoint.Fp(this, null, null);
            this.f25005b = eCFieldElement;
            this.f25006c = eCFieldElement2;
            this.f25007d = bigInteger3;
            this.f25008e = bigInteger4;
            this.f25009f = 4;
        }
    }

    public ECCurve(y2 y2Var) {
        this.f25004a = y2Var;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    public abstract ECCurve a();

    public abstract ECPoint a(int i10, BigInteger bigInteger);

    public abstract ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z10);

    public abstract ECPoint a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr, boolean z10);

    public void a(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public ECMultiplier b() {
        ECEndomorphism eCEndomorphism = this.f25010g;
        return eCEndomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism) : new WNafL2RMultiplier();
    }

    public synchronized Config configure() {
        return new Config(this.f25009f, this.f25010g, this.f25011h);
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createPoint(bigInteger, bigInteger2, false);
    }

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b10 = bArr[0];
        if (b10 != 0) {
            if (b10 == 2 || b10 == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                infinity = a(b10 & 1, o0.a(bArr, 1, fieldSize));
                if (!infinity.f()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b10 != 4) {
                if (b10 != 6 && b10 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b10, 16));
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerA = o0.a(bArr, 1, fieldSize);
                BigInteger bigIntegerA2 = o0.a(bArr, fieldSize + 1, fieldSize);
                if (bigIntegerA2.testBit(0) != (b10 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                infinity = validatePoint(bigIntegerA, bigIntegerA2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                infinity = validatePoint(o0.a(bArr, 1, fieldSize), o0.a(bArr, fieldSize + 1, fieldSize));
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

    public boolean equals(ECCurve eCCurve) {
        return this == eCCurve || (eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger()));
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f25005b;
    }

    public ECFieldElement getB() {
        return this.f25006c;
    }

    public BigInteger getCofactor() {
        return this.f25008e;
    }

    public int getCoordinateSystem() {
        return this.f25009f;
    }

    public ECEndomorphism getEndomorphism() {
        return this.f25010g;
    }

    public y2 getField() {
        return this.f25004a;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public synchronized ECMultiplier getMultiplier() {
        try {
            if (this.f25011h == null) {
                this.f25011h = b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25011h;
    }

    public BigInteger getOrder() {
        return this.f25007d;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        PreCompInfo preCompInfo;
        a(eCPoint);
        synchronized (eCPoint) {
            Hashtable hashtable = eCPoint.f25036f;
            preCompInfo = hashtable == null ? null : (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return (getField().hashCode() ^ i3.a(getA().toBigInteger().hashCode(), 8)) ^ i3.a(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return validatePoint(eCPointNormalize.getXCoord().toBigInteger(), eCPointNormalize.getYCoord().toBigInteger(), eCPointNormalize.f25035e);
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public void setPreCompInfo(ECPoint eCPoint, String str, PreCompInfo preCompInfo) {
        a(eCPoint);
        synchronized (eCPoint) {
            try {
                Hashtable hashtable = eCPoint.f25036f;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    eCPoint.f25036f = hashtable;
                }
                hashtable.put(str, preCompInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
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

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z10) {
        return a(fromBigInteger(bigInteger), fromBigInteger(bigInteger2), z10);
    }

    public void normalizeAll(ECPoint[] eCPointArr, int i10, int i11, ECFieldElement eCFieldElement) {
        a(eCPointArr, i10, i11);
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
            eCPointArr[i16] = eCPointArr[i16].a(eCFieldElementArr[i15]);
        }
    }

    public void a(ECPoint[] eCPointArr, int i10, int i11) {
        if (eCPointArr != null) {
            if (i10 < 0 || i11 < 0 || i10 > eCPointArr.length - i11) {
                throw new IllegalArgumentException("invalid range specified for 'points'");
            }
            for (int i12 = 0; i12 < i11; i12++) {
                ECPoint eCPoint = eCPointArr[i10 + i12];
                if (eCPoint != null && this != eCPoint.getCurve()) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
            return;
        }
        throw new IllegalArgumentException("'points' cannot be null");
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ECCurve) && equals((ECCurve) obj));
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z10) {
        ECPoint eCPointCreatePoint = createPoint(bigInteger, bigInteger2, z10);
        if (eCPointCreatePoint.isValid()) {
            return eCPointCreatePoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }
}
