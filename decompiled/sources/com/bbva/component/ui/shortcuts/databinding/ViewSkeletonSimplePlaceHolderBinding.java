package com.bbva.component.ui.shortcuts.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.shortcuts.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewSkeletonSimplePlaceHolderBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f28748p0;

    public ViewSkeletonSimplePlaceHolderBinding(@NonNull LinearLayout linearLayout) {
        this.f28748p0 = linearLayout;
    }

    @NonNull
    public static ViewSkeletonSimplePlaceHolderBinding bind(@NonNull View view) {
        if (view != null) {
            return new ViewSkeletonSimplePlaceHolderBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ViewSkeletonSimplePlaceHolderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSkeletonSimplePlaceHolderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_skeleton_simple_place_holder, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f28748p0;
    }
}
