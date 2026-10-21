package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f91171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f91173r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91174s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Digest f91175t0;

    public McElieceParameters() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.f91174s0;
    }

    public int getM() {
        return this.f91171p0;
    }

    public int getN() {
        return this.f91173r0;
    }

    public int getT() {
        return this.f91172q0;
    }

    public McElieceParameters(int i10) {
        this(i10, (Digest) null);
    }

    public McElieceParameters(int i10, int i11) {
        this(i10, i11, (Digest) null);
    }

    public McElieceParameters(int i10, int i11, int i12) {
        this(i10, i11, i12, null);
    }

    public McElieceParameters(int i10, int i11, int i12, Digest digest) {
        this.f91171p0 = i10;
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i13 = 1 << i10;
        this.f91173r0 = i13;
        this.f91172q0 = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i12) != i10 || !PolynomialRingGF2.isIrreducible(i12)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.f91174s0 = i12;
        this.f91175t0 = digest;
    }

    public McElieceParameters(int i10, int i11, Digest digest) {
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f91171p0 = i10;
        int i12 = 1 << i10;
        this.f91173r0 = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i12) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f91172q0 = i11;
        this.f91174s0 = PolynomialRingGF2.getIrreduciblePolynomial(i10);
        this.f91175t0 = digest;
    }

    public McElieceParameters(int i10, Digest digest) {
        if (i10 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f91171p0 = 0;
        this.f91173r0 = 1;
        while (true) {
            int i11 = this.f91173r0;
            if (i11 >= i10) {
                int i12 = i11 >>> 1;
                this.f91172q0 = i12;
                int i13 = this.f91171p0;
                this.f91172q0 = i12 / i13;
                this.f91174s0 = PolynomialRingGF2.getIrreduciblePolynomial(i13);
                this.f91175t0 = digest;
                return;
            }
            this.f91173r0 = i11 << 1;
            this.f91171p0++;
        }
    }

    public McElieceParameters(Digest digest) {
        this(11, 50, digest);
    }
}
