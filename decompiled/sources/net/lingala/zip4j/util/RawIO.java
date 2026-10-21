package net.lingala.zip4j.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: loaded from: classes12.dex */
public class RawIO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f85148a = new byte[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f85149b = new byte[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f85150c = new byte[8];

    public static void a(InputStream inputStream, byte[] bArr, int i10) throws IOException {
        if (Zip4jUtil.readFully(inputStream, bArr, 0, i10) != i10) {
            throw new ZipException("Could not fill buffer");
        }
    }

    public int readIntLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = this.f85149b;
        randomAccessFile.readFully(bArr);
        return readIntLittleEndian(bArr);
    }

    public long readLongLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = this.f85150c;
        randomAccessFile.readFully(bArr);
        return readLongLittleEndian(bArr, 0);
    }

    public int readShortLittleEndian(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = this.f85148a;
        randomAccessFile.readFully(bArr);
        return readShortLittleEndian(bArr, 0);
    }

    public void writeIntLittleEndian(OutputStream outputStream, int i10) throws IOException {
        byte[] bArr = this.f85149b;
        writeIntLittleEndian(bArr, 0, i10);
        outputStream.write(bArr);
    }

    public void writeLongLittleEndian(OutputStream outputStream, long j10) throws IOException {
        byte[] bArr = this.f85150c;
        writeLongLittleEndian(bArr, 0, j10);
        outputStream.write(bArr);
    }

    public void writeShortLittleEndian(OutputStream outputStream, int i10) throws IOException {
        byte[] bArr = this.f85148a;
        writeShortLittleEndian(bArr, 0, i10);
        outputStream.write(bArr);
    }

    public int readIntLittleEndian(InputStream inputStream) throws IOException {
        byte[] bArr = this.f85149b;
        a(inputStream, bArr, 4);
        return readIntLittleEndian(bArr);
    }

    public long readLongLittleEndian(InputStream inputStream) throws IOException {
        byte[] bArr = this.f85150c;
        a(inputStream, bArr, bArr.length);
        return readLongLittleEndian(bArr, 0);
    }

    public int readShortLittleEndian(InputStream inputStream) throws IOException {
        byte[] bArr = this.f85148a;
        a(inputStream, bArr, bArr.length);
        return readShortLittleEndian(bArr, 0);
    }

    public void writeIntLittleEndian(byte[] bArr, int i10, int i11) {
        bArr[i10 + 3] = (byte) (i11 >>> 24);
        bArr[i10 + 2] = (byte) (i11 >>> 16);
        bArr[i10 + 1] = (byte) (i11 >>> 8);
        bArr[i10] = (byte) (i11 & 255);
    }

    public void writeLongLittleEndian(byte[] bArr, int i10, long j10) {
        bArr[i10 + 7] = (byte) (j10 >>> 56);
        bArr[i10 + 6] = (byte) (j10 >>> 48);
        bArr[i10 + 5] = (byte) (j10 >>> 40);
        bArr[i10 + 4] = (byte) (j10 >>> 32);
        bArr[i10 + 3] = (byte) (j10 >>> 24);
        bArr[i10 + 2] = (byte) (j10 >>> 16);
        bArr[i10 + 1] = (byte) (j10 >>> 8);
        bArr[i10] = (byte) (j10 & 255);
    }

    public void writeShortLittleEndian(byte[] bArr, int i10, int i11) {
        bArr[i10 + 1] = (byte) (i11 >>> 8);
        bArr[i10] = (byte) (i11 & 255);
    }

    public int readIntLittleEndian(byte[] bArr) {
        return readIntLittleEndian(bArr, 0);
    }

    public long readLongLittleEndian(byte[] bArr, int i10) {
        int length = bArr.length - i10;
        byte[] bArr2 = this.f85150c;
        if (length < 8) {
            Arrays.fill(bArr2, (byte) 0);
        }
        System.arraycopy(bArr, i10, bArr2, 0, bArr.length < 8 ? bArr.length - i10 : 8);
        return (((((((((((((((long) (bArr2[7] & 255)) << 8) | ((long) (bArr2[6] & 255))) << 8) | ((long) (bArr2[5] & 255))) << 8) | ((long) (bArr2[4] & 255))) << 8) | ((long) (bArr2[3] & 255))) << 8) | ((long) (bArr2[2] & 255))) << 8) | ((long) (bArr2[1] & 255))) << 8) | ((long) (bArr2[0] & 255));
    }

    public int readShortLittleEndian(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public int readIntLittleEndian(byte[] bArr, int i10) {
        return ((((bArr[i10 + 3] & 255) << 8) | (bArr[i10 + 2] & 255)) << 16) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8);
    }

    public long readLongLittleEndian(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = this.f85150c;
        Arrays.fill(bArr, (byte) 0);
        a(inputStream, bArr, i10);
        return readLongLittleEndian(bArr, 0);
    }

    public long readLongLittleEndian(RandomAccessFile randomAccessFile, int i10) throws IOException {
        byte[] bArr = this.f85150c;
        Arrays.fill(bArr, (byte) 0);
        randomAccessFile.readFully(bArr, 0, i10);
        return readLongLittleEndian(bArr, 0);
    }
}
