package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.g0;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class ExifOrientationStream extends FilterInputStream {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f38148r0 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, MessageUtils.MESSAGE_18_DC2, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f38149s0 = 31;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte f38150p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f38151q0;

    public ExifOrientationStream(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(g0.c("Cannot add invalid orientation: ", i10));
        }
        this.f38150p0 = (byte) i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11;
        int i12 = this.f38151q0;
        if (i12 < 2 || i12 > (i11 = f38149s0)) {
            i10 = super.read();
        } else {
            i10 = i12 == i11 ? this.f38150p0 : f38148r0[i12 - 2] & 255;
        }
        if (i10 != -1) {
            this.f38151q0++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f38151q0 = (int) (((long) this.f38151q0) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f38151q0;
        int i14 = f38149s0;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f38150p0;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f38148r0, this.f38151q0 - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f38151q0 += i12;
        }
        return i12;
    }
}
