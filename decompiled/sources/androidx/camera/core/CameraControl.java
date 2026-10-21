package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str) {
            super(str);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public OperationCanceledException(@NonNull String str, @NonNull Throwable th2) {
            super(str, th2);
        }
    }

    @NonNull
    ListenableFuture<Void> cancelFocusAndMetering();

    @NonNull
    ListenableFuture<Void> enableTorch(boolean z10);

    @NonNull
    ListenableFuture<Integer> setExposureCompensationIndex(int i10);

    @NonNull
    ListenableFuture<Void> setLinearZoom(@FloatRange(from = 0.0d, to = 1.0d) float f6);

    @NonNull
    ListenableFuture<Void> setZoomRatio(float f6);

    @NonNull
    ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction);
}
