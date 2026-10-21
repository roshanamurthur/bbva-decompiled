package com.bbva.component.ui.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.login.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewLoginCredentialsBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout credentialsFormContainer;

    @NonNull
    public final LinearLayoutCompat formContainer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f28499p0;

    @NonNull
    public final CellsButton primaryButton;

    @NonNull
    public final CellsTextView rememberPassword;

    public ViewLoginCredentialsBinding(@NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull CellsButton cellsButton, @NonNull CellsTextView cellsTextView) {
        this.f28499p0 = view;
        this.credentialsFormContainer = constraintLayout;
        this.formContainer = linearLayoutCompat;
        this.primaryButton = cellsButton;
        this.rememberPassword = cellsTextView;
    }

    @NonNull
    public static ViewLoginCredentialsBinding bind(@NonNull View view) {
        int i10 = R.id.credentials_form_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.form_container;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i10);
            if (linearLayoutCompat != null) {
                i10 = R.id.primary_button;
                CellsButton cellsButton = (CellsButton) ViewBindings.findChildViewById(view, i10);
                if (cellsButton != null) {
                    i10 = R.id.remember_password;
                    CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                    if (cellsTextView != null) {
                        return new ViewLoginCredentialsBinding(view, constraintLayout, linearLayoutCompat, cellsButton, cellsTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewLoginCredentialsBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_login_credentials, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f28499p0;
    }
}
