package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;

/* JADX INFO: loaded from: classes5.dex */
public class SM2KeyExchangePrivateParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f89374p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ECPrivateKeyParameters f89375q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ECPoint f89376r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ECPrivateKeyParameters f89377s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ECPoint f89378t0;

    public SM2KeyExchangePrivateParameters(boolean z10, ECPrivateKeyParameters eCPrivateKeyParameters, ECPrivateKeyParameters eCPrivateKeyParameters2) {
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
        FixedPointCombMultiplier fixedPointCombMultiplier = new FixedPointCombMultiplier();
        this.f89374p0 = z10;
        this.f89375q0 = eCPrivateKeyParameters;
        this.f89376r0 = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters.getD()).normalize();
        this.f89377s0 = eCPrivateKeyParameters2;
        this.f89378t0 = fixedPointCombMultiplier.multiply(parameters.getG(), eCPrivateKeyParameters2.getD()).normalize();
    }

    public ECPrivateKeyParameters getEphemeralPrivateKey() {
        return this.f89377s0;
    }

    public ECPoint getEphemeralPublicPoint() {
        return this.f89378t0;
    }

    public ECPrivateKeyParameters getStaticPrivateKey() {
        return this.f89375q0;
    }

    public ECPoint getStaticPublicPoint() {
        return this.f89376r0;
    }

    public boolean isInitiator() {
        return this.f89374p0;
    }
}
