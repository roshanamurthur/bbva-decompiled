package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements Camera2CapturePipeline.ResultListener.Checker {
    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public final boolean check(TotalCaptureResult totalCaptureResult) {
        return Camera2CapturePipeline.TorchTask.lambda$preCapture$1(totalCaptureResult);
    }
}
