package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat224;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecP224K1Curve extends ECCurve.AbstractFp {
    protected SecP224K1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90703q = SecP224K1FieldElement.Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECFieldElement[] f90702c = {new SecP224K1FieldElement(ECConstants.ONE)};

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90705b;

        public a(int i10, int[] iArr) {
            this.f90704a = i10;
            this.f90705b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90704a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat224.create();
            int[] iArrCreate2 = Nat224.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90704a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 7; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90705b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 7) + i14] & i13);
                }
                i11 += 14;
            }
            return SecP224K1Curve.this.createRawPoint(new SecP224K1FieldElement(iArrCreate), new SecP224K1FieldElement(iArrCreate2), SecP224K1Curve.f90702c);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat224.create();
            int[] iArrCreate2 = Nat224.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90704a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 7; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90705b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 7) + i14] & i13);
                }
                i11 += 14;
            }
            return SecP224K1Curve.this.createRawPoint(new SecP224K1FieldElement(iArrCreate), new SecP224K1FieldElement(iArrCreate2), SecP224K1Curve.f90702c);
        }
    }

    public SecP224K1Curve() {
        super(f90703q);
        this.infinity = new SecP224K1Point(this, null, null);
        this.f90570a = fromBigInteger(ECConstants.ZERO);
        this.f90571b = fromBigInteger(BigInteger.valueOf(5L));
        this.order = new BigInteger(1, Hex.decodeStrict("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP224K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 14];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat224.copy(((SecP224K1FieldElement) eCPoint.getRawXCoord()).f90711x, 0, iArr, i12);
            Nat224.copy(((SecP224K1FieldElement) eCPoint.getRawYCoord()).f90711x, 0, iArr, i12 + 7);
            i12 += 14;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP224K1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90703q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90703q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP224K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
