package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ViewPropertyAnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f744a;

    public m(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f744a = appCompatDelegateImpl;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationEnd(View view) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f744a;
        appCompatDelegateImpl.P0.setAlpha(1.0f);
        appCompatDelegateImpl.S0.setListener(null);
        appCompatDelegateImpl.S0 = null;
    }

    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
    public final void onAnimationStart(View view) {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f744a;
        appCompatDelegateImpl.P0.setVisibility(0);
        if (appCompatDelegateImpl.P0.getParent() instanceof View) {
            ViewCompat.requestApplyInsets((View) appCompatDelegateImpl.P0.getParent());
        }
    }
}
