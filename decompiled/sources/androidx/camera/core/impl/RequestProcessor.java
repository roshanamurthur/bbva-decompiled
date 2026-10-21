package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface RequestProcessor {

    public interface Callback {
        void onCaptureBufferLost(@NonNull Request request, long j10, int i10);

        void onCaptureCompleted(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult);

        void onCaptureFailed(@NonNull Request request, @NonNull CameraCaptureFailure cameraCaptureFailure);

        void onCaptureProgressed(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult);

        void onCaptureSequenceAborted(int i10);

        void onCaptureSequenceCompleted(int i10, long j10);

        void onCaptureStarted(@NonNull Request request, long j10, long j11);
    }

    public interface Request {
        @NonNull
        Config getParameters();

        @NonNull
        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(@NonNull Request request, @NonNull Callback callback);

    void stopRepeating();

    int submit(@NonNull Request request, @NonNull Callback callback);

    int submit(@NonNull List<Request> list, @NonNull Callback callback);
}
