package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECDomainParameters f89279q0;

    public ECKeyParameters(boolean z10, ECDomainParameters eCDomainParameters) {
        super(z10);
        if (eCDomainParameters == null) {
            throw new NullPointerException("'parameters' cannot be null");
        }
        this.f89279q0 = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.f89279q0;
    }
}
