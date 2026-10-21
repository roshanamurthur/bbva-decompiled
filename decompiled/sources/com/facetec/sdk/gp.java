package com.facetec.sdk;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class gp extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f41795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private gi f41799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f41800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f41802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f41803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f41804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f41806l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41807o;

    public gp(InputStream inputStream, int[] iArr, byte[] bArr, int i10, boolean z10, int i11) throws IOException {
        this(inputStream, iArr, bArr, i10, i11);
    }

    private void a() {
        if (this.f41806l == 2) {
            byte[] bArr = this.f41800f;
            System.arraycopy(bArr, 0, this.f41804j, 0, bArr.length);
        }
        byte[] bArr2 = this.f41800f;
        int i10 = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = this.f41797c;
        gi giVar = this.f41799e;
        gr.b(i10, i11, false, i12, giVar.f41782d, giVar.f41783e, this.f41802h);
        int[] iArr = this.f41802h;
        int i13 = iArr[0];
        int i14 = iArr[1];
        byte[] bArr3 = this.f41800f;
        bArr3[0] = (byte) (i13 >> 24);
        bArr3[1] = (byte) (i13 >> 16);
        bArr3[2] = (byte) (i13 >> 8);
        bArr3[3] = (byte) i13;
        bArr3[4] = (byte) (i14 >> 24);
        bArr3[5] = (byte) (i14 >> 16);
        bArr3[6] = (byte) (i14 >> 8);
        bArr3[7] = (byte) i14;
        if (this.f41806l == 2) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.f41800f;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.f41803i[i15]);
            }
            byte[] bArr5 = this.f41804j;
            System.arraycopy(bArr5, 0, this.f41803i, 0, bArr5.length);
        }
    }

    private int b() throws IOException {
        if (this.f41807o == Integer.MAX_VALUE) {
            this.f41807o = ((FilterInputStream) this).in.read();
        }
        if (this.f41801g == 8) {
            byte[] bArr = this.f41800f;
            int i10 = this.f41807o;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.f41800f, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.f41795a;
            if (i13 == this.f41796b) {
                a();
            } else {
                if (this.f41798d <= i13) {
                    a();
                }
                e();
            }
            int i14 = ((FilterInputStream) this).in.read();
            this.f41807o = i14;
            this.f41801g = 0;
            this.f41805k = i14 < 0 ? 8 - (this.f41800f[7] & 255) : 8;
        }
        return this.f41805k;
    }

    private void e() {
        int i10 = this.f41798d;
        if (i10 < this.f41796b) {
            this.f41798d = i10 + 1;
        } else {
            this.f41798d = 1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        b();
        return this.f41805k - this.f41801g;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        b();
        int i10 = this.f41801g;
        if (i10 >= this.f41805k) {
            return -1;
        }
        byte[] bArr = this.f41800f;
        this.f41801g = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private gp(InputStream inputStream, int[] iArr, byte[] bArr, int i10, int i11) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.f41798d = 1;
        this.f41807o = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i10, 3), 16);
        this.f41797c = iMin;
        this.f41800f = new byte[8];
        byte[] bArr2 = new byte[8];
        this.f41803i = bArr2;
        this.f41804j = new byte[8];
        this.f41802h = new int[2];
        this.f41801g = 8;
        this.f41805k = 8;
        this.f41806l = i11;
        if (i11 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.f41799e = new gi(iArr, iMin, true, false);
        this.f41795a = 100;
        this.f41796b = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            b();
            int i14 = this.f41801g;
            if (i14 >= this.f41805k) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.f41800f;
            this.f41801g = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
