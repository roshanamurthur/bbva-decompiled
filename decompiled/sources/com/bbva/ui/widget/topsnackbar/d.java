package com.bbva.ui.widget.topsnackbar;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: compiled from: TSnackbar.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends ViewPropertyAnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TSnackbar f37774b;

    public d(TSnackbar tSnackbar, int i10) {
        this.f37774b = tSnackbar;
        this.f37773a = i10;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        int i10 = TSnackbar.LENGTH_INDEFINITE;
        this.f37774b.d(this.f37773a);
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        TSnackbar.SnackbarLayout snackbarLayout = this.f37774b.f37752c;
        snackbarLayout.f37756p0.setAlpha(1.0f);
        long j10 = 180;
        long j11 = 0;
        ViewCompat.animate(snackbarLayout.f37756p0).alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        if (snackbarLayout.f37757q0.getVisibility() == 0) {
            snackbarLayout.f37757q0.setAlpha(1.0f);
            ViewCompat.animate(snackbarLayout.f37757q0).alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }
}
