package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1961p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1962q0;

    public /* synthetic */ n(Object obj, int i10) {
        this.f1961p0 = i10;
        this.f1962q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1961p0;
        Object obj = this.f1962q0;
        switch (i10) {
            case 0:
                ((CameraCaptureCallback) obj).onCaptureCancelled();
                break;
            default:
                ((Camera2CapturePipeline.PipelineTask) obj).postCapture();
                break;
        }
    }
}
