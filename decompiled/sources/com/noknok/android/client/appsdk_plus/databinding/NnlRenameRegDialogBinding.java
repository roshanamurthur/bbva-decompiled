package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlRenameRegDialogBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f62980a;

    @NonNull
    public final Button btnCancel;

    @NonNull
    public final Button btnConfirm;

    @NonNull
    public final EditText etRenameReg;

    @NonNull
    public final TextView title;

    private NnlRenameRegDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull EditText editText, @NonNull TextView textView) {
        this.f62980a = linearLayout;
        this.btnCancel = button;
        this.btnConfirm = button2;
        this.etRenameReg = editText;
        this.title = textView;
    }

    @NonNull
    public static NnlRenameRegDialogBinding bind(@NonNull View view) {
        int i10 = R.id.btn_cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.btn_confirm;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
            if (button2 != null) {
                i10 = R.id.et_rename_reg;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, i10);
                if (editText != null) {
                    i10 = R.id.title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView != null) {
                        return new NnlRenameRegDialogBinding((LinearLayout) view, button, button2, editText, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlRenameRegDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlRenameRegDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_rename_reg_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f62980a;
    }
}
