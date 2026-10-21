package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes9.dex */
public final class DrawableBytesTranscoder implements ResourceTranscoder<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f38686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceTranscoder<Bitmap, byte[]> f38687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceTranscoder<GifDrawable, byte[]> f38688c;

    public DrawableBytesTranscoder(@NonNull BitmapPool bitmapPool, @NonNull ResourceTranscoder<Bitmap, byte[]> resourceTranscoder, @NonNull ResourceTranscoder<GifDrawable, byte[]> resourceTranscoder2) {
        this.f38686a = bitmapPool;
        this.f38687b = resourceTranscoder;
        this.f38688c = resourceTranscoder2;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource<byte[]> transcode(@NonNull Resource<Drawable> resource, @NonNull Options options) {
        Drawable drawable = resource.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f38687b.transcode(BitmapResource.obtain(((BitmapDrawable) drawable).getBitmap(), this.f38686a), options);
        }
        if (drawable instanceof GifDrawable) {
            return this.f38688c.transcode(resource, options);
        }
        return null;
    }
}
