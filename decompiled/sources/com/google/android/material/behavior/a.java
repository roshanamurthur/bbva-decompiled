package com.google.android.material.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;

/* JADX INFO: compiled from: SwipeDismissBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f44013p0;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f44013p0 = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        SwipeDismissBehavior swipeDismissBehavior = this.f44013p0;
        if (!swipeDismissBehavior.canSwipeDismissView(view)) {
            return false;
        }
        boolean z10 = ViewCompat.getLayoutDirection(view) == 1;
        int i10 = swipeDismissBehavior.v0;
        ViewCompat.offsetLeftAndRight(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        SwipeDismissBehavior.OnDismissListener onDismissListener = swipeDismissBehavior.f43999q0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(view);
        }
        return true;
    }
}
