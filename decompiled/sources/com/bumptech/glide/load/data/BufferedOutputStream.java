package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class BufferedOutputStream extends OutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final OutputStream f38141p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f38142q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayPool f38143r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f38144s0;

    public BufferedOutputStream(@NonNull OutputStream outputStream, @NonNull ArrayPool arrayPool) {
        this.f38141p0 = outputStream;
        this.f38143r0 = arrayPool;
        this.f38142q0 = (byte[]) arrayPool.get(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        OutputStream outputStream = this.f38141p0;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f38142q0;
            if (bArr != null) {
                this.f38143r0.put(bArr);
                this.f38142q0 = null;
            }
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        int i10 = this.f38144s0;
        OutputStream outputStream = this.f38141p0;
        if (i10 > 0) {
            outputStream.write(this.f38142q0, 0, i10);
            this.f38144s0 = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f38142q0;
        int i11 = this.f38144s0;
        int i12 = i11 + 1;
        this.f38144s0 = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f38141p0.write(bArr, 0, i12);
        this.f38144s0 = 0;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f38144s0;
            OutputStream outputStream = this.f38141p0;
            if (i15 == 0 && i13 >= this.f38142q0.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f38142q0.length - i15);
            System.arraycopy(bArr, i14, this.f38142q0, this.f38144s0, iMin);
            int i16 = this.f38144s0 + iMin;
            this.f38144s0 = i16;
            i12 += iMin;
            byte[] bArr2 = this.f38142q0;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f38144s0 = 0;
            }
        } while (i12 < i11);
    }
}
