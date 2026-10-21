package com.veridas.camera;

/* JADX INFO: loaded from: classes9.dex */
public class NoPreviewSurfaceAvailableException extends CameraException {
    public NoPreviewSurfaceAvailableException(String str) {
        super(String.format("No preview surface available for camera %s", str));
    }
}
