package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes9.dex */
public class BitmapResource implements Resource<Bitmap>, Initializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Bitmap f38539p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BitmapPool f38540q0;

    public BitmapResource(@NonNull Bitmap bitmap, @NonNull BitmapPool bitmapPool) {
        this.f38539p0 = (Bitmap) Preconditions.checkNotNull(bitmap, "Bitmap must not be null");
        this.f38540q0 = (BitmapPool) Preconditions.checkNotNull(bitmapPool, "BitmapPool must not be null");
    }

    @Nullable
    public static BitmapResource obtain(@Nullable Bitmap bitmap, @NonNull BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, bitmapPool);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return Util.getBitmapByteSize(this.f38539p0);
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        this.f38539p0.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        this.f38540q0.put(this.f38539p0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Bitmap get() {
        return this.f38539p0;
    }
}
