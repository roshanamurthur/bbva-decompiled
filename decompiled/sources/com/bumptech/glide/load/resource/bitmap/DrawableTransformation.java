package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class DrawableTransformation implements Transformation<Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Transformation<Bitmap> f38561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38562b;

    public DrawableTransformation(Transformation<Bitmap> transformation, boolean z10) {
        this.f38561a = transformation;
        this.f38562b = z10;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof DrawableTransformation) {
            return this.f38561a.equals(((DrawableTransformation) obj).f38561a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f38561a.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource<Drawable> transform(@NonNull Context context, @NonNull Resource<Drawable> resource, int i10, int i11) {
        BitmapPool bitmapPool = Glide.get(context).getBitmapPool();
        Drawable drawable = resource.get();
        BitmapResource bitmapResourceA = yc.a.a(bitmapPool, drawable, i10, i11);
        if (bitmapResourceA != null) {
            Resource<Bitmap> resourceTransform = this.f38561a.transform(context, bitmapResourceA, i10, i11);
            if (!resourceTransform.equals(bitmapResourceA)) {
                return LazyBitmapDrawableResource.obtain(context.getResources(), resourceTransform);
            }
            resourceTransform.recycle();
            return resource;
        }
        if (!this.f38562b) {
            return resource;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f38561a.updateDiskCacheKey(messageDigest);
    }

    public Transformation<BitmapDrawable> asBitmapDrawable() {
        return this;
    }
}
