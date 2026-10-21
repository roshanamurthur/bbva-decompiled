package com.bbva.glomohybrid.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.glomohybrid.ui.R;

/* JADX INFO: loaded from: classes7.dex */
public final class InfoDetailBoxViewBinding implements ViewBinding {

    @NonNull
    public final CellsTextView infoBoxDescription;

    @NonNull
    public final CellsImageView infoBoxIcon;

    @NonNull
    public final CellsTextView infoBoxLink;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f34609p0;

    public InfoDetailBoxViewBinding(@NonNull View view, @NonNull CellsTextView cellsTextView, @NonNull CellsImageView cellsImageView, @NonNull CellsTextView cellsTextView2) {
        this.f34609p0 = view;
        this.infoBoxDescription = cellsTextView;
        this.infoBoxIcon = cellsImageView;
        this.infoBoxLink = cellsTextView2;
    }

    @NonNull
    public static InfoDetailBoxViewBinding bind(@NonNull View view) {
        int i10 = R.id.infoBoxDescription;
        CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
        if (cellsTextView != null) {
            i10 = R.id.infoBoxIcon;
            CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
            if (cellsImageView != null) {
                i10 = R.id.infoBoxLink;
                CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                if (cellsTextView2 != null) {
                    return new InfoDetailBoxViewBinding(view, cellsTextView, cellsImageView, cellsTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static InfoDetailBoxViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.info_detail_box_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f34609p0;
    }
}
