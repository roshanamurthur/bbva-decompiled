package com.bbva.glomohybrid.infoscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.glomohybrid.infoscreen.R;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardView;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityScratchcardBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f32294p0;

    @NonNull
    public final ConstraintLayout scratchcardContainer;

    @NonNull
    public final ScratchcardView scratchcardView;

    public ActivityScratchcardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ScratchcardView scratchcardView) {
        this.f32294p0 = constraintLayout;
        this.scratchcardContainer = constraintLayout2;
        this.scratchcardView = scratchcardView;
    }

    @NonNull
    public static ActivityScratchcardBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.scratchcard_view;
        ScratchcardView scratchcardView = (ScratchcardView) ViewBindings.findChildViewById(view, i10);
        if (scratchcardView != null) {
            return new ActivityScratchcardBinding(constraintLayout, constraintLayout, scratchcardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ActivityScratchcardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityScratchcardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_scratchcard, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f32294p0;
    }
}
