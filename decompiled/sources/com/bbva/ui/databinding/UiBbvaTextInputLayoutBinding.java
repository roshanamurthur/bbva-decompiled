package com.bbva.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.R;
import com.bbva.ui.widget.BbvaEditText;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class UiBbvaTextInputLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageView clearImageView;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final BbvaEditText editText;

    @NonNull
    public final ImageView errorImageView;

    @NonNull
    public final LinearLayout errorLayout;

    @NonNull
    public final BbvaTextView errorTextView;

    @NonNull
    public final BbvaTextView hintTextView;

    @NonNull
    public final ImageView iconImageView;

    @NonNull
    public final ImageView infoImageView;

    @NonNull
    public final LinearLayout infoLayout;

    @NonNull
    public final BbvaTextView infoTextView;

    @NonNull
    public final View lineView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f37629p0;

    public UiBbvaTextInputLayoutBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull BbvaEditText bbvaEditText, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull BbvaTextView bbvaTextView, @NonNull BbvaTextView bbvaTextView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout2, @NonNull BbvaTextView bbvaTextView3, @NonNull View view2) {
        this.f37629p0 = view;
        this.clearImageView = imageView;
        this.constraintLayout = constraintLayout;
        this.editText = bbvaEditText;
        this.errorImageView = imageView2;
        this.errorLayout = linearLayout;
        this.errorTextView = bbvaTextView;
        this.hintTextView = bbvaTextView2;
        this.iconImageView = imageView3;
        this.infoImageView = imageView4;
        this.infoLayout = linearLayout2;
        this.infoTextView = bbvaTextView3;
        this.lineView = view2;
    }

    @NonNull
    public static UiBbvaTextInputLayoutBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.clearImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.editText;
                BbvaEditText bbvaEditText = (BbvaEditText) ViewBindings.findChildViewById(view, i10);
                if (bbvaEditText != null) {
                    i10 = R.id.errorImageView;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.errorLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                        if (linearLayout != null) {
                            i10 = R.id.errorTextView;
                            BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                            if (bbvaTextView != null) {
                                i10 = R.id.hintTextView;
                                BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                if (bbvaTextView2 != null) {
                                    i10 = R.id.iconImageView;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                    if (imageView3 != null) {
                                        i10 = R.id.infoImageView;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i10);
                                        if (imageView4 != null) {
                                            i10 = R.id.infoLayout;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.infoTextView;
                                                BbvaTextView bbvaTextView3 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                                if (bbvaTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.lineView))) != null) {
                                                    return new UiBbvaTextInputLayoutBinding(view, imageView, constraintLayout, bbvaEditText, imageView2, linearLayout, bbvaTextView, bbvaTextView2, imageView3, imageView4, linearLayout2, bbvaTextView3, viewFindChildViewById);
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
    public static UiBbvaTextInputLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ui_bbva_text_input_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f37629p0;
    }
}
