package com.bbva.discreetmode.camera;

import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.UseCase;
import androidx.camera.core.t;
import com.bbva.discreetmode.camera.detector.DiscreetModeFacesDetector;
import com.bbva.discreetmode.camera.detector.OnFaceDetectorListener;
import com.bbva.discreetmode.camera.models.CameraConfiguration;
import com.bbva.discreetmode.camera.models.ImageAnalysisConfiguration;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeCameraUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/discreetmode/camera/DiscreetModeCameraUseCase;", "", "Lkotlin/Function1;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "Landroidx/camera/core/UseCase;", "b", "Landroidx/camera/core/UseCase;", "getInstance", "()Landroidx/camera/core/UseCase;", "instance", "Lcom/bbva/discreetmode/camera/models/CameraConfiguration;", "config", "<init>", "(Lcom/bbva/discreetmode/camera/models/CameraConfiguration;)V", "FacesAnalyzer", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeCameraUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CameraConfiguration f29063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ImageAnalysis f29064b;

    public DiscreetModeCameraUseCase(@NotNull CameraConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f29063a = config;
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setTargetResolution(new Size(config.getWidth(), config.getHeight())).build();
        Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "Builder()\n        .setTargetResolution(Size(config.width, config.height))\n        .build()");
        this.f29064b = imageAnalysisBuild;
    }

    @NotNull
    public final UseCase getInstance() {
        return this.f29064b;
    }

    public final void setListener(@NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f29064b.setAnalyzer(Executors.newSingleThreadExecutor(), new FacesAnalyzer(this.f29063a.getAnalysisConfig(), listener, null, 4, null));
    }

    /* JADX INFO: compiled from: DiscreetModeCameraUseCase.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/discreetmode/camera/DiscreetModeCameraUseCase$FacesAnalyzer;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "Lcom/bbva/discreetmode/camera/detector/OnFaceDetectorListener;", "Landroidx/camera/core/ImageProxy;", AuthConstants.IMAGE, "", "analyze", "", "Lcom/google/mlkit/vision/face/Face;", "faces", "onSuccessFacesDetection", "onFailureFacesDetection", "Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration;", "options", "Lkotlin/Function1;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/bbva/discreetmode/camera/detector/DiscreetModeFacesDetector;", "facesDetector", "<init>", "(Lcom/bbva/discreetmode/camera/models/ImageAnalysisConfiguration;Lkotlin/jvm/functions/Function1;Lcom/bbva/discreetmode/camera/detector/DiscreetModeFacesDetector;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
    public static final class FacesAnalyzer implements ImageAnalysis.Analyzer, OnFaceDetectorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Function1<Integer, Unit> f29065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final DiscreetModeFacesDetector f29066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final FaceDetectorOptions f29067c;

        /* JADX WARN: Multi-variable type inference failed */
        public FacesAnalyzer(@NotNull ImageAnalysisConfiguration options, @NotNull Function1<? super Integer, Unit> listener, @NotNull DiscreetModeFacesDetector facesDetector) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(facesDetector, "facesDetector");
            this.f29065a = listener;
            this.f29066b = facesDetector;
            FaceDetectorOptions faceDetectorOptionsBuild = new FaceDetectorOptions.Builder().setPerformanceMode(options.getPerformanceMode().getValue()).setClassificationMode(options.getCom.dasnano.vddocumentcapture.config.VDDocumentConfiguration.CLASSIFICATION java.lang.String().getValue()).build();
            Intrinsics.checkNotNullExpressionValue(faceDetectorOptionsBuild, "Builder()\n            .setPerformanceMode(options.performanceMode.value)\n            .setClassificationMode(options.classification.value)\n            .build()");
            this.f29067c = faceDetectorOptionsBuild;
            facesDetector.setFaceDetectorListener(this);
        }

        @Override // androidx.camera.core.ImageAnalysis.Analyzer
        public void analyze(@NotNull ImageProxy image) {
            Intrinsics.checkNotNullParameter(image, "image");
            DiscreetModeFacesDetector discreetModeFacesDetector = this.f29066b;
            if (discreetModeFacesDetector.isActive()) {
                image.close();
            } else {
                discreetModeFacesDetector.detectFaces(this.f29067c, image);
            }
        }

        @Override // androidx.camera.core.ImageAnalysis.Analyzer
        public final /* synthetic */ Size getDefaultTargetResolution() {
            return t.a(this);
        }

        @Override // androidx.camera.core.ImageAnalysis.Analyzer
        public final /* synthetic */ int getTargetCoordinateSystem() {
            return t.b(this);
        }

        @Override // com.bbva.discreetmode.camera.detector.OnFaceDetectorListener
        public void onFailureFacesDetection() {
            this.f29065a.invoke(0);
        }

        @Override // com.bbva.discreetmode.camera.detector.OnFaceDetectorListener
        public void onSuccessFacesDetection(@NotNull List<? extends Face> faces) {
            Intrinsics.checkNotNullParameter(faces, "faces");
            this.f29065a.invoke(Integer.valueOf(faces.size()));
        }

        @Override // androidx.camera.core.ImageAnalysis.Analyzer
        public final /* synthetic */ void updateTransform(Matrix matrix) {
            t.c(this, matrix);
        }

        public /* synthetic */ FacesAnalyzer(ImageAnalysisConfiguration imageAnalysisConfiguration, Function1 function1, DiscreetModeFacesDetector discreetModeFacesDetector, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageAnalysisConfiguration, function1, (i10 & 4) != 0 ? new DiscreetModeFacesDetector() : discreetModeFacesDetector);
        }
    }
}
