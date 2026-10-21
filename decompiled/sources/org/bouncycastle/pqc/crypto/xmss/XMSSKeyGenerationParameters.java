package org.bouncycastle.pqc.crypto.xmss;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final XMSSParameters f91314c;

    public XMSSKeyGenerationParameters(XMSSParameters xMSSParameters, SecureRandom secureRandom) {
        super(secureRandom, -1);
        this.f91314c = xMSSParameters;
    }

    public XMSSParameters getParameters() {
        return this.f91314c;
    }
}
