package com.bbva.component.ui.message.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.skeleton.CellsSkeletonPlaceHolderView;
import com.bbva.component.ui.message.card.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewCardSkeletonPlaceholderBinding implements ViewBinding {

    @NonNull
    public final CellsSkeletonPlaceHolderView cardPlaceholderImageView;

    @NonNull
    public final CellsSkeletonPlaceHolderView cardPlaceholderPrimaryTextView;

    @NonNull
    public final CellsSkeletonPlaceHolderView cardPlaceholderSecondaryTextView;

    @NonNull
    public final CellsSkeletonPlaceHolderView cardPlaceholderTitleTextView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f28635p0;

    public ViewCardSkeletonPlaceholderBinding(@NonNull LinearLayout linearLayout, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView2, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView3, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView4) {
        this.f28635p0 = linearLayout;
        this.cardPlaceholderImageView = cellsSkeletonPlaceHolderView;
        this.cardPlaceholderPrimaryTextView = cellsSkeletonPlaceHolderView2;
        this.cardPlaceholderSecondaryTextView = cellsSkeletonPlaceHolderView3;
        this.cardPlaceholderTitleTextView = cellsSkeletonPlaceHolderView4;
    }

    @NonNull
    public static ViewCardSkeletonPlaceholderBinding bind(@NonNull View view) {
        int i10 = R.id.card_placeholder_image_view;
        CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
        if (cellsSkeletonPlaceHolderView != null) {
            i10 = R.id.card_placeholder_primary_text_view;
            CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView2 = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
            if (cellsSkeletonPlaceHolderView2 != null) {
                i10 = R.id.card_placeholder_secondary_text_view;
                CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView3 = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
                if (cellsSkeletonPlaceHolderView3 != null) {
                    i10 = R.id.card_placeholder_title_text_view;
                    CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView4 = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
                    if (cellsSkeletonPlaceHolderView4 != null) {
                        return new ViewCardSkeletonPlaceholderBinding((LinearLayout) view, cellsSkeletonPlaceHolderView, cellsSkeletonPlaceHolderView2, cellsSkeletonPlaceHolderView3, cellsSkeletonPlaceHolderView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewCardSkeletonPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewCardSkeletonPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_card_skeleton_placeholder, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f28635p0;
    }
}
