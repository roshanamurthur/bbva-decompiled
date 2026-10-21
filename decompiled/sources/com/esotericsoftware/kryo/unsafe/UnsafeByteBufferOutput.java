package com.esotericsoftware.kryo.unsafe;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.ByteBufferOutput;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class UnsafeByteBufferOutput extends ByteBufferOutput {
    private long bufferAddress;

    public UnsafeByteBufferOutput() {
    }

    private void setBufferPosition(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    private void updateBufferAddress() {
        this.bufferAddress = this.byteBuffer.address();
    }

    public void dispose() {
        UnsafeUtil.dispose(this.byteBuffer);
        this.byteBuffer = null;
        this.bufferAddress = 0L;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public boolean require(int i10) throws KryoException {
        ByteBuffer byteBuffer = this.byteBuffer;
        boolean zRequire = super.require(i10);
        if (this.byteBuffer != byteBuffer) {
            UnsafeUtil.dispose(byteBuffer);
            updateBufferAddress();
        }
        return zRequire;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput
    public void setBuffer(ByteBuffer byteBuffer, int i10) {
        if (!(byteBuffer instanceof DirectBuffer)) {
            throw new IllegalArgumentException("buffer must be direct.");
        }
        ByteBuffer byteBuffer2 = this.byteBuffer;
        if (byteBuffer != byteBuffer2) {
            UnsafeUtil.dispose(byteBuffer2);
        }
        super.setBuffer(byteBuffer, i10);
        updateBufferAddress();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i11 = this.position;
        this.position = i11 + 1;
        unsafe.putByte(j10 + ((long) i11), (byte) i10);
        setBufferPosition(this.byteBuffer, this.position);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeBoolean(boolean z10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i10 = this.position;
        this.position = i10 + 1;
        unsafe.putByte(j10 + ((long) i10), z10 ? (byte) 1 : (byte) 0);
        setBufferPosition(this.byteBuffer, this.position);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeBooleans(boolean[] zArr, int i10, int i11) throws KryoException {
        writeBytes(zArr, UnsafeUtil.booleanArrayBaseOffset, zArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeByte(byte b10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i10 = this.position;
        this.position = i10 + 1;
        unsafe.putByte(j10 + ((long) i10), b10);
        setBufferPosition(this.byteBuffer, this.position);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr, int i10, int i11) throws KryoException {
        writeBytes(bArr, UnsafeUtil.byteArrayBaseOffset + ((long) i10), i11);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeChar(char c10) throws KryoException {
        require(2);
        UnsafeUtil.unsafe.putChar(this.bufferAddress + ((long) this.position), c10);
        int i10 = this.position + 2;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeChars(char[] cArr, int i10, int i11) throws KryoException {
        writeBytes(cArr, UnsafeUtil.charArrayBaseOffset, cArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeDouble(double d2) throws KryoException {
        require(8);
        UnsafeUtil.unsafe.putDouble(this.bufferAddress + ((long) this.position), d2);
        int i10 = this.position + 8;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeDoubles(double[] dArr, int i10, int i11) throws KryoException {
        writeBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, dArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeFloat(float f6) throws KryoException {
        require(4);
        UnsafeUtil.unsafe.putFloat(this.bufferAddress + ((long) this.position), f6);
        int i10 = this.position + 4;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeFloats(float[] fArr, int i10, int i11) throws KryoException {
        writeBytes(fArr, UnsafeUtil.floatArrayBaseOffset, fArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeInt(int i10) throws KryoException {
        require(4);
        UnsafeUtil.unsafe.putInt(this.bufferAddress + ((long) this.position), i10);
        int i11 = this.position + 4;
        this.position = i11;
        setBufferPosition(this.byteBuffer, i11);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeInts(int[] iArr, int i10, int i11) throws KryoException {
        writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, iArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeLong(long j10) throws KryoException {
        require(8);
        UnsafeUtil.unsafe.putLong(this.bufferAddress + ((long) this.position), j10);
        int i10 = this.position + 8;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeLongs(long[] jArr, int i10, int i11) throws KryoException {
        writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, jArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeShort(int i10) throws KryoException {
        require(2);
        UnsafeUtil.unsafe.putShort(this.bufferAddress + ((long) this.position), (short) i10);
        int i11 = this.position + 2;
        this.position = i11;
        setBufferPosition(this.byteBuffer, i11);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeShorts(short[] sArr, int i10, int i11) throws KryoException {
        writeBytes(sArr, UnsafeUtil.shortArrayBaseOffset, sArr.length << 1);
    }

    public UnsafeByteBufferOutput(int i10) {
        super(i10);
        updateBufferAddress();
    }

    public void writeBytes(Object obj, long j10, int i10) throws KryoException {
        long j11 = j10;
        int iMin = Math.min(this.capacity - this.position, i10);
        int i11 = i10;
        while (true) {
            long j12 = iMin;
            UnsafeUtil.unsafe.copyMemory(obj, j11, (Object) null, ((long) this.position) + this.bufferAddress, j12);
            int i12 = this.position + iMin;
            this.position = i12;
            i11 -= iMin;
            if (i11 == 0) {
                setBufferPosition(this.byteBuffer, i12);
                return;
            } else {
                j11 += j12;
                iMin = Math.min(this.capacity, i11);
                require(iMin);
            }
        }
    }

    public UnsafeByteBufferOutput(int i10, int i11) {
        super(i10, i11);
        updateBufferAddress();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferOutput, com.esotericsoftware.kryo.io.Output
    public void writeByte(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i11 = this.position;
        this.position = i11 + 1;
        unsafe.putByte(j10 + ((long) i11), (byte) i10);
        setBufferPosition(this.byteBuffer, this.position);
    }

    public UnsafeByteBufferOutput(OutputStream outputStream) {
        super(outputStream);
        updateBufferAddress();
    }

    public UnsafeByteBufferOutput(OutputStream outputStream, int i10) {
        super(outputStream, i10);
        updateBufferAddress();
    }

    public UnsafeByteBufferOutput(long j10, int i10) {
        super(UnsafeUtil.newDirectBuffer(j10, i10));
        updateBufferAddress();
    }
}
