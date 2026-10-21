package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.ExceptionPassthroughInputStream;
import com.bumptech.glide.util.MarkEnforcingInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class StreamBitmapDecoder implements ResourceDecoder<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Downsampler f38600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayPool f38601b;

    public static class a implements Downsampler.DecodeCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclableBufferedInputStream f38602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExceptionPassthroughInputStream f38603b;

        public a(RecyclableBufferedInputStream recyclableBufferedInputStream, ExceptionPassthroughInputStream exceptionPassthroughInputStream) {
            this.f38602a = recyclableBufferedInputStream;
            this.f38603b = exceptionPassthroughInputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void onDecodeComplete(BitmapPool bitmapPool, Bitmap bitmap) throws IOException {
            IOException exception = this.f38603b.getException();
            if (exception != null) {
                if (bitmap == null) {
                    throw exception;
                }
                bitmapPool.put(bitmap);
                throw exception;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeCallbacks
        public final void onObtainBounds() {
            this.f38602a.fixMarkLimit();
        }
    }

    public StreamBitmapDecoder(Downsampler downsampler, ArrayPool arrayPool) {
        this.f38600a = downsampler;
        this.f38601b = arrayPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@NonNull InputStream inputStream, int i10, int i11, @NonNull Options options) throws IOException {
        boolean z10;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z10 = false;
        } else {
            z10 = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f38601b);
        }
        ExceptionPassthroughInputStream exceptionPassthroughInputStreamObtain = ExceptionPassthroughInputStream.obtain(recyclableBufferedInputStream);
        try {
            return this.f38600a.decode(new MarkEnforcingInputStream(exceptionPassthroughInputStreamObtain), i10, i11, options, new a(recyclableBufferedInputStream, exceptionPassthroughInputStreamObtain));
        } finally {
            exceptionPassthroughInputStreamObtain.release();
            if (z10) {
                recyclableBufferedInputStream.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull InputStream inputStream, @NonNull Options options) {
        return this.f38600a.handles(inputStream);
    }
}
