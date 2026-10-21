package com.bbva.image.transform;

import android.graphics.Bitmap;
import android.util.Size;
import com.bbva.plugin.media.capture.util.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0000\u001a \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0010H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0010H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u000e*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000\u001a\f\u0010\u001d\u001a\u00020\u0001*\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"ARGB_BYTES", "", "HEIGHT", "", "MEGABYTE", "", "WIDTH", "calculateSampleSize", "currentWidth", "requiredWidth", "estimateImageWeight", "width", "height", "measureSizeBySide", "Landroid/util/Size;", "scaleRatio", "", "measureSizeByWeight", "requiredWeight", "currentHeight", "scaleBitmapKnownMaxWeight", "Landroid/graphics/Bitmap;", "bitmap", Constants.MAX_IMAGE_WEIGHT_SCALE, "scaleBitmapKnownSide", "maxSide", "size", "", "", "toSafeInt", "image-transform_release"}, k = 2, mv = {1, 4, 2})
public final class UtilsKt {
    public static final int ARGB_BYTES = 4;

    @NotNull
    public static final String HEIGHT = "height";
    public static final long MEGABYTE = 1048576;

    @NotNull
    public static final String WIDTH = "width";

    public static final int calculateSampleSize(int i10, int i11) {
        int i12 = 1;
        if (i10 > i11) {
            while ((i10 / 2) / i12 >= i11) {
                i12 *= 2;
            }
        }
        return i12;
    }

    public static final int estimateImageWeight(int i10, int i11) {
        return i10 * i11 * 4;
    }

    @NotNull
    public static final Size measureSizeBySide(int i10, int i11, float f6) {
        float f10;
        float f11 = i10;
        float f12 = i11;
        if (f11 > f12) {
            f10 = f12 / (f11 / f6);
        } else if (f12 > f11) {
            float f13 = f11 / (f12 / f6);
            f10 = f6;
            f6 = f13;
        } else {
            f10 = f6;
        }
        return new Size((int) f6, (int) f10);
    }

    @NotNull
    public static final Size measureSizeByWeight(float f6, int i10, int i11) {
        while (estimateImageWeight(i10, i11) >= f6 * 1048576) {
            i10 -= (int) (((double) i10) * 0.1d);
            i11 -= (int) (((double) i11) * 0.1d);
        }
        return new Size(i10, i11);
    }

    @NotNull
    public static final Bitmap scaleBitmapKnownMaxWeight(@NotNull Bitmap bitmap, float f6) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        float height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int i10 = (int) height;
        if (estimateImageWeight(width, i10) <= f6) {
            return bitmap;
        }
        Size sizeMeasureSizeByWeight = measureSizeByWeight(f6, width, i10);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, sizeMeasureSizeByWeight.getWidth(), sizeMeasureSizeByWeight.getHeight(), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "Bitmap.createScaledBitma…width, size.height, true)");
        return bitmapCreateScaledBitmap;
    }

    @NotNull
    public static final Bitmap scaleBitmapKnownSide(@NotNull Bitmap bitmap, float f6) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Size sizeMeasureSizeBySide = measureSizeBySide(bitmap.getWidth(), bitmap.getHeight(), f6);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, sizeMeasureSizeBySide.getWidth(), sizeMeasureSizeBySide.getHeight(), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "Bitmap.createScaledBitma…width, size.height, true)");
        return bitmapCreateScaledBitmap;
    }

    @NotNull
    public static final Size size(@NotNull Map<String, ? extends Object> size) {
        Intrinsics.checkNotNullParameter(size, "$this$size");
        return new Size(toSafeInt(String.valueOf(size.get("width"))), toSafeInt(String.valueOf(size.get("height"))));
    }

    public static final int toSafeInt(@NotNull String toSafeInt) {
        Intrinsics.checkNotNullParameter(toSafeInt, "$this$toSafeInt");
        return (int) Double.parseDouble(toSafeInt);
    }
}
