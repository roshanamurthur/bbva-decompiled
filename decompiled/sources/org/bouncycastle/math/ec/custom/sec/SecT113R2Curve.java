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
public class SecT113R2Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECFieldElement[] f90759d = {new SecT113FieldElement(ECConstants.ONE)};
    protected SecT113R2Point infinity;

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f90761b;

        public a(int i10, long[] jArr) {
            this.f90760a = i10;
            this.f90761b = jArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90760a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            long[] jArrCreate64 = Nat128.create64();
            long[] jArrCreate65 = Nat128.create64();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90760a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 2; i13++) {
                    long j11 = jArrCreate64[i13];
                    long[] jArr = this.f90761b;
                    jArrCreate64[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    jArrCreate65[i13] = jArrCreate65[i13] ^ (jArr[(i11 + 2) + i13] & j10);
                }
                i11 += 4;
            }
            return SecT113R2Curve.this.createRawPoint(new SecT113FieldElement(jArrCreate64), new SecT113FieldElement(jArrCreate65), SecT113R2Curve.f90759d);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            long[] jArrCreate64 = Nat128.create64();
            long[] jArrCreate65 = Nat128.create64();
            int i11 = i10 * 4;
            for (int i12 = 0; i12 < 2; i12++) {
                long[] jArr = this.f90761b;
                jArrCreate64[i12] = jArr[i11 + i12];
                jArrCreate65[i12] = jArr[2 + i11 + i12];
            }
            return SecT113R2Curve.this.createRawPoint(new SecT113FieldElement(jArrCreate64), new SecT113FieldElement(jArrCreate65), SecT113R2Curve.f90759d);
        }
    }

    public SecT113R2Curve() {
        super(113, 9, 0, 0);
        this.infinity = new SecT113R2Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0095E9A9EC9B297BD4BF36E059184F")));
        this.order = new BigInteger(1, Hex.decodeStrict("010000000000000108789B2496AF93"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT113R2Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        long[] jArr = new long[i11 * 4];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat128.copy64(((SecT113FieldElement) eCPoint.getRawXCoord()).f90754x, 0, jArr, i12);
            Nat128.copy64(((SecT113FieldElement) eCPoint.getRawYCoord()).f90754x, 0, jArr, i12 + 2);
            i12 += 4;
        }
        return new a(i11, jArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT113R2Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT113FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 113;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT113R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
