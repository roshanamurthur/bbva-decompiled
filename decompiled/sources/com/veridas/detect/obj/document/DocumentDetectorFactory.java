package com.veridas.detect.obj.document;

import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u000f"}, d2 = {"Lcom/veridas/detect/obj/document/DocumentDetectorFactory;", "", "createAnyDocumentAnalyzer", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "context", "Landroid/content/Context;", "createAnyDocumentDetector", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "createImageDocumentAnalyzer", "createImageDocumentDetector", "createPassportAnalyzer", "createPassportDetector", "createSmartDocumentAnalyzer", "createVideoDocumentDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface DocumentDetectorFactory {
    @NotNull
    ObjectDetector<SequentialDetectionResult> createAnyDocumentAnalyzer(@NotNull Context context);

    @NotNull
    ObjectDetector<SpatialDetectionResult> createAnyDocumentDetector(@NotNull Context context);

    @NotNull
    ObjectDetector<SequentialDetectionResult> createImageDocumentAnalyzer(@NotNull Context context);

    @NotNull
    ObjectDetector<SpatialDetectionResult> createImageDocumentDetector(@NotNull Context context);

    @NotNull
    ObjectDetector<SequentialDetectionResult> createPassportAnalyzer(@NotNull Context context);

    @NotNull
    ObjectDetector<SpatialDetectionResult> createPassportDetector(@NotNull Context context);

    @NotNull
    ObjectDetector<SequentialDetectionResult> createSmartDocumentAnalyzer(@NotNull Context context);

    @NotNull
    ObjectDetector<SequentialDetectionResult> createVideoDocumentDetector(@NotNull Context context);
}
