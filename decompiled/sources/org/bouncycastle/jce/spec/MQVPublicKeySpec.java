package org.bouncycastle.jce.spec;

import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPublicKey;

/* JADX INFO: loaded from: classes8.dex */
public class MQVPublicKeySpec implements KeySpec, MQVPublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PublicKey f90560p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PublicKey f90561q0;

    public MQVPublicKeySpec(PublicKey publicKey, PublicKey publicKey2) {
        this.f90560p0 = publicKey;
        this.f90561q0 = publicKey2;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ECMQV";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // org.bouncycastle.jce.interfaces.MQVPublicKey
    public PublicKey getEphemeralKey() {
        return this.f90561q0;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    @Override // org.bouncycastle.jce.interfaces.MQVPublicKey
    public PublicKey getStaticKey() {
        return this.f90560p0;
    }
}
