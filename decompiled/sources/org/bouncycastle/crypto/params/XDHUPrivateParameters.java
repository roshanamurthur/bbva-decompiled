package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class XDHUPrivateParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AsymmetricKeyParameter f89391p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AsymmetricKeyParameter f89392q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AsymmetricKeyParameter f89393r0;

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this(asymmetricKeyParameter, asymmetricKeyParameter2, null);
    }

    public AsymmetricKeyParameter getEphemeralPrivateKey() {
        return this.f89392q0;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.f89393r0;
    }

    public AsymmetricKeyParameter getStaticPrivateKey() {
        return this.f89391p0;
    }

    public XDHUPrivateParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2, AsymmetricKeyParameter asymmetricKeyParameter3) {
        if (asymmetricKeyParameter == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        boolean z10 = asymmetricKeyParameter instanceof X448PrivateKeyParameters;
        if (!z10 && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (asymmetricKeyParameter2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (asymmetricKeyParameter3 == null) {
            asymmetricKeyParameter3 = asymmetricKeyParameter2 instanceof X448PrivateKeyParameters ? ((X448PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey() : ((X25519PrivateKeyParameters) asymmetricKeyParameter2).generatePublicKey();
        } else {
            if ((asymmetricKeyParameter3 instanceof X448PublicKeyParameters) && !z10) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
            if ((asymmetricKeyParameter3 instanceof X25519PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PrivateKeyParameters)) {
                throw new IllegalArgumentException("ephemeral public key has different domain parameters");
            }
        }
        this.f89391p0 = asymmetricKeyParameter;
        this.f89392q0 = asymmetricKeyParameter2;
        this.f89393r0 = asymmetricKeyParameter3;
    }
}
