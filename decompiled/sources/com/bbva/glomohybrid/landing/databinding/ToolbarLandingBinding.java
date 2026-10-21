package com.bbva.glomohybrid.landing.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.landing.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ToolbarLandingBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView companyLogo;

    @NonNull
    public final RelativeLayout container;

    @NonNull
    public final RelativeLayout menuButton;

    @NonNull
    public final AppCompatImageView menuDot;

    @NonNull
    public final AppCompatImageView menuIcon;

    @NonNull
    public final AppCompatTextView menuText;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f32546p0;

    public ToolbarLandingBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull AppCompatTextView appCompatTextView) {
        this.f32546p0 = view;
        this.companyLogo = appCompatImageView;
        this.container = relativeLayout;
        this.menuButton = relativeLayout2;
        this.menuDot = appCompatImageView2;
        this.menuIcon = appCompatImageView3;
        this.menuText = appCompatTextView;
    }

    @NonNull
    public static ToolbarLandingBinding bind(@NonNull View view) {
        int i10 = R.id.company_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.container;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
            if (relativeLayout != null) {
                i10 = R.id.menu_button;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
                if (relativeLayout2 != null) {
                    i10 = R.id.menu_dot;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.menu_icon;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                        if (appCompatImageView3 != null) {
                            i10 = R.id.menu_text;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                            if (appCompatTextView != null) {
                                return new ToolbarLandingBinding(view, appCompatImageView, relativeLayout, relativeLayout2, appCompatImageView2, appCompatImageView3, appCompatTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ToolbarLandingBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.toolbar_landing, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f32546p0;
    }
}
