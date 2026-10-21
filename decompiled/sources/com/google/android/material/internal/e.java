package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ViewOverlayApi18.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(18)
public final class e implements ViewOverlayImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewOverlay f44923a;

    public e(@NonNull View view) {
        this.f44923a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public final void add(@NonNull Drawable drawable) {
        this.f44923a.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public final void remove(@NonNull Drawable drawable) {
        this.f44923a.remove(drawable);
    }
}
