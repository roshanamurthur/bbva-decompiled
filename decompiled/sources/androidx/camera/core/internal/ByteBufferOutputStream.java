package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(@NonNull ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (!this.mByteBuffer.hasRemaining()) {
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.mByteBuffer.put((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        bArr.getClass();
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        if (this.mByteBuffer.remaining() >= i11) {
            this.mByteBuffer.put(bArr, i10, i11);
            return;
        }
        throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
