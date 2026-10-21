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
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecT239K1Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECFieldElement[] f90806d = {new SecT239FieldElement(ECConstants.ONE)};
    protected SecT239K1Point infinity;

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f90808b;

        public a(int i10, long[] jArr) {
            this.f90807a = i10;
            this.f90808b = jArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90807a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            long[] jArrCreate64 = Nat256.create64();
            long[] jArrCreate65 = Nat256.create64();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90807a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 4; i13++) {
                    long j11 = jArrCreate64[i13];
                    long[] jArr = this.f90808b;
                    jArrCreate64[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    jArrCreate65[i13] = jArrCreate65[i13] ^ (jArr[(i11 + 4) + i13] & j10);
                }
                i11 += 8;
            }
            return SecT239K1Curve.this.createRawPoint(new SecT239FieldElement(jArrCreate64), new SecT239FieldElement(jArrCreate65), SecT239K1Curve.f90806d);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            long[] jArrCreate64 = Nat256.create64();
            long[] jArrCreate65 = Nat256.create64();
            int i11 = i10 * 8;
            for (int i12 = 0; i12 < 4; i12++) {
                long[] jArr = this.f90808b;
                jArrCreate64[i12] = jArr[i11 + i12];
                jArrCreate65[i12] = jArr[4 + i11 + i12];
            }
            return SecT239K1Curve.this.createRawPoint(new SecT239FieldElement(jArrCreate64), new SecT239FieldElement(jArrCreate65), SecT239K1Curve.f90806d);
        }
    }

    public SecT239K1Curve() {
        super(239, 158, 0, 0);
        this.infinity = new SecT239K1Point(this, null, null);
        this.f90570a = fromBigInteger(BigInteger.valueOf(0L));
        this.f90571b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decodeStrict("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT239K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        long[] jArr = new long[i11 * 8];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawXCoord()).f90805x, 0, jArr, i12);
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawYCoord()).f90805x, 0, jArr, i12 + 4);
            i12 += 8;
        }
        return new a(i11, jArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT239FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 158;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
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
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
