package com.bbva.component.ui.welcome.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.component.ui.welcome.R;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutPageIndicatorBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final CellsImageView f28775p0;

    public LayoutPageIndicatorBinding(@NonNull CellsImageView cellsImageView) {
        this.f28775p0 = cellsImageView;
    }

    @NonNull
    public static LayoutPageIndicatorBinding bind(@NonNull View view) {
        if (view != null) {
            return new LayoutPageIndicatorBinding((CellsImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static LayoutPageIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutPageIndicatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_page_indicator, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CellsImageView getRoot() {
        return this.f28775p0;
    }
}
