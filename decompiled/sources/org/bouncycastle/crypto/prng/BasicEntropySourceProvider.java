package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class BasicEntropySourceProvider implements EntropySourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f89398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89399b;

    public class a implements EntropySource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f89400a;

        public a(int i10) {
            this.f89400a = i10;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public final int entropySize() {
            return this.f89400a;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public final byte[] getEntropy() {
            SecureRandom secureRandom = BasicEntropySourceProvider.this.f89398a;
            boolean z10 = secureRandom instanceof SP800SecureRandom;
            int i10 = this.f89400a;
            if (!z10 && !(secureRandom instanceof X931SecureRandom)) {
                return secureRandom.generateSeed((i10 + 7) / 8);
            }
            byte[] bArr = new byte[(i10 + 7) / 8];
            secureRandom.nextBytes(bArr);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public final boolean isPredictionResistant() {
            return BasicEntropySourceProvider.this.f89399b;
        }
    }

    public BasicEntropySourceProvider(SecureRandom secureRandom, boolean z10) {
        this.f89398a = secureRandom;
        this.f89399b = z10;
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(int i10) {
        return new a(i10);
    }
}
