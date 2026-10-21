package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;

/* JADX INFO: loaded from: classes5.dex */
public class ParametersWithRandom implements CipherParameters {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SecureRandom f89351p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CipherParameters f89352q0;

    public ParametersWithRandom(CipherParameters cipherParameters) {
        this(cipherParameters, CryptoServicesRegistrar.getSecureRandom());
    }

    public CipherParameters getParameters() {
        return this.f89352q0;
    }

    public SecureRandom getRandom() {
        return this.f89351p0;
    }

    public ParametersWithRandom(CipherParameters cipherParameters, SecureRandom secureRandom) {
        this.f89351p0 = secureRandom;
        this.f89352q0 = cipherParameters;
    }
}
