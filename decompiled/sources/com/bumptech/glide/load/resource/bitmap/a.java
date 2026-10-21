package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: VideoDecoder.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f38621p0;

    public a(ByteBuffer byteBuffer) {
        this.f38621p0 = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f38621p0.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBuffer = this.f38621p0;
        if (j10 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j10);
        int iMin = Math.min(i11, byteBuffer.remaining());
        byteBuffer.get(bArr, i10, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
