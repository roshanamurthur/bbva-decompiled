package bc.org.bouncycastle.crypto;

import bc.org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class AsymmetricCipherKeyPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricKeyParameter f24898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsymmetricKeyParameter f24899b;

    public AsymmetricCipherKeyPair(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this.f24898a = asymmetricKeyParameter;
        this.f24899b = asymmetricKeyParameter2;
    }

    public AsymmetricKeyParameter getPrivate() {
        return this.f24899b;
    }

    public AsymmetricKeyParameter getPublic() {
        return this.f24898a;
    }

    public AsymmetricCipherKeyPair(CipherParameters cipherParameters, CipherParameters cipherParameters2) {
        this.f24898a = (AsymmetricKeyParameter) cipherParameters;
        this.f24899b = (AsymmetricKeyParameter) cipherParameters2;
    }
}
