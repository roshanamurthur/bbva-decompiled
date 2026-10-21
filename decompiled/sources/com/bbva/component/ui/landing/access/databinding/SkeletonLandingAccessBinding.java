package com.bbva.component.ui.landing.access.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.landing.access.R;
import com.bbva.ui.widget.skeleton.PlaceholderItem;

/* JADX INFO: loaded from: classes4.dex */
public final class SkeletonLandingAccessBinding implements ViewBinding {

    @NonNull
    public final PlaceholderItem imageView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28401p0;

    @NonNull
    public final PlaceholderItem skeletonPlaceHolderView;

    @NonNull
    public final PlaceholderItem skeletonPlaceHolderView2;

    public SkeletonLandingAccessBinding(@NonNull ConstraintLayout constraintLayout, @NonNull PlaceholderItem placeholderItem, @NonNull PlaceholderItem placeholderItem2, @NonNull PlaceholderItem placeholderItem3) {
        this.f28401p0 = constraintLayout;
        this.imageView = placeholderItem;
        this.skeletonPlaceHolderView = placeholderItem2;
        this.skeletonPlaceHolderView2 = placeholderItem3;
    }

    @NonNull
    public static SkeletonLandingAccessBinding bind(@NonNull View view) {
        int i10 = R.id.imageView;
        PlaceholderItem placeholderItem = (PlaceholderItem) ViewBindings.findChildViewById(view, i10);
        if (placeholderItem != null) {
            i10 = R.id.skeletonPlaceHolderView;
            PlaceholderItem placeholderItem2 = (PlaceholderItem) ViewBindings.findChildViewById(view, i10);
            if (placeholderItem2 != null) {
                i10 = R.id.skeletonPlaceHolderView2;
                PlaceholderItem placeholderItem3 = (PlaceholderItem) ViewBindings.findChildViewById(view, i10);
                if (placeholderItem3 != null) {
                    return new SkeletonLandingAccessBinding((ConstraintLayout) view, placeholderItem, placeholderItem2, placeholderItem3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static SkeletonLandingAccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SkeletonLandingAccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.skeleton_landing_access, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f28401p0;
    }
}
