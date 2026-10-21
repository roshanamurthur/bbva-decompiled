package com.bbva.glomohybrid.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellscore.web.component.CellsWebView;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.component.ui.loader.LoaderView;
import com.bbva.component.ui.login.LoginView;
import com.bbva.component.ui.toolbar.Toolbar;
import com.bbva.glomohybrid.login.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityLoginBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final LoaderSpinnerComponent loaderSpinnerComponent;

    @NonNull
    public final LoaderView loaderView;

    @NonNull
    public final Toolbar loginToolbar;

    @NonNull
    public final LoginView loginView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33364p0;

    @NonNull
    public final AppCompatImageButton toolbarIcClose;

    @NonNull
    public final AppCompatTextView toolbarTitle;

    @NonNull
    public final CellsWebView webView;

    public ActivityLoginBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull LoaderSpinnerComponent loaderSpinnerComponent, @NonNull LoaderView loaderView, @NonNull Toolbar toolbar, @NonNull LoginView loginView, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatTextView appCompatTextView, @NonNull CellsWebView cellsWebView) {
        this.f33364p0 = constraintLayout;
        this.container = constraintLayout2;
        this.loaderSpinnerComponent = loaderSpinnerComponent;
        this.loaderView = loaderView;
        this.loginToolbar = toolbar;
        this.loginView = loginView;
        this.toolbarIcClose = appCompatImageButton;
        this.toolbarTitle = appCompatTextView;
        this.webView = cellsWebView;
    }

    @NonNull
    public static ActivityLoginBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.loaderSpinnerComponent;
        LoaderSpinnerComponent loaderSpinnerComponent = (LoaderSpinnerComponent) ViewBindings.findChildViewById(view, i10);
        if (loaderSpinnerComponent != null) {
            i10 = R.id.loaderView;
            LoaderView loaderView = (LoaderView) ViewBindings.findChildViewById(view, i10);
            if (loaderView != null) {
                i10 = R.id.loginToolbar;
                Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                if (toolbar != null) {
                    i10 = R.id.loginView;
                    LoginView loginView = (LoginView) ViewBindings.findChildViewById(view, i10);
                    if (loginView != null) {
                        i10 = R.id.toolbar_ic_close;
                        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                        if (appCompatImageButton != null) {
                            i10 = R.id.toolbar_title;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                            if (appCompatTextView != null) {
                                i10 = R.id.webView;
                                CellsWebView cellsWebView = (CellsWebView) ViewBindings.findChildViewById(view, i10);
                                if (cellsWebView != null) {
                                    return new ActivityLoginBinding(constraintLayout, constraintLayout, loaderSpinnerComponent, loaderView, toolbar, loginView, appCompatImageButton, appCompatTextView, cellsWebView);
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
    public static ActivityLoginBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityLoginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f33364p0;
    }
}
