package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes8.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f90545p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f90546q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f90547r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f90548s0;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f90545p0 = bigInteger;
        this.f90546q0 = bigInteger2;
        this.f90547r0 = bigInteger3;
        this.f90548s0 = bigInteger4;
    }

    public BigInteger getA() {
        return this.f90548s0;
    }

    public BigInteger getP() {
        return this.f90546q0;
    }

    public BigInteger getQ() {
        return this.f90547r0;
    }

    public BigInteger getY() {
        return this.f90545p0;
    }
}
