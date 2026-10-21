package com.noknok.android.mfac.uaf.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.mfac.uaf.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlMfacUafAuthenticatorRowBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f63511a;

    @NonNull
    public final TextView itemDescription;

    @NonNull
    public final ImageView itemIcon;

    @NonNull
    public final TextView itemTitle;

    private NnlMfacUafAuthenticatorRowBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f63511a = relativeLayout;
        this.itemDescription = textView;
        this.itemIcon = imageView;
        this.itemTitle = textView2;
    }

    @NonNull
    public static NnlMfacUafAuthenticatorRowBinding bind(@NonNull View view) {
        int i10 = R.id.item_description;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            i10 = R.id.item_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                i10 = R.id.item_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView2 != null) {
                    return new NnlMfacUafAuthenticatorRowBinding((RelativeLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlMfacUafAuthenticatorRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlMfacUafAuthenticatorRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_mfac_uaf_authenticator_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f63511a;
    }
}
