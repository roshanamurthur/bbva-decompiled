package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes5.dex */
public class ECDHUPrivateParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ECPrivateKeyParameters f89264p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECPrivateKeyParameters f89265q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ECPublicKeyParameters f89266r0;

    public ECDHUPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
        this(eCPrivateKeyParameters, eCPrivateKeyParameters2, null);
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.f89265q0;
    }

    public ECPublicKeyParameters getEphemeralPublicKey() {
        return this.f89266r0;
    }

    public ECPrivateKeyParameters getStaticPrivateKey() {
        return this.f89264p0;
    }

    public ECDHUPrivateParameters(ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2, ECPublicKeyParameters eCPublicKeyParameters) {
        if (eCPrivateKeyParameters == null) {
            throw new NullPointerException("staticPrivateKey cannot be null");
        }
        if (eCPrivateKeyParameters2 == null) {
            throw new NullPointerException("ephemeralPrivateKey cannot be null");
        }
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        if (!parameters.equals(eCPrivateKeyParameters2.getParameters())) {
            throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
        }
        if (eCPublicKeyParameters == null) {
            eCPublicKeyParameters = new ECPublicKeyParameters(new FixedPointCombMultiplier().multiply(parameters.getG(), eCPrivateKeyParameters2.getD()), parameters);
        } else if (!parameters.equals(eCPublicKeyParameters.getParameters())) {
            throw new IllegalArgumentException("ephemeral public key has different domain parameters");
        }
        this.f89264p0 = eCPrivateKeyParameters;
        this.f89265q0 = eCPrivateKeyParameters2;
        this.f89266r0 = eCPublicKeyParameters;
    }
}
