package com.esotericsoftware.kryo.unsafe;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import java.io.InputStream;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes9.dex */
public class UnsafeInput extends Input {
    public UnsafeInput() {
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i10 = this.position;
        this.position = i10 + 1;
        return unsafe.getByte(bArr, j10 + ((long) i10)) & 255;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i10 = this.position;
        this.position = i10 + 1;
        return unsafe.getByte(bArr, j10 + ((long) i10)) != 0;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean[] readBooleans(int i10) throws KryoException {
        boolean[] zArr = new boolean[i10];
        readBytes(zArr, UnsafeUtil.booleanArrayBaseOffset, i10);
        return zArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte readByte() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i10 = this.position;
        this.position = i10 + 1;
        return unsafe.getByte(bArr, j10 + ((long) i10));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readByteUnsigned() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i10 = this.position;
        this.position = i10 + 1;
        return unsafe.getByte(bArr, j10 + ((long) i10)) & 255;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr, int i10, int i11) throws KryoException {
        readBytes(bArr, UnsafeUtil.byteArrayBaseOffset + ((long) i10), i11);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char readChar() throws KryoException {
        require(2);
        char c10 = UnsafeUtil.unsafe.getChar(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 2;
        return c10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char[] readChars(int i10) throws KryoException {
        char[] cArr = new char[i10];
        readBytes(cArr, UnsafeUtil.charArrayBaseOffset, i10 << 1);
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double readDouble() throws KryoException {
        require(8);
        double d2 = UnsafeUtil.unsafe.getDouble(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 8;
        return d2;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double[] readDoubles(int i10) throws KryoException {
        double[] dArr = new double[i10];
        readBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, i10 << 3);
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float readFloat() throws KryoException {
        require(4);
        float f6 = UnsafeUtil.unsafe.getFloat(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 4;
        return f6;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float[] readFloats(int i10) throws KryoException {
        float[] fArr = new float[i10];
        readBytes(fArr, UnsafeUtil.floatArrayBaseOffset, i10 << 2);
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt() throws KryoException {
        require(4);
        int i10 = UnsafeUtil.unsafe.getInt(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 4;
        return i10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int[] readInts(int i10) throws KryoException {
        int[] iArr = new int[i10];
        readBytes(iArr, UnsafeUtil.intArrayBaseOffset, i10 << 2);
        return iArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong() throws KryoException {
        require(8);
        long j10 = UnsafeUtil.unsafe.getLong(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 8;
        return j10;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long[] readLongs(int i10) throws KryoException {
        long[] jArr = new long[i10];
        readBytes(jArr, UnsafeUtil.longArrayBaseOffset, i10 << 3);
        return jArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short readShort() throws KryoException {
        require(2);
        short s4 = UnsafeUtil.unsafe.getShort(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position));
        this.position += 2;
        return s4;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short[] readShorts(int i10) throws KryoException {
        short[] sArr = new short[i10];
        readBytes(sArr, UnsafeUtil.shortArrayBaseOffset, i10 << 1);
        return sArr;
    }

    public UnsafeInput(int i10) {
        super(i10);
    }

    public void readBytes(Object obj, long j10, int i10) throws KryoException {
        long j11 = j10;
        int iMin = Math.min(this.limit - this.position, i10);
        int i11 = i10;
        while (true) {
            long j12 = iMin;
            UnsafeUtil.unsafe.copyMemory(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), obj, j11, j12);
            this.position += iMin;
            i11 -= iMin;
            if (i11 == 0) {
                return;
            }
            j11 += j12;
            iMin = Math.min(i11, this.capacity);
            require(iMin);
        }
    }

    public UnsafeInput(byte[] bArr) {
        super(bArr);
    }

    public UnsafeInput(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public UnsafeInput(InputStream inputStream) {
        super(inputStream);
    }

    public UnsafeInput(InputStream inputStream, int i10) {
        super(inputStream, i10);
    }
}
