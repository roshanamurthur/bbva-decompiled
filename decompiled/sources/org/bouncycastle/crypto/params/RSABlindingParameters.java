package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes5.dex */
public class RSABlindingParameters implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RSAKeyParameters f89362p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BigInteger f89363q0;

    public RSABlindingParameters(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger) {
        if (rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) {
            throw new IllegalArgumentException("RSA parameters should be for a public key");
        }
        this.f89362p0 = rSAKeyParameters;
        this.f89363q0 = bigInteger;
    }

    public BigInteger getBlindingFactor() {
        return this.f89363q0;
    }

    public RSAKeyParameters getPublicKey() {
        return this.f89362p0;
    }
}
