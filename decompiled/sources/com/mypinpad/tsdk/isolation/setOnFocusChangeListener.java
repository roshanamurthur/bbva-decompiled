package com.mypinpad.tsdk.isolation;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnFocusChangeListener extends FilterInputStream {
    public static final short J0 = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public int I0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f60213p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f60214q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f60215r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f60216s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f60217t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f60218u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f60219w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f60220x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f60221y0;

    public setOnFocusChangeListener(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.v0 = Integer.MAX_VALUE;
        this.I0 = 1;
        this.f60213p0 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f60214q0 = bArr2;
        this.f60215r0 = new byte[8];
        this.f60216s0 = 8;
        this.f60217t0 = 8;
        this.f60218u0 = Math.min(Math.max(i11, 5), 16);
        this.f60219w0 = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        long j10 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i10 == 0) {
            this.f60220x0 = (int) j10;
            long j11 = j10 >> 3;
            long j12 = J0;
            this.f60221y0 = (int) ((j11 * j12) >> 32);
            this.E0 = (int) (j10 >> 32);
            this.F0 = (int) (j11 + j12);
        } else {
            int i13 = (int) j10;
            this.f60220x0 = i13;
            this.f60221y0 = i13 * i10;
            this.E0 = i10 ^ i13;
            this.F0 = (int) (j10 >> 32);
        }
        this.G0 = 100;
        this.H0 = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        b();
        return this.f60217t0 - this.f60216s0;
    }

    public final void b() throws IOException {
        if (this.v0 == Integer.MAX_VALUE) {
            this.v0 = ((FilterInputStream) this).in.read();
        }
        if (this.f60216s0 == 8) {
            byte[] bArr = this.f60213p0;
            int i10 = this.v0;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.f60213p0, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                } else {
                    i11 += i12;
                }
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.G0;
            if (i13 == this.H0) {
                setCompoundDrawableTintBlendMode();
            } else {
                if (this.I0 <= i13) {
                    setCompoundDrawableTintBlendMode();
                }
                int i14 = this.I0;
                if (i14 < this.H0) {
                    this.I0 = i14 + 1;
                } else {
                    this.I0 = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.v0 = i15;
            this.f60216s0 = 0;
            this.f60217t0 = i15 < 0 ? 8 - (this.f60213p0[7] & 255) : 8;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        b();
        int i10 = this.f60216s0;
        if (i10 >= this.f60217t0) {
            return -1;
        }
        this.f60216s0 = i10 + 1;
        return this.f60213p0[i10] & 255;
    }

    public final void setCompoundDrawableTintBlendMode() {
        byte[] bArr = this.f60215r0;
        byte[] bArr2 = this.f60213p0;
        int i10 = this.f60219w0;
        if (i10 == 3) {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        int i11 = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = 0;
        while (true) {
            int i14 = this.f60218u0;
            if (i13 >= i14) {
                break;
            }
            short s4 = J0;
            i12 -= ((((i14 - i13) * s4) + i11) ^ ((i11 << 4) + this.E0)) ^ ((i11 >>> 5) + this.F0);
            i11 -= (((i12 << 4) + this.f60220x0) ^ (((i14 - i13) * s4) + i12)) ^ ((i12 >>> 5) + this.f60221y0);
            i13++;
        }
        bArr2[0] = (byte) (i11 >> 24);
        bArr2[1] = (byte) (i11 >> 16);
        bArr2[2] = (byte) (i11 >> 8);
        bArr2[3] = (byte) i11;
        bArr2[4] = (byte) (i12 >> 24);
        bArr2[5] = (byte) (i12 >> 16);
        bArr2[6] = (byte) (i12 >> 8);
        bArr2[7] = (byte) i12;
        if (i10 != 3) {
            return;
        }
        int i15 = 0;
        while (true) {
            byte[] bArr3 = this.f60214q0;
            if (i15 >= 8) {
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                return;
            } else {
                bArr2[i15] = (byte) (bArr3[i15] ^ bArr2[i15]);
                i15++;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            b();
            int i14 = this.f60216s0;
            if (i14 >= this.f60217t0) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            this.f60216s0 = i14 + 1;
            bArr[i13] = this.f60213p0[i14];
        }
        return i11;
    }
}
