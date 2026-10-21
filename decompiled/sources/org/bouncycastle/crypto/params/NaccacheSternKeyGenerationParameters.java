package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f89339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f89341e;

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i10, int i11, int i12) {
        this(secureRandom, i10, i11, i12, false);
    }

    public int getCertainty() {
        return this.f89339c;
    }

    public int getCntSmallPrimes() {
        return this.f89340d;
    }

    public boolean isDebug() {
        return this.f89341e;
    }

    public NaccacheSternKeyGenerationParameters(SecureRandom secureRandom, int i10, int i11, int i12, boolean z10) {
        super(secureRandom, i10);
        this.f89341e = false;
        this.f89339c = i11;
        if (i12 % 2 == 1) {
            throw new IllegalArgumentException("cntSmallPrimes must be a multiple of 2");
        }
        if (i12 < 30) {
            throw new IllegalArgumentException("cntSmallPrimes must be >= 30 for security reasons");
        }
        this.f89340d = i12;
        this.f89341e = z10;
    }
}
