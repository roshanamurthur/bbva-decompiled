package bc.org.bouncycastle.crypto.params;

import bc.org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECPublicKeyParameters extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ECPoint f24994l;

    public ECPublicKeyParameters(ECPoint eCPoint, ECDomainParameters eCDomainParameters) {
        super(false, eCDomainParameters);
        this.f24994l = eCPoint;
    }

    public ECPoint getQ() {
        return this.f24994l;
    }
}
