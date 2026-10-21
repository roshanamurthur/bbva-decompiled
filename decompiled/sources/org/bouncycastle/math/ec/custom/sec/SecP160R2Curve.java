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
public class SecP160R2Curve extends ECCurve.AbstractFp {
    protected SecP160R2Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90676q = SecP160R2FieldElement.Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECFieldElement[] f90675c = {new SecP160R2FieldElement(ECConstants.ONE)};

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90678b;

        public a(int i10, int[] iArr) {
            this.f90677a = i10;
            this.f90678b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90677a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat160.create();
            int[] iArrCreate2 = Nat160.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90677a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 5; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90678b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 5) + i14] & i13);
                }
                i11 += 10;
            }
            return SecP160R2Curve.this.createRawPoint(new SecP160R2FieldElement(iArrCreate), new SecP160R2FieldElement(iArrCreate2), SecP160R2Curve.f90675c);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat160.create();
            int[] iArrCreate2 = Nat160.create();
            int i11 = i10 * 10;
            for (int i12 = 0; i12 < 5; i12++) {
                int[] iArr = this.f90678b;
                iArrCreate[i12] = iArr[i11 + i12];
                iArrCreate2[i12] = iArr[5 + i11 + i12];
            }
            return SecP160R2Curve.this.createRawPoint(new SecP160R2FieldElement(iArrCreate), new SecP160R2FieldElement(iArrCreate2), SecP160R2Curve.f90675c);
        }
    }

    public SecP160R2Curve() {
        super(f90676q);
        this.infinity = new SecP160R2Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.order = new BigInteger(1, Hex.decodeStrict("0100000000000000000000351EE786A818F3A1A16B"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP160R2Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 10];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat160.copy(((SecP160R2FieldElement) eCPoint.getRawXCoord()).f90683x, 0, iArr, i12);
            Nat160.copy(((SecP160R2FieldElement) eCPoint.getRawYCoord()).f90683x, 0, iArr, i12 + 5);
            i12 += 10;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP160R2Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP160R2FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90676q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90676q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP160R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
