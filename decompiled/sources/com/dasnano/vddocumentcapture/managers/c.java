package com.dasnano.vddocumentcapture.managers;

import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.veridas.camera.CameraAction;

/* JADX INFO: compiled from: CameraManagerBase.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CameraAction f39449p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CameraManagerBase f39450q0;

    public c(CameraManagerBase cameraManagerBase, CameraAction cameraAction) {
        this.f39450q0 = cameraManagerBase;
        this.f39449p0 = cameraAction;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase cameraManagerBase = this.f39450q0;
        if (cameraManagerBase.layoutInterface.getGenericDocumentState() == GenericDocumentState.CALCULATING_AWAITING) {
            if (cameraManagerBase.configUseSmartAndRectDetector && cameraManagerBase.configIntermittentIdentification) {
                cameraManagerBase.layoutInterface.setGenericDocumentState(GenericDocumentState.AWAIT_DOCUMENT);
            } else {
                cameraManagerBase.layoutInterface.setGenericDocumentState(GenericDocumentState.CALCULATING_FPS);
            }
        }
        CameraAction cameraAction = this.f39449p0;
        if (cameraAction != null) {
            cameraAction.execute(z10);
        }
    }
}
