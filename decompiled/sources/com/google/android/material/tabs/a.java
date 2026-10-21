package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: compiled from: TabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static RectF a(TabLayout tabLayout, @Nullable View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.TabView)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iDpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), 24);
        if (contentWidth < iDpToPx) {
            contentWidth = iDpToPx;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i10 = contentWidth / 2;
        return new RectF(right - i10, bottom - (contentHeight / 2), i10 + right, (right / 2) + bottom);
    }

    public void b(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, to = 1.0d) float f6, @NonNull Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) rectFA.left, (int) rectFA2.left, f6), drawable.getBounds().top, AnimationUtils.lerp((int) rectFA.right, (int) rectFA2.right, f6), drawable.getBounds().bottom);
    }
}
