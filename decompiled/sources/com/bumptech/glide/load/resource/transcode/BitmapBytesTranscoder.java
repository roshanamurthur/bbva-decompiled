package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class BitmapBytesTranscoder implements ResourceTranscoder<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f38683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38684b;

    public BitmapBytesTranscoder() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource<byte[]> transcode(@NonNull Resource<Bitmap> resource, @NonNull Options options) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        resource.get().compress(this.f38683a, this.f38684b, byteArrayOutputStream);
        resource.recycle();
        return new BytesResource(byteArrayOutputStream.toByteArray());
    }

    public BitmapBytesTranscoder(@NonNull Bitmap.CompressFormat compressFormat, int i10) {
        this.f38683a = compressFormat;
        this.f38684b = i10;
    }
}
