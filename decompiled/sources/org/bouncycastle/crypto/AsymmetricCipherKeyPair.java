package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public class AsymmetricCipherKeyPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricKeyParameter f87849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsymmetricKeyParameter f87850b;

    public AsymmetricCipherKeyPair(CipherParameters cipherParameters, CipherParameters cipherParameters2) {
        this.f87849a = (AsymmetricKeyParameter) cipherParameters;
        this.f87850b = (AsymmetricKeyParameter) cipherParameters2;
    }

    public AsymmetricKeyParameter getPrivate() {
        return this.f87850b;
    }

    public AsymmetricKeyParameter getPublic() {
        return this.f87849a;
    }

    public AsymmetricCipherKeyPair(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this.f87849a = asymmetricKeyParameter;
        this.f87850b = asymmetricKeyParameter2;
    }
}
