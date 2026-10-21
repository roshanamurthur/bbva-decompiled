package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CipherParameters;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class u1 implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f66382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BigInteger f66383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f66385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f66387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y1 f66388g;

    public u1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, a(i10), i10, null, null);
    }

    private static int a(int i10) {
        if (i10 != 0 && i10 < 160) {
            return i10;
        }
        return 160;
    }

    public BigInteger b() {
        return this.f66383b;
    }

    public BigInteger c() {
        return this.f66384c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (c() != null) {
            if (!c().equals(u1Var.c())) {
                return false;
            }
        } else if (u1Var.c() != null) {
            return false;
        }
        return u1Var.b().equals(this.f66383b) && u1Var.a().equals(this.f66382a);
    }

    public int hashCode() {
        return (b().hashCode() ^ a().hashCode()) ^ (c() != null ? c().hashCode() : 0);
    }

    public u1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, y1 y1Var) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, y1Var);
    }

    public BigInteger a() {
        return this.f66382a;
    }

    public u1(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, y1 y1Var) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.f66382a = bigInteger2;
        this.f66383b = bigInteger;
        this.f66384c = bigInteger3;
        this.f66386e = i10;
        this.f66387f = i11;
        this.f66385d = bigInteger4;
        this.f66388g = y1Var;
    }
}
