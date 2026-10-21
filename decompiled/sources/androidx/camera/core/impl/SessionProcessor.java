package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface SessionProcessor {

    public interface CaptureCallback {
        void onCaptureCompleted(long j10, int i10, @NonNull Map<CaptureResult.Key, Object> map);

        void onCaptureFailed(int i10);

        void onCaptureProcessStarted(int i10);

        void onCaptureSequenceAborted(int i10);

        void onCaptureSequenceCompleted(int i10);

        void onCaptureStarted(int i10, long j10);
    }

    void abortCapture(int i10);

    void deInitSession();

    @NonNull
    SessionConfig initSession(@NonNull CameraInfo cameraInfo, @NonNull OutputSurface outputSurface, @NonNull OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor);

    void setParameters(@NonNull Config config);

    int startCapture(@NonNull CaptureCallback captureCallback);

    int startRepeating(@NonNull CaptureCallback captureCallback);

    void stopRepeating();
}
