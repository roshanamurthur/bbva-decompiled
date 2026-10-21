package com.bbva.plugin.media.capture.media.image.resizer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import com.bbva.plugin.media.capture.util.BitmapUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScaleSidesResizer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/resizer/ScaleSidesResizer;", "Lcom/bbva/plugin/media/capture/media/image/resizer/Resizer;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "preResize", "Landroid/graphics/Bitmap;", "bitmap", "postResize", "", "maxSide", "<init>", "(F)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class ScaleSidesResizer implements Resizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35850a;

    public ScaleSidesResizer(float f6) {
        this.f35850a = f6;
    }

    @Override // com.bbva.plugin.media.capture.media.image.resizer.Resizer
    @NotNull
    public Bitmap postResize(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return BitmapUtils.INSTANCE.scaleBitmapKnownSide$media_capture_plugin_release(bitmap, this.f35850a);
    }

    @Override // com.bbva.plugin.media.capture.media.image.resizer.Resizer
    public void preResize(@NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
        Size sizeMeasureSizeBySide$media_capture_plugin_release = bitmapUtils.measureSizeBySide$media_capture_plugin_release(options.outWidth, options.outHeight, this.f35850a);
        options.inSampleSize = bitmapUtils.calculateSampleSize$media_capture_plugin_release(options.outWidth, sizeMeasureSizeBySide$media_capture_plugin_release.getWidth());
        options.inDensity = sizeMeasureSizeBySide$media_capture_plugin_release.getWidth();
        options.inTargetDensity = sizeMeasureSizeBySide$media_capture_plugin_release.getWidth() * options.inSampleSize;
    }
}
