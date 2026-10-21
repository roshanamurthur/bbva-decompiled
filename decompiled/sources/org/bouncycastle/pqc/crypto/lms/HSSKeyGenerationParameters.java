package org.bouncycastle.pqc.crypto.lms;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class HSSKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LMSParameters[] f91077c;

    /* JADX WARN: Illegal instructions before constructor call */
    public HSSKeyGenerationParameters(LMSParameters[] lMSParametersArr, SecureRandom secureRandom) {
        LMSParameters lMSParameters = lMSParametersArr[0];
        if (lMSParameters == null) {
            throw new NullPointerException("lmsParameters cannot be null");
        }
        LMSigParameters lMSigParam = lMSParameters.getLMSigParam();
        super(secureRandom, lMSigParam.getM() * (1 << lMSigParam.getH()));
        if (lMSParametersArr.length == 0 || lMSParametersArr.length > 8) {
            throw new IllegalArgumentException("lmsParameters length should be between 1 and 8 inclusive");
        }
        this.f91077c = lMSParametersArr;
    }

    public int getDepth() {
        return this.f91077c.length;
    }

    public LMSParameters[] getLmsParameters() {
        return this.f91077c;
    }
}
