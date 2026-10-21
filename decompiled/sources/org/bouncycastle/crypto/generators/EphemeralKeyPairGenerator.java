package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.EphemeralKeyPair;
import org.bouncycastle.crypto.KeyEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class EphemeralKeyPairGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsymmetricCipherKeyPairGenerator f88724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KeyEncoder f88725b;

    public EphemeralKeyPairGenerator(AsymmetricCipherKeyPairGenerator asymmetricCipherKeyPairGenerator, KeyEncoder keyEncoder) {
        this.f88724a = asymmetricCipherKeyPairGenerator;
        this.f88725b = keyEncoder;
    }

    public EphemeralKeyPair generate() {
        return new EphemeralKeyPair(this.f88724a.generateKeyPair(), this.f88725b);
    }
}
