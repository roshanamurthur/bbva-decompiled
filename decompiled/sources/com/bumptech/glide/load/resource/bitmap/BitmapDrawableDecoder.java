package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class BitmapDrawableDecoder<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceDecoder<DataType, Bitmap> f38531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f38532b;

    public BitmapDrawableDecoder(Context context, ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        this(context.getResources(), resourceDecoder);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<BitmapDrawable> decode(@NonNull DataType datatype, int i10, int i11, @NonNull Options options) throws IOException {
        return LazyBitmapDrawableResource.obtain(this.f38532b, this.f38531a.decode(datatype, i10, i11, options));
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull DataType datatype, @NonNull Options options) throws IOException {
        return this.f38531a.handles(datatype, options);
    }

    @Deprecated
    public BitmapDrawableDecoder(Resources resources, BitmapPool bitmapPool, ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        this(resources, resourceDecoder);
    }

    public BitmapDrawableDecoder(@NonNull Resources resources, @NonNull ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        this.f38532b = (Resources) Preconditions.checkNotNull(resources);
        this.f38531a = (ResourceDecoder) Preconditions.checkNotNull(resourceDecoder);
    }
}
