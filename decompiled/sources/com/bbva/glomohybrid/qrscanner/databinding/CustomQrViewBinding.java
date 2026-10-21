package com.bbva.glomohybrid.qrscanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
public final class CustomQrViewBinding implements ViewBinding {

    @NonNull
    public final LinearLayoutCompat bottomLinear;

    @NonNull
    public final ImageView imageScanner;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f34412p0;

    @NonNull
    public final AppCompatTextView qrMessage;

    @NonNull
    public final AppCompatButton qrTabButton;

    @NonNull
    public final RelativeLayout scannerLayout;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final AppCompatImageButton toolbarEndButton;

    @NonNull
    public final AppCompatImageButton toolbarStartButton;

    @NonNull
    public final AppCompatTextView toolbarTittle;

    public CustomQrViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatButton appCompatButton, @NonNull RelativeLayout relativeLayout2, @NonNull Toolbar toolbar, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull AppCompatTextView appCompatTextView2) {
        this.f34412p0 = relativeLayout;
        this.bottomLinear = linearLayoutCompat;
        this.imageScanner = imageView;
        this.qrMessage = appCompatTextView;
        this.qrTabButton = appCompatButton;
        this.scannerLayout = relativeLayout2;
        this.toolbar = toolbar;
        this.toolbarEndButton = appCompatImageButton;
        this.toolbarStartButton = appCompatImageButton2;
        this.toolbarTittle = appCompatTextView2;
    }

    @NonNull
    public static CustomQrViewBinding bind(@NonNull View view) {
        int i10 = R.id.bottom_linear;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
        if (linearLayoutCompat != null) {
            i10 = R.id.imageScanner;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                i10 = R.id.qr_message;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                if (appCompatTextView != null) {
                    i10 = R.id.qr_tab_button;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i10);
                    if (appCompatButton != null) {
                        i10 = R.id.scanner_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
                        if (relativeLayout != null) {
                            i10 = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                            if (toolbar != null) {
                                i10 = R.id.toolbarEndButton;
                                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                                if (appCompatImageButton != null) {
                                    i10 = R.id.toolbarStartButton;
                                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                                    if (appCompatImageButton2 != null) {
                                        i10 = R.id.toolbarTittle;
                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
                                        if (appCompatTextView2 != null) {
                                            return new CustomQrViewBinding((RelativeLayout) view, linearLayoutCompat, imageView, appCompatTextView, appCompatButton, relativeLayout, toolbar, appCompatImageButton, appCompatImageButton2, appCompatTextView2);
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
    public static CustomQrViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomQrViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.custom_qr_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f34412p0;
    }
}
