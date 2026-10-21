package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlRemoveAllRegsConfirmDialogBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f62978a;

    @NonNull
    public final Button btnCancel;

    @NonNull
    public final Button btnConfirm;

    private NnlRemoveAllRegsConfirmDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2) {
        this.f62978a = linearLayout;
        this.btnCancel = button;
        this.btnConfirm = button2;
    }

    @NonNull
    public static NnlRemoveAllRegsConfirmDialogBinding bind(@NonNull View view) {
        int i10 = R.id.btn_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.btn_confirm;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
            if (button2 != null) {
                return new NnlRemoveAllRegsConfirmDialogBinding((LinearLayout) view, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlRemoveAllRegsConfirmDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlRemoveAllRegsConfirmDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_remove_all_regs_confirm_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f62978a;
    }
}
