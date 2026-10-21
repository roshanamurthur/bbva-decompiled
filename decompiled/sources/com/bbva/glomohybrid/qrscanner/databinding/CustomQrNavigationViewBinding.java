package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.qrscanner.R;

/* JADX INFO: loaded from: classes6.dex */
public final class CustomQrNavigationViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat bottomLinear;

    @NonNull
    public final AppCompatImageButton closeButton;

    @NonNull
    public final AppCompatButton leftButton;

    @NonNull
    public final AppCompatButton mainButton;

    @NonNull
    public final AppCompatButton middleButton;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f34410p0;

    @NonNull
    public final AppCompatTextView qrMessage;

    @NonNull
    public final AppCompatButton rightButton;

    @NonNull
    public final Space scannerLayout;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final AppCompatImageButton toolbarButton;

    @NonNull
    public final AppCompatTextView toolbarTitle;

    public CustomQrNavigationViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatButton appCompatButton, @NonNull AppCompatButton appCompatButton2, @NonNull AppCompatButton appCompatButton3, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatButton appCompatButton4, @NonNull Space space, @NonNull Toolbar toolbar, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull AppCompatTextView appCompatTextView2) {
        this.f34410p0 = relativeLayout;
        this.bottomLinear = linearLayoutCompat;
        this.closeButton = appCompatImageButton;
        this.leftButton = appCompatButton;
        this.mainButton = appCompatButton2;
        this.middleButton = appCompatButton3;
        this.qrMessage = appCompatTextView;
        this.rightButton = appCompatButton4;
        this.scannerLayout = space;
        this.toolbar = toolbar;
        this.toolbarButton = appCompatImageButton2;
        this.toolbarTitle = appCompatTextView2;
    }

    @NonNull
    public static CustomQrNavigationViewBinding bind(@NonNull View view) {
        int i10 = R.id.bottomLinear;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
        if (linearLayoutCompat != null) {
            i10 = R.id.closeButton;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
            if (appCompatImageButton != null) {
                i10 = R.id.leftButton;
                AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
                if (appCompatButton != null) {
                    i10 = R.id.mainButton;
                    AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
                    if (appCompatButton2 != null) {
                        i10 = R.id.middleButton;
                        AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
                        if (appCompatButton3 != null) {
                            i10 = R.id.qrMessage;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                            if (appCompatTextView != null) {
                                i10 = R.id.rightButton;
                                AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
                                if (appCompatButton4 != null) {
                                    i10 = R.id.scannerLayout;
                                    Space space = (Space) ViewBindings.findChildViewById(view, i10);
                                    if (space != null) {
                                        i10 = R.id.toolbar;
                                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                                        if (toolbar != null) {
                                            i10 = R.id.toolbarButton;
                                            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                                            if (appCompatImageButton2 != null) {
                                                i10 = R.id.toolbarTitle;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                                                if (appCompatTextView2 != null) {
                                                    return new CustomQrNavigationViewBinding((RelativeLayout) view, linearLayoutCompat, appCompatImageButton, appCompatButton, appCompatButton2, appCompatButton3, appCompatTextView, appCompatButton4, space, toolbar, appCompatImageButton2, appCompatTextView2);
                                                }
                                            }
                                        }
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
    public static CustomQrNavigationViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomQrNavigationViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.custom_qr_navigation_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f34410p0;
    }
}
