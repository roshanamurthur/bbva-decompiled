package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f90538p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f90539q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f90540r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f90541s0;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f90538p0 = bigInteger;
        this.f90539q0 = bigInteger2;
        this.f90540r0 = bigInteger3;
        this.f90541s0 = bigInteger4;
    }

    public BigInteger getA() {
        return this.f90541s0;
    }

    public BigInteger getP() {
        return this.f90539q0;
    }

    public BigInteger getQ() {
        return this.f90540r0;
    }

    public BigInteger getX() {
        return this.f90538p0;
    }
}
