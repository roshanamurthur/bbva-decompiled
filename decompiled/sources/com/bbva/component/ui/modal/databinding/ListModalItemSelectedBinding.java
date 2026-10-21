package com.bbva.component.ui.modal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bbva.component.ui.modal.R;
import com.bbva.ui.widget.BbvaTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class ListModalItemSelectedBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final BbvaTextView f28683p0;

    @NonNull
    public final BbvaTextView title;

    public ListModalItemSelectedBinding(@NonNull BbvaTextView bbvaTextView, @NonNull BbvaTextView bbvaTextView2) {
        this.f28683p0 = bbvaTextView;
        this.title = bbvaTextView2;
    }

    @NonNull
    public static ListModalItemSelectedBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BbvaTextView bbvaTextView = (BbvaTextView) view;
        return new ListModalItemSelectedBinding(bbvaTextView, bbvaTextView);
    }

    @NonNull
    public static ListModalItemSelectedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ListModalItemSelectedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_modal_item_selected, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public BbvaTextView getRoot() {
        return this.f28683p0;
    }
}
