package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public class ECPrivateKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BigInteger f89281r0;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f89281r0 = eCDomainParameters.validatePrivateScalar(bigInteger);
    }

    public BigInteger getD() {
        return this.f89281r0;
    }
}
