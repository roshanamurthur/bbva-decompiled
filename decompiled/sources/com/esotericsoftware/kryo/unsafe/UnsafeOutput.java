package com.esotericsoftware.kryo.unsafe;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Output;
import java.io.OutputStream;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes9.dex */
public class UnsafeOutput extends Output {
    public UnsafeOutput() {
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i11 = this.position;
        this.position = i11 + 1;
        unsafe.putByte(bArr, j10 + ((long) i11), (byte) i10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBoolean(boolean z10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i10 = this.position;
        this.position = i10 + 1;
        unsafe.putByte(bArr, j10 + ((long) i10), z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBooleans(boolean[] zArr, int i10, int i11) throws KryoException {
        writeBytes(zArr, UnsafeUtil.booleanArrayBaseOffset, zArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(byte b10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i10 = this.position;
        this.position = i10 + 1;
        unsafe.putByte(bArr, j10 + ((long) i10), b10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr, int i10, int i11) throws KryoException {
        writeBytes(bArr, UnsafeUtil.byteArrayBaseOffset + ((long) i10), i11);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChar(char c10) throws KryoException {
        require(2);
        UnsafeUtil.unsafe.putChar(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), c10);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChars(char[] cArr, int i10, int i11) throws KryoException {
        writeBytes(cArr, UnsafeUtil.charArrayBaseOffset, cArr.length << 1);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDouble(double d2) throws KryoException {
        require(8);
        UnsafeUtil.unsafe.putDouble(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), d2);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDoubles(double[] dArr, int i10, int i11) throws KryoException {
        writeBytes(dArr, UnsafeUtil.doubleArrayBaseOffset, dArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloat(float f6) throws KryoException {
        require(4);
        UnsafeUtil.unsafe.putFloat(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), f6);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloats(float[] fArr, int i10, int i11) throws KryoException {
        writeBytes(fArr, UnsafeUtil.floatArrayBaseOffset, fArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInt(int i10) throws KryoException {
        require(4);
        UnsafeUtil.unsafe.putInt(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), i10);
        this.position += 4;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInts(int[] iArr, int i10, int i11) throws KryoException {
        writeBytes(iArr, UnsafeUtil.intArrayBaseOffset, iArr.length << 2);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLong(long j10) throws KryoException {
        require(8);
        UnsafeUtil.unsafe.putLong(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), j10);
        this.position += 8;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLongs(long[] jArr, int i10, int i11) throws KryoException {
        writeBytes(jArr, UnsafeUtil.longArrayBaseOffset, jArr.length << 3);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShort(int i10) throws KryoException {
        require(2);
        UnsafeUtil.unsafe.putShort(this.buffer, UnsafeUtil.byteArrayBaseOffset + ((long) this.position), (short) i10);
        this.position += 2;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShorts(short[] sArr, int i10, int i11) throws KryoException {
        writeBytes(sArr, UnsafeUtil.shortArrayBaseOffset, sArr.length << 1);
    }

    public UnsafeOutput(int i10) {
        this(i10, i10);
    }

    public void writeBytes(Object obj, long j10, int i10) throws KryoException {
        long j11 = j10;
        int iMin = Math.min(this.capacity - this.position, i10);
        int i11 = i10;
        while (true) {
            long j12 = iMin;
            UnsafeUtil.unsafe.copyMemory(obj, j11, this.buffer, ((long) this.position) + UnsafeUtil.byteArrayBaseOffset, j12);
            this.position += iMin;
            i11 -= iMin;
            if (i11 == 0) {
                return;
            }
            j11 += j12;
            iMin = Math.min(this.capacity, i11);
            require(iMin);
        }
    }

    public UnsafeOutput(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        Unsafe unsafe = UnsafeUtil.unsafe;
        byte[] bArr = this.buffer;
        long j10 = UnsafeUtil.byteArrayBaseOffset;
        int i11 = this.position;
        this.position = i11 + 1;
        unsafe.putByte(bArr, j10 + ((long) i11), (byte) i10);
    }

    public UnsafeOutput(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public UnsafeOutput(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public UnsafeOutput(OutputStream outputStream) {
        super(outputStream);
    }

    public UnsafeOutput(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
