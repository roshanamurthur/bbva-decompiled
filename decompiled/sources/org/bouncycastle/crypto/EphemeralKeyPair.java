package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class EphemeralKeyPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricCipherKeyPair f87865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyEncoder f87866b;

    public EphemeralKeyPair(AsymmetricCipherKeyPair asymmetricCipherKeyPair, KeyEncoder keyEncoder) {
        this.f87865a = asymmetricCipherKeyPair;
        this.f87866b = keyEncoder;
    }

    public byte[] getEncodedPublicKey() {
        return this.f87866b.getEncoded(this.f87865a.getPublic());
    }

    public AsymmetricCipherKeyPair getKeyPair() {
        return this.f87865a;
    }
}
