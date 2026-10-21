package com.veridas.graphics;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Frame.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/veridas/graphics/Frame;", "", "data", "Ljava/nio/ByteBuffer;", "dimensions", "Lcom/veridas/graphics/Dimension;", "encoding", "Lcom/veridas/graphics/ImageEncoding;", "orientation", "", "(Ljava/nio/ByteBuffer;Lcom/veridas/graphics/Dimension;Lcom/veridas/graphics/ImageEncoding;I)V", "getData", "()Ljava/nio/ByteBuffer;", "getDimensions", "()Lcom/veridas/graphics/Dimension;", "getEncoding", "()Lcom/veridas/graphics/ImageEncoding;", "naturalDimensions", "getNaturalDimensions", "getOrientation", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "", "write", "", "bytes", "", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Frame {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteBuffer data;

    @NotNull
    private final Dimension dimensions;

    @NotNull
    private final ImageEncoding encoding;

    @NotNull
    private final Dimension naturalDimensions;
    private final int orientation;

    /* JADX INFO: compiled from: Frame.kt */
    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007J*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007J*\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¨\u0006\u0011"}, d2 = {"Lcom/veridas/graphics/Frame$Companion;", "", "()V", "createBgra", "Lcom/veridas/graphics/Frame;", "buffer", "Ljava/nio/ByteBuffer;", "width", "", "height", "orientation", "createRgb", "bitmap", "Landroid/graphics/Bitmap;", "data", "", "createYuv", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Frame createBgra$default(Companion companion, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                i12 = 0;
            }
            return companion.createBgra(byteBuffer, i10, i11, i12);
        }

        public static /* synthetic */ Frame createRgb$default(Companion companion, Bitmap bitmap, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.createRgb(bitmap, i10);
        }

        public static /* synthetic */ Frame createYuv$default(Companion companion, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                i12 = 0;
            }
            return companion.createYuv(bArr, i10, i11, i12);
        }

        @JvmStatic
        @NotNull
        public final Frame createBgra(@NotNull ByteBuffer buffer, int width, int height, int orientation) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            return new Frame(buffer, new Dimension(width, height), ImageEncoding.BGRA, orientation);
        }

        @JvmStatic
        @NotNull
        public final Frame createRgb(@NotNull Bitmap bitmap, int orientation) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Dimension dimension = new Dimension(bitmap.getWidth(), bitmap.getHeight());
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(...)");
            bitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
            byteBufferAllocateDirect.flip();
            return new Frame(byteBufferAllocateDirect, dimension, ImageEncoding.RGB, orientation);
        }

        @JvmStatic
        @NotNull
        public final Frame createYuv(@NotNull byte[] data, int width, int height, int orientation) {
            Intrinsics.checkNotNullParameter(data, "data");
            Dimension dimension = new Dimension(width, height);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(data.length);
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(...)");
            byteBufferAllocateDirect.put(data);
            byteBufferAllocateDirect.flip();
            return new Frame(byteBufferAllocateDirect, dimension, ImageEncoding.YUV, orientation);
        }

        public static /* synthetic */ Frame createRgb$default(Companion companion, byte[] bArr, int i10, int i11, int i12, int i13, Object obj) {
            if ((i13 & 8) != 0) {
                i12 = 0;
            }
            return companion.createRgb(bArr, i10, i11, i12);
        }

        @JvmStatic
        @NotNull
        public final Frame createRgb(@NotNull byte[] data, int width, int height, int orientation) {
            Intrinsics.checkNotNullParameter(data, "data");
            Dimension dimension = new Dimension(width, height);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(data.length);
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocateDirect, "allocateDirect(...)");
            byteBufferAllocateDirect.put(data);
            byteBufferAllocateDirect.flip();
            return new Frame(byteBufferAllocateDirect, dimension, ImageEncoding.RGB, orientation);
        }
    }

    public Frame(@NotNull ByteBuffer data, @NotNull Dimension dimensions, @NotNull ImageEncoding encoding, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        this.data = data;
        this.dimensions = dimensions;
        this.encoding = encoding;
        this.orientation = i10;
        this.naturalDimensions = (i10 == 90 || i10 == 270) ? dimensions.flipAxis() : dimensions;
    }

    public static /* synthetic */ Frame copy$default(Frame frame, ByteBuffer byteBuffer, Dimension dimension, ImageEncoding imageEncoding, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            byteBuffer = frame.data;
        }
        if ((i11 & 2) != 0) {
            dimension = frame.dimensions;
        }
        if ((i11 & 4) != 0) {
            imageEncoding = frame.encoding;
        }
        if ((i11 & 8) != 0) {
            i10 = frame.orientation;
        }
        return frame.copy(byteBuffer, dimension, imageEncoding, i10);
    }

    @JvmStatic
    @NotNull
    public static final Frame createBgra(@NotNull ByteBuffer byteBuffer, int i10, int i11, int i12) {
        return INSTANCE.createBgra(byteBuffer, i10, i11, i12);
    }

    @JvmStatic
    @NotNull
    public static final Frame createRgb(@NotNull Bitmap bitmap, int i10) {
        return INSTANCE.createRgb(bitmap, i10);
    }

    @JvmStatic
    @NotNull
    public static final Frame createYuv(@NotNull byte[] bArr, int i10, int i11, int i12) {
        return INSTANCE.createYuv(bArr, i10, i11, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ByteBuffer getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Dimension getDimensions() {
        return this.dimensions;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImageEncoding getEncoding() {
        return this.encoding;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final Frame copy(@NotNull ByteBuffer data, @NotNull Dimension dimensions, @NotNull ImageEncoding encoding, int orientation) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        return new Frame(data, dimensions, encoding, orientation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) other;
        return Intrinsics.areEqual(this.data, frame.data) && Intrinsics.areEqual(this.dimensions, frame.dimensions) && this.encoding == frame.encoding && this.orientation == frame.orientation;
    }

    @NotNull
    public final ByteBuffer getData() {
        return this.data;
    }

    @NotNull
    public final Dimension getDimensions() {
        return this.dimensions;
    }

    @NotNull
    public final ImageEncoding getEncoding() {
        return this.encoding;
    }

    @NotNull
    public final Dimension getNaturalDimensions() {
        return this.naturalDimensions;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        return ((this.encoding.hashCode() + ((this.dimensions.hashCode() + (this.data.hashCode() * 31)) * 31)) * 31) + this.orientation;
    }

    @NotNull
    public String toString() {
        return "Frame(data=" + this.data + ", dimensions=" + this.dimensions + ", encoding=" + this.encoding + ", orientation=" + this.orientation + ")";
    }

    public final void write(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.data.clear();
        this.data.put(bytes);
        this.data.flip();
    }

    @JvmStatic
    @NotNull
    public static final Frame createRgb(@NotNull byte[] bArr, int i10, int i11, int i12) {
        return INSTANCE.createRgb(bArr, i10, i11, i12);
    }
}
