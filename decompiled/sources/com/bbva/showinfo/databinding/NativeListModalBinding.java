package com.bbva.showinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.showinfo.R;

/* JADX INFO: loaded from: classes8.dex */
public final class NativeListModalBinding implements ViewBinding {

    @NonNull
    public final RecyclerView nativeListModalList;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f36475p0;

    public NativeListModalBinding(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.f36475p0 = view;
        this.nativeListModalList = recyclerView;
    }

    @NonNull
    public static NativeListModalBinding bind(@NonNull View view) {
        int i10 = R.id.native_list_modal_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
        if (recyclerView != null) {
            return new NativeListModalBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NativeListModalBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.native_list_modal, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f36475p0;
    }
}
