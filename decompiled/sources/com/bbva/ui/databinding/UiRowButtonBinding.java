package com.bbva.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.R;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes9.dex */
public final class UiRowButtonBinding implements ViewBinding {

    @NonNull
    public final FrameLayout circularFrameLayout;

    @NonNull
    public final ImageView imageView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f37630p0;

    @NonNull
    public final BbvaTextView textView;

    public UiRowButtonBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull BbvaTextView bbvaTextView) {
        this.f37630p0 = view;
        this.circularFrameLayout = frameLayout;
        this.imageView = imageView;
        this.textView = bbvaTextView;
    }

    @NonNull
    public static UiRowButtonBinding bind(@NonNull View view) {
        int i10 = R.id.circularFrameLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i10);
        if (frameLayout != null) {
            i10 = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
            if (imageView != null) {
                i10 = R.id.textView;
                BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                if (bbvaTextView != null) {
                    return new UiRowButtonBinding(view, frameLayout, imageView, bbvaTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static UiRowButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.ui_row_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f37630p0;
    }
}
