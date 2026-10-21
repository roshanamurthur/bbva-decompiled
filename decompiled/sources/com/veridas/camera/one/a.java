package com.veridas.camera.one;

import android.hardware.Camera;
import com.veridas.camera.CameraAction;
import com.veridas.camera.one.CameraOneCamera;
import com.veridas.camera.resolution.Resolution;

/* JADX INFO: compiled from: CameraOneCamera.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends CameraOneCamera.ProtectedTask {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Camera.Parameters f66663q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CameraAction f66664r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CameraOneCamera f66665s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CameraOneCamera cameraOneCamera, Camera.Parameters parameters, CameraAction cameraAction) {
        super();
        this.f66665s0 = cameraOneCamera;
        this.f66663q0 = parameters;
        this.f66664r0 = cameraAction;
    }

    @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
    public final void execute() {
        CameraOneCamera cameraOneCamera = this.f66665s0;
        final Camera.Parameters parameters = cameraOneCamera.J0.getParameters();
        final Camera.Parameters parameters2 = this.f66663q0;
        final CameraAction cameraAction = this.f66664r0;
        CameraOneCamera.b(cameraOneCamera, new CameraAction() { // from class: wi.a
            @Override // com.veridas.camera.CameraAction
            public final void execute(boolean z10) {
                com.veridas.camera.one.a aVar = this.f94259p0;
                aVar.getClass();
                Camera.Parameters parameters3 = parameters;
                Camera.Size previewSize = parameters3.getPreviewSize();
                Camera.Parameters parameters4 = parameters2;
                Camera.Size previewSize2 = parameters4.getPreviewSize();
                int i10 = previewSize.width;
                int i11 = previewSize2.width;
                CameraOneCamera cameraOneCamera2 = aVar.f66665s0;
                if (i10 != i11 || previewSize.height != previewSize2.height) {
                    Camera.Size previewSize3 = aVar.f66663q0.getPreviewSize();
                    parameters3.setPreviewSize(previewSize3.width, previewSize3.height);
                    cameraOneCamera2.J0.stopPreview();
                    cameraOneCamera2.J0.setParameters(parameters3);
                    cameraOneCamera2.J0.startPreview();
                }
                cameraOneCamera2.J0.setParameters(parameters4);
                c cVar = new c(cameraOneCamera2.J0);
                synchronized (cameraOneCamera2.F0) {
                    cameraOneCamera2.K0 = cVar;
                }
                cameraOneCamera2.N0 = Resolution.from(cameraOneCamera2.J0.getParameters().getPreviewSize());
                cameraOneCamera2.h();
                cameraOneCamera2.g();
                cameraOneCamera2.fireOnParametersChanged();
                CameraAction cameraAction2 = cameraAction;
                if (cameraAction2 != null) {
                    cameraAction2.execute(true);
                }
            }
        });
    }
}
