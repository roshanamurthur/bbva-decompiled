package com.noknok.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.noknok.android.common.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlSelectFromDialogListItemBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextView f63509a;

    private NnlSelectFromDialogListItemBinding(@NonNull TextView textView) {
        this.f63509a = textView;
    }

    @NonNull
    public static NnlSelectFromDialogListItemBinding bind(@NonNull View view) {
        if (view != null) {
            return new NnlSelectFromDialogListItemBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static NnlSelectFromDialogListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlSelectFromDialogListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_select_from_dialog_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.f63509a;
    }
}
