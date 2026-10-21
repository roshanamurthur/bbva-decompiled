package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class InputStreamRewinder implements DataRewinder<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclableBufferedInputStream f38158a;

    public static final class Factory implements DataRewinder.Factory<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayPool f38159a;

        public Factory(ArrayPool arrayPool) {
            this.f38159a = arrayPool;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public Class<InputStream> getDataClass() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.DataRewinder.Factory
        @NonNull
        public DataRewinder<InputStream> build(InputStream inputStream) {
            return new InputStreamRewinder(inputStream, this.f38159a);
        }
    }

    public InputStreamRewinder(InputStream inputStream, ArrayPool arrayPool) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        this.f38158a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.DataRewinder
    public void cleanup() {
        this.f38158a.release();
    }

    public void fixMarkLimits() {
        this.f38158a.fixMarkLimit();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.DataRewinder
    @NonNull
    public InputStream rewindAndGet() throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream = this.f38158a;
        recyclableBufferedInputStream.reset();
        return recyclableBufferedInputStream;
    }
}
