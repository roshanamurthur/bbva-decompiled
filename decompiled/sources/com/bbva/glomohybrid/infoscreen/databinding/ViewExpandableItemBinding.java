package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewExpandableItemBinding implements ViewBinding {

    @NonNull
    public final BbvaTextView description;

    @NonNull
    public final LinearLayout expandableContainer;

    @NonNull
    public final AppCompatImageView icon;

    @NonNull
    public final BbvaButton optionExpandableButton;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f32301p0;

    @NonNull
    public final BbvaTextView title;

    @NonNull
    public final LinearLayout titleContainer;

    public ViewExpandableItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BbvaTextView bbvaTextView, @NonNull LinearLayout linearLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull BbvaButton bbvaButton, @NonNull BbvaTextView bbvaTextView2, @NonNull LinearLayout linearLayout2) {
        this.f32301p0 = constraintLayout;
        this.description = bbvaTextView;
        this.expandableContainer = linearLayout;
        this.icon = appCompatImageView;
        this.optionExpandableButton = bbvaButton;
        this.title = bbvaTextView2;
        this.titleContainer = linearLayout2;
    }

    @NonNull
    public static ViewExpandableItemBinding bind(@NonNull View view) {
        int i10 = R.id.description;
        BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
        if (bbvaTextView != null) {
            i10 = R.id.expandableContainer;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
            if (linearLayout != null) {
                i10 = R.id.icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
                if (appCompatImageView != null) {
                    i10 = R.id.optionExpandableButton;
                    BbvaButton bbvaButton = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                    if (bbvaButton != null) {
                        i10 = R.id.title;
                        BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                        if (bbvaTextView2 != null) {
                            i10 = R.id.titleContainer;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                            if (linearLayout2 != null) {
                                return new ViewExpandableItemBinding((ConstraintLayout) view, bbvaTextView, linearLayout, appCompatImageView, bbvaButton, bbvaTextView2, linearLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewExpandableItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewExpandableItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_expandable_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f32301p0;
    }
}
