package com.bbva.plugin.media.capture.util;

import android.graphics.Bitmap;
import android.util.Size;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BitmapUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001bR\u0014\u0010!\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/bbva/plugin/media/capture/util/BitmapUtils;", "", "", "width", "height", "estimateImageWeight$media_capture_plugin_release", "(II)I", "estimateImageWeight", "", "requiredWeight", "currentWidth", "currentHeight", "Landroid/util/Size;", "measureSizeByWeight$media_capture_plugin_release", "(FII)Landroid/util/Size;", "measureSizeByWeight", "scaleRatio", "measureSizeBySide$media_capture_plugin_release", "(IIF)Landroid/util/Size;", "measureSizeBySide", "requiredWidth", "calculateSampleSize$media_capture_plugin_release", "calculateSampleSize", "Landroid/graphics/Bitmap;", "bitmap", Constants.MAX_IMAGE_WEIGHT_SCALE, "scaleBitmapKnownMaxWeight$media_capture_plugin_release", "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "scaleBitmapKnownMaxWeight", "maxSide", "scaleBitmapKnownSide$media_capture_plugin_release", "scaleBitmapKnownSide", "", "MEGABYTE", "J", "ARGB_BYTES", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class BitmapUtils {
    public static final int ARGB_BYTES = 4;

    @NotNull
    public static final BitmapUtils INSTANCE = new BitmapUtils();
    public static final long MEGABYTE = 1048576;

    public final int calculateSampleSize$media_capture_plugin_release(int currentWidth, int requiredWidth) {
        int i10 = 1;
        if (currentWidth > requiredWidth) {
            while ((currentWidth / 2) / i10 >= requiredWidth) {
                i10 *= 2;
            }
        }
        return i10;
    }

    public final int estimateImageWeight$media_capture_plugin_release(int width, int height) {
        return width * height * 4;
    }

    @NotNull
    public final Size measureSizeBySide$media_capture_plugin_release(int width, int height, float scaleRatio) {
        float f6;
        float f10 = width;
        float f11 = height;
        if (f10 > f11) {
            f6 = f11 / (f10 / scaleRatio);
        } else if (f11 > f10) {
            float f12 = f10 / (f11 / scaleRatio);
            f6 = scaleRatio;
            scaleRatio = f12;
        } else {
            f6 = scaleRatio;
        }
        return new Size((int) scaleRatio, (int) f6);
    }

    @NotNull
    public final Size measureSizeByWeight$media_capture_plugin_release(float requiredWeight, int currentWidth, int currentHeight) {
        while (estimateImageWeight$media_capture_plugin_release(currentWidth, currentHeight) >= requiredWeight * 1048576) {
            currentWidth -= (int) (((double) currentWidth) * 0.1d);
            currentHeight -= (int) (((double) currentHeight) * 0.1d);
        }
        return new Size(currentWidth, currentHeight);
    }

    @NotNull
    public final Bitmap scaleBitmapKnownMaxWeight$media_capture_plugin_release(@NotNull Bitmap bitmap, float maxWeight) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        float height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int i10 = (int) height;
        if (estimateImageWeight$media_capture_plugin_release(width, i10) <= maxWeight) {
            return bitmap;
        }
        Size sizeMeasureSizeByWeight$media_capture_plugin_release = measureSizeByWeight$media_capture_plugin_release(maxWeight, width, i10);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, sizeMeasureSizeByWeight$media_capture_plugin_release.getWidth(), sizeMeasureSizeByWeight$media_capture_plugin_release.getHeight(), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "Bitmap.createScaledBitma…width, size.height, true)");
        return bitmapCreateScaledBitmap;
    }

    @NotNull
    public final Bitmap scaleBitmapKnownSide$media_capture_plugin_release(@NotNull Bitmap bitmap, float maxSide) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Size sizeMeasureSizeBySide$media_capture_plugin_release = measureSizeBySide$media_capture_plugin_release(bitmap.getWidth(), bitmap.getHeight(), maxSide);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, sizeMeasureSizeBySide$media_capture_plugin_release.getWidth(), sizeMeasureSizeBySide$media_capture_plugin_release.getHeight(), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "Bitmap.createScaledBitma…width, size.height, true)");
        return bitmapCreateScaledBitmap;
    }
}
