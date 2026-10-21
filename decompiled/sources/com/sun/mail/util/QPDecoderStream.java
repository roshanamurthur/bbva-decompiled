package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes9.dex */
public class QPDecoderStream extends FilterInputStream {
    protected byte[] ba;
    protected int spaces;

    public QPDecoderStream(InputStream inputStream) {
        super(new PushbackInputStream(inputStream, 2));
        this.ba = new byte[2];
        this.spaces = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11 = this.spaces;
        if (i11 > 0) {
            this.spaces = i11 - 1;
            return 32;
        }
        int i12 = ((FilterInputStream) this).in.read();
        if (i12 == 32) {
            while (true) {
                i10 = ((FilterInputStream) this).in.read();
                if (i10 != 32) {
                    break;
                }
                this.spaces++;
            }
            if (i10 == 13 || i10 == 10 || i10 == -1) {
                this.spaces = 0;
                return i10;
            }
            ((PushbackInputStream) ((FilterInputStream) this).in).unread(i10);
            return 32;
        }
        if (i12 == 61) {
            int i13 = ((FilterInputStream) this).in.read();
            if (i13 == 10) {
                return read();
            }
            if (i13 == 13) {
                int i14 = ((FilterInputStream) this).in.read();
                if (i14 != 10) {
                    ((PushbackInputStream) ((FilterInputStream) this).in).unread(i14);
                }
                return read();
            }
            if (i13 == -1) {
                return -1;
            }
            byte[] bArr = this.ba;
            bArr[0] = (byte) i13;
            bArr[1] = (byte) ((FilterInputStream) this).in.read();
            try {
                return ASCIIUtility.parseInt(this.ba, 0, 2, 16);
            } catch (NumberFormatException unused) {
                ((PushbackInputStream) ((FilterInputStream) this).in).unread(this.ba);
            }
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = 0;
        while (true) {
            long j12 = j10 - 1;
            if (j10 <= 0 || read() < 0) {
                break;
            }
            j11++;
            j10 = j12;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = read();
            if (i13 == -1) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            bArr[i10 + i12] = (byte) i13;
            i12++;
        }
        return i12;
    }
}
