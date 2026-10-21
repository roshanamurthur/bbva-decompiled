package com.bumptech.glide.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class ContentLengthInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f38899p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f38900q0;

    public ContentLengthInputStream(@NonNull InputStream inputStream, long j10) {
        super(inputStream);
        this.f38899p0 = j10;
    }

    @NonNull
    public static InputStream obtain(@NonNull InputStream inputStream, long j10) {
        return new ContentLengthInputStream(inputStream, j10);
    }

    public final void a(int i10) throws IOException {
        if (i10 >= 0) {
            this.f38900q0 += i10;
            return;
        }
        long j10 = this.f38900q0;
        long j11 = this.f38899p0;
        if (j11 - j10 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j11 + ", but read: " + this.f38900q0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.f38899p0 - ((long) this.f38900q0), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        a(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @NonNull
    public static InputStream obtain(@NonNull InputStream inputStream, @Nullable String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            i10 = -1;
        } else {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i10 = -1;
            }
        }
        return obtain(inputStream, i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        i12 = super.read(bArr, i10, i11);
        a(i12);
        return i12;
    }
}
