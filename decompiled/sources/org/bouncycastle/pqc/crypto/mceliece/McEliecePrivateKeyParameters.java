package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

/* JADX INFO: loaded from: classes13.dex */
public class McEliecePrivateKeyParameters extends McElieceKeyParameters {
    public final PolynomialGF2mSmallM[] E0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f91183r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91184s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final GF2mField f91185t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final PolynomialGF2mSmallM f91186u0;
    public final GF2Matrix v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Permutation f91187w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Permutation f91188x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final GF2Matrix f91189y0;

    public McEliecePrivateKeyParameters(int i10, int i11, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix) {
        super(true, null);
        this.f91184s0 = i11;
        this.f91183r0 = i10;
        this.f91185t0 = gF2mField;
        this.f91186u0 = polynomialGF2mSmallM;
        this.v0 = gF2Matrix;
        this.f91187w0 = permutation;
        this.f91188x0 = permutation2;
        this.f91189y0 = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        this.E0 = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.f91185t0;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.f91186u0;
    }

    public GF2Matrix getH() {
        return this.f91189y0;
    }

    public int getK() {
        return this.f91184s0;
    }

    public int getN() {
        return this.f91183r0;
    }

    public Permutation getP1() {
        return this.f91187w0;
    }

    public Permutation getP2() {
        return this.f91188x0;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.E0;
    }

    public GF2Matrix getSInv() {
        return this.v0;
    }

    public McEliecePrivateKeyParameters(int i10, int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.f91183r0 = i10;
        this.f91184s0 = i11;
        GF2mField gF2mField = new GF2mField(bArr);
        this.f91185t0 = gF2mField;
        this.f91186u0 = new PolynomialGF2mSmallM(gF2mField, bArr2);
        this.v0 = new GF2Matrix(bArr3);
        this.f91187w0 = new Permutation(bArr4);
        this.f91188x0 = new Permutation(bArr5);
        this.f91189y0 = new GF2Matrix(bArr6);
        this.E0 = new PolynomialGF2mSmallM[bArr7.length];
        for (int i12 = 0; i12 < bArr7.length; i12++) {
            this.E0[i12] = new PolynomialGF2mSmallM(this.f91185t0, bArr7[i12]);
        }
    }
}
