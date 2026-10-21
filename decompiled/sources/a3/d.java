package a3;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: Encoding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static byte[] a(@NonNull byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    @NonNull
    public static byte[] b(int i10, @NonNull InputStream inputStream) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new IllegalStateException(g0.c("Not enough bytes to read: ", i10));
            }
            i11 += i12;
        }
        return bArr;
    }

    @NonNull
    public static byte[] c(@NonNull FileInputStream fileInputStream, int i10, int i11) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = fileInputStream.read(bArr2);
                if (i13 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    public static long d(int i10, @NonNull InputStream inputStream) throws IOException {
        byte[] bArrB = b(i10, inputStream);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrB[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static void e(@NonNull ByteArrayOutputStream byteArrayOutputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void f(@NonNull ByteArrayOutputStream byteArrayOutputStream, int i10) throws IOException {
        e(byteArrayOutputStream, i10, 2);
    }
}
