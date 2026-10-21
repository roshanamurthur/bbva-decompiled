package com.dasnano.vdphotoselfiecapture.other.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import androidx.constraintlayout.motion.widget.Key;
import com.veridas.camera.resolution.Resolution;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/other/util/ImageUtils;", "", "()V", "createBitmapFromYuv", "Landroid/graphics/Bitmap;", "bytes", "", "width", "", "height", "createRotatedAndScaledBitmap", "desiredResolution", "Lcom/veridas/camera/resolution/Resolution;", Key.ROTATION, "", "bitmap", "createRotatedBitmap", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImageUtils {

    @NotNull
    public static final ImageUtils INSTANCE = new ImageUtils();

    @JvmStatic
    @Nullable
    public static final Bitmap createBitmapFromYuv(@NotNull byte[] bytes, int width, int height) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        YuvImage yuvImage = new YuvImage(bytes, 17, width, height, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, width, height), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    @JvmStatic
    @Nullable
    public static final Bitmap createRotatedAndScaledBitmap(@NotNull Resolution desiredResolution, float rotation, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(desiredResolution, "desiredResolution");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, desiredResolution.width, desiredResolution.height, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        return createRotatedBitmap(bitmapCreateScaledBitmap, rotation);
    }

    @JvmStatic
    @Nullable
    public static final Bitmap createRotatedBitmap(@NotNull Bitmap bitmap, float rotation) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Matrix matrix = new Matrix();
        matrix.postRotate(rotation);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }
}
