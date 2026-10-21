package com.bbva.component.ui.landing.access.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.landing.access.R;
import com.bbva.ui.widget.skeleton.Skeleton;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewSkeletonAccessBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Skeleton f28403p0;

    @NonNull
    public final Skeleton skeletonAccess;

    public ViewSkeletonAccessBinding(@NonNull Skeleton skeleton, @NonNull Skeleton skeleton2) {
        this.f28403p0 = skeleton;
        this.skeletonAccess = skeleton2;
    }

    @NonNull
    public static ViewSkeletonAccessBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Skeleton skeleton = (Skeleton) view;
        return new ViewSkeletonAccessBinding(skeleton, skeleton);
    }

    @NonNull
    public static ViewSkeletonAccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSkeletonAccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_skeleton_access, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Skeleton getRoot() {
        return this.f28403p0;
    }
}
