package com.d.c;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class setInjectedTransactionParameters extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f39277p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long[] f39278q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final long[] f39279r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public short f39280s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f39281t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f39282u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f39283w0;

    public setInjectedTransactionParameters(InputStream inputStream, int i10, int i11, short s4, int i12, int i13) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f39282u0 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s4, 4), 8);
        this.f39277p0 = iMin;
        this.f39281t0 = new byte[iMin];
        this.f39278q0 = new long[4];
        this.f39279r0 = new long[4];
        this.v0 = iMin;
        this.f39283w0 = iMin;
        this.f39278q0 = ExampleApp.a(i10 ^ i13, iMin ^ i13);
        this.f39279r0 = ExampleApp.a(i11 ^ i13, i12 ^ i13);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        b();
        return this.f39283w0 - this.v0;
    }

    public final void b() throws IOException {
        int i10;
        if (this.f39282u0 == Integer.MAX_VALUE) {
            this.f39282u0 = ((FilterInputStream) this).in.read();
        }
        if (this.v0 == this.f39277p0) {
            byte[] bArr = this.f39281t0;
            int i11 = this.f39282u0;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.f39281t0, i12, this.f39277p0 - i12);
                if (i13 <= 0) {
                    break;
                } else {
                    i12 += i13;
                }
            } while (i12 < this.f39277p0);
            if (i12 < this.f39277p0) {
                throw new IllegalStateException("unexpected block size");
            }
            short s4 = this.f39280s0;
            long[] jArr = this.f39278q0;
            long j10 = jArr[s4 % 4] * 2147483085;
            long[] jArr2 = this.f39279r0;
            long j11 = jArr2[(s4 + 2) % 4];
            int i14 = (s4 + 3) % 4;
            jArr2[i14] = ((jArr[i14] * 2147483085) + j11) / 2147483647L;
            jArr[i14] = (j10 + j11) % 2147483647L;
            for (int i15 = 0; i15 < this.f39277p0; i15++) {
                byte[] bArr2 = this.f39281t0;
                bArr2[i15] = (byte) (((long) bArr2[i15]) ^ ((jArr[this.f39280s0] >> (i15 << 3)) & 255));
            }
            this.f39280s0 = (short) ((this.f39280s0 + 1) % 4);
            int i16 = ((FilterInputStream) this).in.read();
            this.f39282u0 = i16;
            this.v0 = 0;
            if (i16 < 0) {
                int i17 = this.f39277p0;
                i10 = i17 - (this.f39281t0[i17 - 1] & 255);
            } else {
                i10 = this.f39277p0;
            }
            this.f39283w0 = i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        b();
        int i10 = this.v0;
        if (i10 >= this.f39283w0) {
            return -1;
        }
        this.v0 = i10 + 1;
        return this.f39281t0[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            b();
            int i14 = this.v0;
            if (i14 >= this.f39283w0) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            this.v0 = i14 + 1;
            bArr[i13] = this.f39281t0[i14];
        }
        return i11;
    }
}
