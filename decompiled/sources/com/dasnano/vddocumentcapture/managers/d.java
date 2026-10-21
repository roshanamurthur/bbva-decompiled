package com.dasnano.vddocumentcapture.managers;

import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.veridas.camera.CameraAction;

/* JADX INFO: compiled from: CameraManagerBase.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GenericDocumentState f39451p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CameraManagerBase f39452q0;

    public d(CameraManagerBase cameraManagerBase, GenericDocumentState genericDocumentState) {
        this.f39452q0 = cameraManagerBase;
        this.f39451p0 = genericDocumentState;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        CameraManagerBase cameraManagerBase = this.f39452q0;
        cameraManagerBase.layoutInterface.dismissProgressDialogIfNeeded();
        cameraManagerBase.setCanTakePicture(true);
        if (this.f39451p0.isCapturePossible) {
            cameraManagerBase.tryToTakeAPictureOnFocus();
        }
    }
}
