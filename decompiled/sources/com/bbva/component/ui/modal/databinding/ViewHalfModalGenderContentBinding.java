package com.bbva.component.ui.modal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.modal.R;
import com.bbva.ui.widget.BbvaButton;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewHalfModalGenderContentBinding implements ViewBinding {

    @NonNull
    public final FrameLayout contentBottomSheet;

    @NonNull
    public final RadioGroup genderGroup;

    @NonNull
    public final AppCompatImageButton iconActionClose;

    @NonNull
    public final BbvaTextView legend;

    @NonNull
    public final BbvaTextView message;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28687p0;

    @NonNull
    public final BbvaButton primaryButton;

    @NonNull
    public final RadioButton radioFemale;

    @NonNull
    public final RadioButton radioMale;

    @NonNull
    public final BbvaTextView title;

    public ViewHalfModalGenderContentBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull RadioGroup radioGroup, @NonNull AppCompatImageButton appCompatImageButton, @NonNull BbvaTextView bbvaTextView, @NonNull BbvaTextView bbvaTextView2, @NonNull BbvaButton bbvaButton, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull BbvaTextView bbvaTextView3) {
        this.f28687p0 = frameLayout;
        this.contentBottomSheet = frameLayout2;
        this.genderGroup = radioGroup;
        this.iconActionClose = appCompatImageButton;
        this.legend = bbvaTextView;
        this.message = bbvaTextView2;
        this.primaryButton = bbvaButton;
        this.radioFemale = radioButton;
        this.radioMale = radioButton2;
        this.title = bbvaTextView3;
    }

    @NonNull
    public static ViewHalfModalGenderContentBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i10 = R.id.genderGroup;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i10);
        if (radioGroup != null) {
            i10 = R.id.iconActionClose;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
            if (appCompatImageButton != null) {
                i10 = R.id.legend;
                BbvaTextView bbvaTextView = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                if (bbvaTextView != null) {
                    i10 = R.id.message;
                    BbvaTextView bbvaTextView2 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                    if (bbvaTextView2 != null) {
                        i10 = R.id.primaryButton;
                        BbvaButton bbvaButton = (BbvaButton) ViewBindings.findChildViewById(view, i10);
                        if (bbvaButton != null) {
                            i10 = R.id.radioFemale;
                            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i10);
                            if (radioButton != null) {
                                i10 = R.id.radioMale;
                                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i10);
                                if (radioButton2 != null) {
                                    i10 = R.id.title;
                                    BbvaTextView bbvaTextView3 = (BbvaTextView) ViewBindings.findChildViewById(view, i10);
                                    if (bbvaTextView3 != null) {
                                        return new ViewHalfModalGenderContentBinding(frameLayout, frameLayout, radioGroup, appCompatImageButton, bbvaTextView, bbvaTextView2, bbvaButton, radioButton, radioButton2, bbvaTextView3);
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
    public static ViewHalfModalGenderContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewHalfModalGenderContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_half_modal_gender_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f28687p0;
    }
}
