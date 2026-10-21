package org.bouncycastle.jce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import org.bouncycastle.jce.interfaces.MQVPrivateKey;

/* JADX INFO: loaded from: classes8.dex */
public class MQVPrivateKeySpec implements KeySpec, MQVPrivateKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PrivateKey f90557p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PrivateKey f90558q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PublicKey f90559r0;

    public MQVPrivateKeySpec(PrivateKey privateKey, PrivateKey privateKey2) {
        this(privateKey, privateKey2, null);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "ECMQV";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // org.bouncycastle.jce.interfaces.MQVPrivateKey
    public PrivateKey getEphemeralPrivateKey() {
        return this.f90558q0;
    }

    @Override // org.bouncycastle.jce.interfaces.MQVPrivateKey
    public PublicKey getEphemeralPublicKey() {
        return this.f90559r0;
    }

    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    @Override // org.bouncycastle.jce.interfaces.MQVPrivateKey
    public PrivateKey getStaticPrivateKey() {
        return this.f90557p0;
    }

    public MQVPrivateKeySpec(PrivateKey privateKey, PrivateKey privateKey2, PublicKey publicKey) {
        this.f90557p0 = privateKey;
        this.f90558q0 = privateKey2;
        this.f90559r0 = publicKey;
    }
}
