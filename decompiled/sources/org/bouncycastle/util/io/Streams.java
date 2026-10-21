package org.bouncycastle.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class Streams {
    public static void drain(InputStream inputStream) throws IOException {
        while (inputStream.read(new byte[4096], 0, 4096) >= 0) {
        }
    }

    public static void pipeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 4096);
            if (i10 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static long pipeAllLimited(InputStream inputStream, long j10, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int i10 = inputStream.read(bArr, 0, 4096);
            if (i10 < 0) {
                return j11;
            }
            long j12 = i10;
            if (j10 - j11 < j12) {
                throw new StreamOverflowException("Data Overflow");
            }
            j11 += j12;
            outputStream.write(bArr, 0, i10);
        }
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] readAllLimited(InputStream inputStream, int i10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAllLimited(inputStream, i10, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        return readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void writeBufTo(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) throws IOException {
        byteArrayOutputStream.writeTo(outputStream);
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 < 0) {
                break;
            }
            i12 += i13;
        }
        return i12;
    }
}
