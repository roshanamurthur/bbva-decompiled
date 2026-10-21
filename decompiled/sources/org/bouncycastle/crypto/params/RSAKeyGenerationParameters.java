package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes5.dex */
public class RSAKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigInteger f89364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89365d;

    public RSAKeyGenerationParameters(BigInteger bigInteger, SecureRandom secureRandom, int i10, int i11) {
        super(secureRandom, i10);
        if (i10 < 12) {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        this.f89364c = bigInteger;
        this.f89365d = i11;
    }

    public int getCertainty() {
        return this.f89365d;
    }

    public BigInteger getPublicExponent() {
        return this.f89364c;
    }
}
