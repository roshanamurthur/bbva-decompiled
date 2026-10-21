package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbj extends InputStream {
    private final InputStream zzcv;

    @Nullable
    private volatile zzav zzcw;

    public zzbj(InputStream inputStream) {
        this.zzcv = (InputStream) Preconditions.checkNotNull(inputStream);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zzcv.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzcv.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.zzcv.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zzcv.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return zza(this.zzcv.read());
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.zzcv.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        return this.zzcv.skip(j10);
    }

    public final void zza(zzav zzavVar) {
        this.zzcw = (zzav) Preconditions.checkNotNull(zzavVar);
    }

    private final int zza(int i10) throws ChannelIOException {
        zzav zzavVar;
        if (i10 != -1 || (zzavVar = this.zzcw) == null) {
            return i10;
        }
        throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzavVar.zzg, zzavVar.zzcj);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return zza(this.zzcv.read(bArr));
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return zza(this.zzcv.read(bArr, i10, i11));
    }
}
