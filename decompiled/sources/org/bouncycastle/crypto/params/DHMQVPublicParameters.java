package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class DHMQVPublicParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DHPublicKeyParameters f89226p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DHPublicKeyParameters f89227q0;

    public DHMQVPublicParameters(DHPublicKeyParameters dHPublicKeyParameters, DHPublicKeyParameters dHPublicKeyParameters2) {
        if (dHPublicKeyParameters == null) {
            throw new NullPointerException("staticPublicKey cannot be null");
        }
        if (dHPublicKeyParameters2 == null) {
            throw new NullPointerException("ephemeralPublicKey cannot be null");
        }
        if (!dHPublicKeyParameters.getParameters().equals(dHPublicKeyParameters2.getParameters())) {
            throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
        }
        this.f89226p0 = dHPublicKeyParameters;
        this.f89227q0 = dHPublicKeyParameters2;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.f89227q0;
    }

    public DHPublicKeyParameters getStaticPublicKey() {
        return this.f89226p0;
    }
}
