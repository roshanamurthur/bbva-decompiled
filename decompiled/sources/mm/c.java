package mm;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Signature f83497p0;

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        try {
            this.f83497p0.update((byte) i10);
        } catch (SignatureException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.f83497p0.update(bArr);
        } catch (SignatureException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.f83497p0.update(bArr, i10, i11);
        } catch (SignatureException e5) {
            throw new IOException(e5.getMessage());
        }
    }
}
