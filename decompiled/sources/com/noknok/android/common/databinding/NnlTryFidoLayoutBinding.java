package com.noknok.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.common.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlTryFidoLayoutBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f63510a;

    @NonNull
    public final ImageView declineButton;

    @NonNull
    public final Button tryFidoButton;

    @NonNull
    public final TextView tryFidoSubTitle;

    @NonNull
    public final TextView tryFidoTitle;

    private NnlTryFidoLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f63510a = linearLayout;
        this.declineButton = imageView;
        this.tryFidoButton = button;
        this.tryFidoSubTitle = textView;
        this.tryFidoTitle = textView2;
    }

    @NonNull
    public static NnlTryFidoLayoutBinding bind(@NonNull View view) {
        int i10 = R.id.decline_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R.id.try_fido_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i10);
            if (button != null) {
                i10 = R.id.try_fido_sub_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView != null) {
                    i10 = R.id.try_fido_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView2 != null) {
                        return new NnlTryFidoLayoutBinding((LinearLayout) view, imageView, button, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlTryFidoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlTryFidoLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_try_fido_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f63510a;
    }
}
