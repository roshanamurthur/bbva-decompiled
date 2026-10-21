package org.bouncycastle.crypto.params;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes5.dex */
public class ECPublicKeyParameters extends ECKeyParameters {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ECPoint f89282r0;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f89282r0 = eCDomainParameters.validatePublicPoint(eCPoint);
    }

    public ECPoint getQ() {
        return this.f89282r0;
    }
}
