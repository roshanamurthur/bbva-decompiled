package com.bbva.cellswidgets.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.cellswidgets.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentEditTextBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageButton actionButton;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final AppCompatEditText editText;

    @NonNull
    public final CellsImageView errorImage;

    @NonNull
    public final CellsTextView errorLabel;

    @NonNull
    public final LinearLayout errorLayout;

    @NonNull
    public final CellsTextView hintTextView;

    @NonNull
    public final AppCompatImageButton leftActionButton;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f27277p0;

    public ContentEditTextBinding(@NonNull View view, @NonNull AppCompatImageButton appCompatImageButton, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull CellsImageView cellsImageView, @NonNull CellsTextView cellsTextView, @NonNull LinearLayout linearLayout, @NonNull CellsTextView cellsTextView2, @NonNull AppCompatImageButton appCompatImageButton2) {
        this.f27277p0 = view;
        this.actionButton = appCompatImageButton;
        this.constraintLayout = constraintLayout;
        this.editText = appCompatEditText;
        this.errorImage = cellsImageView;
        this.errorLabel = cellsTextView;
        this.errorLayout = linearLayout;
        this.hintTextView = cellsTextView2;
        this.leftActionButton = appCompatImageButton2;
    }

    @NonNull
    public static ContentEditTextBinding bind(@NonNull View view) {
        int i10 = R.id.actionButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageButton != null) {
            i10 = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.editText;
                AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, i10);
                if (appCompatEditText != null) {
                    i10 = R.id.errorImage;
                    CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                    if (cellsImageView != null) {
                        i10 = R.id.errorLabel;
                        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                        if (cellsTextView != null) {
                            i10 = R.id.errorLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i10);
                            if (linearLayout != null) {
                                i10 = R.id.hintTextView;
                                CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                                if (cellsTextView2 != null) {
                                    i10 = R.id.leftActionButton;
                                    AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
                                    if (appCompatImageButton2 != null) {
                                        return new ContentEditTextBinding(view, appCompatImageButton, constraintLayout, appCompatEditText, cellsImageView, cellsTextView, linearLayout, cellsTextView2, appCompatImageButton2);
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
    public static ContentEditTextBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.content_edit_text, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f27277p0;
    }
}
