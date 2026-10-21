package net.lingala.zip4j.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Calendar;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.AbstractFileHeader;
import net.lingala.zip4j.model.enums.CompressionMethod;

/* JADX INFO: loaded from: classes12.dex */
public class Zip4jUtil {
    public static byte[] convertCharArrayToByteArray(char[] cArr) {
        try {
            ByteBuffer byteBufferEncode = InternalZipConstants.CHARSET_UTF_8.encode(CharBuffer.wrap(cArr));
            byte[] bArr = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr);
            return bArr;
        } catch (Exception unused) {
            byte[] bArr2 = new byte[cArr.length];
            for (int i10 = 0; i10 < cArr.length; i10++) {
                bArr2[i10] = (byte) cArr[i10];
            }
            return bArr2;
        }
    }

    public static boolean createDirectoryIfNotExists(File file) throws ZipException {
        if (file == null) {
            throw new ZipException("output path is null");
        }
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            throw new ZipException("output directory is not valid");
        }
        if (file.mkdirs()) {
            return true;
        }
        throw new ZipException("Cannot create output directories");
    }

    public static long dosToExtendedEpochTme(long j10) {
        int i10 = (int) ((j10 >> 5) & 63);
        int i11 = (int) ((j10 >> 11) & 31);
        int i12 = (int) ((j10 >> 16) & 31);
        int i13 = (int) (((j10 >> 21) & 15) - 1);
        int i14 = (int) (((j10 >> 25) & 127) + 1980);
        Calendar calendar = Calendar.getInstance();
        calendar.set(i14, i13, i12, i11, i10, (int) ((j10 << 1) & 62));
        calendar.set(14, 0);
        return calendar.getTime().getTime() + (j10 >> 32);
    }

    public static long epochToExtendedDosTime(long j10) {
        long j11;
        if (j10 < 0) {
            return 2162688L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        int i10 = calendar.get(1);
        if (i10 < 1980) {
            j11 = 2162688;
        } else {
            j11 = (calendar.get(13) >> 1) | ((i10 - 1980) << 25) | ((calendar.get(2) + 1) << 21) | (calendar.get(5) << 16) | (calendar.get(11) << 11) | (calendar.get(12) << 5);
        }
        if (j11 != 2162688) {
            return j11 + ((j10 % 2000) << 32);
        }
        return 2162688L;
    }

    public static CompressionMethod getCompressionMethod(AbstractFileHeader abstractFileHeader) {
        if (abstractFileHeader.getCompressionMethod() != CompressionMethod.AES_INTERNAL_ONLY) {
            return abstractFileHeader.getCompressionMethod();
        }
        if (abstractFileHeader.getAesExtraDataRecord() != null) {
            return abstractFileHeader.getAesExtraDataRecord().getCompressionMethod();
        }
        throw new RuntimeException("AesExtraDataRecord not present in local header for aes encrypted data");
    }

    public static boolean isStringNotNullAndNotEmpty(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = inputStream.read(bArr);
        if (i10 != bArr.length) {
            int length = bArr.length - i10;
            int i11 = 0;
            for (int i12 = 1; i10 < bArr.length && i11 != -1 && i12 < 15; i12++) {
                i11 = inputStream.read(bArr, i10, length);
                if (i11 > 0) {
                    i10 += i11;
                    length -= i11;
                }
            }
            if (i10 != bArr.length) {
                throw new IOException("Cannot read fully into byte buffer");
            }
        }
        return i10;
    }

    public static int readFully(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative offset");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        int i12 = 0;
        if (i11 == 0) {
            return 0;
        }
        if (i10 + i11 > bArr.length) {
            throw new IllegalArgumentException("Length greater than buffer size");
        }
        while (i12 != i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            i12 += i13;
        }
        return i12;
    }
}
