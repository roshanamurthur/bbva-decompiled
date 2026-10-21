package com.dasnano.vdphotoselfiecapture.fragments;

import android.graphics.Bitmap;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.dasnano.vdphotoselfiecapture.other.util.ImageUtils;
import com.dasnano.vdphotoselfiecapture.other.util.ResolutionUtils;
import com.google.android.gms.common.util.CollectionUtils;
import com.veridas.camera.CameraProperties;
import com.veridas.camera.picture.Picture;
import com.veridas.detect.Request;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.fragment.DasFragment;
import com.veridas.graphics.Frame;
import com.veridas.log.Log;
import com.veridas.math.geometry.Rectangle;
import com.veridas.metadata.entities.ArtifactClass;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CameraProperties f39673p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Picture f39674q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39675r0;

    public m(SelfieFragment selfieFragment, CameraProperties cameraProperties, Picture picture) {
        this.f39675r0 = selfieFragment;
        this.f39673p0 = cameraProperties;
        this.f39674q0 = picture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SpatialDetectionResult spatialDetectionResultRequest;
        String strF;
        Bitmap bitmapCreateRotatedAndScaledBitmap = ImageUtils.createRotatedAndScaledBitmap(ResolutionUtils.getDesiredResolution(this.f39675r0.f39593s2, this.f39673p0.getPictureResolution(), this.f39675r0.P1), this.f39674q0.getRotation(), this.f39674q0.getBitmap());
        Request requestBuild = new Request.Builder().frame(Frame.createRgb(bitmapCreateRotatedAndScaledBitmap, 0)).objectIdentifiers(CollectionUtils.listOf("face")).build();
        synchronized (this.f39675r0) {
            try {
                spatialDetectionResultRequest = this.f39675r0.L0.request(requestBuild);
            } catch (Exception e5) {
                Log.e(SelfieFragment.d3, e5);
                spatialDetectionResultRequest = null;
            }
        }
        byte[] bArrV = this.f39675r0.v(bitmapCreateRotatedAndScaledBitmap);
        SelfieFragment selfieFragment = this.f39675r0;
        ArtifactClass artifactClass = ArtifactClass.SELFIE;
        String strF2 = selfieFragment.F(artifactClass, "full", bArrV);
        Rectangle candidate = spatialDetectionResultRequest.getCandidate();
        if (candidate.isNotEmpty()) {
            strF = this.f39675r0.F(artifactClass, "cropped_full", this.f39675r0.x(bitmapCreateRotatedAndScaledBitmap, candidate));
        } else {
            strF = strF2;
        }
        ((VDPhotoSelfieViewModel) ((DasFragment) this.f39675r0).viewModel).setFullImagePath(strF2);
        ((VDPhotoSelfieViewModel) ((DasFragment) this.f39675r0).viewModel).setCroppedFullImagePath(strF);
        SelfieFragment selfieFragment2 = this.f39675r0;
        if (selfieFragment2.f39571g2) {
            return;
        }
        SelfieFragment.f(selfieFragment2);
    }
}
