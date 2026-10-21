package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class DHKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DHParameters f89221c;

    public DHKeyGenerationParameters(SecureRandom secureRandom, DHParameters dHParameters) {
        super(secureRandom, dHParameters.getL() != 0 ? dHParameters.getL() : dHParameters.getP().bitLength());
        this.f89221c = dHParameters;
    }

    public DHParameters getParameters() {
        return this.f89221c;
    }
}
