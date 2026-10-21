package org.bouncycastle.pqc.crypto.sphincs;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes13.dex */
public class SPHINCS256KeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Digest f91256c;

    public SPHINCS256KeyGenerationParameters(SecureRandom secureRandom, Digest digest) {
        super(secureRandom, 8448);
        this.f91256c = digest;
    }

    public Digest getTreeDigest() {
        return this.f91256c;
    }
}
