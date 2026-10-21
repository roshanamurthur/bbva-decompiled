package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyBitmapDrawableResource implements Resource<BitmapDrawable>, Initializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Resources f38585p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Resource<Bitmap> f38586q0;

    public LazyBitmapDrawableResource(@NonNull Resources resources, @NonNull Resource<Bitmap> resource) {
        this.f38585p0 = (Resources) Preconditions.checkNotNull(resources);
        this.f38586q0 = (Resource) Preconditions.checkNotNull(resource);
    }

    @Deprecated
    public static LazyBitmapDrawableResource obtain(Context context, Bitmap bitmap) {
        return (LazyBitmapDrawableResource) obtain(context.getResources(), BitmapResource.obtain(bitmap, Glide.get(context).getBitmapPool()));
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return this.f38586q0.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        Resource<Bitmap> resource = this.f38586q0;
        if (resource instanceof Initializable) {
            ((Initializable) resource).initialize();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        this.f38586q0.recycle();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f38585p0, this.f38586q0.get());
    }

    @Deprecated
    public static LazyBitmapDrawableResource obtain(Resources resources, BitmapPool bitmapPool, Bitmap bitmap) {
        return (LazyBitmapDrawableResource) obtain(resources, BitmapResource.obtain(bitmap, bitmapPool));
    }

    @Nullable
    public static Resource<BitmapDrawable> obtain(@NonNull Resources resources, @Nullable Resource<Bitmap> resource) {
        if (resource == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(resources, resource);
    }
}
