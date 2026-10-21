package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f43953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f43954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f43955c;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f43955c = baseBehavior;
        this.f43953a = appBarLayout;
        this.f43954b = coordinatorLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f43953a;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f43954b;
        AppBarLayout.BaseBehavior baseBehavior = this.f43955c;
        View viewH = AppBarLayout.BaseBehavior.h(baseBehavior, coordinatorLayout);
        if (viewH == null) {
            return;
        }
        baseBehavior.getClass();
        int childCount = appBarLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((AppBarLayout.LayoutParams) appBarLayout.getChildAt(i10).getLayoutParams()).f43927a != 0) {
                if (baseBehavior.a() != (-appBarLayout.getTotalScrollRange())) {
                    accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCompat.setScrollable(true);
                }
                if (baseBehavior.a() != 0) {
                    if (!viewH.canScrollVertically(-1)) {
                        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                        accessibilityNodeInfoCompat.setScrollable(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                            accessibilityNodeInfoCompat.setScrollable(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        AppBarLayout appBarLayout = this.f43953a;
        if (i10 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i10 != 8192) {
            return super.performAccessibilityAction(view, i10, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f43955c;
        if (baseBehavior.a() != 0) {
            View viewH = AppBarLayout.BaseBehavior.h(baseBehavior, this.f43954b);
            if (!viewH.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i11 = -appBarLayout.getDownNestedPreScrollRange();
            if (i11 != 0) {
                this.f43955c.onNestedPreScroll(this.f43954b, this.f43953a, viewH, 0, i11, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
