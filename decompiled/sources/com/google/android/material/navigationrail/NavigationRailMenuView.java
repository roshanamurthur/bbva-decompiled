package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import ke.a;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Px
    public int f45016b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final FrameLayout.LayoutParams f45017c1;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.f45016b1 = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f45017c1 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    public final int c(View view, int i10, int i11, int i12) {
        int iMakeMeasureSpec;
        int measuredHeight;
        if (view == null) {
            int iMax = i11 / Math.max(1, i12);
            int size = this.f45016b1;
            if (size == -1) {
                size = View.MeasureSpec.getSize(i10);
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                i13 += measuredHeight;
            }
        }
        return i13;
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new a(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.f45016b1;
    }

    public int getMenuGravity() {
        return this.f45017c1.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iC;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().getVisibleItems().size();
        if (size2 <= 1 || !isShifting(getLabelVisibilityMode(), size2)) {
            iC = c(null, i10, size, size2);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int iMax = size / Math.max(1, size2);
                int size3 = this.f45016b1;
                if (size3 == -1) {
                    size3 = View.MeasureSpec.getSize(i10);
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size3, iMax), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                size -= measuredHeight;
                size2--;
            } else {
                measuredHeight = 0;
            }
            iC = c(childAt, i10, size, size2) + measuredHeight;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState(iC, i11, 0));
    }

    public void setItemMinimumHeight(@Px int i10) {
        if (this.f45016b1 != i10) {
            this.f45016b1 = i10;
            requestLayout();
        }
    }

    public void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.f45017c1;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }
}
