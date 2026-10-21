package xd;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.veridas.camera.CameraAction;
import com.veridas.fragment.DasCaptureFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements SynchronizationGuard.CriticalSection, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f94528p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94529q0;

    public /* synthetic */ f(Object obj, Object obj2) {
        this.f94528p0 = obj;
        this.f94529q0 = obj2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Uploader uploader = (Uploader) this.f94528p0;
        uploader.f43831c.recordSuccess((Iterable) this.f94529q0);
        return null;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        DasCaptureFragment dasCaptureFragment = (DasCaptureFragment) this.f94528p0;
        CameraAction cameraAction = (CameraAction) this.f94529q0;
        int i10 = DasCaptureFragment.I0;
        dasCaptureFragment.stopCamera(cameraAction);
    }
}
