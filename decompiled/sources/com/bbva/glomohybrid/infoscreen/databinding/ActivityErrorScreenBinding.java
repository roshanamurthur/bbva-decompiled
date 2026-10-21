package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityErrorScreenBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageButton closeMenuButton;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final Toolbar errorScreenToolbar;

    @NonNull
    public final BbvaTextView headerDescription;

    @NonNull
    public final AppCompatImageView headerImage;

    @NonNull
    public final BbvaTextView headerTitle;

    @NonNull
    public final LoaderSpinnerComponent infoScreenSpinner;

    @NonNull
    public final Guideline leftGuideline;

    @NonNull
    public final BbvaButton negativeButton;

    @NonNull
    public final NestedScrollView nestedScrollView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f32292p0;

    @NonNull
    public final BbvaButton positiveButton;

    @NonNull
    public final Guideline rightGuideline;

    @NonNull
    public final BbvaTextView toolbarTitleLabel;

    public ActivityErrorScreenBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar, @NonNull BbvaTextView bbvaTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull BbvaTextView bbvaTextView2, @NonNull LoaderSpinnerComponent loaderSpinnerComponent, @NonNull Guideline guideline, @NonNull BbvaButton bbvaButton, @NonNull NestedScrollView nestedScrollView, @NonNull BbvaButton bbvaButton2, @NonNull Guideline guideline2, @NonNull BbvaTextView bbvaTextView3) {
        this.f32292p0 = constraintLayout;
        this.closeMenuButton = appCompatImageButton;
        this.constraintLayout = constraintLayout2;
        this.errorScreenToolbar = toolbar;
        this.headerDescription = bbvaTextView;
        this.headerImage = appCompatImageView;
        this.headerTitle = bbvaTextView2;
        this.infoScreenSpinner = loaderSpinnerComponent;
        this.leftGuideline = guideline;
        this.negativeButton = bbvaButton;
        this.nestedScrollView = nestedScrollView;
        this.positiveButton = bbvaButton2;
        this.rightGuideline = guideline2;
        this.toolbarTitleLabel = bbvaTextView3;
    }

    @NonNull
    public static ActivityErrorScreenBinding bind(@NonNull View view) {
        int i10 = R.id.closeMenuButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.errorScreenToolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
            if (toolbar != null) {
                i10 = R.id.headerDescription;
                BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                if (bbvaTextView != null) {
                    i10 = R.id.headerImage;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                    if (appCompatImageView != null) {
                        i10 = R.id.headerTitle;
                        BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                        if (bbvaTextView2 != null) {
                            i10 = R.id.infoScreenSpinner;
                            LoaderSpinnerComponent loaderSpinnerComponent = (LoaderSpinnerComponent) ViewBindings.findChildViewById(view, i10);
                            if (loaderSpinnerComponent != null) {
                                i10 = R.id.left_guideline;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i10);
                                if (guideline != null) {
                                    i10 = R.id.negativeButton;
                                    BbvaButton bbvaButton = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                                    if (bbvaButton != null) {
                                        i10 = R.id.nestedScrollView;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i10);
                                        if (nestedScrollView != null) {
                                            i10 = R.id.positiveButton;
                                            BbvaButton bbvaButton2 = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                                            if (bbvaButton2 != null) {
                                                i10 = R.id.right_guideline;
                                                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i10);
                                                if (guideline2 != null) {
                                                    i10 = R.id.toolbarTitleLabel;
                                                    BbvaTextView bbvaTextView3 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                                    if (bbvaTextView3 != null) {
                                                        return new ActivityErrorScreenBinding(constraintLayout, appCompatImageButton, constraintLayout, toolbar, bbvaTextView, appCompatImageView, bbvaTextView2, loaderSpinnerComponent, guideline, bbvaButton, nestedScrollView, bbvaButton2, guideline2, bbvaTextView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityErrorScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityErrorScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_error_screen, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f32292p0;
    }
}
