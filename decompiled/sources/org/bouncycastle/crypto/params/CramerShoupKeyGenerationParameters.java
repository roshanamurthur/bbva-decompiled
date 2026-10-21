package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CramerShoupParameters f89206c;

    public CramerShoupKeyGenerationParameters(SecureRandom secureRandom, CramerShoupParameters cramerShoupParameters) {
        super(secureRandom, cramerShoupParameters.getP().bitLength());
        this.f89206c = cramerShoupParameters;
    }

    public CramerShoupParameters getParameters() {
        return this.f89206c;
    }
}
