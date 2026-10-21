package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes5.dex */
public class DHParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f89228p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89229q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89230r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BigInteger f89231s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f89232t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f89233u0;
    public final DHValidationParameters v0;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f89229q0) && dHParameters.getG().equals(this.f89228p0);
    }

    public BigInteger getG() {
        return this.f89228p0;
    }

    public BigInteger getJ() {
        return this.f89231s0;
    }

    public int getL() {
        return this.f89233u0;
    }

    public int getM() {
        return this.f89232t0;
    }

    public BigInteger getP() {
        return this.f89229q0;
    }

    public BigInteger getQ() {
        return this.f89230r0;
    }

    public DHValidationParameters getValidationParameters() {
        return this.v0;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10) {
        int i11 = 160;
        if (i10 != 0 && i10 < 160) {
            i11 = i10;
        }
        this(bigInteger, bigInteger2, bigInteger3, i11, i10, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11) {
        this(bigInteger, bigInteger2, bigInteger3, i10, i11, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i10, int i11, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i11 != 0) {
            if (i11 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i10 > bigInteger.bitLength() && !Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f89228p0 = bigInteger2;
        this.f89229q0 = bigInteger;
        this.f89230r0 = bigInteger3;
        this.f89232t0 = i10;
        this.f89233u0 = i11;
        this.f89231s0 = bigInteger4;
        this.v0 = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, dHValidationParameters);
    }
}
