package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.util.Vector;

/* JADX INFO: loaded from: classes5.dex */
public class NaccacheSternPrivateKeyParameters extends NaccacheSternKeyParameters {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final BigInteger f89345t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Vector f89346u0;

    public NaccacheSternPrivateKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, int i10, Vector vector, BigInteger bigInteger3) {
        super(true, bigInteger, bigInteger2, i10);
        this.f89346u0 = vector;
        this.f89345t0 = bigInteger3;
    }

    public BigInteger getPhi_n() {
        return this.f89345t0;
    }

    public Vector getSmallPrimes() {
        return this.f89346u0;
    }
}
