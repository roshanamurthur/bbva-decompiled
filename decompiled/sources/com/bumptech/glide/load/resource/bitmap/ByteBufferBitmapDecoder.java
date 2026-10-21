package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferBitmapDecoder implements ResourceDecoder<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Downsampler f38541a;

    public ByteBufferBitmapDecoder(Downsampler downsampler) {
        this.f38541a = downsampler;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull Options options) throws IOException {
        return this.f38541a.decode(byteBuffer, i10, i11, options);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) {
        return this.f38541a.handles(byteBuffer);
    }
}
