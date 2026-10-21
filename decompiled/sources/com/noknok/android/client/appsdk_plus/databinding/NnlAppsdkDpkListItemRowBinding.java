package com.noknok.android.client.appsdk_plus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.noknok.android.client.appsdk_plus.R;

/* JADX INFO: loaded from: classes11.dex */
public final class NnlAppsdkDpkListItemRowBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f62973a;

    @NonNull
    public final View listDpkItemDelimiter;

    @NonNull
    public final TextView listItemName;

    @NonNull
    public final ImageView listItemRemoveButton;

    @NonNull
    public final ImageView listItemRenameButton;

    @NonNull
    public final TextView tvLastUsed;

    private NnlAppsdkDpkListItemRowBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView2) {
        this.f62973a = linearLayout;
        this.listDpkItemDelimiter = view;
        this.listItemName = textView;
        this.listItemRemoveButton = imageView;
        this.listItemRenameButton = imageView2;
        this.tvLastUsed = textView2;
    }

    @NonNull
    public static NnlAppsdkDpkListItemRowBinding bind(@NonNull View view) {
        int i10 = R.id.list_dpk_item_delimiter;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i10);
        if (viewFindChildViewById != null) {
            i10 = R.id.list_item_name;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                i10 = R.id.list_item_remove_button;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
                if (imageView != null) {
                    i10 = R.id.list_item_rename_button;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.tv_last_used;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i10);
                        if (textView2 != null) {
                            return new NnlAppsdkDpkListItemRowBinding((LinearLayout) view, viewFindChildViewById, textView, imageView, imageView2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static NnlAppsdkDpkListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NnlAppsdkDpkListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.nnl_appsdk_dpk_list_item_row, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f62973a;
    }
}
