package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class SRP6GroupParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f89381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigInteger f89382b;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f89381a = bigInteger;
        this.f89382b = bigInteger2;
    }

    public BigInteger getG() {
        return this.f89382b;
    }

    public BigInteger getN() {
        return this.f89381a;
    }
}
