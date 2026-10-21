package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class RainbowKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RainbowParameters f91222c;

    public RainbowKeyGenerationParameters(SecureRandom secureRandom, RainbowParameters rainbowParameters) {
        super(secureRandom, rainbowParameters.getVi()[rainbowParameters.getVi().length - 1] - rainbowParameters.getVi()[0]);
        this.f91222c = rainbowParameters;
    }

    public RainbowParameters getParameters() {
        return this.f91222c;
    }
}
