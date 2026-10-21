package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public volatile byte[] f38588p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f38589q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f38590r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f38591s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f38592t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ArrayPool f38593u0;

    public static class a extends IOException {
    }

    public RecyclableBufferedInputStream(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) {
        super(inputStream);
        this.f38591s0 = -1;
        this.f38593u0 = arrayPool;
        this.f38588p0 = (byte[]) arrayPool.get(65536, byte[].class);
    }

    public static void b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f38591s0;
        if (i10 != -1) {
            int i11 = this.f38592t0 - i10;
            int i12 = this.f38590r0;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f38589q0 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f38593u0.get(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f38588p0 = bArr2;
                    this.f38593u0.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f38592t0 - this.f38591s0;
                this.f38592t0 = i13;
                this.f38591s0 = 0;
                this.f38589q0 = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f38592t0;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f38589q0 = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f38591s0 = -1;
            this.f38592t0 = 0;
            this.f38589q0 = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f38588p0 == null || inputStream == null) {
            b();
            throw null;
        }
        return (this.f38589q0 - this.f38592t0) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f38588p0 != null) {
            this.f38593u0.put(this.f38588p0);
            this.f38588p0 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void fixMarkLimit() {
        this.f38590r0 = this.f38588p0.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f38590r0 = Math.max(this.f38590r0, i10);
        this.f38591s0 = this.f38592t0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f38588p0;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            b();
            throw null;
        }
        if (this.f38592t0 >= this.f38589q0 && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f38588p0 && (bArr = this.f38588p0) == null) {
            b();
            throw null;
        }
        int i10 = this.f38589q0;
        int i11 = this.f38592t0;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f38592t0 = i11 + 1;
        return bArr[i11] & 255;
    }

    public synchronized void release() {
        if (this.f38588p0 != null) {
            this.f38593u0.put(this.f38588p0);
            this.f38588p0 = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f38588p0 == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f38591s0;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f38592t0 + " markLimit: " + this.f38590r0);
        }
        this.f38592t0 = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f38588p0;
        if (bArr == null) {
            b();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            b();
            throw null;
        }
        int i10 = this.f38589q0;
        int i11 = this.f38592t0;
        if (i10 - i11 >= j10) {
            this.f38592t0 = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f38592t0 = i10;
        if (this.f38591s0 == -1 || j10 > this.f38590r0) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f38591s0 = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f38589q0;
        int i13 = this.f38592t0;
        if (i12 - i13 >= j10 - j11) {
            this.f38592t0 = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f38592t0 = i12;
        return j12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f38588p0;
        if (bArr2 == null) {
            b();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f38592t0;
            int i15 = this.f38589q0;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f38592t0 += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f38591s0 == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f38588p0 && (bArr2 = this.f38588p0) == null) {
                        b();
                        throw null;
                    }
                    int i17 = this.f38589q0;
                    int i18 = this.f38592t0;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f38592t0 += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            b();
            throw null;
        }
    }
}
