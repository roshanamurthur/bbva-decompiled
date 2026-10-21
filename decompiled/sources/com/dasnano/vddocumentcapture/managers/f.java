package com.dasnano.vddocumentcapture.managers;

import androidx.compose.material3.TooltipKt;

/* JADX INFO: compiled from: UserVisualHelpManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ UserVisualHelpManager f39456p0;

    public f(UserVisualHelpManager userVisualHelpManager) {
        this.f39456p0 = userVisualHelpManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserVisualHelpManager userVisualHelpManager = this.f39456p0;
        userVisualHelpManager.f39414e.setCameraDistance(88888.0f);
        userVisualHelpManager.f39414e.animate().rotationY(180.0f).setDuration(TooltipKt.TooltipDuration).start();
    }
}
