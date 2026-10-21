package com.bbva.cellswidgets.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.R;
import com.bbva.cellswidgets.skeleton.CellsSkeletonPlaceHolderView;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentSkeletonBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f27279p0;

    @NonNull
    public final FrameLayout skeletonContentLayout;

    @NonNull
    public final CellsSkeletonPlaceHolderView skeletonMask;

    public ContentSkeletonBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView) {
        this.f27279p0 = view;
        this.skeletonContentLayout = frameLayout;
        this.skeletonMask = cellsSkeletonPlaceHolderView;
    }

    @NonNull
    public static ContentSkeletonBinding bind(@NonNull View view) {
        int i10 = R.id.skeleton_content_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
        if (frameLayout != null) {
            i10 = R.id.skeleton_mask;
            CellsSkeletonPlaceHolderView cellsSkeletonPlaceHolderView = (CellsSkeletonPlaceHolderView) ViewBindings.findChildViewById(view, i10);
            if (cellsSkeletonPlaceHolderView != null) {
                return new ContentSkeletonBinding(view, frameLayout, cellsSkeletonPlaceHolderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ContentSkeletonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.content_skeleton, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f27279p0;
    }
}
