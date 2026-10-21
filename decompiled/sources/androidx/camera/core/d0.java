package androidx.camera.core;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.ShaderProvider;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2058p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2059q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2060r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f2061s0;

    public /* synthetic */ d0(Object obj, Object obj2, int i10, Object obj3) {
        this.f2058p0 = i10;
        this.f2059q0 = obj;
        this.f2060r0 = obj2;
        this.f2061s0 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2058p0;
        Object obj = this.f2061s0;
        Object obj2 = this.f2060r0;
        Object obj3 = this.f2059q0;
        switch (i10) {
            case 0:
                ((ImageCapture) obj3).lambda$takePicture$3((Executor) obj2, (ImageCapture.OnImageCapturedCallback) obj);
                break;
            case 1:
                ((DefaultSurfaceProcessor) obj3).lambda$initGlRenderer$4((ShaderProvider) obj2, (CallbackToFutureAdapter.Completer) obj);
                break;
            default:
                ((com.vasco.digipass.sdk.utils.qrcodescanner.b) obj3).a((android.hardware.Camera) obj2, (byte[]) obj);
                break;
        }
    }
}
