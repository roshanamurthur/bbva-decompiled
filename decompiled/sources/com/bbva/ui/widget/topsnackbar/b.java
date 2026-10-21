package com.bbva.ui.widget.topsnackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: TSnackbar.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements SwipeDismissBehavior.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TSnackbar f37771a;

    public b(TSnackbar tSnackbar) {
        this.f37771a = tSnackbar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
    public final void onDismiss(View view) {
        int i10 = TSnackbar.LENGTH_INDEFINITE;
        this.f37771a.b(0);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
    public final void onDragStateChanged(int i10) {
        TSnackbar tSnackbar = this.f37771a;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                a.c().b(tSnackbar.f37755f);
                return;
            }
            return;
        }
        a aVarC = a.c();
        TSnackbar.a aVar = tSnackbar.f37755f;
        synchronized (aVarC.f37765a) {
            try {
                if (aVarC.d(aVar)) {
                    aVarC.e(aVarC.f37767c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
