package com.veridas.camera.one;

/* JADX INFO: compiled from: CameraOneCamera.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends CameraOneCamera.ProtectedTask {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CameraOneCamera f66668q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CameraOneCamera cameraOneCamera) {
        super();
        this.f66668q0 = cameraOneCamera;
    }

    @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
    public final void execute() {
        this.f66668q0.fireOnAvailable();
    }
}
