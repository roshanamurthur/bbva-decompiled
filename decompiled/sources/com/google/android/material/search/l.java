package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: SearchBarAnimationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public AnimatorSet f45166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public AnimatorSet f45167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45169g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f45163a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f45164b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f45165c = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45170h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Animator f45171i = null;

    public static ExpandCollapseAnimationHelper a(SearchBar searchBar, final View view, @Nullable AppBarLayout appBarLayout) {
        ExpandCollapseAnimationHelper expandCollapseAnimationHelper = new ExpandCollapseAnimationHelper(searchBar, view);
        final MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        materialShapeDrawableCreateWithElevationOverlay.setCornerSize(searchBar.getCornerSize());
        materialShapeDrawableCreateWithElevationOverlay.setElevation(ViewCompat.getElevation(searchBar));
        ExpandCollapseAnimationHelper additionalUpdateListener = expandCollapseAnimationHelper.setAdditionalUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
                MaterialShapeDrawable materialShapeDrawable = materialShapeDrawableCreateWithElevationOverlay;
                materialShapeDrawable.setInterpolation(animatedFraction);
                View view2 = view;
                ViewCompat.setBackground(view2, materialShapeDrawable);
                view2.setAlpha(1.0f);
            }
        });
        ExpandCollapseAnimationHelper collapsedViewOffsetY = additionalUpdateListener.setCollapsedViewOffsetY(appBarLayout != null ? appBarLayout.getTop() : 0);
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view);
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((!zIsLayoutRtl && (childAt instanceof ActionMenuView)) || (zIsLayoutRtl && !(childAt instanceof ActionMenuView))) {
                    arrayList.add(childAt);
                }
            }
        }
        return collapsedViewOffsetY.addEndAnchoredViews(arrayList);
    }
}
