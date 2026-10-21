package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f89208p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89209q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89210r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Digest f89211s0;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f89208p0 = bigInteger;
        this.f89209q0 = bigInteger2;
        this.f89210r0 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f89211s0 = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f89208p0) && cramerShoupParameters.getG1().equals(this.f89209q0) && cramerShoupParameters.getG2().equals(this.f89210r0);
    }

    public BigInteger getG1() {
        return this.f89209q0;
    }

    public BigInteger getG2() {
        return this.f89210r0;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f89211s0).copy();
    }

    public BigInteger getP() {
        return this.f89208p0;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
