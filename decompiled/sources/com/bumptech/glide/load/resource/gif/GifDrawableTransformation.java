package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class GifDrawableTransformation implements Transformation<GifDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Transformation<Bitmap> f38656a;

    public GifDrawableTransformation(Transformation<Bitmap> transformation) {
        this.f38656a = (Transformation) Preconditions.checkNotNull(transformation);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof GifDrawableTransformation) {
            return this.f38656a.equals(((GifDrawableTransformation) obj).f38656a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f38656a.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource<GifDrawable> transform(@NonNull Context context, @NonNull Resource<GifDrawable> resource, int i10, int i11) {
        GifDrawable gifDrawable = resource.get();
        BitmapResource bitmapResource = new BitmapResource(gifDrawable.getFirstFrame(), Glide.get(context).getBitmapPool());
        Transformation<Bitmap> transformation = this.f38656a;
        Resource<Bitmap> resourceTransform = transformation.transform(context, bitmapResource, i10, i11);
        if (!bitmapResource.equals(resourceTransform)) {
            bitmapResource.recycle();
        }
        gifDrawable.setFrameTransformation(transformation, resourceTransform.get());
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f38656a.updateDiskCacheKey(messageDigest);
    }
}
