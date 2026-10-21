package com.bbva.glomohybrid.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsCircleInitialsView;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.glomohybrid.ui.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemDialogListOptionDefaultTwoLinesCurrentSelectedBinding implements ViewBinding {

    @NonNull
    public final CellsTextView current;

    @NonNull
    public final Barrier iconBarrier;

    @NonNull
    public final CellsImageView iconImage;

    @NonNull
    public final CellsCircleInitialsView iconInitialsImage;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34612p0;

    @NonNull
    public final CellsTextView subtitle;

    @NonNull
    public final CellsTextView title;

    public ItemDialogListOptionDefaultTwoLinesCurrentSelectedBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellsTextView cellsTextView, @NonNull Barrier barrier, @NonNull CellsImageView cellsImageView, @NonNull CellsCircleInitialsView cellsCircleInitialsView, @NonNull CellsTextView cellsTextView2, @NonNull CellsTextView cellsTextView3) {
        this.f34612p0 = constraintLayout;
        this.current = cellsTextView;
        this.iconBarrier = barrier;
        this.iconImage = cellsImageView;
        this.iconInitialsImage = cellsCircleInitialsView;
        this.subtitle = cellsTextView2;
        this.title = cellsTextView3;
    }

    @NonNull
    public static ItemDialogListOptionDefaultTwoLinesCurrentSelectedBinding bind(@NonNull View view) {
        int i10 = R.id.current;
        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
        if (cellsTextView != null) {
            i10 = R.id.iconBarrier;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i10);
            if (barrier != null) {
                i10 = R.id.iconImage;
                CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                if (cellsImageView != null) {
                    i10 = R.id.iconInitialsImage;
                    CellsCircleInitialsView cellsCircleInitialsView = (CellsCircleInitialsView) ViewBindings.findChildViewById(view, i10);
                    if (cellsCircleInitialsView != null) {
                        i10 = R.id.subtitle;
                        CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                        if (cellsTextView2 != null) {
                            i10 = R.id.title;
                            CellsTextView cellsTextView3 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                            if (cellsTextView3 != null) {
                                return new ItemDialogListOptionDefaultTwoLinesCurrentSelectedBinding((ConstraintLayout) view, cellsTextView, barrier, cellsImageView, cellsCircleInitialsView, cellsTextView2, cellsTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemDialogListOptionDefaultTwoLinesCurrentSelectedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemDialogListOptionDefaultTwoLinesCurrentSelectedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_dialog_list_option_default_two_lines_current_selected, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f34612p0;
    }
}
