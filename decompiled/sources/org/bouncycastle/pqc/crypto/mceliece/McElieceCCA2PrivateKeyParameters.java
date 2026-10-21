package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2PrivateKeyParameters extends McElieceCCA2KeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f91133r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91134s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final GF2mField f91135t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final PolynomialGF2mSmallM f91136u0;
    public final Permutation v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final GF2Matrix f91137w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final PolynomialGF2mSmallM[] f91138x0;

    public McElieceCCA2PrivateKeyParameters(int i10, int i11, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, GF2Matrix gF2Matrix, Permutation permutation, String str) {
        super(true, str);
        this.f91133r0 = i10;
        this.f91134s0 = i11;
        this.f91135t0 = gF2mField;
        this.f91136u0 = polynomialGF2mSmallM;
        this.f91137w0 = gF2Matrix;
        this.v0 = permutation;
        this.f91138x0 = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.f91135t0;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.f91136u0;
    }

    public GF2Matrix getH() {
        return this.f91137w0;
    }

    public int getK() {
        return this.f91134s0;
    }

    public int getN() {
        return this.f91133r0;
    }

    public Permutation getP() {
        return this.v0;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.f91138x0;
    }

    public int getT() {
        return this.f91136u0.getDegree();
    }

    public McElieceCCA2PrivateKeyParameters(int i10, int i11, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, String str) {
        this(i10, i11, gF2mField, polynomialGF2mSmallM, GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), permutation, str);
    }
}
