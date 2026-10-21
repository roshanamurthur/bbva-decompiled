package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f89252p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89253q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89254r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final DSAValidationParameters f89255s0;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f89252p0 = bigInteger3;
        this.f89254r0 = bigInteger;
        this.f89253q0 = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f89254r0) && dSAParameters.getQ().equals(this.f89253q0) && dSAParameters.getG().equals(this.f89252p0);
    }

    public BigInteger getG() {
        return this.f89252p0;
    }

    public BigInteger getP() {
        return this.f89254r0;
    }

    public BigInteger getQ() {
        return this.f89253q0;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.f89255s0;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f89252p0 = bigInteger3;
        this.f89254r0 = bigInteger;
        this.f89253q0 = bigInteger2;
        this.f89255s0 = dSAValidationParameters;
    }
}
