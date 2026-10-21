package com.bbva.cellswidgets.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.cellswidgets.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentSpinnerDefaultBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView chevron;

    @NonNull
    public final ConstraintLayout constraintLayout;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f27281p0;

    @NonNull
    public final CellsTextView selectedOption;

    @NonNull
    public final CellsTextView titleTextView;

    public ContentSpinnerDefaultBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2) {
        this.f27281p0 = view;
        this.chevron = appCompatImageView;
        this.constraintLayout = constraintLayout;
        this.selectedOption = cellsTextView;
        this.titleTextView = cellsTextView2;
    }

    @NonNull
    public static ContentSpinnerDefaultBinding bind(@NonNull View view) {
        int i10 = R.id.chevron;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.constraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i10);
            if (constraintLayout != null) {
                i10 = R.id.selectedOption;
                CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                if (cellsTextView != null) {
                    i10 = R.id.titleTextView;
                    CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                    if (cellsTextView2 != null) {
                        return new ContentSpinnerDefaultBinding(view, appCompatImageView, constraintLayout, cellsTextView, cellsTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ContentSpinnerDefaultBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.content_spinner_default, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f27281p0;
    }
}
