package com.bbva.component.ui.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.login.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewAccessingBiometricsBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout accessingBiometricsContainer;

    @NonNull
    public final AppCompatTextView accessingBiometricsMessage;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28498p0;

    public ViewAccessingBiometricsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView) {
        this.f28498p0 = constraintLayout;
        this.accessingBiometricsContainer = constraintLayout2;
        this.accessingBiometricsMessage = appCompatTextView;
    }

    @NonNull
    public static ViewAccessingBiometricsBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.accessing_biometrics_message;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
        if (appCompatTextView != null) {
            return new ViewAccessingBiometricsBinding(constraintLayout, constraintLayout, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewAccessingBiometricsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewAccessingBiometricsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_accessing_biometrics, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f28498p0;
    }
}
