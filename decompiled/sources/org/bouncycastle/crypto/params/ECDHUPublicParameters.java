package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ECDHUPublicParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ECPublicKeyParameters f89267p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECPublicKeyParameters f89268q0;

    public ECDHUPublicParameters(ECPublicKeyParameters eCPublicKeyParameters, ECPublicKeyParameters eCPublicKeyParameters2) {
        if (eCPublicKeyParameters == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (eCPublicKeyParameters2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!eCPublicKeyParameters.getParameters().equals(eCPublicKeyParameters2.getParameters())) {
            throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
        }
        this.f89267p0 = eCPublicKeyParameters;
        this.f89268q0 = eCPublicKeyParameters2;
    }

    public ECPublicKeyParameters getEphemeralPublicKey() {
        return this.f89268q0;
    }

    public ECPublicKeyParameters getStaticPublicKey() {
        return this.f89267p0;
    }
}
