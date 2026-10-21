package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ElGamalKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ElGamalParameters f89289c;

    public ElGamalKeyGenerationParameters(SecureRandom secureRandom, ElGamalParameters elGamalParameters) {
        super(secureRandom, elGamalParameters.getL() != 0 ? elGamalParameters.getL() : elGamalParameters.getP().bitLength());
        this.f89289c = elGamalParameters;
    }

    public ElGamalParameters getParameters() {
        return this.f89289c;
    }
}
