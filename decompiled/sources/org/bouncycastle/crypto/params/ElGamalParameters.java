package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f89291p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89292q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f89293r0;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
        return elGamalParameters.getP().equals(this.f89292q0) && elGamalParameters.getG().equals(this.f89291p0) && elGamalParameters.getL() == this.f89293r0;
    }

    public BigInteger getG() {
        return this.f89291p0;
    }

    public int getL() {
        return this.f89293r0;
    }

    public BigInteger getP() {
        return this.f89292q0;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f89293r0;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        this.f89291p0 = bigInteger2;
        this.f89292q0 = bigInteger;
        this.f89293r0 = i10;
    }
}
