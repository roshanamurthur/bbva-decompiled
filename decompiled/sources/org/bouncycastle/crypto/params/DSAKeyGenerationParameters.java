package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class DSAKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DSAParameters f89245c;

    public DSAKeyGenerationParameters(SecureRandom secureRandom, DSAParameters dSAParameters) {
        super(secureRandom, dSAParameters.getP().bitLength() - 1);
        this.f89245c = dSAParameters;
    }

    public DSAParameters getParameters() {
        return this.f89245c;
    }
}
