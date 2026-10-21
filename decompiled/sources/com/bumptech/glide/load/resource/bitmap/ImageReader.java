package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import com.bumptech.glide.util.Preconditions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ImageReader {

    public static final class InputStreamImageReader implements ImageReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStreamRewinder f38578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayPool f38579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<ImageHeaderParser> f38580c;

        public InputStreamImageReader(List list, InputStream inputStream, ArrayPool arrayPool) {
            this.f38579b = (ArrayPool) Preconditions.checkNotNull(arrayPool);
            this.f38580c = (List) Preconditions.checkNotNull(list);
            this.f38578a = new InputStreamRewinder(inputStream, arrayPool);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f38578a.rewindAndGet(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f38580c, this.f38578a.rewindAndGet(), this.f38579b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f38580c, this.f38578a.rewindAndGet(), this.f38579b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
            this.f38578a.fixMarkLimits();
        }
    }

    @Nullable
    Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException;

    int getImageOrientation() throws IOException;

    ImageHeaderParser.ImageType getImageType() throws IOException;

    void stopGrowingBuffers();

    public static final class ByteArrayReader implements ImageReader {
        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            throw null;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation((List<ImageHeaderParser>) null, ByteBuffer.wrap(null), (ArrayPool) null);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(null, ByteBuffer.wrap(null));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    public static final class ByteBufferReader implements ImageReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f38575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f38576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayPool f38577c;

        public ByteBufferReader(List list, ByteBuffer byteBuffer, ArrayPool arrayPool) {
            this.f38575a = byteBuffer;
            this.f38576b = list;
            this.f38577c = arrayPool;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(ByteBufferUtil.toStream(ByteBufferUtil.rewind(this.f38575a)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f38576b, ByteBufferUtil.rewind(this.f38575a), this.f38577c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f38576b, ByteBufferUtil.rewind(this.f38575a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    public static final class FileReader implements ImageReader {
        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(recyclableBufferedInputStream2, null, options);
                    try {
                        recyclableBufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return bitmapDecodeStream;
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th2;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
                try {
                    int orientation = ImageHeaderParserUtils.getOrientation((List<ImageHeaderParser>) null, recyclableBufferedInputStream, (ArrayPool) null);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return orientation;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                recyclableBufferedInputStream = null;
                th2 = th4;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            Throwable th2;
            try {
                recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream((File) null), null);
                try {
                    ImageHeaderParser.ImageType type = ImageHeaderParserUtils.getType((List<ImageHeaderParser>) null, recyclableBufferedInputStream, (ArrayPool) null);
                    try {
                        recyclableBufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return type;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (recyclableBufferedInputStream != null) {
                        try {
                            recyclableBufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                recyclableBufferedInputStream = null;
                th2 = th4;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }

    @RequiresApi(21)
    public static final class ParcelFileDescriptorImageReader implements ImageReader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayPool f38581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ImageHeaderParser> f38582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f38583c;

        public ParcelFileDescriptorImageReader(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ArrayPool arrayPool) {
            this.f38581a = (ArrayPool) Preconditions.checkNotNull(arrayPool);
            this.f38582b = (List) Preconditions.checkNotNull(list);
            this.f38583c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        @Nullable
        public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f38583c.rewindAndGet().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public int getImageOrientation() throws IOException {
            return ImageHeaderParserUtils.getOrientation(this.f38582b, this.f38583c, this.f38581a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public ImageHeaderParser.ImageType getImageType() throws IOException {
            return ImageHeaderParserUtils.getType(this.f38582b, this.f38583c, this.f38581a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.ImageReader
        public void stopGrowingBuffers() {
        }
    }
}
