package com.bbva.ui.component.menu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.ui.component.menu.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ViewSlideMenuItemBinding implements ViewBinding {

    @NonNull
    public final CellsImageView iconFeaturedView;

    @NonNull
    public final CellsImageView iconImageView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f36970p0;

    @NonNull
    public final CellsImageView selectionStateImageView;

    @NonNull
    public final CellsTextView textLabel;

    public ViewSlideMenuItemBinding(@NonNull View view, @NonNull CellsImageView cellsImageView, @NonNull CellsImageView cellsImageView2, @NonNull CellsImageView cellsImageView3, @NonNull CellsTextView cellsTextView) {
        this.f36970p0 = view;
        this.iconFeaturedView = cellsImageView;
        this.iconImageView = cellsImageView2;
        this.selectionStateImageView = cellsImageView3;
        this.textLabel = cellsTextView;
    }

    @NonNull
    public static ViewSlideMenuItemBinding bind(@NonNull View view) {
        int i10 = R.id.iconFeaturedView;
        CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
        if (cellsImageView != null) {
            i10 = R.id.iconImageView;
            CellsImageView cellsImageView2 = (CellsImageView) ViewBindings.findChildViewById(view, i10);
            if (cellsImageView2 != null) {
                i10 = R.id.selectionStateImageView;
                CellsImageView cellsImageView3 = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                if (cellsImageView3 != null) {
                    i10 = R.id.textLabel;
                    CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                    if (cellsTextView != null) {
                        return new ViewSlideMenuItemBinding(view, cellsImageView, cellsImageView2, cellsImageView3, cellsTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewSlideMenuItemBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_slide_menu_item, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f36970p0;
    }
}
