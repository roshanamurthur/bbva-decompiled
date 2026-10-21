package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public final class RoundedCorners extends BitmapTransformation {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f38598b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.CHARSET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38599a;

    public RoundedCorners(int i10) {
        Preconditions.checkArgument(i10 > 0, "roundingRadius must be greater than 0.");
        this.f38599a = i10;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        return (obj instanceof RoundedCorners) && this.f38599a == ((RoundedCorners) obj).f38599a;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(-569625254, Util.hashCode(this.f38599a));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        return TransformationUtils.roundedCorners(bitmapPool, bitmap, this.f38599a);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f38598b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f38599a).array());
    }
}
