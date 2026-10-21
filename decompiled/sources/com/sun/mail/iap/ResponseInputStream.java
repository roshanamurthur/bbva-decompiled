package com.sun.mail.iap;

import com.sun.mail.util.ASCIIUtility;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class ResponseInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedInputStream f65259a;

    public ResponseInputStream(InputStream inputStream) {
        this.f65259a = new BufferedInputStream(inputStream, 2048);
    }

    public int available() throws IOException {
        return this.f65259a.available();
    }

    public ByteArray readResponse() throws IOException {
        return readResponse(null);
    }

    public ByteArray readResponse(ByteArray byteArray) throws IOException {
        BufferedInputStream bufferedInputStream;
        if (byteArray == null) {
            byteArray = new ByteArray(new byte[128], 0, 128);
        }
        byte[] bytes = byteArray.getBytes();
        int i10 = 0;
        while (true) {
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                bufferedInputStream = this.f65259a;
                if (z10 || (i11 = bufferedInputStream.read()) == -1) {
                    break;
                }
                if (i11 == 10 && i10 > 0 && bytes[i10 - 1] == 13) {
                    z10 = true;
                }
                if (i10 >= bytes.length) {
                    int length = bytes.length;
                    if (length > 262144) {
                        length = 262144;
                    }
                    byteArray.grow(length);
                    bytes = byteArray.getBytes();
                }
                bytes[i10] = (byte) i11;
                i10++;
            }
            if (i11 == -1) {
                throw new IOException("Connection dropped by server?");
            }
            if (i10 >= 5) {
                int i12 = i10 - 3;
                if (bytes[i12] == 125) {
                    int i13 = i10 - 4;
                    while (i13 >= 0 && bytes[i13] != 123) {
                        i13--;
                    }
                    if (i13 >= 0) {
                        try {
                            int i14 = ASCIIUtility.parseInt(bytes, i13 + 1, i12);
                            if (i14 > 0) {
                                int length2 = bytes.length - i10;
                                int i15 = i14 + 16;
                                if (i15 > length2) {
                                    int i16 = i15 - length2;
                                    if (256 > i16) {
                                        i16 = 256;
                                    }
                                    byteArray.grow(i16);
                                    bytes = byteArray.getBytes();
                                }
                                while (i14 > 0) {
                                    int i17 = bufferedInputStream.read(bytes, i10, i14);
                                    if (i17 == -1) {
                                        throw new IOException("Connection dropped by server?");
                                    }
                                    i14 -= i17;
                                    i10 += i17;
                                }
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
            byteArray.setCount(i10);
            return byteArray;
        }
    }
}
