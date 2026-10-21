package com.bbva.component.ui.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.login.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewSpinnerBinding implements ViewBinding {

    @NonNull
    public final TextInputEditText editTexLayoutSpinner;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28501p0;

    @NonNull
    public final TextInputLayout textInputLayoutSpinner;

    public ViewSpinnerBinding(@NonNull FrameLayout frameLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout) {
        this.f28501p0 = frameLayout;
        this.editTexLayoutSpinner = textInputEditText;
        this.textInputLayoutSpinner = textInputLayout;
    }

    @NonNull
    public static ViewSpinnerBinding bind(@NonNull View view) {
        int i10 = R.id.edit_tex_layout_spinner;
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, i10);
        if (textInputEditText != null) {
            i10 = R.id.text_input_layout_spinner;
            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i10);
            if (textInputLayout != null) {
                return new ViewSpinnerBinding((FrameLayout) view, textInputEditText, textInputLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewSpinnerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSpinnerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_spinner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f28501p0;
    }
}
