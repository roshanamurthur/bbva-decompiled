package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferRewinder implements DataRewinder<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f38622a;

    public static class Factory implements DataRewinder.Factory<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public DataRewinder<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new ByteBufferRewinder(byteBuffer);
        }
    }

    public ByteBufferRewinder(ByteBuffer byteBuffer) {
        this.f38622a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    public ByteBuffer rewindAndGet() {
        ByteBuffer byteBuffer = this.f38622a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
    }
}
