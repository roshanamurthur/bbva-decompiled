package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ByteArrayLoader;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.ByteBufferFileLoader;
import com.bumptech.glide.load.model.DataUrlLoader;
import com.bumptech.glide.load.model.DirectResourceLoader;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ResourceLoader;
import com.bumptech.glide.load.model.ResourceUriLoader;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.model.StringLoader;
import com.bumptech.glide.load.model.UnitModelLoader;
import com.bumptech.glide.load.model.UriLoader;
import com.bumptech.glide.load.model.UrlUriLoader;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader;
import com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import com.bumptech.glide.load.model.stream.UrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.InputStreamBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.ParcelFileDescriptorBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.module.GlideModule;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: RegistryFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static Registry a(Glide glide, List<GlideModule> list, @Nullable AppGlideModule appGlideModule) {
        ResourceDecoder byteBufferBitmapDecoder;
        ResourceDecoder streamBitmapDecoder;
        Registry registry;
        BitmapPool bitmapPool = glide.getBitmapPool();
        ArrayPool arrayPool = glide.getArrayPool();
        GlideContext glideContext = glide.f37979s0;
        Context applicationContext = glideContext.getApplicationContext();
        GlideExperiments experiments = glideContext.getExperiments();
        Registry registry2 = new Registry();
        registry2.register(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry2.register(new ExifInterfaceImageHeaderParser());
        }
        Resources resources = applicationContext.getResources();
        List<ImageHeaderParser> imageHeaderParsers = registry2.getImageHeaderParsers();
        ByteBufferGifDecoder byteBufferGifDecoder = new ByteBufferGifDecoder(applicationContext, imageHeaderParsers, bitmapPool, arrayPool);
        ResourceDecoder<ParcelFileDescriptor, Bitmap> resourceDecoderParcel = VideoDecoder.parcel(bitmapPool);
        Downsampler downsampler = new Downsampler(registry2.getImageHeaderParsers(), resources.getDisplayMetrics(), bitmapPool, arrayPool);
        if (i10 < 28 || !experiments.isEnabled(GlideBuilder.c.class)) {
            byteBufferBitmapDecoder = new ByteBufferBitmapDecoder(downsampler);
            streamBitmapDecoder = new StreamBitmapDecoder(downsampler, arrayPool);
        } else {
            streamBitmapDecoder = new InputStreamBitmapImageDecoderResourceDecoder();
            byteBufferBitmapDecoder = new ByteBufferBitmapImageDecoderResourceDecoder();
        }
        if (i10 >= 28) {
            registry2.append("Animation", InputStream.class, Drawable.class, AnimatedImageDecoder.streamDecoder(imageHeaderParsers, arrayPool));
            registry2.append("Animation", ByteBuffer.class, Drawable.class, AnimatedImageDecoder.byteBufferDecoder(imageHeaderParsers, arrayPool));
        }
        ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(applicationContext);
        BitmapEncoder bitmapEncoder = new BitmapEncoder(arrayPool);
        BitmapBytesTranscoder bitmapBytesTranscoder = new BitmapBytesTranscoder();
        GifDrawableBytesTranscoder gifDrawableBytesTranscoder = new GifDrawableBytesTranscoder();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry2.append(ByteBuffer.class, new ByteBufferEncoder()).append(InputStream.class, new StreamEncoder(arrayPool)).append(Registry.BUCKET_BITMAP, ByteBuffer.class, Bitmap.class, byteBufferBitmapDecoder).append(Registry.BUCKET_BITMAP, InputStream.class, Bitmap.class, streamBitmapDecoder);
        if (ParcelFileDescriptorRewinder.isSupported()) {
            registry2.append(Registry.BUCKET_BITMAP, ParcelFileDescriptor.class, Bitmap.class, new ParcelFileDescriptorBitmapDecoder(downsampler));
        }
        registry2.append(Registry.BUCKET_BITMAP, AssetFileDescriptor.class, Bitmap.class, VideoDecoder.asset(bitmapPool));
        registry2.append(Registry.BUCKET_BITMAP, ParcelFileDescriptor.class, Bitmap.class, resourceDecoderParcel).append(Bitmap.class, Bitmap.class, UnitModelLoader.Factory.getInstance()).append(Registry.BUCKET_BITMAP, Bitmap.class, Bitmap.class, new UnitBitmapDecoder()).append(Bitmap.class, (ResourceEncoder) bitmapEncoder).append(Registry.BUCKET_BITMAP_DRAWABLE, ByteBuffer.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, byteBufferBitmapDecoder)).append(Registry.BUCKET_BITMAP_DRAWABLE, InputStream.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, streamBitmapDecoder)).append(Registry.BUCKET_BITMAP_DRAWABLE, ParcelFileDescriptor.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, resourceDecoderParcel)).append(BitmapDrawable.class, (ResourceEncoder) new BitmapDrawableEncoder(bitmapPool, bitmapEncoder)).append("Animation", InputStream.class, GifDrawable.class, new StreamGifDecoder(imageHeaderParsers, byteBufferGifDecoder, arrayPool)).append("Animation", ByteBuffer.class, GifDrawable.class, byteBufferGifDecoder).append(GifDrawable.class, (ResourceEncoder) new GifDrawableEncoder()).append(GifDecoder.class, GifDecoder.class, UnitModelLoader.Factory.getInstance()).append(Registry.BUCKET_BITMAP, GifDecoder.class, Bitmap.class, new GifFrameResourceDecoder(bitmapPool)).append(Uri.class, Drawable.class, resourceDrawableDecoder).append(Uri.class, Bitmap.class, new ResourceBitmapDecoder(resourceDrawableDecoder, bitmapPool)).register(new ByteBufferRewinder.Factory()).append(File.class, ByteBuffer.class, new ByteBufferFileLoader.Factory()).append(File.class, InputStream.class, new FileLoader.StreamFactory()).append(File.class, File.class, new FileDecoder()).append(File.class, ParcelFileDescriptor.class, new FileLoader.FileDescriptorFactory()).append(File.class, File.class, UnitModelLoader.Factory.getInstance()).register(new InputStreamRewinder.Factory(arrayPool));
        if (ParcelFileDescriptorRewinder.isSupported()) {
            registry = registry2;
            registry.register(new ParcelFileDescriptorRewinder.Factory());
        } else {
            registry = registry2;
        }
        ModelLoaderFactory<Integer, InputStream> modelLoaderFactoryInputStreamFactory = DirectResourceLoader.inputStreamFactory(applicationContext);
        ModelLoaderFactory<Integer, AssetFileDescriptor> modelLoaderFactoryAssetFileDescriptorFactory = DirectResourceLoader.assetFileDescriptorFactory(applicationContext);
        ModelLoaderFactory<Integer, Drawable> modelLoaderFactoryDrawableFactory = DirectResourceLoader.drawableFactory(applicationContext);
        Class cls = Integer.TYPE;
        registry.append(cls, InputStream.class, modelLoaderFactoryInputStreamFactory).append(Integer.class, InputStream.class, modelLoaderFactoryInputStreamFactory).append(cls, AssetFileDescriptor.class, modelLoaderFactoryAssetFileDescriptorFactory).append(Integer.class, AssetFileDescriptor.class, modelLoaderFactoryAssetFileDescriptorFactory).append(cls, Drawable.class, modelLoaderFactoryDrawableFactory).append(Integer.class, Drawable.class, modelLoaderFactoryDrawableFactory).append(Uri.class, InputStream.class, ResourceUriLoader.newStreamFactory(applicationContext)).append(Uri.class, AssetFileDescriptor.class, ResourceUriLoader.newAssetFileDescriptorFactory(applicationContext));
        ResourceLoader.UriFactory uriFactory = new ResourceLoader.UriFactory(resources);
        ResourceLoader.AssetFileDescriptorFactory assetFileDescriptorFactory = new ResourceLoader.AssetFileDescriptorFactory(resources);
        ResourceLoader.StreamFactory streamFactory = new ResourceLoader.StreamFactory(resources);
        registry.append(Integer.class, Uri.class, uriFactory).append(cls, Uri.class, uriFactory).append(Integer.class, AssetFileDescriptor.class, assetFileDescriptorFactory).append(cls, AssetFileDescriptor.class, assetFileDescriptorFactory).append(Integer.class, InputStream.class, streamFactory).append(cls, InputStream.class, streamFactory);
        registry.append(String.class, InputStream.class, new DataUrlLoader.StreamFactory()).append(Uri.class, InputStream.class, new DataUrlLoader.StreamFactory()).append(String.class, InputStream.class, new StringLoader.StreamFactory()).append(String.class, ParcelFileDescriptor.class, new StringLoader.FileDescriptorFactory()).append(String.class, AssetFileDescriptor.class, new StringLoader.AssetFileDescriptorFactory()).append(Uri.class, InputStream.class, new AssetUriLoader.StreamFactory(applicationContext.getAssets())).append(Uri.class, AssetFileDescriptor.class, new AssetUriLoader.FileDescriptorFactory(applicationContext.getAssets())).append(Uri.class, InputStream.class, new MediaStoreImageThumbLoader.Factory(applicationContext)).append(Uri.class, InputStream.class, new MediaStoreVideoThumbLoader.Factory(applicationContext));
        if (i10 >= 29) {
            registry.append(Uri.class, InputStream.class, new QMediaStoreUriLoader.InputStreamFactory(applicationContext));
            registry.append(Uri.class, ParcelFileDescriptor.class, new QMediaStoreUriLoader.FileDescriptorFactory(applicationContext));
        }
        registry.append(Uri.class, InputStream.class, new UriLoader.StreamFactory(contentResolver)).append(Uri.class, ParcelFileDescriptor.class, new UriLoader.FileDescriptorFactory(contentResolver)).append(Uri.class, AssetFileDescriptor.class, new UriLoader.AssetFileDescriptorFactory(contentResolver)).append(Uri.class, InputStream.class, new UrlUriLoader.StreamFactory()).append(URL.class, InputStream.class, new UrlLoader.StreamFactory()).append(Uri.class, File.class, new MediaStoreFileLoader.Factory(applicationContext)).append(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.Factory()).append(byte[].class, ByteBuffer.class, new ByteArrayLoader.ByteBufferFactory()).append(byte[].class, InputStream.class, new ByteArrayLoader.StreamFactory()).append(Uri.class, Uri.class, UnitModelLoader.Factory.getInstance()).append(Drawable.class, Drawable.class, UnitModelLoader.Factory.getInstance()).append(Drawable.class, Drawable.class, new UnitDrawableDecoder()).register(Bitmap.class, BitmapDrawable.class, new BitmapDrawableTranscoder(resources)).register(Bitmap.class, byte[].class, bitmapBytesTranscoder).register(Drawable.class, byte[].class, new DrawableBytesTranscoder(bitmapPool, bitmapBytesTranscoder, gifDrawableBytesTranscoder)).register(GifDrawable.class, byte[].class, gifDrawableBytesTranscoder);
        ResourceDecoder<ByteBuffer, Bitmap> resourceDecoderByteBuffer = VideoDecoder.byteBuffer(bitmapPool);
        registry.append(ByteBuffer.class, Bitmap.class, resourceDecoderByteBuffer);
        registry.append(ByteBuffer.class, BitmapDrawable.class, new BitmapDrawableDecoder(resources, resourceDecoderByteBuffer));
        for (GlideModule glideModule : list) {
            try {
                glideModule.registerComponents(applicationContext, glide, registry);
            } catch (AbstractMethodError e5) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(glideModule.getClass().getName()), e5);
            }
        }
        if (appGlideModule != null) {
            appGlideModule.registerComponents(applicationContext, glide, registry);
        }
        return registry;
    }
}
