package com.bbva.component.ui.modal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.component.ui.modal.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewListModalContentBinding implements ViewBinding {

    @NonNull
    public final FrameLayout listDialogContainer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f28688p0;

    @NonNull
    public final RecyclerView recyclerList;

    public ViewListModalContentBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull RecyclerView recyclerView) {
        this.f28688p0 = frameLayout;
        this.listDialogContainer = frameLayout2;
        this.recyclerList = recyclerView;
    }

    @NonNull
    public static ViewListModalContentBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i10 = R.id.recyclerList;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
        if (recyclerView != null) {
            return new ViewListModalContentBinding(frameLayout, frameLayout, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static ViewListModalContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewListModalContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.view_list_modal_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f28688p0;
    }
}
