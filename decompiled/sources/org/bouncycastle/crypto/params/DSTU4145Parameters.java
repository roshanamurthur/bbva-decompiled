package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DSTU4145Parameters extends ECDomainParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f89263g;

    public DSTU4145Parameters(ECDomainParameters eCDomainParameters, byte[] bArr) {
        super(eCDomainParameters.getCurve(), eCDomainParameters.getG(), eCDomainParameters.getN(), eCDomainParameters.getH(), eCDomainParameters.getSeed());
        this.f89263g = Arrays.clone(bArr);
    }

    public byte[] getDKE() {
        return Arrays.clone(this.f89263g);
    }
}
