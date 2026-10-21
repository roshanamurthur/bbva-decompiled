package org.bouncycastle.math.ec.custom.sec;

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
public class SecP256R1Curve extends ECCurve.AbstractFp {
    protected SecP256R1Point infinity;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final BigInteger f90731q = SecP256R1FieldElement.Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECFieldElement[] f90730c = {new SecP256R1FieldElement(ECConstants.ONE)};

    public class a extends AbstractECLookupTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f90732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f90733b;

        public a(int i10, int[] iArr) {
            this.f90732a = i10;
            this.f90733b = iArr;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final int getSize() {
            return this.f90732a;
        }

        @Override // org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookup(int i10) {
            int[] iArrCreate = Nat256.create();
            int[] iArrCreate2 = Nat256.create();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f90732a; i12++) {
                int i13 = ((i12 ^ i10) - 1) >> 31;
                for (int i14 = 0; i14 < 8; i14++) {
                    int i15 = iArrCreate[i14];
                    int[] iArr = this.f90733b;
                    iArrCreate[i14] = i15 ^ (iArr[i11 + i14] & i13);
                    iArrCreate2[i14] = iArrCreate2[i14] ^ (iArr[(i11 + 8) + i14] & i13);
                }
                i11 += 16;
            }
            return SecP256R1Curve.this.createRawPoint(new SecP256R1FieldElement(iArrCreate), new SecP256R1FieldElement(iArrCreate2), SecP256R1Curve.f90730c);
        }

        @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
        public final ECPoint lookupVar(int i10) {
            int[] iArrCreate = Nat256.create();
            int[] iArrCreate2 = Nat256.create();
            int i11 = i10 * 16;
            for (int i12 = 0; i12 < 8; i12++) {
                int[] iArr = this.f90733b;
                iArrCreate[i12] = iArr[i11 + i12];
                iArrCreate2[i12] = iArr[8 + i11 + i12];
            }
            return SecP256R1Curve.this.createRawPoint(new SecP256R1FieldElement(iArrCreate), new SecP256R1FieldElement(iArrCreate2), SecP256R1Curve.f90730c);
        }
    }

    public SecP256R1Curve() {
        super(f90731q);
        this.infinity = new SecP256R1Point(this, null, null);
        this.f90570a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f90571b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.order = new BigInteger(1, Hex.decodeStrict("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecP256R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        int[] iArr = new int[i11 * 16];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            Nat256.copy(((SecP256R1FieldElement) eCPoint.getRawXCoord()).f90737x, 0, iArr, i12);
            Nat256.copy(((SecP256R1FieldElement) eCPoint.getRawYCoord()).f90737x, 0, iArr, i12 + 8);
            i12 += 16;
        }
        return new a(i11, iArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecP256R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecP256R1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return f90731q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return f90731q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecP256R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
