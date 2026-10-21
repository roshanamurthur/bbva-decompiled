package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
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
@Deprecated
public final class AnimatedWebpDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f38629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayPool f38630b;

    public static final class a implements Resource<Drawable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AnimatedImageDrawable f38631p0;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.f38631p0 = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public final Drawable get() {
            return this.f38631p0;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        @NonNull
        public final Class<Drawable> getResourceClass() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            AnimatedImageDrawable animatedImageDrawable = this.f38631p0;
            return Util.getBytesPerPixel(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void recycle() {
            AnimatedImageDrawable animatedImageDrawable = this.f38631p0;
            animatedImageDrawable.stop();
            animatedImageDrawable.clearAnimationCallbacks();
        }
    }

    public static final class b implements ResourceDecoder<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedWebpDecoder f38632a;

        public b(AnimatedWebpDecoder animatedWebpDecoder) {
            this.f38632a = animatedWebpDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource<Drawable> decode(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull Options options) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(byteBuffer);
            this.f38632a.getClass();
            return AnimatedWebpDecoder.a(sourceCreateSource, i10, i11, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
            return ImageHeaderParserUtils.getType(this.f38632a.f38629a, byteBuffer) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }
    }

    public static final class c implements ResourceDecoder<InputStream, Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedWebpDecoder f38633a;

        public c(AnimatedWebpDecoder animatedWebpDecoder) {
            this.f38633a = animatedWebpDecoder;
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final Resource<Drawable> decode(@NonNull InputStream inputStream, int i10, int i11, @NonNull Options options) throws IOException {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(ByteBufferUtil.fromStream(inputStream));
            this.f38633a.getClass();
            return AnimatedWebpDecoder.a(sourceCreateSource, i10, i11, options);
        }

        @Override // com.bumptech.glide.load.ResourceDecoder
        public final boolean handles(@NonNull InputStream inputStream, @NonNull Options options) throws IOException {
            AnimatedWebpDecoder animatedWebpDecoder = this.f38633a;
            return ImageHeaderParserUtils.getType(animatedWebpDecoder.f38629a, inputStream, animatedWebpDecoder.f38630b) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }
    }

    public AnimatedWebpDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        this.f38629a = list;
        this.f38630b = arrayPool;
    }

    public static a a(@NonNull ImageDecoder.Source source, int i10, int i11, @NonNull Options options) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i10, i11, options));
        if (com.bumptech.glide.load.resource.drawable.b.a(drawableDecodeDrawable)) {
            return new a(j.b(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    public static ResourceDecoder<ByteBuffer, Drawable> byteBufferDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new b(new AnimatedWebpDecoder(list, arrayPool));
    }

    public static ResourceDecoder<InputStream, Drawable> streamDecoder(List<ImageHeaderParser> list, ArrayPool arrayPool) {
        return new c(new AnimatedWebpDecoder(list, arrayPool));
    }
}
