package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class DHMQVPrivateParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DHPrivateKeyParameters f89223p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DHPrivateKeyParameters f89224q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DHPublicKeyParameters f89225r0;

    public DHMQVPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2) {
        this(dHPrivateKeyParameters, dHPrivateKeyParameters2, null);
    }

    public DHPrivateKeyParameters getEphemeralPrivateKey() {
        return this.f89224q0;
    }

    public DHPublicKeyParameters getEphemeralPublicKey() {
        return this.f89225r0;
    }

    public DHPrivateKeyParameters getStaticPrivateKey() {
        return this.f89223p0;
    }

    public DHMQVPrivateParameters(DHPrivateKeyParameters dHPrivateKeyParameters, DHPrivateKeyParameters dHPrivateKeyParameters2, DHPublicKeyParameters dHPublicKeyParameters) {
        if (dHPrivateKeyParameters == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (dHPrivateKeyParameters2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        DHParameters parameters = dHPrivateKeyParameters.getParameters();
        if (!parameters.equals(dHPrivateKeyParameters2.getParameters())) {
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (dHPublicKeyParameters == null) {
            dHPublicKeyParameters = new DHPublicKeyParameters(parameters.getG().multiply(dHPrivateKeyParameters2.getX()), parameters);
        } else if (!parameters.equals(dHPublicKeyParameters.getParameters())) {
            throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.f89223p0 = dHPrivateKeyParameters;
        this.f89224q0 = dHPrivateKeyParameters2;
        this.f89225r0 = dHPublicKeyParameters;
    }
}
