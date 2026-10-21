package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class NaccacheSternKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89342q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89343r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f89344s0;

    public NaccacheSternKeyParameters(boolean z10, BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        super(z10);
        this.f89342q0 = bigInteger;
        this.f89343r0 = bigInteger2;
        this.f89344s0 = i10;
    }

    public BigInteger getG() {
        return this.f89342q0;
    }

    public int getLowerSigmaBound() {
        return this.f89344s0;
    }

    public BigInteger getModulus() {
        return this.f89343r0;
    }
}
