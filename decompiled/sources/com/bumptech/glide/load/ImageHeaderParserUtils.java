package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ImageHeaderParserUtils {
    public static int getOrientation(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int orientation = list.get(i10).getOrientation(inputStream, arrayPool);
                inputStream.reset();
                if (orientation != -1) {
                    return orientation;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, arrayPool);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType type = list.get(i10).getType(inputStream);
                inputStream.reset();
                if (type != ImageHeaderParser.ImageType.UNKNOWN) {
                    return type;
                }
            } catch (Throwable th2) {
                inputStream.reset();
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @RequiresApi(21)
    public static int getOrientation(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull ArrayPool arrayPool) throws Throwable {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser imageHeaderParser = list.get(i10);
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.rewindAndGet().getFileDescriptor()), arrayPool);
                try {
                    int orientation = imageHeaderParser.getOrientation(recyclableBufferedInputStream2, arrayPool);
                    recyclableBufferedInputStream2.release();
                    parcelFileDescriptorRewinder.rewindAndGet();
                    if (orientation != -1) {
                        return orientation;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    parcelFileDescriptorRewinder.rewindAndGet();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ImageHeaderParser.ImageType type = list.get(i10).getType(byteBuffer);
                ByteBufferUtil.rewind(byteBuffer);
                if (type != ImageHeaderParser.ImageType.UNKNOWN) {
                    return type;
                }
            } catch (Throwable th2) {
                ByteBufferUtil.rewind(byteBuffer);
                throw th2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int getOrientation(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                int orientation = list.get(i10).getOrientation(byteBuffer, arrayPool);
                ByteBufferUtil.rewind(byteBuffer);
                if (orientation != -1) {
                    return orientation;
                }
            } catch (Throwable th2) {
                ByteBufferUtil.rewind(byteBuffer);
                throw th2;
            }
        }
        return -1;
    }

    @NonNull
    @RequiresApi(21)
    public static ImageHeaderParser.ImageType getType(@NonNull List<ImageHeaderParser> list, @NonNull ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @NonNull ArrayPool arrayPool) throws Throwable {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser imageHeaderParser = list.get(i10);
            RecyclableBufferedInputStream recyclableBufferedInputStream = null;
            try {
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.rewindAndGet().getFileDescriptor()), arrayPool);
                try {
                    ImageHeaderParser.ImageType type = imageHeaderParser.getType(recyclableBufferedInputStream2);
                    recyclableBufferedInputStream2.release();
                    parcelFileDescriptorRewinder.rewindAndGet();
                    if (type != ImageHeaderParser.ImageType.UNKNOWN) {
                        return type;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream = recyclableBufferedInputStream2;
                    if (recyclableBufferedInputStream != null) {
                        recyclableBufferedInputStream.release();
                    }
                    parcelFileDescriptorRewinder.rewindAndGet();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
