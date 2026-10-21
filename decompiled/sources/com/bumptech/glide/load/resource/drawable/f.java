package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: NonOwnedDrawableResource.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f extends DrawableResource<Drawable> {
    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public final Class<Drawable> getResourceClass() {
        return this.drawable.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return Math.max(1, this.drawable.getIntrinsicHeight() * this.drawable.getIntrinsicWidth() * 4);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
    }
}
