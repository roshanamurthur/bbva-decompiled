package com.veridas.fragment;

import android.graphics.SurfaceTexture;
import com.veridas.view.surface.SurfaceTextureAdapter;

/* JADX INFO: compiled from: DasCaptureFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends SurfaceTextureAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DasCaptureFragment f67139p0;

    public e(DasCaptureFragment dasCaptureFragment) {
        this.f67139p0 = dasCaptureFragment;
    }

    @Override // com.veridas.view.surface.SurfaceTextureAdapter, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f67139p0.setPreviewSurfaceAvailable();
    }

    @Override // com.veridas.view.surface.SurfaceTextureAdapter, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f67139p0.setPreviewSurfaceUnavailable();
        return true;
    }

    @Override // com.veridas.view.surface.SurfaceTextureAdapter, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f67139p0.setPreviewSurfaceAvailable();
    }
}
