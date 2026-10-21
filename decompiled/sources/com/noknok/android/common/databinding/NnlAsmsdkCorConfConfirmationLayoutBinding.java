package com.noknok.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.common.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAsmsdkCorConfConfirmationLayoutBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final RelativeLayout f63505a;

    @NonNull
    public final Button asmPresenceAuthorizeButton;

    @NonNull
    public final Button asmPresenceDeclineButton;

    @NonNull
    public final TextView asmPresenceTextView;

    @NonNull
    public final LinearLayout buttonsContainer;

    @NonNull
    public final ScrollView extScrollView;

    @NonNull
    public final ImageView transactionContent;

    private NnlAsmsdkCorConfConfirmationLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull ScrollView scrollView, @NonNull ImageView imageView) {
        this.f63505a = relativeLayout;
        this.asmPresenceAuthorizeButton = button;
        this.asmPresenceDeclineButton = button2;
        this.asmPresenceTextView = textView;
        this.buttonsContainer = linearLayout;
        this.extScrollView = scrollView;
        this.transactionContent = imageView;
    }

    @NonNull
    public static NnlAsmsdkCorConfConfirmationLayoutBinding bind(@NonNull View view) {
        int i10 = R.id.asm_presence_authorize_button;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.asm_presence_decline_button;
            Button button2 = (Button) ViewBindings.findChildViewById(view, i10);
            if (button2 != null) {
                i10 = R.id.asm_presence_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                if (textView != null) {
                    i10 = R.id.buttons_container;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                    if (linearLayout != null) {
                        i10 = R.id.ext_scroll_view;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i10);
                        if (scrollView != null) {
                            i10 = R.id.transaction_content;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                            if (imageView != null) {
                                return new NnlAsmsdkCorConfConfirmationLayoutBinding((RelativeLayout) view, button, button2, textView, linearLayout, scrollView, imageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlAsmsdkCorConfConfirmationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlAsmsdkCorConfConfirmationLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_asmsdk_cor_conf_confirmation_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f63505a;
    }
}
