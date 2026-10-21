package com.bbva.glomohybrid.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.cellswidgets.CellsCircleInitialsView;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.glomohybrid.login.R;

/* JADX INFO: loaded from: classes6.dex */
public final class AvatarViewBinding implements ViewBinding {

    @NonNull
    public final CellsImageView iconImage;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f33365p0;

    @NonNull
    public final CellsCircleInitialsView userImageView;

    public AvatarViewBinding(@NonNull View view, @NonNull CellsImageView cellsImageView, @NonNull CellsCircleInitialsView cellsCircleInitialsView) {
        this.f33365p0 = view;
        this.iconImage = cellsImageView;
        this.userImageView = cellsCircleInitialsView;
    }

    @NonNull
    public static AvatarViewBinding bind(@NonNull View view) {
        int i10 = R.id.iconImage;
        CellsImageView cellsImageView = (CellsImageView) ViewBindings.findChildViewById(view, i10);
        if (cellsImageView != null) {
            i10 = R.id.userImageView;
            CellsCircleInitialsView cellsCircleInitialsView = (CellsCircleInitialsView) ViewBindings.findChildViewById(view, i10);
            if (cellsCircleInitialsView != null) {
                return new AvatarViewBinding(view, cellsImageView, cellsCircleInitialsView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static AvatarViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.avatar_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f33365p0;
    }
}
