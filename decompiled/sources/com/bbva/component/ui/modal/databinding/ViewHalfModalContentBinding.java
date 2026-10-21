package com.bbva.component.ui.modal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.modal.R;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewHalfModalContentBinding implements ViewBinding {

    @NonNull
    public final FrameLayout contentBottomSheet;

    @NonNull
    public final AppCompatImageButton iconActionClose;

    @NonNull
    public final AppCompatImageView iconImage;

    @NonNull
    public final BbvaTextView message;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28686p0;

    @NonNull
    public final BbvaButton primaryButton;

    @NonNull
    public final BbvaButton secondaryButton;

    @NonNull
    public final BbvaTextView title;

    public ViewHalfModalContentBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageView appCompatImageView, @NonNull BbvaTextView bbvaTextView, @NonNull BbvaButton bbvaButton, @NonNull BbvaButton bbvaButton2, @NonNull BbvaTextView bbvaTextView2) {
        this.f28686p0 = frameLayout;
        this.contentBottomSheet = frameLayout2;
        this.iconActionClose = appCompatImageButton;
        this.iconImage = appCompatImageView;
        this.message = bbvaTextView;
        this.primaryButton = bbvaButton;
        this.secondaryButton = bbvaButton2;
        this.title = bbvaTextView2;
    }

    @NonNull
    public static ViewHalfModalContentBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i10 = R.id.iconActionClose;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageButton != null) {
            i10 = R.id.iconImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
            if (appCompatImageView != null) {
                i10 = R.id.message;
                BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                if (bbvaTextView != null) {
                    i10 = R.id.primaryButton;
                    BbvaButton bbvaButton = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                    if (bbvaButton != null) {
                        i10 = R.id.secondaryButton;
                        BbvaButton bbvaButton2 = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                        if (bbvaButton2 != null) {
                            i10 = R.id.title;
                            BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                            if (bbvaTextView2 != null) {
                                return new ViewHalfModalContentBinding(frameLayout, frameLayout, appCompatImageButton, appCompatImageView, bbvaTextView, bbvaButton, bbvaButton2, bbvaTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewHalfModalContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewHalfModalContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_half_modal_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f28686p0;
    }
}
