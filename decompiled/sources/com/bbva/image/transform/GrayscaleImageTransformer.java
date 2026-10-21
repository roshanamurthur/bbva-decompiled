package com.bbva.image.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GrayscaleImageTransformer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/bbva/image/transform/GrayscaleImageTransformer;", "Lcom/bbva/image/transform/ImageTransformer;", "Landroid/graphics/Bitmap;", "bitmap", "transform", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "b", "Z", "getPerformResize", "()Z", "performResize", "<init>", "()V", "Companion", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class GrayscaleImageTransformer implements ImageTransformer {

    @NotNull
    public static final String ID = "GrayScale";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id = ID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean performResize = true;

    @Override // com.bbva.image.transform.ImageTransformer
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    public boolean getPerformResize() {
        return this.performResize;
    }

    @Override // com.bbva.image.transform.ImageTransformer
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
