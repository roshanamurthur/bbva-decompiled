package xd;

import android.media.MediaRecorder;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.veridas.camera.CameraAction;
import com.veridas.camera.MediaRecorderAction;
import com.veridas.camera.one.CameraOneCamera;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements SynchronizationGuard.CriticalSection, CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94533p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94534q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f94535r0;

    public /* synthetic */ h(Uploader uploader, TransportContext transportContext, int i10) {
        this.f94534q0 = uploader;
        this.f94535r0 = transportContext;
        this.f94533p0 = i10;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Uploader uploader = (Uploader) this.f94534q0;
        uploader.f43832d.schedule((TransportContext) this.f94535r0, this.f94533p0 + 1);
        return null;
    }

    public /* synthetic */ h(CameraOneCamera.p pVar, int i10, MediaRecorderAction mediaRecorderAction) {
        this.f94534q0 = pVar;
        this.f94533p0 = i10;
        this.f94535r0 = mediaRecorderAction;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraOneCamera.p pVar = (CameraOneCamera.p) this.f94534q0;
        MediaRecorderAction mediaRecorderAction = (MediaRecorderAction) this.f94535r0;
        pVar.getClass();
        MediaRecorder mediaRecorder = new MediaRecorder();
        CameraOneCamera cameraOneCamera = CameraOneCamera.this;
        cameraOneCamera.L0 = mediaRecorder;
        cameraOneCamera.J0.unlock();
        cameraOneCamera.L0.setCamera(cameraOneCamera.J0);
        cameraOneCamera.L0.setOnErrorListener(cameraOneCamera.f66607x0);
        cameraOneCamera.L0.setVideoSource(1);
        cameraOneCamera.L0.setOrientationHint(this.f94533p0);
        if (mediaRecorderAction != null) {
            mediaRecorderAction.setMediaRecorder(cameraOneCamera.L0);
            mediaRecorderAction.execute(true);
        }
        cameraOneCamera.fireOnMediaRecorderInitialized(cameraOneCamera.L0);
    }
}
