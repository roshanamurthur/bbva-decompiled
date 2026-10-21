package com.bbva.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.R;
import com.bbva.ui.widget.BbvaAutoCompleteTextView;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class UiBbvaAutocompleteTextInputLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageView clearImageView;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final BbvaAutoCompleteTextView editText;

    @NonNull
    public final BbvaTextView hintTextView;

    @NonNull
    public final ImageView iconImageView;

    @NonNull
    public final View lineView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f37628p0;

    public UiBbvaAutocompleteTextInputLayoutBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull BbvaAutoCompleteTextView bbvaAutoCompleteTextView, @NonNull BbvaTextView bbvaTextView, @NonNull ImageView imageView2, @NonNull View view2) {
        this.f37628p0 = view;
        this.clearImageView = imageView;
        this.constraintLayout = constraintLayout;
        this.editText = bbvaAutoCompleteTextView;
        this.hintTextView = bbvaTextView;
        this.iconImageView = imageView2;
        this.lineView = view2;
    }

    @NonNull
    public static UiBbvaAutocompleteTextInputLayoutBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.clearImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.editText;
                BbvaAutoCompleteTextView bbvaAutoCompleteTextView = (BbvaAutoCompleteTextView) ViewBindings.findChildViewById(view, i10);
                if (bbvaAutoCompleteTextView != null) {
                    i10 = R.id.hintTextView;
                    BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                    if (bbvaTextView != null) {
                        i10 = R.id.iconImageView;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                        if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.lineView))) != null) {
                            return new UiBbvaAutocompleteTextInputLayoutBinding(view, imageView, constraintLayout, bbvaAutoCompleteTextView, bbvaTextView, imageView2, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static UiBbvaAutocompleteTextInputLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ui_bbva_autocomplete_text_input_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f37628p0;
    }
}
