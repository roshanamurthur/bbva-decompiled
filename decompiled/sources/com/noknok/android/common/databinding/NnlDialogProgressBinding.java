package com.noknok.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.common.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlDialogProgressBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f63507a;

    @Nullable
    public final ProgressBar progressBar;

    @Nullable
    public final TextView textView;

    private NnlDialogProgressBinding(@NonNull View view, @Nullable ProgressBar progressBar, @Nullable TextView textView) {
        this.f63507a = view;
        this.progressBar = progressBar;
        this.textView = textView;
    }

    @NonNull
    public static NnlDialogProgressBinding bind(@NonNull View view) {
        return new NnlDialogProgressBinding(view, (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar), (TextView) ViewBindings.findChildViewById(view, R.id.textView));
    }

    @NonNull
    public static NnlDialogProgressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f63507a;
    }

    @NonNull
    public static NnlDialogProgressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_dialog_progress, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
