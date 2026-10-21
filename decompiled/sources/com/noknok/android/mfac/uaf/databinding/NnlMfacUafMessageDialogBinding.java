package com.noknok.android.mfac.uaf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.mfac.uaf.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlMfacUafMessageDialogBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f63512a;

    @NonNull
    public final TextView tvMsg;

    private NnlMfacUafMessageDialogBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f63512a = linearLayout;
        this.tvMsg = textView;
    }

    @NonNull
    public static NnlMfacUafMessageDialogBinding bind(@NonNull View view) {
        int i10 = R.id.tvMsg;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            return new NnlMfacUafMessageDialogBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlMfacUafMessageDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlMfacUafMessageDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_mfac_uaf_message_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f63512a;
    }
}
