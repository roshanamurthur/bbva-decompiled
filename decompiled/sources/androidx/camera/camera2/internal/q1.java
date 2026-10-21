package androidx.camera.camera2.internal;

import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1978p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1979q0;

    public /* synthetic */ q1(Object obj, int i10) {
        this.f1978p0 = i10;
        this.f1979q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1978p0;
        Object obj = this.f1979q0;
        switch (i10) {
            case 0:
                ProcessingCaptureSession.lambda$open$1((DeferrableSurface) obj);
                break;
            default:
                ((Camera2CameraControlImpl) obj).lambda$new$0();
                break;
        }
    }
}
