package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewOptionHeaderBinding implements ViewBinding {

    @NonNull
    public final BbvaTextView headerDescription;

    @NonNull
    public final AppCompatImageView headerImage;

    @NonNull
    public final BbvaTextView headerTitle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f32302p0;

    public ViewOptionHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BbvaTextView bbvaTextView, @NonNull AppCompatImageView appCompatImageView, @NonNull BbvaTextView bbvaTextView2) {
        this.f32302p0 = constraintLayout;
        this.headerDescription = bbvaTextView;
        this.headerImage = appCompatImageView;
        this.headerTitle = bbvaTextView2;
    }

    @NonNull
    public static ViewOptionHeaderBinding bind(@NonNull View view) {
        int i10 = R.id.headerDescription;
        BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
        if (bbvaTextView != null) {
            i10 = R.id.headerImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
            if (appCompatImageView != null) {
                i10 = R.id.headerTitle;
                BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                if (bbvaTextView2 != null) {
                    return new ViewOptionHeaderBinding((ConstraintLayout) view, bbvaTextView, appCompatImageView, bbvaTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewOptionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewOptionHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_option_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f32302p0;
    }
}
