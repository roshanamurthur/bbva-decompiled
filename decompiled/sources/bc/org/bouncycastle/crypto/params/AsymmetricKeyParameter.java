package bc.org.bouncycastle.crypto.params;

import bc.org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class AsymmetricKeyParameter implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f24985a;

    public AsymmetricKeyParameter(boolean z10) {
        this.f24985a = z10;
    }

    public boolean isPrivate() {
        return this.f24985a;
    }
}
