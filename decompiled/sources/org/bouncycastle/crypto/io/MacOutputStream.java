package org.bouncycastle.crypto.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes4.dex */
public class MacOutputStream extends OutputStream {
    protected Mac mac;

    public MacOutputStream(Mac mac) {
        this.mac = mac;
    }

    public byte[] getMac() {
        byte[] bArr = new byte[this.mac.getMacSize()];
        this.mac.doFinal(bArr, 0);
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.mac.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.mac.update(bArr, i10, i11);
    }
}
