package com.esotericsoftware.kryo.unsafe;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.ByteBufferInput;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class UnsafeByteBufferInput extends ByteBufferInput {
    private long bufferAddress;

    public UnsafeByteBufferInput() {
    }

    private void setBufferPosition(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    private void updateBufferAddress() {
        this.bufferAddress = this.byteBuffer.address();
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i10 = this.position;
        this.position = i10 + 1;
        int i11 = unsafe.getByte(j10 + ((long) i10)) & 255;
        setBufferPosition(this.byteBuffer, this.position);
        return i11;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i10 = this.position;
        this.position = i10 + 1;
        boolean z10 = unsafe.getByte(j10 + ((long) i10)) != 0;
        setBufferPosition(this.byteBuffer, this.position);
        return z10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public boolean[] readBooleans(int i10) throws KryoException {
        boolean[] zArr = new boolean[i10];
        readBytes(zArr, UnsafeUtil.booleanArrayBaseOffset, i10);
        return zArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public byte readByte() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i10 = this.position;
        this.position = i10 + 1;
        byte b10 = unsafe.getByte(j10 + ((long) i10));
        setBufferPosition(this.byteBuffer, this.position);
        return b10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int readByteUnsigned() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        long j10 = this.bufferAddress;
        int i10 = this.position;
        this.position = i10 + 1;
        int i11 = unsafe.getByte(j10 + ((long) i10)) & 255;
        setBufferPosition(this.byteBuffer, this.position);
        return i11;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr, int i10, int i11) throws KryoException {
        readBytes(bArr, UnsafeUtil.byteArrayBaseOffset + ((long) i10), i11);
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public char readChar() throws KryoException {
        require(2);
        char c10 = UnsafeUtil.unsafe.getChar(this.bufferAddress + ((long) this.position));
        int i10 = this.position + 2;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
        return c10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public char[] readChars(int i10) throws KryoException {
        char[] cArr = new char[i10];
        readBytes(cArr, UnsafeUtil.charArrayBaseOffset, i10 << 1);
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public double readDouble() throws KryoException {
        require(8);
        double d2 = UnsafeUtil.unsafe.getDouble(this.bufferAddress + ((long) this.position));
        int i10 = this.position + 8;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
        return d2;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public double[] readDoubles(int i10) throws KryoException {
        double[] dArr = new double[i10];
        readBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, i10 << 3);
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public float readFloat() throws KryoException {
        require(4);
        float f6 = UnsafeUtil.unsafe.getFloat(this.bufferAddress + ((long) this.position));
        int i10 = this.position + 4;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
        return f6;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public float[] readFloats(int i10) throws KryoException {
        float[] fArr = new float[i10];
        readBytes(fArr, UnsafeUtil.floatArrayBaseOffset, i10 << 2);
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int readInt() throws KryoException {
        require(4);
        int i10 = UnsafeUtil.unsafe.getInt(this.bufferAddress + ((long) this.position));
        int i11 = this.position + 4;
        this.position = i11;
        setBufferPosition(this.byteBuffer, i11);
        return i10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public int[] readInts(int i10) throws KryoException {
        int[] iArr = new int[i10];
        readBytes(iArr, UnsafeUtil.intArrayBaseOffset, i10 << 2);
        return iArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public long readLong() throws KryoException {
        require(8);
        long j10 = UnsafeUtil.unsafe.getLong(this.bufferAddress + ((long) this.position));
        int i10 = this.position + 8;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
        return j10;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public long[] readLongs(int i10) throws KryoException {
        long[] jArr = new long[i10];
        readBytes(jArr, UnsafeUtil.longArrayBaseOffset, i10 << 3);
        return jArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public short readShort() throws KryoException {
        require(2);
        short s4 = UnsafeUtil.unsafe.getShort(this.bufferAddress + ((long) this.position));
        int i10 = this.position + 2;
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
        return s4;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput, com.esotericsoftware.kryo.io.Input
    public short[] readShorts(int i10) throws KryoException {
        short[] sArr = new short[i10];
        readBytes(sArr, UnsafeUtil.shortArrayBaseOffset, i10 << 1);
        return sArr;
    }

    @Override // com.esotericsoftware.kryo.io.ByteBufferInput
    public void setBuffer(ByteBuffer byteBuffer) {
        if (!(byteBuffer instanceof DirectBuffer)) {
            throw new IllegalArgumentException("buffer must be direct.");
        }
        ByteBuffer byteBuffer2 = this.byteBuffer;
        if (byteBuffer != byteBuffer2) {
            UnsafeUtil.dispose(byteBuffer2);
        }
        super.setBuffer(byteBuffer);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(int i10) {
        super(i10);
        updateBufferAddress();
    }

    public void readBytes(Object obj, long j10, int i10) throws KryoException {
        long j11 = j10;
        int iMin = Math.min(this.limit - this.position, i10);
        int i11 = i10;
        while (true) {
            long j12 = iMin;
            UnsafeUtil.unsafe.copyMemory((Object) null, this.bufferAddress + ((long) this.position), obj, j11, j12);
            int i12 = this.position + iMin;
            this.position = i12;
            i11 -= iMin;
            if (i11 == 0) {
                setBufferPosition(this.byteBuffer, i12);
                return;
            } else {
                j11 += j12;
                iMin = Math.min(i11, this.capacity);
                require(iMin);
            }
        }
    }

    public UnsafeByteBufferInput(byte[] bArr) {
        super(bArr);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(ByteBuffer byteBuffer) {
        super(byteBuffer);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(long j10, int i10) {
        super(UnsafeUtil.newDirectBuffer(j10, i10));
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(InputStream inputStream) {
        super(inputStream);
        updateBufferAddress();
    }

    public UnsafeByteBufferInput(InputStream inputStream, int i10) {
        super(inputStream, i10);
        updateBufferAddress();
    }
}
