package com.bbva.discreetmode.camera.detector;

import com.google.mlkit.vision.face.Face;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OnFaceDetectorListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, d2 = {"Lcom/bbva/discreetmode/camera/detector/OnFaceDetectorListener;", "", "onFailureFacesDetection", "", "onSuccessFacesDetection", "faces", "", "Lcom/google/mlkit/vision/face/Face;", "discreetmode_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface OnFaceDetectorListener {
    void onFailureFacesDetection();

    void onSuccessFacesDetection(@NotNull List<? extends Face> faces);
}
