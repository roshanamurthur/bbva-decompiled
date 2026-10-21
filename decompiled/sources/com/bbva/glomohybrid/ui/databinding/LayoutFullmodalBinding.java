package com.bbva.glomohybrid.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.toolbar.Toolbar;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.modals.changeuser.ui.InfoView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutFullmodalBinding implements ViewBinding {

    @NonNull
    public final AppBarLayout appBarLayout;

    @NonNull
    public final CollapsingToolbarLayout collapsingToolbarLayout;

    @NonNull
    public final CoordinatorLayout coordinatorLayout;

    @NonNull
    public final Toolbar fullScreenToolbar;

    @NonNull
    public final InfoView infoView;

    @NonNull
    public final CellsButton negativeButton;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f34616p0;

    @NonNull
    public final CellsButton positiveButton;

    @NonNull
    public final CellsTextView toolbarTitleLabel;

    public LayoutFullmodalBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull Toolbar toolbar, @NonNull InfoView infoView, @NonNull CellsButton cellsButton, @NonNull CellsButton cellsButton2, @NonNull CellsTextView cellsTextView) {
        this.f34616p0 = coordinatorLayout;
        this.appBarLayout = appBarLayout;
        this.collapsingToolbarLayout = collapsingToolbarLayout;
        this.coordinatorLayout = coordinatorLayout2;
        this.fullScreenToolbar = toolbar;
        this.infoView = infoView;
        this.negativeButton = cellsButton;
        this.positiveButton = cellsButton2;
        this.toolbarTitleLabel = cellsTextView;
    }

    @NonNull
    public static LayoutFullmodalBinding bind(@NonNull View view) {
        int i10 = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i10);
        if (appBarLayout != null) {
            i10 = R.id.collapsingToolbarLayout;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, i10);
            if (collapsingToolbarLayout != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                i10 = R.id.fullScreenToolbar;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                if (toolbar != null) {
                    i10 = R.id.infoView;
                    InfoView infoView = (InfoView) ViewBindings.findChildViewById(view, i10);
                    if (infoView != null) {
                        i10 = R.id.negativeButton;
                        CellsButton cellsButton = (CellsButton) ViewBindings.findChildViewById(view, i10);
                        if (cellsButton != null) {
                            i10 = R.id.positiveButton;
                            CellsButton cellsButton2 = (CellsButton) ViewBindings.findChildViewById(view, i10);
                            if (cellsButton2 != null) {
                                i10 = R.id.toolbarTitleLabel;
                                CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                if (cellsTextView != null) {
                                    return new LayoutFullmodalBinding(coordinatorLayout, appBarLayout, collapsingToolbarLayout, coordinatorLayout, toolbar, infoView, cellsButton, cellsButton2, cellsTextView);
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
    public static LayoutFullmodalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutFullmodalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_fullmodal, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f34616p0;
    }
}
