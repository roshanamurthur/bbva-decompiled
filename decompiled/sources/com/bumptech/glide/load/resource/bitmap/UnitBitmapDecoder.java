package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes9.dex */
public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {
    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Bitmap bitmap, @NonNull Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@NonNull Bitmap bitmap, int i10, int i11, @NonNull Options options) {
        return new a(bitmap);
    }

    public static final class a implements Resource<Bitmap> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Bitmap f38613p0;

        public a(@NonNull Bitmap bitmap) {
            this.f38613p0 = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public final Bitmap get() {
            return this.f38613p0;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public final Class<Bitmap> getResourceClass() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            return Util.getBitmapByteSize(this.f38613p0);
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void recycle() {
        }
    }
}
