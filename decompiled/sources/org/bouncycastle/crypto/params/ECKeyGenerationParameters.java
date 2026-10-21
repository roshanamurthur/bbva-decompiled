package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class ECKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ECDomainParameters f89278c;

    public ECKeyGenerationParameters(ECDomainParameters eCDomainParameters, SecureRandom secureRandom) {
        super(secureRandom, eCDomainParameters.getN().bitLength());
        this.f89278c = eCDomainParameters;
    }

    public ECDomainParameters getDomainParameters() {
        return this.f89278c;
    }
}
