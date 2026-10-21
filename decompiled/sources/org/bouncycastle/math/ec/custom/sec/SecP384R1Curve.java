package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecP384R1Curve extends ECCurve.AbstractFp {
    protected SecP384R1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90739q = SecP384R1FieldElement.Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECFieldElement[] f90738c = {new SecP384R1FieldElement(ECConstants.ONE)};

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90741b;

        public a(int i10, int[] iArr) {
            this.f90740a = i10;
            this.f90741b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90740a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat.create(12);
            int[] iArrCreate2 = Nat.create(12);
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90740a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 12; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90741b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 12) + i14] & i13);
                }
                i11 += 24;
            }
            return SecP384R1Curve.this.createRawPoint(new SecP384R1FieldElement(iArrCreate), new SecP384R1FieldElement(iArrCreate2), SecP384R1Curve.f90738c);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat.create(12);
            int[] iArrCreate2 = Nat.create(12);
            int i11 = i10 * 24;
            for (int i12 = 0; i12 < 12; i12++) {
                int[] iArr = this.f90741b;
                iArrCreate[i12] = iArr[i11 + i12];
                iArrCreate2[i12] = iArr[i11 + 12 + i12];
            }
            return SecP384R1Curve.this.createRawPoint(new SecP384R1FieldElement(iArrCreate), new SecP384R1FieldElement(iArrCreate2), SecP384R1Curve.f90738c);
        }
    }

    public SecP384R1Curve() {
        super(f90739q);
        this.infinity = new SecP384R1Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP384R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 24];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat.copy(12, ((SecP384R1FieldElement) eCPoint.getRawXCoord()).f90746x, 0, iArr, i12);
            Nat.copy(12, ((SecP384R1FieldElement) eCPoint.getRawYCoord()).f90746x, 0, iArr, i12 + 12);
            i12 += 24;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP384R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP384R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90739q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90739q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP384R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
