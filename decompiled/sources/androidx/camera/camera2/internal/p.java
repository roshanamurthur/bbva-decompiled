package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1968p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1969q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f1970r0;

    public /* synthetic */ p(Object obj, Object obj2, int i10) {
        this.f1968p0 = i10;
        this.f1969q0 = obj;
        this.f1970r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1968p0;
        Object obj = this.f1970r0;
        Object obj2 = this.f1969q0;
        switch (i10) {
            case 0:
                ((Camera2CameraControlImpl.CameraControlSessionCallback) obj2).lambda$onCaptureCompleted$0((TotalCaptureResult) obj);
                break;
            default:
                ((SynchronizedCaptureSessionBaseImpl) obj2).lambda$onSessionFinished$4((SynchronizedCaptureSession) obj);
                break;
        }
    }
}
