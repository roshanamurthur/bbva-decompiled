package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f45816p0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f45817p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f45818q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ExpandableWidget f45819r0;

        public a(View view, int i10, ExpandableWidget expandableWidget) {
            this.f45817p0 = view;
            this.f45818q0 = i10;
            this.f45819r0 = expandableWidget;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f45817p0;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f45816p0 == this.f45818q0) {
                ExpandableWidget expandableWidget = this.f45819r0;
                expandableBehavior.onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f45816p0 = 0;
    }

    @Nullable
    public static <T extends ExpandableBehavior> T from(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof ExpandableBehavior) {
            return cls.cast(behavior);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public ExpandableWidget findExpandableWidget(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = dependencies.get(i10);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (expandableWidget.isExpanded()) {
            int i10 = this.f45816p0;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f45816p0 != 1) {
            return false;
        }
        this.f45816p0 = expandableWidget.isExpanded() ? 1 : 2;
        return onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    public abstract boolean onExpandedStateChange(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        ExpandableWidget expandableWidgetFindExpandableWidget;
        if (ViewCompat.isLaidOut(view) || (expandableWidgetFindExpandableWidget = findExpandableWidget(coordinatorLayout, view)) == null) {
            return false;
        }
        if (expandableWidgetFindExpandableWidget.isExpanded()) {
            int i11 = this.f45816p0;
            if (i11 != 0 && i11 != 2) {
                return false;
            }
        } else if (this.f45816p0 != 1) {
            return false;
        }
        int i12 = expandableWidgetFindExpandableWidget.isExpanded() ? 1 : 2;
        this.f45816p0 = i12;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, expandableWidgetFindExpandableWidget));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45816p0 = 0;
    }
}
