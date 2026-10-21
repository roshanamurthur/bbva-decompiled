package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class DSAKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DSAParameters f89246q0;

    public DSAKeyParameters(boolean z10, DSAParameters dSAParameters) {
        super(z10);
        this.f89246q0 = dSAParameters;
    }

    public DSAParameters getParameters() {
        return this.f89246q0;
    }
}
