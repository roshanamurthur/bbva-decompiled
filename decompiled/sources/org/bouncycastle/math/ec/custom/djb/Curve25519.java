package org.bouncycastle.math.ec.custom.djb;

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
public class Curve25519 extends ECCurve.AbstractFp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f90633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f90634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ECFieldElement[] f90635e;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90636q = Curve25519FieldElement.Q;
    protected Curve25519Point infinity;

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90638b;

        public a(int i10, int[] iArr) {
            this.f90637a = i10;
            this.f90638b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90637a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat256.create();
            int[] iArrCreate2 = Nat256.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90637a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 8; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90638b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 8) + i14] & i13);
                }
                i11 += 16;
            }
            return Curve25519.this.createRawPoint(new Curve25519FieldElement(iArrCreate), new Curve25519FieldElement(iArrCreate2), Curve25519.f90635e);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat256.create();
            int[] iArrCreate2 = Nat256.create();
            int i11 = i10 * 16;
            for (int i12 = 0; i12 < 8; i12++) {
                int[] iArr = this.f90638b;
                iArrCreate[i12] = iArr[i11 + i12];
                iArrCreate2[i12] = iArr[8 + i11 + i12];
            }
            return Curve25519.this.createRawPoint(new Curve25519FieldElement(iArrCreate), new Curve25519FieldElement(iArrCreate2), Curve25519.f90635e);
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(1, Hex.decodeStrict("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        f90633c = bigInteger;
        f90634d = new BigInteger(1, Hex.decodeStrict("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        f90635e = new ECFieldElement[]{new Curve25519FieldElement(ECConstants.ONE), new Curve25519FieldElement(bigInteger)};
    }

    public Curve25519() {
        super(f90636q);
        this.infinity = new Curve25519Point(this, null, null);
        this.f90570a = fromBigInteger(f90633c);
        this.f90571b = fromBigInteger(f90634d);
        this.order = new BigInteger(1, Hex.decodeStrict("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.cofactor = BigInteger.valueOf(8L);
        this.coord = 4;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new Curve25519();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 16];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat256.copy(((Curve25519FieldElement) eCPoint.getRawXCoord()).f90643x, 0, iArr, i12);
            Nat256.copy(((Curve25519FieldElement) eCPoint.getRawYCoord()).f90643x, 0, iArr, i12 + 8);
            i12 += 16;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new Curve25519FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90636q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90636q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 4;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new Curve25519Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
