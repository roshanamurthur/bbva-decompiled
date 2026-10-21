package com.bbva.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.ui.R;
import com.bbva.ui.widget.topsnackbar.TSnackbar;

/* JADX INFO: loaded from: classes9.dex */
public final class TsnackbarLayoutBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final TSnackbar.SnackbarLayout f37626p0;

    public TsnackbarLayoutBinding(@NonNull TSnackbar.SnackbarLayout snackbarLayout) {
        this.f37626p0 = snackbarLayout;
    }

    @NonNull
    public static TsnackbarLayoutBinding bind(@NonNull View view) {
        if (view != null) {
            return new TsnackbarLayoutBinding((TSnackbar.SnackbarLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static TsnackbarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TsnackbarLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.tsnackbar_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TSnackbar.SnackbarLayout getRoot() {
        return this.f37626p0;
    }
}
