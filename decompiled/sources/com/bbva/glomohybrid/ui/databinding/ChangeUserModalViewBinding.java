package com.bbva.glomohybrid.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.modals.changeuser.ui.InfoDetailBoxView;

/* JADX INFO: loaded from: classes7.dex */
public final class ChangeUserModalViewBinding implements ViewBinding {

    @NonNull
    public final RecyclerView featuresList;

    @NonNull
    public final InfoDetailBoxView infoBoxView;

    @NonNull
    public final CellsTextView infoDescription;

    @NonNull
    public final CellsImageView infoIcon;

    @NonNull
    public final CellsTextView infoTitle;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f34607p0;

    public ChangeUserModalViewBinding(@NonNull View view, @NonNull RecyclerView recyclerView, @NonNull InfoDetailBoxView infoDetailBoxView, @NonNull CellsTextView cellsTextView, @NonNull CellsImageView cellsImageView, @NonNull CellsTextView cellsTextView2) {
        this.f34607p0 = view;
        this.featuresList = recyclerView;
        this.infoBoxView = infoDetailBoxView;
        this.infoDescription = cellsTextView;
        this.infoIcon = cellsImageView;
        this.infoTitle = cellsTextView2;
    }

    @NonNull
    public static ChangeUserModalViewBinding bind(@NonNull View view) {
        int i10 = R.id.featuresList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
        if (recyclerView != null) {
            i10 = R.id.infoBoxView;
            InfoDetailBoxView infoDetailBoxView = (InfoDetailBoxView) ViewBindings.findChildViewById(view, i10);
            if (infoDetailBoxView != null) {
                i10 = R.id.infoDescription;
                CellsTextView cellsTextView = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                if (cellsTextView != null) {
                    i10 = R.id.infoIcon;
                    CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
                    if (cellsImageView != null) {
                        i10 = R.id.infoTitle;
                        CellsTextView cellsTextView2 = (CellsTextView) ViewBindings.findChildViewById(view, i10);
                        if (cellsTextView2 != null) {
                            return new ChangeUserModalViewBinding(view, recyclerView, infoDetailBoxView, cellsTextView, cellsImageView, cellsTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ChangeUserModalViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.change_user_modal_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f34607p0;
    }
}
