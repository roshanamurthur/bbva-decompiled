package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityOptionListBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageButton closeMenuButton;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final Toolbar errorScreenToolbar;

    @NonNull
    public final Guideline leftGuideline;

    @NonNull
    public final RecyclerView optionsListRecycler;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f32293p0;

    @NonNull
    public final Guideline rightGuideline;

    @NonNull
    public final BbvaTextView toolbarTitleLabel;

    public ActivityOptionListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull ConstraintLayout constraintLayout2, @NonNull Toolbar toolbar, @NonNull Guideline guideline, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline2, @NonNull BbvaTextView bbvaTextView) {
        this.f32293p0 = constraintLayout;
        this.closeMenuButton = appCompatImageButton;
        this.constraintLayout = constraintLayout2;
        this.errorScreenToolbar = toolbar;
        this.leftGuideline = guideline;
        this.optionsListRecycler = recyclerView;
        this.rightGuideline = guideline2;
        this.toolbarTitleLabel = bbvaTextView;
    }

    @NonNull
    public static ActivityOptionListBinding bind(@NonNull View view) {
        int i10 = R.id.closeMenuButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageButton != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.errorScreenToolbar;
            Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, i10);
            if (toolbar != null) {
                i10 = R.id.left_guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i10);
                if (guideline != null) {
                    i10 = R.id.optionsListRecycler;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
                    if (recyclerView != null) {
                        i10 = R.id.right_guideline;
                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i10);
                        if (guideline2 != null) {
                            i10 = R.id.toolbarTitleLabel;
                            BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                            if (bbvaTextView != null) {
                                return new ActivityOptionListBinding(constraintLayout, appCompatImageButton, constraintLayout, toolbar, guideline, recyclerView, guideline2, bbvaTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityOptionListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOptionListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_option_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f32293p0;
    }
}
