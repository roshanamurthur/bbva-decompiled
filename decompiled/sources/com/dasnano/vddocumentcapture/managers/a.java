package com.dasnano.vddocumentcapture.managers;

import com.veridas.camera.CameraAction;
import com.veridas.camera.CameraProperties;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: CameraManagerBase.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CameraManagerBase f39446p0;

    public a(CameraManagerBase cameraManagerBase) {
        this.f39446p0 = cameraManagerBase;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase cameraManagerBase = this.f39446p0;
        CameraProperties properties = cameraManagerBase.camera.getProperties();
        cameraManagerBase.setFocusMode(cameraManagerBase.PREFERRED_FOCUS_MODES);
        VDLogger.log(Logger.Tag.FOCUS_ATTEMPT, "TakePicture with focus mode: %s", properties.getFocusMode().name());
        cameraManagerBase.j(600);
    }
}
