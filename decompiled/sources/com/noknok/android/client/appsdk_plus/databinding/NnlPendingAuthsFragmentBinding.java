package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlPendingAuthsFragmentBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f62977a;

    @NonNull
    public final TextView emptyText;

    @NonNull
    public final RecyclerView pendingAuthsList;

    private NnlPendingAuthsFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView) {
        this.f62977a = linearLayout;
        this.emptyText = textView;
        this.pendingAuthsList = recyclerView;
    }

    @NonNull
    public static NnlPendingAuthsFragmentBinding bind(@NonNull View view) {
        int i10 = R.id.empty_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
        if (textView != null) {
            i10 = R.id.pending_auths_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
            if (recyclerView != null) {
                return new NnlPendingAuthsFragmentBinding((LinearLayout) view, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlPendingAuthsFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlPendingAuthsFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_pending_auths_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f62977a;
    }
}
