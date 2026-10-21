package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public class Rotate extends BitmapTransformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f38596b = "com.bumptech.glide.load.resource.bitmap.Rotate".getBytes(Key.CHARSET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38597a;

    public Rotate(int i10) {
        this.f38597a = i10;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return (obj instanceof Rotate) && this.f38597a == ((Rotate) obj).f38597a;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(-950519196, Util.hashCode(this.f38597a));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        return TransformationUtils.rotateImage(bitmap, this.f38597a);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f38596b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f38597a).array());
    }
}
