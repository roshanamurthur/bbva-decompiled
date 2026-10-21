package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.util.Pool;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class Input extends InputStream implements Pool.Poolable {
    protected byte[] buffer;
    protected int capacity;
    protected char[] chars;
    protected InputStream inputStream;
    protected int limit;
    protected int position;
    protected long total;
    protected boolean varEncoding;

    public Input() {
        this.chars = new char[32];
        this.varEncoding = true;
    }

    private String readAsciiString() {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int iMin = Math.min(cArr.length, this.limit - i10);
        int i11 = 0;
        while (i11 < iMin) {
            byte b10 = bArr[i10];
            if ((b10 & 128) == 128) {
                this.position = i10 + 1;
                cArr[i11] = (char) (b10 & 127);
                return new String(cArr, 0, i11 + 1);
            }
            cArr[i11] = (char) b10;
            i11++;
            i10++;
        }
        this.position = i10;
        return readAscii_slow(i11);
    }

    private String readAscii_slow(int i10) {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        while (true) {
            if (this.position == this.limit) {
                require(1);
            }
            int i11 = this.position;
            this.position = i11 + 1;
            byte b10 = bArr[i11];
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
        byte[] bArr = this.buffer;
        char[] cArr = this.chars;
        int iMin = Math.min(require(1), i10);
        int i11 = this.position;
        int i12 = 0;
        while (i12 < iMin) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 < 0) {
                break;
            }
            cArr[i12] = (char) b10;
            i12++;
            i11 = i13;
        }
        this.position = i11;
        if (i12 < i10) {
            readUtf8Chars_slow(i10, i12);
        }
    }

    private void readUtf8Chars_slow(int i10, int i11) {
        char[] cArr = this.chars;
        byte[] bArr = this.buffer;
        while (i11 < i10) {
            if (this.position == this.limit) {
                require(1);
            }
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            byte b10 = bArr[i12];
            int i14 = b10 & 255;
            switch (i14 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i11] = (char) i14;
                    break;
                case 12:
                case 13:
                    if (i13 == this.limit) {
                        require(1);
                    }
                    int i15 = this.position;
                    this.position = i15 + 1;
                    cArr[i11] = (char) (((b10 & 31) << 6) | (bArr[i15] & 63));
                    break;
                case 14:
                    require(2);
                    int i16 = this.position;
                    this.position = i16 + 2;
                    cArr[i11] = (char) (((b10 & 15) << 12) | ((bArr[i16] & 63) << 6) | (bArr[i16 + 1] & 63));
                    break;
            }
            i11++;
        }
    }

    private int readVarIntFlag_slow(boolean z10) {
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        byte b10 = bArr[i10];
        int i12 = b10 & 63;
        if ((b10 & 64) != 0) {
            if (i11 == this.limit) {
                require(1);
            }
            byte[] bArr2 = this.buffer;
            int i13 = this.position;
            int i14 = i13 + 1;
            this.position = i14;
            byte b11 = bArr2[i13];
            i12 |= (b11 & 127) << 6;
            if ((b11 & 128) != 0) {
                if (i14 == this.limit) {
                    require(1);
                }
                int i15 = this.position;
                int i16 = i15 + 1;
                this.position = i16;
                byte b12 = bArr2[i15];
                i12 |= (b12 & 127) << 13;
                if ((b12 & 128) != 0) {
                    if (i16 == this.limit) {
                        require(1);
                    }
                    int i17 = this.position;
                    int i18 = i17 + 1;
                    this.position = i18;
                    byte b13 = bArr2[i17];
                    i12 |= (b13 & 127) << 20;
                    if ((b13 & 128) != 0) {
                        if (i18 == this.limit) {
                            require(1);
                        }
                        int i19 = this.position;
                        this.position = i19 + 1;
                        i12 |= (bArr2[i19] & 127) << 27;
                    }
                }
            }
        }
        return z10 ? i12 : (i12 >>> 1) ^ (-(i12 & 1));
    }

    private int readVarInt_slow(boolean z10) {
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        byte b10 = bArr[i10];
        int i12 = b10 & 127;
        if ((b10 & 128) != 0) {
            if (i11 == this.limit) {
                require(1);
            }
            byte[] bArr2 = this.buffer;
            int i13 = this.position;
            int i14 = i13 + 1;
            this.position = i14;
            byte b11 = bArr2[i13];
            i12 |= (b11 & 127) << 7;
            if ((b11 & 128) != 0) {
                if (i14 == this.limit) {
                    require(1);
                }
                int i15 = this.position;
                int i16 = i15 + 1;
                this.position = i16;
                byte b12 = bArr2[i15];
                i12 |= (b12 & 127) << 14;
                if ((b12 & 128) != 0) {
                    if (i16 == this.limit) {
                        require(1);
                    }
                    int i17 = this.position;
                    int i18 = i17 + 1;
                    this.position = i18;
                    byte b13 = bArr2[i17];
                    i12 |= (b13 & 127) << 21;
                    if ((b13 & 128) != 0) {
                        if (i18 == this.limit) {
                            require(1);
                        }
                        int i19 = this.position;
                        this.position = i19 + 1;
                        i12 |= (bArr2[i19] & 127) << 28;
                    }
                }
            }
        }
        return z10 ? i12 : (i12 >>> 1) ^ (-(i12 & 1));
    }

    private long readVarLong_slow(boolean z10) {
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        byte b10 = bArr[i10];
        long j10 = b10 & 127;
        if ((b10 & 128) != 0) {
            if (i11 == this.limit) {
                require(1);
            }
            byte[] bArr2 = this.buffer;
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            byte b11 = bArr2[i12];
            j10 |= (long) ((b11 & 127) << 7);
            if ((b11 & 128) != 0) {
                if (i13 == this.limit) {
                    require(1);
                }
                int i14 = this.position;
                int i15 = i14 + 1;
                this.position = i15;
                byte b12 = bArr2[i14];
                j10 |= (long) ((b12 & 127) << 14);
                if ((b12 & 128) != 0) {
                    if (i15 == this.limit) {
                        require(1);
                    }
                    int i16 = this.position;
                    int i17 = i16 + 1;
                    this.position = i17;
                    byte b13 = bArr2[i16];
                    j10 |= (long) ((b13 & 127) << 21);
                    if ((b13 & 128) != 0) {
                        if (i17 == this.limit) {
                            require(1);
                        }
                        int i18 = this.position;
                        int i19 = i18 + 1;
                        this.position = i19;
                        byte b14 = bArr2[i18];
                        j10 |= ((long) (b14 & 127)) << 28;
                        if ((b14 & 128) != 0) {
                            if (i19 == this.limit) {
                                require(1);
                            }
                            int i20 = this.position;
                            int i21 = i20 + 1;
                            this.position = i21;
                            byte b15 = bArr2[i20];
                            j10 |= ((long) (b15 & 127)) << 35;
                            if ((b15 & 128) != 0) {
                                if (i21 == this.limit) {
                                    require(1);
                                }
                                int i22 = this.position;
                                int i23 = i22 + 1;
                                this.position = i23;
                                byte b16 = bArr2[i22];
                                j10 |= ((long) (b16 & 127)) << 42;
                                if ((b16 & 128) != 0) {
                                    if (i23 == this.limit) {
                                        require(1);
                                    }
                                    int i24 = this.position;
                                    int i25 = i24 + 1;
                                    this.position = i25;
                                    byte b17 = bArr2[i24];
                                    j10 |= ((long) (b17 & 127)) << 49;
                                    if ((b17 & 128) != 0) {
                                        if (i25 == this.limit) {
                                            require(1);
                                        }
                                        int i26 = this.position;
                                        this.position = i26 + 1;
                                        j10 |= ((long) bArr2[i26]) << 56;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return z10 ? j10 : (j10 >>> 1) ^ (-(j10 & 1));
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i10 = this.limit - this.position;
        InputStream inputStream = this.inputStream;
        return i10 + (inputStream != null ? inputStream.available() : 0);
    }

    public boolean canReadInt() throws KryoException {
        if (this.varEncoding) {
            return canReadVarInt();
        }
        return this.limit - this.position >= 4 || optional(4) == 4;
    }

    public boolean canReadLong() throws KryoException {
        if (this.varEncoding) {
            return canReadVarLong();
        }
        return this.limit - this.position >= 8 || optional(8) == 8;
    }

    public boolean canReadVarInt() throws KryoException {
        if (this.limit - this.position >= 5) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        int i11 = this.limit;
        byte[] bArr = this.buffer;
        int i12 = i10 + 1;
        if ((bArr[i10] & 128) == 0) {
            return true;
        }
        if (i12 == i11) {
            return false;
        }
        int i13 = i10 + 2;
        if ((bArr[i12] & 128) == 0) {
            return true;
        }
        if (i13 == i11) {
            return false;
        }
        int i14 = i10 + 3;
        if ((bArr[i13] & 128) == 0) {
            return true;
        }
        if (i14 == i11) {
            return false;
        }
        return (bArr[i14] & 128) == 0 || i10 + 4 != i11;
    }

    public boolean canReadVarLong() throws KryoException {
        if (this.limit - this.position >= 9) {
            return true;
        }
        if (optional(5) <= 0) {
            return false;
        }
        int i10 = this.position;
        int i11 = this.limit;
        byte[] bArr = this.buffer;
        int i12 = i10 + 1;
        if ((bArr[i10] & 128) == 0) {
            return true;
        }
        if (i12 == i11) {
            return false;
        }
        int i13 = i10 + 2;
        if ((bArr[i12] & 128) == 0) {
            return true;
        }
        if (i13 == i11) {
            return false;
        }
        int i14 = i10 + 3;
        if ((bArr[i13] & 128) == 0) {
            return true;
        }
        if (i14 == i11) {
            return false;
        }
        int i15 = i10 + 4;
        if ((bArr[i14] & 128) == 0) {
            return true;
        }
        if (i15 == i11) {
            return false;
        }
        int i16 = i10 + 5;
        if ((bArr[i15] & 128) == 0) {
            return true;
        }
        if (i16 == i11) {
            return false;
        }
        int i17 = i10 + 6;
        if ((bArr[i16] & 128) == 0) {
            return true;
        }
        if (i17 == i11) {
            return false;
        }
        int i18 = i10 + 7;
        if ((bArr[i17] & 128) == 0) {
            return true;
        }
        if (i18 == i11) {
            return false;
        }
        return (bArr[i18] & 128) == 0 || i10 + 8 != i11;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public boolean end() {
        return optional(1) <= 0;
    }

    public int fill(byte[] bArr, int i10, int i11) throws KryoException {
        InputStream inputStream = this.inputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (IOException e5) {
            throw new KryoException(e5);
        }
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    public boolean getVariableLengthEncoding() {
        return this.varEncoding;
    }

    public int limit() {
        return this.limit;
    }

    public int optional(int i10) throws KryoException {
        int i11 = this.limit - this.position;
        if (i11 >= i10) {
            return i10;
        }
        int iMin = Math.min(i10, this.capacity);
        byte[] bArr = this.buffer;
        int i12 = this.limit;
        int iFill = fill(bArr, i12, this.capacity - i12);
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
        byte[] bArr2 = this.buffer;
        System.arraycopy(bArr2, this.position, bArr2, 0, i13);
        this.total += (long) this.position;
        this.position = 0;
        do {
            int iFill2 = fill(this.buffer, i13, this.capacity - i13);
            if (iFill2 == -1) {
                break;
            }
            i13 += iFill2;
        } while (i13 < iMin);
        this.limit = i13;
        if (i13 == 0) {
            return -1;
        }
        return Math.min(i13, iMin);
    }

    public int position() {
        return this.position;
    }

    @Override // java.io.InputStream
    public int read() throws KryoException {
        if (optional(1) <= 0) {
            return -1;
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] & 255;
    }

    public boolean readBoolean() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] == 1;
    }

    public boolean[] readBooleans(int i10) throws KryoException {
        boolean[] zArr = new boolean[i10];
        if (optional(i10) == i10) {
            byte[] bArr = this.buffer;
            int i11 = this.position;
            int i12 = 0;
            while (i12 < i10) {
                zArr[i12] = bArr[i11] != 0;
                i12++;
                i11++;
            }
            this.position = i11;
        } else {
            for (int i13 = 0; i13 < i10; i13++) {
                zArr[i13] = readBoolean();
            }
        }
        return zArr;
    }

    public byte readByte() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10];
    }

    public int readByteUnsigned() throws KryoException {
        if (this.position == this.limit) {
            require(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        return bArr[i10] & 255;
    }

    public byte[] readBytes(int i10) throws KryoException {
        byte[] bArr = new byte[i10];
        readBytes(bArr, 0, i10);
        return bArr;
    }

    public char readChar() throws KryoException {
        require(2);
        int i10 = this.position;
        this.position = i10 + 2;
        byte[] bArr = this.buffer;
        return (char) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
    }

    public char[] readChars(int i10) throws KryoException {
        char[] cArr = new char[i10];
        int i11 = i10 << 1;
        int i12 = 0;
        if (optional(i11) == i11) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            while (i12 < i10) {
                cArr[i12] = (char) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8));
                i12++;
                i13 += 2;
            }
            this.position = i13;
        } else {
            while (i12 < i10) {
                cArr[i12] = readChar();
                i12++;
            }
        }
        return cArr;
    }

    public double readDouble() throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 8;
        return Double.longBitsToDouble((((long) bArr[i10 + 7]) << 56) | ((long) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16))) | (((long) (bArr[i10 + 3] & 255)) << 24) | (((long) (bArr[i10 + 4] & 255)) << 32) | (((long) (bArr[i10 + 5] & 255)) << 40) | (((long) (bArr[i10 + 6] & 255)) << 48));
    }

    public double[] readDoubles(int i10) throws KryoException {
        double[] dArr = new double[i10];
        int i11 = i10 << 3;
        int i12 = 0;
        if (optional(i11) == i11) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            while (i12 < i10) {
                dArr[i12] = Double.longBitsToDouble(((long) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16))) | (((long) (bArr[i13 + 3] & 255)) << 24) | (((long) (bArr[i13 + 4] & 255)) << 32) | (((long) (bArr[i13 + 5] & 255)) << 40) | (((long) (bArr[i13 + 6] & 255)) << 48) | (((long) bArr[i13 + 7]) << 56));
                i12++;
                i13 += 8;
            }
            this.position = i13;
        } else {
            while (i12 < i10) {
                dArr[i12] = readDouble();
                i12++;
            }
        }
        return dArr;
    }

    public float readFloat() throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 4;
        return Float.intBitsToFloat(((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16));
    }

    public float[] readFloats(int i10) throws KryoException {
        float[] fArr = new float[i10];
        int i11 = i10 << 2;
        int i12 = 0;
        if (optional(i11) == i11) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            while (i12 < i10) {
                fArr[i12] = Float.intBitsToFloat((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24));
                i12++;
                i13 += 4;
            }
            this.position = i13;
        } else {
            while (i12 < i10) {
                fArr[i12] = readFloat();
                i12++;
            }
        }
        return fArr;
    }

    public int readInt() throws KryoException {
        require(4);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public int[] readInts(int i10) throws KryoException {
        int[] iArr = new int[i10];
        int i11 = i10 << 2;
        int i12 = 0;
        if (optional(i11) == i11) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            while (i12 < i10) {
                iArr[i12] = (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16) | ((bArr[i13 + 3] & 255) << 24);
                i12++;
                i13 += 4;
            }
            this.position = i13;
        } else {
            while (i12 < i10) {
                iArr[i12] = readInt();
                i12++;
            }
        }
        return iArr;
    }

    public long readLong() throws KryoException {
        require(8);
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 8;
        return (((long) bArr[i10 + 7]) << 56) | ((long) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16))) | (((long) (bArr[i10 + 3] & 255)) << 24) | (((long) (bArr[i10 + 4] & 255)) << 32) | (((long) (bArr[i10 + 5] & 255)) << 40) | (((long) (bArr[i10 + 6] & 255)) << 48);
    }

    public long[] readLongs(int i10) throws KryoException {
        long[] jArr = new long[i10];
        int i11 = i10 << 3;
        int i12 = 0;
        if (optional(i11) == i11) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            while (i12 < i10) {
                jArr[i12] = ((long) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16))) | (((long) (bArr[i13 + 3] & 255)) << 24) | (((long) (bArr[i13 + 4] & 255)) << 32) | (((long) (bArr[i13 + 5] & 255)) << 40) | (((long) (bArr[i13 + 6] & 255)) << 48) | (((long) bArr[i13 + 7]) << 56);
                i12++;
                i13 += 8;
            }
            this.position = i13;
        } else {
            while (i12 < i10) {
                jArr[i12] = readLong();
                i12++;
            }
        }
        return jArr;
    }

    public short readShort() throws KryoException {
        require(2);
        int i10 = this.position;
        this.position = i10 + 2;
        byte[] bArr = this.buffer;
        return (short) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
    }

    public int readShortUnsigned() throws KryoException {
        require(2);
        int i10 = this.position;
        this.position = i10 + 2;
        byte[] bArr = this.buffer;
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public short[] readShorts(int i10) throws KryoException {
        short[] sArr = new short[i10];
        int i11 = i10 << 1;
        int i12 = 0;
        if (optional(i11) == i11) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            while (i12 < i10) {
                sArr[i12] = (short) ((bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8));
                i12++;
                i13 += 2;
            }
            this.position = i13;
        } else {
            while (i12 < i10) {
                sArr[i12] = readShort();
                i12++;
            }
        }
        return sArr;
    }

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

    public StringBuilder readStringBuilder() {
        if (!readVarIntFlag()) {
            return new StringBuilder(readAsciiString());
        }
        int varIntFlag = readVarIntFlag(true);
        if (varIntFlag == 0) {
            return null;
        }
        if (varIntFlag == 1) {
            return new StringBuilder(0);
        }
        int i10 = varIntFlag - 1;
        readUtf8Chars(i10);
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(this.chars, 0, i10);
        return sb2;
    }

    public double readVarDouble(double d2, boolean z10) throws KryoException {
        return readVarLong(z10) / d2;
    }

    public float readVarFloat(float f6, boolean z10) throws KryoException {
        return readVarInt(z10) / f6;
    }

    public int readVarInt(boolean z10) throws KryoException {
        if (require(1) < 5) {
            return readVarInt_slow(z10);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        byte b10 = bArr[i10];
        int i12 = b10 & 127;
        if ((b10 & 128) != 0) {
            int i13 = i10 + 2;
            byte b11 = bArr[i11];
            i12 |= (b11 & 127) << 7;
            if ((b11 & 128) != 0) {
                int i14 = i10 + 3;
                byte b12 = bArr[i13];
                i12 |= (b12 & 127) << 14;
                if ((b12 & 128) != 0) {
                    i13 = i10 + 4;
                    byte b13 = bArr[i14];
                    i12 |= (b13 & 127) << 21;
                    if ((b13 & 128) != 0) {
                        i12 = ((bArr[i13] & 127) << 28) | i12;
                        i13 = 5 + i10;
                    }
                } else {
                    i13 = i14;
                }
            }
            this.position = i13;
        }
        return z10 ? i12 : (i12 >>> 1) ^ (-(i12 & 1));
    }

    public boolean readVarIntFlag() {
        if (this.position == this.limit) {
            require(1);
        }
        return (this.buffer[this.position] & 128) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d A[PHI: r5 r6
      0x008d: PHI (r5v3 int) = (r5v2 int), (r5v6 int), (r5v9 int), (r5v12 int) binds: [B:9:0x0029, B:13:0x0045, B:17:0x0063, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x008d: PHI (r6v5 long) = (r6v4 long), (r6v7 long), (r6v9 long), (r6v11 long) binds: [B:9:0x0029, B:13:0x0045, B:17:0x0063, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    public long readVarLong(boolean z10) throws KryoException {
        if (require(1) < 9) {
            return readVarLong_slow(z10);
        }
        int i10 = this.position;
        byte[] bArr = this.buffer;
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j10 = b10 & 127;
        if ((b10 & 128) != 0) {
            int i12 = i10 + 2;
            byte b11 = bArr[i11];
            j10 |= (long) ((b11 & 127) << 7);
            if ((b11 & 128) != 0) {
                i11 = i10 + 3;
                byte b12 = bArr[i12];
                j10 |= (long) ((b12 & 127) << 14);
                if ((b12 & 128) != 0) {
                    i12 = i10 + 4;
                    byte b13 = bArr[i11];
                    j10 |= (long) ((b13 & 127) << 21);
                    if ((b13 & 128) != 0) {
                        i11 = i10 + 5;
                        byte b14 = bArr[i12];
                        j10 |= ((long) (b14 & 127)) << 28;
                        if ((b14 & 128) != 0) {
                            i12 = i10 + 6;
                            byte b15 = bArr[i11];
                            j10 |= ((long) (b15 & 127)) << 35;
                            if ((b15 & 128) != 0) {
                                i11 = i10 + 7;
                                byte b16 = bArr[i12];
                                j10 |= ((long) (b16 & 127)) << 42;
                                if ((b16 & 128) != 0) {
                                    i12 = i10 + 8;
                                    byte b17 = bArr[i11];
                                    j10 |= ((long) (b17 & 127)) << 49;
                                    if ((b17 & 128) != 0) {
                                        i11 = i10 + 9;
                                        j10 |= ((long) bArr[i12]) << 56;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                            } else {
                                i11 = i12;
                            }
                        }
                    } else {
                        i11 = i12;
                    }
                }
            } else {
                i11 = i12;
            }
        }
        this.position = i11;
        return z10 ? j10 : (j10 >>> 1) ^ (-(1 & j10));
    }

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
            int iFill = fill(this.buffer, i11, i13 - i11);
            if (iFill == -1) {
                throw new KryoException("Buffer underflow.");
            }
            i12 += iFill;
            if (i12 >= i10) {
                this.limit += iFill;
                return i12;
            }
        }
        byte[] bArr = this.buffer;
        System.arraycopy(bArr, this.position, bArr, 0, i12);
        this.total += (long) this.position;
        this.position = 0;
        do {
            int iFill2 = fill(this.buffer, i12, this.capacity - i12);
            if (iFill2 == -1) {
                if (i12 >= i10) {
                    break;
                }
                throw new KryoException("Buffer underflow.");
            }
            i12 += iFill2;
        } while (i12 < i10);
        this.limit = i12;
        return i12;
    }

    @Override // java.io.InputStream, com.esotericsoftware.kryo.util.Pool.Poolable
    public void reset() {
        this.position = 0;
        this.total = 0L;
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(bArr, 0, bArr.length);
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
        this.limit = 0;
        reset();
    }

    public void setLimit(int i10) {
        this.limit = i10;
    }

    public void setPosition(int i10) {
        this.position = i10;
    }

    public void setTotal(long j10) {
        this.total = j10;
    }

    public void setVariableLengthEncoding(boolean z10) {
        this.varEncoding = z10;
    }

    public void skip(int i10) throws KryoException {
        int iMin = Math.min(this.limit - this.position, i10);
        while (true) {
            this.position += iMin;
            i10 -= iMin;
            if (i10 == 0) {
                return;
            }
            iMin = Math.min(i10, this.capacity);
            require(iMin);
        }
    }

    public long total() {
        return this.total + ((long) this.position);
    }

    public void setBuffer(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new IllegalArgumentException("bytes cannot be null.");
        }
        this.buffer = bArr;
        this.position = i10;
        this.limit = i10 + i11;
        this.capacity = bArr.length;
        this.total = 0L;
        this.inputStream = null;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws KryoException {
        return read(bArr, 0, bArr.length);
    }

    public void readBytes(byte[] bArr) throws KryoException {
        readBytes(bArr, 0, bArr.length);
    }

    public int readVarIntFlag(boolean z10) {
        if (require(1) < 5) {
            return readVarIntFlag_slow(z10);
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        int i11 = i10 + 1;
        this.position = i11;
        byte b10 = bArr[i10];
        int i12 = b10 & 63;
        if ((b10 & 64) != 0) {
            int i13 = i10 + 2;
            byte b11 = bArr[i11];
            i12 |= (b11 & 127) << 6;
            if ((b11 & 128) != 0) {
                int i14 = i10 + 3;
                byte b12 = bArr[i13];
                i12 |= (b12 & 127) << 13;
                if ((b12 & 128) != 0) {
                    i13 = i10 + 4;
                    byte b13 = bArr[i14];
                    i12 |= (b13 & 127) << 20;
                    if ((b13 & 128) != 0) {
                        i12 = ((bArr[i13] & 127) << 27) | i12;
                        i13 = 5 + i10;
                    }
                } else {
                    i13 = i14;
                }
            }
            this.position = i13;
        }
        return z10 ? i12 : (i12 >>> 1) ^ (-(i12 & 1));
    }

    public Input(int i10) {
        this.chars = new char[32];
        this.varEncoding = true;
        this.capacity = i10;
        this.buffer = new byte[i10];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int iMin = Math.min(this.limit - this.position, i11);
            int i12 = i11;
            do {
                System.arraycopy(this.buffer, this.position, bArr, i10, iMin);
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

    public void readBytes(byte[] bArr, int i10, int i11) throws KryoException {
        if (bArr != null) {
            int iMin = Math.min(this.limit - this.position, i11);
            while (true) {
                System.arraycopy(this.buffer, this.position, bArr, i10, iMin);
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

    @Override // java.io.InputStream
    public long skip(long j10) throws KryoException {
        long j11 = j10;
        while (j11 > 0) {
            int iMin = (int) Math.min(2147483639L, j11);
            skip(iMin);
            j11 -= (long) iMin;
        }
        return j10;
    }

    public int readInt(boolean z10) throws KryoException {
        return this.varEncoding ? readVarInt(z10) : readInt();
    }

    public long readLong(boolean z10) throws KryoException {
        return this.varEncoding ? readVarLong(z10) : readLong();
    }

    public int[] readInts(int i10, boolean z10) throws KryoException {
        if (this.varEncoding) {
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = readVarInt(z10);
            }
            return iArr;
        }
        return readInts(i10);
    }

    public long[] readLongs(int i10, boolean z10) throws KryoException {
        if (this.varEncoding) {
            long[] jArr = new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr[i11] = readVarLong(z10);
            }
            return jArr;
        }
        return readLongs(i10);
    }

    public Input(byte[] bArr) {
        this.chars = new char[32];
        this.varEncoding = true;
        setBuffer(bArr, 0, bArr.length);
    }

    public Input(byte[] bArr, int i10, int i11) {
        this.chars = new char[32];
        this.varEncoding = true;
        setBuffer(bArr, i10, i11);
    }

    public Input(InputStream inputStream) {
        this(4096);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }

    public Input(InputStream inputStream, int i10) {
        this(i10);
        if (inputStream != null) {
            this.inputStream = inputStream;
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null.");
    }
}
