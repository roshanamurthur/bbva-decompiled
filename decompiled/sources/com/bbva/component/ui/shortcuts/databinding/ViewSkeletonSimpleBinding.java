package com.bbva.component.ui.shortcuts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.shortcuts.R;
import com.bbva.ui.widget.skeleton.Skeleton;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewSkeletonSimpleBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Skeleton f28747p0;

    @NonNull
    public final Skeleton skeletonShortcuts;

    public ViewSkeletonSimpleBinding(@NonNull Skeleton skeleton, @NonNull Skeleton skeleton2) {
        this.f28747p0 = skeleton;
        this.skeletonShortcuts = skeleton2;
    }

    @NonNull
    public static ViewSkeletonSimpleBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        Skeleton skeleton = (Skeleton) view;
        return new ViewSkeletonSimpleBinding(skeleton, skeleton);
    }

    @NonNull
    public static ViewSkeletonSimpleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSkeletonSimpleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_skeleton_simple, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public Skeleton getRoot() {
        return this.f28747p0;
    }
}
