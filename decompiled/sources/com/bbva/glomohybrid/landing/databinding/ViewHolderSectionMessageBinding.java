package com.bbva.glomohybrid.landing.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.glomohybrid.landing.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewHolderSectionMessageBinding implements ViewBinding {

    @NonNull
    public final FrameLayout container;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f32549p0;

    public ViewHolderSectionMessageBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.f32549p0 = frameLayout;
        this.container = frameLayout2;
    }

    @NonNull
    public static ViewHolderSectionMessageBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new ViewHolderSectionMessageBinding(frameLayout, frameLayout);
    }

    @NonNull
    public static ViewHolderSectionMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewHolderSectionMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_holder_section_message, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f32549p0;
    }
}
