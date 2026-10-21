package com.bbva.plugin.media.capture.media.image.transformer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GrayscaleImageTransformer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/transformer/GrayscaleImageTransformer;", "Lcom/bbva/plugin/media/capture/media/image/transformer/ImageTransformer;", "()V", "transform", "Landroid/graphics/Bitmap;", "bitmap", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class GrayscaleImageTransformer implements ImageTransformer {
    @Override // com.bbva.plugin.media.capture.media.image.transformer.ImageTransformer
    @NotNull
    public Bitmap transform(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bmp = bitmap.copy(config, true);
        Intrinsics.checkNotNullExpressionValue(bmp, "bmp");
        Bitmap bmpGrayscale = Bitmap.createBitmap(bmp.getWidth(), bmp.getHeight(), config);
        Canvas canvas = new Canvas(bmpGrayscale);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bmp, 0.0f, 0.0f, paint);
        Intrinsics.checkNotNullExpressionValue(bmpGrayscale, "bmpGrayscale");
        return bmpGrayscale;
    }
}
