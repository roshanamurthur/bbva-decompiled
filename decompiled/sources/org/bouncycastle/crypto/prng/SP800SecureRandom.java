package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import jm.a;
import org.bouncycastle.crypto.prng.drbg.SP80090DRBG;

/* JADX INFO: loaded from: classes5.dex */
public class SP800SecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final a f89413p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f89414q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final SecureRandom f89415r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final EntropySource f89416s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public SP80090DRBG f89417t0;

    public SP800SecureRandom(SecureRandom secureRandom, EntropySource entropySource, a aVar, boolean z10) {
        this.f89415r0 = secureRandom;
        this.f89416s0 = entropySource;
        this.f89413p0 = aVar;
        this.f89414q0 = z10;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i10) {
        return EntropyUtil.generateSeed(this.f89416s0, i10);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f89417t0 == null) {
                    this.f89417t0 = this.f89413p0.a(this.f89416s0);
                }
                if (this.f89417t0.generate(bArr, null, this.f89414q0) < 0) {
                    this.f89417t0.reseed(null);
                    this.f89417t0.generate(bArr, null, this.f89414q0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void reseed(byte[] bArr) {
        synchronized (this) {
            try {
                if (this.f89417t0 == null) {
                    this.f89417t0 = this.f89413p0.a(this.f89416s0);
                }
                this.f89417t0.reseed(bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j10) {
        synchronized (this) {
            try {
                SecureRandom secureRandom = this.f89415r0;
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
                SecureRandom secureRandom = this.f89415r0;
                if (secureRandom != null) {
                    secureRandom.setSeed(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
