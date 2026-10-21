package androidx.camera.camera2.internal;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1931p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1932q0;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f1931p0 = i10;
        this.f1932q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1931p0;
        Object obj = this.f1932q0;
        switch (i10) {
            case 0:
                ((Camera2CameraImpl.StateCallback.ScheduledReopen) obj).lambda$run$0();
                break;
            default:
                ((SafeCloseImageReaderProxy) obj).safeClose();
                break;
        }
    }
}
