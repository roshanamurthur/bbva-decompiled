package com.dasnano.vddocumentcapture.managers;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;

/* JADX INFO: compiled from: UserVisualHelpManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Bitmap f39459p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Rect f39460q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ UserVisualHelpManager f39461r0;

    public i(UserVisualHelpManager userVisualHelpManager, Bitmap bitmap, Rect rect) {
        this.f39461r0 = userVisualHelpManager;
        this.f39459p0 = bitmap;
        this.f39460q0 = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserVisualHelpManager userVisualHelpManager = this.f39461r0;
        Bitmap bitmap = this.f39459p0;
        if (bitmap != null) {
            ImageView imageView = userVisualHelpManager.f39411b;
            Rect rect = this.f39460q0;
            imageView.setX(rect.left);
            userVisualHelpManager.f39411b.setY(rect.top);
        }
        userVisualHelpManager.f39411b.setImageBitmap(bitmap);
        userVisualHelpManager.f39411b.requestLayout();
    }
}
