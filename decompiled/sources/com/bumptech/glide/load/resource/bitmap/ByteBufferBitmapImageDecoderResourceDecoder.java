package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 28)
public final class ByteBufferBitmapImageDecoderResourceDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapImageDecoderResourceDecoder f38542a = new BitmapImageDecoderResourceDecoder();

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull Options options) throws IOException {
        return this.f38542a.decode2(ImageDecoder.createSource(byteBuffer), i10, i11, options);
    }
}
