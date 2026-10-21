package org.bouncycastle.pqc.crypto.mceliece;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2KeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final McElieceCCA2Parameters f91123c;

    public McElieceCCA2KeyGenerationParameters(SecureRandom secureRandom, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(secureRandom, 128);
        this.f91123c = mcElieceCCA2Parameters;
    }

    public McElieceCCA2Parameters getParameters() {
        return this.f91123c;
    }
}
