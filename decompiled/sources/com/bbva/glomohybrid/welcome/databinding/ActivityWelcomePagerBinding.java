package com.bbva.glomohybrid.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.toolbar.Toolbar;
import com.bbva.component.ui.welcome.pager.WelcomePager;
import com.bbva.glomohybrid.welcome.R;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWelcomePagerBinding implements ViewBinding {

    @NonNull
    public final AppBarLayout appBarLayout;

    @NonNull
    public final Guideline bottomGuideline;

    @NonNull
    public final ConstraintLayout mainView;

    @NonNull
    public final CellsTextView nextButton;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f34730p0;

    @NonNull
    public final CellsTextView toolbarTitle;

    @NonNull
    public final Guideline topGuideline;

    @NonNull
    public final WelcomePager welcomePager;

    @NonNull
    public final Toolbar welcomeToolbar;

    public ActivityWelcomePagerBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2, @NonNull Guideline guideline2, @NonNull WelcomePager welcomePager, @NonNull Toolbar toolbar) {
        this.f34730p0 = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.bottomGuideline = guideline;
        this.mainView = constraintLayout;
        this.nextButton = cellsTextView;
        this.toolbarTitle = cellsTextView2;
        this.topGuideline = guideline2;
        this.welcomePager = welcomePager;
        this.welcomeToolbar = toolbar;
    }

    @NonNull
    public static ActivityWelcomePagerBinding bind(@NonNull View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i10);
        if (appBarLayout != null) {
            i10 = R.id.bottom_guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i10);
            if (guideline != null) {
                i10 = R.id.mainView;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
                if (constraintLayout != null) {
                    i10 = R.id.nextButton;
                    CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                    if (cellsTextView != null) {
                        i10 = R.id.toolbarTitle;
                        CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                        if (cellsTextView2 != null) {
                            i10 = R.id.top_guideline;
                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i10);
                            if (guideline2 != null) {
                                i10 = R.id.welcomePager;
                                WelcomePager welcomePager = (WelcomePager) ViewBindings.findChildViewById(view, i10);
                                if (welcomePager != null) {
                                    i10 = R.id.welcomeToolbar;
                                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                                    if (toolbar != null) {
                                        return new ActivityWelcomePagerBinding((CoordinatorLayout) view, appBarLayout, guideline, constraintLayout, cellsTextView, cellsTextView2, guideline2, welcomePager, toolbar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityWelcomePagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWelcomePagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_welcome_pager, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f34730p0;
    }
}
