package com.bbva.component.ui.message.card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.cellswidgets.skeleton.CellsSkeletonView;
import com.bbva.component.ui.message.card.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewMessageSkeletonBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CellsSkeletonView f28637p0;

    @NonNull
    public final CellsSkeletonView skeletonMessageView;

    public ViewMessageSkeletonBinding(@NonNull CellsSkeletonView cellsSkeletonView, @NonNull CellsSkeletonView cellsSkeletonView2) {
        this.f28637p0 = cellsSkeletonView;
        this.skeletonMessageView = cellsSkeletonView2;
    }

    @NonNull
    public static ViewMessageSkeletonBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        CellsSkeletonView cellsSkeletonView = (CellsSkeletonView) view;
        return new ViewMessageSkeletonBinding(cellsSkeletonView, cellsSkeletonView);
    }

    @NonNull
    public static ViewMessageSkeletonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewMessageSkeletonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_message_skeleton, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CellsSkeletonView getRoot() {
        return this.f28637p0;
    }
}
