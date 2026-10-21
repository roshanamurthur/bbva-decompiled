package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class X931SecureRandomBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f89451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntropySourceProvider f89452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f89453c;

    public X931SecureRandomBuilder() {
        this(CryptoServicesRegistrar.getSecureRandom(), false);
    }

    public X931SecureRandom build(BlockCipher blockCipher, KeyParameter keyParameter, boolean z10) {
        if (this.f89453c == null) {
            this.f89453c = new byte[blockCipher.getBlockSize()];
            Pack.longToBigEndian(System.currentTimeMillis(), this.f89453c, 0);
        }
        blockCipher.init(true, keyParameter);
        return new X931SecureRandom(this.f89451a, new X931RNG(blockCipher, this.f89453c, this.f89452b.get(blockCipher.getBlockSize() * 8)), z10);
    }

    public X931SecureRandomBuilder setDateTimeVector(byte[] bArr) {
        this.f89453c = Arrays.clone(bArr);
        return this;
    }

    public X931SecureRandomBuilder(SecureRandom secureRandom, boolean z10) {
        this.f89451a = secureRandom;
        this.f89452b = new BasicEntropySourceProvider(secureRandom, z10);
    }

    public X931SecureRandomBuilder(EntropySourceProvider entropySourceProvider) {
        this.f89451a = null;
        this.f89452b = entropySourceProvider;
    }
}
