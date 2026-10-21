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
public final class ViewMessageSkeletonPlaceholderBinding implements ViewBinding {

    @NonNull
    public final CellsSkeletonPlaceHolderView messagePlaceholderHeaderLinkView;

    @NonNull
    public final CellsSkeletonPlaceHolderView messagePlaceholderHeaderTextView;

    @NonNull
    public final CellsSkeletonPlaceHolderView messagePlaceholderTitleTextView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f28638p0;

    public ViewMessageSkeletonPlaceholderBinding(@NonNull LinearLayout linearLayout, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView2, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView3) {
        this.f28638p0 = linearLayout;
        this.messagePlaceholderHeaderLinkView = cellsSkeletonPlaceHolderView;
        this.messagePlaceholderHeaderTextView = cellsSkeletonPlaceHolderView2;
        this.messagePlaceholderTitleTextView = cellsSkeletonPlaceHolderView3;
    }

    @NonNull
    public static ViewMessageSkeletonPlaceholderBinding bind(@NonNull View view) {
        int i10 = R.id.message_placeholder_header_link_view;
        CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
        if (cellsSkeletonPlaceHolderView != null) {
            i10 = R.id.message_placeholder_header_text_view;
            CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView2 = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
            if (cellsSkeletonPlaceHolderView2 != null) {
                i10 = R.id.message_placeholder_title_text_view;
                CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView3 = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
                if (cellsSkeletonPlaceHolderView3 != null) {
                    return new ViewMessageSkeletonPlaceholderBinding((LinearLayout) view, cellsSkeletonPlaceHolderView, cellsSkeletonPlaceHolderView2, cellsSkeletonPlaceHolderView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewMessageSkeletonPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewMessageSkeletonPlaceholderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_message_skeleton_placeholder, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f28638p0;
    }
}
