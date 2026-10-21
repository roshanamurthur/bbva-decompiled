package com.esotericsoftware.kryo.io;

import androidx.appcompat.widget.g0;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.Util;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferOutput extends Output {
    private static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    protected ByteBuffer byteBuffer;

    public ByteBufferOutput() {
    }

    private int getBufferPosition(Buffer buffer) {
        return buffer.position();
    }

    private void setBufferLimit(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    private void setBufferPosition(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    private void writeAscii_slow(String str, int i10) throws KryoException {
        ByteBuffer byteBuffer = this.byteBuffer;
        int iMin = Math.min(i10, this.capacity - this.position);
        int i11 = 0;
        while (i11 < i10) {
            byte[] bArr = new byte[i10];
            int i12 = i11 + iMin;
            str.getBytes(i11, i12, bArr, 0);
            byteBuffer.put(bArr, 0, iMin);
            this.position += iMin;
            iMin = Math.min(i10 - i12, this.capacity);
            if (require(iMin)) {
                byteBuffer = this.byteBuffer;
            }
            i11 = i12;
        }
    }

    private void writeUtf8_slow(String str, int i10, int i11) {
        while (i11 < i10) {
            int i12 = this.position;
            int i13 = this.capacity;
            if (i12 == i13) {
                require(Math.min(i13, i10 - i11));
            }
            this.position++;
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 127) {
                this.byteBuffer.put((byte) cCharAt);
            } else if (cCharAt > 2047) {
                this.byteBuffer.put((byte) (((cCharAt >> '\f') & 15) | 224));
                require(2);
                this.position += 2;
                this.byteBuffer.put((byte) (((cCharAt >> 6) & 63) | 128));
                this.byteBuffer.put((byte) ((cCharAt & '?') | 128));
            } else {
                this.byteBuffer.put((byte) (((cCharAt >> 6) & 31) | 192));
                if (this.position == this.capacity) {
                    require(1);
                }
                this.position++;
                this.byteBuffer.put((byte) ((cCharAt & '?') | 128));
            }
            i11++;
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        flush();
        OutputStream outputStream = this.outputStream;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream, java.io.Flushable
    public void flush() throws KryoException {
        if (this.outputStream == null) {
            return;
        }
        try {
            byte[] bArr = new byte[this.position];
            setBufferPosition(this.byteBuffer, 0);
            this.byteBuffer.get(bArr);
            setBufferPosition(this.byteBuffer, 0);
            this.outputStream.write(bArr, 0, this.position);
            this.total += (long) this.position;
            this.position = 0;
        } catch (IOException e5) {
            throw new KryoException(e5);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public byte[] getBuffer() {
        throw new UnsupportedOperationException("This buffer does not used a byte[], see #getByteBuffer().");
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public boolean require(int i10) throws KryoException {
        int iMin;
        if (this.capacity - this.position >= i10) {
            return false;
        }
        flush();
        int i11 = this.capacity;
        int i12 = this.position;
        if (i11 - i12 >= i10) {
            return true;
        }
        int i13 = this.maxCapacity;
        if (i10 > i13 - i12) {
            if (i10 > i13) {
                throw new KryoException("Buffer overflow. Max capacity: " + this.maxCapacity + ", required: " + i10);
            }
            throw new KryoException("Buffer overflow. Available: " + (this.maxCapacity - this.position) + ", required: " + i10);
        }
        if (i11 == 0) {
            this.capacity = 16;
        }
        do {
            iMin = Math.min(this.capacity * 2, this.maxCapacity);
            this.capacity = iMin;
        } while (iMin - this.position < i10);
        ByteBuffer byteBufferAllocate = !this.byteBuffer.isDirect() ? ByteBuffer.allocate(this.capacity) : ByteBuffer.allocateDirect(this.capacity);
        setBufferPosition(this.byteBuffer, 0);
        setBufferLimit(this.byteBuffer, this.position);
        byteBufferAllocate.put(this.byteBuffer);
        byteBufferAllocate.order(this.byteBuffer.order());
        this.byteBuffer = byteBufferAllocate;
        return true;
    }

    @Override // com.esotericsoftware.kryo.io.Output, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        super.reset();
        setBufferPosition(this.byteBuffer, 0);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setBuffer(byte[] bArr) {
        throw new UnsupportedOperationException("This buffer does not used a byte[], see #setByteBuffer(ByteBuffer).");
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setPosition(int i10) {
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public byte[] toBytes() {
        byte[] bArr = new byte[this.position];
        setBufferPosition(this.byteBuffer, 0);
        this.byteBuffer.get(bArr, 0, this.position);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put((byte) i10);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeAscii(String str) throws KryoException {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        if (this.capacity - this.position < length) {
            writeAscii_slow(str, length);
        } else {
            ByteBuffer byteBuffer = this.byteBuffer;
            int length2 = str.length();
            for (int i10 = 0; i10 < length2; i10++) {
                byteBuffer.put((byte) str.charAt(i10));
            }
            this.position += length;
        }
        ByteBuffer byteBuffer2 = this.byteBuffer;
        int i11 = this.position;
        byteBuffer2.put(i11 - 1, (byte) (128 | byteBuffer2.get(i11 - 1)));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBoolean(boolean z10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put(z10 ? (byte) 1 : (byte) 0);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBooleans(boolean[] zArr, int i10, int i11) throws KryoException {
        if (this.capacity < i11) {
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeBoolean(zArr[i10]);
                i10++;
            }
            return;
        }
        require(i11);
        int i13 = i11 + i10;
        while (i10 < i13) {
            this.byteBuffer.put(zArr[i10] ? (byte) 1 : (byte) 0);
            i10++;
        }
        this.position = getBufferPosition(this.byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(byte b10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put(b10);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        writeBytes(bArr, 0, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChar(char c10) throws KryoException {
        require(2);
        this.position += 2;
        this.byteBuffer.put((byte) c10);
        this.byteBuffer.put((byte) (c10 >>> '\b'));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeChars(char[] cArr, int i10, int i11) throws KryoException {
        int i12 = i11 << 1;
        if (this.capacity < i12) {
            int i13 = i11 + i10;
            while (i10 < i13) {
                writeChar(cArr[i10]);
                i10++;
            }
            return;
        }
        require(i12);
        int i14 = i11 + i10;
        while (i10 < i14) {
            char c10 = cArr[i10];
            this.byteBuffer.put((byte) c10);
            this.byteBuffer.put((byte) (c10 >>> '\b'));
            i10++;
        }
        this.position = getBufferPosition(this.byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDouble(double d2) throws KryoException {
        require(8);
        this.position += 8;
        ByteBuffer byteBuffer = this.byteBuffer;
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        byteBuffer.put((byte) jDoubleToLongBits);
        byteBuffer.put((byte) (jDoubleToLongBits >>> 8));
        byteBuffer.put((byte) (jDoubleToLongBits >>> 16));
        byteBuffer.put((byte) (jDoubleToLongBits >>> 24));
        byteBuffer.put((byte) (jDoubleToLongBits >>> 32));
        byteBuffer.put((byte) (jDoubleToLongBits >>> 40));
        byteBuffer.put((byte) (jDoubleToLongBits >>> 48));
        byteBuffer.put((byte) (jDoubleToLongBits >>> 56));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeDoubles(double[] dArr, int i10, int i11) throws KryoException {
        int i12 = i11 << 3;
        if (this.capacity < i12) {
            int i13 = i11 + i10;
            while (i10 < i13) {
                writeDouble(dArr[i10]);
                i10++;
            }
            return;
        }
        require(i12);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i14 = i11 + i10;
        while (i10 < i14) {
            long jDoubleToLongBits = Double.doubleToLongBits(dArr[i10]);
            byteBuffer.put((byte) jDoubleToLongBits);
            byteBuffer.put((byte) (jDoubleToLongBits >>> 8));
            byteBuffer.put((byte) (jDoubleToLongBits >>> 16));
            byteBuffer.put((byte) (jDoubleToLongBits >>> 24));
            byteBuffer.put((byte) (jDoubleToLongBits >>> 32));
            byteBuffer.put((byte) (jDoubleToLongBits >>> 40));
            byteBuffer.put((byte) (jDoubleToLongBits >>> 48));
            byteBuffer.put((byte) (jDoubleToLongBits >>> 56));
            i10++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloat(float f6) throws KryoException {
        require(4);
        ByteBuffer byteBuffer = this.byteBuffer;
        this.position += 4;
        int iFloatToIntBits = Float.floatToIntBits(f6);
        byteBuffer.put((byte) iFloatToIntBits);
        byteBuffer.put((byte) (iFloatToIntBits >> 8));
        byteBuffer.put((byte) (iFloatToIntBits >> 16));
        byteBuffer.put((byte) (iFloatToIntBits >> 24));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeFloats(float[] fArr, int i10, int i11) throws KryoException {
        int i12 = i11 << 2;
        if (this.capacity < i12) {
            int i13 = i11 + i10;
            while (i10 < i13) {
                writeFloat(fArr[i10]);
                i10++;
            }
            return;
        }
        require(i12);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i14 = i11 + i10;
        while (i10 < i14) {
            int iFloatToIntBits = Float.floatToIntBits(fArr[i10]);
            byteBuffer.put((byte) iFloatToIntBits);
            byteBuffer.put((byte) (iFloatToIntBits >> 8));
            byteBuffer.put((byte) (iFloatToIntBits >> 16));
            byteBuffer.put((byte) (iFloatToIntBits >> 24));
            i10++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInt(int i10) throws KryoException {
        require(4);
        this.position += 4;
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.put((byte) i10);
        byteBuffer.put((byte) (i10 >> 8));
        byteBuffer.put((byte) (i10 >> 16));
        byteBuffer.put((byte) (i10 >> 24));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeInts(int[] iArr, int i10, int i11) throws KryoException {
        int i12 = i11 << 2;
        if (this.capacity < i12) {
            int i13 = i11 + i10;
            while (i10 < i13) {
                writeInt(iArr[i10]);
                i10++;
            }
            return;
        }
        require(i12);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i14 = i11 + i10;
        while (i10 < i14) {
            int i15 = iArr[i10];
            byteBuffer.put((byte) i15);
            byteBuffer.put((byte) (i15 >> 8));
            byteBuffer.put((byte) (i15 >> 16));
            byteBuffer.put((byte) (i15 >> 24));
            i10++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLong(long j10) throws KryoException {
        require(8);
        this.position += 8;
        ByteBuffer byteBuffer = this.byteBuffer;
        byteBuffer.put((byte) j10);
        byteBuffer.put((byte) (j10 >>> 8));
        byteBuffer.put((byte) (j10 >>> 16));
        byteBuffer.put((byte) (j10 >>> 24));
        byteBuffer.put((byte) (j10 >>> 32));
        byteBuffer.put((byte) (j10 >>> 40));
        byteBuffer.put((byte) (j10 >>> 48));
        byteBuffer.put((byte) (j10 >>> 56));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeLongs(long[] jArr, int i10, int i11) throws KryoException {
        int i12 = i11 << 3;
        if (this.capacity < i12) {
            int i13 = i11 + i10;
            while (i10 < i13) {
                writeLong(jArr[i10]);
                i10++;
            }
            return;
        }
        require(i12);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i14 = i11 + i10;
        while (i10 < i14) {
            long j10 = jArr[i10];
            byteBuffer.put((byte) j10);
            byteBuffer.put((byte) (j10 >>> 8));
            byteBuffer.put((byte) (j10 >>> 16));
            byteBuffer.put((byte) (j10 >>> 24));
            byteBuffer.put((byte) (j10 >>> 32));
            byteBuffer.put((byte) (j10 >>> 40));
            byteBuffer.put((byte) (j10 >>> 48));
            byteBuffer.put((byte) (j10 >>> 56));
            i10++;
        }
        this.position = getBufferPosition(byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShort(int i10) throws KryoException {
        require(2);
        this.position += 2;
        this.byteBuffer.put((byte) i10);
        this.byteBuffer.put((byte) (i10 >>> 8));
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeShorts(short[] sArr, int i10, int i11) throws KryoException {
        int i12 = i11 << 1;
        if (this.capacity < i12) {
            int i13 = i11 + i10;
            while (i10 < i13) {
                writeShort(sArr[i10]);
                i10++;
            }
            return;
        }
        require(i12);
        int i14 = i11 + i10;
        while (i10 < i14) {
            short s4 = sArr[i10];
            this.byteBuffer.put((byte) s4);
            this.byteBuffer.put((byte) (s4 >>> 8));
            i10++;
        }
        this.position = getBufferPosition(this.byteBuffer);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeString(String str) throws KryoException {
        if (str == null) {
            writeByte(128);
            return;
        }
        int length = str.length();
        if (length == 0) {
            writeByte(129);
            return;
        }
        int i10 = 0;
        if (length > 1 && length <= 32) {
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    if (this.capacity - this.position < length) {
                        writeAscii_slow(str, length);
                    } else {
                        int length2 = str.length();
                        while (i10 < length2) {
                            this.byteBuffer.put((byte) str.charAt(i10));
                            i10++;
                        }
                        this.position += length;
                    }
                    ByteBuffer byteBuffer = this.byteBuffer;
                    int i12 = this.position;
                    byteBuffer.put(i12 - 1, (byte) (128 | byteBuffer.get(i12 - 1)));
                    return;
                }
                if (str.charAt(i11) > 127) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        writeVarIntFlag(true, length + 1, true);
        if (this.capacity - this.position >= length) {
            ByteBuffer byteBuffer2 = this.byteBuffer;
            while (true) {
                char cCharAt = str.charAt(i10);
                if (cCharAt > 127) {
                    this.position = getBufferPosition(byteBuffer2);
                    break;
                }
                byteBuffer2.put((byte) cCharAt);
                i10++;
                if (i10 == length) {
                    this.position = getBufferPosition(byteBuffer2);
                    return;
                }
            }
        }
        if (i10 < length) {
            writeUtf8_slow(str, length, i10);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarInt(int i10, boolean z10) throws KryoException {
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        int i11 = i10 >>> 7;
        if (i11 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            this.position++;
            this.byteBuffer.put((byte) i10);
            return 1;
        }
        int i12 = i10 >>> 14;
        if (i12 == 0) {
            require(2);
            this.position += 2;
            this.byteBuffer.put((byte) ((i10 & 127) | 128));
            this.byteBuffer.put((byte) i11);
            return 2;
        }
        int i13 = i10 >>> 21;
        if (i13 == 0) {
            require(3);
            this.position += 3;
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.put((byte) ((i10 & 127) | 128));
            byteBuffer.put((byte) (i11 | 128));
            byteBuffer.put((byte) i12);
            return 3;
        }
        int i14 = i10 >>> 28;
        if (i14 == 0) {
            require(4);
            this.position += 4;
            ByteBuffer byteBuffer2 = this.byteBuffer;
            byteBuffer2.put((byte) ((i10 & 127) | 128));
            byteBuffer2.put((byte) (i11 | 128));
            byteBuffer2.put((byte) (i12 | 128));
            byteBuffer2.put((byte) i13);
            return 4;
        }
        require(5);
        this.position += 5;
        ByteBuffer byteBuffer3 = this.byteBuffer;
        byteBuffer3.put((byte) ((i10 & 127) | 128));
        byteBuffer3.put((byte) (i11 | 128));
        byteBuffer3.put((byte) (i12 | 128));
        byteBuffer3.put((byte) (i13 | 128));
        byteBuffer3.put((byte) i14);
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarIntFlag(boolean z10, int i10, boolean z11) throws KryoException {
        if (!z11) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        int i11 = (z10 ? 128 : 0) | (i10 & 63);
        int i12 = i10 >>> 6;
        if (i12 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            this.byteBuffer.put((byte) i11);
            this.position++;
            return 1;
        }
        int i13 = i10 >>> 13;
        if (i13 == 0) {
            require(2);
            this.position += 2;
            this.byteBuffer.put((byte) (i11 | 64));
            this.byteBuffer.put((byte) i12);
            return 2;
        }
        int i14 = i10 >>> 20;
        if (i14 == 0) {
            require(3);
            this.position += 3;
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.put((byte) (i11 | 64));
            byteBuffer.put((byte) (i12 | 128));
            byteBuffer.put((byte) i13);
            return 3;
        }
        int i15 = i10 >>> 27;
        if (i15 == 0) {
            require(4);
            this.position += 4;
            ByteBuffer byteBuffer2 = this.byteBuffer;
            byteBuffer2.put((byte) (i11 | 64));
            byteBuffer2.put((byte) (i12 | 128));
            byteBuffer2.put((byte) (i13 | 128));
            byteBuffer2.put((byte) i14);
            return 4;
        }
        require(5);
        this.position += 5;
        ByteBuffer byteBuffer3 = this.byteBuffer;
        byteBuffer3.put((byte) (i11 | 64));
        byteBuffer3.put((byte) (i12 | 128));
        byteBuffer3.put((byte) (i13 | 128));
        byteBuffer3.put((byte) (i14 | 128));
        byteBuffer3.put((byte) i15);
        return 5;
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public int writeVarLong(long j10, boolean z10) throws KryoException {
        long j11 = !z10 ? (j10 << 1) ^ (j10 >> 63) : j10;
        long j12 = j11 >>> 7;
        if (j12 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            this.position++;
            this.byteBuffer.put((byte) j11);
            return 1;
        }
        long j13 = j11 >>> 14;
        if (j13 == 0) {
            require(2);
            this.position += 2;
            this.byteBuffer.put((byte) ((j11 & 127) | 128));
            this.byteBuffer.put((byte) j12);
            return 2;
        }
        long j14 = j11 >>> 21;
        if (j14 == 0) {
            require(3);
            this.position += 3;
            ByteBuffer byteBuffer = this.byteBuffer;
            byteBuffer.put((byte) ((j11 & 127) | 128));
            byteBuffer.put((byte) (j12 | 128));
            byteBuffer.put((byte) j13);
            return 3;
        }
        long j15 = j11 >>> 28;
        if (j15 == 0) {
            require(4);
            this.position += 4;
            ByteBuffer byteBuffer2 = this.byteBuffer;
            byteBuffer2.put((byte) ((j11 & 127) | 128));
            byteBuffer2.put((byte) (j12 | 128));
            byteBuffer2.put((byte) (j13 | 128));
            byteBuffer2.put((byte) j14);
            return 4;
        }
        long j16 = j11 >>> 35;
        if (j16 == 0) {
            require(5);
            this.position += 5;
            ByteBuffer byteBuffer3 = this.byteBuffer;
            byteBuffer3.put((byte) ((j11 & 127) | 128));
            byteBuffer3.put((byte) (j12 | 128));
            byteBuffer3.put((byte) (j13 | 128));
            byteBuffer3.put((byte) (j14 | 128));
            byteBuffer3.put((byte) j15);
            return 5;
        }
        long j17 = j11 >>> 42;
        if (j17 == 0) {
            require(6);
            this.position += 6;
            ByteBuffer byteBuffer4 = this.byteBuffer;
            byteBuffer4.put((byte) ((j11 & 127) | 128));
            byteBuffer4.put((byte) (j12 | 128));
            byteBuffer4.put((byte) (j13 | 128));
            byteBuffer4.put((byte) (j14 | 128));
            byteBuffer4.put((byte) (j15 | 128));
            byteBuffer4.put((byte) j16);
            return 6;
        }
        long j18 = j11 >>> 49;
        if (j18 == 0) {
            require(7);
            this.position += 7;
            ByteBuffer byteBuffer5 = this.byteBuffer;
            byteBuffer5.put((byte) ((j11 & 127) | 128));
            byteBuffer5.put((byte) (j12 | 128));
            byteBuffer5.put((byte) (j13 | 128));
            byteBuffer5.put((byte) (j14 | 128));
            byteBuffer5.put((byte) (j15 | 128));
            byteBuffer5.put((byte) (j16 | 128));
            byteBuffer5.put((byte) j17);
            return 7;
        }
        long j19 = j11 >>> 56;
        if (j19 == 0) {
            require(8);
            this.position += 8;
            ByteBuffer byteBuffer6 = this.byteBuffer;
            byteBuffer6.put((byte) ((j11 & 127) | 128));
            byteBuffer6.put((byte) (j12 | 128));
            byteBuffer6.put((byte) (j13 | 128));
            byteBuffer6.put((byte) (j14 | 128));
            byteBuffer6.put((byte) (j15 | 128));
            byteBuffer6.put((byte) (j16 | 128));
            byteBuffer6.put((byte) (j17 | 128));
            byteBuffer6.put((byte) j18);
            return 8;
        }
        require(9);
        this.position += 9;
        ByteBuffer byteBuffer7 = this.byteBuffer;
        byteBuffer7.put((byte) ((j11 & 127) | 128));
        byteBuffer7.put((byte) (j12 | 128));
        byteBuffer7.put((byte) (j13 | 128));
        byteBuffer7.put((byte) (j14 | 128));
        byteBuffer7.put((byte) (j15 | 128));
        byteBuffer7.put((byte) (j16 | 128));
        byteBuffer7.put((byte) (j17 | 128));
        byteBuffer7.put((byte) (j18 | 128));
        byteBuffer7.put((byte) j19);
        return 9;
    }

    public ByteBufferOutput(int i10) {
        this(i10, i10);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void setBuffer(byte[] bArr, int i10) {
        throw new UnsupportedOperationException("This buffer does not used a byte[], see #setByteBuffer(ByteBuffer).");
    }

    public ByteBufferOutput(int i10, int i11) {
        if (i11 >= -1) {
            this.capacity = i10;
            this.maxCapacity = i11 == -1 ? Util.maxArraySize : i11;
            this.byteBuffer = ByteBuffer.allocateDirect(i10);
            return;
        }
        throw new IllegalArgumentException(g0.c("maxBufferSize cannot be < -1: ", i11));
    }

    public void setBuffer(byte[] bArr, int i10, int i11) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr, i10, i11);
        setBufferPosition(byteBufferAllocateDirect, 0);
        setBufferLimit(byteBufferAllocateDirect, bArr.length);
        setBuffer(byteBufferAllocateDirect);
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int iMin = Math.min(this.capacity - this.position, i11);
            while (true) {
                this.byteBuffer.put(bArr, i10, iMin);
                this.position += iMin;
                i11 -= iMin;
                if (i11 == 0) {
                    return;
                }
                i10 += iMin;
                iMin = Math.min(this.capacity, i11);
                require(iMin);
            }
        } else {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    @Override // com.esotericsoftware.kryo.io.Output
    public void writeByte(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        this.byteBuffer.put((byte) i10);
        this.position++;
    }

    @Override // com.esotericsoftware.kryo.io.Output, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws KryoException {
        writeBytes(bArr, i10, i11);
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer, byteBuffer.capacity());
    }

    public void setBuffer(ByteBuffer byteBuffer, int i10) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("buffer cannot be null.");
        }
        if (i10 >= -1) {
            this.byteBuffer = byteBuffer;
            if (i10 == -1) {
                i10 = Util.maxArraySize;
            }
            this.maxCapacity = i10;
            this.capacity = byteBuffer.capacity();
            this.position = byteBuffer.position();
            this.total = 0L;
            this.outputStream = null;
            return;
        }
        throw new IllegalArgumentException(g0.c("maxBufferSize cannot be < -1: ", i10));
    }

    public ByteBufferOutput(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer);
    }

    public ByteBufferOutput(ByteBuffer byteBuffer, int i10) {
        setBuffer(byteBuffer, i10);
    }

    public ByteBufferOutput(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }

    public ByteBufferOutput(OutputStream outputStream, int i10) {
        this(i10, i10);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }
}
