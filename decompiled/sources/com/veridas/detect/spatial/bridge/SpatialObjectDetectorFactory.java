package com.veridas.detect.spatial.bridge;

import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.detect.DetectableObjectConfiguration;
import com.veridas.detect.spatial.SpatialObjectDetector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpatialObjectDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001c\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/veridas/detect/spatial/bridge/SpatialObjectDetectorFactory;", "", "createCascadeSpatialObjectDetector", "Lcom/veridas/detect/spatial/SpatialObjectDetector;", "context", "Landroid/content/Context;", "configuration", "Lcom/veridas/detect/DetectableObjectConfiguration;", "createPassportSpatialObjectDetector", "createRectangleSpatialObjectDetector", "createTemplateSpatialObjectDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SpatialObjectDetectorFactory {
    @NotNull
    SpatialObjectDetector createCascadeSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration);

    @NotNull
    SpatialObjectDetector createPassportSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration);

    @NotNull
    SpatialObjectDetector createRectangleSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration);

    @NotNull
    SpatialObjectDetector createTemplateSpatialObjectDetector(@Nullable Context context, @Nullable DetectableObjectConfiguration configuration);
}
