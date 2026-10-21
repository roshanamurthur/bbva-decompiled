package com.bbva.ui.component.menu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsCircleInitialsView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.ui.component.menu.R;

/* JADX INFO: loaded from: classes9.dex */
public final class ViewSlideMenuItemHeaderBinding implements ViewBinding {

    @NonNull
    public final CellsTextView headerSubtitleTextView;

    @NonNull
    public final CellsTextView headerThirdLine;

    @NonNull
    public final CellsTextView headerTitleTextView;

    @NonNull
    public final CellsCircleInitialsView initialsView;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f36971p0;

    @NonNull
    public final CellsTextView subHeaderTextView;

    public ViewSlideMenuItemHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull CellsTextView cellsTextView, @NonNull CellsTextView cellsTextView2, @NonNull CellsTextView cellsTextView3, @NonNull CellsCircleInitialsView cellsCircleInitialsView, @NonNull CellsTextView cellsTextView4) {
        this.f36971p0 = linearLayout;
        this.headerSubtitleTextView = cellsTextView;
        this.headerThirdLine = cellsTextView2;
        this.headerTitleTextView = cellsTextView3;
        this.initialsView = cellsCircleInitialsView;
        this.subHeaderTextView = cellsTextView4;
    }

    @NonNull
    public static ViewSlideMenuItemHeaderBinding bind(@NonNull View view) {
        int i10 = R.id.headerSubtitleTextView;
        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
        if (cellsTextView != null) {
            i10 = R.id.headerThirdLine;
            CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
            if (cellsTextView2 != null) {
                i10 = R.id.headerTitleTextView;
                CellsTextView cellsTextView3 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                if (cellsTextView3 != null) {
                    i10 = R.id.initialsView;
                    CellsCircleInitialsView cellsCircleInitialsView = (CellsCircleInitialsView) ViewBindings.findChildViewById(view, i10);
                    if (cellsCircleInitialsView != null) {
                        i10 = R.id.subHeaderTextView;
                        CellsTextView cellsTextView4 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                        if (cellsTextView4 != null) {
                            return new ViewSlideMenuItemHeaderBinding((LinearLayout) view, cellsTextView, cellsTextView2, cellsTextView3, cellsCircleInitialsView, cellsTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewSlideMenuItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewSlideMenuItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_slide_menu_item_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f36971p0;
    }
}
