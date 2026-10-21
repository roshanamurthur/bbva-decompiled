package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(api = 28)
public final class BitmapImageDecoderResourceDecoder implements ResourceDecoder<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapPoolAdapter f38538a = new BitmapPoolAdapter();

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ Resource<Bitmap> decode(@NonNull ImageDecoder.Source source, int i10, int i11, @NonNull Options options) throws IOException {
        return decode2(m2.a.a(source), i10, i11, options);
    }

    /* JADX INFO: renamed from: handles, reason: avoid collision after fix types in other method */
    public boolean handles2(@NonNull ImageDecoder.Source source, @NonNull Options options) throws IOException {
        return true;
    }

    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public Resource<Bitmap> decode2(@NonNull ImageDecoder.Source source, int i10, int i11, @NonNull Options options) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new DefaultOnHeaderDecodedListener(i10, i11, options));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new BitmapResource(bitmapDecodeBitmap, this.f38538a);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public /* bridge */ /* synthetic */ boolean handles(@NonNull ImageDecoder.Source source, @NonNull Options options) throws IOException {
        return handles2(m2.a.a(source), options);
    }
}
