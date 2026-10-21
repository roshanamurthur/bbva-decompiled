package org.bouncycastle.pqc.crypto.lms;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class LMSKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LMSParameters f91099c;

    /* JADX WARN: Illegal instructions before constructor call */
    public LMSKeyGenerationParameters(LMSParameters lMSParameters, SecureRandom secureRandom) {
        if (lMSParameters == null) {
            throw new NullPointerException("lmsParameters cannot be null");
        }
        LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        super(secureRandom, lMSigParam.getM() * (1 << lMSigParam.getH()));
        this.f91099c = lMSParameters;
    }

    public LMSParameters getParameters() {
        return this.f91099c;
    }
}
