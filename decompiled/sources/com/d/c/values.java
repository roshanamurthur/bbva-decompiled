package com.d.c;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class values extends FilterInputStream {
    public static final short G0 = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    public final int E0;
    public final int F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f39284p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f39285q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f39286r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f39287s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f39288t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f39289u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f39290w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f39291x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f39292y0;

    public values(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.v0 = Integer.MAX_VALUE;
        this.f39284p0 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f39285q0 = bArr2;
        this.f39286r0 = new byte[8];
        this.f39287s0 = 8;
        this.f39288t0 = 8;
        this.f39289u0 = Math.min(Math.max(i11, 5), 16);
        this.f39290w0 = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        long j10 = ((((long) iArr[0]) & 4294967295L) << 32) | (4294967295L & ((long) iArr[1]));
        if (i10 != 0) {
            int i13 = (int) j10;
            this.f39291x0 = i13;
            this.f39292y0 = i13 * i10;
            this.E0 = i13 ^ i10;
            this.F0 = (int) (j10 >> 32);
            return;
        }
        this.f39291x0 = (int) j10;
        long j11 = j10 >> 3;
        short s4 = G0;
        this.f39292y0 = (int) ((((long) s4) * j11) >> 32);
        this.E0 = (int) (j10 >> 32);
        this.F0 = (int) (j11 + ((long) s4));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        b();
        return this.f39288t0 - this.f39287s0;
    }

    public final void b() throws IOException {
        byte[] bArr;
        if (this.v0 == Integer.MAX_VALUE) {
            this.v0 = ((FilterInputStream) this).in.read();
        }
        if (this.f39287s0 == 8) {
            byte[] bArr2 = this.f39284p0;
            int i10 = this.v0;
            bArr2[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.f39284p0, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                } else {
                    i11 += i12;
                }
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            byte[] bArr3 = this.f39286r0;
            byte[] bArr4 = this.f39284p0;
            int i13 = this.f39290w0;
            if (i13 == 3) {
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            int i14 = ((bArr4[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr4[1] << 16) & 16711680) + ((bArr4[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr4[3] & 255);
            int i15 = ((-16777216) & (bArr4[4] << 24)) + (16711680 & (bArr4[5] << 16)) + (65280 & (bArr4[6] << 8)) + (bArr4[7] & 255);
            int i16 = 0;
            while (true) {
                int i17 = this.f39289u0;
                if (i16 >= i17) {
                    break;
                }
                int i18 = (i17 - i16) * G0;
                i15 -= ((i18 + i14) ^ ((i14 << 4) + this.E0)) ^ ((i14 >>> 5) + this.F0);
                i14 -= ((i18 + i15) ^ ((i15 << 4) + this.f39291x0)) ^ ((i15 >>> 5) + this.f39292y0);
                i16++;
            }
            bArr4[0] = (byte) (i14 >> 24);
            bArr4[1] = (byte) (i14 >> 16);
            bArr4[2] = (byte) (i14 >> 8);
            bArr4[3] = (byte) i14;
            bArr4[4] = (byte) (i15 >> 24);
            bArr4[5] = (byte) (i15 >> 16);
            bArr4[6] = (byte) (i15 >> 8);
            bArr4[7] = (byte) i15;
            if (i13 == 3) {
                int i19 = 0;
                while (true) {
                    bArr = this.f39285q0;
                    if (i19 >= 8) {
                        break;
                    }
                    bArr4[i19] = (byte) (bArr[i19] ^ bArr4[i19]);
                    i19++;
                }
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            }
            int i20 = ((FilterInputStream) this).in.read();
            this.v0 = i20;
            this.f39287s0 = 0;
            this.f39288t0 = i20 < 0 ? 8 - (this.f39284p0[7] & 255) : 8;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        b();
        int i10 = this.f39287s0;
        if (i10 >= this.f39288t0) {
            return -1;
        }
        this.f39287s0 = i10 + 1;
        return this.f39284p0[i10] & 255;
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
            int i14 = this.f39287s0;
            if (i14 >= this.f39288t0) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            this.f39287s0 = i14 + 1;
            bArr[i13] = this.f39284p0[i14];
        }
        return i11;
    }
}
