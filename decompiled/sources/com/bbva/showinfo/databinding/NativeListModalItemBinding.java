package com.bbva.showinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.showinfo.R;

/* JADX INFO: loaded from: classes8.dex */
public final class NativeListModalItemBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout nativeContainerModalItem;

    @NonNull
    public final RadioButton nativeListModalItemRadioButton;

    @NonNull
    public final AppCompatTextView nativeListModalItemText;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36476p0;

    public NativeListModalItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull RadioButton radioButton, @NonNull AppCompatTextView appCompatTextView) {
        this.f36476p0 = constraintLayout;
        this.nativeContainerModalItem = constraintLayout2;
        this.nativeListModalItemRadioButton = radioButton;
        this.nativeListModalItemText = appCompatTextView;
    }

    @NonNull
    public static NativeListModalItemBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.native_list_modal_item_radio_button;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i10);
        if (radioButton != null) {
            i10 = R.id.native_list_modal_item_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i10);
            if (appCompatTextView != null) {
                return new NativeListModalItemBinding(constraintLayout, constraintLayout, radioButton, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NativeListModalItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NativeListModalItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.native_list_modal_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f36476p0;
    }
}
