package com.bbva.glomohybrid.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.glomohybrid.ui.R;

/* JADX INFO: loaded from: classes7.dex */
public final class DialogListOptionSelectorBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageButton closeButton;

    @NonNull
    public final View delimiter;

    @NonNull
    public final CellsButton footerButton;

    @NonNull
    public final CellsTextView listOptionTitle;

    @NonNull
    public final RecyclerView options;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f34608p0;

    public DialogListOptionSelectorBinding(@NonNull LinearLayout linearLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull View view, @NonNull CellsButton cellsButton, @NonNull CellsTextView cellsTextView, @NonNull RecyclerView recyclerView) {
        this.f34608p0 = linearLayout;
        this.closeButton = appCompatImageButton;
        this.delimiter = view;
        this.footerButton = cellsButton;
        this.listOptionTitle = cellsTextView;
        this.options = recyclerView;
    }

    @NonNull
    public static DialogListOptionSelectorBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i10 = R.id.closeButton;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) ViewBindings.findChildViewById(view, i10);
        if (appCompatImageButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i10 = R.id.delimiter))) != null) {
            i10 = R.id.footerButton;
            CellsButton cellsButton = (CellsButton) ViewBindings.findChildViewById(view, i10);
            if (cellsButton != null) {
                i10 = R.id.listOptionTitle;
                CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                if (cellsTextView != null) {
                    i10 = R.id.options;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
                    if (recyclerView != null) {
                        return new DialogListOptionSelectorBinding((LinearLayout) view, appCompatImageButton, viewFindChildViewById, cellsButton, cellsTextView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static DialogListOptionSelectorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogListOptionSelectorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_list_option_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f34608p0;
    }
}
