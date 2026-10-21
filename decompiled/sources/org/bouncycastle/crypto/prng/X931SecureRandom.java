package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class X931SecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f89448p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SecureRandom f89449q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final X931RNG f89450r0;

    public X931SecureRandom(SecureRandom secureRandom, X931RNG x931rng, boolean z10) {
        this.f89449q0 = secureRandom;
        this.f89450r0 = x931rng;
        this.f89448p0 = z10;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i10) {
        return EntropyUtil.generateSeed(this.f89450r0.f89442b, i10);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f89450r0.a(this.f89448p0, bArr) < 0) {
                    X931RNG x931rng = this.f89450r0;
                    byte[] entropy = x931rng.f89442b.getEntropy();
                    x931rng.f89446f = entropy;
                    if (entropy.length != x931rng.f89441a.getBlockSize()) {
                        throw new IllegalStateException("Insufficient entropy returned");
                    }
                    x931rng.f89447g = 1L;
                    this.f89450r0.a(this.f89448p0, bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j10) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.f89449q0;
                if (secureRandom != null) {
                    secureRandom.setSeed(j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.f89449q0;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
