package com.esotericsoftware.kryo.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferOutputStream extends OutputStream {
    private ByteBuffer byteBuffer;

    public ByteBufferOutputStream() {
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        if (!this.byteBuffer.hasRemaining()) {
            flush();
        }
        this.byteBuffer.put((byte) i10);
    }

    public ByteBufferOutputStream(int i10) {
        this(ByteBuffer.allocate(i10));
    }

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (this.byteBuffer.remaining() < i11) {
            flush();
        }
        this.byteBuffer.put(bArr, i10, i11);
    }
}
