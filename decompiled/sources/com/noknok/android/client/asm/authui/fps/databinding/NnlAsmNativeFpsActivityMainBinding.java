package com.noknok.android.client.asm.authui.fps.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.noknok.android.client.asm.authui.fps.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAsmNativeFpsActivityMainBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f63186a;

    private NnlAsmNativeFpsActivityMainBinding(@NonNull LinearLayout linearLayout) {
        this.f63186a = linearLayout;
    }

    @NonNull
    public static NnlAsmNativeFpsActivityMainBinding bind(@NonNull View view) {
        if (view != null) {
            return new NnlAsmNativeFpsActivityMainBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static NnlAsmNativeFpsActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlAsmNativeFpsActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_asm_native_fps_activity_main, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f63186a;
    }
}
