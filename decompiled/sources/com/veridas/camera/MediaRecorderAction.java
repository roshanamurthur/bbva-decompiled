package com.veridas.camera;

import android.media.MediaRecorder;

/* JADX INFO: loaded from: classes9.dex */
public abstract class MediaRecorderAction implements CameraAction {
    protected MediaRecorder mediaRecorder;

    public MediaRecorder getMediaRecorder() {
        return this.mediaRecorder;
    }

    public void setMediaRecorder(MediaRecorder mediaRecorder) {
        this.mediaRecorder = mediaRecorder;
    }
}
