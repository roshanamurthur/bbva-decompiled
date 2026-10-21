package com.bbva.component.ui.loader.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.loader.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ConstraintLoaderviewBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28451p0;

    public ConstraintLoaderviewBinding(@NonNull ConstraintLayout constraintLayout) {
        this.f28451p0 = constraintLayout;
    }

    @NonNull
    public static ConstraintLoaderviewBinding bind(@NonNull View view) {
        if (view != null) {
            return new ConstraintLoaderviewBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ConstraintLoaderviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ConstraintLoaderviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.constraint_loaderview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f28451p0;
    }
}
