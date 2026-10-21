package com.veridas.detect.sequence.face;

import android.content.Context;
import com.veridas.detect.sequence.SequenceObjectDetector;
import com.veridas.util.FpsCalculator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SequenceFaceDetectorFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/veridas/detect/sequence/face/SequenceFaceDetectorFactory;", "", "createImageFaceDetector", "Lcom/veridas/detect/sequence/SequenceObjectDetector;", "context", "Landroid/content/Context;", "fpsCalculator", "Lcom/veridas/util/FpsCalculator;", "createVideoFaceDetector", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SequenceFaceDetectorFactory {
    @NotNull
    SequenceObjectDetector createImageFaceDetector(@NotNull Context context, @NotNull FpsCalculator fpsCalculator);

    @NotNull
    SequenceObjectDetector createVideoFaceDetector(@NotNull Context context, @NotNull FpsCalculator fpsCalculator);
}
