package com.esotericsoftware.kryo.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferInputStream extends InputStream {
    private ByteBuffer byteBuffer;

    public ByteBufferInputStream() {
    }

    private void flipBuffer(Buffer buffer) {
        buffer.flip();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.byteBuffer.remaining();
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.byteBuffer.hasRemaining()) {
            return this.byteBuffer.get() & 255;
        }
        return -1;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public ByteBufferInputStream(int i10) {
        this(ByteBuffer.allocate(i10));
        flipBuffer(this.byteBuffer);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(this.byteBuffer.remaining(), i11);
        if (iMin == 0) {
            return -1;
        }
        this.byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }

    public ByteBufferInputStream(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }
}
