package org.bouncycastle.math.ec.custom.sec;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes13.dex */
public class SecT193R2Curve extends ECCurve.AbstractF2m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ECFieldElement[] f90792d = {new SecT193FieldElement(ECConstants.ONE)};
    protected SecT193R2Point infinity;

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long[] f90794b;

        public a(int i10, long[] jArr) {
            this.f90793a = i10;
            this.f90794b = jArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90793a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            long[] jArrCreate64 = Nat256.create64();
            long[] jArrCreate65 = Nat256.create64();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90793a; i12++) {
                long j10 = ((i12 ^ i10) - 1) >> 31;
                for (int i13 = 0; i13 < 4; i13++) {
                    long j11 = jArrCreate64[i13];
                    long[] jArr = this.f90794b;
                    jArrCreate64[i13] = j11 ^ (jArr[i11 + i13] & j10);
                    jArrCreate65[i13] = jArrCreate65[i13] ^ (jArr[(i11 + 4) + i13] & j10);
                }
                i11 += 8;
            }
            return SecT193R2Curve.this.createRawPoint(new SecT193FieldElement(jArrCreate64), new SecT193FieldElement(jArrCreate65), SecT193R2Curve.f90792d);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            long[] jArrCreate64 = Nat256.create64();
            long[] jArrCreate65 = Nat256.create64();
            int i11 = i10 * 8;
            for (int i12 = 0; i12 < 4; i12++) {
                long j10 = jArrCreate64[i12];
                long[] jArr = this.f90794b;
                jArrCreate64[i12] = j10 ^ jArr[i11 + i12];
                jArrCreate65[i12] = jArrCreate65[i12] ^ jArr[(4 + i11) + i12];
            }
            return SecT193R2Curve.this.createRawPoint(new SecT193FieldElement(jArrCreate64), new SecT193FieldElement(jArrCreate65), SecT193R2Curve.f90792d);
        }
    }

    public SecT193R2Curve() {
        super(Opcodes.INSTANCEOF, 15, 0, 0);
        this.infinity = new SecT193R2Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.order = new BigInteger(1, Hex.decodeStrict("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT193R2Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        long[] jArr = new long[i11 * 8];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat256.copy64(((SecT193FieldElement) eCPoint.getRawXCoord()).f90787x, 0, jArr, i12);
            Nat256.copy64(((SecT193FieldElement) eCPoint.getRawYCoord()).f90787x, 0, jArr, i12 + 4);
            i12 += 8;
        }
        return new a(i11, jArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT193R2Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT193FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return Opcodes.INSTANCEOF;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 15;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return Opcodes.INSTANCEOF;
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
        return new SecT193R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
