package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
public class ByteBufferGifDecoder implements ResourceDecoder<ByteBuffer, GifDrawable> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f38636f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f38637g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ImageHeaderParser> f38639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f38640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f38641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GifBitmapProvider f38642e;

    @VisibleForTesting
    public static class a {
    }

    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue<GifHeaderParser> f38643a = Util.createQueue(0);

        public final synchronized void a(GifHeaderParser gifHeaderParser) {
            gifHeaderParser.clear();
            this.f38643a.offer(gifHeaderParser);
        }
    }

    @VisibleForTesting
    public ByteBufferGifDecoder() {
        throw null;
    }

    public ByteBufferGifDecoder(Context context) {
        this(context, Glide.get(context).getRegistry().getImageHeaderParsers(), Glide.get(context).getBitmapPool(), Glide.get(context).getArrayPool());
    }

    @Nullable
    public final GifDrawableResource a(ByteBuffer byteBuffer, int i10, int i11, GifHeaderParser gifHeaderParser, Options options) {
        long logTime = LogTime.getLogTime();
        try {
            GifHeader header = gifHeaderParser.parseHeader();
            if (header.getNumFrames() > 0 && header.getStatus() == 0) {
                Bitmap.Config config = options.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(header.getHeight() / i11, header.getWidth() / i10);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
                    header.getWidth();
                    header.getHeight();
                }
                a aVar = this.f38641d;
                GifBitmapProvider gifBitmapProvider = this.f38642e;
                aVar.getClass();
                StandardGifDecoder standardGifDecoder = new StandardGifDecoder(gifBitmapProvider, header, byteBuffer, iMax);
                standardGifDecoder.setDefaultBitmapConfig(config);
                standardGifDecoder.advance();
                Bitmap nextFrame = standardGifDecoder.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                return new GifDrawableResource(new GifDrawable(this.f38638a, standardGifDecoder, UnitTransformation.get(), i10, i11, nextFrame));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                LogTime.getElapsedMillis(logTime);
            }
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public GifDrawableResource decode(@NonNull ByteBuffer byteBuffer, int i10, int i11, @NonNull Options options) {
        GifHeaderParser data;
        b bVar = this.f38640c;
        synchronized (bVar) {
            try {
                GifHeaderParser gifHeaderParserPoll = bVar.f38643a.poll();
                if (gifHeaderParserPoll == null) {
                    gifHeaderParserPoll = new GifHeaderParser();
                }
                data = gifHeaderParserPoll.setData(byteBuffer);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            return a(byteBuffer, i10, i11, data, options);
        } finally {
            this.f38640c.a(data);
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull ByteBuffer byteBuffer, @NonNull Options options) throws IOException {
        return !((Boolean) options.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.f38639b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public ByteBufferGifDecoder(Context context, List<ImageHeaderParser> list, BitmapPool bitmapPool, ArrayPool arrayPool) {
        a aVar = f38636f;
        this.f38638a = context.getApplicationContext();
        this.f38639b = list;
        this.f38641d = aVar;
        this.f38642e = new GifBitmapProvider(bitmapPool, arrayPool);
        this.f38640c = f38637g;
    }
}
