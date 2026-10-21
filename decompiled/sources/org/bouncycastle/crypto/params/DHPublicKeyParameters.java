package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class DHPublicKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final BigInteger f89235s0 = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final BigInteger f89236t0 = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89237r0;

    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(false, dHParameters);
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        }
        BigInteger bigInteger2 = f89236t0;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(dHParameters.getP().subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        if (dHParameters.getQ() != null) {
            if (!f89235s0.equals(bigInteger.modPow(dHParameters.getQ(), dHParameters.getP()))) {
                throw new IllegalArgumentException("Y value does not appear to be in correct group");
            }
        }
        this.f89237r0 = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof DHPublicKeyParameters) && ((DHPublicKeyParameters) obj).getY().equals(this.f89237r0) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f89237r0;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f89237r0.hashCode() ^ super.hashCode();
    }
}
