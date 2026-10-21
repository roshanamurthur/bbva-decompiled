package com.bbva.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.R;

/* JADX INFO: loaded from: classes9.dex */
public final class SkeletonLayoutBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f37625p0;

    @NonNull
    public final FrameLayout skeletonContentLayout;

    @NonNull
    public final View skeletonMask;

    public SkeletonLayoutBinding(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.f37625p0 = view;
        this.skeletonContentLayout = frameLayout;
        this.skeletonMask = view2;
    }

    @NonNull
    public static SkeletonLayoutBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.skeleton_content_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
        if (frameLayout == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.skeleton_mask))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
        }
        return new SkeletonLayoutBinding(view, viewFindChildViewById, frameLayout);
    }

    @NonNull
    public static SkeletonLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.skeleton_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f37625p0;
    }
}
