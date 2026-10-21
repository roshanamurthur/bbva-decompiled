package com.facetec.sdk;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class gq extends FilterInputStream {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f41813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[][] f41814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f41815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f41816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f41817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f41818k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f41819l;
    private final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f41820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f41821o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f41822r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f41823t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f41809b = gn.f41786a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f41811d = gn.f41787b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f41808a = gn.f41788c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f41812e = gn.f41790e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f41810c = gn.f41789d;

    public gq(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i10, bArr, bArr2, (byte) 0);
    }

    private void c(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f41813f;
        char c10 = 1;
        int i10 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f41817j;
        iArr[0] = i10 ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i11 = 4;
        int i12 = 1;
        while (i12 < this.f41816i) {
            int[] iArr3 = f41811d;
            int[] iArr4 = this.f41813f;
            byte[][] bArr3 = this.f41814g;
            byte[] bArr4 = bArr3[0];
            int i13 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = f41808a;
            byte[] bArr5 = bArr3[c10];
            int i14 = i13 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = f41812e;
            byte[] bArr6 = bArr3[2];
            int i15 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i14;
            int[] iArr7 = f41810c;
            byte[] bArr7 = bArr3[3];
            int i16 = iArr7[iArr4[bArr7[0]] & 255] ^ i15;
            int[] iArr8 = this.f41817j;
            int i17 = i16 ^ iArr8[i11];
            int i18 = ((iArr6[(iArr4[bArr6[c10]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c10]] >>> 24] ^ iArr5[(iArr4[bArr5[c10]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c10]] & 255]) ^ iArr8[i11 + 1];
            int i19 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i11 + 2];
            int i20 = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i11 + 3];
            iArr4[0] = i17;
            iArr4[1] = i18;
            iArr4[2] = i19;
            iArr4[3] = i20;
            i12++;
            i11 += 4;
            c10 = 1;
        }
        int[] iArr9 = this.f41817j;
        int i21 = iArr9[i11];
        byte[] bArr8 = f41809b;
        int[] iArr10 = this.f41813f;
        byte[][] bArr9 = this.f41814g;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i21 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i21 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i21 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i21);
        int i22 = iArr9[i11 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i22 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[7] = (byte) (i22 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i23 = iArr9[i11 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i23 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[11] = (byte) (i23 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i24 = iArr9[i11 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i24 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[15] = (byte) (i24 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = new byte[bArr[i10].length];
            int i11 = 0;
            while (true) {
                byte[] bArr3 = bArr[i10];
                if (i11 < bArr3.length) {
                    bArr2[i10][bArr3[i11]] = (byte) i11;
                    i11++;
                }
            }
        }
        return bArr2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        d();
        return this.f41823t - this.f41822r;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        d();
        int i10 = this.f41822r;
        if (i10 >= this.f41823t) {
            return -1;
        }
        byte[] bArr = this.m;
        this.f41822r = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private gq(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2, byte b10) {
        super(new BufferedInputStream(inputStream, 4096));
        this.f41813f = new int[4];
        this.f41815h = new byte[16];
        this.m = new byte[16];
        this.f41818k = 1;
        this.f41821o = Integer.MAX_VALUE;
        this.f41822r = 16;
        this.f41823t = 16;
        this.f41816i = i10;
        this.f41817j = gn.b(bArr, i10);
        this.f41814g = d(bArr2);
        this.f41819l = 100;
        this.f41820n = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            d();
            int i14 = this.f41822r;
            if (i14 >= this.f41823t) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.m;
            this.f41822r = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }

    private int d() throws IOException {
        if (this.f41821o == Integer.MAX_VALUE) {
            this.f41821o = ((FilterInputStream) this).in.read();
        }
        if (this.f41822r == 16) {
            byte[] bArr = this.f41815h;
            int i10 = this.f41821o;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.f41815h, i11, 16 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 16);
            if (i11 >= 16) {
                int i13 = this.f41819l;
                if (i13 == this.f41820n) {
                    c(this.f41815h, this.m);
                } else {
                    if (this.f41818k <= i13) {
                        c(this.f41815h, this.m);
                    } else {
                        byte[] bArr2 = this.f41815h;
                        System.arraycopy(bArr2, 0, this.m, 0, bArr2.length);
                    }
                    c();
                }
                int i14 = ((FilterInputStream) this).in.read();
                this.f41821o = i14;
                this.f41822r = 0;
                this.f41823t = i14 < 0 ? 16 - (this.m[15] & 255) : 16;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.f41823t;
    }

    private void c() {
        int i10 = this.f41818k;
        if (i10 < this.f41820n) {
            this.f41818k = i10 + 1;
        } else {
            this.f41818k = 1;
        }
    }
}
