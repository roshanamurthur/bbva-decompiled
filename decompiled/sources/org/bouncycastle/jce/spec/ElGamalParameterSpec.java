package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f90530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f90531b;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f90530a = bigInteger;
        this.f90531b = bigInteger2;
    }

    public BigInteger getG() {
        return this.f90531b;
    }

    public BigInteger getP() {
        return this.f90530a;
    }
}
