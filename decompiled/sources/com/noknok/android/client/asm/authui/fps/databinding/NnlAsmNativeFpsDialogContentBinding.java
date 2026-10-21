package com.noknok.android.client.asm.authui.fps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.asm.authui.fps.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAsmNativeFpsDialogContentBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f63188a;

    @NonNull
    public final TextView fingerprint;

    @NonNull
    public final LinearLayout fingerprintContainer;

    @NonNull
    public final TextView fingerprintDescription;

    @NonNull
    public final ImageView fingerprintIcon;

    @NonNull
    public final TextView fingerprintStatus;

    private NnlAsmNativeFpsDialogContentBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3) {
        this.f63188a = linearLayout;
        this.fingerprint = textView;
        this.fingerprintContainer = linearLayout2;
        this.fingerprintDescription = textView2;
        this.fingerprintIcon = imageView;
        this.fingerprintStatus = textView3;
    }

    @NonNull
    public static NnlAsmNativeFpsDialogContentBinding bind(@NonNull View view) {
        int i10 = R.id.fingerprint;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = R.id.fingerprint_description;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView2 != null) {
                i10 = R.id.fingerprint_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                if (imageView != null) {
                    i10 = R.id.fingerprint_status;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView3 != null) {
                        return new NnlAsmNativeFpsDialogContentBinding(linearLayout, textView, linearLayout, textView2, imageView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlAsmNativeFpsDialogContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlAsmNativeFpsDialogContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_asm_native_fps_dialog_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f63188a;
    }
}
