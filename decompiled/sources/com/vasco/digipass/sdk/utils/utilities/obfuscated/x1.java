package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes9.dex */
public class x1 extends s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BigInteger f66426d = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final BigInteger f66427e = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f66428c;

    public x1(BigInteger bigInteger, u1 u1Var) {
        super(false, u1Var);
        this.f66428c = a(bigInteger, u1Var);
    }

    private BigInteger a(BigInteger bigInteger, u1 u1Var) {
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        BigInteger bigInteger2 = f66427e;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(u1Var.b().subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        if (u1Var.c() == null || f66426d.equals(bigInteger.modPow(u1Var.c(), u1Var.b()))) {
            return bigInteger;
        }
        throw new IllegalArgumentException("Y value does not appear to be in correct group");
    }

    public BigInteger b() {
        return this.f66428c;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s1
    public boolean equals(Object obj) {
        return (obj instanceof x1) && ((x1) obj).b().equals(this.f66428c) && super.equals(obj);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.s1
    public int hashCode() {
        return this.f66428c.hashCode() ^ super.hashCode();
    }
}
