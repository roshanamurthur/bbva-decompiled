package com.bbva.discreetmode.camera.detector;

import androidx.camera.core.ImageProxy;
import com.bbva.discreetmode.camera.detector.DiscreetModeFacesDetector;
import com.bbva.discreetmode.camera.detector.OnFaceDetectorListener;
import com.bbva.discreetmode.camera.extensions.FirebaseExtensions;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n6.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DiscreetModeFacesDetector.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/bbva/discreetmode/camera/detector/DiscreetModeFacesDetector;", "", "Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "options", "Landroidx/camera/core/ImageProxy;", AuthConstants.IMAGE, "", "detectFaces", "Lcom/bbva/discreetmode/camera/detector/OnFaceDetectorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFaceDetectorListener", "", "isActive", "()Z", "<init>", "()V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeFacesDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public OnFaceDetectorListener f29068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f29069b = new AtomicBoolean(false);

    public final void detectFaces(@NotNull FaceDetectorOptions options, @NotNull final ImageProxy image) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(image, "image");
        InputImage inputImage = FirebaseExtensions.toInputImage(image);
        if (inputImage != null) {
            this.f29069b.set(true);
            FaceDetection.getClient(options).process(inputImage).addOnSuccessListener(new a(this, 0)).addOnFailureListener(new OnFailureListener() { // from class: n6.b
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception it) {
                    DiscreetModeFacesDetector this$0 = this.f84466a;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(it, "it");
                    OnFaceDetectorListener onFaceDetectorListener = this$0.f29068a;
                    if (onFaceDetectorListener == null) {
                        return;
                    }
                    onFaceDetectorListener.onFailureFacesDetection();
                }
            }).addOnCompleteListener(new OnCompleteListener() { // from class: n6.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task it) {
                    DiscreetModeFacesDetector this$0 = this.f84467a;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ImageProxy image2 = image;
                    Intrinsics.checkNotNullParameter(image2, "$image");
                    Intrinsics.checkNotNullParameter(it, "it");
                    this$0.f29069b.set(false);
                    image2.close();
                }
            });
        } else {
            OnFaceDetectorListener onFaceDetectorListener = this.f29068a;
            if (onFaceDetectorListener == null) {
                return;
            }
            onFaceDetectorListener.onFailureFacesDetection();
        }
    }

    public final boolean isActive() {
        return this.f29069b.get();
    }

    public final void setFaceDetectorListener(@NotNull OnFaceDetectorListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29068a = listener;
    }
}
