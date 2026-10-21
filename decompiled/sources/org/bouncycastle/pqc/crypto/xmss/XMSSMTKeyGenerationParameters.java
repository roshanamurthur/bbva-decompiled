package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSMTKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final XMSSMTParameters f91323c;

    public XMSSMTKeyGenerationParameters(XMSSMTParameters xMSSMTParameters, SecureRandom secureRandom) {
        super(secureRandom, -1);
        this.f91323c = xMSSMTParameters;
    }

    public XMSSMTParameters getParameters() {
        return this.f91323c;
    }
}
