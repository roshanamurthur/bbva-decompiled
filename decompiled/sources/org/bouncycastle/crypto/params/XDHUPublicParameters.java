package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class XDHUPublicParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AsymmetricKeyParameter f89394p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AsymmetricKeyParameter f89395q0;

    public XDHUPublicParameters(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        if (asymmetricKeyParameter == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (!(asymmetricKeyParameter instanceof X448PublicKeyParameters) && !(asymmetricKeyParameter instanceof X25519PublicKeyParameters)) {
            throw new IllegalArgumentException("only X25519 and X448 paramaters can be used");
        }
        if (asymmetricKeyParameter2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!asymmetricKeyParameter.getClass().isAssignableFrom(asymmetricKeyParameter2.getClass())) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.f89394p0 = asymmetricKeyParameter;
        this.f89395q0 = asymmetricKeyParameter2;
    }

    public AsymmetricKeyParameter getEphemeralPublicKey() {
        return this.f89395q0;
    }

    public AsymmetricKeyParameter getStaticPublicKey() {
        return this.f89394p0;
    }
}
