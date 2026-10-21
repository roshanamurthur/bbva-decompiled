package com.veridas.view.surface;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes11.dex */
public class DualExecuteSurfaceTextureListener implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TextureView.SurfaceTextureListener f67496p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextureView.SurfaceTextureListener f67497q0;

    public TextureView.SurfaceTextureListener getCameraSurfaceTextureListener() {
        return this.f67496p0;
    }

    public TextureView.SurfaceTextureListener getFragmentSurfaceTextureListener() {
        return this.f67497q0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f67496p0;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f67497q0;
        if (surfaceTextureListener2 != null) {
            surfaceTextureListener2.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f67496p0;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f67497q0;
        if (surfaceTextureListener2 == null) {
            return true;
        }
        surfaceTextureListener2.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f67496p0;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f67497q0;
        if (surfaceTextureListener2 != null) {
            surfaceTextureListener2.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f67496p0;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f67497q0;
        if (surfaceTextureListener2 != null) {
            surfaceTextureListener2.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void setCameraSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f67496p0 = surfaceTextureListener;
    }

    public void setFragmentSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f67497q0 = surfaceTextureListener;
    }
}
