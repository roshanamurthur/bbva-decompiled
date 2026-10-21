package com.bbva.plugin.media.capture.media.image.transformer;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MonochromeImageTransformer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/transformer/MonochromeImageTransformer;", "Lcom/bbva/plugin/media/capture/media/image/transformer/ImageTransformer;", "Landroid/graphics/Bitmap;", "bitmap", "transform", "Lcom/bbva/plugin/media/capture/media/image/transformer/GrayscaleImageTransformer;", "grayscaleImageTransformer", "<init>", "(Lcom/bbva/plugin/media/capture/media/image/transformer/GrayscaleImageTransformer;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class MonochromeImageTransformer implements ImageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GrayscaleImageTransformer f35852a;

    /* JADX WARN: Multi-variable type inference failed */
    public MonochromeImageTransformer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.plugin.media.capture.media.image.transformer.ImageTransformer
    @NotNull
    public Bitmap transform(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap bitmapTransform = this.f35852a.transform(bitmap);
        Bitmap monochromeBitmap = Bitmap.createBitmap(bitmapTransform.getWidth(), bitmapTransform.getHeight(), bitmapTransform.getConfig());
        Intrinsics.checkNotNullExpressionValue(monochromeBitmap, "monochromeBitmap");
        int width = monochromeBitmap.getWidth();
        int height = monochromeBitmap.getHeight();
        for (int i10 = 0; i10 < width; i10++) {
            for (int i11 = 0; i11 < height; i11++) {
                monochromeBitmap.setPixel(i10, i11, (bitmapTransform.getPixel(i10, i11) & 255) < 128 ? ViewCompat.MEASURED_STATE_MASK : -1);
            }
        }
        return monochromeBitmap;
    }

    public MonochromeImageTransformer(@NotNull GrayscaleImageTransformer grayscaleImageTransformer) {
        Intrinsics.checkNotNullParameter(grayscaleImageTransformer, "grayscaleImageTransformer");
        this.f35852a = grayscaleImageTransformer;
    }

    public /* synthetic */ MonochromeImageTransformer(GrayscaleImageTransformer grayscaleImageTransformer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new GrayscaleImageTransformer() : grayscaleImageTransformer);
    }
}
