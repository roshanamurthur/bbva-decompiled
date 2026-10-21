package org.bouncycastle.pqc.jcajce.spec;

import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91555d;

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.f91555d;
    }

    public int getM() {
        return this.f91552a;
    }

    public int getN() {
        return this.f91554c;
    }

    public int getT() {
        return this.f91553b;
    }

    public McElieceKeyGenParameterSpec(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f91552a = 0;
        this.f91554c = 1;
        while (true) {
            int i11 = this.f91554c;
            if (i11 >= i10) {
                int i12 = i11 >>> 1;
                this.f91553b = i12;
                int i13 = this.f91552a;
                this.f91553b = i12 / i13;
                this.f91555d = PolynomialRingGF2.getIrreduciblePolynomial(i13);
                return;
            }
            this.f91554c = i11 << 1;
            this.f91552a++;
        }
    }

    public McElieceKeyGenParameterSpec(int i10, int i11) throws InvalidParameterException {
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f91552a = i10;
        int i12 = 1 << i10;
        this.f91554c = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i12) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f91553b = i11;
        this.f91555d = PolynomialRingGF2.getIrreduciblePolynomial(i10);
    }

    public McElieceKeyGenParameterSpec(int i10, int i11, int i12) {
        this.f91552a = i10;
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i13 = 1 << i10;
        this.f91554c = i13;
        this.f91553b = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i12) != i10 || !PolynomialRingGF2.isIrreducible(i12)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.f91555d = i12;
    }
}
