package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat128;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecP128R1Curve extends ECCurve.AbstractFp {
    protected SecP128R1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90653q = SecP128R1FieldElement.Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECFieldElement[] f90652c = {new SecP128R1FieldElement(ECConstants.ONE)};

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90655b;

        public a(int i10, int[] iArr) {
            this.f90654a = i10;
            this.f90655b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90654a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat128.create();
            int[] iArrCreate2 = Nat128.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90654a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 4; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90655b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 4) + i14] & i13);
                }
                i11 += 8;
            }
            return SecP128R1Curve.this.createRawPoint(new SecP128R1FieldElement(iArrCreate), new SecP128R1FieldElement(iArrCreate2), SecP128R1Curve.f90652c);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat128.create();
            int[] iArrCreate2 = Nat128.create();
            int i11 = i10 * 8;
            for (int i12 = 0; i12 < 4; i12++) {
                int[] iArr = this.f90655b;
                iArrCreate[i12] = iArr[i11 + i12];
                iArrCreate2[i12] = iArr[4 + i11 + i12];
            }
            return SecP128R1Curve.this.createRawPoint(new SecP128R1FieldElement(iArrCreate), new SecP128R1FieldElement(iArrCreate2), SecP128R1Curve.f90652c);
        }
    }

    public SecP128R1Curve() {
        super(f90653q);
        this.infinity = new SecP128R1Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("E87579C11079F43DD824993C2CEE5ED3")));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFE0000000075A30D1B9038A115"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP128R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 8];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat128.copy(((SecP128R1FieldElement) eCPoint.getRawXCoord()).f90660x, 0, iArr, i12);
            Nat128.copy(((SecP128R1FieldElement) eCPoint.getRawYCoord()).f90660x, 0, iArr, i12 + 4);
            i12 += 8;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP128R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90653q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90653q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP128R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
