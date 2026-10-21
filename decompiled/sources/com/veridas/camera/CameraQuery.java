package com.veridas.camera;

import com.veridas.camera.Camera;

/* JADX INFO: loaded from: classes9.dex */
public interface CameraQuery<C extends Camera> {
    C execute() throws CameraException;

    CameraQuery facing(Camera.Facing facing);

    CameraQuery preferAutoFocus(boolean z10);
}
