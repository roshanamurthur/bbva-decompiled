package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final McElieceParameters f91155c;

    public McElieceKeyGenerationParameters(SecureRandom secureRandom, McElieceParameters mcElieceParameters) {
        super(secureRandom, 256);
        this.f91155c = mcElieceParameters;
    }

    public McElieceParameters getParameters() {
        return this.f91155c;
    }
}
