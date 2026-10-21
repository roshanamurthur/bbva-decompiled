package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410KeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GOST3410Parameters f89297q0;

    public GOST3410KeyParameters(boolean z10, GOST3410Parameters gOST3410Parameters) {
        super(z10);
        this.f89297q0 = gOST3410Parameters;
    }

    public GOST3410Parameters getParameters() {
        return this.f89297q0;
    }
}
