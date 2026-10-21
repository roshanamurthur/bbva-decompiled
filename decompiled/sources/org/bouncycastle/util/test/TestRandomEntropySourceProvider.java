package org.bouncycastle.util.test;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;

/* JADX INFO: loaded from: classes13.dex */
public class TestRandomEntropySourceProvider implements EntropySourceProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f91680a = new SecureRandom();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91681b;

    public class a implements EntropySource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f91682a;

        public a(int i10) {
            this.f91682a = i10;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public final int entropySize() {
            return this.f91682a;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public final byte[] getEntropy() {
            byte[] bArr = new byte[(this.f91682a + 7) / 8];
            TestRandomEntropySourceProvider.this.f91680a.nextBytes(bArr);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public final boolean isPredictionResistant() {
            return TestRandomEntropySourceProvider.this.f91681b;
        }
    }

    public TestRandomEntropySourceProvider(boolean z10) {
        this.f91681b = z10;
    }

    @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
    public EntropySource get(int i10) {
        return new a(i10);
    }
}
