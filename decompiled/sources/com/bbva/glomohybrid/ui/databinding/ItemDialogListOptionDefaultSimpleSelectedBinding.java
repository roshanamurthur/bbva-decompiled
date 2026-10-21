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
public final class ItemDialogListOptionDefaultSimpleSelectedBinding implements ViewBinding {

    @NonNull
    public final Barrier iconBarrier;

    @NonNull
    public final CellsImageView iconImage;

    @NonNull
    public final CellsCircleInitialsView iconInitialsImage;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34610p0;

    @NonNull
    public final CellsTextView title;

    public ItemDialogListOptionDefaultSimpleSelectedBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull CellsImageView cellsImageView, @NonNull CellsCircleInitialsView cellsCircleInitialsView, @NonNull CellsTextView cellsTextView) {
        this.f34610p0 = constraintLayout;
        this.iconBarrier = barrier;
        this.iconImage = cellsImageView;
        this.iconInitialsImage = cellsCircleInitialsView;
        this.title = cellsTextView;
    }

    @NonNull
    public static ItemDialogListOptionDefaultSimpleSelectedBinding bind(@NonNull View view) {
        int i10 = R.id.iconBarrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i10);
        if (barrier != null) {
            i10 = R.id.iconImage;
            CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
            if (cellsImageView != null) {
                i10 = R.id.iconInitialsImage;
                CellsCircleInitialsView cellsCircleInitialsView = (CellsCircleInitialsView) ViewBindings.findChildViewById(view, i10);
                if (cellsCircleInitialsView != null) {
                    i10 = R.id.title;
                    CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                    if (cellsTextView != null) {
                        return new ItemDialogListOptionDefaultSimpleSelectedBinding((ConstraintLayout) view, barrier, cellsImageView, cellsCircleInitialsView, cellsTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemDialogListOptionDefaultSimpleSelectedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemDialogListOptionDefaultSimpleSelectedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_dialog_list_option_default_simple_selected, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f34610p0;
    }
}
