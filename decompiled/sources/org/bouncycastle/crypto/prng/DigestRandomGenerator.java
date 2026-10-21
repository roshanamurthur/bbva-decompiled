package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;

/* JADX INFO: loaded from: classes5.dex */
public class DigestRandomGenerator implements RandomGenerator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Digest f89404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f89405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f89406e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f89403b = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f89402a = 1;

    public DigestRandomGenerator(Digest digest) {
        this.f89404c = digest;
        this.f89406e = new byte[digest.getDigestSize()];
        this.f89405d = new byte[digest.getDigestSize()];
    }

    public final void a(long j10) {
        for (int i10 = 0; i10 != 8; i10++) {
            this.f89404c.update((byte) j10);
            j10 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j10) {
        synchronized (this) {
            a(j10);
            byte[] bArr = this.f89406e;
            this.f89404c.update(bArr, 0, bArr.length);
            this.f89404c.doFinal(this.f89406e, 0);
        }
    }

    public final void b() {
        long j10 = this.f89402a;
        this.f89402a = j10 + 1;
        a(j10);
        byte[] bArr = this.f89405d;
        this.f89404c.update(bArr, 0, bArr.length);
        byte[] bArr2 = this.f89406e;
        this.f89404c.update(bArr2, 0, bArr2.length);
        this.f89404c.doFinal(bArr, 0);
        if (this.f89402a % 10 == 0) {
            this.f89404c.update(bArr2, 0, bArr2.length);
            long j11 = this.f89403b;
            this.f89403b = 1 + j11;
            a(j11);
            this.f89404c.doFinal(bArr2, 0);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i10, int i11) {
        synchronized (this) {
            try {
                b();
                int i12 = i11 + i10;
                int i13 = 0;
                while (i10 != i12) {
                    if (i13 == this.f89405d.length) {
                        b();
                        i13 = 0;
                    }
                    bArr[i10] = this.f89405d[i13];
                    i10++;
                    i13++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            this.f89404c.update(bArr, 0, bArr.length);
            byte[] bArr2 = this.f89406e;
            this.f89404c.update(bArr2, 0, bArr2.length);
            this.f89404c.doFinal(this.f89406e, 0);
        }
    }
}
