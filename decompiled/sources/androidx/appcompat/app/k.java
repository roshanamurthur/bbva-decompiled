package androidx.appcompat.app;

import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ContentFrameLayout.OnAttachListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f741a;

    public k(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f741a = appCompatDelegateImpl;
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public final void onDetachedFromWindow() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.f741a;
        DecorContentParent decorContentParent = appCompatDelegateImpl.L0;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (appCompatDelegateImpl.Q0 != null) {
            appCompatDelegateImpl.F0.getDecorView().removeCallbacks(appCompatDelegateImpl.R0);
            if (appCompatDelegateImpl.Q0.isShowing()) {
                try {
                    appCompatDelegateImpl.Q0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            appCompatDelegateImpl.Q0 = null;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.S0;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        MenuBuilder menuBuilder = appCompatDelegateImpl.t(0).f600h;
        if (menuBuilder != null) {
            menuBuilder.close();
        }
    }

    @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
    public final void onAttachedFromWindow() {
    }
}
