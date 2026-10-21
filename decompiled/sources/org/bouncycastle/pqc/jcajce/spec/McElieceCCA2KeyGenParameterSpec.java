package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2KeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final String SHA1 = "SHA-1";
    public static final String SHA224 = "SHA-224";
    public static final String SHA256 = "SHA-256";
    public static final String SHA384 = "SHA-384";
    public static final String SHA512 = "SHA-512";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f91551e;

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, "SHA-256");
    }

    public String getDigest() {
        return this.f91551e;
    }

    public int getFieldPoly() {
        return this.f91550d;
    }

    public int getM() {
        return this.f91547a;
    }

    public int getN() {
        return this.f91549c;
    }

    public int getT() {
        return this.f91548b;
    }

    public McElieceCCA2KeyGenParameterSpec(int i10) {
        this(i10, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i10, int i11) {
        this(i10, i11, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i10, int i11, int i12) {
        this(i10, i11, i12, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i10, int i11, int i12, String str) {
        this.f91547a = i10;
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i13 = 1 << i10;
        this.f91549c = i13;
        this.f91548b = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i12) != i10 || !PolynomialRingGF2.isIrreducible(i12)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.f91550d = i12;
        this.f91551e = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i10, int i11, String str) {
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f91547a = i10;
        int i12 = 1 << i10;
        this.f91549c = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i12) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f91548b = i11;
        this.f91550d = PolynomialRingGF2.getIrreduciblePolynomial(i10);
        this.f91551e = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i10, String str) {
        int i11 = 1;
        if (i10 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        int i12 = 0;
        while (i11 < i10) {
            i11 <<= 1;
            i12++;
        }
        this.f91548b = (i11 >>> 1) / i12;
        this.f91547a = i12;
        this.f91549c = i11;
        this.f91550d = PolynomialRingGF2.getIrreduciblePolynomial(i12);
        this.f91551e = str;
    }
}
