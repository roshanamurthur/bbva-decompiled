package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes9.dex */
public final class GranularRoundedCorners extends BitmapTransformation {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f38564e = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(Key.CHARSET);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f38568d;

    public GranularRoundedCorners(float f6, float f10, float f11, float f12) {
        this.f38565a = f6;
        this.f38566b = f10;
        this.f38567c = f11;
        this.f38568d = f12;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GranularRoundedCorners)) {
            return false;
        }
        GranularRoundedCorners granularRoundedCorners = (GranularRoundedCorners) obj;
        return this.f38565a == granularRoundedCorners.f38565a && this.f38566b == granularRoundedCorners.f38566b && this.f38567c == granularRoundedCorners.f38567c && this.f38568d == granularRoundedCorners.f38568d;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return Util.hashCode(this.f38568d, Util.hashCode(this.f38567c, Util.hashCode(this.f38566b, Util.hashCode(-2013597734, Util.hashCode(this.f38565a)))));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    public Bitmap transform(@NonNull BitmapPool bitmapPool, @NonNull Bitmap bitmap, int i10, int i11) {
        return TransformationUtils.roundedCorners(bitmapPool, bitmap, this.f38565a, this.f38566b, this.f38567c, this.f38568d);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f38564e);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f38565a).putFloat(this.f38566b).putFloat(this.f38567c).putFloat(this.f38568d).array());
    }
}
