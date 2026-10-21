package com.bbva.glomohybrid.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.glomohybrid.ui.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemInfoListBinding implements ViewBinding {

    @NonNull
    public final CellsTextView featureItemText;

    @NonNull
    public final CellsImageView iconImage;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34615p0;

    public ItemInfoListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CellsTextView cellsTextView, @NonNull CellsImageView cellsImageView) {
        this.f34615p0 = constraintLayout;
        this.featureItemText = cellsTextView;
        this.iconImage = cellsImageView;
    }

    @NonNull
    public static ItemInfoListBinding bind(@NonNull View view) {
        int i10 = R.id.featureItemText;
        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
        if (cellsTextView != null) {
            i10 = R.id.iconImage;
            CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
            if (cellsImageView != null) {
                return new ItemInfoListBinding((ConstraintLayout) view, cellsTextView, cellsImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ItemInfoListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemInfoListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_info_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f34615p0;
    }
}
