package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.math.raw.Nat576;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecT571K1Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECFieldElement[] f90831d = {new SecT571FieldElement(ECConstants.ONE)};
    protected SecT571K1Point infinity;

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f90833b;

        public a(int i10, long[] jArr) {
            this.f90832a = i10;
            this.f90833b = jArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90832a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            long[] jArrCreate64 = Nat576.create64();
            long[] jArrCreate65 = Nat576.create64();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90832a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 9; i13++) {
                    long j11 = jArrCreate64[i13];
                    long[] jArr = this.f90833b;
                    jArrCreate64[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    jArrCreate65[i13] = jArrCreate65[i13] ^ (jArr[(i11 + 9) + i13] & j10);
                }
                i11 += 18;
            }
            return SecT571K1Curve.this.createRawPoint(new SecT571FieldElement(jArrCreate64), new SecT571FieldElement(jArrCreate65), SecT571K1Curve.f90831d);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            long[] jArrCreate64 = Nat576.create64();
            long[] jArrCreate65 = Nat576.create64();
            int i11 = i10 * 18;
            for (int i12 = 0; i12 < 9; i12++) {
                long[] jArr = this.f90833b;
                jArrCreate64[i12] = jArr[i11 + i12];
                jArrCreate65[i12] = jArr[9 + i11 + i12];
            }
            return SecT571K1Curve.this.createRawPoint(new SecT571FieldElement(jArrCreate64), new SecT571FieldElement(jArrCreate65), SecT571K1Curve.f90831d);
        }
    }

    public SecT571K1Curve() {
        super(571, 2, 5, 10);
        this.infinity = new SecT571K1Point(this, null, null);
        this.f90570a = fromBigInteger(BigInteger.valueOf(0L));
        this.f90571b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decodeStrict("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT571K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        long[] jArr = new long[i11 * 18];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat576.copy64(((SecT571FieldElement) eCPoint.getRawXCoord()).f90830x, 0, jArr, i12);
            Nat576.copy64(((SecT571FieldElement) eCPoint.getRawYCoord()).f90830x, 0, jArr, i12 + 9);
            i12 += 18;
        }
        return new a(i11, jArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT571K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT571FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 571;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 5;
    }

    public int getK3() {
        return 10;
    }

    public int getM() {
        return 571;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT571K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
