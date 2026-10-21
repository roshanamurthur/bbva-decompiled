package androidx.camera.core;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.veridas.camera.CameraAction;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements CallbackToFutureAdapter.Resolver, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2163p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2164q0;

    public /* synthetic */ k1(Object obj, Object obj2) {
        this.f2163p0 = obj;
        this.f2164q0 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return SurfaceRequest.lambda$new$0((AtomicReference) this.f2163p0, (String) this.f2164q0, completer);
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        SelfieFragment.e((SelfieFragment) this.f2163p0, (Runnable) this.f2164q0);
    }
}
