package com.veridas.camera.one;

import com.veridas.camera.Camera;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.graphics.ImageUtils;
import com.veridas.log.Log;

/* JADX INFO: compiled from: CameraOneCamera.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends CameraOneCamera.ProtectedTask {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CameraOneCamera.x f66671q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CameraOneCamera.x xVar) {
        super();
        this.f66671q0 = xVar;
    }

    @Override // com.veridas.camera.one.CameraOneCamera.ProtectedTask
    public final void execute() {
        try {
            boolean zIsFacingFront = CameraOneCamera.this.isFacingFront();
            int width = this.f66671q0.f66659f.getWidth();
            int height = this.f66671q0.f66659f.getHeight();
            ImageUtils imageUtils = new ImageUtils();
            this.f66671q0.f66659f.copyPixelsToBuffer(this.f66671q0.f66660g);
            this.f66671q0.f66660g.flip();
            if (zIsFacingFront) {
                imageUtils.flipX(this.f66671q0.f66660g, width, height);
            }
            imageUtils.convertRgbaToYuv(this.f66671q0.f66660g, this.f66671q0.f66661h, width, height);
            CameraOneCamera.x xVar = this.f66671q0;
            Picture pictureCreate = CameraOneCamera.this.H0.create(xVar.f66661h, Resolution.create(this.f66671q0.f66659f.getWidth(), this.f66671q0.f66659f.getHeight()), 0, true, zIsFacingFront);
            Picture pictureMakeRoom = CameraOneCamera.this.S0.makeRoom();
            CameraOneCamera.this.R0.push(pictureCreate);
            if (pictureMakeRoom != null) {
                this.f66671q0.recycle(pictureMakeRoom);
            }
        } catch (Exception e5) {
            Log.e(Camera.LOG_TAG, e5.getMessage(), e5);
        }
    }
}
