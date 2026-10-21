package com.bbva.image.extractor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import com.bbva.image.transform.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MaxSideImageScaler.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/image/extractor/MaxSideImageScaler;", "Lcom/bbva/image/extractor/ImageScaler;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "preResize", "Landroid/graphics/Bitmap;", "bitmap", "postResize", "", "maxSide", "<init>", "(F)V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class MaxSideImageScaler implements ImageScaler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f34884a;

    public MaxSideImageScaler(float f6) {
        this.f34884a = f6;
    }

    @Override // com.bbva.image.extractor.ImageScaler
    @NotNull
    public Bitmap postResize(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return UtilsKt.scaleBitmapKnownSide(bitmap, this.f34884a);
    }

    @Override // com.bbva.image.extractor.ImageScaler
    public void preResize(@NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Size sizeMeasureSizeBySide = UtilsKt.measureSizeBySide(options.outWidth, options.outHeight, this.f34884a);
        options.inSampleSize = UtilsKt.calculateSampleSize(options.outWidth, sizeMeasureSizeBySide.getWidth());
        options.inDensity = sizeMeasureSizeBySide.getWidth();
        options.inTargetDensity = sizeMeasureSizeBySide.getWidth() * options.inSampleSize;
    }
}
