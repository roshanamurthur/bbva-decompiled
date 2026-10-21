package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes8.dex */
public class ECPublicKeySpec extends ECKeySpec {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECPoint f90527q0;

    public ECPublicKeySpec(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f90527q0 = eCPoint.getCurve() != null ? eCPoint.normalize() : eCPoint;
    }

    public ECPoint getQ() {
        return this.f90527q0;
    }
}
