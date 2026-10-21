package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final McElieceParameters f91163q0;

    public McElieceKeyParameters(boolean z10, McElieceParameters mcElieceParameters) {
        super(z10);
        this.f91163q0 = mcElieceParameters;
    }

    public McElieceParameters getParameters() {
        return this.f91163q0;
    }
}
