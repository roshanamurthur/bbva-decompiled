package com.veridas.detect.obj.face;

import android.content.Context;
import androidx.annotation.Keep;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.spatial.SpatialDetectionResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FaceDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/veridas/detect/obj/face/FaceDetectorFactory;", "", "createImageFaceAnalyzer", "Lcom/veridas/detect/obj/ObjectDetector;", "Lcom/veridas/detect/spatial/SpatialDetectionResult;", "context", "Landroid/content/Context;", "createImageFaceDetector", "Lcom/veridas/detect/sequence/SequentialDetectionResult;", "createVideoFaceDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FaceDetectorFactory {
    @NotNull
    ObjectDetector<SpatialDetectionResult> createImageFaceAnalyzer(@NotNull Context context);

    @NotNull
    ObjectDetector<SequentialDetectionResult> createImageFaceDetector(@NotNull Context context);

    @NotNull
    ObjectDetector<SequentialDetectionResult> createVideoFaceDetector(@NotNull Context context);
}
