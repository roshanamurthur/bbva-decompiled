package org.bouncycastle.crypto.prng;

/* JADX INFO: loaded from: classes5.dex */
public interface RandomGenerator {
    void addSeedMaterial(long j10);

    void addSeedMaterial(byte[] bArr);

    void nextBytes(byte[] bArr);

    void nextBytes(byte[] bArr, int i10, int i11);
}
