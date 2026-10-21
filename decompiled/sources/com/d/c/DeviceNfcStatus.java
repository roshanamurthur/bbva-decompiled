package com.d.c;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceNfcStatus extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f39255p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final inject f39256q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f39257r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f39258s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f39259t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int[] f39260u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f39261w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f39262x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f39263y0;

    public DeviceNfcStatus(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z10, int i11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f39262x0 = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i10, 3), 16);
        this.f39255p0 = iMin;
        this.f39257r0 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f39258s0 = bArr2;
        this.f39259t0 = new byte[8];
        this.f39260u0 = new int[2];
        this.v0 = 8;
        this.f39261w0 = 8;
        this.f39263y0 = i11;
        if (i11 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f39256q0 = new inject(iArr, iMin, true, z10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        b();
        return this.f39261w0 - this.v0;
    }

    public final void b() throws IOException {
        byte[] bArr;
        if (this.f39262x0 == Integer.MAX_VALUE) {
            this.f39262x0 = ((FilterInputStream) this).in.read();
        }
        if (this.v0 == 8) {
            byte[] bArr2 = this.f39257r0;
            int i10 = this.f39262x0;
            bArr2[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.f39257r0, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                } else {
                    i11 += i12;
                }
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            byte[] bArr3 = this.f39259t0;
            byte[] bArr4 = this.f39257r0;
            int i13 = this.f39263y0;
            if (i13 == 2) {
                System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
            }
            int i14 = ((bArr4[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr4[1] << 16) & 16711680) + ((bArr4[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr4[3] & 255);
            int i15 = (bArr4[7] & 255) + ((-16777216) & (bArr4[4] << 24)) + (16711680 & (bArr4[5] << 16)) + (65280 & (bArr4[6] << 8));
            int i16 = this.f39255p0;
            inject injectVar = this.f39256q0;
            valueOf.getInjectedTransactionParameters(i14, i15, false, i16, injectVar.f39276e, injectVar.f39275c, this.f39260u0);
            int[] iArr = this.f39260u0;
            int i17 = iArr[0];
            int i18 = iArr[1];
            bArr4[0] = (byte) (i17 >> 24);
            bArr4[1] = (byte) (i17 >> 16);
            bArr4[2] = (byte) (i17 >> 8);
            bArr4[3] = (byte) i17;
            bArr4[4] = (byte) (i18 >> 24);
            bArr4[5] = (byte) (i18 >> 16);
            bArr4[6] = (byte) (i18 >> 8);
            bArr4[7] = (byte) i18;
            if (i13 == 2) {
                int i19 = 0;
                while (true) {
                    bArr = this.f39258s0;
                    if (i19 >= 8) {
                        break;
                    }
                    bArr4[i19] = (byte) (bArr[i19] ^ bArr4[i19]);
                    i19++;
                }
                System.arraycopy(bArr3, 0, bArr, 0, bArr3.length);
            }
            int i20 = ((FilterInputStream) this).in.read();
            this.f39262x0 = i20;
            this.v0 = 0;
            this.f39261w0 = i20 < 0 ? 8 - (this.f39257r0[7] & 255) : 8;
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
        if (i10 >= this.f39261w0) {
            return -1;
        }
        this.v0 = i10 + 1;
        return this.f39257r0[i10] & 255;
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
            if (i14 >= this.f39261w0) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            this.v0 = i14 + 1;
            bArr[i13] = this.f39257r0[i14];
        }
        return i11;
    }
}
