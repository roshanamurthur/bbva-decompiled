package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class DHUPrivateParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DHPrivateKeyParameters f89238p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DHPrivateKeyParameters f89239q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DHPublicKeyParameters f89240r0;

    public DHUPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2) {
        this(dHPrivateKeyParameters, dHPrivateKeyParameters2, null);
    }

    public DHPrivateKeyParameters getEphemeralPrivateKey() {
        return this.f89239q0;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.f89240r0;
    }

    public DHPrivateKeyParameters getStaticPrivateKey() {
        return this.f89238p0;
    }

    public DHUPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2, DHPublicKeyParameters dHPublicKeyParameters) {
        if (dHPrivateKeyParameters == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (dHPrivateKeyParameters2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        DHParameters parameters = dHPrivateKeyParameters.getParameters();
        if (!parameters.equals(dHPrivateKeyParameters2.getParameters())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (dHPublicKeyParameters == null) {
            dHPublicKeyParameters = new DHPublicKeyParameters(parameters.getG().modPow(dHPrivateKeyParameters2.getX(), parameters.getP()), parameters);
        } else if (!parameters.equals(dHPublicKeyParameters.getParameters())) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.f89238p0 = dHPrivateKeyParameters;
        this.f89239q0 = dHPrivateKeyParameters2;
        this.f89240r0 = dHPublicKeyParameters;
    }
}
