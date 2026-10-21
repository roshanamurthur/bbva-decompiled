package org.bouncycastle.pqc.crypto.gmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GMSSParameters f90963c;

    public GMSSKeyGenerationParameters(SecureRandom secureRandom, GMSSParameters gMSSParameters) {
        super(secureRandom, 1);
        this.f90963c = gMSSParameters;
    }

    public GMSSParameters getParameters() {
        return this.f90963c;
    }
}
