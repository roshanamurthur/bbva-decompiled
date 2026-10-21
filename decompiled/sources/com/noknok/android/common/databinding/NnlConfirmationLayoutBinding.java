package com.noknok.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.common.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlConfirmationLayoutBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f63506a;

    @NonNull
    public final RelativeLayout authorizeButton;

    @NonNull
    public final TextView confirmationSubTitle;

    @NonNull
    public final TextView confirmationTitle;

    @NonNull
    public final RelativeLayout declineButton;

    @NonNull
    public final LinearLayout dialogHeader;

    @NonNull
    public final TextView dialogTitle;

    @NonNull
    public final ImageView imageContent;

    @NonNull
    public final ImageView ivConfirm;

    @NonNull
    public final ImageView ivConfirmStart;

    @NonNull
    public final TextView tvAuthorizeText;

    @NonNull
    public final TextView tvCancelText;

    private NnlConfirmationLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f63506a = linearLayout;
        this.authorizeButton = relativeLayout;
        this.confirmationSubTitle = textView;
        this.confirmationTitle = textView2;
        this.declineButton = relativeLayout2;
        this.dialogHeader = linearLayout2;
        this.dialogTitle = textView3;
        this.imageContent = imageView;
        this.ivConfirm = imageView2;
        this.ivConfirmStart = imageView3;
        this.tvAuthorizeText = textView4;
        this.tvCancelText = textView5;
    }

    @NonNull
    public static NnlConfirmationLayoutBinding bind(@NonNull View view) {
        int i10 = R.id.authorize_button;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
        if (relativeLayout != null) {
            i10 = R.id.confirmation_sub_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.confirmation_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView2 != null) {
                    i10 = R.id.decline_button;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i10);
                    if (relativeLayout2 != null) {
                        i10 = R.id.dialog_header;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                        if (linearLayout != null) {
                            i10 = R.id.dialog_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i10);
                            if (textView3 != null) {
                                i10 = R.id.image_content;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                                if (imageView != null) {
                                    i10 = R.id.iv_confirm;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                    if (imageView2 != null) {
                                        i10 = R.id.iv_confirm_start;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                        if (imageView3 != null) {
                                            i10 = R.id.tv_authorize_text;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i10);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_cancel_text;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i10);
                                                if (textView5 != null) {
                                                    return new NnlConfirmationLayoutBinding((LinearLayout) view, relativeLayout, textView, textView2, relativeLayout2, linearLayout, textView3, imageView, imageView2, imageView3, textView4, textView5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlConfirmationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlConfirmationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_confirmation_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f63506a;
    }
}
