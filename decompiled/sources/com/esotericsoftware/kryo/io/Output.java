package com.esotericsoftware.kryo.io;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.n1;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.Pool;
import com.esotericsoftware.kryo.util.Util;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class Output extends OutputStream implements AutoCloseable, Pool.Poolable {
    protected byte[] buffer;
    protected int capacity;
    protected int maxCapacity;
    protected OutputStream outputStream;
    protected int position;
    protected long total;
    protected boolean varEncoding;

    public Output() {
        this.varEncoding = true;
    }

    public static int varIntLength(int i10, boolean z10) {
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        if ((i10 >>> 7) == 0) {
            return 1;
        }
        if ((i10 >>> 14) == 0) {
            return 2;
        }
        if ((i10 >>> 21) == 0) {
            return 3;
        }
        return (i10 >>> 28) == 0 ? 4 : 5;
    }

    public static int varLongLength(long j10, boolean z10) {
        if (!z10) {
            j10 = (j10 >> 63) ^ (j10 << 1);
        }
        if ((j10 >>> 7) == 0) {
            return 1;
        }
        if ((j10 >>> 14) == 0) {
            return 2;
        }
        if ((j10 >>> 21) == 0) {
            return 3;
        }
        if ((j10 >>> 28) == 0) {
            return 4;
        }
        if ((j10 >>> 35) == 0) {
            return 5;
        }
        if ((j10 >>> 42) == 0) {
            return 6;
        }
        if ((j10 >>> 49) == 0) {
            return 7;
        }
        return (j10 >>> 56) == 0 ? 8 : 9;
    }

    private void writeAscii_slow(String str, int i10) throws KryoException {
        if (i10 == 0) {
            return;
        }
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int iMin = Math.min(i10, this.capacity - this.position);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + iMin;
            str.getBytes(i11, i12, bArr, this.position);
            this.position += iMin;
            iMin = Math.min(i10 - i12, this.capacity);
            if (require(iMin)) {
                bArr = this.buffer;
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
            char cCharAt = str.charAt(i11);
            if (cCharAt <= 127) {
                byte[] bArr = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                bArr[i14] = (byte) cCharAt;
            } else if (cCharAt > 2047) {
                byte[] bArr2 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                bArr2[i15] = (byte) (((cCharAt >> '\f') & 15) | 224);
                require(2);
                byte[] bArr3 = this.buffer;
                int i16 = this.position;
                bArr3[i16] = (byte) (((cCharAt >> 6) & 63) | 128);
                this.position = i16 + 2;
                bArr3[i16 + 1] = (byte) ((cCharAt & '?') | 128);
            } else {
                byte[] bArr4 = this.buffer;
                int i17 = this.position;
                int i18 = i17 + 1;
                this.position = i18;
                bArr4[i17] = (byte) (((cCharAt >> 6) & 31) | 192);
                if (i18 == this.capacity) {
                    require(1);
                }
                byte[] bArr5 = this.buffer;
                int i19 = this.position;
                this.position = i19 + 1;
                bArr5[i19] = (byte) ((cCharAt & '?') | 128);
            }
            i11++;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
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

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws KryoException {
        OutputStream outputStream = this.outputStream;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.write(this.buffer, 0, this.position);
            this.outputStream.flush();
            this.total += (long) this.position;
            this.position = 0;
        } catch (IOException e5) {
            throw new KryoException(e5);
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public OutputStream getOutputStream() {
        return this.outputStream;
    }

    public boolean getVariableLengthEncoding() {
        return this.varEncoding;
    }

    public int intLength(int i10, boolean z10) {
        if (this.varEncoding) {
            return varIntLength(i10, z10);
        }
        return 4;
    }

    public int longLength(int i10, boolean z10) {
        if (this.varEncoding) {
            return varLongLength(i10, z10);
        }
        return 8;
    }

    public int position() {
        return this.position;
    }

    public boolean require(int i10) throws KryoException {
        int iMin;
        int i11;
        if (this.capacity - this.position >= i10) {
            return false;
        }
        flush();
        int i12 = this.capacity;
        int i13 = this.position;
        if (i12 - i13 >= i10) {
            return true;
        }
        int i14 = this.maxCapacity;
        if (i10 <= i14 - i13) {
            if (i12 == 0) {
                this.capacity = 16;
            }
            do {
                iMin = Math.min(this.capacity * 2, this.maxCapacity);
                this.capacity = iMin;
                i11 = this.position;
            } while (iMin - i11 < i10);
            byte[] bArr = new byte[iMin];
            System.arraycopy(this.buffer, 0, bArr, 0, i11);
            this.buffer = bArr;
            return true;
        }
        if (i10 > i14) {
            throw new KryoException("Buffer overflow. Max capacity: " + this.maxCapacity + ", required: " + i10);
        }
        throw new KryoException("Buffer overflow. Available: " + (this.maxCapacity - this.position) + ", required: " + i10);
    }

    public void reset() {
        this.position = 0;
        this.total = 0L;
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, bArr.length);
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
        reset();
    }

    public void setPosition(int i10) {
        this.position = i10;
    }

    public void setVariableLengthEncoding(boolean z10) {
        this.varEncoding = z10;
    }

    public byte[] toBytes() {
        int i10 = this.position;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.buffer, 0, bArr, 0, i10);
        return bArr;
    }

    public long total() {
        return this.total + ((long) this.position);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        bArr[i11] = (byte) i10;
    }

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
        if (length == 1) {
            require(2);
            byte[] bArr = this.buffer;
            int i10 = this.position;
            bArr[i10] = -126;
            this.position = i10 + 2;
            bArr[i10 + 1] = (byte) str.charAt(0);
            return;
        }
        int i11 = this.capacity;
        int i12 = this.position;
        if (i11 - i12 < length) {
            writeAscii_slow(str, length);
        } else {
            str.getBytes(0, length, this.buffer, i12);
            this.position += length;
        }
        byte[] bArr2 = this.buffer;
        int i13 = this.position - 1;
        bArr2[i13] = (byte) (128 | bArr2[i13]);
    }

    public void writeBoolean(boolean z10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = z10 ? (byte) 1 : (byte) 0;
    }

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
        byte[] bArr = this.buffer;
        int i13 = this.position;
        int i14 = i11 + i10;
        while (i10 < i14) {
            bArr[i13] = zArr[i10] ? (byte) 1 : (byte) 0;
            i10++;
            i13++;
        }
        this.position = i13;
    }

    public void writeByte(byte b10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = b10;
    }

    public void writeBytes(byte[] bArr) throws KryoException {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        writeBytes(bArr, 0, bArr.length);
    }

    public void writeChar(char c10) throws KryoException {
        require(2);
        int i10 = this.position;
        this.position = i10 + 2;
        byte[] bArr = this.buffer;
        bArr[i10] = (byte) c10;
        bArr[i10 + 1] = (byte) (c10 >>> '\b');
    }

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
        byte[] bArr = this.buffer;
        int i14 = this.position;
        int i15 = i11 + i10;
        while (i10 < i15) {
            char c10 = cArr[i10];
            bArr[i14] = (byte) c10;
            bArr[i14 + 1] = (byte) (c10 >>> '\b');
            i10++;
            i14 += 2;
        }
        this.position = i14;
    }

    public void writeDouble(double d2) throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 8;
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        bArr[i10] = (byte) jDoubleToLongBits;
        bArr[i10 + 1] = (byte) (jDoubleToLongBits >>> 8);
        bArr[i10 + 2] = (byte) (jDoubleToLongBits >>> 16);
        bArr[i10 + 3] = (byte) (jDoubleToLongBits >>> 24);
        bArr[i10 + 4] = (byte) (jDoubleToLongBits >>> 32);
        bArr[i10 + 5] = (byte) (jDoubleToLongBits >>> 40);
        bArr[i10 + 6] = (byte) (jDoubleToLongBits >>> 48);
        bArr[i10 + 7] = (byte) (jDoubleToLongBits >>> 56);
    }

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
        byte[] bArr = this.buffer;
        int i14 = this.position;
        int i15 = i11 + i10;
        while (i10 < i15) {
            long jDoubleToLongBits = Double.doubleToLongBits(dArr[i10]);
            bArr[i14] = (byte) jDoubleToLongBits;
            bArr[i14 + 1] = (byte) (jDoubleToLongBits >>> 8);
            bArr[i14 + 2] = (byte) (jDoubleToLongBits >>> 16);
            bArr[i14 + 3] = (byte) (jDoubleToLongBits >>> 24);
            bArr[i14 + 4] = (byte) (jDoubleToLongBits >>> 32);
            bArr[i14 + 5] = (byte) (jDoubleToLongBits >>> 40);
            bArr[i14 + 6] = (byte) (jDoubleToLongBits >>> 48);
            bArr[i14 + 7] = (byte) (jDoubleToLongBits >>> 56);
            i10++;
            i14 += 8;
        }
        this.position = i14;
    }

    public void writeFloat(float f6) throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 4;
        int iFloatToIntBits = Float.floatToIntBits(f6);
        bArr[i10] = (byte) iFloatToIntBits;
        bArr[i10 + 1] = (byte) (iFloatToIntBits >> 8);
        bArr[i10 + 2] = (byte) (iFloatToIntBits >> 16);
        bArr[i10 + 3] = (byte) (iFloatToIntBits >> 24);
    }

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
        byte[] bArr = this.buffer;
        int i14 = this.position;
        int i15 = i11 + i10;
        while (i10 < i15) {
            int iFloatToIntBits = Float.floatToIntBits(fArr[i10]);
            bArr[i14] = (byte) iFloatToIntBits;
            bArr[i14 + 1] = (byte) (iFloatToIntBits >> 8);
            bArr[i14 + 2] = (byte) (iFloatToIntBits >> 16);
            bArr[i14 + 3] = (byte) (iFloatToIntBits >> 24);
            i10++;
            i14 += 4;
        }
        this.position = i14;
    }

    public void writeInt(int i10) throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i11 = this.position;
        this.position = i11 + 4;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
    }

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
        byte[] bArr = this.buffer;
        int i14 = this.position;
        int i15 = i11 + i10;
        while (i10 < i15) {
            int i16 = iArr[i10];
            bArr[i14] = (byte) i16;
            bArr[i14 + 1] = (byte) (i16 >> 8);
            bArr[i14 + 2] = (byte) (i16 >> 16);
            bArr[i14 + 3] = (byte) (i16 >> 24);
            i10++;
            i14 += 4;
        }
        this.position = i14;
    }

    public void writeLong(long j10) throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 8;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >>> 8);
        bArr[i10 + 2] = (byte) (j10 >>> 16);
        bArr[i10 + 3] = (byte) (j10 >>> 24);
        bArr[i10 + 4] = (byte) (j10 >>> 32);
        bArr[i10 + 5] = (byte) (j10 >>> 40);
        bArr[i10 + 6] = (byte) (j10 >>> 48);
        bArr[i10 + 7] = (byte) (j10 >>> 56);
    }

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
        byte[] bArr = this.buffer;
        int i14 = this.position;
        int i15 = i11 + i10;
        while (i10 < i15) {
            long j10 = jArr[i10];
            bArr[i14] = (byte) j10;
            bArr[i14 + 1] = (byte) (j10 >>> 8);
            bArr[i14 + 2] = (byte) (j10 >>> 16);
            bArr[i14 + 3] = (byte) (j10 >>> 24);
            bArr[i14 + 4] = (byte) (j10 >>> 32);
            bArr[i14 + 5] = (byte) (j10 >>> 40);
            bArr[i14 + 6] = (byte) (j10 >>> 48);
            bArr[i14 + 7] = (byte) (j10 >>> 56);
            i10++;
            i14 += 8;
        }
        this.position = i14;
    }

    public void writeShort(int i10) throws KryoException {
        require(2);
        int i11 = this.position;
        this.position = i11 + 2;
        byte[] bArr = this.buffer;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
    }

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
        byte[] bArr = this.buffer;
        int i14 = this.position;
        int i15 = i11 + i10;
        while (i10 < i15) {
            short s4 = sArr[i10];
            bArr[i14] = (byte) s4;
            bArr[i14 + 1] = (byte) (s4 >>> 8);
            i10++;
            i14 += 2;
        }
        this.position = i14;
    }

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
                    int i12 = this.capacity;
                    int i13 = this.position;
                    if (i12 - i13 < length) {
                        writeAscii_slow(str, length);
                    } else {
                        str.getBytes(0, length, this.buffer, i13);
                        this.position += length;
                    }
                    byte[] bArr = this.buffer;
                    int i14 = this.position - 1;
                    bArr[i14] = (byte) (128 | bArr[i14]);
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
        int i15 = this.capacity;
        int i16 = this.position;
        if (i15 - i16 >= length) {
            byte[] bArr2 = this.buffer;
            while (true) {
                char cCharAt = str.charAt(i10);
                if (cCharAt > 127) {
                    this.position = i16;
                    break;
                }
                int i17 = i16 + 1;
                bArr2[i16] = (byte) cCharAt;
                i10++;
                if (i10 == length) {
                    this.position = i17;
                    return;
                }
                i16 = i17;
            }
        }
        if (i10 < length) {
            writeUtf8_slow(str, length, i10);
        }
    }

    public int writeVarDouble(double d2, double d3, boolean z10) throws KryoException {
        return writeVarLong((long) (d2 * d3), z10);
    }

    public int writeVarFloat(float f6, float f10, boolean z10) throws KryoException {
        return writeVarInt((int) (f6 * f10), z10);
    }

    public int writeVarInt(int i10, boolean z10) throws KryoException {
        if (!z10) {
            i10 = (i10 >> 31) ^ (i10 << 1);
        }
        int i11 = i10 >>> 7;
        if (i11 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            byte[] bArr = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr[i12] = (byte) i10;
            return 1;
        }
        int i13 = i10 >>> 14;
        if (i13 == 0) {
            require(2);
            int i14 = this.position;
            this.position = i14 + 2;
            byte[] bArr2 = this.buffer;
            bArr2[i14] = (byte) ((i10 & 127) | 128);
            bArr2[i14 + 1] = (byte) i11;
            return 2;
        }
        int i15 = i10 >>> 21;
        if (i15 == 0) {
            require(3);
            int i16 = this.position;
            this.position = i16 + 3;
            byte[] bArr3 = this.buffer;
            bArr3[i16] = (byte) ((i10 & 127) | 128);
            bArr3[i16 + 1] = (byte) (i11 | 128);
            bArr3[i16 + 2] = (byte) i13;
            return 3;
        }
        int i17 = i10 >>> 28;
        if (i17 == 0) {
            require(4);
            int i18 = this.position;
            this.position = i18 + 4;
            byte[] bArr4 = this.buffer;
            bArr4[i18] = (byte) ((i10 & 127) | 128);
            bArr4[i18 + 1] = (byte) (i11 | 128);
            bArr4[i18 + 2] = (byte) (i13 | 128);
            bArr4[i18 + 3] = (byte) i15;
            return 4;
        }
        require(5);
        int i19 = this.position;
        this.position = i19 + 5;
        byte[] bArr5 = this.buffer;
        bArr5[i19] = (byte) ((i10 & 127) | 128);
        bArr5[i19 + 1] = (byte) (i11 | 128);
        bArr5[i19 + 2] = (byte) (i13 | 128);
        bArr5[i19 + 3] = (byte) (i15 | 128);
        bArr5[i19 + 4] = (byte) i17;
        return 5;
    }

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
            byte[] bArr = this.buffer;
            int i13 = this.position;
            this.position = i13 + 1;
            bArr[i13] = (byte) i11;
            return 1;
        }
        int i14 = i10 >>> 13;
        if (i14 == 0) {
            require(2);
            int i15 = this.position;
            this.position = i15 + 2;
            byte[] bArr2 = this.buffer;
            bArr2[i15] = (byte) (i11 | 64);
            bArr2[i15 + 1] = (byte) i12;
            return 2;
        }
        int i16 = i10 >>> 20;
        if (i16 == 0) {
            require(3);
            byte[] bArr3 = this.buffer;
            int i17 = this.position;
            this.position = i17 + 3;
            bArr3[i17] = (byte) (i11 | 64);
            bArr3[i17 + 1] = (byte) (i12 | 128);
            bArr3[i17 + 2] = (byte) i14;
            return 3;
        }
        int i18 = i10 >>> 27;
        if (i18 == 0) {
            require(4);
            byte[] bArr4 = this.buffer;
            int i19 = this.position;
            this.position = i19 + 4;
            bArr4[i19] = (byte) (i11 | 64);
            bArr4[i19 + 1] = (byte) (i12 | 128);
            bArr4[i19 + 2] = (byte) (i14 | 128);
            bArr4[i19 + 3] = (byte) i16;
            return 4;
        }
        require(5);
        byte[] bArr5 = this.buffer;
        int i20 = this.position;
        this.position = i20 + 5;
        bArr5[i20] = (byte) (i11 | 64);
        bArr5[i20 + 1] = (byte) (i12 | 128);
        bArr5[i20 + 2] = (byte) (i14 | 128);
        bArr5[i20 + 3] = (byte) (i16 | 128);
        bArr5[i20 + 4] = (byte) i18;
        return 5;
    }

    public int writeVarLong(long j10, boolean z10) throws KryoException {
        long j11 = !z10 ? (j10 << 1) ^ (j10 >> 63) : j10;
        long j12 = j11 >>> 7;
        if (j12 == 0) {
            if (this.position == this.capacity) {
                require(1);
            }
            byte[] bArr = this.buffer;
            int i10 = this.position;
            this.position = i10 + 1;
            bArr[i10] = (byte) j11;
            return 1;
        }
        long j13 = j11 >>> 14;
        if (j13 == 0) {
            require(2);
            int i11 = this.position;
            this.position = i11 + 2;
            byte[] bArr2 = this.buffer;
            bArr2[i11] = (byte) ((j11 & 127) | 128);
            bArr2[i11 + 1] = (byte) j12;
            return 2;
        }
        long j14 = j11 >>> 21;
        if (j14 == 0) {
            require(3);
            int i12 = this.position;
            this.position = i12 + 3;
            byte[] bArr3 = this.buffer;
            bArr3[i12] = (byte) ((j11 & 127) | 128);
            bArr3[i12 + 1] = (byte) (j12 | 128);
            bArr3[i12 + 2] = (byte) j13;
            return 3;
        }
        long j15 = j11 >>> 28;
        if (j15 == 0) {
            require(4);
            int i13 = this.position;
            this.position = i13 + 4;
            byte[] bArr4 = this.buffer;
            bArr4[i13] = (byte) ((j11 & 127) | 128);
            bArr4[i13 + 1] = (byte) (j12 | 128);
            bArr4[i13 + 2] = (byte) (j13 | 128);
            bArr4[i13 + 3] = (byte) j14;
            return 4;
        }
        long j16 = j11 >>> 35;
        if (j16 == 0) {
            require(5);
            int i14 = this.position;
            this.position = i14 + 5;
            byte[] bArr5 = this.buffer;
            bArr5[i14] = (byte) ((j11 & 127) | 128);
            bArr5[i14 + 1] = (byte) (j12 | 128);
            bArr5[i14 + 2] = (byte) (j13 | 128);
            bArr5[i14 + 3] = (byte) (j14 | 128);
            bArr5[i14 + 4] = (byte) j15;
            return 5;
        }
        long j17 = j11 >>> 42;
        if (j17 == 0) {
            require(6);
            int i15 = this.position;
            this.position = i15 + 6;
            byte[] bArr6 = this.buffer;
            bArr6[i15] = (byte) ((j11 & 127) | 128);
            bArr6[i15 + 1] = (byte) (j12 | 128);
            bArr6[i15 + 2] = (byte) (j13 | 128);
            bArr6[i15 + 3] = (byte) (j14 | 128);
            bArr6[i15 + 4] = (byte) (j15 | 128);
            bArr6[i15 + 5] = (byte) j16;
            return 6;
        }
        long j18 = j11 >>> 49;
        if (j18 == 0) {
            require(7);
            int i16 = this.position;
            this.position = i16 + 7;
            byte[] bArr7 = this.buffer;
            bArr7[i16] = (byte) ((j11 & 127) | 128);
            bArr7[i16 + 1] = (byte) (j12 | 128);
            bArr7[i16 + 2] = (byte) (j13 | 128);
            bArr7[i16 + 3] = (byte) (j14 | 128);
            bArr7[i16 + 4] = (byte) (j15 | 128);
            bArr7[i16 + 5] = (byte) (j16 | 128);
            bArr7[i16 + 6] = (byte) j17;
            return 7;
        }
        long j19 = j11 >>> 56;
        if (j19 == 0) {
            require(8);
            int i17 = this.position;
            this.position = i17 + 8;
            byte[] bArr8 = this.buffer;
            bArr8[i17] = (byte) ((j11 & 127) | 128);
            bArr8[i17 + 1] = (byte) (j12 | 128);
            bArr8[i17 + 2] = (byte) (j13 | 128);
            bArr8[i17 + 3] = (byte) (j14 | 128);
            bArr8[i17 + 4] = (byte) (j15 | 128);
            bArr8[i17 + 5] = (byte) (j16 | 128);
            bArr8[i17 + 6] = (byte) (j17 | 128);
            bArr8[i17 + 7] = (byte) j18;
            return 8;
        }
        require(9);
        int i18 = this.position;
        this.position = i18 + 9;
        byte[] bArr9 = this.buffer;
        bArr9[i18] = (byte) ((j11 & 127) | 128);
        bArr9[i18 + 1] = (byte) (j12 | 128);
        bArr9[i18 + 2] = (byte) (j13 | 128);
        bArr9[i18 + 3] = (byte) (j14 | 128);
        bArr9[i18 + 4] = (byte) (j15 | 128);
        bArr9[i18 + 5] = (byte) (j16 | 128);
        bArr9[i18 + 6] = (byte) (j17 | 128);
        bArr9[i18 + 7] = (byte) (j18 | 128);
        bArr9[i18 + 8] = (byte) j19;
        return 9;
    }

    public void setBuffer(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new IllegalArgumentException("buffer cannot be null.");
        }
        if (bArr.length > i10 && i10 != -1) {
            throw new IllegalArgumentException("buffer has length: " + bArr.length + " cannot be greater than maxBufferSize: " + i10);
        }
        if (i10 < -1) {
            throw new IllegalArgumentException(g0.c("maxBufferSize cannot be < -1: ", i10));
        }
        this.buffer = bArr;
        if (i10 == -1) {
            i10 = Util.maxArraySize;
        }
        this.maxCapacity = i10;
        this.capacity = bArr.length;
        this.position = 0;
        this.total = 0L;
        this.outputStream = null;
    }

    public Output(int i10) {
        this(i10, i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws KryoException {
        if (bArr != null) {
            writeBytes(bArr, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    public void writeByte(int i10) throws KryoException {
        if (this.position == this.capacity) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i11 = this.position;
        this.position = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void writeBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int iMin = Math.min(this.capacity - this.position, i11);
            while (true) {
                System.arraycopy(bArr, i10, this.buffer, this.position, iMin);
                this.position += iMin;
                i11 -= iMin;
                if (i11 == 0) {
                    return;
                }
                i10 += iMin;
                iMin = Math.min(Math.max(this.capacity, 1), i11);
                require(iMin);
            }
        } else {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
    }

    public Output(int i10, int i11) {
        this.varEncoding = true;
        if (i10 > i11 && i11 != -1) {
            throw new IllegalArgumentException(n1.e("bufferSize: ", i10, " cannot be greater than maxBufferSize: ", i11));
        }
        if (i11 >= -1) {
            this.capacity = i10;
            this.maxCapacity = i11 == -1 ? Util.maxArraySize : i11;
            this.buffer = new byte[i10];
            return;
        }
        throw new IllegalArgumentException(g0.c("maxBufferSize cannot be < -1: ", i11));
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws KryoException {
        writeBytes(bArr, i10, i11);
    }

    public int writeInt(int i10, boolean z10) throws KryoException {
        if (this.varEncoding) {
            return writeVarInt(i10, z10);
        }
        writeInt(i10);
        return 4;
    }

    public void writeInts(int[] iArr, int i10, int i11, boolean z10) throws KryoException {
        if (!this.varEncoding) {
            writeInts(iArr, i10, i11);
            return;
        }
        int i12 = i11 + i10;
        while (i10 < i12) {
            writeVarInt(iArr[i10], z10);
            i10++;
        }
    }

    public int writeLong(long j10, boolean z10) throws KryoException {
        if (this.varEncoding) {
            return writeVarLong(j10, z10);
        }
        writeLong(j10);
        return 8;
    }

    public void writeLongs(long[] jArr, int i10, int i11, boolean z10) throws KryoException {
        if (!this.varEncoding) {
            writeLongs(jArr, i10, i11);
            return;
        }
        int i12 = i11 + i10;
        while (i10 < i12) {
            writeVarLong(jArr[i10], z10);
            i10++;
        }
    }

    public Output(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public Output(byte[] bArr, int i10) {
        this.varEncoding = true;
        if (bArr != null) {
            setBuffer(bArr, i10);
            return;
        }
        throw new IllegalArgumentException("buffer cannot be null.");
    }

    public Output(OutputStream outputStream) {
        this(4096, 4096);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }

    public Output(OutputStream outputStream, int i10) {
        this(i10, i10);
        if (outputStream != null) {
            this.outputStream = outputStream;
            return;
        }
        throw new IllegalArgumentException("outputStream cannot be null.");
    }
}
