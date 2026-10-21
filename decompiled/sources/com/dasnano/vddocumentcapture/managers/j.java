package com.dasnano.vddocumentcapture.managers;

import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: UserVisualHelpManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VDEnums.VDCaptureType f39462p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ UserVisualHelpManager f39463q0;

    public j(UserVisualHelpManager userVisualHelpManager, VDEnums.VDCaptureType vDCaptureType) {
        this.f39463q0 = userVisualHelpManager;
        this.f39462p0 = vDCaptureType;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VDLogger.log(Logger.Tag.TIME_WITHOUT_PHOTO_TAKEN, "VDTimeWithoutPhotoTaken called");
        UserVisualHelpManager userVisualHelpManager = this.f39463q0;
        userVisualHelpManager.f39415f.getIVDDocumentDelegate().VDTimeWithoutPhotoTaken(userVisualHelpManager.f39432x, this.f39462p0);
    }
}
