package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes5.dex */
public class ReversedWindowGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomGenerator f89410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f89411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f89412c;

    public ReversedWindowGenerator(RandomGenerator randomGenerator, int i10) {
        if (randomGenerator == null) {
            throw new IllegalArgumentException("generator cannot be null");
        }
        if (i10 < 2) {
            throw new IllegalArgumentException("windowSize must be at least 2");
        }
        this.f89410a = randomGenerator;
        this.f89411b = new byte[i10];
    }

    public final void a(int i10, int i11, byte[] bArr) {
        synchronized (this) {
            for (int i12 = 0; i12 < i11; i12++) {
                try {
                    if (this.f89412c < 1) {
                        RandomGenerator randomGenerator = this.f89410a;
                        byte[] bArr2 = this.f89411b;
                        randomGenerator.nextBytes(bArr2, 0, bArr2.length);
                        this.f89412c = this.f89411b.length;
                    }
                    byte[] bArr3 = this.f89411b;
                    int i13 = this.f89412c - 1;
                    this.f89412c = i13;
                    bArr[i12 + i10] = bArr3[i13];
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j10) {
        synchronized (this) {
            this.f89412c = 0;
            this.f89410a.addSeedMaterial(j10);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        a(0, bArr.length, bArr);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            this.f89412c = 0;
            this.f89410a.addSeedMaterial(bArr);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i10, int i11) {
        a(i10, i11, bArr);
    }
}
