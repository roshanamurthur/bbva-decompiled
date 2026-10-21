package org.bouncycastle.util.io;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class BufferingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final OutputStream f91651p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f91652q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f91653r0;

    public BufferingOutputStream(OutputStream outputStream) {
        this.f91651p0 = outputStream;
        this.f91652q0 = new byte[4096];
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        this.f91651p0.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i10 = this.f91653r0;
        OutputStream outputStream = this.f91651p0;
        byte[] bArr = this.f91652q0;
        outputStream.write(bArr, 0, i10);
        this.f91653r0 = 0;
        Arrays.fill(bArr, (byte) 0);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        int i11 = this.f91653r0;
        int i12 = i11 + 1;
        this.f91653r0 = i12;
        byte[] bArr = this.f91652q0;
        bArr[i11] = (byte) i10;
        if (i12 == bArr.length) {
            flush();
        }
    }

    public BufferingOutputStream(OutputStream outputStream, int i10) {
        this.f91651p0 = outputStream;
        this.f91652q0 = new byte[i10];
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = this.f91652q0;
        int length = bArr2.length;
        int i12 = this.f91653r0;
        if (i11 < length - i12) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
        } else {
            int length2 = bArr2.length - i12;
            System.arraycopy(bArr, i10, bArr2, i12, length2);
            this.f91653r0 += length2;
            flush();
            int length3 = i10 + length2;
            while (true) {
                i11 -= length2;
                if (i11 < bArr2.length) {
                    break;
                }
                this.f91651p0.write(bArr, length3, bArr2.length);
                length3 += bArr2.length;
                length2 = bArr2.length;
            }
            if (i11 <= 0) {
                return;
            } else {
                System.arraycopy(bArr, length3, bArr2, this.f91653r0, i11);
            }
        }
        this.f91653r0 += i11;
    }
}
