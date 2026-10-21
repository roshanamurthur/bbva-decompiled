package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.impl.CameraCaptureCallback;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f1997p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f1998q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f1999r0;

    public /* synthetic */ v(Object obj, Object obj2, int i10) {
        this.f1997p0 = i10;
        this.f1998q0 = obj;
        this.f1999r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f1997p0;
        Object obj = this.f1999r0;
        Object obj2 = this.f1998q0;
        switch (i10) {
            case 0:
                Camera2CameraImpl.lambda$configAndClose$0((Surface) obj2, (SurfaceTexture) obj);
                break;
            default:
                ((Camera2CameraControlImpl) obj2).lambda$removeSessionCameraCaptureCallback$9((CameraCaptureCallback) obj);
                break;
        }
    }
}
