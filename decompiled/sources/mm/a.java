package mm;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MessageDigest f83495p0;

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f83495p0.update((byte) i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f83495p0.update(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f83495p0.update(bArr, i10, i11);
    }
}
