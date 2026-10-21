package com.google.android.material.snackbar;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements SwipeDismissBehavior.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f45467a;

    public i(BaseTransientBottomBar baseTransientBottomBar) {
        this.f45467a = baseTransientBottomBar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
    public final void onDismiss(@NonNull View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f45467a.dispatchDismiss(0);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
    public final void onDragStateChanged(int i10) {
        BaseTransientBottomBar baseTransientBottomBar = this.f45467a;
        if (i10 == 0) {
            m.b().e(baseTransientBottomBar.f45436y);
        } else if (i10 == 1 || i10 == 2) {
            m.b().d(baseTransientBottomBar.f45436y);
        }
    }
}
