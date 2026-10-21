package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlRemoveRegConfirmDialogBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f62979a;

    @NonNull
    public final TextView authenticatorName;

    @NonNull
    public final Button btnCancel;

    @NonNull
    public final Button btnConfirm;

    @NonNull
    public final TextView messagePart1;

    private NnlRemoveRegConfirmDialogBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView2) {
        this.f62979a = linearLayout;
        this.authenticatorName = textView;
        this.btnCancel = button;
        this.btnConfirm = button2;
        this.messagePart1 = textView2;
    }

    @NonNull
    public static NnlRemoveRegConfirmDialogBinding bind(@NonNull View view) {
        int i10 = R.id.authenticator_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            i10 = R.id.btn_cancel;
            Button button = (Button) ViewBindings.findChildViewById(view, i10);
            if (button != null) {
                i10 = R.id.btn_confirm;
                Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
                if (button2 != null) {
                    i10 = R.id.message_part_1;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView2 != null) {
                        return new NnlRemoveRegConfirmDialogBinding((LinearLayout) view, textView, button, button2, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlRemoveRegConfirmDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlRemoveRegConfirmDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_remove_reg_confirm_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f62979a;
    }
}
