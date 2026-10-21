package com.veridas.camera;

import com.veridas.camera.Camera;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractCameraQuery<C extends Camera> implements CameraQuery<C> {
    protected Camera.Facing facing;
    protected Boolean preferAutoFocus;

    @Override // com.veridas.camera.CameraQuery
    public CameraQuery facing(Camera.Facing facing) {
        this.facing = facing;
        return this;
    }

    @Override // com.veridas.camera.CameraQuery
    public CameraQuery preferAutoFocus(boolean z10) {
        this.preferAutoFocus = Boolean.valueOf(z10);
        return this;
    }
}
