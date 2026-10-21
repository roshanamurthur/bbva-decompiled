package com.bbva.glomohybrid.landing.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellscore.web.component.CellsWebView;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.glomohybrid.landing.R;
import com.bbva.glomohybrid.landing.presentation.view.LandingToolbar;
import com.bbva.ui.component.menu.SlideMenuView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityLandingBinding implements ViewBinding {

    @NonNull
    public final RecyclerView landing;

    @NonNull
    public final LoaderSpinnerComponent loaderSpinnerComponent;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final SlideMenuView f32545p0;

    @NonNull
    public final SlideMenuView slideMenuView;

    @NonNull
    public final LandingToolbar toolbar;

    @NonNull
    public final CellsWebView webView;

    public ActivityLandingBinding(@NonNull SlideMenuView slideMenuView, @NonNull RecyclerView recyclerView, @NonNull LoaderSpinnerComponent loaderSpinnerComponent, @NonNull SlideMenuView slideMenuView2, @NonNull LandingToolbar landingToolbar, @NonNull CellsWebView cellsWebView) {
        this.f32545p0 = slideMenuView;
        this.landing = recyclerView;
        this.loaderSpinnerComponent = loaderSpinnerComponent;
        this.slideMenuView = slideMenuView2;
        this.toolbar = landingToolbar;
        this.webView = cellsWebView;
    }

    @NonNull
    public static ActivityLandingBinding bind(@NonNull View view) {
        int i10 = R.id.landing;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
        if (recyclerView != null) {
            i10 = R.id.loaderSpinnerComponent;
            LoaderSpinnerComponent loaderSpinnerComponent = (LoaderSpinnerComponent) ViewBindings.findChildViewById(view, i10);
            if (loaderSpinnerComponent != null) {
                SlideMenuView slideMenuView = (SlideMenuView) view;
                i10 = R.id.toolbar;
                LandingToolbar landingToolbar = (LandingToolbar) ViewBindings.findChildViewById(view, i10);
                if (landingToolbar != null) {
                    i10 = R.id.webView;
                    CellsWebView cellsWebView = (CellsWebView) ViewBindings.findChildViewById(view, i10);
                    if (cellsWebView != null) {
                        return new ActivityLandingBinding(slideMenuView, recyclerView, loaderSpinnerComponent, slideMenuView, landingToolbar, cellsWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityLandingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLandingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_landing, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public SlideMenuView getRoot() {
        return this.f32545p0;
    }
}
