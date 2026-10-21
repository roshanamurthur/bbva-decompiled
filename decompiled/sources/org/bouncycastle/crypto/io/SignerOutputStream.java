package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes4.dex */
public class SignerOutputStream extends OutputStream {
    protected Signer signer;

    public SignerOutputStream(Signer signer) {
        this.signer = signer;
    }

    public Signer getSigner() {
        return this.signer;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.signer.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.signer.update(bArr, i10, i11);
    }
}
