package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410KeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GOST3410Parameters f89296c;

    public GOST3410KeyGenerationParameters(SecureRandom secureRandom, GOST3410Parameters gOST3410Parameters) {
        super(secureRandom, gOST3410Parameters.getP().bitLength() - 1);
        this.f89296c = gOST3410Parameters;
    }

    public GOST3410Parameters getParameters() {
        return this.f89296c;
    }
}
