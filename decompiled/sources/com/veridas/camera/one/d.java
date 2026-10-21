package com.veridas.camera.one;

import android.hardware.Camera;
import com.veridas.camera.CameraAction;

/* JADX INFO: compiled from: CameraOneCamera.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CameraAction f66669p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CameraOneCamera.u f66670q0;

    public d(CameraOneCamera.u uVar, CameraAction cameraAction) {
        this.f66670q0 = uVar;
        this.f66669p0 = cameraAction;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z10, Camera camera) {
        CameraOneCamera.this.fireOnFocusFinished(z10);
        CameraAction cameraAction = this.f66669p0;
        if (cameraAction != null) {
            cameraAction.execute(z10);
        }
    }
}
