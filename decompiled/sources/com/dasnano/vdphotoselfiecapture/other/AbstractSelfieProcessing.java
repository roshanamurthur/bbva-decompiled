package com.dasnano.vdphotoselfiecapture.other;

import android.graphics.Rect;
import androidx.constraintlayout.motion.widget.Key;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractSelfieProcessing.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0004R\"\u0010\u0012\u001a\u00020\u00118\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/other/AbstractSelfieProcessing;", "", "Ljava/nio/ByteBuffer;", "buffer", "", "width", "height", Key.ROTATION, "Ljava/lang/Runnable;", "success", "failure", "", "process", "", "Lcom/google/mlkit/vision/face/Face;", "faces", "sortByArea", "Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;", "delegate", "Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;", "getDelegate", "()Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;", "setDelegate", "(Lcom/dasnano/vdphotoselfiecapture/other/SelfieProcessingProtocol;)V", "Lcom/google/mlkit/vision/face/FaceDetector;", "a", "Lcom/google/mlkit/vision/face/FaceDetector;", "getFaceDetector", "()Lcom/google/mlkit/vision/face/FaceDetector;", "faceDetector", "<init>", "()V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractSelfieProcessing {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FaceDetector faceDetector;
    protected SelfieProcessingProtocol delegate;

    /* JADX INFO: compiled from: AbstractSelfieProcessing.kt */
    public static final class a extends Lambda implements Function2<Face, Face, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f39684p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Face face, Face face2) {
            Rect boundingBox = face.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox, "getBoundingBox(...)");
            Rect boundingBox2 = face2.getBoundingBox();
            Intrinsics.checkNotNullExpressionValue(boundingBox2, "getBoundingBox(...)");
            return Integer.valueOf((boundingBox.height() * boundingBox.width()) - (boundingBox2.height() * boundingBox2.width()));
        }
    }

    public AbstractSelfieProcessing() {
        FaceDetectorOptions faceDetectorOptionsBuild = new FaceDetectorOptions.Builder().setClassificationMode(2).setLandmarkMode(2).setPerformanceMode(2).setMinFaceSize(0.6f).enableTracking().build();
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptionsBuild, "build(...)");
        FaceDetector client = FaceDetection.getClient(faceDetectorOptionsBuild);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        this.faceDetector = client;
    }

    @NotNull
    public final SelfieProcessingProtocol getDelegate() {
        SelfieProcessingProtocol selfieProcessingProtocol = this.delegate;
        if (selfieProcessingProtocol != null) {
            return selfieProcessingProtocol;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegate");
        return null;
    }

    @NotNull
    public final FaceDetector getFaceDetector() {
        return this.faceDetector;
    }

    public abstract void process(@NotNull ByteBuffer buffer, int width, int height, int rotation, @NotNull Runnable success, @NotNull Runnable failure);

    public final void setDelegate(@NotNull SelfieProcessingProtocol selfieProcessingProtocol) {
        Intrinsics.checkNotNullParameter(selfieProcessingProtocol, "<set-?>");
        this.delegate = selfieProcessingProtocol;
    }

    public final void sortByArea(@NotNull List<? extends Face> faces) {
        Intrinsics.checkNotNullParameter(faces, "faces");
        final a aVar = a.f39684p0;
        CollectionsKt___CollectionsKt.sortedWith(faces, new Comparator() { // from class: com.dasnano.vdphotoselfiecapture.other.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Function2 tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Number) tmp0.invoke(obj, obj2)).intValue();
            }
        });
    }
}
