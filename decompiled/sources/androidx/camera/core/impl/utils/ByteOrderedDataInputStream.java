package androidx.camera.core.impl.utils;

import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

    public ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mDataInputStream.available();
    }

    public int getLength() {
        return this.mLength;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(i10);
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int i10 = this.mPosition + 1;
        this.mPosition = i10;
        if (i10 > this.mLength) {
            throw new EOFException();
        }
        int i11 = this.mDataInputStream.read();
        if (i11 >= 0) {
            return (byte) i11;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.mPosition + i11;
        this.mPosition = i12;
        if (i12 > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, i10, i11) != i11) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int i10 = this.mPosition + 4;
        this.mPosition = i10;
        if (i10 > this.mLength) {
            throw new EOFException();
        }
        int i11 = this.mDataInputStream.read();
        int i12 = this.mDataInputStream.read();
        int i13 = this.mDataInputStream.read();
        int i14 = this.mDataInputStream.read();
        if ((i11 | i12 | i13 | i14) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i14 << 24) + (i13 << 16) + (i12 << 8) + i11;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i11 << 24) + (i12 << 16) + (i13 << 8) + i14;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int i10 = this.mPosition + 8;
        this.mPosition = i10;
        if (i10 > this.mLength) {
            throw new EOFException();
        }
        int i11 = this.mDataInputStream.read();
        int i12 = this.mDataInputStream.read();
        int i13 = this.mDataInputStream.read();
        int i14 = this.mDataInputStream.read();
        int i15 = this.mDataInputStream.read();
        int i16 = this.mDataInputStream.read();
        int i17 = this.mDataInputStream.read();
        int i18 = this.mDataInputStream.read();
        if ((i11 | i12 | i13 | i14 | i15 | i16 | i17 | i18) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (((long) i18) << 56) + (((long) i17) << 48) + (((long) i16) << 40) + (((long) i15) << 32) + (((long) i14) << 24) + (((long) i13) << 16) + (((long) i12) << 8) + ((long) i11);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (((long) i11) << 56) + (((long) i12) << 48) + (((long) i13) << 40) + (((long) i14) << 32) + (((long) i15) << 24) + (((long) i16) << 16) + (((long) i17) << 8) + ((long) i18);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int i10 = this.mPosition + 2;
        this.mPosition = i10;
        if (i10 > this.mLength) {
            throw new EOFException();
        }
        int i11 = this.mDataInputStream.read();
        int i12 = this.mDataInputStream.read();
        if ((i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((i12 << 8) + i11);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((i11 << 8) + i12);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    public long readUnsignedInt() throws IOException {
        return ((long) readInt()) & 4294967295L;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int i10 = this.mPosition + 2;
        this.mPosition = i10;
        if (i10 > this.mLength) {
            throw new EOFException();
        }
        int i11 = this.mDataInputStream.read();
        int i12 = this.mDataInputStream.read();
        if ((i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (i12 << 8) + i11;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    public void seek(long j10) throws IOException {
        int i10 = this.mPosition;
        if (i10 > j10) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j10 -= (long) i10;
        }
        int i11 = (int) j10;
        if (skipBytes(i11) != i11) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.DataInput
    public int skipBytes(int i10) throws IOException {
        int iMin = Math.min(i10, this.mLength - this.mPosition);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.mDataInputStream.skipBytes(iMin - iSkipBytes);
        }
        this.mPosition += iSkipBytes;
        return iSkipBytes;
    }

    public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.mLength = iAvailable;
        this.mPosition = 0;
        dataInputStream.mark(iAvailable);
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.mDataInputStream.read(bArr, i10, i11);
        this.mPosition += i12;
        return i12;
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length <= this.mLength) {
            if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public ByteOrderedDataInputStream(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }
}
