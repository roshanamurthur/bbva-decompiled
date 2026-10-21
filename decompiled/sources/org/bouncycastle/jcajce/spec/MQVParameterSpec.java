package org.bouncycastle.jcajce.spec;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class MQVParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKey f90286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrivateKey f90287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PublicKey f90288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f90289d;

    public MQVParameterSpec(KeyPair keyPair, PublicKey publicKey) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, null);
    }

    public PrivateKey getEphemeralPrivateKey() {
        return this.f90287b;
    }

    public PublicKey getEphemeralPublicKey() {
        return this.f90286a;
    }

    public PublicKey getOtherPartyEphemeralKey() {
        return this.f90288c;
    }

    public byte[] getUserKeyingMaterial() {
        return Arrays.clone(this.f90289d);
    }

    public MQVParameterSpec(KeyPair keyPair, PublicKey publicKey, byte[] bArr) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, bArr);
    }

    public MQVParameterSpec(PrivateKey privateKey, PublicKey publicKey) {
        this(null, privateKey, publicKey, null);
    }

    public MQVParameterSpec(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) {
        this(null, privateKey, publicKey, bArr);
    }

    public MQVParameterSpec(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2) {
        this(publicKey, privateKey, publicKey2, null);
    }

    public MQVParameterSpec(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2, byte[] bArr) {
        this.f90286a = publicKey;
        this.f90287b = privateKey;
        this.f90288c = publicKey2;
        this.f90289d = Arrays.clone(bArr);
    }
}
