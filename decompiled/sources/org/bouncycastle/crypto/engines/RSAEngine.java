package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes3.dex */
public class RSAEngine implements AsymmetricBlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f88556a;

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.f88556a.c();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return this.f88556a.d();
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (this.f88556a == null) {
            this.f88556a = new a();
        }
        this.f88556a.e(z10, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        a aVar = this.f88556a;
        if (aVar != null) {
            return aVar.b(aVar.f(aVar.a(bArr, i10, i11)));
        }
        throw new IllegalStateException("RSA engine not initialised");
    }
}
