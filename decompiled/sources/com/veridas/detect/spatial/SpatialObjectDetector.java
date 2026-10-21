package com.veridas.detect.spatial;

import androidx.annotation.Keep;
import com.veridas.detect.Request;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpatialObjectDetector.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/veridas/detect/spatial/SpatialObjectDetector;", "", "finish", "", "initialize", "request", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "Lcom/veridas/detect/Request;", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SpatialObjectDetector {
    boolean finish();

    boolean initialize();

    @NotNull
    SpatialDetectionResult request(@NotNull Request request);
}
