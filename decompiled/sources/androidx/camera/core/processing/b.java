package androidx.camera.core.processing;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veridas.camera.CameraAction;
import com.veridas.fragment.DasCaptureFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements CallbackToFutureAdapter.Resolver, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2198p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2199q0;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f2198p0 = obj;
        this.f2199q0 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((DefaultSurfaceProcessor) this.f2198p0).lambda$initGlRenderer$5((ShaderProvider) this.f2199q0, completer);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        DasCaptureFragment dasCaptureFragment = (DasCaptureFragment) this.f2198p0;
        CameraAction cameraAction = (CameraAction) this.f2199q0;
        int i10 = DasCaptureFragment.I0;
        if (z10) {
            dasCaptureFragment.clearCamera();
        } else {
            dasCaptureFragment.getClass();
        }
        if (cameraAction != null) {
            cameraAction.execute(z10);
        }
    }
}
