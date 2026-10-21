package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;

/* JADX INFO: loaded from: classes9.dex */
public class ResourceBitmapDecoder implements ResourceDecoder<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceDrawableDecoder f38594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapPool f38595b;

    public ResourceBitmapDecoder(ResourceDrawableDecoder resourceDrawableDecoder, BitmapPool bitmapPool) {
        this.f38594a = resourceDrawableDecoder;
        this.f38595b = bitmapPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    @Nullable
    public Resource<Bitmap> decode(@NonNull Uri uri, int i10, int i11, @NonNull Options options) {
        Resource<Drawable> resourceDecode = this.f38594a.decode(uri, i10, i11, options);
        if (resourceDecode == null) {
            return null;
        }
        return yc.a.a(this.f38595b, resourceDecode.get(), i10, i11);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Uri uri, @NonNull Options options) {
        return "android.resource".equals(uri.getScheme());
    }
}
