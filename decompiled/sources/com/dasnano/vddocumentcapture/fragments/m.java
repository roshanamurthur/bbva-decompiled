package com.dasnano.vddocumentcapture.fragments;

import com.dasnano.vddocumentcapture.other.VDEnums;
import com.veridas.camera.CameraAction;
import com.veridas.camera.picture.Picture;
import com.veridas.detect.spatial.SpatialDetectionResult;

/* JADX INFO: compiled from: DocumentFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Picture f39377p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SpatialDetectionResult f39378q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ DocumentFragment f39379r0;

    public m(DocumentFragment documentFragment, Picture picture, SpatialDetectionResult spatialDetectionResult) {
        this.f39379r0 = documentFragment;
        this.f39377p0 = picture;
        this.f39378q0 = spatialDetectionResult;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        this.f39379r0.delegateImagesInAnotherThread(this.f39377p0, this.f39378q0, VDEnums.VDCaptureType.VD_OBVERSE_WITHOUT_FLASH);
    }
}
