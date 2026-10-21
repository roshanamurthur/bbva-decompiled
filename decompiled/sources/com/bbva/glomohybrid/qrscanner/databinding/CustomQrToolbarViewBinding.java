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
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.qrscanner.R;

/* JADX INFO: loaded from: classes6.dex */
public final class CustomQrToolbarViewBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton galleryTitle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f34411p0;

    @NonNull
    public final AppCompatTextView qrMessage;

    @NonNull
    public final AppCompatTextView qrMessageLinking;

    @NonNull
    public final Space scannerLayout;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final AppCompatImageButton toolbarEndButton;

    @NonNull
    public final AppCompatImageButton toolbarStartButton;

    @NonNull
    public final AppCompatTextView toolbarTitle;

    public CustomQrToolbarViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull AppCompatButton appCompatButton, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull Space space, @NonNull Toolbar toolbar, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull AppCompatTextView appCompatTextView3) {
        this.f34411p0 = relativeLayout;
        this.galleryTitle = appCompatButton;
        this.qrMessage = appCompatTextView;
        this.qrMessageLinking = appCompatTextView2;
        this.scannerLayout = space;
        this.toolbar = toolbar;
        this.toolbarEndButton = appCompatImageButton;
        this.toolbarStartButton = appCompatImageButton2;
        this.toolbarTitle = appCompatTextView3;
    }

    @NonNull
    public static CustomQrToolbarViewBinding bind(@NonNull View view) {
        int i10 = R.id.gallery_title;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatButton != null) {
            i10 = R.id.qrMessage;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                i10 = R.id.qrMessageLinking;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                if (appCompatTextView2 != null) {
                    i10 = R.id.scannerLayout;
                    Space space = (Space) ViewBindings.findChildViewById(view, i10);
                    if (space != null) {
                        i10 = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                        if (toolbar != null) {
                            i10 = R.id.toolbarEndButton;
                            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                            if (appCompatImageButton != null) {
                                i10 = R.id.toolbarStartButton;
                                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                                if (appCompatImageButton2 != null) {
                                    i10 = R.id.toolbarTitle;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                                    if (appCompatTextView3 != null) {
                                        return new CustomQrToolbarViewBinding((RelativeLayout) view, appCompatButton, appCompatTextView, appCompatTextView2, space, toolbar, appCompatImageButton, appCompatImageButton2, appCompatTextView3);
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
    public static CustomQrToolbarViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomQrToolbarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.custom_qr_toolbar_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f34411p0;
    }
}
