package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat448;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecT409R1Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECFieldElement[] f90825d = {new SecT409FieldElement(ECConstants.ONE)};
    protected SecT409R1Point infinity;

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f90827b;

        public a(int i10, long[] jArr) {
            this.f90826a = i10;
            this.f90827b = jArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90826a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            long[] jArrCreate64 = Nat448.create64();
            long[] jArrCreate65 = Nat448.create64();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90826a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 7; i13++) {
                    long j11 = jArrCreate64[i13];
                    long[] jArr = this.f90827b;
                    jArrCreate64[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    jArrCreate65[i13] = jArrCreate65[i13] ^ (jArr[(i11 + 7) + i13] & j10);
                }
                i11 += 14;
            }
            return SecT409R1Curve.this.createRawPoint(new SecT409FieldElement(jArrCreate64), new SecT409FieldElement(jArrCreate65), SecT409R1Curve.f90825d);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            long[] jArrCreate64 = Nat448.create64();
            long[] jArrCreate65 = Nat448.create64();
            int i11 = i10 * 14;
            for (int i12 = 0; i12 < 7; i12++) {
                long[] jArr = this.f90827b;
                jArrCreate64[i12] = jArr[i11 + i12];
                jArrCreate65[i12] = jArr[7 + i11 + i12];
            }
            return SecT409R1Curve.this.createRawPoint(new SecT409FieldElement(jArrCreate64), new SecT409FieldElement(jArrCreate65), SecT409R1Curve.f90825d);
        }
    }

    public SecT409R1Curve() {
        super(409, 87, 0, 0);
        this.infinity = new SecT409R1Point(this, null, null);
        this.f90570a = fromBigInteger(BigInteger.valueOf(1L));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.order = new BigInteger(1, Hex.decodeStrict("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT409R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        long[] jArr = new long[i11 * 14];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat448.copy64(((SecT409FieldElement) eCPoint.getRawXCoord()).f90820x, 0, jArr, i12);
            Nat448.copy64(((SecT409FieldElement) eCPoint.getRawYCoord()).f90820x, 0, jArr, i12 + 7);
            i12 += 14;
        }
        return new a(i11, jArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT409R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT409FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 409;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 87;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 409;
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
        return new SecT409R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
