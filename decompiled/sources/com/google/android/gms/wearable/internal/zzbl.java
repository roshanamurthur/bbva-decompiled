package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class zzbl extends OutputStream {

    @Nullable
    private volatile zzav zzcw;
    private final OutputStream zzcy;

    public zzbl(OutputStream outputStream) {
        this.zzcy = (OutputStream) Preconditions.checkNotNull(outputStream);
    }

    private final IOException zza(IOException iOException) {
        zzav zzavVar = this.zzcw;
        return zzavVar != null ? new ChannelIOException("Channel closed unexpectedly before stream was finished", zzavVar.zzg, zzavVar.zzcj) : iOException;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.zzcy.close();
        } catch (IOException e5) {
            throw zza(e5);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.zzcy.flush();
        } catch (IOException e5) {
            throw zza(e5);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        try {
            this.zzcy.write(bArr);
        } catch (IOException e5) {
            throw zza(e5);
        }
    }

    public final void zzc(zzav zzavVar) {
        this.zzcw = zzavVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            this.zzcy.write(bArr, i10, i11);
        } catch (IOException e5) {
            throw zza(e5);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        try {
            this.zzcy.write(i10);
        } catch (IOException e5) {
            throw zza(e5);
        }
    }
}
