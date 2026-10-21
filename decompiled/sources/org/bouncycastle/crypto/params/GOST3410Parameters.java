package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BigInteger f89298p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89299q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89300r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final GOST3410ValidationParameters f89301s0;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f89298p0 = bigInteger;
        this.f89299q0 = bigInteger2;
        this.f89300r0 = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f89298p0) && gOST3410Parameters.getQ().equals(this.f89299q0) && gOST3410Parameters.getA().equals(this.f89300r0);
    }

    public BigInteger getA() {
        return this.f89300r0;
    }

    public BigInteger getP() {
        return this.f89298p0;
    }

    public BigInteger getQ() {
        return this.f89299q0;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.f89301s0;
    }

    public int hashCode() {
        return (this.f89298p0.hashCode() ^ this.f89299q0.hashCode()) ^ this.f89300r0.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f89300r0 = bigInteger3;
        this.f89298p0 = bigInteger;
        this.f89299q0 = bigInteger2;
        this.f89301s0 = gOST3410ValidationParameters;
    }
}
