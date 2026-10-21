package com.bbva.plugin.media.capture.media.image.resizer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import com.bbva.plugin.media.capture.util.BitmapUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WeightScaleResizer.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/resizer/WeightScaleResizer;", "Lcom/bbva/plugin/media/capture/media/image/resizer/Resizer;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "preResize", "Landroid/graphics/Bitmap;", "bitmap", "postResize", "", "weight", "<init>", "(F)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class WeightScaleResizer implements Resizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f35851a;

    public WeightScaleResizer(float f6) {
        this.f35851a = f6;
    }

    @Override // com.bbva.plugin.media.capture.media.image.resizer.Resizer
    @NotNull
    public Bitmap postResize(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return BitmapUtils.INSTANCE.scaleBitmapKnownMaxWeight$media_capture_plugin_release(bitmap, this.f35851a);
    }

    @Override // com.bbva.plugin.media.capture.media.image.resizer.Resizer
    public void preResize(@NotNull BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int i10 = options.outWidth;
        BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
        Size sizeMeasureSizeByWeight$media_capture_plugin_release = bitmapUtils.measureSizeByWeight$media_capture_plugin_release(this.f35851a, i10, options.outHeight);
        options.inSampleSize = bitmapUtils.calculateSampleSize$media_capture_plugin_release(i10, sizeMeasureSizeByWeight$media_capture_plugin_release.getWidth());
        options.inDensity = sizeMeasureSizeByWeight$media_capture_plugin_release.getWidth();
        options.inTargetDensity = sizeMeasureSizeByWeight$media_capture_plugin_release.getWidth() * options.inSampleSize;
    }
}
