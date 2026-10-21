package androidx.camera.core.processing;

import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.veridas.camera.CameraAction;
import com.veridas.camera.picture.Picture;
import com.veridas.detect.spatial.SpatialDetectionResult;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements SurfaceRequest.TransformationInfoListener, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2218p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2219q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2220r0;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3) {
        this.f2218p0 = obj;
        this.f2219q0 = obj2;
        this.f2220r0 = obj3;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase cameraManagerBase = (CameraManagerBase) this.f2218p0;
        cameraManagerBase.layoutInterface.onPictureTaken((Picture) this.f2219q0, (SpatialDetectionResult) this.f2220r0, cameraManagerBase.layoutInterface.getGenericDocumentState());
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public final void onTransformationInfoUpdate(SurfaceRequest.TransformationInfo transformationInfo) {
        SurfaceProcessorNode.lambda$setupSurfaceUpdatePipeline$0((SurfaceOutput) this.f2218p0, (SettableSurface) this.f2219q0, (SettableSurface) this.f2220r0, transformationInfo);
    }
}
