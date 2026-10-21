package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class ExpandableWidgetHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f44643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44644b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @IdRes
    public int f44645c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableWidgetHelper(ExpandableWidget expandableWidget) {
        this.f44643a = (View) expandableWidget;
    }

    @IdRes
    public int getExpandedComponentIdHint() {
        return this.f44645c;
    }

    public boolean isExpanded() {
        return this.f44644b;
    }

    public void onRestoreInstanceState(@NonNull Bundle bundle) {
        this.f44644b = bundle.getBoolean("expanded", false);
        this.f44645c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f44644b) {
            View view = this.f44643a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
            }
        }
    }

    @NonNull
    public Bundle onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f44644b);
        bundle.putInt("expandedComponentIdHint", this.f44645c);
        return bundle;
    }

    public boolean setExpanded(boolean z10) {
        if (this.f44644b == z10) {
            return false;
        }
        this.f44644b = z10;
        View view = this.f44643a;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return true;
        }
        ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
        return true;
    }

    public void setExpandedComponentIdHint(@IdRes int i10) {
        this.f44645c = i10;
    }
}
