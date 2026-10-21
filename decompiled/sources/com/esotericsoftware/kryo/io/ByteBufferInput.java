package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferInput extends Input {
    private static final ByteOrder nativeOrder = ByteOrder.nativeOrder();
    protected ByteBuffer byteBuffer;
    private byte[] tempBuffer;

    public ByteBufferInput() {
    }

    private void flipBuffer(Buffer buffer) {
        buffer.flip();
    }

    private int getBufferPosition(Buffer buffer) {
        return buffer.position();
    }

    private String readAsciiString() {
        char[] cArr = this.chars;
        ByteBuffer byteBuffer = this.byteBuffer;
        int iMin = Math.min(cArr.length, this.limit - this.position);
        int i10 = 0;
        while (i10 < iMin) {
            byte b10 = byteBuffer.get();
            if ((b10 & 128) == 128) {
                this.position = getBufferPosition(byteBuffer);
                cArr[i10] = (char) (b10 & 127);
                return new String(cArr, 0, i10 + 1);
            }
            cArr[i10] = (char) b10;
            i10++;
        }
        this.position = getBufferPosition(byteBuffer);
        return readAscii_slow(i10);
    }

    private String readAscii_slow(int i10) {
        char[] cArr = this.chars;
        ByteBuffer byteBuffer = this.byteBuffer;
        while (true) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            byte b10 = byteBuffer.get();
            if (i10 == cArr.length) {
                char[] cArr2 = new char[i10 * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i10);
                this.chars = cArr2;
                cArr = cArr2;
            }
            if ((b10 & 128) == 128) {
                cArr[i10] = (char) (b10 & 127);
                return new String(cArr, 0, i10 + 1);
            }
            cArr[i10] = (char) b10;
            i10++;
        }
    }

    private void readUtf8Chars(int i10) {
        if (this.chars.length < i10) {
            this.chars = new char[i10];
        }
        char[] cArr = this.chars;
        ByteBuffer byteBuffer = this.byteBuffer;
        int iMin = Math.min(require(1), i10);
        int i11 = 0;
        while (i11 < iMin) {
            byte b10 = byteBuffer.get();
            if (b10 < 0) {
                break;
            }
            cArr[i11] = (char) b10;
            i11++;
        }
        int i12 = this.position + i11;
        this.position = i12;
        if (i11 < i10) {
            setBufferPosition(byteBuffer, i12);
            readUtf8Chars_slow(i10, i11);
        }
    }

    private void readUtf8Chars_slow(int i10, int i11) {
        ByteBuffer byteBuffer = this.byteBuffer;
        char[] cArr = this.chars;
        while (i11 < i10) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            byte b10 = byteBuffer.get();
            int i12 = b10 & 255;
            switch (i12 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i11] = (char) i12;
                    break;
                case 12:
                case 13:
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    cArr[i11] = (char) (((b10 & 31) << 6) | (byteBuffer.get() & 63));
                    break;
                case 14:
                    require(2);
                    this.position += 2;
                    cArr[i11] = (char) (((b10 & 15) << 12) | ((byteBuffer.get() & 63) << 6) | (byteBuffer.get() & 63));
                    break;
            }
            i11++;
        }
    }

    private int readVarIntFlag_slow(boolean z10) {
        this.position++;
        byte b10 = this.byteBuffer.get();
        int i10 = b10 & 63;
        if ((b10 & 64) != 0) {
            if (this.position == this.limit) {
                require(1);
            }
            this.position++;
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b11 = byteBuffer.get();
            i10 |= (b11 & 127) << 6;
            if ((b11 & 128) != 0) {
                if (this.position == this.limit) {
                    require(1);
                }
                this.position++;
                byte b12 = byteBuffer.get();
                i10 |= (b12 & 127) << 13;
                if ((b12 & 128) != 0) {
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    byte b13 = byteBuffer.get();
                    i10 |= (b13 & 127) << 20;
                    if ((b13 & 128) != 0) {
                        if (this.position == this.limit) {
                            require(1);
                        }
                        this.position++;
                        i10 |= (byteBuffer.get() & 127) << 27;
                    }
                }
            }
        }
        return z10 ? i10 : (i10 >>> 1) ^ (-(i10 & 1));
    }

    private int readVarInt_slow(boolean z10) {
        this.position++;
        byte b10 = this.byteBuffer.get();
        int i10 = b10 & 127;
        if ((b10 & 128) != 0) {
            if (this.position == this.limit) {
                require(1);
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            this.position++;
            byte b11 = byteBuffer.get();
            i10 |= (b11 & 127) << 7;
            if ((b11 & 128) != 0) {
                if (this.position == this.limit) {
                    require(1);
                }
                this.position++;
                byte b12 = byteBuffer.get();
                i10 |= (b12 & 127) << 14;
                if ((b12 & 128) != 0) {
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    byte b13 = byteBuffer.get();
                    i10 |= (b13 & 127) << 21;
                    if ((b13 & 128) != 0) {
                        if (this.position == this.limit) {
                            require(1);
                        }
                        this.position++;
                        i10 |= (byteBuffer.get() & 127) << 28;
                    }
                }
            }
        }
        return z10 ? i10 : (i10 >>> 1) ^ (-(i10 & 1));
    }

    private long readVarLong_slow(boolean z10) {
        this.position++;
        byte b10 = this.byteBuffer.get();
        long j10 = b10 & 127;
        if ((b10 & 128) != 0) {
            if (this.position == this.limit) {
                require(1);
            }
            ByteBuffer byteBuffer = this.byteBuffer;
            this.position++;
            byte b11 = byteBuffer.get();
            j10 |= (long) ((b11 & 127) << 7);
            if ((b11 & 128) != 0) {
                if (this.position == this.limit) {
                    require(1);
                }
                this.position++;
                byte b12 = byteBuffer.get();
                j10 |= (long) ((b12 & 127) << 14);
                if ((b12 & 128) != 0) {
                    if (this.position == this.limit) {
                        require(1);
                    }
                    this.position++;
                    byte b13 = byteBuffer.get();
                    j10 |= (long) ((b13 & 127) << 21);
                    if ((b13 & 128) != 0) {
                        if (this.position == this.limit) {
                            require(1);
                        }
                        this.position++;
                        byte b14 = byteBuffer.get();
                        j10 |= ((long) (b14 & 127)) << 28;
                        if ((b14 & 128) != 0) {
                            if (this.position == this.limit) {
                                require(1);
                            }
                            this.position++;
                            byte b15 = byteBuffer.get();
                            j10 |= ((long) (b15 & 127)) << 35;
                            if ((b15 & 128) != 0) {
                                if (this.position == this.limit) {
                                    require(1);
                                }
                                this.position++;
                                byte b16 = byteBuffer.get();
                                j10 |= ((long) (b16 & 127)) << 42;
                                if ((b16 & 128) != 0) {
                                    if (this.position == this.limit) {
                                        require(1);
                                    }
                                    this.position++;
                                    byte b17 = byteBuffer.get();
                                    j10 |= ((long) (b17 & 127)) << 49;
                                    if ((b17 & 128) != 0) {
                                        if (this.position == this.limit) {
                                            require(1);
                                        }
                                        this.position++;
                                        j10 |= ((long) byteBuffer.get()) << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z10) {
            return j10;
        }
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void setBufferLimit(Buffer buffer, int i10) {
        buffer.limit(i10);
    }

    private void setBufferPosition(Buffer buffer, int i10) {
        buffer.position(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean canReadVarInt() throws KryoException {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        int i11 = this.limit;
        ByteBuffer byteBuffer = this.byteBuffer;
        int i12 = i10 + 1;
        if ((byteBuffer.get(i10) & 128) == 0) {
            return true;
        }
        if (i12 == i11) {
            return false;
        }
        int i13 = i10 + 2;
        if ((byteBuffer.get(i12) & 128) == 0) {
            return true;
        }
        if (i13 == i11) {
            return false;
        }
        int i14 = i10 + 3;
        if ((byteBuffer.get(i13) & 128) == 0) {
            return true;
        }
        if (i14 == i11) {
            return false;
        }
        return (byteBuffer.get(i14) & 128) == 0 || i10 + 4 != i11;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean canReadVarLong() throws KryoException {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        int i11 = this.limit;
        ByteBuffer byteBuffer = this.byteBuffer;
        int i12 = i10 + 1;
        if ((byteBuffer.get(i10) & 128) == 0) {
            return true;
        }
        if (i12 == i11) {
            return false;
        }
        int i13 = i10 + 2;
        if ((byteBuffer.get(i12) & 128) == 0) {
            return true;
        }
        if (i13 == i11) {
            return false;
        }
        int i14 = i10 + 3;
        if ((byteBuffer.get(i13) & 128) == 0) {
            return true;
        }
        if (i14 == i11) {
            return false;
        }
        int i15 = i10 + 4;
        if ((byteBuffer.get(i14) & 128) == 0) {
            return true;
        }
        if (i15 == i11) {
            return false;
        }
        int i16 = i10 + 5;
        if ((byteBuffer.get(i15) & 128) == 0) {
            return true;
        }
        if (i16 == i11) {
            return false;
        }
        int i17 = i10 + 6;
        if ((byteBuffer.get(i16) & 128) == 0) {
            return true;
        }
        if (i17 == i11) {
            return false;
        }
        int i18 = i10 + 7;
        if ((byteBuffer.get(i17) & 128) == 0) {
            return true;
        }
        if (i18 == i11) {
            return false;
        }
        return (byteBuffer.get(i18) & 128) == 0 || i10 + 8 != i11;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public int fill(ByteBuffer byteBuffer, int i10, int i11) throws KryoException {
        if (this.inputStream == null) {
            return -1;
        }
        try {
            if (this.tempBuffer == null) {
                this.tempBuffer = new byte[2048];
            }
            setBufferPosition(byteBuffer, i10);
            int i12 = 0;
            while (i11 > 0) {
                InputStream inputStream = this.inputStream;
                byte[] bArr = this.tempBuffer;
                int i13 = inputStream.read(bArr, 0, Math.min(bArr.length, i11));
                if (i13 != -1) {
                    byteBuffer.put(this.tempBuffer, 0, i13);
                    i11 -= i13;
                    i12 += i13;
                } else if (i12 == 0) {
                    return -1;
                }
            }
            return i12;
        } catch (IOException e5) {
            throw new KryoException(e5);
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte[] getBuffer() {
        throw new UnsupportedOperationException("This input does not used a byte[], see #getByteBuffer().");
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int optional(int i10) throws KryoException {
        int i11 = this.limit - this.position;
        if (i11 >= i10) {
            return i10;
        }
        int iMin = Math.min(i10, this.capacity);
        ByteBuffer byteBuffer = this.byteBuffer;
        int i12 = this.limit;
        int iFill = fill(byteBuffer, i12, this.capacity - i12);
        setBufferPosition(this.byteBuffer, this.position);
        if (iFill == -1) {
            if (i11 == 0) {
                return -1;
            }
            return Math.min(i11, iMin);
        }
        int i13 = i11 + iFill;
        if (i13 >= iMin) {
            this.limit += iFill;
            return iMin;
        }
        this.byteBuffer.compact();
        this.total += (long) this.position;
        this.position = 0;
        do {
            int iFill2 = fill(this.byteBuffer, i13, this.capacity - i13);
            if (iFill2 == -1) {
                break;
            }
            i13 += iFill2;
        } while (i13 < iMin);
        this.limit = i13;
        setBufferPosition(this.byteBuffer, 0);
        if (i13 == 0) {
            return -1;
        }
        return Math.min(i13, iMin);
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        this.position++;
        return this.byteBuffer.get() & 255;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean readBoolean() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        this.position++;
        return this.byteBuffer.get() == 1;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean[] readBooleans(int i10) throws KryoException {
        boolean[] zArr = new boolean[i10];
        if (optional(i10) == i10) {
            ByteBuffer byteBuffer = this.byteBuffer;
            for (int i11 = 0; i11 < i10; i11++) {
                zArr[i11] = byteBuffer.get() != 0;
            }
            this.position = getBufferPosition(byteBuffer);
        } else {
            for (int i12 = 0; i12 < i10; i12++) {
                zArr[i12] = readBoolean();
            }
        }
        return zArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte readByte() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        this.position++;
        return this.byteBuffer.get();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readByteUnsigned() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        this.position++;
        return this.byteBuffer.get() & 255;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public byte[] readBytes(int i10) throws KryoException {
        byte[] bArr = new byte[i10];
        readBytes(bArr, 0, i10);
        return bArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char readChar() throws KryoException {
        require(2);
        this.position += 2;
        return (char) ((this.byteBuffer.get() & 255) | ((this.byteBuffer.get() & 255) << 8));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public char[] readChars(int i10) throws KryoException {
        char[] cArr = new char[i10];
        int i11 = i10 << 1;
        int i12 = 0;
        if (optional(i11) == i11) {
            ByteBuffer byteBuffer = this.byteBuffer;
            while (i12 < i10) {
                cArr[i12] = (char) ((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8));
                i12++;
            }
            this.position = getBufferPosition(byteBuffer);
        } else {
            while (i12 < i10) {
                cArr[i12] = readChar();
                i12++;
            }
        }
        return cArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double readDouble() throws KryoException {
        require(8);
        ByteBuffer byteBuffer = this.byteBuffer;
        this.position += 8;
        return Double.longBitsToDouble((((long) byteBuffer.get()) << 56) | ((long) (((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 16))) | (((long) (byteBuffer.get() & 255)) << 24) | (((long) (byteBuffer.get() & 255)) << 32) | (((long) (byteBuffer.get() & 255)) << 40) | (((long) (byteBuffer.get() & 255)) << 48));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public double[] readDoubles(int i10) throws KryoException {
        double[] dArr = new double[i10];
        int i11 = i10 << 3;
        int i12 = 0;
        if (optional(i11) == i11) {
            ByteBuffer byteBuffer = this.byteBuffer;
            while (i12 < i10) {
                dArr[i12] = Double.longBitsToDouble(((long) ((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16))) | (((long) (byteBuffer.get() & 255)) << 24) | (((long) (byteBuffer.get() & 255)) << 32) | (((long) (byteBuffer.get() & 255)) << 40) | (((long) (byteBuffer.get() & 255)) << 48) | (((long) byteBuffer.get()) << 56));
                i12++;
            }
            this.position = getBufferPosition(byteBuffer);
        } else {
            while (i12 < i10) {
                dArr[i12] = readDouble();
                i12++;
            }
        }
        return dArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float readFloat() throws KryoException {
        require(4);
        ByteBuffer byteBuffer = this.byteBuffer;
        this.position += 4;
        return Float.intBitsToFloat((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public float[] readFloats(int i10) throws KryoException {
        float[] fArr = new float[i10];
        int i11 = i10 << 2;
        int i12 = 0;
        if (optional(i11) == i11) {
            ByteBuffer byteBuffer = this.byteBuffer;
            while (i12 < i10) {
                fArr[i12] = Float.intBitsToFloat((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24));
                i12++;
            }
            this.position = getBufferPosition(byteBuffer);
        } else {
            while (i12 < i10) {
                fArr[i12] = readFloat();
                i12++;
            }
        }
        return fArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readInt() throws KryoException {
        require(4);
        this.position += 4;
        ByteBuffer byteBuffer = this.byteBuffer;
        return ((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int[] readInts(int i10) throws KryoException {
        int[] iArr = new int[i10];
        int i11 = i10 << 2;
        int i12 = 0;
        if (optional(i11) == i11) {
            ByteBuffer byteBuffer = this.byteBuffer;
            while (i12 < i10) {
                iArr[i12] = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
                i12++;
            }
            this.position = getBufferPosition(byteBuffer);
        } else {
            while (i12 < i10) {
                iArr[i12] = readInt();
                i12++;
            }
        }
        return iArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readLong() throws KryoException {
        require(8);
        this.position += 8;
        ByteBuffer byteBuffer = this.byteBuffer;
        return (((long) byteBuffer.get()) << 56) | ((long) (((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 16))) | (((long) (byteBuffer.get() & 255)) << 24) | (((long) (byteBuffer.get() & 255)) << 32) | (((long) (byteBuffer.get() & 255)) << 40) | (((long) (byteBuffer.get() & 255)) << 48);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long[] readLongs(int i10) throws KryoException {
        long[] jArr = new long[i10];
        int i11 = i10 << 3;
        int i12 = 0;
        if (optional(i11) == i11) {
            ByteBuffer byteBuffer = this.byteBuffer;
            while (i12 < i10) {
                jArr[i12] = ((long) ((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16))) | (((long) (byteBuffer.get() & 255)) << 24) | (((long) (byteBuffer.get() & 255)) << 32) | (((long) (byteBuffer.get() & 255)) << 40) | (((long) (byteBuffer.get() & 255)) << 48) | (((long) byteBuffer.get()) << 56);
                i12++;
            }
            this.position = getBufferPosition(byteBuffer);
        } else {
            while (i12 < i10) {
                jArr[i12] = readLong();
                i12++;
            }
        }
        return jArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short readShort() throws KryoException {
        require(2);
        this.position += 2;
        return (short) ((this.byteBuffer.get() & 255) | ((this.byteBuffer.get() & 255) << 8));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readShortUnsigned() throws KryoException {
        require(2);
        this.position += 2;
        return (this.byteBuffer.get() & 255) | ((this.byteBuffer.get() & 255) << 8);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public short[] readShorts(int i10) throws KryoException {
        short[] sArr = new short[i10];
        int i11 = i10 << 1;
        int i12 = 0;
        if (optional(i11) == i11) {
            ByteBuffer byteBuffer = this.byteBuffer;
            while (i12 < i10) {
                sArr[i12] = (short) ((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8));
                i12++;
            }
            this.position = getBufferPosition(byteBuffer);
        } else {
            while (i12 < i10) {
                sArr[i12] = readShort();
                i12++;
            }
        }
        return sArr;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public String readString() {
        if (!readVarIntFlag()) {
            return readAsciiString();
        }
        int varIntFlag = readVarIntFlag(true);
        if (varIntFlag == 0) {
            return null;
        }
        if (varIntFlag == 1) {
            return "";
        }
        int i10 = varIntFlag - 1;
        readUtf8Chars(i10);
        return new String(this.chars, 0, i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public StringBuilder readStringBuilder() {
        if (!readVarIntFlag()) {
            return new StringBuilder(readAsciiString());
        }
        int varIntFlag = readVarIntFlag(true);
        if (varIntFlag == 0) {
            return null;
        }
        if (varIntFlag == 1) {
            return new StringBuilder("");
        }
        int i10 = varIntFlag - 1;
        readUtf8Chars(i10);
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(this.chars, 0, i10);
        return sb2;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readVarInt(boolean z10) throws KryoException {
        if (require(1) < 5) {
            return readVarInt_slow(z10);
        }
        byte b10 = this.byteBuffer.get();
        int i10 = b10 & 127;
        if ((b10 & 128) != 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b11 = byteBuffer.get();
            i10 |= (b11 & 127) << 7;
            if ((b11 & 128) != 0) {
                byte b12 = byteBuffer.get();
                i10 |= (b12 & 127) << 14;
                if ((b12 & 128) != 0) {
                    byte b13 = byteBuffer.get();
                    i10 |= (b13 & 127) << 21;
                    if ((b13 & 128) != 0) {
                        i10 |= (byteBuffer.get() & 127) << 28;
                    }
                }
            }
        }
        this.position = getBufferPosition(this.byteBuffer);
        return z10 ? i10 : (i10 >>> 1) ^ (-(i10 & 1));
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public boolean readVarIntFlag() {
        if (this.position == this.limit) {
            require(1);
        }
        return (this.byteBuffer.get(this.position) & 128) != 0;
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public long readVarLong(boolean z10) throws KryoException {
        if (require(1) < 9) {
            return readVarLong_slow(z10);
        }
        byte b10 = this.byteBuffer.get();
        long j10 = b10 & 127;
        if ((b10 & 128) != 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b11 = byteBuffer.get();
            j10 |= (long) ((b11 & 127) << 7);
            if ((b11 & 128) != 0) {
                byte b12 = byteBuffer.get();
                j10 |= (long) ((b12 & 127) << 14);
                if ((b12 & 128) != 0) {
                    byte b13 = byteBuffer.get();
                    j10 |= (long) ((b13 & 127) << 21);
                    if ((b13 & 128) != 0) {
                        byte b14 = byteBuffer.get();
                        j10 |= ((long) (b14 & 127)) << 28;
                        if ((b14 & 128) != 0) {
                            byte b15 = byteBuffer.get();
                            j10 |= ((long) (b15 & 127)) << 35;
                            if ((b15 & 128) != 0) {
                                byte b16 = byteBuffer.get();
                                j10 |= ((long) (b16 & 127)) << 42;
                                if ((b16 & 128) != 0) {
                                    byte b17 = byteBuffer.get();
                                    j10 |= ((long) (b17 & 127)) << 49;
                                    if ((b17 & 128) != 0) {
                                        j10 |= ((long) byteBuffer.get()) << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.position = getBufferPosition(this.byteBuffer);
        if (z10) {
            return j10;
        }
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int require(int i10) throws KryoException {
        int i11 = this.limit;
        int i12 = i11 - this.position;
        if (i12 >= i10) {
            return i12;
        }
        int i13 = this.capacity;
        if (i10 > i13) {
            throw new KryoException("Buffer too small: capacity: " + this.capacity + ", required: " + i10);
        }
        if (i12 > 0) {
            int iFill = fill(this.byteBuffer, i11, i13 - i11);
            if (iFill == -1) {
                throw new KryoException("Buffer underflow.");
            }
            setBufferPosition(this.byteBuffer, this.position);
            i12 += iFill;
            if (i12 >= i10) {
                this.limit += iFill;
                return i12;
            }
        }
        this.byteBuffer.compact();
        this.total += (long) this.position;
        this.position = 0;
        do {
            int iFill2 = fill(this.byteBuffer, i12, this.capacity - i12);
            if (iFill2 == -1) {
                if (i12 >= i10) {
                    break;
                }
                throw new KryoException("Buffer underflow.");
            }
            i12 += iFill2;
        } while (i12 < i10);
        this.limit = i12;
        setBufferPosition(this.byteBuffer, 0);
        return i12;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        super.reset();
        setBufferPosition(this.byteBuffer, 0);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setBuffer(byte[] bArr) {
        throw new UnsupportedOperationException("This input does not used a byte[], see #setByteBuffer(ByteBuffer).");
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        reset();
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setLimit(int i10) {
        this.limit = i10;
        setBufferLimit(this.byteBuffer, i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setPosition(int i10) {
        this.position = i10;
        setBufferPosition(this.byteBuffer, i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void skip(int i10) throws KryoException {
        super.skip(i10);
        setBufferPosition(this.byteBuffer, this.position);
    }

    public ByteBufferInput(int i10) {
        this.capacity = i10;
        this.byteBuffer = ByteBuffer.allocateDirect(i10);
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void setBuffer(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException("This input does not used a byte[], see #setByteBufferByteBuffer().");
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public void readBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int iMin = Math.min(this.limit - this.position, i11);
            while (true) {
                this.byteBuffer.get(bArr, i10, iMin);
                this.position += iMin;
                i11 -= iMin;
                if (i11 == 0) {
                    return;
                }
                i10 += iMin;
                iMin = Math.min(i11, this.capacity);
                require(iMin);
            }
        } else {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
    }

    @Override // com.esotericsoftware.kryo.io.Input
    public int readVarIntFlag(boolean z10) {
        if (require(1) < 5) {
            return readVarIntFlag_slow(z10);
        }
        byte b10 = this.byteBuffer.get();
        int i10 = b10 & 63;
        if ((b10 & 64) != 0) {
            ByteBuffer byteBuffer = this.byteBuffer;
            byte b11 = byteBuffer.get();
            i10 |= (b11 & 127) << 6;
            if ((b11 & 128) != 0) {
                byte b12 = byteBuffer.get();
                i10 |= (b12 & 127) << 13;
                if ((b12 & 128) != 0) {
                    byte b13 = byteBuffer.get();
                    i10 |= (b13 & 127) << 20;
                    if ((b13 & 128) != 0) {
                        i10 |= (byteBuffer.get() & 127) << 27;
                    }
                }
            }
        }
        this.position = getBufferPosition(this.byteBuffer);
        return z10 ? i10 : (i10 >>> 1) ^ (-(i10 & 1));
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            this.byteBuffer = byteBuffer;
            this.position = byteBuffer.position();
            this.limit = byteBuffer.limit();
            this.capacity = byteBuffer.capacity();
            this.total = 0L;
            this.inputStream = null;
            return;
        }
        throw new IllegalArgumentException("buffer cannot be null.");
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public long skip(long j10) throws KryoException {
        long j11 = j10;
        while (j11 > 0) {
            int iMin = (int) Math.min(2147483639L, j11);
            skip(iMin);
            j11 -= (long) iMin;
        }
        return j10;
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read(byte[] bArr) throws KryoException {
        return read(bArr, 0, bArr.length);
    }

    public ByteBufferInput(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    @Override // com.esotericsoftware.kryo.io.Input, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int iMin = Math.min(this.limit - this.position, i11);
            int i12 = i11;
            do {
                this.byteBuffer.get(bArr, i10, iMin);
                this.position += iMin;
                i12 -= iMin;
                if (i12 == 0) {
                    break;
                }
                i10 += iMin;
                iMin = optional(i12);
                if (iMin == -1) {
                    if (i11 != i12) {
                        break;
                    }
                    return -1;
                }
            } while (this.position != this.limit);
            return i11 - i12;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    public ByteBufferInput(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
            byteBufferAllocateDirect.put(bArr);
            flipBuffer(byteBufferAllocateDirect);
            setBuffer(byteBufferAllocateDirect);
            return;
        }
        throw new IllegalArgumentException("bytes cannot be null.");
    }

    public ByteBufferInput(ByteBuffer byteBuffer) {
        setBuffer(byteBuffer);
    }

    public ByteBufferInput(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }

    public ByteBufferInput(InputStream inputStream, int i10) {
        this(i10);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }
}
