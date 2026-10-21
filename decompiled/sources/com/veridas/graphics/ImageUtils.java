package com.veridas.graphics;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.salesforce.marketingcloud.storage.db.k;
import com.veridas.camera.resolution.Resolution;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J)\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J)\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J)\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 JI\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0086 J)\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J!\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J!\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J!\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086 J)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0086 J9\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0086 ¨\u0006\""}, d2 = {"Lcom/veridas/graphics/ImageUtils;", "", "()V", "compressJpeg", "", "src", "Ljava/nio/ByteBuffer;", k.a.f65039f, "width", "height", "convertBgraToGrayscale", "", "convertBgraToRgba", "convertRgbaToGrayscale", "fromBuffer", "toBuffer", "convertRgbaToYuv", "convertYuvToBgra", "crop", "x", "y", "newWidth", "newHeight", "decompressJpeg", "flip", "data", "flipX", "flipY", "rotateUp", Key.ROTATION, "scaleTo", "scaleWidth", "scaleHeight", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUtils.kt\ncom/veridas/graphics/ImageUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,193:1\n13309#2,2:194\n*S KotlinDebug\n*F\n+ 1 ImageUtils.kt\ncom/veridas/graphics/ImageUtils\n*L\n141#1:194,2\n*E\n"})
public final class ImageUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: ImageUtils.kt */
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¨\u0006\u000f"}, d2 = {"Lcom/veridas/graphics/ImageUtils$Companion;", "", "()V", "calculateBufferSizeForGrayscale", "", "bitmap", "Landroid/graphics/Bitmap;", "resolution", "Lcom/veridas/camera/resolution/Resolution;", TypedValues.Custom.S_DIMENSION, "Lcom/veridas/graphics/Dimension;", "width", "height", "calculateBufferSizeForRgba", "calculateBufferSizeForYuv", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int calculateBufferSizeForGrayscale(int width, int height) {
            return width * height;
        }

        @JvmStatic
        public final int calculateBufferSizeForRgba(int width, int height) {
            return width * height * 4;
        }

        @JvmStatic
        public final int calculateBufferSizeForYuv(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return calculateBufferSizeForYuv(bitmap.getWidth(), bitmap.getHeight());
        }

        @JvmStatic
        public final int calculateBufferSizeForGrayscale(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return calculateBufferSizeForGrayscale(bitmap.getWidth(), bitmap.getHeight());
        }

        @JvmStatic
        public final int calculateBufferSizeForRgba(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return calculateBufferSizeForRgba(bitmap.getWidth(), bitmap.getHeight());
        }

        @JvmStatic
        public final int calculateBufferSizeForYuv(@NotNull Dimension dimension) {
            Intrinsics.checkNotNullParameter(dimension, "dimension");
            return calculateBufferSizeForYuv(dimension.getWidth(), dimension.getHeight());
        }

        @JvmStatic
        public final int calculateBufferSizeForGrayscale(@NotNull Dimension dimension) {
            Intrinsics.checkNotNullParameter(dimension, "dimension");
            return calculateBufferSizeForGrayscale(dimension.getWidth(), dimension.getHeight());
        }

        @JvmStatic
        public final int calculateBufferSizeForRgba(@NotNull Dimension dimension) {
            Intrinsics.checkNotNullParameter(dimension, "dimension");
            return calculateBufferSizeForRgba(dimension.getWidth(), dimension.getHeight());
        }

        @JvmStatic
        public final int calculateBufferSizeForYuv(@NotNull Resolution resolution) {
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            return calculateBufferSizeForYuv(resolution.width, resolution.height);
        }

        @JvmStatic
        public final int calculateBufferSizeForGrayscale(@NotNull Resolution resolution) {
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            return calculateBufferSizeForGrayscale(resolution.width, resolution.height);
        }

        @JvmStatic
        public final int calculateBufferSizeForRgba(@NotNull Resolution resolution) {
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            return calculateBufferSizeForRgba(resolution.width, resolution.height);
        }

        @JvmStatic
        public final int calculateBufferSizeForYuv(int width, int height) {
            return ((width * height) * 3) / 2;
        }
    }

    static {
        for (String str : ImageUtilsKt.f67140a) {
            System.loadLibrary(str);
        }
    }

    @JvmStatic
    public static final int calculateBufferSizeForGrayscale(int i10, int i11) {
        return INSTANCE.calculateBufferSizeForGrayscale(i10, i11);
    }

    @JvmStatic
    public static final int calculateBufferSizeForRgba(int i10, int i11) {
        return INSTANCE.calculateBufferSizeForRgba(i10, i11);
    }

    @JvmStatic
    public static final int calculateBufferSizeForYuv(int i10, int i11) {
        return INSTANCE.calculateBufferSizeForYuv(i10, i11);
    }

    public final native int compressJpeg(@NotNull ByteBuffer src, @NotNull ByteBuffer dst, int width, int height);

    public final native void convertBgraToGrayscale(@NotNull ByteBuffer src, @NotNull ByteBuffer dst, int width, int height);

    public final native void convertBgraToRgba(@NotNull ByteBuffer src, @NotNull ByteBuffer dst, int width, int height);

    public final native void convertRgbaToGrayscale(@NotNull ByteBuffer fromBuffer, @NotNull ByteBuffer toBuffer, int width, int height);

    public final native void convertRgbaToYuv(@NotNull ByteBuffer fromBuffer, @NotNull ByteBuffer toBuffer, int width, int height);

    public final native void convertYuvToBgra(@NotNull ByteBuffer src, @NotNull ByteBuffer dst, int width, int height);

    public final native void crop(@NotNull ByteBuffer src, @NotNull ByteBuffer dst, int width, int height, int x4, int y7, int newWidth, int newHeight);

    public final native void decompressJpeg(@NotNull ByteBuffer src, @NotNull ByteBuffer dst, int width, int height);

    public final native void flip(@NotNull ByteBuffer data, int width, int height);

    public final native void flipX(@NotNull ByteBuffer data, int width, int height);

    public final native void flipY(@NotNull ByteBuffer data, int width, int height);

    public final native void rotateUp(@NotNull ByteBuffer data, int width, int height, int rotation);

    public final native void scaleTo(@NotNull ByteBuffer src, @NotNull ByteBuffer dst, int width, int height, int scaleWidth, int scaleHeight);

    @JvmStatic
    public static final int calculateBufferSizeForGrayscale(@NotNull Bitmap bitmap) {
        return INSTANCE.calculateBufferSizeForGrayscale(bitmap);
    }

    @JvmStatic
    public static final int calculateBufferSizeForRgba(@NotNull Bitmap bitmap) {
        return INSTANCE.calculateBufferSizeForRgba(bitmap);
    }

    @JvmStatic
    public static final int calculateBufferSizeForYuv(@NotNull Bitmap bitmap) {
        return INSTANCE.calculateBufferSizeForYuv(bitmap);
    }

    @JvmStatic
    public static final int calculateBufferSizeForGrayscale(@NotNull Resolution resolution) {
        return INSTANCE.calculateBufferSizeForGrayscale(resolution);
    }

    @JvmStatic
    public static final int calculateBufferSizeForRgba(@NotNull Resolution resolution) {
        return INSTANCE.calculateBufferSizeForRgba(resolution);
    }

    @JvmStatic
    public static final int calculateBufferSizeForYuv(@NotNull Resolution resolution) {
        return INSTANCE.calculateBufferSizeForYuv(resolution);
    }

    @JvmStatic
    public static final int calculateBufferSizeForGrayscale(@NotNull Dimension dimension) {
        return INSTANCE.calculateBufferSizeForGrayscale(dimension);
    }

    @JvmStatic
    public static final int calculateBufferSizeForRgba(@NotNull Dimension dimension) {
        return INSTANCE.calculateBufferSizeForRgba(dimension);
    }

    @JvmStatic
    public static final int calculateBufferSizeForYuv(@NotNull Dimension dimension) {
        return INSTANCE.calculateBufferSizeForYuv(dimension);
    }
}
