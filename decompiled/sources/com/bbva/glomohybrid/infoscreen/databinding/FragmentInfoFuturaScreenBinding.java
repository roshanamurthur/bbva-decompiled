package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.toolbar.Toolbar;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentInfoFuturaScreenBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageButton closeMenuButton;

    @NonNull
    public final BbvaTextView descriptionLabel;

    @NonNull
    public final AppCompatImageView headerImage;

    @NonNull
    public final Toolbar infoScreenToolbar;

    @NonNull
    public final Guideline leftGuideline;

    @NonNull
    public final NestedScrollView nestedScrollView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f32295p0;

    @NonNull
    public final BbvaButton positiveButton;

    @NonNull
    public final Guideline rightGuideline;

    @NonNull
    public final ViewTimerBinding timerProgressInclude;

    @NonNull
    public final BbvaTextView titleLabel;

    @NonNull
    public final BbvaTextView toolbarTitleLabel;

    public FragmentInfoFuturaScreenBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull BbvaTextView bbvaTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull Toolbar toolbar, @NonNull Guideline guideline, @NonNull NestedScrollView nestedScrollView, @NonNull BbvaButton bbvaButton, @NonNull Guideline guideline2, @NonNull ViewTimerBinding viewTimerBinding, @NonNull BbvaTextView bbvaTextView2, @NonNull BbvaTextView bbvaTextView3) {
        this.f32295p0 = constraintLayout;
        this.closeMenuButton = appCompatImageButton;
        this.descriptionLabel = bbvaTextView;
        this.headerImage = appCompatImageView;
        this.infoScreenToolbar = toolbar;
        this.leftGuideline = guideline;
        this.nestedScrollView = nestedScrollView;
        this.positiveButton = bbvaButton;
        this.rightGuideline = guideline2;
        this.timerProgressInclude = viewTimerBinding;
        this.titleLabel = bbvaTextView2;
        this.toolbarTitleLabel = bbvaTextView3;
    }

    @NonNull
    public static FragmentInfoFuturaScreenBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.closeMenuButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageButton != null) {
            i10 = R.id.descriptionLabel;
            BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
            if (bbvaTextView != null) {
                i10 = R.id.headerImage;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                if (appCompatImageView != null) {
                    i10 = R.id.infoScreenToolbar;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
                    if (toolbar != null) {
                        i10 = R.id.left_guideline;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i10);
                        if (guideline != null) {
                            i10 = R.id.nestedScrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i10);
                            if (nestedScrollView != null) {
                                i10 = R.id.positiveButton;
                                BbvaButton bbvaButton = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                                if (bbvaButton != null) {
                                    i10 = R.id.right_guideline;
                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i10);
                                    if (guideline2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.timerProgressInclude))) != null) {
                                        ViewTimerBinding viewTimerBindingBind = ViewTimerBinding.bind(viewFindChildViewById);
                                        i10 = R.id.titleLabel;
                                        BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                        if (bbvaTextView2 != null) {
                                            i10 = R.id.toolbarTitleLabel;
                                            BbvaTextView bbvaTextView3 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                            if (bbvaTextView3 != null) {
                                                return new FragmentInfoFuturaScreenBinding((ConstraintLayout) view, appCompatImageButton, bbvaTextView, appCompatImageView, toolbar, guideline, nestedScrollView, bbvaButton, guideline2, viewTimerBindingBind, bbvaTextView2, bbvaTextView3);
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
    public static FragmentInfoFuturaScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentInfoFuturaScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_info_futura_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f32295p0;
    }
}
