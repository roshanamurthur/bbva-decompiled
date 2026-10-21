package org.bouncycastle.jcajce.spec;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public class DHUParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PublicKey f90260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrivateKey f90261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PublicKey f90262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f90263d;

    public DHUParameterSpec(KeyPair keyPair, PublicKey publicKey) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, null);
    }

    public PrivateKey getEphemeralPrivateKey() {
        return this.f90261b;
    }

    public PublicKey getEphemeralPublicKey() {
        return this.f90260a;
    }

    public PublicKey getOtherPartyEphemeralKey() {
        return this.f90262c;
    }

    public byte[] getUserKeyingMaterial() {
        return Arrays.clone(this.f90263d);
    }

    public DHUParameterSpec(KeyPair keyPair, PublicKey publicKey, byte[] bArr) {
        this(keyPair.getPublic(), keyPair.getPrivate(), publicKey, bArr);
    }

    public DHUParameterSpec(PrivateKey privateKey, PublicKey publicKey) {
        this(null, privateKey, publicKey, null);
    }

    public DHUParameterSpec(PrivateKey privateKey, PublicKey publicKey, byte[] bArr) {
        this(null, privateKey, publicKey, bArr);
    }

    public DHUParameterSpec(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2) {
        this(publicKey, privateKey, publicKey2, null);
    }

    public DHUParameterSpec(PublicKey publicKey, PrivateKey privateKey, PublicKey publicKey2, byte[] bArr) {
        if (privateKey == null) {
            throw new IllegalArgumentException("ephemeral private key cannot be null");
        }
        if (publicKey2 == null) {
            throw new IllegalArgumentException("other party ephemeral key cannot be null");
        }
        this.f90260a = publicKey;
        this.f90261b = privateKey;
        this.f90262c = publicKey2;
        this.f90263d = Arrays.clone(bArr);
    }
}
