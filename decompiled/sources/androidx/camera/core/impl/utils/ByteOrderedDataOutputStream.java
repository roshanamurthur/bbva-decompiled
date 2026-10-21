package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class ByteOrderedDataOutputStream extends FilterOutputStream {
    private ByteOrder mByteOrder;
    final OutputStream mOutputStream;

    public ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mOutputStream.write(bArr);
    }

    public void writeByte(int i10) throws IOException {
        this.mOutputStream.write(i10);
    }

    public void writeInt(int i10) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write(i10 & 255);
            this.mOutputStream.write((i10 >>> 8) & 255);
            this.mOutputStream.write((i10 >>> 16) & 255);
            this.mOutputStream.write((i10 >>> 24) & 255);
            return;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((i10 >>> 24) & 255);
            this.mOutputStream.write((i10 >>> 16) & 255);
            this.mOutputStream.write((i10 >>> 8) & 255);
            this.mOutputStream.write(i10 & 255);
        }
    }

    public void writeShort(short s4) throws IOException {
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write(s4 & 255);
            this.mOutputStream.write((s4 >>> 8) & 255);
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((s4 >>> 8) & 255);
            this.mOutputStream.write(s4 & 255);
        }
    }

    public void writeUnsignedInt(long j10) throws IOException {
        writeInt((int) j10);
    }

    public void writeUnsignedShort(int i10) throws IOException {
        writeShort((short) i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.mOutputStream.write(bArr, i10, i11);
    }
}
