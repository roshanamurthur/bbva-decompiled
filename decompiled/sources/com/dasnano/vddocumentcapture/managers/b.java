package com.dasnano.vddocumentcapture.managers;

import com.veridas.camera.CameraAction;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: CameraManagerBase.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CameraManagerBase f39447p0;

    /* JADX INFO: compiled from: CameraManagerBase.java */
    public class a implements CameraAction {
        public a() {
        }

        @Override // com.veridas.camera.CameraAction
        public final void execute(boolean z10) {
            b.this.f39447p0.tryToTakeAPictureOnFocus();
        }
    }

    public b(CameraManagerBase cameraManagerBase) {
        this.f39447p0 = cameraManagerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CameraManagerBase cameraManagerBase = this.f39447p0;
        if (cameraManagerBase.autofocusResponded.getAndSet(true)) {
            return;
        }
        VDLogger.log(Logger.Tag.FOCUS_ATTEMPT, "Camera autoFocus didn't respond");
        cameraManagerBase.camera.stopAutoFocus(new a());
    }
}
