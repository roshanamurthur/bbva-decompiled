package com.bbva.ui.component.menu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.ui.component.menu.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ViewInfoMenuItemBinding implements ViewBinding {

    @NonNull
    public final CellsTextView infoContent;

    @NonNull
    public final CellsTextView infoTitle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f36967p0;

    public ViewInfoMenuItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2) {
        this.f36967p0 = constraintLayout;
        this.infoContent = cellsTextView;
        this.infoTitle = cellsTextView2;
    }

    @NonNull
    public static ViewInfoMenuItemBinding bind(@NonNull View view) {
        int i10 = R.id.infoContent;
        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
        if (cellsTextView != null) {
            i10 = R.id.infoTitle;
            CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
            if (cellsTextView2 != null) {
                return new ViewInfoMenuItemBinding((ConstraintLayout) view, cellsTextView, cellsTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewInfoMenuItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewInfoMenuItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_info_menu_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f36967p0;
    }
}
