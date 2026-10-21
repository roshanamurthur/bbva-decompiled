package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.v;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class VideoDecoder<T> implements ResourceDecoder<T, Bitmap> {
    public static final long DEFAULT_FRAME = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e<T> f38616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapPool f38617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f38618c;
    public static final Option<Long> TARGET_FRAME = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final Option<Integer> FRAME_OPTION = Option.disk("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f38614d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f38615e = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public class a implements Option.CacheKeyUpdater<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f38619a = ByteBuffer.allocate(8);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public final void update(@NonNull byte[] bArr, @NonNull Long l6, @NonNull MessageDigest messageDigest) {
            Long l7 = l6;
            messageDigest.update(bArr);
            synchronized (this.f38619a) {
                this.f38619a.position(0);
                messageDigest.update(this.f38619a.putLong(l7.longValue()).array());
            }
        }
    }

    public class b implements Option.CacheKeyUpdater<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f38620a = ByteBuffer.allocate(4);

        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public final void update(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f38620a) {
                this.f38620a.position(0);
                messageDigest.update(this.f38620a.putInt(num2.intValue()).array());
            }
        }
    }

    @RequiresApi(16)
    public static final class c implements e<AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    @RequiresApi(23)
    public static final class d implements e<ByteBuffer> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new com.bumptech.glide.load.resource.bitmap.a(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new com.bumptech.glide.load.resource.bitmap.a(byteBuffer));
        }
    }

    @VisibleForTesting
    public interface e<T> {
        @RequiresApi(16)
        void a(MediaExtractor mediaExtractor, T t10) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    @VisibleForTesting
    public static class f {
    }

    public static final class g implements e<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        @RequiresApi(16)
        public final void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public static final class h extends RuntimeException {
    }

    @VisibleForTesting
    public VideoDecoder() {
        throw null;
    }

    public VideoDecoder(BitmapPool bitmapPool, e<T> eVar) {
        this.f38617b = bitmapPool;
        this.f38616a = eVar;
        this.f38618c = f38614d;
    }

    @RequiresApi(16)
    public static ResourceDecoder<AssetFileDescriptor, Bitmap> asset(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new c());
    }

    @RequiresApi(api = 23)
    public static ResourceDecoder<ByteBuffer, Bitmap> byteBuffer(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new d());
    }

    public static ResourceDecoder<ParcelFileDescriptor, Bitmap> parcel(BitmapPool bitmapPool) {
        return new VideoDecoder(bitmapPool, new g());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x014d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Nullable
    public final Bitmap a(@NonNull T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f38616a.a(mediaExtractor, t10);
                        int trackCount = mediaExtractor.getTrackCount();
                        for (int i18 = 0; i18 < trackCount; i18++) {
                            if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i18).getString("mime"))) {
                                mediaExtractor.release();
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                        }
                    } catch (Throwable unused) {
                        if (mediaExtractor != null) {
                        }
                        if (Build.VERSION.SDK_INT >= 27) {
                            try {
                                i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                i17 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                if (i17 != 90) {
                                    i16 = i15;
                                    i15 = i16;
                                } else {
                                    i16 = i15;
                                    i15 = i16;
                                }
                                float scaleFactor = downsampleStrategy.getScaleFactor(i15, i16, i11, i12);
                                bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i15 * scaleFactor), Math.round(scaleFactor * i16));
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10, i10);
                        }
                        if (Build.MODEL.startsWith("Pixel")) {
                            i13 = Build.VERSION.SDK_INT;
                            if (i13 >= 30) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i14 = Integer.parseInt(strExtractMetadata);
                                    int i19 = Integer.parseInt(strExtractMetadata2);
                                    if (i14 != 7) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                    } else {
                                        Matrix matrix2 = new Matrix();
                                        matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                        } else {
                            i13 = Build.VERSION.SDK_INT;
                            if (i13 >= 30) {
                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                i14 = Integer.parseInt(strExtractMetadata3);
                                int i110 = Integer.parseInt(strExtractMetadata4);
                                if (i14 != 7) {
                                    Matrix matrix3 = new Matrix();
                                    matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                } else {
                                    Matrix matrix4 = new Matrix();
                                    matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                }
                            }
                        }
                        if (bitmapCreateBitmap != null) {
                            return bitmapCreateBitmap;
                        }
                        throw new h("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
                    }
                    mediaExtractor.release();
                }
            } catch (Throwable unused4) {
                mediaExtractor = null;
            }
        }
        if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.NONE) {
            i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i17 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i17 != 90 || i17 == 270) {
                i16 = i15;
                i15 = i16;
            }
            float scaleFactor2 = downsampleStrategy.getScaleFactor(i15, i16, i11, i12);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i15 * scaleFactor2), Math.round(scaleFactor2 * i16));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30 && i13 < 33) {
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                i14 = Integer.parseInt(strExtractMetadata5);
                int i111 = Integer.parseInt(strExtractMetadata6);
                if ((i14 != 7 || i14 == 6) && i111 == 6 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Matrix matrix5 = new Matrix();
                    matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                }
            }
        } else {
            Iterator<String> it = f38615e.iterator();
            do {
                if (it.hasNext()) {
                }
            } while (!Build.ID.startsWith(it.next()));
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
            i14 = Integer.parseInt(strExtractMetadata7);
            int i112 = Integer.parseInt(strExtractMetadata8);
            if (i14 != 7) {
                Matrix matrix6 = new Matrix();
                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
            } else {
                Matrix matrix7 = new Matrix();
                matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new h("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Bitmap> decode(@NonNull T t10, int i10, int i11, @NonNull Options options) throws IOException {
        long jLongValue = ((Long) options.get(TARGET_FRAME)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(v.c("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) options.get(FRAME_OPTION);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) options.get(DownsampleStrategy.OPTION);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.DEFAULT;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.f38618c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f38616a.b(mediaMetadataRetriever, t10);
            return BitmapResource.obtain(a(t10, mediaMetadataRetriever, jLongValue, num.intValue(), i10, i11, downsampleStrategy2), this.f38617b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull T t10, @NonNull Options options) {
        return true;
    }
}
