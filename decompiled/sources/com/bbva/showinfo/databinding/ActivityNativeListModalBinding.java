package com.bbva.showinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bbva.showinfo.R;

/* JADX INFO: loaded from: classes8.dex */
public final class ActivityNativeListModalBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout nativeListModalContainer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36472p0;

    public ActivityNativeListModalBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.f36472p0 = constraintLayout;
        this.nativeListModalContainer = constraintLayout2;
    }

    @NonNull
    public static ActivityNativeListModalBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new ActivityNativeListModalBinding(constraintLayout, constraintLayout);
    }

    @NonNull
    public static ActivityNativeListModalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityNativeListModalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_native_list_modal, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f36472p0;
    }
}
