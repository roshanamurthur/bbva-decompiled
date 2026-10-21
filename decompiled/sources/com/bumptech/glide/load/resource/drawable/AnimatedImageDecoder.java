package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(28)
public final class AnimatedImageDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f38624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayPool f38625b;

    public static final class a implements Resource<Drawable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AnimatedImageDrawable f38626p0;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f38626p0 = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public final Drawable get() {
            return this.f38626p0;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public final Class<Drawable> getResourceClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            AnimatedImageDrawable animatedImageDrawable = this.f38626p0;
            return Util.getBytesPerPixel(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void recycle() {
            AnimatedImageDrawable animatedImageDrawable = this.f38626p0;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }
    }

    public static final class b implements ResourceDecoder<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedImageDecoder f38627a;

        public b(AnimatedImageDecoder animatedImageDecoder) {
            this.f38627a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource<Drawable> decode(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull Options options) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(byteBuffer);
            this.f38627a.getClass();
            return AnimatedImageDecoder.a(sourceCreateSource, i10, i11, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
            ImageHeaderParser.ImageType type = ImageHeaderParserUtils.getType(this.f38627a.f38624a, byteBuffer);
            return type == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && type == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }
    }

    public static final class c implements ResourceDecoder<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedImageDecoder f38628a;

        public c(AnimatedImageDecoder animatedImageDecoder) {
            this.f38628a = animatedImageDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource<Drawable> decode(@NonNull InputStream inputStream, int i10, int i11, @NonNull Options options) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(ByteBufferUtil.fromStream(inputStream));
            this.f38628a.getClass();
            return AnimatedImageDecoder.a(sourceCreateSource, i10, i11, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean handles(@NonNull InputStream inputStream, @NonNull Options options) throws IOException {
            AnimatedImageDecoder animatedImageDecoder = this.f38628a;
            ImageHeaderParser.ImageType type = ImageHeaderParserUtils.getType(animatedImageDecoder.f38624a, inputStream, animatedImageDecoder.f38625b);
            return type == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && type == ImageHeaderParser.ImageType.ANIMATED_AVIF);
        }
    }

    public AnimatedImageDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        this.f38624a = list;
        this.f38625b = arrayPool;
    }

    public static a a(@NonNull ImageDecoder.Source source, int i10, int i11, @NonNull Options options) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i10, i11, options));
        if (com.bumptech.glide.load.resource.drawable.b.a(drawableDecodeDrawable)) {
            return new a(j.b(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }

    public static ResourceDecoder<ByteBuffer, Drawable> byteBufferDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new b(new AnimatedImageDecoder(list, arrayPool));
    }

    public static ResourceDecoder<InputStream, Drawable> streamDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new c(new AnimatedImageDecoder(list, arrayPool));
    }
}
