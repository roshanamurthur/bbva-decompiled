package com.veridas.camera.one;

import com.veridas.camera.AbstractCamera;
import com.veridas.camera.Camera;
import com.veridas.camera.CameraAction;
import com.veridas.log.Log;

/* JADX INFO: compiled from: CameraOneCamera.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends CameraOneCamera.ProtectedTask {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CameraAction f66666q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CameraOneCamera f66667r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CameraOneCamera cameraOneCamera, CameraAction cameraAction) {
        super();
        this.f66667r0 = cameraOneCamera;
        this.f66666q0 = cameraAction;
    }

    @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
    public final void execute() {
        boolean z10;
        CameraOneCamera cameraOneCamera = this.f66667r0;
        try {
            if (((AbstractCamera) cameraOneCamera).previewMode == Camera.PreviewMode.PUSH) {
                cameraOneCamera.J0.setPreviewCallback(null);
            } else {
                cameraOneCamera.J0.setPreviewCallbackWithBuffer(null);
            }
            z10 = true;
        } catch (Exception e5) {
            Log.e(Camera.LOG_TAG, e5);
            z10 = false;
        }
        CameraAction cameraAction = this.f66666q0;
        if (cameraAction != null) {
            cameraAction.execute(z10);
        }
    }
}
