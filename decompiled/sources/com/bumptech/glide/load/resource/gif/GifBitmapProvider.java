package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/* JADX INFO: loaded from: classes9.dex */
public final class GifBitmapProvider implements GifDecoder.BitmapProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPool f38644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ArrayPool f38645b;

    public GifBitmapProvider(BitmapPool bitmapPool) {
        this(bitmapPool, null);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @NonNull
    public Bitmap obtain(int i10, int i11, @NonNull Bitmap.Config config) {
        return this.f38644a.getDirty(i10, i11, config);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @NonNull
    public byte[] obtainByteArray(int i10) {
        ArrayPool arrayPool = this.f38645b;
        return arrayPool == null ? new byte[i10] : (byte[]) arrayPool.get(i10, byte[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    @NonNull
    public int[] obtainIntArray(int i10) {
        ArrayPool arrayPool = this.f38645b;
        return arrayPool == null ? new int[i10] : (int[]) arrayPool.get(i10, int[].class);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@NonNull Bitmap bitmap) {
        this.f38644a.put(bitmap);
    }

    public GifBitmapProvider(BitmapPool bitmapPool, @Nullable ArrayPool arrayPool) {
        this.f38644a = bitmapPool;
        this.f38645b = arrayPool;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@NonNull byte[] bArr) {
        ArrayPool arrayPool = this.f38645b;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(bArr);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
    public void release(@NonNull int[] iArr) {
        ArrayPool arrayPool = this.f38645b;
        if (arrayPool == null) {
            return;
        }
        arrayPool.put(iArr);
    }
}
