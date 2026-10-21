package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements CallbackToFutureAdapter.Resolver, CameraBurstCaptureCallback.CaptureSequenceCallback {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f1817p0;

    public /* synthetic */ c0(Object obj) {
        this.f1817p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((Camera2CameraImpl) this.f1817p0).lambda$release$3(completer);
    }

    @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
    public final void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i10, boolean z10) {
        ((CaptureSession) this.f1817p0).lambda$issueBurstCaptureRequest$2(cameraCaptureSession, i10, z10);
    }
}
