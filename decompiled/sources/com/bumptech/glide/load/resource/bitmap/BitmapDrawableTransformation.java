package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class BitmapDrawableTransformation implements Transformation<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Transformation<Drawable> f38536a;

    public BitmapDrawableTransformation(Transformation<Bitmap> transformation) {
        this.f38536a = (Transformation) Preconditions.checkNotNull(new DrawableTransformation(transformation, false));
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof BitmapDrawableTransformation) {
            return this.f38536a.equals(((BitmapDrawableTransformation) obj).f38536a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.f38536a.hashCode();
    }

    @Override // com.bumptech.glide.load.Transformation
    @NonNull
    public Resource<BitmapDrawable> transform(@NonNull Context context, @NonNull Resource<BitmapDrawable> resource, int i10, int i11) {
        Resource resourceTransform = this.f38536a.transform(context, resource, i10, i11);
        if (resourceTransform.get() instanceof BitmapDrawable) {
            return resourceTransform;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + resourceTransform.get());
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        this.f38536a.updateDiskCacheKey(messageDigest);
    }
}
