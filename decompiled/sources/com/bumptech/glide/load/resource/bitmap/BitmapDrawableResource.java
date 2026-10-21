package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes9.dex */
public class BitmapDrawableResource extends DrawableResource<BitmapDrawable> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BitmapPool f38535p0;

    public BitmapDrawableResource(BitmapDrawable bitmapDrawable, BitmapPool bitmapPool) {
        super(bitmapDrawable);
        this.f38535p0 = bitmapPool;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public int getSize() {
        return Util.getBitmapByteSize(((BitmapDrawable) this.drawable).getBitmap());
    }

    @Override // com.bumptech.glide.load.resource.drawable.DrawableResource, com.bumptech.glide.load.engine.Initializable
    public void initialize() {
        ((BitmapDrawable) this.drawable).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
        this.f38535p0.put(((BitmapDrawable) this.drawable).getBitmap());
    }
}
