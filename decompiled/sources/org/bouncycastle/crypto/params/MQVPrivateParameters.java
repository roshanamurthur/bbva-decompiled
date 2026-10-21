package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes5.dex */
public class MQVPrivateParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ECPrivateKeyParameters f89334p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECPrivateKeyParameters f89335q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ECPublicKeyParameters f89336r0;

    public MQVPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
        this(eCPrivateKeyParameters, eCPrivateKeyParameters2, null);
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.f89335q0;
    }

    public ECPublicKeyParameters getEphemeralPublicKey() {
        return this.f89336r0;
    }

    public ECPrivateKeyParameters getStaticPrivateKey() {
        return this.f89334p0;
    }

    public MQVPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters) {
        if (eCPrivateKeyParameters == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (eCPrivateKeyParameters2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        if (!parameters.equals(eCPrivateKeyParameters2.getParameters())) {
            throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
        }
        if (eCPublicKeyParameters == null) {
            eCPublicKeyParameters = new ECPublicKeyParameters(new FixedPointCombMultiplier().multiply(parameters.getG(), eCPrivateKeyParameters2.getD()), parameters);
        } else if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
        }
        this.f89334p0 = eCPrivateKeyParameters;
        this.f89335q0 = eCPrivateKeyParameters2;
        this.f89336r0 = eCPublicKeyParameters;
    }
}
