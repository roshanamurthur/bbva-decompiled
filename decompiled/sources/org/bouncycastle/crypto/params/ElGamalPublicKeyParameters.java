package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89295r0;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f89295r0 = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return (obj instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj).getY().equals(this.f89295r0) && super.equals(obj);
    }

    public BigInteger getY() {
        return this.f89295r0;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return this.f89295r0.hashCode() ^ super.hashCode();
    }
}
