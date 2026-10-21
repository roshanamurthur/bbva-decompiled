package com.veridas.camera;

import android.media.MediaRecorder;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;

/* JADX INFO: loaded from: classes9.dex */
public interface CameraListener {
    void onAvailable(Camera camera);

    void onError(Camera camera, Camera.Error error);

    void onFocusFinished(Camera camera, boolean z10);

    void onFocusStarted(Camera camera);

    void onLocked(Camera camera);

    void onMediaRecorderInitialized(Camera camera, MediaRecorder mediaRecorder);

    void onMediaRecorderStarted(Camera camera, MediaRecorder mediaRecorder);

    void onMediaRecorderStopped(Camera camera, MediaRecorder mediaRecorder);

    void onParametersChanged(Camera camera);

    void onPictureReady(Camera camera, Picture picture);

    void onPreviewReady(Camera camera, Picture picture);

    void onPreviewStarted(Camera camera);

    void onPreviewStopped(Camera camera);

    void onPreviewSurfaceChanged(Camera camera, Resolution resolution);

    void onReconnected(Camera camera);

    void onReleased(Camera camera);

    void onReoriented(Camera camera);

    void onStarted(Camera camera);

    void onStopped(Camera camera);

    void onUnlocked(Camera camera);
}
