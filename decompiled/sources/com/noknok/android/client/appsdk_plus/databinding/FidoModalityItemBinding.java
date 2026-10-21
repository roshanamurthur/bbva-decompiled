package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class FidoModalityItemBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f62971a;

    @NonNull
    public final Button btnGenericRegister;

    @NonNull
    public final LinearLayout itemContainer;

    @NonNull
    public final ImageView ivAddMethod;

    @NonNull
    public final ImageView ivModalityIcon;

    @NonNull
    public final Switch switchBtnRegDereg;

    @NonNull
    public final TextView tvModalityTitle;

    private FidoModalityItemBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Switch r10, @NonNull TextView textView) {
        this.f62971a = linearLayout;
        this.btnGenericRegister = button;
        this.itemContainer = linearLayout2;
        this.ivAddMethod = imageView;
        this.ivModalityIcon = imageView2;
        this.switchBtnRegDereg = r10;
        this.tvModalityTitle = textView;
    }

    @NonNull
    public static FidoModalityItemBinding bind(@NonNull View view) {
        int i10 = R.id.btn_generic_register;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.item_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
            if (linearLayout != null) {
                i10 = R.id.iv_add_method;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                if (imageView != null) {
                    i10 = R.id.iv_modality_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.switch_btn_reg_dereg;
                        Switch r10 = (Switch) ViewBindings.findChildViewById(view, i10);
                        if (r10 != null) {
                            i10 = R.id.tv_modality_title;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                            if (textView != null) {
                                return new FidoModalityItemBinding((LinearLayout) view, button, linearLayout, imageView, imageView2, r10, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FidoModalityItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FidoModalityItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fido_modality_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f62971a;
    }
}
