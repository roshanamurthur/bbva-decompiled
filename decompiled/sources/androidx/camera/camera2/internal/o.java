package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1963p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1964q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f1965r0;

    public /* synthetic */ o(Object obj, Object obj2, int i10) {
        this.f1963p0 = i10;
        this.f1964q0 = obj;
        this.f1965r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1963p0;
        Object obj = this.f1965r0;
        Object obj2 = this.f1964q0;
        switch (i10) {
            case 0:
                ((CameraCaptureCallback) obj2).onCaptureCompleted((CameraCaptureResult) obj);
                break;
            default:
                ((ProcessingCaptureSession.AnonymousClass2) obj2).lambda$onCaptureFailed$0((CaptureConfig) obj);
                break;
        }
    }
}
