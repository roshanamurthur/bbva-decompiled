package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements CallbackToFutureAdapter.Resolver, ForceCloseCaptureSession.OnConfigured {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2021p0;

    public /* synthetic */ y0(Object obj) {
        this.f2021p0 = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((CaptureSession) this.f2021p0).lambda$release$1(completer);
    }

    @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
    public final void run(SynchronizedCaptureSession synchronizedCaptureSession) {
        ((SynchronizedCaptureSessionImpl) this.f2021p0).lambda$onConfigured$2(synchronizedCaptureSession);
    }
}
