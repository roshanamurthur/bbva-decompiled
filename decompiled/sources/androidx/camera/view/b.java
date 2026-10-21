package androidx.camera.view;

import androidx.arch.core.util.Function;
import androidx.camera.core.n1;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.location.LocationManagerCompat;
import androidx.core.os.CancellationSignal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function, CancellationSignal.OnCancelListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2301p0;

    public /* synthetic */ b(Object obj) {
        this.f2301p0 = obj;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return ((CameraController) this.f2301p0).lambda$new$0((ProcessCameraProvider) obj);
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        LocationManagerCompat.f fVar = (LocationManagerCompat.f) this.f2301p0;
        synchronized (fVar) {
            try {
                if (fVar.f19954t0) {
                    return;
                }
                fVar.f19954t0 = true;
                fVar.f19953s0 = null;
                fVar.f19950p0.removeUpdates(fVar);
                n1 n1Var = fVar.f19955u0;
                if (n1Var != null) {
                    fVar.f19952r0.removeCallbacks(n1Var);
                    fVar.f19955u0 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
