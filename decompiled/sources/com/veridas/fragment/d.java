package com.veridas.fragment;

import android.view.SurfaceHolder;
import com.veridas.view.surface.SurfaceHolderAdapter;

/* JADX INFO: compiled from: DasCaptureFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d extends SurfaceHolderAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DasCaptureFragment f67138p0;

    public d(DasCaptureFragment dasCaptureFragment) {
        this.f67138p0 = dasCaptureFragment;
    }

    @Override // com.veridas.view.surface.SurfaceHolderAdapter, android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f67138p0.setPreviewSurfaceAvailable();
    }

    @Override // com.veridas.view.surface.SurfaceHolderAdapter, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f67138p0.setPreviewSurfaceAvailable();
    }

    @Override // com.veridas.view.surface.SurfaceHolderAdapter, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f67138p0.setPreviewSurfaceUnavailable();
    }
}
