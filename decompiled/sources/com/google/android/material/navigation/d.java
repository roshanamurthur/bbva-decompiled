package com.google.android.material.navigation;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.WindowUtils;

/* JADX INFO: compiled from: NavigationView.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NavigationView f45015p0;

    public d(NavigationView navigationView) {
        this.f45015p0 = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        NavigationView navigationView = this.f45015p0;
        navigationView.getLocationOnScreen(navigationView.F0);
        boolean z10 = true;
        boolean z11 = navigationView.F0[1] == 0;
        navigationView.f45007x0.setBehindStatusBar(z11);
        navigationView.setDrawTopInsetForeground(z11 && navigationView.isTopInsetScrimEnabled());
        int i10 = navigationView.F0[0];
        navigationView.setDrawLeftInsetForeground(i10 == 0 || navigationView.getWidth() + i10 == 0);
        Activity activity = ContextUtils.getActivity(navigationView.getContext());
        if (activity != null) {
            Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
            navigationView.setDrawBottomInsetForeground((currentWindowBounds.height() - navigationView.getHeight() == navigationView.F0[1]) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) && navigationView.isBottomInsetScrimEnabled());
            if (currentWindowBounds.width() != navigationView.F0[0] && currentWindowBounds.width() - navigationView.getWidth() != navigationView.F0[0]) {
                z10 = false;
            }
            navigationView.setDrawRightInsetForeground(z10);
        }
    }
}
