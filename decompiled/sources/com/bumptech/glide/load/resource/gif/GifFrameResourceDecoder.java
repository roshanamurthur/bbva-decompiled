package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;

/* JADX INFO: loaded from: classes9.dex */
public final class GifFrameResourceDecoder implements ResourceDecoder<GifDecoder, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f38679a;

    public GifFrameResourceDecoder(BitmapPool bitmapPool) {
        this.f38679a = bitmapPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull GifDecoder gifDecoder, @NonNull Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@NonNull GifDecoder gifDecoder, int i10, int i11, @NonNull Options options) {
        return BitmapResource.obtain(gifDecoder.getNextFrame(), this.f38679a);
    }
}
