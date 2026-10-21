package com.veridas.camera;

import android.media.MediaRecorder;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;

/* JADX INFO: loaded from: classes9.dex */
public abstract class CameraAdapter implements CameraListener {
    @Override // com.veridas.camera.CameraListener
    public void onAvailable(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onFocusStarted(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onLocked(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onParametersChanged(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onPreviewStarted(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onPreviewStopped(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onReconnected(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onReleased(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onReoriented(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onStarted(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onStopped(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onUnlocked(Camera camera) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onError(Camera camera, Camera.Error error) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onFocusFinished(Camera camera, boolean z10) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onMediaRecorderInitialized(Camera camera, MediaRecorder mediaRecorder) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onMediaRecorderStarted(Camera camera, MediaRecorder mediaRecorder) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onMediaRecorderStopped(Camera camera, MediaRecorder mediaRecorder) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onPictureReady(Camera camera, Picture picture) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onPreviewReady(Camera camera, Picture picture) {
    }

    @Override // com.veridas.camera.CameraListener
    public void onPreviewSurfaceChanged(Camera camera, Resolution resolution) {
    }
}
