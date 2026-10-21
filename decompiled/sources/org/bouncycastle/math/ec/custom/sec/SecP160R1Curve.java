package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat160;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecP160R1Curve extends ECCurve.AbstractFp {
    protected SecP160R1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90667q = SecP160R1FieldElement.Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECFieldElement[] f90666c = {new SecP160R1FieldElement(ECConstants.ONE)};

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90669b;

        public a(int i10, int[] iArr) {
            this.f90668a = i10;
            this.f90669b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90668a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat160.create();
            int[] iArrCreate2 = Nat160.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90668a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 5; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90669b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 5) + i14] & i13);
                }
                i11 += 10;
            }
            return SecP160R1Curve.this.createRawPoint(new SecP160R1FieldElement(iArrCreate), new SecP160R1FieldElement(iArrCreate2), SecP160R1Curve.f90666c);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat160.create();
            int[] iArrCreate2 = Nat160.create();
            int i11 = i10 * 10;
            for (int i12 = 0; i12 < 5; i12++) {
                int[] iArr = this.f90669b;
                iArrCreate[i12] = iArr[i11 + i12];
                iArrCreate2[i12] = iArr[5 + i11 + i12];
            }
            return SecP160R1Curve.this.createRawPoint(new SecP160R1FieldElement(iArrCreate), new SecP160R1FieldElement(iArrCreate2), SecP160R1Curve.f90666c);
        }
    }

    public SecP160R1Curve() {
        super(f90667q);
        this.infinity = new SecP160R1Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.order = new BigInteger(1, Hex.decodeStrict("0100000000000000000001F4C8F927AED3CA752257"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP160R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 10];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat160.copy(((SecP160R1FieldElement) eCPoint.getRawXCoord()).f90674x, 0, iArr, i12);
            Nat160.copy(((SecP160R1FieldElement) eCPoint.getRawYCoord()).f90674x, 0, iArr, i12 + 5);
            i12 += 10;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90667q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90667q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP160R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
