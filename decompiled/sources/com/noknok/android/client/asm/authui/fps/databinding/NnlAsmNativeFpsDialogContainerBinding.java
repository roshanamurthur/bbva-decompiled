package com.noknok.android.client.asm.authui.fps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.asm.authui.fps.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAsmNativeFpsDialogContainerBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f63187a;

    @NonNull
    public final LinearLayout buttonPanel;

    @NonNull
    public final Button fallbackButton;

    @NonNull
    public final NnlAsmNativeFpsDialogContentBinding includedFpsDialog;

    @NonNull
    public final Button okCancelButton;

    @NonNull
    public final LinearLayout topLinearLayout;

    private NnlAsmNativeFpsDialogContainerBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull Button button, @NonNull NnlAsmNativeFpsDialogContentBinding nnlAsmNativeFpsDialogContentBinding, @NonNull Button button2, @NonNull LinearLayout linearLayout3) {
        this.f63187a = linearLayout;
        this.buttonPanel = linearLayout2;
        this.fallbackButton = button;
        this.includedFpsDialog = nnlAsmNativeFpsDialogContentBinding;
        this.okCancelButton = button2;
        this.topLinearLayout = linearLayout3;
    }

    @NonNull
    public static NnlAsmNativeFpsDialogContainerBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.buttonPanel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
        if (linearLayout != null) {
            i10 = R.id.fallback_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i10);
            if (button != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.included_fps_dialog))) != null) {
                NnlAsmNativeFpsDialogContentBinding nnlAsmNativeFpsDialogContentBindingBind = NnlAsmNativeFpsDialogContentBinding.bind(viewFindChildViewById);
                i10 = R.id.ok_cancel_button;
                Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
                if (button2 != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    return new NnlAsmNativeFpsDialogContainerBinding(linearLayout2, linearLayout, button, nnlAsmNativeFpsDialogContentBindingBind, button2, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlAsmNativeFpsDialogContainerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlAsmNativeFpsDialogContainerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_asm_native_fps_dialog_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f63187a;
    }
}
