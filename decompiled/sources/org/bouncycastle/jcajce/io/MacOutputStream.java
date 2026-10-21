package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes6.dex */
public final class MacOutputStream extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Mac f89744p0;

    public MacOutputStream(Mac mac) {
        this.f89744p0 = mac;
    }

    public byte[] getMac() {
        return this.f89744p0.doFinal();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f89744p0.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f89744p0.update(bArr, i10, i11);
    }
}
