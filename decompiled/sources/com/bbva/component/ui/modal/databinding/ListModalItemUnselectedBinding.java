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
public final class ListModalItemUnselectedBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final BbvaTextView f28684p0;

    @NonNull
    public final BbvaTextView title;

    public ListModalItemUnselectedBinding(@NonNull BbvaTextView bbvaTextView, @NonNull BbvaTextView bbvaTextView2) {
        this.f28684p0 = bbvaTextView;
        this.title = bbvaTextView2;
    }

    @NonNull
    public static ListModalItemUnselectedBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BbvaTextView bbvaTextView = (BbvaTextView) view;
        return new ListModalItemUnselectedBinding(bbvaTextView, bbvaTextView);
    }

    @NonNull
    public static ListModalItemUnselectedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ListModalItemUnselectedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.list_modal_item_unselected, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public BbvaTextView getRoot() {
        return this.f28684p0;
    }
}
