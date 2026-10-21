package com.bbva.glomohybrid.cellsweb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellscore.web.component.CellsWebView;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.component.ui.loader.LoaderView;
import com.bbva.glomohybrid.cellsweb.R;
import com.bbva.ui.component.menu.SlideMenuView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityCellswebBinding implements ViewBinding {

    @NonNull
    public final LoaderView changeProfileSpinner;

    @NonNull
    public final CoordinatorLayout coordinatorLayout;

    @NonNull
    public final LoaderSpinnerComponent menuLoaderWeb;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final SlideMenuView f31637p0;

    @NonNull
    public final SlideMenuView slideMenuViewDashboard;

    @NonNull
    public final CellsWebView webView;

    public ActivityCellswebBinding(@NonNull SlideMenuView slideMenuView, @NonNull LoaderView loaderView, @NonNull CoordinatorLayout coordinatorLayout, @NonNull LoaderSpinnerComponent loaderSpinnerComponent, @NonNull SlideMenuView slideMenuView2, @NonNull CellsWebView cellsWebView) {
        this.f31637p0 = slideMenuView;
        this.changeProfileSpinner = loaderView;
        this.coordinatorLayout = coordinatorLayout;
        this.menuLoaderWeb = loaderSpinnerComponent;
        this.slideMenuViewDashboard = slideMenuView2;
        this.webView = cellsWebView;
    }

    @NonNull
    public static ActivityCellswebBinding bind(@NonNull View view) {
        int i10 = R.id.changeProfileSpinner;
        LoaderView loaderView = (LoaderView) ViewBindings.findChildViewById(view, i10);
        if (loaderView != null) {
            i10 = R.id.coordinatorLayout;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i10);
            if (coordinatorLayout != null) {
                i10 = R.id.menuLoaderWeb;
                LoaderSpinnerComponent loaderSpinnerComponent = (LoaderSpinnerComponent) ViewBindings.findChildViewById(view, i10);
                if (loaderSpinnerComponent != null) {
                    SlideMenuView slideMenuView = (SlideMenuView) view;
                    i10 = R.id.webView;
                    CellsWebView cellsWebView = (CellsWebView) ViewBindings.findChildViewById(view, i10);
                    if (cellsWebView != null) {
                        return new ActivityCellswebBinding(slideMenuView, loaderView, coordinatorLayout, loaderSpinnerComponent, slideMenuView, cellsWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityCellswebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityCellswebBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_cellsweb, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SlideMenuView getRoot() {
        return this.f31637p0;
    }
}
