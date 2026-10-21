package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecP192R1Curve extends ECCurve.AbstractFp {
    protected SecP192R1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90694q = SecP192R1FieldElement.Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECFieldElement[] f90693c = {new SecP192R1FieldElement(ECConstants.ONE)};

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90696b;

        public a(int i10, int[] iArr) {
            this.f90695a = i10;
            this.f90696b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90695a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat192.create();
            int[] iArrCreate2 = Nat192.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90695a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 6; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90696b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 6) + i14] & i13);
                }
                i11 += 12;
            }
            return SecP192R1Curve.this.createRawPoint(new SecP192R1FieldElement(iArrCreate), new SecP192R1FieldElement(iArrCreate2), SecP192R1Curve.f90693c);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat192.create();
            int[] iArrCreate2 = Nat192.create();
            int i11 = i10 * 12;
            for (int i12 = 0; i12 < 6; i12++) {
                int[] iArr = this.f90696b;
                iArrCreate[i12] = iArr[i11 + i12];
                iArrCreate2[i12] = iArr[6 + i11 + i12];
            }
            return SecP192R1Curve.this.createRawPoint(new SecP192R1FieldElement(iArrCreate), new SecP192R1FieldElement(iArrCreate2), SecP192R1Curve.f90693c);
        }
    }

    public SecP192R1Curve() {
        super(f90694q);
        this.infinity = new SecP192R1Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP192R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 12];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat192.copy(((SecP192R1FieldElement) eCPoint.getRawXCoord()).f90701x, 0, iArr, i12);
            Nat192.copy(((SecP192R1FieldElement) eCPoint.getRawYCoord()).f90701x, 0, iArr, i12 + 6);
            i12 += 12;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP192R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP192R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90694q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90694q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP192R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
