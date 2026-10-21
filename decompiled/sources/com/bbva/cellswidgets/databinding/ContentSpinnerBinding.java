package com.bbva.cellswidgets.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.cellswidgets.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentSpinnerBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView chevron;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f27280p0;

    @NonNull
    public final CellsTextView selectedOption;

    @NonNull
    public final CellsTextView titleTextView;

    public ContentSpinnerBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2) {
        this.f27280p0 = view;
        this.chevron = appCompatImageView;
        this.selectedOption = cellsTextView;
        this.titleTextView = cellsTextView2;
    }

    @NonNull
    public static ContentSpinnerBinding bind(@NonNull View view) {
        int i10 = R.id.chevron;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageView != null) {
            i10 = R.id.selectedOption;
            CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
            if (cellsTextView != null) {
                i10 = R.id.titleTextView;
                CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                if (cellsTextView2 != null) {
                    return new ContentSpinnerBinding(view, appCompatImageView, cellsTextView, cellsTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ContentSpinnerBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.content_spinner, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f27280p0;
    }
}
