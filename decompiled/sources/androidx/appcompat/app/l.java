package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f742p0;

    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class a extends ViewPropertyAnimatorListenerAdapter {
        public a() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationEnd(View view) {
            l lVar = l.this;
            lVar.f742p0.P0.setAlpha(1.0f);
            lVar.f742p0.S0.setListener(null);
            lVar.f742p0.S0 = null;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public final void onAnimationStart(View view) {
            l.this.f742p0.P0.setVisibility(0);
        }
    }

    public l(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f742p0 = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f742p0;
        appCompatDelegateImpl.Q0.showAtLocation(appCompatDelegateImpl.P0, 55, 0, 0);
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.S0;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
        }
        if (!(appCompatDelegateImpl.U0 && (viewGroup = appCompatDelegateImpl.V0) != null && viewGroup.isLaidOut())) {
            appCompatDelegateImpl.P0.setAlpha(1.0f);
            appCompatDelegateImpl.P0.setVisibility(0);
        } else {
            appCompatDelegateImpl.P0.setAlpha(0.0f);
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAlpha = ViewCompat.animate(appCompatDelegateImpl.P0).alpha(1.0f);
            appCompatDelegateImpl.S0 = viewPropertyAnimatorCompatAlpha;
            viewPropertyAnimatorCompatAlpha.setListener(new a());
        }
    }
}
