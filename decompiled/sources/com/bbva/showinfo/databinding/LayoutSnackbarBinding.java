package com.bbva.showinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.showinfo.R;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes8.dex */
public final class LayoutSnackbarBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36473p0;

    @NonNull
    public final LinearLayout snackbar;

    @NonNull
    public final BbvaTextView snackbarAction;

    @NonNull
    public final BbvaTextView snackbarMessage;

    public LayoutSnackbarBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull BbvaTextView bbvaTextView, @NonNull BbvaTextView bbvaTextView2) {
        this.f36473p0 = linearLayout;
        this.snackbar = linearLayout2;
        this.snackbarAction = bbvaTextView;
        this.snackbarMessage = bbvaTextView2;
    }

    @NonNull
    public static LayoutSnackbarBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = R.id.snackbar_action;
        BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
        if (bbvaTextView != null) {
            i10 = R.id.snackbar_message;
            BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
            if (bbvaTextView2 != null) {
                return new LayoutSnackbarBinding(linearLayout, linearLayout, bbvaTextView, bbvaTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static LayoutSnackbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutSnackbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_snackbar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f36473p0;
    }
}
