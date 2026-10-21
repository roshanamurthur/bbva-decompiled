package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Camera2CapturePipeline.ResultListener.Checker, RingBuffer.OnRemoveCallback {
    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public boolean check(TotalCaptureResult totalCaptureResult) {
        return Camera2CapturePipeline.Pipeline.lambda$executeCapture$1(totalCaptureResult);
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}
