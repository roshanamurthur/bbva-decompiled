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
public class SecT131R1Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECFieldElement[] f90765d = {new SecT131FieldElement(ECConstants.ONE)};
    protected SecT131R1Point infinity;

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f90767b;

        public a(int i10, long[] jArr) {
            this.f90766a = i10;
            this.f90767b = jArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90766a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            long[] jArrCreate64 = Nat192.create64();
            long[] jArrCreate65 = Nat192.create64();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90766a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 3; i13++) {
                    long j11 = jArrCreate64[i13];
                    long[] jArr = this.f90767b;
                    jArrCreate64[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    jArrCreate65[i13] = jArrCreate65[i13] ^ (jArr[(i11 + 3) + i13] & j10);
                }
                i11 += 6;
            }
            return SecT131R1Curve.this.createRawPoint(new SecT131FieldElement(jArrCreate64), new SecT131FieldElement(jArrCreate65), SecT131R1Curve.f90765d);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            long[] jArrCreate64 = Nat192.create64();
            long[] jArrCreate65 = Nat192.create64();
            int i11 = i10 * 6;
            for (int i12 = 0; i12 < 3; i12++) {
                long[] jArr = this.f90767b;
                jArrCreate64[i12] = jArr[i11 + i12];
                jArrCreate65[i12] = jArr[3 + i11 + i12];
            }
            return SecT131R1Curve.this.createRawPoint(new SecT131FieldElement(jArrCreate64), new SecT131FieldElement(jArrCreate65), SecT131R1Curve.f90765d);
        }
    }

    public SecT131R1Curve() {
        super(131, 2, 3, 8);
        this.infinity = new SecT131R1Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0217C05610884B63B9C6C7291678F9D341")));
        this.order = new BigInteger(1, Hex.decodeStrict("0400000000000000023123953A9464B54D"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT131R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        long[] jArr = new long[i11 * 6];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat192.copy64(((SecT131FieldElement) eCPoint.getRawXCoord()).f90764x, 0, jArr, i12);
            Nat192.copy64(((SecT131FieldElement) eCPoint.getRawYCoord()).f90764x, 0, jArr, i12 + 3);
            i12 += 6;
        }
        return new a(i11, jArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT131R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT131FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 131;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 2;
    }

    public int getK2() {
        return 3;
    }

    public int getK3() {
        return 8;
    }

    public int getM() {
        return 131;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
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
        return new SecT131R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
