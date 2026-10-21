package com.mypinpad.tsdk.isolation;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class setY extends FilterInputStream {
    public int E0;
    public int F0;
    public final int G0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f60841p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f60842q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f60843r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f60844s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final setX f60845t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f60846u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final byte[] f60847w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int[] f60848x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f60849y0;

    public setY(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z10, int i11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f60844s0 = 1;
        this.F0 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i10, 3), 16);
        this.f60841p0 = iMin;
        this.f60846u0 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.v0 = bArr2;
        this.f60847w0 = new byte[8];
        this.f60848x0 = new int[2];
        this.f60849y0 = 8;
        this.E0 = 8;
        this.G0 = i11;
        if (i11 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f60845t0 = new setX(iArr, iMin, true, false);
        this.f60842q0 = 100;
        this.f60843r0 = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        b();
        return this.E0 - this.f60849y0;
    }

    public final void b() throws IOException {
        if (this.F0 == Integer.MAX_VALUE) {
            this.F0 = ((FilterInputStream) this).in.read();
        }
        if (this.f60849y0 == 8) {
            byte[] bArr = this.f60846u0;
            int i10 = this.F0;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.f60846u0, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                } else {
                    i11 += i12;
                }
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.f60842q0;
            if (i13 == this.f60843r0) {
                e();
            } else {
                if (this.f60844s0 <= i13) {
                    e();
                }
                int i14 = this.f60844s0;
                if (i14 < this.f60843r0) {
                    this.f60844s0 = i14 + 1;
                } else {
                    this.f60844s0 = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.F0 = i15;
            this.f60849y0 = 0;
            this.E0 = i15 < 0 ? 8 - (this.f60846u0[7] & 255) : 8;
        }
    }

    public final void e() {
        byte[] bArr = this.f60847w0;
        byte[] bArr2 = this.f60846u0;
        int i10 = this.G0;
        if (i10 == 2) {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        }
        int i11 = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i12 = (bArr2[7] & 255) + ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8));
        int i13 = this.f60841p0;
        setX setx = this.f60845t0;
        setDividerPadding.setY(i11, i12, false, i13, setx.setCompoundDrawableTintBlendMode, setx.setX, this.f60848x0);
        int[] iArr = this.f60848x0;
        int i14 = iArr[0];
        int i15 = iArr[1];
        bArr2[0] = (byte) (i14 >> 24);
        bArr2[1] = (byte) (i14 >> 16);
        bArr2[2] = (byte) (i14 >> 8);
        bArr2[3] = (byte) i14;
        bArr2[4] = (byte) (i15 >> 24);
        bArr2[5] = (byte) (i15 >> 16);
        bArr2[6] = (byte) (i15 >> 8);
        bArr2[7] = (byte) i15;
        if (i10 != 2) {
            return;
        }
        int i16 = 0;
        while (true) {
            byte[] bArr3 = this.v0;
            if (i16 >= 8) {
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                return;
            } else {
                bArr2[i16] = (byte) (bArr3[i16] ^ bArr2[i16]);
                i16++;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        b();
        int i10 = this.f60849y0;
        if (i10 >= this.E0) {
            return -1;
        }
        this.f60849y0 = i10 + 1;
        return this.f60846u0[i10] & 255;
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
            int i14 = this.f60849y0;
            if (i14 >= this.E0) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            this.f60849y0 = i14 + 1;
            bArr[i13] = this.f60846u0[i14];
        }
        return i11;
    }
}
